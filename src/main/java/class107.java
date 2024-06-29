import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 extends class146 {

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "[I")
    public int[] field2537 = new int[1];

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "[I")
    public int[] field2539 = new int[] { -1 };

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lec;")
    public static class32 field2535 = class73.method594(" loggt sich ein)3", true);

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "Lec;")
    private static class32 field2543 = class73.method594("Your ignore list is full)3 Max of 100 users)3", true);

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field2534 = 0;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field2544 = 0;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "Lec;")
    public static class32 field2545 = class73.method594("Verbindung mit Update)2Server)3)3)3", true);

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "Lec;")
    public static class32 field2546 = class73.method594("Bitte starten Sie eine Mitgliedschaft", true);

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "[Z")
    public static boolean[] field2542 = new boolean[112];

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "Lec;")
    public static class32 field2549 = class73.method594("Ihr Spielkonto wurde deaktiviert)3", true);

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "Lec;")
    public static class32 field2547 = field2543;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2541;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)I")
    public static int method864(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
    public static final void method865(int arg0, int arg1) {
        for (class38 var2 = (class38) class115.field2770.method1205((byte) 69); var2 != null; var2 = (class38) class115.field2770.method1201(76)) {
            if ((long) arg1 == (var2.field3326 >> 48 & 0xFFFFL)) {
                var2.method1093(0);
            }
        }
        field2548++;
        if (arg0 != 4590) {
            method867(null, -35, -125, 118, -44, null, -115);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final void method866(byte arg0) {
        class132.field3036 = new int[33];
        field2536++;
        class36.field855 = new int[33];
        class2.field27 = new int[151];
        class98.field2275 = new int[151];
        for (int var1 = 0; var1 < 33; var1++) {
            int var6 = 999;
            int var7 = 0;
            for (int var8 = 0; var8 < 34; var8++) {
                if (class20.field369.field1165[class20.field369.field1168 * var1 + var8] == 0) {
                    if (var6 == 999) {
                        var6 = var8;
                    }
                } else if (var6 != 999) {
                    var7 = var8;
                    break;
                }
            }
            class36.field855[var1] = var6;
            class132.field3036[var1] = var7 - var6;
        }
        int var2 = 5;
        if (arg0 != -77) {
            method868((byte) 50);
        }
        while (var2 < 156) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; var5 < 172; var5++) {
                if (class20.field369.field1165[class20.field369.field1168 * var2 + var5] == 0 && (var5 > 34 || var2 > 34)) {
                    if (var3 == 999) {
                        var3 = var5;
                    }
                } else if (var3 != 999) {
                    var4 = var5;
                    break;
                }
            }
            class98.field2275[var2 - 5] = var3 - 25;
            class2.field27[var2 - 5] = var4 - var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BIIII[Lqf;I)V")
    public static final void method867(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class117[] arg5, int arg6) {
        field2540++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg6 + var12 > 0 && arg6 + var12 < 103 && arg2 + var13 > 0 && arg2 + var13 < 103) {
                        arg5[var7].field2813[arg6 + var12][arg2 + var13] = class41.method326(arg5[var7].field2813[arg6 + var12][arg2 + var13], -16777217);
                    }
                }
            }
        }
        class66 var8 = new class66(arg0);
        int var9 = 0;
        if (arg3 != 12809) {
            field2541 = null;
        }
        while (var9 < 4) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class134.method1027(var8, var9, arg1, -32565, 0, arg2 + var11, arg6 + var10, arg4);
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public static void method868(byte arg0) {
        int var1 = -110 % ((-arg0 - 30) / 44);
        field2547 = null;
        field2542 = null;
        field2535 = null;
        field2543 = null;
        field2546 = null;
        field2549 = null;
        field2545 = null;
        field2541 = null;
    }
}
