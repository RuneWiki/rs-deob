import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class109 implements class690 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Ljava/lang/String;")
    private String field1337;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "Lmq;")
    public static class78 field1340 = new class78(33, -2);

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field1346 = -1;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "Z")
    private boolean field1344;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "[Ls;")
    public static class402[] field1341;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Lam;", line = 5)
    public final class309 method650(byte arg0) {
        if (arg0 == 8) {
            field1338++;
            return class309.field3951;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)I", line = 17)
    public final int method648(byte arg0) {
        if (arg0 > -101) {
            return -10;
        }
        field1342++;
        int var2 = class653.method3526(this.field1337, false);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field1344 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(B)Z", line = 36)
    public final boolean method747(byte arg0) {
        field1343++;
        return arg0 < 8 ? false : this.field1344;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)Z", line = 53)
    public static final boolean method748(int arg0, int arg1, int arg2) {
        field1339++;
        if (arg0 == 4096) {
            return (arg1 & 0x800) != 0 | class135.method848(arg2, (byte) 87, arg1) || class34.method315(arg2, arg1, (byte) -22);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIBIILhca;)V", line = 64)
    public static final void method749(int arg0, int arg1, byte arg2, int arg3, int arg4, class389 arg5) {
        field1345++;
        if (arg5.field5425 == -1 && arg5.field5422 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg5.field5403 * class223.field2944.field605.method3601((byte) -125) >> 8;
        if (arg5.field5431 < arg4) {
            var6 += arg4 - arg5.field5431;
        } else if (arg5.field5409 > arg4) {
            var6 += arg5.field5409 - arg4;
        }
        if (arg1 > arg5.field5427) {
            var6 += arg1 - arg5.field5427;
        } else if (arg5.field5416 > arg1) {
            var6 += arg5.field5416 - arg1;
        }
        if (arg5.field5402 == 0 || (var6 - 256) > arg5.field5402 || class223.field2944.field605.method3601((byte) -128) == 0 || arg5.field5432 != arg0) {
            if (arg5.field5419 != null) {
                class668.field9148.method664(arg5.field5419);
                arg5.field5421 = null;
                arg5.field5419 = null;
                arg5.field5400 = null;
            }
            if (arg5.field5418 != null) {
                class668.field9148.method664(arg5.field5418);
                arg5.field5430 = null;
                arg5.field5418 = null;
                arg5.field5406 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg5.field5402 - var6) * var7 / arg5.field5402;
        class339.field4374.method253((byte) -27);
        if (arg2 >= -110) {
            field1340 = null;
        }
        int var9 = 8192;
        int var10 = (arg5.field5431 + arg5.field5409) / 2 - arg4;
        int var11 = (arg5.field5427 + arg5.field5416) / 2 - arg1;
        if (var10 != 0 || var11 != 0) {
            int var12 = (-((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D)) - 4096) - class688.field9781 & 0x3FFF;
            if (var12 > 8192) {
                var12 = 16384 - var12;
            }
            int var13;
            if (var6 <= 0) {
                var13 = 8192;
            } else if (var6 < 4096) {
                var13 = var6 * 8192 / 4096 + 8192;
            } else {
                var13 = 16384;
            }
            var9 = (16384 - var13 >> 1) + var12 * var13 / 8192;
        }
        if (arg5.field5419 != null) {
            arg5.field5419.method4046(var8);
            arg5.field5419.method4058(var9);
        } else if (arg5.field5425 >= 0) {
            int var14 = arg5.field5401 == 256 && arg5.field5415 == 256 ? 256 : class43.method361(arg5.field5401, -19585, arg5.field5415);
            if (arg5.field5417) {
                if (arg5.field5421 == null) {
                    arg5.field5421 = class759.method4227(class107.field1327, arg5.field5425);
                }
                if (arg5.field5421 != null) {
                    if (arg5.field5400 == null) {
                        arg5.field5400 = arg5.field5421.method4222(new int[] { 22050 });
                    }
                    if (arg5.field5400 != null) {
                        class729 var15 = class729.method4070(arg5.field5400, var14, var8 << 6, var9);
                        var15.method4040(-1);
                        class668.field9148.method663(var15);
                        arg5.field5419 = var15;
                    }
                }
            } else {
                class483 var16 = class483.method2815(class1.field2, arg5.field5425, 0);
                if (var16 != null) {
                    class639 var17 = var16.method2812().method3467(class441.field6191);
                    class729 var18 = class729.method4070(var17, var14, var8 << 6, var9);
                    var18.method4040(-1);
                    class668.field9148.method663(var18);
                    arg5.field5419 = var18;
                }
            }
        }
        if (arg5.field5418 != null) {
            arg5.field5418.method4046(var8);
            arg5.field5418.method4058(var9);
            if (!arg5.field5418.method3425(-16972)) {
                arg5.field5430 = null;
                arg5.field5418 = null;
                arg5.field5406 = null;
            }
        } else if (arg5.field5422 != null && (arg5.field5424 -= arg3) <= 0) {
            int var19 = arg5.field5401 == 256 && arg5.field5415 == 256 ? 256 : (int) (Math.random() * (double) (arg5.field5401 - arg5.field5415)) + arg5.field5415;
            if (arg5.field5414) {
                if (arg5.field5406 == null) {
                    int var20 = (int) (Math.random() * (double) arg5.field5422.length);
                    arg5.field5406 = class759.method4227(class107.field1327, arg5.field5422[var20]);
                }
                if (arg5.field5406 != null) {
                    if (arg5.field5430 == null) {
                        arg5.field5430 = arg5.field5406.method4222(new int[] { 22050 });
                    }
                    if (arg5.field5430 != null) {
                        class729 var21 = class729.method4070(arg5.field5430, var19, var8 << 6, var9);
                        var21.method4040(0);
                        class668.field9148.method663(var21);
                        arg5.field5424 = arg5.field5407 + (int) ((double) (arg5.field5405 - arg5.field5407) * Math.random());
                        arg5.field5418 = var21;
                        return;
                    }
                }
                return;
            }
            int var22 = (int) (Math.random() * (double) arg5.field5422.length);
            class483 var23 = class483.method2815(class1.field2, arg5.field5422[var22], 0);
            if (var23 != null) {
                class639 var24 = var23.method2812().method3467(class441.field6191);
                class729 var25 = class729.method4070(var24, var19, var8 << 6, var9);
                var25.method4040(0);
                class668.field9148.method663(var25);
                arg5.field5418 = var25;
                arg5.field5424 = (int) ((double) (arg5.field5405 - arg5.field5407) * Math.random()) + arg5.field5407;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 328)
    public static void method750(int arg0) {
        if (arg0 < -55) {
            field1340 = null;
            field1341 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 339)
    public class109(String arg0) {
        this.field1337 = arg0;
    }
}
