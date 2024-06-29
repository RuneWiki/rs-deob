import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class319 extends class250 implements class368 {

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
    private int field4111;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!iia", name = "g", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!iia", name = "k", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!iia", name = "l", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "(I)V", line = 9)
    public static final void method1851(int arg0) {
        for (int var1 = 0; var1 < class298.field3905; ++var1) {
            int var2 = class745.field10385[var1];
            class55 var3 = ((class15) class403.field5587.method1381(true, (long) var2)).field204;
            int var4 = class150.field2065.method194((byte) 119);
            if (~(var4 & 2) != -1) {
                var4 += class150.field2065.method194((byte) 119) << 8;
            }
            if (~(1024 & var4) != -1) {
                int var5 = class150.field2065.method174(0);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var5 > var9; ++var9) {
                    int var10 = class150.field2065.method193(2);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class150.field2065.method174(0);
                    var8[var9] = class150.field2065.method193(2);
                }
                class11.method59(255, var8, var6, var3, var7);
            }
            if ((var4 & 2048) != 0) {
                int var11 = class150.field2065.method193(2);
                var3.field8365 = class150.field2065.method174(0);
                var3.field8340 = class150.field2065.method192(59);
                var3.field8324 = (var11 & 32768) != 0;
                var3.field8404 = var11 & 32767;
                var3.field8374 = class245.field3409 + var3.field8365 - -var3.field8404;
            }
            if (~(1 & var4) != -1) {
                var3.field781 = class150.field2065.method193(2);
                var3.field761 = class150.field2065.method167((byte) 66);
            }
            if ((var4 & 16) != 0) {
                var3.field8342 = class150.field2065.method193(2);
                if (var3.field8342 == 65535) {
                    var3.field8342 = -1;
                }
            }
            if (~(256 & var4) != -1) {
                var3.field8360 = class150.field2065.method138((byte) -62);
                var3.field8356 = class150.field2065.method172(6849);
                var3.field8363 = class150.field2065.method138((byte) -62);
                var3.field8334 = class150.field2065.method195(128);
                var3.field8388 = class150.field2065.method168(-16785) - -class245.field3409;
                var3.field8402 = class150.field2065.method193(2) - -class245.field3409;
                var3.field8333 = class150.field2065.method143(false);
                var3.field8334 += var3.field8414[0];
                var3.field8416 = 0;
                var3.field8363 += var3.field8421[0];
                var3.field8360 += var3.field8421[0];
                var3.field8419 = 1;
                var3.field8356 += var3.field8414[0];
            }
            if (~(var4 & 512) != -1) {
                var3.field8403 = class150.field2065.method146(true);
                var3.field8319 = class150.field2065.method195(128);
                var3.field8345 = class150.field2065.method195(128);
                var3.field8400 = (byte) class150.field2065.method192(99);
                var3.field8339 = class245.field3409 - -class150.field2065.method167((byte) 86);
                var3.field8387 = class245.field3409 + class150.field2065.method191(false);
            }
            if ((var4 & 32) != 0) {
                int var12 = class150.field2065.method193(2);
                int var13 = class150.field2065.method202(53);
                if (~var12 == -65536) {
                    var12 = -1;
                }
                int var14 = class150.field2065.method194((byte) 119);
                int var15 = var14 & 7;
                int var16 = (126 & var14) >> 3;
                if (var16 == 15) {
                    var16 = -1;
                }
                var3.method3483(var15, false, var12, var16, -1, var13);
            }
            if ((var4 & 8192) != 0) {
                int var17 = class150.field2065.method194((byte) 119);
                int[] var18 = new int[var17];
                int[] var19 = new int[var17];
                for (int var20 = 0; var20 < var17; ++var20) {
                    int var21 = class150.field2065.method167((byte) 126);
                    if (~(var21 & 49152) == -49153) {
                        int var22 = class150.field2065.method168(-16785);
                        var18[var20] = class747.method4153(var22, var21 << 16);
                    } else {
                        var18[var20] = var21;
                    }
                    var19[var20] = class150.field2065.method193(2);
                }
                var3.method3472(var18, 100, var19);
            }
            if ((4096 & var4) != 0) {
                int var23 = class150.field2065.method191(false);
                int var24 = class150.field2065.method144(-71);
                if (~var23 == -65536) {
                    var23 = -1;
                }
                int var25 = class150.field2065.method192(101);
                int var26 = var25 & 7;
                int var27 = var25 >> 3 & 15;
                if (var27 == 15) {
                    var27 = -1;
                }
                var3.method3483(var26, true, var23, var27, -1, var24);
            }
            if ((var4 & 16384) != 0) {
                int var28 = class150.field2065.method190(-27226);
                int var29 = class150.field2065.method194((byte) 119);
                var3.method3481(class245.field3409, var28, var29, false);
            }
            if (~(var4 & 128) != -1) {
                if (var3.field771.method56(115)) {
                    class502.method3002(var3, false);
                }
                var3.method379(class643.field9112.method3887(class150.field2065.method193(2), false), -120);
                var3.method3474((byte) -54, var3.field771.field134);
                var3.field8322 = var3.field771.field146 << 3;
                if (var3.field771.method56(118)) {
                    class143.method937(var3.field8414[0], (class30) null, var3.field9501, 19126, var3, var3.field8421[0], 0, (class655) null);
                }
            }
            if ((var4 & 4) != 0) {
                int[] var30 = new int[4];
                for (int var31 = 0; var31 < 4; ++var31) {
                    var30[var31] = class150.field2065.method167((byte) 102);
                    if (~var30[var31] == -65536) {
                        var30[var31] = -1;
                    }
                }
                int var32 = class150.field2065.method143(false);
                class81.method485(var3, var30, (byte) -60, var32);
            }
            if (~(64 & var4) != -1) {
                var3.field8314 = class150.field2065.method196((byte) -92);
                var3.field8338 = 100;
            }
            if (~(var4 & 8) != -1) {
                int var33 = class150.field2065.method190(-27226);
                int var34 = class150.field2065.method174(0);
                var3.method3481(class245.field3409, var33, var34, false);
                var3.field8341 = class245.field3409 + 300;
                var3.field8329 = class150.field2065.method192(83);
            }
        }
        if (arg0 < 73) {
            method1858(23, -58);
        }
        ++field4119;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)J", line = 269)
    public final long method1852(int arg0) {
        ++field4109;
        return arg0 != 5501 ? -4L : super.field3472.getAddress();
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lep;I[BI)V", line = 280)
    public class319(class371 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4111 = arg1;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)I", line = 290)
    public final int method1853(int arg0) {
        if (arg0 != 8645) {
            method1851(63);
        }
        ++field4114;
        return this.field4111;
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)I", line = 301)
    public final int method1854(int arg0) {
        ++field4113;
        return arg0 != 655 ? -52 : 0;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ILwn;)V", line = 314)
    public static final void method1855(int arg0, class583 arg1) {
        ++field4117;
        arg1.method3464(8);
        int var2 = class471.field6467;
        class655 var3 = class473.field6483 = class40.field563[var2] = new class655();
        var3.field8344 = var2;
        int var4 = arg1.method3467(102, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 16383;
        if (arg0 != -26156) {
            field4116 = 65;
        }
        int var7 = 16383 & var4;
        var3.field8421[0] = -class179.field2535 + var6;
        var3.field9490 = (var3.field8421[0] << 9) + (var3.method3470(-1) << 8);
        var3.field8414[0] = -class510.field7109 + var7;
        var3.field9489 = (var3.field8414[0] << 9) + (var3.method3470(-1) << 8);
        class392.field5459 = var3.field9501 = var3.field9495 = var5;
        if (class753.method4175(-12388, var3.field8414[0], var3.field8421[0])) {
            ++var3.field9495;
        }
        if (class383.field5386[var2] != null) {
            var3.method3786(class383.field5386[var2], 0);
        }
        class147.field2030 = 0;
        class351.field4456[class147.field2030++] = var2;
        class204.field2933[var2] = 0;
        class223.field3127 = 0;
        for (int var8 = 1; ~var8 > -2049; ++var8) {
            if (~var2 != ~var8) {
                int var9 = arg1.method3467(-4, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 255;
                int var12 = var9 & 255;
                class257 var13 = class175.field2382[var8] = new class257();
                var13.field3517 = (var11 << 14) + (var10 << 28) + var12;
                var13.field3520 = 0;
                var13.field3519 = -1;
                var13.field3515 = false;
                class87.field1203[class223.field3127++] = var8;
                class204.field2933[var8] = 0;
            }
        }
        arg1.method3458((byte) 53);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V", line = 388)
    public static final void method1856(byte arg0) {
        ++field4115;
        if (!class274.field3686) {
            class507.method3024((byte) -75, class569.field8071);
            if (arg0 < -15) {
                if (class192.field2787 != null) {
                    class507.method3024((byte) -75, class192.field2787);
                }
                class274.field3686 = true;
            }
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "([BIII)V", line = 417)
    public final void method1857(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -13491) {
            field4116 = -50;
        }
        this.method1589(arg0, arg2);
        ++field4110;
        this.field4111 = arg3;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V", line = 429)
    public static final void method1858(int arg0, int arg1) {
        ++field4112;
        if (arg1 != 65535) {
            method1851(90);
        }
        class639.field9077 = arg0;
        class538 var2 = class585.field8426;
        synchronized (class585.field8426) {
            class585.field8426.method3210(false);
        }
    }
}
