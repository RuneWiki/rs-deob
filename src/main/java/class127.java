import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 extends class12 {

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "[B")
    public byte[] field2810;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "[S")
    public short[] field2823;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "[I")
    private int[] field2821;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "[B")
    public byte[] field2815;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "[Lud;")
    public class143[] field2820;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "[Lhb;")
    public class51[] field2828;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "[B")
    public byte[] field2818;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Lpe;")
    private static class109 field2811 = class141.method1120("No response from server)3", 0);

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "Lpe;")
    public static class109 field2817 = class141.method1120("(U2", 0);

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "Lpe;")
    public static class109 field2825 = field2811;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field2827 = 0;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Lwf;")
    public static class159 field2833;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Lcf;")
    public static class21 field2812;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([BLlb;[IB)Z")
    public final boolean method1025(byte[] arg0, class78 arg1, int[] arg2, byte arg3) {
        field2814++;
        boolean var5 = true;
        if (arg3 != 63) {
            field2817 = null;
        }
        class51 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2821[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method629(-128, arg2, var9 >> 2);
                        } else {
                            var6 = arg1.method632(arg2, var9 >> 2, -8449);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field2828[var8] = var6;
                        this.field2821[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V")
    public static final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class126 var5 = (class126) class14.field370.method195((byte) 117);
        int var6 = 124 / ((arg3 + 60) / 41);
        while (var5 != null) {
            if (var5.field2805 != -1 || var5.field2798 != null) {
                int var7 = 0;
                if (arg0 > var5.field2792) {
                    var7 += arg0 - var5.field2792;
                } else if (arg0 < var5.field2781) {
                    var7 += var5.field2781 - arg0;
                }
                if (var5.field2789 < arg2) {
                    var7 += arg2 - var5.field2789;
                } else if (var5.field2791 > arg2) {
                    var7 += var5.field2791 - arg2;
                }
                if (var7 - 64 > var5.field2788 || class8.field201 == 0 || var5.field2779 != arg1) {
                    if (var5.field2801 != null) {
                        class124.field2746.method1054(var5.field2801);
                        var5.field2801 = null;
                    }
                    if (var5.field2802 != null) {
                        class124.field2746.method1054(var5.field2802);
                        var5.field2802 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = (var5.field2788 - var7) * class8.field201 / var5.field2788;
                    if (var5.field2801 != null) {
                        var5.field2801.method319(var8);
                    } else if (var5.field2805 >= 0) {
                        class73 var9 = class73.method583(class18.field456, var5.field2805, 0);
                        if (var9 != null) {
                            class51 var10 = var9.method586().method430(class88.field1869);
                            class30 var11 = class30.method314(var10, 100, var8);
                            var11.method317(-1);
                            class124.field2746.method1049(var11);
                            var5.field2801 = var11;
                        }
                    }
                    if (var5.field2802 != null) {
                        var5.field2802.method319(var8);
                        if (!var5.field2802.method103(-1)) {
                            var5.field2802 = null;
                        }
                    } else if (var5.field2798 != null && (var5.field2784 -= arg4) <= 0) {
                        int var12 = (int) ((double) var5.field2798.length * Math.random());
                        class73 var13 = class73.method583(class18.field456, var5.field2798[var12], 0);
                        if (var13 != null) {
                            class51 var14 = var13.method586().method430(class88.field1869);
                            class30 var15 = class30.method314(var14, 100, var8);
                            var15.method317(0);
                            class124.field2746.method1049(var15);
                            var5.field2802 = var15;
                            var5.field2784 = var5.field2776 + (int) ((double) (var5.field2780 - var5.field2776) * Math.random());
                        }
                    }
                }
            }
            var5 = (class126) class14.field370.method198((byte) -105);
        }
        field2830++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public static final int method1027(int arg0, int arg1) {
        field2819++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        if (arg0 != 64) {
            field2817 = null;
        }
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lna;ZLna;)V")
    public static final void method1028(class91 arg0, boolean arg1, class91 arg2) {
        field2829++;
        if (!arg1) {
            class154.field3512 = arg2;
            class62.field1280 = arg0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public final void method1029(int arg0) {
        if (arg0 != 2) {
            field2833 = null;
        }
        field2809++;
        this.field2821 = null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
    public static void method1030(byte arg0) {
        if (arg0 != 64) {
            return;
        }
        field2811 = null;
        field2812 = null;
        field2817 = null;
        field2825 = null;
        field2833 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1031(int arg0, Component arg1) {
        field2826++;
        if (arg0 < 124) {
            field2811 = null;
        }
        arg1.removeMouseListener(class63.field1288);
        arg1.removeMouseMotionListener(class63.field1288);
        arg1.removeFocusListener(class63.field1288);
        class123.field2703 = 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILna;ZBI)V")
    public static final void method1032(int arg0, int arg1, class91 arg2, boolean arg3, byte arg4, int arg5) {
        class128.field2840 = arg1;
        class94.field2023 = arg2;
        class55.field1118 = 1;
        class95.field2036 = 10000;
        field2822++;
        class144.field3170 = arg3;
        if (arg4 != 66) {
            field2825 = null;
        }
        class48.field998 = arg5;
        class157.field3622 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)V")
    public static final void method1033(int arg0, int arg1, int arg2) {
        field2831++;
        if (class63.field1302 < 2 && class135.field2936 == 0 && !class139.field3031) {
            return;
        }
        class109 var3;
        if (class135.field2936 == 1 && class63.field1302 < 2) {
            var3 = class44.method405(new class109[] { class92.field1982, class120.field2662, class20.field500, class119.field2631 }, (byte) -74);
        } else if (class139.field3031 && class63.field1302 < 2) {
            var3 = class44.method405(new class109[] { class123.field2698, class120.field2662, class25.field621, class119.field2631 }, (byte) -74);
        } else {
            var3 = class86.method723((byte) 102, class63.field1302 - 1);
        }
        if (class63.field1302 > 2) {
            var3 = class44.method405(new class109[] { var3, class1.field23, class143.method1132(class63.field1302 - 2, 87), class152.field3346 }, (byte) -74);
        }
        class2.field46.method557(var3, arg2 + 4, arg0 + 15, arg1, 0, class12.field264 / 1000);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class127() {
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lwa;Z)V")
    public static final void method1034(class154 arg0, boolean arg1) {
        if (!arg1) {
            field2827 = 93;
        }
        int var2 = arg0.field3459;
        field2813++;
        if (var2 == 324) {
            if (class114.field2505 == -1) {
                class99.field2085 = arg0.field3489;
                class114.field2505 = arg0.field3426;
            }
            if (class16.field405.field378) {
                arg0.field3426 = class114.field2505;
            } else {
                arg0.field3426 = class99.field2085;
            }
        } else if (var2 == 325) {
            if (class114.field2505 == -1) {
                class99.field2085 = arg0.field3489;
                class114.field2505 = arg0.field3426;
            }
            if (class16.field405.field378) {
                arg0.field3426 = class99.field2085;
            } else {
                arg0.field3426 = class114.field2505;
            }
        } else if (var2 == 327) {
            arg0.field3503 = 150;
            arg0.field3475 = (int) (Math.sin((double) class12.field264 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3433 = 5;
            arg0.field3505 = 0;
        } else if (var2 == 328) {
            arg0.field3503 = 150;
            arg0.field3475 = (int) (Math.sin((double) class12.field264 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3505 = 1;
            arg0.field3433 = 5;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
    public class127(byte[] arg0) {
        this.field2810 = new byte[128];
        this.field2823 = new short[128];
        this.field2821 = new int[128];
        this.field2815 = new byte[128];
        this.field2820 = new class143[128];
        int var2 = 0;
        this.field2828 = new class51[128];
        this.field2818 = new byte[128];
        class13 var3 = new class13(arg0);
        while (var3.field279[var3.field309 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method131(false);
        }
        var3.field309++;
        var2++;
        int var6 = 0;
        int var7 = var3.field309;
        var3.field309 += var2;
        while (var3.field279[var3.field309 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method131(false);
        }
        var3.field309++;
        var6++;
        int var10 = var3.field309;
        var3.field309 += var6;
        int var11;
        for (var11 = 0; var3.field279[var3.field309 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method131(false);
        }
        var3.field309++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method142(27467);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class143[] var18 = new class143[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class143 var102 = var18[var19] = new class143();
            int var103 = var3.method142(27467);
            if (var103 > 0) {
                var102.field3138 = new byte[var103 * 2];
            }
            int var104 = var3.method142(27467);
            if (var104 > 0) {
                var102.field3131 = new byte[var104 * 2 + 2];
                var102.field3131[1] = 64;
            }
        }
        int var20 = var3.method142(27467);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method142(27467);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var3.field279[var3.field309 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method131(false);
        }
        var3.field309++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method142(27467);
            this.field2823[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method142(27467);
            this.field2823[var30] = (short) (this.field2823[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var33 < var25.length) {
                    var31 = var25[var33++];
                } else {
                    var31 = -1;
                }
                var32 = var3.method133(-9959);
            }
            var31--;
            this.field2823[var34] = (short) (this.field2823[var34] + (class4.method34(var32 - 1, 2) << 14));
            this.field2821[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2821[var38] != 0) {
                if (var36 == 0) {
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var3.field279[var7++] - 1;
                }
                this.field2818[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2821[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length <= var41) {
                        var39 = -1;
                    } else {
                        var39 = var8[var41++];
                    }
                    var40 = var3.field279[var10++] + 16 << 2;
                }
                this.field2810[var42] = (byte) var40;
                var39--;
            }
        }
        int var43 = 0;
        class143 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2821[var46] != 0) {
                if (var43 == 0) {
                    var44 = var18[var14[var45]];
                    if (var45 >= var12.length) {
                        var43 = -1;
                    } else {
                        var43 = var12[var45++];
                    }
                }
                var43--;
                this.field2820[var46] = var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 >= var25.length) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field2821[var50] > 0) {
                    var49 = var3.method142(27467) + 1;
                }
            }
            var47--;
            this.field2815[var50] = (byte) var49;
        }
        this.field2832 = var3.method142(27467) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class143 var99 = var18[var51];
            if (var99.field3138 != null) {
                for (int var100 = 1; var100 < var99.field3138.length; var100 += 2) {
                    var99.field3138[var100] = var3.method131(false);
                }
            }
            if (var99.field3131 != null) {
                for (int var101 = 3; var101 < var99.field3131.length - 2; var101 += 2) {
                    var99.field3131[var101] = var3.method131(false);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method131(false);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method131(false);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class143 var96 = var18[var54];
            if (var96.field3131 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3131.length; var98 += 2) {
                    var97 -= -var3.method142(27467) - 1;
                    var96.field3131[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class143 var93 = var18[var55];
            if (var93.field3138 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3138.length; var95 += 2) {
                    var94 = var3.method142(27467) + var94 + 1;
                    var93.field3138[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method142(27467);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method142(27467) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field2815[var60] = (byte) (this.field2815[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                var61 += 2;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class86.method720((byte) -112, var64 - var58, var66);
                    var66 += var65 - var59;
                    this.field2815[var67] = (byte) (this.field2815[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field2815[var62] = (byte) (this.field2815[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var3.method142(27467);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 -= -var3.method142(27467) - 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2810[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2810[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = (var78 - var71) / 2 + (var78 - var71) * var72;
                int var80 = var23[var74 + 1] << 1;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class86.method720((byte) -105, var78 - var71, var79);
                    var79 += var80 - var72;
                    int var83 = (this.field2810[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2810[var81] = (byte) var83;
                }
                var74 += 2;
                var72 = var80;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field2810[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2810[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3143 = var3.method142(27467);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class143 var92 = var18[var86];
            if (var92.field3138 != null) {
                var92.field3140 = var3.method142(27467);
            }
            if (var92.field3131 != null) {
                var92.field3147 = var3.method142(27467);
            }
            if (var92.field3143 > 0) {
                var92.field3135 = var3.method142(27467);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3139 = var3.method142(27467);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class143 var91 = var18[var88];
            if (var91.field3139 > 0) {
                var91.field3137 = var3.method142(27467);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class143 var90 = var18[var89];
            if (var90.field3137 > 0) {
                var90.field3141 = var3.method142(27467);
            }
        }
        if (class76.field1599) {
        }
    }
}
