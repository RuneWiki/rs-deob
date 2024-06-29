import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class312 implements class17 {

    @OriginalMember(owner = "client!om", name = "a", descriptor = "Lfn;")
    private class118 field3980 = new class118(256);

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Ldn;")
    private class438 field3988;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "Ldn;")
    private class438 field3985;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    private int field3986;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "[Luk;")
    private class217[] field3982;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "F")
    public static float field3994;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Lvj;")
    public static class373 field3981;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)Z")
    public final boolean method118(int arg0, byte arg1) {
        if (arg1 <= 24) {
            return false;
        } else {
            field3987++;
            class497 var3 = this.method1734(arg0, false);
            return var3 != null && var3.method2871(this.field3988, 0, this);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIFIZI)[F")
    public final float[] method117(int arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 == 16173) {
            field3984++;
            return this.method1734(arg5, false).method2866(false, arg1, this.field3988, this.field3982[arg5].field2661, this, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public static final void method1733(int arg0) {
        field3992++;
        if (arg0 < 11) {
            field3981 = null;
        }
        if (class197.field2381 == 6) {
            class197.field2381 = 7;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)I")
    public final int method115(int arg0) {
        if (arg0 != 23666) {
            this.field3988 = null;
        }
        field3989++;
        return this.field3986;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZFIII)[I")
    public final int[] method120(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= 75) {
            return null;
        } else {
            field3993++;
            return this.method1734(arg3, false).method2869(this.field3982[arg3].field2661, arg1, (double) arg2, arg4, this, (byte) -105, arg0, this.field3988);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(FIIZII)[I")
    public final int[] method116(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 != -115) {
            this.field3985 = null;
        }
        field3983++;
        return this.method1734(arg5, false).method2867(this, this.field3988, (double) arg0, (byte) -81, arg2, this.field3982[arg5].field2661, arg4);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)Lht;")
    private final class497 method1734(int arg0, boolean arg1) {
        field3991++;
        class9 var3 = this.field3980.method696(3, (long) arg0);
        if (var3 != null) {
            return (class497) var3;
        }
        byte[] var4 = this.field3985.method2560(arg0, -6914);
        if (var4 == null) {
            return null;
        }
        if (arg1) {
            this.method115(-121);
        }
        class497 var5 = new class497(new class374(var4));
        this.field3980.method691((byte) 91, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public static void method1735(int arg0) {
        if (arg0 != -1) {
            field3994 = -0.6515816F;
        }
        field3981 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Luk;")
    public final class217 method119(int arg0, int arg1) {
        field3990++;
        if (arg0 >= -104) {
            this.method118(-23, (byte) 101);
        }
        return this.field3982[arg1];
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Ldn;Ldn;Ldn;)V")
    public class312(class438 arg0, class438 arg1, class438 arg2) {
        this.field3988 = arg2;
        this.field3985 = arg1;
        class374 var4 = new class374(arg0.method2558(100, 0, 0));
        this.field3986 = var4.method2136(false);
        this.field3982 = new class217[this.field3986];
        for (int var5 = 0; var5 < this.field3986; var5++) {
            if (var4.method2129(-88) == 1) {
                this.field3982[var5] = new class217();
            }
        }
        for (int var6 = 0; var6 < this.field3986; var6++) {
            if (this.field3982[var6] != null) {
                this.field3982[var6].field2646 = var4.method2129(-115) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field3986; var7++) {
            if (this.field3982[var7] != null) {
                this.field3982[var7].field2650 = var4.method2129(-127) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field3986; var8++) {
            if (this.field3982[var8] != null) {
                this.field3982[var8].field2642 = var4.method2129(-101) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field3986; var9++) {
            if (this.field3982[var9] != null) {
                this.field3982[var9].field2652 = var4.method2129(-105) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field3986; var10++) {
            if (this.field3982[var10] != null) {
                this.field3982[var10].field2644 = var4.method2124(29);
            }
        }
        for (int var11 = 0; var11 < this.field3986; var11++) {
            if (this.field3982[var11] != null) {
                this.field3982[var11].field2656 = var4.method2124(-10);
            }
        }
        for (int var12 = 0; var12 < this.field3986; var12++) {
            if (this.field3982[var12] != null) {
                this.field3982[var12].field2657 = var4.method2124(102);
            }
        }
        for (int var13 = 0; var13 < this.field3986; var13++) {
            if (this.field3982[var13] != null) {
                this.field3982[var13].field2648 = var4.method2124(-33);
            }
        }
        for (int var14 = 0; var14 < this.field3986; var14++) {
            if (this.field3982[var14] != null) {
                this.field3982[var14].field2641 = (short) var4.method2136(false);
            }
        }
        for (int var15 = 0; var15 < this.field3986; var15++) {
            if (this.field3982[var15] != null) {
                this.field3982[var15].field2651 = var4.method2124(-12);
            }
        }
        for (int var16 = 0; var16 < this.field3986; var16++) {
            if (this.field3982[var16] != null) {
                this.field3982[var16].field2660 = var4.method2124(-17);
            }
        }
        for (int var17 = 0; var17 < this.field3986; var17++) {
            if (this.field3982[var17] != null) {
                this.field3982[var17].field2645 = var4.method2129(-127) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field3986; var18++) {
            if (this.field3982[var18] != null) {
                this.field3982[var18].field2661 = var4.method2129(-109) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field3986; var19++) {
            if (this.field3982[var19] != null) {
                this.field3982[var19].field2654 = var4.method2124(-127);
            }
        }
        for (int var20 = 0; var20 < this.field3986; var20++) {
            if (this.field3982[var20] != null) {
                this.field3982[var20].field2659 = var4.method2129(-67) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field3986; var21++) {
            if (this.field3982[var21] != null) {
                this.field3982[var21].field2653 = var4.method2129(-72) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field3986; var22++) {
            if (this.field3982[var22] != null) {
                this.field3982[var22].field2655 = var4.method2129(-123) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field3986; var23++) {
            if (this.field3982[var23] != null) {
                this.field3982[var23].field2658 = var4.method2129(-70);
            }
        }
        for (int var24 = 0; var24 < this.field3986; var24++) {
            if (this.field3982[var24] != null) {
                this.field3982[var24].field2643 = var4.method2123(false);
            }
        }
        for (int var25 = 0; var25 < this.field3986; var25++) {
            if (this.field3982[var25] != null) {
                this.field3982[var25].field2640 = var4.method2129(-69) == 1;
            }
        }
    }

    static {
        new class180(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
    }
}
