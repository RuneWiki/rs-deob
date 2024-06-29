import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class86 {

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "I")
    public static int field1547 = 0;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "Leq;")
    public static class213 field1546 = new class213(64);

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "Z")
    public static boolean field1544;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V", line = 9)
    public static final void method821(int arg0) {
        field1545++;
        class161 var1 = (class161) class148.field2472.method1269(4);
        if (arg0 != 512) {
            method822(-125, 79, 70);
        }
        while (var1 != null) {
            class8 var2 = var1.field2575;
            if (var2.field90 < class641.field8810) {
                var1.method2314((byte) 101);
                var2.method34(-2159);
            } else if (class641.field8810 >= var2.field109) {
                var2.method39((byte) 121);
                if (var2.field110 > 0) {
                    class751 var3 = (class751) field1546.method1465((long) (var2.field110 - 1), -6008);
                    if (var3 != null) {
                        class9 var4 = var3.field10510;
                        if (var4.field5922 >= 0 && class376.field5325 * 512 > var4.field5922 && var4.field5933 >= 0 && class175.field2711 * 512 > var4.field5933) {
                            var2.method32((byte) -103, class197.method1403(var4.field5922, var2.field5926, 11219, var4.field5933) - var2.field64, var4.field5933, class641.field8810, var4.field5922);
                        }
                    }
                }
                if (var2.field110 < 0) {
                    int var5 = -var2.field110 - 1;
                    class598 var6;
                    if (class561.field7752 == var5) {
                        var6 = class58.field1147;
                    } else {
                        var6 = class49.field1040[var5];
                    }
                    if (var6 != null && var6.field5922 >= 0 && (class376.field5325 * 512) > var6.field5922 && var6.field5933 >= 0 && var6.field5933 < class175.field2711 * 512) {
                        var2.method32((byte) -103, class197.method1403(var6.field5922, var2.field5926, 11219, var6.field5933) - var2.field64, var6.field5933, class641.field8810, var6.field5922);
                    }
                }
                var2.method43((byte) 75, class322.field4464);
                class625.method3565(var2, true);
            }
            var1 = (class161) class148.field2472.method1264((byte) 56);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)Lfha;", line = 76)
    public static final class380 method822(int arg0, int arg1, int arg2) {
        class384 var3 = class649.field8928[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class380 var4 = var3.field5579;
            var3.field5579 = null;
            class468.method2749(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V", line = 89)
    public static void method823(byte arg0) {
        field1546 = null;
        if (arg0 <= 56) {
            method823((byte) -49);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)Z", line = 100)
    public static final boolean method824(int arg0, int arg1) {
        field1543++;
        if (arg0 <= 121) {
            return false;
        } else {
            return arg1 == 3 || arg1 == 4;
        }
    }
}
