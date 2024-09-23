import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IEGUBMVC")
public class class25 {

    @OriginalMember(owner = "IEGUBMVC", name = "a", descriptor = "Z")
    private boolean field830 = false;

    @OriginalMember(owner = "IEGUBMVC", name = "f", descriptor = "I")
    public int field835 = 65000;

    @OriginalMember(owner = "IEGUBMVC", name = "e", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "IEGUBMVC", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field832;

    @OriginalMember(owner = "IEGUBMVC", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field833;

    @OriginalMember(owner = "IEGUBMVC", name = "b", descriptor = "[B")
    public static byte[] field831 = new byte[520];

    @OriginalMember(owner = "IEGUBMVC", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;Ljava/io/RandomAccessFile;ZII)V")
    public class25(RandomAccessFile arg0, RandomAccessFile arg1, boolean arg2, int arg3, int arg4) {
        this.field834 = arg3;
        this.field832 = arg1;
        this.field833 = arg0;
        if (arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field835 = arg4;
    }

    @OriginalMember(owner = "IEGUBMVC", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method229(int arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        try {
            this.method232(this.field833, arg0 * 6, 369);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field833.read(field831, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field831[2] & 0xFF) + ((field831[0] & 0xFF) << 16) + ((field831[1] & 0xFF) << 8);
            int var6 = (field831[5] & 0xFF) + ((field831[3] & 0xFF) << 16) + ((field831[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field835) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field832.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method232(this.field832, var6 * 520, 369);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field832.read(field831, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field831[0] & 0xFF) << 8) + (field831[1] & 0xFF);
                    int var14 = ((field831[2] & 0xFF) << 8) + (field831[3] & 0xFF);
                    int var15 = (field831[6] & 0xFF) + ((field831[4] & 0xFF) << 16) + ((field831[5] & 0xFF) << 8);
                    int var16 = field831[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field834 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field832.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field831[var17 + 8];
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

    @OriginalMember(owner = "IEGUBMVC", name = "a", descriptor = "(IB[BI)Z")
    public synchronized boolean method230(int arg0, byte arg1, byte[] arg2, int arg3) {
        boolean var5 = this.method231(arg2, arg0, true, 591, arg3);
        if (arg1 != 99) {
            this.field830 = !this.field830;
        }
        if (!var5) {
            var5 = this.method231(arg2, arg0, false, 591, arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "IEGUBMVC", name = "a", descriptor = "([BIZII)Z")
    private synchronized boolean method231(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        int var6 = 98 / arg3;
        try {
            int var9;
            if (arg2) {
                this.method232(this.field833, arg1 * 6, 369);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field833.read(field831, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field831[5] & 0xFF) + ((field831[3] & 0xFF) << 16) + ((field831[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field832.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field832.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field831[0] = (byte) (arg4 >> 16);
            field831[1] = (byte) (arg4 >> 8);
            field831[2] = (byte) arg4;
            field831[3] = (byte) (var9 >> 16);
            field831[4] = (byte) (var9 >> 8);
            field831[5] = (byte) var9;
            this.method232(this.field833, arg1 * 6, 369);
            this.field833.write(field831, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg4) {
                int var12 = 0;
                if (arg2) {
                    this.method232(this.field832, var9 * 520, 369);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field832.read(field831, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label108: {
                            int var15 = ((field831[0] & 0xFF) << 8) + (field831[1] & 0xFF);
                            int var16 = ((field831[2] & 0xFF) << 8) + (field831[3] & 0xFF);
                            var12 = (field831[6] & 0xFF) + ((field831[4] & 0xFF) << 16) + ((field831[5] & 0xFF) << 8);
                            int var17 = field831[7] & 0xFF;
                            if (arg1 == var15 && var11 == var16 && this.field834 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field832.length() / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg2 = false;
                    var12 = (int) ((this.field832.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg4 - var10 <= 512) {
                    var12 = 0;
                }
                field831[0] = (byte) (arg1 >> 8);
                field831[1] = (byte) arg1;
                field831[2] = (byte) (var11 >> 8);
                field831[3] = (byte) var11;
                field831[4] = (byte) (var12 >> 16);
                field831[5] = (byte) (var12 >> 8);
                field831[6] = (byte) var12;
                field831[7] = (byte) this.field834;
                this.method232(this.field832, var9 * 520, 369);
                this.field832.write(field831, 0, 8);
                int var18 = arg4 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field832.write(arg0, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "IEGUBMVC", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void method232(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        int var4 = 82 / arg2;
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg0.seek((long) arg1);
    }
}
