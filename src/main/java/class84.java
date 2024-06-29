import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class84 extends class210 {

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        ++field1028;
        if (arg1 <= 94) {
            this.method56(-10, -2, (class256) null);
        }
        int[][] var3 = super.field2967.method1572(121, arg0);
        if (super.field2967.field3454) {
            int[] var4 = this.method1447(arg0, -122, 2);
            int[][] var5 = this.method1444(1, 0, arg0);
            int[][] var6 = this.method1444(1, 1, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class202.field2852 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V")
    public static final void method558(int arg0, int arg1) {
        ++field1025;
        class151.field2049.method2300(arg0, true);
        if (arg1 < 16) {
            field1030 = 111;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
    public static final void method559(byte arg0) {
        ++field1029;
        if (class373.field5452 != 2) {
            try {
                if (arg0 != -82) {
                    method560(92, -27, 22, (class235) null, (class9) null, -77, 43);
                }
                class73.method521(true, class401.field5797, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class84() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILic;Lfp;II)V")
    public static final void method560(int arg0, int arg1, int arg2, class235 arg3, class9 arg4, int arg5, int arg6) {
        if (~class41.field549 > -101) {
            class59.method453(true, arg4, arg3);
        }
        if (arg2 != 15) {
            field1030 = 54;
        }
        ++field1031;
        arg4.method77(arg6, arg5, arg0 + arg6, arg1 + arg5);
        if (~class41.field549 > -101) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg6;
            arg4.method164(arg6, arg5, arg0, arg1, -16777216, 0);
            int var9 = arg5 - var7 + arg1 / 2 + -18;
            arg4.method156(var8 + -152, var9, 304, 34, class430.field6273[class115.field1560].getRGB(), 0);
            arg4.method164(var8 + -150, var9 - -2, class41.field549 * 3, 30, class274.field4060[class115.field1560].getRGB(), 0);
            class111.field1540.method576(class318.field4670[class115.field1560].getRGB(), var7 + var9, class213.field3006.method2543(false, class153.field2073), true, -1, var8);
        } else {
            int var10 = class344.field5064 - (int) ((float) arg0 / class66.field853);
            int var11 = class134.field1843 - -((int) ((float) arg1 / class66.field853));
            int var12 = (int) ((float) arg0 / class66.field853) + class344.field5064;
            class233.field3493 = (int) ((float) (arg1 * 2) / class66.field853);
            class31.field429 = -((int) ((float) arg0 / class66.field853)) + class344.field5064;
            class109.field1481 = (int) ((float) (arg0 * 2) / class66.field853);
            int var13 = -((int) ((float) arg1 / class66.field853)) + class134.field1843;
            class120.field1611 = class134.field1843 - (int) ((float) arg1 / class66.field853);
            class66.method476(class66.field870 + var10, class66.field860 + var11, class66.field870 + var12, class66.field860 + var13, arg6, arg5, arg6 - -arg0, arg5 - -arg1 + 1);
            class66.method498(arg4);
            class395 var14 = class66.method483(arg4);
            class385.method2432(arg4, 0, arg2 ^ 1, 0, var14);
            if (~class151.field2052 < -1) {
                --class267.field3966;
                if (class267.field3966 == 0) {
                    class267.field3966 = 20;
                    --class151.field2052;
                }
            }
            if (class76.field961) {
                int var15 = arg0 + arg6 + -5;
                int var16 = arg5 - (-arg1 - -8);
                class13.field215.method566(var16, 0, var15, 16776960, -1, "Fps:" + class392.field5704);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() + -var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (var18 > 65536) {
                    var19 = 16711680;
                }
                class13.field215.method566(var20, 0, var15, var19, -1, "Mem:" + var18 + "k");
                var16 = var20 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field1027;
        if (arg0 == 0) {
            super.field2956 = ~arg2.method1738((byte) -70) == -2;
        }
        if (arg1 != -11941) {
            method560(3, -25, 34, (class235) null, (class9) null, 43, -93);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lct;B)V")
    public static final void method561(class104 arg0, byte arg1) {
        class404.field5849 = arg0;
        if (arg1 == 81) {
            ++field1024;
            class432.field6298 = class404.field5849.method734(arg1 ^ 122, 4);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        if (arg1 != -38) {
            field1030 = -28;
        }
        ++field1026;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int[] var4 = this.method1447(arg0, -121, 0);
            int[] var5 = this.method1447(arg0, -121, 1);
            int[] var6 = this.method1447(arg0, arg1 ^ 89, 2);
            for (int var7 = 0; ~class202.field2852 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    static {
        new class409(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }
}
