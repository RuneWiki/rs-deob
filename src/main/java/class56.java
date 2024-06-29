import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class56 extends class273 {

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    private int field995 = 4096;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "[I")
    public static int[] field994 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
    public static final void method448(byte arg0, int arg1) {
        ++field987;
        if (arg1 >= 0) {
            int var2 = class223.field3559[arg1];
            int var3 = class15.field231[arg1];
            int var4 = (int) class110.field1703[arg1];
            int var5 = class94.field1468[arg1];
            long var6 = class110.field1703[arg1];
            if (~var5 <= -2001) {
                var5 -= 2000;
            }
            if (~var5 == -46) {
                class213 var8 = class191.field3129[var4];
                if (var8 != null) {
                    ++class245.field3869;
                    class34.field574 = 2;
                    class124.field2075 = class269.field4320;
                    class33.field554 = class111.field1707;
                    class180.field3000 = 0;
                    class87.field1405.method607(205, (byte) 84);
                    class87.field1405.method1021(!class13.field184[82] ? 0 : 1, (byte) -116);
                    class87.field1405.method971(3792, var4);
                }
            }
            if (var5 == 24) {
                class33.field554 = class111.field1707;
                class34.field574 = 2;
                class180.field3000 = 0;
                ++class268.field4303;
                class124.field2075 = class269.field4320;
                class87.field1405.method607(213, (byte) 97);
                class87.field1405.method970(!class13.field184[82] ? 0 : 1, 128);
                class87.field1405.method968((byte) 85, class170.field2787 + var3);
                class87.field1405.method971(3792, class256.field4082 + var2);
                class87.field1405.method1017((byte) 110, Integer.MAX_VALUE & (int) (var6 >>> 32));
            }
            if (~var5 == -17) {
                class87.field1405.method607(196, (byte) 92);
                ++class205.field3296;
                class87.field1405.method1029(var3, 15430);
                class114 var9 = class8.method43(var3, (byte) 43);
                if (var9.field1852 != null && ~var9.field1852[0][0] == -6) {
                    int var10 = var9.field1852[0][1];
                    class192.field3138[var10] = -class192.field3138[var10] + 1;
                    class10.method61(true, var10);
                }
            }
            if (~var5 == -15) {
                class213 var11 = class191.field3129[var4];
                if (var11 != null) {
                    class34.field574 = 2;
                    ++class113.field1740;
                    class33.field554 = class111.field1707;
                    class124.field2075 = class269.field4320;
                    class180.field3000 = 0;
                    class87.field1405.method607(89, (byte) 126);
                    class87.field1405.method999(-23518, !class13.field184[82] ? 0 : 1);
                    class87.field1405.method995(var4, -22205);
                }
            }
            if (var5 == 8) {
                class87.field1405.method607(251, (byte) 84);
                class87.field1405.method971(3792, var4);
                class87.field1405.method995(var2, -22205);
                ++class71.field1188;
                class87.field1405.method995(class189.field3104, -22205);
                class87.field1405.method971(3792, class60.field1026);
                class87.field1405.method1029(var3, 15430);
                class87.field1405.method1029(class258.field4106, 15430);
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) -67);
                class216.field3470 = var2;
            }
            if (var5 == 12) {
                ++class191.field3124;
                class87.field1405.method607(161, (byte) 70);
                class87.field1405.method1029(var3, 15430);
                class87.field1405.method1017((byte) 115, var2);
                class87.field1405.method995(class7.field90, -22205);
                class87.field1405.method973(1111986640, class33.field550);
            }
            if (~var5 == -1006) {
                class124.field2075 = class269.field4320;
                class33.field554 = class111.field1707;
                class180.field3000 = 0;
                class34.field574 = 2;
                ++class176.field2943;
                class87.field1405.method607(209, (byte) 65);
                class87.field1405.method968((byte) 85, var4);
            }
            if (~var5 == -23) {
                ++class101.field1552;
                class87.field1405.method607(9, (byte) 74);
                class87.field1405.method1017((byte) 105, var2);
                class87.field1405.method995(var4, -22205);
                class87.field1405.method973(1111986640, var3);
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) -82);
                class216.field3470 = var2;
            }
            if (~var5 == -20) {
                class139 var12 = class3.field45[var4];
                if (var12 != null) {
                    class180.field3000 = 0;
                    class33.field554 = class111.field1707;
                    class124.field2075 = class269.field4320;
                    class34.field574 = 2;
                    class87.field1405.method607(146, (byte) 122);
                    ++class8.field99;
                    class87.field1405.method971(3792, var4);
                    class87.field1405.method970(!class13.field184[82] ? 0 : 1, 128);
                }
            }
            if (var5 == 31) {
                class139 var13 = class3.field45[var4];
                if (var13 != null) {
                    ++class174.field2939;
                    class124.field2075 = class269.field4320;
                    class34.field574 = 2;
                    class33.field554 = class111.field1707;
                    class180.field3000 = 0;
                    class87.field1405.method607(115, (byte) 76);
                    class87.field1405.method968((byte) 85, var4);
                    class87.field1405.method999(-23518, class13.field184[82] ? 1 : 0);
                }
            }
            if (~var5 == -6) {
                if (var4 == 0) {
                    class65.method505(class92.field1448, var2, var3);
                } else if (var4 == 1) {
                    if (class58.field1012 > 0 && class13.field184[82] && class13.field184[81]) {
                        class209.method1393(class170.field2787 - -var3, class92.field1448, class256.field4082 + var2, -25174);
                    } else {
                        class262.method1763(-22686, 1, var2, var3);
                        class87.field1405.method966((byte) 119, class172.field2919);
                        class87.field1405.method966((byte) 45, class255.field4061);
                        class87.field1405.method971(3792, (int) class1.field1);
                        class87.field1405.method966((byte) 113, 57);
                        class87.field1405.method966((byte) 80, class183.field3022);
                        class87.field1405.method966((byte) 46, class131.field2184);
                        class87.field1405.method966((byte) 84, 89);
                        class87.field1405.method971(3792, class48.field878.field2849);
                        class87.field1405.method971(3792, class48.field878.field2887);
                        class87.field1405.method966((byte) 98, class144.field2375);
                        class87.field1405.method966((byte) 47, 63);
                    }
                }
            }
            if (~var5 == -29) {
                class33.field554 = class111.field1707;
                class34.field574 = 2;
                class180.field3000 = 0;
                class124.field2075 = class269.field4320;
                class87.field1405.method607(208, (byte) 87);
                ++class143.field2359;
                class87.field1405.method973(1111986640, class258.field4106);
                class87.field1405.method995(class189.field3104, -22205);
                class87.field1405.method968((byte) 85, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class87.field1405.method995(class60.field1026, -22205);
                class87.field1405.method999(-23518, !class13.field184[82] ? 0 : 1);
                class87.field1405.method971(3792, var3 - -class170.field2787);
                class87.field1405.method995(class256.field4082 + var2, -22205);
            }
            if (~var5 == -26) {
                class87.field1405.method607(33, (byte) 77);
                ++class252.field4003;
                class87.field1405.method1017((byte) -17, var2);
                class87.field1405.method1017((byte) -27, var4);
                class87.field1405.method984(1, var3);
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) 81);
                class216.field3470 = var2;
            }
            if (var5 == 44) {
                class87.field1405.method607(167, (byte) 125);
                ++class55.field982;
                class87.field1405.method1017((byte) -82, class7.field90);
                class87.field1405.method1017((byte) 76, var4);
                class87.field1405.method995(var2, -22205);
                class87.field1405.method1029(var3, 15430);
                class87.field1405.method1026(83, class33.field550);
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) 120);
                class216.field3470 = var2;
            }
            if (var5 == 57) {
                class87.field1405.method607(4, (byte) 76);
                ++class240.field3783;
                class87.field1405.method968((byte) 85, var2);
                class87.field1405.method971(3792, var4);
                class87.field1405.method1026(115, var3);
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) -121);
                class216.field3470 = var2;
            }
            if (var5 == 1007) {
                ++class213.field3406;
                class180.field3000 = 0;
                class34.field574 = 2;
                class33.field554 = class111.field1707;
                class124.field2075 = class269.field4320;
                class87.field1405.method607(249, (byte) 69);
                class87.field1405.method995(var4, -22205);
            }
            if (var5 == 1) {
                class139 var14 = class3.field45[var4];
                if (var14 != null) {
                    class124.field2075 = class269.field4320;
                    ++class84.field1388;
                    class33.field554 = class111.field1707;
                    class180.field3000 = 0;
                    class34.field574 = 2;
                    class87.field1405.method607(119, (byte) 117);
                    class87.field1405.method966((byte) 39, !class13.field184[82] ? 0 : 1);
                    class87.field1405.method968((byte) 85, var4);
                    class87.field1405.method1029(class33.field550, 15430);
                    class87.field1405.method995(class7.field90, -22205);
                }
            }
            if (var5 == 48) {
                class213 var15 = class191.field3129[var4];
                if (var15 != null) {
                    ++class15.field226;
                    class34.field574 = 2;
                    class180.field3000 = 0;
                    class124.field2075 = class269.field4320;
                    class33.field554 = class111.field1707;
                    class87.field1405.method607(7, (byte) 61);
                    class87.field1405.method999(-23518, !class13.field184[82] ? 0 : 1);
                    class87.field1405.method995(var4, -22205);
                }
            }
            if (~var5 == -52) {
                class87.field1405.method607(81, (byte) 107);
                class87.field1405.method984(1, var3);
                class87.field1405.method995(var2, -22205);
                class87.field1405.method995(var4, -22205);
                ++class260.field4132;
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) 37);
                class216.field3470 = var2;
            }
            if (~var5 == -1003) {
                class33.field554 = class111.field1707;
                class34.field574 = 2;
                class180.field3000 = 0;
                class124.field2075 = class269.field4320;
                class139 var16 = class3.field45[var4];
                if (var16 != null) {
                    class165 var17 = var16.field2321;
                    if (var17.field2741 != null) {
                        var17 = var17.method1188((byte) -58);
                    }
                    if (var17 != null) {
                        ++class201.field3268;
                        class87.field1405.method607(19, (byte) 70);
                        class87.field1405.method971(3792, var17.field2703);
                    }
                }
            }
            if (var5 == 60) {
                class213 var18 = class191.field3129[var4];
                if (var18 != null) {
                    class34.field574 = 2;
                    class33.field554 = class111.field1707;
                    class124.field2075 = class269.field4320;
                    ++class50.field912;
                    class180.field3000 = 0;
                    class87.field1405.method607(180, (byte) 59);
                    class87.field1405.method968((byte) 85, var4);
                    class87.field1405.method970(!class13.field184[82] ? 0 : 1, 128);
                }
            }
            if (~var5 == -38) {
                class87.field1405.method607(103, (byte) 92);
                ++class285.field4531;
                class87.field1405.method968((byte) 85, var4);
                class87.field1405.method968((byte) 85, var2);
                class87.field1405.method1029(var3, 15430);
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) 50);
                class216.field3470 = var2;
            }
            if (var5 == 15) {
                class213 var19 = class191.field3129[var4];
                if (var19 != null) {
                    class34.field574 = 2;
                    class180.field3000 = 0;
                    ++class48.field885;
                    class124.field2075 = class269.field4320;
                    class33.field554 = class111.field1707;
                    class87.field1405.method607(232, (byte) 127);
                    class87.field1405.method995(var4, -22205);
                    class87.field1405.method973(1111986640, class33.field550);
                    class87.field1405.method968((byte) 85, class7.field90);
                    class87.field1405.method966((byte) 67, class13.field184[82] ? 1 : 0);
                }
            }
            if (var5 == 58) {
                class87.field1405.method607(5, (byte) 104);
                class87.field1405.method971(3792, var2);
                ++class226.field3600;
                class87.field1405.method995(var4, -22205);
                class87.field1405.method1026(85, var3);
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) -122);
                class216.field3470 = var2;
            }
            if (~var5 == -42) {
                class87.field1405.method607(43, (byte) 80);
                ++class153.field2493;
                class87.field1405.method1017((byte) 102, var4);
                class87.field1405.method971(3792, var2);
                class87.field1405.method1026(82, var3);
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) 21);
                class216.field3470 = var2;
            }
            if (~var5 == -41) {
                class137.method1033(-93);
            }
            if (~var5 == -44) {
                class139 var20 = class3.field45[var4];
                if (var20 != null) {
                    class34.field574 = 2;
                    class33.field554 = class111.field1707;
                    ++class218.field3502;
                    class124.field2075 = class269.field4320;
                    class180.field3000 = 0;
                    class87.field1405.method607(233, (byte) 74);
                    class87.field1405.method995(class60.field1026, -22205);
                    class87.field1405.method995(class189.field3104, -22205);
                    class87.field1405.method1021(!class13.field184[82] ? 0 : 1, (byte) -116);
                    class87.field1405.method973(1111986640, class258.field4106);
                    class87.field1405.method1017((byte) 109, var4);
                }
            }
            if (var5 == 50) {
                class33.field554 = class111.field1707;
                class180.field3000 = 0;
                ++class172.field2917;
                class124.field2075 = class269.field4320;
                class34.field574 = 2;
                class87.field1405.method607(159, (byte) 76);
                class87.field1405.method970(!class13.field184[82] ? 0 : 1, 128);
                class87.field1405.method971(3792, var4);
                class87.field1405.method971(3792, class170.field2787 + var3);
                class87.field1405.method968((byte) 85, var2 - -class256.field4082);
            }
            if (~var5 == -24) {
                class139 var21 = class3.field45[var4];
                if (var21 != null) {
                    class180.field3000 = 0;
                    class124.field2075 = class269.field4320;
                    class34.field574 = 2;
                    class33.field554 = class111.field1707;
                    class87.field1405.method607(239, (byte) 113);
                    class87.field1405.method995(var4, -22205);
                    class87.field1405.method1021(!class13.field184[82] ? 0 : 1, (byte) -116);
                    ++class179.field2976;
                }
            }
            if (var5 == 47) {
                class124.field2075 = class269.field4320;
                class34.field574 = 2;
                class180.field3000 = 0;
                class33.field554 = class111.field1707;
                class87.field1405.method607(130, (byte) 95);
                ++class44.field793;
                class87.field1405.method971(3792, Integer.MAX_VALUE & (int) (var6 >>> 32));
                class87.field1405.method966((byte) 75, !class13.field184[82] ? 0 : 1);
                class87.field1405.method971(3792, class170.field2787 + var3);
                class87.field1405.method995(class256.field4082 + var2, -22205);
            }
            if (~var5 == -1007) {
                class34.field574 = 2;
                ++class70.field1174;
                class33.field554 = class111.field1707;
                class124.field2075 = class269.field4320;
                class180.field3000 = 0;
                class87.field1405.method607(12, (byte) 118);
                class87.field1405.method970(class13.field184[82] ? 1 : 0, 128);
                class87.field1405.method995(class256.field4082 + var2, -22205);
                class87.field1405.method971(3792, Integer.MAX_VALUE & (int) (var6 >>> 32));
                class87.field1405.method971(3792, class170.field2787 + var3);
            }
            if (~var5 == -39) {
                class213 var22 = class191.field3129[var4];
                if (var22 != null) {
                    class124.field2075 = class269.field4320;
                    class180.field3000 = 0;
                    ++class75.field1236;
                    class34.field574 = 2;
                    class33.field554 = class111.field1707;
                    class87.field1405.method607(102, (byte) 112);
                    class87.field1405.method970(class13.field184[82] ? 1 : 0, 128);
                    class87.field1405.method968((byte) 85, var4);
                }
            }
            if (var5 == 42 && class295.field4677 == null) {
                class37.method314(var2, var3, 79);
                class295.field4677 = class129.method939(var3, 36, var2);
                class72.method556(0, class295.field4677);
            }
            if (var5 == 36) {
                class213 var23 = class191.field3129[var4];
                if (var23 != null) {
                    class33.field554 = class111.field1707;
                    class180.field3000 = 0;
                    class124.field2075 = class269.field4320;
                    class34.field574 = 2;
                    class87.field1405.method607(164, (byte) 125);
                    class87.field1405.method999(-23518, class13.field184[82] ? 1 : 0);
                    ++class286.field4553;
                    class87.field1405.method1017((byte) -110, var4);
                }
            }
            if (~var5 == -7 || ~var5 == -1005) {
                class276.method1863(-100, var4, var3, var2, class217.field3488[arg1]);
            }
            if (~var5 == -31) {
                class139 var24 = class3.field45[var4];
                if (var24 != null) {
                    class34.field574 = 2;
                    ++class9.field103;
                    class124.field2075 = class269.field4320;
                    class33.field554 = class111.field1707;
                    class180.field3000 = 0;
                    class87.field1405.method607(39, (byte) 63);
                    class87.field1405.method966((byte) 124, !class13.field184[82] ? 0 : 1);
                    class87.field1405.method995(var4, -22205);
                }
            }
            if (~var5 == -3) {
                class114 var25 = class8.method43(var3, (byte) 49);
                boolean var26 = true;
                if (~var25.field1929 < -1) {
                    var26 = class43.method373(var25, 23142);
                }
                if (var26) {
                    ++class205.field3296;
                    class87.field1405.method607(196, (byte) 104);
                    class87.field1405.method1029(var3, 15430);
                }
            }
            if (~var5 == -8) {
                if (var4 == 0) {
                    class171.field2862 = 1;
                    class65.method505(class92.field1448, var2, var3);
                } else if (~var4 == -2) {
                    class87.field1405.method607(79, (byte) 75);
                    class87.field1405.method968((byte) 85, class7.field90);
                    class87.field1405.method971(3792, class256.field4082 - -var2);
                    ++class257.field4089;
                    class87.field1405.method971(3792, class170.field2787 - -var3);
                    class87.field1405.method973(1111986640, class33.field550);
                }
            }
            if (var5 == 33) {
                class34.field574 = 2;
                class180.field3000 = 0;
                class33.field554 = class111.field1707;
                class124.field2075 = class269.field4320;
                class87.field1405.method607(31, (byte) 71);
                class87.field1405.method1017((byte) -113, class60.field1026);
                ++class240.field3784;
                class87.field1405.method995(var4, -22205);
                class87.field1405.method1026(88, class258.field4106);
                class87.field1405.method968((byte) 85, class170.field2787 + var3);
                class87.field1405.method995(var2 - -class256.field4082, -22205);
                class87.field1405.method970(!class13.field184[82] ? 0 : 1, 128);
                class87.field1405.method995(class189.field3104, -22205);
            }
            if (~var5 == -30) {
                class87.field1405.method607(190, (byte) 82);
                ++class269.field4314;
                class87.field1405.method971(3792, var4);
                class87.field1405.method1017((byte) -54, var2);
                class87.field1405.method973(1111986640, var3);
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) -66);
                class216.field3470 = var2;
            }
            if (var5 == 1003) {
                class114 var27 = class8.method43(var3, (byte) -99);
                if (var27 != null && ~var27.field1777[var2] <= -100001) {
                    class106.method787(var27.field1777[var2] + " x " + class190.method1314(var4, (byte) 68).field1155, "", 0, true);
                } else {
                    ++class213.field3406;
                    class87.field1405.method607(249, (byte) 68);
                    class87.field1405.method995(var4, -22205);
                }
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) 70);
                class216.field3470 = var2;
            }
            if (~var5 == -60) {
                class213 var28 = class191.field3129[var4];
                if (var28 != null) {
                    ++class60.field1023;
                    class124.field2075 = class269.field4320;
                    class33.field554 = class111.field1707;
                    class34.field574 = 2;
                    class180.field3000 = 0;
                    class87.field1405.method607(37, (byte) 107);
                    class87.field1405.method1029(class258.field4106, 15430);
                    class87.field1405.method1021(class13.field184[82] ? 1 : 0, (byte) -116);
                    class87.field1405.method1017((byte) 123, var4);
                    class87.field1405.method995(class189.field3104, -22205);
                    class87.field1405.method995(class60.field1026, -22205);
                }
            }
            if (var5 == 10) {
                class87.field1405.method607(231, (byte) 117);
                ++class183.field3023;
                class87.field1405.method984(1, var3);
                class87.field1405.method1017((byte) 98, var2);
                class87.field1405.method995(var4, -22205);
                class274.field4373 = 0;
                class135.field2223 = class8.method43(var3, (byte) -64);
                class216.field3470 = var2;
            }
            if (~var5 == -40) {
                class114 var29 = class129.method939(var3, 36, var2);
                if (var29 != null) {
                    class281.method1886(-34);
                    class253 var30 = client.method1916(var29);
                    class204.method1375(1, var29.field1759, var3, var29.field1894, var30.method1686(99), var2, var30.field4037);
                    class219.field3514 = 0;
                    class135.field2226 = class186.method1293(var29, -1);
                    if (var29.field1765) {
                        class20.field314 = var29.field1897 + "<col=ffffff>";
                    } else {
                        class20.field314 = "<col=00ff00>" + var29.field1887 + "<col=ffffff>";
                    }
                    if (class135.field2226 == null) {
                        class135.field2226 = "Null";
                    }
                }
            } else {
                if (~var5 == -27) {
                    class124.field2075 = class269.field4320;
                    class33.field554 = class111.field1707;
                    ++class269.field4317;
                    class34.field574 = 2;
                    class180.field3000 = 0;
                    class87.field1405.method607(154, (byte) 110);
                    class87.field1405.method966((byte) 126, class13.field184[82] ? 1 : 0);
                    class87.field1405.method968((byte) 85, var2 - -class256.field4082);
                    class87.field1405.method968((byte) 85, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    class87.field1405.method995(class170.field2787 + var3, -22205);
                }
                if (var5 == 9) {
                    class34.field574 = 2;
                    class33.field554 = class111.field1707;
                    ++class25.field392;
                    class180.field3000 = 0;
                    class124.field2075 = class269.field4320;
                    class87.field1405.method607(226, (byte) 62);
                    class87.field1405.method995(var4, -22205);
                    class87.field1405.method1021(!class13.field184[82] ? 0 : 1, (byte) -116);
                    class87.field1405.method995(class170.field2787 + var3, -22205);
                    class87.field1405.method995(class256.field4082 + var2, -22205);
                }
                if (~var5 == -36) {
                    class87.field1405.method607(196, (byte) 124);
                    ++class205.field3296;
                    class87.field1405.method1029(var3, 15430);
                    class114 var31 = class8.method43(var3, (byte) 64);
                    if (var31.field1852 != null && ~var31.field1852[0][0] == -6) {
                        int var32 = var31.field1852[0][1];
                        if (~class192.field3138[var32] != ~var31.field1860[0]) {
                            class192.field3138[var32] = var31.field1860[0];
                            class10.method61(true, var32);
                        }
                    }
                }
                if (~var5 == -47) {
                    class33.field554 = class111.field1707;
                    class34.field574 = 2;
                    class124.field2075 = class269.field4320;
                    class180.field3000 = 0;
                    class87.field1405.method607(216, (byte) 62);
                    class87.field1405.method971(3792, class256.field4082 + var2);
                    class87.field1405.method1017((byte) 115, class170.field2787 + var3);
                    ++class211.field3378;
                    class87.field1405.method1021(!class13.field184[82] ? 0 : 1, (byte) -116);
                    class87.field1405.method968((byte) 85, var4);
                }
                if (~var5 == -35) {
                    class213 var33 = class191.field3129[var4];
                    if (var33 != null) {
                        class33.field554 = class111.field1707;
                        ++class92.field1449;
                        class124.field2075 = class269.field4320;
                        class34.field574 = 2;
                        class180.field3000 = 0;
                        class87.field1405.method607(156, (byte) 99);
                        class87.field1405.method1021(!class13.field184[82] ? 0 : 1, (byte) -116);
                        class87.field1405.method995(var4, -22205);
                    }
                }
                if (~var5 == -21) {
                    class139 var34 = class3.field45[var4];
                    if (var34 != null) {
                        ++class84.field1379;
                        class34.field574 = 2;
                        class33.field554 = class111.field1707;
                        class124.field2075 = class269.field4320;
                        class180.field3000 = 0;
                        class87.field1405.method607(0, (byte) 95);
                        class87.field1405.method971(3792, var4);
                        class87.field1405.method970(!class13.field184[82] ? 0 : 1, 128);
                    }
                }
                if (~var5 == -33) {
                    class34.field574 = 2;
                    ++class94.field1470;
                    class180.field3000 = 0;
                    class124.field2075 = class269.field4320;
                    class33.field554 = class111.field1707;
                    class87.field1405.method607(187, (byte) 94);
                    class87.field1405.method1017((byte) -95, class170.field2787 + var3);
                    class87.field1405.method995(class256.field4082 + var2, -22205);
                    class87.field1405.method971(3792, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    class87.field1405.method966((byte) 46, !class13.field184[82] ? 0 : 1);
                }
                if (arg0 > -117) {
                    method448((byte) -104, 89);
                }
                if (~var5 == -5) {
                    class87.field1405.method607(116, (byte) 126);
                    class87.field1405.method1017((byte) -47, var2);
                    class87.field1405.method1026(62, var3);
                    ++class180.field2995;
                    class87.field1405.method995(var4, -22205);
                    class274.field4373 = 0;
                    class135.field2223 = class8.method43(var3, (byte) 93);
                    class216.field3470 = var2;
                }
                if (var5 == 21) {
                    class180.field3000 = 0;
                    class124.field2075 = class269.field4320;
                    class33.field554 = class111.field1707;
                    ++class174.field2938;
                    class34.field574 = 2;
                    class87.field1405.method607(53, (byte) 116);
                    class87.field1405.method966((byte) 48, class13.field184[82] ? 1 : 0);
                    class87.field1405.method973(1111986640, class33.field550);
                    class87.field1405.method968((byte) 85, class7.field90);
                    class87.field1405.method968((byte) 85, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    class87.field1405.method971(3792, class170.field2787 + var3);
                    class87.field1405.method968((byte) 85, var2 - -class256.field4082);
                }
                if (~var5 == -14) {
                    if (var4 != 0) {
                        if (~class58.field1012 < -1 && class13.field184[82] && class13.field184[81]) {
                            class209.method1393(class170.field2787 - -var3, class92.field1448, class256.field4082 - -var2, -25174);
                        } else {
                            class87.field1405.method607(136, (byte) 62);
                            class87.field1405.method1017((byte) 111, class256.field4082 + var2);
                            class87.field1405.method971(3792, class170.field2787 + var3);
                            ++class114.field1794;
                        }
                    } else {
                        class85.field1393 = 1;
                        class65.method505(class92.field1448, var2, var3);
                    }
                }
                if (~var5 == -4) {
                    class124.field2075 = class269.field4320;
                    class180.field3000 = 0;
                    class34.field574 = 2;
                    ++class142.field2355;
                    class33.field554 = class111.field1707;
                    class87.field1405.method607(90, (byte) 115);
                    class87.field1405.method971(3792, var4);
                    class87.field1405.method1017((byte) 119, var3 - -class170.field2787);
                    class87.field1405.method995(class256.field4082 + var2, -22205);
                    class87.field1405.method1021(class13.field184[82] ? 1 : 0, (byte) -116);
                }
                if (~var5 == -12) {
                    class180.field3000 = 0;
                    ++class222.field3546;
                    class124.field2075 = class269.field4320;
                    class34.field574 = 2;
                    class33.field554 = class111.field1707;
                    class87.field1405.method607(29, (byte) 89);
                    class87.field1405.method999(-23518, class13.field184[82] ? 1 : 0);
                    class87.field1405.method995(class256.field4082 + var2, -22205);
                    class87.field1405.method968((byte) 85, class7.field90);
                    class87.field1405.method973(1111986640, class33.field550);
                    class87.field1405.method1017((byte) 111, class170.field2787 + var3);
                    class87.field1405.method968((byte) 85, var4);
                }
                if (~var5 == -19) {
                    class213 var35 = class191.field3129[var4];
                    if (var35 != null) {
                        ++class225.field3585;
                        class33.field554 = class111.field1707;
                        class124.field2075 = class269.field4320;
                        class180.field3000 = 0;
                        class34.field574 = 2;
                        class87.field1405.method607(76, (byte) 121);
                        class87.field1405.method971(3792, var4);
                        class87.field1405.method1021(class13.field184[82] ? 1 : 0, (byte) -116);
                    }
                }
                if (~var5 == -50) {
                    class34.field574 = 2;
                    class180.field3000 = 0;
                    ++class191.field3133;
                    class33.field554 = class111.field1707;
                    class124.field2075 = class269.field4320;
                    class87.field1405.method607(250, (byte) 94);
                    class87.field1405.method995(var4, -22205);
                    class87.field1405.method970(class13.field184[82] ? 1 : 0, 128);
                    class87.field1405.method995(class170.field2787 + var3, -22205);
                    class87.field1405.method995(class256.field4082 + var2, -22205);
                }
                if (var5 == 17) {
                    class281.method1886(-105);
                    class114 var36 = class8.method43(var3, (byte) -69);
                    class219.field3514 = 1;
                    class189.field3104 = var2;
                    class60.field1026 = var4;
                    class258.field4106 = var3;
                    class72.method556(0, var36);
                    class236.field3730 = "<col=ff9040>" + class190.method1314(var4, (byte) 68).field1155 + "<col=ffffff>";
                    if (class236.field3730 == null) {
                        class236.field3730 = "null";
                    }
                } else {
                    if (~class219.field3514 != -1) {
                        class219.field3514 = 0;
                        class72.method556(0, class8.method43(class258.field4106, (byte) -101));
                    }
                    if (class239.field3761) {
                        class281.method1886(-20);
                    }
                    if (class135.field2223 != null && ~class274.field4373 == -1) {
                        class72.method556(0, class135.field2223);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method449(byte arg0, String[] arg1) {
        ++field990;
        String[] var2 = new String[5];
        if (arg0 != -30) {
            method450(77, -36, -119, -79, -33, -9, -12, 43, 13, -15, -93, -44, 91, -67, 18, -89, -27, 87, 83, 28);
        }
        for (int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            method449((byte) 11, (String[]) null);
        }
        ++field989;
        int[] var3 = super.field4359.method387((byte) -117, arg1);
        if (super.field4359.field833) {
            int[] var4 = this.method1850(class145.field2392 & arg1 + -1, 0, (byte) -122);
            int[] var5 = this.method1850(arg1, 0, (byte) 45);
            int[] var6 = this.method1850(arg1 + 1 & class145.field2392, 0, (byte) -127);
            for (int var7 = 0; ~var7 > ~class26.field458; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field995;
                int var9 = (var5[client.field4573 & var7 - -1] + -var5[var7 - 1 & client.field4573]) * this.field995;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class105 var20 = new class105(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class26.field455[var21][arg1][arg2] == null) {
                    class26.field455[var21][arg1][arg2] = new class129(var21, arg1, arg2);
                }
            }
            class26.field455[arg0][arg1][arg2].field2132 = var20;
        } else if (arg3 != 1) {
            class117 var24 = new class117(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class26.field455[var25][arg1][arg2] == null) {
                    class26.field455[var25][arg1][arg2] = new class129(var25, arg1, arg2);
                }
            }
            class26.field455[arg0][arg1][arg2].field2146 = var24;
        } else {
            class105 var22 = new class105(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class26.field455[var23][arg1][arg2] == null) {
                    class26.field455[var23][arg1][arg2] = new class129(var23, arg1, arg2);
                }
            }
            class26.field455[arg0][arg1][arg2].field2132 = var22;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            if (~arg1 == -1) {
                this.field995 = arg0.method996(arg2 + 65275);
            }
            ++field992;
        }
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V")
    public static void method451(int arg0) {
        field994 = null;
        if (arg0 != 0) {
            method450(107, 5, 65, 31, 125, 32, -17, -41, -57, 51, -95, -99, 65, -49, -34, 69, -7, -61, 4, 125);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class56() {
        super(1, true);
    }
}
