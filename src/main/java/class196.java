import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class196 extends class261 {

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    private int field3221;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Lve;")
    private static class255 field3230 = class87.method607(50, "Examine");

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Lve;")
    public static class255 field3226 = field3230;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "Lve;")
    private static class255 field3235 = class87.method607(93, "Choose Option");

    @OriginalMember(owner = "client!o", name = "J", descriptor = "Lve;")
    public static class255 field3225 = field3235;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Lkh;")
    public static class13 field3227 = new class13(64);

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field3236 = 0;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "Lve;")
    public static class255 field3238 = class87.method607(51, "p11_full");

    @OriginalMember(owner = "client!o", name = "W", descriptor = "Lve;")
    private static class255 field3237 = class87.method607(28, "Checking for updates )2 ");

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "Lve;")
    public static class255 field3241 = field3237;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "F")
    public static float field3239;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 7)
    public class196() {
        this(4096);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V", line = 15)
    private class196(int arg0) {
        super(0, true);
        this.field3221 = 4096;
        this.field3221 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[I", line = 28)
    public final int[] method21(byte arg0, int arg1) {
        field3229++;
        int[] var3 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            class36.method218(var3, 0, class92.field1576, this.field3221);
        }
        int var4 = 70 / ((arg0 + 49) / 33);
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(B)Z", line = 50)
    public static final boolean method1399(byte arg0) {
        if (arg0 >= -91) {
            method1407((class186) null, (byte) -10);
        }
        field3233++;
        return class73.field1203 == 0 ? class242.field4080.method654((byte) 36) : true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIZI[Lhc;III[BI)V", line = 65)
    public static final void method1400(int arg0, int arg1, int arg2, boolean arg3, int arg4, class163[] arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        field3224++;
        if (arg4 != 17627) {
            method1403((class70) null, false);
        }
        class70 var11 = new class70(arg9);
        int var12 = -1;
        while (true) {
            int var13 = var11.method457(true);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method486((byte) 68);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (var14 & 0xFD5) >> 6;
                int var17 = var14 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method481(0);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg10 == var18 && arg2 <= var16 && var16 < (arg2 + 8) && arg6 <= var17 && arg6 + 8 > var17) {
                    class145 var22 = class289.method2046(-12453, var12);
                    int var23 = arg7 + class54.method341(var20, var22.field2442, arg1, 7, var16 & 0x7, var22.field2444, var17 & 0x7);
                    int var24 = class260.method1816(var20, arg1, var17 & 0x7, true, var16 & 0x7, var22.field2442, var22.field2444) + arg0;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class163 var25 = null;
                        if (!arg3) {
                            int var26 = arg8;
                            if ((class166.field2800[1][var23][var24] & 0x2) == 2) {
                                var26 = arg8 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class44.method268(arg3, arg8, var25, arg1 + var20 & 0x3, var21, arg8, var12, 1, var23, var24, !arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lmm;", line = 159)
    public static final class246 method1401(int arg0, int arg1) {
        field3222++;
        class246 var2 = (class246) class271.field4658.method558((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class255.field4299.method636(class194.method1389(arg0, 0), (byte) 83, class60.method373(false, arg0));
        class246 var4 = new class246();
        if (var3 != null) {
            var4.method1699((byte) -125, new class70(var3));
        }
        class271.field4658.method555(var4, (long) arg0, arg1 ^ arg1);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 180)
    public static final void method1402(int arg0) {
        class53.method321((byte) -125);
        class34.method188(-1);
        field3228++;
        class54.method337((byte) -93);
        class58.method354(284750128);
        class153.method1127((byte) 99);
        class73.method527(87);
        class37.method222(arg0 ^ 0x29768762);
        class56.method349((byte) -113);
        class184.method1285((byte) 28);
        class20.method109(32);
        class144.method1072(0);
        class3.method17(-2);
        class218.method1544(false);
        class279.method1942(arg0 ^ 0x29768726);
        if (!class281.field4827) {
            ((class132) class283.field4866).method974((byte) -117);
        }
        class231.field3816.method59((byte) -78);
        class46.field695.method624((byte) 108);
        class235.field3869.method624((byte) 120);
        class183.field2955.method624((byte) 112);
        class87.field1422.method624((byte) 101);
        class174.field2883.method624((byte) 121);
        class143.field2379.method624((byte) 121);
        class97.field1675.method624((byte) 120);
        class220.field3707.method624((byte) 106);
        class74.field1229.method624((byte) 116);
        class285.field4895.method624((byte) 104);
        class315.field5348.method624((byte) 126);
        if (arg0 != 695633762) {
            method1400(-14, 7, 79, false, 23, (class163[]) null, -84, 53, -41, (byte[]) null, -117);
        }
        class53.field820.method553(117);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lpb;BI)V", line = 224)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field3234++;
        if (arg1 >= -115) {
            this.method20((class70) null, (byte) 56, -15);
        }
        if (arg2 == 0) {
            this.field3221 = (arg0.method481(0) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lpb;Z)Lbh;", line = 253)
    public static final class261 method1403(class70 arg0, boolean arg1) {
        arg0.method481(0);
        field3231++;
        int var2 = arg0.method481(0);
        class261 var3 = class183.method1282(var2, -92);
        var3.field4435 = arg0.method481(0);
        int var4 = arg0.method481(0);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method481(0);
            var3.method20(arg0, (byte) -123, var6);
        }
        if (!arg1) {
            field3235 = (class255) null;
        }
        var3.method111((byte) -57);
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(Z)V", line = 288)
    public static void method1404(boolean arg0) {
        field3225 = null;
        field3241 = null;
        field3238 = null;
        field3235 = null;
        if (arg0) {
            method1406((byte) 24, (class70) null);
        }
        field3226 = null;
        field3230 = null;
        field3237 = null;
        field3227 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBLmg;ILt;IILta;)V", line = 312)
    public static final void method1405(int arg0, byte arg1, class145 arg2, int arg3, class242 arg4, int arg5, int arg6, class186 arg7) {
        field3240++;
        if (arg1 < 1) {
            field3236 = 25;
        }
        class152 var8 = new class152();
        var8.field2577 = arg6 * 128;
        var8.field2579 = arg0 * 128;
        var8.field2583 = arg3;
        if (arg2 != null) {
            var8.field2574 = arg2.field2450;
            var8.field2578 = arg2.field2431;
            var8.field2587 = arg2;
            var8.field2568 = arg2.field2411;
            var8.field2569 = arg2.field2461;
            int var9 = arg2.field2444;
            int var10 = arg2.field2442;
            var8.field2581 = arg2.field2432 * 128;
            if (arg5 == 1 || arg5 == 3) {
                var9 = arg2.field2442;
                var10 = arg2.field2444;
            }
            var8.field2566 = (arg6 + var9) * 128;
            var8.field2565 = (arg0 + var10) * 128;
            if (arg2.field2454 != null) {
                var8.field2570 = true;
                var8.method1119(1);
            }
            if (var8.field2568 != null) {
                var8.field2571 = var8.field2574 + (int) ((double) (var8.field2578 - var8.field2574) * Math.random());
            }
            class95.field1622.method1472(true, var8);
        } else if (arg7 != null) {
            var8.field2576 = arg7;
            class236 var11 = arg7.field2996;
            if (var11.field3893 != null) {
                var8.field2570 = true;
                var11 = var11.method1628(108);
            }
            if (var11 != null) {
                var8.field2566 = (var11.field3933 + arg6) * 128;
                var8.field2565 = (var11.field3933 + arg0) * 128;
                var8.field2569 = method1407(arg7, (byte) 125);
                var8.field2581 = var11.field3941 * 128;
            }
            class166.field2792.method1472(true, var8);
        } else if (arg4 != null) {
            var8.field2572 = arg4;
            var8.field2565 = (arg4.method1680(-116) + arg0) * 128;
            var8.field2566 = (arg4.method1680(-99) + arg6) * 128;
            var8.field2569 = class314.method2164(arg4, true);
            var8.field2581 = arg4.field4053 * 128;
            class187.field3022.method284(true, arg4.field4068.method1764((byte) -104), var8);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLpb;)Log;", line = 396)
    public static final class194 method1406(byte arg0, class70 arg1) {
        if (arg0 >= -116) {
            field3236 = -36;
        }
        field3232++;
        return new class194(arg1.method454((byte) 84), arg1.method454((byte) 84), arg1.method454((byte) 84), arg1.method454((byte) 84), arg1.method454((byte) 84), arg1.method454((byte) 84), arg1.method454((byte) 84), arg1.method454((byte) 84), arg1.method465(true), arg1.method481(0));
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lta;B)I", line = 421)
    public static final int method1407(class186 arg0, byte arg1) {
        if (arg1 < 105) {
            method1401(-62, 15);
        }
        class236 var2 = arg0.field2996;
        field3223++;
        if (var2.field3893 != null) {
            var2 = var2.method1628(88);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3936;
        if (arg0.field5114 == arg0.field5113) {
            var3 = var2.field3901;
        } else if (arg0.field5145 == arg0.field5114) {
            var3 = var2.field3912;
        }
        return var3;
    }
}
