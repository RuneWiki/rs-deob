import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 extends class4 {

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "Z")
    public boolean field345 = false;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "Lee;")
    private class281 field339;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "Z")
    private boolean field341;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "Z")
    private boolean field351;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field342 = 3;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "Ljava/lang/String;")
    public static String field352 = "flash1:";

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "F")
    private float field348;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "[I")
    private int[] field337;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
    public static void method191(int arg0) {
        field352 = null;
        if (arg0 != 0) {
            field352 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLoj;Lqh;)Z")
    public final boolean method192(byte arg0, class159 arg1, class201 arg2) {
        field347++;
        if (arg0 < 117) {
            this.method196(22, 33);
        }
        return this.field339.method1894(arg1, arg2, -1);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Loj;IZLqh;)[I")
    public final int[] method193(class159 arg0, int arg1, boolean arg2, class201 arg3) {
        field350++;
        if (!this.field339.method1894(arg0, arg3, arg1 - 1)) {
            return null;
        }
        if (arg1 != 0) {
            method191(-80);
        }
        int var5 = arg2 ? 64 : 128;
        return this.field339.method1895(var5, arg3, arg0, var5, false, this.field351, -1123900600, 1.0D);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field349++;
        if (arg7 != 42 || arg6 < 1 || arg0 < 1 || arg6 > 102 || arg0 > 102) {
            return;
        }
        if (!class257.method1757(-5) && (class201.field3198[0][arg6][arg0] & 0x2) == 0) {
            int var8 = arg5;
            if ((class201.field3198[arg5][arg6][arg0] & 0x8) != 0) {
                var8 = 0;
            }
            if (class223.field3694 != var8) {
                return;
            }
        }
        int var9 = arg5;
        if (arg5 < 3 && (class201.field3198[1][arg6][arg0] & 0x2) == 2) {
            var9 = arg5 + 1;
        }
        class216.method1478((byte) -124, arg3, arg0, arg6, var9, class167.field2657[arg5], arg5);
        if (arg1 < 0) {
            return;
        }
        boolean var10 = class22.field361;
        class22.field361 = true;
        class56.method416(class167.field2657[arg5], false, arg1, true, var9, arg4, arg5, false, arg0, arg6, arg2);
        class22.field361 = var10;
        return;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lqh;FILoj;Z)[I")
    public final int[] method195(class201 arg0, float arg1, int arg2, class159 arg3, boolean arg4) {
        field346++;
        if (arg2 != -7942) {
            this.field337 = null;
        }
        if (this.field337 == null || this.field348 != arg1) {
            if (!this.field339.method1894(arg3, arg0, -1)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field337 = this.field339.method1895(var6, arg0, arg3, var6, true, this.field351, -1123900600, (double) arg1);
            this.field348 = arg1;
            if (this.field341) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var12 = var6;
                int var13 = var6 - 1;
                int var14 = var6;
                int var15 = var6;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var13; var34 >= 0; var34--) {
                        var14--;
                        int var35 = this.field337[var14];
                        var8[var34] += class202.method1393(var35 >> 16, 255);
                        var7[var34] += class202.method1393(var35 >> 8, 255);
                        var10[var34] += class202.method1393(255, var35);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var21--;
                        var25 += var8[var21];
                        var24 += var10[var21];
                        var23 += var7[var21];
                        if (var21 == 0) {
                            var21 = var12;
                        }
                    }
                    for (int var27 = var13; var27 >= 0; var27--) {
                        var21--;
                        var22--;
                        int var31 = var24 / 9;
                        int var32 = var23 / 9;
                        int var33 = var25 / 9;
                        var19--;
                        var9[var19] = class220.method1495(var31, class220.method1495(var32 << 8, var33 << 16));
                        var24 += var10[var21] - var10[var22];
                        var25 += var8[var21] - var8[var22];
                        var23 += var7[var21] - var7[var22];
                        if (var22 == 0) {
                            var22 = var12;
                        }
                        if (var21 == 0) {
                            var21 = var12;
                        }
                    }
                    for (int var28 = var13; var28 >= 0; var28--) {
                        var14--;
                        int var29 = this.field337[var14];
                        var15--;
                        int var30 = this.field337[var15];
                        var8[var28] += -(class202.method1393(16763299, var30) >> 16) + class202.method1393(var29 >> 16, 255);
                        var7[var28] += -(class202.method1393(65328, var30) >> 8) + class202.method1393(var29 >> 8, 255);
                        var10[var28] += -class202.method1393(var30, 255) + class202.method1393(var29, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                }
                this.field337 = var9;
            }
        }
        return this.field337;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Log;)V")
    public class20(class221 arg0) {
        this.field339 = new class281(arg0);
        this.field341 = arg0.method1517((byte) -96) == 1;
        this.field351 = arg0.method1517((byte) -96) == 1;
        arg0.method1517((byte) -96);
        arg0.method1517((byte) -96);
        int var2 = arg0.method1517((byte) -96) & 0x3;
        this.field336 = arg0.method1535((byte) -61);
        this.field338 = arg0.method1535((byte) -65);
        arg0.method1517((byte) -96);
        arg0.method1517((byte) -96);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
    public final void method196(int arg0, int arg1) {
        if (arg1 != -10414) {
            this.field341 = true;
        }
        field343++;
        if (this.field337 == null || this.field338 == 0 && this.field336 == 0) {
            return;
        }
        if (class83.field1302 == null || this.field337.length > class83.field1302.length) {
            class83.field1302 = new int[this.field337.length];
        }
        int var3 = this.field337.length;
        int var4 = this.field337.length == 4096 ? 64 : 128;
        int var5 = var4 - 1;
        int var6 = this.field336 * arg0;
        int var7 = arg0 * var4 * this.field338;
        int var8 = var3 - 1;
        for (int var9 = 0; var9 < var3; var9 += var4) {
            int var11 = var8 & var9 + var7;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var9 + var12;
                int var14 = (var5 & var6 + var12) + var11;
                class83.field1302[var13] = this.field337[var14];
            }
        }
        int[] var10 = this.field337;
        this.field337 = class83.field1302;
        class83.field1302 = var10;
    }

    @OriginalMember(owner = "client!bk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field340++;
    }
}
