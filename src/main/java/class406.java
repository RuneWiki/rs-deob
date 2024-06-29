import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class406 extends class180 {

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "[I")
    public static int[] field6032 = new int[13];

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "[I")
    public static int[] field6031 = new int[5];

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field6030 = 0;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 3)
    public static void method2618(byte arg0) {
        field6031 = null;
        int var1 = 54 % ((47 - arg0) / 63);
        field6032 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V", line = 33)
    public static final void method2619(long arg0, byte arg1) {
        field6034++;
        int var3 = class306.field4490 + class227.field2988.field740;
        int var4 = class399.field5962 + class227.field2988.field734;
        if ((class153.field2071 - var3) < -500 || (class153.field2071 - var3) > 500 || class144.field1962 - var4 < -500 || class144.field1962 - var4 > 500) {
            class144.field1962 = var4;
            class153.field2071 = var3;
        }
        if (arg1 != -101) {
            return;
        }
        if (class153.field2071 != var3) {
            int var5 = var3 - class153.field2071;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class153.field2071 += var6;
        }
        if (!class184.field2496) {
            class317.field4647 += (float) arg0 * class191.field2559 / 6.0F;
            class396.field5847 += (float) arg0 * class178.field2361 / 6.0F;
        }
        if (class144.field1962 != var4) {
            int var7 = var4 - class144.field1962;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class144.field1962 += var8;
        }
        class407.method2627(3);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILn;Lge;Lcd;)V", line = 125)
    public static final void method2620(int arg0, int arg1, int arg2, int arg3, int arg4, class25 arg5, class104 arg6, class43 arg7) {
        if (arg3 < 16) {
            return;
        }
        field6033++;
        class365 var8 = new class365();
        var8.field5264 = arg4 * 128;
        var8.field5293 = arg1 * 128;
        var8.field5274 = arg0;
        if (arg6 != null) {
            var8.field5281 = arg6;
            int var9 = arg6.field1489;
            int var10 = arg6.field1506;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg6.field1489;
                var9 = arg6.field1506;
            }
            var8.field5290 = arg6.field1463;
            var8.field5283 = arg6.field1472 * 128;
            var8.field5268 = arg6.field1480;
            var8.field5265 = arg6.field1505;
            var8.field5271 = arg6.field1471;
            var8.field5284 = (arg1 + var10) * 128;
            var8.field5287 = arg6.field1443;
            var8.field5270 = (arg4 + var9) * 128;
            if (arg6.field1518 != null) {
                var8.field5282 = true;
                var8.method2382((byte) 123);
            }
            if (var8.field5290 != null) {
                var8.field5279 = var8.field5265 + (int) ((double) (var8.field5287 - var8.field5265) * Math.random());
            }
            class185.field2509.method330(var8, -2130841184);
        } else if (arg7 != null) {
            var8.field5277 = arg7;
            class249 var11 = arg7.field606;
            if (var11.field3375 != null) {
                var8.field5282 = true;
                var11 = var11.method1510(30);
            }
            if (var11 != null) {
                var8.field5270 = (var11.field3363 + arg4) * 128;
                var8.field5284 = (arg1 + var11.field3363) * 128;
                var8.field5271 = class181.method1105(arg7, 3);
                var8.field5268 = var11.field3358;
                var8.field5283 = var11.field3379 * 128;
            }
            class22.field291.method330(var8, -2130841184);
        } else if (arg5 != null) {
            var8.field5269 = arg5;
            var8.field5270 = (arg4 + arg5.method168(-119)) * 128;
            var8.field5284 = (arg5.method168(-111) + arg1) * 128;
            var8.field5271 = class349.method2291(true, arg5);
            var8.field5283 = arg5.field351 * 128;
            var8.field5268 = arg5.field346;
            class254.field3522.method381(true, var8, (long) arg5.field4301);
            return;
        }
    }
}
