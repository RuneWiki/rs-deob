import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class203 extends class182 {

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    private int field3248 = 0;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    private int field3257 = 1;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    private int field3253 = 0;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "[I")
    public static int[] field3254 = new int[5];

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "Z")
    public static boolean field3255 = false;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "Lmd;")
    public static class273 field3247;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Li;")
    public static class74 field3251;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field3252;
        if (arg0) {
            this.field3253 = 29;
        }
        int[] var3 = super.field2911.method77(arg1, -69);
        if (super.field2911.field287) {
            int var4 = class66.field1112[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class4.field116 > var6; ++var6) {
                int var7 = class207.field3415[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field3253 == 0) {
                    var9 = (-var4 + var7) * this.field3257;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3257 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field3248 != -1) {
                    if (this.field3248 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class22.field391[var12 >> 4 & 255] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static void method1420(boolean arg0) {
        field3247 = null;
        field3251 = null;
        if (arg0) {
            field3254 = null;
        }
        field3254 = null;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class203() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field3250;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field3257 = arg1.method1802((byte) 54);
                }
            } else {
                this.field3248 = arg1.method1802((byte) 30);
            }
        } else {
            this.field3253 = arg1.method1802((byte) -90);
        }
        if (arg0) {
            this.field3253 = 79;
        }
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        if (arg0 != -1) {
            this.field3257 = -6;
        }
        class186.method1346((byte) 28);
        ++field3249;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZIIILaj;)V")
    public static final void method1421(int arg0, boolean arg1, int arg2, int arg3, int arg4, class151 arg5) {
        class3.field106 = 10000;
        int var6 = -107 % ((71 - arg3) / 47);
        class16.field320 = arg0;
        class23.field418 = arg5;
        class220.field3704 = arg4;
        class254.field4315 = arg2;
        class134.field2201 = arg1;
        class101.field1608 = 1;
        ++field3256;
    }
}
