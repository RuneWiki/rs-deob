import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class239 {

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field3529 = 0;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Ljava/lang/String;")
    public String field3527;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method1627(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class435.field6217; var3++) {
            class371 var4 = class114.field1474[var3];
            if (var4.field5278 == 1) {
                int var5 = var4.field5275 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field5288 * var5 >> 8) + var4.field5272;
                    int var7 = (var4.field5293 * var5 >> 8) + var4.field5285;
                    int var8 = (var4.field5277 * var5 >> 8) + var4.field5280;
                    int var9 = (var4.field5289 * var5 >> 8) + var4.field5273;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field5278 == 2) {
                int var10 = arg0 - var4.field5275;
                if (var10 > 0) {
                    int var11 = (var4.field5288 * var10 >> 8) + var4.field5272;
                    int var12 = (var4.field5293 * var10 >> 8) + var4.field5285;
                    int var13 = (var4.field5277 * var10 >> 8) + var4.field5280;
                    int var14 = (var4.field5289 * var10 >> 8) + var4.field5273;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field5278 == 3) {
                int var15 = var4.field5272 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field5284 * var15 >> 8) + var4.field5275;
                    int var17 = (var4.field5290 * var15 >> 8) + var4.field5282;
                    int var18 = (var4.field5277 * var15 >> 8) + var4.field5280;
                    int var19 = (var4.field5289 * var15 >> 8) + var4.field5273;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field5278 == 4) {
                int var20 = arg2 - var4.field5272;
                if (var20 > 0) {
                    int var21 = (var4.field5284 * var20 >> 8) + var4.field5275;
                    int var22 = (var4.field5290 * var20 >> 8) + var4.field5282;
                    int var23 = (var4.field5277 * var20 >> 8) + var4.field5280;
                    int var24 = (var4.field5289 * var20 >> 8) + var4.field5273;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field5278 == 5) {
                int var25 = arg1 - var4.field5280;
                if (var25 > 0) {
                    int var26 = (var4.field5284 * var25 >> 8) + var4.field5275;
                    int var27 = (var4.field5290 * var25 >> 8) + var4.field5282;
                    int var28 = (var4.field5288 * var25 >> 8) + var4.field5272;
                    int var29 = (var4.field5293 * var25 >> 8) + var4.field5285;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZLmq;)Z", line = 131)
    public static final boolean method1628(boolean arg0, class297 arg1) {
        field3524++;
        if (arg1 == null) {
            return false;
        } else if (arg1.field4300) {
            if (!arg0) {
                field3529 = -115;
            }
            if (!arg1.method2008(arg0)) {
                return false;
            } else if (class180.field2543.method1373((long) arg1.field4319, 121) == null) {
                return class408.field5788.method1373((long) arg1.field4287, 120) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLtj;IIIZI)V", line = 160)
    public static final void method1629(byte arg0, class108 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class20.field269 = arg1;
        int var7 = -106 % ((arg0 + 68) / 49);
        class200.field2854 = arg6;
        field3525++;
        class316.field4635 = arg3;
        class439.field6279 = 1;
        class444.field6343 = arg2;
        class85.field1094 = arg4;
        class189.field2706 = arg5;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)[B", line = 180)
    public static final byte[] method1630(byte arg0, int arg1) {
        if (arg0 != -12) {
            field3528 = -79;
        }
        field3526++;
        class196 var2 = (class196) class411.field5890.method1972((long) arg1, arg0 ^ 0xFFFFFFF4);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class445.method2775(var4, 31178, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class196(var3);
            class411.field5890.method1975(var2, (long) arg1, false);
        }
        return var2.field2812;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLsp;)Ljava/lang/String;", line = 230)
    public static final String method1631(byte arg0, class382 arg1) {
        field3523++;
        if (arg0 == 28) {
            return arg1.field5418 == null || arg1.field5418.length() <= 0 ? arg1.field5425 : arg1.field5425 + client.field2331.method2284((byte) 109, class309.field4497) + arg1.field5418;
        } else {
            return null;
        }
    }
}
