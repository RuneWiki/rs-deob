import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class595 extends class501 {

    @OriginalMember(owner = "client!ev", name = "O", descriptor = "[I")
    private int[] field8801;

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "[I")
    private int[] field8781;

    @OriginalMember(owner = "client!ev", name = "G", descriptor = "Lpv;")
    private class62 field8793;

    @OriginalMember(owner = "client!ev", name = "E", descriptor = "Lpv;")
    private class62 field8791;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "Lpv;")
    private class62 field8786;

    @OriginalMember(owner = "client!ev", name = "Q", descriptor = "[Lpv;")
    private class62[] field8803;

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "I")
    public static int field8782 = -60;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
    public static int field8777 = 0;

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "Ljava/lang/String;")
    public static String field8788 = null;

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "Z")
    public static boolean field8787 = false;

    @OriginalMember(owner = "client!ev", name = "J", descriptor = "I")
    public static int field8796 = 0;

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "I")
    public static int field8799 = 50;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "[I")
    public static int[] field8785 = new int[field8799];

    @OriginalMember(owner = "client!ev", name = "t", descriptor = "[I")
    public static int[] field8780 = new int[field8799];

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "[I")
    public static int[] field8784 = new int[field8799];

    @OriginalMember(owner = "client!ev", name = "F", descriptor = "[I")
    public static int[] field8792 = new int[field8799];

    @OriginalMember(owner = "client!ev", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field8790 = new String[field8799];

    @OriginalMember(owner = "client!ev", name = "L", descriptor = "[I")
    public static int[] field8798 = new int[field8799];

    @OriginalMember(owner = "client!ev", name = "P", descriptor = "[I")
    public static int[] field8802 = new int[field8799];

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!ev", name = "s", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!ev", name = "w", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!ev", name = "C", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(DBLkda;ILn;ZI)[I", line = 3)
    public final int[] method3518(double arg0, byte arg1, class328 arg2, int arg3, class17 arg4, boolean arg5, int arg6) {
        class44.field519 = arg2;
        field8783++;
        class569.field8397 = arg4;
        for (int var9 = 0; var9 < this.field8803.length; var9++) {
            this.field8803[var9].method400(arg6, true, arg3);
        }
        class137.method962((byte) 86, arg0);
        class82.method620(arg3, arg1 + 1647477237, arg6);
        if (arg1 != 119) {
            return null;
        }
        int[] var10 = new int[arg3 * 4 * arg6];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field8791.field788) {
                int[] var14 = this.field8791.method13(var12, 656024161);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field8791.method409(var12, (byte) -26);
                var15 = var18[2];
                var16 = var18[1];
                var17 = var18[0];
            }
            int[] var19;
            if (this.field8786.field788) {
                var19 = this.field8786.method13(var12, arg1 ^ 0x271A2216);
            } else {
                var19 = this.field8786.method409(var12, (byte) -29)[0];
            }
            if (arg5) {
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
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class615.field9104[var22];
                int var25 = class615.field9104[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class615.field9104[var23];
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
                var10[var11++] = (var27 << 24) + (var25 << 16) + (var24 << 8) + var26;
                if (arg5) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field8803.length; var13++) {
            this.field8803[var13].method405(255);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lkda;Ln;B)Z", line = 140)
    public final boolean method3519(class328 arg0, class17 arg1, byte arg2) {
        field8778++;
        if (class220.field3206 >= 0) {
            for (int var4 = 0; var4 < this.field8801.length; var4++) {
                if (!arg0.method1980(this.field8801[var4], class220.field3206, (byte) -17)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field8801.length; var5++) {
                if (!arg0.method1981(true, this.field8801[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field8781.length; var6++) {
            if (!arg1.method109(this.field8781[var6], 1680)) {
                return false;
            }
        }
        int var7 = 25 / ((arg2 + 53) / 62);
        return true;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(Z)V", line = 199)
    public static void method3520(boolean arg0) {
        field8784 = null;
        field8780 = null;
        field8802 = null;
        field8785 = null;
        field8798 = null;
        if (arg0) {
            field8802 = null;
        }
        field8788 = null;
        field8792 = null;
        field8790 = null;
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(Z)V", line = 220)
    public static final void method3521(boolean arg0) {
        field8797++;
        if (!arg0) {
            field8785 = null;
        }
        if (class645.field9389 != null) {
            class645.field9389.method1566(-2341);
        }
        if (class92.field1377 != null) {
            class92.field1377.method1566(-2341);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lui;B)I", line = 238)
    public static final int method3522(class194 arg0, byte arg1) {
        int var2 = 29 / ((10 - arg1) / 37);
        field8779++;
        if (class194.field2868 == arg0) {
            return 5120;
        } else if (class194.field2872 == arg0) {
            return 5122;
        } else if (class194.field2873 == arg0) {
            return 5124;
        } else if (class194.field2874 == arg0) {
            return 5121;
        } else if (class194.field2875 == arg0) {
            return 5123;
        } else if (class194.field2876 == arg0) {
            return 5125;
        } else if (class194.field2877 == arg0) {
            return 5131;
        } else if (class194.field2878 == arg0) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIILkda;Ln;ZZD)[I", line = 294)
    public final int[] method3523(int arg0, int arg1, int arg2, class328 arg3, class17 arg4, boolean arg5, boolean arg6, double arg7) {
        class569.field8397 = arg4;
        field8794++;
        if (arg2 > -126) {
            return null;
        }
        class44.field519 = arg3;
        for (int var10 = 0; var10 < this.field8803.length; var10++) {
            this.field8803[var10].method400(arg1, true, arg0);
        }
        class137.method962((byte) 86, arg7);
        class82.method620(arg0, 1647477356, arg1);
        int[] var11 = new int[arg0 * arg1];
        int var12;
        byte var13;
        int var14;
        if (arg5) {
            var12 = -1;
            var14 = arg1 - 1;
            var13 = -1;
        } else {
            var12 = arg1;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field8791.field788) {
                int[] var18 = this.field8791.method13(var16, 656024161);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field8791.method409(var16, (byte) -51);
                var19 = var22[1];
                var21 = var22[0];
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
                int var27 = class615.field9104[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class615.field9104[var25];
                int var29 = class615.field9104[var26];
                int var30 = (var27 << 16) + var29 + (var28 << 8);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field8803.length; var17++) {
            this.field8803[var17].method405(255);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(II)V", line = 435)
    public static final void method3524(int arg0, int arg1) {
        field8795++;
        class433.field5796 = arg0;
        class117 var2 = class348.field4770;
        synchronized (class348.field4770) {
            class348.field4770.method837(125);
        }
        if (arg1 > -107) {
            method3521(true);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIZLkda;Ln;)[F", line = 452)
    public final float[] method3525(int arg0, int arg1, int arg2, boolean arg3, class328 arg4, class17 arg5) {
        class44.field519 = arg4;
        class569.field8397 = arg5;
        field8789++;
        for (int var7 = 0; var7 < this.field8803.length; var7++) {
            this.field8803[var7].method400(arg0, true, arg1);
        }
        class82.method620(arg1, 1647477356, arg0);
        float[] var8 = new float[arg0 * 4 * arg1];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field8791.field788) {
                int[] var12 = this.field8791.method13(var10, 656024161);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field8791.method409(var10, (byte) -78);
                var14 = var16[0];
                var13 = var16[1];
                var15 = var16[2];
            }
            int[] var17;
            if (this.field8786.field788) {
                var17 = this.field8786.method13(var10, 656024161);
            } else {
                var17 = this.field8786.method409(var10, (byte) -63)[0];
            }
            int[] var18;
            if (this.field8793.field788) {
                var18 = this.field8793.method13(var10, 656024161);
            } else {
                var18 = this.field8793.method409(var10, (byte) -88)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        int var11 = 0;
        if (arg2 <= 72) {
            this.field8791 = null;
        }
        while (this.field8803.length > var11) {
            this.field8803[var11].method405(255);
            var11++;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V", line = 580)
    public class595() {
        this.field8801 = new int[0];
        this.field8781 = new int[0];
        this.field8793 = new class230(0);
        this.field8793.field781 = 1;
        this.field8791 = new class230();
        this.field8791.field781 = 1;
        this.field8786 = new class230();
        this.field8803 = new class62[] { this.field8791, this.field8786, this.field8793 };
        this.field8786.field781 = 1;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lgw;)V", line = 610)
    public class595(class148 arg0) {
        int var2 = arg0.method1032((byte) -33);
        int var3 = 0;
        int var4 = 0;
        this.field8803 = new class62[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class62 var16 = class272.method1713(arg0, -23402);
            if (var16.method403(0) >= 0) {
                var3++;
            }
            if (var16.method401(-123) >= 0) {
                var4++;
            }
            int var17 = var16.field786.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1032((byte) -33);
            }
            this.field8803[var6] = var16;
        }
        this.field8801 = new int[var3];
        this.field8781 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class62 var11 = this.field8803[var9];
            int var12 = var11.field786.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field786[var13] = this.field8803[var5[var9][var13]];
            }
            int var14 = var11.method403(0);
            int var15 = var11.method401(-125);
            if (var14 > 0) {
                this.field8801[var7++] = var14;
            }
            if (var15 > 0) {
                this.field8781[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field8791 = this.field8803[arg0.method1032((byte) -33)];
        this.field8786 = this.field8803[arg0.method1032((byte) -33)];
        this.field8793 = this.field8803[arg0.method1032((byte) -33)];
        Object var10 = null;
    }
}
