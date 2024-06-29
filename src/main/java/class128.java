import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class128 extends class64 {

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "Lrd;")
    public static class114 field3061 = class84.method656("welle:", (byte) 124);

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "Lrd;")
    private static class114 field3060 = class84.method656("Members object", (byte) 118);

    @OriginalMember(owner = "client!u", name = "db", descriptor = "I")
    public static int field3057 = -1;

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "Lrd;")
    private static class114 field3062 = class84.method656("Too many incorrect logins from your address)3", (byte) 116);

    @OriginalMember(owner = "client!u", name = "qb", descriptor = "Lrd;")
    public static class114 field3070 = class84.method656("@gr1@", (byte) 127);

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "Lrd;")
    public static class114 field3056 = class84.method656(" Sekunde(Xn(Y -Ubertragen)3", (byte) 126);

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
    public static int field3058 = 0;

    @OriginalMember(owner = "client!u", name = "tb", descriptor = "Lrd;")
    public static class114 field3073 = class84.method656("@whi@", (byte) 116);

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public static int field3053 = -1;

    @OriginalMember(owner = "client!u", name = "sb", descriptor = "Lrd;")
    public static class114 field3072 = class84.method656("Welt", (byte) 116);

    @OriginalMember(owner = "client!u", name = "jb", descriptor = "Lrd;")
    public static class114 field3063 = field3060;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "Lrd;")
    public static class114 field3059 = field3062;

    @OriginalMember(owner = "client!u", name = "wb", descriptor = "Lrd;")
    private static class114 field3076 = class84.method656("Loaded interfaces", (byte) 126);

    @OriginalMember(owner = "client!u", name = "mb", descriptor = "Lrd;")
    public static class114 field3066 = field3076;

    @OriginalMember(owner = "client!u", name = "ob", descriptor = "B")
    public byte field3068;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!u", name = "nb", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!u", name = "pb", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "client!u", name = "rb", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!u", name = "vb", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!u", name = "xb", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "Lke;")
    public class73 field3054;

    @OriginalMember(owner = "client!u", name = "ub", descriptor = "Lke;")
    public static class73 field3074;

    @OriginalMember(owner = "client!u", name = "kb", descriptor = "[[[B")
    public static byte[][][] field3064;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
    public static void method987(byte arg0) {
        field3076 = null;
        field3059 = null;
        field3070 = null;
        field3064 = null;
        field3073 = null;
        field3056 = null;
        field3072 = null;
        field3062 = null;
        field3066 = null;
        field3061 = null;
        if (arg0 == -110) {
            field3074 = null;
            field3060 = null;
            field3063 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)Lhc;")
    public static final class52 method988(int arg0, boolean arg1) {
        field3065++;
        if (arg1) {
            field3075 = -94;
        }
        class52 var2 = (class52) class34.field666.method194((byte) -95, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class120.field2813.method762(10, arg0, (byte) 66);
        class52 var4 = new class52();
        var4.field1077 = arg0;
        if (var3 != null) {
            var4.method368(-1, new class60(var3));
        }
        var4.method374((byte) 13);
        if (var4.field1085 != -1) {
            var4.method367(-53, method988(var4.field1085, false), method988(var4.field1098, arg1));
        }
        if (!class89.field1980 && var4.field1123) {
            var4.field1100 = null;
            var4.field1095 = null;
            var4.field1111 = field3063;
            var4.field1107 = 0;
        }
        class34.field666.method193(-125, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lke;IIBIBZ)V")
    public static final void method989(class73 arg0, int arg1, int arg2, byte arg3, int arg4, byte arg5, boolean arg6) {
        field3055++;
        long var7 = (long) ((arg4 << 16) + arg1);
        class128 var9 = (class128) class132.field3195.method783(-1, var7);
        if (var9 != null) {
            return;
        }
        class128 var10 = (class128) class114.field2664.method783(-1, var7);
        if (var10 != null) {
            return;
        }
        class128 var11 = (class128) class70.field1532.method783(-1, var7);
        if (var11 == null) {
            if (!arg6) {
                class128 var12 = (class128) class109.field2520.method783(-1, var7);
                if (var12 != null) {
                    return;
                }
            }
            if (arg3 == -16) {
                class128 var13 = new class128();
                var13.field3068 = arg5;
                var13.field3069 = arg2;
                var13.field3054 = arg0;
                if (arg6) {
                    class132.field3195.method781((byte) -7, var7, var13);
                    class145.field3453++;
                } else {
                    class64.field1368.method108(var13, (byte) -128);
                    class70.field1532.method781((byte) -7, var7, var13);
                    class92.field2154++;
                }
            }
        } else if (arg6) {
            var11.method519((byte) -123);
            class132.field3195.method781((byte) -7, var7, var11);
            class145.field3453++;
            class92.field2154--;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLf;)V")
    public static final void method990(byte arg0, class36 arg1) {
        arg1.field736 = arg1.field697;
        field3067++;
        if (arg1.field754 == 0) {
            arg1.field708 = 0;
            return;
        }
        if (arg1.field750 != -1 && arg1.field705 == 0) {
            class29 var2 = class12.method97(arg1.field750, false);
            if (arg1.field742 > 0 && var2.field615 == 0) {
                arg1.field708++;
                return;
            }
            if (arg1.field742 <= 0 && var2.field584 == 0) {
                arg1.field708++;
                return;
            }
        }
        int var3 = arg1.field748[arg1.field754 - 1] * 128 + arg1.field735 * 64;
        int var4 = arg1.field756;
        int var5 = arg1.field712;
        int var6 = arg1.field758[arg1.field754 - 1] * 128 + arg1.field735 * 64;
        if (var3 - var5 > 256 || var3 - var5 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field756 = var6;
            arg1.field712 = var3;
            return;
        }
        if (var3 <= var5) {
            if (var3 >= var5) {
                if (var4 < var6) {
                    arg1.field725 = 1024;
                } else if (var6 < var4) {
                    arg1.field725 = 0;
                }
            } else if (var4 < var6) {
                arg1.field725 = 768;
            } else if (var6 < var4) {
                arg1.field725 = 256;
            } else {
                arg1.field725 = 512;
            }
        } else if (var6 > var4) {
            arg1.field725 = 1280;
        } else if (var4 > var6) {
            arg1.field725 = 1792;
        } else {
            arg1.field725 = 1536;
        }
        int var7 = arg1.field725 - arg1.field700 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = 4;
        int var9 = 126 / ((arg0 - 72) / 50);
        boolean var10 = true;
        int var11 = arg1.field739;
        if (var7 >= -256 && var7 <= 256) {
            var11 = arg1.field696;
        } else if (var7 >= 256 && var7 < 768) {
            var11 = arg1.field716;
        } else if (var7 >= -768 && var7 <= -256) {
            var11 = arg1.field730;
        }
        if (var11 == -1) {
            var11 = arg1.field696;
        }
        arg1.field736 = var11;
        if (arg1 instanceof class8) {
            var10 = ((class8) arg1).field121.field2917;
        }
        if (var10) {
            if (arg1.field725 != arg1.field700 && arg1.field709 == -1 && arg1.field722 != 0) {
                var8 = 2;
            }
            if (arg1.field754 > 2) {
                var8 = 6;
            }
            if (arg1.field754 > 3) {
                var8 = 8;
            }
            if (arg1.field708 > 0 && arg1.field754 > 1) {
                arg1.field708--;
                var8 = 8;
            }
        } else {
            if (arg1.field754 > 1) {
                var8 = 6;
            }
            if (arg1.field754 > 2) {
                var8 = 8;
            }
            if (arg1.field708 > 0 && arg1.field754 > 1) {
                var8 = 8;
                arg1.field708--;
            }
        }
        if (arg1.field759[arg1.field754 - 1]) {
            var8 <<= 0x1;
        }
        if (var5 < var3) {
            arg1.field712 += var8;
            if (arg1.field712 > var3) {
                arg1.field712 = var3;
            }
        } else if (var5 > var3) {
            arg1.field712 -= var8;
            if (arg1.field712 < var3) {
                arg1.field712 = var3;
            }
        }
        if (var6 > var4) {
            arg1.field756 += var8;
            if (arg1.field756 > var6) {
                arg1.field756 = var6;
            }
        } else if (var6 < var4) {
            arg1.field756 -= var8;
            if (arg1.field756 < var6) {
                arg1.field756 = var6;
            }
        }
        if (arg1.field712 == var3 && arg1.field756 == var6) {
            arg1.field754--;
            if (arg1.field742 > 0) {
                arg1.field742--;
            }
        }
        if (var8 >= 8 && arg1.field736 == arg1.field696 && arg1.field753 != -1) {
            arg1.field736 = arg1.field753;
        }
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
    public static final void method991(int arg0) {
        field3071++;
        class127 var1 = (class127) class58.field1194.method654((byte) 27);
        if (arg0 != -1) {
            field3061 = null;
        }
        while (var1 != null) {
            if (class20.field346 != var1.field3031 || var1.field3033) {
                var1.method540(-26669);
            } else if (class20.field370 >= var1.field3026) {
                var1.method984((byte) 108, class135.field3289);
                if (var1.field3033) {
                    var1.method540(arg0 ^ 0x682C);
                } else {
                    class101.field2325.method1014(var1.field3031, var1.field3035, var1.field3025, var1.field3022, 60, var1, 0, -1, false);
                }
            }
            var1 = (class127) class58.field1194.method644((byte) -68);
        }
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
    public static final void method992(int arg0) {
        class26.method196(arg0);
        class18.method125((byte) 74);
        field3077++;
        class21.method139(arg0 ^ 0xFFFFFF8C);
        class24.method177(0);
        class22.method161(6);
        class145.method1152(503);
        class62.method505(-29992);
        class51.method363(117);
        class127.method982((byte) 127);
        class25.method184(arg0 - 11);
        class79.method628(arg0 ^ 0xFFFFF82F);
        class29.method217(1);
        ((class144) class134.field3277).method1142((byte) 69);
        class39.field812.method200(-112);
        class112.field2617.method758((byte) 0);
        class48.field989.method758((byte) 0);
        class47.field963.method758((byte) 0);
        class12.field280.method758((byte) 0);
        class100.field2298.method758((byte) 0);
        class137.field3318.method758((byte) 0);
        class116.field2699.method758((byte) 0);
        class104.field2423.method758((byte) 0);
        class31.field636.method758((byte) 0);
        field3074.method758((byte) 0);
        class55.field1162.method758((byte) 0);
        class26.field537.method758((byte) 0);
    }
}
