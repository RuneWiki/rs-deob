import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class197 extends class175 {

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    private int field3268 = 1;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    private int field3272 = 1;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "Lij;")
    public static class50 field3260 = class78.method578(121, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "[I")
    public static int[] field3259 = new int[2];

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "Lij;")
    private static class50 field3269 = class78.method578(126, "Unable to find ");

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Lij;")
    public static class50 field3263 = field3269;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field3276 = 0;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "Lij;")
    public static class50 field3264 = class78.method578(124, "titlebg");

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
    public static void method1322(int arg0) {
        field3269 = null;
        field3263 = null;
        if (arg0 != 1) {
            method1323(-77, -15, 98, false, 95);
        }
        field3260 = null;
        field3259 = null;
        field3264 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIZI)V")
    public static final void method1323(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field3265;
        if (class10.method67(arg2, (byte) -113)) {
            class189.method1276((byte) -20, -1, arg1, class137.field2380[arg2], arg4, arg3);
            if (arg0 != 128) {
                field3263 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILda;B)Ljd;")
    public static final class85 method1324(int arg0, class22 arg1, byte arg2) {
        int var3 = -6 % ((arg2 - -65) / 35);
        ++field3274;
        return !class182.method1237((byte) 43, arg0, arg1) ? null : class83.method628(29012);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
    public static final void method1325(boolean arg0) {
        ++field3261;
        class90.field1716 = new class56(32);
        if (!arg0) {
            method1329(-19, -121);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        if (arg1 != -27746) {
            field3260 = null;
        }
        int[] var3 = super.field2941.method1427(-21281, arg0);
        ++field3270;
        if (super.field2941.field3565) {
            int var4 = this.field3268 + this.field3268 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field3272 - (-this.field3272 - 1);
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field3268 + arg0; this.field3268 + arg0 >= var9; ++var9) {
                int[] var13 = this.method1210(0, var9 & class108.field1928, 16745);
                int[] var14 = new int[class211.field3514];
                int var15 = 0;
                for (int var16 = -this.field3272; var16 <= this.field3272; ++var16) {
                    var15 += var13[class161.field2765 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class211.field3514) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class161.field2765 & -this.field3272 + var17];
                    ++var17;
                    var15 = var13[this.field3272 + var17 & class161.field2765] + var18;
                }
                var8[this.field3268 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; ~class211.field3514 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        int[][] var3 = super.field2920.method117(arg0, (byte) -76);
        if (super.field2920.field356) {
            int var4 = this.field3268 + this.field3268 + 1;
            int var5 = this.field3272 - -1 + this.field3272;
            int var6 = 65536 / var5;
            int var7 = 65536 / var4;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field3268 + arg0; var9 <= this.field3268 + arg0; ++var9) {
                int[][] var19 = this.method1206(0, var9 & class108.field1928, (byte) -114);
                int var20 = 0;
                int var21 = 0;
                int[][] var22 = new int[3][class211.field3514];
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field3272; var27 <= this.field3272; ++var27) {
                    int var37 = class161.field2765 & var27;
                    var23 += var26[var37];
                    var21 += var25[var37];
                    var20 += var24[var37];
                }
                int[] var28 = var22[1];
                int[] var29 = var22[0];
                int[] var30 = var22[2];
                int var31 = 0;
                while (~class211.field3514 < ~var31) {
                    var29[var31] = var6 * var20 >> 16;
                    var28[var31] = var6 * var21 >> 16;
                    var30[var31] = var6 * var23 >> 16;
                    int var32 = class161.field2765 & var31 - this.field3272;
                    ++var31;
                    int var33 = var21 - var25[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var20 - var24[var32];
                    int var36 = class161.field2765 & this.field3272 + var31;
                    var20 = var24[var36] + var35;
                    var23 = var26[var36] + var34;
                    var21 = var25[var36] + var33;
                }
                var8[var9 - -this.field3268 + -arg0] = var22;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class211.field3514; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[2][var13];
                    var15 += var18[0][var13];
                    var16 += var18[1][var13];
                }
                var10[var13] = var7 * var15 >> 16;
                var11[var13] = var7 * var16 >> 16;
                var12[var13] = var7 * var14 >> 16;
            }
        }
        if (arg1 != -20740) {
            method1327(71);
        }
        ++field3267;
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)I")
    public static final int method1326(boolean arg0, int arg1) {
        ++field3271;
        class28 var2 = class121.method879(arg1, 18542);
        int var3 = var2.field591;
        int var4 = var2.field597;
        if (arg0) {
            field3263 = null;
        }
        int var5 = var2.field593;
        int var6 = class27.field563[-var4 + var5];
        return class54.field968[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)V")
    public static final void method1327(int arg0) {
        class190.field3141.method1598((byte) -96, 28);
        ++field3277;
        class190.field3141.method1464(0L, 867341416);
        if (arg0 == -16755) {
            ++class184.field3020;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)V")
    public static final void method1328(int arg0, int arg1, int arg2) {
        class70.field1360[arg1] = arg2;
        if (arg0 != -1) {
            method1324(-70, (class22) null, (byte) -1);
        }
        class101 var3 = (class101) class207.field3433.method443((long) arg1, (byte) 86);
        ++field3273;
        if (var3 != null) {
            if (var3.field1860 != 4611686018427387905L) {
                var3.field1860 = class104.method785(-1) + 500L | 4611686018427387904L;
                return;
            }
        } else {
            class101 var4 = new class101(4611686018427387905L);
            class207.field3433.method445(104, (long) arg1, var4);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class197() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field3275;
        if (!arg0) {
            field3260 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field2925 = ~arg2.method1487(255) == -2;
                }
            } else {
                this.field3268 = arg2.method1487(255);
            }
        } else {
            this.field3272 = arg2.method1487(255);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)V")
    public static final void method1329(int arg0, int arg1) {
        class87.field1683 += arg0 * 128;
        if (class66.field1261.length < class87.field1683) {
            class87.field1683 -= class66.field1261.length;
            int var2 = (int) (12.0D * Math.random());
            class56.method440(-16093, class217.field3644[var2]);
        }
        int var3 = 0;
        short var4 = 256;
        ++field3266;
        int var5 = (-arg0 + var4) * 128;
        int var6 = arg0 * 128;
        for (int var7 = 0; ~var5 < ~var7; ++var7) {
            int var26 = class239.field4110[var3 - -var6] + -(class66.field1261[class87.field1683 + var3 & class66.field1261.length - 1] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class239.field4110[var3++] = var26;
        }
        for (int var8 = -arg0 + var4; ~var8 > ~var4; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; ++var24) {
                int var25 = (int) (100.0D * Math.random());
                if (var25 < 50 && ~var24 < -11 && ~var24 > -119) {
                    class239.field4110[var23 + var24] = 255;
                } else {
                    class239.field4110[var24 - -var23] = 0;
                }
            }
        }
        for (int var9 = 0; ~var9 > ~(-arg0 + var4); ++var9) {
            class206.field3424[var9] = class206.field3424[arg0 + var9];
        }
        for (int var10 = var4 - arg0; var4 > var10; ++var10) {
            class206.field3424[var10] = (int) (Math.sin((double) class200.field3302 / 14.0D) * 16.0D + Math.sin((double) class200.field3302 / 15.0D) * 14.0D + Math.sin((double) class200.field3302 / 16.0D) * 12.0D);
            ++class200.field3302;
        }
        if (arg1 > -12) {
            method1323(98, -7, -104, true, 27);
        }
        class213.field3541 += arg0;
        int var11 = ((1 & class244.field4245) + arg0) / 2;
        if (var11 > 0) {
            for (int var12 = 0; class213.field3541 > var12; ++var12) {
                int var21 = 128 + (int) (128.0D * Math.random());
                int var22 = (int) (124.0D * Math.random()) + 2;
                class239.field4110[(var21 << 7) + var22] = 192;
            }
            class213.field3541 = 0;
            for (int var13 = 0; var13 < var4; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; ~var20 > -129; ++var20) {
                    if (~(var11 + var20) > -129) {
                        var18 += class239.field4110[var19 + var20 + var11];
                    }
                    if (var20 + -1 + -var11 >= 0) {
                        var18 -= class239.field4110[-var11 - (1 - var19 - var20)];
                    }
                    if (~var20 <= -1) {
                        class125.field2199[var20 - -var19] = var18 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; ~var14 > -129; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; var4 > var16; ++var16) {
                    int var17 = var16 * 128;
                    if (~var4 < ~(var11 + var16)) {
                        var15 += class125.field2199[var11 * 128 + var14 - -var17];
                    }
                    if (~(var16 - (var11 + 1)) <= -1) {
                        var15 -= class125.field2199[var14 - -var17 + -((var11 + 1) * 128)];
                    }
                    if (~var16 <= -1) {
                        class239.field4110[var14 + var17] = var15 / (var11 * 2 - -1);
                    }
                }
            }
        }
    }
}
