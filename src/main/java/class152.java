import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class152 {

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Lma;")
    private static class5 field2216 = class12.method119("glow2:", (byte) 86);

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Lma;")
    public static class5 field2217 = field2216;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lma;")
    public static class5 field2214 = field2216;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field2204 = 0;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "[I")
    public static int[] field2222 = new int[50];

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "Lma;")
    public static class5 field2233 = class12.method119("hitbar_default", (byte) 107);

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Lma;")
    public static class5 field2213 = class12.method119("; Expires=", (byte) 102);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public int field2218;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public int field2230;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public int field2232;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public int field2234;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "[[[B")
    public static byte[][][] field2235;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIB)V", line = 9)
    public static final void method954(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2212++;
        if (arg5 != -2) {
            method957(-85, -48, -20, 1, (class280) null, 86L, (class280) null, (class280) null);
        }
        if (arg2 > class101.field1505 || arg1 < class294.field4956) {
            return;
        }
        boolean var6;
        if (class57.field899 > arg4) {
            arg4 = class57.field899;
            var6 = false;
        } else if (class301.field5073 < arg4) {
            var6 = false;
            arg4 = class301.field5073;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class57.field899 > arg3) {
            arg3 = class57.field899;
            var7 = false;
        } else if (arg3 > class301.field5073) {
            arg3 = class301.field5073;
            var7 = false;
        } else {
            var7 = true;
        }
        if (class294.field4956 > arg2) {
            arg2 = class294.field4956;
        } else {
            class239.method1690(arg4, arg5 + 23269, arg3, class137.field2032[arg2++], arg0);
        }
        if (arg1 <= class101.field1505) {
            class239.method1690(arg4, 23267, arg3, class137.field2032[arg1--], arg0);
        } else {
            arg1 = class101.field1505;
        }
        if (var6 && var7) {
            for (int var8 = arg2; var8 <= arg1; var8++) {
                int[] var9 = class137.field2032[var8];
                var9[arg4] = var9[arg3] = arg0;
            }
        } else if (var6) {
            for (int var10 = arg2; var10 <= arg1; var10++) {
                class137.field2032[var10][arg4] = arg0;
            }
        } else if (var7) {
            for (int var11 = arg2; var11 <= arg1; var11++) {
                class137.field2032[var11][arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)I", line = 113)
    public static final int method955(int arg0, int arg1, int arg2) {
        field2209++;
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
            arg2--;
        }
        return arg0 == 64 ? var3 : 71;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Z", line = 136)
    public static final boolean method956(byte arg0) {
        field2207++;
        if (arg0 > -45) {
            method959(33, -98, -107, -30, 20, -112, -1, -93, 125, 26);
        }
        return true;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIILkb;JLkb;Lkb;)V", line = 169)
    public static final void method957(int arg0, int arg1, int arg2, int arg3, class280 arg4, long arg5, class280 arg6, class280 arg7) {
        class139 var9 = new class139();
        var9.field2051 = arg4;
        var9.field2058 = arg1 * 128 + 64;
        var9.field2064 = arg2 * 128 + 64;
        var9.field2056 = arg3;
        var9.field2062 = arg5;
        var9.field2060 = arg6;
        var9.field2067 = arg7;
        int var10 = 0;
        class198 var11 = class43.field646[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3162; var12++) {
                class107 var13 = var11.field3166[var12];
                if ((var13.field1590 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1589.method248();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2061 = -var10;
        if (class43.field646[arg0][arg1][arg2] == null) {
            class43.field646[arg0][arg1][arg2] = new class198(arg0, arg1, arg2);
        }
        class43.field646[arg0][arg1][arg2].field3156 = var9;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 213)
    public static final void method958(int arg0) {
        if (arg0 != 0) {
            method957(-62, -55, -30, -106, (class280) null, 44L, (class280) null, (class280) null);
        }
        field2227++;
        class206.field3277.method522(arg0 ^ 0x5B);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIII)V", line = 224)
    public static final void method959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2226++;
        if (arg4 >= class57.field899 && class301.field5073 >= arg4 && arg0 >= class57.field899 && class301.field5073 >= arg0 && arg5 >= class57.field899 && class301.field5073 >= arg5 && class57.field899 <= arg7 && class301.field5073 >= arg7 && arg3 >= class294.field4956 && class101.field1505 >= arg3 && class294.field4956 <= arg2 && class101.field1505 >= arg2 && arg8 >= class294.field4956 && arg8 <= class101.field1505 && class294.field4956 <= arg6 && class101.field1505 >= arg6) {
            class150.method944(arg1 + 79, arg7, arg3, arg9, arg8, arg5, arg6, arg2, arg0, arg4);
        } else {
            class138.method899(arg1 ^ 0x2, arg4, arg8, arg5, arg3, arg7, arg6, arg9, arg2, arg0);
        }
        if (arg1 != 0) {
            field2235 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lma;Z)V", line = 249)
    public static final void method960(class5 arg0, boolean arg1) {
        field2225++;
        class100 var2 = (class100) class280.field4746.method1475(14);
        if (!arg1) {
            method961(40);
        }
        while (var2 != null) {
            if (var2.field1486.method62(arg0, -23269)) {
                class283.field4799 = var2;
                return;
            }
            var2 = (class100) class280.field4746.method1486(38);
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 277)
    public static void method961(int arg0) {
        field2216 = null;
        field2233 = null;
        field2214 = null;
        field2222 = null;
        field2217 = null;
        field2235 = (byte[][][]) null;
        if (arg0 != -3) {
            method956((byte) -121);
        }
        field2213 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIILhf;)Ljava/awt/Frame;", line = 306)
    public static final Frame method962(int arg0, int arg1, int arg2, int arg3, int arg4, class154 arg5) {
        field2231++;
        if (!arg5.method977(11)) {
            return null;
        }
        if (arg2 == 0) {
            class129[] var6 = class244.method1713(arg5, -125);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1935 == arg3 && var6[var8].field1939 == arg4 && (arg1 == 0 || var6[var8].field1930 == arg1) && (!var7 || arg2 < var6[var8].field1942)) {
                    arg2 = var6[var8].field1942;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class32 var9 = arg5.method989(arg4, arg1, -5066, arg2, arg3);
        while (var9.field497 == 0) {
            class116.method759(arg0 ^ 0xFFFFFFFE, 10L);
        }
        if (arg0 != 1) {
            return (Frame) null;
        }
        Frame var10 = (Frame) var9.field496;
        if (var10 == null) {
            return null;
        } else if (var9.field497 == 2) {
            class302.method2049(var10, arg5, arg0 ^ 0x1);
            return null;
        } else {
            return var10;
        }
    }
}
