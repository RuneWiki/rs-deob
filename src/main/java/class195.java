import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class195 {

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "Lgn;")
    public static class475 field2759 = new class475(26, -1);

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field2765 = -1;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "Ldf;")
    public class263 field2762;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "Llb;")
    public static class363 field2749;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "[I")
    public int[] field2747;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "[I")
    public static int[] field2748;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "[I")
    public int[] field2751;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "[I")
    public int[] field2752;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "[I")
    public int[] field2753;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "[I")
    public int[] field2755;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "[I")
    public int[] field2763;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "[Ldf;")
    public class263[] field2754;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "[[I")
    public int[][] field2746;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "[[I")
    public int[][] field2764;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
    public static final int method1221(int arg0, int arg1) {
        field2766++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else {
            int var2 = 41 / ((29 - arg0) / 33);
            if (arg1 == 6406 || arg1 == 34844) {
                return 6406;
            } else if (arg1 == 6409 || arg1 == 34846) {
                return 6409;
            } else if (arg1 == 6410 || arg1 == 34847) {
                return 6410;
            } else if (arg1 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIZI)Z")
    public static final boolean method1222(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            field2748 = null;
        }
        field2750++;
        if ((class379.field5661[0][arg1][arg4] & 0x2) != 0) {
            return true;
        } else if ((class379.field5661[arg2][arg1][arg4] & 0x10) == 0) {
            return arg0 == class282.method1715(2, arg2, arg1, arg4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static void method1223(int arg0) {
        field2749 = null;
        field2748 = null;
        if (arg0 >= -58) {
            field2748 = null;
        }
        field2759 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([BI)V")
    private final void method1224(byte[] arg0, int arg1) {
        field2756++;
        class156 var3 = new class156(class221.method1363((byte) -120, arg0));
        int var4 = var3.method941((byte) 125);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2757 = 0;
        } else {
            this.field2757 = var3.method950(186);
        }
        int var5 = var3.method941((byte) 125);
        this.field2758 = var3.method993((byte) -61);
        int var6 = 0;
        int var7 = -1;
        int var8 = -61 / ((39 - arg1) / 40);
        this.field2755 = new int[this.field2758];
        for (int var9 = 0; var9 < this.field2758; var9++) {
            this.field2755[var9] = var6 += var3.method993((byte) -34);
            if (this.field2755[var9] > var7) {
                var7 = this.field2755[var9];
            }
        }
        this.field2761 = var7 + 1;
        this.field2763 = new int[this.field2761];
        this.field2764 = new int[this.field2761][];
        this.field2752 = new int[this.field2761];
        this.field2747 = new int[this.field2761];
        this.field2751 = new int[this.field2761];
        if (var5 != 0) {
            this.field2753 = new int[this.field2761];
            for (int var10 = 0; var10 < this.field2761; var10++) {
                this.field2753[var10] = -1;
            }
            for (int var11 = 0; var11 < this.field2758; var11++) {
                this.field2753[this.field2755[var11]] = var3.method950(186);
            }
            this.field2762 = new class263(this.field2753);
        }
        for (int var12 = 0; var12 < this.field2758; var12++) {
            this.field2752[this.field2755[var12]] = var3.method950(186);
        }
        for (int var13 = 0; var13 < this.field2758; var13++) {
            this.field2747[this.field2755[var13]] = var3.method950(186);
        }
        for (int var14 = 0; var14 < this.field2758; var14++) {
            this.field2751[this.field2755[var14]] = var3.method993((byte) -80);
        }
        for (int var15 = 0; var15 < this.field2758; var15++) {
            int var22 = this.field2755[var15];
            int var23 = 0;
            int var24 = this.field2751[var22];
            int var25 = -1;
            this.field2764[var22] = new int[var24];
            for (int var26 = 0; var26 < var24; var26++) {
                int var27 = this.field2764[var22][var26] = var23 += var3.method993((byte) -95);
                if (var25 < var27) {
                    var25 = var27;
                }
            }
            this.field2763[var22] = var25 + 1;
            if (var25 + 1 == var24) {
                this.field2764[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field2746 = new int[var7 + 1][];
        this.field2754 = new class263[var7 + 1];
        for (int var16 = 0; var16 < this.field2758; var16++) {
            int var17 = this.field2755[var16];
            int var18 = this.field2751[var17];
            this.field2746[var17] = new int[this.field2763[var17]];
            for (int var19 = 0; var19 < this.field2763[var17]; var19++) {
                this.field2746[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field2764[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field2764[var17][var20];
                }
                this.field2746[var17][var21] = var3.method950(186);
            }
            this.field2754[var17] = new class263(this.field2746[var17]);
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([BI)V")
    public class195(byte[] arg0, int arg1) {
        this.field2760 = class276.method1694(arg0.length, (byte) 19, arg0);
        if (this.field2760 != arg1) {
            throw new RuntimeException();
        }
        this.method1224(arg0, 81);
    }
}
