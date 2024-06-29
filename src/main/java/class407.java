import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class407 {

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "Lof;")
    private class620 field5573 = new class620(16);

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "Loh;")
    private class404 field5583;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public static int field5572 = 0;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "Ldh;")
    public static class320 field5576 = new class320(17, 4);

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "D")
    public static double field5577;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V")
    public final void method2502(boolean arg0) {
        class620 var2 = this.field5573;
        synchronized (this.field5573) {
            this.field5573.method3541(-647);
        }
        field5579++;
        if (!arg0) {
            field5576 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Lar;")
    private final class680 method2503(int arg0, int arg1) {
        field5580++;
        class620 var3 = this.field5573;
        class680 var4;
        synchronized (this.field5573) {
            var4 = (class680) this.field5573.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field5583;
        byte[] var6;
        synchronized (this.field5583) {
            var6 = this.field5583.method2481(29, arg1, (byte) 100);
        }
        class680 var7 = new class680();
        if (var6 != null) {
            var7.method3857(0, new class244(var6));
        }
        if (arg0 != 10574) {
            return null;
        }
        class620 var8 = this.field5573;
        synchronized (this.field5573) {
            this.field5573.method3537(arg0 ^ 0x2903, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
    public static final void method2504(int arg0) {
        field5578++;
        if (arg0 > -55) {
            method2504(-120);
        }
        if (class32.field361 != null) {
            return;
        }
        class32.field361 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var9 = var17;
                    var11 = var16;
                    var10 = var8;
                } else if (var14 == 2) {
                    var9 = var16;
                    var11 = var18;
                    var10 = var8;
                } else if (var14 == 3) {
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
                } else if (var14 == 4) {
                    var10 = var16;
                    var9 = var18;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class32.field361[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
    public final void method2505(byte arg0) {
        class620 var2 = this.field5573;
        synchronized (this.field5573) {
            this.field5573.method3549(0);
        }
        if (arg0 < -107) {
            field5575++;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIILqb;II)Lmf;")
    public final class418 method2506(int arg0, int arg1, int arg2, class224 arg3, int arg4, int arg5) {
        field5574++;
        class731[] var7 = null;
        class680 var8 = this.method2503(10574, arg4);
        if (var8.field9620 != null) {
            var7 = new class731[var8.field9620.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class621 var10 = arg3.method1300(var8.field9620[var9], 2);
                var7[var9] = new class731(var10.field8890, var10.field8894, var10.field8895, var10.field8901, var10.field8897, var10.field8896, var10.field8889, var10.field8893);
            }
        }
        if (arg2 <= 61) {
            method2504(58);
        }
        return new class418(var8.field9622, var7, var8.field9624, arg5, arg0, arg1);
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(II)V")
    public final void method2507(int arg0, int arg1) {
        field5584++;
        class620 var3 = this.field5573;
        synchronized (this.field5573) {
            if (arg1 < 75) {
                field5582 = -73;
            }
            this.field5573.method3539((byte) 119, arg0);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B[[BLfca;)V")
    public static final void method2508(byte arg0, byte[][] arg1, class84 arg2) {
        field5581++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field9051; var4++) {
            class381.method2343(false);
            for (int var9 = 0; var9 < class489.field6976 >> 3; var9++) {
                for (int var10 = 0; var10 < (class153.field1677 >> 3); var10++) {
                    int var11 = class366.field4673[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (var11 & 0x316F26A) >> 24;
                        if (!arg2.field9052 || var12 == 0) {
                            int var13 = (var11 & 0x6) >> 1;
                            int var14 = var11 >> 14 & 0x3FF;
                            int var15 = (var11 & 0x3FFF) >> 3;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class74.field773.length; var17++) {
                                if (class74.field773[var17] == var16 && arg1[var17] != null) {
                                    class244 var18 = new class244(arg1[var17]);
                                    arg2.method3613(var4, (byte) -120, class205.field2430, var13, var9 * 8, var18, var10 * 8, var12, var14, var15);
                                    arg2.method586(var15, var10 * 8, class275.field3370, var14, var4, var9 * 8, var18, var3[0] == -1 ? var3 : null, var13, (byte) -126, var12);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 115) {
            return;
        }
        for (int var5 = 0; var5 < arg2.field9051; var5++) {
            class381.method2343(false);
            for (int var6 = 0; var6 < class489.field6976 >> 3; var6++) {
                for (int var7 = 0; var7 < class153.field1677 >> 3; var7++) {
                    int var8 = class366.field4673[var5][var6][var7];
                    if (var8 == -1) {
                        arg2.method3615(var5, 8, (byte) 68, var7 * 8, var6 * 8, 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class12.field103 = class430.field6249.method2506(var3[2], var3[3], arg0 - 47, class82.field857, var3[0], var3[1]);
            class566.field8055 = var3[4];
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(Z)V")
    public static void method2509(boolean arg0) {
        if (arg0) {
            method2509(false);
        }
        field5576 = null;
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lnb;ILoh;)V")
    public class407(class301 arg0, int arg1, class404 arg2) {
        this.field5583 = arg2;
        this.field5583.method2482(0, 29);
    }
}
