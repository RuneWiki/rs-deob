import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class351 {

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Lqk;")
    public static class1 field5099 = new class1(87, 2);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Loq;)V")
    public static final void method2212(class230 arg0) {
        class139.field1781.method196(arg0.field3470, arg0.field3464 + (arg0.method78((byte) -127) >> 1), arg0.field3460, class116.field1577);
        arg0.field3465 = class116.field1577[0];
        arg0.field3453 = class116.field1577[1];
        arg0.field3471 = class116.field1577[2];
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static final void method2213(int arg0) {
        field5096++;
        if (class664.field9331 == 3) {
            class285.method1884(true, 4);
        } else if (class664.field9331 == 7) {
            class285.method1884(true, 8);
        } else if (class664.field9331 == 10) {
            class285.method1884(true, 11);
        }
        if (arg0 != 3) {
            method2215(109, -16, 83, 37, -51, 83, -63, 63, 118, 53);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
    public static final void method2214(boolean arg0) {
        field5101++;
        for (int var1 = 0; var1 < 5; var1++) {
            class412.field5778[var1] = false;
        }
        class730.field10105 = class533.field7336;
        class623.field8732 = class326.field4589;
        class377.field5409 = -1;
        class695.field9691 = 5;
        if (arg0) {
            return;
        }
        class270.field3902 = class479.field6645;
        class773.field10652 = class497.field6818;
        class379.field5437 = class472.field6537;
        class164.field2096 = class412.field5779;
        class362.field5225 = -1;
        class5.field30 = -1;
        class426.field5952 = 0;
        class70.field769 = -1;
        class53.field642 = 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method2215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5098++;
        int var10 = -48 % ((arg1 - 7) / 45);
        if (!class556.method3276(arg2, arg4, 2, arg0)) {
            return false;
        }
        int var11 = class484.field6696[0];
        int var12 = class484.field6696[1];
        int var13 = class484.field6696[2];
        if (!class556.method3276(arg5, arg6, 2, arg9)) {
            return false;
        }
        int var14 = class484.field6696[1];
        int var15 = class484.field6696[0];
        int var16 = class484.field6696[2];
        if (class556.method3276(arg3, arg7, 2, arg8)) {
            int var17 = class484.field6696[1];
            int var18 = class484.field6696[2];
            int var19 = class484.field6696[0];
            return class788.method4323(var16, var11, var18, (byte) 84, var15, var12, var13, var14, var19, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static void method2216(byte arg0) {
        field5099 = null;
        if (arg0 != 96) {
            method2213(-112);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public static final void method2217(int arg0) {
        field5097++;
        int var1 = class350.field5094 * 512 + 256;
        int var2 = class383.field5490 * 512 + 256;
        int var3 = class373.method2316(var1, class435.field6040, var2, -81) - class32.field309;
        if (class262.field3838 < 100) {
            if (class497.field6818 < var1) {
                class497.field6818 += class685.field9575 + ((var1 - class497.field6818) * class262.field3838 / 1000);
                if (class497.field6818 > var1) {
                    class497.field6818 = var1;
                }
            }
            if (class497.field6818 > var1) {
                class497.field6818 -= (class497.field6818 - var1) * class262.field3838 / 1000 + class685.field9575;
                if (var1 > class497.field6818) {
                    class497.field6818 = var1;
                }
            }
            if (class479.field6645 < var3) {
                class479.field6645 += class685.field9575 + ((var3 - class479.field6645) * class262.field3838 / 1000);
                if (var3 < class479.field6645) {
                    class479.field6645 = var3;
                }
            }
            if (class412.field5779 < var2) {
                class412.field5779 += (var2 - class412.field5779) * class262.field3838 / 1000 + class685.field9575;
                if (var2 < class412.field5779) {
                    class412.field5779 = var2;
                }
            }
            if (var3 < class479.field6645) {
                class479.field6645 -= (class479.field6645 - var3) * class262.field3838 / 1000 + class685.field9575;
                if (class479.field6645 < var3) {
                    class479.field6645 = var3;
                }
            }
            if (class412.field5779 > var2) {
                class412.field5779 -= class685.field9575 + ((class412.field5779 - var2) * class262.field3838 / 1000);
                if (class412.field5779 < var2) {
                    class412.field5779 = var2;
                }
            }
        } else {
            class412.field5779 = class383.field5490 * 512 + 256;
            class497.field6818 = class350.field5094 * 512 + 256;
            class479.field6645 = class373.method2316(class497.field6818, class435.field6040, class412.field5779, 82) - class32.field309;
        }
        int var4 = class754.field10395 * 512 + 256;
        int var5 = class123.field1630 * 512 + 256;
        int var6 = class373.method2316(var5, class435.field6040, var4, 94) - class439.field6071;
        int var7 = var5 - class497.field6818;
        int var8 = var6 - class479.field6645;
        int var9 = var4 - class412.field5779;
        if (arg0 != 16384) {
            field5100 = -87;
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class472.field6537) {
            class472.field6537 += (var11 - class472.field6537 >> 3) * class426.field5952 / 1000 + class53.field642 << 3;
            if (class472.field6537 > var11) {
                class472.field6537 = var11;
            }
        }
        if (var11 < class472.field6537) {
            class472.field6537 -= class53.field642 + ((class472.field6537 - var11 >> 3) * class426.field5952 / 1000) << 3;
            if (var11 > class472.field6537) {
                class472.field6537 = var11;
            }
        }
        int var13 = var12 - class326.field4589;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class326.field4589 += class426.field5952 * var14 / 1000 + class53.field642 << 3;
            class326.field4589 &= 0x3FFF;
        }
        if (var14 < 0) {
            class326.field4589 -= -var14 * class426.field5952 / 1000 + class53.field642 << 3;
            class326.field4589 &= 0x3FFF;
        }
        int var15 = var12 - class326.field4589;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class480.field6657 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class326.field4589 = var12;
        }
    }
}
