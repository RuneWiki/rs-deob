import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class125 {

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lva;")
    private static class121 field2851 = class107.method797("glow3:", -10983);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lva;")
    public static class121 field2846 = field2851;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lva;")
    private static class121 field2843 = class107.method797("Off", -10983);

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field2849 = 0;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lva;")
    public static class121 field2854 = field2843;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Z")
    public static boolean field2855 = false;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lva;")
    private static class121 field2842 = class107.method797("Existing user", -10983);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lva;")
    public static class121 field2848 = field2842;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lw;")
    public static class125 field2845;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lbe;")
    public static class12 field2844;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field2840;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "[I")
    public int[] field2847;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Ld;", line = 5)
    public static final class19 method979(int arg0, int arg1) {
        field2850++;
        int var2 = arg0 >> 16;
        int var3 = arg1 & arg0;
        if (class126.field2872[var2] == null || class126.field2872[var2][var3] == null) {
            boolean var4 = class28.method221(var2, 14585);
            if (!var4) {
                return null;
            }
        }
        return class126.field2872[var2][var3];
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 29)
    public static void method980(boolean arg0) {
        field2854 = null;
        field2851 = null;
        field2842 = null;
        field2845 = null;
        if (arg0) {
            method981(117, -2L);
        }
        field2846 = null;
        field2848 = null;
        field2843 = null;
        field2844 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IJ)V", line = 49)
    public static final void method981(int arg0, long arg1) {
        field2837++;
        if (arg0 != 22793) {
            method983(-72);
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class97.field2169; var3++) {
            if (class69.field1650[var3] == arg1) {
                class97.field2169--;
                class97.field2168 = true;
                class60.field1420++;
                for (int var4 = var3; var4 < class97.field2169; var4++) {
                    class69.field1650[var4] = class69.field1650[var4 + 1];
                }
                class60.field1437.method622(87, true);
                class60.field1437.method835(false, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V", line = 130)
    public static final void method982(int arg0, int arg1) {
        field2839++;
        class53.method378((byte) -99, arg1);
        if (arg0 > -42) {
            field2849 = 111;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 140)
    protected class125() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 145)
    public static final void method983(int arg0) {
        if (arg0 != 17696) {
            return;
        }
        field2838++;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class53.field1237[(var1 - 2 << 7) + var2] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 128.0D) + 128;
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (var14 << 7) + var15;
            class53.field1237[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = (var4 << 7) + var12;
                class50.field1189[var13] = (class53.field1237[var13 - 1] + class53.field1237[var13 + 1] + class53.field1237[var13 - 128] + class53.field1237[var13 + 128]) / 4;
            }
        }
        class42.field964 += 128;
        if (class42.field964 > class78.field1828.length) {
            int var5 = (int) (Math.random() * 12.0D);
            class42.field964 -= class78.field1828.length;
            class69.method488(class44.field1012[var5], arg0 ^ 0xFFFFBAA6);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = var9 + (var6 << 7);
                int var11 = class50.field1189[var10 + 128] - class78.field1828[class78.field1828.length - 1 & var10 - -class42.field964] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class53.field1237[var10] = var11;
            }
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class47.field1131[var7] = class47.field1131[var7 + 1];
        }
        class47.field1131[var1 - 1] = (int) (Math.sin((double) class115.field2614 / 14.0D) * 16.0D + Math.sin((double) class115.field2614 / 15.0D) * 14.0D + Math.sin((double) class115.field2614 / 16.0D) * 12.0D);
        if (class101.field2262 > 0) {
            class101.field2262 -= 4;
        }
        if (class12.field207 > 0) {
            class12.field207 -= 4;
        }
        if (class101.field2262 != 0 || class12.field207 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 1) {
            class12.field207 = 1024;
        }
        if (var8 == 0) {
            class101.field2262 = 1024;
            return;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 293)
    public final void method984(int arg0) {
        field2852++;
        if (arg0 == -1) {
            class55.method399(this.field2847, this.field2841, this.field2853);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
    public abstract void method195(Component arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method196(int arg0, int arg1, int arg2, Graphics arg3);
}
