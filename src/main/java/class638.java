import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class638 implements class152 {

    @OriginalMember(owner = "client!tda", name = "n", descriptor = "Lwu;")
    private class373 field8774 = new class373(256);

    @OriginalMember(owner = "client!tda", name = "k", descriptor = "Lin;")
    private class91 field8771;

    @OriginalMember(owner = "client!tda", name = "p", descriptor = "Lin;")
    private class91 field8776;

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
    private int field8777;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "[Lhd;")
    private class739[] field8763;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public static int field8761 = -1;

    @OriginalMember(owner = "client!tda", name = "o", descriptor = "[I")
    public static int[] field8775 = new int[8];

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public static int field8762 = 328;

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "J")
    public static long field8767 = 0L;

    @OriginalMember(owner = "client!tda", name = "r", descriptor = "F")
    public static float field8778;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!tda", name = "j", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!tda", name = "l", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!tda", name = "m", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIFIZI)[I")
    public final int[] method1183(int arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 != -21540) {
            this.method1180(-46, 6);
        }
        field8769++;
        return this.method3625(arg3, false).method4176(this, arg5, arg1, this.field8763[arg3].field9949, (double) arg2, this.field8776, (byte) 11);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
    public static void method3624(int arg0) {
        if (arg0 >= -103) {
            field8762 = -87;
        }
        field8775 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZ)Llr;")
    private final class749 method3625(int arg0, boolean arg1) {
        field8772++;
        class13 var3 = this.field8774.method2364((long) arg0, (byte) -34);
        if (var3 != null) {
            return (class749) var3;
        }
        byte[] var4 = this.field8771.method868((byte) 73, arg0);
        if (var4 == null) {
            return null;
        }
        if (arg1) {
            this.method1178(-58, 1.9039171F, false, -106, -22, -18);
        }
        class749 var5 = new class749(new class215(var4));
        this.field8774.method2367((long) arg0, var5, -1);
        return var5;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)Lhd;")
    public final class739 method1180(int arg0, int arg1) {
        field8773++;
        return arg1 == -6662 ? this.field8763[arg0] : null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZIFIII)[I")
    public final int[] method1182(boolean arg0, int arg1, float arg2, int arg3, int arg4, int arg5) {
        int var7 = 41 / ((arg5 + 69) / 48);
        field8766++;
        return this.method3625(arg1, false).method4178(arg3, this, 0, this.field8763[arg1].field9949, (double) arg2, arg0, this.field8776, arg4);
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(II)Z")
    public final boolean method1181(int arg0, int arg1) {
        field8768++;
        class749 var3 = this.method3625(arg1, false);
        if (arg0 != -7953) {
            this.method1181(56, -109);
        }
        return var3 != null && var3.method4177(this, this.field8776, -85);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IFZIII)[F")
    public final float[] method1178(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 == -30824) {
            field8764++;
            return this.method3625(arg5, false).method4179(arg0, this, this.field8763[arg5].field9949, arg4, this.field8776, -20);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)I")
    public final int method1179(boolean arg0) {
        field8770++;
        if (!arg0) {
            field8767 = -52L;
        }
        return this.field8777;
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lin;Lin;Lin;)V")
    public class638(class91 arg0, class91 arg1, class91 arg2) {
        this.field8771 = arg1;
        this.field8776 = arg2;
        class215 var4 = new class215(arg0.method863(-1860, 0, 0));
        this.field8777 = var4.method1478(842397944);
        this.field8763 = new class739[this.field8777];
        for (int var5 = 0; var5 < this.field8777; var5++) {
            if (var4.method1535(255) == 1) {
                this.field8763[var5] = new class739();
            }
        }
        for (int var6 = 0; var6 < this.field8777; var6++) {
            if (this.field8763[var6] != null) {
                this.field8763[var6].field9951 = var4.method1535(255) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field8777; var7++) {
            if (this.field8763[var7] != null) {
                this.field8763[var7].field9941 = var4.method1535(255) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field8777; var8++) {
            if (this.field8763[var8] != null) {
                this.field8763[var8].field9946 = var4.method1535(255) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field8777; var9++) {
            if (this.field8763[var9] != null) {
                this.field8763[var9].field9958 = var4.method1536(-85);
            }
        }
        for (int var10 = 0; var10 < this.field8777; var10++) {
            if (this.field8763[var10] != null) {
                this.field8763[var10].field9943 = var4.method1536(-113);
            }
        }
        for (int var11 = 0; var11 < this.field8777; var11++) {
            if (this.field8763[var11] != null) {
                this.field8763[var11].field9955 = var4.method1536(-97);
            }
        }
        for (int var12 = 0; var12 < this.field8777; var12++) {
            if (this.field8763[var12] != null) {
                this.field8763[var12].field9944 = var4.method1536(-82);
            }
        }
        for (int var13 = 0; var13 < this.field8777; var13++) {
            if (this.field8763[var13] != null) {
                this.field8763[var13].field9950 = (short) var4.method1478(842397944);
            }
        }
        for (int var14 = 0; var14 < this.field8777; var14++) {
            if (this.field8763[var14] != null) {
                this.field8763[var14].field9940 = var4.method1536(-86);
            }
        }
        for (int var15 = 0; var15 < this.field8777; var15++) {
            if (this.field8763[var15] != null) {
                this.field8763[var15].field9953 = var4.method1536(-104);
            }
        }
        for (int var16 = 0; var16 < this.field8777; var16++) {
            if (this.field8763[var16] != null) {
                this.field8763[var16].field9954 = var4.method1535(255) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field8777; var17++) {
            if (this.field8763[var17] != null) {
                this.field8763[var17].field9949 = var4.method1535(255) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field8777; var18++) {
            if (this.field8763[var18] != null) {
                this.field8763[var18].field9947 = var4.method1536(-77);
            }
        }
        for (int var19 = 0; var19 < this.field8777; var19++) {
            if (this.field8763[var19] != null) {
                this.field8763[var19].field9959 = var4.method1535(255) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field8777; var20++) {
            if (this.field8763[var20] != null) {
                this.field8763[var20].field9957 = var4.method1535(255) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field8777; var21++) {
            if (this.field8763[var21] != null) {
                this.field8763[var21].field9960 = var4.method1535(255) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field8777; var22++) {
            if (this.field8763[var22] != null) {
                this.field8763[var22].field9945 = var4.method1535(255);
            }
        }
        for (int var23 = 0; var23 < this.field8777; var23++) {
            if (this.field8763[var23] != null) {
                this.field8763[var23].field9948 = var4.method1533((byte) -126);
            }
        }
        for (int var24 = 0; var24 < this.field8777; var24++) {
            if (this.field8763[var24] != null) {
                this.field8763[var24].field9942 = var4.method1535(255);
            }
        }
    }
}
