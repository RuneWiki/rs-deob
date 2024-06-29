import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class23 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Lbe;")
    private static class283 field343 = class153.method941(125, "glow3:");

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field345 = 2;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Lbe;")
    public static class283 field351 = class153.method941(-123, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Lbe;")
    public static class283 field352 = field343;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Lbe;")
    public static class283 field346 = field343;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field349 = 0;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lbe;")
    public static class283 field353 = class153.method941(-16, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "J")
    public static long field356 = 0L;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Lnh;")
    public static class107 field354;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V", line = 7)
    public static final void method167(int arg0, int arg1) {
        field355++;
        if (arg1 == -1 && !class306.field5263) {
            class170.method1083(238);
        } else if (arg1 != -1 && (class232.field3936 != arg1 || !class50.method291(2)) && class118.field1990 != 0 && !class306.field5263) {
            class281.method1886(0, class109.field1843, 2, -93, false, class118.field1990, arg1);
        }
        class232.field3936 = arg1;
        if (arg0 > -111) {
            method168(-85, -9L);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IJ)V", line = 31)
    public static final void method168(int arg0, long arg1) {
        field347++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class103.field1748 < 100 || class217.field3682 == 1) || class103.field1748 >= 200) {
            class60.method394(0, class172.field2898, class213.field3616, (byte) 58);
            return;
        }
        class283 var3 = class232.method1567(arg1, 127).method1901(arg0 ^ 0xFFF);
        for (int var4 = 0; var4 < class103.field1748; var4++) {
            if (class160.field2622[var4] == arg1) {
                class60.method394(0, class299.method2022(new class283[] { var3, class154.field2527 }, (byte) 8), class213.field3616, (byte) 85);
                return;
            }
        }
        for (int var5 = 0; var5 < class195.field3330; var5++) {
            if (class110.field1854[var5] == arg1) {
                class60.method394(0, class299.method2022(new class283[] { class216.field3664, var3, class269.field4536 }, (byte) 54), class213.field3616, (byte) 93);
                return;
            }
        }
        if (var3.method1926(arg0 ^ 0xFFFFBF14, class213.field3624.field3274)) {
            class60.method394(0, class6.field65, class213.field3616, (byte) 28);
            return;
        }
        class305.field5207++;
        class143.field2372[class103.field1748] = var3;
        class160.field2622[class103.field1748] = arg1;
        class194.field3321[class103.field1748] = 0;
        class16.field190[class103.field1748] = class213.field3616;
        class42.field586[class103.field1748] = arg0;
        class245.field4166[class103.field1748] = false;
        class103.field1748++;
        class141.field2359 = class252.field4284;
        class228.field3831.method621(176, arg0 ^ 0x8);
        class228.field3831.method1544((byte) 8, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZB)V", line = 136)
    public static final void method169(boolean arg0, byte arg1) {
        if ((class213.field3624.field1193 >> 7) == class88.field1496 && (class213.field3624.field1210 >> 7) == class175.field3021) {
            class88.field1496 = 0;
        }
        field348++;
        int var2 = class297.field5033;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class191 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class213.field3624;
            } else {
                var4 = (long) class162.field2666[var3] << 32;
                var6 = class149.field2436[class162.field2666[var3]];
            }
            if (var6 != null && var6.method395(true)) {
                int var7 = var6.field1193 >> 7;
                var6.field3255 = false;
                if ((class178.field3068 && class297.field5033 > 200 || class297.field5033 > 50) && !arg0 && var6.field1219 == var6.field1203) {
                    var6.field3255 = true;
                }
                int var8 = var6.field1210 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field3261 == null || class75.field1309 < var6.field3276 || var6.field3264 <= class75.field1309) {
                        if (var6.method460((byte) 119) == 1 && (var6.field1193 & 0x7F) == 64 && (var6.field1210 & 0x7F) == 64) {
                            if (class34.field510[var7][var8] == class309.field5285) {
                                continue;
                            }
                            class34.field510[var7][var8] = class309.field5285;
                        }
                        var6.field1180 = class42.method254(class61.field850, var6.field1210, var6.field1193, arg1 ^ 0xFFFFB0A5);
                        class81.method532(class61.field850, var6.field1193, var6.field1210, var6.field1180, (var6.method460((byte) 112) - 1) * 64 + 60, var6, var6.field1160, var4, var6.field1176);
                    } else {
                        var6.field3255 = false;
                        var6.field1180 = class42.method254(class61.field850, var6.field1210, var6.field1193, -20341);
                        class246.method1676(class61.field850, var6.field1193, var6.field1210, var6.field1180, var6, var6.field1160, var4, var6.field3284, var6.field3275, var6.field3278, var6.field3260);
                    }
                }
            }
        }
        if (arg1 != 46) {
            field350 = 15;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 237)
    public static void method170(int arg0) {
        field351 = null;
        field353 = null;
        field343 = null;
        field352 = null;
        if (arg0 >= -22) {
            method170(77);
        }
        field354 = null;
        field346 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)I")
    public abstract int method51(byte arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method53(int arg0, Component arg1);

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method52(int arg0, Component arg1);
}
