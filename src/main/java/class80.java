import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class80 extends class108 {

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    private int field1825;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "[[I")
    public int[][] field1832;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "[I")
    public int[] field1831;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "[I")
    public static int[] field1824 = new int[256];

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "Lgd;")
    public static class40 field1837;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "Lgd;")
    private static class40 field1834;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "Lgd;")
    private static class40 field1839;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "Lgd;")
    public static class40 field1840;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "Lgd;")
    public static class40 field1835;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "Lgd;")
    public static class40 field1836;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "Lw;")
    public static class135 field1826;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1824[var0] = var1;
        }
        field1837 = class14.method90(false, "Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");
        field1834 = class14.method90(false, "Loading textures )2 ");
        field1839 = class14.method90(false, "Off");
        field1840 = field1834;
        field1835 = class14.method90(false, "Stufe)2");
        field1841 = 0;
        field1836 = field1839;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Lvc;", line = 10)
    public static final class128 method533(byte arg0, int arg1) {
        field1827++;
        class128 var2 = (class128) class115.field2775.method39(-108, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class99.field2364.method731(arg1, 9, (byte) -110);
        class128 var4 = new class128();
        var4.field3028 = arg1;
        if (var3 != null) {
            var4.method1006(106, new class104(var3));
        }
        var4.method1013(-120);
        class115.field2775.method38(var4, (long) arg1, true);
        return arg0 == 118 ? var4 : null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZILhd;)V", line = 41)
    public static final void method534(int arg0, boolean arg1, int arg2, class46 arg3) {
        field1829++;
        if (arg3 == null) {
            return;
        }
        int var4 = class2.field43 + class42.field1041 & 0x7FF;
        int var5 = arg0 * arg0 + arg2 * arg2;
        if (var5 > 6400) {
            return;
        }
        int var6 = class97.field2299[var4];
        int var7 = class97.field2284[var4];
        int var8 = var6 * 256 / (class63.field1541 + 256);
        int var9 = var7 * 256 / (class63.field1541 + 256);
        int var10 = arg0 * var8 + arg2 * var9 >> 16;
        int var11 = arg0 * var9 - arg2 * var8 >> 16;
        if (var5 <= 2500) {
            arg3.method342(var10 + 98 - arg3.field1165 / 2, -var11 + 83 + -(arg3.field1168 / 2) + -4);
        } else {
            arg3.method327(class91.field2083, var10 + 98 - arg3.field1165 / 2, 83 - (arg3.field1168 / 2 + var11) + -4);
        }
        if (!arg1) {
            field1841 = 15;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lw;BI)V", line = 78)
    public static final void method535(class135 arg0, byte arg1, int arg2) {
        field1833++;
        if (class29.field617 == null) {
            int var4 = 102 % ((9 - arg1) / 54);
            method536(255, 0, (byte) 108, null, true, 255, (byte) 0);
            class106.field2586[arg2] = arg0;
        } else {
            class29.field617.field2563 = arg2 * 4 + 5;
            int var3 = class29.field617.method774(-29404);
            arg0.method1056(-117, var3);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBLw;ZIB)V", line = 98)
    public static final void method536(int arg0, int arg1, byte arg2, class135 arg3, boolean arg4, int arg5, byte arg6) {
        field1830++;
        long var7 = (long) ((arg5 << 16) + arg0);
        class85 var9 = (class85) class35.field898.method142(var7, 23056);
        if (var9 != null) {
            return;
        }
        class85 var10 = (class85) class38.field939.method142(var7, 23056);
        if (var10 != null) {
            return;
        }
        class85 var11 = (class85) class128.field3027.method142(var7, 23056);
        if (arg2 < 84) {
            return;
        }
        if (var11 == null) {
            if (!arg4) {
                class85 var12 = (class85) class35.field899.method142(var7, 23056);
                if (var12 != null) {
                    return;
                }
            }
            class85 var13 = new class85();
            var13.field1901 = arg3;
            var13.field1892 = arg6;
            var13.field1908 = arg1;
            if (arg4) {
                class35.field898.method144(var13, var7, 17348);
                class61.field1516++;
            } else {
                class91.field2054.method510(var13, (byte) -106);
                class128.field3027.method144(var13, var7, 17348);
                class104.field2506++;
            }
        } else if (arg4) {
            var11.method482(-123);
            class35.field898.method144(var11, var7, 17348);
            class104.field2506--;
            class61.field1516++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V", line = 189)
    public static void method537(int arg0) {
        field1834 = null;
        if (arg0 < 20) {
            field1838 = 114;
        }
        field1836 = null;
        field1839 = null;
        field1840 = null;
        field1837 = null;
        field1835 = null;
        field1826 = null;
        field1824 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I[B)V", line = 252)
    public class80(int arg0, byte[] arg1) {
        this.field1828 = arg0;
        class104 var3 = new class104(arg1);
        this.field1825 = var3.method798((byte) -65);
        this.field1832 = new int[this.field1825][];
        this.field1831 = new int[this.field1825];
        for (int var4 = 0; var4 < this.field1825; var4++) {
            this.field1831[var4] = var3.method798((byte) -103);
        }
        for (int var5 = 0; var5 < this.field1825; var5++) {
            this.field1832[var5] = new int[var3.method798((byte) -52)];
        }
        for (int var6 = 0; var6 < this.field1825; var6++) {
            for (int var7 = 0; var7 < this.field1832[var6].length; var7++) {
                this.field1832[var6][var7] = var3.method798((byte) -54);
            }
        }
    }
}
