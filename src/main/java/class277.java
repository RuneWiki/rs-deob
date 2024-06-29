import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class277 {

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lce;")
    private class126 field4755;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Lae;")
    private class100 field4766;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Lbe;")
    private class19 field4771;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Lke;")
    private static class256 field4762 = class316.method2202(" is already on your ignore list)3", 27626);

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static volatile int field4768 = 0;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lke;")
    public static class256 field4761 = class316.method2202("Versteckt", 27626);

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "Lke;")
    public static class256 field4769 = field4762;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field4770 = 10;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lke;")
    public static class256 field4767 = class316.method2202("(U2", 27626);

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Lke;")
    public static class256 field4772 = class316.method2202("blinken1:", 27626);

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Z")
    public static volatile boolean field4765 = false;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Lra;")
    private class41 field4773;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[Loa;")
    private class302[] field4757;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V", line = 5)
    public static final void method1910(int arg0, int arg1, int arg2) {
        if (arg1 == 4 && !class281.field4880) {
            arg1 = 2;
            arg0 = 2;
        }
        field4764++;
        if (class279.field4863 != arg1) {
            if (class77.field1451) {
                return;
            }
            if (class279.field4863 != 0) {
                class72.field1316[class279.field4863].method91();
            }
            if (arg1 != 0) {
                class217 var3 = class72.field1316[arg1];
                var3.method95();
                var3.method93(arg0);
            }
            class39.field707 = arg0;
            class279.field4863 = arg1;
        } else if (arg1 != 0 && class39.field707 != arg0) {
            class72.field1316[arg1].method93(arg0);
            class39.field707 = arg0;
        }
        if (arg2 != -19856) {
            field4772 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IJ)V", line = 51)
    public static final void method1911(int arg0, long arg1) {
        field4756++;
        if (arg0 >= -8) {
            field4768 = 20;
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class311.field5358; var3++) {
            if (class108.field1924[var3] == arg1) {
                class267.field4567++;
                class311.field5358--;
                for (int var4 = var3; var4 < class311.field5358; var4++) {
                    class124.field2203[var4] = class124.field2203[var4 + 1];
                    class68.field1261[var4] = class68.field1261[var4 + 1];
                    class35.field565[var4] = class35.field565[var4 + 1];
                    class108.field1924[var4] = class108.field1924[var4 + 1];
                    class273.field4673[var4] = class273.field4673[var4 + 1];
                    class53.field979[var4] = class53.field979[var4 + 1];
                }
                class7.field113 = class35.field549;
                class308.field5322.method1599(173, (byte) 127);
                class308.field5322.method330(255, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I", line = 109)
    public static final int method1912(int arg0, int arg1) {
        field4759++;
        if (arg0 != -1782288857) {
            method1917(84, 97, -85, -80, 86, (byte) -33, (class26) null);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZLtj;Ltj;I)Loa;", line = 128)
    private final class302 method1913(int arg0, boolean arg1, class75 arg2, class75 arg3, int arg4) {
        field4758++;
        if (this.field4773 == null) {
            throw new RuntimeException();
        }
        this.field4773.field738 = arg0 * 8 + 5;
        if (this.field4773.field772.length <= this.field4773.field738) {
            throw new RuntimeException();
        } else if (this.field4757[arg0] == null) {
            if (arg4 < 56) {
                method1911(89, 83L);
            }
            int var6 = this.field4773.method327(4);
            int var7 = this.field4773.method327(4);
            class302 var8 = new class302(arg0, arg2, arg3, this.field4755, this.field4766, var6, var7, arg1);
            this.field4757[arg0] = var8;
            return var8;
        } else {
            return this.field4757[arg0];
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 169)
    public final void method1914(int arg0) {
        field4760++;
        if (arg0 < 105 || this.field4757 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4757.length; var2++) {
            if (this.field4757[var2] != null) {
                this.field4757[var2].method2109((byte) 8);
            }
        }
        for (int var3 = 0; var3 < this.field4757.length; var3++) {
            if (this.field4757[var3] != null) {
                this.field4757[var3].method2115(1886);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILtj;ILtj;)Loa;", line = 205)
    public final class302 method1915(int arg0, class75 arg1, int arg2, class75 arg3) {
        if (arg2 == -1) {
            field4752++;
            return this.method1913(arg0, true, arg1, arg3, 87);
        } else {
            return (class302) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 216)
    public static void method1916(int arg0) {
        if (arg0 <= 115) {
            field4762 = (class256) null;
        }
        field4761 = null;
        field4769 = null;
        field4772 = null;
        field4767 = null;
        field4762 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIBLha;)Lha;", line = 230)
    public static final class26 method1917(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class26 arg6) {
        field4754++;
        long var7 = (long) arg3;
        class26 var9 = (class26) class105.field1884.method2077(-13408, var7);
        if (var9 == null) {
            class315 var10 = class315.method2191(class297.field5141, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2195(64, 768, -50, -10, -50);
            class105.field1884.method2074(var9, var7, -1);
        }
        int var11 = arg6.method168();
        int var12 = arg6.method178();
        if (arg5 >= -26) {
            field4772 = (class256) null;
        }
        int var13 = arg6.method179();
        int var14 = arg6.method167();
        class26 var15 = var9.method175(true, true);
        if (arg4 != 0) {
            var15.method164(arg4);
        }
        if (class253.field4323) {
            class149 var16 = (class149) var15;
            if (arg0 != class297.method2080(arg1 + var11, 104, class255.field4377, arg2 + var13) || class297.method2080(arg1 + var12, 111, class255.field4377, arg2 + var14) != arg0) {
                for (int var17 = 0; var17 < var16.field2624; var17++) {
                    var16.field2630[var17] += class297.method2080(var16.field2639[var17] + arg1, 112, class255.field4377, var16.field2636[var17] + arg2) - arg0;
                }
                var16.field2618.field815 = false;
                var16.field2644.field276 = false;
            }
        } else {
            class89 var18 = (class89) var15;
            if (class297.method2080(arg1 + var11, 117, class255.field4377, arg2 + var13) != arg0 || class297.method2080(arg1 + var12, 101, class255.field4377, arg2 + var14) != arg0) {
                for (int var19 = 0; var19 < var18.field1614; var19++) {
                    var18.field1602[var19] += class297.method2080(var18.field1603[var19] + arg1, 100, class255.field4377, var18.field1586[var19] + arg2) - arg0;
                }
                var18.field1597 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)Z", line = 318)
    public final boolean method1918(int arg0) {
        if (arg0 != -1) {
            return false;
        }
        field4763++;
        if (this.field4773 != null) {
            return true;
        }
        if (this.field4771 == null) {
            if (this.field4755.method877((byte) -54)) {
                return false;
            }
            this.field4771 = this.field4755.method876((byte) 0, true, true, 255, 255);
        }
        if (this.field4771.field5342) {
            return false;
        } else {
            this.field4773 = new class41(this.field4771.method117(true));
            this.field4757 = new class302[(this.field4773.field772.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIZBIII)Z", line = 373)
    public static final boolean method1919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, byte arg8, int arg9, int arg10, int arg11) {
        field4774++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class199.field3628[var12][var13] = 0;
                class73.field1332[var12][var13] = 99999999;
            }
        }
        class199.field3628[arg9][arg2] = 99;
        int var14 = arg9;
        class73.field1332[arg9][arg2] = 0;
        byte var15 = 0;
        class52.field954[var15] = arg9;
        int var32 = var15 + 1;
        class292.field5058[var15] = arg2;
        int var16 = arg2;
        int var17 = 0;
        boolean var18 = false;
        int[][] var19 = class124.field2201[class255.field4377].field653;
        while (var32 != var17) {
            var16 = class292.field5058[var17];
            var14 = class52.field954[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg3 == var14 && arg4 == var16) {
                var18 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class124.field2201[class255.field4377].method274(arg11, -24872, var16, var14, 1, arg3, arg4, arg0 - 1)) {
                    var18 = true;
                    break;
                }
                if (arg0 < 10 && class124.field2201[class255.field4377].method271(arg11, 32, var16, arg3, arg0 - 1, 1, var14, arg4)) {
                    var18 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg6 != 0 && class124.field2201[class255.field4377].method270(arg1, arg4, var14, 1, arg5, arg6, var16, arg3, true)) {
                var18 = true;
                break;
            }
            int var20 = class73.field1332[var14][var16] + 1;
            if (var14 > 0 && class199.field3628[var14 - 1][var16] == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0) {
                class52.field954[var32] = var14 - 1;
                class292.field5058[var32] = var16;
                class199.field3628[var14 - 1][var16] = 2;
                var32 = var32 + 1 & 0xFFF;
                class73.field1332[var14 - 1][var16] = var20;
            }
            if (var14 < 103 && class199.field3628[var14 + 1][var16] == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0) {
                class52.field954[var32] = var14 + 1;
                class292.field5058[var32] = var16;
                class199.field3628[var14 + 1][var16] = 8;
                class73.field1332[var14 + 1][var16] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var16 > 0 && class199.field3628[var14][var16 - 1] == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class52.field954[var32] = var14;
                class292.field5058[var32] = var16 - 1;
                class199.field3628[var14][var16 - 1] = 1;
                class73.field1332[var14][var16 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var16 < 103 && class199.field3628[var14][var16 + 1] == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class52.field954[var32] = var14;
                class292.field5058[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class199.field3628[var14][var16 + 1] = 4;
                class73.field1332[var14][var16 + 1] = var20;
            }
            if (var14 > 0 && var16 > 0 && class199.field3628[var14 - 1][var16 - 1] == 0 && (var19[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class52.field954[var32] = var14 - 1;
                class292.field5058[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class199.field3628[var14 - 1][var16 - 1] = 3;
                class73.field1332[var14 - 1][var16 - 1] = var20;
            }
            if (var14 < 103 && var16 > 0 && class199.field3628[var14 + 1][var16 - 1] == 0 && (var19[var14 + 1][var16 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class52.field954[var32] = var14 + 1;
                class292.field5058[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class199.field3628[var14 + 1][var16 - 1] = 9;
                class73.field1332[var14 + 1][var16 - 1] = var20;
            }
            if (var14 > 0 && var16 < 103 && class199.field3628[var14 - 1][var16 + 1] == 0 && (var19[var14 - 1][var16 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class52.field954[var32] = var14 - 1;
                class292.field5058[var32] = var16 + 1;
                class199.field3628[var14 - 1][var16 + 1] = 6;
                class73.field1332[var14 - 1][var16 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && var16 < 103 && class199.field3628[var14 + 1][var16 + 1] == 0 && (var19[var14 + 1][var16 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class52.field954[var32] = var14 + 1;
                class292.field5058[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class199.field3628[var14 + 1][var16 + 1] = 12;
                class73.field1332[var14 + 1][var16 + 1] = var20;
            }
        }
        class91.field1669 = 0;
        if (!var18) {
            if (!arg7) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg3 - var22; var24 <= (arg3 + var22); var24++) {
                for (int var25 = arg4 - var22; var25 <= (arg4 + var22); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class73.field1332[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg3 > var24) {
                            var26 = arg3 - var24;
                        } else if ((arg3 + arg5 - 1) < var24) {
                            var26 = var24 - arg3 - (arg5 - 1);
                        }
                        int var27 = 0;
                        if (arg4 > var25) {
                            var27 = arg4 - var25;
                        } else if (arg4 + arg6 - 1 < var25) {
                            var27 = var25 + 1 - arg4 - arg6;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && class73.field1332[var24][var25] < var23) {
                            var14 = var24;
                            var21 = var28;
                            var16 = var25;
                            var23 = class73.field1332[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg9 == var14 && arg2 == var16) {
                return false;
            }
            class91.field1669 = 1;
        }
        byte var29 = 0;
        if (arg8 != 13) {
            method1910(-37, 20, 53);
        }
        class52.field954[var29] = var14;
        int var33 = var29 + 1;
        class292.field5058[var29] = var16;
        int var30;
        int var31 = var30 = class199.field3628[var14][var16];
        while (arg9 != var14 || arg2 != var16) {
            if (var30 != var31) {
                var30 = var31;
                class52.field954[var33] = var14;
                class292.field5058[var33++] = var16;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            var31 = class199.field3628[var14][var16];
        }
        if (var33 > 0) {
            class157.method1163(arg10, var33, arg8 ^ 0x14);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lce;Lae;)V", line = 660)
    public class277(class126 arg0, class100 arg1) {
        this.field4755 = arg0;
        this.field4766 = arg1;
        if (!this.field4755.method877((byte) -54)) {
            this.field4771 = this.field4755.method876((byte) 0, true, true, 255, 255);
        }
    }
}
