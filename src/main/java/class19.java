import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class19 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[Lqs;")
    public static class491[] field284 = new class491[50];

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[[S")
    public static short[][] field287;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIB)I", line = 7)
    public static final int method143(int arg0, int arg1, byte arg2) {
        field289++;
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (arg2 != 15) {
            return 68;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 28)
    public static final void method144(int arg0) {
        class486.field7134.method2077(8);
        field286++;
        int var1 = class486.field7134.method2084((byte) -118, 8);
        if (var1 < class25.field411) {
            for (int var2 = var1; var2 < class25.field411; var2++) {
                class189.field2654[class32.field486++] = class259.field3609[var2];
            }
        }
        if (var1 > class25.field411) {
            throw new RuntimeException("gnpov1");
        }
        class25.field411 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class259.field3609[var3];
            class194 var5 = class151.field2174[var4];
            int var6 = class486.field7134.method2084((byte) -118, 1);
            if (var6 == 0) {
                class259.field3609[class25.field411++] = var4;
                var5.field5330 = class405.field6116;
            } else {
                int var7 = class486.field7134.method2084((byte) -118, 2);
                if (var7 == 0) {
                    class259.field3609[class25.field411++] = var4;
                    var5.field5330 = class405.field6116;
                    class35.field578[class209.field2966++] = var4;
                } else if (var7 == 1) {
                    class259.field3609[class25.field411++] = var4;
                    var5.field5330 = class405.field6116;
                    int var8 = class486.field7134.method2084((byte) -118, 3);
                    var5.method1369(var8, 1, 1);
                    int var9 = class486.field7134.method2084((byte) -118, 1);
                    if (var9 == 1) {
                        class35.field578[class209.field2966++] = var4;
                    }
                } else if (var7 == 2) {
                    class259.field3609[class25.field411++] = var4;
                    var5.field5330 = class405.field6116;
                    if (class486.field7134.method2084((byte) -118, 1) == 1) {
                        int var11 = class486.field7134.method2084((byte) -118, 3);
                        var5.method1369(var11, arg0, 2);
                        int var12 = class486.field7134.method2084((byte) -118, 3);
                        var5.method1369(var12, 1, 2);
                    } else {
                        int var10 = class486.field7134.method2084((byte) -118, 3);
                        var5.method1369(var10, arg0, 0);
                    }
                    int var13 = class486.field7134.method2084((byte) -118, 1);
                    if (var13 == 1) {
                        class35.field578[class209.field2966++] = var4;
                    }
                } else if (var7 == 3) {
                    class189.field2654[class32.field486++] = var4;
                }
            }
        }
        if (arg0 != 1) {
            field284 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 139)
    public static void method145(int arg0) {
        if (arg0 != 50) {
            field284 = null;
        }
        field287 = null;
        field284 = null;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 153)
    public static final void method146(int arg0) {
        field285++;
        if (class81.field1092 != null) {
            class81.field1092.method2994(-1);
            class81.field1092 = null;
        }
        class220.method1494((byte) -128);
        class56.method378();
        for (int var1 = arg0; var1 < 4; var1++) {
            class444.field6605[var1].method2322(-29126);
        }
        class530.method3131(false, arg0 + 64);
        System.gc();
        class13.method114(2, 15);
        class165.field2412 = false;
        class102.field1459 = -1;
        class244.method1626(true, ~arg0);
        class77.field1036 = 0;
        class51.field683 = 0;
        class10.field163 = 0;
        class437.field6477 = 0;
        class82.field1105 = 0;
        for (int var2 = 0; var2 < class463.field6771.length; var2++) {
            class463.field6771[var2] = null;
        }
        class59.method398((byte) 122);
        for (int var3 = 0; var3 < 2048; var3++) {
            class439.field6539[var3] = null;
        }
        class25.field411 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class151.field2174[var4] = null;
        }
        class392.field5964.method937(0);
        class326.method2107(-6);
        class427.field6353 = 0;
        class36.field583.method1185(-17100);
        class332.method2141((byte) 3);
        class511.method3046(arg0);
        class152.method995(true, (byte) -94);
        try {
            class131.method841(class419.field6254.field6861, -14144, "loggedout");
        } catch (Throwable var5) {
        }
        class295.field4365 = null;
        class381.field5814 = 0L;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Luf;", line = 226)
    public static final class349 method147(int arg0, int arg1) {
        field288++;
        if (class164.field2394 && class198.field2799 <= arg1 && arg1 <= class428.field6361) {
            return arg0 == -24048 ? class428.field6363[arg1 - class198.field2799] : null;
        } else {
            return null;
        }
    }
}
