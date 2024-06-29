import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class438 {

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field6096 = 0;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Lpr;")
    public static class407 field6097 = new class407(115, 7);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public int field6088;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public int field6090;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public int field6092;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public int field6094;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method2416(int arg0) {
        field6097 = null;
        int var1 = -33 / ((-arg0 - 11) / 35);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILoa;II)V")
    public static final void method2417(int arg0, class635 arg1, int arg2, int arg3) {
        field6098++;
        if (arg2 < 0 || arg3 < 0 || class626.field8895 == 0 || class77.field791 == 0) {
            return;
        }
        arg1.method306(class190.field2302, class662.field9408, class626.field8895, class77.field791);
        arg1.method314(class70.field748, class80.field855, class626.field8895, class77.field791);
        class389 var4 = arg1.method371();
        var4.method227(class178.field2199, class116.field1344, class559.field7961, class566.field8024, class134.field1510, class348.field4539);
        arg1.method311(var4);
        if (class275.field3477 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method337();
            int var8 = (arg2 - class190.field2302) * var7 / class626.field8895;
            int var9 = (arg3 - class662.field9408) * var7 / class77.field791;
            int var10 = arg1.method321();
            int var11 = (arg2 - class190.field2302) * var10 / class626.field8895;
            int var12 = (arg3 - class662.field9408) * var10 / class77.field791;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method234(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method234(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && var20 < class399.field5338 && var22 < class349.field4567) {
                    int var23 = class377.field4914.field4638;
                    if (var23 < 3 && (class379.field4922[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class275.field3477[var23].method242(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class377.field4914.method1656(true) - 1 << 8) >> 9;
                        var6 = (class377.field4914.method1656(true) - 1 << 8) + var21 >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class477.field6938 && (class406.field5414 & 0x40) != 0) {
                    class382 var24 = class657.method3708(class292.field3767, (byte) -78, class411.field5451);
                    if (var24 == null) {
                        class420.method2278(arg0 + 5582);
                    } else {
                        class459.method2618(false, 500, -1, " ->", var5, true, var6, 0L, class419.field5567, 18, class122.field1376);
                    }
                } else {
                    if (class343.field4453 == class220.field2668) {
                        class459.method2618(false, 500, -1, "", var5, true, var6, 0L, class221.field2746.method1296(class226.field2899, (byte) -80), 46, -1);
                    }
                    class547.field7823++;
                    class459.method2618(false, 500, -1, "", var5, true, var6, 0L, class580.field8248, 9, class552.field7867);
                }
            }
        }
        class21 var25 = class435.field5854;
        if (arg0 != -2) {
            field6091 = -21;
        }
        for (class231 var26 = (class231) var25.method93((byte) 55); var26 != null; var26 = (class231) var25.method92(0)) {
            if ((class1.field7 || class377.field4914.field4638 == var26.field2943) && var26.method1347(arg1, (byte) 71, arg2, arg3)) {
                if (var26.field2949 instanceof class455) {
                    class455 var27 = (class455) var26.field2949;
                    int var28 = var27.method1656(true);
                    if ((var28 & 0x1) == 0 && (var27.field4641 & 0x1FF) == 0 && (var27.field4647 & 0x1FF) == 0 || (var28 & 0x1) == 1 && (var27.field4641 & 0x1FF) == 256 && (var27.field4647 & 0x1FF) == 256) {
                        int var29 = var27.field4641 - (var27.method1656(true) - 1 << 8);
                        int var30 = var27.field4647 - (var27.method1656(true) - 1 << 8);
                        for (int var31 = 0; var31 < class118.field1356; var31++) {
                            class443 var38 = (class443) class392.field5223.method3234((byte) -59, (long) class664.field9449[var31]);
                            if (var38 != null) {
                                class625 var39 = var38.field6107;
                                if (class469.field6549 != var39.field3800 && var39.field3735) {
                                    int var40 = var39.field4641 - (var39.field8855.field234 - 1 << 8);
                                    int var41 = var39.field4647 - (var39.field8855.field234 - 1 << 8);
                                    if (var29 <= var40 && var39.field8855.field234 <= var27.method1656(true) - (var40 - var29 >> 9) && var41 >= var30 && var39.field8855.field234 <= var27.method1656(true) - (var41 - var30 >> 9)) {
                                        class111.method695(class377.field4914.field4638 != var26.field2943, arg0 ^ 0xFFFFFFBB, var39);
                                        var39.field3800 = class469.field6549;
                                    }
                                }
                            }
                        }
                        int var32 = class11.field111;
                        int[] var33 = class79.field827;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class455 var35 = class362.field4726[var33[var34]];
                            if (var35 != null && class469.field6549 != var35.field3800 && var27 != var35 && var35.field3735) {
                                int var36 = var35.field4641 - (var35.method1656(true) - 1 << 8);
                                int var37 = var35.field4647 - (var35.method1656(true) - 1 << 8);
                                if (var29 <= var36 && var35.method1656(true) <= var27.method1656(true) - (var36 - var29 >> 9) && var30 <= var37 && var35.method1656(true) <= var27.method1656(true) - (var37 - var30 >> 9)) {
                                    class315.method1779(var35, class377.field4914.field4638 != var26.field2943, -90);
                                    var35.field3800 = class469.field6549;
                                }
                            }
                        }
                    }
                    if (class469.field6549 == var27.field3800) {
                        continue;
                    }
                    class315.method1779(var27, class377.field4914.field4638 != var26.field2943, 120);
                    var27.field3800 = class469.field6549;
                }
                if (var26.field2949 instanceof class625) {
                    class625 var42 = (class625) var26.field2949;
                    if (var42.field8855 != null) {
                        if ((var42.field8855.field234 & 0x1) == 0 && (var42.field4641 & 0x1FF) == 0 && (var42.field4647 & 0x1FF) == 0 || (var42.field8855.field234 & 0x1) == 1 && (var42.field4641 & 0x1FF) == 256 && (var42.field4647 & 0x1FF) == 256) {
                            int var43 = var42.field4641 - (var42.field8855.field234 - 1 << 8);
                            int var44 = var42.field4647 - (var42.field8855.field234 - 1 << 8);
                            for (int var45 = 0; var45 < class118.field1356; var45++) {
                                class443 var52 = (class443) class392.field5223.method3234((byte) -90, (long) class664.field9449[var45]);
                                if (var52 != null) {
                                    class625 var53 = var52.field6107;
                                    if (class469.field6549 != var53.field3800 && var42 != var53 && var53.field3735) {
                                        int var54 = var53.field4641 - (var53.field8855.field234 - 1 << 8);
                                        int var55 = var53.field4647 - (var53.field8855.field234 - 1 << 8);
                                        if (var54 >= var43 && var42.field8855.field234 - (var54 - var43 >> 9) >= var53.field8855.field234 && var44 <= var55 && var42.field8855.field234 - (var55 - var44 >> 9) >= var53.field8855.field234) {
                                            class111.method695(class377.field4914.field4638 != var26.field2943, 113, var53);
                                            var53.field3800 = class469.field6549;
                                        }
                                    }
                                }
                            }
                            int var46 = class11.field111;
                            int[] var47 = class79.field827;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class455 var49 = class362.field4726[var47[var48]];
                                if (var49 != null && class469.field6549 != var49.field3800 && var49.field3735) {
                                    int var50 = var49.field4641 - (var49.method1656(true) - 1 << 8);
                                    int var51 = var49.field4647 - (var49.method1656(true) - 1 << 8);
                                    if (var43 <= var50 && var49.method1656(true) <= var42.field8855.field234 - (var50 - var43 >> 9) && var44 <= var51 && var49.method1656(true) <= var42.field8855.field234 - (var51 - var44 >> 9)) {
                                        class315.method1779(var49, class377.field4914.field4638 != var26.field2943, arg0 + 25);
                                        var49.field3800 = class469.field6549;
                                    }
                                }
                            }
                        }
                        if (class469.field6549 == var42.field3800) {
                            continue;
                        }
                        class111.method695(class377.field4914.field4638 != var26.field2943, 49, var42);
                        var42.field3800 = class469.field6549;
                    }
                }
                if (var26.field2949 instanceof class489) {
                    int var56 = class682.field9685 + var26.field2950;
                    int var57 = class146.field1642 + var26.field2948;
                    class43 var58 = (class43) class152.field1725.method3234((byte) -104, (long) (var57 << 14 | var26.field2943 << 28 | var56));
                    if (var58 != null) {
                        for (class232 var59 = (class232) var58.field451.method3175((byte) 110); var59 != null; var59 = (class232) var58.field451.method3163(5769)) {
                            class537 var60 = class472.field6588.method1903(var59.field2958, (byte) -119);
                            if (class477.field6938 && class377.field4914.field4638 == var26.field2943) {
                                class450 var61 = class109.field1269 == -1 ? null : class80.field854.method687(false, class109.field1269);
                                if ((class406.field5414 & 0x1) != 0 && (var61 == null || var60.method3061(var61.field6198, class109.field1269, 850) != var61.field6198)) {
                                    class459.method2618(false, 500, -1, class182.field2231 + " -> <col=ff9040>" + var60.field7677, var26.field2950, true, var26.field2948, (long) var59.field2958, class419.field5567, 44, class122.field1376);
                                    class476.field6932++;
                                }
                            }
                            if (class377.field4914.field4638 == var26.field2943) {
                                String[] var62 = var60.field7673;
                                for (int var63 = 4; var63 >= 0; var63--) {
                                    if (var62 != null && var62[var63] != null) {
                                        byte var64 = 0;
                                        int var65 = class421.field5604;
                                        if (var63 == 0) {
                                            var64 = 6;
                                        }
                                        if (var63 == 1) {
                                            var64 = 47;
                                        }
                                        if (var63 == 2) {
                                            var64 = 59;
                                        }
                                        if (var63 == 3) {
                                            var64 = 11;
                                        }
                                        if (var60.field7683 == var63) {
                                            var65 = var60.field7735;
                                        }
                                        if (var63 == 4) {
                                            var64 = 51;
                                        }
                                        if (var60.field7694 == var63) {
                                            var65 = var60.field7698;
                                        }
                                        class459.method2618(false, 500, -1, "<col=ff9040>" + var60.field7677, var26.field2950, true, var26.field2948, (long) var59.field2958, var62[var63], var64, var65);
                                        class551.field7861++;
                                    }
                                }
                            }
                            class459.method2618(class377.field4914.field4638 != var26.field2943, arg0 + 502, -1, "<col=ff9040>" + var60.field7677, var26.field2950, true, var26.field2948, (long) var59.field2958, class221.field2741.method1296(class226.field2899, (byte) -90), 1004, class293.field3848);
                            class79.field813++;
                        }
                    }
                }
                if (var26.field2949 instanceof class670) {
                    class670 var66 = (class670) var26.field2949;
                    class335 var67 = class195.field2339.method3729(var66.method444((byte) -64), (byte) 109);
                    if (var67.field4342 != null) {
                        var67 = var67.method1889(arg0 + 3, class491.field7127);
                    }
                    if (var67 != null) {
                        if (class477.field6938 && class377.field4914.field4638 == var26.field2943) {
                            class450 var68 = class109.field1269 == -1 ? null : class80.field854.method687(false, class109.field1269);
                            if ((class406.field5414 & 0x4) != 0 && (var68 == null || var67.method1885(class109.field1269, var68.field6198, -127) != var68.field6198)) {
                                class390.field5199++;
                                class459.method2618(false, arg0 ^ 0xFFFFFE0A, -1, class182.field2231 + " -> <col=00ffff>" + var67.field4348, var26.field2950, true, var26.field2948, class431.method2308(-112, var66, var26.field2950, var26.field2948), class419.field5567, 30, class122.field1376);
                            }
                        }
                        if (class377.field4914.field4638 == var26.field2943) {
                            String[] var69 = var67.field4350;
                            if (var69 != null) {
                                for (int var70 = 4; var70 >= 0; var70--) {
                                    if (var69[var70] != null) {
                                        short var71 = 0;
                                        if (var70 == 0) {
                                            var71 = 3;
                                        }
                                        int var72 = class421.field5604;
                                        if (var70 == 1) {
                                            var71 = 45;
                                        }
                                        if (var70 == 2) {
                                            var71 = 58;
                                        }
                                        if (var70 == 3) {
                                            var71 = 5;
                                        }
                                        if (var70 == 4) {
                                            var71 = 1011;
                                        }
                                        if (var67.field4321 == var70) {
                                            var72 = var67.field4382;
                                        }
                                        if (var67.field4332 == var70) {
                                            var72 = var67.field4330;
                                        }
                                        class286.field3667++;
                                        class459.method2618(false, arg0 + 502, -1, "<col=00ffff>" + var67.field4348, var26.field2950, true, var26.field2948, class431.method2308(-116, var66, var26.field2950, var26.field2948), var69[var70], var71, var72);
                                    }
                                }
                            }
                        }
                        class568.field8053++;
                        class459.method2618(class377.field4914.field4638 != var26.field2943, 500, -1, "<col=00ffff>" + var67.field4348, var26.field2950, true, var26.field2948, (long) var67.field4324, class221.field2741.method1296(class226.field2899, (byte) 75), 1009, class293.field3848);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
    public static final void method2418(byte arg0, boolean arg1) {
        if (arg1) {
            if (class397.field5320 != -1) {
                class63.method425(-794, class397.field5320);
            }
            for (class454 var2 = (class454) class234.field2982.method3232(-1); var2 != null; var2 = (class454) class234.field2982.method3236(-27646)) {
                if (!var2.method1520(126)) {
                    var2 = (class454) class234.field2982.method3232(-1);
                    if (var2 == null) {
                        break;
                    }
                }
                class39.method204(true, -28799, false, var2);
            }
            class397.field5320 = -1;
            class234.field2982 = new class572(8);
            class552.method3112(-1);
            class397.field5320 = class36.field410;
            class433.method2313(-63, false);
            class14.method66(12287);
            class364.method2003(class397.field5320);
        }
        field6093++;
        class662.field9407 = false;
        class673.field9560 = "";
        class380.field4932 = "";
        class207.method1255(0);
        class378.field4915 = -1;
        class625.method3495(class191.field2305, -1);
        class377.field4914 = new class455();
        class377.field4914.field3839[0] = class399.field5338 / 2;
        class377.field4914.field4641 = class399.field5338 * 512 / 2;
        class377.field4914.field4647 = class349.field4567 * 512 / 2;
        if (arg0 < 86) {
            field6091 = -70;
        }
        class662.field9411 = 0;
        class345.field4493 = 0;
        class377.field4914.field3841[0] = class349.field4567 / 2;
        if (class5.field41 == 2) {
            class345.field4493 = class656.field9367 << 9;
            class662.field9411 = class67.field720 << 9;
        } else {
            class591.method3318((byte) 123);
        }
        class89.method558(0);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static final void method2419(int arg0) {
        int var1 = -63 % ((16 - arg0) / 33);
        for (int var2 = 0; var2 < 5; var2++) {
            class347.field4528[var2] = false;
        }
        field6089++;
        class689.field9735 = -1;
        class424.field5643 = -1;
        class214.field2600 = 0;
        class5.field41 = 1;
        class19.field167 = 0;
    }
}
