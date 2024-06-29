import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class635 implements class522 {

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "Lin;")
    private class223 field8777 = new class223(256);

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "Lga;")
    private class332 field8774;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "Lga;")
    private class332 field8780;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    private int field8782;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "[Lcea;")
    private class105[] field8772;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "Ltt;")
    public static class338 field8775 = new class338(33, 8);

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "Lsk;")
    public static class452 field8783 = new class452(1);

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "F")
    public static float field8787 = 0.0F;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
    public static void method3516(int arg0) {
        field8775 = null;
        field8783 = null;
        if (arg0 > -75) {
            field8787 = 0.06371023F;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI)Z")
    public final boolean method2961(boolean arg0, int arg1) {
        field8784++;
        class662 var3 = this.method3517(arg0, arg1);
        return var3 != null && var3.method3776(this, this.field8774, 2);
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(ZI)Ldv;")
    private final class662 method3517(boolean arg0, int arg1) {
        field8785++;
        class339 var3 = this.field8777.method1390((long) arg1, (byte) 78);
        if (var3 != null) {
            return (class662) var3;
        }
        byte[] var4 = this.field8780.method1946(0, arg1);
        if (var4 == null) {
            return null;
        } else if (arg0) {
            class662 var5 = new class662(new class157(var4));
            this.field8777.method1393((long) arg1, -91, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZIFII)[F")
    public final float[] method2960(int arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5) {
        if (arg2 != 25853) {
            method3516(119);
        }
        field8778++;
        return this.method3517(true, arg4).method3780(arg0, this.field8772[arg4].field1245, 91, arg5, this, this.field8774);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)I")
    public final int method2962(int arg0) {
        field8781++;
        return arg0 < 69 ? -92 : this.field8782;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILio;)Lcaa;")
    public static final class52 method3518(int arg0, class157 arg1) {
        if (arg0 <= 55) {
            return null;
        }
        field8786++;
        class52 var2 = new class52();
        var2.field663 = arg1.method963(-128);
        var2.field664 = class32.field447.method2162((byte) 102, var2.field663);
        return var2;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IBIZFI)[I")
    public final int[] method2964(int arg0, byte arg1, int arg2, boolean arg3, float arg4, int arg5) {
        if (arg1 != 67) {
            this.method2960(-115, true, -29, -2.003765F, 99, 27);
        }
        field8779++;
        return this.method3517(true, arg0).method3778(-10304, arg3, arg5, this.field8772[arg0].field1245, arg2, this, this.field8774, (double) arg4);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)Lcea;")
    public final class105 method2959(int arg0, int arg1) {
        field8776++;
        return arg0 < 61 ? null : this.field8772[arg1];
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZIZIFI)[I")
    public final int[] method2963(boolean arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5) {
        field8773++;
        if (!arg2) {
            this.method3517(false, -98);
        }
        return this.method3517(true, arg5).method3781(arg1, arg3, this.field8774, this.field8772[arg5].field1245, 93, this, (double) arg4);
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lga;Lga;Lga;)V")
    public class635(class332 arg0, class332 arg1, class332 arg2) {
        this.field8774 = arg2;
        this.field8780 = arg1;
        class157 var4 = new class157(arg0.method1938(0, 0, -17));
        this.field8782 = var4.method963(-124);
        this.field8772 = new class105[this.field8782];
        for (int var5 = 0; var5 < this.field8782; var5++) {
            if (var4.method930(255) == 1) {
                this.field8772[var5] = new class105();
            }
        }
        for (int var6 = 0; var6 < this.field8782; var6++) {
            if (this.field8772[var6] != null) {
                this.field8772[var6].field1249 = var4.method930(255) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field8782; var7++) {
            if (this.field8772[var7] != null) {
                this.field8772[var7].field1250 = var4.method930(255) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field8782; var8++) {
            if (this.field8772[var8] != null) {
                this.field8772[var8].field1260 = var4.method930(255) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field8782; var9++) {
            if (this.field8772[var9] != null) {
                this.field8772[var9].field1256 = var4.method930(255) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field8782; var10++) {
            if (this.field8772[var10] != null) {
                this.field8772[var10].field1263 = var4.method969(3);
            }
        }
        for (int var11 = 0; var11 < this.field8782; var11++) {
            if (this.field8772[var11] != null) {
                this.field8772[var11].field1244 = var4.method969(3);
            }
        }
        for (int var12 = 0; var12 < this.field8782; var12++) {
            if (this.field8772[var12] != null) {
                this.field8772[var12].field1255 = var4.method969(3);
            }
        }
        for (int var13 = 0; var13 < this.field8782; var13++) {
            if (this.field8772[var13] != null) {
                this.field8772[var13].field1246 = var4.method969(3);
            }
        }
        for (int var14 = 0; var14 < this.field8782; var14++) {
            if (this.field8772[var14] != null) {
                this.field8772[var14].field1262 = (short) var4.method963(-123);
            }
        }
        for (int var15 = 0; var15 < this.field8782; var15++) {
            if (this.field8772[var15] != null) {
                this.field8772[var15].field1258 = var4.method969(3);
            }
        }
        for (int var16 = 0; var16 < this.field8782; var16++) {
            if (this.field8772[var16] != null) {
                this.field8772[var16].field1248 = var4.method969(3);
            }
        }
        for (int var17 = 0; var17 < this.field8782; var17++) {
            if (this.field8772[var17] != null) {
                this.field8772[var17].field1247 = var4.method930(255) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field8782; var18++) {
            if (this.field8772[var18] != null) {
                this.field8772[var18].field1245 = var4.method930(255) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field8782; var19++) {
            if (this.field8772[var19] != null) {
                this.field8772[var19].field1261 = var4.method969(3);
            }
        }
        for (int var20 = 0; var20 < this.field8782; var20++) {
            if (this.field8772[var20] != null) {
                this.field8772[var20].field1254 = var4.method930(255) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field8782; var21++) {
            if (this.field8772[var21] != null) {
                this.field8772[var21].field1264 = var4.method930(255) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field8782; var22++) {
            if (this.field8772[var22] != null) {
                this.field8772[var22].field1251 = var4.method930(255) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field8782; var23++) {
            if (this.field8772[var23] != null) {
                this.field8772[var23].field1257 = var4.method930(255);
            }
        }
        for (int var24 = 0; var24 < this.field8782; var24++) {
            if (this.field8772[var24] != null) {
                this.field8772[var24].field1259 = var4.method908(false);
            }
        }
        for (int var25 = 0; var25 < this.field8782; var25++) {
            if (this.field8772[var25] != null) {
                this.field8772[var25].field1253 = var4.method930(255) == 1;
            }
        }
    }
}
