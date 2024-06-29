import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class462 {

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lgk;")
    private class472 field6849 = new class472();

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
    public static int[] field6850 = new int[14];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Loi;")
    public static class172 field6842;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lgk;")
    private class472 field6851;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Lgk;")
    public final class472 method2825(int arg0) {
        field6843++;
        if (arg0 != -1) {
            this.method2826(36);
        }
        class472 var2 = this.field6849.field6924;
        if (this.field6849 == var2) {
            this.field6851 = null;
            return null;
        } else {
            this.field6851 = var2.field6924;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I")
    public final int method2826(int arg0) {
        field6846++;
        if (arg0 != -27705) {
            this.field6849 = null;
        }
        int var2 = 0;
        for (class472 var3 = this.field6849.field6924; var3 != this.field6849; var3 = var3.field6924) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)Lgk;")
    public final class472 method2827(int arg0) {
        field6847++;
        class472 var2 = this.field6851;
        int var3 = 92 / ((-arg0 - 51) / 62);
        if (this.field6849 == var2) {
            this.field6851 = null;
            return null;
        } else {
            this.field6851 = var2.field6924;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)Lgk;")
    public final class472 method2828(boolean arg0) {
        field6844++;
        class472 var2 = this.field6849.field6924;
        if (this.field6849 == var2) {
            return null;
        }
        if (arg0) {
            field6842 = null;
        }
        var2.method2859(-128);
        return var2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILgk;)V")
    public final void method2829(int arg0, class472 arg1) {
        if (arg1.field6921 != null) {
            arg1.method2859(-120);
        }
        field6845++;
        if (arg0 == -14061) {
            arg1.field6921 = this.field6849.field6921;
            arg1.field6924 = this.field6849;
            arg1.field6921.field6924 = arg1;
            arg1.field6924.field6921 = arg1;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method2830(byte arg0) {
        field6842 = null;
        field6850 = null;
        if (arg0 != -29) {
            method2832(44, -80, 105, -60, 114, 79);
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
    public final void method2831(int arg0) {
        if (arg0 != 0) {
            field6842 = null;
        }
        while (true) {
            class472 var2 = this.field6849.field6924;
            if (this.field6849 == var2) {
                field6848++;
                this.field6851 = null;
                return;
            }
            var2.method2859(arg0 ^ 0xFFFFFF84);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIII)V")
    public static final void method2832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6841++;
        int var6 = arg4 - arg3;
        int var7 = arg5 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class412.method2591(arg4, arg1, arg0, arg3, -73);
            }
        } else if (var6 == 0) {
            class340.method2197(arg1, arg5, arg3, -26207, arg0);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg0;
                int var10 = arg5;
                arg0 = arg3;
                arg3 = var9;
                arg5 = arg4;
                arg4 = var10;
            }
            if (arg5 < arg0) {
                int var11 = arg0;
                arg0 = arg5;
                int var12 = arg3;
                arg5 = var11;
                arg3 = arg4;
                arg4 = var12;
            }
            int var13 = arg3;
            int var14 = arg5 - arg0;
            int var15 = arg4 - arg3;
            int var16 = -(var14 >> 1);
            int var17 = arg4 > arg3 ? 1 : -1;
            if (arg2 > var15) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg0; var19 <= arg5; var19++) {
                    class402.field5946[var19][var13] = arg1;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg0; var18 <= arg5; var18++) {
                    class402.field5946[var13][var18] = arg1;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lrp;")
    public static final class277 method2833(int arg0, int arg1) {
        field6840++;
        if (arg1 != -1) {
            field6850 = null;
        }
        class277[] var2 = class33.method199(30507);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class277 var4 = var2[var3];
            if (var4.field4345 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class462() {
        this.field6849.field6924 = this.field6849;
        this.field6849.field6921 = this.field6849;
    }
}
