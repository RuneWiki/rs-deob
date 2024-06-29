import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class255 extends class212 {

    @OriginalMember(owner = "client!hg", name = "cb", descriptor = "Z")
    public boolean field4425 = false;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "Lah;")
    private class135 field4415;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "Z")
    private boolean field4420;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "Z")
    private boolean field4412;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    private int field4418;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    private int field4408;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "[Z")
    public static boolean[] field4409 = new boolean[100];

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "Lqe;")
    public static class168 field4423 = class66.method448("null", -120);

    @OriginalMember(owner = "client!hg", name = "db", descriptor = "Lhe;")
    public static class47 field4426 = new class47();

    @OriginalMember(owner = "client!hg", name = "eb", descriptor = "Lqe;")
    public static class168 field4427 = class66.method448("document)3cookie=(R", -127);

    @OriginalMember(owner = "client!hg", name = "gb", descriptor = "Lqe;")
    private static class168 field4429 = class66.method448("FULL", 107);

    @OriginalMember(owner = "client!hg", name = "hb", descriptor = "I")
    public static int field4430 = -1;

    @OriginalMember(owner = "client!hg", name = "fb", descriptor = "Lqe;")
    public static class168 field4428 = field4429;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "F")
    private float field4410;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "[I")
    private int[] field4414;

    @OriginalMember(owner = "client!hg", name = "bb", descriptor = "[Lgd;")
    public static class65[] field4424;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BZ)V")
    public static final void method1677(byte arg0, boolean arg1) {
        field4421++;
        byte[][] var2 = class178.field3139;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class131.field2316[var5] >> 8) * 64 - class246.field4261;
            int var12 = (class131.field2316[var5] & 0xFF) * 64 - class125.field2060;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class177.method1165(-8886);
                class132.method893(var12, 127, var11, var13, class155.field2696 * 8 - 48, arg1, class159.field2743 * 8 - 48, class169.field2951);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class131.field2316[var6] & 0xFF) * 64 - class125.field2060;
            int var8 = (class131.field2316[var6] >> 8) * 64 - class246.field4261;
            byte[] var9 = var2[var6];
            if (var9 == null && class155.field2696 < 800) {
                class177.method1165(-8886);
                for (int var10 = 0; var10 < var3; var10++) {
                    class18.method88(var10, var7, 64, (byte) -128, 64, var8);
                }
            }
        }
        if (arg0 != 26) {
            field4424 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLoe;Loe;)V")
    public static final void method1678(boolean arg0, class256 arg1, class256 arg2) {
        field4413++;
        class254.field4393 = arg1;
        if (!arg0) {
            method1679(116);
        }
        class247.field4277 = arg2;
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
    public static void method1679(int arg0) {
        if (arg0 != 0) {
            method1679(-113);
        }
        field4409 = null;
        field4423 = null;
        field4428 = null;
        field4429 = null;
        field4427 = null;
        field4426 = null;
        field4424 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lvf;ZLoe;)Z")
    public final boolean method1680(class250 arg0, boolean arg1, class256 arg2) {
        if (!arg1) {
            field4430 = -66;
        }
        field4407++;
        return this.field4415.method911(arg0, 255, arg2);
    }

    @OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4411++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLoe;FLvf;Z)[I")
    public final int[] method1681(boolean arg0, class256 arg1, float arg2, class250 arg3, boolean arg4) {
        if (arg0) {
            return null;
        }
        field4422++;
        if (this.field4414 == null || this.field4410 != arg2) {
            if (!this.field4415.method911(arg3, 255, arg1)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field4414 = this.field4415.method915(this.field4412, arg1, var6, arg3, (byte) -93, var6, (double) arg2, true);
            this.field4410 = arg2;
            if (this.field4420) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var12 = var6 - 1;
                int var13 = var6;
                int var14 = var6 - 1;
                int var15 = var6 * var6;
                int var16 = var6;
                int var17 = var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var14; var34 >= 0; var34--) {
                        var16--;
                        int var35 = this.field4414[var16];
                        var7[var34] += class86.method571(255, var35 >> 16);
                        var8[var34] += class86.method571(255, var35 >> 8);
                        var9[var34] += class86.method571(255, var35);
                    }
                    if (var16 == 0) {
                        var16 = var15;
                    }
                }
                int var19 = var15;
                for (int var20 = var12; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var23 += var7[var25];
                        var21 += var8[var25];
                        var22 += var9[var25];
                        if (var25 == 0) {
                            var25 = var13;
                        }
                    }
                    for (int var27 = var14; var27 >= 0; var27--) {
                        int var31 = var21 / 9;
                        var24--;
                        var25--;
                        int var32 = var23 / 9;
                        int var33 = var22 / 9;
                        var19--;
                        var10[var19] = class102.method675(class102.method675(var31 << 8, var32 << 16), var33);
                        var23 += var7[var25] - var7[var24];
                        var22 += var9[var25] - var9[var24];
                        var21 += var8[var25] - var8[var24];
                        if (var24 == 0) {
                            var24 = var13;
                        }
                        if (var25 == 0) {
                            var25 = var13;
                        }
                    }
                    for (int var28 = var14; var28 >= 0; var28--) {
                        var17--;
                        int var29 = this.field4414[var17];
                        var16--;
                        int var30 = this.field4414[var16];
                        var7[var28] += -(class86.method571(var29, 16754943) >> 16) + class86.method571(var30 >> 16, 255);
                        var8[var28] += class86.method571(255, var30 >> 8) - (class86.method571(65347, var29) >> 8);
                        var9[var28] += -class86.method571(var29, 255) + class86.method571(255, var30);
                    }
                    if (var16 == 0) {
                        var16 = var15;
                    }
                    if (var17 == 0) {
                        var17 = var15;
                    }
                }
                this.field4414 = var10;
            }
        }
        return this.field4414;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLoe;ZILoe;)Loj;")
    public static final class79 method1682(byte arg0, class256 arg1, boolean arg2, int arg3, class256 arg4) {
        boolean var5 = true;
        int[] var6 = arg1.method1704(true, arg3);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method1710(var6[var7], (byte) -35, arg3);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg4.method1710(var9, (byte) -35, 0);
                } else {
                    var10 = arg4.method1710(0, (byte) -35, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg0 < 64) {
            field4428 = null;
        }
        field4416++;
        if (!var5) {
            return null;
        }
        try {
            return new class79(arg1, arg4, arg3, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V")
    public final void method1683(int arg0, int arg1) {
        field4419++;
        if (this.field4414 == null) {
            return;
        }
        if (arg0 != -1890649848) {
            method1678(false, null, null);
        }
        if (this.field4408 == 0 && this.field4418 == 0) {
            return;
        }
        if (class173.field3015 == null || this.field4414.length > class173.field3015.length) {
            class173.field3015 = new int[this.field4414.length];
        }
        int var3 = this.field4414.length == 4096 ? 64 : 128;
        int var4 = var3 - 1;
        int var5 = this.field4418 * arg1;
        int var6 = arg1 * var3 * this.field4408;
        int var7 = this.field4414.length;
        int var8 = var7 - 1;
        for (int var9 = 0; var9 < var7; var9 += var3) {
            int var11 = var8 & var6 + var9;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var5 + var12 & var4) + var11;
                class173.field3015[var13] = this.field4414[var14];
            }
        }
        int[] var10 = this.field4414;
        this.field4414 = class173.field3015;
        class173.field3015 = var10;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Loe;ILvf;Z)[I")
    public final int[] method1684(class256 arg0, int arg1, class250 arg2, boolean arg3) {
        field4406++;
        if (this.field4415.method911(arg2, arg1, arg0)) {
            int var5 = arg3 ? 64 : 128;
            return this.field4415.method915(this.field4412, arg0, var5, arg2, (byte) 71, var5, 1.0D, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lnh;)V")
    public class255(class112 arg0) {
        this.field4415 = new class135(arg0);
        this.field4420 = arg0.method758(true) == 1;
        this.field4412 = arg0.method758(true) == 1;
        arg0.method758(true);
        arg0.method758(true);
        int var2 = arg0.method758(true) & 0x3;
        this.field4418 = arg0.method750(105);
        this.field4408 = arg0.method750(-59);
        arg0.method758(true);
        arg0.method758(true);
    }
}
