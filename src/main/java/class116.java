import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class116 extends class128 {

    @OriginalMember(owner = "client!tb", name = "Tb", descriptor = "I")
    private int field2899 = 0;

    @OriginalMember(owner = "client!tb", name = "Qb", descriptor = "Z")
    public boolean field2896 = false;

    @OriginalMember(owner = "client!tb", name = "Mb", descriptor = "I")
    private int field2892 = 0;

    @OriginalMember(owner = "client!tb", name = "Ob", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!tb", name = "Xb", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!tb", name = "Jb", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!tb", name = "Kb", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!tb", name = "cc", descriptor = "I")
    private int field2908;

    @OriginalMember(owner = "client!tb", name = "Sb", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!tb", name = "Vb", descriptor = "Lhe;")
    private class47 field2901;

    @OriginalMember(owner = "client!tb", name = "Rb", descriptor = "[[I")
    public static int[][] field2897 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!tb", name = "Yb", descriptor = "La;")
    public static class1 field2904 = class113.method934(-11538, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!tb", name = "hc", descriptor = "La;")
    public static class1 field2913 = class113.method934(-11538, "redstone2");

    @OriginalMember(owner = "client!tb", name = "ac", descriptor = "La;")
    public static class1 field2906 = class113.method934(-11538, "Die Verbindung konnte");

    @OriginalMember(owner = "client!tb", name = "Lb", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!tb", name = "Nb", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!tb", name = "Ub", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!tb", name = "ec", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!tb", name = "fc", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!tb", name = "Pb", descriptor = "Lbc;")
    public static class10 field2895;

    @OriginalMember(owner = "client!tb", name = "Zb", descriptor = "Lbc;")
    public static class10 field2905;

    @OriginalMember(owner = "client!tb", name = "Wb", descriptor = "Lwc;")
    public static class134 field2902;

    @OriginalMember(owner = "client!tb", name = "bc", descriptor = "[I")
    public static int[] field2907;

    @OriginalMember(owner = "client!tb", name = "dc", descriptor = "[I")
    public static int[] field2909;

    @OriginalMember(owner = "client!tb", name = "gc", descriptor = "[I")
    public static int[] field2912;

    @OriginalMember(owner = "client!tb", name = "ic", descriptor = "[I")
    public static int[] field2914;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIB)I", line = 21)
    public static final int method958(int arg0, int arg1, byte arg2) {
        field2911++;
        if (arg0 == -1) {
            return 12345678;
        }
        if (arg2 != 73) {
            field2897 = null;
        }
        int var3 = (arg0 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIII)V", line = 117)
    public class116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2894 = arg3;
        this.field2903 = arg2;
        this.field2889 = arg5 + arg6;
        this.field2890 = arg4;
        this.field2908 = arg0;
        this.field2898 = arg1;
        int var8 = class78.method716(this.field2908, 13).field787;
        if (var8 == -1) {
            this.field2896 = true;
        } else {
            this.field2896 = false;
            this.field2901 = class4.method104(var8, 2);
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)Lpa;", line = 56)
    public final class91 method42(int arg0) {
        field2893++;
        class28 var2 = class78.method716(this.field2908, 13);
        int var3 = -110 / ((arg0 - 41) / 47);
        class91 var4;
        if (this.field2896) {
            var4 = var2.method372(-1, 2);
        } else {
            var4 = var2.method372(this.field2899, 2);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[La;)La;", line = 94)
    public static final class1 method959(int arg0, class1[] arg1) {
        int var2 = 58 % ((7 - arg0) / 44);
        field2910++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class95.method828(120, arg1.length, 0, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V", line = 145)
    public static final void method960(int arg0, boolean arg1) {
        field2900++;
        if (class104.field2624.field1975 >> 7 == class35.field942 && class104.field2624.field1966 >> 7 == class108.field2723) {
            class35.field942 = 0;
        }
        int var2 = class118.field2942;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = arg0; var3 < var2; var3++) {
            int var4;
            class2 var5;
            if (arg1) {
                var4 = 33538048;
                var5 = class104.field2624;
            } else {
                var4 = class112.field2761[var3] << 14;
                var5 = class80.field2033[class112.field2761[var3]];
            }
            if (var5 != null && var5.method43(1)) {
                var5.field96 = false;
                int var6 = var5.field1975 >> 7;
                int var7 = var5.field1966 >> 7;
                if ((class93.field2335 && class118.field2942 > 50 || class118.field2942 > 200) && !arg1 && var5.field2003 == var5.field1954) {
                    var5.field96 = true;
                }
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field74 == null || var5.field92 > class82.field2066 || class82.field2066 >= var5.field83) {
                        if ((var5.field1975 & 0x7F) == 64 && (var5.field1966 & 0x7F) == 64) {
                            if (class121.field3018[var6][var7] == class97.field2402) {
                                continue;
                            }
                            class121.field3018[var6][var7] = class97.field2402;
                        }
                        var5.field85 = class78.method715((byte) -120, class2.field76, var5.field1975, var5.field1966);
                        class130.field3186.method91(class2.field76, var5.field1975, var5.field1966, var5.field85, 60, var5, var5.field1995, var4, var5.field1982);
                    } else {
                        var5.field96 = false;
                        var5.field85 = class78.method715((byte) -117, class2.field76, var5.field1975, var5.field1966);
                        class130.field3186.method69(class2.field76, var5.field1975, var5.field1966, var5.field85, 60, var5, var5.field1995, var4, var5.field67, var5.field90, var5.field71, var5.field98);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V", line = 232)
    public final void method961(int arg0, int arg1) {
        field2891++;
        if (arg0 != 8076) {
            this.method961(106, 6);
        }
        if (this.field2896) {
            return;
        }
        this.field2892 += arg1;
        while (this.field2892 > this.field2901.field1225[this.field2899]) {
            this.field2892 -= this.field2901.field1225[this.field2899];
            this.field2899++;
            if (this.field2901.field1244.length <= this.field2899) {
                this.field2896 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V", line = 261)
    public static void method962(byte arg0) {
        field2906 = null;
        field2902 = null;
        field2909 = null;
        field2897 = null;
        field2905 = null;
        field2912 = null;
        field2904 = null;
        if (arg0 < 87) {
            field2895 = null;
        }
        field2913 = null;
        field2907 = null;
        field2914 = null;
        field2895 = null;
    }
}
