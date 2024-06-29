import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class63 {

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[Z")
    public boolean[] field837 = new boolean[16];

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[I")
    public int[] field836 = new int[257];

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "[B")
    public byte[] field845 = new byte[256];

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "[B")
    public byte[] field849 = new byte[18002];

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "[[B")
    public byte[][] field840 = new byte[6][258];

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "[I")
    public int[] field847 = new int[6];

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "[[I")
    public int[][] field854 = new int[6][258];

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "[[I")
    public int[][] field856 = new int[6][258];

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public int field857 = 0;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[B")
    public byte[] field860 = new byte[18002];

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "[[I")
    public int[][] field851 = new int[6][258];

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "[B")
    public byte[] field852 = new byte[4096];

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "[Z")
    public boolean[] field871 = new boolean[256];

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "[I")
    public int[] field872 = new int[16];

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "[I")
    public int[] field864 = new int[256];

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public int field862 = 0;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field842 = 0;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "[I")
    public static int[] field846 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "B")
    public byte field874;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Ltj;")
    public static class108 field839;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lt;")
    public static class400 field844;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ej", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field875;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "[B")
    public byte[] field859;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "[B")
    public byte[] field863;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static final void method402(int arg0) {
        field869++;
        if (!class269.field3935) {
            return;
        }
        if (arg0 != 18002) {
            field839 = null;
        }
        class223 var1 = class299.method2016(class261.field3855, class128.field1814, (byte) 117);
        if (var1 != null && var1.field3334 != null) {
            class79 var2 = new class79();
            var2.field1018 = var1;
            var2.field1028 = var1.field3334;
            class424.method2655(var2);
        }
        class324.field4715 = -1;
        class385.field5451 = -1;
        class269.field3935 = false;
        class245.method1701(var1, (byte) -94);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static final void method403(byte arg0) {
        for (int var1 = -1; var1 < class334.field4847; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class26.field323[var1];
            }
            class128 var3 = class243.field3596[var2];
            if (var3 != null) {
                class142.method1066(var3.method773((byte) 68), 11008, var3);
            }
        }
        if (arg0 <= -127) {
            field843++;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
    public static final void method404(int arg0, int arg1) {
        field861++;
        if (!class84.field1077) {
            arg0 = -1;
        }
        if (arg1 >= -22) {
            field844 = null;
        }
        if (class51.field665 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class166 var2 = class23.method125(arg0, -119);
            class337 var3 = var2.method1199((byte) -119);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class401.field5628.method1534(new Point(var2.field2369, var2.field2365), var3.method2214(), 19, class117.field1588, var3.method2223(), var3.method2220());
                class51.field665 = arg0;
            }
        }
        if (arg0 == -1 && class51.field665 != -1) {
            class401.field5628.method1534(new Point(), -1, 19, class117.field1588, (int[]) null, -1);
            class51.field665 = -1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public static void method405(int arg0) {
        field839 = null;
        field844 = null;
        int var1 = 64 % ((38 - arg0) / 56);
        field846 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILqr;IILvq;III)V")
    public static final void method406(int arg0, class41 arg1, int arg2, int arg3, class269 arg4, int arg5, int arg6, int arg7) {
        field865++;
        class143 var8 = null;
        if (~arg3 == arg0) {
            var8 = (class143) class431.method2683(arg6, arg5, arg7);
        }
        if (arg3 == 1) {
            var8 = (class143) class145.method1084(arg6, arg5, arg7);
        }
        if (arg3 == 2) {
            var8 = (class143) class233.method1613(arg6, arg5, arg7, field875 == null ? (field875 = method407("mb")) : field875);
        }
        if (arg3 == 3) {
            var8 = (class143) class353.method2309(arg6, arg5, arg7);
        }
        if (var8 == null) {
            return;
        }
        int var9 = var8.method602((byte) -128);
        int var10 = var8.method603((byte) -62);
        class282 var11 = class398.method2496(arg0 ^ 0x72, var8.method599(-10450));
        if (var11.method1935(arg0 + 151)) {
            class297.method2006(arg6, var11, arg5, -11666, arg7);
        }
        if (var8.method608(false)) {
            var8.method604(arg4, -89);
        }
        if (arg3 != 0) {
            if (arg3 == 1) {
                class418.method2633(arg6, arg5, arg7);
                return;
            }
            if (arg3 != 2) {
                if (arg3 == 3) {
                    class259.method1792(arg6, arg5, arg7);
                    if (var11.field4079 == 1) {
                        arg1.method285(arg7, (byte) 80, arg5);
                        return;
                    }
                }
                return;
            }
            class258.method1782(arg6, arg5, arg7, field875 == null ? (field875 = method407("mb")) : field875);
            if (var11.field4079 != 0 && (var11.field4090 + arg5) < class80.field1034 && var11.field4090 + arg7 < class381.field5414 && class80.field1034 > arg5 + var11.field4085 && arg7 + var11.field4085 < class381.field5414) {
                arg1.method273((byte) -87, arg5, var10, var11.field4085, arg7, var11.field4042, !var11.field4081, var11.field4090);
                return;
            }
            return;
        }
        class302.method2036(arg6, arg5, arg7);
        if (var11.field4079 != 0) {
            arg1.method282((byte) 86, var11.field4042, arg7, var10, arg5, var9, !var11.field4081);
            return;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method407(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
