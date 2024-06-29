import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class672 extends class513 {

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "I")
    public volatile int field9454 = -1;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field9450;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "Lqk;")
    public static class148 field9449 = new class148(36, 3);

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "[I")
    public static int[] field9452 = new int[14];

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "Lcw;")
    public static class21 field9451;

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "[[S")
    public static short[][] field9453;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V", line = 4)
    public static void method3845(int arg0) {
        if (arg0 != 22050) {
            field9452 = null;
        }
        field9452 = null;
        field9453 = null;
        field9449 = null;
        field9451 = null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lnm;BIIII)V", line = 17)
    public static final void method3846(class67 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field9455++;
        if (arg0.field922 == -1 && arg0.field928 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg0.field937 * class674.field9500.field5114.method3216(0) >> 8;
        if (arg5 > arg0.field941) {
            var6 += arg5 - arg0.field941;
        } else if (arg0.field916 > arg5) {
            var6 += arg0.field916 - arg5;
        }
        if (arg0.field939 < arg4) {
            var6 += arg4 - arg0.field939;
        } else if (arg0.field944 > arg4) {
            var6 += arg0.field944 - arg4;
        }
        if (arg0.field915 == 0 || (var6 - 256) > arg0.field915 || class674.field9500.field5114.method3216(0) == 0 || arg0.field933 != arg3) {
            if (arg0.field927 != null) {
                class237.field3299.method3761(arg0.field927);
                arg0.field943 = null;
                arg0.field927 = null;
                arg0.field921 = null;
            }
            if (arg0.field919 != null) {
                class237.field3299.method3761(arg0.field919);
                arg0.field919 = null;
                arg0.field923 = null;
                arg0.field947 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg0.field915 - var6) * var7 / arg0.field915;
        if (arg1 > -92) {
            field9453 = null;
        }
        class473.field6483.method3470(-1);
        int var9 = 8192;
        int var10 = (arg0.field941 + arg0.field916) / 2 - arg5;
        int var11 = (arg0.field939 + arg0.field944) / 2 - arg4;
        if (var10 != 0 || var11 != 0) {
            int var12 = -class645.field9148 - ((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var12 > 8192) {
                var12 = 16384 - var12;
            }
            int var13;
            if (var6 <= 0) {
                var13 = 8192;
            } else if (var6 < 4096) {
                var13 = (var6 * 8192 / 4096) + 8192;
            } else {
                var13 = 16384;
            }
            var9 = (16384 - var13 >> 1) + var12 * var13 / 8192;
        }
        if (arg0.field927 != null) {
            arg0.field927.method1318(var8);
            arg0.field927.method1312(var9);
        } else if (arg0.field922 >= 0) {
            int var14 = arg0.field926 == 256 && arg0.field925 == 256 ? 256 : class403.method2449(arg0.field925, (byte) -71, arg0.field926);
            if (arg0.field929) {
                if (arg0.field921 == null) {
                    arg0.field921 = class110.method743(class445.field6084, arg0.field922);
                }
                if (arg0.field921 != null) {
                    if (arg0.field943 == null) {
                        arg0.field943 = arg0.field921.method737(new int[] { 22050 });
                    }
                    if (arg0.field943 != null) {
                        class194 var15 = class194.method1294(arg0.field943, var14, var8 << 6, var9);
                        var15.method1301(-1);
                        class237.field3299.method3760(var15);
                        arg0.field927 = var15;
                    }
                }
            } else {
                class258 var16 = class258.method1605(class264.field3590, arg0.field922, 0);
                if (var16 != null) {
                    class25 var17 = var16.method1608().method136(class478.field6515);
                    class194 var18 = class194.method1294(var17, var14, var8 << 6, var9);
                    var18.method1301(-1);
                    class237.field3299.method3760(var18);
                    arg0.field927 = var18;
                }
            }
        }
        if (arg0.field919 != null) {
            arg0.field919.method1318(var8);
            arg0.field919.method1312(var9);
            if (arg0.field919.method3064(10343)) {
                return;
            }
            arg0.field919 = null;
            arg0.field923 = null;
            arg0.field947 = null;
        } else if (arg0.field928 != null && (arg0.field946 -= arg2) <= 0) {
            int var19 = arg0.field926 == 256 && arg0.field925 == 256 ? 256 : (int) (Math.random() * (double) (arg0.field926 - arg0.field925)) + arg0.field925;
            if (arg0.field938) {
                if (arg0.field947 == null) {
                    int var20 = (int) (Math.random() * (double) arg0.field928.length);
                    arg0.field947 = class110.method743(class445.field6084, arg0.field928[var20]);
                }
                if (arg0.field947 != null) {
                    if (arg0.field923 == null) {
                        arg0.field923 = arg0.field947.method737(new int[] { 22050 });
                    }
                    if (arg0.field923 != null) {
                        class194 var21 = class194.method1294(arg0.field923, var19, var8 << 6, var9);
                        var21.method1301(0);
                        class237.field3299.method3760(var21);
                        arg0.field946 = arg0.field920 + (int) (Math.random() * (double) (arg0.field945 - arg0.field920));
                        arg0.field919 = var21;
                        return;
                    }
                }
                return;
            }
            int var22 = (int) ((double) arg0.field928.length * Math.random());
            class258 var23 = class258.method1605(class264.field3590, arg0.field928[var22], 0);
            if (var23 != null) {
                class25 var24 = var23.method1608().method136(class478.field6515);
                class194 var25 = class194.method1294(var24, var19, var8 << 6, var9);
                var25.method1301(0);
                class237.field3299.method3760(var25);
                arg0.field919 = var25;
                arg0.field946 = arg0.field920 + ((int) ((double) (arg0.field945 - arg0.field920) * Math.random()));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 290)
    public class672(String arg0) {
        this.field9450 = arg0;
    }
}
