import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class201 extends class182 {

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public int field3920;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public int field3922;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "J")
    public static long field3919 = 0L;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Lua;")
    public static class181 field3915 = new class181(30);

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public static int field3927 = 0;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field3930 = 0;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Lsg;")
    public static class169 field3926 = class165.method1060("sl_stars", 1536);

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Lsg;")
    public static class169 field3929 = class165.method1060("(U2", 1536);

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Lsg;")
    private static class169 field3931 = class165.method1060("M", 1536);

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "Lsg;")
    public static class169 field3925 = field3931;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "Lsg;")
    public static class169 field3928 = field3931;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "J")
    public static long field3924;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Lqd;")
    public static class148 field3916;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Lqd;")
    public static class148 field3923;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILvg;)V")
    public static final void method1311(int arg0, int arg1, int arg2, class196 arg3) {
        field3914++;
        if ((arg2 & 0x10) != 0) {
            int var4 = class85.field1559.method811(14811);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class85.field1559.method784(126);
            class66.method416(var4, arg3, var5, (byte) 75);
        }
        if ((arg2 & 0x4) != 0) {
            arg3.field3726 = class85.field1559.method793((byte) -88);
            if (arg3.field3726.method1128(255, 0) == 126) {
                arg3.field3726 = arg3.field3726.method1106(false, 1);
                class199.method1307((byte) 120, arg3.field3856, arg3.field3726, 2);
            } else if (class4.field79 == arg3) {
                class199.method1307((byte) 122, arg3.field3856, arg3.field3726, 2);
            }
            arg3.field3712 = 0;
            arg3.field3723 = 150;
            arg3.field3704 = 0;
        }
        if ((arg2 & 0x2) != 0) {
            int var6 = class85.field1559.method806(1645316808);
            byte[] var7 = new byte[var6];
            class127 var8 = new class127(var7);
            class85.field1559.method798(var6, -1, 0, var7);
            class180.field3515[arg0] = var8;
            arg3.method1291(var8, 125);
        }
        if ((arg2 & 0x40) != 0) {
            arg3.field3701 = class85.field1559.method811(14811);
            if (arg3.field3701 == 65535) {
                arg3.field3701 = -1;
            }
        }
        if ((arg2 & 0x400) != 0) {
            arg3.field3703 = class85.field1559.method827((byte) 31);
            int var9 = class85.field1559.method814(8);
            arg3.field3675 = (var9 & 0xFFFF) + class162.field3107;
            if (arg3.field3703 == 65535) {
                arg3.field3703 = -1;
            }
            arg3.field3714 = 0;
            arg3.field3684 = 0;
            if (class162.field3107 < arg3.field3675) {
                arg3.field3684 = -1;
            }
            arg3.field3671 = var9 >> 16;
        }
        if ((arg2 & 0x8) != 0) {
            arg3.field3721 = class85.field1559.method785(true);
            arg3.field3662 = class85.field1559.method827((byte) 57);
        }
        if ((arg2 & 0x1) != 0) {
            int var10 = class85.field1559.method811(14811);
            int var11 = class85.field1559.method784(127);
            int var12 = class85.field1559.method809((byte) -109);
            int var13 = class85.field1559.field2346;
            if (arg3.field3856 != null && arg3.field3846 != null) {
                boolean var14 = false;
                long var15 = arg3.field3856.method1133(false);
                if (var11 <= 1) {
                    for (int var17 = 0; var17 < class206.field4052; var17++) {
                        if (class82.field1513[var17] == var15) {
                            var14 = true;
                            break;
                        }
                    }
                }
                if (!var14 && class23.field486 == 0) {
                    class204.field3985.field2346 = 0;
                    class85.field1559.method822(0, class204.field3985.field2325, (byte) -113, var12);
                    class204.field3985.field2346 = 0;
                    class169 var18 = class117.method739(class81.method493(32, class204.field3985).method1109(-2));
                    arg3.field3726 = var18.method1107(-1);
                    arg3.field3704 = var10 >> 8;
                    arg3.field3723 = 150;
                    arg3.field3712 = var10 & 0xFF;
                    if (var11 == 2 || var11 == 3) {
                        class199.method1307((byte) 125, class165.method1058(0, new class169[] { class158.field3013, arg3.field3856 }), var18, 1);
                    } else if (var11 == 1) {
                        class199.method1307((byte) 121, class165.method1058(0, new class169[] { class199.field3898, arg3.field3856 }), var18, 1);
                    } else {
                        class199.method1307((byte) 118, arg3.field3856, var18, 2);
                    }
                }
            }
            class85.field1559.field2346 = var12 + var13;
        }
        if ((arg2 & 0x80) != 0) {
            int var19 = class85.field1559.method819((byte) 22);
            int var20 = class85.field1559.method806(1645316808);
            arg3.method1248(var19, -91, var20, class162.field3107);
            arg3.field3724 = class162.field3107 + 300;
            arg3.field3736 = class85.field1559.method784(127);
            arg3.field3678 = class85.field1559.method806(1645316808);
        }
        if (arg1 <= 124) {
            field3928 = null;
        }
        if ((arg2 & 0x200) != 0) {
            int var21 = class85.field1559.method784(126);
            int var22 = class85.field1559.method784(127);
            arg3.method1248(var21, -81, var22, class162.field3107);
            arg3.field3724 = class162.field3107 + 300;
            arg3.field3736 = class85.field1559.method809((byte) -108);
            arg3.field3678 = class85.field1559.method806(1645316808);
        }
        if ((arg2 & 0x100) == 0) {
            return;
        }
        arg3.field3686 = class85.field1559.method784(127);
        arg3.field3669 = class85.field1559.method784(127);
        arg3.field3674 = class85.field1559.method806(1645316808);
        arg3.field3666 = class85.field1559.method806(1645316808);
        arg3.field3693 = class85.field1559.method811(14811) + class162.field3107;
        arg3.field3718 = class85.field1559.method811(14811) + class162.field3107;
        arg3.field3728 = class85.field1559.method784(127);
        arg3.field3702 = 1;
        arg3.field3725 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZB)V")
    public static final void method1312(boolean arg0, byte arg1) {
        field3918++;
        if (class116.field2148 == null) {
            return;
        }
        if (arg1 != 26) {
            method1313(39, null, null, null);
        }
        try {
            class127 var2 = new class127(4);
            var2.method821(arg0 ? 2 : 3, 64);
            var2.method792((byte) 108, 0);
            class116.field2148.method361(0, 4, -1, var2.field2325);
        } catch (IOException var4) {
            try {
                class116.field2148.method359((byte) 57);
            } catch (Exception var3) {
            }
            class193.field3813++;
            class116.field2148 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILke;Lke;Ljava/awt/Component;)V")
    public static final void method1313(int arg0, class95 arg1, class95 arg2, Component arg3) {
        field3921++;
        if (class125.field2282) {
            return;
        }
        class130.method846();
        if (arg0 < 121) {
            return;
        }
        byte[] var4 = arg2.method559(class43.field814, 0, class142.field2637);
        class160.field3056 = new class18(var4, arg3);
        class185.field3609 = class160.field3056.method122();
        class150.field2896 = class204.method1324(class57.field1065, 105, arg1, class43.field814);
        class129.field2407 = class204.method1324(class63.field1161, 127, arg1, class43.field814);
        class136.field2537 = class204.method1324(class110.field2022, 122, arg1, class43.field814);
        class4.field87 = class16.method90(class148.field2729, class43.field814, arg1, 0);
        class206.field4036 = class16.method90(class87.field1592, class43.field814, arg1, 0);
        class181.field3521 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class181.field3521[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class181.field3521[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class181.field3521[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class181.field3521[var8 + 192] = 16777215;
        }
        class152.field2931 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class152.field2931[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class152.field2931[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class152.field2931[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class152.field2931[var12 + 192] = 16777215;
        }
        class1.field1 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class1.field1[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class1.field1[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class1.field1[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class1.field1[var16 + 192] = 16777215;
        }
        class107.field1956 = new int[32768];
        client.field585 = new int[256];
        class151.field2919 = new int[32768];
        class145.method958(null, 123);
        class54.field996 = false;
        class26.field547 = 0;
        class43.field806 = class43.field814;
        if (class137.field2554 == 0) {
            class105.field1934 = true;
        } else {
            class105.field1934 = false;
        }
        class43.field807 = class43.field814;
        class17.field347 = new int[32768];
        class1.field12 = new int[32768];
        if (class105.field1934) {
            class98.method584(-1, 2);
        } else {
            class185.method1228(-119, field3923, 255, false, class104.field1918, 2, class43.field814);
        }
        method1312(false, (byte) 26);
        class125.field2282 = true;
        class160.field3056.method111(0, 0);
        class185.field3609.method111(382, 0);
        class150.field2896.method370(382 - class150.field2896.field1105 / 2, 18);
        class54.field990 = new class18(128, 254);
        class141.field2620 = new class18(128, 254);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static final void method1314(byte arg0) {
        field3917++;
        if (arg0 != 108) {
            return;
        }
        while (class85.field1559.method1027(arg0 - 236, class27.field553) >= 11) {
            int var1 = class85.field1559.method1031(11, (byte) -115);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class65.field1213[var1] == null) {
                var2 = true;
                class65.field1213[var1] = new class196();
                if (class180.field3515[var1] != null) {
                    class65.field1213[var1].method1291(class180.field3515[var1], arg0 ^ 0xD);
                }
            }
            class202.field3932[class141.field2631++] = var1;
            class196 var3 = class65.field1213[var1];
            var3.field3700 = class162.field3107;
            int var4 = class85.field1559.method1031(5, (byte) 61);
            int var5 = class85.field1559.method1031(1, (byte) -126);
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var5 == 1) {
                class6.field120[class199.field3895++] = var1;
            }
            int var6 = class122.field2252[class85.field1559.method1031(3, (byte) -127)];
            if (var2) {
                var3.field3681 = var3.field3719 = var6;
            }
            int var7 = class85.field1559.method1031(1, (byte) 33);
            int var8 = class85.field1559.method1031(5, (byte) 107);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1246(class4.field79.field3734[0] + var8, (byte) 70, var7 == 1, class4.field79.field3729[0] + var4);
        }
        class85.field1559.method1029(7);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static void method1315(int arg0) {
        field3923 = null;
        field3915 = null;
        field3928 = null;
        field3925 = null;
        field3916 = null;
        field3926 = null;
        if (arg0 != 128) {
            field3924 = -116L;
        }
        field3929 = null;
        field3931 = null;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(II)V")
    public class201(int arg0, int arg1) {
        this.field3920 = arg1;
        this.field3922 = arg0;
    }
}
