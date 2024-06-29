import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class251 extends class117 {

    @OriginalMember(owner = "client!om", name = "O", descriptor = "[I")
    private int[] field3634;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "[I")
    private int[] field3622;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "Ljq;")
    private class354 field3621;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "Ljq;")
    private class354 field3629;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "Ljq;")
    private class354 field3620;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "[Ljq;")
    private class354[] field3619;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field3631 = 0;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "[I")
    public static int[] field3635;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "Lhh;")
    public static class84 field3626;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
    public static final void method1595(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3627++;
        if (class133.field2062 == 1) {
            class113.field1797[class220.field3185 / 100].method3129(class113.field1796 - 8, class20.field297 - 8);
        }
        if (class133.field2062 == 2) {
            class113.field1797[class220.field3185 / 100 + 4].method3129(class113.field1796 - 8, class20.field297 + -8);
        }
        if (arg4 != 100) {
            method1600(83);
        }
        class61.method546(-17909);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZLm;ILhh;)[F")
    public final float[] method1596(int arg0, int arg1, boolean arg2, class126 arg3, int arg4, class84 arg5) {
        client.field2884 = arg3;
        field3618++;
        class255.field3683 = arg5;
        for (int var7 = 0; var7 < this.field3619.length; var7++) {
            this.field3619[var7].method642(arg0, -104, arg1);
        }
        if (arg4 > -95) {
            field3631 = 34;
        }
        class367.method2363(arg1, false, arg0);
        float[] var8 = new float[arg0 * arg1 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field3629.field5354) {
                int[] var12 = this.field3629.method253(var10, (byte) -95);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field3629.method207((byte) -116, var10);
                var14 = var16[2];
                var13 = var16[0];
                var15 = var16[1];
            }
            int[] var17;
            if (this.field3620.field5354) {
                var17 = this.field3620.method253(var10, (byte) -95);
            } else {
                var17 = this.field3620.method207((byte) -85, var10)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field3621.field5354) {
                var18 = this.field3621.method253(var10, (byte) -95);
            } else {
                var18 = this.field3621.method207((byte) -82, var10)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
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
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field3619.length; var11++) {
            this.field3619[var11].method203((byte) -10);
        }
        return var8;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lhh;ZIDBLm;IZ)[I")
    public final int[] method1597(class84 arg0, boolean arg1, int arg2, double arg3, byte arg4, class126 arg5, int arg6, boolean arg7) {
        field3628++;
        client.field2884 = arg5;
        class255.field3683 = arg0;
        if (arg4 != -86) {
            this.field3619 = null;
        }
        for (int var10 = 0; var10 < this.field3619.length; var10++) {
            this.field3619[var10].method642(arg6, arg4 ^ 0xFFFFFFD0, arg2);
        }
        class470.method2806(arg3, (byte) -35);
        class367.method2363(arg2, false, arg6);
        int[] var11 = new int[arg2 * arg6];
        byte var12;
        int var13;
        int var14;
        if (arg1) {
            var14 = arg2 - 1;
            var13 = -1;
            var12 = -1;
        } else {
            var12 = 1;
            var13 = arg2;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3629.field5354) {
                int[] var18 = this.field3629.method253(var16, (byte) -95);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field3629.method207((byte) -126, var16);
                var19 = var22[0];
                var20 = var22[2];
                var21 = var22[1];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
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
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class479.field7028[var25];
                int var28 = class479.field7028[var24];
                int var29 = class479.field7028[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3619.length; var17++) {
            this.field3619[var17].method203((byte) -10);
        }
        return var11;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1598(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field3632++;
        int var8 = arg2 - arg7;
        int var9 = arg6 + arg7;
        for (int var10 = arg6; var10 < var9; var10++) {
            class217.method1448(class436.field6332[var10], arg0, arg5, 4, arg3);
        }
        int var11 = arg3 - arg7;
        int var12 = arg0 + arg7;
        for (int var13 = arg2; var13 > var8; var13--) {
            class217.method1448(class436.field6332[var13], arg0, arg5, 4, arg3);
        }
        if (arg4) {
            method1595(-78, -120, 88, -9, 28);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class436.field6332[var14];
            class217.method1448(var15, arg0, arg5, 4, var12);
            class217.method1448(var15, var12, arg1, 4, var11);
            class217.method1448(var15, var11, arg5, 4, arg3);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLhh;Lm;)Z")
    public final boolean method1599(byte arg0, class84 arg1, class126 arg2) {
        if (arg0 != 44) {
            this.field3629 = null;
        }
        field3623++;
        if (class92.field1523 < 0) {
            for (int var4 = 0; var4 < this.field3622.length; var4++) {
                if (!arg1.method682(arg0 ^ 0x2C, this.field3622[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3622.length; var5++) {
                if (!arg1.method688((byte) 78, class92.field1523, this.field3622[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3634.length; var6++) {
            if (!arg2.method937((byte) 43, this.field3634[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
    public static void method1600(int arg0) {
        field3626 = null;
        if (arg0 != 21099) {
            method1595(12, -118, -43, 125, 17);
        }
        field3635 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIZDLhh;Lm;)[I")
    public final int[] method1601(int arg0, int arg1, int arg2, boolean arg3, double arg4, class84 arg5, class126 arg6) {
        field3625++;
        client.field2884 = arg6;
        class255.field3683 = arg5;
        int var9 = 0;
        int var10 = -19 / ((6 - arg1) / 63);
        while (var9 < this.field3619.length) {
            this.field3619[var9].method642(arg0, 0, arg2);
            var9++;
        }
        class470.method2806(arg4, (byte) -35);
        class367.method2363(arg2, false, arg0);
        int[] var11 = new int[arg0 * 4 * arg2];
        int var12 = 0;
        for (int var13 = 0; var13 < arg0; var13++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field3629.field5354) {
                int[] var19 = this.field3629.method253(var13, (byte) -95);
                var16 = var19;
                var17 = var19;
                var18 = var19;
            } else {
                int[][] var15 = this.field3629.method207((byte) -60, var13);
                var16 = var15[0];
                var17 = var15[2];
                var18 = var15[1];
            }
            if (arg3) {
                var12 = var13;
            }
            int[] var20;
            if (this.field3620.field5354) {
                var20 = this.field3620.method253(var13, (byte) -95);
            } else {
                var20 = this.field3620.method207((byte) -107, var13)[0];
            }
            for (int var21 = arg2 - 1; var21 >= 0; var21--) {
                int var22 = var16[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var18[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var17[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class479.field7028[var22];
                int var26 = class479.field7028[var23];
                int var27 = class479.field7028[var24];
                int var28;
                if (var25 == 0 && var26 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var11[var12++] = (var25 << 16) + (var28 << 24) - (-(var26 << 8) - var27);
                if (arg3) {
                    var12 += arg2 - 1;
                }
            }
        }
        for (int var14 = 0; var14 < this.field3619.length; var14++) {
            this.field3619[var14].method203((byte) -10);
        }
        return var11;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)V")
    public static final void method1602(int arg0, int arg1) {
        field3630++;
        class285.field4131 = arg0;
        class364 var2 = class510.field7486;
        synchronized (class510.field7486) {
            class510.field7486.method2349(arg1 ^ arg1);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILqa;III)Lc;")
    public static final class121 method1603(int arg0, int arg1, int arg2, class162 arg3, int arg4, int arg5, int arg6) {
        field3633++;
        long var7 = (long) arg5;
        class121 var9 = (class121) class22.field343.method2339(-71, var7);
        short var10 = 2055;
        if (var9 == null) {
            class527 var11 = class388.method2439(arg5, class300.field4276, 0, 2481);
            if (var11 == null) {
                return null;
            }
            if (var11.field7767 < 13) {
                var11.method3124(0, (byte) -69);
            }
            var9 = arg3.method499(var11, var10, class115.field1834, 64, 768);
            class22.field343.method2342(var7, var9, 49);
        }
        if (arg1 != -19424) {
            method1602(-45, -11);
        }
        class121 var12 = var9.method881((byte) 2, var10, true);
        if (arg2 != 0) {
            var12.method897(arg2);
        }
        if (arg4 != 0) {
            var12.method886(arg4);
        }
        if (arg6 != 0) {
            var12.method895(arg6);
        }
        if (arg0 != 0) {
            var12.method884(0, arg0, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
    public class251() {
        this.field3634 = new int[0];
        this.field3622 = new int[0];
        this.field3621 = new class226(0);
        this.field3621.field5348 = 1;
        this.field3629 = new class226();
        this.field3629.field5348 = 1;
        this.field3620 = new class226();
        this.field3619 = new class354[] { this.field3629, this.field3620, this.field3621 };
        this.field3620.field5348 = 1;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lti;)V")
    public class251(class303 arg0) {
        int var2 = arg0.method1918((byte) 94);
        int var3 = 0;
        int var4 = 0;
        this.field3619 = new class354[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class354 var16 = class16.method154(-5563, arg0);
            if (var16.method201(-106) >= 0) {
                var3++;
            }
            if (var16.method643(-1529307414) >= 0) {
                var4++;
            }
            int var17 = var16.field5365.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1918((byte) 74);
            }
            this.field3619[var6] = var16;
        }
        this.field3622 = new int[var3];
        this.field3634 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class354 var11 = this.field3619[var9];
            int var12 = var11.field5365.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5365[var13] = this.field3619[var5[var9][var13]];
            }
            int var14 = var11.method201(84);
            int var15 = var11.method643(-1529307414);
            if (var14 > 0) {
                this.field3622[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3634[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3629 = this.field3619[arg0.method1918((byte) 76)];
        this.field3620 = this.field3619[arg0.method1918((byte) 114)];
        this.field3621 = this.field3619[arg0.method1918((byte) 84)];
        Object var10 = null;
    }

    static {
        new class180("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field3635 = new int[] { 1, 4 };
    }
}
