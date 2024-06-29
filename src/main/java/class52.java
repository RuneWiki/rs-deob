import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class52 {

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
    public boolean field832 = true;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    private int field826 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public int field827 = 512;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field830 = -1;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Z")
    public boolean field840 = true;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lwb;")
    public static class252 field836;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient;")
    public static client field834;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field843;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[[Z")
    public static boolean[][] field838;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V")
    private final void method496(boolean arg0, int arg1) {
        field825++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFB6) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field831 = (int) (var15 * 256.0D);
        this.field828 = (int) (var17 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field839 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field839 = (int) (var15 * var17 * 512.0D);
        }
        if (arg0) {
            return;
        }
        if (this.field828 < 0) {
            this.field828 = 0;
        } else if (this.field828 > 255) {
            this.field828 = 255;
        }
        if (this.field831 < 0) {
            this.field831 = 0;
        } else if (this.field831 > 255) {
            this.field831 = 255;
        }
        if (this.field839 < 1) {
            this.field839 = 1;
        }
        this.field841 = (int) ((double) this.field839 * var19);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILofa;)V")
    public final void method497(int arg0, class301 arg1) {
        field829++;
        if (arg0 != -26879) {
            field836 = null;
        }
        while (true) {
            int var3 = arg1.method1987(arg0 ^ 0x68D1);
            if (var3 == 0) {
                return;
            }
            this.method499(arg1, 12240, var3);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lbfa;IILjl;BILcca;I)V")
    public static final void method498(class573 arg0, int arg1, int arg2, class595 arg3, byte arg4, int arg5, class461 arg6, int arg7) {
        field842++;
        if (arg4 != -112) {
            field843 = null;
        }
        class447 var8 = new class447();
        var8.field6511 = arg2 << 9;
        var8.field6502 = arg7 << 9;
        var8.field6523 = arg1;
        if (arg3 != null) {
            var8.field6524 = arg3;
            int var10 = arg3.field8384;
            int var11 = arg3.field8429;
            if (arg5 == 1 || arg5 == 3) {
                var11 = arg3.field8384;
                var10 = arg3.field8429;
            }
            var8.field6510 = arg3.field8354 << 9;
            var8.field6528 = arg3.field8403;
            var8.field6503 = arg2 + var10 << 9;
            var8.field6517 = arg3.field8407;
            var8.field6501 = arg3.field8370;
            var8.field6515 = arg3.field8378;
            var8.field6525 = arg3.field8356;
            var8.field6522 = arg3.field8387;
            var8.field6526 = arg3.field8394;
            var8.field6504 = arg7 + var11 << 9;
            var8.field6505 = arg3.field8438;
            var8.field6529 = arg3.field8362;
            if (arg3.field8351 != null) {
                var8.field6500 = true;
                var8.method2754(-84);
            }
            if (var8.field6505 != null) {
                var8.field6512 = (int) (Math.random() * (double) (var8.field6526 - var8.field6528)) + var8.field6528;
            }
            class19.field197.method3472(92, var8);
            return;
        }
        if (arg6 != null) {
            var8.field6516 = arg6;
            class504 var9 = arg6.field6688;
            if (var9.field7308 != null) {
                var8.field6500 = true;
                var9 = var9.method3046(arg4 ^ 0x56, class422.field6216);
            }
            if (var9 != null) {
                var8.field6503 = arg2 + var9.field7303 << 9;
                var8.field6504 = arg7 + var9.field7303 << 9;
                var8.field6515 = class91.method769(-14, arg6);
                var8.field6522 = var9.field7342;
                var8.field6517 = var9.field7340;
                var8.field6525 = var9.field7356;
                var8.field6510 = var9.field7313 << 9;
                var8.field6501 = var9.field7354;
            }
            class680.field9612.method3472(83, var8);
            return;
        }
        if (arg0 == null) {
            return;
        }
        var8.field6507 = arg0;
        var8.field6503 = arg2 + arg0.method878(-5740) << 9;
        var8.field6504 = arg0.method878(-5740) + arg7 << 9;
        var8.field6515 = class684.method3817(arg0, (byte) -128);
        var8.field6522 = arg0.field8141;
        var8.field6501 = 256;
        var8.field6510 = arg0.field8153 << 9;
        var8.field6525 = arg0.field8105;
        var8.field6517 = 256;
        class261.field4063.method3516(255, (long) arg0.field1628, var8);
        return;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lofa;II)V")
    private final void method499(class301 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field826 = arg0.method1952(22085);
            this.method496(false, this.field826);
        } else if (arg2 == 2) {
            this.field830 = arg0.method1989((byte) -76);
            if (this.field830 == 65535) {
                this.field830 = -1;
            }
        } else if (arg2 == 3) {
            this.field827 = arg0.method1989((byte) -60) << 2;
        } else if (arg2 == 4) {
            this.field832 = false;
        } else if (arg2 == 5) {
            this.field840 = false;
        }
        if (arg1 != 12240) {
            this.method496(false, -34);
        }
        field835++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method500(int arg0) {
        field834 = null;
        field838 = null;
        field843 = null;
        field836 = null;
        if (arg0 != -2019127511) {
            field834 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class215.field3558 = arg1;
        field837++;
        class702.field9932 = arg5;
        class265.field4125 = arg0;
        class197.field3396 = arg2;
        if (arg6 == 705841378) {
            class582.field8235 = arg3;
            class210.field3500 = arg4;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIIIIII)Z")
    public static final boolean method502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field833++;
        int var7 = arg0 + arg5;
        int var8 = arg3 + arg6;
        if (arg2 >= -28) {
            field834 = null;
        }
        int var9 = arg1 + arg4;
        if (!class129.method1039(var8, var7, (byte) -46, arg1, var8, arg5, var8, arg5, var9, var9)) {
            return false;
        } else if (class129.method1039(var8, var7, (byte) -59, arg1, var8, var7, var8, arg5, var9, arg1)) {
            if (arg5 >= class551.field7856) {
                if (!class129.method1039(arg3, var7, (byte) -29, var9, var8, var7, var8, var7, var9, arg1)) {
                    return false;
                }
                if (!class129.method1039(arg3, var7, (byte) -35, var9, var8, var7, arg3, var7, arg1, arg1)) {
                    return false;
                }
            } else if (!class129.method1039(arg3, arg5, (byte) -99, var9, var8, arg5, var8, arg5, var9, arg1)) {
                return false;
            } else if (!class129.method1039(arg3, arg5, (byte) -54, var9, var8, arg5, arg3, arg5, arg1, arg1)) {
                return false;
            }
            if (class703.field9940 > arg1) {
                if (!class129.method1039(arg3, var7, (byte) -85, arg1, var8, arg5, var8, arg5, arg1, arg1)) {
                    return false;
                }
                if (!class129.method1039(arg3, var7, (byte) -30, arg1, var8, var7, arg3, arg5, arg1, arg1)) {
                    return false;
                }
            } else if (!class129.method1039(arg3, var7, (byte) -72, var9, var8, arg5, var8, arg5, var9, var9)) {
                return false;
            } else if (!class129.method1039(arg3, var7, (byte) -81, var9, var8, var7, arg3, arg5, var9, var9)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
