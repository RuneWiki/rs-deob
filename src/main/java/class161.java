import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class161 {

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Z")
    public boolean field2774 = false;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[I")
    private int[] field2769 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public int field2778 = -1;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Ljd;")
    public static class85 field2757 = class221.method1499("Ablegen", (byte) 127);

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    public static int[] field2760 = new int[5];

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Lda;")
    public static class180 field2771 = new class180();

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Ljd;")
    public static class85 field2779 = class221.method1499("Mitglieder)2Welt", (byte) 119);

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Lge;")
    public static class68 field2773;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lhj;")
    public static class69 field2780;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    private int[] field2759;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[S")
    private short[] field2758;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[S")
    private short[] field2765;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[S")
    private short[] field2767;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "[S")
    private short[] field2775;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V")
    public static final void method1052(int arg0, int arg1, int arg2, int arg3) {
        class171 var4 = class85.method579(9, 0, arg1);
        if (arg2 != -1) {
            field2780 = null;
        }
        field2764++;
        var4.method1140(-28981);
        var4.field2951 = arg0;
        var4.field2948 = arg3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lik;II)V")
    private final void method1053(class247 arg0, int arg1, int arg2) {
        field2762++;
        if (arg1 != -10873) {
            method1052(106, 125, 41, -112);
        }
        if (arg2 == 1) {
            this.field2778 = arg0.method1711((byte) -67);
        } else if (arg2 == 2) {
            int var8 = arg0.method1711((byte) -67);
            this.field2759 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2759[var9] = arg0.method1694((byte) -100);
            }
        } else if (arg2 == 3) {
            this.field2774 = true;
            return;
        } else if (arg2 == 40) {
            int var4 = arg0.method1711((byte) -67);
            this.field2775 = new short[var4];
            this.field2767 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2775[var5] = (short) arg0.method1694((byte) -100);
                this.field2767[var5] = (short) arg0.method1694((byte) -100);
            }
            return;
        } else if (arg2 == 41) {
            int var6 = arg0.method1711((byte) -67);
            this.field2758 = new short[var6];
            this.field2765 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2765[var7] = (short) arg0.method1694((byte) -100);
                this.field2758[var7] = (short) arg0.method1694((byte) -100);
            }
            return;
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2769[arg2 - 60] = arg0.method1694((byte) -100);
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1054(int arg0) {
        field2771 = null;
        field2760 = null;
        if (arg0 != 5) {
            method1057((byte) -77, -3);
        }
        field2757 = null;
        field2779 = null;
        field2773 = null;
        field2780 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIB)V")
    public static final void method1055(int arg0, int arg1, byte arg2) {
        field2772++;
        if (arg2 <= 21) {
            method1055(-30, -125, (byte) 33);
        }
        class171 var3 = class85.method579(5, 0, arg0);
        var3.method1140(-28981);
        var3.field2951 = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Z")
    public final boolean method1056(int arg0) {
        if (arg0 != 2958) {
            this.field2769 = null;
        }
        field2776++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2769[var3] != -1 && !class54.field954.method469(this.field2769[var3], 0, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I")
    public static final int method1057(byte arg0, int arg1) {
        if (arg0 > -6) {
            field2779 = null;
        }
        field2763++;
        return (arg1 & 0x3F934) >> 11;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Lae;")
    public final class165 method1058(byte arg0) {
        field2770++;
        class165[] var2 = new class165[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2769[var4] != -1) {
                var2[var3++] = class165.method1111(class54.field954, this.field2769[var4], 0);
            }
        }
        int var5 = -32 / ((arg0 - 46) / 41);
        class165 var6 = new class165(var2, var3);
        if (this.field2775 != null) {
            for (int var7 = 0; var7 < this.field2775.length; var7++) {
                var6.method1113(this.field2775[var7], this.field2767[var7]);
            }
        }
        if (this.field2765 != null) {
            for (int var8 = 0; var8 < this.field2765.length; var8++) {
                var6.method1108(this.field2765[var8], this.field2758[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lge;B)Z")
    public static final boolean method1059(class68 arg0, byte arg1) {
        field2781++;
        if (arg0.method468(true, class102.field1826)) {
            return true;
        } else {
            int var2 = 80 / ((-arg1 - 70) / 42);
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLik;)V")
    public final void method1060(byte arg0, class247 arg1) {
        field2761++;
        while (true) {
            int var3 = arg1.method1711((byte) -67);
            if (var3 == 0) {
                if (arg0 == -13) {
                    return;
                } else {
                    field2760 = null;
                    return;
                }
            }
            this.method1053(arg1, arg0 - 10860, var3);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)Z")
    public final boolean method1061(byte arg0) {
        field2768++;
        if (this.field2759 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2759.length; var3++) {
            if (!class54.field954.method469(this.field2759[var3], 0, 0)) {
                var2 = false;
            }
        }
        if (arg0 != 42) {
            method1057((byte) -66, 83);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Lae;")
    public final class165 method1062(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field2766++;
        if (this.field2759 == null) {
            return null;
        }
        class165[] var2 = new class165[this.field2759.length];
        for (int var3 = 0; var3 < this.field2759.length; var3++) {
            var2[var3] = class165.method1111(class54.field954, this.field2759[var3], 0);
        }
        class165 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class165(var2, var2.length);
        }
        if (this.field2775 != null) {
            for (int var5 = 0; var5 < this.field2775.length; var5++) {
                var4.method1113(this.field2775[var5], this.field2767[var5]);
            }
        }
        if (this.field2765 != null) {
            for (int var6 = 0; var6 < this.field2765.length; var6++) {
                var4.method1108(this.field2765[var6], this.field2758[var6]);
            }
        }
        return var4;
    }
}
