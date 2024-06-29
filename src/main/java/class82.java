import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class82 {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Leh;")
    private static class47 field1761 = class195.method1282((byte) -4, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Leh;")
    public static class47 field1763 = field1761;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1762 = 0;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Leh;")
    public static class47 field1767 = class195.method1282((byte) -4, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/awt/Font;")
    public static Font field1756;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "[I")
    public static int[] field1759;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method691(int arg0) {
        field1759 = null;
        if (arg0 != 27768) {
            field1766 = 98;
        }
        field1756 = null;
        field1763 = null;
        field1767 = null;
        field1761 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static final void method692(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1760++;
        Object var1 = class40.field803;
        synchronized (class40.field803) {
            if (class51.field988 == 0) {
                class142.field2782.method1052(2, 5, new class185());
            }
            class51.field988 = 600;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILgf;IIIII)V")
    public static final void method693(int arg0, int arg1, class61 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class142.field2790) {
            class74.field1627 = 32;
        } else {
            class74.field1627 = 0;
        }
        field1757++;
        class142.field2790 = false;
        if (~class156.field3054 != arg3) {
            if (arg6 <= arg1 && arg1 < arg6 + 16 && arg7 >= arg5 && arg7 < arg5 + 16) {
                arg2.field1250 -= 4;
                class20.method204(arg2, (byte) -5);
            } else if (arg6 <= arg1 && arg1 < arg6 + 16 && arg5 + arg4 - 16 <= arg7 && arg7 < arg5 + arg4) {
                arg2.field1250 += 4;
                class20.method204(arg2, (byte) -5);
            } else if (arg1 >= arg6 - class74.field1627 && arg1 < class74.field1627 + arg6 + 16 && arg5 + 16 <= arg7 && arg5 + arg4 - 16 > arg7) {
                int var8 = (arg4 - 32) * arg4 / arg0;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - arg5 - var8 / 2 - 16;
                int var10 = arg4 - var8 - 32;
                arg2.field1250 = (arg0 - arg4) * var9 / var10;
                class20.method204(arg2, (byte) -5);
                class142.field2790 = true;
            }
        }
        if (class117.field2372 == 0) {
            return;
        }
        int var11 = arg2.field1187;
        if (arg6 - var11 <= arg1 && arg5 <= arg7 && arg6 + 16 > arg1 && arg7 <= arg4 + arg5) {
            arg2.field1250 += class117.field2372 * 45;
            class20.method204(arg2, (byte) -5);
            return;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z[B)V")
    public static final void method694(boolean arg0, byte[] arg1) {
        field1764++;
        class68 var2 = new class68(arg1);
        var2.field1454 = arg1.length - 2;
        class98.field2085 = var2.method569(26496);
        class69.field1511 = new byte[class98.field2085][];
        class109.field2270 = new int[class98.field2085];
        class69.field1516 = new int[class98.field2085];
        class198.field3850 = new int[class98.field2085];
        class96.field1979 = new int[class98.field2085];
        var2.field1454 = arg1.length - class98.field2085 * 8 - 7;
        class197.field3834 = var2.method569(26496);
        class132.field2604 = var2.method569(26496);
        int var3 = (var2.method604((byte) -125) & 0xFF) + 1;
        for (int var4 = 0; var4 < class98.field2085; var4++) {
            class69.field1516[var4] = var2.method569(26496);
        }
        if (!arg0) {
            field1758 = -96;
        }
        for (int var5 = 0; var5 < class98.field2085; var5++) {
            class198.field3850[var5] = var2.method569(26496);
        }
        for (int var6 = 0; var6 < class98.field2085; var6++) {
            class96.field1979[var6] = var2.method569(26496);
        }
        for (int var7 = 0; var7 < class98.field2085; var7++) {
            class109.field2270[var7] = var2.method569(26496);
        }
        var2.field1454 = arg1.length + 3 - var3 * 3 - class98.field2085 * 8 - 7;
        class64.field1390 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class64.field1390[var8] = var2.method613(arg0);
            if (class64.field1390[var8] == 0) {
                class64.field1390[var8] = 1;
            }
        }
        var2.field1454 = 0;
        for (int var9 = 0; var9 < class98.field2085; var9++) {
            int var10 = class96.field1979[var9];
            int var11 = class109.field2270[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class69.field1511[var9] = var13;
            int var14 = var2.method604((byte) -43);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method567(-1);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method567(-1);
                    }
                }
            }
        }
    }
}
