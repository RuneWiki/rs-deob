import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class406 {

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Z")
    public boolean field5651 = true;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Z")
    public boolean field5657 = true;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    private int field5656 = 0;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public int field5654 = -1;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field5663 = 512;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Z")
    public static boolean field5652 = false;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Lnt;")
    public static class220 field5655 = new class220();

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public int field5658;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public int field5659;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field5662;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public int field5664;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static void method2491(byte arg0) {
        if (arg0 != -69) {
            field5652 = true;
        }
        field5655 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILdm;Lha;)V")
    public static final void method2492(int arg0, class50 arg1, class58 arg2) {
        field5661++;
        int var3 = 102 / ((52 - arg0) / 50);
        boolean var4 = class558.field7942.method726(arg1.field861, arg1.field762, arg1.field748, arg2, arg1.field795 | 0xFF000000, arg1.field745, (byte) -85, arg1.field720 ? class468.field6748.field4932 : null) == null;
        if (var4) {
            class265.field3857.method1526(new class176(arg1.field861, arg1.field748, arg1.field762, arg1.field795 | 0xFF000000, arg1.field745, arg1.field720), 80);
            class262.method1776(0, arg1);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lud;II)V")
    private final void method2493(class35 arg0, int arg1, int arg2) {
        if (arg1 != -4) {
            this.field5658 = 74;
        }
        if (arg2 == 1) {
            this.field5656 = arg0.method239(-108);
            this.method2494(-98, this.field5656);
        } else if (arg2 == 2) {
            this.field5654 = arg0.method253(-13900);
            if (this.field5654 == 65535) {
                this.field5654 = -1;
            }
        } else if (arg2 == 3) {
            this.field5663 = arg0.method253(-13900) << 2;
        } else if (arg2 == 4) {
            this.field5651 = false;
        } else if (arg2 == 5) {
            this.field5657 = false;
        }
        field5660++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
    private final void method2494(int arg0, int arg1) {
        field5650++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        int var19 = -38 / ((arg0 - 7) / 61);
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
        double var20 = var13 / 6.0D;
        this.field5659 = (int) (var15 * 256.0D);
        this.field5662 = (int) (var17 * 256.0D);
        if (this.field5662 < 0) {
            this.field5662 = 0;
        } else if (this.field5662 > 255) {
            this.field5662 = 255;
        }
        if (this.field5659 < 0) {
            this.field5659 = 0;
        } else if (this.field5659 > 255) {
            this.field5659 = 255;
        }
        if (var17 > 0.5D) {
            this.field5664 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5664 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5664 < 1) {
            this.field5664 = 1;
        }
        this.field5658 = (int) ((double) this.field5664 * var20);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lud;B)V")
    public final void method2495(class35 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method273(arg1 ^ 0xFFFFFF7B);
            if (var3 == 0) {
                if (arg1 != -124) {
                    this.method2495(null, (byte) 83);
                }
                field5653++;
                return;
            }
            this.method2493(arg0, arg1 + 120, var3);
        }
    }
}
