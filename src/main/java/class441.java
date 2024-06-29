import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class441 {

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
    public static boolean field6418 = true;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lvq;")
    public static class24 field6417 = new class24(15, -1);

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Ljn;")
    public static class409 field6421 = new class409(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Lct;")
    public static class104 field6422;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lbi;")
    public class143 field6414;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Lqh;")
    public class337 field6419;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2706(int arg0) {
        for (int var1 = 0; var1 < class319.field4713; var1++) {
            int var2 = class189.field2649[var1];
            class26 var3 = class364.field5260[var2];
            int var4 = class22.field306.method1738((byte) -110);
            if ((var4 & 0x10) != 0) {
                var4 += class22.field306.method1738((byte) -30) << 8;
            }
            if ((var4 & 0x200) != 0) {
                int var5 = class22.field306.method1767(arg0 ^ 0x8CEF098B);
                var3.field718 = class22.field306.method1762((byte) -33);
                var3.field750 = class22.field306.method1738((byte) 122);
                var3.field733 = var5 & 0x7FFF;
                var3.field761 = (var5 & 0x8000) != 0;
                var3.field726 = class388.field5665 + var3.field733 + var3.field718;
            }
            if ((var4 & 0x80) != 0) {
                if (var3.field369.method2142(0)) {
                    class373.method2371(var3, (byte) -120);
                }
                var3.method273(class295.method1963(arg0 + 2346, class22.field306.method1745(-1106334908)), -27397);
                var3.method445(var3.field369.field4819, 10);
                var3.field769 = var3.field369.field4843 << 3;
                if (var3.field369.method2142(0)) {
                    class71.method518(0, (class380) null, (byte) -105, var3, var3.field784[0], var3.field4960, (class178) null, var3.field793[0]);
                }
            }
            if ((var4 & 0x1) != 0) {
                int var6 = class22.field306.method1767(1930493576);
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = class22.field306.method1719(0);
                class119.method817(-13915, var3, var7, var6);
            }
            if ((var4 & 0x40) != 0) {
                int var8 = class22.field306.method1740(128);
                int var9 = class22.field306.method1738((byte) -56);
                var3.method447(57, var8, var9, class388.field5665);
                var3.field747 = class388.field5665 + 300;
                var3.field762 = class22.field306.method1719(0);
            }
            if ((var4 & 0x2) != 0) {
                int var10 = class22.field306.method1740(128);
                int var11 = class22.field306.method1741((byte) 24);
                var3.method447(arg0 + 2406, var10, var11, class388.field5665);
            }
            if ((var4 & 0x100) != 0) {
                int var12 = class22.field306.method1738((byte) -61);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class22.field306.method1745(-1106334908);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var13[var16] = var17;
                    var14[var16] = class22.field306.method1762((byte) -33);
                    var15[var16] = class22.field306.method1736(arg0 + 67581);
                }
                class291.method1949(var14, var15, var13, var3, -102);
            }
            if ((var4 & 0x8) != 0) {
                int var18 = class22.field306.method1745(-1106334908);
                int var19 = class22.field306.method1718((byte) -127);
                if (var18 == 65535) {
                    var18 = -1;
                }
                boolean var20 = true;
                if (var18 != -1 && var3.field781 != -1) {
                    if (var3.field781 == var18) {
                        class302 var21 = class332.method2169(256, var18);
                        if (var21.field4424 && var21.field4422 != -1) {
                            class196 var22 = class83.method556(var21.field4422, 72);
                            int var23 = var22.field2769;
                            if (var23 == 0) {
                                var20 = false;
                            } else if (var23 == 1) {
                                var20 = true;
                            } else if (var23 == 2) {
                                var3.field763 = 0;
                                var20 = false;
                            }
                        }
                    } else {
                        class302 var24 = class332.method2169(256, var18);
                        class302 var25 = class332.method2169(arg0 + 2557, var3.field781);
                        if (var24.field4422 != -1 && var25.field4422 != -1) {
                            class196 var26 = class83.method556(var24.field4422, 108);
                            class196 var27 = class83.method556(var25.field4422, 77);
                            if (var27.field2775 > var26.field2775) {
                                var20 = false;
                            }
                        }
                    }
                }
                if (var20) {
                    var3.field753 = (var19 & 0xFFFF) + class388.field5665;
                    var3.field764 = 1;
                    var3.field707 = var19 >> 16;
                    var3.field759 = 0;
                    var3.field724 = 0;
                    var3.field781 = var18;
                    if (var3.field753 > class388.field5665) {
                        var3.field759 = -1;
                    }
                    if (var3.field781 != -1 && class388.field5665 == var3.field753) {
                        int var28 = class332.method2169(256, var3.field781).field4422;
                        if (var28 != -1) {
                            class196 var29 = class83.method556(var28, arg0 ^ 0xFFFFF778);
                            if (var29 != null && var29.field2784 != null) {
                                class446.method2739(var29, false, var3.field4960, 0, -49, var3.field4954, var3.field4951);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field373 = class22.field306.method1767(1930493576);
                var3.field372 = class22.field306.method1767(1930493576);
            }
            if ((var4 & 0x20) != 0) {
                var3.field773 = class22.field306.method1715(true);
                var3.field729 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field709 = class22.field306.method1745(-1106334908);
                if (var3.field709 == 65535) {
                    var3.field709 = -1;
                }
            }
        }
        field6416++;
        if (arg0 != -2301) {
            field6421 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 258)
    public static void method2707(int arg0) {
        if (arg0 == -26930) {
            field6421 = null;
            field6422 = null;
            field6417 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lfp;IILm;III[[[B[I[I[I[I[IIBIIZ)V", line = 270)
    public static final void method2708(class9 arg0, int arg1, int arg2, class187 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class151.field2050 = arg0;
        class103.field1335 = arg1;
        class251.field3696 = arg3;
        class259.field3823 = class151.field2050.method103() > 0;
        class145.field1969 = arg4 >> class167.field2206;
        class189.field2651 = arg6 >> class167.field2206;
        class339.field5004 = arg4;
        class136.field1862 = arg6;
        class264.field3901 = arg5;
        class93.field1161 = class145.field1969 - class31.field431;
        if (class93.field1161 < 0) {
            class200.field2821 = -class93.field1161;
            class93.field1161 = 0;
        } else {
            class200.field2821 = 0;
        }
        class316.field4631 = class189.field2651 - class31.field431;
        if (class316.field4631 < 0) {
            class82.field1012 = -class316.field4631;
            class316.field4631 = 0;
        } else {
            class82.field1012 = 0;
        }
        class454.field6704 = class31.field431 + class145.field1969;
        if (class454.field6704 > class329.field4899) {
            class454.field6704 = class329.field4899;
        }
        class47.field619 = class31.field431 + class189.field2651;
        if (class47.field619 > class380.field5590) {
            class47.field619 = class380.field5590;
        }
        for (int var18 = 0; var18 < class31.field431 + class31.field431 + 2; var18++) {
            for (int var23 = 0; var23 < class31.field431 + class31.field431 + 2; var23++) {
                int var24 = class145.field1969 + var18 - class31.field431;
                int var25 = class189.field2651 + var23 - class31.field431;
                if (var24 >= 0 && var25 >= 0 && var24 < class329.field4899 && var25 < class380.field5590) {
                    int var26 = var24 << class167.field2206;
                    int var27 = var25 << class167.field2206;
                    int var28 = class28.field401[class28.field401.length - 1].method1429(var24, var25) - 1000;
                    int var29 = class161.field2151 == null ? class28.field401[0].method1429(var24, var25) + class100.field1271 : class161.field2151[0].method1429(var24, var25) + class100.field1271;
                    class276.field4081[var18][var23] = class151.field2050.method116(var26, var28, var27, var26, var29, var27);
                } else {
                    class276.field4081[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class31.field431 + class31.field431 + 1; var19++) {
            for (int var22 = 0; var22 < class31.field431 + class31.field431 + 1; var22++) {
                class57.field694[var19][var22] = class276.field4081[var19][var22] || class276.field4081[var19 + 1][var22] || class276.field4081[var19][var22 + 1] || class276.field4081[var19 + 1][var22 + 1];
            }
        }
        class14.field233 = arg8;
        class400.field5779 = arg9;
        class443.field6468 = arg10;
        class304.field4458 = arg11;
        class322.field4761 = arg12;
        class308.method2056();
        class127.method856((byte) 101);
        for (class241 var20 = (class241) class456.field6749.method2026(100); var20 != null; var20 = (class241) class456.field6749.method2022(10)) {
            var20.method2611(-1);
            class265.method1826(200, var20);
        }
        if (class259.field3823) {
            for (int var21 = 0; var21 < class234.field3516; var21++) {
                class120.field1613[var21].method1063(arg17, arg1, (byte) -57);
            }
        }
        if (arg2 > 1) {
            class151.field2050.method129(0);
            if (class71.field930 == null || class71.field930 instanceof class5) {
                class71.field930 = new class228();
            }
        } else if (class71.field930 == null || class71.field930 instanceof class228) {
            class71.field930 = new class5();
        }
        class71.field930.method38(0, arg2);
        class71.field930.method42((byte) -125);
        if (class200.field2829 != null) {
            class204.method1400(true);
            class71.field930.method37(22, -125);
            class401.method2506(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class71.field930.method42((byte) -125);
            class71.field930.method37(23, 1);
            class204.method1400(false);
        }
        class401.method2506(arg2, arg7, arg13, arg14, arg15, arg16);
        class71.field930.method42((byte) -121);
        class71.field930.method47(5000);
        class71.field930.method42((byte) -124);
        if (arg2 > 1) {
            class151.field2050.method111(0);
        }
        class151.field2050.method68(0, (class298[]) null);
    }
}
