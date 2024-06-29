import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class167 extends class141 {

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "Loc;")
    public static class151 field3040 = class137.method873(2, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "Loc;")
    public static class151 field3046 = class137.method873(2, "blinken2:");

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "Loc;")
    private static class151 field3041 = class137.method873(2, "Loaded update list");

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "Loc;")
    public static class151 field3044 = field3041;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "Loc;")
    public static class151 field3045 = class137.method873(2, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "[Lhh;")
    public static class84[] field3039;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLw;)V")
    public static final void method1084(boolean arg0, class228 arg1) {
        arg1.field3993 = arg1.field4002;
        field3038++;
        if (arg1.field3999 == 0) {
            arg1.field4003 = 0;
            return;
        }
        if (arg1.field3991 != -1 && arg1.field4004 == 0) {
            class115 var2 = class197.method1233(28, arg1.field3991);
            if (arg1.field4001 > 0 && var2.field2073 == 0) {
                arg1.field4003++;
                return;
            }
            if (arg1.field4001 <= 0 && var2.field2045 == 0) {
                arg1.field4003++;
                return;
            }
        }
        int var3 = arg1.field3976;
        int var4 = arg1.field4029;
        int var5 = arg1.field3978[arg1.field3999 - 1] * 128 + arg1.field4007 * 64;
        int var6 = arg1.field4031[arg1.field3999 - 1] * 128 + arg1.field4007 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field3976 = var5;
            arg1.field4029 = var6;
            return;
        }
        if (var3 < var5) {
            if (var4 < var6) {
                arg1.field4017 = 1280;
            } else if (var6 >= var4) {
                arg1.field4017 = 1536;
            } else {
                arg1.field4017 = 1792;
            }
        } else if (var3 <= var5) {
            if (var6 > var4) {
                arg1.field4017 = 1024;
            } else if (var4 > var6) {
                arg1.field4017 = 0;
            }
        } else if (var6 > var4) {
            arg1.field4017 = 768;
        } else if (var4 > var6) {
            arg1.field4017 = 256;
        } else {
            arg1.field4017 = 512;
        }
        int var7 = arg1.field4017 - arg1.field4024 & 0x7FF;
        int var8 = arg1.field3973;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field4025;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field4021;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field3983;
        }
        if (arg0) {
            field3045 = null;
        }
        int var9 = 4;
        if (var8 == -1) {
            var8 = arg1.field4025;
        }
        arg1.field3993 = var8;
        boolean var10 = true;
        if (arg1 instanceof class203) {
            var10 = ((class203) arg1).field3608.field1292;
        }
        if (var10) {
            if (arg1.field4024 != arg1.field4017 && arg1.field3969 == -1 && arg1.field3984 != 0) {
                var9 = 2;
            }
            if (arg1.field3999 > 2) {
                var9 = 6;
            }
            if (arg1.field3999 > 3) {
                var9 = 8;
            }
            if (arg1.field4003 > 0 && arg1.field3999 > 1) {
                arg1.field4003--;
                var9 = 8;
            }
        } else {
            if (arg1.field3999 > 1) {
                var9 = 6;
            }
            if (arg1.field3999 > 2) {
                var9 = 8;
            }
            if (arg1.field4003 > 0 && arg1.field3999 > 1) {
                var9 = 8;
                arg1.field4003--;
            }
        }
        if (arg1.field4012[arg1.field3999 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var3) {
            arg1.field3976 += var9;
            if (arg1.field3976 > var5) {
                arg1.field3976 = var5;
            }
        } else if (var3 > var5) {
            arg1.field3976 -= var9;
            if (var5 > arg1.field3976) {
                arg1.field3976 = var5;
            }
        }
        if (var4 < var6) {
            arg1.field4029 += var9;
            if (var6 < arg1.field4029) {
                arg1.field4029 = var6;
            }
        } else if (var6 < var4) {
            arg1.field4029 -= var9;
            if (var6 > arg1.field4029) {
                arg1.field4029 = var6;
            }
        }
        if (var9 >= 8 && arg1.field4025 == arg1.field3993 && arg1.field3968 != -1) {
            arg1.field3993 = arg1.field3968;
        }
        if (arg1.field3976 == var5 && arg1.field4029 == var6) {
            if (arg1.field4001 > 0) {
                arg1.field4001--;
            }
            arg1.field3999--;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
    public static void method1085(int arg0) {
        field3041 = null;
        field3040 = null;
        if (arg0 < -45) {
            field3044 = null;
            field3039 = null;
            field3046 = null;
            field3045 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
    public static final void method1086(int arg0, int arg1) {
        class157.method1031(0);
        class109.method657(-5167);
        int var2 = class234.method1528((byte) -84, arg1).field727;
        field3042++;
        if (var2 == 0) {
            return;
        }
        int var3 = class156.field2836[arg1];
        if (var2 == 1) {
            class46.field947 = var3;
            if (class46.field947 == 1) {
                class61.method406(0.9F);
            }
            if (class46.field947 == 2) {
                class61.method406(0.8F);
            }
            if (class46.field947 == 3) {
                class61.method406(0.7F);
            }
            if (class46.field947 == 4) {
                class61.method406(0.6F);
            }
            class22.method185(false);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class156.field2825 != var4) {
                if (class156.field2825 == 0 && class12.field247 != -1) {
                    class189.method1168(false, class16.field363, 0, var4, class12.field247, (byte) -50);
                    class149.field2669 = false;
                } else if (var4 == 0) {
                    class1.method3(false);
                    class149.field2669 = false;
                } else {
                    class108.method649(var4, arg0 ^ 0x7F);
                }
                class156.field2825 = var4;
            }
        }
        if (arg0 != 3) {
            return;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class7.field104 = 127;
            }
            if (var3 == 1) {
                class7.field104 = 96;
            }
            if (var3 == 2) {
                class7.field104 = 64;
            }
            if (var3 == 3) {
                class7.field104 = 32;
            }
            if (var3 == 4) {
                class7.field104 = 0;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class57.field1139 = 127;
            }
            if (var3 == 1) {
                class57.field1139 = 96;
            }
            if (var3 == 2) {
                class57.field1139 = 64;
            }
            if (var3 == 3) {
                class57.field1139 = 32;
            }
            if (var3 == 4) {
                class57.field1139 = 0;
            }
        }
        if (var2 == 9) {
            class133.field2426 = var3;
        }
        if (var2 == 5) {
            class228.field3987 = var3;
        }
        if (var2 == 6) {
            class149.field2673 = var3;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
    public static final void method1087(int arg0, int arg1, int arg2) {
        class218 var3 = class29.field615[class234.field4325][arg0][arg1];
        field3043++;
        if (var3 == null) {
            class111.method666(class234.field4325, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class158 var5 = null;
        for (class158 var6 = (class158) var3.method1358(-29726); var6 != null; var6 = (class158) var3.method1360(true)) {
            class12 var13 = class43.method311(var6.field2847.field3256, arg2 - 8);
            int var14 = var13.field221;
            if (var13.field266 == 1) {
                var14 = (var6.field2847.field3252 + 1) * var14;
            }
            if (var14 > var4) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class111.method666(class234.field4325, arg0, arg1);
            return;
        }
        if (arg2 != 8) {
            field3039 = null;
        }
        class180 var7 = null;
        class180 var8 = null;
        var3.method1356(var5, 1);
        for (class158 var9 = (class158) var3.method1358(arg2 ^ 0xFFFF8BEA); var9 != null; var9 = (class158) var3.method1360(true)) {
            class180 var12 = var9.field2847;
            if (var5.field2847.field3256 != var12.field3256) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field3256 != var12.field3256 && var8 == null) {
                    var8 = var12;
                }
            }
        }
        long var10 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class204.method1292(class234.field4325, arg0, arg1, class195.method1225(arg0 * 128 + 64, class234.field4325, arg1 * 128 + 64, (byte) -118), var5.field2847, var10, var7, var8);
    }
}
