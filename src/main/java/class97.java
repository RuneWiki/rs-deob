import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class97 extends class256 {

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "[J")
    private long[] field1758 = new long[10];

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    private int field1759 = 256;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    private int field1752 = 1;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    private int field1763 = 0;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "J")
    private long field1754 = class28.method200(98);

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1753 = -1;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "[Z")
    public static boolean[] field1756 = new boolean[5];

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "[Ljd;")
    public static class85[] field1761 = new class85[1000];

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "[I")
    public static int[] field1760 = new int[128];

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    private int field1748;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "Lge;")
    public static class68 field1762;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "[I")
    public static int[] field1757;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "[Lc;")
    public static class103[] field1751;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public final void method202(int arg0) {
        if (arg0 != 103) {
            field1760 = null;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1758[var2] = 0L;
        }
        field1764++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static final void method688(byte arg0) {
        int var1 = 96 % ((43 - arg0) / 52);
        field1755++;
        int var2 = class106.field1879;
        int var3 = class90.field1668;
        int var4 = class20.field292 - class154.field2664 - var3;
        int var5 = class95.field1744 - class154.field2662 - var2;
        if (var3 <= 0 && var4 <= 0 && var2 <= 0 && var5 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class207.field3620 != null) {
                var6 = class207.field3620;
            } else if (class167.field2882 == null) {
                var6 = class107.field1882.field1478;
            } else {
                var6 = class167.field2882;
            }
            int var7 = 0;
            int var8 = 0;
            if (class167.field2882 == var6) {
                Insets var9 = class167.field2882.getInsets();
                var7 = var9.top;
                var8 = var9.left;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var3 > 0) {
                var10.fillRect(var8, var7, var3, class95.field1744);
            }
            if (var2 > 0) {
                var10.fillRect(var8, var7, class20.field292, var2);
            }
            if (var4 > 0) {
                var10.fillRect(class20.field292 + var8 - var4, var7, var4, class95.field1744);
            }
            if (var5 > 0) {
                var10.fillRect(var8, var7 + class95.field1744 - var5, class20.field292, var5);
                return;
            }
        } catch (Exception var11) {
            return;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)I")
    public final int method203(byte arg0, int arg1, int arg2) {
        int var4 = this.field1759;
        this.field1759 = 300;
        field1749++;
        int var5 = this.field1752;
        this.field1752 = 1;
        this.field1754 = class28.method200(126);
        if (this.field1758[this.field1748] == 0L) {
            this.field1752 = var5;
            this.field1759 = var4;
        } else if (this.field1754 > this.field1758[this.field1748]) {
            this.field1759 = (int) ((long) (arg1 * 2560) / (this.field1754 - this.field1758[this.field1748]));
        }
        if (this.field1759 < 25) {
            this.field1759 = 25;
        }
        if (arg0 != -41) {
            field1762 = null;
        }
        if (this.field1759 > 256) {
            this.field1759 = 256;
            this.field1752 = (int) ((long) arg1 - ((this.field1754 - this.field1758[this.field1748]) / 10L));
        }
        if (this.field1752 > arg1) {
            this.field1752 = arg1;
        }
        this.field1758[this.field1748] = this.field1754;
        this.field1748 = (this.field1748 + 1) % 10;
        if (this.field1752 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1758[var6] != 0L) {
                    this.field1758[var6] -= -((long) this.field1752);
                }
            }
        }
        if (arg2 > this.field1752) {
            this.field1752 = arg2;
        }
        int var7 = 0;
        class190.method1311((long) this.field1752, arg0 ^ 0xFFFFFFD6);
        while (this.field1763 < 256) {
            this.field1763 += this.field1759;
            var7++;
        }
        this.field1763 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public static void method689(int arg0) {
        if (arg0 != 1) {
            field1761 = null;
        }
        field1757 = null;
        field1762 = null;
        field1761 = null;
        field1751 = null;
        field1760 = null;
        field1756 = null;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class97() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1758[var1] = this.field1754;
        }
    }
}
