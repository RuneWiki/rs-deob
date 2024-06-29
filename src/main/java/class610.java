import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class610 extends class219 {

    @OriginalMember(owner = "client!nw", name = "G", descriptor = "[I")
    private int[] field8620;

    @OriginalMember(owner = "client!nw", name = "A", descriptor = "[I")
    private int[] field8614;

    @OriginalMember(owner = "client!nw", name = "B", descriptor = "Lrl;")
    private class751 field8615;

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "Lrl;")
    private class751 field8613;

    @OriginalMember(owner = "client!nw", name = "y", descriptor = "Lrl;")
    private class751 field8612;

    @OriginalMember(owner = "client!nw", name = "t", descriptor = "[Lrl;")
    private class751[] field8607;

    @OriginalMember(owner = "client!nw", name = "u", descriptor = "Lke;")
    public static class622 field8608 = new class622(107, 0);

    @OriginalMember(owner = "client!nw", name = "D", descriptor = "Lrh;")
    public static class275 field8617 = new class275(11, 0, 1, 2);

    @OriginalMember(owner = "client!nw", name = "F", descriptor = "I")
    public static int field8619 = 1409;

    @OriginalMember(owner = "client!nw", name = "v", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!nw", name = "w", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!nw", name = "x", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!nw", name = "C", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!nw", name = "E", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!nw", name = "H", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)Z", line = 6)
    public static final boolean method3514(boolean arg0) {
        field8616++;
        try {
            class386 var1 = new class386();
            byte[] var2 = var1.method2358(class371.field5326, (byte) -121);
            if (arg0) {
                field8608 = null;
            }
            class393.method2396((byte) 118, var2);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V", line = 41)
    public static void method3515(int arg0) {
        field8608 = null;
        if (arg0 != -2802) {
            field8608 = null;
        }
        field8617 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILd;Lcb;ZDIZI)[I", line = 52)
    public final int[] method3516(int arg0, class159 arg1, class544 arg2, boolean arg3, double arg4, int arg5, boolean arg6, int arg7) {
        field8610++;
        class190.field2833 = arg1;
        class770.field10620 = arg2;
        if (arg5 > -16) {
            return null;
        }
        for (int var10 = 0; var10 < this.field8607.length; var10++) {
            this.field8607[var10].method311(arg0, 62, arg7);
        }
        class678.method3832(arg4, 27536);
        class88.method628(-10452, arg7, arg0);
        int[] var11 = new int[arg0 * arg7];
        int var12;
        byte var13;
        int var14;
        if (arg3) {
            var12 = -1;
            var13 = -1;
            var14 = arg0 - 1;
        } else {
            var12 = arg0;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field8613.field10415) {
                int[] var22 = this.field8613.method365(var16, 4095);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field8613.method147(var16, (byte) 57);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            if (arg6) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var20[var23] >> 4;
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
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class596.field8419[var25];
                int var28 = class596.field8419[var24];
                int var29 = class596.field8419[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field8607.length; var17++) {
            this.field8607[var17].method313(-1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILd;ZIILcb;)[F", line = 192)
    public final float[] method3517(int arg0, class159 arg1, boolean arg2, int arg3, int arg4, class544 arg5) {
        if (arg3 != -29919) {
            method3514(true);
        }
        field8621++;
        class770.field10620 = arg5;
        class190.field2833 = arg1;
        for (int var7 = 0; var7 < this.field8607.length; var7++) {
            this.field8607[var7].method311(arg0, -119, arg4);
        }
        class88.method628(-10452, arg4, arg0);
        float[] var8 = new float[arg0 * 4 * arg4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field8613.field10415) {
                int[] var12 = this.field8613.method365(var10, 4095);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field8613.method147(var10, (byte) 57);
                var15 = var16[1];
                var14 = var16[2];
                var13 = var16[0];
            }
            int[] var17;
            if (this.field8612.field10415) {
                var17 = this.field8612.method365(var10, 4095);
            } else {
                var17 = this.field8612.method147(var10, (byte) 57)[0];
            }
            int[] var18;
            if (this.field8615.field10415) {
                var18 = this.field8615.method365(var10, arg3 + 34014);
            } else {
                var18 = this.field8615.method147(var10, (byte) 57)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg2) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field8607.length; var11++) {
            this.field8607[var11].method313(-1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZLkj;ZLjava/lang/String;I)V", line = 307)
    public static final void method3518(boolean arg0, class590 arg1, boolean arg2, String arg3, int arg4) {
        field8611++;
        int var5 = -84 / ((-arg4 - 30) / 44);
        if (!arg0) {
            class437.method2637(3, arg1, arg3, 26027);
            return;
        }
        if (class590.field8347.startsWith("win") && arg1.field8334) {
            String var6 = null;
            if (class535.field7544 != null) {
                var6 = class535.field7544.getParameter("haveie6");
            }
            if (var6 == null || !var6.equals("1")) {
                class370 var7 = class437.method2637(0, arg1, arg3, 26027);
                class54.field748 = arg3;
                class115.field1448 = arg1;
                class1.field19 = var7;
                return;
            }
        }
        if (class590.field8347.startsWith("mac")) {
            String var8 = null;
            if (class535.field7544 != null) {
                var8 = class535.field7544.getParameter("havefirefox");
            }
            if (var8 != null && var8.equals("1") && arg2) {
                class437.method2637(1, arg1, arg3, 26027);
                return;
            }
        }
        class437.method2637(2, arg1, arg3, 26027);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIDLd;ZLcb;)[I", line = 385)
    public final int[] method3519(int arg0, int arg1, int arg2, double arg3, class159 arg4, boolean arg5, class544 arg6) {
        class770.field10620 = arg6;
        field8609++;
        class190.field2833 = arg4;
        int var9 = 0;
        if (arg2 <= 98) {
            this.method3520(null, null, 87);
        }
        while (var9 < this.field8607.length) {
            this.field8607[var9].method311(arg0, -85, arg1);
            var9++;
        }
        class678.method3832(arg3, 27536);
        class88.method628(-10452, arg1, arg0);
        int[] var10 = new int[arg0 * arg1];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field8613.field10415) {
                int[] var14 = this.field8613.method365(var12, 4095);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field8613.method147(var12, (byte) 57);
                var17 = var18[1];
                var15 = var18[0];
                var16 = var18[2];
            }
            int[] var19;
            if (this.field8612.field10415) {
                var19 = this.field8612.method365(var12, 4095);
            } else {
                var19 = this.field8612.method147(var12, (byte) 57)[0];
            }
            if (arg5) {
                var11 = var12;
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
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
                int var24 = class596.field8419[var22];
                int var25 = class596.field8419[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class596.field8419[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
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
                var10[var11++] = (var24 << 8) + (var25 << 16) + ((var27 << 24) - -var26);
                if (arg5) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field8607.length; var13++) {
            this.field8607[var13].method313(-1);
        }
        return var10;
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "()V", line = 521)
    public class610() {
        this.field8620 = new int[0];
        this.field8614 = new int[0];
        this.field8615 = new class503(0);
        this.field8615.field10414 = 1;
        this.field8613 = new class503();
        this.field8613.field10414 = 1;
        this.field8612 = new class503();
        this.field8607 = new class751[] { this.field8613, this.field8612, this.field8615 };
        this.field8612.field10414 = 1;
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lrv;)V", line = 537)
    public class610(class120 arg0) {
        int var2 = arg0.method842(2384);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field8607 = new class751[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class751 var16 = class363.method2269(false, arg0);
            if (var16.method3296((byte) 65) >= 0) {
                var3++;
            }
            if (var16.method317(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field10416.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method842(2384);
            }
            this.field8607[var6] = var16;
        }
        this.field8620 = new int[var3];
        int var7 = 0;
        this.field8614 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class751 var11 = this.field8607[var9];
            int var12 = var11.field10416.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field10416[var13] = this.field8607[var5[var9][var13]];
            }
            int var14 = var11.method3296((byte) 65);
            int var15 = var11.method317(-1);
            if (var14 > 0) {
                this.field8620[var7++] = var14;
            }
            if (var15 > 0) {
                this.field8614[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field8613 = this.field8607[arg0.method842(2384)];
        this.field8612 = this.field8607[arg0.method842(2384)];
        Object var10 = null;
        this.field8615 = this.field8607[arg0.method842(2384)];
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lcb;Ld;I)Z", line = 624)
    public final boolean method3520(class544 arg0, class159 arg1, int arg2) {
        field8618++;
        if (class116.field1453 >= 0) {
            for (int var4 = 0; var4 < this.field8620.length; var4++) {
                if (!arg0.method3135(arg2 - 24461, this.field8620[var4], class116.field1453)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field8620.length; var5++) {
                if (!arg0.method3131(-49, this.field8620[var5])) {
                    return false;
                }
            }
        }
        if (arg2 != 24460) {
            this.method3520(null, null, -55);
        }
        for (int var6 = 0; var6 < this.field8614.length; var6++) {
            if (!arg1.method1262(this.field8614[var6], (byte) 93)) {
                return false;
            }
        }
        return true;
    }
}
