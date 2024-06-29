import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class143 extends class212 {

    @OriginalMember(owner = "client!oi", name = "ob", descriptor = "I")
    private int field2328 = 32768;

    @OriginalMember(owner = "client!oi", name = "ab", descriptor = "Lhd;")
    public static class214 field2314 = new class214(16);

    @OriginalMember(owner = "client!oi", name = "gb", descriptor = "Lsc;")
    public static class181 field2320 = class149.method967(255, " )2>");

    @OriginalMember(owner = "client!oi", name = "jb", descriptor = "Lo;")
    public static class175 field2323 = null;

    @OriginalMember(owner = "client!oi", name = "db", descriptor = "Lsc;")
    private static class181 field2317 = class149.method967(255, "wave:");

    @OriginalMember(owner = "client!oi", name = "lb", descriptor = "[I")
    public static int[] field2325 = new int[2];

    @OriginalMember(owner = "client!oi", name = "cb", descriptor = "Lsc;")
    public static class181 field2316 = field2317;

    @OriginalMember(owner = "client!oi", name = "pb", descriptor = "Lsc;")
    public static class181 field2329 = field2317;

    @OriginalMember(owner = "client!oi", name = "ib", descriptor = "Lsc;")
    private static class181 field2322 = class149.method967(255, "Drop");

    @OriginalMember(owner = "client!oi", name = "kb", descriptor = "Lsc;")
    public static class181 field2324 = field2322;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!oi", name = "bb", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!oi", name = "hb", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!oi", name = "nb", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!oi", name = "mb", descriptor = "Ltg;")
    public static class107 field2326;

    @OriginalMember(owner = "client!oi", name = "eb", descriptor = "Lvf;")
    public static class230 field2318;

    @OriginalMember(owner = "client!oi", name = "fb", descriptor = "[[B")
    public static byte[][] field2319;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static final void method919(int arg0) {
        class196.field3425 = null;
        class121.field1978 = null;
        ++field2313;
        class23.field410 = null;
        field2319 = null;
        class254.field4443 = null;
        class220.field3782 = null;
        if (arg0 != 16) {
            field2329 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILjb;)Lib;")
    public static final class259 method920(int arg0, int arg1, class11 arg2) {
        if (arg1 != 2) {
            field2314 = null;
        }
        ++field2312;
        byte[] var3 = arg2.method106(arg0, -26899);
        return var3 == null ? null : new class259(var3);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            field2316 = null;
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field3651 = ~arg0.method1516((byte) 82) == -2;
            }
        } else {
            this.field2328 = arg0.method1535(2) << 4;
        }
        ++field2311;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        if (!arg0) {
            method923((byte) 73);
        }
        class85.method575(114);
        ++field2327;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljb;Z)V")
    public static final void method921(class11 arg0, boolean arg1) {
        ++field2310;
        class170.field2861 = arg0.method107(class82.field1313, -20);
        if (!arg1) {
            field2325 = null;
        }
        class235.field4087 = arg0.method107(class176.field3092, -76);
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V")
    public static final void method922(byte arg0) {
        ++field2309;
        if (class142.field2287.toLowerCase().indexOf("microsoft") != -1) {
            class61.field939[220] = 74;
            class61.field939[221] = 43;
            class61.field939[223] = 28;
            class61.field939[189] = 26;
            class61.field939[190] = 72;
            class61.field939[192] = 58;
            class61.field939[219] = 42;
            class61.field939[186] = 57;
            class61.field939[188] = 71;
            class61.field939[187] = 27;
            class61.field939[191] = 73;
            class61.field939[222] = 59;
        } else {
            class61.field939[44] = 71;
            class61.field939[45] = 26;
            if (class142.field2298 != null) {
                class61.field939[222] = 58;
                class61.field939[192] = 28;
                class61.field939[520] = 59;
            } else {
                class61.field939[222] = 59;
                class61.field939[192] = 58;
            }
            class61.field939[61] = 27;
            class61.field939[47] = 73;
            class61.field939[92] = 74;
            class61.field939[46] = 72;
            class61.field939[59] = 57;
            class61.field939[93] = 43;
            class61.field939[91] = 42;
        }
        if (arg0 != 67) {
            method922((byte) -56);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 < 25) {
            field2321 = 26;
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int[] var4 = this.method1405(arg0, 1, 69);
            int[] var5 = this.method1405(arg0, 2, 13);
            for (int var6 = 0; ~var6 > ~class26.field452; ++var6) {
                int var7 = var5[var6] * this.field2328 >> 12;
                int var8 = 255 & var4[var6] >> 4;
                int var9 = class216.field3712[var8] * var7 >> 12;
                int var10 = class152.field2534[var8] * var7 >> 12;
                int var11 = (var10 >> 12) + arg0 & class4.field90;
                int var12 = (var9 >> 12) + var6 & class186.field3300;
                int[] var13 = this.method1405(var11, 0, 120);
                var3[var6] = var13[var12];
            }
        }
        ++field2315;
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(B)V")
    public static void method923(byte arg0) {
        field2322 = null;
        field2324 = null;
        field2323 = null;
        field2317 = null;
        field2318 = null;
        field2316 = null;
        field2329 = null;
        field2325 = null;
        field2326 = null;
        field2314 = null;
        field2319 = null;
        field2320 = null;
        if (arg0 != 71) {
            method923((byte) -79);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        ++field2308;
        int[][] var3 = super.field3645.method1352(arg0, -109);
        if (super.field3645.field3477) {
            int[] var4 = this.method1405(arg0, 1, 4);
            int[] var5 = this.method1405(arg0, 2, 31);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class26.field452 > var9; ++var9) {
                int var10 = (1045539 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field2328 >> 12;
                int var12 = class152.field2534[var10] * var11 >> 12;
                int var13 = class216.field3712[var10] * var11 >> 12;
                int var14 = var9 - -(var13 >> 12) & class186.field3300;
                int var15 = class4.field90 & (var12 >> 12) + arg0;
                int[][] var16 = this.method1410(var15, 0, (byte) -85);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg1 != 16383) {
            method923((byte) -6);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class143() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method924(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++class257.field4500;
        class128.field2125 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class52.field835; var12 < class26.field455; ++var12) {
            class220[][] var38 = class221.field3820[var12];
            for (int var39 = class19.field335; var39 < class152.field2535; ++var39) {
                for (int var40 = class76.field1234; var40 < class5.field96; ++var40) {
                    class220 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class184.field3272[var39 - class73.field1165 + class189.field3340][var40 - class114.field1855 + class189.field3340] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3790 = true;
                            var41.field3796 = true;
                            if (var41.field3806 > 0) {
                                var41.field3785 = true;
                            } else {
                                var41.field3785 = false;
                            }
                            ++class128.field2125;
                        } else {
                            var41.field3790 = false;
                            var41.field3796 = false;
                            var41.field3807 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3801 != null) {
                                    class75 var42 = var41.field3801;
                                    var42.field1203.method636(var42.field1207, var42.field1211, var42.field1211, 17855, var42.field1207);
                                    if (var42.field1212 != null) {
                                        var42.field1212.method636(var42.field1207, var42.field1211, var42.field1211, 17855, var42.field1207);
                                    }
                                }
                                if (var41.field3810 != null) {
                                    class106 var43 = var41.field3810;
                                    var43.field1735.method636(var43.field1722, var43.field1736, var43.field1736, 17855, var43.field1722);
                                    if (var43.field1726 != null) {
                                        var43.field1726.method636(var43.field1722, var43.field1736, var43.field1736, 17855, var43.field1722);
                                    }
                                }
                                if (var41.field3805 != null) {
                                    class164 var44 = var41.field3805;
                                    var44.field2795.method636(var44.field2792, var44.field2791, var44.field2791, 17855, var44.field2792);
                                }
                                if (var41.field3797 != null) {
                                    for (int var45 = 0; var45 < var41.field3806; ++var45) {
                                        class100 var46 = var41.field3797[var45];
                                        var46.field1681.method636(var46.field1688, var46.field1676, var46.field1672, 17855, var46.field1671);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class31.field505 == class253.field4418;
        for (int var14 = class52.field835; var14 < class26.field455; ++var14) {
            class220[][] var27 = class221.field3820[var14];
            for (int var28 = -class189.field3340; var28 <= 0; ++var28) {
                int var29 = class73.field1165 + var28;
                int var30 = class73.field1165 - var28;
                if (var29 >= class19.field335 || var30 < class152.field2535) {
                    for (int var31 = -class189.field3340; var31 <= 0; ++var31) {
                        int var32 = class114.field1855 + var31;
                        int var33 = class114.field1855 - var31;
                        if (var29 >= class19.field335) {
                            if (var32 >= class76.field1234) {
                                class220 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3790) {
                                    class58.method422(var34, true);
                                }
                            }
                            if (var33 < class5.field96) {
                                class220 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3790) {
                                    class58.method422(var35, true);
                                }
                            }
                        }
                        if (var30 < class152.field2535) {
                            if (var32 >= class76.field1234) {
                                class220 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3790) {
                                    class58.method422(var36, true);
                                }
                            }
                            if (var33 < class5.field96) {
                                class220 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3790) {
                                    class58.method422(var37, true);
                                }
                            }
                        }
                        if (class128.field2125 == 0) {
                            if (!var13) {
                                class149.field2499 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class52.field835; var15 < class26.field455; ++var15) {
            class220[][] var16 = class221.field3820[var15];
            for (int var17 = -class189.field3340; var17 <= 0; ++var17) {
                int var18 = class73.field1165 + var17;
                int var19 = class73.field1165 - var17;
                if (var18 >= class19.field335 || var19 < class152.field2535) {
                    for (int var20 = -class189.field3340; var20 <= 0; ++var20) {
                        int var21 = class114.field1855 + var20;
                        int var22 = class114.field1855 - var20;
                        if (var18 >= class19.field335) {
                            if (var21 >= class76.field1234) {
                                class220 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3790) {
                                    class58.method422(var23, false);
                                }
                            }
                            if (var22 < class5.field96) {
                                class220 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3790) {
                                    class58.method422(var24, false);
                                }
                            }
                        }
                        if (var19 < class152.field2535) {
                            if (var21 >= class76.field1234) {
                                class220 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3790) {
                                    class58.method422(var25, false);
                                }
                            }
                            if (var22 < class5.field96) {
                                class220 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3790) {
                                    class58.method422(var26, false);
                                }
                            }
                        }
                        if (class128.field2125 == 0) {
                            if (!var13) {
                                class149.field2499 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class149.field2499 = false;
    }
}
