import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class FileStream {

    @OriginalMember(owner = "vb", name = "a", descriptor = "Z")
    private boolean field855 = false;

    @OriginalMember(owner = "vb", name = "f", descriptor = "I")
    public int field860 = 65000;

    @OriginalMember(owner = "vb", name = "e", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "vb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field857;

    @OriginalMember(owner = "vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field858;

    @OriginalMember(owner = "vb", name = "b", descriptor = "[B")
    public static byte[] field856 = new byte[520];

    @OriginalMember(owner = "vb", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;Z)V")
    public FileStream(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3, boolean arg4) {
        this.field859 = arg2;
        this.field857 = arg3;
        this.field858 = arg1;
        this.field860 = arg0;
        if (arg4) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IZ)[B")
    public synchronized byte[] method291(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        try {
            this.method294(true, arg0 * 6, this.field858);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field858.read(field856, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field856[2] & 0xFF) + ((field856[0] & 0xFF) << 16) + ((field856[1] & 0xFF) << 8);
            int var6 = (field856[5] & 0xFF) + ((field856[3] & 0xFF) << 16) + ((field856[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field860) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field857.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method294(true, var6 * 520, this.field857);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field857.read(field856, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field856[0] & 0xFF) << 8) + (field856[1] & 0xFF);
                    int var14 = ((field856[2] & 0xFF) << 8) + (field856[3] & 0xFF);
                    int var15 = (field856[6] & 0xFF) + ((field856[4] & 0xFF) << 16) + ((field856[5] & 0xFF) << 8);
                    int var16 = field856[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field859 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field857.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field856[var17 + 8];
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZI[BI)Z")
    public synchronized boolean method292(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (!arg0) {
            this.field855 = !this.field855;
        }
        boolean var5 = this.method293(arg3, false, true, arg1, arg2);
        if (!var5) {
            var5 = this.method293(arg3, false, false, arg1, arg2);
        }
        return var5;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IZZI[B)Z")
    private synchronized boolean method293(int arg0, boolean arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg2) {
                this.method294(true, arg0 * 6, this.field858);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field858.read(field856, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field856[5] & 0xFF) + ((field856[3] & 0xFF) << 16) + ((field856[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field857.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field857.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field856[0] = (byte) (arg3 >> 16);
            field856[1] = (byte) (arg3 >> 8);
            field856[2] = (byte) arg3;
            field856[3] = (byte) (var9 >> 16);
            field856[4] = (byte) (var9 >> 8);
            field856[5] = (byte) var9;
            this.method294(true, arg0 * 6, this.field858);
            this.field858.write(field856, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg3) {
                int var12 = 0;
                if (arg2) {
                    this.method294(true, var9 * 520, this.field857);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field857.read(field856, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label117: {
                            int var15 = ((field856[0] & 0xFF) << 8) + (field856[1] & 0xFF);
                            int var16 = ((field856[2] & 0xFF) << 8) + (field856[3] & 0xFF);
                            var12 = (field856[6] & 0xFF) + ((field856[4] & 0xFF) << 16) + ((field856[5] & 0xFF) << 8);
                            int var17 = field856[7] & 0xFF;
                            if (arg0 == var15 && var11 == var16 && this.field859 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field857.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg2 = false;
                    var12 = (int) ((this.field857.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg3 - var10 <= 512) {
                    var12 = 0;
                }
                field856[0] = (byte) (arg0 >> 8);
                field856[1] = (byte) arg0;
                field856[2] = (byte) (var11 >> 8);
                field856[3] = (byte) var11;
                field856[4] = (byte) (var12 >> 16);
                field856[5] = (byte) (var12 >> 8);
                field856[6] = (byte) var12;
                field856[7] = (byte) this.field859;
                this.method294(true, var9 * 520, this.field857);
                this.field857.write(field856, 0, 8);
                int var18 = arg3 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field857.write(arg4, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZILjava/io/RandomAccessFile;)V")
    public synchronized void method294(boolean arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg2.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg1);
        if (arg0) {
            ;
        }
    }
}
