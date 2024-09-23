import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class FileStream {

    @OriginalMember(owner = "vb", name = "a", descriptor = "I")
    private int field856 = -728;

    @OriginalMember(owner = "vb", name = "f", descriptor = "I")
    public int field861 = 65000;

    @OriginalMember(owner = "vb", name = "e", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "vb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field858;

    @OriginalMember(owner = "vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field859;

    @OriginalMember(owner = "vb", name = "b", descriptor = "[B")
    public static byte[] field857 = new byte[520];

    @OriginalMember(owner = "vb", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
    public FileStream(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3, int arg4) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field860 = arg4;
        this.field858 = arg2;
        this.field859 = arg1;
        this.field861 = arg3;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IZ)[B")
    public synchronized byte[] method291(int arg0, boolean arg1) {
        if (arg1) {
            this.field856 = 498;
        }
        try {
            this.method294(arg0 * 6, -870, this.field859);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field859.read(field857, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field857[2] & 0xFF) + ((field857[0] & 0xFF) << 16) + ((field857[1] & 0xFF) << 8);
            int var6 = (field857[5] & 0xFF) + ((field857[3] & 0xFF) << 16) + ((field857[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field861) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field858.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method294(var6 * 520, -870, this.field858);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field858.read(field857, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field857[0] & 0xFF) << 8) + (field857[1] & 0xFF);
                    int var14 = ((field857[2] & 0xFF) << 8) + (field857[3] & 0xFF);
                    int var15 = (field857[6] & 0xFF) + ((field857[4] & 0xFF) << 16) + ((field857[5] & 0xFF) << 8);
                    int var16 = field857[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field860 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field858.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field857[var17 + 8];
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IBI[B)Z")
    public synchronized boolean method292(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg1 == 9) {
            boolean var5 = false;
        } else {
            this.field856 = -27;
        }
        boolean var6 = this.method293(true, arg2, arg3, 0, arg0);
        if (!var6) {
            var6 = this.method293(false, arg2, arg3, 0, arg0);
        }
        return var6;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZI[BII)Z")
    private synchronized boolean method293(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg0) {
                this.method294(arg4 * 6, -870, this.field859);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field859.read(field857, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field857[5] & 0xFF) + ((field857[3] & 0xFF) << 16) + ((field857[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field858.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field858.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field857[0] = (byte) (arg1 >> 16);
            field857[1] = (byte) (arg1 >> 8);
            field857[2] = (byte) arg1;
            field857[3] = (byte) (var8 >> 16);
            field857[4] = (byte) (var8 >> 8);
            field857[5] = (byte) var8;
            this.method294(arg4 * 6, -870, this.field859);
            this.field859.write(field857, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg1) {
                int var11 = 0;
                if (arg0) {
                    this.method294(var8 * 520, -870, this.field858);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field858.read(field857, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field857[0] & 0xFF) << 8) + (field857[1] & 0xFF);
                            int var15 = ((field857[2] & 0xFF) << 8) + (field857[3] & 0xFF);
                            var11 = (field857[6] & 0xFF) + ((field857[4] & 0xFF) << 16) + ((field857[5] & 0xFF) << 8);
                            int var16 = field857[7] & 0xFF;
                            if (arg4 == var14 && var10 == var15 && this.field860 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field858.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg0 = false;
                    var11 = (int) ((this.field858.length() + 519L) / 520L);
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
                field857[0] = (byte) (arg4 >> 8);
                field857[1] = (byte) arg4;
                field857[2] = (byte) (var10 >> 8);
                field857[3] = (byte) var10;
                field857[4] = (byte) (var11 >> 16);
                field857[5] = (byte) (var11 >> 8);
                field857[6] = (byte) var11;
                field857[7] = (byte) this.field860;
                this.method294(var8 * 520, -870, this.field858);
                this.field858.write(field857, 0, 8);
                int var17 = arg1 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field858.write(arg2, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
    public synchronized void method294(int arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg1 >= 0) {
            return;
        }
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg0);
    }
}
