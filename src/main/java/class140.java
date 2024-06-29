import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class140 extends class59 {

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "[B")
    public byte[] field2152;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field2148 = 0;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Lok;")
    public static class41 field2146 = class137.method956("", 45);

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Lda;")
    public static class212 field2149 = new class212();

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "[I")
    public static int[] field2159 = new int[1000];

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "[I")
    public static int[] field2160 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Lok;")
    public static class41 field2158 = class137.method956("Stufe: ", 45);

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public static int field2163 = 0;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "Lok;")
    private static class41 field2157 = class137.method956("Loaded sprites", 45);

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "Lok;")
    public static class41 field2162 = field2157;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "Ldk;")
    public static class253 field2165;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "[Lmg;")
    public static class314[] field2164;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V", line = 10)
    public static final void method978(byte arg0) {
        class8.field101 &= 0x7FF;
        field2156++;
        int var1 = class79.field1167 >> 7;
        if (class286.field4658 < 128) {
            class286.field4658 = 128;
        }
        if (class286.field4658 > 383) {
            class286.field4658 = 383;
        }
        int var2 = class272.field4420 >> 7;
        int var3 = method983((byte) 86, class55.field807, class79.field1167, class272.field4420);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class55.field807;
                    if (var7 < 3 && (class126.field1879[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class278.field4548[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (arg0 > -24) {
            return;
        }
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class288.field4680 < var9) {
            class288.field4680 += (var9 - class288.field4680) / 24;
        } else if (class288.field4680 > var9) {
            class288.field4680 += (var9 - class288.field4680) / 80;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V", line = 93)
    public static void method979(int arg0) {
        field2146 = null;
        field2159 = null;
        if (arg0 < 88) {
            return;
        }
        field2162 = null;
        field2160 = null;
        field2149 = null;
        field2164 = null;
        field2165 = null;
        field2158 = null;
        field2157 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lmh;B)I", line = 111)
    public static final int method980(class65 arg0, byte arg1) {
        field2154++;
        int var2 = 0;
        if (arg0.method463(1, class111.field1580)) {
            var2++;
        }
        if (arg0.method463(1, class308.field5187)) {
            var2++;
        }
        if (arg0.method463(1, class86.field1269)) {
            var2++;
        }
        if (arg0.method463(1, class80.field1179)) {
            var2++;
        }
        if (arg0.method463(1, class38.field593)) {
            var2++;
        }
        if (arg0.method463(1, class164.field2588)) {
            var2++;
        }
        if (arg0.method463(1, class235.field3777)) {
            var2++;
        }
        if (arg0.method463(1, class304.field5067)) {
            var2++;
        }
        if (arg0.method463(1, class109.field1535)) {
            var2++;
        }
        if (arg0.method463(1, class249.field3968)) {
            var2++;
        }
        if (arg0.method463(1, class171.field2761)) {
            var2++;
        }
        if (arg0.method463(1, class93.field1373)) {
            var2++;
        }
        if (arg1 > -64) {
            field2161 = 88;
        }
        if (arg0.method463(1, class226.field3615)) {
            var2++;
        }
        if (arg0.method463(1, class89.field1309)) {
            var2++;
        }
        if (arg0.method463(1, class301.field4886)) {
            var2++;
        }
        if (arg0.method463(1, class81.field1202)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)V", line = 182)
    public static final void method981(byte arg0, int arg1) {
        if (class252.field4015 == null) {
            class252.field4015 = new byte[4][104][104];
        }
        for (int var2 = arg1; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class252.field4015[var2][var3][var4] = arg0;
                }
            }
        }
        field2147++;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V", line = 218)
    public class140(byte[] arg0) {
        this.field2152 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZLjava/awt/Color;Lok;)V", line = 229)
    public static final void method982(int arg0, int arg1, boolean arg2, Color arg3, class41 arg4) {
        try {
            Graphics var5 = class283.field4602.getGraphics();
            if (class110.field1556 == null) {
                class110.field1556 = new Font("Helvetica", 1, 13);
                class169.field2684 = class283.field4602.getFontMetrics(class110.field1556);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class188.field3055, class14.field182);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class255.field4099 == null) {
                    class255.field4099 = class283.field4602.createImage(304, 34);
                }
                Graphics var6 = class255.field4099.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                if (arg1 <= 116) {
                    method983((byte) 19, 20, 76, -17);
                }
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class110.field1556);
                var6.setColor(Color.white);
                arg4.method282(var6, 0, (304 - arg4.method269(false, class169.field2684)) / 2, 22);
                var5.drawImage(class255.field4099, class188.field3055 / 2 - 152, class14.field182 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class14.field182 / 2 - 18;
                int var9 = class188.field3055 / 2 - 152;
                var5.setColor(arg3);
                var5.drawRect(var9, var8, 303, 33);
                var5.fillRect(var9 + 2, var8 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var8 - -1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var5.setFont(class110.field1556);
                var5.setColor(Color.white);
                arg4.method282(var5, 0, var9 + (304 - arg4.method269(false, class169.field2684)) / 2, var8 + 22);
            }
            if (class195.field3150 != null) {
                var5.setFont(class110.field1556);
                var5.setColor(Color.white);
                class195.field3150.method282(var5, 0, class188.field3055 / 2 - class195.field3150.method269(false, class169.field2684) / 2, class14.field182 / 2 + -26);
            }
        } catch (Exception var12) {
            class283.field4602.repaint();
        }
        field2153++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIII)I", line = 308)
    public static final int method983(byte arg0, int arg1, int arg2, int arg3) {
        field2151++;
        if (class278.field4548 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class126.field1879[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var7 = arg3 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = 96 / ((-arg0 - 16) / 62);
        int var10 = (128 - var8) * class278.field4548[var6][var4][var5 + 1] + (class278.field4548[var6][var4 + 1][var5 + 1] * var8) >> 7;
        int var11 = (128 - var8) * class278.field4548[var6][var4][var5] + (class278.field4548[var6][var4 + 1][var5] * var8) >> 7;
        return (128 - var7) * var11 + var7 * var10 >> 7;
    }
}
