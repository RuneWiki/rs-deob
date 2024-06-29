import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class151 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[Lt;")
    public static class242[] field2555 = new class242[2048];

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lve;")
    private static class255 field2558 = class87.method607(64, "flash2:");

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Lve;")
    public static class255 field2563 = field2558;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lve;")
    public static class255 field2557 = field2558;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lve;")
    public static class255 field2559 = class87.method607(49, "::wm2");

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lfg;")
    public static class203 field2562 = new class203();

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lve;")
    public static class255 field2564 = class87.method607(94, "scrollen:");

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[Ldm;")
    public static class273[] field2556;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 4)
    public static void method1116(int arg0) {
        field2559 = null;
        field2563 = null;
        field2562 = null;
        field2557 = null;
        field2555 = null;
        field2558 = null;
        field2564 = null;
        if (arg0 != 16384) {
            field2559 = (class255) null;
        }
        field2556 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lam;IIIIIIZ)V", line = 21)
    public static final void method1117(class243 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4106.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field4106[var9] - class210.field3580;
            int var11 = arg0.field4110[var9] - class274.field4718;
            int var12 = arg0.field4100[var9] - class59.field912;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field4096 != null) {
                class243.field4108[var9] = var13;
                class243.field4104[var9] = var16;
                class243.field4090[var9] = var17;
            }
            class243.field4091[var9] = (var13 << 9) / var17 + class283.field4880;
            class243.field4095[var9] = (var16 << 9) / var17 + class283.field4864;
        }
        class283.field4867 = 0;
        int var19 = arg0.field4099.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field4099[var20];
            int var22 = arg0.field4105[var20];
            int var23 = arg0.field4107[var20];
            int var24 = class243.field4091[var21];
            int var25 = class243.field4091[var22];
            int var26 = class243.field4091[var23];
            int var27 = class243.field4095[var21];
            int var28 = class243.field4095[var22];
            int var29 = class243.field4095[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class29.field461 && class237.method1642(class75.field1231 + class283.field4880, class283.field4864 + class199.field3426, var27, var28, var29, var24, var25, var26)) {
                    class247.field4140 = arg5;
                    class82.field1338 = arg6;
                }
                if (!class281.field4827 && !arg7) {
                    class283.field4875 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class283.field4881 || var25 > class283.field4881 || var26 > class283.field4881) {
                        class283.field4875 = true;
                    }
                    if (arg0.field4096 == null || arg0.field4096[var20] == -1) {
                        if (arg0.field4102[var20] != 12345678) {
                            class283.method1998(var27, var28, var29, var24, var25, var26, arg0.field4102[var20], arg0.field4097[var20], arg0.field4109[var20]);
                        }
                    } else if (!class136.field2262) {
                        int var30 = class283.field4866.method982(arg0.field4096[var20], true);
                        class283.method1998(var27, var28, var29, var24, var25, var26, class25.method140(var30, arg0.field4102[var20]), class25.method140(var30, arg0.field4097[var20]), class25.method140(var30, arg0.field4109[var20]));
                    } else if (arg0.field4103) {
                        class283.method2018(var27, var28, var29, var24, var25, var26, arg0.field4102[var20], arg0.field4097[var20], arg0.field4109[var20], class243.field4108[0], class243.field4108[1], class243.field4108[3], class243.field4104[0], class243.field4104[1], class243.field4104[3], class243.field4090[0], class243.field4090[1], class243.field4090[3], arg0.field4096[var20]);
                    } else {
                        class283.method2018(var27, var28, var29, var24, var25, var26, arg0.field4102[var20], arg0.field4097[var20], arg0.field4109[var20], class243.field4108[var21], class243.field4108[var22], class243.field4108[var23], class243.field4104[var21], class243.field4104[var22], class243.field4104[var23], class243.field4090[var21], class243.field4090[var22], class243.field4090[var23], arg0.field4096[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lfk;IILjava/awt/Component;I)Lva;", line = 135)
    public static final class137 method1118(class40 arg0, int arg1, int arg2, Component arg3, int arg4) {
        field2554++;
        if (class92.field1584 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class137 var5 = (class137) Class.forName("ri").getDeclaredConstructor().newInstance();
                var5.field2305 = new int[(class88.field1462 ? 2 : 1) * 256];
                var5.field2317 = arg4;
                var5.method379(arg3);
                var5.field2318 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field2318 > 16384) {
                    var5.field2318 = 16384;
                }
                var5.method376(var5.field2318);
                if (class10.field147 > 0 && class101.field1706 == null) {
                    class101.field1706 = new class315();
                    class101.field1706.field5343 = arg0;
                    arg0.method241(8851, class10.field147, class101.field1706);
                }
                if (class101.field1706 != null) {
                    if (class101.field1706.field5341[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class101.field1706.field5341[arg1] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class219 var7 = new class219(arg0, arg1);
                    var7.field2305 = new int[(class88.field1462 ? 2 : 1) * 256];
                    if (arg2 < 63) {
                        return (class137) null;
                    }
                    var7.field2317 = arg4;
                    var7.method379(arg3);
                    var7.field2318 = 16384;
                    var7.method376(var7.field2318);
                    if (class10.field147 > 0 && class101.field1706 == null) {
                        class101.field1706 = new class315();
                        class101.field1706.field5343 = arg0;
                        arg0.method241(8851, class10.field147, class101.field1706);
                    }
                    if (class101.field1706 != null) {
                        if (class101.field1706.field5341[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class101.field1706.field5341[arg1] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class137();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
