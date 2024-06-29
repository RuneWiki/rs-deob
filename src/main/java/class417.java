import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class417 {

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public int field5335;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public int field5333;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field5331;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public int field5339;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "F")
    public static float field5338;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Lqs;", line = 5)
    public static final class565 method2319(int arg0, int arg1, int arg2) {
        if (class407.field5237[arg0][arg1][arg2] == null) {
            boolean var3 = class407.field5237[0][arg1][arg2] != null && class407.field5237[0][arg1][arg2].field7075 != null;
            if (var3 && arg0 >= class709.field9904 - 1) {
                return null;
            }
            class160.method987(arg0, arg1, arg2);
        }
        return class407.field5237[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Lqd;", line = 22)
    public final class417 method2320(int arg0, byte arg1) {
        if (arg1 == -122) {
            field5337++;
            return new class417(this.field5339, arg0, this.field5335, this.field5331);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([Lrr;II)V", line = 35)
    public static final void method2321(class337[] arg0, int arg1, int arg2) {
        field5334++;
        if (arg2 <= 115) {
            field5338 = 0.5833627F;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class337 var4 = arg0[var3];
            if (var4 != null && var4.field4190 == arg1 && !client.method1702(var4)) {
                if (var4.field4212 == 0) {
                    method2321(arg0, var4.field4172, 127);
                    if (var4.field4179 != null) {
                        method2321(var4.field4179, var4.field4172, 123);
                    }
                    class293 var5 = (class293) class216.field2530.method3828((long) var4.field4172, (byte) -91);
                    if (var5 != null) {
                        class569.method3015(var5.field3727, (byte) 58);
                    }
                }
                if (var4.field4212 == 6 && var4.field4256 != -1) {
                    class207 var6 = class11.field110.method1141(var4.field4256, (byte) 5);
                    if (var6 != null) {
                        var4.field4264 += class231.field3008;
                        int var7 = var4.field4315;
                        while (var6.field2436[var4.field4315] < var4.field4264) {
                            var4.field4264 -= var6.field2436[var4.field4315];
                            var4.field4315++;
                            if (var4.field4315 >= var6.field2441.length) {
                                var4.field4315 -= var6.field2453;
                                if (var4.field4315 < 0 || var6.field2441.length <= var4.field4315) {
                                    var4.field4315 = 0;
                                }
                            }
                            var4.field4159 = var4.field4315 + 1;
                            if (var6.field2441.length <= var4.field4159) {
                                var4.field4159 -= var6.field2453;
                                if (var4.field4159 < 0 || var4.field4159 >= var6.field2441.length) {
                                    var4.field4159 = -1;
                                }
                            }
                            class99.method721((byte) -103, var4);
                        }
                        if (var4.field4315 != var7) {
                            class309.method1829(true, var4.field4315, var6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 126)
    public static final void method2322(byte arg0) {
        field5332++;
        if (arg0 > -64) {
            field5338 = 0.28143018F;
        }
        int var1 = (int) ((double) class85.field1090 * 34.46D);
        int var2 = var1 << 2;
        if (class309.field3898.method488()) {
            var2 += 512;
        }
        class309.field3898.method438(200, var2);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IF)F", line = 147)
    public static final float method2323(int arg0, float arg1) {
        if (arg0 != 15) {
            field5338 = -1.4614031F;
        }
        field5336++;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IBI)V", line = 160)
    public static final void method2324(String arg0, String arg1, String arg2, String arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != -95) {
            method2321(null, 108, -120);
        }
        class518.method2812(arg3, arg1, arg0, arg4, -1, null, 24, arg2, arg6);
        field5340++;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIII)V", line = 174)
    public class417(int arg0, int arg1, int arg2, int arg3) {
        this.field5335 = arg2;
        this.field5333 = arg1;
        this.field5331 = arg3;
        this.field5339 = arg0;
    }
}
