import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class197 extends class133 {

    @OriginalMember(owner = "client!cea", name = "I", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!cea", name = "N", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!cea", name = "T", descriptor = "F")
    public float field3240;

    @OriginalMember(owner = "client!cea", name = "Q", descriptor = "F")
    public float field3238;

    @OriginalMember(owner = "client!cea", name = "J", descriptor = "Z")
    public boolean field3232;

    @OriginalMember(owner = "client!cea", name = "M", descriptor = "Lvg;")
    public static class49 field3235 = new class49(64);

    @OriginalMember(owner = "client!cea", name = "C", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!cea", name = "K", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!cea", name = "L", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!cea", name = "R", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!cea", name = "P", descriptor = "Ldv;")
    public static class610 field3237;

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Ler;IIIIZ[BI)V", line = 4)
    public class197(class92 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field3231 = arg3;
        this.field3236 = arg4;
        if (super.field5990 != 34037) {
            this.field3238 = this.field3240 = 1.0F;
            this.field3232 = true;
        } else {
            this.field3232 = false;
            this.field3238 = (float) arg3;
            this.field3240 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(Z)V", line = 26)
    public static final void method1548(boolean arg0) {
        ++field3233;
        if (arg0) {
            field3235 = null;
        }
        if (!class497.field7254) {
            class328.field5085 = true;
            if (class17.field282.field4878) {
                class37.field514 = (float) ((int) class37.field514 - -191 & -128);
            } else {
                class574.field8188 += (24.0F - class574.field8188) / 2.0F;
            }
            class497.field7254 = true;
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Ler;IIII)V", line = 52)
    public class197(class92 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (~super.field5990 != -34038) {
            this.field3238 = this.field3240 = 1.0F;
            this.field3232 = true;
        } else {
            this.field3232 = false;
            this.field3240 = (float) arg4;
            this.field3238 = (float) arg3;
        }
        this.field3236 = arg4;
        this.field3231 = arg3;
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Ler;IIIIIIZ)V", line = 75)
    public class197(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field3232 = false;
        this.field3240 = (float) arg4 / (float) arg6;
        this.field3231 = arg3;
        this.field3238 = (float) arg3 / (float) arg5;
        this.field3236 = arg4;
        this.method1158(false, false, (byte) 71);
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Ler;IIIII)V", line = 89)
    public class197(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3236 = arg3;
        this.field3240 = (float) arg3 / (float) arg5;
        this.field3232 = false;
        this.field3231 = arg2;
        this.field3238 = (float) arg2 / (float) arg4;
        this.method1158(false, false, (byte) 120);
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Ler;IIIII[BI)V", line = 102)
    public class197(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3236 = arg3;
        this.field3231 = arg2;
        this.method1155(0, arg3, 0, true, 10243, 0, arg2, arg7, arg6, 0);
        this.field3238 = (float) arg2 / (float) arg4;
        this.field3240 = (float) arg3 / (float) arg5;
        this.field3232 = false;
        this.method1158(false, false, (byte) 115);
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Ler;IIIZ[III)V", line = 116)
    public class197(class92 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field3236 = arg3;
        if (super.field5990 == 34037) {
            this.field3238 = (float) arg2;
            this.field3240 = (float) arg3;
            this.field3232 = false;
        } else {
            this.field3238 = this.field3240 = 1.0F;
            this.field3232 = true;
        }
        this.field3231 = arg2;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIILlr;ILr;)V", line = 140)
    public static final void method1549(int arg0, int arg1, int arg2, class698 arg3, int arg4, class167 arg5) {
        ++field3239;
        class265 var6 = class584.field8299.method1885(false, arg3.field9793);
        if (arg4 != 10678) {
            field3230 = 60;
        }
        if (~var6.field4315 != 0) {
            int var8;
            if (arg3.field9824) {
                int var7 = arg3.field9807 + arg0;
                var8 = var7 & 3;
            } else {
                var8 = 0;
            }
            class702 var9 = var6.method1879(arg4 + -10576, var8, arg3.field9845, arg5);
            if (var9 != null) {
                int var10 = arg3.field9851;
                int var11 = arg3.field9829;
                if (~(1 & var8) == -2) {
                    var11 = arg3.field9851;
                    var10 = arg3.field9829;
                }
                int var12 = var9.method1076();
                int var13 = var9.method1079();
                if (var6.field4310) {
                    var12 = var10 * 4;
                    var13 = var11 * 4;
                }
                if (var6.field4317 == 0) {
                    var9.method3958(arg1, -((var11 + -1) * 4) + arg2, var12, var13);
                } else {
                    var9.method3954(arg1, arg2 + 4 + -(var11 * 4), var12, var13, 0, var6.field4317 | -16777216, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Ler;IIII[I)V", line = 195)
    public class197(class92 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field3231 = arg1;
        this.field3236 = arg2;
        this.method1152(true, 0, arg5, 0, 0, arg1, arg2, 0, (byte) 95);
        this.field3232 = false;
        this.field3238 = (float) arg1 / (float) arg3;
        this.field3240 = (float) arg2 / (float) arg4;
        this.method1158(false, false, (byte) 70);
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Ler;IIIIIZ)V", line = 215)
    public class197(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field3231 = arg4;
        this.field3236 = arg5;
        if (super.field5990 == 34037) {
            this.field3232 = false;
            this.field3240 = (float) arg5;
            this.field3238 = (float) arg4;
        } else {
            this.field3238 = this.field3240 = 1.0F;
            this.field3232 = true;
        }
    }

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "(B)V", line = 237)
    public static void method1550(byte arg0) {
        field3237 = null;
        field3235 = null;
        int var1 = 35 % ((58 - arg0) / 35);
    }
}
