import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class198 {

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lph;")
    public class308 field3055 = new class308();

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field3040 = 0;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field3042 = 0;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field3044 = 0;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[[Z")
    public static boolean[][] field3046 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "Lph;")
    private class308 field3056;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1348(boolean arg0) {
        if (arg0) {
            field3051++;
            class305.field4991.method651(0);
            class279.field4594.method651(0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)Z", line = 17)
    public static final boolean method1349(byte arg0, int arg1) {
        field3048++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class300.field4949[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1004) {
            return true;
        } else {
            if (arg0 > -87) {
                field3043 = 9;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Lph;", line = 43)
    public final class308 method1350(int arg0) {
        if (arg0 != 0) {
            return (class308) null;
        }
        class308 var2 = this.field3055.field5012;
        field3052++;
        if (this.field3055 == var2) {
            this.field3056 = null;
            return null;
        } else {
            this.field3056 = var2.field5012;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)Lph;", line = 65)
    public final class308 method1351(int arg0) {
        if (arg0 > -78) {
            return (class308) null;
        }
        class308 var2 = this.field3056;
        field3045++;
        if (this.field3055 == var2) {
            this.field3056 = null;
            return null;
        } else {
            this.field3056 = var2.field5012;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)Lph;", line = 84)
    public final class308 method1352(boolean arg0) {
        field3050++;
        class308 var2 = this.field3055.field5012;
        if (this.field3055 == var2) {
            return null;
        } else if (arg0) {
            return (class308) null;
        } else {
            var2.method2148((byte) 108);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILph;)V", line = 113)
    public final void method1353(int arg0, class308 arg1) {
        field3054++;
        if (arg1.field5009 != null) {
            arg1.method2148((byte) 105);
        }
        arg1.field5012 = this.field3055;
        arg1.field5009 = this.field3055.field5009;
        if (arg0 == -1) {
            arg1.field5009.field5012 = arg1;
            arg1.field5012.field5009 = arg1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 132)
    public final void method1354(byte arg0) {
        field3053++;
        while (true) {
            class308 var2 = this.field3055.field5012;
            if (this.field3055 == var2) {
                if (arg0 >= -26) {
                    this.field3055 = (class308) null;
                }
                this.field3056 = null;
                return;
            }
            var2.method2148((byte) 115);
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)I", line = 163)
    public final int method1355(int arg0) {
        field3039++;
        int var2 = 0;
        class308 var3 = this.field3055.field5012;
        if (arg0 != 16266) {
            field3042 = 58;
        }
        while (this.field3055 != var3) {
            var3 = var3.field5012;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBIIII)V", line = 190)
    public static final void method1356(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class270.method1906(arg5, arg0 + arg4, -arg4 + arg0, class306.field4998[arg2], 123);
        field3049++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg4 * arg4;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        if (arg1 != -70) {
            field3042 = 31;
        }
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = (var6 + 1) * var16;
        int var19 = ((arg3 << 1) - 3) * var11;
        int var20 = (arg3 - 1) * var15;
        while (var7 > 0) {
            var7--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var17 += var16;
                    var14 += var18;
                    var18 += var16;
                    var6++;
                }
            }
            int var21 = arg2 - var7;
            if (var14 < 0) {
                var6++;
                var14 += var18;
                var13 += var17;
                var18 += var16;
                var17 += var16;
            }
            var14 += -var19;
            var19 -= var15;
            int var22 = arg0 + var6;
            int var23 = arg0 - var6;
            class270.method1906(arg5, var22, var23, class306.field4998[var21], 118);
            var13 += -var20;
            int var24 = arg2 + var7;
            class270.method1906(arg5, var22, var23, class306.field4998[var24], arg1 ^ 0xFFFFFFC6);
            var20 -= var15;
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 289)
    public static void method1357(int arg0) {
        if (arg0 == 0) {
            field3046 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 301)
    public class198() {
        this.field3055.field5009 = this.field3055;
        this.field3055.field5012 = this.field3055;
    }
}
