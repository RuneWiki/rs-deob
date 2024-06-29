import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class107 {

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public int field1808;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lvm;")
    public static class202 field1806 = new class202(30);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lph;")
    public static class229 field1810 = class266.method1858("Objet d(Wabonn-Bs", 0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lph;")
    public static class229 field1813 = class266.method1858("(U", 0);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    public static int[] field1817 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lph;")
    private static class229 field1814 = class266.method1858("glow3:", 0);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field1815 = -1;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lph;")
    public static class229 field1812 = field1814;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lph;")
    public static class229 field1811 = class266.method1858("scape main", 0);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lph;")
    public static class229 field1816 = field1814;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field1801;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public int field1805;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lcd;")
    public class39 field1794;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    public int[] field1793;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[I")
    public int[] field1795;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
    public int[] field1797;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "[I")
    public int[] field1799;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "[I")
    public int[] field1800;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "[I")
    public int[] field1807;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[Lcd;")
    public class39[] field1796;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "[[I")
    public int[][] field1804;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "[[I")
    public int[][] field1809;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIBII)I", line = 13)
    public static final int method805(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1803++;
        int var7 = arg0 & 0x3;
        if (arg4 <= 110) {
            method805(73, -21, 122, 103, (byte) 76, -70, 1);
        }
        if ((arg2 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 8 - arg5 - arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg3 - arg1;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[B)V", line = 50)
    private final void method806(int arg0, byte[] arg1) {
        class164 var3 = new class164(class306.method2065(0, arg1));
        field1791++;
        int var4 = var3.method1178(arg0 ^ 0xFFFFFBF2);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        } else if (arg0 == -1030) {
            if (var4 >= 6) {
                this.field1805 = var3.method1191(arg0 + 32806);
            } else {
                this.field1805 = 0;
            }
            int var5 = var3.method1178(8);
            this.field1801 = var3.method1161(true);
            this.field1797 = new int[this.field1801];
            int var6 = 0;
            int var7 = -1;
            for (int var8 = 0; var8 < this.field1801; var8++) {
                this.field1797[var8] = var6 += var3.method1161(true);
                if (var7 < this.field1797[var8]) {
                    var7 = this.field1797[var8];
                }
            }
            this.field1792 = var7 + 1;
            this.field1807 = new int[this.field1792];
            this.field1800 = new int[this.field1792];
            this.field1804 = new int[this.field1792][];
            this.field1795 = new int[this.field1792];
            this.field1793 = new int[this.field1792];
            if (var5 != 0) {
                this.field1799 = new int[this.field1792];
                for (int var9 = 0; var9 < this.field1792; var9++) {
                    this.field1799[var9] = -1;
                }
                for (int var10 = 0; var10 < this.field1801; var10++) {
                    this.field1799[this.field1797[var10]] = var3.method1191(31776);
                }
                this.field1794 = new class39(this.field1799);
            }
            for (int var11 = 0; var11 < this.field1801; var11++) {
                this.field1807[this.field1797[var11]] = var3.method1191(31776);
            }
            for (int var12 = 0; var12 < this.field1801; var12++) {
                this.field1800[this.field1797[var12]] = var3.method1191(31776);
            }
            for (int var13 = 0; var13 < this.field1801; var13++) {
                this.field1795[this.field1797[var13]] = var3.method1161(true);
            }
            for (int var14 = 0; var14 < this.field1801; var14++) {
                int var15 = 0;
                int var16 = this.field1797[var14];
                int var17 = this.field1795[var16];
                this.field1804[var16] = new int[var17];
                int var18 = -1;
                for (int var19 = 0; var19 < var17; var19++) {
                    int var20 = this.field1804[var16][var19] = var15 += var3.method1161(true);
                    if (var18 < var20) {
                        var18 = var20;
                    }
                }
                this.field1793[var16] = var18 + 1;
                if ((var18 + 1) == var17) {
                    this.field1804[var16] = null;
                }
            }
            if (var5 != 0) {
                this.field1809 = new int[var7 + 1][];
                this.field1796 = new class39[var7 + 1];
                for (int var21 = 0; var21 < this.field1801; var21++) {
                    int var22 = this.field1797[var21];
                    int var23 = this.field1795[var22];
                    this.field1809[var22] = new int[this.field1793[var22]];
                    for (int var24 = 0; var24 < this.field1793[var22]; var24++) {
                        this.field1809[var22][var24] = -1;
                    }
                    for (int var25 = 0; var25 < var23; var25++) {
                        int var26;
                        if (this.field1804[var22] == null) {
                            var26 = var25;
                        } else {
                            var26 = this.field1804[var22][var25];
                        }
                        this.field1809[var22][var26] = var3.method1191(class101.method775(arg0, -30758));
                    }
                    this.field1796[var22] = new class39(this.field1809[var22]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(DI)V", line = 225)
    public static final void method807(double arg0, int arg1) {
        field1798++;
        int var3 = -22 % ((71 - arg1) / 55);
        if (class65.field998 == arg0) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
            class245.field4052[var4] = var5 <= 255 ? var5 : 255;
        }
        class65.field998 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 265)
    public static final void method808(int arg0) {
        class105.field1786.method1414(123);
        field1802++;
        int var1 = 21 % ((17 - arg0) / 58);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([BI)V", line = 280)
    public class107(byte[] arg0, int arg1) {
        this.field1808 = class198.method1390(arg0, arg0.length, 0);
        if (this.field1808 != arg1) {
            throw new RuntimeException();
        }
        this.method806(-1030, arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 318)
    public static void method809(byte arg0) {
        field1813 = null;
        if (arg0 > -6) {
            method809((byte) -16);
        }
        field1812 = null;
        field1810 = null;
        field1806 = null;
        field1814 = null;
        field1816 = null;
        field1817 = null;
        field1811 = null;
    }
}
