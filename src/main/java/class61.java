import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class61 implements class152 {

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Lno;")
    private class420 field836 = new class420(256);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Lnq;")
    private class268 field832;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lnq;")
    private class268 field834;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[Lmp;")
    private class454[] field839;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Z")
    public static boolean field845;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Lnq;")
    public static class268 field847;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "[Lsg;")
    public static class226[] field846;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B[[[Ljd;)V")
    public static final void method466(byte arg0, class125[][][] arg1) {
        field842++;
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class125[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class125 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field1739 instanceof class193) {
                            ((class193) var6.field1739).method680(-24686);
                        }
                        if (var6.field1740 instanceof class193) {
                            ((class193) var6.field1740).method680(-24686);
                        }
                        if (var6.field1750 instanceof class193) {
                            ((class193) var6.field1750).method680(-24686);
                        }
                        if (var6.field1756 instanceof class193) {
                            ((class193) var6.field1756).method680(-24686);
                        }
                        if (var6.field1761 instanceof class193) {
                            ((class193) var6.field1761).method680(-24686);
                        }
                        for (class123 var7 = var6.field1749; var7 != null; var7 = var7.field1711) {
                            class447 var8 = var7.field1709;
                            if (var8 instanceof class193) {
                                ((class193) var8).method680(-24686);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 > -65) {
            field847 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Lpp;")
    private final class222 method467(byte arg0, int arg1) {
        field833++;
        class446 var3 = this.field836.method2637((long) arg1, 18620);
        if (var3 != null) {
            return (class222) var3;
        }
        byte[] var4 = this.field832.method1757(arg0 ^ 0x46, arg1);
        if (var4 == null) {
            return null;
        }
        class222 var5 = new class222(new class11(var4));
        if (arg0 != -69) {
            field847 = null;
        }
        this.field836.method2633((byte) -120, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IFIIIZ)[I")
    public final int[] method468(int arg0, float arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 != -24250) {
            this.field834 = null;
        }
        field837++;
        return this.method467((byte) -69, arg4).method1472(false, this.field834, arg3, this.field839[arg4].field6480, arg0, (double) arg1, this);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Lmp;")
    public final class454 method469(int arg0, byte arg1) {
        field840++;
        if (arg1 > -57) {
            this.method472(69, (byte) -46, -0.50635225F, false, 40, 127);
        }
        return this.field839[arg0];
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILuo;Lcf;)I")
    public static final int method470(int arg0, class345 arg1, class361 arg2) {
        if (arg0 <= 121) {
            method470(-123, (class345) null, (class361) null);
        }
        field831++;
        if (arg2.field4994 != -1) {
            return arg2.field4994;
        }
        if (arg2.field4991 != -1) {
            class454 var3 = class163.field2253.method469(arg1.method51() ? arg2.field4991 : arg2.field4995, (byte) -60);
            if (!var3.field6481) {
                return var3.field6489;
            }
        }
        return arg2.field4989;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Lpg;")
    public static final class437 method471(int arg0) {
        field843++;
        if (arg0 >= -123) {
            field847 = null;
        }
        return class282.field3994 < class198.field2753.length ? class198.field2753[class282.field3994++] : null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBFZII)[I")
    public final int[] method472(int arg0, byte arg1, float arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 != -72) {
            this.method473(-66, -84);
        }
        field835++;
        return this.method467((byte) -69, arg4).method1474(arg3, arg5, this.field834, (double) arg2, this, (byte) -35, arg0, this.field839[arg4].field6480);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Z")
    public final boolean method473(int arg0, int arg1) {
        field844++;
        if (arg1 < 91) {
            this.method474(false, 96, 97, 105, -108, -0.8727237F);
        }
        class222 var3 = this.method467((byte) -69, arg0);
        return var3 != null && var3.method1475(this, this.field834, -21036);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIIIF)[F")
    public final float[] method474(boolean arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        field841++;
        if (arg1 != 10682) {
            method471(-11);
        }
        return this.method467((byte) -69, arg3).method1470(arg4, this.field834, this, this.field839[arg3].field6480, 0, arg2);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lnq;Lnq;Lnq;)V")
    public class61(class268 arg0, class268 arg1, class268 arg2) {
        this.field832 = arg1;
        this.field834 = arg2;
        class11 var4 = new class11(arg0.method1745(0, (byte) -127, 0));
        int var5 = var4.method174(255);
        this.field839 = new class454[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method172((byte) 52) == 1) {
                this.field839[var6] = new class454();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field839[var7] != null) {
                this.field839[var7].field6481 = var4.method172((byte) 52) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field839[var8] != null) {
                this.field839[var8].field6485 = var4.method172((byte) 52) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field839[var9] != null) {
                this.field839[var9].field6488 = var4.method172((byte) 52) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field839[var10] != null) {
                this.field839[var10].field6473 = var4.method172((byte) 52) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field839[var11] != null) {
                this.field839[var11].field6474 = var4.method162(-4436);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field839[var12] != null) {
                this.field839[var12].field6493 = var4.method162(-4436);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field839[var13] != null) {
                this.field839[var13].field6471 = var4.method162(-4436);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field839[var14] != null) {
                this.field839[var14].field6476 = var4.method162(-4436);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field839[var15] != null) {
                this.field839[var15].field6489 = (short) var4.method174(255);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field839[var16] != null) {
                this.field839[var16].field6484 = var4.method162(-4436);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field839[var17] != null) {
                this.field839[var17].field6482 = var4.method162(-4436);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field839[var18] != null) {
                this.field839[var18].field6479 = var4.method172((byte) 52) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field839[var19] != null) {
                this.field839[var19].field6480 = var4.method172((byte) 52) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field839[var20] != null) {
                this.field839[var20].field6486 = var4.method162(-4436);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field839[var21] != null) {
                this.field839[var21].field6472 = var4.method172((byte) 52) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field839[var22] != null) {
                this.field839[var22].field6494 = var4.method172((byte) 52) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field839[var23] != null) {
                this.field839[var23].field6483 = var4.method172((byte) 52) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method475(byte arg0) {
        field846 = null;
        field847 = null;
        int var1 = -106 / ((arg0 + 66) / 42);
    }

    static {
        new class442("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field845 = true;
    }
}
