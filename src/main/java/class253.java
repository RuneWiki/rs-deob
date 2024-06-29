import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class253 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "[Llda;")
    public static class594[] field3439 = new class594[37];

    @OriginalMember(owner = "client!up", name = "c", descriptor = "Lut;")
    public static class719 field3440 = new class719();

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Luw;")
    public static class208 field3442 = new class208(92, 5);

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Z")
    public static boolean field3438;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 6)
    public static void method1642(byte arg0) {
        field3442 = null;
        if (arg0 != 76) {
            field3440 = null;
        }
        field3439 = null;
        field3440 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1643(int arg0) {
        field3441++;
        if (class485.field6252.field6954.method3616(false) != 2) {
            return;
        }
        byte var1 = (byte) (class495.field6333 - 4 & 0xFF);
        int var2 = class495.field6333 % class240.field3280;
        for (int var3 = arg0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class276.field3602; var18++) {
                class561.field7133[var3][var2][var18] = var1;
            }
        }
        if (class309.field3877 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class568.field7181[var4] = -1000000;
            class765.field10411[var4] = 1000000;
            class246.field3369[var4] = 0;
            class416.field5489[var4] = 1000000;
            class380.field4654[var4] = 0;
        }
        int var5 = class422.field5564.field2896;
        int var6 = class422.field5564.field2900;
        if (class507.field6476 != 1 && class524.field6672 == -1) {
            int var7 = class512.method2831(class309.field3877, (byte) 119, class97.field1309, class148.field1890);
            if ((var7 - class439.field5770) < 3200 && (class410.field5439[class309.field3877][class97.field1309 >> 9][class148.field1890 >> 9] & 0x4) != 0) {
                class463.method2601(class28.field252, false, class148.field1890 >> 9, class97.field1309 >> 9, 1, 113);
                return;
            }
            return;
        }
        if (class507.field6476 != 1) {
            var6 = class525.field6679;
            var5 = class524.field6672;
        }
        if ((class410.field5439[class309.field3877][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class463.method2601(class28.field252, false, var6 >> 9, var5 >> 9, 0, -115);
        }
        if (class463.field6022 >= 2560) {
            return;
        }
        int var8 = class97.field1309 >> 9;
        int var9 = class148.field1890 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var10 <= var8) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var11 > var9) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if (var12 == 0 && var13 == 0 || var12 <= (-class240.field3280) || class240.field3280 <= var12 || var13 <= -class276.field3602 || class276.field3602 <= var13) {
            class416.method2401(arg0 ^ 0x1, null, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class714.field9407 + "," + class240.field3293);
            return;
        }
        if (var13 < var12) {
            int var14 = var13 * 65536 / var12;
            int var15 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class410.field5439[class309.field3877][var8][var9] & 0x4) != 0) {
                    class463.method2601(class28.field252, false, var9, var8, 1, arg0 ^ 0x6B);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var9 < var11) {
                        var9++;
                    } else if (var9 > var11) {
                        var9--;
                    }
                    var15 -= 65536;
                    if ((class410.field5439[class309.field3877][var8][var9] & 0x4) != 0) {
                        class463.method2601(class28.field252, false, var9, var8, 1, -122);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var12 * 65536 / var13;
        int var17 = 32768;
        while (var9 != var11) {
            if (var11 > var9) {
                var9++;
            } else if (var9 > var11) {
                var9--;
            }
            if ((class410.field5439[class309.field3877][var8][var9] & 0x4) != 0) {
                class463.method2601(class28.field252, false, var9, var8, 1, 118);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                var17 -= 65536;
                if (var10 > var8) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class410.field5439[class309.field3877][var8][var9] & 0x4) != 0) {
                    class463.method2601(class28.field252, false, var9, var8, 1, 115);
                    return;
                }
            }
        }
    }
}
