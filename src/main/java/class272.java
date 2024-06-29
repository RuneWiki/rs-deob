import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class272 extends class254 {

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public int field4308 = -1;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public int field4302 = 0;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Z")
    public static boolean field4303 = false;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public int field4304;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public int field4305;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public int field4307;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public int field4309;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public int field4310;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public int field4311;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public int field4313;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "[[B")
    public static byte[][] field4319;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ICB)C")
    public static final char method1826(int arg0, char arg1, byte arg2) {
        field4306++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg2 > -41) {
            return (char) 65444;
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method1827(byte arg0) {
        field4319 = null;
        if (arg0 != 30) {
            field4319 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1828(int arg0, int[] arg1) {
        field4318++;
        if (arg0 != -14305) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class164.method1096(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIII)V")
    public static final void method1829(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4312++;
        for (class30 var5 = (class30) class74.field1146.method656(96); var5 != null; var5 = (class30) class74.field1146.method650(126)) {
            class175.method1149(arg2, arg1, arg4, arg3, var5, (byte) 117);
        }
        for (class30 var6 = (class30) class210.field3019.method656(96); var6 != null; var6 = (class30) class210.field3019.method650(126)) {
            byte var11 = 1;
            class35 var12 = var6.field431.method73((byte) -44);
            if (var6.field431.field112 == var12.field531) {
                var11 = 0;
            } else if (var6.field431.field112 == var12.field526 || var6.field431.field112 == var12.field524 || var6.field431.field112 == var12.field529 || var6.field431.field112 == var12.field505) {
                var11 = 2;
            } else if (var6.field431.field112 == var12.field509 || var6.field431.field112 == var12.field515 || var6.field431.field112 == var12.field506 || var6.field431.field112 == var12.field523) {
                var11 = 3;
            }
            if (var6.field429 != var11) {
                int var13 = class219.method1407(-1159, var6.field431);
                if (var6.field425 != var13) {
                    if (var6.field438 != null) {
                        class152.field2201.method279(var6.field438);
                        var6.field438 = null;
                    }
                    var6.field425 = var13;
                }
                var6.field429 = var11;
            }
            var6.field419 = var6.field431.field45;
            var6.field418 = var6.field431.field45 + var6.field431.method57(0) * 64;
            var6.field427 = var6.field431.field94;
            var6.field430 = var6.field431.field94 + var6.field431.method57(0) * 64;
            class175.method1149(arg2, arg1, arg4, arg3, var6, (byte) 54);
        }
        for (class30 var7 = (class30) class124.field1801.method1219(1); var7 != null; var7 = (class30) class124.field1801.method1223(109)) {
            byte var8 = 1;
            class35 var9 = var7.field441.method73((byte) -44);
            if (var7.field441.field112 == var9.field531) {
                var8 = 0;
            } else if (var7.field441.field112 == var9.field526 || var7.field441.field112 == var9.field524 || var7.field441.field112 == var9.field529 || var7.field441.field112 == var9.field505) {
                var8 = 2;
            } else if (var7.field441.field112 == var9.field509 || var7.field441.field112 == var9.field515 || var7.field441.field112 == var9.field506 || var7.field441.field112 == var9.field523) {
                var8 = 3;
            }
            if (var7.field429 != var8) {
                int var10 = class279.method1880(var7.field441, (byte) 110);
                if (var7.field425 != var10) {
                    if (var7.field438 != null) {
                        class152.field2201.method279(var7.field438);
                        var7.field438 = null;
                    }
                    var7.field425 = var10;
                }
                var7.field429 = var8;
            }
            var7.field419 = var7.field441.field45;
            var7.field418 = var7.field441.field45 + var7.field441.method57(0) * 64;
            var7.field427 = var7.field441.field94;
            var7.field430 = var7.field441.field94 + (var7.field441.method57(0) * 64);
            class175.method1149(arg2, arg1, arg4, arg3, var7, (byte) 71);
        }
        if (arg0) {
            field4319 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)V")
    public static final void method1830(int arg0, int arg1) {
        class181.field2596.method258(arg0, (byte) 123);
        field4316++;
        int var2 = 28 / ((arg1 - 77) / 36);
    }
}
