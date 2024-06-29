import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class41 extends class86 {

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "Z")
    private boolean field652 = true;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    private int field660 = 4096;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "[I")
    public static int[] field656 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "[I")
    public static int[] field654 = new int[500];

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "Lrn;")
    public static class18 field659;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Lwm;")
    public static class96 field657;

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 5)
    public class41() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lme;IIIIIIZ)V", line = 11)
    public static final void method423(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1798.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field1798[var9] - class205.field3165;
            int var11 = arg0.field1792[var9] - class215.field3371;
            int var12 = arg0.field1805[var9] - class190.field2977;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field1793 != null) {
                class117.field1788[var9] = var13;
                class117.field1802[var9] = var16;
                class117.field1806[var9] = var17;
            }
            class117.field1794[var9] = (var13 << 9) / var17 + class107.field1617;
            class117.field1808[var9] = (var16 << 9) / var17 + class107.field1614;
        }
        class107.field1607 = 0;
        int var19 = arg0.field1800.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field1800[var20];
            int var22 = arg0.field1801[var20];
            int var23 = arg0.field1804[var20];
            int var24 = class117.field1794[var21];
            int var25 = class117.field1794[var22];
            int var26 = class117.field1794[var23];
            int var27 = class117.field1808[var21];
            int var28 = class117.field1808[var22];
            int var29 = class117.field1808[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class197.field3081 && class22.method233(class226.field3533 + class107.field1617, class91.field1352 + class107.field1614, var27, var28, var29, var24, var25, var26)) {
                    class282.field4366 = arg5;
                    class274.field4254 = arg6;
                }
                if (!class240.field3737 && !arg7) {
                    class107.field1609 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class107.field1608 || var25 > class107.field1608 || var26 > class107.field1608) {
                        class107.field1609 = true;
                    }
                    if (arg0.field1793 == null || arg0.field1793[var20] == -1) {
                        if (arg0.field1795[var20] != 12345678) {
                            class107.method934(var27, var28, var29, var24, var25, var26, arg0.field1795[var20], arg0.field1790[var20], arg0.field1797[var20]);
                        }
                    } else if (!class290.field4504) {
                        int var30 = class107.field1619.method760(arg0.field1793[var20], 1);
                        class107.method934(var27, var28, var29, var24, var25, var26, class138.method1149(var30, arg0.field1795[var20]), class138.method1149(var30, arg0.field1790[var20]), class138.method1149(var30, arg0.field1797[var20]));
                    } else if (arg0.field1796) {
                        class107.method938(var27, var28, var29, var24, var25, var26, arg0.field1795[var20], arg0.field1790[var20], arg0.field1797[var20], class117.field1788[0], class117.field1788[1], class117.field1788[3], class117.field1802[0], class117.field1802[1], class117.field1802[3], class117.field1806[0], class117.field1806[1], class117.field1806[3], arg0.field1793[var20]);
                    } else {
                        class107.method938(var27, var28, var29, var24, var25, var26, arg0.field1795[var20], arg0.field1790[var20], arg0.field1797[var20], class117.field1788[var21], class117.field1788[var22], class117.field1788[var23], class117.field1802[var21], class117.field1802[var22], class117.field1802[var23], class117.field1806[var21], class117.field1806[var22], class117.field1806[var23], arg0.field1793[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Lga;", line = 124)
    public static final class111 method424(byte arg0, int arg1) {
        field655++;
        class111 var2 = (class111) class43.field699.method654(101, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class57.field892.method187(29, arg1, -1);
        if (arg0 > -37) {
            method427(58, -16, 87);
        }
        class111 var4 = new class111();
        if (var3 != null) {
            var4.method961(-25, arg1, new class25(var3));
        }
        class43.field699.method652(-99, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZLug;)V", line = 147)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field658++;
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field660 = arg2.method314((byte) 94);
        } else if (arg0 == 1) {
            this.field652 = arg2.method281(-128) == 1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)[[I", line = 184)
    public final int[][] method156(int arg0, byte arg1) {
        if (arg1 >= -126) {
            this.field652 = true;
        }
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int[] var4 = this.method774(0, arg0 - 1 & class280.field4324, 0);
            int[] var5 = this.method774(0, arg0, 0);
            int[] var6 = this.method774(0, class280.field4324 & arg0 + 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class93.field1424; var10++) {
                int var11 = (var5[var10 + 1 & class313.field4848] - var5[class313.field4848 & var10 - 1]) * this.field660;
                int var12 = var11 >> 12;
                int var13 = (var6[var10] - var4[var10]) * this.field660;
                int var14 = var13 >> 12;
                int var15 = var12 * var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                } else {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var13 / var17;
                }
                if (this.field652) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        field651++;
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V", line = 273)
    public static void method425(boolean arg0) {
        if (!arg0) {
            method424((byte) -36, -44);
        }
        field659 = null;
        field656 = null;
        field657 = null;
        field654 = null;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(II)I", line = 289)
    public static int method426(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(III)J", line = 296)
    public static final long method427(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        return var3 == null || var3.field5062 == null ? 0L : var3.field5062.field701;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILrn;Lrn;)V", line = 305)
    public static final void method428(int arg0, class18 arg1, class18 arg2) {
        class314.field4853 = class363.method2551(class286.field4442, arg0, arg2, arg1, true);
        if (class240.field3737) {
            class43.field690 = class55.method529(arg1, arg2, 0, class286.field4442, false);
        } else {
            class43.field690 = (class70) class314.field4853;
        }
        field653++;
        class346.field5506 = class363.method2551(class281.field4352, 0, arg2, arg1, true);
        class64.field988 = class363.method2551(class264.field4097, 0, arg2, arg1, true);
    }
}
