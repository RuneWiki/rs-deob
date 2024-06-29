import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class658 implements class509 {

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lae;")
    private class283 field9286;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lcb;")
    public class176 field9284;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lqk;")
    public static class1 field9278 = new class1(53, 7);

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field9287 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field9285;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lho;")
    public class318 field9281;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)V")
    public void method939(int arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field9284.field2228.method1744(class456.field6378, this.field9281.method749(), (byte) 75) + this.field9284.field2222;
            int var4 = this.field9284.field2221.method59(0, class565.field7983, this.field9281.method736()) + this.field9284.field2227;
            this.field9281.method2025(var3, var4);
        }
        if (arg0 != 7998) {
            this.method941((byte) -117);
        }
        field9280++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public final void method938(int arg0) {
        field9282++;
        if (arg0 <= 61) {
            field9278 = null;
        }
        this.field9281 = class772.method4269(12, this.field9284.field2220, this.field9286);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static final void method3768(int arg0) {
        field9283++;
        class243.field3598++;
        class116 var1 = class248.method1672(class84.field1023, class412.field5775, -20647);
        var1.field1575.method3005(arg0 ^ 0xFF, 0);
        class443.method2655(arg0, var1);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLkf;B)V")
    public static final void method3769(boolean arg0, class359 arg1, byte arg2) {
        field9279++;
        if (class640.field8992 >= 400) {
            return;
        }
        if (arg2 != -44) {
            method3769(false, null, (byte) -42);
        }
        class636 var3 = arg1.field5172;
        String var4 = arg1.field5165;
        if (var3.field8872 != null) {
            var3 = var3.method3650(class173.field2192, (byte) 55);
            if (var3 == null) {
                return;
            }
            var4 = var3.field8898;
        }
        if (!var3.field8927) {
            return;
        }
        if (arg1.field5174 != 0) {
            String var5 = class389.field5550 == class327.field4603 ? class712.field9883.method3999(class553.field7667, (byte) -48) : class712.field9881.method3999(class553.field7667, (byte) -50);
            var4 = var4 + class641.method3685(31339, class724.field10031.field9980, arg1.field5174) + " (" + var5 + arg1.field5174 + ")";
        }
        if (class773.field10644 && !arg0) {
            class771 var6 = class358.field5156 == -1 ? null : class734.field10126.method709((byte) 124, class358.field5156);
            if ((class774.field10657 & 0x2) != 0 && (var6 == null || var3.method3653(var6.field10602, 26, class358.field5156) != var6.field10602)) {
                class86.method647((long) arg1.field9186, class56.field656, 0, false, (long) arg1.field9186, class523.field7205 + " -> <col=ffff00>" + var4, 47, class50.field602, -1, 110, true, 0, false);
                class179.field2262++;
            }
        }
        if (!arg0) {
            String[] var7 = var3.field8877;
            if (class468.field6496) {
                var7 = class530.method3149(arg2 + 155, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field8888 == 0 || !var7[var8].equalsIgnoreCase(class712.field9876.method3999(class553.field7667, (byte) -117)))) {
                        byte var9 = 0;
                        int var10 = class233.field3500;
                        if (var8 == 0) {
                            var9 = 58;
                        }
                        if (var8 == 1) {
                            var9 = 4;
                        }
                        if (var8 == 2) {
                            var9 = 51;
                        }
                        if (var8 == 3) {
                            var9 = 13;
                        }
                        if (var3.field8928 == var8) {
                            var10 = var3.field8944;
                        }
                        if (var8 == 4) {
                            var9 = 23;
                        }
                        if (var3.field8884 == var8) {
                            var10 = var3.field8935;
                        }
                        class586.field8276++;
                        class86.method647((long) arg1.field9186, var7[var8], 0, false, (long) arg1.field9186, "<col=ffff00>" + var4, var9, var7[var8].equalsIgnoreCase(class712.field9876.method3999(class553.field7667, (byte) -32)) ? var3.field8891 : var10, -1, arg2 + 125, true, 0, false);
                    }
                }
            }
            if (var3.field8888 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class712.field9876.method3999(class553.field7667, (byte) -68))) {
                        short var12 = 0;
                        if (class724.field10031.field9980 < arg1.field5174) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 58;
                        }
                        if (var11 == 1) {
                            var13 = 4;
                        }
                        if (var11 == 2) {
                            var13 = 51;
                        }
                        if (var11 == 3) {
                            var13 = 13;
                        }
                        if (var11 == 4) {
                            var13 = 23;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class86.method647((long) arg1.field9186, var7[var11], 0, false, (long) arg1.field9186, "<col=ffff00>" + var4, var13, var3.field8891, -1, 54, true, 0, false);
                        class177.field2235++;
                    }
                }
            }
        }
        class86.method647((long) arg1.field9186, class712.field9875.method3999(class553.field7667, (byte) -84), 0, arg0, (long) arg1.field9186, "<col=ffff00>" + var4, 1004, class538.field7439, -1, 95, true, 0, false);
        class130.field1679++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method3770(boolean arg0) {
        field9278 = null;
        if (arg0) {
            method3768(-102);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Z")
    public final boolean method941(byte arg0) {
        field9288++;
        if (arg0 != -79) {
            this.field9286 = null;
        }
        return this.field9286.method1860(this.field9284.field2220, (byte) 124);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)Z")
    public static final boolean method3771(boolean arg0) throws IOException {
        field9285++;
        if (class679.field9490 == null) {
            return false;
        }
        if (class350.field5090 == null) {
            if (class410.field5755) {
                if (!class679.field9490.method3633(1, 10)) {
                    return false;
                }
                class679.field9490.method3640(0, class315.field4517.field6979, 1, -49);
                class29.field239 = 0;
                class495.field6815++;
                class410.field5755 = false;
            }
            class315.field4517.field6962 = 0;
            if (class315.field4517.method2594(96)) {
                if (!class679.field9490.method3633(1, 10)) {
                    return false;
                }
                class679.field9490.method3640(1, class315.field4517.field6979, 1, -49);
                class495.field6815++;
                class29.field239 = 0;
            }
            class410.field5755 = true;
            class134[] var1 = class72.method539(11516);
            int var2 = class315.field4517.method2586(118);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class315.field4517.field6962);
            }
            class350.field5090 = var1[var2];
            class179.field2258 = class350.field5090.field1718;
        }
        if (class179.field2258 == -1) {
            if (!class679.field9490.method3633(1, 10)) {
                return false;
            }
            class679.field9490.method3640(0, class315.field4517.field6979, 1, -49);
            class495.field6815++;
            class179.field2258 = class315.field4517.field6979[0] & 0xFF;
            class29.field239 = 0;
        }
        if (class179.field2258 == -2) {
            if (!class679.field9490.method3633(2, 10)) {
                return false;
            }
            class679.field9490.method3640(0, class315.field4517.field6979, 2, -49);
            class315.field4517.field6962 = 0;
            class179.field2258 = class315.field4517.method3002(-1);
            class495.field6815 += 2;
            class29.field239 = 0;
        }
        if (class179.field2258 > 0) {
            if (!class679.field9490.method3633(class179.field2258, 10)) {
                return false;
            }
            class315.field4517.field6962 = 0;
            class679.field9490.method3640(0, class315.field4517.field6979, class179.field2258, -49);
            class495.field6815 += class179.field2258;
            class29.field239 = 0;
        }
        class499.field6844 = class434.field6026;
        class434.field6026 = class501.field6853;
        class501.field6853 = class350.field5090;
        if (class655.field9254 == class350.field5090) {
            String var3 = class315.field4517.method2993((byte) -62);
            int var4 = class315.field4517.method3002(-1);
            String var5 = class475.field6591.method2375((byte) -76, var4).method3712(0, class315.field4517);
            class99.method706(var3, var3, var4, var3, var5, (byte) -10, 19, null, 0);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class218.field2993) {
            int var6 = class315.field4517.method3004((byte) -126);
            class263.method1730(0);
            class464.method2788(2324, var6);
            class350.field5090 = null;
            return true;
        } else if (class498.field6829 == class350.field5090) {
            class625.method3600(81, class413.field5781);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class226.field3427) {
            boolean var7 = class315.field4517.method3013(85) == 1;
            String var8 = class315.field4517.method2993((byte) -41);
            long var9 = (long) class315.field4517.method3002(-1);
            long var11 = (long) class315.field4517.method2983(true);
            int var13 = class315.field4517.method3013(-114);
            long var14 = (var9 << 32) + var11;
            boolean var16 = false;
            Object var17 = null;
            class459 var18 = var7 ? class314.field4511 : class499.field6843;
            if (var18 == null) {
                var16 = true;
            } else {
                label2117: {
                    for (int var19 = 0; var19 < 100; var19++) {
                        if (class350.field5087[var19] == var14) {
                            var16 = true;
                            break label2117;
                        }
                    }
                    if (var13 <= 1) {
                        if (!(!class19.field127 || class84.field1021) || class780.field10724) {
                            var16 = true;
                        } else if (class57.method475(arg0, var8)) {
                            var16 = true;
                        }
                    }
                }
            }
            if (!var16 && class477.field6611 == 0) {
                class350.field5087[class646.field9037] = var14;
                class646.field9037 = (class646.field9037 + 1) % 100;
                String var20 = class224.method1516(class224.method1511(class315.field4517, 123), 126);
                int var21 = var7 ? 41 : 44;
                if (var13 == 2 || var13 == 3) {
                    class99.method706(var8, "<img=1>" + var8, -1, "<img=1>" + var8, var20, (byte) -10, var21, var18.field6418, 0);
                } else if (var13 == 1) {
                    class99.method706(var8, "<img=0>" + var8, -1, "<img=0>" + var8, var20, (byte) -10, var21, var18.field6418, 0);
                } else {
                    class99.method706(var8, var8, -1, var8, var20, (byte) -10, var21, var18.field6418, 0);
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class262.field3836) {
            int var22 = class315.field4517.method3032((byte) -108);
            int var23 = class315.field4517.method3042((byte) -100);
            class263.method1730(0);
            class559.method3289(var22, 15245, var23);
            class350.field5090 = null;
            return true;
        } else if (class387.field5516 == class350.field5090) {
            int var24 = class315.field4517.method2982((byte) -101);
            int var25 = class315.field4517.method3006(false);
            if (var25 == 65535) {
                var25 = -1;
            }
            String var26 = class315.field4517.method2993((byte) -71);
            int var27 = class315.field4517.method3013(96);
            if (var24 >= 1 && var24 <= 8) {
                if (var26.equalsIgnoreCase("null")) {
                    var26 = null;
                }
                class349.field5072[var24 - 1] = var26;
                class328.field4605[var24 - 1] = var25;
                class262.field3837[var24 - 1] = var27 == 0;
            }
            class350.field5090 = null;
            return true;
        } else if (class744.field10260 == class350.field5090) {
            boolean var28 = class315.field4517.method3013(-95) == 1;
            String var29 = class315.field4517.method2993((byte) -23);
            String var30 = var29;
            if (var28) {
                var30 = class315.field4517.method2993((byte) -23);
            }
            int var31 = class315.field4517.method3013(107);
            int var32 = class315.field4517.method3002(-1);
            boolean var33 = false;
            if (var31 <= 1 && class57.method475(arg0, var30)) {
                var33 = true;
            }
            if (!var33 && class477.field6611 == 0) {
                String var34 = class475.field6591.method2375((byte) -83, var32).method3712(0, class315.field4517);
                if (var31 == 2) {
                    class99.method706(var29, "<img=1>" + var29, var32, "<img=1>" + var30, var34, (byte) -10, 25, null, 0);
                } else if (var31 == 1) {
                    class99.method706(var29, "<img=0>" + var29, var32, "<img=0>" + var30, var34, (byte) -10, 25, null, 0);
                } else {
                    class99.method706(var29, var29, var32, var30, var34, (byte) -10, 25, null, 0);
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class384.field5498 == class350.field5090) {
            int var35 = class315.field4517.method3043(-31927);
            int var36 = class315.field4517.method3008(64);
            int var37 = class315.field4517.method3013(-107);
            String var38 = "";
            String var39 = var38;
            if ((var37 & 0x1) != 0) {
                var38 = class315.field4517.method2993((byte) -97);
                if ((var37 & 0x2) == 0) {
                    var39 = var38;
                } else {
                    var39 = class315.field4517.method2993((byte) -36);
                }
            }
            String var40 = class315.field4517.method2993((byte) -26);
            if (var35 == 99) {
                class629.method3616(false, var40);
            } else if (var39.equals("") || !class57.method475(arg0, var39)) {
                class727.method4042(var39, var38, (byte) -79, var38, var35, var36, var40);
            } else {
                class350.field5090 = null;
                return true;
            }
            class350.field5090 = null;
            return true;
        } else if (class705.field9806 == class350.field5090) {
            class110.method804(-5639);
            class350.field5090 = null;
            return false;
        } else if (class350.field5090 == class141.field1794) {
            int var41 = class315.field4517.method2978(25256);
            int var42 = class315.field4517.method2975(-127);
            int var43 = class315.field4517.method3016(-1);
            class263.method1730(0);
            class244.method1631(var43, var41, (byte) -26, var42);
            class350.field5090 = null;
            return true;
        } else if (class747.field10313 == class350.field5090) {
            int var44 = class315.field4517.method3013(-100);
            byte var45 = class315.field4517.method2980(false);
            class263.method1730(0);
            class551.method3252(var44, var45, (byte) -53);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class22.field203) {
            int var46 = class315.field4517.method3004((byte) -99);
            int var47 = class315.field4517.method3036((byte) -57);
            class263.method1730(0);
            if (var47 == 2) {
                class68.method524((byte) -24);
            }
            class610.field8597 = var46;
            class103.method724(var46, -1);
            class513.method3056(false, (byte) -14);
            class700.method3952(class610.field8597);
            for (int var48 = 0; var48 < 100; var48++) {
                class363.field5240[var48] = true;
            }
            class350.field5090 = null;
            return true;
        } else if (class589.field8311 == class350.field5090) {
            class315.field4517.field6962 += 28;
            if (class315.field4517.method3015(true)) {
                class563.method3333(class315.field4517.field6962 - 28, (byte) 86, class315.field4517);
            }
            class350.field5090 = null;
            return true;
        } else if (class397.field5628 == class350.field5090) {
            class625.method3600(-126, class212.field2926);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class290.field4279) {
            class625.method3600(-128, class60.field692);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class263.field3841) {
            class173.field2192.method3393((byte) 86);
            class673.field9448 += 32;
            class350.field5090 = null;
            return true;
        } else if (class85.field1028 == class350.field5090) {
            class25.field229 = class453.field6312;
            boolean var49 = class315.field4517.method3013(-114) == 1;
            class489 var50 = new class489(class315.field4517);
            class48 var51;
            if (var49) {
                var51 = class706.field9820;
            } else {
                var51 = class706.field9819;
            }
            var50.method2894(var51, -1);
            class350.field5090 = null;
            return true;
        } else if (class543.field7566 == class350.field5090) {
            int var52 = class315.field4517.method3042((byte) -100);
            if (var52 == 65535) {
                var52 = -1;
            }
            int var53 = class315.field4517.method2982((byte) -101);
            int var54 = var53 >> 2;
            int var55 = var53 & 0x3;
            int var56 = class775.field10668[var54];
            int var57 = class315.field4517.method2975(-122);
            int var58 = (var57 & 0x3DD402FC) >> 28;
            int var59 = var57 >> 14 & 0x3FFF;
            int var60 = var59 - class444.field6151;
            int var61 = var57 & 0x3FFF;
            int var62 = var61 - class236.field3535;
            class208.method1323(var54, var60, var62, var52, (byte) 34, var58, var55, var56);
            class350.field5090 = null;
            return true;
        } else if (class677.field9480 == class350.field5090) {
            class345.field5014 = class453.field6312;
            class45.field474 = 1;
            class350.field5090 = null;
            return true;
        } else if (class695.field9699 == class350.field5090) {
            class625.method3600(123, class358.field5151);
            class350.field5090 = null;
            return true;
        } else if (class97.field1137 == class350.field5090) {
            int var63 = class315.field4517.method3042((byte) -100);
            byte var64 = class315.field4517.method3023(-22454);
            class173.field2192.method3389(var63, -121, var64);
            class350.field5090 = null;
            return true;
        } else if (client.field1291 == class350.field5090) {
            boolean var65 = class315.field4517.method3013(-128) == 1;
            String var66 = class315.field4517.method2993((byte) -37);
            String var67 = var66;
            if (var65) {
                var67 = class315.field4517.method2993((byte) -69);
            }
            int var68 = class315.field4517.method3013(-103);
            boolean var69 = false;
            if (var68 <= 1) {
                if (!(!class19.field127 || class84.field1021) || class780.field10724) {
                    var69 = true;
                } else if (var68 <= 1 && class57.method475(false, var67)) {
                    var69 = true;
                }
            }
            if (!var69 && class477.field6611 == 0) {
                String var70 = class224.method1516(class224.method1511(class315.field4517, 116), 127);
                if (var68 == 2) {
                    class99.method706(var66, "<img=1>" + var66, -1, "<img=1>" + var67, var70, (byte) -10, 24, null, 0);
                } else if (var68 == 1) {
                    class99.method706(var66, "<img=0>" + var66, -1, "<img=0>" + var67, var70, (byte) -10, 24, null, 0);
                } else {
                    class99.method706(var66, var66, -1, var67, var70, (byte) -10, 24, null, 0);
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class393.field5592 == class350.field5090) {
            int var71 = class315.field4517.method3013(-128);
            boolean var72 = (var71 & 0x1) == 1;
            String var73 = class315.field4517.method2993((byte) -85);
            String var74 = class315.field4517.method2993((byte) -110);
            if (var74.equals("")) {
                var74 = var73;
            }
            String var75 = class315.field4517.method2993((byte) -32);
            String var76 = class315.field4517.method2993((byte) -127);
            if (var76.equals("")) {
                var76 = var75;
            }
            if (var72) {
                for (int var77 = 0; var77 < class302.field4404; var77++) {
                    if (class538.field7433[var77].equals(var76)) {
                        class17.field100[var77] = var73;
                        class538.field7433[var77] = var74;
                        class554.field7679[var77] = var75;
                        class133.field1698[var77] = var76;
                        break;
                    }
                }
            } else {
                class17.field100[class302.field4404] = var73;
                class538.field7433[class302.field4404] = var74;
                class554.field7679[class302.field4404] = var75;
                class133.field1698[class302.field4404] = var76;
                class319.field4522[class302.field4404] = class407.method2490(var71, 2) == 2;
                class302.field4404++;
            }
            class350.field5090 = null;
            class345.field5014 = class453.field6312;
            return true;
        } else if (class706.field9815 == class350.field5090) {
            int var78 = class315.field4517.method2987(107);
            int var79 = class315.field4517.method3002(-1);
            class263.method1730(0);
            if (var79 == 65535) {
                var79 = -1;
            }
            class73.method548(2, 72, var78, var79, -1);
            class350.field5090 = null;
            return true;
        } else if (class476.field6600 == class350.field5090) {
            class747.field10320 = class453.field6312;
            boolean var80 = class315.field4517.method3013(55) == 1;
            if (class179.field2258 != 1) {
                if (var80) {
                    class314.field4511 = new class459(class315.field4517);
                } else {
                    class499.field6843 = new class459(class315.field4517);
                }
                class350.field5090 = null;
                return true;
            }
            class350.field5090 = null;
            if (var80) {
                class314.field4511 = null;
            } else {
                class499.field6843 = null;
            }
            return true;
        } else if (class461.field6452 == class350.field5090) {
            int var81 = class315.field4517.method3004((byte) -107);
            int var82 = class315.field4517.method3042((byte) -100);
            if (var82 == 65535) {
                var82 = -1;
            }
            int var83 = class315.field4517.method3006(arg0);
            if (var83 == 65535) {
                var83 = -1;
            }
            int var84 = class315.field4517.method2975(-126);
            class263.method1730(0);
            for (int var85 = var83; var85 <= var82; var85++) {
                long var86 = ((long) var84 << 32) + (long) var85;
                class174 var88 = (class174) class638.field8966.method3669(false, var86);
                class174 var89;
                if (var88 != null) {
                    var89 = new class174(var88.field2201, var81);
                    var88.method527(-11229);
                } else if (var85 == -1) {
                    var89 = new class174(class384.method2387(false, var84).field1500.field2201, var81);
                } else {
                    var89 = new class174(0, var81);
                }
                class638.field8966.method3666((byte) 65, var86, var89);
            }
            class350.field5090 = null;
            return true;
        } else if (class484.field6694 == class350.field5090) {
            int var90 = class315.field4517.method3006(arg0);
            int var91 = class315.field4517.method3006(arg0);
            int var92 = class315.field4517.method3032((byte) -90);
            int var93 = class315.field4517.method3006(false);
            class263.method1730(0);
            class73.method548(7, -123, var92, var90 << 16 | var91, var93);
            class350.field5090 = null;
            return true;
        } else if (class438.field6069 == class350.field5090) {
            int var94 = class315.field4517.method2982((byte) -101);
            int var95 = class315.field4517.method2976(43);
            int var96 = class315.field4517.method3036((byte) -57);
            int var97 = class315.field4517.method2976(64);
            int var98 = class315.field4517.method3006(false);
            class263.method1730(0);
            class412.field5778[var94] = true;
            class177.field2237[var94] = var97;
            class692.field9665[var94] = var96;
            class646.field9036[var94] = var95;
            class189.field2364[var94] = var98;
            class350.field5090 = null;
            return true;
        } else if (class510.field6906 == class350.field5090) {
            boolean var99 = class315.field4517.method3013(127) == 1;
            byte[] var100 = new byte[class179.field2258 - 1];
            class315.field4517.method3014(class179.field2258 - 1, var100, 75212712, 0);
            class712.method4001(var100, var99, 0);
            class350.field5090 = null;
            return true;
        } else if (class653.field9114 == class350.field5090) {
            boolean var101 = class315.field4517.method3013(110) == 1;
            String var102 = class315.field4517.method2993((byte) -97);
            String var103 = var102;
            if (var101) {
                var103 = class315.field4517.method2993((byte) -125);
            }
            long var104 = (long) class315.field4517.method3002(-1);
            long var106 = (long) class315.field4517.method2983(true);
            int var108 = class315.field4517.method3013(-128);
            int var109 = class315.field4517.method3002(-1);
            long var110 = (var104 << 32) + var106;
            boolean var112 = false;
            int var113 = 0;
            while (true) {
                if (var113 >= 100) {
                    if (var108 <= 1 && class57.method475(false, var103)) {
                        var112 = true;
                    }
                    break;
                }
                if (class350.field5087[var113] == var110) {
                    var112 = true;
                    break;
                }
                var113++;
            }
            if (!var112 && class477.field6611 == 0) {
                class350.field5087[class646.field9037] = var110;
                class646.field9037 = (class646.field9037 + 1) % 100;
                String var114 = class475.field6591.method2375((byte) -127, var109).method3712(0, class315.field4517);
                if (var108 == 2) {
                    class99.method706(var102, "<img=1>" + var102, var109, "<img=1>" + var103, var114, (byte) -10, 18, null, 0);
                } else if (var108 == 1) {
                    class99.method706(var102, "<img=0>" + var102, var109, "<img=0>" + var103, var114, (byte) -10, 18, null, 0);
                } else {
                    class99.method706(var102, var102, var109, var103, var114, (byte) -10, 18, null, 0);
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class131.field1687) {
            int var115 = class315.field4517.method2982((byte) -101);
            int var116 = class315.field4517.method3036((byte) -57);
            if (var115 == 255) {
                var116 = -1;
                var115 = -1;
            }
            class195.method1280(var115, var116, 15);
            class350.field5090 = null;
            return true;
        } else if (class378.field5429 == class350.field5090) {
            boolean var117 = class315.field4517.method3013(-108) == 1;
            String var118 = class315.field4517.method2993((byte) -124);
            String var119 = var118;
            if (var117) {
                var119 = class315.field4517.method2993((byte) -35);
            }
            long var120 = class315.field4517.method3020(true);
            long var122 = (long) class315.field4517.method3002(-1);
            long var124 = (long) class315.field4517.method2983(!arg0);
            int var126 = class315.field4517.method3013(-112);
            int var127 = class315.field4517.method3002(-1);
            long var128 = (var122 << 32) + var124;
            boolean var130 = false;
            int var131 = 0;
            while (true) {
                if (var131 >= 100) {
                    if (var126 <= 1 && class57.method475(arg0, var119)) {
                        var130 = true;
                    }
                    break;
                }
                if (class350.field5087[var131] == var128) {
                    var130 = true;
                    break;
                }
                var131++;
            }
            if (!var130 && class477.field6611 == 0) {
                class350.field5087[class646.field9037] = var128;
                class646.field9037 = (class646.field9037 + 1) % 100;
                String var132 = class475.field6591.method2375((byte) -93, var127).method3712(0, class315.field4517);
                if (var126 == 2) {
                    class99.method706(var118, "<img=1>" + var118, var127, "<img=1>" + var119, var132, (byte) -10, 20, class612.method3539(var120, (byte) 59), 0);
                } else if (var126 == 1) {
                    class99.method706(var118, "<img=0>" + var118, var127, "<img=0>" + var119, var132, (byte) -10, 20, class612.method3539(var120, (byte) 70), 0);
                } else {
                    class99.method706(var118, var118, var127, var119, var132, (byte) -10, 20, class612.method3539(var120, (byte) 106), 0);
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class217.field2985) {
            while (class179.field2258 > class315.field4517.field6962) {
                boolean var143 = class315.field4517.method3013(9) == 1;
                String var144 = class315.field4517.method2993((byte) -90);
                String var145 = class315.field4517.method2993((byte) -117);
                int var146 = class315.field4517.method3002(-1);
                int var147 = class315.field4517.method3013(64);
                String var148 = "";
                boolean var149 = false;
                if (var146 > 0) {
                    var148 = class315.field4517.method2993((byte) -57);
                    var149 = class315.field4517.method3013(1) == 1;
                }
                for (int var150 = 0; var150 < class688.field9600; var150++) {
                    if (var143) {
                        if (var145.equals(class396.field5622[var150])) {
                            class396.field5622[var150] = var144;
                            class715.field9932[var150] = var145;
                            var144 = null;
                            break;
                        }
                    } else if (var144.equals(class396.field5622[var150])) {
                        if (class617.field8669[var150] != var146) {
                            boolean var151 = true;
                            for (class666 var152 = (class666) class195.field2765.method3103((byte) 72); var152 != null; var152 = (class666) class195.field2765.method3104(-10964)) {
                                if (var152.field9359.equals(var144)) {
                                    if (var146 != 0 && var152.field9360 == 0) {
                                        var151 = false;
                                        var152.method2773(69);
                                    } else if (var146 == 0 && var152.field9360 != 0) {
                                        var152.method2773(92);
                                        var151 = false;
                                    }
                                }
                            }
                            if (var151) {
                                class195.field2765.method3100(new class666(var144, var146), true);
                            }
                            class617.field8669[var150] = var146;
                        }
                        class715.field9932[var150] = var145;
                        class712.field9918[var150] = var148;
                        class665.field9349[var150] = var147;
                        var144 = null;
                        class253.field3744[var150] = var149;
                        break;
                    }
                }
                if (var144 != null && class688.field9600 < 200) {
                    class396.field5622[class688.field9600] = var144;
                    class715.field9932[class688.field9600] = var145;
                    class617.field8669[class688.field9600] = var146;
                    class712.field9918[class688.field9600] = var148;
                    class665.field9349[class688.field9600] = var147;
                    class253.field3744[class688.field9600] = var149;
                    class688.field9600++;
                }
            }
            class45.field474 = 2;
            class345.field5014 = class453.field6312;
            boolean var133 = false;
            int var134 = class688.field9600;
            while (var134 > 0) {
                boolean var135 = true;
                var134--;
                for (int var136 = 0; var136 < var134; var136++) {
                    if (class617.field8669[var136] != class735.field10134.field8306 && class617.field8669[var136 + 1] == class735.field10134.field8306 || class617.field8669[var136] == 0 && class617.field8669[var136 + 1] != 0) {
                        int var137 = class617.field8669[var136];
                        class617.field8669[var136] = class617.field8669[var136 + 1];
                        class617.field8669[var136 + 1] = var137;
                        String var138 = class712.field9918[var136];
                        class712.field9918[var136] = class712.field9918[var136 + 1];
                        class712.field9918[var136 + 1] = var138;
                        String var139 = class396.field5622[var136];
                        class396.field5622[var136] = class396.field5622[var136 + 1];
                        class396.field5622[var136 + 1] = var139;
                        String var140 = class715.field9932[var136];
                        class715.field9932[var136] = class715.field9932[var136 + 1];
                        class715.field9932[var136 + 1] = var140;
                        int var141 = class665.field9349[var136];
                        class665.field9349[var136] = class665.field9349[var136 + 1];
                        class665.field9349[var136 + 1] = var141;
                        boolean var142 = class253.field3744[var136];
                        class253.field3744[var136] = class253.field3744[var136 + 1];
                        class253.field3744[var136 + 1] = var142;
                        var135 = false;
                    }
                }
                if (var135) {
                    break;
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class467.field6493 == class350.field5090) {
            int var153 = class315.field4517.method3006(arg0);
            int var154 = class315.field4517.method2975(-122);
            int var155 = class315.field4517.method3042((byte) -100);
            int var156 = class315.field4517.method3042((byte) -100);
            class263.method1730(0);
            class612.method3540(false, var156, var155, var154, var153);
            class350.field5090 = null;
            return true;
        } else if (class409.field5751 == class350.field5090) {
            int var157 = class315.field4517.method3042((byte) -100);
            int var158 = class315.field4517.method2976(34);
            int var159 = class315.field4517.method2975(-114);
            int var160 = class315.field4517.method3006(false);
            class263.method1730(0);
            class589.method3448(var157, (byte) 6, var160, var158, var159);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class313.field4495) {
            int var161 = class315.field4517.method2987(-105);
            String var162 = class315.field4517.method2993((byte) -124);
            class263.method1730(0);
            class47.method386(var162, false, var161);
            class350.field5090 = null;
            return true;
        } else if (class648.field9061 == class350.field5090) {
            int var163 = class315.field4517.method3004((byte) -101);
            class263.method1730(0);
            class128.method878(var163, -1805);
            class350.field5090 = null;
            return true;
        } else if (class554.field7674 == class350.field5090) {
            class747.field10320 = class453.field6312;
            boolean var164 = class315.field4517.method3013(24) == 1;
            class103 var165 = new class103(class315.field4517);
            class459 var166;
            if (var164) {
                var166 = class314.field4511;
            } else {
                var166 = class499.field6843;
            }
            var165.method726(var166, (byte) 75);
            class350.field5090 = null;
            return true;
        } else if (class444.field6152 == class350.field5090) {
            int var167 = class315.field4517.method3042((byte) -100);
            int var168 = class315.field4517.method2987(-27);
            class173.field2192.method3389(var167, -52, var168);
            class350.field5090 = null;
            return true;
        } else if (class593.field8342 == class350.field5090) {
            int var169 = class315.field4517.method3042((byte) -100);
            int var170 = class315.field4517.method2975(-105);
            class263.method1730(0);
            class486.method2887(1, var169, var170);
            class350.field5090 = null;
            return true;
        } else if (class401.field5663 == class350.field5090) {
            int var171 = class315.field4517.method3032((byte) -111);
            class263.method1730(0);
            if (var171 == -1) {
                class5.field30 = -1;
                class362.field5225 = -1;
            } else {
                int var172 = (var171 & 0xFFFFDC7) >> 14;
                int var173 = var171 & 0x3FFF;
                int var174 = var172 - class444.field6151;
                int var175 = var173 - class236.field3535;
                if (var174 < 0) {
                    var174 = 0;
                } else if (class741.field10208 <= var174) {
                    var174 = class741.field10208;
                }
                class5.field30 = (var174 << 9) + 256;
                if (var175 < 0) {
                    var175 = 0;
                } else if (var175 >= class525.field7224) {
                    var175 = class525.field7224;
                }
                class362.field5225 = (var175 << 9) + 256;
            }
            class350.field5090 = null;
            return true;
        } else if (class629.field8802 == class350.field5090) {
            int var176 = class315.field4517.method3002(-1);
            int var177 = class315.field4517.method3013(-119);
            boolean var178 = (var177 & 0x1) == 1;
            while (class179.field2258 > class315.field4517.field6962) {
                int var179 = class315.field4517.method3043(-31927);
                int var180 = class315.field4517.method3002(-1);
                int var181 = 0;
                if (var180 != 0) {
                    var181 = class315.field4517.method3013(-98);
                    if (var181 == 255) {
                        var181 = class315.field4517.method3008(64);
                    }
                }
                class406.method2487(var181, (byte) -11, var180 - 1, var178, var179, var176);
            }
            class43.field461[class407.method2490(class764.field10507++, 31)] = var176;
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class231.field3474) {
            class176.field2226 = class315.field4517.method2982((byte) -101) == 1;
            class350.field5090 = null;
            return true;
        } else if (class591.field8329 == class350.field5090) {
            int var182 = class315.field4517.method3002(-1);
            int var183 = class315.field4517.method3013(-108);
            boolean var184 = (var183 & 0x1) == 1;
            class609.method3529(var184, var182, (byte) -45);
            class43.field461[class407.method2490(class764.field10507++, 31)] = var182;
            class350.field5090 = null;
            return true;
        } else if (class676.field9478 == class350.field5090) {
            class625.method3600(-128, class722.field9960);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class18.field115) {
            int var185 = class315.field4517.method3042((byte) -100);
            if (var185 == 65535) {
                var185 = -1;
            }
            int var186 = class315.field4517.method2987(-58);
            class263.method1730(0);
            class73.method548(1, 4, var186, var185, -1);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class148.field1923) {
            int var187 = class315.field4517.method3036((byte) -57);
            int var188 = class315.field4517.method2976(105);
            int var189 = class315.field4517.method3002(-1);
            if (var189 == 65535) {
                var189 = -1;
            }
            class255.method1703(var189, -3798, var188, var187);
            class350.field5090 = null;
            return true;
        } else if (class773.field10650 == class350.field5090) {
            int var190 = class315.field4517.method3029(-17738);
            int var191 = class315.field4517.method3004((byte) -120);
            if (var191 == 65535) {
                var191 = -1;
            }
            int var192 = class315.field4517.method3013(-1);
            class702.method3972(var192, -1, var191, var190);
            class350.field5090 = null;
            return true;
        } else if (class382.field5482 == class350.field5090) {
            int var193 = class315.field4517.method3002(-1);
            int var194 = class315.field4517.method2975(-116);
            int var195 = class315.field4517.method2987(-20);
            class263.method1730(0);
            class73.method548(5, -113, var194, var193, var195);
            class350.field5090 = null;
            return true;
        } else if (class67.field741 == class350.field5090) {
            String var196 = class315.field4517.method2993((byte) -79);
            int var197 = class315.field4517.method3002(-1);
            class263.method1730(0);
            class197.method1284(var197, var196, -125);
            class350.field5090 = null;
            return true;
        } else if (class761.field10448 == class350.field5090) {
            int var198 = class315.field4517.method3008(64);
            int var199 = class315.field4517.method3032((byte) -127);
            class263.method1730(0);
            class610 var200 = (class610) class278.field3993.method3669(arg0, (long) var198);
            class610 var201 = (class610) class278.field3993.method3669(false, (long) var199);
            if (var201 != null) {
                class47.method387(var200 == null || var200.field8600 != var201.field8600, (byte) 125, false, var201);
            }
            if (var200 != null) {
                var200.method527(-11229);
                class278.field3993.method3666((byte) 65, (long) var199, var200);
            }
            class115 var202 = class384.method2387(false, var198);
            if (var202 != null) {
                class43.method336(-1, var202);
            }
            class115 var203 = class384.method2387(arg0, var199);
            if (var203 != null) {
                class43.method336(-1, var203);
                class324.method2053((byte) -76, var203, true);
            }
            if (class610.field8597 != -1) {
                class748.method4145(1, class610.field8597, 1);
            }
            class350.field5090 = null;
            return true;
        } else if (class609.field8583 == class350.field5090) {
            int var204 = class315.field4517.method3013(73);
            int var205 = var204 >> 5;
            int var206 = var204 & 0x1F;
            if (var206 == 0) {
                class115.field1569[var205] = null;
                class350.field5090 = null;
                return true;
            }
            class657 var207 = new class657();
            var207.field9270 = var206;
            var207.field9268 = class315.field4517.method3013(-99);
            if (var207.field9268 >= 0 && var207.field9268 < class182.field2292.length) {
                if (var207.field9270 == 1 || var207.field9270 == 10) {
                    var207.field9275 = class315.field4517.method3002(-1);
                    class315.field4517.field6962 += 6;
                } else if (var207.field9270 >= 2 && var207.field9270 <= 6) {
                    if (var207.field9270 == 2) {
                        var207.field9277 = 256;
                        var207.field9272 = 256;
                    }
                    if (var207.field9270 == 3) {
                        var207.field9272 = 256;
                        var207.field9277 = 0;
                    }
                    if (var207.field9270 == 4) {
                        var207.field9277 = 512;
                        var207.field9272 = 256;
                    }
                    if (var207.field9270 == 5) {
                        var207.field9277 = 256;
                        var207.field9272 = 0;
                    }
                    if (var207.field9270 == 6) {
                        var207.field9277 = 256;
                        var207.field9272 = 512;
                    }
                    var207.field9270 = 2;
                    var207.field9271 = class315.field4517.method3013(94);
                    var207.field9277 += class315.field4517.method3002(-1) - class444.field6151 << 9;
                    var207.field9272 += class315.field4517.method3002(-1) - class236.field3535 << 9;
                    var207.field9264 = class315.field4517.method3013(-119) << 2;
                    var207.field9263 = class315.field4517.method3002(-1);
                }
                var207.field9266 = class315.field4517.method3002(-1);
                if (var207.field9266 == 65535) {
                    var207.field9266 = -1;
                }
                class115.field1569[var205] = var207;
            }
            class350.field5090 = null;
            return true;
        } else if (class385.field5504 == class350.field5090) {
            int var208 = class315.field4517.method3032((byte) -116);
            int var209 = class315.field4517.method3042((byte) -100);
            class263.method1730(0);
            if (var209 == 65535) {
                var209 = -1;
            }
            class340.method2152(var209, 16, var208);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class297.field4328) {
            class701.field9770 = class315.field4517.method3023(-22454) << 3;
            class153.field2002 = class315.field4517.method3030(-25984) << 3;
            class372.field5354 = class315.field4517.method3036((byte) -57);
            while (class179.field2258 > class315.field4517.field6962) {
                class91 var210 = class184.method1156((byte) -63)[class315.field4517.method3013(14)];
                class625.method3600(-128, var210);
            }
            class350.field5090 = null;
            return true;
        } else if (class448.field6280 == class350.field5090) {
            class625.method3600(-127, class164.field2095);
            class350.field5090 = null;
            return true;
        } else if (class661.field9297 == class350.field5090) {
            int var211 = class315.field4517.method2976(76);
            int var212 = class315.field4517.method3004((byte) -113) << 2;
            int var213 = class315.field4517.method3036((byte) -57);
            int var214 = class315.field4517.method3036((byte) -57);
            int var215 = class315.field4517.method3036((byte) -57);
            class263.method1730(0);
            class477.method2841(var213, var211, var215, var214, -117, var212);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class119.field1588) {
            int var216 = class315.field4517.method3004((byte) -115);
            int var217 = class315.field4517.method3042((byte) -100);
            class263.method1730(0);
            class156.method1010(30512, 0, var216, var217);
            class350.field5090 = null;
            return true;
        } else if (class635.field8858 == class350.field5090) {
            int var218 = class315.field4517.method3002(-1);
            if (var218 == 65535) {
                var218 = -1;
            }
            int var219 = class315.field4517.method3013(-114);
            int var220 = class315.field4517.method3002(-1);
            int var221 = class315.field4517.method3013(20);
            int var222 = class315.field4517.method3002(-1);
            class324.method2056(var219, 0, var221, false, var220, var218, var222);
            class350.field5090 = null;
            return true;
        } else if (class463.field6466 == class350.field5090) {
            boolean var223 = class315.field4517.method3013(18) == 1;
            String var224 = class315.field4517.method2993((byte) -99);
            String var225 = var224;
            if (var223) {
                var225 = class315.field4517.method2993((byte) -121);
            }
            long var226 = class315.field4517.method3020(true);
            long var228 = (long) class315.field4517.method3002(-1);
            long var230 = (long) class315.field4517.method2983(true);
            int var232 = class315.field4517.method3013(-119);
            long var233 = (var228 << 32) + var230;
            boolean var235 = false;
            int var236 = 0;
            while (true) {
                if (var236 >= 100) {
                    if (var232 <= 1) {
                        if (!(!class19.field127 || class84.field1021) || class780.field10724) {
                            var235 = true;
                        } else if (class57.method475(false, var225)) {
                            var235 = true;
                        }
                    }
                    break;
                }
                if (class350.field5087[var236] == var233) {
                    var235 = true;
                    break;
                }
                var236++;
            }
            if (!var235 && class477.field6611 == 0) {
                class350.field5087[class646.field9037] = var233;
                class646.field9037 = (class646.field9037 + 1) % 100;
                String var237 = class224.method1516(class224.method1511(class315.field4517, 120), 125);
                if (var232 == 2 || var232 == 3) {
                    class99.method706(var224, "<img=1>" + var224, -1, "<img=1>" + var225, var237, (byte) -10, 9, class612.method3539(var226, (byte) 39), 0);
                } else if (var232 == 1) {
                    class99.method706(var224, "<img=0>" + var224, -1, "<img=0>" + var225, var237, (byte) -10, 9, class612.method3539(var226, (byte) 114), 0);
                } else {
                    class99.method706(var224, var224, -1, var225, var237, (byte) -10, 9, class612.method3539(var226, (byte) 41), 0);
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class497.field6821 == class350.field5090) {
            class531.field7313 = class315.field4517.method2979(75212712);
            class19.field127 = class315.field4517.method3013(-103) == 1;
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class325.field4581) {
            int var238 = class315.field4517.method2978(25256);
            int var239 = class315.field4517.method3032((byte) -97);
            class263.method1730(0);
            class589.method3451(var239, (byte) -93, var238);
            class350.field5090 = null;
            return true;
        } else if (class534.field7345 == class350.field5090) {
            int var240 = class315.field4517.method2975(-106);
            int var241 = class315.field4517.method3004((byte) -113);
            class173.field2192.method3391((byte) 103, var240, var241);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class270.field3903) {
            class625.method3600(21, class419.field5830);
            class350.field5090 = null;
            return true;
        } else if (class494.field6797 == class350.field5090) {
            boolean var242 = class315.field4517.method2982((byte) -101) == 1;
            class263.method1730(0);
            class73.field814 = var242;
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class221.field3005) {
            class625.method3600(-44, class221.field3022);
            class350.field5090 = null;
            return true;
        } else if (class568.field8012 == class350.field5090) {
            int var243 = class315.field4517.method3002(-1);
            if (var243 == 65535) {
                var243 = -1;
            }
            int var244 = class315.field4517.method3013(-91);
            int var245 = class315.field4517.method3002(-1);
            int var246 = class315.field4517.method3013(-2);
            int var247 = class315.field4517.method3002(-1);
            class68.method522(var243, var244, var247, var245, (byte) 102, var246);
            class350.field5090 = null;
            return true;
        } else if (class671.field9411 == class350.field5090) {
            class350.field5090 = null;
            return false;
        } else if (class395.field5605 == class350.field5090) {
            int var248 = class315.field4517.method2987(126);
            class263.method1730(0);
            class73.method548(5, 95, var248, class173.field2193, 0);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class205.field2874) {
            class633.field8839 = class179.field2258 > 2 ? class315.field4517.method2993((byte) -29) : class712.field9879.method3999(class553.field7667, (byte) -85);
            class345.field5008 = class179.field2258 > 0 ? class315.field4517.method3002(-1) : -1;
            class350.field5090 = null;
            if (class345.field5008 == 65535) {
                class345.field5008 = -1;
            }
            return true;
        } else if (class350.field5090 == class341.field4948) {
            class701.field9770 = class315.field4517.method3023(-22454) << 3;
            class153.field2002 = class315.field4517.method2980(false) << 3;
            class372.field5354 = class315.field4517.method2976(58);
            class350.field5090 = null;
            return true;
        } else if (class429.field5985 == class350.field5090) {
            class263.method1730(0);
            class180.method1147(false);
            class350.field5090 = null;
            return true;
        } else if (class564.field7979 == class350.field5090) {
            String var249 = class315.field4517.method2993((byte) -43);
            int var250 = class315.field4517.method3042((byte) -100);
            class263.method1730(0);
            class197.method1284(var250, var249, -128);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class345.field4982) {
            if (class661.field9305 != null) {
                class234.method1602(class688.field9602.field8518.method3732((byte) -98), false, -1, 16367, -1);
            }
            byte[] var251 = new byte[class179.field2258];
            class315.field4517.method2589(var251, 0, class179.field2258, 0);
            String var252 = class116.method845(class179.field2258, 0, var251, -28992);
            class407.method2491(class688.field9602.field8517.method2604((byte) -98) == 1, 35, true, class129.field1674, var252);
            class350.field5090 = null;
            return true;
        } else if (class57.field669 == class350.field5090) {
            int var253 = class315.field4517.method2975(-126);
            int var254 = class315.field4517.method3042((byte) -100);
            int var255 = class315.field4517.method3004((byte) -109);
            class263.method1730(0);
            class390.method2418(-107, (var255 << 16) + var254, var253);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class180.field2282) {
            int var256 = class315.field4517.method2975(-110);
            int var257 = class315.field4517.method3002(-1);
            class263.method1730(0);
            class4.method13((byte) -88, var257, var256);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class156.field2031) {
            int var258 = class315.field4517.method3013(100);
            if (class315.field4517.method3013(-120) == 0) {
                class744.field10274[var258] = new class609();
            } else {
                class315.field4517.field6962--;
                class744.field10274[var258] = new class609(class315.field4517);
            }
            class350.field5090 = null;
            class497.field6824 = class453.field6312;
            return true;
        } else if (class611.field8604 == class350.field5090) {
            int var259 = class315.field4517.method3002(-1);
            int var260 = class315.field4517.method2976(82);
            int var261 = class315.field4517.method3032((byte) -100);
            class263.method1730(0);
            class610 var262 = (class610) class278.field3993.method3669(false, (long) var261);
            if (var262 != null) {
                class47.method387(var262.field8600 != var259, (byte) 125, false, var262);
            }
            class475.method2833(false, var259, var261, false, var260);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class262.field3835) {
            class625.method3600(127, class554.field7678);
            class350.field5090 = null;
            return true;
        } else if (class683.field9566 == class350.field5090) {
            int var263 = class315.field4517.method3002(-1);
            int var264 = class315.field4517.method3013(14);
            boolean var265 = (var264 & 0x1) == 1;
            class686.method3905(var265, var263, -94);
            int var266 = class315.field4517.method3002(-1);
            for (int var267 = 0; var267 < var266; var267++) {
                int var268 = class315.field4517.method3013(-91);
                if (var268 == 255) {
                    var268 = class315.field4517.method3032((byte) -117);
                }
                int var269 = class315.field4517.method3004((byte) -124);
                class406.method2487(var268, (byte) -119, var269 - 1, var265, var267, var263);
            }
            class43.field461[class407.method2490(class764.field10507++, 31)] = var263;
            class350.field5090 = null;
            return true;
        } else if (class630.field8822 == class350.field5090) {
            class546.method3233(-117);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class153.field2005) {
            int var270 = class315.field4517.method3032((byte) -99);
            int var271 = class315.field4517.method3042((byte) -100);
            if (var271 == 65535) {
                var271 = -1;
            }
            int var272 = class315.field4517.method3008(64);
            class263.method1730(0);
            class446.method2706(var272, var271, var270, (byte) -113);
            class581 var273 = class35.field367.method3051((byte) -20, var271);
            class612.method3540(false, var273.field8204, var273.field8168, var270, var273.field8196);
            class178.method1132(-1, var273.field8205, var273.field8208, var273.field8155, var270);
            class350.field5090 = null;
            return true;
        } else if (class665.field9340 == class350.field5090) {
            boolean var274 = class315.field4517.method3013(16) == 1;
            String var275 = class315.field4517.method2993((byte) -102);
            long var276 = (long) class315.field4517.method3002(-1);
            long var278 = (long) class315.field4517.method2983(true);
            int var280 = class315.field4517.method3013(13);
            int var281 = class315.field4517.method3002(-1);
            long var282 = (var276 << 32) + var278;
            boolean var284 = false;
            Object var285 = null;
            class459 var286 = var274 ? class314.field4511 : class499.field6843;
            if (var286 == null) {
                var284 = true;
            } else {
                label2161: {
                    for (int var287 = 0; var287 < 100; var287++) {
                        if (class350.field5087[var287] == var282) {
                            var284 = true;
                            break label2161;
                        }
                    }
                    if (var280 <= 1 && class57.method475(arg0, var275)) {
                        var284 = true;
                    }
                }
            }
            if (!var284 && class477.field6611 == 0) {
                class350.field5087[class646.field9037] = var282;
                class646.field9037 = (class646.field9037 + 1) % 100;
                String var288 = class475.field6591.method2375((byte) -120, var281).method3712(0, class315.field4517);
                int var289 = var274 ? 42 : 45;
                if (var280 == 2 || var280 == 3) {
                    class99.method706(var275, "<img=1>" + var275, var281, "<img=1>" + var275, var288, (byte) -10, var289, var286.field6418, 0);
                } else if (var280 == 1) {
                    class99.method706(var275, "<img=0>" + var275, var281, "<img=0>" + var275, var288, (byte) -10, var289, var286.field6418, 0);
                } else {
                    class99.method706(var275, var275, var281, var275, var288, (byte) -10, var289, var286.field6418, 0);
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class399.field5644 == class350.field5090) {
            class742.method4111(class179.field2258, class315.field4517, (byte) -107, class129.field1674);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class134.field1717) {
            class625.method3600(-127, class247.field3675);
            class350.field5090 = null;
            return true;
        } else if (class535.field7397 == class350.field5090) {
            int var290 = class315.field4517.method3008(64);
            class531.field7317 = class129.field1674.method4233(0, var290);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class115.field1401) {
            int var291 = class315.field4517.method2976(40);
            int var292 = class315.field4517.method3006(false);
            int var293 = class315.field4517.method3008(64);
            int var294 = class315.field4517.method3002(-1);
            class263.method1730(0);
            class96.method692(var293, var291, false, var294, var292);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class349.field5081) {
            class308.field4452 = class315.field4517.method2989(-75);
            if (class308.field4452 == 0 || class308.field4452 == 1) {
                class199.field2812 = true;
            }
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class102.field1183) {
            int var295 = class315.field4517.method2975(-103);
            int var296 = class315.field4517.method3042((byte) -100);
            class263.method1730(0);
            class699.method3945(var296, var295, 12);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class249.field3703) {
            int var297 = class315.field4517.method2976(33);
            int var298 = class315.field4517.method2982((byte) -101);
            int var299 = class315.field4517.method3032((byte) -118);
            class141.field1796[var298] = var299;
            class650.field9085[var298] = var297;
            class626.field8772[var298] = 1;
            int var300 = class498.field6834[var298] - 1;
            for (int var301 = 0; var301 < var300; var301++) {
                if (var299 >= class327.field4602[var301]) {
                    class626.field8772[var298] = var301 + 2;
                }
            }
            class314.field4509[class407.method2490(class409.field5747++, 31)] = var298;
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class281.field4037) {
            int var302 = class315.field4517.method3008(64);
            int var303 = class315.field4517.method3036((byte) -57);
            class263.method1730(0);
            class456.method2748(var302, var303, 7);
            class350.field5090 = null;
            return true;
        } else if (class724.field10028 == class350.field5090) {
            boolean var304 = class315.field4517.method3013(126) == 1;
            String var305 = class315.field4517.method2993((byte) -27);
            String var306 = var305;
            if (var304) {
                var306 = class315.field4517.method2993((byte) -52);
            }
            long var307 = (long) class315.field4517.method3002(-1);
            long var309 = (long) class315.field4517.method2983(true);
            int var311 = class315.field4517.method3013(-119);
            long var312 = (var307 << 32) + var309;
            boolean var314 = false;
            int var315 = 0;
            while (true) {
                if (var315 >= 100) {
                    if (var311 <= 1) {
                        if (!(!class19.field127 || class84.field1021) || class780.field10724) {
                            var314 = true;
                        } else if (class57.method475(arg0, var306)) {
                            var314 = true;
                        }
                    }
                    break;
                }
                if (class350.field5087[var315] == var312) {
                    var314 = true;
                    break;
                }
                var315++;
            }
            if (!var314 && class477.field6611 == 0) {
                class350.field5087[class646.field9037] = var312;
                class646.field9037 = (class646.field9037 + 1) % 100;
                String var316 = class224.method1516(class224.method1511(class315.field4517, 127), 126);
                if (var311 == 2) {
                    class99.method706(var305, "<img=1>" + var305, -1, "<img=1>" + var306, var316, (byte) -10, 7, null, 0);
                } else if (var311 == 1) {
                    class99.method706(var305, "<img=0>" + var305, -1, "<img=0>" + var306, var316, (byte) -10, 7, null, 0);
                } else {
                    class99.method706(var305, var305, -1, var306, var316, (byte) -10, 3, null, 0);
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class414.field5795 == class350.field5090) {
            int var317 = class315.field4517.method3032((byte) -118);
            int var318 = class315.field4517.method3008(64);
            int var319 = class315.field4517.method3042((byte) -100);
            if (var319 == 65535) {
                var319 = -1;
            }
            int var320 = class315.field4517.method3006(false);
            class263.method1730(0);
            if (var320 == 65535) {
                var320 = -1;
            }
            for (int var321 = var319; var321 <= var320; var321++) {
                long var322 = ((long) var317 << 32) + (long) var321;
                class174 var324 = (class174) class638.field8966.method3669(false, var322);
                class174 var325;
                if (var324 != null) {
                    var325 = new class174(var318, var324.field2203);
                    var324.method527(-11229);
                } else if (var321 == -1) {
                    var325 = new class174(var318, class384.method2387(false, var317).field1500.field2203);
                } else {
                    var325 = new class174(var318, -1);
                }
                class638.field8966.method3666((byte) 65, var322, var325);
            }
            class350.field5090 = null;
            return true;
        } else if (class777.field10682 == class350.field5090) {
            int var326 = class315.field4517.method3036((byte) -57);
            int var327 = class315.field4517.method3042((byte) -100);
            int var328 = class315.field4517.method3013(-108);
            int var329 = class315.field4517.method3002(-1);
            int var330 = class315.field4517.method3002(-1);
            int var331 = class315.field4517.method2975(-114);
            int var332 = var328 & 0x7;
            int var333 = var328 >> 3 & 0xF;
            if (var333 == 15) {
                var333 = -1;
            }
            if ((var331 >> 30) != 0) {
                int var363 = (var331 & 0x346CBFD9) >> 28;
                int var364 = (var331 >> 14 & 0x3FFF) - class444.field6151;
                int var365 = (var331 & 0x3FFF) - class236.field3535;
                if (var364 >= 0 && var365 >= 0 && class741.field10208 > var364 && var365 < class525.field7224) {
                    int var366 = var364 * 512 + 256;
                    int var367 = var365 * 512 + 256;
                    int var368 = var363;
                    if (var363 < 3 && class123.method865(var364, var365, 110)) {
                        var368 = var363 + 1;
                    }
                    class629 var369 = new class629(var330, var329, class533.field7336, var363, var368, var366, class373.method2316(var366, var363, var367, 60) - var327, var367, var364, var364, var365, var365, var332);
                    class601.field8412.method1039(new class350(var369), 0);
                }
            } else if (var331 >> 29 != 0) {
                int var348 = var331 & 0xFFFF;
                class685 var349 = (class685) class450.field6288.method3669(false, (long) var348);
                if (var349 != null) {
                    class359 var350 = var349.field9573;
                    if (var330 == 65535) {
                        var330 = -1;
                    }
                    class18 var351 = var350.field9154[var326];
                    boolean var352 = true;
                    int var353 = var351.field111;
                    if (var330 != -1 && var353 != -1) {
                        if (var330 == var353) {
                            class346 var354 = class576.field8094.method4137((byte) -117, var330);
                            if (var354.field5022 && var354.field5023 != -1) {
                                class73 var355 = class571.field8029.method3695(var354.field5023, (byte) -121);
                                int var356 = var355.field818;
                                if (var356 == 0 || var356 == 2) {
                                    var352 = false;
                                } else if (var356 == 1) {
                                    var352 = true;
                                }
                            }
                        } else {
                            class346 var357 = class576.field8094.method4137((byte) -117, var330);
                            class346 var358 = class576.field8094.method4137((byte) -117, var353);
                            if (var357.field5023 != -1 && var358.field5023 != -1) {
                                class73 var359 = class571.field8029.method3695(var357.field5023, (byte) -107);
                                class73 var360 = class571.field8029.method3695(var358.field5023, (byte) -122);
                                if (var360.field802 > var359.field802) {
                                    var352 = false;
                                }
                            }
                        }
                    }
                    if (var352) {
                        var351.field120 = var327;
                        var351.field116 = var332;
                        var351.field113 = 0;
                        var351.field119 = var333;
                        var351.field117 = 1;
                        var351.field111 = var330;
                        var351.field114 = class533.field7336 + var329;
                        var351.field122 = 0;
                        if (class533.field7336 < var351.field114) {
                            var351.field122 = -1;
                        }
                        if (var351.field111 == 65535) {
                            var351.field111 = -1;
                        }
                        if (var351.field111 != -1 && class533.field7336 == var351.field114) {
                            int var361 = class576.field8094.method4137((byte) -117, var351.field111).field5023;
                            if (var361 != -1) {
                                class73 var362 = class571.field8029.method3695(var361, (byte) -106);
                                if (var362 != null && var362.field816 != null && !var350.field9136) {
                                    class538.method3196(var350, 0, !arg0, var362);
                                }
                            }
                        }
                    }
                }
            } else if ((var331 >> 28) != 0) {
                int var334 = var331 & 0xFFFF;
                class723 var335;
                if (class173.field2193 == var334) {
                    var335 = class724.field10031;
                } else {
                    var335 = class413.field5787[var334];
                }
                if (var335 != null) {
                    class18 var336 = var335.field9154[var326];
                    if (var330 == 65535) {
                        var330 = -1;
                    }
                    boolean var337 = true;
                    int var338 = var336.field111;
                    if (var330 != -1 && var338 != -1) {
                        if (var330 == var338) {
                            class346 var343 = class576.field8094.method4137((byte) -117, var330);
                            if (var343.field5022 && var343.field5023 != -1) {
                                class73 var344 = class571.field8029.method3695(var343.field5023, (byte) -118);
                                int var345 = var344.field818;
                                if (var345 == 0 || var345 == 2) {
                                    var337 = false;
                                } else if (var345 == 1) {
                                    var337 = true;
                                }
                            }
                        } else {
                            class346 var339 = class576.field8094.method4137((byte) -117, var330);
                            class346 var340 = class576.field8094.method4137((byte) -117, var338);
                            if (var339.field5023 != -1 && var340.field5023 != -1) {
                                class73 var341 = class571.field8029.method3695(var339.field5023, (byte) -113);
                                class73 var342 = class571.field8029.method3695(var340.field5023, (byte) -112);
                                if (var342.field802 > var341.field802) {
                                    var337 = false;
                                }
                            }
                        }
                    }
                    if (var337) {
                        var336.field119 = var333;
                        var336.field122 = 0;
                        var336.field120 = var327;
                        var336.field113 = 0;
                        var336.field117 = 1;
                        var336.field111 = var330;
                        var336.field114 = class533.field7336 + var329;
                        var336.field116 = var332;
                        if (var336.field111 == 65535) {
                            var336.field111 = -1;
                        }
                        if (class533.field7336 < var336.field114) {
                            var336.field122 = -1;
                        }
                        if (var336.field111 != -1 && class533.field7336 == var336.field114) {
                            int var346 = class576.field8094.method4137((byte) -117, var336.field111).field5023;
                            if (var346 != -1) {
                                class73 var347 = class571.field8029.method3695(var346, (byte) -118);
                                if (var347 != null && var347.field816 != null && !var335.field9136) {
                                    class538.method3196(var335, 0, true, var347);
                                }
                            }
                        }
                    }
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class289.field4261) {
            class625.method3600(12, class22.field201);
            class350.field5090 = null;
            return true;
        } else if (class723.field10000 == class350.field5090) {
            class723.field9979 = class315.field4517.method3013(-102);
            class350.field5090 = null;
            class137.field1757 = class453.field6312;
            return true;
        } else if (class432.field6001 == class350.field5090) {
            int var370 = class315.field4517.method3002(-1);
            byte var371 = class315.field4517.method3030(-25984);
            class263.method1730(0);
            class139.method927(var370, (byte) -31, var371);
            class350.field5090 = null;
            return true;
        } else if (class409.field5746 == class350.field5090) {
            for (int var372 = 0; var372 < class413.field5787.length; var372++) {
                if (class413.field5787[var372] != null) {
                    class413.field5787[var372].field9173 = null;
                    class413.field5787[var372].field9150 = -1;
                }
            }
            for (int var373 = 0; var373 < class744.field10275; var373++) {
                class669.field9376[var373].field9573.field9173 = null;
                class669.field9376[var373].field9573.field9150 = -1;
            }
            class350.field5090 = null;
            return true;
        } else if (class92.field1074 == class350.field5090) {
            int var374 = class315.field4517.method3002(-1);
            int var375 = class315.field4517.method3002(-1);
            int var376 = class315.field4517.method3002(-1);
            class263.method1730(0);
            if (class609.field8594[var374] != null) {
                for (int var377 = var375; var377 < var376; var377++) {
                    int var378 = class315.field4517.method2983(true);
                    if (var377 < class609.field8594[var374].length && class609.field8594[var374][var377] != null) {
                        class609.field8594[var374][var377].field1464 = var378;
                    }
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class354.field5128 == class350.field5090) {
            int var379 = class315.field4517.method3013(-91);
            int var380 = class315.field4517.method3013(-122);
            int var381 = class315.field4517.method2982((byte) -101);
            int var382 = class315.field4517.method3006(false) << 2;
            int var383 = class315.field4517.method2976(113);
            class263.method1730(0);
            class535.method3178(var379, 116, var382, var380, var383, true, var381);
            class350.field5090 = null;
            return true;
        } else if (class516.field7083 == class350.field5090) {
            class263.method1730(0);
            class351.method2214(false);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class263.field3849) {
            int var384 = class315.field4517.method3002(-1);
            class723 var385;
            if (class173.field2193 == var384) {
                var385 = class724.field10031;
            } else {
                var385 = class413.field5787[var384];
            }
            if (var385 == null) {
                class350.field5090 = null;
                return true;
            }
            int var386 = class315.field4517.method3002(-1);
            int var387 = class315.field4517.method3013(-119);
            boolean var388 = (var386 & 0x8000) != 0;
            if (var385.field9965 != null && var385.field9993 != null) {
                boolean var389 = false;
                if (var387 <= 1) {
                    if (!var388 && (class19.field127 && !class84.field1021 || class780.field10724)) {
                        var389 = true;
                    } else if (class57.method475(false, var385.field9965)) {
                        var389 = true;
                    }
                }
                if (!var389 && class477.field6611 == 0) {
                    int var390 = -1;
                    String var392;
                    if (var388) {
                        var386 &= 0x7FFF;
                        class195 var391 = class56.method468(class315.field4517, -104);
                        var390 = var391.field2768;
                        var392 = var391.field2764.method3712(0, class315.field4517);
                    } else {
                        var392 = class224.method1516(class224.method1511(class315.field4517, 118), 126);
                    }
                    var385.field9204 = var392.trim();
                    var385.field9180 = var386 & 0xFF;
                    var385.field9192 = 150;
                    var385.field9125 = var386 >> 8;
                    int var393;
                    if (var387 == 1 || var387 == 2) {
                        var393 = var388 ? 17 : 1;
                    } else {
                        var393 = var388 ? 17 : 2;
                    }
                    if (var387 == 2) {
                        class99.method706(var385.field9973, "<img=1>" + var385.method4030(true, (byte) 10), var390, "<img=1>" + var385.method4025(-73, false), var392, (byte) -10, var393, null, 0);
                    } else if (var387 == 1) {
                        class99.method706(var385.field9973, "<img=0>" + var385.method4030(true, (byte) 10), var390, "<img=0>" + var385.method4025(-71, false), var392, (byte) -10, var393, null, 0);
                    } else {
                        class99.method706(var385.field9973, var385.method4030(true, (byte) 10), var390, var385.method4025(-90, false), var392, (byte) -10, var393, null, 0);
                    }
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class1.field7) {
            class625.method3600(111, class31.field301);
            class350.field5090 = null;
            return true;
        } else if (class589.field8305 == class350.field5090) {
            String var394 = class315.field4517.method2993((byte) -33);
            String var395 = class224.method1516(class224.method1511(class315.field4517, 99), 126);
            class727.method4042(var394, var394, (byte) -50, var394, 6, 0, var395);
            class350.field5090 = null;
            return true;
        } else if (class781.field10737 == class350.field5090) {
            class570.method3355((byte) -87, false);
            class350.field5090 = null;
            return false;
        } else if (class350.field5090 == class113.field1370) {
            class302.field4404 = class315.field4517.method3013(87);
            for (int var396 = 0; var396 < class302.field4404; var396++) {
                class17.field100[var396] = class315.field4517.method2993((byte) -62);
                class538.field7433[var396] = class315.field4517.method2993((byte) -118);
                if (class538.field7433[var396].equals("")) {
                    class538.field7433[var396] = class17.field100[var396];
                }
                class554.field7679[var396] = class315.field4517.method2993((byte) -126);
                class133.field1698[var396] = class315.field4517.method2993((byte) -43);
                if (class133.field1698[var396].equals("")) {
                    class133.field1698[var396] = class554.field7679[var396];
                }
                class319.field4522[var396] = false;
            }
            class345.field5014 = class453.field6312;
            class350.field5090 = null;
            return true;
        } else if (class752.field10375 == class350.field5090) {
            class4.method11((byte) -95);
            class350.field5090 = null;
            return false;
        } else if (class350.field5090 == class324.field4572) {
            int var397 = class315.field4517.method2982((byte) -101);
            int var398 = class315.field4517.method3006(false);
            class173.field2192.method3391((byte) 60, var397, var398);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class237.field3566) {
            class625.method3600(38, class349.field5071);
            class350.field5090 = null;
            return true;
        } else if (class609.field8595 == class350.field5090) {
            class626.field8766 = class315.field4517.method2976(122);
            class189.field2368 = class315.field4517.method3036((byte) -57);
            class350.field5090 = null;
            return true;
        } else if (class603.field8474 == class350.field5090) {
            class634.method3639(class315.field4517.method2993((byte) -61), (byte) 59);
            class350.field5090 = null;
            return true;
        } else if (class745.field10278 == class350.field5090) {
            int var399 = class315.field4517.method3008(64);
            if (class537.field7425 != var399) {
                class537.field7425 = var399;
                class700.method3958(class412.field5780, -1, -1);
            }
            class350.field5090 = null;
            return true;
        } else if (class483.field6690 == class350.field5090) {
            class1.method3(class179.field2258, -24775, class315.field4517);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class151.field1981) {
            String var400 = class315.field4517.method2993((byte) -78);
            Object[] var401 = new Object[var400.length() + 1];
            for (int var402 = var400.length() - 1; var402 >= 0; var402--) {
                if (var400.charAt(var402) == 's') {
                    var401[var402 + 1] = class315.field4517.method2993((byte) -94);
                } else {
                    var401[var402 + 1] = Integer.valueOf(class315.field4517.method3008(64));
                }
            }
            var401[0] = Integer.valueOf(class315.field4517.method3008(64));
            class263.method1730(0);
            class114 var403 = new class114();
            var403.field1384 = var401;
            class700.method3959(var403);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class33.field332) {
            class701.field9780 = class778.method4288(-82, class315.field4517.method3013(5));
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class32.field303) {
            class625.method3600(-128, class76.field843);
            class350.field5090 = null;
            return true;
        } else if (class412.field5768 == class350.field5090) {
            class701.field9770 = class315.field4517.method2980(false) << 3;
            class372.field5354 = class315.field4517.method2982((byte) -101);
            class153.field2002 = class315.field4517.method2989(-100) << 3;
            for (class656 var404 = (class656) class752.field10377.method3668(30); var404 != null; var404 = (class656) class752.field10377.method3667((byte) -103)) {
                int var407 = (int) (var404.field762 >> 28 & 0x3L);
                int var408 = (int) (var404.field762 & 0x3FFFL);
                int var409 = var408 - class444.field6151;
                int var410 = (int) (var404.field762 >> 14 & 0x3FFFL);
                int var411 = var410 - class236.field3535;
                if (class372.field5354 == var407 && class153.field2002 <= var409 && var409 < (class153.field2002 + 8) && class701.field9770 <= var411 && var411 < (class701.field9770 + 8)) {
                    var404.method527(-11229);
                    if (var409 >= 0 && var411 >= 0 && var409 < class741.field10208 && var411 < class525.field7224) {
                        class251.method1689(class372.field5354, var409, var411, 1066420873);
                    }
                }
            }
            for (class574 var405 = (class574) class189.field2356.method1041(1048832); var405 != null; var405 = (class574) class189.field2356.method1033(-1)) {
                if (class153.field2002 <= var405.field8080 && var405.field8080 < class153.field2002 + 8 && class701.field9770 <= var405.field8081 && (class701.field9770 + 8) > var405.field8081 && class372.field5354 == var405.field8084) {
                    var405.field8071 = true;
                }
            }
            for (class574 var406 = (class574) class747.field10318.method1041(1048832); var406 != null; var406 = (class574) class747.field10318.method1033(-1)) {
                if (class153.field2002 <= var406.field8080 && var406.field8080 < (class153.field2002 + 8) && class701.field9770 <= var406.field8081 && var406.field8081 < (class701.field9770 + 8) && class372.field5354 == var406.field8084) {
                    var406.field8071 = true;
                }
            }
            class350.field5090 = null;
            return true;
        } else if (class532.field7328 == class350.field5090) {
            if (class610.field8597 != -1) {
                class748.method4145(0, class610.field8597, 1);
            }
            class350.field5090 = null;
            return true;
        } else if (class730.field10089 == class350.field5090) {
            int var412 = class315.field4517.method3032((byte) -119);
            int var413 = class315.field4517.method3004((byte) -99);
            class263.method1730(0);
            class139.method927(var413, (byte) -46, var412);
            class350.field5090 = null;
            return true;
        } else if (class562.field7914 == class350.field5090) {
            if (class232.method1593((byte) -123, class664.field9331)) {
                class637.field8958 = (int) ((float) class315.field4517.method3002(-1) * 2.5F);
            } else {
                class637.field8958 = class315.field4517.method3002(-1) * 30;
            }
            class137.field1757 = class453.field6312;
            class350.field5090 = null;
            return true;
        } else if (class452.field6303 == class350.field5090) {
            int var414 = class315.field4517.method3013(-91);
            class263.method1730(0);
            class350.field5090 = null;
            class109.field1324 = var414;
            return true;
        } else if (class469.field6503 == class350.field5090) {
            class284.field4090 = class453.field6312;
            if (class179.field2258 == 0) {
                class471.field6533 = null;
                class461.field6454 = null;
                class165.field2117 = 0;
                class456.field6371 = null;
                class350.field5090 = null;
                return true;
            }
            class461.field6454 = class315.field4517.method2993((byte) -119);
            boolean var415 = class315.field4517.method3013(98) == 1;
            if (var415) {
                class315.field4517.method2993((byte) -43);
            }
            long var416 = class315.field4517.method3020(!arg0);
            class471.field6533 = class425.method2564(var416, 0);
            class224.field3410 = class315.field4517.method3030(-25984);
            int var418 = class315.field4517.method3013(-7);
            if (var418 == 255) {
                class350.field5090 = null;
                return true;
            }
            class165.field2117 = var418;
            class238[] var419 = new class238[100];
            for (int var420 = 0; var420 < class165.field2117; var420++) {
                var419[var420] = new class238();
                var419[var420].field3573 = class315.field4517.method2993((byte) -83);
                boolean var426 = class315.field4517.method3013(16) == 1;
                if (var426) {
                    var419[var420].field3572 = class315.field4517.method2993((byte) -99);
                } else {
                    var419[var420].field3572 = var419[var420].field3573;
                }
                var419[var420].field3569 = class690.method3915(-4097, var419[var420].field3572);
                var419[var420].field3570 = class315.field4517.method3002(-1);
                var419[var420].field3571 = class315.field4517.method3030(-25984);
                var419[var420].field3574 = class315.field4517.method2993((byte) -77);
                if (var419[var420].field3572.equals(class724.field10031.field9965)) {
                    class23.field212 = var419[var420].field3571;
                }
            }
            boolean var421 = false;
            int var422 = class165.field2117;
            while (var422 > 0) {
                boolean var423 = true;
                var422--;
                for (int var424 = 0; var424 < var422; var424++) {
                    if (var419[var424].field3569.compareTo(var419[var424 + 1].field3569) > 0) {
                        class238 var425 = var419[var424];
                        var419[var424] = var419[var424 + 1];
                        var423 = false;
                        var419[var424 + 1] = var425;
                    }
                }
                if (var423) {
                    break;
                }
            }
            class350.field5090 = null;
            class456.field6371 = var419;
            return true;
        } else if (class69.field764 == class350.field5090) {
            class625.method3600(-41, class138.field1764);
            class350.field5090 = null;
            return true;
        } else if (class615.field8637 == class350.field5090) {
            class255.field3779 = class315.field4517.method3013(15);
            class350.field5090 = null;
            return true;
        } else if (class778.field10712 == class350.field5090) {
            class25.field229 = class453.field6312;
            boolean var427 = class315.field4517.method3013(-91) == 1;
            if (class179.field2258 != 1) {
                if (var427) {
                    class706.field9820 = new class48(class315.field4517);
                } else {
                    class706.field9819 = new class48(class315.field4517);
                }
                class350.field5090 = null;
                return true;
            }
            if (var427) {
                class706.field9820 = null;
            } else {
                class706.field9819 = null;
            }
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class230.field3466) {
            int var428 = class315.field4517.method2975(-123);
            class263.method1730(0);
            class610 var429 = (class610) class278.field3993.method3669(false, (long) var428);
            if (var429 != null) {
                class47.method387(true, (byte) 125, false, var429);
            }
            if (class330.field4635 != null) {
                class43.method336(-1, class330.field4635);
                class330.field4635 = null;
            }
            class350.field5090 = null;
            return true;
        } else if (class402.field5673 == class350.field5090) {
            int var430 = class315.field4517.method2975(-122);
            class263.method1730(0);
            class73.method548(3, 68, var430, -1, -1);
            class350.field5090 = null;
            return true;
        } else if (class39.field389 == class350.field5090) {
            int var431 = class315.field4517.method3002(-1);
            if (var431 == 65535) {
                var431 = -1;
            }
            int var432 = class315.field4517.method3013(-2);
            int var433 = class315.field4517.method3002(-1);
            int var434 = class315.field4517.method3013(-103);
            class324.method2056(var432, 0, var434, true, var433, var431, 256);
            class350.field5090 = null;
            return true;
        } else if (class751.field10367 == class350.field5090) {
            String var435 = class315.field4517.method2993((byte) -111);
            boolean var436 = class315.field4517.method3013(10) == 1;
            String var437;
            if (var436) {
                var437 = class315.field4517.method2993((byte) -102);
            } else {
                var437 = var435;
            }
            int var438 = class315.field4517.method3002(-1);
            byte var439 = class315.field4517.method3030(-25984);
            boolean var440 = false;
            if (var439 == -128) {
                var440 = true;
            }
            if (var440) {
                if (class165.field2117 == 0) {
                    class350.field5090 = null;
                    return true;
                }
                boolean var441 = false;
                int var442;
                for (var442 = 0; class165.field2117 > var442 && (!class456.field6371[var442].field3572.equals(var437) || class456.field6371[var442].field3570 != var438); var442++) {
                }
                if (class165.field2117 > var442) {
                    while ((class165.field2117 - 1) > var442) {
                        class456.field6371[var442] = class456.field6371[var442 + 1];
                        var442++;
                    }
                    class165.field2117--;
                    class456.field6371[class165.field2117] = null;
                }
            } else {
                String var443 = class315.field4517.method2993((byte) -90);
                class238 var444 = new class238();
                var444.field3573 = var435;
                var444.field3572 = var437;
                var444.field3569 = class690.method3915(-4097, var444.field3572);
                var444.field3571 = var439;
                var444.field3574 = var443;
                var444.field3570 = var438;
                int var445;
                for (var445 = class165.field2117 - 1; var445 >= 0; var445--) {
                    int var446 = class456.field6371[var445].field3569.compareTo(var444.field3569);
                    if (var446 == 0) {
                        class456.field6371[var445].field3570 = var438;
                        class456.field6371[var445].field3571 = var439;
                        class456.field6371[var445].field3574 = var443;
                        if (var437.equals(class724.field10031.field9965)) {
                            class23.field212 = var439;
                        }
                        class284.field4090 = class453.field6312;
                        class350.field5090 = null;
                        return true;
                    }
                    if (var446 < 0) {
                        break;
                    }
                }
                if (class165.field2117 >= class456.field6371.length) {
                    class350.field5090 = null;
                    return true;
                }
                for (int var447 = class165.field2117 - 1; var447 > var445; var447--) {
                    class456.field6371[var447 + 1] = class456.field6371[var447];
                }
                if (class165.field2117 == 0) {
                    class456.field6371 = new class238[100];
                }
                class456.field6371[var445 + 1] = var444;
                class165.field2117++;
                if (var437.equals(class724.field10031.field9965)) {
                    class23.field212 = var439;
                }
            }
            class350.field5090 = null;
            class284.field4090 = class453.field6312;
            return true;
        } else if (class660.field9292 == class350.field5090) {
            int[] var448 = new int[4];
            for (int var449 = 0; var449 < 4; var449++) {
                var448[var449] = class315.field4517.method3004((byte) -104);
            }
            int var450 = class315.field4517.method2982((byte) -101);
            int var451 = class315.field4517.method3002(-1);
            class685 var452 = (class685) class450.field6288.method3669(arg0, (long) var451);
            if (var452 != null) {
                class745.method4124(var450, var448, var452.field9573, true);
            }
            class350.field5090 = null;
            return true;
        } else if (class396.field5617 == class350.field5090) {
            int var453 = class315.field4517.method3002(-1);
            int var454 = class315.field4517.method3013(64);
            class263.method1730(0);
            class328.method2069(var453, true, -77, var454);
            class350.field5090 = null;
            return true;
        } else if (class397.field5624 == class350.field5090) {
            class779.method4292((byte) 122);
            class350.field5090 = null;
            return true;
        } else if (class350.field5090 == class302.field4401) {
            class570.method3355((byte) 124, class14.field80);
            class350.field5090 = null;
            return false;
        } else if (class350.field5090 == class131.field1689) {
            class53.field641 = class315.field4517.method3034(1);
            class137.field1757 = class453.field6312;
            class350.field5090 = null;
            return true;
        } else {
            class502.method2937(null, (byte) 55, "T1 - " + (class350.field5090 == null ? -1 : class350.field5090.method902(66)) + "," + (class434.field6026 == null ? -1 : class434.field6026.method902(66)) + "," + (class499.field6844 == null ? -1 : class499.field6844.method902(66)) + " - " + class179.field2258);
            class570.method3355((byte) 98, arg0);
            return true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lae;Lcb;)V")
    public class658(class283 arg0, class176 arg1) {
        this.field9286 = arg0;
        this.field9284 = arg1;
    }
}
