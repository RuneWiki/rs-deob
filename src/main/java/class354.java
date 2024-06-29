import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class354 {

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lwca;")
    public class36 field4956 = null;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lwca;")
    public class36 field4958 = null;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[Ldca;")
    public class612[] field4961 = null;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[Ldca;")
    private class612[] field4960 = null;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lnh;")
    private class495 field4963;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Z")
    public boolean field4957;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lod;")
    public static class673 field4954;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method2138(int arg0) {
        field4954 = null;
        if (arg0 <= 98) {
            field4954 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Z")
    public final boolean method2139(boolean arg0) {
        field4962++;
        if (!arg0) {
            this.field4960 = null;
        }
        if (this.field4956 == null) {
            if (class195.field3049 == null) {
                byte[] var2 = class441.method2573(16.0F, 4.0F, 0.6F, 0.5F, 128, 4.0F, new class126(419684), 18911, 16, 8, 128);
                class195.field3049 = class8.method32((byte) -69, false, var2);
            }
            byte[] var3 = class600.method3420(class195.field3049, false, false);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var8 + (var9 * 128);
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field4956 = this.field4963.method96(128, class297.field4191, 128, var4, false, 16);
        }
        return this.field4956 != null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lvj;IIIII)V")
    public static final void method2140(class204 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class596.field8626 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class33.field474) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class687.field9758 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class293 var14 = class541.field7946[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class687.field9745[var11].method3858(var13, var12, (byte) 56) + class687.field9745[var11].method3858(var13, var12 + 1, (byte) 115) + class687.field9745[var11].method3858(var13 + 1, var12, (byte) 115) + class687.field9745[var11].method3858(var13 + 1, var12 + 1, (byte) 124)) / 4 - (class687.field9745[arg1].method3858(arg3, arg2, (byte) 100) + class687.field9745[arg1].method3858(arg3, arg2 + 1, (byte) 94) + class687.field9745[arg1].method3858(arg3 + 1, arg2, (byte) 47) + class687.field9745[arg1].method3858(arg3 + 1, arg2 + 1, (byte) 105)) / 4;
                                    class197 var16 = var14.field4091;
                                    class197 var17 = var14.field4095;
                                    if (var16 != null && var16.method592(-15258)) {
                                        arg0.method590(var16, (var12 - arg2) * class457.field6576 + (1 - arg4) * class211.field3229, var6, class490.field7029, var15, (var13 - arg3) * class457.field6576 + (1 - arg5) * class211.field3229, (byte) 71);
                                    }
                                    if (var17 != null && var17.method592(-15258)) {
                                        arg0.method590(var17, (var12 - arg2) * class457.field6576 + (1 - arg4) * class211.field3229, var6, class490.field7029, var15, (var13 - arg3) * class457.field6576 + (1 - arg5) * class211.field3229, (byte) 122);
                                    }
                                    for (class198 var18 = var14.field4097; var18 != null; var18 = var18.field3078) {
                                        class144 var19 = var18.field3085;
                                        if (var19 != null && var19.method592(-15258) && (var19.field2481 == var12 || var7 == var12) && (var19.field2484 == var13 || var9 == var13)) {
                                            int var20 = var19.field2483 + 1 - var19.field2481;
                                            int var21 = var19.field2486 + 1 - var19.field2484;
                                            arg0.method590(var19, (var19.field2481 - arg2) * class457.field6576 + (var20 - arg4) * class211.field3229, var6, class490.field7029, var15, (var19.field2484 - arg3) * class457.field6576 + (var21 - arg5) * class211.field3229, (byte) 50);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z")
    public final boolean method2141(int arg0) {
        field4955++;
        if (arg0 > -74) {
            this.field4957 = false;
        }
        if (this.field4957) {
            return this.field4958 != null;
        } else {
            return this.field4961 != null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)V")
    public static final void method2142(byte arg0, int arg1) {
        field4959++;
        class133.field2155 = 2;
        if (arg0 <= 49) {
            field4954 = null;
        }
        class70.field1107 = arg1;
        long var2 = 0L;
        if (class640.field9072 == null) {
            class562.method3287(35, -4);
        } else {
            class465 var4 = new class465(class94.method720(class477.method2793(class640.field9072, -15387), false));
            long var5 = var4.method2727(0);
            class177.field2824 = var4.method2727(0);
            class218.method1466(true, class618.method3494(var5, -32105), (byte) -74, "");
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII[B)V")
    public static final void method2143(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field4964++;
        if (arg0 <= arg4) {
            return;
        }
        if (arg2 != 0) {
            method2138(-108);
        }
        int var6 = arg0 - arg4 >> 2;
        int var7 = arg3 + arg4;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg0 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var7++] = 1;
                }
            }
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lnh;)V")
    public class354(class495 arg0) {
        this.field4963 = arg0;
        this.field4957 = this.field4963.field7379;
        if (this.field4957 && !this.field4963.method106(class694.field9862, class689.field9771, 5934)) {
            this.field4957 = false;
        }
        if (this.field4957 || this.field4963.method91(class694.field9862, 16674, class689.field9771)) {
            class648.method3634((byte) 79);
            if (this.field4957) {
                byte[] var6 = class600.method3420(class82.field1248, false, false);
                this.field4958 = this.field4963.method96(128, class694.field9862, 128, var6, false, 16);
                byte[] var7 = class600.method3420(class676.field9627, false, false);
                this.field4963.method96(128, class694.field9862, 128, var7, false, 16);
            } else {
                this.field4961 = new class612[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class346.method2106(class82.field1248, -42, 32768, var2 * 128 * 128 * 2);
                    this.field4961[var2] = this.field4963.method2902(var5, 0, 128, class694.field9862, 128, true);
                }
                this.field4960 = new class612[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class346.method2106(class676.field9627, -38, 32768, var3 * 2 * 16384);
                    this.field4960[var3] = this.field4963.method2902(var4, 0, 128, class694.field9862, 128, true);
                }
            }
        }
    }
}
