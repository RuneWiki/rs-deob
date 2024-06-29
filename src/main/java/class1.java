import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 {

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lre;")
    private class137 field5 = new class137();

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Ltl;")
    public static class59 field6 = class85.method639("<col=ff9040>", 9588);

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field10 = 0;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Ltl;")
    public static class59 field16 = class85.method639("(U (X", 9588);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "F")
    public static float field1;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lre;")
    private class137 field12;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "[[[I")
    public static int[][][] field2;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "[[[I")
    public static int[][][] field3;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lre;", line = 5)
    public final class137 method1(byte arg0) {
        field7++;
        class137 var2 = this.field12;
        if (this.field5 == var2) {
            this.field12 = null;
            return null;
        }
        if (arg0 < 100) {
            method10(-40, -29, 79);
        }
        this.field12 = var2.field2263;
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLme;Lme;II)Lpc;", line = 31)
    public static final class118 method2(byte arg0, class295 arg1, class295 arg2, int arg3, int arg4) {
        field13++;
        if (class33.method222(6, arg3, arg4, arg1)) {
            return arg0 == -113 ? class167.method1181(arg0 ^ 0x28, arg2.method2042(arg3, arg4, (byte) -119)) : (class118) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Lre;", line = 63)
    public final class137 method3(int arg0) {
        field14++;
        class137 var2 = this.field5.field2263;
        if (arg0 != 0) {
            return (class137) null;
        } else if (this.field5 == var2) {
            return null;
        } else {
            var2.method997(arg0 + 116);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)I", line = 81)
    public final int method4(int arg0) {
        field15++;
        int var2 = arg0;
        for (class137 var3 = this.field5.field2263; var3 != this.field5; var3 = var3.field2263) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 290)
    public class1() {
        this.field5.field2263 = this.field5;
        this.field5.field2258 = this.field5;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lej;IIIII)V", line = 117)
    public static final void method5(class308 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field18++;
        if (arg0.field5227 == -1 && arg0.field5223 == null) {
            return;
        }
        int var6 = 0;
        if (arg4 > arg0.field5217) {
            var6 += arg4 - arg0.field5217;
        } else if (arg4 < arg0.field5235) {
            var6 += arg0.field5235 - arg4;
        }
        if (arg1 > arg0.field5239) {
            var6 += arg1 - arg0.field5239;
        } else if (arg0.field5210 > arg1) {
            var6 += arg0.field5210 - arg1;
        }
        if (arg0.field5221 == 0 || var6 - 64 > arg0.field5221 || class191.field3198 == 0 || arg0.field5237 != arg2) {
            if (arg0.field5205 != null) {
                class222.field3596.method369(arg0.field5205);
                arg0.field5205 = null;
            }
            if (arg0.field5225 != null) {
                class222.field3596.method369(arg0.field5225);
                arg0.field5225 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg0.field5221 - var6) * class191.field3198 / arg0.field5221;
        if (arg0.field5205 != null) {
            arg0.field5205.method844(var7);
        } else if (arg0.field5227 >= 0) {
            class144 var8 = class144.method1049(class11.field145, arg0.field5227, 0);
            if (var8 != null) {
                class107 var9 = var8.method1048().method801(class145.field2380);
                class115 var10 = class115.method834(var9, 100, var7);
                var10.method852(-1);
                class222.field3596.method365(var10);
                arg0.field5205 = var10;
            }
        }
        if (arg0.field5225 != null) {
            arg0.field5225.method844(var7);
            if (!arg0.field5225.method1997(96)) {
                arg0.field5225 = null;
            }
        } else if (arg0.field5223 != null && (arg0.field5216 -= arg3) <= 0) {
            int var11 = (int) ((double) arg0.field5223.length * Math.random());
            class144 var12 = class144.method1049(class11.field145, arg0.field5223[var11], 0);
            if (var12 != null) {
                class107 var13 = var12.method1048().method801(class145.field2380);
                class115 var14 = class115.method834(var13, 100, var7);
                var14.method852(0);
                class222.field3596.method365(var14);
                arg0.field5225 = var14;
                arg0.field5216 = (int) ((double) (arg0.field5228 - arg0.field5214) * Math.random()) + arg0.field5214;
            }
        }
        if (arg5 < 99) {
            field3 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lre;I)V", line = 243)
    public final void method6(class137 arg0, int arg1) {
        field11++;
        if (arg0.field2258 != null) {
            arg0.method997(121);
        }
        arg0.field2258 = this.field5.field2258;
        arg0.field2263 = this.field5;
        arg0.field2258.field2263 = arg0;
        arg0.field2263.field2258 = arg0;
        if (arg1 > -27) {
            field4 = 17;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)Lre;", line = 262)
    public final class137 method7(int arg0) {
        field9++;
        class137 var2 = this.field5.field2263;
        if (this.field5 == var2) {
            this.field12 = null;
            return null;
        } else if (arg0 >= -21) {
            return (class137) null;
        } else {
            this.field12 = var2.field2263;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 305)
    public static void method8(boolean arg0) {
        field3 = (int[][][]) null;
        field6 = null;
        field16 = null;
        field2 = (int[][][]) null;
        if (arg0) {
            field1 = 1.1734706F;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V", line = 319)
    public final void method9(boolean arg0) {
        if (!arg0) {
            field3 = (int[][][]) ((int[][][]) null);
        }
        while (true) {
            class137 var2 = this.field5.field2263;
            if (this.field5 == var2) {
                this.field12 = null;
                field8++;
                return;
            }
            var2.method997(14);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)J", line = 344)
    public static final long method10(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        return var3 == null || var3.field4085 == null ? 0L : var3.field4085.field5074;
    }
}
