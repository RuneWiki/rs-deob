import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class324 extends class218 implements class518 {

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lpe;")
    public class461 field5072;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Z")
    private boolean field5073;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public static int field5082 = -1;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "[I")
    public static int[] field5076 = new int[1000];

    @OriginalMember(owner = "client!of", name = "B", descriptor = "Lrr;")
    public static class280 field5081 = new class280(0, 2, 2, 1);

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
    public final int method28(byte arg0) {
        ++field5068;
        if (arg0 != -118) {
            this.method38(-14);
        }
        return this.field5072.field6843;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLza;)V")
    public final void method26(byte arg0, class491 arg1) {
        if (arg0 != 111) {
            this.field5073 = true;
        }
        this.field5072.method2748((byte) 124, arg1);
        ++field5066;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(ILza;)Lsr;")
    public final class430 method40(int arg0, class491 arg1) {
        ++field5069;
        class530 var3 = this.field5072.method2746(super.field3782, (byte) -120, arg1, 2048, true, super.field3783, false);
        if (var3 == null) {
            return null;
        } else {
            class202 var4 = arg1.method820();
            var4.method1246(super.field3782, super.field3784, super.field3783);
            class430 var5 = null;
            if (arg0 >= -24) {
                method2039(-81, -21, 100);
            }
            if (this.field5073) {
                var5 = class21.method111((byte) 122, 1);
            }
            if (this.field5072.field6824 != null) {
                class66 var6 = this.field5072.field6824.method964();
                arg1.method853(var3, var6, var4, var5 != null ? var5.field6447[0] : null, 0);
            } else {
                var3.method736(var4, var5 == null ? null : var5.field6447[0], 0);
            }
            int var7 = super.field3782 >> 7;
            int var8 = super.field3783 >> 7;
            this.field5072.method2744(arg1, var8, var7, var3, var7, var8, -1, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILza;)V")
    public final void method34(int arg0, class491 arg1) {
        ++field5077;
        this.field5072.method2750(arg1, (byte) 121);
        if (arg0 != 25747) {
            field5081 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
    public final void method36(boolean arg0) {
        if (arg0) {
            this.field5072 = null;
        }
        ++field5071;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        ++field5067;
        class530 var5 = this.field5072.method2746(super.field3782, (byte) -112, arg0, 131072, false, super.field3783, false);
        if (arg1 < 121) {
            return false;
        } else if (var5 == null) {
            return false;
        } else {
            class202 var6 = arg0.method820();
            var6.method1246(super.field3782, super.field3784, super.field3783);
            return var5.method776(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    public static void method2038(byte arg0) {
        field5076 = null;
        field5081 = null;
        if (arg0 >= -101) {
            method2038((byte) -40);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        int var2 = 26 / ((8 - arg0) / 45);
        ++field5083;
        return this.field5072.method2751(-125);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(BLza;)V")
    public final void method43(byte arg0, class491 arg1) {
        ++field5075;
        class530 var3 = this.field5072.method2746(super.field3782, (byte) -122, arg1, 262144, true, super.field3783, true);
        if (var3 != null) {
            int var4 = super.field3782 >> 7;
            int var5 = super.field3783 >> 7;
            this.field5072.method2744(arg1, var5, var4, var3, var4, var5, arg0 + -36, false);
        }
        if (arg0 != 35) {
            field5082 = 22;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)I")
    public final int method38(int arg0) {
        if (arg0 != 5638) {
            return 68;
        } else {
            ++field5084;
            return this.field5072.field6842;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(III)I")
    public static final int method2039(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field5081 = null;
        }
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        ++field5078;
        while (~arg2 != -1) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILza;IILvl;Z)V")
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        ++field5079;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILza;I)Le;")
    public final class530 method32(int arg0, class491 arg1, int arg2) {
        int var4 = -27 / ((arg2 - -24) / 60);
        ++field5070;
        return this.field5072.method2746(0, (byte) -116, arg1, arg0, false, 0, false);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
    public final int method29(int arg0) {
        int var2 = -42 / ((arg0 - 40) / 52);
        ++field5080;
        return this.field5072.field6856;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public final void method31(int arg0) {
        ++field5074;
        int var2 = 62 % ((arg0 - 57) / 48);
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lza;Lp;IIIIIZIII)V")
    public class324(class491 arg0, class39 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class526.method3124(arg9, arg8, (byte) 14));
        this.field5072 = new class461(arg0, arg1, arg8, arg9, arg2, arg3, super.field3782, super.field3783, arg7, arg10);
        this.field5073 = ~arg1.field618 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        ++field5085;
        if (arg0) {
            this.field5072 = null;
        }
        return false;
    }
}
