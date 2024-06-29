import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class199 extends class136 {

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "Z")
    public boolean field3802 = false;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "Lb;")
    private class12 field3793;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "Z")
    private boolean field3796;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "Z")
    private boolean field3803;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    private int field3792;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    private int field3809;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field3790 = 0;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Li;")
    public static class88 field3789 = class208.method1425(105, " ");

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "Li;")
    public static class88 field3797 = class208.method1425(105, "p11_full");

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "Li;")
    public static class88 field3807 = class208.method1425(105, "Art");

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "Lwi;")
    public static class248 field3812 = new class248();

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "Li;")
    public static class88 field3813 = class208.method1425(105, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "F")
    private float field3800;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "[I")
    private int[] field3810;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
    public static void method1365(boolean arg0) {
        field3789 = null;
        field3797 = null;
        field3807 = null;
        field3813 = null;
        if (arg0) {
            method1366((byte) 59, null, null);
        }
        field3812 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLnb;Lnb;)V")
    public static final void method1366(byte arg0, class144 arg1, class144 arg2) {
        if (arg0 != 113) {
            method1366((byte) 117, null, null);
        }
        class43.field733 = arg1;
        class129.field2424 = arg2;
        field3791++;
        class23.field374 = class129.field2424.method944(128, 3);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IJ)V")
    public static final void method1367(int arg0, long arg1) {
        try {
            int var3 = 110 % ((52 - arg0) / 40);
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        field3794++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lnb;ZZLfe;)[I")
    public final int[] method1368(class144 arg0, boolean arg1, boolean arg2, class61 arg3) {
        field3808++;
        if (arg2) {
            return null;
        } else if (this.field3793.method63(arg3, arg0, -65)) {
            int var5 = arg1 ? 64 : 128;
            return this.field3793.method60(1.0D, var5, this.field3803, arg0, arg3, var5, 255, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IZ)V")
    public final void method1369(int arg0, boolean arg1) {
        if (!arg1) {
            field3790 = 65;
        }
        field3804++;
        if (this.field3810 == null || this.field3809 == 0 && this.field3792 == 0) {
            return;
        }
        if (class225.field4220 == null || class225.field4220.length < this.field3810.length) {
            class225.field4220 = new int[this.field3810.length];
        }
        int var3 = this.field3810.length;
        int var4 = this.field3792 * arg0;
        int var5 = var3 - 1;
        int var6 = this.field3810.length == 4096 ? 64 : 128;
        int var7 = arg0 * var6 * this.field3809;
        int var8 = var6 - 1;
        for (int var9 = 0; var9 < var3; var9 += var6) {
            int var11 = var9 + var7 & var5;
            for (int var12 = 0; var12 < var6; var12++) {
                int var13 = var9 + var12;
                int var14 = (var8 & var4 + var12) + var11;
                class225.field4220[var13] = this.field3810[var14];
            }
        }
        int[] var10 = this.field3810;
        this.field3810 = class225.field4220;
        class225.field4220 = var10;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lfe;ILnb;)Z")
    public final boolean method1370(class61 arg0, int arg1, class144 arg2) {
        field3801++;
        return arg1 == 13042 ? this.field3793.method63(arg0, arg2, -34) : true;
    }

    @OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3795++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lfe;FLnb;ZZ)[I")
    public final int[] method1371(class61 arg0, float arg1, class144 arg2, boolean arg3, boolean arg4) {
        if (arg4) {
            this.field3810 = null;
        }
        field3798++;
        if (this.field3810 == null || this.field3800 != arg1) {
            if (!this.field3793.method63(arg0, arg2, -19)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field3810 = this.field3793.method60((double) arg1, var6, this.field3803, arg2, arg0, var6, 255, true);
            this.field3800 = arg1;
            if (this.field3796) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6 * var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var13 = var6;
                int var14 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var16; var34 >= 0; var34--) {
                        var13--;
                        int var35 = this.field3810[var13];
                        var7[var34] += class70.method470(var35 >> 16, 255);
                        var10[var34] += class70.method470(65391, var35) >> 8;
                        var9[var34] += class70.method470(255, var35);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var15; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var24 += var7[var25];
                        var23 += var9[var25];
                        var22 += var10[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var16; var27 >= 0; var27--) {
                        var21--;
                        var25--;
                        int var31 = var24 / 9;
                        int var32 = var23 / 9;
                        int var33 = var22 / 9;
                        var19--;
                        var8[var19] = class204.method1405(var32, class204.method1405(var33 << 8, var31 << 16));
                        var22 += var10[var25] - var10[var21];
                        var24 += var7[var25] - var7[var21];
                        var23 += var9[var25] - var9[var21];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var16; var28 >= 0; var28--) {
                        var14--;
                        int var29 = this.field3810[var14];
                        var13--;
                        int var30 = this.field3810[var13];
                        var7[var28] += class70.method470(255, var30 >> 16) - (class70.method470(var29, 16737159) >> 16);
                        var10[var28] += -class70.method470(var29 >> 8, 255) + class70.method470(var30 >> 8, 255);
                        var9[var28] += class70.method470(255, var30) - class70.method470(255, var29);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field3810 = var8;
            }
        }
        return this.field3810;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public static final void method1372(int arg0) {
        for (class242 var1 = (class242) class42.field714.method1612(false); var1 != null; var1 = (class242) class42.field714.method1621(arg0 + 83)) {
            class18 var2 = var1.field4476;
            if (class149.field2909 != var2.field292 || var2.field302) {
                var1.method460(true);
            } else if (var2.field287 <= class117.field2115) {
                var2.method90(class17.field261, false);
                if (var2.field302) {
                    var1.method460(true);
                } else {
                    class126.method861(var2.field292, var2.field296, var2.field290, var2.field295, 60, var2, 0, -1L, false);
                }
            }
        }
        if (arg0 != -1) {
            method1367(68, -63L);
        }
        field3806++;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lea;)V")
    public class199(class46 arg0) {
        this.field3793 = new class12(arg0);
        this.field3796 = arg0.method347(26119) == 1;
        this.field3803 = arg0.method347(26119) == 1;
        arg0.method347(26119);
        arg0.method347(26119);
        int var2 = arg0.method347(26119) & 0x3;
        this.field3792 = arg0.method324(32);
        this.field3809 = arg0.method324(45);
        arg0.method347(26119);
        arg0.method347(26119);
    }
}
