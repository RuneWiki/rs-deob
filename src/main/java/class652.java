import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class652 extends class649 {

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        ++field9261;
        super.field9223 = arg0;
        if (arg1 < -120) {
            class435.method2692(super.field9223, -22123);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            this.method135(-18);
        }
        ++field9256;
        return super.field9224.method2290(-21318).method3487(-13485) < 96 ? 3 : 1;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method3665(String arg0, boolean arg1) {
        ++field9250;
        class429.field6277 = arg0;
        if (class351.field5138 != null) {
            if (!arg1) {
                method3670(-56, -128, 101, -117, -111, (byte[]) null, 94, (byte[]) null, 84);
            }
            try {
                String var2 = class351.field5138.getParameter("cookieprefix");
                String var3 = class351.field5138.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (~arg0.length() == -1) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class153.method1157((byte) 119, 94608000000L + class18.method109(-11121)) + "; Max-Age=" + 94608000L;
                }
                class284.method1861(92, class351.field5138, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lha;I)V")
    public static final void method3666(class544 arg0, int arg1) {
        ++field9260;
        int var2 = 0;
        int var3 = 0;
        if (class250.field3989) {
            var2 = class499.method3028(arg1 ^ 255);
            var3 = class545.method3197(arg1 + -150);
        }
        int var4 = class713.field10029 - -var2;
        int var5 = class677.field9542 + var3;
        int var6 = class662.field9427;
        int var7 = class232.field3742 - 3;
        if (arg1 != 255) {
            method3669((byte) -14);
        }
        byte var8 = 20;
        class227.method1589(class677.field9542 - -var3, class232.field3742, class641.field9017.method3621(92, class467.field6804), arg0, 858567256, class662.field9427, class713.field10029 - -var2, var8);
        int var9 = var2 + class651.field9244.method2915(-8463);
        int var10 = class651.field9244.method2921((byte) 86) - -var3;
        if (class467.field6801) {
            int var11 = 0;
            for (class180 var12 = (class180) class26.field263.method3772(true); var12 != null; var12 = (class180) class26.field263.method3780(23774)) {
                int var16 = var11 * 16 + var5 + 13 - -var8;
                ++var11;
                if (~var9 < ~(class713.field10029 + var2) && ~var9 > ~(class713.field10029 - (-var2 - class662.field9427)) && var10 > var16 + -13 && var16 + 4 > var10 && (~var12.field3056 < -2 || ((class208) var12.field3055.field9552.field3449).field3479)) {
                    arg0.method410(class713.field10029 - -var2, var16 + -12, class662.field9427, 16, 255 - class122.field1870 << 24 | class98.field1447, 1);
                }
            }
            if (class74.field1107 != null) {
                class227.method1589(class85.field1258, class304.field4621, class74.field1107.field3061, arg0, 858567256, class265.field4129, class598.field8460, var8);
                int var13 = 0;
                for (class208 var14 = (class208) class74.field1107.field3055.method3772(true); var14 != null; var14 = (class208) class74.field1107.field3055.method3780(23774)) {
                    int var15 = var13 * 16 + class85.field1258 + var8 - -13;
                    ++var13;
                    if (class598.field8460 < var9 && ~var9 > ~(class598.field8460 + class265.field4129) && var10 > var15 - 13 && var10 < var15 - -4 && var14.field3479) {
                        arg0.method410(class598.field8460, var15 + -12, class265.field4129, 16, class98.field1447 | 255 - class122.field1870 << 24, 1);
                    }
                }
                class367.method2348(class304.field4621, class85.field1258, class265.field4129, class598.field8460, var8, (byte) 117, arg0);
            }
        } else {
            int var17 = 0;
            for (class208 var18 = (class208) class344.field5093.method3463((byte) -50); var18 != null; var18 = (class208) class344.field5093.method3469((byte) 107)) {
                int var28 = var5 - (-13 - (class608.field8588 + -1 + -var17) * 16 + -var8);
                ++var17;
                if (~var9 < ~(class713.field10029 + var2) && ~(class713.field10029 - -var2 + class662.field9427) < ~var9 && ~(var28 + -13) > ~var10 && var28 - -4 > var10 && var18.field3479) {
                    arg0.method410(class713.field10029 - -var2, var28 + -12, class662.field9427, 16, 255 - class122.field1870 << 24 | class98.field1447, 1);
                }
            }
        }
        class367.method2348(class232.field3742, class677.field9542 + var3, class662.field9427, class713.field10029 + var2, var8, (byte) 113, arg0);
        if (class467.field6801) {
            int var19 = 0;
            for (class180 var20 = (class180) class26.field263.method3772(true); var20 != null; var20 = (class180) class26.field263.method3780(23774)) {
                int var24 = var19 * 16 + 13 + class677.field9542 + var3 + var8;
                ++var19;
                if (~var20.field3056 != -2) {
                    class76.method687(-16777216 | class621.field8728, var9, var24, class662.field9427, class232.field3742, arg0, var10, class713.field10029 - -var2, class677.field9542 - -var3, (byte) -53, class174.field2999 | -16777216, var20);
                } else {
                    class336.method2153((byte) -89, class677.field9542 - -var3, arg0, var24, var9, class232.field3742, (class208) var20.field3055.field9552.field3449, var10, class662.field9427, -16777216 | class621.field8728, class713.field10029 + var2, class174.field2999 | -16777216);
                }
            }
            if (class74.field1107 != null) {
                int var21 = 0;
                for (class208 var22 = (class208) class74.field1107.field3055.method3772(true); var22 != null; var22 = (class208) class74.field1107.field3055.method3780(23774)) {
                    int var23 = var21 * 16 + class85.field1258 - -var8 + 13;
                    class336.method2153((byte) 110, class85.field1258, arg0, var23, var9, class304.field4621, var22, var10, class265.field4129, class621.field8728 | -16777216, class598.field8460, -16777216 | class174.field2999);
                    ++var21;
                }
                class403.method2491(arg1 ^ -194, class265.field4129, class85.field1258, class304.field4621, class598.field8460);
            }
        } else {
            int var25 = 0;
            for (class208 var26 = (class208) class344.field5093.method3463((byte) -50); var26 != null; var26 = (class208) class344.field5093.method3469((byte) 107)) {
                int var27 = var5 - -var8 - (-((-var25 + -1 + class608.field8588) * 16) + -13);
                ++var25;
                class336.method2153((byte) -4, var5, arg0, var27, var9, var7, var26, var10, var6, class621.field8728 | -16777216, var4, class174.field2999 | -16777216);
            }
        }
        class403.method2491(-104, class662.field9427, class677.field9542 - -var3, class232.field3742, class713.field10029 - -var2);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILei;)Ljava/lang/String;")
    public static final String method3667(int arg0, class180 arg1) {
        ++field9254;
        if (arg0 >= -32) {
            field9258 = 45;
        }
        return arg1.field3061 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)I")
    public final int method3668(int arg0) {
        ++field9259;
        return arg0 != 3 ? 110 : super.field9223;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lhs;)V")
    public class652(class358 arg0) {
        super(arg0);
        class435.method2692(super.field9223, -22123);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)Lul;")
    public static final class363 method3669(byte arg0) {
        ++field9251;
        return arg0 != 67 ? null : class208.field3480;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (arg0 == 1) {
            ++field9252;
            if (~super.field9224.method2290(-21318).method3487(-13485) > -97) {
                super.field9223 = 0;
            }
            if (~super.field9223 > -1 || ~super.field9223 < -3) {
                super.field9223 = this.method135(105);
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(ILhs;)V")
    public class652(int arg0, class358 arg1) {
        super(arg0, arg1);
        class435.method2692(super.field9223, -22123);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIII[BI[BI)V")
    public static final void method3670(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        ++field9257;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 3);
        if (arg4 == 96) {
            for (int var11 = -arg8; var11 < 0; ++var11) {
                int var10001;
                for (int var12 = var9; ~var12 > -1; ++var12) {
                    var10001 = arg3++;
                    arg7[var10001] += arg5[arg0++];
                    int var14 = arg3++;
                    arg7[var14] += arg5[arg0++];
                    int var15 = arg3++;
                    arg7[var15] += arg5[arg0++];
                    int var16 = arg3++;
                    arg7[var16] += arg5[arg0++];
                }
                for (int var13 = var10; ~var13 > -1; ++var13) {
                    var10001 = arg3++;
                    arg7[var10001] += arg5[arg0++];
                }
                arg3 += arg2;
                arg0 += arg6;
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field9255;
        int var2 = -67 % ((arg0 - -18) / 50);
        return super.field9224.method2290(-21318).method3487(-13485) < 96 ? 0 : 2;
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)Z")
    public final boolean method3671(int arg0) {
        ++field9253;
        if (super.field9224.method2290(-21318).method3487(-13485) < 96) {
            return false;
        } else {
            if (arg0 != -16181) {
                field9258 = 95;
            }
            return true;
        }
    }
}
