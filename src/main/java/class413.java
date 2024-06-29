import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class413 extends class427 {

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 7)
    public static final void method2552(int arg0) {
        field5674++;
        if (class450.method2786(-103) != 2) {
            return;
        }
        byte var1 = (byte) (class302.field4057 - 4 & 0xFF);
        int var2 = class302.field4057 % class22.field232;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class196.field2329; var16++) {
                class183.field2126[var3][var2][var16] = var1;
            }
        }
        if (class43.field513 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class17.field188[var4] = -1000000;
            class416.field5691[var4] = 1000000;
            class336.field4584[var4] = 0;
            class440.field6074[var4] = 1000000;
            class186.field2160[var4] = 0;
        }
        if (arg0 != -12386) {
            field5677 = 76;
        }
        if (class320.field4294 != 1) {
            int var15 = class189.method1170(class80.field979, class287.field3784, true, class43.field513);
            if (var15 - class51.field587 >= 800 || (class222.field2770[class43.field513][class287.field3784 >> 7][class80.field979 >> 7] & 0x4) == 0) {
                return;
            }
            class444.method2748((byte) 113, class287.field3784 >> 7, 1, class80.field979 >> 7, false, class347.field4722);
            return;
        }
        if ((class222.field2770[class43.field513][class143.field1684.field1516 >> 7][class143.field1684.field1514 >> 7] & 0x4) != 0) {
            class444.method2748((byte) -59, class143.field1684.field1516 >> 7, 0, class143.field1684.field1514 >> 7, false, class347.field4722);
        }
        if (class178.field2081 >= 2560) {
            return;
        }
        int var5 = class287.field3784 >> 7;
        int var6 = class80.field979 >> 7;
        int var7 = class143.field1684.field1516 >> 7;
        int var8 = class143.field1684.field1514 >> 7;
        int var9;
        if (var5 < var7) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var8 > var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && var9 > -class22.field232 && var9 < class22.field232 && var10 > (-class196.field2329) && var10 < class196.field2329) {
            if (var9 <= var10) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class222.field2770[class43.field513][var5][var6] & 0x4) != 0) {
                        class444.method2748((byte) -56, var5, 1, var6, false, class347.field4722);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var5 < var7) {
                            var5++;
                        } else if (var5 > var7) {
                            var5--;
                        }
                        var12 -= 65536;
                        if ((class222.field2770[class43.field513][var5][var6] & 0x4) != 0) {
                            class444.method2748((byte) -123, var5, 1, var6, false, class347.field4722);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var7 > var5) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                if ((class222.field2770[class43.field513][var5][var6] & 0x4) != 0) {
                    class444.method2748((byte) -53, var5, 1, var6, false, class347.field4722);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class222.field2770[class43.field513][var5][var6] & 0x4) != 0) {
                        class444.method2748((byte) 53, var5, 1, var6, false, class347.field4722);
                        return;
                    }
                }
            }
            return;
        }
        class402.method2510("RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class278.field3608 + "," + class129.field1432, (Throwable) null, -29832);
        return;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lwo;B)I", line = 206)
    public static final int method2553(class285 arg0, byte arg1) {
        field5675++;
        int var2 = 11 % ((30 - arg1) / 57);
        int var3 = 0;
        if (arg0.method1797(0, class259.field3346)) {
            var3++;
        }
        if (arg0.method1797(0, class150.field1749)) {
            var3++;
        }
        if (arg0.method1797(0, class103.field1209)) {
            var3++;
        }
        if (arg0.method1797(0, class241.field3164)) {
            var3++;
        }
        if (arg0.method1797(0, class364.field4954)) {
            var3++;
        }
        if (arg0.method1797(0, field5677)) {
            var3++;
        }
        if (arg0.method1797(0, class39.field459)) {
            var3++;
        }
        if (arg0.method1797(0, class31.field336)) {
            var3++;
        }
        if (arg0.method1797(0, class316.field4257)) {
            var3++;
        }
        if (arg0.method1797(0, class229.field2892)) {
            var3++;
        }
        if (arg0.method1797(0, class432.field5902)) {
            var3++;
        }
        if (arg0.method1797(0, class388.field5298)) {
            var3++;
        }
        if (arg0.method1797(0, class150.field1751)) {
            var3++;
        }
        if (arg0.method1797(0, class390.field5309)) {
            var3++;
        }
        if (arg0.method1797(0, class191.field2249)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V", line = 270)
    public static final void method2554(byte arg0) {
        field5676++;
        class365 var1 = class187.field2165;
        synchronized (class187.field2165) {
            class187.field2165.method2290(13831);
        }
        class365 var2 = class383.field5247;
        synchronized (class383.field5247) {
            class383.field5247.method2290(13831);
        }
        if (arg0 >= -64) {
            field5677 = -122;
        }
        class158 var3 = class450.field6285;
        synchronized (class450.field6285) {
            class450.field6285.method1016((byte) -45);
        }
    }
}
