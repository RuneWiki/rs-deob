import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class505 extends class85 {

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "[I")
    private int[] field7425;

    @OriginalMember(owner = "client!aw", name = "C", descriptor = "[I")
    private int[] field7426;

    @OriginalMember(owner = "client!aw", name = "D", descriptor = "Ldw;")
    private class96 field7427;

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "Ldw;")
    private class96 field7424;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "Ldw;")
    private class96 field7432;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "[Ldw;")
    private class96[] field7434;

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "Lkk;")
    public static class114 field7429 = new class114(8);

    @OriginalMember(owner = "client!aw", name = "y", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lm;ILdn;IIZ)[F")
    public final float[] method3004(class79 arg0, int arg1, class201 arg2, int arg3, int arg4, boolean arg5) {
        class458.field6405 = arg2;
        field7422++;
        class97.field1360 = arg0;
        for (int var7 = 0; var7 < this.field7434.length; var7++) {
            this.field7434[var7].method664(arg1, 23124, arg3);
        }
        class169.method1126(arg1, -1, arg3);
        float[] var8 = new float[arg1 * 4 * arg3];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field7424.field1329) {
                int[] var12 = this.field7424.method37(var10, 255);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field7424.method36(arg4 + 8, var10);
                var15 = var16[0];
                var14 = var16[2];
                var13 = var16[1];
            }
            int[] var17;
            if (this.field7432.field1329) {
                var17 = this.field7432.method37(var10, 255);
            } else {
                var17 = this.field7432.method36(3, var10)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field7427.field1329) {
                var18 = this.field7427.method37(var10, 255);
            } else {
                var18 = this.field7427.method36(3, var10)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field7434.length; var11++) {
            this.field7434[var11].method655(arg4 - 29962);
        }
        if (arg4 == -5) {
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lm;Ldn;B)Z")
    public final boolean method3005(class79 arg0, class201 arg1, byte arg2) {
        field7423++;
        if (class19.field326 >= 0) {
            for (int var4 = 0; var4 < this.field7426.length; var4++) {
                if (!arg1.method1317(0, class19.field326, this.field7426[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field7426.length; var5++) {
                if (!arg1.method1294(this.field7426[var5], (byte) -127)) {
                    return false;
                }
            }
        }
        int var6 = 0;
        if (arg2 != 32) {
            return true;
        }
        while (this.field7425.length > var6) {
            if (!arg0.method461(this.field7425[var6], false)) {
                return false;
            }
            var6++;
        }
        return true;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZBLm;Ldn;DII)[I")
    public final int[] method3006(boolean arg0, byte arg1, class79 arg2, class201 arg3, double arg4, int arg5, int arg6) {
        field7431++;
        class97.field1360 = arg2;
        class458.field6405 = arg3;
        for (int var9 = 0; var9 < this.field7434.length; var9++) {
            this.field7434[var9].method664(arg5, arg1 ^ 0x5A19, arg6);
        }
        class77.method443(18356, arg4);
        class169.method1126(arg5, arg1 ^ 0xFFFFFFB2, arg6);
        int[] var10 = new int[arg5 * 4 * arg6];
        if (arg1 != 77) {
            this.method3004(null, 115, null, -92, 23, false);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field7424.field1329) {
                int[] var14 = this.field7424.method37(var12, 255);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field7424.method36(arg1 ^ 0x4E, var12);
                var16 = var18[2];
                var17 = var18[0];
                var15 = var18[1];
            }
            int[] var19;
            if (this.field7432.field1329) {
                var19 = this.field7432.method37(var12, 255);
            } else {
                var19 = this.field7432.method36(arg1 - 74, var12)[0];
            }
            if (arg0) {
                var11 = var12;
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class281.field3595[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class281.field3595[var22];
                int var26 = class281.field3595[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var27 << 24) - (-(var24 << 16) - ((var25 << 8) + var26));
                if (arg0) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field7434.length; var13++) {
            this.field7434[var13].method655(arg1 - 30044);
        }
        return var10;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
    public static void method3007(int arg0) {
        if (arg0 > -25) {
            field7429 = null;
        }
        field7429 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZILdn;Lm;DIZI)[I")
    public final int[] method3008(boolean arg0, int arg1, class201 arg2, class79 arg3, double arg4, int arg5, boolean arg6, int arg7) {
        class458.field6405 = arg2;
        class97.field1360 = arg3;
        if (arg5 > -16) {
            this.method3004(null, 122, null, -76, 39, true);
        }
        field7430++;
        for (int var10 = 0; var10 < this.field7434.length; var10++) {
            this.field7434[var10].method664(arg1, 23124, arg7);
        }
        class77.method443(18356, arg4);
        class169.method1126(arg1, -1, arg7);
        int[] var11 = new int[arg1 * arg7];
        int var12;
        byte var13;
        int var14;
        if (arg0) {
            var13 = -1;
            var12 = -1;
            var14 = arg7 - 1;
        } else {
            var12 = arg7;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field7424.field1329) {
                int[] var18 = this.field7424.method37(var16, 255);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field7424.method36(3, var16);
                var21 = var22[0];
                var19 = var22[1];
                var20 = var22[2];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class281.field3595[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class281.field3595[var24];
                int var29 = class281.field3595[var26];
                int var30 = (var28 << 16) + var29 + (var27 << 8);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field7434.length; var17++) {
            this.field7434[var17].method655(-29967);
        }
        return var11;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BB)V")
    public static final void method3009(byte arg0, byte arg1) {
        if (class478.field6978 == null) {
            class478.field6978 = new byte[4][class200.field2594][class118.field1647];
        }
        field7428++;
        if (arg0 != 12) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class200.field2594; var3++) {
                for (int var4 = 0; var4 < class118.field1647; var4++) {
                    class478.field6978[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BIIIII)V")
    public static final void method3010(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -50) {
            return;
        }
        field7433++;
        int var6 = arg2 - arg3;
        int var7 = arg1 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class510.method3030(93, arg5, arg4, arg1, arg3);
            }
        } else if (var7 == 0) {
            class88.method588(arg2, -2, arg3, arg4, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class65.field827) {
                var11 = var9 + (class65.field827 * var8 >> 12);
                var10 = class65.field827;
            } else if (arg2 <= class281.field3589) {
                var10 = arg2;
                var11 = arg1;
            } else {
                var11 = (class281.field3589 * var8 >> 12) + var9;
                var10 = class281.field3589;
            }
            int var12;
            int var13;
            if (class65.field827 > arg3) {
                var12 = class65.field827;
                var13 = (class65.field827 * var8 >> 12) + var9;
            } else if (arg3 > class281.field3589) {
                var12 = class281.field3589;
                var13 = var9 + (class281.field3589 * var8 >> 12);
            } else {
                var12 = arg3;
                var13 = arg4;
            }
            if (var11 < class418.field5559) {
                var10 = (class418.field5559 - var9 << 12) / var8;
                var11 = class418.field5559;
            } else if (class456.field6365 < var11) {
                var11 = class456.field6365;
                var10 = (class456.field6365 - var9 << 12) / var8;
            }
            if (var13 < class418.field5559) {
                var13 = class418.field5559;
                var12 = (class418.field5559 - var9 << 12) / var8;
            } else if (var13 > class456.field6365) {
                var13 = class456.field6365;
                var12 = (class456.field6365 - var9 << 12) / var8;
            }
            class148.method1026(var12, arg5, var10, var11, var13, 9114);
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
    public class505() {
        this.field7425 = new int[0];
        this.field7426 = new int[0];
        this.field7427 = new class443(0);
        this.field7427.field1335 = 1;
        this.field7424 = new class443();
        this.field7424.field1335 = 1;
        this.field7432 = new class443();
        this.field7434 = new class96[] { this.field7424, this.field7432, this.field7427 };
        this.field7432.field1335 = 1;
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lbt;)V")
    public class505(class88 arg0) {
        int var2 = arg0.method617(2);
        int var3 = 0;
        int var4 = 0;
        this.field7434 = new class96[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class96 var16 = class351.method2061(arg0, -37);
            if (var16.method654(0) >= 0) {
                var3++;
            }
            if (var16.method663(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field1343.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method617(2);
            }
            this.field7434[var6] = var16;
        }
        this.field7426 = new int[var3];
        this.field7425 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class96 var11 = this.field7434[var9];
            int var12 = var11.field1343.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1343[var13] = this.field7434[var5[var9][var13]];
            }
            int var14 = var11.method654(0);
            int var15 = var11.method663(-1);
            if (var14 > 0) {
                this.field7426[var7++] = var14;
            }
            if (var15 > 0) {
                this.field7425[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field7424 = this.field7434[arg0.method617(2)];
        this.field7432 = this.field7434[arg0.method617(2)];
        this.field7427 = this.field7434[arg0.method617(2)];
        Object var10 = null;
    }
}
