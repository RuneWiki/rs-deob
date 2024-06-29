import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class91 extends class202 {

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "Z")
    public boolean field1798 = true;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Loh;")
    public static class263 field1800 = class253.method1681(-120, "<)4col>");

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field1806 = 0;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "Lw;")
    public static class141 field1802;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "[I")
    private int[] field1795;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "[I")
    public int[] field1808;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "[Loh;")
    private class263[] field1805;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "[[I")
    private int[][] field1791;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lsi;I[I)V")
    public final void method636(class194 arg0, int arg1, int[] arg2) {
        if (arg1 != -1) {
            this.field1808 = null;
        }
        field1789++;
        if (this.field1795 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1795.length; var4++) {
            if (arg2.length <= var4) {
                return;
            }
            int var5 = class248.field4341[this.method642(var4, -1)];
            if (var5 > 0) {
                arg0.method1316((long) arg2[var4], 0, var5);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BII)I")
    public final int method637(byte arg0, int arg1, int arg2) {
        field1804++;
        if (this.field1795 == null || arg2 < 0 || arg2 > this.field1795.length) {
            return -1;
        } else if (this.field1791[arg2] == null || arg1 < 0 || arg1 > this.field1791[arg2].length) {
            return -1;
        } else {
            if (arg0 != -14) {
                this.method639(-120, (class194) null);
            }
            return this.field1791[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)Loh;")
    public final class263 method638(byte arg0) {
        field1796++;
        class263 var2 = class7.method46(80, 1);
        if (this.field1805 == null) {
            return class102.field1945;
        }
        var2.method1760(true, this.field1805[0]);
        if (arg0 >= 0) {
            return null;
        }
        for (int var3 = 1; var3 < this.field1805.length; var3++) {
            var2.method1760(true, class254.field4415);
            var2.method1760(true, this.field1805[var3]);
        }
        return var2.method1782(78);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(ILsi;)Loh;")
    public final class263 method639(int arg0, class194 arg1) {
        if (arg0 != -27737) {
            return null;
        }
        class263 var3 = class7.method46(80, 1);
        if (this.field1795 != null) {
            for (int var4 = 0; var4 < this.field1795.length; var4++) {
                var3.method1760(true, this.field1805[var4]);
                var3.method1760(true, class48.method310(this.field1791[var4], arg1.method1308(arg0 + 27861, class257.field4473[this.field1795[var4]]), -30953, this.field1795[var4]));
            }
        }
        var3.method1760(true, this.field1805[this.field1805.length - 1]);
        field1799++;
        return var3.method1782(arg0 + 27855);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)I")
    public final int method640(int arg0) {
        field1794++;
        if (this.field1795 == null) {
            return 0;
        } else if (arg0 == -381) {
            return this.field1795.length;
        } else {
            return 51;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)Z")
    public static final boolean method641(byte arg0) {
        field1801++;
        try {
            if (class177.field3242 == 2) {
                if (class29.field731 == null) {
                    class29.field731 = class155.method1018(class71.field1431, class119.field2219, class84.field1667);
                    if (class29.field731 == null) {
                        return false;
                    }
                }
                if (class107.field2031 == null) {
                    class107.field2031 = new class238(class146.field2671, class145.field2657);
                }
                if (class63.field1275.method1178(22050, class29.field731, class205.field3729, -1, class107.field2031)) {
                    class63.field1275.method1177(-27298);
                    class63.field1275.method1166(true, class139.field2561);
                    class63.field1275.method1185(class81.field1611, arg0 - 3, class29.field731);
                    class107.field2031 = null;
                    class29.field731 = null;
                    class177.field3242 = 0;
                    class71.field1431 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class63.field1275.method1187(-14331);
            class29.field731 = null;
            class107.field2031 = null;
            class71.field1431 = null;
            class177.field3242 = 0;
        }
        if (arg0 != 3) {
            method641((byte) 106);
        }
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)I")
    public final int method642(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method637((byte) 5, -68, -50);
        }
        field1811++;
        return this.field1795 == null || arg0 < 0 || this.field1795.length < arg0 ? -1 : this.field1795[arg0];
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public final void method643(int arg0) {
        if (arg0 != 0) {
            this.method644((class194) null, (byte) -27);
        }
        if (this.field1808 != null) {
            for (int var2 = 0; var2 < this.field1808.length; var2++) {
                this.field1808[var2] = class160.method1052(this.field1808[var2], 32768);
            }
        }
        field1793++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lsi;B)V")
    public final void method644(class194 arg0, byte arg1) {
        field1797++;
        while (true) {
            int var3 = arg0.method1301(-8317);
            if (var3 == 0) {
                if (arg1 >= -21) {
                    this.method644((class194) null, (byte) 83);
                    return;
                } else {
                    return;
                }
            }
            this.method645(-5, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILsi;I)V")
    private final void method645(int arg0, class194 arg1, int arg2) {
        field1803++;
        if (arg0 != -5) {
            return;
        }
        if (arg2 == 1) {
            this.field1805 = arg1.method1320(false).method1742(0, 60);
        } else if (arg2 == 2) {
            int var4 = arg1.method1301(arg0 ^ 0x2078);
            this.field1808 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1808[var5] = arg1.method1294((byte) 3);
            }
            return;
        } else if (arg2 == 3) {
            int var6 = arg1.method1301(-8317);
            this.field1795 = new int[var6];
            this.field1791 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1294((byte) 3);
                this.field1795[var7] = var8;
                this.field1791[var7] = new int[class27.field717[var8]];
                for (int var9 = 0; var9 < class27.field717[var8]; var9++) {
                    this.field1791[var7][var9] = arg1.method1294((byte) 3);
                }
            }
            return;
        } else if (arg2 == 4) {
            this.field1798 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
    public static void method646(int arg0) {
        field1802 = null;
        field1800 = null;
        if (arg0 != -2) {
            method641((byte) -116);
        }
    }
}
