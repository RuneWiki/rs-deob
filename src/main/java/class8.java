import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class451 implements class381 {

    @OriginalMember(owner = "client!to", name = "t", descriptor = "Lql;")
    public class477 field95;

    @OriginalMember(owner = "client!to", name = "A", descriptor = "Z")
    private boolean field102;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "F")
    public static float field108;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "Ljd;")
    public static class139 field112;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIBLwm;)Z")
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        ++field107;
        class456 var5 = this.field95.method2796(false, false, arg3, 65536, super.field6129, super.field6132, (byte) -124);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 > -107) {
                this.field102 = false;
            }
            class203 var6 = arg3.method1960();
            var6.method1029(super.field6136 + super.field6132, super.field6137, super.field6139 + super.field6129);
            return var5.method1882(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)Z")
    public final boolean method7(boolean arg0) {
        if (arg0) {
            this.field102 = true;
        }
        ++field105;
        return this.field95.method2793(120);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
    public final int method4(int arg0) {
        ++field98;
        if (arg0 != -10666) {
            this.field95 = null;
        }
        return this.field95.field6596;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lwm;Lct;IIIIIZIIIIII)V")
    public class8(class364 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class304.method1694(arg11, true, arg12));
        this.field95 = new class477(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field102 = arg1.field1265 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        if (arg0 >= -105) {
            this.field95 = null;
        }
        ++field100;
    }

    @OriginalMember(owner = "client!to", name = "j", descriptor = "(I)V")
    public static final void method49(int arg0) {
        ++field96;
        class472[] var1 = class90.field1319;
        synchronized (class90.field1319) {
            for (int var2 = 0; var2 < class90.field1319.length; ++var2) {
                class90.field1319[var2] = new class472();
                class158.field2176[var2] = 0;
            }
            if (arg0 != 30686) {
                method49(-15);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)I")
    public final int method13(int arg0) {
        if (arg0 < 51) {
            this.method10((class364) null, (byte) 116);
        }
        ++field111;
        return this.field95.field6595;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIZIIIII)V")
    public static final void method50(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg6 && ~arg0 == ~arg2 && arg1 == arg5 && arg7 == arg9) {
            class128.method788(arg5, arg3, -104, arg7, arg2, arg8);
        } else {
            int var10 = arg3;
            int var11 = arg2;
            int var12 = arg3 * 3;
            int var13 = arg2 * 3;
            int var14 = arg6 * 3;
            int var15 = arg0 * 3;
            int var16 = arg1 * 3;
            int var17 = arg9 * 3;
            int var18 = -var16 - arg3 + arg5 + var14;
            int var19 = arg7 - var17 + -arg2 + var15;
            int var20 = -var14 + var12 + -var14 + var16;
            int var21 = var13 + var17 + -var15 - var15;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg3 - -(var27 + var29 + var31 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg2;
                class128.method788(var33, var10, 99, var34, var11, arg8);
                var10 = var33;
                var11 = var34;
            }
        }
        if (!arg4) {
            field112 = null;
        }
        ++field99;
    }

    @OriginalMember(owner = "client!to", name = "h", descriptor = "(I)I")
    public final int method51(int arg0) {
        ++field104;
        return arg0 != 100 ? 36 : this.field95.method2791((byte) -38);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILwm;I)Lgn;")
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        if (arg2 != -28045) {
            this.method3((class364) null, (byte) -1);
        }
        ++field109;
        return this.field95.method2796(false, false, arg1, arg0, 0, 0, (byte) -119);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lwm;I)V")
    public final void method16(class364 arg0, int arg1) {
        ++field110;
        this.field95.method2795(99, arg0);
        if (arg1 != 31591) {
            method52(false);
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lwm;B)Lnf;")
    public final class374 method3(class364 arg0, byte arg1) {
        ++field97;
        class456 var3 = this.field95.method2796(true, false, arg0, 1024, super.field6129, super.field6132, (byte) -121);
        if (var3 == null) {
            return null;
        } else {
            class203 var4 = arg0.method1960();
            var4.method1029(super.field6132 - -super.field6136, super.field6137, super.field6139 + super.field6129);
            if (arg1 <= 99) {
                this.method7(false);
            }
            class374 var5 = null;
            if (this.field102) {
                var5 = class358.method2196(1, (byte) 1);
            }
            if (this.field95.field6610 != null) {
                class342 var6 = this.field95.field6610.method1441();
                arg0.method2051(var3, var6, var4, var5 == null ? null : var5.field5156[0], 0);
            } else {
                var3.method1880(var4, var5 == null ? null : var5.field5156[0], 0);
            }
            this.field95.method2790(arg0, super.field6129 >> 7, var3, super.field6132 >> 7, super.field6129 >> 7, true, (byte) 1, super.field6132 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Z)V")
    public static void method52(boolean arg0) {
        field112 = null;
        if (!arg0) {
            field108 = 0.14771853F;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)I")
    public final int method9(int arg0) {
        if (arg0 != -769) {
            this.field102 = false;
        }
        ++field101;
        return this.field95.field6590;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLwm;)V")
    public final void method12(byte arg0, class364 arg1) {
        this.field95.method2785(arg1, -27576);
        ++field106;
        if (arg0 <= 27) {
            this.method15(-77, (class364) null, 127);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lwm;B)V")
    public final void method10(class364 arg0, byte arg1) {
        ++field103;
        if (arg1 > -48) {
            field112 = null;
        }
        class456 var3 = this.field95.method2796(true, false, arg0, 131072, super.field6129, super.field6132, (byte) -118);
        if (var3 != null) {
            this.field95.method2790(arg0, super.field6129 >> 7, var3, super.field6132 >> 7, super.field6129 >> 7, false, (byte) 85, super.field6132 >> 7);
        }
    }

    static {
        new class206("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        new class206((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
    }
}
