import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class142 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2294 = 0;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2301 = 0;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "[I")
    public static int[] field2304 = new int[2];

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Lpk;")
    public static class120 field2295;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[[Z")
    public static boolean[][] field2296;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILtk;I)V", line = 16)
    public static final void method1089(int arg0, int arg1, int arg2, class266 arg3, int arg4) {
        if (class162.field2623) {
            class114.method886(arg4, arg1, arg3.field3941 + arg4, arg3.field3939 + arg1);
        }
        if (class42.field646 >= 3) {
            if (class162.field2623) {
                class88 var5 = arg3.method1851(false, 0);
                if (var5 != null) {
                    var5.method698(arg4, arg1);
                }
            } else {
                class33.method309(arg4, arg1, 0, arg3.field4107, arg3.field4106);
            }
        } else if (class162.field2623) {
            ((class196) class208.field3289).method1386(arg4, arg1, arg3.field3941, arg3.field3939, class208.field3289.field1412 / 2, class208.field3289.field1413 / 2, (int) class171.field2747, 256, (class196) arg3.method1851(false, arg2 ^ 0x30));
        } else {
            ((class317) class208.field3289).method1637(arg4, arg1, arg3.field3941, arg3.field3939, class208.field3289.field1412 / 2, class208.field3289.field1413 / 2, (int) class171.field2747, 256, arg3.field4107, arg3.field4106);
        }
        class282.field4415[arg0] = true;
        field2300++;
        if (arg2 != 48) {
            method1090((String) null, false);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 57)
    public static final byte[] method1090(String arg0, boolean arg1) {
        field2305++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        if (!arg1) {
            method1095(-99);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;ZZI)I", line = 194)
    public static final int method1091(String arg0, boolean arg1, boolean arg2, int arg3) {
        field2298++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        int var5 = arg0.length();
        boolean var6 = false;
        int var7 = 0;
        if (!arg2) {
            field2294 = 59;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg3 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var7 + var11;
            if ((var10 / arg3) != var7) {
                throw new NumberFormatException();
            }
            var7 = var10;
            var6 = true;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 274)
    public static final void method1092(byte arg0) {
        if (arg0 > -29) {
            method1091((String) null, true, true, 14);
        }
        class145.field2348.method2283((byte) 77);
        class337.field5206.method2283((byte) 77);
        field2303++;
        class195.field3013.method2283((byte) 77);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILpk;I)Lwd;", line = 287)
    public static final class88 method1093(int arg0, int arg1, class120 arg2, int arg3) {
        field2302++;
        if (class107.method854(arg2, arg1, arg3, (byte) 88)) {
            if (arg0 != 0) {
                method1090((String) null, false);
            }
            return class343.method2381(112);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Leg;", line = 303)
    public static final class317 method1094(boolean arg0) {
        field2299++;
        int var1 = class83.field1288[0] * class309.field4887[0];
        if (arg0) {
            return (class317) null;
        }
        byte[] var2 = class207.field3277[0];
        class317 var5;
        if (class107.field1759[0]) {
            byte[] var6 = class116.field1878[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class251.method1740(class164.method1234(-16777216, var6[var8] << 24), class260.field3873[class164.method1234(var2[var8], 255)]);
            }
            var5 = new class224(class185.field2926, class112.field1821, class61.field892[0], class183.field2902[0], class309.field4887[0], class83.field1288[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class260.field3873[class164.method1234(var2[var4], 255)];
            }
            var5 = new class317(class185.field2926, class112.field1821, class61.field892[0], class183.field2902[0], class309.field4887[0], class83.field1288[0], var3);
        }
        class260.method1796(1952227009);
        return var5;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 349)
    public static void method1095(int arg0) {
        if (arg0 > -17) {
            method1095(51);
        }
        field2296 = (boolean[][]) null;
        field2304 = null;
        field2295 = null;
    }
}
