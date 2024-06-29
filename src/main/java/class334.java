import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class class334 extends class532 {

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "Lrfa;")
    public class415 field4514;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field4488 = 0;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field4497 = 0;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public static int field4506 = 0;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
    private static int field4513 = 0;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field4500 = 0;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
    public static int field4515 = 0;

    @OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
    public static int field4519 = 0;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "I")
    private static int field4516 = 0;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    private static int field4489;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public int field4490;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    private static int field4501;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    private static int field4508;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "I")
    private static int field4510;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "[I")
    private int[] field4498;

    @OriginalMember(owner = "client!tr", name = "qa", descriptor = "(FFFFFFIIII)V", line = 5)
    public final void method525(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field4514.method2357()) {
            throw new IllegalStateException();
        } else if (this.method1967(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field4491 = arg7;
            if (arg6 != 1) {
                field4519 = arg7 >>> 24;
                field4497 = 256 - field4519;
                if (arg6 == 0) {
                    field4515 = (arg7 & 0xFF0000) >> 16;
                    field4506 = (arg7 & 0xFF00) >> 8;
                    field4500 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field4513 = arg7 >>> 24;
                    field4516 = 256 - field4513;
                    int var11 = (arg7 & 0xFF00FF) * field4516 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field4516 & 0xFF0000;
                    field4488 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method216(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method216(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method216(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method216(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method216(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method216(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method216(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method216(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method216(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method216(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method216(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method216(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFFFFFILua;II)V", line = 104)
    public final void method524(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9) {
        if (this.field4514.method2357()) {
            throw new IllegalStateException();
        } else if (this.method1967(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class646 var11 = (class646) arg7;
            this.method214(var11.field8935, var11.field8937, field4489 - arg8, -arg9 - (field4511 - field4508));
        }
    }

    @OriginalMember(owner = "client!tr", name = "Q", descriptor = "(IIII)V", line = 128)
    public final void method527(int arg0, int arg1, int arg2, int arg3) {
        this.field4490 = arg0;
        this.field4509 = arg1;
        this.field4512 = arg2;
        this.field4504 = arg3;
    }

    @OriginalMember(owner = "client!tr", name = "ca", descriptor = "()I", line = 148)
    public final int method532() {
        return this.field4509 + this.field4492 + this.field4504;
    }

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "()I", line = 158)
    public final int method530() {
        return this.field4495;
    }

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "()I", line = 172)
    public final int method529() {
        return this.field4492;
    }

    @OriginalMember(owner = "client!tr", name = "DA", descriptor = "(IIIIIII)V", line = 178)
    public final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4514.method2357()) {
            throw new IllegalStateException();
        }
        if (this.field4498 == null) {
            this.field4498 = new int[4];
        }
        this.field4514.method1057(this.field4498);
        this.field4514.method1077(this.field4514.field5467, this.field4514.field5449, arg0 + arg2, arg1 + arg3);
        int var8 = this.method523();
        int var9 = this.method532();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method217(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4514.method1042(this.field4498[0], this.field4498[1], this.field4498[2], this.field4498[3]);
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lrfa;II)V", line = 216)
    public class334(class415 arg0, int arg1, int arg2) {
        this.field4514 = arg0;
        this.field4495 = arg1;
        this.field4492 = arg2;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFFFFF)Z", line = 228)
    private final boolean method1967(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4495 + this.field4490 + this.field4512;
        int var8 = this.field4509 + this.field4492 + this.field4504;
        if (this.field4495 != var7 || this.field4492 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4509 * var11;
            float var14 = (float) this.field4509 * var12;
            float var15 = (float) this.field4490 * var9;
            float var16 = (float) this.field4490 * var10;
            float var17 = (float) this.field4512 * -var9;
            float var18 = (float) this.field4512 * -var10;
            float var19 = (float) this.field4504 * -var11;
            float var20 = (float) this.field4504 * -var12;
            arg0 += var13 + var15;
            arg1 += var14 + var16;
            arg2 += var13 + var17;
            arg3 += var14 + var18;
            arg4 += var15 + var19;
            arg5 += var16 + var20;
        }
        float var21 = arg2 + arg4 - arg0;
        float var22 = arg5 + arg3 - arg1;
        float var23;
        float var24;
        if (arg0 < arg2) {
            var23 = arg0;
            var24 = arg2;
        } else {
            var23 = arg2;
            var24 = arg0;
        }
        if (arg4 < var23) {
            var23 = arg4;
        }
        if (var21 < var23) {
            var23 = var21;
        }
        if (arg4 > var24) {
            var24 = arg4;
        }
        if (var21 > var24) {
            var24 = var21;
        }
        float var25;
        float var26;
        if (arg1 < arg3) {
            var25 = arg1;
            var26 = arg3;
        } else {
            var25 = arg3;
            var26 = arg1;
        }
        if (arg5 < var25) {
            var25 = arg5;
        }
        if (var22 < var25) {
            var25 = var22;
        }
        if (arg5 > var26) {
            var26 = arg5;
        }
        if (var22 > var26) {
            var26 = var22;
        }
        if (var23 < (float) this.field4514.field5467) {
            var23 = this.field4514.field5467;
        }
        if (var24 > (float) this.field4514.field5469) {
            var24 = this.field4514.field5469;
        }
        if (var25 < (float) this.field4514.field5449) {
            var25 = this.field4514.field5449;
        }
        if (var26 > (float) this.field4514.field5476) {
            var26 = this.field4514.field5476;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field4507 = this.field4514.field5444;
        field4493 = (int) ((float) ((int) var25 * field4507) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4505 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4495 / var29);
        field4518 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4492 / var30);
        field4494 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4495 / var30);
        field4496 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4492 / var29);
        field4510 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4501 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4517 = (this.field4495 >> 1 << 12) + (field4501 * field4494 >> 4);
        field4499 = (this.field4492 >> 1 << 12) + (field4501 * field4496 >> 4);
        field4502 = field4510 * field4505 >> 4;
        field4520 = field4518 * field4510 >> 4;
        field4489 = (int) var23;
        field4503 = (int) var27;
        field4508 = (int) var25;
        field4511 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "()I", line = 374)
    public final int method523() {
        return this.field4495 + this.field4490 + this.field4512;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([I[III)V")
    public abstract void method214(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!tr", name = "V", descriptor = "(IIIII)V")
    public abstract void method217(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tr", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)V")
    public abstract void method216(int arg0, int arg1);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IILua;II)V")
    public abstract void method219(int arg0, int arg1, class596 arg2, int arg3, int arg4);
}
