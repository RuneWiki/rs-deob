import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class76 extends class44 {

    @OriginalMember(owner = "client!md", name = "Jb", descriptor = "I")
    private int field1901 = 0;

    @OriginalMember(owner = "client!md", name = "ub", descriptor = "La;")
    public static class1 field1886 = class113.method934(-11538, "Welt");

    @OriginalMember(owner = "client!md", name = "sb", descriptor = "I")
    public static int field1884 = -1;

    @OriginalMember(owner = "client!md", name = "Ab", descriptor = "La;")
    private static class1 field1892 = class113.method934(-11538, "flash2:");

    @OriginalMember(owner = "client!md", name = "wb", descriptor = "La;")
    public static class1 field1888 = field1892;

    @OriginalMember(owner = "client!md", name = "Nb", descriptor = "La;")
    private static class1 field1905 = class113.method934(-11538, " million");

    @OriginalMember(owner = "client!md", name = "Hb", descriptor = "La;")
    public static class1 field1899 = field1905;

    @OriginalMember(owner = "client!md", name = "tb", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!md", name = "vb", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!md", name = "yb", descriptor = "I")
    public int field1890;

    @OriginalMember(owner = "client!md", name = "zb", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!md", name = "Cb", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!md", name = "Db", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!md", name = "Eb", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!md", name = "Fb", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!md", name = "Gb", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!md", name = "Ib", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!md", name = "Kb", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!md", name = "Lb", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!md", name = "Ob", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!md", name = "Mb", descriptor = "Lbd;")
    public static class11 field1904;

    @OriginalMember(owner = "client!md", name = "Bb", descriptor = "Lu;")
    public static class120 field1893;

    @OriginalMember(owner = "client!md", name = "xb", descriptor = "[Ljd;")
    public static class58[] field1889;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)V", line = 3)
    private final void method702(int arg0, byte arg1) {
        field1906++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var7) {
            var9 = var7;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        double var11 = var3;
        if (var3 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        if (var11 < var5) {
            var11 = var5;
        }
        double var15 = (var9 + var11) / 2.0D;
        this.field1885 = (int) (var15 * 256.0D);
        double var17 = 0.0D;
        if (var9 != var11) {
            if (var15 < 0.5D) {
                var17 = (var11 - var9) / (var9 + var11);
            }
            if (var15 >= 0.5D) {
                var17 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (-var9 + var11) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        if (arg1 != -18) {
            field1889 = null;
        }
        if (this.field1885 < 0) {
            this.field1885 = 0;
        } else if (this.field1885 > 255) {
            this.field1885 = 255;
        }
        if (var15 > 0.5D) {
            this.field1890 = (int) ((1.0D - var15) * var17 * 512.0D);
        } else {
            this.field1890 = (int) (var15 * var17 * 512.0D);
        }
        this.field1896 = (int) (var17 * 256.0D);
        if (this.field1890 < 1) {
            this.field1890 = 1;
        }
        this.field1887 = (int) ((double) this.field1890 * var19);
        if (this.field1896 < 0) {
            this.field1896 = 0;
        } else if (this.field1896 > 255) {
            this.field1896 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BIII)I", line = 107)
    public static final int method703(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = 114 % ((arg0 + 28) / 59);
        field1894++;
        int var5 = 256 - arg3;
        return ((arg1 & 0xFF00FF) * var5 + (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg1 & 0xFF00) * var5 + (arg2 & 0xFF00) * arg3 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)V", line = 151)
    public final void method704(boolean arg0) {
        field1897++;
        this.method702(this.field1901, (byte) -18);
        if (!arg0) {
            field1905 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lbd;B)V", line = 166)
    public static final void method705(class11 arg0, byte arg1) {
        field1902++;
        if (arg1 == 85) {
            class80.field2027 = arg0;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(JB)V", line = 184)
    public static final void method706(long arg0, byte arg1) {
        field1891++;
        if (arg0 == 0L) {
            return;
        }
        if (class59.field1495 >= 100 && class89.field2192 != 1 || class59.field1495 >= 200) {
            class89.method761(94, 0, class117.field2934, class132.field3237);
            return;
        }
        if (arg1 >= -2) {
            field1893 = null;
        }
        class1 var3 = class118.method972(-23, arg0).method36(-4305);
        for (int var4 = 0; var4 < class59.field1495; var4++) {
            if (class117.field2932[var4] == arg0) {
                class89.method761(62, 0, class116.method959(-124, new class1[] { var3, class122.field3048 }), class132.field3237);
                return;
            }
        }
        for (int var5 = 0; var5 < class85.field2149; var5++) {
            if (class106.field2686[var5] == arg0) {
                class89.method761(126, 0, class116.method959(75, new class1[] { class89.field2181, var3, class81.field2057 }), class132.field3237);
                return;
            }
        }
        if (var3.method5(class104.field2624.field87, 122)) {
            return;
        }
        class119.field2954[class59.field1495] = var3;
        class117.field2932[class59.field1495] = arg0;
        class73.field1791[class59.field1495] = 0;
        class59.field1495++;
        class5.field191++;
        class39.field1056 = true;
        class70.field1729.method416(11453, 114);
        class70.field1729.method158(arg0, false);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BILba;)V", line = 250)
    public final void method707(byte arg0, int arg1, class8 arg2) {
        while (true) {
            int var4 = arg2.method145(false);
            if (var4 == 0) {
                field1895++;
                if (arg0 < 125) {
                    field1893 = null;
                    return;
                }
                return;
            }
            this.method709((byte) -121, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I", line = 271)
    public static int method708(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BILba;I)V", line = 282)
    private final void method709(byte arg0, int arg1, class8 arg2, int arg3) {
        if (arg0 != -121) {
            method710(73);
        }
        field1900++;
        if (arg1 == 1) {
            this.field1901 = arg2.method165(true);
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V", line = 313)
    public static void method710(int arg0) {
        field1905 = null;
        if (arg0 != 0) {
            return;
        }
        field1888 = null;
        field1889 = null;
        field1886 = null;
        field1904 = null;
        field1899 = null;
        field1892 = null;
        field1893 = null;
    }
}
