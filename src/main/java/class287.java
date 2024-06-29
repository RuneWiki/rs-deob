import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class287 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
    private int[] field4854;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lwm;")
    public static class152 field4851 = class157.method1048("sch-Utteln:", 92);

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[J")
    public static long[] field4855 = new long[1000];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field4850 = 0;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field4861 = -1;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "F")
    public static float field4863;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Lah;")
    public static class205 field4862;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "[Lwm;")
    public static class152[] field4856;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[[[Lkb;")
    public static class34[][][] field4857;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILoe;)I", line = 15)
    public static final int method1930(int arg0, int arg1, class127 arg2) {
        field4859++;
        if (arg2.field1920 == null || arg2.field1920.length <= arg1) {
            return -2;
        }
        int var3 = 30 % ((arg0 + 38) / 54);
        try {
            int[] var4 = arg2.field1920[arg1];
            int var5 = 0;
            byte var6 = 0;
            int var7 = 0;
            while (true) {
                int var8 = var4[var7++];
                byte var9 = 0;
                int var10 = 0;
                if (var8 == 0) {
                    return var5;
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 1) {
                    var10 = class280.field4793[var4[var7++]];
                }
                if (var8 == 2) {
                    var10 = class117.field1652[var4[var7++]];
                }
                if (var8 == 3) {
                    var10 = class260.field4448[var4[var7++]];
                }
                if (var8 == 4) {
                    int var11 = var4[var7++] << 16;
                    int var12 = var11 + var4[var7++];
                    class127 var13 = class11.method54(false, var12);
                    int var14 = var4[var7++];
                    if (var14 != -1 && (!class189.method1253((byte) 45, var14).field5351 || class23.field407)) {
                        for (int var15 = 0; var15 < var13.field1833.length; var15++) {
                            if ((var14 + 1) == var13.field1833[var15]) {
                                var10 += var13.field1837[var15];
                            }
                        }
                    }
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 5) {
                    var10 = class249.field4227[var4[var7++]];
                }
                if (var8 == 6) {
                    var10 = class12.field169[class117.field1652[var4[var7++]] - 1];
                }
                if (var8 == 7) {
                    var10 = class249.field4227[var4[var7++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var10 = class85.field1176.field179;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class311.field5317[var16]) {
                            var10 += class117.field1652[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var4[var7++] << 16;
                    int var18 = var17 + var4[var7++];
                    class127 var19 = class11.method54(false, var18);
                    int var20 = var4[var7++];
                    if (var20 != -1 && (!class189.method1253((byte) 55, var20).field5351 || class23.field407)) {
                        for (int var21 = 0; var21 < var19.field1833.length; var21++) {
                            if (var20 + 1 == var19.field1833[var21]) {
                                var10 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var10 = class94.field1338;
                }
                if (var8 == 12) {
                    var10 = class265.field4475;
                }
                if (var8 == 13) {
                    int var22 = class249.field4227[var4[var7++]];
                    int var23 = var4[var7++];
                    var10 = (0x1 << var23 & var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var4[var7++];
                    var10 = class295.method2035(var24, false);
                }
                if (var8 == 18) {
                    var10 = (class85.field1176.field4162 >> 7) + class272.field4670;
                }
                if (var8 == 19) {
                    var10 = (class85.field1176.field4231 >> 7) + class199.field3226;
                }
                if (var8 == 20) {
                    var10 = var4[var7++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var10;
                    }
                    if (var6 == 1) {
                        var5 -= var10;
                    }
                    if (var6 == 2 && var10 != 0) {
                        var5 /= var10;
                    }
                    if (var6 == 3) {
                        var5 *= var10;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var26) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 229)
    public static final void method1931(int arg0) {
        field4853++;
        class167.field2618.method1613(-22696);
        int var1 = 33 % ((-arg0 - 37) / 48);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 240)
    public static void method1932(int arg0) {
        field4856 = null;
        if (arg0 == -193052368) {
            field4851 = null;
            field4855 = null;
            field4862 = null;
            field4857 = (class34[][][]) null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V", line = 267)
    public static final void method1933(boolean arg0, int arg1) {
        class303 var2 = class90.method589(arg0, arg1, 11);
        field4858++;
        var2.method2114((byte) 127);
        if (arg0) {
            field4857 = (class34[][][]) ((class34[][][]) null);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V", line = 285)
    public static final void method1934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4852++;
        int var7 = arg1 + arg2;
        int var8 = arg0 - arg2;
        if (arg4 != 46875) {
            method1934(30, -76, 56, 65, -1, -53, -2);
        }
        int var9 = arg2 + arg6;
        for (int var10 = arg1; var10 < var7; var10++) {
            class275.method1885(arg5, class179.field2843[var10], arg6, arg3, -2611);
        }
        int var11 = arg3 - arg2;
        for (int var12 = arg0; var12 > var8; var12--) {
            class275.method1885(arg5, class179.field2843[var12], arg6, arg3, -2611);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class179.field2843[var13];
            class275.method1885(arg5, var14, arg6, var9, arg4 - 49486);
            class275.method1885(arg5, var14, var11, arg3, -2611);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([I)V", line = 340)
    public class287(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4854 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4854[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4854[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field4854[var5 + var5] = arg0[var4];
            this.field4854[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)I", line = 381)
    public final int method1935(int arg0, int arg1) {
        if (arg0 != 11) {
            method1931(-19);
        }
        field4860++;
        int var3 = (this.field4854.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field4854[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4854[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
