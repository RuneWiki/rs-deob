import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class FileStream {

    @OriginalMember(owner = "wb", name = "b", descriptor = "Z")
    private boolean field853 = false;

    @OriginalMember(owner = "wb", name = "g", descriptor = "I")
    public int field858 = 65000;

    @OriginalMember(owner = "wb", name = "f", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field855;

    @OriginalMember(owner = "wb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field856;

    @OriginalMember(owner = "wb", name = "c", descriptor = "[B")
    public static byte[] field854 = new byte[520];

    @OriginalMember(owner = "wb", name = "a", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "wb", name = "<init>", descriptor = "(BLjava/io/RandomAccessFile;IILjava/io/RandomAccessFile;)V")
    public FileStream(byte arg0, RandomAccessFile arg1, int arg2, int arg3, RandomAccessFile arg4) {
        this.field857 = arg2;
        if (arg0 != 98) {
            this.field853 = !this.field853;
        }
        this.field855 = arg1;
        this.field856 = arg4;
        this.field858 = arg3;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(ZI)[B")
    public synchronized byte[] method300(boolean arg0, int arg1) {
        if (!arg0) {
            this.field852 = 151;
        }
        try {
            this.method303(0, this.field856, arg1 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field856.read(field854, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field854[2] & 0xFF) + ((field854[0] & 0xFF) << 16) + ((field854[1] & 0xFF) << 8);
            int var6 = (field854[5] & 0xFF) + ((field854[3] & 0xFF) << 16) + ((field854[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field858) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field855.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method303(0, this.field855, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field855.read(field854, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field854[0] & 0xFF) << 8) + (field854[1] & 0xFF);
                    int var14 = ((field854[2] & 0xFF) << 8) + (field854[3] & 0xFF);
                    int var15 = (field854[6] & 0xFF) + ((field854[4] & 0xFF) << 16) + ((field854[5] & 0xFF) << 8);
                    int var16 = field854[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field857 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field855.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field854[var17 + 8];
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

    @OriginalMember(owner = "wb", name = "a", descriptor = "([BIIB)Z")
    public synchronized boolean method301(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -115) {
            throw new NullPointerException();
        }
        boolean var5 = this.method302(arg1, arg2, arg0, true, false);
        if (!var5) {
            var5 = this.method302(arg1, arg2, arg0, false, false);
        }
        return var5;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(II[BZZ)Z")
    private synchronized boolean method302(int arg0, int arg1, byte[] arg2, boolean arg3, boolean arg4) {
        if (arg4) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg3) {
                this.method303(0, this.field856, arg0 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field856.read(field854, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field854[5] & 0xFF) + ((field854[3] & 0xFF) << 16) + ((field854[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field855.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field855.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field854[0] = (byte) (arg1 >> 16);
            field854[1] = (byte) (arg1 >> 8);
            field854[2] = (byte) arg1;
            field854[3] = (byte) (var8 >> 16);
            field854[4] = (byte) (var8 >> 8);
            field854[5] = (byte) var8;
            this.method303(0, this.field856, arg0 * 6);
            this.field856.write(field854, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg1) {
                int var11 = 0;
                if (arg3) {
                    this.method303(0, this.field855, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field855.read(field854, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field854[0] & 0xFF) << 8) + (field854[1] & 0xFF);
                            int var15 = ((field854[2] & 0xFF) << 8) + (field854[3] & 0xFF);
                            var11 = (field854[6] & 0xFF) + ((field854[4] & 0xFF) << 16) + ((field854[5] & 0xFF) << 8);
                            int var16 = field854[7] & 0xFF;
                            if (arg0 == var14 && var10 == var15 && this.field857 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field855.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg3 = false;
                    var11 = (int) ((this.field855.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg1 - var9 <= 512) {
                    var11 = 0;
                }
                field854[0] = (byte) (arg0 >> 8);
                field854[1] = (byte) arg0;
                field854[2] = (byte) (var10 >> 8);
                field854[3] = (byte) var10;
                field854[4] = (byte) (var11 >> 16);
                field854[5] = (byte) (var11 >> 8);
                field854[6] = (byte) var11;
                field854[7] = (byte) this.field857;
                this.method303(0, this.field855, var8 * 520);
                this.field855.write(field854, 0, 8);
                int var17 = arg1 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field855.write(arg2, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
    public synchronized void method303(int arg0, RandomAccessFile arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg1.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg2);
        if (arg0 != 0) {
            this.field853 = !this.field853;
        }
    }
}
