import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 extends class97 {

    @OriginalMember(owner = "client!na", name = "x", descriptor = "[Lhb;")
    public static class51[] field2116 = new class51[1000];

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field2111 = 50;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "[I")
    public static int[] field2115 = new int[500];

    @OriginalMember(owner = "client!na", name = "F", descriptor = "[Lwd;")
    public static class150[] field2124 = new class150[field2111];

    @OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
    public static int[] field2117 = new int[field2111];

    @OriginalMember(owner = "client!na", name = "t", descriptor = "[B")
    public static byte[] field2112 = new byte[520];

    @OriginalMember(owner = "client!na", name = "u", descriptor = "[I")
    public static int[] field2113 = new int[field2111];

    @OriginalMember(owner = "client!na", name = "A", descriptor = "[I")
    public static int[] field2119 = new int[field2111];

    @OriginalMember(owner = "client!na", name = "M", descriptor = "[I")
    public static int[] field2131 = new int[field2111];

    @OriginalMember(owner = "client!na", name = "L", descriptor = "Z")
    public static boolean field2130 = false;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "[I")
    public static int[] field2137 = new int[field2111];

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "Lwd;")
    public static class150 field2135 = class2.method9(true, "::clientdrop");

    @OriginalMember(owner = "client!na", name = "I", descriptor = "[I")
    public static int[] field2127 = new int[field2111];

    @OriginalMember(owner = "client!na", name = "R", descriptor = "[[I")
    public static int[][] field2136 = new int[5][5000];

    @OriginalMember(owner = "client!na", name = "T", descriptor = "Lwd;")
    public static class150 field2138 = class2.method9(true, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!na", name = "B", descriptor = "[I")
    public static int[] field2120 = new int[field2111];

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Lpb;")
    public class106 field2133;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "Lce;")
    public class20 field2118;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "[B")
    public byte[] field2123;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "[Lwd;")
    public static class150[] field2121;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lff;ILff;Lff;)V")
    public static final void method644(class42 arg0, int arg1, class42 arg2, class42 arg3) {
        class76.field1867 = arg2;
        class17.field434 = arg3;
        if (arg1 <= 28) {
            method647((byte) -52);
        }
        field2114++;
        class127.field2967 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lre;B)V")
    public static final void method645(class121 arg0, byte arg1) {
        class99.field2277 = arg0;
        if (arg1 != 75) {
            field2115 = null;
        }
        field2132++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILue;ILjava/awt/Component;)Lha;")
    public static final class50 method646(int arg0, int arg1, class139 arg2, int arg3, Component arg4) {
        field2129++;
        if (class37.field1007 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class50 var5 = (class50) Class.forName("oe").getDeclaredConstructor().newInstance();
                var5.field1334 = new int[(class38.field1048 ? 2 : 1) * 256];
                var5.field1368 = arg1;
                var5.method375(arg4);
                var5.field1367 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field1367 > 16384) {
                    var5.field1367 = 16384;
                }
                var5.method386(var5.field1367);
                if (class134.field3146 > 0 && client.field608 == null) {
                    client.field608 = new class125();
                    arg2.method1031(class134.field3146, client.field608, 68);
                }
                if (client.field608 != null) {
                    if (client.field608.field2886[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    client.field608.field2886[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class52 var6 = new class52(arg2, arg3);
                    var6.field1334 = new int[(class38.field1048 ? 2 : 1) * 256];
                    var6.field1368 = arg1;
                    var6.method375(arg4);
                    var6.field1367 = 16384;
                    if (arg0 <= 122) {
                        field2135 = null;
                    }
                    var6.method386(var6.field1367);
                    if (class134.field3146 > 0 && client.field608 == null) {
                        client.field608 = new class125();
                        arg2.method1031(class134.field3146, client.field608, 127);
                    }
                    if (client.field608 != null) {
                        if (client.field608.field2886[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        client.field608.field2886[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class50();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    public static final void method647(byte arg0) {
        for (int var1 = 0; var1 < class111.field2577; var1++) {
            int var2 = class17.field468[var1];
            class111 var3 = class137.field3217[var2];
            int var4 = class121.field2783.method1137(arg0 + 223);
            if ((var4 & 0x1) != 0) {
                var4 += class121.field2783.method1137(arg0 + 223) << 8;
            }
            class101.method694(var2, var3, var4, 19911);
        }
        if (arg0 != 32) {
            method645(null, (byte) -90);
        }
        field2128++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2134++;
        if (class145.method1090(-117, arg5)) {
            class73.method550(arg1, 23680, arg3, arg6, -1, arg0, 0, arg7, 0, arg4, class58.field1500[arg5]);
            int var8 = -75 % ((-arg2 - 62) / 40);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method649(int arg0) {
        field2120 = null;
        field2136 = null;
        field2112 = null;
        field2124 = null;
        field2131 = null;
        field2137 = null;
        field2121 = null;
        field2115 = null;
        field2135 = null;
        if (arg0 <= 87) {
            return;
        }
        field2138 = null;
        field2117 = null;
        field2116 = null;
        field2113 = null;
        field2119 = null;
        field2127 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method650(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2125++;
        class54 var10 = null;
        if (arg2 > -42) {
            field2130 = true;
        }
        for (class54 var11 = (class54) class107.field2432.method702((byte) -120); var11 != null; var11 = (class54) class107.field2432.method698(-1610612736)) {
            if (var11.field1422 == arg4 && var11.field1429 == arg3 && var11.field1414 == arg1 && var11.field1431 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class54();
            var10.field1431 = arg5;
            var10.field1422 = arg4;
            var10.field1414 = arg1;
            var10.field1429 = arg3;
            class134.method1001((byte) -80, var10);
            class107.field2432.method711(var10, 0);
        }
        var10.field1425 = arg0;
        var10.field1432 = arg7;
        var10.field1420 = arg8;
        var10.field1430 = arg6;
        var10.field1424 = arg9;
    }
}
