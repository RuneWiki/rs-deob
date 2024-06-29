import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class262 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[Ll;")
    public static class295[] field4456 = new class295[0];

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4462 = 2;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Lwm;")
    public static class152 field4464 = class157.method1048("blanc:", 115);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Lah;")
    public static class205 field4459;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIILv;IZJ)Z", line = 10)
    public static final boolean method1804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class73 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class65.field984 == class231.field3779;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class112.field1595 || var16 >= class97.field1394) {
                    return false;
                }
                class34 var17 = class287.field4857[arg0][var15][var16];
                if (var17 != null && var17.field579 >= 5) {
                    return false;
                }
            }
        }
        class248 var18 = new class248();
        var18.field4156 = arg11;
        var18.field4145 = arg0;
        var18.field4155 = arg5;
        var18.field4159 = arg6;
        var18.field4152 = arg7;
        var18.field4144 = arg8;
        var18.field4147 = arg9;
        var18.field4157 = arg1;
        var18.field4151 = arg2;
        var18.field4153 = arg1 + arg3 - 1;
        var18.field4150 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class287.field4857[var22][var19][var20] == null) {
                        class287.field4857[var22][var19][var20] = new class34(var22, var19, var20);
                    }
                }
                class34 var23 = class287.field4857[arg0][var19][var20];
                var23.field580[var23.field579] = var18;
                var23.field568[var23.field579] = var21;
                var23.field556 |= var21;
                var23.field579++;
                if (var13 && class290.field4926[var19][var20] != 0) {
                    var14 = class290.field4926[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class290.field4926[var24][var25] == 0) {
                        class290.field4926[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class237.field3881[class213.field3474++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Lwm;", line = 128)
    public static final class152 method1805(int arg0, int arg1) {
        field4458++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class152 var2 = new class152();
        var2.field2371 = arg1;
        var2.field2389 = new byte[1];
        var2.field2389[0] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Leg;B)V", line = 154)
    public static final void method1806(class300 arg0, byte arg1) {
        field4460++;
        short var2 = 256;
        for (int var3 = 0; var3 < class238.field3904.length; var3++) {
            class238.field3904[var3] = 0;
        }
        if (arg1 != 54) {
            method1806((class300) null, (byte) -90);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var2 * 128.0D * Math.random());
            class238.field3904[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var2 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class179.field2854[var9] = (class238.field3904[var9 - 1] + class238.field3904[var9 + 128] - (-class238.field3904[var9 + 1] + -class238.field3904[var9 + -128])) / 4;
                }
            }
            int[] var10 = class238.field3904;
            class238.field3904 = class179.field2854;
            class179.field2854 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field3736; var12++) {
            for (int var13 = 0; var13 < arg0.field3746; var13++) {
                if (arg0.field5195[var11++] != 0) {
                    int var14 = var13 + arg0.field3745 + 16;
                    int var15 = var12 + arg0.field3741 + 16;
                    int var16 = (var15 << 7) + var14;
                    class238.field3904[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 252)
    public static void method1807(byte arg0) {
        field4459 = null;
        if (arg0 >= -2) {
            method1809((byte) 91, true);
        }
        field4456 = null;
        field4464 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZIIIII)V", line = 265)
    public static final void method1808(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4457++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = arg6 - arg4;
        int var11 = 0;
        int var12 = arg0 * arg0;
        int var13 = arg6 * arg6;
        int var14 = arg0 - arg4;
        int var15 = var12 << 1;
        int var16 = var13 << 1;
        int var17 = var10 * var10;
        int var18 = var14 * var14;
        int var19 = var17 << 1;
        int var20 = var18 << 1;
        int var21 = var14 << 1;
        if (arg2) {
            return;
        }
        int var22 = arg0 << 1;
        int var23 = (1 - var22) * var13 + var15;
        int var24 = (1 - var21) * var17 + var20;
        int var25 = var12 - ((var22 - 1) * var16);
        int var26 = var18 - ((var21 - 1) * var19);
        int var27 = var13 << 2;
        int var28 = var12 << 2;
        int var29 = var17 << 2;
        int var30 = var18 << 2;
        int var31 = var15 * 3;
        int var32 = (var22 - 3) * var16;
        int var33 = var20 * 3;
        int var34 = var28;
        int var35 = (var21 - 3) * var19;
        int var36 = (arg0 - 1) * var27;
        int var37 = var30;
        if (class157.field2505 <= arg5 && arg5 <= class110.field1553) {
            int[] var38 = class179.field2843[arg5];
            int var39 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg3 - arg6);
            int var40 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg3 + arg6);
            int var41 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg3 - var10);
            int var42 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg3 + var10);
            class275.method1885(arg7, var38, var39, var41, -2611);
            class275.method1885(arg1, var38, var41, var42, -2611);
            class275.method1885(arg7, var38, var42, var40, -2611);
        }
        int var43 = (var14 - 1) * var29;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var25 += var34;
                    var23 += var31;
                    var34 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var25 < 0) {
                var25 += var34;
                var8++;
                var34 += var28;
                var23 += var31;
                var31 += var28;
            }
            var25 += -var32;
            boolean var44 = var14 >= var9;
            var23 += -var36;
            var9--;
            var36 -= var27;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            var32 -= var27;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var33;
                        var11++;
                        var26 += var37;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var11++;
                    var24 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                }
                var26 += -var35;
                var24 += -var43;
                var43 -= var29;
                var35 -= var29;
            }
            if (class157.field2505 <= var46 && var45 <= class110.field1553) {
                int var47 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg3 + var8);
                int var48 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg3 - var8);
                if (var44) {
                    int var49 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg3 + var11);
                    int var50 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg3 - var11);
                    if (var45 >= class157.field2505) {
                        int[] var51 = class179.field2843[var45];
                        class275.method1885(arg7, var51, var48, var50, -2611);
                        class275.method1885(arg1, var51, var50, var49, -2611);
                        class275.method1885(arg7, var51, var49, var47, -2611);
                    }
                    if (class110.field1553 >= var46) {
                        int[] var52 = class179.field2843[var46];
                        class275.method1885(arg7, var52, var48, var50, -2611);
                        class275.method1885(arg1, var52, var50, var49, -2611);
                        class275.method1885(arg7, var52, var49, var47, -2611);
                    }
                } else {
                    if (var45 >= class157.field2505) {
                        class275.method1885(arg7, class179.field2843[var45], var48, var47, -2611);
                    }
                    if (var46 <= class110.field1553) {
                        class275.method1885(arg7, class179.field2843[var46], var48, var47, -2611);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BZ)I", line = 474)
    public static final int method1809(byte arg0, boolean arg1) {
        field4461++;
        long var2 = class76.method507(-30994);
        for (class139 var4 = arg1 ? (class139) class183.field2901.method1585(-1506054736) : (class139) class183.field2901.method1581((byte) -98); var4 != null; var4 = (class139) class183.field2901.method1581((byte) -77)) {
            if ((var4.field2118 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field2118 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4689;
                    class249.field4227[var5] = class155.field2464[var5];
                    var4.method1880(-25368);
                    return var5;
                }
                var4.method1880(-25368);
            }
        }
        int var6 = 112 / ((-arg0 - 81) / 35);
        return -1;
    }
}
