import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class264 extends class283 {

    @OriginalMember(owner = "client!ui", name = "lb", descriptor = "I")
    private int field4334 = -1;

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "Lna;")
    private static class26 field4323 = class69.method505(" more options", (byte) -126);

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "Lna;")
    public static class26 field4318 = field4323;

    @OriginalMember(owner = "client!ui", name = "hb", descriptor = "Lna;")
    public static class26 field4330 = class69.method505("Schrifts-=tze geladen)3", (byte) -121);

    @OriginalMember(owner = "client!ui", name = "nb", descriptor = "Lna;")
    public static class26 field4336 = class69.method505("jaune:", (byte) -126);

    @OriginalMember(owner = "client!ui", name = "ob", descriptor = "Lna;")
    private static class26 field4337 = class69.method505("Attack", (byte) -126);

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "Lna;")
    public static class26 field4321 = field4337;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "F")
    public static float field4316;

    @OriginalMember(owner = "client!ui", name = "mb", descriptor = "F")
    public static float field4335;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ui", name = "fb", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ui", name = "gb", descriptor = "I")
    private int field4329;

    @OriginalMember(owner = "client!ui", name = "ib", descriptor = "I")
    private int field4331;

    @OriginalMember(owner = "client!ui", name = "jb", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ui", name = "kb", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "Lve;")
    public static class266 field4325;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "[I")
    private int[] field4317;

    @OriginalMember(owner = "client!ui", name = "eb", descriptor = "[[[B")
    public static byte[][][] field4327;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZIII)V", line = 4)
    public static final void method1854(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class232.field3677++;
        field4315++;
        class220.method1479(0);
        if (!arg2) {
            class265.method1867(true, 670232012);
            class13.method83(71, true);
            class265.method1867(false, 670232012);
        }
        class13.method83(100, false);
        if (!arg2) {
            class112.method784(2);
        }
        class254.method1756(false);
        if (class255.field4184) {
            class64.method486(arg4, 125, arg5, arg1, arg3, true);
            arg3 = class205.field3205;
            arg5 = class66.field1050;
            arg4 = class145.field2210;
            arg1 = class71.field1093;
        }
        if (class37.field614 == 1) {
            int var6 = class56.field921 + class300.field5156 & 0x7FF;
            int var7 = class224.field3534;
            if (var7 < (class196.field3051 / 256)) {
                var7 = class196.field3051 / 256;
            }
            if (class290.field4825[4] && class10.field134[4] + 128 > var7) {
                var7 = class10.field134[4] + 128;
            }
            class272.method1930(class72.field1113, -1907397104, arg1, class17.method118(class279.field4651, 1, class13.field221.field3962, class13.field221.field3972) - 50, 600 - -(var7 * 3), var6, class212.field3277, var7);
        }
        if (arg0 != -6403) {
            return;
        }
        int var8 = class178.field2793;
        int var9 = class324.field5589;
        int var10 = class14.field231;
        int var11 = class312.field5335;
        int var12 = class230.field3660;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class290.field4825[var13]) {
                int var14 = (int) ((double) (-class110.field1748[var13]) + (double) (class110.field1748[var13] * 2 + 1) * Math.random() + Math.sin((double) class240.field3882[var13] / 100.0D * (double) class139.field2124[var13]) * (double) class10.field134[var13]);
                if (var13 == 3) {
                    class230.field3660 = class230.field3660 + var14 & 0x7FF;
                }
                if (var13 == 4) {
                    class312.field5335 += var14;
                    if (class312.field5335 < 128) {
                        class312.field5335 = 128;
                    }
                    if (class312.field5335 > 383) {
                        class312.field5335 = 383;
                    }
                }
                if (var13 == 2) {
                    class14.field231 += var14;
                }
                if (var13 == 1) {
                    class178.field2793 += var14;
                }
                if (var13 == 0) {
                    class324.field5589 += var14;
                }
            }
        }
        class275.method1949(-118);
        if (class255.field4184) {
            class326.method2279(arg3, arg5, arg3 + arg4, arg5 - -arg1);
            float var15 = (float) class312.field5335 * 0.17578125F;
            float var16 = (float) class230.field3660 * 0.17578125F;
            if (class37.field614 == 3) {
                var15 = class123.field1915 * 360.0F / 6.2831855F;
                var16 = class7.field80 * 360.0F / 6.2831855F;
            }
            class255.method1784(arg3, arg5, arg4, arg1, arg4 / 2 + arg3, arg5 - -(arg1 / 2), var15, var16, class259.field4229, class259.field4229);
        } else {
            class34.method287(arg3, arg5, arg3 + arg4, arg1 + arg5);
            class200.method1338();
        }
        if (class11.field153 || class187.field2959 < arg3 || class187.field2959 >= (arg3 + arg4) || arg5 > class11.field150 || (arg1 + arg5) <= class11.field150) {
            class142.field2177 = false;
            class9.field102 = 0;
        } else {
            class142.field2177 = true;
            class9.field102 = 0;
            int var17 = class21.field301;
            int var18 = class273.field4571;
            int var19 = class312.field5336;
            class277.field4635 = (var17 - var19) * (class187.field2959 - arg3) / arg4 + var19;
            int var20 = class218.field3495;
            class236.field3771 = (class11.field150 - arg5) * (var20 - var18) / arg1 + var18;
        }
        class258.method1815(-16385);
        byte var21 = class40.method323((byte) 70) == 2 ? (byte) class232.field3677 : 1;
        if (class255.field4184) {
            class255.method1786();
            class255.method1771(true);
            boolean var22 = false;
            class255.method1767(true);
            int var23;
            if (class207.field3217 == 10) {
                var23 = class214.method1424(class25.field366, class14.field231 >> 10, class57.field923, class324.field5589 >> 10, arg0 + 6404);
            } else {
                var23 = class214.method1424(class25.field366, class13.field221.field3890[0] >> 3, class57.field923, class13.field221.field3904[0] >> 3, 1);
            }
            class226.method1506(class229.field3626, !class166.field2574);
            class255.method1789(var23);
            class122.method839(class312.field5335, class14.field231, class178.field2793, class324.field5589, false, class230.field3660);
            class255.field4168 = class229.field3626;
            class47.method354(class324.field5589, class178.field2793, class14.field231, class312.field5335, class230.field3660, class170.field2662, class153.field2392, class50.field793, class80.field1260, class159.field2480, class249.field4080, class279.field4651 + 1, var21, class13.field221.field3962 >> 7, class13.field221.field3972 >> 7);
            class262.field4282 = true;
            class226.method1502();
            class122.method839(0, 0, 0, 0, false, 0);
            class258.method1815(-16385);
            class259.method1822();
            class165.method1119(arg5, arg4, arg3, class259.field4229, arg1, class259.field4229, -7397);
            class252.method1741(arg4, arg3, arg1, true, class259.field4229, class259.field4229, arg5);
        } else {
            class34.method286(arg3, arg5, arg4, arg1, 0);
            class47.method354(class324.field5589, class178.field2793, class14.field231, class312.field5335, class230.field3660, class170.field2662, class153.field2392, class50.field793, class80.field1260, class159.field2480, class249.field4080, class279.field4651 + 1, var21, class13.field221.field3962 >> 7, class13.field221.field3972 >> 7);
            class258.method1815(arg0 - 9982);
            class259.method1822();
            class165.method1119(arg5, arg4, arg3, 256, arg1, 256, arg0 - 994);
            class252.method1741(arg4, arg3, arg1, true, 256, 256, arg5);
        }
        ((class13) class200.field3102).method82(true, class25.field366);
        class64.method482(arg4, arg5, arg1, arg3, (byte) -121);
        class312.field5335 = var11;
        class14.field231 = var10;
        class178.field2793 = var8;
        class324.field5589 = var9;
        class230.field3660 = var12;
        if (class84.field1383 && class258.field4212.method231(4) == 0) {
            class84.field1383 = false;
        }
        if (class84.field1383) {
            if (class255.field4184) {
                class326.method2278(arg3, arg5, arg4, arg1, 0);
            } else {
                class34.method286(arg3, arg5, arg4, arg1, 0);
            }
            class283.method1996((byte) -52, false, class115.field1810);
        }
        if (!arg2 && !class84.field1383 && !class11.field153 && arg3 <= class187.field2959 && arg3 + arg4 > class187.field2959 && arg5 <= class11.field150 && arg1 + arg5 > class11.field150) {
            class290.method2042(arg5, arg4, arg1, arg3, class11.field150, class187.field2959, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)[[I", line = 247)
    public final int[][] method3(int arg0, int arg1) {
        field4324++;
        if (arg0 != -1) {
            this.field4334 = 6;
        }
        int[][] var3 = this.field4719.method2182((byte) -120, arg1);
        if (this.field4719.field5381 && this.method1855(false)) {
            int var4 = (class225.field3574 == this.field4331 ? arg1 : this.field4331 * arg1 / class225.field3574) * this.field4329;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class101.field1632 == this.field4329) {
                for (int var8 = 0; var8 < class101.field1632; var8++) {
                    int var9 = this.field4317[var4++];
                    var7[var8] = class4.method23(var9 << 4, 4080);
                    var6[var8] = class4.method23(var9, 65280) >> 4;
                    var5[var8] = class4.method23(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class101.field1632; var10++) {
                    int var11 = this.field4329 * var10 / class101.field1632;
                    int var12 = this.field4317[var4 + var11];
                    var7[var10] = class4.method23(var12 << 4, 4080);
                    var6[var10] = class4.method23(65280, var12) >> 4;
                    var5[var10] = class4.method23(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Z", line = 316)
    private final boolean method1855(boolean arg0) {
        field4319++;
        if (arg0) {
            return true;
        } else if (this.field4317 != null) {
            return true;
        } else if (this.field4334 < 0) {
            return false;
        } else {
            int var2 = class101.field1632;
            int var3 = class225.field3574;
            int var4 = class192.field2996.method101((byte) -104, this.field4334) ? 64 : 128;
            this.field4317 = class192.field2996.method84(64, this.field4334);
            this.field4331 = var4;
            this.field4329 = var4;
            class320.method2224(18, var3, var2);
            return this.field4317 != null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)I", line = 350)
    public static final int method1856(int arg0, int arg1) {
        int var2 = 74 % ((8 - arg1) / 54);
        field4332++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILwa;Z)V", line = 360)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (!arg2) {
            field4325 = (class266) null;
        }
        if (arg0 == 0) {
            this.field4334 = arg1.method576(1);
        }
        field4320++;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 373)
    public class264() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(B)V", line = 378)
    public final void method805(byte arg0) {
        super.method805(arg0);
        this.field4317 = null;
        field4326++;
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(B)V", line = 390)
    public static void method1857(byte arg0) {
        field4323 = null;
        field4337 = null;
        field4321 = null;
        field4318 = null;
        field4330 = null;
        if (arg0 > 66) {
            field4325 = null;
            field4327 = (byte[][][]) null;
            field4336 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)Lml;", line = 407)
    public static final class133 method1858(int arg0, boolean arg1) {
        field4322++;
        class133 var2 = (class133) class50.field783.method28((long) arg0, 1400);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class7.field81.method1889(class291.method2048((byte) 44, arg0), (byte) -122, class214.method1425((byte) 3, arg0));
        class133 var4 = new class133();
        if (!arg1) {
            method1861(-42, 33);
        }
        if (var3 != null) {
            var4.method905(new class82(var3), -122);
        }
        class50.field783.method33(var4, (long) arg0, (byte) -115);
        return var4;
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)[Lok;", line = 437)
    public static final class150[] method1859(int arg0) {
        field4333++;
        class150[] var1 = new class150[class313.field5350];
        for (int var2 = 0; var2 < class313.field5350; var2++) {
            if (class255.field4184) {
                var1[var2] = new class16(class88.field1445, class37.field607, class58.field936[var2], class82.field1281[var2], class141.field2149[var2], class98.field1596[var2], class205.field3203[var2], class190.field2975);
            } else {
                var1[var2] = new class183(class88.field1445, class37.field607, class58.field936[var2], class82.field1281[var2], class141.field2149[var2], class98.field1596[var2], class205.field3203[var2], class190.field2975);
            }
        }
        if (arg0 != 1854847236) {
            field4323 = (class26) null;
        }
        class160.method1088((byte) 113);
        return var1;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)I", line = 465)
    public final int method1860(byte arg0) {
        if (arg0 != 19) {
            this.method1860((byte) -60);
        }
        field4312++;
        return this.field4334;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)V", line = 476)
    public static final void method1861(int arg0, int arg1) {
        field4328++;
        if (arg0 >= 0 && class146.field2228.length > arg0) {
            class146.field2228[arg0] = !class146.field2228[arg0];
            if (arg1 != 4) {
                field4327 = (byte[][][]) ((byte[][][]) null);
            }
        }
    }
}
