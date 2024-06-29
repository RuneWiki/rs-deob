import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class19 extends class246 {

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    private final int field307;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    private final int field306;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    private final int field298;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    private final int field294;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    private final int field305;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    private final int field296;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    private final int field295;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    private final int field304;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lhh;")
    public static class163 field292 = class137.method1065("Clientscript error )2 check log for details", 17);

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[I")
    public static int[] field293 = new int[1000];

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "Lhh;")
    public static class163 field309 = class137.method1065(":assist:", 17);

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "[[[B")
    public static byte[][][] field300;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
    public static final int method131(int arg0) {
        if (arg0 != -6) {
            field292 = null;
        }
        ++field301;
        return 16;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method132(byte arg0) {
        field300 = null;
        field293 = null;
        int var1 = 115 % ((-25 - arg0) / 55);
        field309 = null;
        field292 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static final void method133(byte arg0) {
        ++field297;
        class237 var1 = class57.field940;
        synchronized (class57.field940) {
            ++class69.field1176;
            class219.field3981 = class39.field646;
            int var2 = 49 % ((arg0 - 88) / 33);
            class36.field608 = class163.field3001;
            class240.field4281 = class90.field1648;
            class31.field489 = class229.field4126;
            class84.field1598 = class58.field957;
            class265.field4604 = class99.field1878;
            class4.field75 = class191.field3502;
            class229.field4126 = 0;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)J")
    public static final long method134(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field2741; ++var4) {
                class132 var5 = var3.field2746[var4];
                if ((var5.field2568 >> 29 & 3L) == 2L && var5.field2555 == arg1 && var5.field2550 == arg2) {
                    return var5.field2568;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
    public final void method42(int arg0, int arg1, int arg2) {
        ++field291;
        if (arg0 > -17) {
            method136((byte) 101, 87, 6);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V")
    public final void method44(byte arg0, int arg1, int arg2) {
        ++field303;
        int var4 = this.field294 * arg1 >> 12;
        int var5 = this.field306 * arg2 >> 12;
        int var6 = this.field304 * arg1 >> 12;
        int var7 = this.field295 * arg1 >> 12;
        int var8 = this.field298 * arg2 >> 12;
        int var9 = this.field305 * arg2 >> 12;
        int var10 = this.field307 * arg1 >> 12;
        if (arg0 != 6) {
            field293 = null;
        }
        int var11 = this.field296 * arg2 >> 12;
        class56.method395(var4, var11, var7, var9, var6, true, super.field4342, var8, var10, var5);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public static final void method135(int arg0) {
        ++field302;
        if (class125.field2414 != -1 && ~class192.field3513 != 0) {
            int var1 = ((-class122.field2331 + class140.field2673) * class160.field2945 >> 16) + class122.field2331;
            class160.field2945 += var1;
            if (class160.field2945 < arg0) {
                class252.field4422 = false;
                class30.field471 = false;
            } else {
                if (class30.field471) {
                    class252.field4422 = false;
                } else {
                    class252.field4422 = true;
                }
                class160.field2945 = 65535;
                class30.field471 = true;
            }
            float var2 = (float) class160.field2945 / 65535.0F;
            int var3 = class48.field799 * 2;
            float[] var4 = new float[3];
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class262.field4575[class125.field2414][var3][var5];
                int var22 = (class262.field4575[class125.field2414][var3 + 2][var5] - (class262.field4575[class125.field2414][var3 + 3][var5] + -class262.field4575[class125.field2414][var3 - -2][var5])) * 3;
                int var23 = class262.field4575[class125.field2414][var3][var5] * 3;
                int var24 = class262.field4575[class125.field2414][var3 + 1][var5] * 3;
                int var25 = -var23 + var24;
                int var26 = class262.field4575[class125.field2414][var3 - -2][var5] - var21 + (var24 - var22);
                int var27 = var23 - (var24 * 2 + -var22);
                var4[var5] = (((float) var26 * var2 + (float) var27) * var2 + (float) var25) * var2 + (float) var21;
            }
            if (class62.field1035 == 0 && ~class257.field4500 == -1) {
                class257.field4500 = (((int) var4[2] >> 10) + -6) * 8;
                class62.field1035 = (((int) var4[0] >> 10) + -6) * 8;
            }
            float[] var6 = new float[3];
            class123.field2367 = (int) var4[0] + -(class62.field1035 * 128);
            class191.field3490 = (int) var4[1] * -1;
            class88.field1636 = (int) var4[2] + -(class257.field4500 * 128);
            int var7 = class66.field1117 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var14 = class262.field4575[class192.field3513][var7][var8] * 3;
                int var15 = class262.field4575[class192.field3513][var7 + 1][var8] * 3;
                int var16 = (-class262.field4575[class192.field3513][var7 + 3][var8] - -class262.field4575[class192.field3513][var7 + 2][var8] + class262.field4575[class192.field3513][var7 + 2][var8]) * 3;
                int var17 = -var14 + var15;
                int var18 = class262.field4575[class192.field3513][var7][var8];
                int var19 = class262.field4575[class192.field3513][var7 + 2][var8] - var16 + -var18 + var15;
                int var20 = var14 + var16 + -(var15 * 2);
                var6[var8] = (((float) var19 * var2 + (float) var20) * var2 + (float) var17) * var2 + (float) var18;
            }
            float var9 = var6[0] + -var4[0];
            float var10 = (var6[1] - var4[1]) * -1.0F;
            float var11 = var6[2] - var4[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class220.field3992 = (float) Math.atan2((double) var10, var12);
            class197.field3556 = -((float) Math.atan2((double) var9, (double) var11));
            class63.field1072 = (int) ((double) class197.field3556 * 325.949D) & 2047;
            class13.field201 = 2047 & (int) ((double) class220.field3992 * 325.949D);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field307 = arg6;
        this.field306 = arg1;
        this.field298 = arg5;
        this.field294 = arg0;
        this.field305 = arg3;
        this.field296 = arg7;
        this.field295 = arg4;
        this.field304 = arg2;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)V")
    public final void method46(int arg0, int arg1, int arg2) {
        ++field308;
        if (arg1 != 2) {
            field292 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(BII)V")
    public static final void method136(byte arg0, int arg1, int arg2) {
        if (arg0 != -49) {
            method136((byte) 74, -48, 10);
        }
        ++field299;
        if (class143.field2702 != arg2) {
            class26.field402 = new int[arg2];
            for (int var3 = 0; ~var3 > ~arg2; ++var3) {
                class26.field402[var3] = (var3 << 12) / arg2;
            }
            class172.field3147 = ~arg2 == -65 ? 2048 : 4096;
            class143.field2702 = arg2;
            class54.field884 = arg2 + -1;
        }
        if (class1.field26 != arg1) {
            if (class143.field2702 != arg1) {
                class214.field3911 = new int[arg1];
                for (int var4 = 0; ~var4 > ~arg1; ++var4) {
                    class214.field3911[var4] = (var4 << 12) / arg1;
                }
            } else {
                class214.field3911 = class26.field402;
            }
            class1.field26 = arg1;
            class258.field4520 = arg1 + -1;
        }
    }
}
