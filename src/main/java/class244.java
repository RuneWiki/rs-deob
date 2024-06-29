import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class244 extends class273 {

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    private int field3844 = -1;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Lic;")
    public static class160 field3854 = new class160(64);

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field3858 = "Opened title screen";

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public static int field3860 = -8 + (int) (Math.random() * 17.0D);

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "[I")
    public int[] field3847;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "[I")
    public static int[] field3857;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[[I")
    public int[][] method3(int arg0, int arg1) {
        ++field3846;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (arg0 <= 122) {
            method1615(-84, (String) null, 54);
        }
        if (super.field4357.field4631 && this.method1622(0)) {
            int[] var4 = var3[0];
            int var5 = this.field3849 * (class67.field1129 == this.field3851 ? arg1 : this.field3851 * arg1 / class67.field1129);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class26.field458 != this.field3849) {
                for (int var8 = 0; ~class26.field458 < ~var8; ++var8) {
                    int var9 = this.field3849 * var8 / class26.field458;
                    int var10 = this.field3847[var5 + var9];
                    var7[var8] = class64.method498(4080, var10 << 4);
                    var6[var8] = class64.method498(var10, 65280) >> 4;
                    var4[var8] = class64.method498(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~class26.field458 < ~var11; ++var11) {
                    int var12 = this.field3847[var5++];
                    var7[var11] = class64.method498(4080, var12 << 4);
                    var6[var11] = class64.method498(4080, var12 >> 4);
                    var4[var11] = class64.method498(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class244() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private static final void method1615(int arg0, String arg1, int arg2) {
        ++field3853;
        class23 var3 = class91.method694(arg2, 3, arg0 + 3779);
        var3.method190(arg0 + 3845);
        if (arg0 != -3845) {
            field3857 = null;
        }
        var3.field354 = arg1;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)Z")
    public static final boolean method1616(int arg0) throws IOException {
        ++field3856;
        if (class23.field360 == null) {
            return false;
        } else {
            int var1 = class23.field360.method296(69);
            if (~var1 == -1) {
                return false;
            } else {
                if (~client.field4578 == 0) {
                    class23.field360.method303(-1, 1, class143.field2360.field2263, 0);
                    class143.field2360.field2231 = 0;
                    --var1;
                    client.field4578 = class143.field2360.method610(false);
                    class222.field3547 = class15.field240[client.field4578];
                }
                if (class222.field3547 == -1) {
                    if (~var1 >= -1) {
                        return false;
                    }
                    class23.field360.method303(-1, 1, class143.field2360.field2263, 0);
                    class222.field3547 = class143.field2360.field2263[0] & 255;
                    --var1;
                }
                if (class222.field3547 == -2) {
                    if (var1 <= 1) {
                        return false;
                    }
                    var1 -= 2;
                    class23.field360.method303(-1, 2, class143.field2360.field2263, 0);
                    class143.field2360.field2231 = 0;
                    class222.field3547 = class143.field2360.method996(65280);
                }
                if (class222.field3547 > var1) {
                    return false;
                } else {
                    class143.field2360.field2231 = 0;
                    class23.field360.method303(-1, class222.field3547, class143.field2360.field2263, 0);
                    class59.field1020 = 0;
                    class38.field649 = class26.field461;
                    class26.field461 = class52.field940;
                    class52.field940 = client.field4578;
                    if (client.field4578 == 187) {
                        int var2 = class143.field2360.method996(65280);
                        if (class195.method1333(91, var2)) {
                            class278.method1872((byte) 116);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 59) {
                        int var3 = class143.field2360.method1025((byte) 100);
                        int var4 = class143.field2360.method988(744911448);
                        int var5 = class143.field2360.method988(744911448);
                        if (class195.method1333(75, var5)) {
                            class106.method789(var3, (byte) -67, var4);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -1) {
                        int var6 = class143.field2360.method996(65280);
                        if (var6 == 65535) {
                            var6 = -1;
                        }
                        int var7 = class143.field2360.method1022(-51);
                        int var8 = class143.field2360.method1011((byte) 32);
                        if (class195.method1333(108, var8)) {
                            class22.method181(var7, false, var6, -1, 1);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -12) {
                        int var9 = class143.field2360.method986(-1909920360);
                        int var10 = class143.field2360.method1025((byte) 89);
                        if (class195.method1333(124, var10)) {
                            int var11 = 0;
                            if (class48.field878.field3439 != null) {
                                var11 = class48.field878.field3439.method654(-6);
                            }
                            class22.method181(var9, false, var11, -1, 3);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -121) {
                        int var12 = class143.field2360.method980(0);
                        class114 var13 = class8.method43(var12, (byte) 18);
                        for (int var14 = 0; var14 < var13.field1785.length; ++var14) {
                            var13.field1785[var14] = -1;
                            var13.field1785[var14] = 0;
                        }
                        class72.method556(0, var13);
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -167) {
                        class286.field4554 = class222.field3547 / 8;
                        for (int var15 = 0; ~class286.field4554 < ~var15; ++var15) {
                            class145.field2390[var15] = class143.field2360.method983(29834);
                            class154.field2513[var15] = class45.method392(class145.field2390[var15], true);
                            class294.field4666[var15] = false;
                        }
                        client.field4578 = -1;
                        class204.field3288 = class61.field1040;
                        return true;
                    } else if (~client.field4578 == -108) {
                        int var16 = class143.field2360.method1012(4);
                        int var17 = var16 >> 5;
                        int var18 = var16 & 31;
                        if (var18 == 0) {
                            class288.field4608[var17] = null;
                            client.field4578 = -1;
                            return true;
                        } else {
                            class179 var19 = new class179();
                            var19.field2981 = var18;
                            var19.field2981 = var16 & 63;
                            var19.field2969 = class143.field2360.method1012(4);
                            if (var19.field2969 >= 0 && ~var19.field2969 > ~class223.field3555.length) {
                                if (var19.field2981 != 1 && var19.field2981 != 10) {
                                    if (var19.field2981 >= 2 && ~var19.field2981 >= -7) {
                                        if (~var19.field2981 == -3) {
                                            var19.field2985 = 64;
                                            var19.field2988 = 64;
                                        }
                                        if (var19.field2981 == 3) {
                                            var19.field2988 = 0;
                                            var19.field2985 = 64;
                                        }
                                        if (var19.field2981 == 4) {
                                            var19.field2985 = 64;
                                            var19.field2988 = 128;
                                        }
                                        if (~var19.field2981 == -6) {
                                            var19.field2988 = 64;
                                            var19.field2985 = 0;
                                        }
                                        if (var19.field2981 == 6) {
                                            var19.field2985 = 128;
                                            var19.field2988 = 64;
                                        }
                                        var19.field2981 = 2;
                                        var19.field2983 = class143.field2360.method996(65280);
                                        var19.field2986 = class143.field2360.method996(65280);
                                        var19.field2993 = class143.field2360.method1012(4);
                                        var19.field2987 = class143.field2360.method996(65280);
                                    }
                                } else {
                                    var19.field2982 = class143.field2360.method996(65280);
                                    class143.field2360.field2231 += 5;
                                }
                                var19.field2973 = class143.field2360.method996(65280);
                                if (~var19.field2973 == -65536) {
                                    var19.field2973 = -1;
                                }
                                class288.field4608[var17] = var19;
                            }
                            client.field4578 = -1;
                            return true;
                        }
                    } else if (~client.field4578 == -67) {
                        class28.method255((byte) -1, class143.field2360.method1010(-123));
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -232) {
                        byte[] var20 = new byte[class222.field3547];
                        class143.field2360.method606(0, class222.field3547, (byte) -45, var20);
                        String var21 = class44.method382(class222.field3547, 0, var20, 255);
                        if (class207.field3327 != null || ~class78.field1306 != -4 && class78.field1300.startsWith("win") && !class217.field3480) {
                            class206.field3312 = true;
                            class176.field2944 = var21;
                            class160.field2598 = class205.field3294.method632(var21, (byte) -111);
                        } else {
                            class128.method934(true, var21, (byte) 22);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 38) {
                        int var22 = class143.field2360.method1011((byte) 81);
                        int var23 = class143.field2360.method1025((byte) 63);
                        int var24 = class143.field2360.method1015((byte) 121);
                        if (class195.method1333(89, var22)) {
                            if (var24 == 2) {
                                class116.method857(-126);
                            }
                            class223.field3558 = var23;
                            class76.method611(var23, -20470);
                            class190.method1313(false, 115);
                            class65.method504(class223.field3558, 149);
                            for (int var25 = 0; ~var25 > -101; ++var25) {
                                class118.field1991[var25] = true;
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -47) {
                        int var26 = class143.field2360.method988(744911448);
                        int var27 = class143.field2360.method1015((byte) -103);
                        class57.method453(var26, var27, 0);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 15) {
                        if (class223.field3558 != -1) {
                            class165.method1196(0, class223.field3558, (byte) 97);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -241) {
                        class149.field2449 = class143.field2360.method1015((byte) 120);
                        class165.field2735 = class143.field2360.method1012(4);
                        for (int var28 = class149.field2449; class149.field2449 + 8 > var28; ++var28) {
                            for (int var30 = class165.field2735; class165.field2735 - -8 > var30; ++var30) {
                                if (class2.field23[class92.field1448][var28][var30] != null) {
                                    class2.field23[class92.field1448][var28][var30] = null;
                                    class269.method1833(var28, 25049, var30);
                                }
                            }
                        }
                        for (class110 var29 = (class110) class189.field3082.method1807(-117); var29 != null; var29 = (class110) class189.field3082.method1808((byte) 115)) {
                            if (var29.field1688 >= class149.field2449 && ~var29.field1688 > ~(class149.field2449 + 8) && class165.field2735 <= var29.field1705 && var29.field1705 < class165.field2735 + 8 && ~class92.field1448 == ~var29.field1700) {
                                var29.field1698 = 0;
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 251) {
                        int var31 = class143.field2360.method996(65280);
                        String var32 = class143.field2360.method1010(-122);
                        Object[] var33 = new Object[1 + var32.length()];
                        for (int var34 = var32.length() + -1; ~var34 <= -1; --var34) {
                            if (~var32.charAt(var34) != -116) {
                                var33[var34 + 1] = new Integer(class143.field2360.method1022(92));
                            } else {
                                var33[var34 + 1] = class143.field2360.method1010(-117);
                            }
                        }
                        var33[0] = new Integer(class143.field2360.method1022(81));
                        if (class195.method1333(67, var31)) {
                            class196 var35 = new class196();
                            var35.field3205 = var33;
                            class129.method938(104, var35);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -19) {
                        int var36 = class143.field2360.method986(-1909920360);
                        class185.field3040 = class205.field3294.method629(var36, 102);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 250) {
                        String var37 = class143.field2360.method1010(-112);
                        int var38 = class143.field2360.method989(255);
                        int var39 = class143.field2360.method1011((byte) 117);
                        if (class195.method1333(56, var39)) {
                            method1615(-3845, var37, var38);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 47) {
                        int var40 = class143.field2360.method1012(4);
                        int var41 = var40 >> 2;
                        int var42 = 3 & var40;
                        int var43 = class260.field4139[var41];
                        int var44 = class143.field2360.method980(0);
                        int var45 = var44 >> 28 & 3;
                        int var46 = var44 & 16383;
                        int var47 = class143.field2360.method1025((byte) 86);
                        int var48 = var46 - class170.field2787;
                        if (~var47 == -65536) {
                            var47 = -1;
                        }
                        int var49 = (var44 & 268432336) >> 14;
                        int var50 = var49 - class256.field4082;
                        class282.method1895(var47, var43, var48, var42, var45, var50, var41, -86);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 172) {
                        if (~class222.field3547 != -1) {
                            class139.field2328 = class143.field2360.method1010(-94);
                        } else {
                            class139.field2328 = class201.field3275;
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -122) {
                        int var51 = class143.field2360.method1011((byte) 89);
                        class12.method79(var51, 5);
                        class32.field538[class64.method498(31, class216.field3465++)] = class64.method498(32767, var51);
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -49) {
                        class149.field2449 = class143.field2360.method1003(-128);
                        class165.field2735 = class143.field2360.method1003(-128);
                        while (class222.field3547 > class143.field2360.field2231) {
                            client.field4578 = class143.field2360.method1012(4);
                            class144.method1065(18132);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -85) {
                        byte var52 = class143.field2360.method993((byte) 18);
                        int var53 = class143.field2360.method988(744911448);
                        class61.method469(var53, (byte) 118, var52);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 116) {
                        class187.field3072 = class143.field2360.method1012(4);
                        class208.field3345 = class143.field2360.method1012(4);
                        class9.field114 = class143.field2360.method1012(4);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 132) {
                        long var54 = class143.field2360.method983(29834);
                        int var56 = class143.field2360.method996(65280);
                        int var57 = class143.field2360.method1012(4);
                        String var58 = "";
                        if (~var56 < -1) {
                            var58 = class143.field2360.method1010(-100);
                        }
                        boolean var59 = true;
                        if (~var54 > -1L) {
                            var59 = false;
                            var54 &= Long.MAX_VALUE;
                        }
                        String var60 = class66.method506((byte) 20, var54);
                        for (int var61 = 0; ~class45.field820 < ~var61; ++var61) {
                            if (class159.field2570[var61] == var54) {
                                if (class200.field3263[var61] != var56) {
                                    class200.field3263[var61] = var56;
                                    if (~var56 < -1) {
                                        class106.method787(var60 + class240.field3788, "", 5, true);
                                    }
                                    if (~var56 == -1) {
                                        class106.method787(var60 + class36.field621, "", 5, true);
                                    }
                                }
                                var60 = null;
                                class248.field3932[var61] = var58;
                                class277.field4401[var61] = var57;
                                class297.field4703[var61] = var59;
                                break;
                            }
                        }
                        boolean var62 = false;
                        if (var60 != null && ~class45.field820 > -201) {
                            class159.field2570[class45.field820] = var54;
                            class35.field603[class45.field820] = var60;
                            class200.field3263[class45.field820] = var56;
                            class248.field3932[class45.field820] = var58;
                            class277.field4401[class45.field820] = var57;
                            class297.field4703[class45.field820] = var59;
                            ++class45.field820;
                        }
                        int var63 = class45.field820;
                        class204.field3288 = class61.field1040;
                        while (var63 > 0) {
                            --var63;
                            boolean var64 = true;
                            for (int var65 = 0; var63 > var65; ++var65) {
                                if (class200.field3263[var65] != class295.field4680 && class200.field3263[var65 + 1] == class295.field4680 || class200.field3263[var65] == 0 && class200.field3263[var65 - -1] != 0) {
                                    var64 = false;
                                    int var66 = class200.field3263[var65];
                                    class200.field3263[var65] = class200.field3263[var65 + 1];
                                    class200.field3263[var65 + 1] = var66;
                                    String var67 = class248.field3932[var65];
                                    class248.field3932[var65] = class248.field3932[var65 + 1];
                                    class248.field3932[var65 + 1] = var67;
                                    String var68 = class35.field603[var65];
                                    class35.field603[var65] = class35.field603[var65 + 1];
                                    class35.field603[var65 + 1] = var68;
                                    long var69 = class159.field2570[var65];
                                    class159.field2570[var65] = class159.field2570[var65 + 1];
                                    class159.field2570[var65 + 1] = var69;
                                    int var71 = class277.field4401[var65];
                                    class277.field4401[var65] = class277.field4401[var65 - -1];
                                    class277.field4401[var65 + 1] = var71;
                                    boolean var72 = class297.field4703[var65];
                                    class297.field4703[var65] = class297.field4703[var65 + 1];
                                    class297.field4703[var65 + 1] = var72;
                                }
                            }
                            if (var64) {
                                break;
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 16) {
                        int var73 = class143.field2360.method1022(122);
                        int var74 = class143.field2360.method996(65280);
                        if (var73 < -70000) {
                            var74 += 32768;
                        }
                        class114 var75;
                        if (var73 >= 0) {
                            var75 = class8.method43(var73, (byte) -115);
                        } else {
                            var75 = null;
                        }
                        while (~class143.field2360.field2231 > ~class222.field3547) {
                            int var76 = class143.field2360.method1004(122);
                            int var77 = class143.field2360.method996(65280);
                            int var78 = 0;
                            if (var77 != 0) {
                                var78 = class143.field2360.method1012(4);
                                if (~var78 == -256) {
                                    var78 = class143.field2360.method1022(91);
                                }
                            }
                            if (var75 != null && var76 >= 0 && var76 < var75.field1785.length) {
                                var75.field1785[var76] = var77;
                                var75.field1777[var76] = var78;
                            }
                            class183.method1277(var77 + -1, (byte) -46, var74, var78, var76);
                        }
                        if (var75 != null) {
                            class72.method556(0, var75);
                        }
                        class249.method1664(false);
                        class32.field538[class64.method498(31, class216.field3465++)] = class64.method498(32767, var74);
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -72) {
                        int var79 = class143.field2360.method996(65280);
                        int var80 = class143.field2360.method1012(4);
                        int var81 = class143.field2360.method996(65280);
                        if (var79 == 65535) {
                            var79 = -1;
                        }
                        int var82 = class143.field2360.method1012(4);
                        class106.method788(var79, var81, var82, (byte) -74, var80);
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -149) {
                        class52.field941 = class61.field1040;
                        long var83 = class143.field2360.method983(29834);
                        if (var83 == 0L) {
                            class127.field2103 = null;
                            class290.field4618 = null;
                            class32.field541 = 0;
                            class13.field173 = null;
                            client.field4578 = -1;
                            return true;
                        } else {
                            long var85 = class143.field2360.method983(29834);
                            class13.field173 = class296.method1985(var85, 3026);
                            class127.field2103 = class296.method1985(var83, 3026);
                            class77.field1275 = class143.field2360.method981(false);
                            int var87 = class143.field2360.method1012(4);
                            if (~var87 == -256) {
                                client.field4578 = -1;
                                return true;
                            } else {
                                class108[] var88 = new class108[100];
                                class32.field541 = var87;
                                for (int var89 = 0; class32.field541 > var89; ++var89) {
                                    var88[var89] = new class108();
                                    var88[var89].field2406 = class143.field2360.method983(29834);
                                    var88[var89].field1642 = class296.method1985(var88[var89].field2406, 3026);
                                    var88[var89].field1645 = class143.field2360.method996(65280);
                                    var88[var89].field1641 = class143.field2360.method981(false);
                                    var88[var89].field1640 = class143.field2360.method1010(-121);
                                    if (class12.field162 == var88[var89].field2406) {
                                        class58.field1006 = var88[var89].field1641;
                                    }
                                }
                                boolean var90 = false;
                                int var91 = class32.field541;
                                while (~var91 < -1) {
                                    boolean var92 = true;
                                    --var91;
                                    for (int var93 = 0; var93 < var91; ++var93) {
                                        if (~var88[var93].field1642.compareTo(var88[var93 + 1].field1642) < -1) {
                                            class108 var94 = var88[var93];
                                            var88[var93] = var88[var93 + 1];
                                            var92 = false;
                                            var88[var93 + 1] = var94;
                                        }
                                    }
                                    if (var92) {
                                        break;
                                    }
                                }
                                client.field4578 = -1;
                                class290.field4618 = var88;
                                return true;
                            }
                        }
                    } else if (client.field4578 == 70) {
                        int var95 = class143.field2360.method996(65280);
                        int var96 = class143.field2360.method1022(-66);
                        if (class195.method1333(67, var95)) {
                            class167 var97 = (class167) class91.field1434.method1063((byte) -70, (long) var96);
                            if (var97 != null) {
                                class164.method1184((byte) 66, true, var97);
                            }
                            if (class295.field4677 != null) {
                                class72.method556(0, class295.field4677);
                                class295.field4677 = null;
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -248) {
                        int var98 = class143.field2360.method980(0);
                        int var99 = class143.field2360.method1022(-97);
                        int var100 = class143.field2360.method996(65280);
                        if (class195.method1333(58, var100)) {
                            class167 var101 = (class167) class91.field1434.method1063((byte) -78, (long) var98);
                            class167 var102 = (class167) class91.field1434.method1063((byte) -58, (long) var99);
                            if (var102 != null) {
                                class164.method1184((byte) 66, var101 == null || var101.field2756 != var102.field2756, var102);
                            }
                            if (var101 != null) {
                                var101.method1074((byte) -123);
                                class91.field1434.method1064(var101, (long) var99, (byte) -127);
                            }
                            class114 var103 = class8.method43(var98, (byte) 52);
                            if (var103 != null) {
                                class72.method556(0, var103);
                            }
                            class114 var104 = class8.method43(var99, (byte) 65);
                            if (var104 != null) {
                                class72.method556(0, var104);
                                class42.method370(true, (byte) -54, var104);
                            }
                            if (class223.field3558 != -1) {
                                class165.method1196(1, class223.field3558, (byte) -98);
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -206) {
                        class31.method270(31377);
                        client.field4578 = -1;
                        return false;
                    } else if (~client.field4578 == -126) {
                        int var105 = class143.field2360.method996(65280);
                        int var106 = class143.field2360.method996(65280);
                        int var107 = class143.field2360.method986(-1909920360);
                        int var108 = class143.field2360.method988(744911448);
                        if (~(var107 >> 30) == -1) {
                            if (var107 >> 29 != 0) {
                                int var109 = var107 & 65535;
                                class139 var110 = class3.field45[var109];
                                if (var110 != null) {
                                    if (var108 == 65535) {
                                        var108 = -1;
                                    }
                                    boolean var111 = true;
                                    if (var108 != -1 && var110.field2817 != -1) {
                                        if (~var110.field2817 == ~var108) {
                                            class281 var112 = class35.method298(var108, false);
                                            if (var112.field4459 && var112.field4455 != -1) {
                                                class77 var113 = class28.method246(-55, var112.field4455);
                                                int var114 = var113.field1270;
                                                if (var114 == 1) {
                                                    var111 = false;
                                                    var110.field2812 = 0;
                                                    var110.field2823 = 1;
                                                    var110.field2897 = 0;
                                                    var110.field2856 = class207.field3336 - -var105;
                                                    var110.field2899 = 0;
                                                    class124.method916(var110.field2887, var110.field2849, 477628496, false, var113, var110.field2812);
                                                } else if (~var114 == -3) {
                                                    var111 = false;
                                                    var110.field2888 = 0;
                                                }
                                            }
                                        } else {
                                            class281 var115 = class35.method298(var108, false);
                                            class281 var116 = class35.method298(var110.field2817, false);
                                            if (var115.field4455 != -1 && ~var116.field4455 != 0) {
                                                class77 var117 = class28.method246(-127, var115.field4455);
                                                class77 var118 = class28.method246(-66, var116.field4455);
                                                if (~var118.field1257 < ~var117.field1257) {
                                                    var111 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var111) {
                                        var110.field2897 = 0;
                                        var110.field2817 = var108;
                                        var110.field2807 = var106;
                                        var110.field2812 = 0;
                                        var110.field2823 = 1;
                                        var110.field2856 = class207.field3336 + var105;
                                        if (~var110.field2856 < ~class207.field3336) {
                                            var110.field2812 = -1;
                                        }
                                        if (~var110.field2817 != 0 && ~class207.field3336 == ~var110.field2856) {
                                            int var119 = class35.method298(var110.field2817, false).field4455;
                                            if (var119 != -1) {
                                                class77 var120 = class28.method246(-25, var119);
                                                if (var120 != null && var120.field1256 != null) {
                                                    class124.method916(var110.field2887, var110.field2849, 477628496, false, var120, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~(var107 >> 28) != -1) {
                                int var121 = 65535 & var107;
                                class213 var122;
                                if (class288.field4607 == var121) {
                                    var122 = class48.field878;
                                } else {
                                    var122 = class191.field3129[var121];
                                }
                                if (var122 != null) {
                                    if (~var108 == -65536) {
                                        var108 = -1;
                                    }
                                    boolean var123 = true;
                                    if (var108 != -1 && var122.field2817 != -1) {
                                        if (var122.field2817 == var108) {
                                            class281 var124 = class35.method298(var108, false);
                                            if (var124.field4459 && var124.field4455 != -1) {
                                                class77 var125 = class28.method246(-52, var124.field4455);
                                                int var126 = var125.field1270;
                                                if (var126 != 1) {
                                                    if (var126 == 2) {
                                                        var122.field2888 = 0;
                                                        var123 = false;
                                                    }
                                                } else {
                                                    var123 = false;
                                                    var122.field2823 = 1;
                                                    var122.field2899 = 0;
                                                    var122.field2856 = class207.field3336 + var105;
                                                    var122.field2812 = 0;
                                                    var122.field2897 = 0;
                                                    class124.method916(var122.field2887, var122.field2849, 477628496, false, var125, var122.field2812);
                                                }
                                            }
                                        } else {
                                            class281 var127 = class35.method298(var108, false);
                                            class281 var128 = class35.method298(var122.field2817, false);
                                            if (~var127.field4455 != 0 && ~var128.field4455 != 0) {
                                                class77 var129 = class28.method246(83, var127.field4455);
                                                class77 var130 = class28.method246(73, var128.field4455);
                                                if (~var130.field1257 < ~var129.field1257) {
                                                    var123 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var123) {
                                        var122.field2807 = var106;
                                        var122.field2897 = 0;
                                        var122.field2823 = 1;
                                        var122.field2812 = 0;
                                        var122.field2856 = class207.field3336 - -var105;
                                        var122.field2817 = var108;
                                        if (~var122.field2856 < ~class207.field3336) {
                                            var122.field2812 = -1;
                                        }
                                        if (~var122.field2817 == -65536) {
                                            var122.field2817 = -1;
                                        }
                                        if (~var122.field2817 != 0 && class207.field3336 == var122.field2856) {
                                            int var131 = class35.method298(var122.field2817, false).field4455;
                                            if (var131 != -1) {
                                                class77 var132 = class28.method246(69, var131);
                                                if (var132 != null && var132.field1256 != null) {
                                                    class124.method916(var122.field2887, var122.field2849, 477628496, class48.field878 == var122, var132, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var133 = 3 & var107 >> 28;
                            int var134 = (16383 & var107 >> 14) + -class256.field4082;
                            int var135 = (var107 & 16383) + -class170.field2787;
                            if (var134 >= 0 && ~var135 <= -1 && var134 < 104 && var135 < 104) {
                                int var136 = var134 * 128 + 64;
                                int var137 = var135 * 128 + 64;
                                class50 var138 = new class50(var108, var133, var136, var137, -var106 + class218.method1450(var137, var136, true, var133), var105, class207.field3336);
                                class229.field3655.method1809(5, new class197(var138));
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 64) {
                        class246.method1634(class205.field3294, class143.field2360, (byte) -122, class222.field3547);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 236) {
                        long var139 = class143.field2360.method983(29834);
                        long var141 = (long) class143.field2360.method996(65280);
                        long var143 = (long) class143.field2360.method1009(126);
                        int var145 = class143.field2360.method1012(4);
                        long var146 = (var141 << 32) - -var143;
                        boolean var148 = false;
                        int var149 = 0;
                        label1339: while (true) {
                            if (~var149 <= -101) {
                                if (~var145 >= -2) {
                                    if ((!class116.field1945 || class228.field3642) && !class189.field3090) {
                                        for (int var150 = 0; ~var150 > ~class286.field4554; ++var150) {
                                            if (class145.field2390[var150] == var139) {
                                                var148 = true;
                                                break label1339;
                                            }
                                        }
                                    } else {
                                        var148 = true;
                                    }
                                }
                                break;
                            }
                            if (class149.field2448[var149] == var146) {
                                var148 = true;
                                break;
                            }
                            ++var149;
                        }
                        if (!var148 && class200.field3264 == 0) {
                            class149.field2448[class294.field4672] = var146;
                            class294.field4672 = (class294.field4672 + 1) % 100;
                            String var151 = class73.method566(class100.method748(class102.method759(class143.field2360, (byte) 86), -8924));
                            if (var145 != 2 && ~var145 != -4) {
                                if (~var145 != -2) {
                                    class106.method787(var151, class66.method506((byte) 20, var139), 3, true);
                                } else {
                                    class106.method787(var151, "<img=0>" + class66.method506((byte) 20, var139), 7, true);
                                }
                            } else {
                                class106.method787(var151, "<img=1>" + class66.method506((byte) 20, var139), 7, true);
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 114) {
                        int var152 = class143.field2360.method1025((byte) 90);
                        int var153 = class143.field2360.method996(65280);
                        if (var152 == 65535) {
                            var152 = -1;
                        }
                        int var154 = class143.field2360.method986(-1909920360);
                        if (class195.method1333(58, var153)) {
                            class22.method181(var154, false, var152, -1, 2);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -160) {
                        class249.method1664(false);
                        int var155 = class143.field2360.method1003(-128);
                        int var156 = class143.field2360.method1022(-85);
                        int var157 = class143.field2360.method976((byte) -128);
                        class256.field4076[var155] = var156;
                        class153.field2494[var155] = var157;
                        class242.field3837[var155] = 1;
                        for (int var158 = 0; var158 < 98; ++var158) {
                            if (~class212.field3394[var158] >= ~var156) {
                                class242.field3837[var155] = var158 - -2;
                            }
                        }
                        class169.field2760[class64.method498(class199.field3237++, 31)] = var155;
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 30) {
                        int var159 = class143.field2360.method1025((byte) 99);
                        int var160 = class143.field2360.method988(744911448);
                        String var161 = class143.field2360.method1010(-113);
                        if (class195.method1333(118, var159)) {
                            class241.method1591((byte) -53, var161, var160);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 200) {
                        class249.method1664(false);
                        class142.field2356 = class143.field2360.method1012(4);
                        client.field4578 = -1;
                        class263.field4167 = class61.field1040;
                        return true;
                    } else if (client.field4578 == 4) {
                        int var162 = class143.field2360.method1025((byte) 45);
                        int var163 = class143.field2360.method975(24724);
                        int var164 = class143.field2360.method978(4920);
                        int var165 = class143.field2360.method980(0);
                        if (class195.method1333(65, var162)) {
                            class141.method1055(var164, var163, 11, var165);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 221) {
                        for (int var166 = 0; var166 < class191.field3129.length; ++var166) {
                            if (class191.field3129[var166] != null) {
                                class191.field3129[var166].field2816 = -1;
                            }
                        }
                        for (int var167 = 0; var167 < class3.field45.length; ++var167) {
                            if (class3.field45[var167] != null) {
                                class3.field45[var167].field2816 = -1;
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -200) {
                        class65.method501(false, 0);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 248) {
                        int var168 = class143.field2360.method988(744911448);
                        int var169 = class143.field2360.method989(255);
                        int var170 = class143.field2360.method996(65280);
                        int var171 = class143.field2360.method996(65280);
                        if (class195.method1333(91, var170)) {
                            class36.method311((var171 << 16) + var168, var169, 13);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 54) {
                        int var172 = class143.field2360.method1025((byte) 83);
                        int var173 = class143.field2360.method1025((byte) 72);
                        byte var174 = class143.field2360.method1007(false);
                        if (class195.method1333(107, var173)) {
                            class289.method1943(var172, true, var174);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 214) {
                        int var175 = class143.field2360.method996(65280);
                        if (class195.method1333(124, var175)) {
                            class5.method26((byte) 74);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 195) {
                        int var176 = class143.field2360.method1015((byte) -57);
                        int var177 = class143.field2360.method988(744911448);
                        if (~var177 == -65536) {
                            var177 = -1;
                        }
                        class297.method1987(var177, var176, -1599927416);
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -138) {
                        int var178 = class143.field2360.method996(65280);
                        if (~var178 == -65536) {
                            var178 = -1;
                        }
                        int var179 = class143.field2360.method1003(-128);
                        int var180 = class143.field2360.method1009(88);
                        class294.method1977(var178, var180, 905962088, var179);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 52) {
                        class18.field263 = 30 * class143.field2360.method1025((byte) 73);
                        class263.field4167 = class61.field1040;
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -73) {
                        class249.method1664(false);
                        class113.field1736 = class143.field2360.method1027((byte) 64);
                        class263.field4167 = class61.field1040;
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 19) {
                        int var181 = class143.field2360.method1003(-128);
                        int var182 = class143.field2360.method1003(-128);
                        int var183 = class143.field2360.method1003(-128);
                        class92.field1448 = var182 >> 1;
                        class48.field878.method1409(var183, (byte) 54, ~(1 & var182) == -2, var181);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 129) {
                        class143.field2360.field2231 += 28;
                        if (class143.field2360.method974(true)) {
                            class254.method1691(class143.field2360.field2231 + -28, class143.field2360, (byte) 71);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 245) {
                        int var184 = class143.field2360.method1022(-102);
                        int var185 = class143.field2360.method1011((byte) 22);
                        int var186 = class143.field2360.method980(0);
                        if (var185 == 65535) {
                            var185 = -1;
                        }
                        int var187 = class143.field2360.method996(65280);
                        if (~var187 == -65536) {
                            var187 = -1;
                        }
                        int var188 = class143.field2360.method1025((byte) 68);
                        if (class195.method1333(96, var188)) {
                            for (int var189 = var187; ~var185 <= ~var189; ++var189) {
                                long var190 = ((long) var186 << 32) + (long) var189;
                                class253 var192 = (class253) class67.field1137.method1063((byte) -60, var190);
                                class253 var193;
                                if (var192 != null) {
                                    var193 = new class253(var184, var192.field4037);
                                    var192.method1074((byte) 14);
                                } else if (var189 != -1) {
                                    var193 = new class253(var184, -1);
                                } else {
                                    var193 = new class253(var184, class8.method43(var186, (byte) 78).field1751.field4037);
                                }
                                class67.field1137.method1064(var193, var190, (byte) -123);
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -88) {
                        String var194 = class143.field2360.method1010(-104);
                        if (var194.endsWith(":tradereq:")) {
                            String var195 = var194.substring(0, var194.indexOf(":"));
                            long var196 = class260.method1739(false, var195);
                            boolean var198 = false;
                            for (int var199 = 0; ~class286.field4554 < ~var199; ++var199) {
                                if (~class145.field2390[var199] == ~var196) {
                                    var198 = true;
                                    break;
                                }
                            }
                            if (!var198 && ~class200.field3264 == -1) {
                                class106.method787(class207.field3332, var195, 4, true);
                            }
                        } else if (!var194.endsWith(":chalreq:")) {
                            if (var194.endsWith(":assistreq:")) {
                                String var200 = var194.substring(0, var194.indexOf(":"));
                                long var201 = class260.method1739(false, var200);
                                boolean var203 = false;
                                for (int var204 = 0; ~var204 > ~class286.field4554; ++var204) {
                                    if (~class145.field2390[var204] == ~var201) {
                                        var203 = true;
                                        break;
                                    }
                                }
                                if (!var203 && class200.field3264 == 0) {
                                    class106.method787("", var200, 10, true);
                                }
                            } else if (!var194.endsWith(":clan:")) {
                                if (!var194.endsWith(":trade:")) {
                                    if (!var194.endsWith(":assist:")) {
                                        if (var194.endsWith(":duelstake:")) {
                                            String var205 = var194.substring(0, var194.indexOf(":"));
                                            long var206 = class260.method1739(false, var205);
                                            boolean var208 = false;
                                            for (int var209 = 0; ~var209 > ~class286.field4554; ++var209) {
                                                if (class145.field2390[var209] == var206) {
                                                    var208 = true;
                                                    break;
                                                }
                                            }
                                            if (!var208 && ~class200.field3264 == -1) {
                                                class106.method787("", var205, 14, true);
                                            }
                                        } else if (!var194.endsWith(":duelfriend:")) {
                                            if (!var194.endsWith(":clanreq:")) {
                                                if (var194.endsWith(":allyreq:")) {
                                                    String var210 = var194.substring(0, var194.indexOf(":"));
                                                    long var211 = class260.method1739(false, var210);
                                                    boolean var213 = false;
                                                    for (int var214 = 0; var214 < class286.field4554; ++var214) {
                                                        if (class145.field2390[var214] == var211) {
                                                            var213 = true;
                                                            break;
                                                        }
                                                    }
                                                    if (!var213 && ~class200.field3264 == -1) {
                                                        String var215 = var194.substring(1 + var194.indexOf(":"), var194.length() - 9);
                                                        class106.method787(var215, var210, 21, true);
                                                    }
                                                } else {
                                                    class106.method787(var194, "", 0, true);
                                                }
                                            } else {
                                                boolean var216 = false;
                                                String var217 = var194.substring(0, var194.indexOf(":"));
                                                long var218 = class260.method1739(false, var217);
                                                for (int var220 = 0; ~var220 > ~class286.field4554; ++var220) {
                                                    if (class145.field2390[var220] == var218) {
                                                        var216 = true;
                                                        break;
                                                    }
                                                }
                                                if (!var216 && ~class200.field3264 == -1) {
                                                    class106.method787("", var217, 16, true);
                                                }
                                            }
                                        } else {
                                            String var221 = var194.substring(0, var194.indexOf(":"));
                                            long var222 = class260.method1739(false, var221);
                                            boolean var224 = false;
                                            for (int var225 = 0; ~var225 > ~class286.field4554; ++var225) {
                                                if (~class145.field2390[var225] == ~var222) {
                                                    var224 = true;
                                                    break;
                                                }
                                            }
                                            if (!var224 && class200.field3264 == 0) {
                                                class106.method787("", var221, 15, true);
                                            }
                                        }
                                    } else {
                                        String var226 = var194.substring(0, var194.indexOf(":assist:"));
                                        if (~class200.field3264 == -1) {
                                            class106.method787(var226, "", 13, true);
                                        }
                                    }
                                } else {
                                    String var227 = var194.substring(0, var194.indexOf(":trade:"));
                                    if (class200.field3264 == 0) {
                                        class106.method787(var227, "", 12, true);
                                    }
                                }
                            } else {
                                String var228 = var194.substring(0, var194.indexOf(":clan:"));
                                class106.method787(var228, "", 11, true);
                            }
                        } else {
                            String var229 = var194.substring(0, var194.indexOf(":"));
                            long var230 = class260.method1739(false, var229);
                            boolean var232 = false;
                            for (int var233 = 0; ~class286.field4554 < ~var233; ++var233) {
                                if (class145.field2390[var233] == var230) {
                                    var232 = true;
                                    break;
                                }
                            }
                            if (!var232 && class200.field3264 == 0) {
                                String var234 = var194.substring(var194.indexOf(":") + 1, -9 + var194.length());
                                class106.method787(var234, var229, 8, true);
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 77) {
                        class174.method1247(false);
                        class249.method1664(false);
                        client.field4578 = -1;
                        class36.field612 += 32;
                        return true;
                    } else if (client.field4578 == 226) {
                        int var235 = class143.field2360.method1025((byte) 90);
                        int var236 = class143.field2360.method1022(-90);
                        int var237 = class143.field2360.method1025((byte) 120);
                        int var238 = class143.field2360.method1011((byte) 42);
                        int var239 = class143.field2360.method996(65280);
                        if (~var238 == -65536) {
                            var238 = -1;
                        }
                        if (~var237 == -65536) {
                            var237 = -1;
                        }
                        if (class195.method1333(61, var239)) {
                            for (int var240 = var238; var240 <= var237; ++var240) {
                                long var241 = ((long) var236 << 32) + (long) var240;
                                class253 var243 = (class253) class67.field1137.method1063((byte) -125, var241);
                                class253 var244;
                                if (var243 != null) {
                                    var244 = new class253(var243.field4028, var235);
                                    var243.method1074((byte) 61);
                                } else if (var240 != -1) {
                                    var244 = new class253(0, var235);
                                } else {
                                    var244 = new class253(class8.method43(var236, (byte) -98).field1751.field4028, var235);
                                }
                                class67.field1137.method1064(var244, var241, (byte) -128);
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 209) {
                        class151.field2474 = class143.field2360.method1012(4);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 180) {
                        int var245 = class143.field2360.method1022(-123);
                        int var246 = class143.field2360.method996(65280);
                        if (~var245 > 69999) {
                            var246 += 32768;
                        }
                        class114 var247;
                        if (~var245 <= -1) {
                            var247 = class8.method43(var245, (byte) -88);
                        } else {
                            var247 = null;
                        }
                        if (var247 != null) {
                            for (int var248 = 0; var247.field1785.length > var248; ++var248) {
                                var247.field1785[var248] = 0;
                                var247.field1777[var248] = 0;
                            }
                        }
                        class4.method20(var246, (byte) 118);
                        int var249 = class143.field2360.method996(65280);
                        for (int var250 = 0; ~var249 < ~var250; ++var250) {
                            int var251 = class143.field2360.method1012(4);
                            if (~var251 == -256) {
                                var251 = class143.field2360.method1022(-72);
                            }
                            int var252 = class143.field2360.method988(744911448);
                            if (var247 != null && var247.field1785.length > var250) {
                                var247.field1785[var250] = var252;
                                var247.field1777[var250] = var251;
                            }
                            class183.method1277(var252 - 1, (byte) -46, var246, var251, var250);
                        }
                        if (var247 != null) {
                            class72.method556(0, var247);
                        }
                        class249.method1664(false);
                        class32.field538[class64.method498(31, class216.field3465++)] = class64.method498(var246, 32767);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 128) {
                        class250.method1667((byte) 105);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 217) {
                        int var253 = class143.field2360.method1011((byte) 77);
                        int var254 = class143.field2360.method986(-1909920360);
                        class57.method453(var253, var254, 0);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 9) {
                        class200.field3265 = class143.field2360.method1012(4);
                        class204.field3288 = class61.field1040;
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -11) {
                        int var255 = class143.field2360.method1025((byte) 56);
                        int var256 = class143.field2360.method1011((byte) 43);
                        int var257 = class143.field2360.method980(0);
                        int var258 = class143.field2360.method996(65280);
                        int var259 = class143.field2360.method996(65280);
                        if (class195.method1333(106, var255)) {
                            class22.method181(var257, false, var258 << 16 | var259, var256, 7);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -242) {
                        int var260 = class143.field2360.method1003(-128);
                        int var261 = class143.field2360.method996(65280);
                        if (class195.method1333(64, var261)) {
                            class134.field2220 = var260;
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 86) {
                        int var262 = class143.field2360.method1011((byte) 88);
                        int var263 = class143.field2360.method986(-1909920360);
                        class61.method469(var262, (byte) 113, var263);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 207) {
                        long var264 = class143.field2360.method983(29834);
                        class143.field2360.method981(false);
                        long var266 = class143.field2360.method983(29834);
                        boolean var268 = false;
                        long var269 = (long) class143.field2360.method996(65280);
                        long var271 = (long) class143.field2360.method1009(91);
                        int var273 = class143.field2360.method1012(4);
                        long var274 = (var269 << 32) - -var271;
                        int var276 = 0;
                        label1472: while (true) {
                            if (var276 >= 100) {
                                if (~var273 >= -2) {
                                    if ((!class116.field1945 || class228.field3642) && !class189.field3090) {
                                        for (int var277 = 0; var277 < class286.field4554; ++var277) {
                                            if (class145.field2390[var277] == var264) {
                                                var268 = true;
                                                break label1472;
                                            }
                                        }
                                    } else {
                                        var268 = true;
                                    }
                                }
                                break;
                            }
                            if (class149.field2448[var276] == var274) {
                                var268 = true;
                                break;
                            }
                            ++var276;
                        }
                        if (!var268 && class200.field3264 == 0) {
                            class149.field2448[class294.field4672] = var274;
                            class294.field4672 = (class294.field4672 + 1) % 100;
                            String var278 = class73.method566(class100.method748(class102.method759(class143.field2360, (byte) 86), -8924));
                            if (var273 != 2 && ~var273 != -4) {
                                if (var273 == 1) {
                                    class57.method454(9, class66.method506((byte) 20, var266), (byte) -119, "<img=0>" + class66.method506((byte) 20, var264), var278);
                                } else {
                                    class57.method454(9, class66.method506((byte) 20, var266), (byte) -119, class66.method506((byte) 20, var264), var278);
                                }
                            } else {
                                class57.method454(9, class66.method506((byte) 20, var266), (byte) -119, "<img=1>" + class66.method506((byte) 20, var264), var278);
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -207) {
                        long var279 = class143.field2360.method983(29834);
                        int var281 = class143.field2360.method996(65280);
                        String var282 = class84.method672(var281, -2).method147(125, class143.field2360);
                        class267.method1819(var282, var281, (String) null, class66.method506((byte) 20, var279), 0, 19);
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 17) {
                        int var283 = class143.field2360.method988(744911448);
                        int var284 = class143.field2360.method996(65280);
                        int var285 = class143.field2360.method1022(105);
                        if (class195.method1333(108, var283)) {
                            class154.method1112(var284, (byte) -99, var285);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -198) {
                        long var286 = class143.field2360.method983(29834);
                        long var288 = (long) class143.field2360.method996(65280);
                        long var290 = (long) class143.field2360.method1009(109);
                        int var292 = class143.field2360.method1012(4);
                        boolean var293 = false;
                        int var294 = class143.field2360.method996(65280);
                        long var295 = (var288 << 32) - -var290;
                        int var297 = 0;
                        label1490: while (true) {
                            if (var297 >= 100) {
                                if (var292 <= 1) {
                                    for (int var298 = 0; ~class286.field4554 < ~var298; ++var298) {
                                        if (class145.field2390[var298] == var286) {
                                            var293 = true;
                                            break label1490;
                                        }
                                    }
                                }
                                break;
                            }
                            if (~class149.field2448[var297] == ~var295) {
                                var293 = true;
                                break;
                            }
                            ++var297;
                        }
                        if (!var293 && ~class200.field3264 == -1) {
                            class149.field2448[class294.field4672] = var295;
                            class294.field4672 = (class294.field4672 + 1) % 100;
                            String var299 = class84.method672(var294, -2).method147(119, class143.field2360);
                            if (var292 != 2) {
                                if (~var292 == -2) {
                                    class267.method1819(var299, var294, (String) null, "<img=0>" + class66.method506((byte) 20, var286), 0, 18);
                                } else {
                                    class267.method1819(var299, var294, (String) null, class66.method506((byte) 20, var286), 0, 18);
                                }
                            } else {
                                class267.method1819(var299, var294, (String) null, "<img=1>" + class66.method506((byte) 20, var286), 0, 18);
                            }
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 119) {
                        int var300 = class143.field2360.method1027((byte) 64);
                        int var301 = class143.field2360.method988(744911448);
                        int var302 = class143.field2360.method980(0);
                        if (class195.method1333(114, var301)) {
                            class230.method1529(-21518, var300, var302);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 234) {
                        long var303 = class143.field2360.method983(29834);
                        int var305 = class143.field2360.method996(65280);
                        boolean var306 = false;
                        byte var307 = class143.field2360.method981(false);
                        if (~(Long.MIN_VALUE & var303) != -1L) {
                            var306 = true;
                        }
                        if (!var306) {
                            String var308 = class143.field2360.method1010(-105);
                            class108 var309 = new class108();
                            var309.field2406 = var303;
                            var309.field1642 = class296.method1985(var309.field2406, 3026);
                            var309.field1640 = var308;
                            var309.field1641 = var307;
                            var309.field1645 = var305;
                            int var310;
                            for (var310 = class32.field541 + -1; ~var310 <= -1; --var310) {
                                int var311 = class290.field4618[var310].field1642.compareTo(var309.field1642);
                                if (var311 == 0) {
                                    class290.field4618[var310].field1645 = var305;
                                    class290.field4618[var310].field1641 = var307;
                                    class290.field4618[var310].field1640 = var308;
                                    client.field4578 = -1;
                                    if (~class12.field162 == ~var303) {
                                        class58.field1006 = var307;
                                    }
                                    class52.field941 = class61.field1040;
                                    return true;
                                }
                                if (~var311 > -1) {
                                    break;
                                }
                            }
                            if (class32.field541 >= class290.field4618.length) {
                                client.field4578 = -1;
                                return true;
                            }
                            for (int var312 = class32.field541 + -1; var312 > var310; --var312) {
                                class290.field4618[var312 + 1] = class290.field4618[var312];
                            }
                            if (~class32.field541 == -1) {
                                class290.field4618 = new class108[100];
                            }
                            class290.field4618[var310 + 1] = var309;
                            if (~class12.field162 == ~var303) {
                                class58.field1006 = var307;
                            }
                            ++class32.field541;
                        } else {
                            if (class32.field541 == 0) {
                                client.field4578 = -1;
                                return true;
                            }
                            long var313 = var303 & Long.MAX_VALUE;
                            boolean var315 = false;
                            int var316;
                            for (var316 = 0; ~var316 > ~class32.field541 && (~class290.field4618[var316].field2406 != ~var313 || class290.field4618[var316].field1645 != var305); ++var316) {
                            }
                            if (~var316 > ~class32.field541) {
                                while (var316 < class32.field541 + -1) {
                                    class290.field4618[var316] = class290.field4618[var316 + 1];
                                    ++var316;
                                }
                                --class32.field541;
                                class290.field4618[class32.field541] = null;
                            }
                        }
                        client.field4578 = -1;
                        class52.field941 = class61.field1040;
                        return true;
                    } else if (~client.field4578 == -192) {
                        int var317 = class143.field2360.method1012(4);
                        if (~class143.field2360.method1012(4) != -1) {
                            --class143.field2360.field2231;
                            class136.field2285[var317] = new class66(class143.field2360);
                        } else {
                            class136.field2285[var317] = new class66();
                        }
                        client.field4578 = -1;
                        class154.field2505 = class61.field1040;
                        return true;
                    } else if (client.field4578 == 218) {
                        int var318 = class143.field2360.method996(65280);
                        int var319 = class143.field2360.method1012(4);
                        int var320 = class143.field2360.method1012(4);
                        int var321 = class143.field2360.method996(65280);
                        int var322 = class143.field2360.method1012(4);
                        int var323 = class143.field2360.method1012(4);
                        if (class195.method1333(102, var318)) {
                            class223.method1501(var320, var323, var322, var319, var321, true, -101);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -254) {
                        int var324 = class143.field2360.method996(65280);
                        int var325 = class143.field2360.method1012(4);
                        int var326 = class143.field2360.method1012(4);
                        int var327 = class143.field2360.method1012(4);
                        int var328 = class143.field2360.method1012(4);
                        int var329 = class143.field2360.method996(65280);
                        if (class195.method1333(106, var324)) {
                            class269.field4319[var325] = true;
                            class144.field2366[var325] = var326;
                            class272.field4348[var325] = var327;
                            class270.field4341[var325] = var328;
                            class196.field3209[var325] = var329;
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -29) {
                        int var330 = class143.field2360.method1025((byte) 116);
                        int var331 = class143.field2360.method986(-1909920360);
                        int var332 = class143.field2360.method988(744911448);
                        if (class195.method1333(62, var332)) {
                            class254.method1703(var331, var330, (byte) 85);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -45) {
                        int var333 = class143.field2360.method988(744911448);
                        int var334 = class143.field2360.method996(65280);
                        String var335 = class143.field2360.method1010(-104);
                        if (class195.method1333(127, var334)) {
                            class241.method1591((byte) -61, var335, var333);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (~client.field4578 == -7) {
                        int var336 = class143.field2360.method996(65280);
                        int var337 = class143.field2360.method1025((byte) 111);
                        int var338 = class143.field2360.method1022(103);
                        int var339 = class143.field2360.method1011((byte) 97);
                        int var340 = class143.field2360.method1025((byte) 119);
                        if (class195.method1333(95, var340)) {
                            class6.method27(var338, var336, var337, -1, var339);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 78) {
                        int var341 = class143.field2360.method1003(-128);
                        int var342 = class143.field2360.method980(0);
                        int var343 = class143.field2360.method988(744911448);
                        int var344 = class143.field2360.method1025((byte) 115);
                        if (class195.method1333(87, var343)) {
                            class167 var345 = (class167) class91.field1434.method1063((byte) -68, (long) var342);
                            if (var345 != null) {
                                class164.method1184((byte) 66, ~var345.field2756 != ~var344, var345);
                            }
                            method1618(var344, var342, 22, var341);
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 == 202) {
                        String var346 = class143.field2360.method1010(-96);
                        int var347 = class143.field2360.method976((byte) -93);
                        int var348 = class143.field2360.method1011((byte) 98);
                        if (~var348 == -65536) {
                            var348 = -1;
                        }
                        int var349 = class143.field2360.method1012(4);
                        if (var347 >= 1 && var347 <= 8) {
                            if (var346.equalsIgnoreCase("null")) {
                                var346 = null;
                            }
                            class228.field3630[var347 + -1] = var346;
                            class28.field490[var347 + -1] = var348;
                            class104.field1596[var347 + -1] = var349 == 0;
                        }
                        client.field4578 = -1;
                        return true;
                    } else if (client.field4578 != 176 && client.field4578 != 109 && ~client.field4578 != -58 && client.field4578 != 183 && ~client.field4578 != -35 && ~client.field4578 != -30 && client.field4578 != 24 && client.field4578 != 171 && client.field4578 != 7 && client.field4578 != 193 && client.field4578 != 151 && client.field4578 != 53 && ~client.field4578 != -83 && client.field4578 != 99) {
                        if (client.field4578 == 186) {
                            class65.method501(true, 0);
                            client.field4578 = -1;
                            return true;
                        } else if (client.field4578 == 238) {
                            int var350 = class143.field2360.method986(-1909920360);
                            int var351 = class143.field2360.method1011((byte) 93);
                            int var352 = class143.field2360.method1003(-128);
                            if (class195.method1333(58, var351)) {
                                method1617(var352, 0, var350);
                            }
                            client.field4578 = -1;
                            return true;
                        } else if (client.field4578 == 168) {
                            long var353 = class143.field2360.method983(29834);
                            String var355 = class73.method566(class100.method748(class102.method759(class143.field2360, (byte) 86), -8924));
                            class106.method787(var355, class66.method506((byte) 20, var353), 6, true);
                            client.field4578 = -1;
                            return true;
                        } else if (~client.field4578 == -163) {
                            class149.field2449 = class143.field2360.method1015((byte) 56);
                            class165.field2735 = class143.field2360.method1003(-128);
                            client.field4578 = -1;
                            return true;
                        } else if (~client.field4578 == -142) {
                            class71.field1191 = 0;
                            client.field4578 = -1;
                            return true;
                        } else if (client.field4578 == 145) {
                            int var356 = class143.field2360.method996(65280);
                            int var357 = class143.field2360.method1012(4);
                            int var358 = class143.field2360.method1012(4);
                            int var359 = class143.field2360.method996(65280);
                            int var360 = class143.field2360.method1012(4);
                            int var361 = class143.field2360.method1012(4);
                            if (class195.method1333(96, var356)) {
                                class82.method665(var357, var361, var360, var359, 12844, var358);
                            }
                            client.field4578 = -1;
                            return true;
                        } else if (~client.field4578 == -32) {
                            class252.method1674((byte) -109);
                            client.field4578 = -1;
                            return true;
                        } else if (~client.field4578 == -66) {
                            int var362 = class143.field2360.method980(0);
                            int var363 = class143.field2360.method988(744911448);
                            int var364 = class143.field2360.method996(65280);
                            if (class195.method1333(104, var363)) {
                                class289.method1943(var364, true, var362);
                            }
                            client.field4578 = -1;
                            return true;
                        } else {
                            if (arg0 > -126) {
                                method1618(104, 42, 95, 61);
                            }
                            if (client.field4578 != 42) {
                                if (client.field4578 == 164) {
                                    int var381 = class143.field2360.method1025((byte) 53);
                                    int var382 = class143.field2360.method1011((byte) 70);
                                    int var383 = class143.field2360.method1003(-128);
                                    class139 var384 = class3.field45[var381];
                                    if (var384 != null) {
                                        class210.method1398(5, var383, var382, var384);
                                    }
                                    client.field4578 = -1;
                                    return true;
                                } else if (client.field4578 == 61) {
                                    int var385 = class143.field2360.method1011((byte) 84);
                                    int var386 = class143.field2360.method1022(-39);
                                    int var387 = class143.field2360.method988(744911448);
                                    if (var387 == 65535) {
                                        var387 = -1;
                                    }
                                    int var388 = class143.field2360.method986(-1909920360);
                                    if (class195.method1333(75, var385)) {
                                        class114 var389 = class8.method43(var388, (byte) -96);
                                        if (!var389.field1765) {
                                            if (~var387 == 0) {
                                                var389.field1892 = 0;
                                                client.field4578 = -1;
                                                return true;
                                            }
                                            class67 var390 = class190.method1314(var387, (byte) 68);
                                            var389.field1931 = var387;
                                            var389.field1892 = 4;
                                            var389.field1756 = var390.field1124;
                                            var389.field1868 = var390.field1141 * 100 / var386;
                                            var389.field1863 = var390.field1123;
                                            class72.method556(0, var389);
                                        } else {
                                            class112.method828(-1, var387, var388, var386);
                                            class67 var391 = class190.method1314(var387, (byte) 68);
                                            class6.method27(var388, var391.field1124, var391.field1123, -1, var391.field1141);
                                            class150.method1095(var391.field1133, var391.field1091, 27349, var391.field1102, var388);
                                        }
                                    }
                                    client.field4578 = -1;
                                    return true;
                                } else if (client.field4578 == 170) {
                                    for (int var392 = 0; var392 < class192.field3138.length; ++var392) {
                                        if (class238.field3750[var392] != class192.field3138[var392]) {
                                            class192.field3138[var392] = class238.field3750[var392];
                                            class10.method61(true, var392);
                                            class291.field4634[class64.method498(class36.field612++, 31)] = var392;
                                        }
                                    }
                                    client.field4578 = -1;
                                    return true;
                                } else {
                                    class161.method1167((Throwable) null, -124, "T1 - " + client.field4578 + "," + class26.field461 + "," + class38.field649 + " - " + class222.field3547);
                                    class31.method270(31377);
                                    return true;
                                }
                            } else {
                                long var365 = class143.field2360.method983(29834);
                                class143.field2360.method981(false);
                                long var367 = class143.field2360.method983(29834);
                                long var369 = (long) class143.field2360.method996(65280);
                                long var371 = (long) class143.field2360.method1009(113);
                                int var373 = class143.field2360.method1012(4);
                                int var374 = class143.field2360.method996(65280);
                                boolean var375 = false;
                                long var376 = (var369 << 32) + var371;
                                int var378 = 0;
                                label1550: while (true) {
                                    if (~var378 <= -101) {
                                        if (~var373 >= -2) {
                                            for (int var379 = 0; ~class286.field4554 < ~var379; ++var379) {
                                                if (~class145.field2390[var379] == ~var365) {
                                                    var375 = true;
                                                    break label1550;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    if (class149.field2448[var378] == var376) {
                                        var375 = true;
                                        break;
                                    }
                                    ++var378;
                                }
                                if (!var375 && ~class200.field3264 == -1) {
                                    class149.field2448[class294.field4672] = var376;
                                    class294.field4672 = (class294.field4672 - -1) % 100;
                                    String var380 = class84.method672(var374, -2).method147(61, class143.field2360);
                                    if (var373 != 2 && ~var373 != -4) {
                                        if (var373 != 1) {
                                            class267.method1819(var380, var374, class66.method506((byte) 20, var367), class66.method506((byte) 20, var365), 0, 20);
                                        } else {
                                            class267.method1819(var380, var374, class66.method506((byte) 20, var367), "<img=0>" + class66.method506((byte) 20, var365), 0, 20);
                                        }
                                    } else {
                                        class267.method1819(var380, var374, class66.method506((byte) 20, var367), "<img=1>" + class66.method506((byte) 20, var365), 0, 20);
                                    }
                                }
                                client.field4578 = -1;
                                return true;
                            }
                        }
                    } else {
                        class144.method1065(18132);
                        client.field4578 = -1;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V")
    private static final void method1617(int arg0, int arg1, int arg2) {
        ++field3852;
        class23 var3 = class91.method694(arg2, 7, arg1 + -20);
        var3.method190(arg1);
        var3.field361 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)Lvc;")
    private static final class167 method1618(int arg0, int arg1, int arg2, int arg3) {
        ++field3850;
        class167 var4 = new class167();
        var4.field2755 = arg3;
        var4.field2756 = arg0;
        class91.field1434.method1064(var4, (long) arg1, (byte) -122);
        class76.method611(arg0, arg2 ^ -20452);
        class114 var5 = class8.method43(arg1, (byte) 56);
        if (var5 != null) {
            class72.method556(0, var5);
        }
        if (class295.field4677 != null) {
            class72.method556(0, class295.field4677);
            class295.field4677 = null;
        }
        int var6 = class42.field776;
        if (arg2 != 22) {
            return null;
        } else {
            for (int var7 = 0; ~var6 < ~var7; ++var7) {
                if (class293.method1959(class94.field1468[var7], false)) {
                    class245.method1626(var7, arg2 + -12748);
                }
            }
            if (~class42.field776 != -2) {
                class3.method19((byte) 92, class190.field3121, class267.field4274, class66.field1088, class224.field3569);
                int var8 = class23.field362.method579(class139.field2332);
                for (int var9 = 0; ~class42.field776 < ~var9; ++var9) {
                    int var10 = class23.field362.method579(class55.method447(-112, var9));
                    if (var8 < var10) {
                        var8 = var10;
                    }
                }
                class190.field3121 = var8 - -8;
                class66.field1088 = (!class38.field661 ? 22 : 26) + class42.field776 * 15;
            } else {
                class198.field3226 = false;
                class3.method19((byte) 120, class190.field3121, class267.field4274, class66.field1088, class224.field3569);
            }
            if (var5 != null) {
                class42.method370(false, (byte) -57, var5);
            }
            class65.method504(arg0, 149);
            if (class223.field3558 != -1) {
                class165.method1196(1, class223.field3558, (byte) -80);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            ++field3855;
            if (~arg1 == -1) {
                this.field3844 = arg0.method996(arg2 ^ 65285);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)Lta;")
    public static final class190 method1619(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field2142; ++var4) {
                class190 var5 = var3.field2131[var4];
                if ((var5.field3118 >> 29 & 3L) == 2L && var5.field3115 == arg1 && var5.field3110 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)I")
    public final int method1620(int arg0) {
        ++field3848;
        if (arg0 <= 123) {
            field3857 = null;
        }
        return this.field3844;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
    public static void method1621(int arg0) {
        if (arg0 == 0) {
            field3858 = null;
            field3857 = null;
            field3854 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public final void method168(byte arg0) {
        super.method168((byte) 126);
        ++field3845;
        int var2 = -31 / ((arg0 - 39) / 47);
        this.field3847 = null;
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)Z")
    public final boolean method1622(int arg0) {
        ++field3843;
        if (this.field3847 != null) {
            return true;
        } else if (arg0 <= this.field3844) {
            class17 var2 = class36.field620 < 0 ? class263.method1767(class10.field139, this.field3844, 122) : class8.method44(class36.field620, class10.field139, (byte) -91, this.field3844);
            var2.method130();
            this.field3847 = var2.field244;
            this.field3849 = var2.field1564;
            this.field3851 = var2.field1560;
            return true;
        } else {
            return false;
        }
    }
}
