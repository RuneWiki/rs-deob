import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class151 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[Lsd;")
    public static class26[] field2526 = new class26[2048];

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field2528 = -1;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lce;")
    public static class239 field2530;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIFZIII)[[I", line = 6)
    public static final int[][] method1129(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field2527++;
        int[][] var9 = new int[arg8][arg1];
        class251 var10 = new class251();
        var10.field4167 = (int) (arg4 * 4096.0F);
        var10.field4160 = arg7;
        var10.field4172 = arg2;
        var10.field4163 = arg0;
        var10.field4151 = arg5;
        var10.method61((byte) 4);
        class57.method480(false, arg8, arg1);
        for (int var11 = 0; var11 < arg8; var11++) {
            var10.method1776(var11, var9[var11], -1522113588);
        }
        return arg3 <= 76 ? (int[][]) ((int[][]) null) : var9;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I", line = 39)
    public static final int method1130(int arg0, int arg1) {
        if (arg0 <= 16) {
            method1134((byte) -119, (class26) null);
        }
        field2531++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)Lsf;", line = 57)
    public static final class102 method1131(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class102 var4 = var3.field222;
            var3.field222 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V", line = 70)
    public static void method1132(boolean arg0) {
        field2530 = null;
        field2526 = null;
        if (!arg0) {
            method1134((byte) 84, (class26) null);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 99)
    public static final void method1133(int arg0) {
        if (arg0 <= 125) {
            method1134((byte) -74, (class26) null);
        }
        for (int var1 = -1; var1 < class159.field2663; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class212.field3390[var1];
            }
            class258 var3 = class298.field4979[var2];
            if (var3 != null && var3.field1496 > 0) {
                var3.field1496--;
                if (var3.field1496 == 0) {
                    var3.field1501 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class177.field2923; var4++) {
            int var5 = class65.field1229[var4];
            class42 var6 = class91.field1656[var5];
            if (var6 != null && var6.field1496 > 0) {
                var6.field1496--;
                if (var6.field1496 == 0) {
                    var6.field1501 = null;
                }
            }
        }
        field2525++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLsd;)Lgi;", line = 159)
    public static final class208 method1134(byte arg0, class26 arg1) {
        field2529++;
        class208 var2 = new class208(arg1.method251((byte) 77), arg1.method251((byte) 77), arg1.method197(-1), arg1.method197(-1), arg1.method203(-22066), arg1.method226(255) == 1);
        int var3 = arg1.method226(255);
        int var4 = 0;
        int var5 = -4 % ((arg0 + 18) / 53);
        while (var3 > var4) {
            var2.field3336.method1972(new class242(arg1.method197(-1), arg1.method197(-1), arg1.method197(-1), arg1.method197(-1)), 10);
            var4++;
        }
        var2.method1469(true);
        return var2;
    }
}
