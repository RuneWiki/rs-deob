import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class11 extends class279 implements class407 {

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "[I")
    public static int[] field101 = new int[500];

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "Ldda;")
    public static class597 field103;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)I")
    public final int method50(byte arg0) {
        if (arg0 < 96) {
            field103 = null;
        }
        ++field99;
        return this.field105;
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(B)V")
    public static void method51(byte arg0) {
        field103 = null;
        field101 = null;
        if (arg0 != 23) {
            field101 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIILiq;)V")
    public static final void method52(int arg0, int arg1, int arg2, int arg3, class190 arg4) {
        class415 var5 = class240.method1542(arg0, arg1, arg2);
        if (var5 != null) {
            int var6 = 0;
            arg4.field2888 = (arg1 << class179.field2726) + class605.field8913;
            arg4.field2895 = arg3;
            arg4.field2893 = (arg2 << class179.field2726) + class605.field8913;
            for (class639 var7 = var5.field5981; var7 != null; var7 = var7.field9291) {
                if (var7.field9288.field3466) {
                    int var8 = var7.field9288.method159(87);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field2895 += var6;
                arg4.field2884 = true;
            } else if (var5.field5976 != null) {
                arg4.field2895 -= var5.field5976.field364;
            }
            var5.field5973 = arg4;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZIIII)V")
    public static final void method53(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field98;
        if (arg0 || class157.field2003 != arg4 || class184.field2798 != arg1 || ~class97.field1205 != ~class355.field5157 && !class94.field1158.method2675(0, class239.field3499)) {
            class184.field2798 = arg1;
            class157.field2003 = arg4;
            class97.field1205 = class355.field5157;
            if (class94.field1158.method2675(arg2 ^ arg2, class239.field3499)) {
                class97.field1205 = 0;
            }
            class463.method2749(1, arg3);
            class162.method946((byte) 38, class259.field3800, true, class288.field4237.method2953(3181, class77.field889));
            int var5 = class584.field8677;
            class584.field8677 = (-(class35.field399 >> 4) + class157.field2003) * 8;
            int var6 = class424.field6061;
            class424.field6061 = (-(class382.field5586 >> 4) + class184.field2798) * 8;
            class210.field3106 = class113.method685(class157.field2003 * 8, class184.field2798 * 8);
            class517.field7688 = null;
            int var7 = -var5 + class584.field8677;
            int var8 = -var6 + class424.field6061;
            if (arg3 != 10) {
                class567.field8409 = 0;
                boolean var9 = false;
                int var10 = (class35.field399 + -1) * 128;
                int var11 = class382.field5586 * 128 + -128;
                for (int var12 = 0; var12 < class350.field5086; ++var12) {
                    class234 var13 = class579.field8530[var12];
                    if (var13 != null) {
                        class383 var14 = var13.field3443;
                        var14.field3464 -= var7 * 128;
                        var14.field3463 -= var8 * 128;
                        if (~var14.field3464 <= -1 && var10 >= var14.field3464 && ~var14.field3463 <= -1 && var14.field3463 <= var11) {
                            boolean var15 = true;
                            for (int var16 = 0; ~var16 > -11; ++var16) {
                                var14.field1090[var16] -= var7;
                                var14.field1089[var16] -= var8;
                                if (~var14.field1090[var16] > -1 || ~var14.field1090[var16] <= ~class35.field399 || var14.field1089[var16] < 0 || ~class382.field5586 >= ~var14.field1089[var16]) {
                                    var15 = false;
                                }
                            }
                            if (!var15) {
                                var14.method2322((class429) null, -31902);
                                var13.method2997(1);
                                var9 = true;
                            } else {
                                class25.field230[class567.field8409++] = var14.field1053;
                            }
                        } else {
                            var14.method2322((class429) null, arg2 ^ 27164);
                            var13.method2997(1);
                            var9 = true;
                        }
                    }
                }
                if (var9) {
                    class350.field5086 = class627.field9185.method1337(0);
                    class627.field9185.method1335(class579.field8530, arg2 + 5762);
                }
            } else {
                for (int var17 = 0; ~class350.field5086 < ~var17; ++var17) {
                    class234 var30 = class579.field8530[var17];
                    if (var30 != null) {
                        class383 var31 = var30.field3443;
                        for (int var32 = 0; ~var32 > -11; ++var32) {
                            var31.field1090[var32] -= var7;
                            var31.field1089[var32] -= var8;
                        }
                        var31.field3464 -= var7 * 128;
                        var31.field3463 -= var8 * 128;
                    }
                }
            }
            for (int var18 = 0; ~var18 > -2049; ++var18) {
                class179 var28 = class383.field5604[var18];
                if (var28 != null) {
                    for (int var29 = 0; var29 < 10; ++var29) {
                        var28.field1090[var29] -= var7;
                        var28.field1089[var29] -= var8;
                    }
                    var28.field3464 -= var7 * 128;
                    var28.field3463 -= var8 * 128;
                }
            }
            class67[] var19 = class255.field3737;
            for (int var20 = 0; var19.length > var20; ++var20) {
                class67 var27 = var19[var20];
                if (var27 != null) {
                    var27.field764 -= var8 * 128;
                    var27.field766 -= var7 * 128;
                }
            }
            for (class537 var21 = (class537) class178.field2698.method2496((byte) -110); var21 != null; var21 = (class537) class178.field2698.method2494(52)) {
                var21.field7940 -= var7;
                var21.field7948 -= var8;
                if (~class277.field4064 != -5 && (var21.field7940 < 0 || var21.field7948 < 0 || ~class35.field399 >= ~var21.field7940 || class382.field5586 <= var21.field7948)) {
                    var21.method2997(1);
                }
            }
            if (class277.field4064 != 4) {
                for (class368 var22 = (class368) class546.field8147.method1331(arg2 ^ 4357); var22 != null; var22 = (class368) class546.field8147.method1340((byte) -113)) {
                    int var23 = (int) (var22.field7465 & 16383L);
                    int var24 = -class584.field8677 + var23;
                    int var25 = (int) (16383L & var22.field7465 >> 14);
                    int var26 = -class424.field6061 + var25;
                    if (var24 < 0 || var26 < 0 || class35.field399 <= var24 || class382.field5586 <= var26) {
                        var22.method2997(1);
                    }
                }
            }
            if (class415.field5969 != 0) {
                class415.field5969 -= var7;
                class158.field2058 -= var8;
            }
            class176.method1180(81);
            if (~arg3 == -11) {
                if (~class287.field4232 == -5) {
                    class541.field8103 -= var7 * 128;
                    class293.field4306 -= var7 * 128;
                    class392.field5713 -= var8 * 128;
                    class300.field4403 -= var8 * 128;
                } else {
                    class287.field4232 = 1;
                }
            } else {
                class358.field5200 -= var7 * 128;
                class111.field1408 -= var8;
                class529.field7853 -= var8;
                class367.field5319 -= var8 * 128;
                class2.field12 -= var7;
                class32.field343 -= var7;
                if (~Math.abs(var7) < ~class35.field399 || ~Math.abs(var8) < ~class382.field5586) {
                    class598.method3496(111);
                }
            }
            class414.method2471((byte) 125);
            class10.method49(true);
            class603.field8887.method2499(0);
            class537.field7943.method2499(0);
            class413.field5873.method778((byte) -10);
            class371.method2264(false);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)J")
    public final long method54(boolean arg0) {
        ++field97;
        if (!arg0) {
            method58((float[]) null, 115, 100, 55, 92, 101, 0.78884894F, 0.3473157F, -88, 90, 3, 9, -0.25158888F);
        }
        return super.field4146.getAddress();
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I[BII)V")
    public final void method55(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field102;
        this.method1757(arg1, arg0);
        if (arg2 != 25321) {
            this.method57((byte) -13);
        }
        this.field105 = arg3;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)I")
    public static final int method56(int arg0, int arg1) {
        ++field96;
        double var2 = (double) (255 & arg0 >> 16) / 256.0D;
        double var4 = (double) ((65352 & arg0) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 255) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        if (arg1 != -1630) {
            method53(false, 100, 90, -118, 106);
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 != var10) {
                if (var4 != var10) {
                    if (var6 == var10) {
                        var12 = (-var4 + var2) / (-var8 + var10) + 4.0D;
                    }
                } else {
                    var12 = (-var2 + var6) / (-var8 + var10) + 2.0D;
                }
            } else {
                var12 = (var4 - var6) / (var10 - var8);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (-var10 + 2.0D - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (~var21 > -1) {
            var21 = 0;
        } else if (~var21 < -256) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (~var22 > -1) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 4;
        } else if (~var22 < -218) {
            var21 >>= 3;
        } else if (~var22 < -193) {
            var21 >>= 2;
        } else if (var22 > 179) {
            var21 >>= 1;
        }
        return (var21 >> 5 << 7) + (((var20 >> 2 & 63) << 10) - -(var22 >> 1));
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(B)I")
    public final int method57(byte arg0) {
        ++field104;
        int var2 = -33 / ((40 - arg0) / 52);
        return 0;
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Los;I[BI)V")
    public class11(class468 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field105 = arg1;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "([FIIIIIFFIIIIF)V")
    public static final void method58(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9, int arg10, int arg11, float arg12) {
        int var13 = arg9 - arg8;
        ++field100;
        int var14 = arg3 - arg5;
        int var15 = arg2 - arg1;
        float var16 = arg0[2] * (float) var13 + arg0[0] * (float) var14 + arg0[1] * (float) var15;
        float var17 = arg0[5] * (float) var13 + arg0[3] * (float) var14 + arg0[4] * (float) var15;
        float var18 = arg0[8] * (float) var13 + arg0[7] * (float) var15 + arg0[6] * (float) var14;
        float var19;
        float var20;
        if (arg4 == 0) {
            var19 = -var18 + arg7 + 0.5F;
            var20 = arg12 + var16 + 0.5F;
        } else if (arg4 == 1) {
            var19 = arg7 + var18 + 0.5F;
            var20 = arg12 + var16 + 0.5F;
        } else if (arg4 == 2) {
            var20 = -var16 + arg12 + 0.5F;
            var19 = -var17 + arg6 + 0.5F;
        } else if (arg4 == 3) {
            var20 = arg12 + var16 + 0.5F;
            var19 = -var17 + arg6 + 0.5F;
        } else if (arg4 != 4) {
            var19 = -var17 + arg6 + 0.5F;
            var20 = -var18 + arg7 + 0.5F;
        } else {
            var20 = arg7 + var18 + 0.5F;
            var19 = -var17 + arg6 + 0.5F;
        }
        if (arg10 == -23546) {
            if (arg11 == 1) {
                float var21 = var20;
                var20 = -var19;
                var19 = var21;
            } else if (arg11 == 2) {
                var19 = -var19;
                var20 = -var20;
            } else if (arg11 == 3) {
                float var22 = var20;
                var20 = var19;
                var19 = -var22;
            }
            class144.field1870 = var20;
            class125.field1648 = var19;
        }
    }
}
