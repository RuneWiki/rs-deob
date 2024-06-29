import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class210 extends class291 {

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "Z")
    public boolean field3609 = false;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "Ldc;")
    private class1 field3610;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "Z")
    private boolean field3613;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "Z")
    private boolean field3603;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
    private int field3618;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lbf;")
    public static class202 field3614 = new class202(64);

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "Z")
    public static boolean field3616 = false;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
    public static int field3620 = 5063219;

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "[[[Lid;")
    public static class226[][][] field3621 = new class226[4][104][104];

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "F")
    private float field3604;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "Ljl;")
    public static class101 field3619;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "[I")
    private int[] field3611;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "[I")
    public static int[] field3615;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "[[I")
    public static int[][] field3617;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
    public final void method1473(int arg0, int arg1) {
        if (arg1 != 128) {
            return;
        }
        field3605++;
        if (this.field3611 == null || this.field3618 == 0 && this.field3608 == 0) {
            return;
        }
        if (class59.field972 == null || class59.field972.length < this.field3611.length) {
            class59.field972 = new int[this.field3611.length];
        }
        int var3 = this.field3611.length == 4096 ? 64 : 128;
        int var4 = this.field3611.length;
        int var5 = var3 - 1;
        int var6 = this.field3608 * arg0;
        int var7 = arg0 * var3 * this.field3618;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var8 & var7 + var9;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var5 & var6 + var12) + var11;
                class59.field972[var13] = this.field3611[var14];
            }
        }
        int[] var10 = this.field3611;
        this.field3611 = class59.field972;
        class59.field972 = var10;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLjl;Lad;I)[I")
    public final int[] method1474(boolean arg0, class101 arg1, class161 arg2, int arg3) {
        field3612++;
        if (!this.field3610.method4(arg2, 23241, arg1)) {
            return null;
        }
        if (arg3 != 64) {
            this.method1475(-0.24144226F, (class161) null, (class101) null, false, (byte) 24);
        }
        int var5 = arg0 ? 64 : 128;
        return this.field3610.method5(arg2, this.field3603, var5, false, var5, arg3 ^ 0x40, 1.0D, arg1);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(FLad;Ljl;ZB)[I")
    public final int[] method1475(float arg0, class161 arg1, class101 arg2, boolean arg3, byte arg4) {
        field3607++;
        if (this.field3611 == null || this.field3604 != arg0) {
            if (!this.field3610.method4(arg1, 23241, arg2)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field3611 = this.field3610.method5(arg1, this.field3603, var6, true, var6, 0, (double) arg0, arg2);
            this.field3604 = arg0;
            if (this.field3613) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var16; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field3611[var12];
                        var8[var34] += class96.method626(var35, 16741028) >> 16;
                        var7[var34] += class96.method626(var35 >> 8, 255);
                        var10[var34] += class96.method626(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var15; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    for (int var25 = 2; var25 >= 0; var25--) {
                        var21--;
                        var22 += var7[var21];
                        var23 += var10[var21];
                        var24 += var8[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    int var26 = 1;
                    for (int var27 = var16; var27 >= 0; var27--) {
                        int var31 = var24 / 9;
                        var26--;
                        int var32 = var22 / 9;
                        int var33 = var23 / 9;
                        var19--;
                        var9[var19] = class94.method617(class94.method617(var32 << 8, var31 << 16), var33);
                        var21--;
                        var23 += var10[var21] - var10[var26];
                        var24 += var8[var21] - var8[var26];
                        var22 += var7[var21] - var7[var26];
                        if (var26 == 0) {
                            var26 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var16; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field3611[var13];
                        var12--;
                        int var30 = this.field3611[var12];
                        var8[var28] += (class96.method626(16737945, var30) >> 16) - class96.method626(255, var29 >> 16);
                        var7[var28] += -(class96.method626(var29, 65518) >> 8) + class96.method626(var30 >> 8, 255);
                        var10[var28] += class96.method626(255, var30) - class96.method626(var29, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field3611 = var9;
            }
        }
        if (arg4 > -30) {
            this.method1477((class101) null, (class161) null, 57);
        }
        return this.field3611;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static void method1476(byte arg0) {
        field3617 = null;
        field3615 = null;
        field3614 = null;
        if (arg0 == 13) {
            field3621 = null;
            field3619 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljl;Lad;I)Z")
    public final boolean method1477(class101 arg0, class161 arg1, int arg2) {
        if (arg2 != -1) {
            this.method1475(0.4607002F, (class161) null, (class101) null, true, (byte) -123);
        }
        field3602++;
        return this.field3610.method4(arg1, 23241, arg0);
    }

    @OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field3606++;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lva;)V")
    public class210(class187 arg0) {
        this.field3610 = new class1(arg0);
        this.field3613 = arg0.method1268(255) == 1;
        this.field3603 = arg0.method1268(255) == 1;
        arg0.method1268(255);
        arg0.method1268(255);
        int var2 = arg0.method1268(255) & 0x3;
        this.field3608 = arg0.method1269(255);
        this.field3618 = arg0.method1269(255);
        arg0.method1268(255);
        arg0.method1268(255);
    }
}
