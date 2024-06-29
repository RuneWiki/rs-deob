import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class345 {

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public int field5266 = 8;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public int field5267 = 16777215;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[Lpp;")
    public static class356[] field5255 = new class356[14];

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field5250 = 0;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "F")
    public static float field5252;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public int field5249;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public int field5257;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public int field5269;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lui;")
    public static class451 field5260;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Z")
    public boolean field5262;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[Lje;")
    public static class178[] field5256;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILre;)V", line = 8)
    public final void method2124(int arg0, class446 arg1) {
        field5261++;
        if (arg0 != 128) {
            method2127(6, (byte) -18, -74, 75, 119, 49, 121, -7, 62, -49);
        }
        while (true) {
            int var3 = arg1.method2628(49152);
            if (var3 == 0) {
                return;
            }
            this.method2130(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z[IIII)V", line = 31)
    public static final void method2125(boolean arg0, int[] arg1, int arg2, int arg3, int arg4) {
        arg2--;
        field5254++;
        if (arg0) {
            method2128(-24, -68, -124, (byte) -94, -65);
        }
        int var8 = arg3 - 1;
        int var5 = var8 - 7;
        while (var5 > arg2) {
            int var6 = arg2 + 1;
            arg1[var6] = arg4;
            int var7 = var6 + 1;
            arg1[var7] = arg4;
            int var9 = var7 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            int var13 = var12 + 1;
            arg1[var13] = arg4;
            arg2 = var13 + 1;
            arg1[arg2] = arg4;
        }
        while (var8 > arg2) {
            arg2++;
            arg1[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILre;)Ljava/lang/String;", line = 66)
    public static final String method2126(byte arg0, int arg1, class446 arg2) {
        field5263++;
        try {
            int var3 = arg2.method2635(65);
            if (arg0 < 58) {
                method2128(-75, -86, -49, (byte) -66, -88);
            }
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field6315 += class174.field2471.method2167(var3, 0, var4, arg2.field6316, (byte) 42, arg2.field6315);
            return class320.method1971(-28530, var3, var4, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIIIIIIII)V", line = 95)
    public static final void method2127(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5268++;
        if (arg0 < 128 || arg8 < 128 || arg0 > class379.field5642 * 128 - 256 || arg8 > class456.field6477 * 128 - 256) {
            class429.field6114[0] = class429.field6114[1] = -1;
            return;
        }
        int var10 = class25.method219(48602855, arg4, arg8, arg0) - arg9;
        if (arg1 < 26) {
            field5252 = -0.34110796F;
        }
        class227.field3321.method478(arg6, 0, 0);
        class138.field1976.method544(class227.field3321);
        class138.field1976.method518(arg0, var10, arg8, class429.field6114);
        class227.field3321.method478(-arg6, 0, 0);
        class138.field1976.method544(class227.field3321);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIBI)V", line = 121)
    public static final void method2128(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= -83) {
            field5260 = null;
        }
        field5265++;
        if (class176.field2503 <= arg4 && class296.field4443 >= arg4) {
            int var5 = class352.method2172(arg1, class119.field1643, class293.field4420, 0);
            int var6 = class352.method2172(arg2, class119.field1643, class293.field4420, 0);
            class176.method1211(var6, arg4, arg0, var5, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 140)
    public static void method2129(int arg0) {
        field5255 = null;
        field5256 = null;
        field5260 = null;
        if (arg0 != 0) {
            method2127(110, (byte) 42, -21, -113, -56, 120, -56, -5, -20, 53);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILre;Z)V", line = 166)
    private final void method2130(int arg0, class446 arg1, boolean arg2) {
        if (!arg2) {
            method2127(-17, (byte) 63, 50, 27, 57, -115, 41, 10, 118, -59);
        }
        if (arg0 == 1) {
            this.field5266 = arg1.method2631(2530);
        } else if (arg0 == 2) {
            this.field5262 = true;
        } else if (arg0 == 3) {
            this.field5269 = arg1.method2634(-46);
            this.field5257 = arg1.method2634(-107);
            this.field5259 = arg1.method2634(118);
        } else if (arg0 == 4) {
            this.field5264 = arg1.method2628(49152);
        } else if (arg0 == 5) {
            this.field5249 = arg1.method2631(2530);
        } else if (arg0 == 6) {
            this.field5267 = arg1.method2613(-25778);
        }
        field5251++;
    }
}
