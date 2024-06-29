import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class222 extends class446 {

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "[I")
    private int[] field3101;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "[I")
    private int[] field3098;

    @OriginalMember(owner = "client!pp", name = "P", descriptor = "Ln;")
    private class13 field3116;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "Ln;")
    private class13 field3111;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "Ln;")
    private class13 field3112;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "[Ln;")
    private class13[] field3107;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "J")
    public static long field3102 = 0L;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "[S")
    public static short[] field3113 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!pp", name = "Q", descriptor = "I")
    public static int field3117;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pp", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field3118;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "[Lsg;")
    public static class226[] field3103;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "[[Lwk;")
    public static class76[][] field3099;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "[[[B")
    public static byte[][][] field3108;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILnq;Lja;ZII)[F")
    public final float[] method1470(int arg0, class268 arg1, class152 arg2, boolean arg3, int arg4, int arg5) {
        field3104++;
        class30.field498 = arg2;
        class275.field3833 = arg1;
        for (int var7 = 0; var7 < this.field3107.length; var7++) {
            this.field3107[var7].method224(false, arg5, arg0);
        }
        class390.method2468(arg0, arg5, -111);
        float[] var8 = new float[arg0 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field3111.field259) {
                int[] var12 = this.field3111.method29(true, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field3111.method222(-27832, var10);
                var13 = var16[2];
                var15 = var16[0];
                var14 = var16[1];
            }
            int[] var17;
            if (this.field3112.field259) {
                var17 = this.field3112.method29(true, var10);
            } else {
                var17 = this.field3112.method222(-27832, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field3116.field259) {
                var18 = this.field3116.method29(true, var10);
            } else {
                var18 = this.field3116.method222(arg4 - 27832, var10)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var11 = arg4; var11 < this.field3107.length; var11++) {
            this.field3107[var11].method221((byte) -114);
        }
        return var8;
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)V")
    public static final void method1471(byte arg0) {
        field3110++;
        if (class100.method716(-30150) != 2) {
            return;
        }
        byte var1 = (byte) (class70.field1025 - 4 & 0xFF);
        int var2 = class70.field1025 % class211.field2954;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class290.field4061; var16++) {
                field3108[var3][var2][var16] = var1;
            }
        }
        if (class142.field2034 == 3 || arg0 > -96) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class116.field1672[var4] = -1000000;
            class304.field4203[var4] = 1000000;
            class69.field1021[var4] = 0;
            class164.field2269[var4] = 1000000;
            class159.field2235[var4] = 0;
        }
        if (class128.field1807 != 1) {
            int var5 = class285.method1858(class106.field1447, class142.field2034, class20.field376, -58);
            if ((var5 - class7.field107) < 800 && (class368.field5193[class142.field2034][class106.field1447 >> 7][class20.field376 >> 7] & 0x4) != 0) {
                class187.method1211((byte) 68, class20.field376 >> 7, 1, false, class328.field4549, class106.field1447 >> 7);
                return;
            }
            return;
        }
        if ((class368.field5193[class142.field2034][class412.field5841.field6262 >> 7][class412.field5841.field6266 >> 7] & 0x4) != 0) {
            class187.method1211((byte) 126, class412.field5841.field6266 >> 7, 0, false, class328.field4549, class412.field5841.field6262 >> 7);
        }
        if (class329.field4568 >= 2560) {
            return;
        }
        int var6 = class106.field1447 >> 7;
        int var7 = class20.field376 >> 7;
        int var8 = class412.field5841.field6262 >> 7;
        int var9 = class412.field5841.field6266 >> 7;
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var7 >= var9) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if (var10 == 0 && var11 == 0 || -class211.field2954 >= var10 || var10 >= class211.field2954 || (-class290.field4061) >= var11 || class290.field4061 <= var11) {
            class271.method1776(-2296, (Throwable) null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class212.field2968 + "," + class447.field6269);
            return;
        }
        if (var11 >= var10) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class368.field5193[class142.field2034][var6][var7] & 0x4) != 0) {
                    class187.method1211((byte) 117, var7, 1, false, class328.field4549, var6);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    var13 -= 65536;
                    if ((class368.field5193[class142.field2034][var6][var7] & 0x4) != 0) {
                        class187.method1211((byte) 96, var7, 1, false, class328.field4549, var6);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var8) {
            if (var8 > var6) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class368.field5193[class142.field2034][var6][var7] & 0x4) != 0) {
                class187.method1211((byte) 103, var7, 1, false, class328.field4549, var6);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                var15 -= 65536;
                if ((class368.field5193[class142.field2034][var6][var7] & 0x4) != 0) {
                    class187.method1211((byte) 111, var7, 1, false, class328.field4549, var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLnq;IZIDLja;)[I")
    public final int[] method1472(boolean arg0, class268 arg1, int arg2, boolean arg3, int arg4, double arg5, class152 arg6) {
        class275.field3833 = arg1;
        field3117++;
        class30.field498 = arg6;
        for (int var9 = 0; var9 < this.field3107.length; var9++) {
            this.field3107[var9].method224(false, arg4, arg2);
        }
        class46.method405(arg5, true);
        class390.method2468(arg2, arg4, -84);
        int[] var10 = new int[arg2 * 4 * arg4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3111.field259) {
                int[] var18 = this.field3111.method29(!arg0, var12);
                var16 = var18;
                var17 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field3111.method222(-27832, var12);
                var15 = var14[0];
                var16 = var14[1];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field3112.field259) {
                var19 = this.field3112.method29(true, var12);
            } else {
                var19 = this.field3112.method222(-27832, var12)[0];
            }
            if (arg3) {
                var11 = var12;
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
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
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class328.field4545[var21];
                int var25 = class328.field4545[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class328.field4545[var23];
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
                var10[var11++] = (var24 << 16) + (var27 << 24) + ((var25 << 8) - -var26);
                if (arg3) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3107.length; var13++) {
            this.field3107[var13].method221((byte) -52);
        }
        if (arg0) {
            this.method1475((class152) null, (class268) null, -57);
        }
        return var10;
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)V")
    public static void method1473(int arg0) {
        field3108 = null;
        if (arg0 != -1) {
            method1476((byte) -26);
        }
        field3113 = null;
        field3099 = null;
        field3103 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZILnq;DLja;BIZ)[I")
    public final int[] method1474(boolean arg0, int arg1, class268 arg2, double arg3, class152 arg4, byte arg5, int arg6, boolean arg7) {
        class275.field3833 = arg2;
        if (arg5 != -35) {
            method1473(37);
        }
        class30.field498 = arg4;
        field3106++;
        for (int var10 = 0; var10 < this.field3107.length; var10++) {
            this.field3107[var10].method224(false, arg6, arg1);
        }
        class46.method405(arg3, true);
        class390.method2468(arg1, arg6, arg5 - 27);
        int[] var11 = new int[arg1 * arg6];
        byte var12;
        int var13;
        int var14;
        if (arg0) {
            var12 = -1;
            var13 = -1;
            var14 = arg1 - 1;
        } else {
            var13 = arg1;
            var12 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3111.field259) {
                int[] var22 = this.field3111.method29(true, var16);
                var21 = var22;
                var20 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field3111.method222(-27832, var16);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            if (arg7) {
                var15 = var16;
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
                int var27 = class328.field4545[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class328.field4545[var24];
                int var29 = class328.field4545[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3107.length; var17++) {
            this.field3107[var17].method221((byte) -11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lja;Lnq;I)Z")
    public final boolean method1475(class152 arg0, class268 arg1, int arg2) {
        field3115++;
        if (class188.field2599 > 0) {
            for (int var4 = 0; var4 < this.field3098.length; var4++) {
                if (!arg1.method1765(false, class188.field2599, this.field3098[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3098.length; var5++) {
                if (!arg1.method1759(-67, this.field3098[var5])) {
                    return false;
                }
            }
        }
        if (arg2 != -21036) {
            method1476((byte) 114);
        }
        for (int var6 = 0; var6 < this.field3101.length; var6++) {
            if (!arg0.method473(this.field3101[var6], 104)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "(B)V")
    public static final void method1476(byte arg0) {
        field3114++;
        if (arg0 != -71) {
            field3100 = -25;
        }
        if (class217.field2997 != null) {
            return;
        }
        Container var1;
        if (class79.field1119 == null) {
            var1 = class241.field3426.field4121;
        } else {
            var1 = class79.field1119;
        }
        class197.field2713 = var1.getSize().width;
        class335.field4614 = var1.getSize().height;
        if (class79.field1119 == var1) {
            Insets var2 = class79.field1119.getInsets();
            class197.field2713 -= var2.right + var2.left;
            class335.field4614 -= var2.top + var2.bottom;
        }
        if (class405.method2542(arg0 + 70) == 1) {
            class180.field2469 = (class197.field2713 - 765) / 2;
            class47.field661 = 765;
            class237.field3366 = 0;
            class214.field2993 = 503;
        } else if (class445.field6242 < 96 && class326.field4462 == 0) {
            int var3 = class197.field2713 > 1024 ? 1024 : class197.field2713;
            class180.field2469 = (class197.field2713 - var3) / 2;
            class47.field661 = var3;
            int var4 = class335.field4614 <= 768 ? class335.field4614 : 768;
            class237.field3366 = 0;
            class214.field2993 = var4;
        } else {
            class180.field2469 = 0;
            class214.field2993 = class335.field4614;
            class47.field661 = class197.field2713;
            class237.field3366 = 0;
        }
        if (class203.field2787 != 0) {
            boolean var10000;
            if (class47.field661 < 1024 && class214.field2993 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class304.field4191.setSize(class47.field661, class214.field2993);
        if (class64.field949 != null) {
            class64.field949.method129();
        }
        if (class79.field1119 == var1) {
            Insets var5 = class79.field1119.getInsets();
            class304.field4191.setLocation(var5.left + class180.field2469, var5.top - -class237.field3366);
        } else {
            class304.field4191.setLocation(class180.field2469, class237.field3366);
        }
        if (class59.field801 != -1) {
            class231.method1590(true, true);
        }
        class21.method281(arg0 + 71);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILuo;IILhh;III)V")
    public static final void method1477(int arg0, class345 arg1, int arg2, int arg3, class67 arg4, int arg5, int arg6, int arg7) {
        field3109++;
        if (arg3 != -1) {
            return;
        }
        class193 var8 = null;
        if (arg0 == 0) {
            var8 = (class193) class244.method1655(arg6, arg2, arg5);
        }
        if (arg0 == 1) {
            var8 = (class193) class326.method2094(arg6, arg2, arg5);
        }
        if (arg0 == 2) {
            var8 = (class193) class139.method952(arg6, arg2, arg5, field3118 == null ? (field3118 = method1478("sc")) : field3118);
        }
        if (arg0 == 3) {
            var8 = (class193) class19.method259(arg6, arg2, arg5);
        }
        if (var8 == null) {
            return;
        }
        int var9 = var8.method684(arg3 ^ 0x359D);
        int var10 = var8.method672(17011);
        class64 var11 = class375.method2395((byte) 59, var8.method689((byte) -83));
        if (var11.method487(4096)) {
            class124.method838((byte) 117, arg6, arg2, arg5, var11);
        }
        if (var8.method691((byte) -72)) {
            var8.method676(-97, arg1);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                class94.method670(arg6, arg2, arg5);
                return;
            }
            if (arg0 != 2) {
                if (arg0 == 3) {
                    class404.method2534(arg6, arg2, arg5);
                    if (var11.field906 == 1) {
                        arg4.method518(arg5, arg2, (byte) 106);
                        return;
                    }
                }
                return;
            }
            class135.method946(arg6, arg2, arg5, field3118 == null ? (field3118 = method1478("sc")) : field3118);
            if (var11.field906 != 0 && class211.field2954 > (arg2 + var11.field872) && (var11.field872 + arg5) < class290.field4061 && class211.field2954 > (var11.field950 + arg2) && class290.field4061 > (var11.field950 + arg5)) {
                arg4.method524(var11.field950, arg5, arg3 ^ 0xFFFF8504, var11.field953, arg2, !var11.field926, var10, var11.field872);
                return;
            }
            return;
        }
        class240.method1634(arg6, arg2, arg5);
        if (var11.field906 != 0) {
            arg4.method522(arg5, arg3, !var11.field926, var9, var10, arg2, var11.field953);
            return;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
    public class222() {
        this.field3101 = new int[0];
        this.field3098 = new int[0];
        this.field3116 = new class171(0);
        this.field3116.field257 = 1;
        this.field3111 = new class171();
        this.field3111.field257 = 1;
        this.field3112 = new class171();
        this.field3112.field257 = 1;
        this.field3107 = new class13[] { this.field3111, this.field3112, this.field3116 };
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lkh;)V")
    public class222(class11 arg0) {
        int var2 = arg0.method172((byte) 52);
        int var3 = 0;
        int var4 = 0;
        this.field3107 = new class13[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class13 var16 = class375.method2397(false, arg0);
            if (var16.method220(106) >= 0) {
                var3++;
            }
            if (var16.method226((byte) 115) >= 0) {
                var4++;
            }
            int var17 = var16.field250.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method172((byte) 52);
            }
            this.field3107[var6] = var16;
        }
        this.field3098 = new int[var3];
        int var7 = 0;
        this.field3101 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class13 var11 = this.field3107[var9];
            int var12 = var11.field250.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field250[var13] = this.field3107[var5[var9][var13]];
            }
            int var14 = var11.method220(92);
            int var15 = var11.method226((byte) -120);
            if (var14 > 0) {
                this.field3098[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3101[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3111 = this.field3107[arg0.method172((byte) 52)];
        this.field3112 = this.field3107[arg0.method172((byte) 52)];
        Object var10 = null;
        this.field3116 = this.field3107[arg0.method172((byte) 52)];
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1478(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
