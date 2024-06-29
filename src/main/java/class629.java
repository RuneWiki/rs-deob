import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class629 implements class161 {

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "Ljv;")
    private class87 field8801 = new class87(256);

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "Laj;")
    private class333 field8810;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "Laj;")
    private class333 field8806;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "I")
    private int field8805;

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "[Lgj;")
    private class662[] field8809;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "F")
    public static float field8807;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIFIZ)[I")
    public final int[] method1178(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5) {
        if (arg2 > -87) {
            return null;
        } else {
            field8813++;
            return this.method3535(arg1, true).method1579(arg4, (double) arg3, this.field8809[arg1].field9138, this.field8806, this, 101, arg0);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IZ)Lue;")
    private final class245 method3535(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1176((byte) -124, 71, false, -0.7712839F, -126, -91);
        }
        field8812++;
        class281 var3 = this.field8801.method713((long) arg0, 110);
        if (var3 != null) {
            return (class245) var3;
        }
        byte[] var4 = this.field8810.method2114(arg0, false);
        if (var4 == null) {
            return null;
        } else {
            class245 var5 = new class245(new class376(var4));
            this.field8801.method717(var5, 114, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BIZFII)[F")
    public final float[] method1176(byte arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        field8811++;
        if (arg0 != -13) {
            this.field8805 = 91;
        }
        return this.method3535(arg4, true).method1577(this.field8809[arg4].field9138, false, arg1, this.field8806, this, arg5);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZIFIB)[I")
    public final int[] method1177(int arg0, boolean arg1, int arg2, float arg3, int arg4, byte arg5) {
        field8802++;
        if (arg5 >= -89) {
            this.field8806 = null;
        }
        return this.method3535(arg4, true).method1578(this.field8806, arg2, arg1, (double) arg3, this, this.field8809[arg4].field9138, arg0, false);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZI)Z")
    public final boolean method1173(boolean arg0, int arg1) {
        field8804++;
        class245 var3 = this.method3535(arg1, arg0);
        return var3 != null && var3.method1576(this, this.field8806, (byte) 37);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)I")
    public final int method1175(byte arg0) {
        field8814++;
        int var2 = 10 / ((-arg0 - 75) / 50);
        return this.field8805;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Laj;Laj;Laj;)V")
    public class629(class333 arg0, class333 arg1, class333 arg2) {
        this.field8810 = arg1;
        this.field8806 = arg2;
        class376 var4 = new class376(arg0.method2095(0, 0, 1));
        this.field8805 = var4.method2359(-1);
        this.field8809 = new class662[this.field8805];
        for (int var5 = 0; var5 < this.field8805; var5++) {
            if (var4.method2398(-1372747256) == 1) {
                this.field8809[var5] = new class662();
            }
        }
        for (int var6 = 0; var6 < this.field8805; var6++) {
            if (this.field8809[var6] != null) {
                this.field8809[var6].field9142 = var4.method2398(-1372747256) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field8805; var7++) {
            if (this.field8809[var7] != null) {
                this.field8809[var7].field9143 = var4.method2398(-1372747256) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field8805; var8++) {
            if (this.field8809[var8] != null) {
                this.field8809[var8].field9150 = var4.method2398(-1372747256) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field8805; var9++) {
            if (this.field8809[var9] != null) {
                this.field8809[var9].field9133 = var4.method2387((byte) 97);
            }
        }
        for (int var10 = 0; var10 < this.field8805; var10++) {
            if (this.field8809[var10] != null) {
                this.field8809[var10].field9146 = var4.method2387((byte) 119);
            }
        }
        for (int var11 = 0; var11 < this.field8805; var11++) {
            if (this.field8809[var11] != null) {
                this.field8809[var11].field9140 = var4.method2387((byte) -116);
            }
        }
        for (int var12 = 0; var12 < this.field8805; var12++) {
            if (this.field8809[var12] != null) {
                this.field8809[var12].field9149 = var4.method2387((byte) -108);
            }
        }
        for (int var13 = 0; var13 < this.field8805; var13++) {
            if (this.field8809[var13] != null) {
                this.field8809[var13].field9137 = (short) var4.method2359(-1);
            }
        }
        for (int var14 = 0; var14 < this.field8805; var14++) {
            if (this.field8809[var14] != null) {
                this.field8809[var14].field9152 = var4.method2387((byte) 32);
            }
        }
        for (int var15 = 0; var15 < this.field8805; var15++) {
            if (this.field8809[var15] != null) {
                this.field8809[var15].field9157 = var4.method2387((byte) 117);
            }
        }
        for (int var16 = 0; var16 < this.field8805; var16++) {
            if (this.field8809[var16] != null) {
                this.field8809[var16].field9139 = var4.method2398(-1372747256) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field8805; var17++) {
            if (this.field8809[var17] != null) {
                this.field8809[var17].field9138 = var4.method2398(-1372747256) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field8805; var18++) {
            if (this.field8809[var18] != null) {
                this.field8809[var18].field9153 = var4.method2387((byte) 84);
            }
        }
        for (int var19 = 0; var19 < this.field8805; var19++) {
            if (this.field8809[var19] != null) {
                this.field8809[var19].field9155 = var4.method2398(-1372747256) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field8805; var20++) {
            if (this.field8809[var20] != null) {
                this.field8809[var20].field9147 = var4.method2398(-1372747256) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field8805; var21++) {
            if (this.field8809[var21] != null) {
                this.field8809[var21].field9158 = var4.method2398(-1372747256) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field8805; var22++) {
            if (this.field8809[var22] != null) {
                this.field8809[var22].field9141 = var4.method2398(-1372747256);
            }
        }
        for (int var23 = 0; var23 < this.field8805; var23++) {
            if (this.field8809[var23] != null) {
                this.field8809[var23].field9154 = var4.method2384(10);
            }
        }
        for (int var24 = 0; var24 < this.field8805; var24++) {
            if (this.field8809[var24] != null) {
                this.field8809[var24].field9135 = var4.method2398(-1372747256);
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZ)Lgj;")
    public final class662 method1174(int arg0, boolean arg1) {
        field8808++;
        if (!arg1) {
            this.field8805 = -18;
        }
        return this.field8809[arg0];
    }
}
