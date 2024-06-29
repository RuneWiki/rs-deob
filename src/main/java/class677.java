import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class677 {

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lpca;")
    private class714 field9260 = new class714(16);

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Lfp;")
    private class323 field9254;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field9256 = 0;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[[Z")
    public static boolean[][] field9253 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILfp;IIZ)V", line = 7)
    public static final void method3769(int arg0, int arg1, int arg2, class323 arg3, int arg4, int arg5, boolean arg6) {
        int var7 = 30 % ((arg1 + 54) / 38);
        field9258++;
        if (arg4 <= 0) {
            class658.method3616(arg2, arg0, 0, arg6, arg3, arg5);
            return;
        }
        class750.field10412 = arg6;
        class444.field6316 = arg2;
        class469.field6659 = 1;
        class226.field3049 = arg3;
        class318.field4412 = arg5;
        class561.field7881 = null;
        class213.field2801 = arg0;
        class681.field9343 = class165.field2262.method1394(-88) / arg4;
        if (class681.field9343 < 1) {
            class681.field9343 = 1;
            return;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILek;ILafa;Lha;B)Z", line = 37)
    public static final boolean method3770(int arg0, class507 arg1, int arg2, class344 arg3, class58 arg4, byte arg5) {
        field9261++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field4842 != null) {
            var8 = class678.field9301 - ((arg1.field7262 + arg3.field4804 - class678.field9293) * (class678.field9301 - class678.field9289) / (class678.field9288 - class678.field9293));
            var7 = (arg3.field4825 + arg1.field7263 - class678.field9292) * (class678.field9298 - class678.field9306) / (class678.field9286 - class678.field9292) + class678.field9306;
            var6 = (arg1.field7263 + arg3.field4834 - class678.field9292) * (class678.field9298 - class678.field9306) / (class678.field9286 - class678.field9292) + class678.field9306;
            var9 = class678.field9301 - (arg1.field7262 + arg3.field4841 - class678.field9293) * (class678.field9301 - class678.field9289) / (class678.field9288 - class678.field9293);
        }
        class88 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        if (arg5 != -83) {
            field9253 = null;
        }
        int var14 = 0;
        if (arg3.field4803 != -1) {
            if (arg1.field7254 && arg3.field4805 != -1) {
                var10 = arg3.method2230(arg4, (byte) -55, true);
            } else {
                var10 = arg3.method2230(arg4, (byte) -127, false);
            }
            if (var10 != null) {
                var11 = arg1.field7258 - (var10.method656() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg1.field7258 + (var10.method656() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg1.field7260 - (var10.method670() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg1.field7260 + (var10.method670() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class80 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg3.field4847 != null) {
            var15 = class533.method3101(-1, arg3.field4808);
            if (var15 != null) {
                var16 = class219.field2859.method993(arg3.field4847, class227.field3058, null, 60, null);
                var17 = arg1.field7258 + ((class678.field9298 - class678.field9306) * arg3.field4811 / (class678.field9286 - class678.field9292));
                int var24 = arg1.field7260 - ((class678.field9301 - class678.field9289) * arg3.field4818 / (class678.field9288 - class678.field9293));
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method626() / 2;
                } else {
                    var18 = var24 - ((var10.method670() >> 1) + (var16 * var15.method627()));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class227.field3058[var25];
                    if (var16 - 1 > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method628(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = arg2 + var17 - (var19 / 2);
                var21 = var19 / 2 + arg2 + var17;
                if (var6 > var20) {
                    var6 = var20;
                }
                var22 = arg0 + var18;
                if (var7 < var21) {
                    var7 = var21;
                }
                var23 = arg0 + var16 * var15.method627() + var18;
                if (var8 > var22) {
                    var8 = var22;
                }
                if (var9 < var23) {
                    var9 = var23;
                }
            }
        }
        if (class678.field9306 > var7 || class678.field9298 < var6 || var9 < class678.field9289 || var8 > class678.field9301) {
            return true;
        }
        class678.method3795(arg4, arg1, arg3);
        if (var10 != null) {
            if (class236.field3170 > 0 && (class515.field7342 != -1 && class515.field7342 == arg1.field7257 || class106.field1270 != -1 && class106.field1270 == arg3.field4807)) {
                int var28;
                if (class322.field4447 <= 50) {
                    var28 = class322.field4447 * 2;
                } else {
                    var28 = 200 - (class322.field4447 * 2);
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg4.method425(var29, arg1.field7258, var10.method657() / 2 + 7, (byte) 104, arg1.field7260);
                arg4.method425(var29, arg1.field7258, var10.method657() / 2 + 5, (byte) 96, arg1.field7260);
                arg4.method425(var29, arg1.field7258, var10.method657() / 2 + 3, (byte) 126, arg1.field7260);
                arg4.method425(var29, arg1.field7258, var10.method657() / 2 + 1, (byte) 109, arg1.field7260);
                arg4.method425(var29, arg1.field7258, var10.method657() / 2, (byte) 98, arg1.field7260);
            }
            var10.method658(arg1.field7258 - (var10.method656() >> 1), arg1.field7260 - (var10.method670() >> 1));
        }
        if (arg3.field4847 != null && var15 != null) {
            class358.method2298(var19, var17, var15, var16, arg4, -92, arg1, arg3, var18);
        }
        if (arg3.field4803 != -1 || arg3.field4847 != null) {
            class547 var30 = new class547(arg1);
            var30.field7632 = var14;
            var30.field7633 = var13;
            var30.field7636 = var21;
            var30.field7635 = var11;
            var30.field7631 = var22;
            var30.field7634 = var20;
            var30.field7630 = var12;
            var30.field7629 = var23;
            class724.field10104.method2770((byte) -13, var30);
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)V", line = 229)
    public final void method3771(boolean arg0, int arg1) {
        field9257++;
        class714 var3 = this.field9260;
        synchronized (this.field9260) {
            if (!arg0) {
                method3772((byte) 110, -37);
            }
            this.field9260.method4016(arg1, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V", line = 249)
    public static final void method3772(byte arg0, int arg1) {
        if (arg0 != 50) {
            return;
        }
        field9264++;
        class101 var2 = (class101) class400.field5666.method1180((byte) 26, (long) arg1);
        if (var2 != null) {
            var2.field1209 = !var2.field1209;
            var2.field1210.method1932(-16426, var2.field1209);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 268)
    public final void method3773(int arg0) {
        class714 var2 = this.field9260;
        synchronized (this.field9260) {
            this.field9260.method4024(0);
        }
        if (arg0 == 18028) {
            field9255++;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)Z", line = 283)
    public static final boolean method3774(int arg0, byte arg1) {
        field9263++;
        int var2 = arg1 & 0xFF;
        if (~var2 == arg0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class322.field4457[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)Lgha;", line = 306)
    public final class345 method3775(int arg0, int arg1) {
        field9262++;
        if (arg1 != -7588) {
            return null;
        }
        class714 var3 = this.field9260;
        class345 var4;
        synchronized (this.field9260) {
            var4 = (class345) this.field9260.method4022((long) arg0, (byte) 126);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field9254;
        byte[] var6;
        synchronized (this.field9254) {
            var6 = this.field9254.method2100(arg0, (byte) 112, 30);
        }
        class345 var7 = new class345();
        if (var6 != null) {
            var7.method2235(false, new class675(var6));
        }
        class714 var8 = this.field9260;
        synchronized (this.field9260) {
            this.field9260.method4018((byte) 125, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 338)
    public final void method3776(boolean arg0) {
        class714 var2 = this.field9260;
        synchronized (this.field9260) {
            if (!arg0) {
                this.field9260 = null;
            }
            this.field9260.method4023((byte) -124);
        }
        field9265++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 354)
    public static void method3777(byte arg0) {
        field9253 = null;
        if (arg0 > -80) {
            method3772((byte) 120, -14);
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lsaa;ILfp;)V", line = 368)
    public class677(class326 arg0, int arg1, class323 arg2) {
        this.field9254 = arg2;
        this.field9254.method2084(30, 0);
    }
}
