import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class336 extends class279 {

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "Ljava/lang/String;")
    public static String field5238 = "Please wait...";

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public static int field5230 = 0;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "Z")
    public static boolean field5241 = false;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "Ljava/lang/String;")
    public static String field5243 = "";

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    public static int field5239 = 0;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field5240 = new String[1000];

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public int field5231;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public int field5233;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public int field5242;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "Ljava/lang/String;")
    public String field5235;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "[I")
    public int[] field5229;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "[I")
    public int[] field5236;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "[Lqf;")
    public class311[] field5234;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field5237;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIZ)V", line = 7)
    public static final void method2332(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            method2334(71, (byte[]) null, 38, (class200[]) null, true, -73, -103, 93, -15, 103, -27);
        }
        class275.field4241 = -1;
        class191.field3045 = class340.field5301 * arg3 / arg1;
        class198.field3167 = -1;
        class322.field5081 = class251.field3959 * arg0 / arg2;
        class310.method2146(5);
        field5228++;
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V", line = 22)
    public static void method2333(int arg0) {
        if (arg0 >= -80) {
            method2333(46);
        }
        field5240 = null;
        field5238 = null;
        field5243 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[BI[Lqd;ZIIIIII)V", line = 37)
    public static final void method2334(int arg0, byte[] arg1, int arg2, class200[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5232++;
        class6 var11 = new class6(arg1);
        int var12 = -1;
        if (arg5 != 3) {
            method2334(53, (byte[]) null, 59, (class200[]) null, false, -37, 122, 91, -45, -77, 120);
        }
        while (true) {
            int var13 = var11.method49((byte) -118);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method52(-32768);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFFF) >> 6;
                int var18 = var11.method58(-288140008);
                int var19 = var18 >> 2;
                int var20 = var14 >> 12;
                int var21 = var18 & 0x3;
                if (arg0 == var20 && var17 >= arg6 && var17 < arg6 + 8 && arg8 <= var16 && (arg8 + 8) > var16) {
                    class121 var22 = class249.method1790(92, var12);
                    int var23 = arg10 + class138.method1031(arg9, var22.field1724, var16 & 0x7, var22.field1734, var21, var17 & 0x7, arg5 - 2);
                    int var24 = arg7 + class81.method597(arg9, (byte) 94, var21, var22.field1734, var16 & 0x7, var22.field1724, var17 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class200 var25 = null;
                        if (!arg4) {
                            int var26 = arg2;
                            if ((class134.field1969[1][var23][var24] & 0x2) == 2) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg3[var26];
                            }
                        }
                        class305.method2116(var24, arg9 + var21 & 0x3, arg2, arg4, 10768, !arg4, var25, var19, var23, var12, arg2);
                    }
                }
            }
        }
    }
}
