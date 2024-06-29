import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class385 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Ltp;")
    private class313 field5808 = new class313();

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Z")
    public static boolean field5812 = false;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lsa;")
    public static class112 field5819 = null;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Luj;")
    public static class214 field5821;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Ltp;")
    private class313 field5823;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field5826;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "[Z")
    public static boolean[] field5817;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Ltp;")
    public final class313 method2430(int arg0) {
        field5811++;
        class313 var2 = this.field5808.field4929;
        if (this.field5808 == var2) {
            this.field5823 = null;
            return null;
        }
        if (arg0 != 67) {
            field5817 = null;
        }
        this.field5823 = var2.field4929;
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;BIII)V")
    public static final void method2431(String arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5825++;
        class172 var5 = class201.method1393(arg2, arg4, -127);
        if (var5 == null) {
            return;
        }
        if (var5.field2767 != null) {
            class150 var6 = new class150();
            var6.field2346 = arg0;
            var6.field2351 = arg3;
            var6.field2352 = var5.field2767;
            var6.field2348 = var5;
            class17.method135(var6);
        }
        boolean var7 = true;
        if (var5.field2831 > 0) {
            var7 = class243.method1703(var5, arg1 ^ 0x24DE);
        }
        if (!var7 || !client.method1149(var5).method352(arg1 - 61, arg3 - 1) || arg1 != 61) {
            return;
        }
        if (arg3 == 1) {
            class436.field6414++;
            class11.field139.method2224(28, (byte) 0);
            class11.field139.method1315(arg2, (byte) 95);
            class11.field139.method1283(arg1 - 53, arg4);
        }
        if (arg3 == 2) {
            class119.field1632++;
            class11.field139.method2224(9, (byte) 0);
            class11.field139.method1315(arg2, (byte) 118);
            class11.field139.method1283(arg1 - 53, arg4);
        }
        if (arg3 == 3) {
            class125.field1919++;
            class11.field139.method2224(60, (byte) 0);
            class11.field139.method1315(arg2, (byte) 54);
            class11.field139.method1283(8, arg4);
        }
        if (arg3 == 4) {
            class11.field139.method2224(107, (byte) 0);
            class296.field4712++;
            class11.field139.method1315(arg2, (byte) 119);
            class11.field139.method1283(8, arg4);
        }
        if (arg3 == 5) {
            class28.field321++;
            class11.field139.method2224(172, (byte) 0);
            class11.field139.method1315(arg2, (byte) 104);
            class11.field139.method1283(8, arg4);
        }
        if (arg3 == 6) {
            class82.field1010++;
            class11.field139.method2224(127, (byte) 0);
            class11.field139.method1315(arg2, (byte) 25);
            class11.field139.method1283(8, arg4);
        }
        if (arg3 == 7) {
            class313.field4926++;
            class11.field139.method2224(185, (byte) 0);
            class11.field139.method1315(arg2, (byte) 125);
            class11.field139.method1283(8, arg4);
        }
        if (arg3 == 8) {
            class120.field1644++;
            class11.field139.method2224(228, (byte) 0);
            class11.field139.method1315(arg2, (byte) 10);
            class11.field139.method1283(arg1 - 53, arg4);
        }
        if (arg3 == 9) {
            class11.field139.method2224(149, (byte) 0);
            class138.field2155++;
            class11.field139.method1315(arg2, (byte) 18);
            class11.field139.method1283(8, arg4);
        }
        if (arg3 == 10) {
            class330.field5161++;
            class11.field139.method2224(29, (byte) 0);
            class11.field139.method1315(arg2, (byte) 16);
            class11.field139.method1283(8, arg4);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Ltp;")
    public final class313 method2432(byte arg0) {
        if (arg0 >= -91) {
            this.method2434((byte) -114);
        }
        field5809++;
        class313 var2 = this.field5808.field4929;
        if (this.field5808 == var2) {
            return null;
        } else {
            var2.method2100(-96);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BCI)C")
    public static final char method2433(byte arg0, char arg1, int arg2) {
        if (arg0 != -58) {
            return (char) 65524;
        }
        field5807++;
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
            if (arg1 == 'Ñ' && arg2 != 0) {
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
            if (arg1 == 'ñ' && arg2 != 0) {
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
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)I")
    public final int method2434(byte arg0) {
        field5822++;
        int var2 = 0;
        for (class313 var3 = this.field5808.field4929; var3 != this.field5808; var3 = var3.field4929) {
            var2++;
        }
        int var4 = -8 % ((arg0 - 25) / 35);
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Ltp;")
    public final class313 method2435(int arg0) {
        if (arg0 != -224) {
            return null;
        }
        field5824++;
        class313 var2 = this.field5823;
        if (this.field5808 == var2) {
            this.field5823 = null;
            return null;
        } else {
            this.field5823 = var2.field4929;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static final void method2436(int arg0) {
        if (arg0 > -82) {
            method2441(1);
        }
        if (class279.field4460 == 2) {
            class27.field314 = 96;
        } else {
            try {
                Method var1 = (field5826 == null ? (field5826 = method2444("java.lang.Runtime")) : field5826).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class27.field314 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field5815++;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)Z")
    public final boolean method2437(byte arg0) {
        field5814++;
        if (arg0 >= -63) {
            return false;
        } else {
            return this.field5808.field4929 == this.field5808;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= -42) {
            return;
        }
        for (class32 var7 = (class32) class139.field2161.method2430(67); var7 != null; var7 = (class32) class139.field2161.method2435(-224)) {
            if (var7.field396 <= class183.field2987) {
                var7.method2100(-57);
            } else {
                class58.method384(arg5 >> 1, (var7.field397 << 7) + 64, arg3 >> 1, arg2, arg4, var7.field399 * 2, 125, (var7.field394 << 7) + 64);
                class11.field133.method2820(var7.field401, 0, class126.field1938[1] + arg0, false, class126.field1938[0] + arg1, var7.field403 | 0xFF000000);
            }
        }
        field5810++;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public final void method2439(int arg0) {
        field5813++;
        while (true) {
            class313 var2 = this.field5808.field4929;
            if (this.field5808 == var2) {
                if (arg0 >= -114) {
                    this.method2432((byte) 80);
                }
                this.field5823 = null;
                return;
            }
            var2.method2100(-57);
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)Ltp;")
    public final class313 method2440(byte arg0) {
        field5820++;
        class313 var2 = this.field5808.field4930;
        if (this.field5808 == var2) {
            this.field5823 = null;
            return null;
        }
        this.field5823 = var2.field4930;
        if (arg0 > -91) {
            method2443((String) null, (byte) -67);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
    public static void method2441(int arg0) {
        field5819 = null;
        if (arg0 >= -122) {
            field5819 = null;
        }
        field5821 = null;
        field5817 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ltp;B)V")
    public final void method2442(class313 arg0, byte arg1) {
        field5816++;
        if (arg0.field4930 != null) {
            arg0.method2100(104);
        }
        arg0.field4930 = this.field5808.field4930;
        arg0.field4929 = this.field5808;
        arg0.field4930.field4929 = arg0;
        if (arg1 < 109) {
            method2441(114);
        }
        arg0.field4929.field4930 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2443(String arg0, byte arg1) {
        field5818++;
        int var2 = -69 % ((-arg1 - 17) / 35);
        if (class392.field5890 != null) {
            class424.field6262++;
            class11.field139.method2224(120, (byte) 0);
            class11.field139.method1312(class317.method2110(true, arg0), -110);
            class11.field139.method1301(arg0, 110);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class385() {
        this.field5808.field4930 = this.field5808;
        this.field5808.field4929 = this.field5808;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2444(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
