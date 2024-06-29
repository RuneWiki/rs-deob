import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class236 extends class120 {

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    private int field3782 = 1;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    private int field3785 = 1;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    public static int field3790 = 0;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "Lok;")
    public static class41 field3789 = class137.method956("Ausw-=hlen", 45);

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "Lok;")
    public static class41 field3794 = class137.method956("k", 45);

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "Lda;")
    public static class212 field3796 = new class212();

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ff", name = "ib", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ff", name = "jb", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "[I")
    public static int[] field3787;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "[[Ldg;")
    public static class6[][] field3791;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            field3794 = (class41) null;
        }
        field3788++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int var4 = this.field3782 + this.field3782 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3785 + this.field3785 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field3782; var9 <= (this.field3782 + arg0); var9++) {
                int[] var10 = this.method854(0, class27.field410 & var9, -24059);
                int[] var11 = new int[class307.field5160];
                int var12 = 0;
                for (int var13 = -this.field3785; var13 <= this.field3785; var13++) {
                    var12 += var10[var13 & class51.field776];
                }
                int var14 = 0;
                while (var14 < class307.field5160) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field3785 & class51.field776];
                    var14++;
                    var12 = var10[this.field3785 + var14 & class51.field776] + var15;
                }
                var8[var9 + this.field3782 - arg0] = var11;
            }
            for (int var16 = 0; var16 < class307.field5160; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 394)
    public class236() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Llb;II)V", line = 111)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3785 = arg0.method792(2);
        } else if (arg2 == 1) {
            this.field3782 = arg0.method792(2);
        } else if (arg2 == 2) {
            this.field1770 = arg0.method792(2) == 1;
        }
        field3786++;
        if (arg1 != -1) {
            field3793 = 0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V", line = 150)
    public static void method1695(int arg0) {
        field3789 = null;
        field3791 = (class6[][]) null;
        field3787 = null;
        field3794 = null;
        int var1 = 122 % ((arg0 + 61) / 42);
        field3796 = null;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)Lwe;", line = 168)
    public static final class88 method1696(int arg0, int arg1) {
        if (arg1 != 243971376) {
            field3789 = (class41) null;
        }
        field3795++;
        class88 var2 = (class88) class159.field2495.method554((long) arg0, arg1 - 243971342);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class41.field647.method454(class276.method1956(arg0, -15417), 0, class242.method1733(arg0, arg1 - 243989045));
        class88 var4 = new class88();
        if (var3 != null) {
            var4.method633(new class112(var3), arg1 - 243971377);
        }
        class159.field2495.method555((long) arg0, (byte) -126, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lfl;Lhj;B)Ldg;", line = 200)
    public static final class6 method1697(class86 arg0, class117 arg1, byte arg2) {
        field3792++;
        if (arg2 != 16) {
            field3787 = (int[]) null;
        }
        long var3 = ((long) arg1.field1711 << 56) + ((long) arg1.field1716 << 32) - (long) (-(arg1.field1700 - -1 << 16) + -arg1.field1707);
        class6 var5 = (class6) arg0.method617(var3, false);
        if (var5 == null) {
            var5 = new class6(arg1.field1700, (float) arg1.field1707, true, false, arg1.field1716);
            arg0.method610(80, var5, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(IZ)[[I", line = 233)
    public final int[][] method168(int arg0, boolean arg1) {
        if (!arg1) {
            return (int[][]) ((int[][]) null);
        }
        field3784++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int var4 = this.field3782 + this.field3782 + 1;
            int var5 = this.field3785 + this.field3785 + 1;
            int var6 = 65536 / var4;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var5;
            for (int var9 = arg0 - this.field3782; var9 <= (this.field3782 + arg0); var9++) {
                int[][] var10 = this.method858(0, class27.field410 & var9, 121);
                int[][] var11 = new int[3][class307.field5160];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field3785; var18 <= this.field3785; var18++) {
                    int var19 = class51.field776 & var18;
                    var14 += var17[var19];
                    var12 += var16[var19];
                    var13 += var15[var19];
                }
                int[] var20 = var11[1];
                int[] var21 = var11[0];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class307.field5160 > var23) {
                    var21[var23] = var8 * var13 >> 16;
                    var20[var23] = var8 * var12 >> 16;
                    var22[var23] = var8 * var14 >> 16;
                    int var24 = var23 - this.field3785 & class51.field776;
                    int var25 = var12 - var16[var24];
                    int var26 = var13 - var15[var24];
                    var23++;
                    int var27 = var14 - var17[var24];
                    int var28 = class51.field776 & this.field3785 + var23;
                    var13 = var15[var28] + var26;
                    var12 = var16[var28] + var25;
                    var14 = var17[var28] + var27;
                }
                var7[var9 + this.field3782 - arg0] = var11;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[2];
            int[] var31 = var3[0];
            for (int var32 = 0; var32 < class307.field5160; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var7[var36];
                    var33 += var37[0][var32];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                }
                var31[var32] = var6 * var33 >> 16;
                var29[var32] = var6 * var34 >> 16;
                var30[var32] = var6 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)I", line = 373)
    public static final int method1698(int arg0, int arg1, int arg2, int arg3) {
        field3797++;
        if (arg0 == arg1) {
            return arg0;
        }
        if (arg2 >= -94) {
            method1697((class86) null, (class117) null, (byte) -58);
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 >>> 7 & 0x1FE01FE) * var4 + (arg1 >>> 7 & 0x1FE01FE) * arg3 & 0xFF00FF00;
        int var6 = (arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg3 & 0xFF00FF00;
        return (var6 >> 7) + var5;
    }
}
