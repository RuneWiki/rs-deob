import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class255 extends class213 {

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "[I")
    private int[] field3735;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "[I")
    private int[] field3720;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "Ljo;")
    private class199 field3727;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "Ljo;")
    private class199 field3732;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "Ljo;")
    private class199 field3717;

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "[Ljo;")
    private class199[] field3731;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "Lcc;")
    public static class327 field3729 = new class327(4);

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    public static int field3734 = 64;

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "S")
    public static short field3737 = 205;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!ln", name = "Y", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 4)
    public static final int method1773(String arg0, int arg1) {
        field3723++;
        int var2 = arg1;
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            var2 = (var2 << 5) + class132.method1013((byte) 116, arg0.charAt(var4)) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(DIILkj;Lfh;IZ)Lvn;", line = 23)
    public final class11 method1774(double arg0, int arg1, int arg2, class252 arg3, class140 arg4, int arg5, boolean arg6) {
        field3739++;
        class62.method453(arg0, (byte) -78);
        class83.field1067 = arg3;
        class134.field1826 = arg4;
        if (arg1 >= -35) {
            field3737 = 117;
        }
        class271.method1849(arg2, arg5, false);
        class11 var9 = new class11(arg2, arg5);
        for (int var10 = 0; var10 < this.field3731.length; var10++) {
            this.field3731[var10].method1465(arg5, 58, arg2);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg6) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3732.field2795) {
                int[] var13 = this.field3732.method190(-1735, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3732.method215(var12, -29869);
                var15 = var17[1];
                var16 = var17[2];
                var14 = var17[0];
            }
            for (int var18 = arg2 - 1; var18 >= 0; var18--) {
                int var19 = var14[var18] >> 4;
                int var20 = var15[var18] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var21 = class340.field5314[var19];
                int var22 = class340.field5314[var20];
                int var23 = var16[var18] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class340.field5314[var23];
                var9.field124[var11++] = (var21 << 16) + (var22 << 8) + var24;
                if (arg6) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field3731.length; var25++) {
            this.field3731[var25].method1454(-2);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBILfh;DLkj;Z)[I", line = 144)
    public final int[] method1775(int arg0, byte arg1, int arg2, class140 arg3, double arg4, class252 arg5, boolean arg6) {
        field3718++;
        int[] var9 = new int[arg0 * arg2 * 4];
        class62.method453(arg4, (byte) -78);
        class83.field1067 = arg5;
        class134.field1826 = arg3;
        class271.method1849(arg0, arg2, false);
        for (int var10 = 0; var10 < this.field3731.length; var10++) {
            this.field3731[var10].method1465(arg2, 87, arg0);
        }
        int var11 = 0;
        int var12 = -104 / ((-arg1 - 55) / 37);
        for (int var13 = 0; var13 < arg2; var13++) {
            if (arg6) {
                var11 = var13;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3732.field2795) {
                int[] var18 = this.field3732.method190(-1735, var13);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field3732.method215(var13, -29869);
                var15 = var14[0];
                var16 = var14[2];
                var17 = var14[1];
            }
            int[] var19;
            if (this.field3717.field2795) {
                var19 = this.field3717.method190(-1735, var13);
            } else {
                var19 = this.field3717.method215(var13, -29869)[0];
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
                int var23 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var24 = class340.field5314[var21];
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                int var25 = class340.field5314[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class340.field5314[var23];
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
                var9[var11++] = (var27 << 24) + var26 + (var24 << 16) + (var25 << 8);
                if (arg6) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var28 = 0; var28 < this.field3731.length; var28++) {
            this.field3731[var28].method1454(-2);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V", line = 275)
    public static void method1776(int arg0) {
        int var1 = -65 % ((-arg0 - 63) / 54);
        field3729 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBZLkj;Lfh;I)[F", line = 295)
    public final float[] method1777(int arg0, byte arg1, boolean arg2, class252 arg3, class140 arg4, int arg5) {
        if (arg1 > -79) {
            this.method1775(-116, (byte) -18, 125, (class140) null, -0.06318501449701354D, (class252) null, true);
        }
        class83.field1067 = arg3;
        field3726++;
        float[] var7 = new float[arg0 * arg5 * 4];
        class134.field1826 = arg4;
        class271.method1849(arg5, arg0, false);
        for (int var8 = 0; var8 < this.field3731.length; var8++) {
            this.field3731[var8].method1465(arg0, 100, arg5);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            if (arg2) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field3732.field2795) {
                int[] var15 = this.field3732.method190(-1735, var10);
                var14 = var15;
                var12 = var15;
                var13 = var15;
            } else {
                int[][] var11 = this.field3732.method215(var10, -29869);
                var12 = var11[1];
                var13 = var11[0];
                var14 = var11[2];
            }
            int[] var16;
            if (this.field3717.field2795) {
                var16 = this.field3717.method190(-1735, var10);
            } else {
                var16 = this.field3717.method215(var10, -29869)[0];
            }
            int[] var17;
            if (this.field3727.field2795) {
                var17 = this.field3727.method190(-1735, var10);
            } else {
                var17 = this.field3727.method215(var10, -29869)[0];
            }
            for (int var18 = arg5 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var19 < 0.0F) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = var19;
                if (arg2) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field3731.length; var21++) {
            this.field3731[var21].method1454(-2);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lkj;Lfh;I)Z", line = 404)
    public final boolean method1778(class252 arg0, class140 arg1, int arg2) {
        field3721++;
        if (arg2 > -25) {
            this.method1777(17, (byte) 54, true, (class252) null, (class140) null, -90);
        }
        if (class194.field2682 > 0) {
            for (int var4 = 0; var4 < this.field3735.length; var4++) {
                if (!arg1.method1087(class194.field2682, true, this.field3735[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3735.length; var5++) {
                if (!arg1.method1076(this.field3735[var5], 64)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3720.length; var6++) {
            if (!arg0.method1617(this.field3720[var6], 1)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILkj;Lfh;IDIZ)Ljn;", line = 463)
    public final class301 method1779(int arg0, class252 arg1, class140 arg2, int arg3, double arg4, int arg5, boolean arg6) {
        class62.method453(arg4, (byte) -78);
        field3730++;
        class83.field1067 = arg1;
        class134.field1826 = arg2;
        class271.method1849(arg5, arg0, false);
        int var9 = -61 % ((arg3 + 36) / 63);
        class301 var10 = new class301(arg5, arg0);
        for (int var11 = 0; var11 < this.field3731.length; var11++) {
            this.field3731[var11].method1465(arg0, 126, arg5);
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg0; var13++) {
            if (arg6) {
                var12 = var13 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3732.field2795) {
                int[] var14 = this.field3732.method190(-1735, var13);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field3732.method215(var13, -29869);
                var17 = var18[0];
                var15 = var18[1];
                var16 = var18[2];
            }
            int[] var19;
            if (this.field3717.field2795) {
                var19 = this.field3717.method190(-1735, var13);
            } else {
                var19 = this.field3717.method215(var13, -29869)[0];
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                int var22 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class340.field5314[var22];
                int var25 = class340.field5314[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class340.field5314[var23];
                int var27;
                if (var25 == 0 && var26 == 0 && var24 == 0) {
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
                var10.field124[var12++] = (var26 << 8) + (var27 << 24) - (-(var25 << 16) - var24);
                if (arg6) {
                    var12 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var28 = 0; var28 < this.field3731.length; var28++) {
            this.field3731[var28].method1454(-2);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 595)
    public static final void method1780(String arg0, int arg1) {
        int var2 = -36 / ((arg1 - 54) / 50);
        field3725++;
        System.out.println("Error: " + class291.method1999(arg0, "\n", "%0a", -64));
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V", line = 607)
    public static final void method1781(int arg0, int arg1, int arg2) {
        field3733++;
        if (arg2 > -41) {
            return;
        }
        if (arg0 == 8) {
            arg0 = 4;
        }
        if (arg0 == 4 && !class177.field2436) {
            arg0 = 2;
            arg1 = 2;
        }
        if (class56.field719 != arg0) {
            if (class321.field4723) {
                return;
            }
            if (class56.field719 != 0) {
                class84.field1081[class56.field719].method126();
            }
            if (arg0 != 0) {
                class18 var3 = class84.field1081[arg0];
                var3.method127();
                var3.method129(arg1);
            }
            class264.field3844 = arg1;
            class56.field719 = arg0;
        } else if (arg0 != 0 && class264.field3844 != arg1) {
            class84.field1081[arg0].method129(arg1);
            class264.field3844 = arg1;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(DZILfh;Lkj;IZI)[I", line = 654)
    public final int[] method1782(double arg0, boolean arg1, int arg2, class140 arg3, class252 arg4, int arg5, boolean arg6, int arg7) {
        class62.method453(arg0, (byte) -78);
        class83.field1067 = arg4;
        class134.field1826 = arg3;
        class271.method1849(arg7, arg5, false);
        field3719++;
        int[] var10 = new int[arg5 * arg7];
        for (int var11 = 0; var11 < this.field3731.length; var11++) {
            this.field3731[var11].method1465(arg5, 54, arg7);
        }
        byte var12;
        int var13;
        int var14;
        if (arg6) {
            var14 = arg7 - 1;
            var13 = -1;
            var12 = -1;
        } else {
            var12 = 1;
            var13 = arg7;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3732.field2795) {
                int[] var21 = this.field3732.method190(-1735, var16);
                var20 = var21;
                var19 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field3732.method215(var16, arg2 - 60188);
                var18 = var17[0];
                var19 = var17[2];
                var20 = var17[1];
            }
            for (int var22 = var14; var22 != var13; var22 += var12) {
                int var23 = var18[var22] >> 4;
                int var24 = var20[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class340.field5314[var24];
                int var27 = class340.field5314[var23];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class340.field5314[var25];
                var10[var15++] = (var26 << 8) + (var27 << 16) + var28;
                if (arg1) {
                    var15 += arg7 - 1;
                }
            }
        }
        if (arg2 != 30319) {
            field3734 = 37;
        }
        for (int var29 = 0; var29 < this.field3731.length; var29++) {
            this.field3731[var29].method1454(-2);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V", line = 796)
    public class255() {
        this.field3735 = new int[0];
        this.field3720 = new int[0];
        this.field3727 = new class114(0);
        this.field3727.field2814 = 1;
        this.field3732 = new class114();
        this.field3732.field2814 = 1;
        this.field3717 = new class114();
        this.field3717.field2814 = 1;
        this.field3731 = new class199[] { this.field3732, this.field3717, this.field3727 };
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lfd;)V", line = 817)
    public class255(class299 arg0) {
        int var2 = 0;
        int var3 = arg0.method2096((byte) -122);
        this.field3731 = new class199[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class199 var7 = class104.method738(arg0, 18120);
            if (var7.method1460(-1) >= 0) {
                var2++;
            }
            if (var7.method1455((byte) -84) >= 0) {
                var4++;
            }
            int var8 = var7.field2800.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method2096((byte) -122);
            }
            this.field3731[var6] = var7;
        }
        this.field3720 = new int[var4];
        int var10 = 0;
        this.field3735 = new int[var2];
        int var11 = 0;
        for (int var12 = 0; var12 < var3; var12++) {
            class199 var13 = this.field3731[var12];
            int var14 = var13.field2800.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field2800[var15] = this.field3731[var5[var12][var15]];
            }
            int var16 = var13.method1460(-1);
            int var17 = var13.method1455((byte) -56);
            if (var16 > 0) {
                this.field3735[var11++] = var16;
            }
            if (var17 > 0) {
                this.field3720[var10++] = var17;
            }
            var5[var12] = null;
        }
        this.field3732 = this.field3731[arg0.method2096((byte) -122)];
        this.field3717 = this.field3731[arg0.method2096((byte) -122)];
        this.field3727 = this.field3731[arg0.method2096((byte) -122)];
        int[][] var18 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lfh;BII)Lvn;", line = 909)
    public static final class11 method1783(class140 arg0, byte arg1, int arg2, int arg3) {
        field3722++;
        if (class134.method1020(1, arg0, arg2, arg3)) {
            if (arg1 > -31) {
                method1780((String) null, 28);
            }
            return class234.method1662(49);
        } else {
            return null;
        }
    }
}
