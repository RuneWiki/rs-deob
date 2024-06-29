import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class268 extends class270 {

    @OriginalMember(owner = "client!j", name = "O", descriptor = "Ljh;")
    public static class444 field4020 = new class444(5000);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "[I")
    public static int[] field4021 = new int[14];

    @OriginalMember(owner = "client!j", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4023 = "Starting 3d Library";

    @OriginalMember(owner = "client!j", name = "S", descriptor = "[Z")
    public static boolean[] field4024 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "[Lt;")
    public static class319[] field4019;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method1909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4022;
        int var8 = -arg1 + arg3;
        int var9 = arg1 + arg7;
        for (int var10 = arg7; ~var10 > ~var9; ++var10) {
            class47.method379(arg4, (byte) 91, arg6, class286.field4283[var10], arg5);
        }
        for (int var11 = arg3; var8 < var11; --var11) {
            class47.method379(arg4, (byte) 73, arg6, class286.field4283[var11], arg5);
        }
        if (arg2 != -101) {
            method1909(-79, -66, 45, 121, 80, 99, 28, -57);
        }
        int var12 = arg1 + arg5;
        int var13 = -arg1 + arg4;
        for (int var14 = var9; ~var14 >= ~var8; ++var14) {
            int[] var15 = class286.field4283[var14];
            class47.method379(var12, (byte) 98, arg6, var15, arg5);
            class47.method379(var13, (byte) 86, arg0, var15, var12);
            class47.method379(arg4, (byte) 83, arg6, var15, var13);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)[I", line = 59)
    public final int[] method81(byte arg0, int arg1) {
        ++field4015;
        int[] var3 = super.field4053.method396(arg1, -33);
        if (super.field4053.field815) {
            int[][] var4 = this.method1930(arg1, 0, (byte) -75);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class161.field2445; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        if (arg0 < 26) {
            field4012 = 68;
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLqp;)V", line = 100)
    public static final void method1910(byte arg0, class278 arg1) {
        ++field4014;
        if (arg1 != null && class276.field4153.field322 != arg1) {
            int var2 = arg1.field4181;
            int var3 = arg1.field4178;
            int var4 = arg1.field4182;
            int var5 = (int) arg1.field4186;
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            long var6 = arg1.field4186;
            if (arg0 < 31) {
                field4024 = null;
            }
            if (var4 == 6) {
                ++class229.field3352;
                class13.field216.method2781(false, 190);
                class13.field216.method275(var3, 1414495172);
                class258 var8 = class342.method2207(var3, (byte) 14);
                if (var8.field3748 != null && var8.field3748[0][0] == 5) {
                    int var9 = var8.field3748[0][1];
                    class351.field4988[var9] = -class351.field4988[var9] + 1;
                    class381.method2411(0, var9);
                }
            }
            if (var4 == 50) {
                class311.method2122(false, 49);
            }
            if (var4 == 58) {
                class205.field3004 = class78.field1320;
                class197.field2878 = 2;
                ++class362.field5160;
                class169.field2519 = class62.field1000;
                class342.field4848 = 0;
                class13.field216.method2781(false, 12);
                class13.field216.method260(class294.field4362 + var3, (byte) -31);
                class13.field216.method283((byte) 107, var2 - -class379.field5384);
                class13.field216.method289(!class33.field482[82] ? 0 : 1, -7196);
                class13.field216.method319(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -82);
                class172.method1314(var3, 64, var2, var6);
            }
            if (var4 == 26) {
                ++class129.field2105;
                class169.field2519 = class62.field1000;
                class197.field2878 = 2;
                class342.field4848 = 0;
                class205.field3004 = class78.field1320;
                class13.field216.method2781(false, 100);
                class13.field216.method318(!class33.field482[82] ? 0 : 1, (byte) -119);
                class13.field216.method260(var3 - -class294.field4362, (byte) 114);
                class13.field216.method319(var5, (byte) -107);
                class13.field216.method283((byte) 106, class379.field5384 + var2);
                class19.method124(var3, var2, 1);
            }
            if (var4 == 33) {
                class258 var10 = class342.method2207(var3, (byte) 14);
                boolean var11 = true;
                if (var10.field3821 > 0) {
                    var11 = class52.method418(250, var10);
                }
                if (var11) {
                    class13.field216.method2781(false, 190);
                    ++class229.field3352;
                    class13.field216.method275(var3, 1414495172);
                }
            }
            if (~var4 == -49) {
                ++class332.field4768;
                class13.field216.method2781(false, 72);
                class13.field216.method275(var3, 1414495172);
                class13.field216.method283((byte) 116, var2);
                class13.field216.method324(var5, -128);
                class228.field3345 = 0;
                class21.field318 = class342.method2207(var3, (byte) 14);
                class258.field3773 = var2;
            }
            if (var4 == 44) {
                ++class323.field4656;
                class197.field2878 = 2;
                class169.field2519 = class62.field1000;
                class205.field3004 = class78.field1320;
                class342.field4848 = 0;
                class13.field216.method2781(false, 245);
                class13.field216.method275(class22.field335, 1414495172);
                class13.field216.method319(class294.field4362 + var3, (byte) -19);
                class13.field216.method319(class372.field5285, (byte) -72);
                class13.field216.method324(class379.field5384 + var2, -123);
                class13.field216.method260(var5, (byte) -64);
                class13.field216.method318(class33.field482[82] ? 1 : 0, (byte) -98);
                class13.field216.method324(class397.field5843, -26);
                class19.method124(var3, var2, 1);
            }
            if (var4 == 36) {
                class127 var12 = class367.field5225[var5];
                if (var12 != null) {
                    ++class328.field4727;
                    class197.field2878 = 2;
                    class342.field4848 = 0;
                    class205.field3004 = class78.field1320;
                    class169.field2519 = class62.field1000;
                    class13.field216.method2781(false, 122);
                    class13.field216.method283((byte) 111, var5);
                    class13.field216.method289(class33.field482[82] ? 1 : 0, -7196);
                    class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var12.method1070((byte) -50), 0, var12.method1070((byte) -50), (byte) -106, var12.field5696[0], 0, var12.field5694[0]);
                }
            }
            if (var4 == 31) {
                class98 var13 = class447.field6512[var5];
                if (var13 != null) {
                    class169.field2519 = class62.field1000;
                    class197.field2878 = 2;
                    ++class105.field1742;
                    class205.field3004 = class78.field1320;
                    class342.field4848 = 0;
                    class13.field216.method2781(false, 112);
                    class13.field216.method324(var5, -72);
                    class13.field216.method277(class33.field482[82] ? 1 : 0, (byte) 113);
                    class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var13.method1070((byte) -50), 0, var13.method1070((byte) -50), (byte) 108, var13.field5696[0], 0, var13.field5694[0]);
                }
            }
            if (~var4 == -50) {
                ++class237.field3406;
                class205.field3004 = class78.field1320;
                class197.field2878 = 2;
                class342.field4848 = 0;
                class169.field2519 = class62.field1000;
                class13.field216.method2781(false, 88);
                class13.field216.method283((byte) 111, var5);
                class13.field216.method267(!class33.field482[82] ? 0 : 1, false);
                class13.field216.method260(class379.field5384 + var2, (byte) -11);
                class13.field216.method319(class294.field4362 + var3, (byte) -26);
                class19.method124(var3, var2, 1);
            }
            if (var4 == 15) {
                if (class289.field4315 > 0 && class33.field482[82] && class33.field482[81]) {
                    class422.method2652(class379.field5384 + var2, 63, class367.field5213, class294.field4362 - -var3);
                } else {
                    class151.method1166((byte) 109, var3, var5, var2);
                    if (var5 != 1) {
                        class169.field2519 = class62.field1000;
                        class342.field4848 = 0;
                        class205.field3004 = class78.field1320;
                        class197.field2878 = 1;
                    } else {
                        class13.field216.method267(-1, false);
                        class13.field216.method267(-1, false);
                        class13.field216.method324((int) class106.field1756, -91);
                        class13.field216.method267(57, false);
                        class13.field216.method267(class1.field3, false);
                        class13.field216.method267(class248.field3593, false);
                        class13.field216.method267(89, false);
                        class13.field216.method324(class86.field1394.field6520, -107);
                        class13.field216.method324(class86.field1394.field6519, -122);
                        class13.field216.method267(63, false);
                    }
                    class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -4, 1, 0, 1, (byte) 120, var3, 0, var2);
                }
            }
            if (~var4 == -15 && class132.field2132 == null) {
                class389.method2461((byte) -44, var2, var3);
                class132.field2132 = class102.method849((byte) -105, var3, var2);
                class107.method947(true, class132.field2132);
            }
            if (~var4 == -9) {
                ++class42.field646;
                class13.field216.method2781(false, 250);
                class13.field216.method275(var3, 1414495172);
                class13.field216.method283((byte) 113, var5);
                class13.field216.method324(var2, -29);
                class228.field3345 = 0;
                class21.field318 = class342.method2207(var3, (byte) 14);
                class258.field3773 = var2;
            }
            if (~var4 == -21) {
                ++class176.field2624;
                class342.field4848 = 0;
                class169.field2519 = class62.field1000;
                class205.field3004 = class78.field1320;
                class197.field2878 = 2;
                class13.field216.method2781(false, 151);
                class13.field216.method319(class294.field4362 + var3, (byte) -67);
                class13.field216.method260(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 105);
                class13.field216.method319(class379.field5384 + var2, (byte) -22);
                class13.field216.method267(class33.field482[82] ? 1 : 0, false);
                class172.method1314(var3, -109, var2, var6);
            }
            if (var4 == 40) {
                ++class209.field3045;
                class13.field216.method2781(false, 171);
                class13.field216.method275(var3, 1414495172);
                class13.field216.method324(var2, -85);
                class13.field216.method324(var5, -49);
                class13.field216.method260(class242.field3536, (byte) 107);
                class13.field216.method305(1981122392, class46.field751);
                class228.field3345 = 0;
                class21.field318 = class342.method2207(var3, (byte) 14);
                class258.field3773 = var2;
            }
            if (var4 == 1003) {
                class197.field2878 = 2;
                ++class275.field4138;
                class205.field3004 = class78.field1320;
                class169.field2519 = class62.field1000;
                class342.field4848 = 0;
                class13.field216.method2781(false, 170);
                class13.field216.method319(class294.field4362 + var3, (byte) -16);
                class13.field216.method289(class33.field482[82] ? 1 : 0, -7196);
                class13.field216.method283((byte) 106, class379.field5384 + var2);
                class13.field216.method319((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -77);
                class172.method1314(var3, 93, var2, var6);
            }
            if (var4 == 22) {
                class13.field216.method2781(false, 190);
                ++class229.field3352;
                class13.field216.method275(var3, 1414495172);
                class258 var14 = class342.method2207(var3, (byte) 14);
                if (var14.field3748 != null && ~var14.field3748[0][0] == -6) {
                    int var15 = var14.field3748[0][1];
                    if (class351.field4988[var15] != var14.field3797[0]) {
                        class351.field4988[var15] = var14.field3797[0];
                        class381.method2411(0, var15);
                    }
                }
            }
            if (~var4 == -44) {
                class98 var16 = class447.field6512[var5];
                if (var16 != null) {
                    class205.field3004 = class78.field1320;
                    class342.field4848 = 0;
                    class169.field2519 = class62.field1000;
                    class197.field2878 = 2;
                    ++class239.field3448;
                    class13.field216.method2781(false, 111);
                    class13.field216.method260(var5, (byte) -112);
                    class13.field216.method267(!class33.field482[82] ? 0 : 1, false);
                    class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var16.method1070((byte) -50), 0, var16.method1070((byte) -50), (byte) 99, var16.field5696[0], 0, var16.field5694[0]);
                }
            }
            if (var4 == 35) {
                class127 var17 = class367.field5225[var5];
                if (var17 != null) {
                    class197.field2878 = 2;
                    ++class239.field3453;
                    class169.field2519 = class62.field1000;
                    class205.field3004 = class78.field1320;
                    class342.field4848 = 0;
                    class13.field216.method2781(false, 31);
                    class13.field216.method277(!class33.field482[82] ? 0 : 1, (byte) 122);
                    class13.field216.method260(var5, (byte) 97);
                    class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var17.method1070((byte) -50), 0, var17.method1070((byte) -50), (byte) -75, var17.field5696[0], 0, var17.field5694[0]);
                }
            }
            if (var4 == 38) {
                class98 var18 = class447.field6512[var5];
                if (var18 != null) {
                    class205.field3004 = class78.field1320;
                    class197.field2878 = 2;
                    ++class185.field2722;
                    class342.field4848 = 0;
                    class169.field2519 = class62.field1000;
                    class13.field216.method2781(false, 157);
                    class13.field216.method324(class242.field3536, -106);
                    class13.field216.method267(!class33.field482[82] ? 0 : 1, false);
                    class13.field216.method300(80, class46.field751);
                    class13.field216.method319(var5, (byte) -53);
                    class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var18.method1070((byte) -50), 0, var18.method1070((byte) -50), (byte) -123, var18.field5696[0], 0, var18.field5694[0]);
                }
            }
            if (~var4 == -8) {
                ++class210.field3057;
                class13.field216.method2781(false, 225);
                class13.field216.method275(var3, 1414495172);
                class13.field216.method319(var2, (byte) -104);
                class13.field216.method260(var5, (byte) 101);
                class228.field3345 = 0;
                class21.field318 = class342.method2207(var3, (byte) 14);
                class258.field3773 = var2;
            }
            if (~var4 == -35) {
                ++class276.field4150;
                class13.field216.method2781(false, 243);
                class13.field216.method275(var3, 1414495172);
                class13.field216.method319(var2, (byte) -79);
                class13.field216.method260(var5, (byte) -88);
                class228.field3345 = 0;
                class21.field318 = class342.method2207(var3, (byte) 14);
                class258.field3773 = var2;
            }
            if (~var4 == -12) {
                class282.method2000(25);
                class258 var19 = class342.method2207(var3, (byte) 14);
                class47.field765 = 1;
                class397.field5843 = var5;
                class22.field335 = var3;
                class372.field5285 = var2;
                class107.method947(true, var19);
                class85.field1377 = "<col=ff9040>" + class206.method1561(-97, var5).field1999 + "<col=ffffff>";
                if (class85.field1377 == null) {
                    class85.field1377 = "null";
                }
            } else {
                if (var4 == 28) {
                    class13.field216.method2781(false, 61);
                    ++class342.field4846;
                    class13.field216.method275(var3, 1414495172);
                    class13.field216.method319(var5, (byte) -48);
                    class13.field216.method283((byte) 110, var2);
                    class228.field3345 = 0;
                    class21.field318 = class342.method2207(var3, (byte) 14);
                    class258.field3773 = var2;
                }
                if (~var4 == -26) {
                    class127 var20 = class367.field5225[var5];
                    if (var20 != null) {
                        class169.field2519 = class62.field1000;
                        class342.field4848 = 0;
                        ++class415.field6009;
                        class197.field2878 = 2;
                        class205.field3004 = class78.field1320;
                        class13.field216.method2781(false, 178);
                        class13.field216.method267(!class33.field482[82] ? 0 : 1, false);
                        class13.field216.method324(var5, -33);
                        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var20.method1070((byte) -50), 0, var20.method1070((byte) -50), (byte) 122, var20.field5696[0], 0, var20.field5694[0]);
                    }
                }
                if (~var4 == -58) {
                    class127 var21 = class367.field5225[var5];
                    if (var21 != null) {
                        class169.field2519 = class62.field1000;
                        class197.field2878 = 2;
                        class205.field3004 = class78.field1320;
                        ++class171.field2547;
                        class342.field4848 = 0;
                        class13.field216.method2781(false, 99);
                        class13.field216.method267(class33.field482[82] ? 1 : 0, false);
                        class13.field216.method319(var5, (byte) -97);
                        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var21.method1070((byte) -50), 0, var21.method1070((byte) -50), (byte) -116, var21.field5696[0], 0, var21.field5694[0]);
                    }
                }
                if (var4 == 5) {
                    ++class273.field4111;
                    class13.field216.method2781(false, 248);
                    class13.field216.method275(var3, 1414495172);
                    class13.field216.method319(class242.field3536, (byte) -41);
                    class13.field216.method300(115, class46.field751);
                    class13.field216.method283((byte) 109, var2);
                }
                if (~var4 == -1003) {
                    class205.field3004 = class78.field1320;
                    class197.field2878 = 2;
                    ++class390.field5600;
                    class342.field4848 = 0;
                    class169.field2519 = class62.field1000;
                    class13.field216.method2781(false, 1);
                    class13.field216.method283((byte) 115, var5);
                }
                if (~var4 == -2) {
                    class197.field2878 = 2;
                    ++class306.field4466;
                    class342.field4848 = 0;
                    class169.field2519 = class62.field1000;
                    class205.field3004 = class78.field1320;
                    class13.field216.method2781(false, 28);
                    class13.field216.method283((byte) 105, class379.field5384 + var2);
                    class13.field216.method319(var5, (byte) -21);
                    class13.field216.method318(class33.field482[82] ? 1 : 0, (byte) -57);
                    class13.field216.method283((byte) 115, class294.field4362 + var3);
                    class19.method124(var3, var2, 1);
                }
                if (~var4 == -25) {
                    ++class77.field1311;
                    class13.field216.method2781(false, 108);
                    class13.field216.method275(var3, 1414495172);
                    class13.field216.method283((byte) 116, var2);
                    class13.field216.method324(var5, -91);
                    class228.field3345 = 0;
                    class21.field318 = class342.method2207(var3, (byte) 14);
                    class258.field3773 = var2;
                }
                if (var4 == 12) {
                    class127 var22 = class367.field5225[var5];
                    if (var22 != null) {
                        class205.field3004 = class78.field1320;
                        class197.field2878 = 2;
                        class342.field4848 = 0;
                        ++class240.field3467;
                        class169.field2519 = class62.field1000;
                        class13.field216.method2781(false, 167);
                        class13.field216.method267(!class33.field482[82] ? 0 : 1, false);
                        class13.field216.method324(var5, -35);
                        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var22.method1070((byte) -50), 0, var22.method1070((byte) -50), (byte) 102, var22.field5696[0], 0, var22.field5694[0]);
                    }
                }
                if (var4 == 32) {
                    class169.field2519 = class62.field1000;
                    ++class76.field1294;
                    class342.field4848 = 0;
                    class205.field3004 = class78.field1320;
                    class197.field2878 = 2;
                    class13.field216.method2781(false, 224);
                    class13.field216.method324(class242.field3536, -117);
                    class13.field216.method324(class379.field5384 + var2, -62);
                    class13.field216.method275(class46.field751, 1414495172);
                    class13.field216.method260(var5, (byte) -73);
                    class13.field216.method289(class33.field482[82] ? 1 : 0, -7196);
                    class13.field216.method283((byte) 119, class294.field4362 + var3);
                    class19.method124(var3, var2, 1);
                }
                if (~var4 == -1009) {
                    class342.field4848 = 0;
                    class205.field3004 = class78.field1320;
                    class169.field2519 = class62.field1000;
                    class197.field2878 = 2;
                    class98 var23 = class447.field6512[var5];
                    if (var23 != null) {
                        class11 var24 = var23.field1545;
                        if (var24.field135 != null) {
                            var24 = var24.method75(0);
                        }
                        if (var24 != null) {
                            class13.field216.method2781(false, 86);
                            ++class47.field761;
                            class13.field216.method324(var24.field152, -102);
                        }
                    }
                }
                if (var4 == 1012 || var4 == 1009 || var4 == 1011 || ~var4 == -1008 || ~var4 == -1007) {
                    class294.method2052((byte) 45, var2, var5, var4);
                }
                if (var4 == 19) {
                    class127 var25 = class367.field5225[var5];
                    if (var25 != null) {
                        ++class183.field2707;
                        class169.field2519 = class62.field1000;
                        class342.field4848 = 0;
                        class205.field3004 = class78.field1320;
                        class197.field2878 = 2;
                        class13.field216.method2781(false, 73);
                        class13.field216.method318(!class33.field482[82] ? 0 : 1, (byte) -114);
                        class13.field216.method260(var5, (byte) 119);
                        class13.field216.method260(class372.field5285, (byte) -48);
                        class13.field216.method300(112, class22.field335);
                        class13.field216.method260(class397.field5843, (byte) -73);
                        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var25.method1070((byte) -50), 0, var25.method1070((byte) -50), (byte) -97, var25.field5696[0], 0, var25.field5694[0]);
                    }
                }
                if (var4 == 42) {
                    class13.field216.method2781(false, 150);
                    ++class162.field2451;
                    class13.field216.method275(var3, 1414495172);
                    class13.field216.method324(var2, -108);
                    class13.field216.method283((byte) 105, var5);
                    class228.field3345 = 0;
                    class21.field318 = class342.method2207(var3, (byte) 14);
                    class258.field3773 = var2;
                }
                if (~var4 == -18) {
                    class169.field2519 = class62.field1000;
                    class205.field3004 = class78.field1320;
                    class342.field4848 = 0;
                    ++class78.field1324;
                    class197.field2878 = 2;
                    class13.field216.method2781(false, 204);
                    class13.field216.method324(class242.field3536, -75);
                    class13.field216.method324(var2 - -class379.field5384, -97);
                    class13.field216.method324((int) (var6 >>> 32) & Integer.MAX_VALUE, -118);
                    class13.field216.method277(class33.field482[82] ? 1 : 0, (byte) 120);
                    class13.field216.method275(class46.field751, 1414495172);
                    class13.field216.method324(class294.field4362 + var3, -95);
                    class172.method1314(var3, 80, var2, var6);
                }
                if (var4 == 37 || var4 == 1010) {
                    class153.method1183(27425, var2, arg1.field4179, var5, var3);
                }
                if (~var4 == -11) {
                    ++class249.field3597;
                    class13.field216.method2781(false, 42);
                    class13.field216.method275(var3, 1414495172);
                    class13.field216.method324(var5, -80);
                    class13.field216.method283((byte) 112, var2);
                    class228.field3345 = 0;
                    class21.field318 = class342.method2207(var3, (byte) 14);
                    class258.field3773 = var2;
                }
                if (var4 == 60) {
                    class127 var26 = class367.field5225[var5];
                    if (var26 != null) {
                        class205.field3004 = class78.field1320;
                        class342.field4848 = 0;
                        class197.field2878 = 2;
                        class169.field2519 = class62.field1000;
                        ++class132.field2130;
                        class13.field216.method2781(false, 115);
                        class13.field216.method260(var5, (byte) 108);
                        class13.field216.method277(class33.field482[82] ? 1 : 0, (byte) -35);
                        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var26.method1070((byte) -50), 0, var26.method1070((byte) -50), (byte) 93, var26.field5696[0], 0, var26.field5694[0]);
                    }
                }
                if (~var4 == -48) {
                    ++class329.field4738;
                    class205.field3004 = class78.field1320;
                    class169.field2519 = class62.field1000;
                    class342.field4848 = 0;
                    class197.field2878 = 2;
                    class13.field216.method2781(false, 194);
                    class13.field216.method289(class33.field482[82] ? 1 : 0, -7196);
                    class13.field216.method319((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -47);
                    class13.field216.method283((byte) 114, class379.field5384 + var2);
                    class13.field216.method283((byte) 104, class294.field4362 + var3);
                    class172.method1314(var3, -75, var2, var6);
                }
                if (~var4 == -17) {
                    class13.field216.method2781(false, 240);
                    ++class407.field5931;
                    class13.field216.method275(var3, 1414495172);
                    class13.field216.method319(var5, (byte) -53);
                    class13.field216.method283((byte) 104, var2);
                    class228.field3345 = 0;
                    class21.field318 = class342.method2207(var3, (byte) 14);
                    class258.field3773 = var2;
                }
                if (var4 == 30) {
                    class197.field2878 = 2;
                    class342.field4848 = 0;
                    class205.field3004 = class78.field1320;
                    class169.field2519 = class62.field1000;
                    ++class15.field226;
                    class13.field216.method2781(false, 124);
                    class13.field216.method283((byte) 114, class379.field5384 + var2);
                    class13.field216.method319(var5, (byte) -104);
                    class13.field216.method260(class294.field4362 + var3, (byte) 99);
                    class13.field216.method318(!class33.field482[82] ? 0 : 1, (byte) -76);
                    class19.method124(var3, var2, 1);
                }
                if (~var4 == -1006) {
                    class258 var27 = class342.method2207(var3, (byte) 14);
                    if (var27 != null && ~var27.field3837[var2] <= -100001) {
                        class373.method2380(19380, var27.field3837[var2] + " x " + class206.method1561(-121, var5).field1999);
                    } else {
                        ++class390.field5600;
                        class13.field216.method2781(false, 1);
                        class13.field216.method283((byte) 125, var5);
                    }
                    class228.field3345 = 0;
                    class21.field318 = class342.method2207(var3, (byte) 14);
                    class258.field3773 = var2;
                }
                if (var4 == 46) {
                    class98 var28 = class447.field6512[var5];
                    if (var28 != null) {
                        class197.field2878 = 2;
                        ++class107.field1761;
                        class342.field4848 = 0;
                        class205.field3004 = class78.field1320;
                        class169.field2519 = class62.field1000;
                        class13.field216.method2781(false, 70);
                        class13.field216.method318(class33.field482[82] ? 1 : 0, (byte) -48);
                        class13.field216.method260(var5, (byte) 109);
                        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var28.method1070((byte) -50), 0, var28.method1070((byte) -50), (byte) -65, var28.field5696[0], 0, var28.field5694[0]);
                    }
                }
                if (~var4 == -22) {
                    class127 var29 = class367.field5225[var5];
                    if (var29 != null) {
                        class197.field2878 = 2;
                        class169.field2519 = class62.field1000;
                        class342.field4848 = 0;
                        class205.field3004 = class78.field1320;
                        ++class23.field344;
                        class13.field216.method2781(false, 53);
                        class13.field216.method319(var5, (byte) -56);
                        class13.field216.method289(class33.field482[82] ? 1 : 0, -7196);
                        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var29.method1070((byte) -50), 0, var29.method1070((byte) -50), (byte) -124, var29.field5696[0], 0, var29.field5694[0]);
                    }
                }
                if (~var4 == -14) {
                    class342.field4848 = 0;
                    ++class403.field5894;
                    class197.field2878 = 2;
                    class169.field2519 = class62.field1000;
                    class205.field3004 = class78.field1320;
                    class13.field216.method2781(false, 101);
                    class13.field216.method283((byte) 113, class294.field4362 + var3);
                    class13.field216.method277(!class33.field482[82] ? 0 : 1, (byte) -8);
                    class13.field216.method283((byte) 115, class379.field5384 + var2);
                    class13.field216.method324((int) (var6 >>> 32) & Integer.MAX_VALUE, -113);
                    class172.method1314(var3, 97, var2, var6);
                }
                if (~var4 == -40) {
                    if (class289.field4315 > 0 && class33.field482[82] && class33.field482[81]) {
                        class422.method2652(class379.field5384 - -var2, 63, class367.field5213, class294.field4362 + var3);
                    } else {
                        class169.field2519 = class62.field1000;
                        class205.field3004 = class78.field1320;
                        class197.field2878 = 1;
                        class342.field4848 = 0;
                        ++class76.field1297;
                        class13.field216.method2781(false, 254);
                        class13.field216.method324(class379.field5384 + var2, -96);
                        class13.field216.method324(class294.field4362 + var3, -47);
                    }
                }
                if (var4 == 23) {
                    ++class85.field1375;
                    class13.field216.method2781(false, 238);
                    class13.field216.method275(var3, 1414495172);
                    class13.field216.method283((byte) 126, var5);
                    class13.field216.method283((byte) 117, var2);
                    class228.field3345 = 0;
                    class21.field318 = class342.method2207(var3, (byte) 14);
                    class258.field3773 = var2;
                }
                if (var4 == 45) {
                    class98 var30 = class447.field6512[var5];
                    if (var30 != null) {
                        class205.field3004 = class78.field1320;
                        class169.field2519 = class62.field1000;
                        class342.field4848 = 0;
                        class197.field2878 = 2;
                        ++class15.field231;
                        class13.field216.method2781(false, 164);
                        class13.field216.method324(var5, -101);
                        class13.field216.method289(class33.field482[82] ? 1 : 0, -7196);
                        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var30.method1070((byte) -50), 0, var30.method1070((byte) -50), (byte) 114, var30.field5696[0], 0, var30.field5694[0]);
                    }
                }
                if (var4 == 51) {
                    class127 var31 = class367.field5225[var5];
                    if (var31 != null) {
                        class205.field3004 = class78.field1320;
                        ++class5.field33;
                        class169.field2519 = class62.field1000;
                        class197.field2878 = 2;
                        class342.field4848 = 0;
                        class13.field216.method2781(false, 145);
                        class13.field216.method319(var5, (byte) -30);
                        class13.field216.method277(class33.field482[82] ? 1 : 0, (byte) -128);
                        class13.field216.method283((byte) 123, class242.field3536);
                        class13.field216.method305(1981122392, class46.field751);
                        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var31.method1070((byte) -50), 0, var31.method1070((byte) -50), (byte) 112, var31.field5696[0], 0, var31.field5694[0]);
                    }
                }
                if (var4 == 18) {
                    class169.field2519 = class62.field1000;
                    ++class27.field404;
                    class197.field2878 = 1;
                    class205.field3004 = class78.field1320;
                    class342.field4848 = 0;
                    class13.field216.method2781(false, 137);
                    class13.field216.method275(class46.field751, 1414495172);
                    class13.field216.method324(class294.field4362 + var3, -65);
                    class13.field216.method319(class379.field5384 + var2, (byte) -71);
                    class13.field216.method260(class242.field3536, (byte) 101);
                    class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -4, 1, 0, 1, (byte) 115, var3, 0, var2);
                }
                if (var4 == 9) {
                    class13.field216.method2781(false, 147);
                    ++class425.field6186;
                    class13.field216.method275(var3, 1414495172);
                    class13.field216.method283((byte) 127, class397.field5843);
                    class13.field216.method275(class22.field335, 1414495172);
                    class13.field216.method319(var5, (byte) -68);
                    class13.field216.method260(class372.field5285, (byte) 106);
                    class13.field216.method283((byte) 117, var2);
                    class228.field3345 = 0;
                    class21.field318 = class342.method2207(var3, (byte) 14);
                    class258.field3773 = var2;
                }
                if (var4 == 41) {
                    class342.field4848 = 0;
                    class169.field2519 = class62.field1000;
                    class205.field3004 = class78.field1320;
                    class197.field2878 = 2;
                    ++class231.field3385;
                    class13.field216.method2781(false, 89);
                    class13.field216.method319(class397.field5843, (byte) -19);
                    class13.field216.method289(!class33.field482[82] ? 0 : 1, -7196);
                    class13.field216.method324(var2 - -class379.field5384, -50);
                    class13.field216.method262(class22.field335, 20241);
                    class13.field216.method319((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -96);
                    class13.field216.method324(class294.field4362 + var3, -27);
                    class13.field216.method324(class372.field5285, -33);
                    class172.method1314(var3, 104, var2, var6);
                }
                if (var4 == 59) {
                    class98 var32 = class447.field6512[var5];
                    if (var32 != null) {
                        class342.field4848 = 0;
                        class197.field2878 = 2;
                        ++client.field3651;
                        class169.field2519 = class62.field1000;
                        class205.field3004 = class78.field1320;
                        class13.field216.method2781(false, 142);
                        class13.field216.method289(class33.field482[82] ? 1 : 0, -7196);
                        class13.field216.method324(var5, -87);
                        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var32.method1070((byte) -50), 0, var32.method1070((byte) -50), (byte) 82, var32.field5696[0], 0, var32.field5694[0]);
                    }
                }
                if (var4 == 4) {
                    class169.field2519 = class62.field1000;
                    class197.field2878 = 2;
                    class342.field4848 = 0;
                    class205.field3004 = class78.field1320;
                    ++class170.field2544;
                    class13.field216.method2781(false, 249);
                    class13.field216.method319(class379.field5384 + var2, (byte) -115);
                    class13.field216.method289(!class33.field482[82] ? 0 : 1, -7196);
                    class13.field216.method324(class294.field4362 + var3, -67);
                    class13.field216.method260(var5, (byte) 122);
                    class19.method124(var3, var2, 1);
                }
                if (~var4 == -30) {
                    class258 var33 = class102.method849((byte) -105, var3, var2);
                    if (var33 != null) {
                        class282.method2000(90);
                        class417 var34 = client.method1815(var33);
                        class32.method233(var3, var33.field3746, var34.field6039, var2, var33.field3730, 5634, var34.method2609((byte) 117));
                        class47.field765 = 0;
                        class171.field2549 = class33.method240(16, var33);
                        if (class171.field2549 == null) {
                            class171.field2549 = "Null";
                        }
                        if (var33.field3825) {
                            class79.field1339 = var33.field3863 + "<col=ffffff>";
                            return;
                        }
                        class79.field1339 = "<col=00ff00>" + var33.field3800 + "<col=ffffff>";
                    }
                } else {
                    if (~var4 == -1005) {
                        ++class137.field2189;
                        class197.field2878 = 2;
                        class342.field4848 = 0;
                        class169.field2519 = class62.field1000;
                        class205.field3004 = class78.field1320;
                        class13.field216.method2781(false, 126);
                        class13.field216.method283((byte) 111, var5);
                    }
                    if (~var4 == -4) {
                        class127 var35 = class367.field5225[var5];
                        if (var35 != null) {
                            class342.field4848 = 0;
                            class197.field2878 = 2;
                            class169.field2519 = class62.field1000;
                            ++class151.field2310;
                            class205.field3004 = class78.field1320;
                            class13.field216.method2781(false, 49);
                            class13.field216.method267(!class33.field482[82] ? 0 : 1, false);
                            class13.field216.method319(var5, (byte) -106);
                            class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var35.method1070((byte) -50), 0, var35.method1070((byte) -50), (byte) 111, var35.field5696[0], 0, var35.field5694[0]);
                        }
                    }
                    if (var4 == 2) {
                        class98 var36 = class447.field6512[var5];
                        if (var36 != null) {
                            class342.field4848 = 0;
                            class169.field2519 = class62.field1000;
                            class197.field2878 = 2;
                            ++class83.field1355;
                            class205.field3004 = class78.field1320;
                            class13.field216.method2781(false, 33);
                            class13.field216.method319(class397.field5843, (byte) -35);
                            class13.field216.method318(!class33.field482[82] ? 0 : 1, (byte) -68);
                            class13.field216.method275(class22.field335, 1414495172);
                            class13.field216.method324(class372.field5285, -54);
                            class13.field216.method324(var5, -57);
                            class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], -2, var36.method1070((byte) -50), 0, var36.method1070((byte) -50), (byte) -116, var36.field5696[0], 0, var36.field5694[0]);
                        }
                    }
                    if (~class47.field765 != -1) {
                        class47.field765 = 0;
                        class107.method947(true, class342.method2207(class22.field335, (byte) 14));
                    }
                    if (class291.field4332) {
                        class282.method2000(58);
                    }
                    if (class21.field318 != null && class228.field3345 == 0) {
                        class107.method947(true, class21.field318);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lmb;III)V", line = 1155)
    public static final void method1911(class258 arg0, int arg1, int arg2, int arg3) {
        ++field4017;
        if (class273.field4109 == null && !class84.field1365) {
            if (arg0 != null && class285.method2017(false, arg0) != null) {
                class273.field4109 = arg0;
                class276.field4156 = class285.method2017(false, arg0);
                class135.field2164 = arg2;
                class174.field2567 = arg1;
                class243.field3542 = false;
                class197.field2877 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V", line = 1175)
    public static void method1912(byte arg0) {
        field4024 = null;
        if (arg0 >= -60) {
            method1913(true);
        }
        field4020 = null;
        field4019 = null;
        field4021 = null;
        field4023 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 1192)
    public class268() {
        super(1, true);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V", line = 1195)
    public static final void method1913(boolean arg0) {
        ++field4016;
        int var1 = class61.field983.length;
        for (int var2 = 0; ~var1 < ~var2; ++var2) {
            if (class61.field983[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class119.field1863; ++var4) {
                    if (class79.field1336[var2] == class44.field656[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class44.field656[class119.field1863] = class79.field1336[var2];
                    var3 = class119.field1863++;
                }
                class37 var5 = new class37(class61.field983[var2]);
                int var6 = 0;
                while (var5.field565 < class61.field983[var2].length && var6 < 511 && ~class156.field2376 > -1024) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method320((byte) -87);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 63;
                    int var11 = 63 & var8;
                    int var12 = (class79.field1336[var2] >> 8) * 64 + var10 - class379.field5384;
                    int var13 = (class79.field1336[var2] & 255) * 64 - class294.field4362 - -var11;
                    class11 var14 = class371.method2357(var5.method320((byte) -87), -13299);
                    if (class447.field6512[var7] == null && ~(var14.field171 & 1) < -1 && class140.field2216 == var9 && var12 >= 0 && var14.field174 + var12 < class183.field2703 && ~var13 <= -1 && var14.field174 + var13 < class66.field1056) {
                        class447.field6512[var7] = new class98();
                        class447.field6512[var7].field5657 = var7;
                        class98 var15 = class447.field6512[var7];
                        class416.field6027[class156.field2376++] = var7;
                        var15.field5627 = class267.field4002;
                        var15.method817(var14, 17671);
                        var15.method2474(false, var15.field1545.field174);
                        var15.field5650 = var15.field1545.field143 << 3;
                        if (~var15.field5650 != -1) {
                            var15.method2475(false, class139.field2206[var15.field1545.field160 + -1]);
                        } else {
                            var15.method2475(false, 0);
                        }
                        var15.method2471((byte) 109, var12, var15.method1070((byte) -50), var13, true, var9);
                    }
                }
            }
        }
        if (!arg0) {
            method1913(false);
        }
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)Z", line = 1289)
    public static final boolean method1914(int arg0) throws IOException {
        ++field4018;
        if (class124.field2028 == null) {
            return false;
        } else {
            int var1 = class124.field2028.method1655(arg0 ^ -10561);
            if (~var1 == -1) {
                return false;
            } else {
                if (~class197.field2876 == arg0) {
                    class124.field2028.method1659(-121, field4020.field578, 1, 0);
                    field4020.field565 = 0;
                    class197.field2876 = field4020.method2784(0);
                    class51.field824 = class276.field4155[class197.field2876];
                    --var1;
                }
                if (~class51.field824 == 0) {
                    if (var1 <= 0) {
                        return false;
                    }
                    class124.field2028.method1659(-127, field4020.field578, 1, 0);
                    class51.field824 = 255 & field4020.field578[0];
                    --var1;
                }
                if (~class51.field824 == 1) {
                    if (var1 <= 1) {
                        return false;
                    }
                    class124.field2028.method1659(119, field4020.field578, 2, 0);
                    field4020.field565 = 0;
                    var1 -= 2;
                    class51.field824 = field4020.method320((byte) -87);
                }
                if (~var1 > ~class51.field824) {
                    return false;
                } else {
                    field4020.field565 = 0;
                    class124.field2028.method1659(-113, field4020.field578, class51.field824, 0);
                    class79.field1335 = 0;
                    class11.field142 = class322.field4649;
                    class322.field4649 = class393.field5740;
                    class393.field5740 = class197.field2876;
                    if (class197.field2876 == 20) {
                        int var2 = field4020.method320((byte) -87);
                        byte var3 = field4020.method291(0);
                        class141.method1130(var3, var2, (byte) -115);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 49) {
                        String var4 = field4020.method322((byte) -34);
                        int var5 = field4020.method320((byte) -87);
                        String var6 = class56.method439(var5, true).method1296(field4020, true);
                        class292.method2038((String) null, (byte) -126, var4, 19, var5, 0, var6, var4);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 25) {
                        for (int var7 = 0; ~var7 > ~class367.field5225.length; ++var7) {
                            if (class367.field5225[var7] != null) {
                                class367.field5225[var7].field5620 = -1;
                            }
                        }
                        for (int var8 = 0; var8 < class447.field6512.length; ++var8) {
                            if (class447.field6512[var8] != null) {
                                class447.field6512[var8].field5620 = -1;
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 160) {
                        class26.field391 = field4020.method271((byte) 107);
                        class83.field1362 = field4020.method271((byte) 116);
                        class451.field6544 = field4020.method271((byte) 126);
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -41) {
                        class73.method582(false);
                        class50.method402(29348);
                        class365.field5197 += 32;
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 35) {
                        class198.method1512(121);
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -24) {
                        if (class321.field4642 != -1) {
                            class135.method1111((byte) 113, class321.field4642, 0);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 128) {
                        boolean var9 = ~field4020.method271((byte) 118) == -2;
                        String var10 = field4020.method322((byte) -34);
                        String var11 = var10;
                        if (var9) {
                            var11 = field4020.method322((byte) -34);
                        }
                        long var12 = (long) field4020.method320((byte) -87);
                        long var14 = (long) field4020.method295(true);
                        int var16 = field4020.method271((byte) 120);
                        int var17 = field4020.method320((byte) -87);
                        long var18 = (var12 << 32) + var14;
                        boolean var20 = false;
                        int var21 = 0;
                        while (true) {
                            if (var21 >= 100) {
                                if (var16 <= 1 && class285.method2014((byte) 95, var11)) {
                                    var20 = true;
                                }
                                break;
                            }
                            if (~class41.field634[var21] == ~var18) {
                                var20 = true;
                                break;
                            }
                            ++var21;
                        }
                        if (!var20 && ~class334.field4792 == -1) {
                            class41.field634[class355.field5046] = var18;
                            class355.field5046 = (class355.field5046 + 1) % 100;
                            String var22 = class56.method439(var17, true).method1296(field4020, true);
                            if (~var16 == -3) {
                                class292.method2038((String) null, (byte) -128, "<img=1>" + var11, 18, var17, 0, var22, "<img=1>" + var10);
                            } else if (var16 != 1) {
                                class292.method2038((String) null, (byte) -115, var11, 18, var17, 0, var22, var10);
                            } else {
                                class292.method2038((String) null, (byte) -113, "<img=0>" + var11, 18, var17, 0, var22, "<img=0>" + var10);
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -8) {
                        class49.field790 = field4020.method276(-1536);
                        class156.field2368 = field4020.method271((byte) 116);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 173) {
                        int var23 = field4020.method271((byte) 112);
                        if (field4020.method271((byte) 117) != 0) {
                            --field4020.field565;
                            class192.field2834[var23] = new class237(field4020);
                        } else {
                            class192.field2834[var23] = new class237();
                        }
                        class197.field2876 = -1;
                        class6.field57 = class341.field4845;
                        return true;
                    } else if (class197.field2876 == 4) {
                        int var24 = field4020.method294(-1280438392);
                        String var25 = field4020.method322((byte) -34);
                        int var26 = field4020.method294(-1280438392);
                        if (class294.method2060(false, var24)) {
                            class305.method2088(var26, var25, (byte) -126);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 72) {
                        class52.method417(class188.field2783, class51.field824, field4020, (byte) -89);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 66) {
                        int var27 = field4020.method278(118);
                        int var28 = field4020.method320((byte) -87);
                        int var29 = field4020.method320((byte) -87);
                        if (class294.method2060(false, var29)) {
                            class121.method1016(var28, var27, false);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 80) {
                        class23.method160((byte) 54, true);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 220) {
                        int var30 = field4020.method304(65280);
                        int var31 = field4020.method278(arg0 ^ 87);
                        int var32 = field4020.method320((byte) -87);
                        if (var32 == 65535) {
                            var32 = -1;
                        }
                        int var33 = field4020.method320((byte) -87);
                        if (~var33 == -65536) {
                            var33 = -1;
                        }
                        int var34 = field4020.method293(arg0 + 21569);
                        if (class294.method2060(false, var34)) {
                            for (int var35 = var33; ~var35 >= ~var32; ++var35) {
                                long var36 = ((long) var31 << 32) + (long) var35;
                                class417 var38 = (class417) class83.field1359.method1219(var36, -101);
                                class417 var39;
                                if (var38 == null) {
                                    if (var35 == -1) {
                                        var39 = new class417(var30, class342.method2207(var31, (byte) 14).field3780.field6039);
                                    } else {
                                        var39 = new class417(var30, -1);
                                    }
                                } else {
                                    var39 = new class417(var30, var38.field6039);
                                    var38.method251(16);
                                }
                                class83.field1359.method1217(1, var36, var39);
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -256) {
                        int var40 = field4020.method278(29);
                        int var41 = field4020.method320((byte) -87);
                        if (var40 < -70000) {
                            var41 += 32768;
                        }
                        class258 var42;
                        if (var40 < 0) {
                            var42 = null;
                        } else {
                            var42 = class342.method2207(var40, (byte) 14);
                        }
                        while (~field4020.field565 > ~class51.field824) {
                            int var43 = field4020.method316((byte) 99);
                            int var44 = field4020.method320((byte) -87);
                            int var45 = 0;
                            if (~var44 != -1) {
                                var45 = field4020.method271((byte) 103);
                                if (~var45 == -256) {
                                    var45 = field4020.method278(-122);
                                }
                            }
                            if (var42 != null && var43 >= 0 && ~var43 > ~var42.field3847.length) {
                                var42.field3847[var43] = var44;
                                var42.field3837[var43] = var45;
                            }
                            class32.method234(var43, var45, var41, -6370, var44 + -1);
                        }
                        if (var42 != null) {
                            class107.method947(true, var42);
                        }
                        class50.method402(arg0 ^ 29348);
                        class209.field3047[class35.method254(31, class277.field4172++)] = class35.method254(32767, var41);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 59) {
                        boolean var46 = field4020.method271((byte) 105) == 1;
                        String var47 = field4020.method322((byte) -34);
                        String var48 = field4020.method322((byte) -34);
                        int var49 = field4020.method320((byte) -87);
                        int var50 = field4020.method271((byte) 127);
                        String var51 = "";
                        boolean var52 = false;
                        if (var49 > 0) {
                            var51 = field4020.method322((byte) -34);
                            var52 = ~field4020.method271((byte) 106) == -2;
                        }
                        for (int var53 = 0; ~class284.field4255 < ~var53; ++var53) {
                            if (var46) {
                                if (var48.equals(class164.field2473[var53])) {
                                    class164.field2473[var53] = var47;
                                    class307.field4484[var53] = var48;
                                    var47 = null;
                                    break;
                                }
                            } else if (var47.equals(class164.field2473[var53])) {
                                if (~class51.field821[var53] != ~var49) {
                                    class51.field821[var53] = var49;
                                    if (var49 > 0) {
                                        class202.method1540(5, "", var47 + class113.field1820, true, "", 0);
                                    }
                                    if (~var49 == -1) {
                                        class202.method1540(5, "", var47 + class437.field6363, true, "", 0);
                                    }
                                }
                                class307.field4484[var53] = var48;
                                class27.field406[var53] = var51;
                                class418.field6048[var53] = var50;
                                var47 = null;
                                class33.field478[var53] = var52;
                                break;
                            }
                        }
                        if (var47 != null && ~class284.field4255 > -201) {
                            class164.field2473[class284.field4255] = var47;
                            class307.field4484[class284.field4255] = var48;
                            class51.field821[class284.field4255] = var49;
                            class27.field406[class284.field4255] = var51;
                            class418.field6048[class284.field4255] = var50;
                            class33.field478[class284.field4255] = var52;
                            ++class284.field4255;
                        }
                        class49.field789 = class341.field4845;
                        boolean var54 = false;
                        int var55 = class284.field4255;
                        while (var55 > 0) {
                            boolean var56 = true;
                            --var55;
                            for (int var57 = 0; ~var55 < ~var57; ++var57) {
                                if (class51.field821[var57] != class419.field6108 && class51.field821[var57 - -1] == class419.field6108 || class51.field821[var57] == 0 && class51.field821[var57 + 1] != 0) {
                                    int var58 = class51.field821[var57];
                                    class51.field821[var57] = class51.field821[var57 + 1];
                                    class51.field821[var57 + 1] = var58;
                                    String var59 = class27.field406[var57];
                                    class27.field406[var57] = class27.field406[var57 + 1];
                                    class27.field406[var57 + 1] = var59;
                                    String var60 = class164.field2473[var57];
                                    class164.field2473[var57] = class164.field2473[var57 + 1];
                                    class164.field2473[var57 + 1] = var60;
                                    String var61 = class307.field4484[var57];
                                    class307.field4484[var57] = class307.field4484[var57 + 1];
                                    class307.field4484[var57 + 1] = var61;
                                    int var62 = class418.field6048[var57];
                                    class418.field6048[var57] = class418.field6048[var57 + 1];
                                    class418.field6048[var57 - -1] = var62;
                                    boolean var63 = class33.field478[var57];
                                    class33.field478[var57] = class33.field478[var57 + 1];
                                    var56 = false;
                                    class33.field478[var57 - -1] = var63;
                                }
                            }
                            if (var56) {
                                break;
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -57) {
                        int var64 = field4020.method271((byte) 124);
                        int var65 = var64 >> 5;
                        int var66 = 31 & var64;
                        if (~var66 == -1) {
                            class431.field6220[var65] = null;
                            class197.field2876 = -1;
                            return true;
                        } else {
                            class257 var67 = new class257();
                            var67.field3713 = var66;
                            var67.field3721 = field4020.method271((byte) 116);
                            if (var67.field3721 >= 0 && var67.field3721 < class277.field4169.length) {
                                if (~var67.field3713 != -2 && var67.field3713 != 10) {
                                    if (~var67.field3713 <= -3 && var67.field3713 <= 6) {
                                        if (var67.field3713 == 2) {
                                            var67.field3707 = 64;
                                            var67.field3716 = 64;
                                        }
                                        if (~var67.field3713 == -4) {
                                            var67.field3707 = 0;
                                            var67.field3716 = 64;
                                        }
                                        if (~var67.field3713 == -5) {
                                            var67.field3707 = 128;
                                            var67.field3716 = 64;
                                        }
                                        if (var67.field3713 == 5) {
                                            var67.field3716 = 0;
                                            var67.field3707 = 64;
                                        }
                                        if (var67.field3713 == 6) {
                                            var67.field3716 = 128;
                                            var67.field3707 = 64;
                                        }
                                        var67.field3713 = 2;
                                        var67.field3710 = field4020.method320((byte) -87);
                                        var67.field3714 = field4020.method320((byte) -87);
                                        var67.field3715 = field4020.method271((byte) 127);
                                        var67.field3706 = field4020.method320((byte) -87);
                                    }
                                } else {
                                    var67.field3708 = field4020.method320((byte) -87);
                                    field4020.field565 += 5;
                                }
                                var67.field3718 = field4020.method320((byte) -87);
                                if (var67.field3718 == 65535) {
                                    var67.field3718 = -1;
                                }
                                class431.field6220[var65] = var67;
                            }
                            class197.field2876 = -1;
                            return true;
                        }
                    } else if (class197.field2876 == 54) {
                        int var68 = field4020.method320((byte) -87);
                        int var69 = field4020.method278(44);
                        if (class294.method2060(false, var68)) {
                            class120 var70 = (class120) class355.field5045.method1219((long) var69, arg0 ^ -98);
                            if (var70 != null) {
                                class254.method1839(true, false, -1, var70);
                            }
                            if (class132.field2132 != null) {
                                class107.method947(true, class132.field2132);
                                class132.field2132 = null;
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -188) {
                        int var71 = field4020.method316((byte) 125);
                        int var72 = field4020.method278(101);
                        int var73 = field4020.method271((byte) 122);
                        String var74 = "";
                        String var75 = var74;
                        if ((1 & var73) != 0) {
                            var74 = field4020.method322((byte) -34);
                            if (~(2 & var73) != -1) {
                                var75 = field4020.method322((byte) -34);
                            } else {
                                var75 = var74;
                            }
                        }
                        String var76 = field4020.method322((byte) -34);
                        if (var71 != 99) {
                            if (!var75.equals("") && class285.method2014((byte) -87, var75)) {
                                class197.field2876 = -1;
                                return true;
                            }
                            class202.method1540(var71, var74, var76, true, var75, var72);
                        } else {
                            class319.method2135(var76, (byte) 123);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 116) {
                        int var77 = field4020.method278(4);
                        int var78 = field4020.method294(-1280438392);
                        class260.method1875(123, var78, var77);
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -44) {
                        int var79 = field4020.method320((byte) -87);
                        if (class294.method2060(false, var79)) {
                            class416.method2604((byte) -101);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -17) {
                        int var80 = field4020.method293(21569);
                        int var81 = field4020.method293(arg0 + 21569);
                        int var82 = field4020.method293(21569);
                        if (class294.method2060(false, var80)) {
                            class127.method1073(true, 0, var82, var81);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 123) {
                        class23.method160((byte) 54, false);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 41) {
                        boolean var83 = field4020.method271((byte) 123) == 1;
                        String var84 = field4020.method322((byte) -34);
                        String var85 = var84;
                        if (var83) {
                            var85 = field4020.method322((byte) -34);
                        }
                        long var86 = (long) field4020.method320((byte) -87);
                        long var88 = (long) field4020.method295(true);
                        int var90 = field4020.method271((byte) 123);
                        long var91 = (var86 << 32) + var88;
                        boolean var93 = false;
                        int var94 = 0;
                        while (true) {
                            if (~var94 <= -101) {
                                if (~var90 >= -2) {
                                    if ((!class223.field3313 || class36.field509) && !class198.field2892) {
                                        if (class285.method2014((byte) 64, var85)) {
                                            var93 = true;
                                        }
                                    } else {
                                        var93 = true;
                                    }
                                }
                                break;
                            }
                            if (~class41.field634[var94] == ~var91) {
                                var93 = true;
                                break;
                            }
                            ++var94;
                        }
                        if (!var93 && ~class334.field4792 == -1) {
                            class41.field634[class355.field5046] = var91;
                            class355.field5046 = (class355.field5046 + 1) % 100;
                            String var95 = class164.method1270(0, class60.method461(class36.method257(field4020, 32767), arg0 + 23));
                            if (var90 != 2) {
                                if (~var90 == -2) {
                                    class292.method2038((String) null, (byte) -116, "<img=0>" + var85, 7, -1, 0, var95, "<img=0>" + var84);
                                } else {
                                    class292.method2038((String) null, (byte) -124, var85, 3, -1, 0, var95, var84);
                                }
                            } else {
                                class292.method2038((String) null, (byte) -119, "<img=1>" + var85, 7, -1, 0, var95, "<img=1>" + var84);
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -101) {
                        class234.field3387 = 30 * field4020.method293(21569);
                        class175.field2609 = class341.field4845;
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 113) {
                        int var96 = field4020.method320((byte) -87);
                        int var97 = field4020.method320((byte) -87);
                        int var98 = field4020.method320((byte) -87);
                        int var99 = field4020.method320((byte) -87);
                        if (class294.method2060(false, var96) && class45.field710[var97] != null) {
                            for (int var100 = var98; var99 > var100; ++var100) {
                                int var101 = field4020.method295(true);
                                if (class45.field710[var97].length > var100 && class45.field710[var97][var100] != null) {
                                    class45.field710[var97][var100].field3861 = var101;
                                }
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -180) {
                        int var102 = field4020.method288(-16826);
                        int var103 = field4020.method288(arg0 ^ -16826);
                        int var104 = field4020.method288(-16826);
                        int var105 = field4020.method302((byte) 90);
                        if (~(var105 >> 30) != -1) {
                            int var106 = (var105 & 1013907238) >> 28;
                            int var107 = ((268421215 & var105) >> 14) + -class379.field5384;
                            int var108 = (16383 & var105) + -class294.field4362;
                            if (var107 >= 0 && var108 >= 0 && class183.field2703 > var107 && class66.field1056 > var108) {
                                int var109 = var107 * 128 - -64;
                                int var110 = var108 * 128 - -64;
                                class20 var111 = new class20(var103, 0, class267.field4002, var106, var109, class109.method957(var110, var109, var106, 20663) - var102, var110, var107, var107, var108, var108);
                                class244.field3549.method148((byte) 101, new class375(var111));
                            }
                        } else if (var105 >> 29 == 0) {
                            if (~(var105 >> 28) != -1) {
                                int var112 = 65535 & var105;
                                class127 var113;
                                if (class379.field5381 != var112) {
                                    var113 = class367.field5225[var112];
                                } else {
                                    var113 = class86.field1394;
                                }
                                if (var113 != null) {
                                    if (~var103 == -65536) {
                                        var103 = -1;
                                    }
                                    boolean var114 = true;
                                    if (~var103 != 0 && var113.field5683 != -1) {
                                        if (~var113.field5683 != ~var103) {
                                            class389 var115 = class321.method2140(var103, (byte) 14);
                                            class389 var116 = class321.method2140(var113.field5683, (byte) -115);
                                            if (~var115.field5597 != 0 && ~var116.field5597 != 0) {
                                                class51 var117 = class113.method974(var115.field5597, (byte) -66);
                                                class51 var118 = class113.method974(var116.field5597, (byte) -76);
                                                if (var117.field840 < var118.field840) {
                                                    var114 = false;
                                                }
                                            }
                                        } else {
                                            class389 var119 = class321.method2140(var103, (byte) -124);
                                            if (var119.field5590 && ~var119.field5597 != 0) {
                                                class51 var120 = class113.method974(var119.field5597, (byte) -108);
                                                int var121 = var120.field817;
                                                if (var121 != 0 && var121 != 2) {
                                                    if (var121 == 1) {
                                                        var114 = true;
                                                    }
                                                } else {
                                                    var114 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var114) {
                                        var113.field5605 = class267.field4002 + var104;
                                        var113.field5672 = var102;
                                        var113.field5683 = var103;
                                        var113.field5651 = 0;
                                        var113.field5630 = 0;
                                        var113.field5681 = 1;
                                        if (class267.field4002 < var113.field5605) {
                                            var113.field5630 = -1;
                                        }
                                        if (var113.field5683 == 65535) {
                                            var113.field5683 = -1;
                                        }
                                        if (~var113.field5683 != 0 && ~class267.field4002 == ~var113.field5605) {
                                            int var122 = class321.method2140(var113.field5683, (byte) 19).field5597;
                                            if (var122 != -1) {
                                                class51 var123 = class113.method974(var122, (byte) -111);
                                                if (var123 != null && var123.field835 != null) {
                                                    class50.method399(0, var113.field6519, (byte) 85, var123, var113.field6520, class86.field1394 == var113);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var124 = var105 & 65535;
                            class98 var125 = class447.field6512[var124];
                            if (var125 != null) {
                                if (var103 == 65535) {
                                    var103 = -1;
                                }
                                boolean var126 = true;
                                if (var103 != -1 && var125.field5683 != -1) {
                                    if (~var125.field5683 != ~var103) {
                                        class389 var127 = class321.method2140(var103, (byte) 52);
                                        class389 var128 = class321.method2140(var125.field5683, (byte) -122);
                                        if (var127.field5597 != -1 && ~var128.field5597 != 0) {
                                            class51 var129 = class113.method974(var127.field5597, (byte) -107);
                                            class51 var130 = class113.method974(var128.field5597, (byte) -114);
                                            if (~var130.field840 < ~var129.field840) {
                                                var126 = false;
                                            }
                                        }
                                    } else {
                                        class389 var131 = class321.method2140(var103, (byte) 68);
                                        if (var131.field5590 && ~var131.field5597 != 0) {
                                            class51 var132 = class113.method974(var131.field5597, (byte) -104);
                                            int var133 = var132.field817;
                                            if (~var133 != -1 && ~var133 != -3) {
                                                if (var133 == 1) {
                                                    var126 = true;
                                                }
                                            } else {
                                                var126 = false;
                                            }
                                        }
                                    }
                                }
                                if (var126) {
                                    var125.field5651 = 0;
                                    var125.field5605 = class267.field4002 + var104;
                                    var125.field5681 = 1;
                                    var125.field5683 = var103;
                                    var125.field5630 = 0;
                                    var125.field5672 = var102;
                                    if (class267.field4002 < var125.field5605) {
                                        var125.field5630 = -1;
                                    }
                                    if (~var125.field5683 != 0 && ~class267.field4002 == ~var125.field5605) {
                                        int var134 = class321.method2140(var125.field5683, (byte) -111).field5597;
                                        if (~var134 != 0) {
                                            class51 var135 = class113.method974(var134, (byte) -115);
                                            if (var135 != null && var135.field835 != null) {
                                                class50.method399(0, var125.field6519, (byte) 71, var135, var125.field6520, false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -29) {
                        int var136 = field4020.method276(arg0 ^ -1536);
                        int var137 = field4020.method288(-16826);
                        if (~var137 == -65536) {
                            var137 = -1;
                        }
                        class153.method1171(var136, (byte) 78, var137);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 230) {
                        int var138 = field4020.method288(-16826);
                        if (var138 == 65535) {
                            var138 = -1;
                        }
                        int var139 = field4020.method310(-32717);
                        int var140 = field4020.method261(true);
                        class308.method2110(0, var139, var140, var138);
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -198) {
                        int var141 = field4020.method271((byte) 107);
                        int var142 = field4020.method294(-1280438392);
                        if (~var142 == -65536) {
                            var142 = -1;
                        }
                        String var143 = field4020.method322((byte) -34);
                        int var144 = field4020.method271((byte) 121);
                        if (~var141 <= -2 && var141 <= 8) {
                            if (var143.equalsIgnoreCase("null")) {
                                var143 = null;
                            }
                            class55.field892[var141 + -1] = var143;
                            class134.field2158[var141 + -1] = var142;
                            class383.field5475[var141 + -1] = var144 == 0;
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 235) {
                        if (~class51.field824 != -1) {
                            class117.field1839 = field4020.method322((byte) -34);
                        } else {
                            class117.field1839 = class27.field398;
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 68) {
                        int var145 = field4020.method278(arg0 ^ -121);
                        class258 var146 = class342.method2207(var145, (byte) 14);
                        for (int var147 = 0; var146.field3847.length > var147; ++var147) {
                            var146.field3847[var147] = -1;
                            var146.field3847[var147] = 0;
                        }
                        class107.method947(true, var146);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 162) {
                        int var148 = field4020.method293(arg0 ^ 21569);
                        int var149 = field4020.method302((byte) 124);
                        int var150 = field4020.method284(-18535);
                        if (class294.method2060(false, var148)) {
                            class58.method448(var149, arg0 ^ 26, var150);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -16) {
                        int var151 = field4020.method293(arg0 ^ 21569);
                        String var152 = field4020.method322((byte) -34);
                        int var153 = field4020.method293(21569);
                        if (class294.method2060(false, var151)) {
                            class305.method2088(var153, var152, (byte) -123);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -75) {
                        class174.method1352((byte) -12);
                        class197.field2876 = -1;
                        return false;
                    } else if (~class197.field2876 == -224) {
                        int var154 = field4020.method321((byte) 103);
                        int var155 = field4020.method302((byte) 110);
                        int var156 = field4020.method288(-16826);
                        int var157 = field4020.method266(8);
                        if (class294.method2060(false, var156)) {
                            class153.method1174(var154, var157, var155, arg0 + 48);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -76) {
                        class119.field1866 = field4020.method271((byte) 113);
                        for (int var158 = 0; var158 < class119.field1866; ++var158) {
                            class443.field6438[var158] = field4020.method322((byte) -34);
                            class390.field5636[var158] = field4020.method322((byte) -34);
                            if (class390.field5636[var158].equals("")) {
                                class390.field5636[var158] = class443.field6438[var158];
                            }
                            class205.field3010[var158] = field4020.method322((byte) -34);
                            class267.field4005[var158] = field4020.method322((byte) -34);
                            if (class267.field4005[var158].equals("")) {
                                class267.field4005[var158] = class205.field3010[var158];
                            }
                            class420.field6121[var158] = false;
                        }
                        class49.field789 = class341.field4845;
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -248) {
                        int var159 = field4020.method271((byte) 125);
                        boolean var160 = (var159 & 1) == 1;
                        String var161 = field4020.method322((byte) -34);
                        String var162 = field4020.method322((byte) -34);
                        String var163 = field4020.method322((byte) -34);
                        String var164 = field4020.method322((byte) -34);
                        if (!var160) {
                            class443.field6438[class119.field1866] = var161;
                            if (!var162.equals("")) {
                                class390.field5636[class119.field1866] = var162;
                            } else {
                                class390.field5636[class119.field1866] = var161;
                            }
                            class205.field3010[class119.field1866] = var163;
                            if (var164.equals("")) {
                                class267.field4005[class119.field1866] = var163;
                            } else {
                                class267.field4005[class119.field1866] = var164;
                            }
                            class420.field6121[class119.field1866] = ~class35.method254(var159, 2) == -3;
                            ++class119.field1866;
                        } else {
                            for (int var165 = 0; class119.field1866 > var165; ++var165) {
                                if (class390.field5636[var165].equals(var164)) {
                                    class443.field6438[var165] = var161;
                                    if (!var162.equals("")) {
                                        class390.field5636[var165] = var162;
                                    } else {
                                        class390.field5636[var165] = var161;
                                    }
                                    class205.field3010[var165] = var163;
                                    if (var164.equals("")) {
                                        class267.field4005[var165] = var163;
                                    } else {
                                        class267.field4005[var165] = var164;
                                    }
                                    break;
                                }
                            }
                        }
                        class49.field789 = class341.field4845;
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 30) {
                        if (class315.field4585 != null) {
                            class211.method1616(false, -1, class62.field1007, -102, -1);
                        }
                        byte[] var166 = new byte[class51.field824];
                        field4020.method2774(class51.field824, 0, (byte) -105, var166);
                        String var167 = class384.method2435(class51.field824, var166, 0, 124);
                        class182.method1416(~class288.field4303 == -2, -106, class188.field2783, var167, true);
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -12) {
                        int var168 = field4020.method320((byte) -87);
                        int var169 = field4020.method271((byte) 113);
                        int var170 = field4020.method288(-16826);
                        if (class294.method2060(false, var170)) {
                            if (var169 == 2) {
                                class220.method1687(arg0 ^ 25);
                            }
                            class321.field4642 = var168;
                            class237.method1730(125, var168);
                            class93.method787((byte) 48, false);
                            class216.method1638(class321.field4642);
                            for (int var171 = 0; var171 < 100; ++var171) {
                                class254.field3685[var171] = true;
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 110) {
                        int var172 = field4020.method271((byte) 111);
                        int var173 = field4020.method271((byte) 116);
                        if (~var172 == -256) {
                            var173 = -1;
                            var172 = -1;
                        }
                        class100.method831((byte) -77, var173, var172);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 225) {
                        String var174 = field4020.method322((byte) -34);
                        boolean var175 = ~field4020.method271((byte) 119) == -2;
                        String var176;
                        if (!var175) {
                            var176 = var174;
                        } else {
                            var176 = field4020.method322((byte) -34);
                        }
                        int var177 = field4020.method320((byte) -87);
                        byte var178 = field4020.method291(0);
                        boolean var179 = false;
                        if (~var178 == 127) {
                            var179 = true;
                        }
                        if (var179) {
                            if (class110.field1798 == 0) {
                                class197.field2876 = -1;
                                return true;
                            }
                            boolean var180 = false;
                            int var181;
                            for (var181 = 0; ~var181 > ~class110.field1798 && (!class377.field5352[var181].field2236.equals(var176) || class377.field5352[var181].field2237 != var177); ++var181) {
                            }
                            if (~class110.field1798 < ~var181) {
                                while (~(class110.field1798 - 1) < ~var181) {
                                    class377.field5352[var181] = class377.field5352[var181 + 1];
                                    ++var181;
                                }
                                --class110.field1798;
                                class377.field5352[class110.field1798] = null;
                            }
                        } else {
                            String var182 = field4020.method322((byte) -34);
                            class143 var183 = new class143();
                            var183.field2242 = var174;
                            var183.field2239 = var178;
                            var183.field2240 = var182;
                            var183.field2237 = var177;
                            var183.field2236 = var176;
                            int var184;
                            for (var184 = class110.field1798 + -1; ~var184 <= -1; --var184) {
                                int var185 = class377.field5352[var184].field2236.compareTo(var183.field2236);
                                if (~var185 == -1) {
                                    class377.field5352[var184].field2237 = var177;
                                    class377.field5352[var184].field2239 = var178;
                                    class377.field5352[var184].field2240 = var182;
                                    if (var176.equals(class86.field1394.field2066)) {
                                        class256.field3705 = var178;
                                    }
                                    class197.field2876 = -1;
                                    class147.field2279 = class341.field4845;
                                    return true;
                                }
                                if (~var185 > -1) {
                                    break;
                                }
                            }
                            if (class110.field1798 >= class377.field5352.length) {
                                class197.field2876 = -1;
                                return true;
                            }
                            for (int var186 = class110.field1798 + -1; ~var184 > ~var186; --var186) {
                                class377.field5352[var186 + 1] = class377.field5352[var186];
                            }
                            if (~class110.field1798 == -1) {
                                class377.field5352 = new class143[100];
                            }
                            class377.field5352[var184 + 1] = var183;
                            ++class110.field1798;
                            if (var176.equals(class86.field1394.field2066)) {
                                class256.field3705 = var178;
                            }
                        }
                        class197.field2876 = -1;
                        class147.field2279 = class341.field4845;
                        return true;
                    } else if (class197.field2876 == 198) {
                        int var187 = field4020.method320((byte) -87);
                        if (class294.method2060(false, var187)) {
                            class358.method2300(~arg0);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -227) {
                        int var188 = field4020.method310(arg0 ^ -32717);
                        int var189 = var188 >> 2;
                        int var190 = var188 & 3;
                        int var191 = class9.field121[var189];
                        int var192 = field4020.method288(-16826);
                        if (~var192 == -65536) {
                            var192 = -1;
                        }
                        int var193 = field4020.method304(65280);
                        int var194 = 3 & var193 >> 28;
                        int var195 = var193 >> 14 & 16383;
                        int var196 = var193 & 16383;
                        int var197 = var195 - class379.field5384;
                        int var198 = var196 - class294.field4362;
                        class250.method1799(arg0 ^ 121, var198, var197, var189, var194, var191, var192, var190);
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -78) {
                        int var199 = field4020.method293(21569);
                        int var200 = field4020.method320((byte) -87);
                        int var201 = field4020.method294(-1280438392);
                        int var202 = field4020.method320((byte) -87);
                        int var203 = field4020.method286(27914);
                        if (class294.method2060(false, var201)) {
                            class117.method995(var203, 8, var202, var199, var200);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -49) {
                        class234.field3392 = field4020.method271((byte) 117);
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -46) {
                        int var204 = field4020.method286(27914);
                        class120.field1877 = class188.field2783.method1373(var204, 3);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 214) {
                        int var205 = field4020.method271((byte) 125);
                        int var206 = field4020.method294(arg0 + -1280438392);
                        class260.method1875(arg0 ^ 122, var206, var205);
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -132) {
                        int var207 = field4020.method304(65280);
                        int var208 = field4020.method278(-19);
                        int var209 = field4020.method294(-1280438392);
                        int var210 = field4020.method320((byte) -87);
                        if (~var210 == -65536) {
                            var210 = -1;
                        }
                        if (class294.method2060(false, var209)) {
                            class258 var211 = class342.method2207(var207, (byte) 14);
                            if (!var211.field3825) {
                                if (~var210 == 0) {
                                    class197.field2876 = -1;
                                    var211.field3858 = 0;
                                    return true;
                                }
                                class124 var212 = class206.method1561(arg0 + 81, var210);
                                var211.field3858 = 4;
                                var211.field3888 = var212.field1971 * 100 / var208;
                                var211.field3771 = var212.field1982;
                                var211.field3889 = var212.field1958;
                                var211.field3864 = var210;
                                class107.method947(true, var211);
                            } else {
                                class417.method2610(var207, -8202, var208, var210);
                                class124 var213 = class206.method1561(93, var210);
                                class117.method995(var207, 8, var213.field1971, var213.field1982, var213.field1958);
                                class64.method491(1, var213.field1979, var207, var213.field1963, var213.field2035);
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 50) {
                        int var214 = field4020.method271((byte) 102);
                        int var215 = field4020.method288(arg0 + -16826);
                        int var216 = field4020.method294(-1280438392);
                        class98 var217 = class447.field6512[var215];
                        if (var217 != null) {
                            class287.method2022(var217, var214, var216, (byte) 32);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 81) {
                        class196.method1504(-109, field4020.method322((byte) -34));
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 217) {
                        int var218 = field4020.method320((byte) -87);
                        int var219 = field4020.method271((byte) 117);
                        int var220 = field4020.method271((byte) 125);
                        int var221 = field4020.method320((byte) -87);
                        int var222 = field4020.method271((byte) 104);
                        int var223 = field4020.method271((byte) 118);
                        if (class294.method2060(false, var218)) {
                            class42.method346(true, true, var222, var219, var223, var220, var221);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 96) {
                        int var224 = field4020.method279((byte) 112);
                        int var225 = field4020.method276(-1536);
                        int var226 = field4020.method310(arg0 + -32717);
                        class367.field5213 = var225 >> 1;
                        class86.field1394.method1071(6289, var226, ~(var225 & 1) == -2, class367.field5213, var224);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 254) {
                        int var227 = field4020.method320((byte) -87);
                        class311.method2120(var227, (byte) -127);
                        class209.field3047[class35.method254(class277.field4172++, 31)] = class35.method254(var227, 32767);
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -85) {
                        int var228 = field4020.method288(-16826);
                        int var229 = field4020.method286(27914);
                        class141.method1130(var229, var228, (byte) -128);
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -169) {
                        class50.method402(29348);
                        int var230 = field4020.method304(65280);
                        int var231 = field4020.method271((byte) 118);
                        int var232 = field4020.method279((byte) 64);
                        class350.field4977[var232] = var230;
                        class334.field4793[var232] = var231;
                        class157.field2399[var232] = 1;
                        int var233 = class71.field1202[var232] + -1;
                        for (int var234 = 0; var233 > var234; ++var234) {
                            if (~var230 <= ~class320.field4617[var234]) {
                                class157.field2399[var232] = var234 + 2;
                            }
                        }
                        class443.field6436[class35.method254(31, class432.field6227++)] = var232;
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -128) {
                        boolean var235 = field4020.method271((byte) 122) == 1;
                        String var236 = field4020.method322((byte) -34);
                        String var237 = var236;
                        if (var235) {
                            var237 = field4020.method322((byte) -34);
                        }
                        long var238 = field4020.method315(-56);
                        long var240 = (long) field4020.method320((byte) -87);
                        long var242 = (long) field4020.method295(true);
                        int var244 = field4020.method271((byte) 115);
                        long var245 = (var240 << 32) + var242;
                        boolean var247 = false;
                        int var248 = 0;
                        while (true) {
                            if (var248 >= 100) {
                                if (~var244 >= -2) {
                                    if ((!class223.field3313 || class36.field509) && !class198.field2892) {
                                        if (class285.method2014((byte) 76, var237)) {
                                            var247 = true;
                                        }
                                    } else {
                                        var247 = true;
                                    }
                                }
                                break;
                            }
                            if (class41.field634[var248] == var245) {
                                var247 = true;
                                break;
                            }
                            ++var248;
                        }
                        if (!var247 && ~class334.field4792 == -1) {
                            class41.field634[class355.field5046] = var245;
                            class355.field5046 = (class355.field5046 - -1) % 100;
                            String var249 = class164.method1270(0, class60.method461(class36.method257(field4020, 32767), arg0 + 122));
                            if (var244 != 2 && ~var244 != -4) {
                                if (~var244 == -2) {
                                    class292.method2038(class356.method2282(var238, true), (byte) -124, "<img=0>" + var237, 9, -1, 0, var249, "<img=0>" + var236);
                                } else {
                                    class292.method2038(class356.method2282(var238, true), (byte) -124, var237, 9, -1, 0, var249, var236);
                                }
                            } else {
                                class292.method2038(class356.method2282(var238, true), (byte) -119, "<img=1>" + var237, 9, -1, 0, var249, "<img=1>" + var236);
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 151) {
                        int var250 = field4020.method302((byte) 66);
                        int var251 = field4020.method320((byte) -87);
                        if (var251 == 65535) {
                            var251 = -1;
                        }
                        int var252 = field4020.method294(-1280438392);
                        if (class294.method2060(false, var252)) {
                            class33.method239(var251, -104, 2, var250, -1);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 120) {
                        class156.field2368 = field4020.method279((byte) 116);
                        class49.field790 = field4020.method279((byte) 110);
                        while (~field4020.field565 > ~class51.field824) {
                            class197.field2876 = field4020.method271((byte) 103);
                            class123.method1041(arg0);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -89) {
                        int var253 = field4020.method293(21569);
                        int var254 = field4020.method288(-16826);
                        int var255 = field4020.method302((byte) 102);
                        if (class294.method2060(false, var253)) {
                            class441.method2747(var255, var254, true);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -95) {
                        int var256 = field4020.method320((byte) -87);
                        int var257 = field4020.method320((byte) -87);
                        int var258 = field4020.method304(65280);
                        int var259 = field4020.method288(-16826);
                        if (class294.method2060(false, var256)) {
                            class384.method2438((var259 << 16) + var257, arg0 + -5196, var258);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -137) {
                        int var260 = field4020.method293(21569);
                        int var261 = field4020.method320((byte) -87);
                        int var262 = field4020.method293(21569);
                        int var263 = field4020.method288(-16826);
                        int var264 = field4020.method304(65280);
                        if (class294.method2060(false, var263)) {
                            class33.method239(var260 | var261 << 16, 113, 7, var264, var262);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 93) {
                        int var265 = field4020.method293(21569);
                        int var266 = field4020.method320((byte) -87);
                        int var267 = field4020.method286(27914);
                        if (class294.method2060(false, var266)) {
                            class170.method1294(var267, var265, true);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -242) {
                        int var268 = field4020.method304(65280);
                        int var269 = field4020.method288(-16826);
                        int var270 = field4020.method320((byte) -87);
                        if (class294.method2060(false, var269)) {
                            class206.method1560(var268, var270, false);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -143) {
                        int var271 = field4020.method320((byte) -87);
                        if (~var271 == -65536) {
                            var271 = -1;
                        }
                        int var272 = field4020.method271((byte) 126);
                        int var273 = field4020.method320((byte) -87);
                        int var274 = field4020.method271((byte) 102);
                        class254.method1837(true, var274, var273, var272, var271);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 52) {
                        int var275 = field4020.method320((byte) -87);
                        int var276 = field4020.method293(arg0 ^ 21569);
                        byte var277 = field4020.method291(0);
                        if (class294.method2060(false, var276)) {
                            class206.method1560(var277, var275, false);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 117) {
                        String var278 = field4020.method322((byte) -34);
                        String var279 = class164.method1270(0, class60.method461(class36.method257(field4020, arg0 + 32767), -124));
                        class202.method1540(6, var278, var279, true, var278, 0);
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 181) {
                        int var280 = field4020.method294(-1280438392);
                        int var281 = field4020.method320((byte) -87);
                        if (~var281 == -65536) {
                            var281 = -1;
                        }
                        int var282 = field4020.method286(27914);
                        if (class294.method2060(false, var280)) {
                            class33.method239(var281, 124, 1, var282, -1);
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (class197.field2876 == 206) {
                        class49.field790 = field4020.method271((byte) 121);
                        class156.field2368 = field4020.method276(-1536);
                        for (class110 var283 = (class110) class186.field2728.method1222(5656); var283 != null; var283 = (class110) class186.field2728.method1224((byte) -121)) {
                            int var285 = (int) (16383L & var283.field499);
                            int var286 = (int) (var283.field499 >> 14 & 16383L);
                            int var287 = (int) (var283.field499 >> 28 & 3L);
                            if (~class367.field5213 == ~var287 && var285 >= class156.field2368 && class156.field2368 + 8 > var285 && class49.field790 <= var286 && var286 < class49.field790 + 8) {
                                var283.method251(28);
                                class257.method1852(var285, var286, 76, class367.field5213);
                            }
                        }
                        for (class32 var284 = (class32) class346.field4881.method157((byte) -125); var284 != null; var284 = (class32) class346.field4881.method145(-6)) {
                            if (var284.field459 >= class156.field2368 && ~(class156.field2368 - -8) < ~var284.field459 && ~var284.field462 <= ~class49.field790 && class49.field790 + 8 > var284.field462 && class367.field5213 == var284.field458) {
                                var284.field454 = 0;
                            }
                        }
                        class197.field2876 = -1;
                        return true;
                    } else if (~class197.field2876 == -173) {
                        class147.field2279 = class341.field4845;
                        if (~class51.field824 == -1) {
                            class197.field2876 = -1;
                            class320.field4634 = null;
                            class209.field3051 = null;
                            class377.field5352 = null;
                            class110.field1798 = 0;
                            return true;
                        } else {
                            class209.field3051 = field4020.method322((byte) -34);
                            boolean var288 = ~field4020.method271((byte) 112) == -2;
                            if (var288) {
                                field4020.method322((byte) -34);
                            }
                            long var289 = field4020.method315(arg0 + -112);
                            class320.field4634 = class242.method1761(var289, (byte) -115);
                            class239.field3459 = field4020.method291(arg0);
                            int var291 = field4020.method271((byte) 118);
                            if (~var291 == -256) {
                                class197.field2876 = -1;
                                return true;
                            } else {
                                class110.field1798 = var291;
                                class143[] var292 = new class143[100];
                                for (int var293 = 0; var293 < class110.field1798; ++var293) {
                                    var292[var293] = new class143();
                                    var292[var293].field2242 = field4020.method322((byte) -34);
                                    boolean var299 = ~field4020.method271((byte) 125) == -2;
                                    if (var299) {
                                        var292[var293].field2236 = field4020.method322((byte) -34);
                                    } else {
                                        var292[var293].field2236 = var292[var293].field2242;
                                    }
                                    var292[var293].field2237 = field4020.method320((byte) -87);
                                    var292[var293].field2239 = field4020.method291(0);
                                    var292[var293].field2240 = field4020.method322((byte) -34);
                                    if (var292[var293].field2236.equals(class86.field1394.field2066)) {
                                        class256.field3705 = var292[var293].field2239;
                                    }
                                }
                                boolean var294 = false;
                                int var295 = class110.field1798;
                                while (~var295 < -1) {
                                    --var295;
                                    boolean var296 = true;
                                    for (int var297 = 0; ~var297 > ~var295; ++var297) {
                                        if (var292[var297].field2242.compareTo(var292[var297 + 1].field2242) > 0) {
                                            class143 var298 = var292[var297];
                                            var292[var297] = var292[var297 + 1];
                                            var292[var297 - -1] = var298;
                                            var296 = false;
                                        }
                                    }
                                    if (var296) {
                                        break;
                                    }
                                }
                                class197.field2876 = -1;
                                class377.field5352 = var292;
                                return true;
                            }
                        }
                    } else if (class197.field2876 == 112) {
                        class50.method402(29348);
                        class439.field6383 = field4020.method321((byte) 99);
                        class197.field2876 = -1;
                        class175.field2609 = class341.field4845;
                        return true;
                    } else if (class197.field2876 != 213 && ~class197.field2876 != -147 && class197.field2876 != 118 && ~class197.field2876 != -40 && ~class197.field2876 != -63 && class197.field2876 != 205 && class197.field2876 != 238 && class197.field2876 != 174 && class197.field2876 != 200 && class197.field2876 != 196 && class197.field2876 != 86 && class197.field2876 != 119 && class197.field2876 != 189 && ~class197.field2876 != -54 && ~class197.field2876 != -166) {
                        if (~class197.field2876 == -9) {
                            boolean var300 = field4020.method271((byte) 113) == 1;
                            String var301 = field4020.method322((byte) -34);
                            String var302 = var301;
                            if (var300) {
                                var302 = field4020.method322((byte) -34);
                            }
                            long var303 = field4020.method315(arg0 + 99);
                            long var305 = (long) field4020.method320((byte) -87);
                            long var307 = (long) field4020.method295(true);
                            int var309 = field4020.method271((byte) 114);
                            int var310 = field4020.method320((byte) -87);
                            long var311 = (var305 << 32) + var307;
                            boolean var313 = false;
                            int var314 = 0;
                            while (true) {
                                if (var314 >= 100) {
                                    if (var309 <= 1 && class285.method2014((byte) 53, var302)) {
                                        var313 = true;
                                    }
                                    break;
                                }
                                if (~class41.field634[var314] == ~var311) {
                                    var313 = true;
                                    break;
                                }
                                ++var314;
                            }
                            if (!var313 && class334.field4792 == 0) {
                                class41.field634[class355.field5046] = var311;
                                class355.field5046 = (class355.field5046 - -1) % 100;
                                String var315 = class56.method439(var310, true).method1296(field4020, true);
                                if (var309 == 2) {
                                    class292.method2038(class356.method2282(var303, true), (byte) -125, "<img=1>" + var302, 20, var310, 0, var315, "<img=1>" + var301);
                                } else if (var309 == 1) {
                                    class292.method2038(class356.method2282(var303, true), (byte) -125, "<img=0>" + var302, 20, var310, 0, var315, "<img=0>" + var301);
                                } else {
                                    class292.method2038(class356.method2282(var303, true), (byte) -117, var302, 20, var310, 0, var315, var301);
                                }
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (~class197.field2876 == -27) {
                            int var316 = field4020.method320((byte) -87);
                            String var317 = field4020.method322((byte) -34);
                            Object[] var318 = new Object[var317.length() - -1];
                            for (int var319 = var317.length() + -1; ~var319 <= -1; --var319) {
                                if (var317.charAt(var319) == 's') {
                                    var318[var319 + 1] = field4020.method322((byte) -34);
                                } else {
                                    var318[var319 + 1] = new Integer(field4020.method278(37));
                                }
                            }
                            var318[0] = new Integer(field4020.method278(-126));
                            if (class294.method2060(false, var316)) {
                                class254 var320 = new class254();
                                var320.field3683 = var318;
                                class216.method1636(var320);
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (class197.field2876 == 101) {
                            int var321 = field4020.method320((byte) -87);
                            int var322 = field4020.method271((byte) 108);
                            int var323 = field4020.method271((byte) 104);
                            int var324 = field4020.method271((byte) 126);
                            int var325 = field4020.method271((byte) 107);
                            int var326 = field4020.method320((byte) -87);
                            if (class294.method2060(false, var321)) {
                                class1.field6[var322] = true;
                                class418.field6067[var322] = var323;
                                class391.field5716[var322] = var324;
                                class134.field2156[var322] = var325;
                                class185.field2726[var322] = var326;
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (~class197.field2876 == -96) {
                            int var327 = field4020.method288(-16826);
                            String var328 = field4020.method322((byte) -34);
                            int var329 = field4020.method278(arg0 + -122);
                            if (class294.method2060(false, var327)) {
                                class289.method2029(var329, var328, true);
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (~class197.field2876 == -217) {
                            int var330 = field4020.method288(-16826);
                            int var331 = field4020.method294(-1280438392);
                            if (~var331 == -65536) {
                                var331 = -1;
                            }
                            int var332 = field4020.method293(21569);
                            if (~var332 == -65536) {
                                var332 = -1;
                            }
                            int var333 = field4020.method320((byte) -87);
                            int var334 = field4020.method302((byte) 78);
                            if (class294.method2060(false, var333)) {
                                for (int var335 = var332; ~var331 <= ~var335; ++var335) {
                                    long var336 = ((long) var334 << 32) + (long) var335;
                                    class417 var338 = (class417) class83.field1359.method1219(var336, arg0 ^ -91);
                                    class417 var339;
                                    if (var338 == null) {
                                        if (~var335 != 0) {
                                            var339 = new class417(0, var330);
                                        } else {
                                            var339 = new class417(class342.method2207(var334, (byte) 14).field3780.field6033, var330);
                                        }
                                    } else {
                                        var339 = new class417(var338.field6033, var330);
                                        var338.method251(75);
                                    }
                                    class83.field1359.method1217(1, var336, var339);
                                }
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (~class197.field2876 == -103) {
                            for (int var340 = 0; ~class351.field4988.length < ~var340; ++var340) {
                                if (~class351.field4988[var340] != ~class351.field4987[var340]) {
                                    class351.field4988[var340] = class351.field4987[var340];
                                    class381.method2411(0, var340);
                                    class188.field2787[class35.method254(class365.field5197++, 31)] = var340;
                                }
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (~class197.field2876 == -92) {
                            int var341 = field4020.method320((byte) -87);
                            int var342 = field4020.method271((byte) 113);
                            int var343 = field4020.method271((byte) 101);
                            int var344 = field4020.method320((byte) -87);
                            int var345 = field4020.method271((byte) 119);
                            int var346 = field4020.method271((byte) 103);
                            if (class294.method2060(false, var341)) {
                                class258.method1859(var346, (byte) 101, var343, var345, var344, var342);
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (class197.field2876 == 124) {
                            field4020.field565 += 28;
                            if (field4020.method264(arg0 + 105)) {
                                class196.method1506(field4020, 15, field4020.field565 + -28);
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (class197.field2876 == 190) {
                            int var347 = field4020.method293(arg0 ^ 21569);
                            int var348 = field4020.method302((byte) 96);
                            if (class294.method2060(false, var347)) {
                                class33.method239(2047, arg0 ^ 40, 5, var348, 0);
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (class197.field2876 == 85) {
                            int var349 = field4020.method271((byte) 116);
                            int var350 = field4020.method302((byte) 70);
                            int var351 = field4020.method320((byte) -87);
                            int var352 = field4020.method288(-16826);
                            if (class294.method2060(false, var352)) {
                                class120 var353 = (class120) class355.field5045.method1219((long) var350, -124);
                                if (var353 != null) {
                                    class254.method1839(~var353.field1874 != ~var351, false, -1, var353);
                                }
                                class48.method386(var349, false, var351, (byte) 102, var350);
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (~class197.field2876 == -84) {
                            int var354 = field4020.method278(59);
                            int var355 = field4020.method304(65280);
                            int var356 = field4020.method288(-16826);
                            if (class294.method2060(false, var356)) {
                                class120 var357 = (class120) class355.field5045.method1219((long) var354, arg0 ^ -88);
                                class120 var358 = (class120) class355.field5045.method1219((long) var355, -97);
                                if (var358 != null) {
                                    class254.method1839(var357 == null || var357.field1874 != var358.field1874, false, -1, var358);
                                }
                                if (var357 != null) {
                                    var357.method251(arg0 ^ 27);
                                    class355.field5045.method1217(1, (long) var355, var357);
                                }
                                class258 var359 = class342.method2207(var354, (byte) 14);
                                if (var359 != null) {
                                    class107.method947(true, var359);
                                }
                                class258 var360 = class342.method2207(var355, (byte) 14);
                                if (var360 != null) {
                                    class107.method947(true, var360);
                                    class360.method2307(var360, -1, true);
                                }
                                if (~class321.field4642 != 0) {
                                    class135.method1111((byte) -47, class321.field4642, 1);
                                }
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (~class197.field2876 == -219) {
                            int var361 = field4020.method293(21569);
                            int var362 = field4020.method286(27914);
                            if (class294.method2060(false, var361)) {
                                class33.method239(-1, -127, 3, var362, -1);
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (~class197.field2876 == -135) {
                            int var363 = field4020.method293(21569);
                            int var364 = field4020.method310(-32717);
                            if (class294.method2060(false, var363)) {
                                class45.field678 = var364;
                            }
                            class197.field2876 = -1;
                            return true;
                        } else if (~class197.field2876 != -172) {
                            if (class197.field2876 == 107) {
                                int var373 = field4020.method310(-32717);
                                int var374 = field4020.method302((byte) 66);
                                int var375 = field4020.method293(21569);
                                if (class294.method2060(false, var375)) {
                                    class397.method2530(var374, true, var373);
                                }
                                class197.field2876 = -1;
                                return true;
                            } else if (~class197.field2876 == -170) {
                                class50.method402(29348);
                                class324.field4665 = field4020.method271((byte) 120);
                                class197.field2876 = -1;
                                class175.field2609 = class341.field4845;
                                return true;
                            } else if (class197.field2876 == 79) {
                                class384.method2436(false);
                                class197.field2876 = -1;
                                return true;
                            } else if (class197.field2876 == 203) {
                                int var376 = field4020.method302((byte) 123);
                                int var377 = field4020.method294(arg0 ^ -1280438392);
                                int var378 = field4020.method320((byte) -87);
                                int var379 = field4020.method304(65280);
                                if (class294.method2060(false, var378)) {
                                    class33.method239(var377, arg0 ^ 40, 5, var379, var376);
                                }
                                class197.field2876 = -1;
                                return true;
                            } else if (class197.field2876 == 143) {
                                class277.field4171 = field4020.method271((byte) 115);
                                class197.field2876 = -1;
                                class49.field789 = class341.field4845;
                                return true;
                            } else {
                                class282.method2003("T1 - " + class197.field2876 + "," + class322.field4649 + "," + class11.field142 + " - " + class51.field824, -24830, (Throwable) null);
                                class174.method1352((byte) -98);
                                return true;
                            }
                        } else {
                            int var365 = field4020.method278(78);
                            int var366 = field4020.method320((byte) -87);
                            if (~var365 > 69999) {
                                var366 += 32768;
                            }
                            class258 var367;
                            if (~var365 > -1) {
                                var367 = null;
                            } else {
                                var367 = class342.method2207(var365, (byte) 14);
                            }
                            if (var367 != null) {
                                for (int var368 = 0; ~var368 > ~var367.field3847.length; ++var368) {
                                    var367.field3847[var368] = 0;
                                    var367.field3837[var368] = 0;
                                }
                            }
                            class33.method245(var366, 0);
                            int var369 = field4020.method320((byte) -87);
                            for (int var370 = 0; ~var369 < ~var370; ++var370) {
                                int var371 = field4020.method271((byte) 117);
                                if (var371 == 255) {
                                    var371 = field4020.method304(65280);
                                }
                                int var372 = field4020.method320((byte) -87);
                                if (var367 != null && var370 < var367.field3847.length) {
                                    var367.field3847[var370] = var372;
                                    var367.field3837[var370] = var371;
                                }
                                class32.method234(var370, var371, var366, arg0 ^ -6370, var372 + -1);
                            }
                            if (var367 != null) {
                                class107.method947(true, var367);
                            }
                            class50.method402(29348);
                            class209.field3047[class35.method254(class277.field4172++, 31)] = class35.method254(32767, var366);
                            class197.field2876 = -1;
                            return true;
                        }
                    } else {
                        class123.method1041(0);
                        class197.field2876 = -1;
                        return true;
                    }
                }
            }
        }
    }
}
