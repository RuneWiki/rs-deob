import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class448 implements class17 {

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Luk;")
    private class219 field6269 = new class219(256);

    @OriginalMember(owner = "client!um", name = "d", descriptor = "Lkda;")
    private class328 field6268;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Lkda;")
    private class328 field6266;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    private int field6278;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "[Llba;")
    private class471[] field6267;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6273 = null;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field6279 = 0;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field6280 = 0;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IFIZZI)[F", line = 3)
    public final float[] method108(int arg0, float arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        if (arg3) {
            field6280 = 59;
        }
        field6270++;
        return this.method2711(arg0, 0).method3525(arg2, arg5, 73, this.field6267[arg0].field6641, this.field6266, this);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIIIF)[I", line = 21)
    public final int[] method111(int arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        if (arg3 == 6925) {
            field6274++;
            return this.method2711(arg4, 0).method3518((double) arg5, (byte) 119, this.field6266, arg0, this, this.field6267[arg4].field6641, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 32)
    public static void method2710(int arg0) {
        if (arg0 < 17) {
            field6280 = -112;
        }
        field6273 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)I", line = 46)
    public final int method112(int arg0) {
        field6276++;
        int var2 = 67 % ((52 - arg0) / 62);
        return this.field6278;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)Z", line = 59)
    public final boolean method109(int arg0, int arg1) {
        field6275++;
        if (arg1 != 1680) {
            method2710(-99);
        }
        class595 var3 = this.method2711(arg0, arg1 - 1680);
        return var3 != null && var3.method3519(this.field6266, this, (byte) -121);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)Lev;", line = 72)
    private final class595 method2711(int arg0, int arg1) {
        field6271++;
        class501 var3 = this.field6269.method1423((byte) 89, (long) arg0);
        if (var3 != null) {
            return (class595) var3;
        }
        byte[] var4 = this.field6268.method1984(arg1 ^ 0x686, arg0);
        if (arg1 != 0) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            class595 var5 = new class595(new class148(var4));
            this.field6269.method1422((long) arg0, var5, -91);
            return var5;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)Llba;", line = 98)
    public final class471 method110(int arg0, byte arg1) {
        field6265++;
        return arg1 < 96 ? null : this.field6267[arg0];
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIIFI)[I", line = 115)
    public final int[] method113(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5) {
        if (arg2 != -4074) {
            this.field6267 = null;
        }
        field6277++;
        return this.method2711(arg5, 0).method3523(arg0, arg3, -127, this.field6266, this, arg1, this.field6267[arg5].field6641, (double) arg4);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lkda;Lkda;Lkda;)V", line = 132)
    public class448(class328 arg0, class328 arg1, class328 arg2) {
        this.field6268 = arg1;
        this.field6266 = arg2;
        class148 var4 = new class148(arg0.method1966(0, 0, true));
        this.field6278 = var4.method1045(true);
        this.field6267 = new class471[this.field6278];
        for (int var5 = 0; var5 < this.field6278; var5++) {
            if (var4.method1032((byte) -33) == 1) {
                this.field6267[var5] = new class471();
            }
        }
        for (int var6 = 0; var6 < this.field6278; var6++) {
            if (this.field6267[var6] != null) {
                this.field6267[var6].field6653 = var4.method1032((byte) -33) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field6278; var7++) {
            if (this.field6267[var7] != null) {
                this.field6267[var7].field6658 = var4.method1032((byte) -33) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field6278; var8++) {
            if (this.field6267[var8] != null) {
                this.field6267[var8].field6651 = var4.method1032((byte) -33) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field6278; var9++) {
            if (this.field6267[var9] != null) {
                this.field6267[var9].field6640 = var4.method1032((byte) -33) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field6278; var10++) {
            if (this.field6267[var10] != null) {
                this.field6267[var10].field6657 = var4.method1062(-21188);
            }
        }
        for (int var11 = 0; var11 < this.field6278; var11++) {
            if (this.field6267[var11] != null) {
                this.field6267[var11].field6660 = var4.method1062(-21188);
            }
        }
        for (int var12 = 0; var12 < this.field6278; var12++) {
            if (this.field6267[var12] != null) {
                this.field6267[var12].field6646 = var4.method1062(-21188);
            }
        }
        for (int var13 = 0; var13 < this.field6278; var13++) {
            if (this.field6267[var13] != null) {
                this.field6267[var13].field6649 = var4.method1062(-21188);
            }
        }
        for (int var14 = 0; var14 < this.field6278; var14++) {
            if (this.field6267[var14] != null) {
                this.field6267[var14].field6642 = (short) var4.method1045(true);
            }
        }
        for (int var15 = 0; var15 < this.field6278; var15++) {
            if (this.field6267[var15] != null) {
                this.field6267[var15].field6656 = var4.method1062(-21188);
            }
        }
        for (int var16 = 0; var16 < this.field6278; var16++) {
            if (this.field6267[var16] != null) {
                this.field6267[var16].field6661 = var4.method1062(-21188);
            }
        }
        for (int var17 = 0; var17 < this.field6278; var17++) {
            if (this.field6267[var17] != null) {
                this.field6267[var17].field6652 = var4.method1032((byte) -33) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field6278; var18++) {
            if (this.field6267[var18] != null) {
                this.field6267[var18].field6641 = var4.method1032((byte) -33) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field6278; var19++) {
            if (this.field6267[var19] != null) {
                this.field6267[var19].field6647 = var4.method1062(-21188);
            }
        }
        for (int var20 = 0; var20 < this.field6278; var20++) {
            if (this.field6267[var20] != null) {
                this.field6267[var20].field6655 = var4.method1032((byte) -33) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field6278; var21++) {
            if (this.field6267[var21] != null) {
                this.field6267[var21].field6654 = var4.method1032((byte) -33) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field6278; var22++) {
            if (this.field6267[var22] != null) {
                this.field6267[var22].field6644 = var4.method1032((byte) -33) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field6278; var23++) {
            if (this.field6267[var23] != null) {
                this.field6267[var23].field6643 = var4.method1032((byte) -33);
            }
        }
        for (int var24 = 0; var24 < this.field6278; var24++) {
            if (this.field6267[var24] != null) {
                this.field6267[var24].field6650 = var4.method1026(-917302120);
            }
        }
        for (int var25 = 0; var25 < this.field6278; var25++) {
            if (this.field6267[var25] != null) {
                this.field6267[var25].field6645 = var4.method1032((byte) -33) == 1;
            }
        }
    }
}
