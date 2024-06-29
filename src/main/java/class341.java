import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class341 implements class473 {

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "Lnc;")
    private class538 field4750 = new class538(256);

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Lkr;")
    private class329 field4748;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lkr;")
    private class329 field4735;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    private int field4738;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[Loo;")
    private class41[] field4747;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lvt;")
    public static class344 field4739 = new class344("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Ltt;")
    public static class312 field4741;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)I")
    public static final int method2142(int arg0) {
        if (arg0 == 6061) {
            field4751++;
            return 14;
        } else {
            return -79;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBZIFI)[I")
    public final int[] method2143(int arg0, byte arg1, boolean arg2, int arg3, float arg4, int arg5) {
        field4749++;
        return arg1 == 15 ? this.method2145(arg0, 113).method2428(arg3, this.field4735, arg5, this, this.field4747[arg0].field615, arg2, (double) arg4, -97) : null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)Z")
    public final boolean method2144(int arg0, int arg1) {
        field4742++;
        class407 var3 = this.method2145(arg1, 120);
        int var4 = -81 / ((61 - arg0) / 62);
        return var3 != null && var3.method2427(this, this.field4735, -122);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Leea;")
    private final class407 method2145(int arg0, int arg1) {
        field4745++;
        class561 var3 = this.field4750.method2995(791, (long) arg0);
        if (var3 != null) {
            return (class407) var3;
        }
        byte[] var4 = this.field4748.method2076(1, arg0);
        if (var4 == null) {
            return null;
        } else {
            int var5 = -97 % ((arg1 - 37) / 42);
            class407 var6 = new class407(new class551(var4));
            this.field4750.method2993(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(IIIIZF)[I")
    public final int[] method2146(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5) {
        if (arg0 != -20243) {
            this.field4748 = null;
        }
        field4746++;
        return this.method2145(arg2, arg0 ^ 0xFFFFB086).method2426(arg3, arg0 - 1446795401, this.field4747[arg2].field615, this, arg1, this.field4735, (double) arg5);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)I")
    public static final int method2147(int arg0, int arg1, int arg2, int arg3) {
        field4744++;
        if (class501.field6947 == null) {
            return 0;
        }
        int var4 = arg1 >> 9;
        int var5 = arg3 >> 9;
        if (var4 < arg2 || var5 < 0 || class139.field1760 - 1 < var4 || var5 > (class369.field5135 - 1)) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class310.field3971[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class501.field6947[var6].method1040(arg1, arg3);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
    public final int method2148(int arg0) {
        if (arg0 != -23093) {
            this.field4747 = null;
        }
        field4737++;
        return this.field4738;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method2149(int arg0) {
        field4739 = null;
        if (arg0 != 212458441) {
            field4741 = null;
        }
        field4741 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIZF)[F")
    public final float[] method2150(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5) {
        field4736++;
        if (arg0 != -17640) {
            this.method2150(-82, -96, 14, -60, false, -1.1126809F);
        }
        return this.method2145(arg2, arg0 ^ 0xFFFFBB46).method2430(arg3, this.field4747[arg2].field615, this.field4735, arg0 + 17757, arg1, this);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)Loo;")
    public final class41 method2151(boolean arg0, int arg1) {
        field4740++;
        if (!arg0) {
            this.field4738 = 103;
        }
        return this.field4747[arg1];
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lkr;Lkr;Lkr;)V")
    public class341(class329 arg0, class329 arg1, class329 arg2) {
        this.field4748 = arg1;
        this.field4735 = arg2;
        class551 var4 = new class551(arg0.method2054(true, 0, 0));
        this.field4738 = var4.method3090(-70);
        this.field4747 = new class41[this.field4738];
        for (int var5 = 0; var5 < this.field4738; var5++) {
            if (var4.method3045(-126) == 1) {
                this.field4747[var5] = new class41();
            }
        }
        for (int var6 = 0; var6 < this.field4738; var6++) {
            if (this.field4747[var6] != null) {
                this.field4747[var6].field604 = var4.method3045(-128) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field4738; var7++) {
            if (this.field4747[var7] != null) {
                this.field4747[var7].field610 = var4.method3045(-125) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field4738; var8++) {
            if (this.field4747[var8] != null) {
                this.field4747[var8].field613 = var4.method3045(-125) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field4738; var9++) {
            if (this.field4747[var9] != null) {
                this.field4747[var9].field608 = var4.method3045(-128) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field4738; var10++) {
            if (this.field4747[var10] != null) {
                this.field4747[var10].field614 = var4.method3051((byte) 110);
            }
        }
        for (int var11 = 0; var11 < this.field4738; var11++) {
            if (this.field4747[var11] != null) {
                this.field4747[var11].field600 = var4.method3051((byte) 106);
            }
        }
        for (int var12 = 0; var12 < this.field4738; var12++) {
            if (this.field4747[var12] != null) {
                this.field4747[var12].field620 = var4.method3051((byte) 99);
            }
        }
        for (int var13 = 0; var13 < this.field4738; var13++) {
            if (this.field4747[var13] != null) {
                this.field4747[var13].field618 = var4.method3051((byte) 79);
            }
        }
        for (int var14 = 0; var14 < this.field4738; var14++) {
            if (this.field4747[var14] != null) {
                this.field4747[var14].field612 = (short) var4.method3090(-114);
            }
        }
        for (int var15 = 0; var15 < this.field4738; var15++) {
            if (this.field4747[var15] != null) {
                this.field4747[var15].field601 = var4.method3051((byte) -65);
            }
        }
        for (int var16 = 0; var16 < this.field4738; var16++) {
            if (this.field4747[var16] != null) {
                this.field4747[var16].field617 = var4.method3051((byte) 96);
            }
        }
        for (int var17 = 0; var17 < this.field4738; var17++) {
            if (this.field4747[var17] != null) {
                this.field4747[var17].field611 = var4.method3045(-125) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field4738; var18++) {
            if (this.field4747[var18] != null) {
                this.field4747[var18].field615 = var4.method3045(-127) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field4738; var19++) {
            if (this.field4747[var19] != null) {
                this.field4747[var19].field606 = var4.method3051((byte) 74);
            }
        }
        for (int var20 = 0; var20 < this.field4738; var20++) {
            if (this.field4747[var20] != null) {
                this.field4747[var20].field616 = var4.method3045(-128) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field4738; var21++) {
            if (this.field4747[var21] != null) {
                this.field4747[var21].field607 = var4.method3045(-127) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field4738; var22++) {
            if (this.field4747[var22] != null) {
                this.field4747[var22].field619 = var4.method3045(-126) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field4738; var23++) {
            if (this.field4747[var23] != null) {
                this.field4747[var23].field605 = var4.method3045(-125);
            }
        }
        for (int var24 = 0; var24 < this.field4738; var24++) {
            if (this.field4747[var24] != null) {
                this.field4747[var24].field602 = var4.method3048(-4);
            }
        }
        for (int var25 = 0; var25 < this.field4738; var25++) {
            if (this.field4747[var25] != null) {
                this.field4747[var25].field603 = var4.method3045(-125) == 1;
            }
        }
    }
}
