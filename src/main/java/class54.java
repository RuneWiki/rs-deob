import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class54 extends class95 {

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    private int field1126 = -32768;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Lpj;")
    public static class237 field1123 = class33.method353("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 93);

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Lub;")
    public static class88 field1122 = new class88();

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "Lfa;")
    public static class239 field1120;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "[B")
    public static byte[] field1115;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "[I")
    public static int[] field1130;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
    public static final boolean method476(int arg0, int arg1) {
        field1127++;
        int var2 = -40 % ((arg0 + 48) / 50);
        if (class8.field160 != arg1) {
            return false;
        }
        class8.field160++;
        class195.field3393 = true;
        if (class8.field160 > 65535) {
            class8.field160 = 0;
        }
        return true;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method477(int arg0) {
        field1122 = null;
        if (arg0 != 5) {
            method481(29, true);
        }
        field1120 = null;
        field1123 = null;
        field1130 = null;
        field1115 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class201 var11 = class112.method829((byte) -82, this.field1129).method95(this.field1124, -2, (class256) null, 0);
        field1117++;
        if (var11 != null) {
            var11.method183(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1126 = var11.method176();
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()I")
    public final int method176() {
        field1116++;
        return this.field1126;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILfa;Lfa;)V")
    public static final void method478(int arg0, class239 arg1, class239 arg2) {
        int var3 = 24 / ((arg0 - 36) / 44);
        class41.field933 = arg1;
        class226.field3874 = arg2;
        field1128++;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static final void method479(int arg0) {
        field1121++;
        if (!class15.field244) {
            return;
        }
        class141 var1 = class61.method519(class187.field3272, arg0 ^ arg0, class144.field2606);
        if (var1 != null && var1.field2427 != null) {
            class117 var2 = new class117();
            var2.field2046 = var1;
            var2.field2053 = var1.field2427;
            class229.method1519(-92, var2);
        }
        class15.field244 = false;
        class128.method911(var1, arg0 - 17149);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBLjh;I)V")
    public static final void method480(int arg0, int arg1, byte arg2, class271 arg3, int arg4) {
        field1125++;
        if (class229.field3911 == arg3 || class271.field4664 >= 400) {
            return;
        }
        class237 var10;
        if (arg3.field4669 == 0) {
            boolean var5 = true;
            if (class229.field3911.field4633 != -1 && arg3.field4633 != -1) {
                int var6 = arg3.field4660 < class229.field3911.field4660 ? class229.field3911.field4660 : arg3.field4660;
                int var7 = class229.field3911.field4633 >= arg3.field4633 ? arg3.field4633 : class229.field3911.field4633;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class229.field3911.field4660 - arg3.field4660;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var9 > var8) {
                    var5 = false;
                }
            }
            if (arg3.field4660 >= arg3.field4657) {
                var10 = class238.method1626(new class237[] { arg3.method1802((byte) -18), class81.field1522, class17.field291, class234.field4047, var5 ? class135.method941(arg3.field4660, class229.field3911.field4660, -6) : class85.field1582, class14.method130(arg3.field4660, (byte) 117), class268.field4578 }, -41);
            } else {
                var10 = class238.method1626(new class237[] { arg3.method1802((byte) -18), class81.field1522, class17.field291, class234.field4047, var5 ? class135.method941(arg3.field4660, class229.field3911.field4660, -6) : class85.field1582, class14.method130(arg3.field4660, (byte) 117), class203.field3483, class14.method130(arg3.field4657 - arg3.field4660, (byte) 117), class129.field2257 }, -95);
            }
        } else {
            var10 = class238.method1626(new class237[] { arg3.method1802((byte) -18), class81.field1522, class177.field3113, class234.field4047, class14.method130(arg3.field4669, (byte) 117), class129.field2257 }, -28);
        }
        if (class70.field1376 == 1) {
            class214.field3660++;
            class55.method489(arg1, class37.field831, (short) 45, class238.method1626(new class237[] { class28.field544, class43.field947, var10 }, -64), (long) arg4, arg0, (byte) -85);
        } else if (!class15.field244) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class163.field2901[var11] != null) {
                    class15.field249++;
                    boolean var13 = false;
                    short var14 = 0;
                    if (class184.field3222 == 0 && class163.field2901[var11].method1580(class179.field3149, (byte) 27)) {
                        if (arg3.field4660 > class229.field3911.field4660) {
                            var14 = 2000;
                        }
                        if (class229.field3911.field4652 != 0 && arg3.field4652 != 0) {
                            if (class229.field3911.field4652 == arg3.field4652) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class257.field4421[var11]) {
                        var14 = 2000;
                    }
                    short var15 = class58.field1186[var11];
                    short var16 = (short) (var14 + var15);
                    class55.method489(arg1, class163.field2901[var11], var16, class238.method1626(new class237[] { class85.field1582, var10 }, -56), (long) arg4, arg0, (byte) -114);
                }
            }
        } else if ((class149.field2644 & 0x8) == 8) {
            class55.method489(arg1, class203.field3481, (short) 29, class238.method1626(new class237[] { class181.field3177, class43.field947, var10 }, -66), (long) arg4, arg0, (byte) -99);
            class231.field3982++;
        }
        if (arg2 >= -93) {
            method481(23, false);
        }
        for (int var12 = 0; var12 < class271.field4664; var12++) {
            if (class235.field4090[var12] == 10) {
                class215.field3747[var12] = class238.method1626(new class237[] { class85.field1582, var10 }, -125);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
    public static final void method481(int arg0, boolean arg1) {
        field1119++;
        class151.field2691 = arg1;
        if (arg0 != 26654) {
            field1120 = null;
        }
        if (!class151.field2691) {
            int var2 = class65.field1288.method295(arg0 - 12475);
            int var3 = class65.field1288.method314(-754926392);
            int var4 = class65.field1288.method314(-754926392);
            int var5 = class65.field1288.method321((byte) -81);
            int var6 = (class120.field2130 - class65.field1288.field647) / 16;
            class213.field3639 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class213.field3639[var7][var14] = class65.field1288.method340(26964);
                }
            }
            int var8 = class65.field1288.method300(128);
            class167.field2949 = null;
            class163.field2903 = new byte[var6][];
            class134.field2342 = new int[var6];
            class124.field2178 = new int[var6];
            class224.field3855 = new int[var6];
            class258.field4440 = new int[var6];
            class83.field1555 = new byte[var6][];
            class102.field1819 = new int[var6];
            int var9 = 0;
            class22.field411 = null;
            boolean var10 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var5 / 8 == 48) {
                var10 = true;
            }
            if ((var8 / 8) == 48 && (var5 / 8) == 148) {
                var10 = true;
            }
            for (int var11 = (var8 - 6) / 8; var11 <= ((var8 + 6) / 8); var11++) {
                for (int var12 = (var5 - 6) / 8; var12 <= (var5 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (var10 && var12 == 49 || var12 == 149 || var12 == 147 || var11 == 50 || !(var11 != 49 || var12 != 47)) {
                        class224.field3855[var9] = var13;
                        class258.field4440[var9] = -1;
                        class102.field1819[var9] = -1;
                        class134.field2342[var9] = -1;
                        class124.field2178[var9] = -1;
                    } else {
                        class224.field3855[var9] = var13;
                        class258.field4440[var9] = class241.field4241.method1643(class238.method1626(new class237[] { class99.field1763, class14.method130(var11, (byte) 117), class46.field997, class14.method130(var12, (byte) 117) }, -83), (byte) 119);
                        class102.field1819[var9] = class241.field4241.method1643(class238.method1626(new class237[] { class204.field3489, class14.method130(var11, (byte) 117), class46.field997, class14.method130(var12, (byte) 117) }, -48), (byte) -61);
                        class134.field2342[var9] = class241.field4241.method1643(class238.method1626(new class237[] { class178.field3140, class14.method130(var11, (byte) 117), class46.field997, class14.method130(var12, (byte) 117) }, -61), (byte) -12);
                        class124.field2178[var9] = class241.field4241.method1643(class238.method1626(new class237[] { class6.field66, class14.method130(var11, (byte) 117), class46.field997, class14.method130(var12, (byte) 117) }, -102), (byte) -51);
                    }
                    var9++;
                }
            }
            class128.method908((byte) 61, var5, var8, false, var3, var4, var2);
            return;
        }
        int var15 = class65.field1288.method347(255);
        int var16 = class65.field1288.method321((byte) 56);
        int var17 = class65.field1288.method314(-754926392);
        class65.field1288.method356(false);
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class65.field1288.method358(200, 1);
                    if (var37 == 1) {
                        class273.field4718[var18][var35][var36] = class65.field1288.method358(class38.method384(arg0, 26838), 26);
                    } else {
                        class273.field4718[var18][var35][var36] = -1;
                    }
                }
            }
        }
        class65.field1288.method360(true);
        int var19 = (class120.field2130 - class65.field1288.field647) / 16;
        class213.field3639 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class213.field3639[var20][var34] = class65.field1288.method319((byte) -18);
            }
        }
        int var21 = class65.field1288.method321((byte) 127);
        int var22 = class65.field1288.method314(arg0 - 754953046);
        class134.field2342 = new int[var19];
        class83.field1555 = new byte[var19][];
        class163.field2903 = new byte[var19][];
        class102.field1819 = new int[var19];
        class22.field411 = null;
        class124.field2178 = new int[var19];
        class258.field4440 = new int[var19];
        class167.field2949 = null;
        class224.field3855 = new int[var19];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class273.field4718[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 14 & 0x3FF;
                        int var29 = (var27 & 0x3FF9) >> 3;
                        int var30 = (var28 / 8 << 8) + var29 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class224.field3855[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            class224.field3855[var23] = var30;
                            int var32 = (var30 & 0xFFDA) >> 8;
                            int var33 = var30 & 0xFF;
                            class258.field4440[var23] = class241.field4241.method1643(class238.method1626(new class237[] { class99.field1763, class14.method130(var32, (byte) 117), class46.field997, class14.method130(var33, (byte) 117) }, -36), (byte) 124);
                            class102.field1819[var23] = class241.field4241.method1643(class238.method1626(new class237[] { class204.field3489, class14.method130(var32, (byte) 117), class46.field997, class14.method130(var33, (byte) 117) }, class38.method384(arg0, -26677)), (byte) -125);
                            class134.field2342[var23] = class241.field4241.method1643(class238.method1626(new class237[] { class178.field3140, class14.method130(var32, (byte) 117), class46.field997, class14.method130(var33, (byte) 117) }, -65), (byte) 116);
                            class124.field2178[var23] = class241.field4241.method1643(class238.method1626(new class237[] { class6.field66, class14.method130(var32, (byte) 117), class46.field997, class14.method130(var33, (byte) 117) }, arg0 - 26737), (byte) 116);
                            var23++;
                        }
                    }
                }
            }
        }
        class128.method908((byte) 61, var16, var22, false, var17, var21, var15);
    }
}
