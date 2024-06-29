import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class261 extends class213 {

    @OriginalMember(owner = "client!te", name = "B", descriptor = "[La;")
    public class220[] field3779;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field3778 = 0;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field3783 = -1;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "Luj;")
    public static class158 field3781;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lpm;I)V", line = 5)
    public static final void method1795(class69 arg0, int arg1) {
        class77 var2 = null;
        field3776++;
        class254.field3713 = 3;
        class286.method1949((byte) 56, true);
        class122.field1603 = true;
        class27.field313 = true;
        class199.field2803 = true;
        class204.field2843 = 127;
        class40.field506 = true;
        class329.field4812 = true;
        class67.field856 = true;
        class80.field1017 = true;
        class177.field2436 = true;
        class103.field1343 = true;
        class330.field4838 = 0;
        class280.field3995 = true;
        class89.field1119 = 2;
        if (arg1 != -7134) {
            return;
        }
        class75.field991 = 127;
        class214.field3032 = 0;
        class24.field266 = 0;
        class343.field5340 = true;
        class315.field4647 = 0;
        class101.field1319 = 255;
        if (class255.field3734 < 96) {
            class187.method1359(0);
        } else {
            class187.method1359(2);
        }
        class142.field1963 = false;
        class118.field1543 = 0;
        class66.field849 = false;
        class58.field745 = 0;
        class139.field1917 = true;
        class97.field1280 = 0;
        class48.field638 = false;
        try {
            class188 var3 = arg0.method508("runescape", (byte) -92);
            while (var3.field2608 == 0) {
                class177.method1299((byte) 64, 1L);
            }
            if (var3.field2608 == 1) {
                var2 = (class77) var3.field2606;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method551((byte) -12)];
                while (var4 < var5.length) {
                    int var6 = var2.method550(var5, -24047, var5.length - var4, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class177.method1302(new class299(var5), arg1 ^ 0xFFFFECE7);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method554(-1);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)Z", line = 86)
    public final boolean method1796(byte arg0, int arg1) {
        if (arg0 != -39) {
            method1800((byte) 56);
        }
        field3777++;
        return this.field3779[arg1].field3169;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z", line = 107)
    public final boolean method1797(int arg0, int arg1) {
        if (arg0 == 3) {
            field3784++;
            return this.field3779[arg1].field3174;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lfh;Lfh;IZ)V", line = 119)
    public class261(class140 arg0, class140 arg1, int arg2, boolean arg3) {
        class54 var5 = new class54();
        int var6 = arg0.method1088(arg2, 1);
        this.field3779 = new class220[var6];
        int[] var7 = arg0.method1080(true, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1089(arg2, (byte) 114, var7[var8]);
            class345 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class345 var12 = (class345) var5.method413(1253231568); var12 != null; var12 = (class345) var5.method419(20)) {
                if (var12.field5364 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1067(false, var11, 0);
                } else {
                    var13 = arg1.method1067(false, 0, var11);
                }
                var10 = new class345(var11, var13);
                var5.method415((byte) -110, var10);
            }
            this.field3779[var7[var8]] = new class220(var9, var10);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lua;IIII)V", line = 178)
    public static final void method1798(class157 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3786++;
        if (class66.field853 >= 400) {
            return;
        }
        if (arg0.field2206 != null) {
            arg0 = arg0.method1210(-25);
        }
        if (arg0 == null || !arg0.field2217) {
            return;
        }
        if (arg1 < 103) {
            field3781 = (class158) null;
        }
        String var5 = arg0.field2239;
        if (arg0.field2200 != 0) {
            String var6 = class299.field4362 == 1 ? class132.field1793 : class190.field2630;
            var5 = var5 + class319.method2200(class359.field5616.field3477, (byte) -109, arg0.field2200) + " (" + var6 + arg0.field2200 + ")";
        }
        if (class339.field5304 == 1) {
            class148.method1140((long) arg3, arg4, arg2, class99.field1301 + " -> <col=ffff00>" + var5, class160.field2293, (short) 33, class343.field5342, (byte) 69);
            class207.field2914++;
        } else if (class276.field3954) {
            class321 var7 = class25.field283 == -1 ? null : class89.method646(class25.field283, (byte) -88);
            if ((class119.field1579 & 0x2) != 0 && (var7 == null || arg0.method1207(-9059, var7.field4714, class25.field283) != var7.field4714)) {
                class148.method1140((long) arg3, arg4, arg2, class339.field5277 + " -> <col=ffff00>" + var5, class351.field5485, (short) 42, class274.field3932, (byte) -85);
                class112.field1448++;
            }
        } else {
            String[] var8 = arg0.field2236;
            if (class307.field4500) {
                var8 = class305.method2137(-6, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class299.field4362 != 0 || !var8[var9].equalsIgnoreCase(class5.field52))) {
                        class59.field759++;
                        byte var10 = 0;
                        int var11 = -1;
                        if (arg0.field2199 == var9) {
                            var11 = arg0.field2227;
                        }
                        if (arg0.field2179 == var9) {
                            var11 = arg0.field2220;
                        }
                        if (var9 == 0) {
                            var10 = 39;
                        }
                        if (var9 == 1) {
                            var10 = 8;
                        }
                        if (var9 == 2) {
                            var10 = 36;
                        }
                        if (var9 == 3) {
                            var10 = 25;
                        }
                        if (var9 == 4) {
                            var10 = 59;
                        }
                        class148.method1140((long) arg3, arg4, arg2, "<col=ffff00>" + var5, var8[var9], var10, var11, (byte) 19);
                    }
                }
            }
            if (class299.field4362 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class5.field52)) {
                        class82.field1041++;
                        short var13 = 0;
                        if (class359.field5616.field3477 < arg0.field2200) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 39;
                        }
                        if (var12 == 1) {
                            var14 = 8;
                        }
                        if (var12 == 2) {
                            var14 = 36;
                        }
                        if (var12 == 3) {
                            var14 = 25;
                        }
                        if (var12 == 4) {
                            var14 = 59;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class148.method1140((long) arg3, arg4, arg2, "<col=ffff00>" + var5, var8[var12], var14, arg0.field2192, (byte) 93);
                    }
                }
            }
            class148.method1140((long) arg3, arg4, arg2, "<col=ffff00>" + var5, class62.field778, (short) 1010, class251.field3685, (byte) -124);
            class117.field1514++;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIZ)I", line = 343)
    public static final int method1799(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3788++;
        if (class238.field3440) {
            arg2 = 1000000;
            class238.field3440 = false;
        }
        class80 var5 = class25.field295[arg3][arg1];
        float var6 = ((float) arg0 * 0.1F + 0.7F) * var5.field1016;
        int var7 = var5.field1024;
        float var8 = var5.field1020;
        float var9 = var5.field1018;
        int var10 = var5.field1026;
        if (!arg4) {
            field3781 = (class158) null;
        }
        int var11 = var5.field1036;
        if (!class280.field3995) {
            var11 = 0;
        }
        class98 var12 = var5.field1035;
        float var13 = var5.field1030;
        float var14 = var5.field1023;
        float var15 = var5.field1032;
        if (class262.field3789 != var7 || class199.field2813 != var6 || class356.field5572 != var8 || class205.field2851 != var9 || class339.field5288 != var10 || class341.field5330 != var11 || class343.field5341 != var12 || class351.field5487 != var13 || class323.field4737 != var15 || class201.field2821 != var14) {
            class72.field952 = class306.field4482;
            class215.field3037 = class54.field697;
            class184.field2511 = class258.field3753;
            class212.field2998 = class152.field2138;
            class90.field1125 = class86.field1100;
            class179.field2453 = class296.field4300;
            class109.field1416 = class289.field4182;
            class167.field2337 = class8.field88;
            class287.field4115 = class351.field5484;
            class161.field2301 = class199.field2792;
            if (class101.field1322 == null || class109.field1416 == class101.field1322) {
                class101.field1322 = new class98();
            }
            class341.field5330 = var11;
            class205.field2851 = var9;
            class199.field2813 = var6;
            class44.field544 = 0;
            class262.field3789 = var7;
            class323.field4737 = var15;
            class343.field5341 = var12;
            class356.field5572 = var8;
            class201.field2821 = var14;
            class339.field5288 = var10;
            class351.field5487 = var13;
        }
        if (class44.field544 < 65536) {
            class44.field544 += arg2 * 250;
            if (class44.field544 >= 65536) {
                class199.field2792 = class351.field5487;
                class152.field2138 = class356.field5572;
                class351.field5484 = class201.field2821;
                class289.field4182 = class343.field5341;
                class8.field88 = class341.field5330;
                class86.field1100 = class323.field4737;
                class296.field4300 = class199.field2813;
                class54.field697 = class339.field5288;
                class44.field544 = 65536;
                class109.field1416 = null;
                class258.field3753 = class205.field2851;
                class306.field4482 = class262.field3789;
            } else {
                int var16 = 65536 - class44.field544 >> 8;
                float var17 = (float) class44.field544 / 65536.0F;
                int var18 = class44.field544 >> 8;
                class8.field88 = class167.field2337 * var16 + (class341.field5330 * var18) >> 8;
                class306.field4482 = ((class72.field952 & 0xFF00FF) * var16 + ((class262.field3789 & 0xFF00FF) * var18) & 0xFF00FF00) + ((class72.field952 & 0xFF00) * var16 + (class262.field3789 & 0xFF00) * var18 & 0xFF0000) >> 8;
                float var19 = (float) (65536 - class44.field544) / 65536.0F;
                class296.field4300 = class199.field2813 * var17 + class179.field2453 * var19;
                class258.field3753 = class205.field2851 * var17 + class184.field2511 * var19;
                class199.field2792 = class351.field5487 * var17 + class161.field2301 * var19;
                class152.field2138 = class356.field5572 * var17 + class212.field2998 * var19;
                class54.field697 = ((class215.field3037 & 0xFF00) * var16 + ((class339.field5288 & 0xFF00) * var18) & 0xFF0000) + ((class339.field5288 & 0xFF00FF) * var18 + (class215.field3037 & 0xFF00FF) * var16 & 0xFF00FF00) >> 8;
                class351.field5484 = class287.field4115 * var19 + class201.field2821 * var17;
                class86.field1100 = class90.field1125 * var19 + class323.field4737 * var17;
                if (class343.field5341 != class109.field1416) {
                    if (class109.field1416 == null || class343.field5341 == null) {
                        class289.field4182 = null;
                    } else {
                        class289.field4182 = class101.field1322.method705(class109.field1416, class343.field5341, (float) class44.field544 / 65536.0F);
                    }
                }
            }
        }
        return class54.field697;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V", line = 470)
    public static void method1800(byte arg0) {
        field3781 = null;
        if (arg0 != -49) {
            field3783 = -125;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILvh;IIII)Z", line = 490)
    public static final boolean method1801(int arg0, int arg1, class219 arg2, int arg3, int arg4, int arg5, int arg6) {
        field3782++;
        class23 var7 = class198.method1452((byte) 1, arg2.field3095);
        if (var7.field262 == -1) {
            return true;
        }
        int var8;
        if (arg2.field3138) {
            int var9 = arg2.field3146 + arg6;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        if (arg3 != 4) {
            return true;
        }
        class153 var10 = var7.method158(-1, arg2.field3150, var8);
        if (var10 == null) {
            return false;
        }
        int var11 = arg2.field3112;
        int var12 = arg2.field3096;
        if ((var8 & 0x1) == 1) {
            var11 = arg2.field3096;
            var12 = arg2.field3112;
        }
        int var13 = var10.field2028;
        int var14 = var10.field2026;
        if (var7.field253) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field255 == 0) {
            var10.method1180(arg4 * 4 + 48, (-arg1 + 104 + -var12) * 4 + 48, var13, var14);
        } else {
            var10.method1181(arg4 * 4 + 48, (-arg1 + -var12 + 104) * 4 + 48, var13, var14, var7.field255);
        }
        return true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 546)
    public static final Class method1802(int arg0, String arg1) throws ClassNotFoundException {
        field3787++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg0 != 0) {
            return (Class) null;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }
}
