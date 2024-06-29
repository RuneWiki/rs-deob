import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class327 extends class388 {

    @OriginalMember(owner = "client!so", name = "s", descriptor = "Lcu;")
    public static class145 field4321 = new class145(61, 7);

    @OriginalMember(owner = "client!so", name = "w", descriptor = "Lmv;")
    public static class252 field4325 = new class252(128);

    @OriginalMember(owner = "client!so", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field4326 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public int field4314;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public int field4316;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Ljava/lang/String;")
    public String field4313;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "[I")
    public static int[] field4327;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I[[BLcd;)V", line = 3)
    public static final void method1890(int arg0, byte[][] arg1, class205 arg2) {
        field4315++;
        int var3 = 0;
        int var4 = -28 / ((-arg0 - 4) / 39);
        while (var3 < arg2.field3591) {
            class88.method641((byte) 108);
            for (int var5 = 0; var5 < (class12.field251 >> 3); var5++) {
                for (int var6 = 0; var6 < (class289.field3782 >> 3); var6++) {
                    int var7 = class168.field2437[var3][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field3592 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFCFA8) >> 14;
                            int var11 = (var7 & 0x3FFC) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class149.field2131.length; var13++) {
                                if (class149.field2131[var13] == var12 && arg1[var13] != null) {
                                    arg2.method1310((var10 & 0x7) * 8, true, arg1[var13], var6 * 8, class370.field4984, var9, var5 * 8, class120.field1754, (var11 & 0x7) * 8, var8, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILpc;Lqa;)V", line = 76)
    public static final void method1891(int arg0, class473 arg1, class162 arg2) {
        field4317++;
        class134[] var3 = class134.method937(arg1, class514.field7591, 0);
        class378.field5111 = new class529[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class378.field5111[var4] = arg2.method596(var3[var4], true);
        }
        class134[] var5 = class134.method937(arg1, class347.field4680, 0);
        class503.field6935 = new class529[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class503.field6935[var6] = arg2.method596(var5[var6], true);
        }
        class134[] var7 = class134.method937(arg1, class183.field2607, 0);
        class314.field4115 = new class529[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class314.field4115[var8] = arg2.method596(var7[var8], true);
        }
        class134[] var9 = class134.method937(arg1, class402.field5394, 0);
        if (arg0 < 99) {
            field4321 = null;
        }
        class141.field2046 = new class529[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class141.field2046[var10] = arg2.method596(var9[var10], true);
        }
        class134[] var11 = class134.method937(arg1, class288.field3774, 0);
        class494.field6861 = new class529[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class494.field6861[var12] = arg2.method596(var11[var12], true);
        }
        class134[] var13 = class134.method937(arg1, class23.field414, 0);
        class44.field662 = new class529[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class44.field662[var14] = arg2.method596(var13[var14], true);
        }
        class134[] var15 = class134.method937(arg1, class355.field4798, 0);
        class373.field5039 = new class529[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class373.field5039[var16] = arg2.method596(var15[var16], true);
        }
        class134[] var17 = class134.method937(arg1, class399.field5367, 0);
        class174.field2550 = new class529[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class174.field2550[var18] = arg2.method596(var17[var18], true);
        }
        class134[] var19 = class134.method937(arg1, class73.field1107, 0);
        class217.field2941 = new class529[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class217.field2941[var20] = arg2.method596(var19[var20], true);
        }
        class134[] var21 = class134.method937(arg1, class431.field5900, 0);
        class241.field3210 = new class529[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class241.field3210[var22] = arg2.method596(var21[var22], true);
        }
        class134[] var23 = class134.method937(arg1, class49.field764, 0);
        class246.field3276 = new class529[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class246.field3276[var24] = arg2.method596(var23[var24], true);
        }
        class134[] var25 = class134.method937(arg1, class296.field3868, 0);
        class514.field7590 = new class529[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class514.field7590[var26] = arg2.method596(var25[var26], true);
        }
        class220.field2984 = arg2.method596(class134.method939(arg1, class56.field878, 0), true);
        class413.field5714 = arg2.method596(class134.method939(arg1, class522.field7716, 0), true);
        class134[] var27 = class134.method937(arg1, class292.field3826, 0);
        class91.field1387 = new class529[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class91.field1387[var28] = arg2.method596(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZIIIII)V", line = 207)
    public static final void method1892(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class297.field3882 != null && (arg4 != 3 || class154.field2244.field7777 != arg5 || class154.field2244.field7759 != arg3)) {
            class423.method2437(class297.field3882, true, class389.field5281);
            class297.field3882 = null;
        }
        if (arg1 != -8315) {
            method1894(-36, null, (byte) -29, -120, -125, false);
        }
        field4324++;
        if (arg4 == 3 && class297.field3882 == null) {
            class297.field3882 = class448.method2568((byte) -105, arg5, arg3, 0, 0, class389.field5281);
            if (class297.field3882 != null) {
                class154.field2244.field7777 = arg5;
                class154.field2244.field7759 = arg3;
                class154.field2244.method1852(class389.field5281, (byte) 120);
            }
        }
        if (arg4 == 3 && class297.field3882 == null) {
            method1892(true, arg1, arg2, -1, class154.field2244.field7752, -1);
            return;
        }
        Container var7;
        if (class297.field3882 != null) {
            var7 = class297.field3882;
            class445.field6092 = arg3;
            class184.field2617 = arg5;
        } else if (class273.field3572 == null) {
            var7 = class389.field5281.field2917;
            class184.field2617 = var7.getSize().width;
            class445.field6092 = var7.getSize().height;
        } else {
            Insets var6 = class273.field3572.getInsets();
            class184.field2617 = class273.field3572.getSize().width - var6.right - var6.left;
            class445.field6092 = class273.field3572.getSize().height - var6.bottom - var6.top;
            var7 = class273.field3572;
        }
        if (arg4 == 1) {
            class224.field3023 = (class184.field2617 - class61.field949) / 2;
            class269.field3539 = 0;
            class149.field2132 = class61.field949;
            class175.field2555 = class310.field4079;
        } else if (class199.field2765 < 96 && class166.field2414 == 0) {
            int var8 = class184.field2617 <= 1024 ? class184.field2617 : 1024;
            class149.field2132 = var8;
            class224.field3023 = (class184.field2617 - var8) / 2;
            int var9 = class445.field6092 <= 768 ? class445.field6092 : 768;
            class269.field3539 = 0;
            class175.field2555 = var9;
        } else {
            class175.field2555 = class445.field6092;
            class149.field2132 = class184.field2617;
            class269.field3539 = 0;
            class224.field3023 = 0;
        }
        if (class281.field3698 != class168.field2433) {
            boolean var10000;
            if (class149.field2132 < 1024 && class175.field2555 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class298.method1737(-4816);
        } else {
            class518.field7663.setSize(class149.field2132, class175.field2555);
            class370.field4984.method595(class518.field7663);
            if (class273.field3572 == var7) {
                Insets var10 = class273.field3572.getInsets();
                class518.field7663.setLocation(class224.field3023 + var10.left, class269.field3539 + var10.top);
            } else {
                class518.field7663.setLocation(class224.field3023, class269.field3539);
            }
        }
        if (arg4 >= 2) {
            class72.field1094 = true;
        } else {
            class72.field1094 = false;
        }
        if (class474.field6555 != -1) {
            class329.method1899(arg1 + 19468, true);
        }
        if (class304.field4004 != null && (class454.field6161 == 30 || class454.field6161 == 25)) {
            class399.method2326(1135345664);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class204.field2824[var11] = true;
        }
        class366.field4959 = true;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 355)
    public static final void method1893(int arg0) {
        field4311++;
        class193.field2708.field5173 = 0;
        class34.field551 = null;
        class377.field5106 = 0;
        class219.field2965 = 0;
        class167.field2425 = null;
        class466.field6425 = 0;
        class170.field2482 = null;
        class481.field6632.field5173 = 0;
        class339.field4424 = null;
        class362.method2107(4);
        class59.method418((byte) 88);
        for (int var1 = 0; var1 < 2048; var1++) {
            class499.field6901[var1] = null;
        }
        class385.field5232 = null;
        for (int var2 = 0; var2 < class291.field3822.length; var2++) {
            class117 var4 = class291.field3822[var2];
            if (var4 != null) {
                var4.field6202 = -1;
            }
        }
        class275.method1644((byte) 42);
        class42.field623 = 1;
        class507.method2898(arg0 + 1, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class204.field2824[var3] = true;
        }
        class399.method2326(1135345664);
        class319.field4182 = arg0;
        class50.field776 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I[[[Lht;BIIZ)Z", line = 413)
    public static final boolean method1894(int arg0, class409[][][] arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        field4320++;
        byte var6 = arg5 ? 1 : (byte) (class33.field531 & 0xFF);
        if (class99.field1482[class411.field5656][arg4][arg0] == var6) {
            return false;
        } else if ((class117.field1677[class411.field5656][arg4][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class93.field1405[var7] = arg4;
            int var8 = 0;
            int var9 = 34 / ((arg2 + 1) / 38);
            int var36 = var7 + 1;
            class306.field4040[var7] = arg0;
            class99.field1482[class411.field5656][arg4][arg0] = var6;
            while (var36 != var8) {
                int var10 = class93.field1405[var8] & 0xFFFF;
                int var11 = class93.field1405[var8] >> 16 & 0xFF;
                int var12 = class93.field1405[var8] >> 24 & 0xFF;
                int var13 = class306.field4040[var8] & 0xFFFF;
                int var14 = class306.field4040[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class117.field1677[class411.field5656][var10][var13] & 0x4) == 0) {
                    var15 = true;
                }
                boolean var16 = false;
                label233: for (int var17 = class411.field5656 + 1; var17 <= 3; var17++) {
                    if ((class117.field1677[var17][var10][var13] & 0x8) == 0) {
                        if (var15 && arg1[var17][var10][var13] != null) {
                            if (arg1[var17][var10][var13].field5627 != null) {
                                int var21 = class19.method186(var11, (byte) -113);
                                if (arg1[var17][var10][var13].field5627.field880 == var21 || arg1[var17][var10][var13].field5607 != null && arg1[var17][var10][var13].field5607.field880 == var21) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var22 = class19.method186(var12, (byte) -106);
                                    if (arg1[var17][var10][var13].field5627.field880 == var22 || arg1[var17][var10][var13].field5607 != null && arg1[var17][var10][var13].field5607.field880 == var22) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var23 = class19.method186(var14, (byte) -109);
                                    if (arg1[var17][var10][var13].field5627.field880 == var23 || arg1[var17][var10][var13].field5607 != null && arg1[var17][var10][var13].field5607.field880 == var23) {
                                        continue;
                                    }
                                }
                            }
                            class409 var24 = arg1[var17][var10][var13];
                            if (var24.field5630 != null) {
                                for (class165 var25 = var24.field5630; var25 != null; var25 = var25.field2400) {
                                    class37 var26 = var25.field2402;
                                    if (var26 instanceof class338) {
                                        class338 var27 = (class338) var26;
                                        int var28 = var27.method345(-1736);
                                        int var29 = var27.method344(-4534);
                                        if (var28 == 21) {
                                            var28 = 19;
                                        }
                                        int var30 = var29 << 6 | var28;
                                        if (var11 == var30 || var12 != 0 && var12 == var30 || var14 != 0 && var14 == var30) {
                                            continue label233;
                                        }
                                    }
                                }
                            }
                        }
                        class409 var31 = arg1[var17][var10][var13];
                        if (var31 != null && var31.field5630 != null) {
                            for (class165 var32 = var31.field5630; var32 != null; var32 = var32.field2400) {
                                class37 var33 = var32.field2402;
                                if (var33.field581 != var33.field580 || var33.field587 != var33.field569) {
                                    for (int var34 = var33.field581; var34 <= var33.field580; var34++) {
                                        for (int var35 = var33.field587; var35 <= var33.field569; var35++) {
                                            class99.field1482[var17][var34][var35] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var16 = true;
                        class99.field1482[var17][var10][var13] = var6;
                    }
                }
                if (var16) {
                    int var18 = class141.field2049[class411.field5656 + 1].method272(var10, var13);
                    if (class196.field2752[arg3] < var18) {
                        class196.field2752[arg3] = var18;
                    }
                    int var19 = var10 << 7;
                    int var20 = var13 << 7;
                    if (class199.field2760[arg3] > var19) {
                        class199.field2760[arg3] = var19;
                    } else if (var19 > class457.field6298[arg3]) {
                        class457.field6298[arg3] = var19;
                    }
                    if (class125.field1845[arg3] > var20) {
                        class125.field1845[arg3] = var20;
                    } else if (class426.field5818[arg3] < var20) {
                        class426.field5818[arg3] = var20;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class99.field1482[class411.field5656][var10 - 1][var13] != var6) {
                        class93.field1405[var36] = class191.method1230(-754974720, class191.method1230(var10 - 1, 1179648));
                        class306.field4040[var36] = class191.method1230(var13, 1245184);
                        var36 = var36 + 1 & 0xFFF;
                        class99.field1482[class411.field5656][var10 - 1][var13] = var6;
                    }
                    var13++;
                    if (class289.field3782 > var13) {
                        if (var10 - 1 >= 0 && class99.field1482[class411.field5656][var10 - 1][var13] != var6 && (class117.field1677[class411.field5656][var10][var13] & 0x4) == 0 && (class117.field1677[class411.field5656][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class93.field1405[var36] = class191.method1230(class191.method1230(var10 - 1, 1179648), 1375731712);
                            class306.field4040[var36] = class191.method1230(1245184, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class99.field1482[class411.field5656][var10 - 1][var13] = var6;
                        }
                        if (class99.field1482[class411.field5656][var10][var13] != var6) {
                            class93.field1405[var36] = class191.method1230(318767104, class191.method1230(var10, 5373952));
                            class306.field4040[var36] = class191.method1230(var13, 5439488);
                            class99.field1482[class411.field5656][var10][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < class12.field251 && class99.field1482[class411.field5656][var10 + 1][var13] != var6 && (class117.field1677[class411.field5656][var10][var13] & 0x4) == 0 && (class117.field1677[class411.field5656][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class93.field1405[var36] = class191.method1230(-1845493760, class191.method1230(var10 + 1, 5373952));
                            class306.field4040[var36] = class191.method1230(var13, 5439488);
                            var36 = var36 + 1 & 0xFFF;
                            class99.field1482[class411.field5656][var10 + 1][var13] = var6;
                        }
                    }
                    var13--;
                    if ((var10 + 1) < class12.field251 && class99.field1482[class411.field5656][var10 + 1][var13] != var6) {
                        class93.field1405[var36] = class191.method1230(class191.method1230(var10 + 1, 9568256), 1392508928);
                        class306.field4040[var36] = class191.method1230(var13, 9633792);
                        class99.field1482[class411.field5656][var10 + 1][var13] = var6;
                        var36 = var36 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if ((var10 - 1) >= 0 && class99.field1482[class411.field5656][var10 - 1][var13] != var6 && (class117.field1677[class411.field5656][var10][var13] & 0x4) == 0 && (class117.field1677[class411.field5656][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class93.field1405[var36] = class191.method1230(class191.method1230(13762560, var10 - 1), 301989888);
                            class306.field4040[var36] = class191.method1230(13828096, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class99.field1482[class411.field5656][var10 - 1][var13] = var6;
                        }
                        if (class99.field1482[class411.field5656][var10][var13] != var6) {
                            class93.field1405[var36] = class191.method1230(-1828716544, class191.method1230(13762560, var10));
                            class306.field4040[var36] = class191.method1230(var13, 13828096);
                            class99.field1482[class411.field5656][var10][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < class12.field251 && class99.field1482[class411.field5656][var10 + 1][var13] != var6 && (class117.field1677[class411.field5656][var10][var13] & 0x4) == 0 && (class117.field1677[class411.field5656][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class93.field1405[var36] = class191.method1230(-771751936, class191.method1230(var10 + 1, 9568256));
                            class306.field4040[var36] = class191.method1230(9633792, var13);
                            class99.field1482[class411.field5656][var10 + 1][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class196.field2752[arg3] != -1000000) {
                class196.field2752[arg3] += 10;
                class199.field2760[arg3] -= 50;
                class457.field6298[arg3] += 50;
                class426.field5818[arg3] += 50;
                class125.field1845[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V", line = 734)
    public static final void method1895(boolean arg0) {
        field4319++;
        if (class216.field2910.toLowerCase().indexOf("microsoft") == -1) {
            class108.field1571[93] = 43;
            class108.field1571[47] = 73;
            class108.field1571[44] = 71;
            class108.field1571[59] = 57;
            class108.field1571[92] = 74;
            class108.field1571[45] = 26;
            class108.field1571[91] = 42;
            class108.field1571[46] = 72;
            class108.field1571[61] = 27;
            if (class216.field2930 == null) {
                class108.field1571[192] = 58;
                class108.field1571[222] = 59;
            } else {
                class108.field1571[222] = 58;
                class108.field1571[520] = 59;
                class108.field1571[192] = 28;
            }
        } else {
            class108.field1571[192] = 58;
            class108.field1571[219] = 42;
            class108.field1571[221] = 43;
            class108.field1571[220] = 74;
            class108.field1571[187] = 27;
            class108.field1571[189] = 26;
            class108.field1571[191] = 73;
            class108.field1571[223] = 28;
            class108.field1571[186] = 57;
            class108.field1571[222] = 59;
            class108.field1571[190] = 72;
            class108.field1571[188] = 71;
        }
        if (arg0) {
            method1892(true, 42, -94, -7, -50, 43);
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(Z)V", line = 785)
    public static void method1896(boolean arg0) {
        field4326 = null;
        field4327 = null;
        if (arg0) {
            field4325 = null;
            field4321 = null;
        }
    }
}
