import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class281 implements class126 {

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Lgd;")
    private class224 field3800 = new class224(256);

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Lvh;")
    private class240 field3791;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Lvh;")
    private class240 field3797;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "[Llu;")
    private class501[] field3789;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "[S")
    public static short[] field3788 = new short[256];

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field3790 = 0;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "[C")
    public static char[] field3798 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Lfg;")
    public static class83 field3792 = new class83("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method1615(int arg0) {
        field3798 = null;
        field3788 = null;
        if (arg0 != 0) {
            field3798 = null;
        }
        field3792 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIFIII)[I")
    public final int[] method833(boolean arg0, int arg1, float arg2, int arg3, int arg4, int arg5) {
        field3799++;
        return arg3 == -12422 ? this.method1616(arg5, false).method911(arg4, arg0, this.field3797, (byte) -101, this.field3789[arg5].field7374, this, (double) arg2, arg1) : null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZZIFII)[F")
    public final float[] method832(boolean arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5) {
        field3794++;
        if (!arg0) {
            field3788 = null;
        }
        return this.method1616(arg5, !arg0).method915(-74, this, this.field3789[arg5].field7374, arg4, arg2, this.field3797);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)Llu;")
    public final class501 method830(int arg0, byte arg1) {
        if (arg1 == 71) {
            field3793++;
            return this.field3789[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Z")
    public final boolean method831(int arg0, int arg1) {
        field3796++;
        int var3 = -115 % ((-arg1 - 7) / 45);
        class141 var4 = this.method1616(arg0, false);
        return var4 != null && var4.method912(this, -20314, this.field3797);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZFIIII)[I")
    public final int[] method834(boolean arg0, float arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= -76) {
            field3792 = null;
        }
        field3786++;
        return this.method1616(arg2, false).method910(arg5, this.field3789[arg2].field7374, this, this.field3797, (double) arg1, 0, arg3);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)Lta;")
    private final class141 method1616(int arg0, boolean arg1) {
        field3801++;
        class80 var3 = this.field3800.method1321((long) arg0, 97);
        if (var3 != null) {
            return (class141) var3;
        }
        byte[] var4 = this.field3791.method1388(arg0, (byte) -28);
        if (var4 == null) {
            return null;
        } else if (arg1) {
            return null;
        } else {
            class141 var5 = new class141(new class365(var4));
            this.field3800.method1324((long) arg0, -83, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lvh;Lvh;Lvh;)V")
    public class281(class240 arg0, class240 arg1, class240 arg2) {
        this.field3791 = arg1;
        this.field3797 = arg2;
        class365 var4 = new class365(arg0.method1411(true, 0, 0));
        int var5 = var4.method2062((byte) 14);
        this.field3789 = new class501[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2099(255) == 1) {
                this.field3789[var6] = new class501();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3789[var7] != null) {
                this.field3789[var7].field7371 = var4.method2099(255) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3789[var8] != null) {
                this.field3789[var8].field7381 = var4.method2099(255) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3789[var9] != null) {
                this.field3789[var9].field7380 = var4.method2099(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3789[var10] != null) {
                this.field3789[var10].field7363 = var4.method2099(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3789[var11] != null) {
                this.field3789[var11].field7362 = var4.method2081((byte) 105);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3789[var12] != null) {
                this.field3789[var12].field7375 = var4.method2081((byte) 104);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3789[var13] != null) {
                this.field3789[var13].field7366 = var4.method2081((byte) 113);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3789[var14] != null) {
                this.field3789[var14].field7383 = var4.method2081((byte) 126);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3789[var15] != null) {
                this.field3789[var15].field7367 = (short) var4.method2062((byte) 14);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field3789[var16] != null) {
                this.field3789[var16].field7382 = var4.method2081((byte) 99);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field3789[var17] != null) {
                this.field3789[var17].field7358 = var4.method2081((byte) -82);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field3789[var18] != null) {
                this.field3789[var18].field7373 = var4.method2099(255) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field3789[var19] != null) {
                this.field3789[var19].field7374 = var4.method2099(255) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field3789[var20] != null) {
                this.field3789[var20].field7376 = var4.method2081((byte) 94);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field3789[var21] != null) {
                this.field3789[var21].field7359 = var4.method2099(255) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field3789[var22] != null) {
                this.field3789[var22].field7364 = var4.method2099(255) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field3789[var23] != null) {
                this.field3789[var23].field7372 = var4.method2099(255) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field3789[var24] != null) {
                this.field3789[var24].field7369 = var4.method2099(255);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field3789[var25] != null) {
                this.field3789[var25].field7377 = var4.method2056((byte) -1);
            }
        }
    }
}
