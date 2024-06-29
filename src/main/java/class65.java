import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class65 {

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lke;")
    public static class256 field1153 = class316.method2202("Atteindre", 27626);

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Lke;")
    public static class256 field1158 = class316.method2202("(U0a )2 in: ", 27626);

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Z")
    public static boolean field1167 = true;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lbl;")
    public class280 field1150;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lqh;")
    public static class31 field1151;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
    public int[] field1149;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[I")
    public int[] field1152;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "[I")
    public int[] field1155;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "[I")
    public int[] field1156;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[I")
    public int[] field1157;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[I")
    public int[] field1164;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "[Lbl;")
    public class280[] field1163;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[[I")
    public int[][] field1146;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "[[I")
    public int[][] field1166;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([[I[[FZLgf;[IIZI[[FIIZI[Z[[FIIZIIB[[I)V", line = 26)
    public static final void method501(int[][] arg0, float[][] arg1, boolean arg2, class113 arg3, int[] arg4, int arg5, boolean arg6, int arg7, float[][] arg8, int arg9, int arg10, boolean arg11, int arg12, boolean[] arg13, float[][] arg14, int arg15, int arg16, boolean arg17, int arg18, int arg19, byte arg20, int[][] arg21) {
        field1160++;
        int var22 = (arg16 << 8) + (arg6 ? 255 : 0);
        int var23 = (arg17 ? 255 : 0) + (arg15 << 8);
        int var24 = (arg19 << 8) + (arg11 ? 255 : 0);
        int var25 = (arg9 << 8) + (arg2 ? 255 : 0);
        int[] var26 = new int[arg4.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg4[var27 + var27 + 1];
            int[][] var29 = arg21 == null || arg13 == null || !arg13[var27] ? arg0 : arg21;
            int var30 = arg4[var27 + var27];
            var26[var27] = class284.method1987((float) arg5, var24, var29, var25, arg20, arg8, arg1, (byte) -121, arg14, var22, false, arg21, arg12, arg3, arg18, var28, var30, var23);
        }
        if (arg7 <= 86) {
            field1153 = (class256) null;
        }
        arg3.method777(arg10, arg18, arg12, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 60)
    public static void method502(int arg0) {
        field1153 = null;
        if (arg0 >= 7) {
            field1151 = null;
            field1158 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z[B)V", line = 77)
    private final void method503(boolean arg0, byte[] arg1) {
        field1165++;
        class41 var3 = new class41(class292.method2022(false, arg1));
        int var4 = var3.method357(false);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field1162 = 0;
        } else {
            this.field1162 = var3.method327(4);
        }
        int var5 = var3.method357(false);
        this.field1145 = var3.method346(-16);
        this.field1157 = new int[this.field1145];
        int var6 = -1;
        int var7 = 0;
        for (int var8 = 0; var8 < this.field1145; var8++) {
            this.field1157[var8] = var7 += var3.method346(-16);
            if (this.field1157[var8] > var6) {
                var6 = this.field1157[var8];
            }
        }
        this.field1148 = var6 + 1;
        this.field1164 = new int[this.field1148];
        this.field1152 = new int[this.field1148];
        this.field1155 = new int[this.field1148];
        this.field1149 = new int[this.field1148];
        if (!arg0) {
            this.field1157 = (int[]) null;
        }
        this.field1146 = new int[this.field1148][];
        if (var5 != 0) {
            this.field1156 = new int[this.field1148];
            for (int var9 = 0; var9 < this.field1148; var9++) {
                this.field1156[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1145; var10++) {
                this.field1156[this.field1157[var10]] = var3.method327(4);
            }
            this.field1150 = new class280(this.field1156);
        }
        for (int var11 = 0; var11 < this.field1145; var11++) {
            this.field1155[this.field1157[var11]] = var3.method327(4);
        }
        for (int var12 = 0; var12 < this.field1145; var12++) {
            this.field1164[this.field1157[var12]] = var3.method327(4);
        }
        for (int var13 = 0; var13 < this.field1145; var13++) {
            this.field1152[this.field1157[var13]] = var3.method346(-16);
        }
        for (int var14 = 0; var14 < this.field1145; var14++) {
            int var15 = 0;
            int var16 = this.field1157[var14];
            int var17 = this.field1152[var16];
            int var18 = -1;
            this.field1146[var16] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field1146[var16][var19] = var15 += var3.method346(-16);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field1149[var16] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field1146[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1163 = new class280[var6 + 1];
        this.field1166 = new int[var6 + 1][];
        for (int var21 = 0; var21 < this.field1145; var21++) {
            int var22 = this.field1157[var21];
            int var23 = this.field1152[var22];
            this.field1166[var22] = new int[this.field1149[var22]];
            for (int var24 = 0; var24 < this.field1149[var22]; var24++) {
                this.field1166[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field1146[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field1146[var22][var25];
                }
                this.field1166[var22][var26] = var3.method327(4);
            }
            this.field1163[var22] = new class280(this.field1166[var22]);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([BI)Lvf;", line = 254)
    public static final class61 method504(byte[] arg0, int arg1) {
        field1154++;
        if (arg1 != -1) {
            field1158 = (class256) null;
        }
        if (arg0 == null) {
            return null;
        } else {
            class61 var2 = new class61(arg0, class13.field172, class307.field5283, class94.field1692, class62.field1093, class6.field92);
            class183.method1343(255);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIBJZ)Lke;", line = 282)
    public static final class256 method505(int arg0, int arg1, byte arg2, long arg3, boolean arg4) {
        field1159++;
        class256 var6 = class99.method711((byte) -122, 0);
        if (arg3 < 0L) {
            arg3 = -arg3;
            var6.method1793((byte) 37, class208.field3760);
        }
        class256 var7 = class249.field4232;
        class256 var8 = class213.field3813;
        if (arg1 == 1) {
            var8 = class249.field4232;
            var7 = class213.field3813;
        }
        if (arg1 == 2) {
            var8 = class102.field1836;
            var7 = class213.field3813;
        }
        if (arg1 == 3) {
            var8 = class249.field4232;
            var7 = class213.field3813;
        }
        class256 var9 = class99.method711((byte) -122, 0);
        class256 var10 = class99.method711((byte) -122, 0);
        if (arg2 != -128) {
            return (class256) null;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method1793((byte) 37, class305.method2125((byte) 109, (int) (arg3 % 10L)));
            arg3 /= 10L;
        }
        if (arg3 == 0L) {
            var9 = class17.field216;
        }
        int var12 = 0;
        while (arg3 > 0L) {
            if (arg4 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1793((byte) 37, var8);
            }
            var9.method1793((byte) 37, class305.method2125((byte) 49, (int) (arg3 % 10L)));
            var12++;
            arg3 /= 10L;
        }
        if (var10.method1799(~arg2) > 0) {
            var10.method1793((byte) 37, var7);
        }
        return class30.method214(new class256[] { var6, var9.method1781(true), var10.method1781(true) }, 29784);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V", line = 362)
    public static final void method506(boolean arg0) {
        field1147++;
        if (!arg0) {
            method501((int[][]) ((int[][]) null), (float[][]) ((float[][]) null), true, (class113) null, (int[]) null, 24, false, -105, (float[][]) ((float[][]) null), -109, 116, false, 25, (boolean[]) null, (float[][]) ((float[][]) null), -91, -27, false, 105, -36, (byte) 10, (int[][]) ((int[][]) null));
        }
        if (class114.field2011 != null) {
            class114.field2011.method1415((byte) -86);
        }
        if (class134.field2335 != null) {
            class134.field2335.method1415((byte) -101);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "([BI)V", line = 380)
    public class65(byte[] arg0, int arg1) {
        this.field1161 = class274.method1902(arg0, arg0.length, -84);
        if (this.field1161 != arg1) {
            throw new RuntimeException();
        }
        this.method503(true, arg0);
    }
}
