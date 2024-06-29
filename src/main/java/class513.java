import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class513 implements class509 {

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Lle;")
    private class524 field7040;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lae;")
    private class283 field7041;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lae;")
    private class283 field7039;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lda;")
    private class442 field7042;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZB)V", line = 6)
    public static final void method3056(boolean arg0, byte arg1) {
        field7037++;
        class49.method414(class249.field3700, arg0, class742.field10226, -1, class610.field8597);
        if (arg1 <= -2) {
            ;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 17)
    public static final void method3057(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class19.field125 = true;
        class449.field6283 = class139.field1781.method143() > 0;
        class595.field8359 = arg15;
        class591.field8336 = arg1 >> class732.field10110;
        class112.field1363 = arg3 >> class732.field10110;
        class722.field9958 = arg1;
        class537.field7427 = arg3;
        class134.field1716 = arg2;
        class379.field5432 = class591.field8336 - class270.field3904;
        if (class379.field5432 < 0) {
            class342.field4967 = -class379.field5432;
            class379.field5432 = 0;
        } else {
            class342.field4967 = 0;
        }
        class583.field8251 = class112.field1363 - class270.field3904;
        if (class583.field8251 < 0) {
            class244.field3618 = -class583.field8251;
            class583.field8251 = 0;
        } else {
            class244.field3618 = 0;
        }
        class407.field5727 = class591.field8336 + class270.field3904;
        if (class407.field5727 > class414.field5796) {
            class407.field5727 = class414.field5796;
        }
        class213.field2955 = class270.field3904 + class112.field1363;
        if (class213.field2955 > class704.field9799) {
            class213.field2955 = class704.field9799;
        }
        boolean[][] var19 = class592.field8338;
        boolean[][] var20 = class450.field6289;
        if (class595.field8359) {
            for (int var21 = 0; var21 < class270.field3904 + class270.field3904 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class270.field3904 + class270.field3904 + 2; var24++) {
                    if (var24 > 1) {
                        class223.field3151[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class591.field8336 + var21 - class270.field3904;
                    int var26 = class112.field1363 + var24 - class270.field3904;
                    if (var25 >= 0 && var26 >= 0 && var25 < class414.field5796 && var26 < class704.field9799) {
                        int var27 = var25 << class732.field10110;
                        int var28 = var26 << class732.field10110;
                        int var29 = class95.field1115[class95.field1115.length - 1].method2525(var25, var26, (byte) 114) - (0x3E8 << class732.field10110 - 7);
                        int var30 = class594.field8355 == null ? class95.field1115[0].method2525(var25, var26, (byte) 114) + class179.field2263 : class594.field8355[0].method2525(var25, var26, (byte) 114) + class179.field2263;
                        var23 = arg16 >= 0 ? class139.field1781.method164(var27, var29, var28, var27, var30, var28, arg16) : class139.field1781.method258(var27, var29, var28, var27, var30, var28);
                        class450.field6289[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class450.field6289[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class223.field3151[var24 - 1] & class223.field3151[var24] & var22 & var23;
                        class592.field8338[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class223.field3151[class270.field3904 + class270.field3904] = var22;
                class223.field3151[class270.field3904 + class270.field3904 + 1] = var23;
            }
            if (arg16 >= 0) {
                class19.field125 = false;
            } else {
                class206.field2893 = arg5;
                class250.field3724 = arg6;
                class472.field6535 = arg7;
                class490.field6734 = arg8;
                class114.field1373 = arg9;
                class523.method3117(class139.field1781, 111, arg10);
            }
        } else {
            if (class173.field2191 == null) {
                class173.field2191 = new boolean[class414.field5796 + class414.field5796 + 1][class704.field9799 + class414.field5796 + 1];
            }
            for (int var32 = 0; var32 < class173.field2191.length; var32++) {
                for (int var42 = 0; var42 < class173.field2191[0].length; var42++) {
                    class173.field2191[var32][var42] = true;
                }
            }
            class450.field6289 = class173.field2191;
            class592.field8338 = class173.field2191;
            class379.field5432 = 0;
            class583.field8251 = 0;
            class407.field5727 = class414.field5796;
            class213.field2955 = class704.field9799;
            class19.field125 = false;
        }
        class461.method2777((byte) 46, class139.field1781);
        if (!class539.field7444.field9810) {
            class519 var33 = class539.field7444.field9809;
            for (class289 var34 = (class289) var33.method3103((byte) 72); var34 != null; var34 = (class289) var33.method3104(-10964)) {
                var34.method2773(59);
                class467.method2791(-51, var34);
            }
        }
        if (class449.field6283) {
            for (int var35 = 0; var35 < class392.field5587; var35++) {
                class205.field2880[var35].method3267(arg0, arg14, (byte) 61);
            }
        }
        if (class753.field10384) {
            class555.field7697 = class139.field1781.method238();
            class139.field1781.method160(class446.field6255);
            int var36 = (class446.field6255[2] - class446.field6255[0]) / class791.field10844;
            for (int var37 = 0; var37 < class791.field10844 - 1; var37++) {
                class362.field5227[var37] = (var37 + 1) * var36 + class718.field9947[var37];
            }
            for (int var38 = 0; var38 < class449.field6282.length; var38++) {
                class449.field6282[var38].method2628();
            }
        }
        if (class530.field7302 != null) {
            if (class753.field10384) {
                class593.method3464(0);
            }
            class111.method810(true);
            class139.field1781.method245(-1, 1583160, 40, 127);
            class271.method1763(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class753.field10384) {
                class339.method2148();
            }
            class139.field1781.method244();
            class111.method810(false);
        }
        class271.method1763(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class753.field10384) {
            for (int var39 = 0; var39 < class266.field3869; var39++) {
                class152.field1994[var39] = class158.field2049[var39];
            }
            class593.method3464(0);
            for (int var40 = 0; var40 < class449.field6282.length; var40++) {
                class449.field6282[var40].method2628();
            }
        }
        if (class753.field10384) {
            class339.method2148();
            for (int var41 = 0; var41 < class266.field3869; var41++) {
                class158.field2049[var41] = class152.field1994[var41];
            }
            if (class749.field10337 == 2) {
                int var10002;
                if (class190.field2377[0] < class190.field2377[1]) {
                    if (class718.field9947[0] + class362.field5227[0] > class446.field6255[0]) {
                        var10002 = class718.field9947[0]++;
                    }
                } else if (class190.field2377[0] > class190.field2377[1] && class718.field9947[0] + class362.field5227[0] < class446.field6255[2]) {
                    var10002 = class718.field9947[0]--;
                }
            }
        }
        if (!class595.field8359) {
            class592.field8338 = var19;
            class450.field6289 = var20;
        }
        class268.method1751();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 296)
    public final void method938(int arg0) {
        field7038++;
        if (arg0 >= 61) {
            class300 var2 = class397.method2445(this.field7041, (byte) 56, this.field7040.field7213);
            this.field7042 = class111.field1332.method179(var2, class279.method1823(this.field7039, this.field7040.field7213), true);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V", line = 309)
    public final void method939(int arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field7040.field7220.method1744(class456.field6378, this.field7040.field7219, (byte) 113) + this.field7040.field7223;
            int var4 = this.field7040.field7215.method59(0, class565.field7983, this.field7040.field7211) + this.field7040.field7217;
            this.field7042.method2643(var4, 0, this.field7040.field7208, var3, this.field7040.field7222, this.field7040.field7219, this.field7040.field7211, null, this.field7040.field7218, this.field7040.field7210, (byte) -33, null, this.field7040.field7214, this.field7040.field7209, 0, null);
        }
        if (arg0 == 7998) {
            field7043++;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Z", line = 333)
    public final boolean method941(byte arg0) {
        field7036++;
        boolean var2 = true;
        if (arg0 != -79) {
            return true;
        }
        if (!this.field7039.method1860(this.field7040.field7213, (byte) 124)) {
            var2 = false;
        }
        if (!this.field7041.method1860(this.field7040.field7213, (byte) 124)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lae;Lae;Lle;)V", line = 354)
    public class513(class283 arg0, class283 arg1, class524 arg2) {
        this.field7040 = arg2;
        this.field7041 = arg1;
        this.field7039 = arg0;
    }
}
