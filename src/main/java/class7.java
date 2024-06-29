import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class7 implements class152 {

    @OriginalMember(owner = "client!to", name = "m", descriptor = "Lvv;")
    private class329 field151 = new class329(256);

    @OriginalMember(owner = "client!to", name = "i", descriptor = "Lwu;")
    private class376 field147;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "Lwu;")
    private class376 field142;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[Lsw;")
    private class758[] field150;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "[I")
    public static int[] field152 = new int[1];

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Lkaa;")
    public static class47 field153 = new class47(23, 11);

    @OriginalMember(owner = "client!to", name = "p", descriptor = "Lkaa;")
    public static class47 field154 = new class47(81, 2);

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)Z")
    public final boolean method85(int arg0, int arg1) {
        field148++;
        class193 var3 = this.method88(false, arg0);
        if (arg1 != -32345) {
            this.field147 = null;
        }
        return var3 != null && var3.method1322(this, this.field142, true);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIFZII)[I")
    public final int[] method86(int arg0, int arg1, float arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 > -116) {
            this.field143 = -125;
        }
        field149++;
        return this.method88(false, arg4).method1324(arg5, (byte) -107, arg3, (double) arg2, this.field142, this, arg1, this.field150[arg4].field10547);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IZIIFI)[F")
    public final float[] method87(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5) {
        field141++;
        if (arg5 != -2202) {
            this.method91(69, (byte) -86);
        }
        return this.method88(false, arg3).method1321(this.field150[arg3].field10547, (byte) -102, arg0, this, this.field142, arg2);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)Lm;")
    private final class193 method88(boolean arg0, int arg1) {
        if (arg0) {
            method89(-117);
        }
        field145++;
        class416 var3 = this.field151.method1988((long) arg1, -1);
        if (var3 != null) {
            return (class193) var3;
        }
        byte[] var4 = this.field147.method2226(-1, arg1);
        if (var4 == null) {
            return null;
        } else {
            class193 var5 = new class193(new class677(var4));
            this.field151.method1987((long) arg1, (byte) 112, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public static void method89(int arg0) {
        field152 = null;
        if (arg0 != 0) {
            method89(-80);
        }
        field153 = null;
        field154 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
    public final int method90(int arg0) {
        if (arg0 != 31363) {
            this.method92(false, (byte) -51, -50, 8, 0.12729302F, 69);
        }
        field144++;
        return this.field143;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IB)Lsw;")
    public final class758 method91(int arg0, byte arg1) {
        if (arg1 < 123) {
            return null;
        } else {
            field139++;
            return this.field150[arg0];
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZBIIFI)[I")
    public final int[] method92(boolean arg0, byte arg1, int arg2, int arg3, float arg4, int arg5) {
        field146++;
        int var7 = 86 % ((-arg1 - 9) / 59);
        return this.method88(false, arg5).method1320((byte) 97, this, arg2, this.field142, (double) arg4, arg3, this.field150[arg5].field10547);
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lwu;Lwu;Lwu;)V")
    public class7(class376 arg0, class376 arg1, class376 arg2) {
        this.field147 = arg1;
        this.field142 = arg2;
        class677 var4 = new class677(arg0.method2218((byte) 116, 0, 0));
        this.field143 = var4.method3807(-1);
        this.field150 = new class758[this.field143];
        for (int var5 = 0; var5 < this.field143; var5++) {
            if (var4.method3821((byte) -79) == 1) {
                this.field150[var5] = new class758();
            }
        }
        for (int var6 = 0; var6 < this.field143; var6++) {
            if (this.field150[var6] != null) {
                this.field150[var6].field10534 = var4.method3821((byte) 71) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field143; var7++) {
            if (this.field150[var7] != null) {
                this.field150[var7].field10548 = var4.method3821((byte) 110) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field143; var8++) {
            if (this.field150[var8] != null) {
                this.field150[var8].field10543 = var4.method3821((byte) 123) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field143; var9++) {
            if (this.field150[var9] != null) {
                this.field150[var9].field10537 = var4.method3811(58);
            }
        }
        for (int var10 = 0; var10 < this.field143; var10++) {
            if (this.field150[var10] != null) {
                this.field150[var10].field10542 = var4.method3811(50);
            }
        }
        for (int var11 = 0; var11 < this.field143; var11++) {
            if (this.field150[var11] != null) {
                this.field150[var11].field10536 = var4.method3811(40);
            }
        }
        for (int var12 = 0; var12 < this.field143; var12++) {
            if (this.field150[var12] != null) {
                this.field150[var12].field10558 = var4.method3811(91);
            }
        }
        for (int var13 = 0; var13 < this.field143; var13++) {
            if (this.field150[var13] != null) {
                this.field150[var13].field10546 = (short) var4.method3807(-1);
            }
        }
        for (int var14 = 0; var14 < this.field143; var14++) {
            if (this.field150[var14] != null) {
                this.field150[var14].field10555 = var4.method3811(61);
            }
        }
        for (int var15 = 0; var15 < this.field143; var15++) {
            if (this.field150[var15] != null) {
                this.field150[var15].field10554 = var4.method3811(79);
            }
        }
        for (int var16 = 0; var16 < this.field143; var16++) {
            if (this.field150[var16] != null) {
                this.field150[var16].field10550 = var4.method3821((byte) 90) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field143; var17++) {
            if (this.field150[var17] != null) {
                this.field150[var17].field10547 = var4.method3821((byte) 99) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field143; var18++) {
            if (this.field150[var18] != null) {
                this.field150[var18].field10535 = var4.method3811(83);
            }
        }
        for (int var19 = 0; var19 < this.field143; var19++) {
            if (this.field150[var19] != null) {
                this.field150[var19].field10544 = var4.method3821((byte) -73) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field143; var20++) {
            if (this.field150[var20] != null) {
                this.field150[var20].field10551 = var4.method3821((byte) 94) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field143; var21++) {
            if (this.field150[var21] != null) {
                this.field150[var21].field10538 = var4.method3821((byte) -96) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field143; var22++) {
            if (this.field150[var22] != null) {
                this.field150[var22].field10545 = var4.method3821((byte) 114);
            }
        }
        for (int var23 = 0; var23 < this.field143; var23++) {
            if (this.field150[var23] != null) {
                this.field150[var23].field10557 = var4.method3799(false);
            }
        }
        for (int var24 = 0; var24 < this.field143; var24++) {
            if (this.field150[var24] != null) {
                this.field150[var24].field10541 = var4.method3821((byte) -73);
            }
        }
    }
}
