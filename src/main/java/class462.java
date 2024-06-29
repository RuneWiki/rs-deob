import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class462 {

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
    public int field6420 = -1;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "Z")
    public boolean field6414 = true;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "I")
    public int field6417 = 512;

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "I")
    private int field6419 = 0;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "Lkfa;")
    public static class549 field6422 = new class549(13, 2);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public int field6415;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
    public int field6416;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
    public int field6418;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
    public int field6425;

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "Lqq;")
    public static class434 field6421;

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "[Z")
    public static boolean[] field6424;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BZZ)V")
    public static final void method2627(byte arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class517.field7393--;
            if (class517.field7393 == 0) {
                class57.field592 = null;
            }
        }
        field6423++;
        if (arg0 != 83) {
            field6412 = -10;
        }
        if (!arg1) {
            return;
        }
        class588.field8356--;
        if (class588.field8356 == 0) {
            class505.field7285 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(JJ)J")
    public static long method2628(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public static void method2629(int arg0) {
        field6422 = null;
        if (arg0 < -60) {
            field6424 = null;
            field6421 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILiaa;)V")
    public final void method2630(int arg0, class452 arg1) {
        while (true) {
            int var3 = arg1.method2541(42);
            if (var3 == 0) {
                if (arg0 != 12359) {
                    return;
                }
                field6413++;
                return;
            }
            this.method2632(var3, arg1, -106);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)V")
    private final void method2631(int arg0, int arg1) {
        field6426++;
        double var3 = (double) ((arg1 & 0xFF520E) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFE6) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (arg0 > -65) {
            field6412 = -101;
        }
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
        this.field6418 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field6416 = (int) (var15 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field6415 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field6415 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field6416 < 0) {
            this.field6416 = 0;
        } else if (this.field6416 > 255) {
            this.field6416 = 255;
        }
        if (this.field6418 < 0) {
            this.field6418 = 0;
        } else if (this.field6418 > 255) {
            this.field6418 = 255;
        }
        if (this.field6415 < 1) {
            this.field6415 = 1;
        }
        this.field6425 = (int) ((double) this.field6415 * var19);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILiaa;I)V")
    private final void method2632(int arg0, class452 arg1, int arg2) {
        if (arg2 >= -88) {
            this.field6414 = true;
        }
        if (arg0 == 1) {
            this.field6419 = arg1.method2524(3);
            this.method2631(-88, this.field6419);
        } else if (arg0 == 2) {
            this.field6420 = arg1.method2574(-1758460248);
            if (this.field6420 == 65535) {
                this.field6420 = -1;
            }
        } else if (arg0 == 3) {
            this.field6417 = arg1.method2574(-1758460248) << 2;
        } else if (arg0 == 4) {
            this.field6414 = false;
        }
        field6411++;
    }
}
