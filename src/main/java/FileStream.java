import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class FileStream {

    @OriginalMember(owner = "wb", name = "a", descriptor = "Z")
    private boolean field853 = false;

    @OriginalMember(owner = "wb", name = "g", descriptor = "I")
    public int field859 = 65000;

    @OriginalMember(owner = "wb", name = "f", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field856;

    @OriginalMember(owner = "wb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field857;

    @OriginalMember(owner = "wb", name = "c", descriptor = "[B")
    public static byte[] field855 = new byte[520];

    @OriginalMember(owner = "wb", name = "b", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "wb", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;I)V")
    public FileStream(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3, int arg4) {
        this.field858 = arg4;
        this.field856 = arg1;
        if (arg0 != -5745) {
            this.field853 = !this.field853;
        }
        this.field857 = arg3;
        this.field859 = arg2;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(BI)[B")
    public synchronized byte[] method290(byte arg0, int arg1) {
        if (arg0 != 44) {
            this.field854 = -272;
        }
        try {
            this.method293(this.field857, (byte) -43, arg1 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field857.read(field855, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field855[2] & 0xFF) + ((field855[0] & 0xFF) << 16) + ((field855[1] & 0xFF) << 8);
            int var6 = (field855[5] & 0xFF) + ((field855[3] & 0xFF) << 16) + ((field855[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field859) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field856.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method293(this.field856, (byte) -43, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field856.read(field855, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field855[0] & 0xFF) << 8) + (field855[1] & 0xFF);
                    int var14 = ((field855[2] & 0xFF) << 8) + (field855[3] & 0xFF);
                    int var15 = (field855[6] & 0xFF) + ((field855[4] & 0xFF) << 16) + ((field855[5] & 0xFF) << 8);
                    int var16 = field855[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field858 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field856.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field855[var17 + 8];
                            }
                            var6 = var15;
                            var9++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var7;
            } else {
                return null;
            }
        } catch (IOException var18) {
            return null;
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "([BZII)Z")
    public synchronized boolean method291(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field854 = 103;
        }
        boolean var5 = this.method292(arg3, 0, true, arg2, arg0);
        if (!var5) {
            var5 = this.method292(arg3, 0, false, arg2, arg0);
        }
        return var5;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(IIZI[B)Z")
    private synchronized boolean method292(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg2) {
                this.method293(this.field857, (byte) -43, arg3 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field857.read(field855, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field855[5] & 0xFF) + ((field855[3] & 0xFF) << 16) + ((field855[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field856.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field856.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field855[0] = (byte) (arg0 >> 16);
            field855[1] = (byte) (arg0 >> 8);
            field855[2] = (byte) arg0;
            field855[3] = (byte) (var8 >> 16);
            field855[4] = (byte) (var8 >> 8);
            field855[5] = (byte) var8;
            this.method293(this.field857, (byte) -43, arg3 * 6);
            this.field857.write(field855, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg0) {
                int var11 = 0;
                if (arg2) {
                    this.method293(this.field856, (byte) -43, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field856.read(field855, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field855[0] & 0xFF) << 8) + (field855[1] & 0xFF);
                            int var15 = ((field855[2] & 0xFF) << 8) + (field855[3] & 0xFF);
                            var11 = (field855[6] & 0xFF) + ((field855[4] & 0xFF) << 16) + ((field855[5] & 0xFF) << 8);
                            int var16 = field855[7] & 0xFF;
                            if (arg3 == var14 && var10 == var15 && this.field858 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field856.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg2 = false;
                    var11 = (int) ((this.field856.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg0 - var9 <= 512) {
                    var11 = 0;
                }
                field855[0] = (byte) (arg3 >> 8);
                field855[1] = (byte) arg3;
                field855[2] = (byte) (var10 >> 8);
                field855[3] = (byte) var10;
                field855[4] = (byte) (var11 >> 16);
                field855[5] = (byte) (var11 >> 8);
                field855[6] = (byte) var11;
                field855[7] = (byte) this.field858;
                this.method293(this.field856, (byte) -43, var8 * 520);
                this.field856.write(field855, 0, 8);
                int var17 = arg0 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field856.write(arg4, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;BI)V")
    public synchronized void method293(RandomAccessFile arg0, byte arg1, int arg2) throws IOException {
        if (arg1 != -43) {
            return;
        }
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg2);
    }
}
