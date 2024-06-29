import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class292 {

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4726 = 0;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4733 = "wave2:";

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lsf;")
    public static class124 field4729 = new class124(200);

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Lsf;")
    public static class124 field4735 = new class124(64);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Lg;")
    public static class181 field4731;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Lol;")
    public static class258 field4736;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Lsb;", line = 4)
    public static final class127 method2070(int arg0) {
        field4732++;
        if (class38.field825 == null) {
            return null;
        }
        class127 var1 = (class127) class276.field4502.method2532((byte) 8);
        if (arg0 <= 94) {
            return (class127) null;
        }
        while (var1 != null) {
            class1 var2 = class125.method901(var1.field2219, (byte) 125);
            if (var2 != null && var2.field5 && var2.method6((byte) -57)) {
                return var1;
            }
            var1 = (class127) class276.field4502.method2532((byte) 8);
        }
        return null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIBLg;III)V", line = 32)
    public static final void method2071(int arg0, int arg1, int arg2, byte arg3, class181 arg4, int arg5, int arg6, int arg7) {
        int var8 = arg2 * arg2 + (arg5 * arg5);
        field4725++;
        if (var8 > arg1) {
            return;
        }
        if (arg3 >= -4) {
            field4735 = (class124) null;
        }
        int var9 = Math.min(arg4.field3024 / 2, arg4.field2972 / 2);
        if (var9 * var9 >= var8) {
            class30.method232(class133.field2280[arg0], arg4, arg2, arg6, 1, arg5, arg7);
            return;
        }
        var9 -= 10;
        int var10;
        if (class69.field1280 == 4) {
            var10 = (int) class354.field5652 & 0x7FF;
        } else {
            var10 = (int) class354.field5652 + class192.field3253 & 0x7FF;
        }
        int var11 = class305.field4957[var10];
        int var12 = class305.field4959[var10];
        if (class69.field1280 != 4) {
            var11 = var11 * 256 / (field4726 + 256);
            var12 = var12 * 256 / (field4726 + 256);
        }
        int var13 = arg5 * var11 - (arg2 * var12) >> 16;
        int var14 = arg2 * var11 + arg5 * var12 >> 16;
        double var15 = Math.atan2((double) var14, (double) var13);
        int var17 = (int) ((double) var9 * Math.sin(var15));
        int var18 = (int) ((double) var9 * Math.cos(var15));
        if (class241.field4016) {
            ((class265) class37.field810[arg0]).method1860(240, 240, (arg4.field3024 / 2 + arg6 + var17) * 16, (arg4.field2972 / 2 + arg7 - var18) * 16, (int) (var15 * 10430.378D), 4096);
        } else {
            ((class288) class37.field810[arg0]).method1293(arg4.field3024 / 2 + arg6 + var17 - 10, arg4.field2972 / 2 + arg7 + -10 + -var18, 20, 20, 15, 15, var15, 256);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 90)
    public static void method2072(int arg0) {
        field4736 = null;
        field4731 = null;
        field4735 = null;
        field4729 = null;
        field4733 = null;
        if (arg0 != 10) {
            method2073(27, -25);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 105)
    public static final void method2073(int arg0, int arg1) {
        field4730++;
        class353 var2 = (class353) class216.field3591.method2344(-1, (long) arg1);
        if (var2 == null) {
            return;
        }
        if (arg0 != 13248) {
            field4726 = 114;
        }
        for (int var3 = 0; var3 < var2.field5646.length; var3++) {
            var2.field5646[var3] = -1;
            var2.field5642[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)I", line = 132)
    public static final int method2074(int arg0, byte arg1) {
        if (arg1 > -90) {
            method2070(-31);
        }
        field4724++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIBI)I", line = 143)
    public static final int method2075(int arg0, int arg1, byte arg2, int arg3) {
        field4728++;
        if (arg2 <= 53) {
            field4736 = (class258) null;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIILqn;B)V", line = 168)
    public static final void method2076(int arg0, int arg1, int arg2, class238 arg3, byte arg4) {
        field4723++;
        if (arg4 < 16) {
            field4731 = (class181) null;
        }
        for (class302 var5 = (class302) class232.field3798.method431(0); var5 != null; var5 = (class302) class232.field3798.method439(-28512)) {
            if (var5.field4915 == arg2 && (arg0 * 128) == var5.field4909 && (arg1 * 128) == var5.field4911 && var5.field4926.field3896 == arg3.field3896) {
                if (var5.field4921 != null) {
                    class56.field1105.method1247(var5.field4921);
                    var5.field4921 = null;
                }
                if (var5.field4920 != null) {
                    class56.field1105.method1247(var5.field4920);
                    var5.field4920 = null;
                }
                var5.method535(-2801);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)I", line = 212)
    public static final int method2077(int arg0) {
        if (arg0 == 2) {
            field4734++;
            return class215.field3584 == 0 ? 0 : class105.field1928[class215.field3584].method226();
        } else {
            return -70;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)I", line = 238)
    public static final int method2078(int arg0) {
        field4727++;
        if (arg0 != 16) {
            return -33;
        } else if (class202.field3384 != null) {
            return 3;
        } else if (class241.field4016 && class208.field3483) {
            return 2;
        } else if (class241.field4016 && !class208.field3483) {
            return 1;
        } else {
            return 0;
        }
    }
}
