import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class284 extends class90 {

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Z")
    public boolean field4525 = false;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Lhi;")
    private class257 field4524;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "Z")
    private boolean field4520;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Z")
    private boolean field4521;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    private int field4529;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    private int field4526;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4516 = "Loading...";

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "[I")
    public static int[] field4527 = new int[32];

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "F")
    private float field4522;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "Lve;")
    public static class233 field4517;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "Lve;")
    public static class233 field4531;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "[I")
    private int[] field4532;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lve;ZZLlg;)[I")
    public final int[] method1910(class233 arg0, boolean arg1, boolean arg2, class106 arg3) {
        if (arg2) {
            this.method1910((class233) null, true, false, (class106) null);
        }
        field4523++;
        if (this.field4524.method1726(true, arg3, arg0)) {
            int var5 = arg1 ? 64 : 128;
            return this.field4524.method1728(false, arg3, var5, arg0, this.field4521, 1.0D, var5, -67);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Llg;FLve;ZZ)[I")
    public final int[] method1911(class106 arg0, float arg1, class233 arg2, boolean arg3, boolean arg4) {
        field4530++;
        if (this.field4532 == null || this.field4522 != arg1) {
            if (!this.field4524.method1726(!arg3, arg0, arg2)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field4532 = this.field4524.method1728(true, arg0, var6, arg2, this.field4521, (double) arg1, var6, -100);
            this.field4522 = arg1;
            if (this.field4520) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6 - 1;
                int var14 = var6;
                int var15 = var6;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var12; var34 >= 0; var34--) {
                        var14--;
                        int var35 = this.field4532[var14];
                        var7[var34] += class184.method1188(var35 >> 16, 255);
                        var8[var34] += class184.method1188(65313, var35) >> 8;
                        var9[var34] += class184.method1188(255, var35);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var24--;
                        var21 += var8[var24];
                        var23 += var7[var24];
                        var22 += var9[var24];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var27 = var12; var27 >= 0; var27--) {
                        int var31 = var21 / 9;
                        var25--;
                        int var32 = var22 / 9;
                        int var33 = var23 / 9;
                        var24--;
                        var19--;
                        var10[var19] = class163.method1093(var32, class163.method1093(var33 << 16, var31 << 8));
                        var22 += var9[var24] - var9[var25];
                        var23 += var7[var24] - var7[var25];
                        var21 += var8[var24] - var8[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var28 = var12; var28 >= 0; var28--) {
                        var15--;
                        int var29 = this.field4532[var15];
                        var14--;
                        int var30 = this.field4532[var14];
                        var7[var28] += -(class184.method1188(16752728, var29) >> 16) + class184.method1188(var30 >> 16, 255);
                        var8[var28] += class184.method1188(255, var30 >> 8) - (class184.method1188(65398, var29) >> 8);
                        var9[var28] += -class184.method1188(255, var29) + class184.method1188(var30, 255);
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                this.field4532 = var10;
            }
        }
        if (arg3) {
            this.field4529 = 53;
        }
        return this.field4532;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(II)V")
    public final void method1912(int arg0, int arg1) {
        field4528++;
        if (arg1 != 8162) {
            field4516 = null;
        }
        if (this.field4532 == null || this.field4526 == 0 && this.field4529 == 0) {
            return;
        }
        if (class58.field896 == null || class58.field896.length < this.field4532.length) {
            class58.field896 = new int[this.field4532.length];
        }
        int var3 = this.field4532.length == 4096 ? 64 : 128;
        int var4 = this.field4532.length;
        int var5 = this.field4529 * arg0;
        int var6 = this.field4526 * arg0 * var3;
        int var7 = var3 - 1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var6 + var9 & var8;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = var11 + (var7 & var5 + var12);
                class58.field896[var13] = this.field4532[var14];
            }
        }
        int[] var10 = this.field4532;
        this.field4532 = class58.field896;
        class58.field896 = var10;
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field4518++;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    public static void method1913(int arg0) {
        field4527 = null;
        field4517 = null;
        field4531 = null;
        field4516 = null;
        if (arg0 != 1) {
            field4517 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lve;Llg;I)Z")
    public final boolean method1914(class233 arg0, class106 arg1, int arg2) {
        if (arg2 >= -66) {
            this.field4521 = false;
        }
        field4519++;
        return this.field4524.method1726(true, arg1, arg0);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lkl;)V")
    public class284(class114 arg0) {
        this.field4524 = new class257(arg0);
        this.field4520 = arg0.method760(false) == 1;
        this.field4521 = arg0.method760(false) == 1;
        arg0.method760(false);
        arg0.method760(false);
        int var2 = arg0.method760(false) & 0x3;
        this.field4529 = arg0.method741(3083);
        this.field4526 = arg0.method741(3083);
        arg0.method760(false);
        arg0.method760(false);
    }
}
