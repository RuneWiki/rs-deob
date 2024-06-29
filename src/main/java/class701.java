import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class701 extends class766 {

    @OriginalMember(owner = "client!dia", name = "C", descriptor = "Lal;")
    private class195 field9834;

    @OriginalMember(owner = "client!dia", name = "o", descriptor = "I")
    public int field9820;

    @OriginalMember(owner = "client!dia", name = "w", descriptor = "[I")
    private int[] field9828;

    @OriginalMember(owner = "client!dia", name = "s", descriptor = "I")
    public int field9824;

    @OriginalMember(owner = "client!dia", name = "F", descriptor = "F")
    public float field9837;

    @OriginalMember(owner = "client!dia", name = "y", descriptor = "I")
    public int field9830;

    @OriginalMember(owner = "client!dia", name = "E", descriptor = "Llea;")
    private class573 field9836;

    @OriginalMember(owner = "client!dia", name = "r", descriptor = "I")
    public int field9823;

    @OriginalMember(owner = "client!dia", name = "x", descriptor = "Lkaa;")
    private class700 field9829;

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "Lsv;")
    public static class570 field9831 = new class570(52, 16);

    @OriginalMember(owner = "client!dia", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field9840 = new String[100];

    @OriginalMember(owner = "client!dia", name = "p", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!dia", name = "q", descriptor = "I")
    public static int field9822;

    @OriginalMember(owner = "client!dia", name = "t", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!dia", name = "u", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!dia", name = "v", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!dia", name = "A", descriptor = "I")
    public static int field9832;

    @OriginalMember(owner = "client!dia", name = "D", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!dia", name = "H", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!dia", name = "n", descriptor = "Lpc;")
    private class282 field9819;

    @OriginalMember(owner = "client!dia", name = "G", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9838;

    @OriginalMember(owner = "client!dia", name = "B", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field9833;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIFII)V", line = 3)
    public final void method3923(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (this.field9824 != -1) {
            class719 var6 = this.field9836.field6447.method847(this.field9824, -91);
            int var7 = var6.field10046 & 0xFF;
            if (var7 != 0 && var6.field10031 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field10043 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg1 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = ((var12 & 0xF00FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        field9826++;
        if (arg2 != 1.0F) {
            int var15 = (arg1 & 0xFFAA99) >> 16;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = arg1 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            int var19 = (int) ((float) var16 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var19 << 8 | var18 << 16 | var20;
        }
        this.field9838.method2262(arg4 * 4);
        if (arg3 >= 0) {
            this.method3929(6, 123);
        }
        this.field9838.method2254((byte) (arg1 >> 16));
        this.field9838.method2254((byte) (arg1 >> 8));
        this.field9838.method2254((byte) arg1);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V", line = 112)
    public static void method3924(int arg0) {
        if (arg0 == 1683) {
            field9831 = null;
            field9840 = null;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIII)V", line = 123)
    public final void method3925(int arg0, int arg1, int arg2, int arg3) {
        this.field9828[this.field9834.field5808 * arg2 + arg3] = class694.method3895(this.field9828[this.field9834.field5808 * arg2 + arg3], 0x1 << arg0);
        field9827++;
        if (arg1 != 15615) {
            this.field9838 = null;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "([IIZ)V", line = 141)
    public final void method3926(int[] arg0, int arg1, boolean arg2) {
        field9835++;
        int var4 = 0;
        if (arg2) {
            this.field9828 = null;
        }
        class501 var5 = this.field9836.field8238;
        var5.field5983 = 0;
        if (this.field9836.field8231) {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field9828[var13];
                short[] var15 = this.field9834.field2910[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2546(true, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2546(true, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2546(true, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field9828[var7];
                short[] var9 = this.field9834.field2910[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method2582((byte) -121, var9[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method2582((byte) -79, var9[var11++] & 0xFFFF);
                            var5.method2582((byte) -114, var9[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field9829.method2600(-8525, var5.field6002, var5.field5983, 5123);
        this.field9836.method3344(this.field9834.field2946, this.field9834.field2954, this.field9819, this.field9834.field2947, (byte) 109);
        this.field9836.method3378((this.field9834.field2937 & 0x8) != 0, (this.field9834.field2937 & 0x7) != 0, this.field9824, 128);
        if (this.field9836.field8194) {
            this.field9836.method440(Integer.MAX_VALUE, this.field9830, this.field9820, this.field9823);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field9837, 1.0F / this.field9837, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field9836.method3344(this.field9834.field2946, this.field9834.field2954, this.field9819, this.field9834.field2947, (byte) 123);
        this.field9836.method3339(-118, var4, 0, this.field9829, 4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)V", line = 264)
    public final void method3927(int arg0, int arg1) {
        this.field9838.method2262(arg1 * 4 + 3);
        field9825++;
        this.field9838.method2254(-1);
        if (arg0 != 1) {
            this.method3925(69, -32, 15, 6);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lol;Z)Lica;", line = 285)
    public static final class334 method3928(class431 arg0, boolean arg1) {
        field9821++;
        arg0.method2557(14929);
        if (arg1) {
            method3928(null, true);
        }
        int var2 = arg0.method2557(14929);
        class334 var3 = class174.method1280(var2, -89);
        var3.field4749 = arg0.method2557(14929);
        int var4 = arg0.method2557(14929);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2557(14929);
            var3.method29(var6, false, arg0);
        }
        var3.method27((byte) -48);
        return var3;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(II)V", line = 321)
    public final void method3929(int arg0, int arg1) {
        if (arg1 != 394) {
            return;
        }
        this.field9838.method2255();
        field9839++;
        class305 var3 = this.field9836.method3370(this.field9833, 4, (byte) -77, arg0 * 4, false);
        this.field9819 = new class282(var3, 5121, 4, 0);
        this.field9838 = null;
        this.field9833 = null;
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(II)V", line = 340)
    public final void method3930(int arg0, int arg1) {
        if (arg0 == 8) {
            field9822++;
            this.field9833 = this.field9836.field8135.method2247(arg1 * 4, true);
            this.field9838 = new Stream(this.field9833);
        }
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Lal;IIIII)V", line = 363)
    public class701(class195 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9834 = arg0;
        this.field9820 = arg4;
        this.field9828 = new int[this.field9834.field5809 * this.field9834.field5808];
        this.field9824 = arg1;
        this.field9837 = arg2;
        this.field9830 = arg3;
        this.field9836 = this.field9834.field2909;
        this.field9823 = arg5;
        this.field9829 = new class700(this.field9836, 5123, null, 1);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIZLm;)V", line = 379)
    public static final void method3931(int arg0, int arg1, boolean arg2, class554 arg3) {
        field9832++;
        if (arg3 == null || class521.field7310.field9375 == arg3) {
            return;
        }
        int var4 = arg3.field7697;
        int var5 = arg3.field7691;
        int var6 = arg3.field7682;
        int var7 = (int) arg3.field7693;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg3.field7693;
        if (var6 == 17) {
            class647 var10 = (class647) class486.field6697.method4253((long) var7, -1);
            if (var10 != null) {
                class775.field10664 = 2;
                class785.field10756 = 0;
                class506 var11 = var10.field9191;
                class283.field4156++;
                class217.field3168 = arg1;
                class469.field6395 = arg0;
                class302 var12 = class582.method3419(class482.field6620, (byte) 126, class626.field8901);
                var12.field4341.method2562(0, class681.field9656.method681((byte) 116, 82) ? 1 : 0);
                var12.field4341.method2559(class65.field979, 120);
                var12.field4341.method2541((byte) -118, var7);
                var12.field4341.method2572(class121.field2051, (byte) 119);
                var12.field4341.method2533(class568.field7906, 26687);
                class501.method2928(0, var12);
                class246.method1636(-2, 0, var11.method209(true), (byte) -105, var11.field4142[0], var11.method209(true), 0, true, var11.field4136[0]);
            }
        }
        if (var6 == 18) {
            class775.field10664 = 2;
            class469.field6395 = arg0;
            class785.field10756 = 0;
            class217.field3168 = arg1;
            class363.field5164++;
            class302 var13 = class582.method3419(class522.field7316, (byte) 125, class626.field8901);
            var13.field4341.method2541((byte) -118, class719.field10041.field4051);
            var13.field4341.method2572(class121.field2051, (byte) 101);
            var13.field4341.method2562(0, class681.field9656.method681((byte) 120, 82) ? 1 : 0);
            var13.field4341.method2542(337533360, class568.field7906);
            var13.field4341.method2559(class65.field979, 114);
            class501.method2928(0, var13);
        }
        if (var6 == 22) {
            class21 var14 = class588.field8451[var7];
            if (var14 != null) {
                class469.field6395 = arg0;
                class217.field3168 = arg1;
                class409.field5608++;
                class775.field10664 = 2;
                class785.field10756 = 0;
                class302 var15 = class582.method3419(class300.field4326, (byte) 127, class626.field8901);
                var15.field4341.method2562(0, class681.field9656.method681((byte) 107, 82) ? 1 : 0);
                var15.field4341.method2559(var7, 120);
                class501.method2928(0, var15);
                class246.method1636(-2, 0, var14.method209(true), (byte) -120, var14.field4142[0], var14.method209(arg2), 0, true, var14.field4136[0]);
            }
        }
        if (var6 == 52) {
            class775.field10664 = 2;
            class469.field6395 = arg0;
            class217.field3168 = arg1;
            class65.field978++;
            class785.field10756 = 0;
            class302 var16 = class582.method3419(class507.field6977, (byte) 127, class626.field8901);
            var16.field4341.method2572(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 103);
            var16.field4341.method2546(true, class222.field3266 + var4);
            var16.field4341.method2572(class697.field9798 + var5, (byte) 62);
            var16.field4341.method2543(124, class681.field9656.method681((byte) 99, 82) ? 1 : 0);
            class501.method2928(0, var16);
            class503.method2944(var8, var4, (byte) -58, var5);
        }
        if (var6 == 25) {
            class217.field3168 = arg1;
            class775.field10664 = 2;
            class785.field10756 = 0;
            class693.field9763++;
            class469.field6395 = arg0;
            class302 var17 = class582.method3419(class607.field8638, (byte) 125, class626.field8901);
            var17.field4341.method2541((byte) -118, class697.field9798 + var5);
            var17.field4341.method2546(true, class222.field3266 + var4);
            var17.field4341.method2524(false, class681.field9656.method681((byte) 116, 82) ? 1 : 0);
            var17.field4341.method2559(var7, 126);
            class501.method2928(0, var17);
            class700.method3920(-102, var4, var5);
        }
        if (var6 == 5) {
            class21 var18 = class588.field8451[var7];
            if (var18 != null) {
                class217.field3168 = arg1;
                class725.field10101++;
                class785.field10756 = 0;
                class775.field10664 = 2;
                class469.field6395 = arg0;
                class302 var19 = class582.method3419(class149.field2391, (byte) 127, class626.field8901);
                var19.field4341.method2543(-42, class681.field9656.method681((byte) 98, 82) ? 1 : 0);
                var19.field4341.method2572(var7, (byte) 94);
                class501.method2928(0, var19);
                class246.method1636(-2, 0, var18.method209(true), (byte) -128, var18.field4142[0], var18.method209(arg2), 0, true, var18.field4136[0]);
            }
        }
        if (var6 == 6) {
            class785.field10756 = 0;
            class469.field6395 = arg0;
            class577.field8320++;
            class775.field10664 = 2;
            class217.field3168 = arg1;
            class302 var20 = class582.method3419(class215.field3134, (byte) 127, class626.field8901);
            var20.field4341.method2546(arg2, class697.field9798 + var5);
            var20.field4341.method2572(class222.field3266 + var4, (byte) 120);
            var20.field4341.method2559(var7, 117);
            var20.field4341.method2543(123, class681.field9656.method681((byte) 111, 82) ? 1 : 0);
            class501.method2928(0, var20);
            class700.method3920(-105, var4, var5);
        }
        if (var6 == 30) {
            class647 var21 = (class647) class486.field6697.method4253((long) var7, -1);
            if (var21 != null) {
                class469.field6395 = arg0;
                class327.field4653++;
                class775.field10664 = 2;
                class217.field3168 = arg1;
                class785.field10756 = 0;
                class506 var22 = var21.field9191;
                class302 var23 = class582.method3419(class363.field5158, (byte) 125, class626.field8901);
                var23.field4341.method2541((byte) -118, var7);
                var23.field4341.method2543(127, class681.field9656.method681((byte) 106, 82) ? 1 : 0);
                class501.method2928(0, var23);
                class246.method1636(-2, 0, var22.method209(true), (byte) -110, var22.field4142[0], var22.method209(true), 0, true, var22.field4136[0]);
            }
        }
        if (!arg2) {
            method3931(-59, -22, false, null);
        }
        if (var6 == 19) {
            class21 var24 = class588.field8451[var7];
            if (var24 != null) {
                class785.field10756 = 0;
                class217.field3168 = arg1;
                class775.field10664 = 2;
                class108.field1544++;
                class469.field6395 = arg0;
                class302 var25 = class582.method3419(class721.field10073, (byte) 126, class626.field8901);
                var25.field4341.method2543(-64, class681.field9656.method681((byte) 102, 82) ? 1 : 0);
                var25.field4341.method2546(true, var7);
                class501.method2928(0, var25);
                class246.method1636(-2, 0, var24.method209(true), (byte) -88, var24.field4142[0], var24.method209(true), 0, true, var24.field4136[0]);
            }
        }
        if (var6 == 1009) {
            class785.field10756 = 0;
            class469.field6395 = arg0;
            class775.field10664 = 2;
            class217.field3168 = arg1;
            class647 var26 = (class647) class486.field6697.method4253((long) var7, -1);
            if (var26 != null) {
                class506 var27 = var26.field9191;
                class179 var28 = var27.field6964;
                if (var28.field2683 != null) {
                    var28 = var28.method1304(class578.field8328, -25917);
                }
                if (var28 != null) {
                    class391.field5448++;
                    class302 var29 = class582.method3419(class150.field2403, (byte) 125, class626.field8901);
                    var29.field4341.method2546(true, var28.field2725);
                    class501.method2928(0, var29);
                }
            }
        }
        if (var6 == 13) {
            class469.field6395 = arg0;
            class785.field10756 = 0;
            class775.field10664 = 2;
            class606.field8611++;
            class217.field3168 = arg1;
            class302 var30 = class582.method3419(class272.field3825, (byte) 126, class626.field8901);
            var30.field4341.method2541((byte) -118, class65.field979);
            var30.field4341.method2541((byte) -118, var7);
            var30.field4341.method2579(false, class681.field9656.method681((byte) 100, 82) ? 1 : 0);
            var30.field4341.method2533(class568.field7906, 26687);
            var30.field4341.method2572(class697.field9798 + var5, (byte) 43);
            var30.field4341.method2559(class121.field2051, 121);
            var30.field4341.method2546(true, class222.field3266 + var4);
            class501.method2928(0, var30);
            class700.method3920(-121, var4, var5);
        }
        if (var6 == 1011 || var6 == 1003 || var6 == 1012 || var6 == 1004 || var6 == 1010) {
            class58.method614(var6, (byte) -38, var7, var4);
        }
        if (var6 == 3) {
            class21 var31 = class588.field8451[var7];
            if (var31 != null) {
                class785.field10756 = 0;
                class469.field6395 = arg0;
                class217.field3168 = arg1;
                class725.field10101++;
                class775.field10664 = 2;
                class302 var32 = class582.method3419(class369.field5215, (byte) 127, class626.field8901);
                var32.field4341.method2572(var7, (byte) 89);
                var32.field4341.method2579(false, class681.field9656.method681((byte) 127, 82) ? 1 : 0);
                class501.method2928(0, var32);
                class246.method1636(-2, 0, var31.method209(true), (byte) -120, var31.field4142[0], var31.method209(true), 0, true, var31.field4136[0]);
            }
        }
        if (var6 == 51) {
            class21 var33 = class588.field8451[var7];
            if (var33 != null) {
                class785.field10756 = 0;
                class469.field6395 = arg0;
                class775.field10664 = 2;
                class217.field3168 = arg1;
                class754.field10484++;
                class302 var34 = class582.method3419(class387.field5418, (byte) 125, class626.field8901);
                var34.field4341.method2524(false, class681.field9656.method681((byte) 101, 82) ? 1 : 0);
                var34.field4341.method2572(var7, (byte) 127);
                class501.method2928(0, var34);
                class246.method1636(-2, 0, var33.method209(arg2), (byte) -120, var33.field4142[0], var33.method209(true), 0, true, var33.field4136[0]);
            }
        }
        if (var6 == 53 && class284.field4182 == null) {
            class470.method2752(var4, var5, (byte) -117);
            class284.field4182 = class153.method1203(0, var4, var5);
            class172.method1268(class284.field4182, -43);
        }
        if (var6 == 11) {
            class21 var35 = class588.field8451[var7];
            if (var35 != null) {
                class590.field8474++;
                class785.field10756 = 0;
                class775.field10664 = 2;
                class217.field3168 = arg1;
                class469.field6395 = arg0;
                class302 var36 = class582.method3419(class102.field1501, (byte) 126, class626.field8901);
                var36.field4341.method2572(var7, (byte) 120);
                var36.field4341.method2543(118, class681.field9656.method681((byte) 117, 82) ? 1 : 0);
                class501.method2928(0, var36);
                class246.method1636(-2, 0, var35.method209(true), (byte) -93, var35.field4142[0], var35.method209(true), 0, true, var35.field4136[0]);
            }
        }
        if (var6 == 16) {
            class21 var37 = class588.field8451[var7];
            if (var37 != null) {
                class363.field5164++;
                class469.field6395 = arg0;
                class775.field10664 = 2;
                class785.field10756 = 0;
                class217.field3168 = arg1;
                class302 var38 = class582.method3419(class522.field7316, (byte) 126, class626.field8901);
                var38.field4341.method2541((byte) -118, var7);
                var38.field4341.method2572(class121.field2051, (byte) 101);
                var38.field4341.method2562(0, class681.field9656.method681((byte) 121, 82) ? 1 : 0);
                var38.field4341.method2542(337533360, class568.field7906);
                var38.field4341.method2559(class65.field979, 123);
                class501.method2928(0, var38);
                class246.method1636(-2, 0, var37.method209(arg2), (byte) -103, var37.field4142[0], var37.method209(arg2), 0, true, var37.field4136[0]);
            }
        }
        if (var6 == 15 || var6 == 1001) {
            class628.method3589(arg3.field7690, var7, -25984, var5, var4);
        }
        if (var6 == 23) {
            class290.field4227++;
            class785.field10756 = 0;
            class217.field3168 = arg1;
            class775.field10664 = 2;
            class469.field6395 = arg0;
            class302 var39 = class582.method3419(class725.field10097, (byte) 126, class626.field8901);
            var39.field4341.method2559(class697.field9798 + var5, 114);
            var39.field4341.method2572(var7, (byte) 68);
            var39.field4341.method2559(class222.field3266 + var4, 120);
            var39.field4341.method2524(false, class681.field9656.method681((byte) 97, 82) ? 1 : 0);
            class501.method2928(0, var39);
            class700.method3920(-93, var4, var5);
        }
        if (var6 == 48) {
            class217.field3168 = arg1;
            class775.field10664 = 1;
            class744.field10339++;
            class469.field6395 = arg0;
            class785.field10756 = 0;
            class302 var40 = class582.method3419(class768.field10602, (byte) 127, class626.field8901);
            var40.field4341.method2559(class65.field979, 125);
            var40.field4341.method2572(class121.field2051, (byte) 67);
            var40.field4341.method2572(class222.field3266 + var4, (byte) 65);
            var40.field4341.method2559(class697.field9798 + var5, 114);
            var40.field4341.method2542(337533360, class568.field7906);
            class501.method2928(0, var40);
            class246.method1636(-4, 0, 1, (byte) -122, var4, 1, 0, true, var5);
        }
        if (var6 == 12) {
            class519 var41 = class153.method1203(0, var4, var5);
            if (var41 != null) {
                class729.method4052((byte) 107, var41);
            }
        }
        if (var6 == 59) {
            class21 var42 = class588.field8451[var7];
            if (var42 != null) {
                class785.field10756 = 0;
                class469.field6395 = arg0;
                class217.field3168 = arg1;
                class775.field10664 = 2;
                class725.field10101++;
                class302 var43 = class582.method3419(class368.field5210, (byte) 127, class626.field8901);
                var43.field4341.method2543(120, class681.field9656.method681((byte) 110, 82) ? 1 : 0);
                var43.field4341.method2541((byte) -118, var7);
                class501.method2928(0, var43);
                class246.method1636(-2, 0, var42.method209(true), (byte) -101, var42.field4142[0], var42.method209(arg2), 0, true, var42.field4136[0]);
            }
        }
        if (var6 == 4) {
            class388.field5421++;
            class217.field3168 = arg1;
            class785.field10756 = 0;
            class775.field10664 = 2;
            class469.field6395 = arg0;
            class302 var44 = class582.method3419(class712.field9940, (byte) 125, class626.field8901);
            var44.field4341.method2559(Integer.MAX_VALUE & (int) (var8 >>> 32), 119);
            var44.field4341.method2543(-51, class681.field9656.method681((byte) 109, 82) ? 1 : 0);
            var44.field4341.method2541((byte) -118, class697.field9798 + var5);
            var44.field4341.method2541((byte) -118, class222.field3266 + var4);
            class501.method2928(0, var44);
            class503.method2944(var8, var4, (byte) -58, var5);
        }
        if (var6 == 10) {
            class21 var45 = class588.field8451[var7];
            if (var45 != null) {
                class775.field10664 = 2;
                class41.field481++;
                class469.field6395 = arg0;
                class785.field10756 = 0;
                class217.field3168 = arg1;
                class302 var46 = class582.method3419(class231.field3380, (byte) 125, class626.field8901);
                var46.field4341.method2543(-55, class681.field9656.method681((byte) 99, 82) ? 1 : 0);
                var46.field4341.method2559(var7, 124);
                class501.method2928(0, var46);
                class246.method1636(-2, 0, var45.method209(true), (byte) -122, var45.field4142[0], var45.method209(arg2), 0, true, var45.field4136[0]);
            }
        }
        if (var6 == 2) {
            if (class778.field10675 > 0 && class681.field9656.method681((byte) 99, 82) && class681.field9656.method681((byte) 116, 81)) {
                class499.method2917(class222.field3266 + var4, class719.field10041.field10361, 63, class697.field9798 + var5);
            } else {
                class302 var47 = class696.method3910(var5, var7, var4, -101);
                if (var7 == 1) {
                    var47.field4341.method2524(false, -1);
                    var47.field4341.method2524(false, -1);
                    var47.field4341.method2546(true, (int) class98.field1423);
                    var47.field4341.method2524(false, 57);
                    var47.field4341.method2524(false, class654.field9251);
                    var47.field4341.method2524(false, class592.field8487);
                    var47.field4341.method2524(false, 89);
                    var47.field4341.method2546(true, class719.field10041.field10347);
                    var47.field4341.method2546(true, class719.field10041.field10350);
                    var47.field4341.method2524(false, 63);
                } else {
                    class785.field10756 = 0;
                    class217.field3168 = arg1;
                    class775.field10664 = 1;
                    class469.field6395 = arg0;
                }
                class501.method2928(0, var47);
                class246.method1636(-4, 0, 1, (byte) -115, var4, 1, 0, true, var5);
            }
        }
        if (var6 == 44) {
            class217.field3168 = arg1;
            class469.field6395 = arg0;
            class81.field1196++;
            class775.field10664 = 2;
            class785.field10756 = 0;
            class302 var48 = class582.method3419(class790.field10810, (byte) 125, class626.field8901);
            var48.field4341.method2531((byte) -120, class568.field7906);
            var48.field4341.method2541((byte) -118, class121.field2051);
            var48.field4341.method2541((byte) -118, class65.field979);
            var48.field4341.method2541((byte) -118, class697.field9798 + var5);
            var48.field4341.method2546(true, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var48.field4341.method2579(!arg2, class681.field9656.method681((byte) 124, 82) ? 1 : 0);
            var48.field4341.method2546(true, class222.field3266 + var4);
            class501.method2928(0, var48);
            class503.method2944(var8, var4, (byte) -58, var5);
        }
        if (var6 == 1007) {
            class358.field5078++;
            class217.field3168 = arg1;
            class775.field10664 = 2;
            class469.field6395 = arg0;
            class785.field10756 = 0;
            class302 var49 = class582.method3419(class100.field1490, (byte) 127, class626.field8901);
            var49.field4341.method2546(true, var7);
            class501.method2928(0, var49);
        }
        if (var6 == 9) {
            class647 var50 = (class647) class486.field6697.method4253((long) var7, -1);
            if (var50 != null) {
                class785.field10756 = 0;
                class506 var51 = var50.field9191;
                class775.field10664 = 2;
                class469.field6395 = arg0;
                class128.field2154++;
                class217.field3168 = arg1;
                class302 var52 = class582.method3419(class513.field7082, (byte) 125, class626.field8901);
                var52.field4341.method2562(0, class681.field9656.method681((byte) 118, 82) ? 1 : 0);
                var52.field4341.method2541((byte) -118, var7);
                class501.method2928(0, var52);
                class246.method1636(-2, 0, var51.method209(true), (byte) -95, var51.field4142[0], var51.method209(true), 0, true, var51.field4136[0]);
            }
        }
        if (var6 == 45) {
            if (class778.field10675 > 0 && class681.field9656.method681((byte) 101, 82) && class681.field9656.method681((byte) 108, 81)) {
                class499.method2917(class222.field3266 + var4, class719.field10041.field10361, 63, class697.field9798 + var5);
            } else {
                class775.field10664 = 1;
                class469.field6395 = arg0;
                class48.field672++;
                class217.field3168 = arg1;
                class785.field10756 = 0;
                class302 var53 = class582.method3419(class647.field9186, (byte) 125, class626.field8901);
                var53.field4341.method2541((byte) -118, class697.field9798 + var5);
                var53.field4341.method2559(class222.field3266 + var4, 113);
                class501.method2928(0, var53);
            }
        }
        if (var6 == 1008) {
            class469.field6395 = arg0;
            class176.field2647++;
            class785.field10756 = 0;
            class217.field3168 = arg1;
            class775.field10664 = 2;
            class302 var54 = class582.method3419(class102.field1502, (byte) 127, class626.field8901);
            var54.field4341.method2541((byte) -118, class697.field9798 + var5);
            var54.field4341.method2559(class222.field3266 + var4, 126);
            var54.field4341.method2546(arg2, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var54.field4341.method2579(!arg2, class681.field9656.method681((byte) 98, 82) ? 1 : 0);
            class501.method2928(0, var54);
            class503.method2944(var8, var4, (byte) -58, var5);
        }
        if (var6 == 20) {
            class647 var55 = (class647) class486.field6697.method4253((long) var7, -1);
            if (var55 != null) {
                class785.field10756 = 0;
                class217.field3168 = arg1;
                class673.field9422++;
                class775.field10664 = 2;
                class469.field6395 = arg0;
                class506 var56 = var55.field9191;
                class302 var57 = class582.method3419(class141.field2312, (byte) 125, class626.field8901);
                var57.field4341.method2572(var7, (byte) 43);
                var57.field4341.method2579(false, class681.field9656.method681((byte) 105, 82) ? 1 : 0);
                class501.method2928(0, var57);
                class246.method1636(-2, 0, var56.method209(true), (byte) -103, var56.field4142[0], var56.method209(arg2), 0, true, var56.field4136[0]);
            }
        }
        if (var6 == 58) {
            class647 var58 = (class647) class486.field6697.method4253((long) var7, -1);
            if (var58 != null) {
                class775.field10664 = 2;
                class217.field3168 = arg1;
                class110.field1554++;
                class469.field6395 = arg0;
                class506 var59 = var58.field9191;
                class785.field10756 = 0;
                class302 var60 = class582.method3419(class693.field9760, (byte) 126, class626.field8901);
                var60.field4341.method2559(var7, 115);
                var60.field4341.method2562(0, class681.field9656.method681((byte) 102, 82) ? 1 : 0);
                class501.method2928(0, var60);
                class246.method1636(-2, 0, var59.method209(true), (byte) -114, var59.field4142[0], var59.method209(true), 0, true, var59.field4136[0]);
            }
        }
        if (var6 == 46) {
            class775.field10664 = 2;
            class405.field5565++;
            class785.field10756 = 0;
            class217.field3168 = arg1;
            class469.field6395 = arg0;
            class302 var61 = class582.method3419(class615.field8724, (byte) 126, class626.field8901);
            var61.field4341.method2546(true, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var61.field4341.method2546(true, class222.field3266 + var4);
            var61.field4341.method2543(10, class681.field9656.method681((byte) 126, 82) ? 1 : 0);
            var61.field4341.method2572(var5 + class697.field9798, (byte) 123);
            class501.method2928(0, var61);
            class503.method2944(var8, var4, (byte) -58, var5);
        }
        if (var6 == 60) {
            class469.field6395 = arg0;
            class217.field3168 = arg1;
            class494.field6768++;
            class785.field10756 = 0;
            class775.field10664 = 2;
            class302 var62 = class582.method3419(class603.field8566, (byte) 126, class626.field8901);
            var62.field4341.method2572(var7, (byte) 50);
            var62.field4341.method2562(0, class681.field9656.method681((byte) 111, 82) ? 1 : 0);
            var62.field4341.method2546(true, class697.field9798 + var5);
            var62.field4341.method2559(var4 + class222.field3266, 121);
            class501.method2928(0, var62);
            class700.method3920(-121, var4, var5);
        }
        if (var6 == 1006) {
            class785.field10756 = 0;
            class775.field10664 = 2;
            class469.field6395 = arg0;
            class217.field3168 = arg1;
            class588.field8454++;
            class302 var63 = class582.method3419(class388.field5422, (byte) 126, class626.field8901);
            var63.field4341.method2546(true, var7);
            class501.method2928(0, var63);
        }
        if (var6 == 57) {
            class519 var64 = class153.method1203(0, var4, var5);
            if (var64 != null) {
                class558.method3253(9);
                class169 var65 = client.method885(var64);
                class227.method1540(var65.method1255((byte) 106), 23342, var65.field2555, var64);
                class470.field6405 = class481.method2846(var64, arg2);
                class460.field6275 = var64.field7123 + "<col=ffffff>";
                if (class470.field6405 == null) {
                    class470.field6405 = "Null";
                }
            }
            return;
        }
        if (var6 == 8) {
            class785.field10756 = 0;
            class469.field6395 = arg0;
            class490.field6731++;
            class217.field3168 = arg1;
            class775.field10664 = 2;
            class302 var66 = class582.method3419(class62.field945, (byte) 127, class626.field8901);
            var66.field4341.method2543(17, class681.field9656.method681((byte) 101, 82) ? 1 : 0);
            var66.field4341.method2572(class222.field3266 + var4, (byte) 96);
            var66.field4341.method2541((byte) -118, var5 + class697.field9798);
            var66.field4341.method2559((int) (var8 >>> 32) & Integer.MAX_VALUE, 113);
            class501.method2928(0, var66);
            class503.method2944(var8, var4, (byte) -58, var5);
        }
        if (var6 == 21) {
            class647 var67 = (class647) class486.field6697.method4253((long) var7, -1);
            if (var67 != null) {
                class158.field2466++;
                class469.field6395 = arg0;
                class506 var68 = var67.field9191;
                class217.field3168 = arg1;
                class775.field10664 = 2;
                class785.field10756 = 0;
                class302 var69 = class582.method3419(class191.field2864, (byte) 125, class626.field8901);
                var69.field4341.method2572(var7, (byte) 106);
                var69.field4341.method2524(false, class681.field9656.method681((byte) 101, 82) ? 1 : 0);
                class501.method2928(0, var69);
                class246.method1636(-2, 0, var68.method209(arg2), (byte) -119, var68.field4142[0], var68.method209(arg2), 0, true, var68.field4136[0]);
            }
        }
        if (var6 == 49) {
            class21 var70 = class588.field8451[var7];
            if (var70 != null) {
                class785.field10756 = 0;
                class217.field3168 = arg1;
                class469.field6395 = arg0;
                class775.field10664 = 2;
                class110.field1558++;
                class302 var71 = class582.method3419(class68.field1083, (byte) 125, class626.field8901);
                var71.field4341.method2546(true, var7);
                var71.field4341.method2524(!arg2, class681.field9656.method681((byte) 107, 82) ? 1 : 0);
                class501.method2928(0, var71);
                class246.method1636(-2, 0, var70.method209(true), (byte) -108, var70.field4142[0], var70.method209(true), 0, true, var70.field4136[0]);
            }
        }
        if (var6 == 47) {
            class217.field3168 = arg1;
            class775.field10664 = 2;
            class281.field4050++;
            class469.field6395 = arg0;
            class785.field10756 = 0;
            class302 var72 = class582.method3419(class106.field1523, (byte) 126, class626.field8901);
            var72.field4341.method2541((byte) -118, var7);
            var72.field4341.method2559(class697.field9798 + var5, 120);
            var72.field4341.method2524(!arg2, class681.field9656.method681((byte) 102, 82) ? 1 : 0);
            var72.field4341.method2572(class222.field3266 + var4, (byte) 65);
            class501.method2928(0, var72);
            class700.method3920(-128, var4, var5);
        }
        if (var6 == 50) {
            class21 var73 = class588.field8451[var7];
            if (var73 != null) {
                class281.field4041++;
                class785.field10756 = 0;
                class775.field10664 = 2;
                class469.field6395 = arg0;
                class217.field3168 = arg1;
                class302 var74 = class582.method3419(class414.field5676, (byte) 125, class626.field8901);
                var74.field4341.method2543(118, class681.field9656.method681((byte) 121, 82) ? 1 : 0);
                var74.field4341.method2572(var7, (byte) 70);
                class501.method2928(0, var74);
                class246.method1636(-2, 0, var73.method209(arg2), (byte) -94, var73.field4142[0], var73.method209(true), 0, true, var73.field4136[0]);
            }
        }
        if (class295.field4298) {
            class558.method3253(61);
        }
        if (class504.field6918 != null && class445.field6159 == 0) {
            class172.method1268(class504.field6918, -38);
        }
    }
}
