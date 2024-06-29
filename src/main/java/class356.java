import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class356 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public int field5166 = 70;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    private int field5167 = -1;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    private int field5168 = -1;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public int field5172 = 0;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public int field5180 = -1;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public int field5171 = -1;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public int field5184 = 0;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public int field5188 = 16777215;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public int field5175 = -1;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    private int field5173 = -1;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Ljava/lang/String;")
    private String field5192 = "";

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    private int field5191 = -1;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public int field5187 = 0;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field5170 = 1406;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lpa;")
    public static class387 field5190 = new class387(64);

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Lke;")
    public static class622 field5193 = new class622(93, 9);

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lffa;")
    public class195 field5177;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lip;")
    public static class734 field5169;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lsf;)V", line = 8)
    public static final void method2236(class547 arg0) {
        class711.field10005.method407(arg0.field7718, arg0.field7723 + (arg0.method246(-128) >> 1), arg0.field7719, class174.field2459);
        arg0.field7712 = class174.field2459[0];
        arg0.field7717 = class174.field2459[1];
        arg0.field7722 = class174.field2459[2];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lha;I)Lqda;", line = 16)
    public final class112 method2237(class66 arg0, int arg1) {
        field5186++;
        if (this.field5167 < 0) {
            return null;
        }
        if (arg1 != -8) {
            this.field5191 = 76;
        }
        class112 var3 = (class112) this.field5177.field2865.method2373((long) this.field5167, 103);
        if (var3 == null) {
            this.method2244(arg1 + 8, arg0);
            var3 = (class112) this.field5177.field2865.method2373((long) this.field5167, 103);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 50)
    public static void method2238(int arg0) {
        field5193 = null;
        field5169 = null;
        if (arg0 == -1) {
            field5190 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lrv;B)V", line = 66)
    public final void method2239(class120 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                field5185++;
                if (arg1 != 38) {
                    this.field5175 = -19;
                    return;
                }
                return;
            }
            this.method2247(arg0, var3, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILha;)Lqda;", line = 86)
    public final class112 method2240(int arg0, class66 arg1) {
        field5178++;
        if (~this.field5168 > arg0) {
            return null;
        }
        class112 var3 = (class112) this.field5177.field2865.method2373((long) this.field5168, 103);
        if (var3 == null) {
            this.method2244(0, arg1);
            var3 = (class112) this.field5177.field2865.method2373((long) this.field5168, arg0 ^ 0xFFFFFF98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lor;B)Z", line = 106)
    public static final boolean method2241(class665 arg0, byte arg1) {
        field5179++;
        int var2 = -115 / ((arg1 + 78) / 35);
        if (arg0 == null) {
            return false;
        } else if (!arg0.field9337) {
            return false;
        } else if (!arg0.method3789(class436.field6212, 0)) {
            return false;
        } else if (class498.field7078.method380((byte) -3, (long) arg0.field9371) == null) {
            return class217.field3108.method380((byte) -3, (long) arg0.field9335) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lha;I)Lqda;", line = 155)
    public final class112 method2242(class66 arg0, int arg1) {
        field5182++;
        if (this.field5173 < 0) {
            return null;
        }
        if (arg1 != 7681) {
            this.field5184 = 32;
        }
        class112 var3 = (class112) this.field5177.field2865.method2373((long) this.field5173, 103);
        if (var3 == null) {
            this.method2244(0, arg0);
            var3 = (class112) this.field5177.field2865.method2373((long) this.field5173, 103);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lha;I)Lqda;", line = 179)
    public final class112 method2243(class66 arg0, int arg1) {
        field5174++;
        if (this.field5191 < 0) {
            return null;
        }
        class112 var3 = (class112) this.field5177.field2865.method2373((long) this.field5191, 103);
        if (var3 == null) {
            this.method2244(0, arg0);
            var3 = (class112) this.field5177.field2865.method2373((long) this.field5191, 103);
        }
        return arg1 <= 9 ? null : var3;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(ILha;)V", line = 201)
    private final void method2244(int arg0, class66 arg1) {
        field5181++;
        class544 var3 = this.field5177.field2873;
        if (this.field5167 >= 0 && this.field5177.field2865.method2373((long) this.field5167, 103) == null && var3.method3131(arg0 ^ 0xFFFFFFC3, this.field5167)) {
            class625 var4 = class625.method3587(var3, this.field5167);
            this.field5177.field2865.method2362(arg1.method482(var4, true), 0, (long) this.field5167);
        }
        if (this.field5191 >= 0 && this.field5177.field2865.method2373((long) this.field5191, arg0 ^ 0x67) == null && var3.method3131(arg0 - 111, this.field5191)) {
            class625 var5 = class625.method3587(var3, this.field5191);
            this.field5177.field2865.method2362(arg1.method482(var5, true), 0, (long) this.field5191);
        }
        if (this.field5168 >= arg0 && this.field5177.field2865.method2373((long) this.field5168, 103) == null && var3.method3131(93, this.field5168)) {
            class625 var6 = class625.method3587(var3, this.field5168);
            this.field5177.field2865.method2362(arg1.method482(var6, true), 0, (long) this.field5168);
        }
        if (this.field5173 >= 0 && this.field5177.field2865.method2373((long) this.field5173, 103) == null && var3.method3131(101, this.field5173)) {
            class625 var7 = class625.method3587(var3, this.field5173);
            this.field5177.field2865.method2362(arg1.method482(var7, true), arg0, (long) this.field5173);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 267)
    public final String method2245(byte arg0, int arg1) {
        if (arg0 < 25) {
            return null;
        }
        field5189++;
        String var3 = this.field5192;
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class197.method1426(false, arg1, 3272) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILg;Lha;)I", line = 292)
    public static final int method2246(int arg0, class164 arg1, class66 arg2) {
        field5183++;
        if (arg0 != -6) {
            field5169 = null;
        }
        if (arg1.field2399 != -1) {
            return arg1.field2399;
        }
        if (arg1.field2406 != -1) {
            class181 var3 = arg2.field883.method1263(arg1.field2406, (byte) 123);
            if (!var3.field2744) {
                return var3.field2747;
            }
        }
        return arg1.field2407;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lrv;IB)V", line = 329)
    private final void method2247(class120 arg0, int arg1, byte arg2) {
        field5176++;
        int var4 = 59 % ((arg2 + 70) / 47);
        if (arg1 == 1) {
            this.field5175 = arg0.method898((byte) -104);
        } else if (arg1 == 2) {
            this.field5188 = arg0.method833(-3);
        } else if (arg1 == 3) {
            this.field5167 = arg0.method898((byte) -79);
        } else if (arg1 == 4) {
            this.field5168 = arg0.method898((byte) -79);
        } else if (arg1 == 5) {
            this.field5191 = arg0.method898((byte) -112);
        } else if (arg1 == 6) {
            this.field5173 = arg0.method898((byte) -82);
        } else if (arg1 == 7) {
            this.field5184 = arg0.method838(true);
        } else if (arg1 == 8) {
            this.field5192 = arg0.method874(-1);
        } else if (arg1 == 9) {
            this.field5166 = arg0.method898((byte) -81);
        } else if (arg1 == 10) {
            this.field5187 = arg0.method838(true);
        } else if (arg1 == 11) {
            this.field5180 = 0;
        } else if (arg1 == 12) {
            this.field5171 = arg0.method842(2384);
        } else if (arg1 == 13) {
            this.field5172 = arg0.method838(true);
            return;
        } else if (arg1 == 14) {
            this.field5180 = arg0.method898((byte) -91);
            return;
        }
    }
}
