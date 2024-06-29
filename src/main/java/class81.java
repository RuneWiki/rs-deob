import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class81 implements class101 {

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "Lke;")
    private class276 field903 = new class276(256);

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "Lae;")
    private class283 field914;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "Lae;")
    private class283 field919;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "[Lqr;")
    private class744[] field920;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "Lsha;")
    public static class115 field906 = null;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field913 = -1;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "[[B")
    public static byte[][] field904;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(FZIIII)[F", line = 8)
    public final float[] method574(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field911++;
        if (arg4 != 1136) {
            field904 = null;
        }
        return this.method577(-97, arg5).method3564(this.field920[arg5].field10261, this, 0, arg2, arg3, this.field914);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lgga;I)Lcb;", line = 22)
    public static final class176 method575(class511 arg0, int arg1) {
        field915++;
        int var2 = arg0.method3002(-1);
        class267 var3 = class278.method1807(4)[arg0.method3013(58)];
        class15 var4 = class282.method1834(0)[arg0.method3013(22)];
        int var5 = arg0.method3034(1);
        int var6 = arg0.method3034(1);
        if (arg1 > -46) {
            method575(null, -97);
        }
        return new class176(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V", line = 43)
    public static void method576(int arg0) {
        field904 = null;
        field906 = null;
        if (arg0 != 0) {
            method576(-123);
        }
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)Ltm;", line = 54)
    private final class617 method577(int arg0, int arg1) {
        field908++;
        class49 var3 = this.field903.method1800(-1, (long) arg1);
        if (arg0 > -35) {
            return null;
        } else if (var3 == null) {
            byte[] var4 = this.field919.method1854(0, arg1);
            if (var4 == null) {
                return null;
            } else {
                class617 var5 = new class617(new class511(var4));
                this.field903.method1799(var5, -1, (long) arg1);
                return var5;
            }
        } else {
            return (class617) var3;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZIFZI)[I", line = 82)
    public final int[] method578(int arg0, boolean arg1, int arg2, float arg3, boolean arg4, int arg5) {
        field912++;
        if (!arg4) {
            this.method574(0.21908069F, false, 117, 61, -97, 126);
        }
        return this.method577(-97, arg2).method3557(this.field914, (double) arg3, arg5, -29177, this, this.field920[arg2].field10261, arg0, arg1);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IFZIII)[I", line = 93)
    public final int[] method579(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field910++;
        if (arg3 != 5084) {
            this.field919 = null;
        }
        return this.method577(-55, arg0).method3561(this.field914, arg5, false, arg4, this.field920[arg0].field10261, this, (double) arg1);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I", line = 108)
    public final int method580(int arg0) {
        if (arg0 != -31778) {
            field904 = null;
        }
        field905++;
        return this.field907;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Lqr;", line = 121)
    public final class744 method581(int arg0, int arg1) {
        field918++;
        if (arg0 != -21732) {
            this.field920 = null;
        }
        return this.field920[arg1];
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZB)V", line = 132)
    public static final void method582(boolean arg0, byte arg1) {
        field909++;
        class688.field9602.method3503(class688.field9602.field8539, -125, 0);
        class688.field9602.method3503(class688.field9602.field8542, -128, 0);
        class688.field9602.method3503(class688.field9602.field8530, -124, 1);
        class688.field9602.method3503(class688.field9602.field8532, -128, 1);
        class688.field9602.method3503(class688.field9602.field8508, -126, 0);
        class688.field9602.method3503(class688.field9602.field8499, -126, 0);
        class688.field9602.method3503(class688.field9602.field8551, -127, 0);
        class688.field9602.method3503(class688.field9602.field8501, -127, 0);
        class688.field9602.method3503(class688.field9602.field8512, -123, 0);
        class688.field9602.method3503(class688.field9602.field8547, -125, 0);
        class688.field9602.method3503(class688.field9602.field8538, -123, 0);
        class688.field9602.method3503(class688.field9602.field8506, -124, 0);
        class688.field9602.method3503(class688.field9602.field8528, -125, 0);
        class688.field9602.method3503(class688.field9602.field8507, -128, 0);
        class688.field9602.method3503(class688.field9602.field8540, -128, 0);
        class688.field9602.method3503(class688.field9602.field8529, -127, 0);
        class688.field9602.method3503(class688.field9602.field8541, -122, 0);
        class688.field9602.method3503(class688.field9602.field8516, -122, 0);
        class688.field9602.method3503(class688.field9602.field8544, -126, 0);
        if (arg1 < 30) {
            return;
        }
        class679.method3864(true);
        class688.field9602.method3503(class688.field9602.field8523, -124, 2);
        class688.field9602.method3503(class688.field9602.field8553, -123, 1);
        class511.method3009(-14603);
        class271.method1768((byte) -70);
        class501.field6854 = true;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)Z", line = 180)
    public final boolean method583(int arg0, int arg1) {
        if (arg0 == 12101) {
            field916++;
            class617 var3 = this.method577(-48, arg1);
            return var3 != null && var3.method3559(false, this, this.field914);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lae;Lae;Lae;)V", line = 196)
    public class81(class283 arg0, class283 arg1, class283 arg2) {
        this.field914 = arg2;
        this.field919 = arg1;
        class511 var4 = new class511(arg0.method1849(0, (byte) 32, 0));
        this.field907 = var4.method3002(-1);
        this.field920 = new class744[this.field907];
        for (int var5 = 0; var5 < this.field907; var5++) {
            if (var4.method3013(42) == 1) {
                this.field920[var5] = new class744();
            }
        }
        for (int var6 = 0; var6 < this.field907; var6++) {
            if (this.field920[var6] != null) {
                this.field920[var6].field10264 = var4.method3013(-100) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field907; var7++) {
            if (this.field920[var7] != null) {
                this.field920[var7].field10265 = var4.method3013(57) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field907; var8++) {
            if (this.field920[var8] != null) {
                this.field920[var8].field10249 = var4.method3013(63) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field907; var9++) {
            if (this.field920[var9] != null) {
                this.field920[var9].field10262 = var4.method3030(-25984);
            }
        }
        for (int var10 = 0; var10 < this.field907; var10++) {
            if (this.field920[var10] != null) {
                this.field920[var10].field10269 = var4.method3030(-25984);
            }
        }
        for (int var11 = 0; var11 < this.field907; var11++) {
            if (this.field920[var11] != null) {
                this.field920[var11].field10273 = var4.method3030(-25984);
            }
        }
        for (int var12 = 0; var12 < this.field907; var12++) {
            if (this.field920[var12] != null) {
                this.field920[var12].field10257 = var4.method3030(-25984);
            }
        }
        for (int var13 = 0; var13 < this.field907; var13++) {
            if (this.field920[var13] != null) {
                this.field920[var13].field10266 = (short) var4.method3002(-1);
            }
        }
        for (int var14 = 0; var14 < this.field907; var14++) {
            if (this.field920[var14] != null) {
                this.field920[var14].field10259 = var4.method3030(-25984);
            }
        }
        for (int var15 = 0; var15 < this.field907; var15++) {
            if (this.field920[var15] != null) {
                this.field920[var15].field10268 = var4.method3030(-25984);
            }
        }
        for (int var16 = 0; var16 < this.field907; var16++) {
            if (this.field920[var16] != null) {
                this.field920[var16].field10263 = var4.method3013(111) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field907; var17++) {
            if (this.field920[var17] != null) {
                this.field920[var17].field10261 = var4.method3013(-96) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field907; var18++) {
            if (this.field920[var18] != null) {
                this.field920[var18].field10270 = var4.method3030(-25984);
            }
        }
        for (int var19 = 0; var19 < this.field907; var19++) {
            if (this.field920[var19] != null) {
                this.field920[var19].field10253 = var4.method3013(-112) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field907; var20++) {
            if (this.field920[var20] != null) {
                this.field920[var20].field10255 = var4.method3013(-126) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field907; var21++) {
            if (this.field920[var21] != null) {
                this.field920[var21].field10252 = var4.method3013(118) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field907; var22++) {
            if (this.field920[var22] != null) {
                this.field920[var22].field10256 = var4.method3013(-92);
            }
        }
        for (int var23 = 0; var23 < this.field907; var23++) {
            if (this.field920[var23] != null) {
                this.field920[var23].field10267 = var4.method3008(64);
            }
        }
        for (int var24 = 0; var24 < this.field907; var24++) {
            if (this.field920[var24] != null) {
                this.field920[var24].field10258 = var4.method3013(-121);
            }
        }
    }
}
