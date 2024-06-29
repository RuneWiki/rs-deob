import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class80 extends class50 {

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lad;")
    public static class5 field1878 = class88.method674("welle:", -81);

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Lad;")
    public static class5 field1888 = class88.method674("Der Server wird gerade aktualisiert)3", 111);

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Z")
    public static volatile boolean field1890 = false;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field1885 = -1;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Lad;")
    private static class5 field1889 = class88.method674("Please wait)3)3)3", 38);

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
    public static int[] field1894 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lad;")
    public static class5 field1883 = field1889;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "Lad;")
    public static class5 field1896 = class88.method674("mapback", 18);

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Lad;")
    public static class5 field1897 = class88.method674("blinken3:", -94);

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "Lad;")
    public static class5 field1898 = class88.method674("Benutzen", 40);

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Lrd;")
    public static class106 field1891;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Ljava/awt/Frame;")
    public static Frame field1882;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIJ)Z", line = 4)
    public final boolean method619(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class100.field2428[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class100.field2428[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class100.field2428[arg1] = var7 | var6;
            } else {
                this.method286(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method286(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class32.field776[var8] = 12800;
                int var9 = method628(var8);
                this.method286(arg0, 7, var9 >> 7, arg3);
                this.method286(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class32.field776[var10] = (arg2 << 7) + (class32.field776[var10] & 0x7F);
                } else {
                    class32.field776[var10] = (class32.field776[var10] & 0x3F80) + arg2;
                }
                int var11 = method628(var10);
                this.method286(arg0, 7, var11 >> 7, arg3);
                this.method286(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(JI)V", line = 73)
    public final void method620(long arg0, int arg1) {
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class100.field2428[var4];
            class100.field2428[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((var11 & 0x1 << var12) != 0) {
                    this.method286(var12 + 144, var4, 0, arg0);
                }
            }
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method286(var5 + 176, 123, 0, arg0);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method286(var6 + 176, 120, 0, arg0);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method286(var7 + 176, 121, 0, arg0);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method286(var8 + 176, 0, 0, arg0);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method286(var9 + 176, 32, 0, arg0);
        }
        field1895++;
        int var10 = 0;
        if (arg1 == -21112) {
            while (var10 < 16) {
                this.method286(var10 + 192, 0, 0, arg0);
                var10++;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(JIZ)V", line = 149)
    public final void method621(long arg0, int arg1, boolean arg2) {
        class7.field271 = arg1;
        for (int var5 = 0; var5 < 16; var5++) {
            class32.field776[var5] = 12800;
        }
        int var6 = 0;
        if (!arg2) {
            this.method620(42L, 31);
        }
        while (var6 < 16) {
            int var7 = method628(var6);
            this.method286(var6 + 176, 7, var7 >> 7, arg0);
            this.method286(var6 + 176, 39, var7 & 0x7F, arg0);
            var6++;
        }
        field1887++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLad;Lad;Lrd;)Lub;", line = 181)
    public static final class122 method622(boolean arg0, class5 arg1, class5 arg2, class106 arg3) {
        field1879++;
        if (arg0) {
            return null;
        } else {
            int var4 = arg3.method870(arg1, 106);
            int var5 = arg3.method858(var4, (byte) 86, arg2);
            return class35.method269((byte) -108, var5, var4, arg3);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lad;Lad;Lrd;B)[Luc;", line = 210)
    public static final class123[] method623(class5 arg0, class5 arg1, class106 arg2, byte arg3) {
        if (arg3 >= -60) {
            field1890 = false;
        }
        field1892++;
        int var4 = arg2.method870(arg0, -128);
        int var5 = arg2.method858(var4, (byte) 111, arg1);
        return class35.method275(arg2, var5, 111, var4);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V", line = 239)
    public static final void method624(byte arg0) {
        class70.field1709.method91(1);
        field1886++;
        if (arg0 != 40) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class42.field1073[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class95.field2276[var2] = 0L;
        }
        class70.field1652 = 0;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V", line = 276)
    public static final void method625(int arg0, int arg1) {
        class27.field714 += arg0;
        while (class27.field714 >= class102.field2503) {
            class27.field714 -= class102.field2503;
            class102.field2490 -= class102.field2490 >> 2;
        }
        class102.field2490 -= arg0 * arg1;
        if (class102.field2490 < 0) {
            class102.field2490 = 0;
        }
        field1893++;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V", line = 297)
    public static void method626(byte arg0) {
        field1896 = null;
        if (arg0 <= 12) {
            return;
        }
        field1891 = null;
        field1897 = null;
        field1888 = null;
        field1894 = null;
        field1878 = null;
        field1883 = null;
        field1882 = null;
        field1889 = null;
        field1898 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIIJ)V", line = 328)
    public final void method627(int arg0, int arg1, int arg2, long arg3) {
        int var6 = (int) (Math.pow(0.1D, (double) arg2 * 5.0E-4D) * (double) arg0 + 0.5D);
        if (class7.field271 != var6) {
            class7.field271 = var6;
            for (int var7 = 0; var7 < 16; var7++) {
                int var8 = method628(var7);
                this.method286(var7 + 176, 7, var8 >> 7, arg3);
                this.method286(var7 + 176, 39, var8 & 0x7F, arg3);
            }
        }
        if (arg1 <= -86) {
            field1880++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)I", line = 376)
    private static final int method628(int arg0) {
        int var1 = class32.field776[arg0];
        int var2 = (class7.field271 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(IIIJ)V")
    public abstract void method286(int arg0, int arg1, int arg2, long arg3);
}
