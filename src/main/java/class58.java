import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class58 extends class751 {

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "Ljo;")
    public static class351 field818 = new class351(59, -1);

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "[I")
    public static int[] field822 = new int[4096];

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "[Lgk;")
    private class498[] field821;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([[II)V", line = 5)
    private final void method363(int[][] arg0, int arg1) {
        ++field817;
        int var3 = class673.field9452;
        int var4 = class152.field2253;
        if (arg1 != 11641) {
            field818 = null;
        }
        class526.method3058(arg0, false);
        class324.method2108(class407.field5754, 0, 0, (byte) -120, class348.field5094);
        if (this.field821 != null) {
            for (int var5 = 0; this.field821.length > var5; ++var5) {
                class498 var6 = this.field821[var5];
                int var7 = var6.field7075;
                int var8 = var6.field7081;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method159(var3, var4, arg1 ^ -11524);
                    }
                } else if (var8 < 0) {
                    var6.method160(-1, var4, var3);
                } else {
                    var6.method157((byte) -68, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V", line = 59)
    public static void method364(int arg0) {
        field818 = null;
        int var1 = -40 / ((arg0 - -18) / 38);
        field822 = null;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 69)
    public class58() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)[I", line = 74)
    public final int[] method365(int arg0, int arg1) {
        if (arg1 != 4095) {
            this.field821 = null;
        }
        ++field815;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            this.method363(super.field10405.method3606(true), 11641);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)[[I", line = 98)
    public final int[][] method147(int arg0, byte arg1) {
        if (arg1 != 57) {
            return null;
        } else {
            ++field819;
            int[][] var3 = super.field10409.method3474(arg1 ^ 2157, arg0);
            if (super.field10409.field8481) {
                int var4 = class673.field9452;
                int var5 = class152.field2253;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field10409.method3476((byte) -84);
                this.method363(var6, arg1 ^ 11584);
                for (int var8 = 0; ~var8 > ~class152.field2253; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~var14 > ~class673.field9452; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class111.method773(var15 << 4, 4080);
                        var12[var14] = class111.method773(var15 >> 4, 4080);
                        var11[var14] = class111.method773(16711680, var15) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILrv;I)V", line = 160)
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field816;
        if (arg2 == 0) {
            this.field821 = new class498[arg1.method842(2384)];
            for (int var4 = 0; ~this.field821.length < ~var4; ++var4) {
                int var5 = arg1.method842(2384);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field821[var4] = class271.method1765(arg1, 0);
                            }
                        } else {
                            this.field821[var4] = class534.method3090(Integer.MAX_VALUE, arg1);
                        }
                    } else {
                        this.field821[var4] = class535.method3100(16579, arg1);
                    }
                } else {
                    this.field821[var4] = class415.method2484(7, arg1);
                }
            }
        } else if (arg2 == 1) {
            super.field10415 = ~arg1.method842(2384) == -2;
        }
        int var7 = 11 % ((25 - arg0) / 63);
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)Z", line = 233)
    public static final boolean method366(int arg0) throws IOException {
        ++field820;
        if (class76.field1025 == null) {
            return false;
        } else {
            if (class746.field10375 == null) {
                if (class606.field8518) {
                    if (!class76.field1025.method199(1, (byte) 101)) {
                        return false;
                    }
                    class76.field1025.method200(1, -30359, 0, class26.field371.field1556);
                    ++class301.field4522;
                    class606.field8518 = false;
                    class786.field10810 = 0;
                }
                class26.field371.field1521 = 0;
                if (class26.field371.method2144(-124)) {
                    if (!class76.field1025.method199(1, (byte) 101)) {
                        return false;
                    }
                    class76.field1025.method200(1, -30359, 1, class26.field371.field1556);
                    ++class301.field4522;
                    class786.field10810 = 0;
                }
                class606.field8518 = true;
                class622[] var1 = class155.method1225((byte) 95);
                int var2 = class26.field371.method2142(false);
                if (~var2 > -1 || ~var2 <= ~var1.length) {
                    throw new IOException("invo:" + var2 + " ip:" + class26.field371.field1521);
                }
                class746.field10375 = var1[var2];
                class440.field6294 = class746.field10375.field8774;
            }
            if (~class440.field6294 == 0) {
                if (!class76.field1025.method199(1, (byte) 101)) {
                    return false;
                }
                class76.field1025.method200(1, -30359, 0, class26.field371.field1556);
                class440.field6294 = 255 & class26.field371.field1556[0];
                ++class301.field4522;
                class786.field10810 = 0;
            }
            if (~class440.field6294 == 1) {
                if (!class76.field1025.method199(2, (byte) 101)) {
                    return false;
                }
                class76.field1025.method200(2, -30359, 0, class26.field371.field1556);
                class26.field371.field1521 = 0;
                class440.field6294 = class26.field371.method898((byte) -112);
                class786.field10810 = 0;
                class301.field4522 += 2;
            }
            if (class440.field6294 > 0) {
                if (!class76.field1025.method199(class440.field6294, (byte) 101)) {
                    return false;
                }
                class26.field371.field1521 = 0;
                class76.field1025.method200(class440.field6294, -30359, 0, class26.field371.field1556);
                class786.field10810 = 0;
                class301.field4522 += class440.field6294;
            }
            class225.field3231 = class127.field1655;
            class127.field1655 = class654.field9233;
            class654.field9233 = class746.field10375;
            if (class746.field10375 == class38.field631) {
                class604.field8500 = class26.field371.method842(2384);
                class778.field10735 = class717.field10086;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class541.field7587) {
                int var3 = class26.field371.method846(15319);
                int var4 = class26.field371.method835(-66);
                int var5 = class26.field371.method842(2384);
                class478.field6788[var5] = var4;
                class575.field8138[var5] = var3;
                class288.field4398[var5] = 1;
                int var6 = class408.field5766[var5] + -1;
                for (int var7 = 0; var7 < var6; ++var7) {
                    if (~class395.field5594[var7] >= ~var4) {
                        class288.field4398[var5] = var7 + 2;
                    }
                }
                class512.field7319[class111.method773(31, class444.field6320++)] = var5;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class277.field3865) {
                class633.field8935 = class26.field371.method882((byte) 81) << 3;
                class578.field8178 = class26.field371.method877(-252) << 3;
                class469.field6702 = class26.field371.method846(15319);
                while (class26.field371.field1521 < class440.field6294) {
                    class101 var8 = class270.method1762(30124)[class26.field371.method842(2384)];
                    class668.method3797(0, var8);
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class313.field4649) {
                int var9 = class26.field371.method842(2384);
                int var10 = class26.field371.method842(2384);
                String var11 = class26.field371.method861(true);
                int var12 = class26.field371.method837(29806);
                if (var12 == 65535) {
                    var12 = -1;
                }
                if (~var10 <= -2 && ~var10 >= -9) {
                    if (var11.equalsIgnoreCase("null")) {
                        var11 = null;
                    }
                    class651.field9180[var10 - 1] = var11;
                    class147.field1888[var10 + -1] = var12;
                    class262.field3707[var10 - 1] = ~var9 == -1;
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class32.field431) {
                int var13 = class26.field371.method862(-25118);
                int var14 = class26.field371.method837(29806);
                int var15 = class26.field371.method871(23995);
                class548.method3184(-112);
                class708.method4017((var13 << 16) + var14, -122, var15);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class265.field3742) {
                class668.method3797(0, class262.field3708);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class181.field2743) {
                int var16 = class26.field371.method835(-51);
                int var17 = class26.field371.method898((byte) -110);
                class548.method3184(-104);
                if (~var17 == -65536) {
                    var17 = -1;
                }
                class472.method2789(2, var17, 1520, var16, -1);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class176.field2536) {
                class469.field6702 = class26.field371.method846(15319);
                class633.field8935 = class26.field371.method882((byte) 81) << 3;
                class578.field8178 = class26.field371.method858(55) << 3;
                for (class541 var18 = (class541) class70.field959.method382(0); var18 != null; var18 = (class541) class70.field959.method391(37)) {
                    int var21 = (int) (3L & var18.field7577 >> 28);
                    int var22 = (int) (var18.field7577 & 16383L);
                    int var23 = -class103.field1295 + var22;
                    int var24 = (int) (16383L & var18.field7577 >> 14);
                    int var25 = -class175.field2496 + var24;
                    if (~class469.field6702 == ~var21 && ~var23 <= ~class578.field8178 && ~(class578.field8178 + 8) < ~var23 && ~class633.field8935 >= ~var25 && var25 < class633.field8935 + 8) {
                        var18.method3117((byte) 29);
                        if (~var23 <= -1 && ~var25 <= -1 && ~var23 > ~class109.field1314 && ~var25 > ~class760.field10479) {
                            class48.method312(var23, var25, true, class469.field6702);
                        }
                    }
                }
                for (class455 var19 = (class455) class715.field10079.method2508((byte) 115); var19 != null; var19 = (class455) class715.field10079.method2505((byte) -55)) {
                    if (~var19.field6529 <= ~class578.field8178 && class578.field8178 - -8 > var19.field6529 && class633.field8935 <= var19.field6523 && ~var19.field6523 > ~(class633.field8935 + 8) && ~class469.field6702 == ~var19.field6524) {
                        var19.field6532 = true;
                    }
                }
                for (class455 var20 = (class455) class110.field1360.method2508((byte) 127); var20 != null; var20 = (class455) class110.field1360.method2505((byte) -55)) {
                    if (~var20.field6529 <= ~class578.field8178 && ~var20.field6529 > ~(class578.field8178 + 8) && ~class633.field8935 >= ~var20.field6523 && ~var20.field6523 > ~(class633.field8935 + 8) && class469.field6702 == var20.field6524) {
                        var20.field6532 = true;
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class300.field4510) {
                int var26 = class26.field371.method898((byte) -91);
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = class26.field371.method835(-118);
                class548.method3184(-107);
                class395.method2405(-126, var27, var26);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class185.field2794) {
                class668.method3797(0, class633.field8934);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class445.field6328) {
                int var28 = class26.field371.method898((byte) -117);
                int var29 = class26.field371.method893((byte) -102);
                class548.method3184(-116);
                class348.method2201(var29, var28, 17);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class225.field3229) {
                int var30 = class26.field371.method862(-25118);
                class548.method3184(-110);
                class770.method4236(var30, 1);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class181.field2753) {
                class668.method3797(0, class549.field7748);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class480.field6819) {
                int var31 = class26.field371.method898((byte) -100);
                int var32 = class26.field371.method842(2384);
                boolean var33 = ~(var32 & 1) == -2;
                while (class26.field371.field1521 < class440.field6294) {
                    int var34 = class26.field371.method890((byte) -59);
                    int var35 = class26.field371.method898((byte) -97);
                    int var36 = 0;
                    if (~var35 != -1) {
                        var36 = class26.field371.method842(2384);
                        if (var36 == 255) {
                            var36 = class26.field371.method871(23995);
                        }
                    }
                    class521.method3035(var35 + -1, (byte) 93, var31, var33, var36, var34);
                }
                class148.field1899[class111.method773(31, class477.field6780++)] = var31;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class403.field5705) {
                int var37 = class26.field371.method898((byte) -124);
                int var38 = class26.field371.method862(-25118);
                class548.method3184(-98);
                class71.method560(var37, (byte) -96, var38, 0);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class544.field7640) {
                for (int var39 = 0; var39 < class581.field8250.length; ++var39) {
                    if (class581.field8250[var39] != null) {
                        class581.field8250[var39].field6393 = null;
                        class581.field8250[var39].field6404 = -1;
                    }
                }
                for (int var40 = 0; class662.field9292 > var40; ++var40) {
                    class642.field9044[var40].field262.field6393 = null;
                    class642.field9044[var40].field262.field6404 = -1;
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class744.field10361) {
                class272.method1771((byte) 85);
                class746.field10375 = null;
                return false;
            } else if (class746.field10375 == class266.field3754) {
                boolean var41 = class26.field371.method842(2384) == 1;
                String var42 = class26.field371.method861(true);
                String var43 = var42;
                if (var41) {
                    var43 = class26.field371.method861(true);
                }
                int var44 = class26.field371.method842(2384);
                boolean var45 = false;
                if (~var44 >= -2) {
                    if ((!class724.field10150 || class542.field7600) && !class365.field5272) {
                        if (~var44 >= -2 && class250.method1669((byte) 55, var43)) {
                            var45 = true;
                        }
                    } else {
                        var45 = true;
                    }
                }
                if (!var45 && class772.field10658 == 0) {
                    String var46 = class62.method377(32732, class361.method2267(class26.field371, 109));
                    if (var44 != 2) {
                        if (~var44 != -2) {
                            class224.method1554(var46, var43, var42, var42, 24, -1, 99, 0, (String) null);
                        } else {
                            class224.method1554(var46, "<img=0>" + var43, "<img=0>" + var42, var42, 24, -1, 99, 0, (String) null);
                        }
                    } else {
                        class224.method1554(var46, "<img=1>" + var43, "<img=1>" + var42, var42, 24, -1, 99, 0, (String) null);
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class217.field3113) {
                class668.method3797(0, class577.field8158);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class292.field4426) {
                int var47 = class26.field371.method842(2384);
                int var48 = var47 >> 5;
                int var49 = 31 & var47;
                if (var49 == 0) {
                    class443.field6310[var48] = null;
                    class746.field10375 = null;
                    return true;
                } else {
                    class253 var50 = new class253();
                    var50.field3558 = var49;
                    var50.field3560 = class26.field371.method842(2384);
                    if (var50.field3560 >= 0 && ~class351.field5119.length < ~var50.field3560) {
                        if (~var50.field3558 != -2 && ~var50.field3558 != -11) {
                            if (var50.field3558 >= 2 && ~var50.field3558 >= -7) {
                                if (~var50.field3558 == -3) {
                                    var50.field3559 = 256;
                                    var50.field3564 = 256;
                                }
                                if (var50.field3558 == 3) {
                                    var50.field3559 = 0;
                                    var50.field3564 = 256;
                                }
                                if (var50.field3558 == 4) {
                                    var50.field3564 = 256;
                                    var50.field3559 = 512;
                                }
                                if (~var50.field3558 == -6) {
                                    var50.field3564 = 0;
                                    var50.field3559 = 256;
                                }
                                if (~var50.field3558 == -7) {
                                    var50.field3559 = 256;
                                    var50.field3564 = 512;
                                }
                                var50.field3558 = 2;
                                var50.field3557 = class26.field371.method842(2384);
                                var50.field3559 += class26.field371.method898((byte) -122) - class103.field1295 << 9;
                                var50.field3564 += class26.field371.method898((byte) -103) + -class175.field2496 << 9;
                                var50.field3563 = class26.field371.method842(2384) << 2;
                                var50.field3566 = class26.field371.method898((byte) -118);
                            }
                        } else {
                            var50.field3565 = class26.field371.method898((byte) -105);
                            class26.field371.field1521 += 6;
                        }
                        var50.field3561 = class26.field371.method898((byte) -78);
                        if (~var50.field3561 == -65536) {
                            var50.field3561 = -1;
                        }
                        class443.field6310[var48] = var50;
                    }
                    class746.field10375 = null;
                    return true;
                }
            } else if (class746.field10375 == class599.field8443) {
                if (class251.field3546 != -1) {
                    class530.method3077(118, class251.field3546, 0);
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class617.field8709) {
                int var51 = class26.field371.method873(2);
                int var52 = class26.field371.method893((byte) -89);
                class548.method3184(-117);
                class329 var53 = (class329) class251.field3547.method380((byte) -3, (long) var52);
                class329 var54 = (class329) class251.field3547.method380((byte) -3, (long) var51);
                if (var54 != null) {
                    class224.method1551((byte) 26, var54, false, var53 == null || var53.field4912 != var54.field4912);
                }
                if (var53 != null) {
                    var53.method3117((byte) 51);
                    class251.field3547.method384((long) var51, var53, false);
                }
                class176 var55 = class518.method3014(var52, 119);
                if (var55 != null) {
                    class288.method1923((byte) -19, var55);
                }
                class176 var56 = class518.method3014(var51, -54);
                if (var56 != null) {
                    class288.method1923((byte) -19, var56);
                    class493.method2885(true, var56, (byte) -73);
                }
                if (class251.field3546 != -1) {
                    class530.method3077(55, class251.field3546, 1);
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class197.field2881) {
                int var57 = class26.field371.method898((byte) -113);
                class559 var58;
                if (~class223.field3199 != ~var57) {
                    var58 = class581.field8250[var57];
                } else {
                    var58 = class251.field3549;
                }
                if (var58 == null) {
                    class746.field10375 = null;
                    return true;
                } else {
                    int var59 = class26.field371.method898((byte) -112);
                    int var60 = class26.field371.method842(2384);
                    boolean var61 = ~(var59 & 32768) != -1;
                    if (var58.field7955 != null && var58.field7933 != null) {
                        boolean var62 = false;
                        if (var60 <= 1) {
                            if (!var61 && (class724.field10150 && !class542.field7600 || class365.field5272)) {
                                var62 = true;
                            } else if (class250.method1669((byte) 126, var58.field7955)) {
                                var62 = true;
                            }
                        }
                        if (!var62 && ~class772.field10658 == -1) {
                            int var63 = -1;
                            String var65;
                            if (var61) {
                                var59 &= 32767;
                                class667 var64 = class18.method151(27061, class26.field371);
                                var63 = var64.field9387;
                                var65 = var64.field9386.method3902(class26.field371, (byte) 110);
                            } else {
                                var65 = class62.method377(32732, class361.method2267(class26.field371, -82));
                            }
                            var58.field6362 = var65.trim();
                            var58.field6386 = var59 >> 8;
                            var58.field6359 = 150;
                            var58.field6396 = 255 & var59;
                            int var66;
                            if (~var60 != -2 && var60 != 2) {
                                var66 = !var61 ? 2 : 17;
                            } else {
                                var66 = var61 ? 17 : 1;
                            }
                            if (~var60 != -3) {
                                if (var60 != 1) {
                                    class224.method1554(var65, var58.method3240(false, (byte) -49), var58.method3239(true, -90), var58.field7958, var66, var63, 99, 0, (String) null);
                                } else {
                                    class224.method1554(var65, "<img=0>" + var58.method3240(false, (byte) -49), "<img=0>" + var58.method3239(true, -79), var58.field7958, var66, var63, 99, 0, (String) null);
                                }
                            } else {
                                class224.method1554(var65, "<img=1>" + var58.method3240(false, (byte) -49), "<img=1>" + var58.method3239(true, -124), var58.field7958, var66, var63, 99, 0, (String) null);
                            }
                        }
                    }
                    class746.field10375 = null;
                    return true;
                }
            } else if (class746.field10375 == class197.field2883) {
                if (class312.method2037((byte) 71, class757.field10456)) {
                    class638.field8975 = (int) ((float) class26.field371.method898((byte) -98) * 2.5F);
                } else {
                    class638.field8975 = class26.field371.method898((byte) -97) * 30;
                }
                class746.field10375 = null;
                class778.field10735 = class717.field10086;
                return true;
            } else if (class746.field10375 == class356.field5193) {
                int var67 = class26.field371.method867(true);
                int var68 = class26.field371.method898((byte) -93);
                int var69 = class26.field371.method835(-102);
                int var70 = class26.field371.method862(-25118);
                class548.method3184(-111);
                class104.method714(var70, 122, var67, var69, var68);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class542.field7596) {
                while (~class440.field6294 < ~class26.field371.field1521) {
                    boolean var81 = ~class26.field371.method842(2384) == -2;
                    String var82 = class26.field371.method861(true);
                    String var83 = class26.field371.method861(true);
                    int var84 = class26.field371.method898((byte) -82);
                    int var85 = class26.field371.method842(2384);
                    String var86 = "";
                    boolean var87 = false;
                    if (var84 > 0) {
                        var86 = class26.field371.method861(true);
                        var87 = ~class26.field371.method842(2384) == -2;
                    }
                    for (int var88 = 0; ~var88 > ~class50.field719; ++var88) {
                        if (var81) {
                            if (var83.equals(class662.field9293[var88])) {
                                class662.field9293[var88] = var82;
                                var82 = null;
                                class738.field10303[var88] = var83;
                                break;
                            }
                        } else if (var82.equals(class662.field9293[var88])) {
                            if (class146.field1861[var88] != var84) {
                                boolean var89 = true;
                                for (class464 var90 = (class464) class619.field8724.method2033(0); var90 != null; var90 = (class464) class619.field8724.method2025((byte) -88)) {
                                    if (var90.field6620.equals(var82)) {
                                        if (~var84 != -1 && ~var90.field6618 == -1) {
                                            var90.method592(2);
                                            var89 = false;
                                        } else if (var84 == 0 && var90.field6618 != 0) {
                                            var89 = false;
                                            var90.method592(2);
                                        }
                                    }
                                }
                                if (var89) {
                                    class619.field8724.method2026((byte) 51, new class464(var82, var84));
                                }
                                class146.field1861[var88] = var84;
                            }
                            class738.field10303[var88] = var83;
                            class792.field10868[var88] = var86;
                            class291.field4414[var88] = var85;
                            var82 = null;
                            class10.field223[var88] = var87;
                            break;
                        }
                    }
                    if (var82 != null && class50.field719 < 200) {
                        class662.field9293[class50.field719] = var82;
                        class738.field10303[class50.field719] = var83;
                        class146.field1861[class50.field719] = var84;
                        class792.field10868[class50.field719] = var86;
                        class291.field4414[class50.field719] = var85;
                        class10.field223[class50.field719] = var87;
                        ++class50.field719;
                    }
                }
                class736.field10279 = 2;
                class543.field7610 = class717.field10086;
                boolean var71 = false;
                int var72 = class50.field719;
                while (var72 > 0) {
                    --var72;
                    boolean var73 = true;
                    for (int var74 = 0; var74 < var72; ++var74) {
                        if (~class146.field1861[var74] != ~class444.field6319.field6989 && ~class146.field1861[var74 - -1] == ~class444.field6319.field6989 || ~class146.field1861[var74] == -1 && class146.field1861[var74 + 1] != 0) {
                            int var75 = class146.field1861[var74];
                            class146.field1861[var74] = class146.field1861[var74 + 1];
                            class146.field1861[var74 + 1] = var75;
                            String var76 = class792.field10868[var74];
                            class792.field10868[var74] = class792.field10868[var74 + 1];
                            class792.field10868[var74 + 1] = var76;
                            String var77 = class662.field9293[var74];
                            class662.field9293[var74] = class662.field9293[var74 - -1];
                            class662.field9293[var74 + 1] = var77;
                            String var78 = class738.field10303[var74];
                            class738.field10303[var74] = class738.field10303[var74 + 1];
                            class738.field10303[var74 - -1] = var78;
                            int var79 = class291.field4414[var74];
                            class291.field4414[var74] = class291.field4414[var74 + 1];
                            class291.field4414[var74 - -1] = var79;
                            boolean var80 = class10.field223[var74];
                            class10.field223[var74] = class10.field223[var74 - -1];
                            class10.field223[var74 + 1] = var80;
                            var73 = false;
                        }
                    }
                    if (var73) {
                        break;
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class489.field6920) {
                int var91 = class26.field371.method871(23995);
                int var92 = class26.field371.method837(29806);
                class548.method3184(-113);
                class338.method2173(var91, var92, false);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class174.field2461) {
                class668.method3797(0, class328.field4893);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class549.field7744) {
                int var93 = class26.field371.method862(-25118);
                int var94 = class26.field371.method867(true);
                int var95 = class26.field371.method893((byte) -87);
                class548.method3184(-119);
                class329 var96 = (class329) class251.field3547.method380((byte) -3, (long) var95);
                if (var96 != null) {
                    class224.method1551((byte) 26, var96, false, ~var96.field4912 != ~var93);
                }
                class664.method3783(var93, var95, 6, var94, false);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class502.field7184) {
                int var97 = class26.field371.method846(15319);
                int var98 = class26.field371.method846(15319);
                if (var97 == 255) {
                    var97 = -1;
                    var98 = -1;
                }
                class203.method1456(var98, var97, (byte) -122);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class655.field9240) {
                int var99 = class26.field371.method862(-25118);
                if (var99 == 65535) {
                    var99 = -1;
                }
                int var100 = class26.field371.method898((byte) -86);
                int var101 = class26.field371.method883((byte) 123);
                if (~var101 == -65536) {
                    var101 = -1;
                }
                int var102 = class26.field371.method873(2);
                class548.method3184(-113);
                for (int var103 = var99; ~var101 <= ~var103; ++var103) {
                    long var104 = ((long) var102 << 32) - -((long) var103);
                    class654 var106 = (class654) class180.field2727.method380((byte) -3, var104);
                    class654 var107;
                    if (var106 == null) {
                        if (~var103 != 0) {
                            var107 = new class654(0, var100);
                        } else {
                            var107 = new class654(class518.method3014(var102, -57).field2510.field9229, var100);
                        }
                    } else {
                        var107 = new class654(var106.field9229, var100);
                        var106.method3117((byte) 98);
                    }
                    class180.field2727.method384(var104, var107, false);
                }
                class746.field10375 = null;
                return true;
            } else if (class780.field10751 == class746.field10375) {
                class668.method3797(0, class527.field7497);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class21.field323) {
                int var108 = class26.field371.method873(2);
                String var109 = class26.field371.method861(true);
                class548.method3184(-112);
                class761.method4193((byte) 105, var108, var109);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class584.field8260) {
                int var110 = class26.field371.method873(2);
                class548.method3184(-119);
                class472.method2789(5, class223.field3199, 1520, var110, 0);
                class746.field10375 = null;
                return true;
            } else if (class746.field10377 == class746.field10375) {
                int var111 = class26.field371.method873(2);
                class548.method3184(-96);
                class329 var112 = (class329) class251.field3547.method380((byte) -3, (long) var111);
                if (var112 != null) {
                    class224.method1551((byte) 26, var112, false, true);
                }
                if (class273.field3815 != null) {
                    class288.method1923((byte) -19, class273.field3815);
                    class273.field3815 = null;
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10378 == class746.field10375) {
                class369.method2290(-21791);
                class746.field10375 = null;
                return false;
            } else if (class790.field10842 == class746.field10375) {
                int var113 = class26.field371.method867(true);
                int var114 = class26.field371.method846(15319);
                int var115 = class26.field371.method867(true);
                int var116 = class26.field371.method837(29806) << 2;
                int var117 = class26.field371.method867(true);
                class548.method3184(-121);
                class443.method2672(var115, var117, var116, (byte) -127, var114, true, var113);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class451.field6495) {
                int var118 = class26.field371.method842(2384);
                boolean var119 = ~(var118 & 1) == -2;
                String var120 = class26.field371.method861(true);
                String var121 = class26.field371.method861(true);
                if (var121.equals("")) {
                    var121 = var120;
                }
                String var122 = class26.field371.method861(true);
                String var123 = class26.field371.method861(true);
                if (var123.equals("")) {
                    var123 = var122;
                }
                if (var119) {
                    for (int var124 = 0; ~class155.field2304 < ~var124; ++var124) {
                        if (class745.field10367[var124].equals(var123)) {
                            class127.field1657[var124] = var120;
                            class745.field10367[var124] = var121;
                            class241.field3456[var124] = var122;
                            class182.field2760[var124] = var123;
                            break;
                        }
                    }
                } else {
                    class127.field1657[class155.field2304] = var120;
                    class745.field10367[class155.field2304] = var121;
                    class241.field3456[class155.field2304] = var122;
                    class182.field2760[class155.field2304] = var123;
                    class423.field5972[class155.field2304] = class111.method773(2, var118) == 2;
                    ++class155.field2304;
                }
                class746.field10375 = null;
                class543.field7610 = class717.field10086;
                return true;
            } else if (class746.field10375 == class124.field1627) {
                int var125 = class26.field371.method898((byte) -100);
                if (~var125 == -65536) {
                    var125 = -1;
                }
                int var126 = class26.field371.method842(2384);
                int var127 = class26.field371.method898((byte) -115);
                int var128 = class26.field371.method842(2384);
                class256.method1686(256, var127, (byte) 111, var125, true, var126, var128);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class588.field8319) {
                int var129 = class26.field371.method867(true);
                int var130 = class26.field371.method862(-25118);
                class548.method3184(-99);
                if (var129 == 2) {
                    class379.method2340(106);
                }
                class251.field3546 = var130;
                class554.method3226(var130, false);
                class126.method924(false, (byte) 102);
                class353.method2223(class251.field3546);
                for (int var131 = 0; var131 < 100; ++var131) {
                    class397.field5653[var131] = true;
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class729.field10192) {
                int var132 = class26.field371.method842(2384);
                int var133 = var132 >> 2;
                int var134 = 3 & var132;
                int var135 = class428.field6018[var133];
                int var136 = class26.field371.method862(-25118);
                if (~var136 == -65536) {
                    var136 = -1;
                }
                int var137 = class26.field371.method871(23995);
                int var138 = (var137 & 905601402) >> 28;
                int var139 = (var137 & 268433078) >> 14;
                int var140 = 16383 & var137;
                int var141 = var139 - class103.field1295;
                int var142 = var140 - class175.field2496;
                class563.method3270(var142, var134, var136, var141, -87, var135, var138, var133);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class450.field6459) {
                int var143 = class26.field371.method871(23995);
                int var144 = class26.field371.method862(-25118);
                class548.method3184(-124);
                class153.method1180(14, var143, var144);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class585.field8277) {
                int var145 = class26.field371.method871(23995);
                int var146 = class26.field371.method837(29806);
                class548.method3184(-120);
                class12.method125(12, var146, var145);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class419.field5896) {
                class130.method944(false);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class330.field4919) {
                String var147 = class26.field371.method861(true);
                int var148 = class26.field371.method898((byte) -115);
                class548.method3184(-125);
                class130.method943(var148, var147, Integer.MIN_VALUE);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class672.field9418) {
                class668.method3797(0, class703.field9908);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class626.field8835) {
                int var149 = class26.field371.method873(2);
                int var150 = class26.field371.method898((byte) -78);
                class271.field3796.method1793(var150, var149, (byte) -110);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class257.field3609) {
                class37.field564 = class717.field10086;
                boolean var151 = ~class26.field371.method842(2384) == -2;
                if (class440.field6294 == 1) {
                    class746.field10375 = null;
                    if (var151) {
                        class584.field8265 = null;
                    } else {
                        class492.field6992 = null;
                    }
                    return true;
                } else {
                    if (var151) {
                        class584.field8265 = new class69(class26.field371);
                    } else {
                        class492.field6992 = new class69(class26.field371);
                    }
                    class746.field10375 = null;
                    return true;
                }
            } else if (class746.field10375 == class417.field5887) {
                int var152 = class26.field371.method890((byte) -59);
                int var153 = class26.field371.method871(23995);
                int var154 = class26.field371.method842(2384);
                String var155 = "";
                String var156 = var155;
                if (~(1 & var154) != -1) {
                    var155 = class26.field371.method861(true);
                    if ((2 & var154) != 0) {
                        var156 = class26.field371.method861(true);
                    } else {
                        var156 = var155;
                    }
                }
                String var157 = class26.field371.method861(true);
                if (~var152 != -100) {
                    if (!var156.equals("") && class250.method1669((byte) 73, var156)) {
                        class746.field10375 = null;
                        return true;
                    }
                    class422.method2520(var152, var153, var157, var155, var155, -92, var156);
                } else {
                    class561.method3260(var157, 49);
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class621.field8747) {
                int var158 = class26.field371.method898((byte) -107);
                byte var159 = class26.field371.method877(-252);
                class548.method3184(-118);
                class338.method2173(var159, var158, false);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class212.field3069) {
                if (class677.field9637 != null) {
                    class725.method4080(-1, class145.field1852.field8987.method2724((byte) -43), -1, false, 0);
                }
                byte[] var160 = new byte[class440.field6294];
                class26.field371.method2136(35716, class440.field6294, 0, var160);
                String var161 = class45.method308(class440.field6294, 0, (byte) 37, var160);
                class610.method3518(true, class27.field395, class145.field1852.field9002.method2258((byte) -36) == 1, var161, -77);
                class746.field10375 = null;
                return true;
            } else if (class779.field10742 == class746.field10375) {
                class181.field2756 = class26.field371.method838(true);
                class746.field10375 = null;
                class778.field10735 = class717.field10086;
                return true;
            } else if (class746.field10375 == class614.field8658) {
                class668.method3797(0, class456.field6541);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class449.field6427) {
                int var162 = class26.field371.method855(0);
                int[] var163 = new int[4];
                for (int var164 = 0; var164 < 4; ++var164) {
                    var163[var164] = class26.field371.method837(29806);
                }
                int var165 = class26.field371.method837(29806);
                class14 var166 = (class14) class543.field7606.method380((byte) -3, (long) var165);
                if (var166 != null) {
                    class627.method3591(var166.field262, 0, var162, var163);
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class446.field6333) {
                boolean var167 = ~class26.field371.method842(2384) == -2;
                String var168 = class26.field371.method861(true);
                String var169 = var168;
                if (var167) {
                    var169 = class26.field371.method861(true);
                }
                long var170 = (long) class26.field371.method898((byte) -113);
                long var172 = (long) class26.field371.method833(-3);
                int var174 = class26.field371.method842(2384);
                int var175 = class26.field371.method898((byte) -103);
                long var176 = (var170 << 32) + var172;
                boolean var178 = false;
                int var179 = 0;
                while (true) {
                    if (~var179 <= -101) {
                        if (var174 <= 1 && class250.method1669((byte) 101, var169)) {
                            var178 = true;
                        }
                        break;
                    }
                    if (class576.field8144[var179] == var176) {
                        var178 = true;
                        break;
                    }
                    ++var179;
                }
                if (!var178 && ~class772.field10658 == -1) {
                    class576.field8144[class55.field778] = var176;
                    class55.field778 = (class55.field778 + 1) % 100;
                    String var180 = class544.field7646.method1614(var175, (byte) 72).method3902(class26.field371, (byte) 119);
                    if (~var174 == -3) {
                        class224.method1554(var180, "<img=1>" + var169, "<img=1>" + var168, var168, 18, var175, 99, 0, (String) null);
                    } else if (var174 != 1) {
                        class224.method1554(var180, var169, var168, var168, 18, var175, 99, 0, (String) null);
                    } else {
                        class224.method1554(var180, "<img=0>" + var169, "<img=0>" + var168, var168, 18, var175, 99, 0, (String) null);
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class74.field999) {
                int var181 = class26.field371.method842(2384);
                if (class26.field371.method842(2384) != 0) {
                    --class26.field371.field1521;
                    class318.field4730[var181] = new class554(class26.field371);
                } else {
                    class318.field4730[var181] = new class554();
                }
                class219.field3127 = class717.field10086;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class130.field1712) {
                class599.method3460(true, class585.field8273);
                class746.field10375 = null;
                return false;
            } else if (class746.field10375 == class300.field4515) {
                int var182 = class26.field371.method898((byte) -104);
                if (var182 == 65535) {
                    var182 = -1;
                }
                int var183 = class26.field371.method842(2384);
                int var184 = class26.field371.method898((byte) -98);
                int var185 = class26.field371.method842(2384);
                int var186 = class26.field371.method898((byte) -115);
                class490.method2864(var182, var184, true, var183, var186, var185);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class420.field5919) {
                int var187 = class26.field371.method871(23995);
                int var188 = class26.field371.method862(-25118);
                if (~var188 == -65536) {
                    var188 = -1;
                }
                int var189 = class26.field371.method835(-86);
                class548.method3184(-108);
                class727.method4083(var187, -1, var189, var188);
                class501 var190 = class526.field7490.method3567(var188, true);
                class359.method2256(var190.field7147, var190.field7133, var190.field7128, var187, (byte) -78);
                class69.method536(var190.field7148, var190.field7143, 23593, var187, var190.field7121);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class515.field7348) {
                int var191 = class26.field371.method846(15319);
                int var192 = class26.field371.method862(-25118);
                class271.field3796.method1793(var192, var191, (byte) -110);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class147.field1889) {
                boolean var193 = ~class26.field371.method842(2384) == -2;
                String var194 = class26.field371.method861(true);
                String var195 = var194;
                if (var193) {
                    var195 = class26.field371.method861(true);
                }
                int var196 = class26.field371.method842(2384);
                int var197 = class26.field371.method898((byte) -98);
                boolean var198 = false;
                if (~var196 >= -2 && class250.method1669((byte) 81, var195)) {
                    var198 = true;
                }
                if (!var198 && ~class772.field10658 == -1) {
                    String var199 = class544.field7646.method1614(var197, (byte) 72).method3902(class26.field371, (byte) 106);
                    if (var196 != 2) {
                        if (~var196 != -2) {
                            class224.method1554(var199, var195, var194, var194, 25, var197, 99, 0, (String) null);
                        } else {
                            class224.method1554(var199, "<img=0>" + var195, "<img=0>" + var194, var194, 25, var197, 99, 0, (String) null);
                        }
                    } else {
                        class224.method1554(var199, "<img=1>" + var195, "<img=1>" + var194, var194, 25, var197, 99, 0, (String) null);
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class149.field1920) {
                boolean var200 = ~class26.field371.method842(2384) == -2;
                byte[] var201 = new byte[class440.field6294 + -1];
                class26.field371.method850(255, 0, class440.field6294 + -1, var201);
                class54.method349(24828, var201, var200);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class126.field1648) {
                int var202 = class26.field371.method855(0);
                int var203 = class26.field371.method873(2);
                int var204 = class26.field371.method898((byte) -105);
                int var205 = class26.field371.method862(-25118);
                class548.method3184(-118);
                class216.method1499(var205, var202, var203, var204, (byte) 75);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class483.field6860) {
                int var206 = class26.field371.method871(23995);
                class125.field1645 = class27.field395.method3418(var206, 570795760);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class265.field3749) {
                int var207 = class26.field371.method837(29806);
                int var208 = class26.field371.method846(15319);
                boolean var209 = (var208 & 1) == 1;
                class692.method3891(var207, false, var209);
                class148.field1899[class111.method773(31, class477.field6780++)] = var207;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class571.field8095) {
                int var210 = class26.field371.method894((byte) -58);
                int var211 = class26.field371.method873(2);
                class548.method3184(-104);
                class586.method3401(var210, var211, -23355);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class186.field2796) {
                boolean var212 = ~class26.field371.method842(2384) == -2;
                String var213 = class26.field371.method861(true);
                long var214 = (long) class26.field371.method898((byte) -100);
                long var216 = (long) class26.field371.method833(-3);
                int var218 = class26.field371.method842(2384);
                long var219 = (var214 << 32) + var216;
                boolean var221 = false;
                Object var222 = null;
                class692 var223 = !var212 ? class48.field689 : class777.field10725;
                if (var223 == null) {
                    var221 = true;
                } else {
                    label2149: {
                        for (int var224 = 0; var224 < 100; ++var224) {
                            if (class576.field8144[var224] == var219) {
                                var221 = true;
                                break label2149;
                            }
                        }
                        if (~var218 >= -2) {
                            if ((!class724.field10150 || class542.field7600) && !class365.field5272) {
                                if (class250.method1669((byte) 108, var213)) {
                                    var221 = true;
                                }
                            } else {
                                var221 = true;
                            }
                        }
                    }
                }
                if (!var221 && class772.field10658 == 0) {
                    class576.field8144[class55.field778] = var219;
                    class55.field778 = (class55.field778 + 1) % 100;
                    String var225 = class62.method377(32732, class361.method2267(class26.field371, 16));
                    int var226 = var212 ? 41 : 44;
                    if (~var218 != -3 && var218 != 3) {
                        if (var218 == 1) {
                            class224.method1554(var225, "<img=0>" + var213, "<img=0>" + var213, var213, var226, -1, 99, 0, var223.field9771);
                        } else {
                            class224.method1554(var225, var213, var213, var213, var226, -1, 99, 0, var223.field9771);
                        }
                    } else {
                        class224.method1554(var225, "<img=1>" + var213, "<img=1>" + var213, var213, var226, -1, 99, 0, var223.field9771);
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class412.field5833) {
                boolean var227 = ~class26.field371.method846(15319) == -2;
                class548.method3184(-116);
                class746.field10375 = null;
                class372.field5368 = var227;
                return true;
            } else if (class746.field10375 == class665.field9333) {
                class64.field862 = class504.method2937(6750, class26.field371.method842(2384));
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class328.field4899) {
                int var228 = class26.field371.method871(23995);
                int var229 = class26.field371.method862(-25118);
                class271.field3796.method1782(-1, var228, var229);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class596.field8394) {
                int var230 = class26.field371.method855(0);
                byte var231 = class26.field371.method858(55);
                class548.method3184(-96);
                class681.method3844(false, var231, var230);
                class746.field10375 = null;
                return true;
            } else if (class783.field10774 == class746.field10375) {
                boolean var232 = class26.field371.method842(2384) == 1;
                String var233 = class26.field371.method861(true);
                String var234 = var233;
                if (var232) {
                    var234 = class26.field371.method861(true);
                }
                long var235 = class26.field371.method834(-8616);
                long var237 = (long) class26.field371.method898((byte) -109);
                long var239 = (long) class26.field371.method833(-3);
                int var241 = class26.field371.method842(2384);
                long var242 = (var237 << 32) + var239;
                boolean var244 = false;
                int var245 = 0;
                while (true) {
                    if (var245 >= 100) {
                        if (~var241 >= -2) {
                            if ((!class724.field10150 || class542.field7600) && !class365.field5272) {
                                if (class250.method1669((byte) 67, var234)) {
                                    var244 = true;
                                }
                            } else {
                                var244 = true;
                            }
                        }
                        break;
                    }
                    if (class576.field8144[var245] == var242) {
                        var244 = true;
                        break;
                    }
                    ++var245;
                }
                if (!var244 && class772.field10658 == 0) {
                    class576.field8144[class55.field778] = var242;
                    class55.field778 = (class55.field778 + 1) % 100;
                    String var246 = class62.method377(32732, class361.method2267(class26.field371, 101));
                    if (~var241 != -3 && var241 != 3) {
                        if (var241 == 1) {
                            class224.method1554(var246, "<img=0>" + var234, "<img=0>" + var233, var233, 9, -1, 99, 0, class418.method2500(var235, -24831));
                        } else {
                            class224.method1554(var246, var234, var233, var233, 9, -1, 99, 0, class418.method2500(var235, -24831));
                        }
                    } else {
                        class224.method1554(var246, "<img=1>" + var234, "<img=1>" + var233, var233, 9, -1, 99, 0, class418.method2500(var235, -24831));
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class725.field10170) {
                int var247 = class26.field371.method883((byte) 111);
                int var248 = class26.field371.method883((byte) 117);
                int var249 = class26.field371.method837(29806);
                int var250 = class26.field371.method871(23995);
                class548.method3184(-127);
                class472.method2789(7, var248 << 16 | var249, 1520, var250, var247);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class652.field9198) {
                int var251 = class26.field371.method837(29806);
                class548.method3184(-96);
                class332.method2150(var251, 111);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class270.field3790) {
                int var252 = class26.field371.method898((byte) -78);
                int var253 = class26.field371.method898((byte) -102);
                int var254 = class26.field371.method898((byte) -78);
                class548.method3184(-108);
                if (class110.field1382[var252] != null) {
                    for (int var255 = var253; var254 > var255; ++var255) {
                        int var256 = class26.field371.method833(-3);
                        if (class110.field1382[var252].length > var255 && class110.field1382[var252][var255] != null) {
                            class110.field1382[var252][var255].field2611 = var256;
                        }
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class463.field6614) {
                class155.field2304 = class26.field371.method842(2384);
                for (int var257 = 0; ~var257 > ~class155.field2304; ++var257) {
                    class127.field1657[var257] = class26.field371.method861(true);
                    class745.field10367[var257] = class26.field371.method861(true);
                    if (class745.field10367[var257].equals("")) {
                        class745.field10367[var257] = class127.field1657[var257];
                    }
                    class241.field3456[var257] = class26.field371.method861(true);
                    class182.field2760[var257] = class26.field371.method861(true);
                    if (class182.field2760[var257].equals("")) {
                        class182.field2760[var257] = class241.field3456[var257];
                    }
                    class423.field5972[var257] = false;
                }
                class746.field10375 = null;
                class543.field7610 = class717.field10086;
                return true;
            } else if (class792.field10864 == class746.field10375) {
                class668.method3797(0, class768.field10603);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class235.field3398) {
                String var258 = class26.field371.method861(true);
                Object[] var259 = new Object[var258.length() + 1];
                for (int var260 = var258.length() - 1; ~var260 <= -1; --var260) {
                    if (~var258.charAt(var260) == -116) {
                        var259[var260 + 1] = class26.field371.method861(true);
                    } else {
                        var259[var260 + 1] = new Integer(class26.field371.method871(23995));
                    }
                }
                var259[0] = new Integer(class26.field371.method871(23995));
                class548.method3184(-102);
                class140 var261 = new class140();
                var261.field1808 = var259;
                class353.method2219(var261);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class3.field43) {
                int var262 = class26.field371.method871(23995);
                int var263 = class26.field371.method883((byte) 100);
                class548.method3184(-115);
                class239.method1636(var263, var262, 6);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class69.field914) {
                class668.method3797(0, class155.field2300);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class200.field2941) {
                class668.method3797(0, class390.field5547);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class54.field750) {
                boolean var264 = class26.field371.method842(2384) == 1;
                String var265 = class26.field371.method861(true);
                String var266 = var265;
                if (var264) {
                    var266 = class26.field371.method861(true);
                }
                long var267 = class26.field371.method834(-8616);
                long var269 = (long) class26.field371.method898((byte) -84);
                long var271 = (long) class26.field371.method833(-3);
                int var273 = class26.field371.method842(2384);
                int var274 = class26.field371.method898((byte) -122);
                long var275 = (var269 << 32) - -var271;
                boolean var277 = false;
                int var278 = 0;
                while (true) {
                    if (var278 >= 100) {
                        if (var273 <= 1 && class250.method1669((byte) 59, var266)) {
                            var277 = true;
                        }
                        break;
                    }
                    if (~class576.field8144[var278] == ~var275) {
                        var277 = true;
                        break;
                    }
                    ++var278;
                }
                if (!var277 && class772.field10658 == 0) {
                    class576.field8144[class55.field778] = var275;
                    class55.field778 = (class55.field778 - -1) % 100;
                    String var279 = class544.field7646.method1614(var274, (byte) 72).method3902(class26.field371, (byte) 124);
                    if (~var273 == -3) {
                        class224.method1554(var279, "<img=1>" + var266, "<img=1>" + var265, var265, 20, var274, 99, 0, class418.method2500(var267, -24831));
                    } else if (~var273 == -2) {
                        class224.method1554(var279, "<img=0>" + var266, "<img=0>" + var265, var265, 20, var274, 99, 0, class418.method2500(var267, -24831));
                    } else {
                        class224.method1554(var279, var266, var265, var265, 20, var274, 99, 0, class418.method2500(var267, -24831));
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class402.field5696) {
                class668.method3797(0, class586.field8292);
                class746.field10375 = null;
                return true;
            } else if (class792.field10867 == class746.field10375) {
                class26.field371.field1521 += 28;
                if (class26.field371.method870(88)) {
                    class185.method1377(class26.field371.field1521 + -28, -63, class26.field371);
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class380.field5458) {
                int var280 = class26.field371.method867(true);
                int var281 = class26.field371.method842(2384);
                int var282 = class26.field371.method883((byte) 110);
                if (var282 == 65535) {
                    var282 = -1;
                }
                class534.method3091(var281, var280, (byte) 100, var282);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class61.field830) {
                int var283 = class26.field371.method846(15319);
                int var284 = class26.field371.method883((byte) 115);
                if (~var284 == -65536) {
                    var284 = -1;
                }
                int var285 = class26.field371.method889((byte) 105);
                class659.method3766(var285, var284, 0, var283);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class471.field6714) {
                class9.method77(class440.field6294, class26.field371, 8192, class27.field395);
                class746.field10375 = null;
                return true;
            } else if (class91.field1181 == class746.field10375) {
                int var286 = class26.field371.method867(true);
                int var287 = class26.field371.method842(2384);
                int var288 = class26.field371.method846(15319);
                int var289 = class26.field371.method898((byte) -120) << 2;
                int var290 = class26.field371.method842(2384);
                class548.method3184(-94);
                class588.method3408(var289, false, var290, var288, var287, var286);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class482.field6850) {
                class190.field2841 = ~class440.field6294 < -3 ? class26.field371.method861(true) : class674.field9577.method3825((byte) -10, class526.field7494);
                class402.field5697 = class440.field6294 > 0 ? class26.field371.method898((byte) -124) : -1;
                if (~class402.field5697 == -65536) {
                    class402.field5697 = -1;
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class575.field8139) {
                class417.field5880 = class26.field371.method867(true);
                class273.field3813 = class26.field371.method855(0);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class273.field3809) {
                class599.method3460(true, false);
                class746.field10375 = null;
                return false;
            } else if (class746.field10375 == class498.field7072) {
                int var291 = class26.field371.method835(-116);
                int var292 = class26.field371.method883((byte) 102);
                int var293 = class26.field371.method835(-61);
                class548.method3184(-93);
                class472.method2789(5, var292, 1520, var293, var291);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class205.field3011) {
                int var294 = class26.field371.method898((byte) -89);
                int var295 = class26.field371.method842(2384);
                boolean var296 = (1 & var295) == 1;
                class410.method2465((byte) 32, var296, var294);
                int var297 = class26.field371.method898((byte) -127);
                for (int var298 = 0; ~var297 < ~var298; ++var298) {
                    int var299 = class26.field371.method855(0);
                    if (var299 == 255) {
                        var299 = class26.field371.method873(2);
                    }
                    int var300 = class26.field371.method898((byte) -92);
                    class521.method3035(var300 - 1, (byte) -125, var294, var296, var299, var298);
                }
                class148.field1899[class111.method773(class477.field6780++, 31)] = var294;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class13.field252) {
                String var301 = class26.field371.method861(true);
                boolean var302 = ~class26.field371.method842(2384) == -2;
                String var303;
                if (var302) {
                    var303 = class26.field371.method861(true);
                } else {
                    var303 = var301;
                }
                int var304 = class26.field371.method898((byte) -102);
                byte var305 = class26.field371.method877(-252);
                boolean var306 = false;
                if (~var305 == 127) {
                    var306 = true;
                }
                if (var306) {
                    if (class75.field1011 == 0) {
                        class746.field10375 = null;
                        return true;
                    }
                    boolean var307 = false;
                    int var308;
                    for (var308 = 0; ~var308 > ~class75.field1011 && (!class269.field3772[var308].field1292.equals(var303) || ~class269.field3772[var308].field1288 != ~var304); ++var308) {
                    }
                    if (var308 < class75.field1011) {
                        while (var308 < class75.field1011 + -1) {
                            class269.field3772[var308] = class269.field3772[var308 - -1];
                            ++var308;
                        }
                        --class75.field1011;
                        class269.field3772[class75.field1011] = null;
                    }
                } else {
                    String var309 = class26.field371.method861(true);
                    class103 var310 = new class103();
                    var310.field1292 = var303;
                    var310.field1294 = var301;
                    var310.field1291 = class221.method1524(var310.field1292, -85);
                    var310.field1288 = var304;
                    var310.field1290 = var309;
                    var310.field1287 = var305;
                    int var311;
                    for (var311 = class75.field1011 + -1; var311 >= 0; --var311) {
                        int var312 = class269.field3772[var311].field1291.compareTo(var310.field1291);
                        if (~var312 == -1) {
                            class269.field3772[var311].field1288 = var304;
                            class269.field3772[var311].field1287 = var305;
                            class269.field3772[var311].field1290 = var309;
                            if (var303.equals(class251.field3549.field7955)) {
                                class465.field6626 = var305;
                            }
                            class786.field10802 = class717.field10086;
                            class746.field10375 = null;
                            return true;
                        }
                        if (~var312 > -1) {
                            break;
                        }
                    }
                    if (class75.field1011 >= class269.field3772.length) {
                        class746.field10375 = null;
                        return true;
                    }
                    for (int var313 = class75.field1011 + -1; var311 < var313; --var313) {
                        class269.field3772[var313 - -1] = class269.field3772[var313];
                    }
                    if (~class75.field1011 == -1) {
                        class269.field3772 = new class103[100];
                    }
                    class269.field3772[var311 + 1] = var310;
                    ++class75.field1011;
                    if (var303.equals(class251.field3549.field7955)) {
                        class465.field6626 = var305;
                    }
                }
                class786.field10802 = class717.field10086;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class220.field3139) {
                class435.method2605(class26.field371.method861(true), (byte) -72);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class626.field8836) {
                class377.field5417 = class26.field371.method841(22551);
                class724.field10150 = class26.field371.method842(2384) == 1;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class703.field9903) {
                class548.method3184(-114);
                class391.method2389(-84);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class684.field9712) {
                int var314 = class26.field371.method898((byte) -124);
                int var315 = class26.field371.method835(-79);
                int var316 = class26.field371.method898((byte) -90);
                int var317 = class26.field371.method862(-25118);
                int var318 = class26.field371.method842(2384);
                int var319 = class26.field371.method842(2384);
                int var320 = 7 & var318;
                int var321 = 15 & var318 >> 3;
                if (~var321 == -16) {
                    var321 = -1;
                }
                if (var315 >> 30 != 0) {
                    int var322 = var315 >> 28 & 3;
                    int var323 = ((268427099 & var315) >> 14) - class103.field1295;
                    int var324 = (var315 & 16383) - class175.field2496;
                    if (~var323 <= -1 && var324 >= 0 && ~var323 > ~class109.field1314 && var324 < class760.field10479) {
                        int var325 = var323 * 512 + 256;
                        int var326 = var324 * 512 + 256;
                        int var327 = var322;
                        if (var322 < 3 && class627.method3593(var323, (byte) 74, var324)) {
                            var327 = var322 + 1;
                        }
                        class505 var328 = new class505(var316, var317, class673.field9441, var322, var327, var325, -var314 + class580.method3366(var322, (byte) -95, var326, var325), var326, var323, var323, var324, var324, var320);
                        class299.field4496.method2510(new class33(var328), false);
                    }
                } else if (var315 >> 29 == 0) {
                    if (~(var315 >> 28) != -1) {
                        int var329 = 65535 & var315;
                        class559 var330;
                        if (class223.field3199 == var329) {
                            var330 = class251.field3549;
                        } else {
                            var330 = class581.field8250[var329];
                        }
                        if (var330 != null) {
                            if (~var316 == -65536) {
                                var316 = -1;
                            }
                            class426 var331 = var330.field6434[var319];
                            boolean var332 = true;
                            int var333 = var331.field5987;
                            if (~var316 != 0 && ~var333 != 0) {
                                if (~var316 != ~var333) {
                                    class55 var334 = class87.field1131.method1548(64, var316);
                                    class55 var335 = class87.field1131.method1548(64, var333);
                                    if (~var334.field753 != 0 && ~var335.field753 != 0) {
                                        class129 var336 = class203.field2975.method1931((byte) -81, var334.field753);
                                        class129 var337 = class203.field2975.method1931((byte) -81, var335.field753);
                                        if (var337.field1667 > var336.field1667) {
                                            var332 = false;
                                        }
                                    }
                                } else {
                                    class55 var338 = class87.field1131.method1548(64, var316);
                                    if (var338.field761 && ~var338.field753 != 0) {
                                        class129 var339 = class203.field2975.method1931((byte) -81, var338.field753);
                                        int var340 = var339.field1679;
                                        if (var340 != 0 && ~var340 != -3) {
                                            if (~var340 == -2) {
                                                var332 = true;
                                            }
                                        } else {
                                            var332 = false;
                                        }
                                    }
                                }
                            }
                            if (var332) {
                                var331.field5992 = 0;
                                var331.field5999 = var321;
                                var331.field5989 = var320;
                                var331.field5987 = var316;
                                var331.field5995 = var314;
                                var331.field5994 = 1;
                                var331.field5998 = 0;
                                var331.field5991 = class673.field9441 - -var317;
                                if (~class673.field9441 > ~var331.field5991) {
                                    var331.field5998 = -1;
                                }
                                if (var331.field5987 == 65535) {
                                    var331.field5987 = -1;
                                }
                                if (var331.field5987 != -1 && ~class673.field9441 == ~var331.field5991) {
                                    int var341 = class87.field1131.method1548(64, var331.field5987).field753;
                                    if (var341 != -1) {
                                        class129 var342 = class203.field2975.method1931((byte) -81, var341);
                                        if (var342 != null && var342.field1684 != null && !var330.field6430) {
                                            class524.method3048((byte) 17, 0, var330, var342);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var343 = 65535 & var315;
                    class14 var344 = (class14) class543.field7606.method380((byte) -3, (long) var343);
                    if (var344 != null) {
                        class645 var345 = var344.field262;
                        class426 var346 = var345.field6434[var319];
                        if (~var316 == -65536) {
                            var316 = -1;
                        }
                        boolean var347 = true;
                        int var348 = var346.field5987;
                        if (var316 != -1 && var348 != -1) {
                            if (var316 == var348) {
                                class55 var349 = class87.field1131.method1548(64, var316);
                                if (var349.field761 && var349.field753 != -1) {
                                    class129 var350 = class203.field2975.method1931((byte) -81, var349.field753);
                                    int var351 = var350.field1679;
                                    if (var351 != 0 && var351 != 2) {
                                        if (~var351 == -2) {
                                            var347 = true;
                                        }
                                    } else {
                                        var347 = false;
                                    }
                                }
                            } else {
                                class55 var352 = class87.field1131.method1548(64, var316);
                                class55 var353 = class87.field1131.method1548(64, var348);
                                if (var352.field753 != -1 && ~var353.field753 != 0) {
                                    class129 var354 = class203.field2975.method1931((byte) -81, var352.field753);
                                    class129 var355 = class203.field2975.method1931((byte) -81, var353.field753);
                                    if (var354.field1667 < var355.field1667) {
                                        var347 = false;
                                    }
                                }
                            }
                        }
                        if (var347) {
                            var346.field5995 = var314;
                            var346.field5999 = var321;
                            var346.field5998 = 0;
                            var346.field5991 = class673.field9441 + var317;
                            var346.field5992 = 0;
                            var346.field5987 = var316;
                            var346.field5989 = var320;
                            var346.field5994 = 1;
                            if (~var346.field5987 == -65536) {
                                var346.field5987 = -1;
                            }
                            if (var346.field5991 > class673.field9441) {
                                var346.field5998 = -1;
                            }
                            if (~var346.field5987 != 0 && class673.field9441 == var346.field5991) {
                                int var356 = class87.field1131.method1548(64, var346.field5987).field753;
                                if (var356 != -1) {
                                    class129 var357 = class203.field2975.method1931((byte) -81, var356);
                                    if (var357 != null && var357.field1684 != null && !var345.field6430) {
                                        class524.method3048((byte) 17, 0, var345, var357);
                                    }
                                }
                            }
                        }
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class760.field10482 == class746.field10375) {
                class668.method3797(0, class710.field9999);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class139.field1794) {
                class37.field564 = class717.field10086;
                boolean var358 = class26.field371.method842(2384) == 1;
                class603 var359 = new class603(class26.field371);
                class69 var360;
                if (var358) {
                    var360 = class584.field8265;
                } else {
                    var360 = class492.field6992;
                }
                var359.method3483(var360, -12121);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class364.field5261) {
                class387.method2371(103);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class224.field3221) {
                String var361 = class26.field371.method861(true);
                int var362 = class26.field371.method898((byte) -86);
                String var363 = class544.field7646.method1614(var362, (byte) 72).method3902(class26.field371, (byte) 93);
                class224.method1554(var363, var361, var361, var361, 19, var362, 99, 0, (String) null);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class311.field4629) {
                int var364 = class26.field371.method842(2384);
                class548.method3184(-109);
                class746.field10375 = null;
                class547.field7725 = var364;
                return true;
            } else if (class746.field10375 == class558.field7930) {
                boolean var365 = class26.field371.method842(2384) == 1;
                String var366 = class26.field371.method861(true);
                String var367 = var366;
                if (var365) {
                    var367 = class26.field371.method861(true);
                }
                long var368 = (long) class26.field371.method898((byte) -94);
                long var370 = (long) class26.field371.method833(-3);
                int var372 = class26.field371.method842(2384);
                long var373 = (var368 << 32) + var370;
                boolean var375 = false;
                int var376 = 0;
                while (true) {
                    if (var376 >= 100) {
                        if (var372 <= 1) {
                            if ((!class724.field10150 || class542.field7600) && !class365.field5272) {
                                if (class250.method1669((byte) 81, var367)) {
                                    var375 = true;
                                }
                            } else {
                                var375 = true;
                            }
                        }
                        break;
                    }
                    if (~class576.field8144[var376] == ~var373) {
                        var375 = true;
                        break;
                    }
                    ++var376;
                }
                if (!var375 && class772.field10658 == 0) {
                    class576.field8144[class55.field778] = var373;
                    class55.field778 = (class55.field778 + 1) % 100;
                    String var377 = class62.method377(32732, class361.method2267(class26.field371, 117));
                    if (~var372 != -3) {
                        if (~var372 != -2) {
                            class224.method1554(var377, var367, var366, var366, 3, -1, 99, 0, (String) null);
                        } else {
                            class224.method1554(var377, "<img=0>" + var367, "<img=0>" + var366, var366, 7, -1, 99, 0, (String) null);
                        }
                    } else {
                        class224.method1554(var377, "<img=1>" + var367, "<img=1>" + var366, var366, 7, -1, 99, 0, (String) null);
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class540.field7584) {
                class786.field10802 = class717.field10086;
                if (~class440.field6294 == -1) {
                    class746.field10375 = null;
                    class649.field9136 = null;
                    class75.field1011 = 0;
                    class438.field6283 = null;
                    class269.field3772 = null;
                    return true;
                } else {
                    class649.field9136 = class26.field371.method861(true);
                    boolean var378 = class26.field371.method842(2384) == 1;
                    if (var378) {
                        class26.field371.method861(true);
                    }
                    long var379 = class26.field371.method834(-8616);
                    class438.field6283 = class520.method3030((byte) 65, var379);
                    class275.field3821 = class26.field371.method877(-252);
                    int var381 = class26.field371.method842(2384);
                    if (var381 == 255) {
                        class746.field10375 = null;
                        return true;
                    } else {
                        class75.field1011 = var381;
                        class103[] var382 = new class103[100];
                        for (int var383 = 0; class75.field1011 > var383; ++var383) {
                            var382[var383] = new class103();
                            var382[var383].field1294 = class26.field371.method861(true);
                            boolean var389 = class26.field371.method842(2384) == 1;
                            if (!var389) {
                                var382[var383].field1292 = var382[var383].field1294;
                            } else {
                                var382[var383].field1292 = class26.field371.method861(true);
                            }
                            var382[var383].field1291 = class221.method1524(var382[var383].field1292, -66);
                            var382[var383].field1288 = class26.field371.method898((byte) -84);
                            var382[var383].field1287 = class26.field371.method877(-252);
                            var382[var383].field1290 = class26.field371.method861(true);
                            if (var382[var383].field1292.equals(class251.field3549.field7955)) {
                                class465.field6626 = var382[var383].field1287;
                            }
                        }
                        boolean var384 = false;
                        int var385 = class75.field1011;
                        while (var385 > 0) {
                            --var385;
                            boolean var386 = true;
                            for (int var387 = 0; ~var387 > ~var385; ++var387) {
                                if (~var382[var387].field1291.compareTo(var382[var387 - -1].field1291) < -1) {
                                    class103 var388 = var382[var387];
                                    var382[var387] = var382[var387 + 1];
                                    var382[var387 + 1] = var388;
                                    var386 = false;
                                }
                            }
                            if (var386) {
                                break;
                            }
                        }
                        class746.field10375 = null;
                        class269.field3772 = var382;
                        return true;
                    }
                }
            } else if (class746.field10375 == class539.field7570) {
                class469.field6702 = class26.field371.method855(0);
                class578.field8178 = class26.field371.method877(-252) << 3;
                class633.field8935 = class26.field371.method858(62) << 3;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class365.field5278) {
                String var390 = class26.field371.method861(true);
                int var391 = class26.field371.method883((byte) 107);
                class548.method3184(-92);
                class130.method943(var391, var390, Integer.MIN_VALUE);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class689.field9754) {
                class668.method3797(0, class701.field9893);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class468.field6694) {
                class238.field3436 = class26.field371.method877(-252);
                class746.field10375 = null;
                if (~class238.field3436 == -1 || ~class238.field3436 == -2) {
                    class747.field10382 = true;
                }
                return true;
            } else if (class746.field10375 == class185.field2792) {
                class271.field3796.method1787(-76);
                class217.field3114 += 32;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class626.field8837) {
                int var392 = class26.field371.method855(0);
                int var393 = class26.field371.method837(29806);
                int var394 = class26.field371.method842(2384);
                int var395 = class26.field371.method846(15319);
                int var396 = class26.field371.method855(0);
                class548.method3184(-123);
                class259.field3641[var395] = true;
                class195.field2867[var395] = var396;
                class369.field5311[var395] = var392;
                class229.field3286[var395] = var394;
                class747.field10381[var395] = var393;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class610.field8608) {
                class548.method3184(-126);
                class14.method130((byte) -15);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class638.field8977) {
                int var397 = class26.field371.method835(-42);
                class548.method3184(-93);
                class746.field10375 = null;
                if (var397 == -1) {
                    class406.field5746 = -1;
                    class180.field2732 = -1;
                } else {
                    int var398 = 16383 & var397 >> 14;
                    int var399 = var398 - class103.field1295;
                    int var400 = var397 & 16383;
                    int var401 = var400 - class175.field2496;
                    if (~var399 > -1) {
                        var399 = 0;
                    } else if (var399 >= class109.field1314) {
                        var399 = class109.field1314;
                    }
                    class406.field5746 = (var399 << 9) + 256;
                    if (~var401 <= -1) {
                        if (~var401 <= ~class760.field10479) {
                            var401 = class760.field10479;
                        }
                    } else {
                        var401 = 0;
                    }
                    class180.field2732 = (var401 << 9) - -256;
                }
                return true;
            } else if (class746.field10375 == class177.field2690) {
                int var402 = class26.field371.method871(23995);
                int var403 = class26.field371.method842(2384);
                class548.method3184(-100);
                class382.method2348(var402, 7, var403);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class125.field1634) {
                boolean var404 = ~class26.field371.method842(2384) == -2;
                String var405 = class26.field371.method861(true);
                long var406 = (long) class26.field371.method898((byte) -83);
                long var408 = (long) class26.field371.method833(-3);
                int var410 = class26.field371.method842(2384);
                int var411 = class26.field371.method898((byte) -103);
                long var412 = (var406 << 32) - -var408;
                boolean var414 = false;
                Object var415 = null;
                class692 var416 = var404 ? class777.field10725 : class48.field689;
                if (var416 == null) {
                    var414 = true;
                } else {
                    label2184: {
                        for (int var417 = 0; ~var417 > -101; ++var417) {
                            if (class576.field8144[var417] == var412) {
                                var414 = true;
                                break label2184;
                            }
                        }
                        if (~var410 >= -2 && class250.method1669((byte) 98, var405)) {
                            var414 = true;
                        }
                    }
                }
                if (!var414 && class772.field10658 == 0) {
                    class576.field8144[class55.field778] = var412;
                    class55.field778 = (class55.field778 + 1) % 100;
                    String var418 = class544.field7646.method1614(var411, (byte) 72).method3902(class26.field371, (byte) 110);
                    int var419 = var404 ? 42 : 45;
                    if (var410 != 2 && ~var410 != -4) {
                        if (var410 != 1) {
                            class224.method1554(var418, var405, var405, var405, var419, var411, 99, 0, var416.field9771);
                        } else {
                            class224.method1554(var418, "<img=0>" + var405, "<img=0>" + var405, var405, var419, var411, 99, 0, var416.field9771);
                        }
                    } else {
                        class224.method1554(var418, "<img=1>" + var405, "<img=1>" + var405, var405, var419, var411, 99, 0, var416.field9771);
                    }
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class233.field3375) {
                class746.field10375 = null;
                class543.field7610 = class717.field10086;
                class736.field10279 = 1;
                return true;
            } else if (class746.field10375 == class191.field2852) {
                class634.field8938 = ~class26.field371.method846(15319) == -2;
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class418.field5891) {
                int var420 = class26.field371.method854((byte) -128);
                int var421 = class26.field371.method838(true);
                int var422 = class26.field371.method835(-53);
                class548.method3184(-94);
                class243.method1653(var421, var420, (byte) -107, var422);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class587.field8311) {
                class270.field3785 = class717.field10086;
                boolean var423 = class26.field371.method842(2384) == 1;
                class377 var424 = new class377(class26.field371);
                class692 var425;
                if (!var423) {
                    var425 = class48.field689;
                } else {
                    var425 = class777.field10725;
                }
                var424.method2331(var425, (byte) 99);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class424.field5978) {
                int var426 = class26.field371.method837(29806);
                int var427 = class26.field371.method873(2);
                int var428 = class26.field371.method898((byte) -110);
                int var429 = class26.field371.method883((byte) 118);
                class548.method3184(-126);
                class359.method2256(var426, var428, var429, var427, (byte) 117);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class648.field9125) {
                int var430 = class26.field371.method898((byte) -120);
                byte var431 = class26.field371.method882((byte) 81);
                class271.field3796.method1782(-1, var431, var430);
                class746.field10375 = null;
                return true;
            } else if (class86.field1115 == class746.field10375) {
                int var432 = class26.field371.method873(2);
                if (~class478.field6786 != ~var432) {
                    class478.field6786 = var432;
                    class353.method2226(class534.field7539, -1, -1);
                }
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class445.field6326) {
                int var433 = class26.field371.method835(-43);
                int var434 = class26.field371.method883((byte) 122);
                if (var434 == 65535) {
                    var434 = -1;
                }
                class548.method3184(-104);
                class472.method2789(1, var434, 1520, var433, -1);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class129.field1675) {
                class746.field10375 = null;
                return false;
            } else if (class746.field10375 == class412.field5830) {
                String var435 = class26.field371.method861(true);
                String var436 = class62.method377(32732, class361.method2267(class26.field371, 93));
                class422.method2520(6, 0, var436, var435, var435, -98, var435);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class311.field4625) {
                class270.field3785 = class717.field10086;
                boolean var437 = ~class26.field371.method842(2384) == -2;
                if (class440.field6294 == 1) {
                    if (!var437) {
                        class48.field689 = null;
                    } else {
                        class777.field10725 = null;
                    }
                    class746.field10375 = null;
                    return true;
                } else {
                    if (!var437) {
                        class48.field689 = new class692(class26.field371);
                    } else {
                        class777.field10725 = new class692(class26.field371);
                    }
                    class746.field10375 = null;
                    return true;
                }
            } else if (class746.field10375 == class572.field8105) {
                int var438 = class26.field371.method898((byte) -120);
                if (~var438 == -65536) {
                    var438 = -1;
                }
                int var439 = class26.field371.method842(2384);
                int var440 = class26.field371.method898((byte) -77);
                int var441 = class26.field371.method842(2384);
                int var442 = class26.field371.method898((byte) -126);
                class256.method1686(var442, var440, (byte) 88, var438, false, var439, var441);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class280.field4027) {
                int var443 = class26.field371.method873(2);
                class548.method3184(-119);
                class472.method2789(3, -1, 1520, var443, -1);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class30.field412) {
                class668.method3797(0, class174.field2462);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class547.field7713) {
                int var444 = class26.field371.method883((byte) 124);
                if (var444 == 65535) {
                    var444 = -1;
                }
                int var445 = class26.field371.method871(23995);
                int var446 = class26.field371.method862(-25118);
                if (var446 == 65535) {
                    var446 = -1;
                }
                int var447 = class26.field371.method893((byte) 120);
                class548.method3184(-109);
                for (int var448 = var446; ~var444 <= ~var448; ++var448) {
                    long var449 = ((long) var447 << 32) + (long) var448;
                    class654 var451 = (class654) class180.field2727.method380((byte) -3, var449);
                    class654 var452;
                    if (var451 != null) {
                        var452 = new class654(var445, var451.field9230);
                        var451.method3117((byte) 53);
                    } else if (var448 != -1) {
                        var452 = new class654(var445, -1);
                    } else {
                        var452 = new class654(var445, class518.method3014(var447, 87).field2510.field9230);
                    }
                    class180.field2727.method384(var449, var452, false);
                }
                class746.field10375 = null;
                return true;
            } else if (class771.field10623 == class746.field10375) {
                int var453 = class26.field371.method867(true);
                int var454 = class26.field371.method883((byte) 106);
                class548.method3184(-104);
                class186.method1380(true, var454, (byte) 115, var453);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class146.field1865) {
                class348.method2202(class440.field6294, true, class26.field371);
                class746.field10375 = null;
                return true;
            } else if (class746.field10375 == class469.field6697) {
                class2.field22 = class26.field371.method842(2384);
                class746.field10375 = null;
                return true;
            } else {
                if (arg0 > -89) {
                    field822 = null;
                }
                class329.method2129("T1 - " + (class746.field10375 != null ? class746.field10375.method3555(92) : -1) + "," + (class127.field1655 == null ? -1 : class127.field1655.method3555(-45)) + "," + (class225.field3231 == null ? -1 : class225.field3231.method3555(-108)) + " - " + class440.field6294, false, (Throwable) null);
                class599.method3460(true, false);
                return true;
            }
        }
    }
}
