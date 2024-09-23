import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GYSQYVEV")
public class class18 {

    @OriginalMember(owner = "GYSQYVEV", name = "a", descriptor = "I")
    private int field711 = -94;

    @OriginalMember(owner = "GYSQYVEV", name = "b", descriptor = "Z")
    private boolean field712 = true;

    @OriginalMember(owner = "GYSQYVEV", name = "c", descriptor = "Z")
    private boolean field713 = false;

    @OriginalMember(owner = "GYSQYVEV", name = "h", descriptor = "I")
    public int field718 = 65000;

    @OriginalMember(owner = "GYSQYVEV", name = "g", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "GYSQYVEV", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field715;

    @OriginalMember(owner = "GYSQYVEV", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field716;

    @OriginalMember(owner = "GYSQYVEV", name = "d", descriptor = "[B")
    public static byte[] field714 = new byte[520];

    @OriginalMember(owner = "GYSQYVEV", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
    public class18(int arg0, int arg1, RandomAccessFile arg2, int arg3, RandomAccessFile arg4) {
        this.field717 = arg0;
        this.field715 = arg4;
        this.field716 = arg2;
        this.field718 = arg1;
        if (arg3 != 0) {
            this.field711 = -295;
        }
    }

    @OriginalMember(owner = "GYSQYVEV", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method259(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field712 = !this.field712;
        }
        try {
            this.method262(0, arg0 * 6, this.field716);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field716.read(field714, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field714[2] & 0xFF) + ((field714[0] & 0xFF) << 16) + ((field714[1] & 0xFF) << 8);
            int var6 = (field714[5] & 0xFF) + ((field714[3] & 0xFF) << 16) + ((field714[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field718) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field715.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method262(0, var6 * 520, this.field715);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field715.read(field714, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field714[0] & 0xFF) << 8) + (field714[1] & 0xFF);
                    int var14 = ((field714[2] & 0xFF) << 8) + (field714[3] & 0xFF);
                    int var15 = (field714[6] & 0xFF) + ((field714[4] & 0xFF) << 16) + ((field714[5] & 0xFF) << 8);
                    int var16 = field714[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field717 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field715.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field714[var17 + 8];
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

    @OriginalMember(owner = "GYSQYVEV", name = "a", descriptor = "(I[BII)Z")
    public synchronized boolean method260(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var5 = this.method261(arg2, arg1, true, arg0, -486);
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method261(arg2, arg1, false, arg0, -486);
        }
        return var5;
    }

    @OriginalMember(owner = "GYSQYVEV", name = "a", descriptor = "(I[BZII)Z")
    private synchronized boolean method261(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 >= 0) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg2) {
                this.method262(0, arg0 * 6, this.field716);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field716.read(field714, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field714[5] & 0xFF) + ((field714[3] & 0xFF) << 16) + ((field714[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field715.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field715.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field714[0] = (byte) (arg3 >> 16);
            field714[1] = (byte) (arg3 >> 8);
            field714[2] = (byte) arg3;
            field714[3] = (byte) (var8 >> 16);
            field714[4] = (byte) (var8 >> 8);
            field714[5] = (byte) var8;
            this.method262(0, arg0 * 6, this.field716);
            this.field716.write(field714, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg3) {
                int var11 = 0;
                if (arg2) {
                    this.method262(0, var8 * 520, this.field715);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field715.read(field714, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label111: {
                            int var14 = ((field714[0] & 0xFF) << 8) + (field714[1] & 0xFF);
                            int var15 = ((field714[2] & 0xFF) << 8) + (field714[3] & 0xFF);
                            var11 = (field714[6] & 0xFF) + ((field714[4] & 0xFF) << 16) + ((field714[5] & 0xFF) << 8);
                            int var16 = field714[7] & 0xFF;
                            if (arg0 == var14 && var10 == var15 && this.field717 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field715.length() / 520L) {
                                    break label111;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg2 = false;
                    var11 = (int) ((this.field715.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg3 - var9 <= 512) {
                    var11 = 0;
                }
                field714[0] = (byte) (arg0 >> 8);
                field714[1] = (byte) arg0;
                field714[2] = (byte) (var10 >> 8);
                field714[3] = (byte) var10;
                field714[4] = (byte) (var11 >> 16);
                field714[5] = (byte) (var11 >> 8);
                field714[6] = (byte) var11;
                field714[7] = (byte) this.field717;
                this.method262(0, var8 * 520, this.field715);
                this.field715.write(field714, 0, 8);
                int var17 = arg3 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field715.write(arg1, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "GYSQYVEV", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
    public synchronized void method262(int arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg2.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg1);
        if (arg0 != 0) {
            this.field713 = !this.field713;
        }
    }
}
