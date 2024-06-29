import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class21 implements class582 {

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "Lpj;")
    private class132 field298;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Los;")
    private class406 field288;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "Lxa;")
    private class461 field294;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Z")
    public final boolean method104(byte arg0) {
        if (arg0 <= 18) {
            field291 = -58;
        }
        field295++;
        return this.field298.method947(-82, this.field288.field5727);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)Z")
    public static final boolean method105(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            field289 = -88;
        }
        field292++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([BB)V")
    public static final void method106(byte[] arg0, byte arg1) {
        if (arg1 < 2) {
            method106(null, (byte) 41);
        }
        new class96(arg0);
        field296++;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZILln;)V")
    public static final void method107(int arg0, boolean arg1, int arg2, class345 arg3) {
        field290++;
        if (arg3 == null || class487.field6761.field2826 == arg3) {
            return;
        }
        int var4 = arg3.field4977;
        int var5 = arg3.field4987;
        int var6 = arg3.field4983;
        int var7 = (int) arg3.field4979;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg3.field4979;
        if (var6 == 22) {
            class286 var10 = class495.field6821[var7];
            if (var10 != null) {
                class448.field6254++;
                class131.field1795 = 2;
                class31.field372 = 0;
                class683.field9619 = arg0;
                class678.field9555 = arg2;
                class1.method5(1, class675.field9544);
                class288.field4014.method700(269307178, class531.field7246.method666(50, 82) ? 1 : 0);
                class288.field4014.method752(103, var7);
                class524.method2903(var10.method1722((byte) -123), var10.method1722((byte) -122), true, -2, var10.field6483[0], 0, 0, 0, var10.field6477[0]);
            }
        }
        if (var6 == 1003 || var6 == 1001 || var6 == 1010 || var6 == 1006 || var6 == 1011) {
            class80.method633((byte) 121, var4, var6, var7);
        }
        if (var6 == 16) {
            class286 var11 = class495.field6821[var7];
            if (var11 != null) {
                class683.field9619 = arg0;
                class31.field372 = 0;
                class678.field9555 = arg2;
                class3.field25++;
                class131.field1795 = 2;
                class1.method5(1, class585.field8168);
                class288.field4014.method740(var7, true);
                class288.field4014.method742((byte) -105, class531.field7246.method666(50, 82) ? 1 : 0);
                class524.method2903(var11.method1722((byte) -124), var11.method1722((byte) -122), true, -2, var11.field6483[0], 0, 0, 0, var11.field6477[0]);
            }
        }
        if (var6 == 48) {
            class286 var12 = class495.field6821[var7];
            if (var12 != null) {
                class37.field502++;
                class678.field9555 = arg2;
                class31.field372 = 0;
                class683.field9619 = arg0;
                class131.field1795 = 2;
                class1.method5(1, class194.field2878);
                class288.field4014.method742((byte) -127, class531.field7246.method666(50, 82) ? 1 : 0);
                class288.field4014.method752(122, var7);
                class524.method2903(var12.method1722((byte) -121), var12.method1722((byte) -128), true, -2, var12.field6483[0], 0, 0, 0, var12.field6477[0]);
            }
        }
        if (var6 == 15) {
            class286 var13 = class495.field6821[var7];
            if (var13 != null) {
                class683.field9619 = arg0;
                class31.field372 = 0;
                class678.field9555 = arg2;
                class131.field1795 = 2;
                class690.field9697++;
                class1.method5(1, class174.field2607);
                class288.field4014.method746((byte) -107, class531.field7246.method666(50, 82) ? 1 : 0);
                class288.field4014.method757(true, var7);
                class524.method2903(var13.method1722((byte) -120), var13.method1722((byte) -119), true, -2, var13.field6483[0], 0, 0, 0, var13.field6477[0]);
            }
        }
        if (var6 == 4) {
            class678.field9555 = arg2;
            class199.field2931++;
            class31.field372 = 0;
            class131.field1795 = 2;
            class683.field9619 = arg0;
            class1.method5(1, class476.field6645);
            class288.field4014.method757(true, class511.field6989 + var4);
            class288.field4014.method757(true, var7);
            class288.field4014.method700(269307178, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method752(110, class124.field1726 + var5);
            class477.method2716(var4, var5, 1);
        }
        if (var6 == 1008) {
            class678.field9555 = arg2;
            class683.field9619 = arg0;
            class103.field1394++;
            class31.field372 = 0;
            class131.field1795 = 2;
            class1.method5(1, class525.field7178);
            class288.field4014.method700(269307178, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method731(-2045573048, class124.field1726 + var5);
            class288.field4014.method752(91, class511.field6989 + var4);
            class288.field4014.method757(true, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class134.method962(var4, var5, var8, 10392);
        }
        if (var6 == 8) {
            class678.field9555 = arg2;
            class131.field1795 = 2;
            class683.field9619 = arg0;
            class605.field8407++;
            class31.field372 = 0;
            class1.method5(1, class515.field7034);
            class288.field4014.method731(-2045573048, class124.field1726 + var5);
            class288.field4014.method740(var4 + class511.field6989, true);
            class288.field4014.method744(-116, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method740(var7, true);
            class477.method2716(var4, var5, 1);
        }
        if (var6 == 9) {
            class31.field372 = 0;
            class610.field8479++;
            class131.field1795 = 2;
            class678.field9555 = arg2;
            class683.field9619 = arg0;
            class1.method5(1, class181.field2669);
            class288.field4014.method740(class511.field6989 + var4, !arg1);
            class288.field4014.method757(true, var7);
            class288.field4014.method757(true, class124.field1726 + var5);
            class288.field4014.method742((byte) -113, class531.field7246.method666(50, 82) ? 1 : 0);
            class477.method2716(var4, var5, 1);
        }
        if (var6 == 1009) {
            class31.field372 = 0;
            class459.field6495++;
            class683.field9619 = arg0;
            class678.field9555 = arg2;
            class131.field1795 = 2;
            class1.method5(1, class520.field7082);
            class288.field4014.method731(-2045573048, var7);
        }
        if (var6 == 13) {
            class678.field9555 = arg2;
            class131.field1795 = 2;
            class31.field372 = 0;
            class683.field9619 = arg0;
            class189.field2800++;
            class1.method5(1, class296.field4422);
            class288.field4014.method757(true, class511.field6989 + var4);
            class288.field4014.method740(Integer.MAX_VALUE & (int) (var8 >>> 32), !arg1);
            class288.field4014.method700(269307178, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method731(-2045573048, var5 + class124.field1726);
            class134.method962(var4, var5, var8, 10392);
        }
        if (var6 == 45) {
            class131.field1795 = 2;
            class31.field372 = 0;
            class683.field9619 = arg0;
            class678.field9555 = arg2;
            class42.field638++;
            class1.method5(1, class105.field1410);
            class288.field4014.method740((int) (var8 >>> 32) & Integer.MAX_VALUE, true);
            class288.field4014.method740(class511.field6989 + var4, true);
            class288.field4014.method744(-43, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method752(105, class124.field1726 + var5);
            class134.method962(var4, var5, var8, 10392);
        }
        if (var6 == 3) {
            class678.field9555 = arg2;
            class38.field504++;
            class683.field9619 = arg0;
            class31.field372 = 0;
            class131.field1795 = 2;
            class1.method5(1, class230.field3283);
            class288.field4014.method740(var7, true);
            class288.field4014.method752(107, class117.field1560);
            class288.field4014.method731(-2045573048, class124.field1726 + var5);
            class288.field4014.method731(-2045573048, class366.field5205);
            class288.field4014.method746((byte) -127, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method741(class677.field9549, (byte) 27);
            class288.field4014.method731(-2045573048, var4 + class511.field6989);
            class477.method2716(var4, var5, 1);
        }
        if (var6 == 1007) {
            class131.field1795 = 2;
            class678.field9555 = arg2;
            class683.field9619 = arg0;
            class185.field2717++;
            class31.field372 = 0;
            class1.method5(1, class165.field2510);
            class288.field4014.method731(-2045573048, var7);
        }
        if (var6 == 50 && class88.field1195 == null) {
            class1.method4(var5, 0, var4);
            class88.field1195 = class474.method2695(-12025, var5, var4);
            class432.method2481(class88.field1195, -53);
        }
        if (var6 == 59) {
            class178 var14 = (class178) class323.field4762.method2061(-17305, (long) var7);
            if (var14 != null) {
                class225 var15 = var14.field2634;
                class678.field9555 = arg2;
                class31.field372 = 0;
                class368.field5260++;
                class131.field1795 = 2;
                class683.field9619 = arg0;
                class1.method5(1, class620.field8570);
                class288.field4014.method752(93, var7);
                class288.field4014.method744(-90, class531.field7246.method666(50, 82) ? 1 : 0);
                class524.method2903(var15.method1722((byte) -119), var15.method1722((byte) -123), true, -2, var15.field6483[0], 0, 0, 0, var15.field6477[0]);
            }
        }
        if (var6 == 23) {
            class140 var16 = class474.method2695(-12025, var5, var4);
            if (var16 != null) {
                class651.method3622(-1);
                class513 var17 = client.method1655(var16);
                class245.method1520(20316, var17.field7014, var17.method2848(-1), var16);
                class281.field3927 = class397.method2262(var16, (byte) 23);
                class73.field1010 = var16.field2034 + "<col=ffffff>";
                if (class281.field3927 == null) {
                    class281.field3927 = "Null";
                }
            }
            return;
        }
        if (var6 == 21) {
            if (class658.field9267 > 0 && class531.field7246.method666(50, 82) && class531.field7246.method666(50, 81)) {
                class57.method502(class253.field3576.field520, class124.field1726 + var5, (byte) -18, class511.field6989 + var4);
            } else {
                class533.method2946(var5, var4, var7, (byte) -94);
                if (var7 == 1) {
                    class288.field4014.method746((byte) -94, -1);
                    class288.field4014.method746((byte) -124, -1);
                    class288.field4014.method731(-2045573048, (int) class646.field9167);
                    class288.field4014.method746((byte) -109, 57);
                    class288.field4014.method746((byte) -108, class156.field2356);
                    class288.field4014.method746((byte) -112, class455.field6362);
                    class288.field4014.method746((byte) -96, 89);
                    class288.field4014.method731(-2045573048, class253.field3576.field509);
                    class288.field4014.method731(-2045573048, class253.field3576.field514);
                    class288.field4014.method746((byte) -112, 63);
                } else {
                    class678.field9555 = arg2;
                    class31.field372 = 0;
                    class131.field1795 = 1;
                    class683.field9619 = arg0;
                }
                class524.method2903(1, 1, true, -4, var4, 0, 0, 0, var5);
            }
        }
        if (var6 == 46) {
            class286 var18 = class495.field6821[var7];
            if (var18 != null) {
                class678.field9555 = arg2;
                class31.field372 = 0;
                class683.field9619 = arg0;
                class257.field3620++;
                class131.field1795 = 2;
                class1.method5(1, class507.field6948);
                class288.field4014.method740(var7, !arg1);
                class288.field4014.method746((byte) -88, class531.field7246.method666(50, 82) ? 1 : 0);
                class524.method2903(var18.method1722((byte) -124), var18.method1722((byte) -126), true, -2, var18.field6483[0], 0, 0, 0, var18.field6477[0]);
            }
        }
        if (var6 == 49) {
            class286 var19 = class495.field6821[var7];
            if (var19 != null) {
                class131.field1795 = 2;
                class678.field9555 = arg2;
                class683.field9619 = arg0;
                class66.field865++;
                class31.field372 = 0;
                class1.method5(1, class121.field1672);
                class288.field4014.method757(true, var7);
                class288.field4014.method744(-29, class531.field7246.method666(50, 82) ? 1 : 0);
                class524.method2903(var19.method1722((byte) -127), var19.method1722((byte) -119), true, -2, var19.field6483[0], 0, 0, 0, var19.field6477[0]);
            }
        }
        if (var6 == 5) {
            class140 var20 = class474.method2695(-12025, var5, var4);
            if (var20 != null) {
                class666.method3693(118, var20);
            }
        }
        if (var6 == 1004) {
            class131.field1795 = 2;
            class678.field9555 = arg2;
            class683.field9619 = arg0;
            class31.field372 = 0;
            class178 var21 = (class178) class323.field4762.method2061(-17305, (long) var7);
            if (var21 != null) {
                class225 var22 = var21.field2634;
                class161 var23 = var22.field3245;
                if (var23.field2409 != null) {
                    var23 = var23.method1114(class195.field2888, 0);
                }
                if (var23 != null) {
                    class1.method5(1, class520.field7083);
                    class299.field4464++;
                    class288.field4014.method731(-2045573048, var23.field2459);
                }
            }
        }
        if (var6 == 17) {
            class31.field372 = 0;
            class683.field9619 = arg0;
            class290.field4373++;
            class678.field9555 = arg2;
            class131.field1795 = 2;
            class1.method5(1, class641.field9124);
            class288.field4014.method752(109, class511.field6989 + var4);
            class288.field4014.method752(75, var7);
            class288.field4014.method742((byte) -123, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method752(123, class124.field1726 + var5);
            class477.method2716(var4, var5, 1);
        }
        if (var6 == 11) {
            class178 var24 = (class178) class323.field4762.method2061(-17305, (long) var7);
            if (var24 != null) {
                class131.field1795 = 2;
                class225 var25 = var24.field2634;
                class31.field372 = 0;
                class135.field1915++;
                class683.field9619 = arg0;
                class678.field9555 = arg2;
                class1.method5(1, class609.field8467);
                class288.field4014.method731(-2045573048, var7);
                class288.field4014.method742((byte) -113, class531.field7246.method666(50, 82) ? 1 : 0);
                class524.method2903(var25.method1722((byte) -123), var25.method1722((byte) -127), true, -2, var25.field6483[0], 0, 0, 0, var25.field6477[0]);
            }
        }
        if (var6 == 18) {
            class683.field9619 = arg0;
            class678.field9555 = arg2;
            class354.field5076++;
            class131.field1795 = 2;
            class31.field372 = 0;
            class1.method5(1, class466.field6554);
            class288.field4014.method752(104, class117.field1560);
            class288.field4014.method742((byte) -102, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method732(-106, class677.field9549);
            class288.field4014.method752(96, class511.field6989 + var4);
            class288.field4014.method757(true, class366.field5205);
            class288.field4014.method757(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class288.field4014.method731(-2045573048, var5 + class124.field1726);
            class134.method962(var4, var5, var8, 10392);
        }
        if (var6 == 20) {
            class31.field372 = 0;
            class135.field1911++;
            class678.field9555 = arg2;
            class131.field1795 = 2;
            class683.field9619 = arg0;
            class1.method5(1, class314.field4664);
            class288.field4014.method757(true, var4 + class511.field6989);
            class288.field4014.method757(true, var5 + class124.field1726);
            class288.field4014.method700(269307178, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method752(73, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class134.method962(var4, var5, var8, 10392);
        }
        if (var6 == 47) {
            class131.field1795 = 2;
            class31.field372 = 0;
            class683.field9619 = arg0;
            class278.field3891++;
            class678.field9555 = arg2;
            class1.method5(1, class253.field3575);
            class288.field4014.method757(!arg1, class511.field6989 + var4);
            class288.field4014.method731(-2045573048, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class288.field4014.method742((byte) -111, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method731(-2045573048, class124.field1726 + var5);
            class134.method962(var4, var5, var8, 10392);
        }
        if (var6 == 51) {
            class683.field9619 = arg0;
            class131.field1795 = 2;
            class31.field372 = 0;
            class568.field7649++;
            class678.field9555 = arg2;
            class1.method5(1, class175.field2615);
            class288.field4014.method731(-2045573048, class366.field5205);
            class288.field4014.method701(8388607, class677.field9549);
            class288.field4014.method731(-2045573048, class253.field3576.field6388);
            class288.field4014.method744(-99, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method731(-2045573048, class117.field1560);
        }
        if (var6 == 30) {
            class286 var26 = class495.field6821[var7];
            if (var26 != null) {
                class450.field6279++;
                class131.field1795 = 2;
                class683.field9619 = arg0;
                class678.field9555 = arg2;
                class31.field372 = 0;
                class1.method5(1, class26.field340);
                class288.field4014.method742((byte) -126, class531.field7246.method666(50, 82) ? 1 : 0);
                class288.field4014.method731(-2045573048, var7);
                class524.method2903(var26.method1722((byte) -120), var26.method1722((byte) -127), true, -2, var26.field6483[0], 0, 0, 0, var26.field6477[0]);
            }
        }
        if (var6 == 58) {
            class31.field372 = 0;
            class154.field2310++;
            class131.field1795 = 1;
            class683.field9619 = arg0;
            class678.field9555 = arg2;
            class1.method5(1, class131.field1789);
            class288.field4014.method731(-2045573048, class366.field5205);
            class288.field4014.method741(class677.field9549, (byte) 27);
            class288.field4014.method740(class117.field1560, true);
            class288.field4014.method752(126, class511.field6989 + var4);
            class288.field4014.method752(119, class124.field1726 + var5);
            class524.method2903(1, 1, true, -4, var4, 0, 0, 0, var5);
        }
        if (var6 == 44) {
            class178 var27 = (class178) class323.field4762.method2061(-17305, (long) var7);
            if (var27 != null) {
                class225 var28 = var27.field2634;
                class131.field1795 = 2;
                class31.field372 = 0;
                class678.field9555 = arg2;
                class203.field2977++;
                class683.field9619 = arg0;
                class1.method5(1, class134.field1895);
                class288.field4014.method752(73, class366.field5205);
                class288.field4014.method757(!arg1, class117.field1560);
                class288.field4014.method705(!arg1, class677.field9549);
                class288.field4014.method742((byte) -107, class531.field7246.method666(50, 82) ? 1 : 0);
                class288.field4014.method731(-2045573048, var7);
                class524.method2903(var28.method1722((byte) -119), var28.method1722((byte) -125), true, -2, var28.field6483[0], 0, 0, 0, var28.field6477[0]);
            }
        }
        if (var6 == 57) {
            class131.field1795 = 2;
            class678.field9555 = arg2;
            class683.field9619 = arg0;
            class645.field9158++;
            class31.field372 = 0;
            class1.method5(1, class502.field6874);
            class288.field4014.method746((byte) -110, class531.field7246.method666(50, 82) ? 1 : 0);
            class288.field4014.method731(-2045573048, var5 + class124.field1726);
            class288.field4014.method731(-2045573048, var7);
            class288.field4014.method740(var4 + class511.field6989, !arg1);
            class477.method2716(var4, var5, 1);
        }
        if (var6 == 60 || var6 == 1012) {
            class15.method75(arg3.field4985, var7, !arg1, var4, var5);
        }
        if (var6 == 2) {
            class178 var29 = (class178) class323.field4762.method2061(-17305, (long) var7);
            if (var29 != null) {
                class31.field372 = 0;
                class683.field9619 = arg0;
                class610.field8475++;
                class225 var30 = var29.field2634;
                class131.field1795 = 2;
                class678.field9555 = arg2;
                class1.method5(1, class450.field6282);
                class288.field4014.method740(var7, true);
                class288.field4014.method742((byte) -107, class531.field7246.method666(50, 82) ? 1 : 0);
                class524.method2903(var30.method1722((byte) -120), var30.method1722((byte) -128), true, -2, var30.field6483[0], 0, 0, 0, var30.field6477[0]);
            }
        }
        if (arg1) {
            method106(null, (byte) -19);
        }
        if (var6 == 19) {
            class178 var31 = (class178) class323.field4762.method2061(-17305, (long) var7);
            if (var31 != null) {
                class457.field6382++;
                class683.field9619 = arg0;
                class31.field372 = 0;
                class131.field1795 = 2;
                class678.field9555 = arg2;
                class225 var32 = var31.field2634;
                class1.method5(1, class538.field7302);
                class288.field4014.method700(269307178, class531.field7246.method666(50, 82) ? 1 : 0);
                class288.field4014.method757(true, var7);
                class524.method2903(var32.method1722((byte) -124), var32.method1722((byte) -120), true, -2, var32.field6483[0], 0, 0, 0, var32.field6477[0]);
            }
        }
        if (var6 == 25) {
            class178 var33 = (class178) class323.field4762.method2061(-17305, (long) var7);
            if (var33 != null) {
                class225 var34 = var33.field2634;
                class115.field1544++;
                class683.field9619 = arg0;
                class131.field1795 = 2;
                class678.field9555 = arg2;
                class31.field372 = 0;
                class1.method5(1, class152.field2274);
                class288.field4014.method700(269307178, class531.field7246.method666(50, 82) ? 1 : 0);
                class288.field4014.method731(-2045573048, var7);
                class524.method2903(var34.method1722((byte) -123), var34.method1722((byte) -122), true, -2, var34.field6483[0], 0, 0, 0, var34.field6477[0]);
            }
        }
        if (var6 == 10) {
            class286 var35 = class495.field6821[var7];
            if (var35 != null) {
                class31.field372 = 0;
                class678.field9555 = arg2;
                class131.field1795 = 2;
                class568.field7649++;
                class683.field9619 = arg0;
                class1.method5(1, class175.field2615);
                class288.field4014.method731(-2045573048, class366.field5205);
                class288.field4014.method701(8388607, class677.field9549);
                class288.field4014.method731(-2045573048, var7);
                class288.field4014.method744(-116, class531.field7246.method666(50, 82) ? 1 : 0);
                class288.field4014.method731(-2045573048, class117.field1560);
                class524.method2903(var35.method1722((byte) -119), var35.method1722((byte) -127), true, -2, var35.field6483[0], 0, 0, 0, var35.field6477[0]);
            }
        }
        if (var6 == 12) {
            class286 var36 = class495.field6821[var7];
            if (var36 != null) {
                class131.field1795 = 2;
                class678.field9555 = arg2;
                class683.field9619 = arg0;
                class680.field9581++;
                class31.field372 = 0;
                class1.method5(1, class94.field1235);
                class288.field4014.method742((byte) -122, class531.field7246.method666(50, 82) ? 1 : 0);
                class288.field4014.method740(var7, true);
                class524.method2903(var36.method1722((byte) -119), var36.method1722((byte) -124), true, -2, var36.field6483[0], 0, 0, 0, var36.field6477[0]);
            }
        }
        if (var6 == 6) {
            if (class658.field9267 > 0 && class531.field7246.method666(50, 82) && class531.field7246.method666(50, 81)) {
                class57.method502(class253.field3576.field520, class124.field1726 + var5, (byte) -18, class511.field6989 + var4);
            } else {
                class131.field1795 = 1;
                class612.field8492++;
                class678.field9555 = arg2;
                class683.field9619 = arg0;
                class31.field372 = 0;
                class1.method5(1, class488.field6776);
                class288.field4014.method740(class511.field6989 + var4, true);
                class288.field4014.method740(class124.field1726 + var5, true);
            }
        }
        if (class457.field6455) {
            class651.method3622(-1);
        }
        if (class442.field6233 != null && class235.field3394 == 0) {
            class432.method2481(class442.field6233, 111);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        int var2 = 67 % ((41 - arg0) / 54);
        field297++;
        this.field294 = class110.method823(this.field298.method938(this.field288.field5727, (byte) -53), true);
        this.method109(8444, true);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V")
    public final void method109(int arg0, boolean arg1) {
        field293++;
        if (arg1) {
            int var3 = class652.field9217 >= class547.field7412 ? class652.field9217 : class547.field7412;
            int var4 = class603.field8386 < class124.field1711 ? class124.field1711 : class603.field8386;
            this.field294.method2659(0, 0, var3, var4);
        }
        if (arg0 != 8444) {
            this.method109(33, false);
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lpj;Los;)V")
    public class21(class132 arg0, class406 arg1) {
        this.field298 = arg0;
        this.field288 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method110(int arg0, String arg1) {
        field287++;
        if (arg0 >= -61) {
            method105(84, -117, -86);
        }
        if (class623.field8674 != null) {
            class419.field5912++;
            class1.method5(1, class354.field5074);
            class288.field4014.method746((byte) -94, class499.method2790(arg1, 117));
            class288.field4014.method708(-128, arg1);
        }
    }

    static {
        new class433("", 73);
    }
}
