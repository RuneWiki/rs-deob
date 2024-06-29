import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class16 extends class130 {

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field169 = 20;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[I")
    public static int[] field173 = new int[8];

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lpu;")
    public static class179 field170 = new class179("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZ)V")
    public static final void method93(boolean arg0, boolean arg1) {
        field167++;
        while (class424.field6231.method2669(class429.field6369, true) >= 15) {
            int var2 = class424.field6231.method2671(-126, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class5 var4 = (class5) class366.field5398.method358((byte) 43, (long) var2);
            if (var4 == null) {
                class46 var5 = new class46();
                var5.field7562 = var2;
                var4 = new class5(var5);
                class366.field5398.method357(var4, 1, (long) var2);
                var3 = true;
                class166.field2507[class412.field6081++] = var4;
            }
            class46 var6 = var4.field65;
            class234.field3513[class231.field3482++] = var2;
            var6.field7610 = class446.field6625;
            if (var6.field718 != null && var6.field718.method1219(arg0)) {
                class150.method1078(var6, true);
            }
            int var7 = class424.field6231.method2671(-122, 1);
            int var8 = class424.field6231.method2671(-122, 2);
            int var9 = class424.field6231.method2671(-127, 1);
            if (var9 == 1) {
                class471.field6917[class20.field220++] = var2;
            }
            int var10 = class424.field6231.method2671(-122, 3) + 4 << 11 & 0x3D52;
            var6.method315(32841, class462.field6842.method1229(-21382, class424.field6231.method2671(-120, 14)));
            int var11;
            if (arg1) {
                var11 = class424.field6231.method2671(-112, 8);
                if (var11 > 127) {
                    var11 -= 256;
                }
            } else {
                var11 = class424.field6231.method2671(-124, 5);
                if (var11 > 15) {
                    var11 -= 32;
                }
            }
            int var12;
            if (arg1) {
                var12 = class424.field6231.method2671(-116, 8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            } else {
                var12 = class424.field6231.method2671(-124, 5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            }
            var6.method3095((byte) -88, var6.field718.field2594);
            var6.field7572 = var6.field718.field2588 << 3;
            if (var3) {
                var6.method3100(0, var10, true);
            }
            var6.method306(var8, class116.field1781.field7653[0] + var11, -9, var6.method3045(0), var7 == 1, class116.field1781.field7654[0] + var12);
            if (var6.field718.method1219(arg0)) {
                class200.method1413(var6, var6.field7654[0], null, var6.field1274, (byte) 121, null, var6.field7653[0], 0);
            }
        }
        if (!arg0) {
            method95(-19);
        }
        class424.field6231.method2673((byte) 112);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLwl;)I")
    public static final int method94(byte arg0, class521 arg1) {
        field171++;
        int var2 = -10 % ((arg0 - 32) / 53);
        if (arg1.field7572 == 0) {
            return 0;
        }
        if (arg1.field7624 != -1) {
            class521 var3 = null;
            if (arg1.field7624 < 32768) {
                class5 var4 = (class5) class366.field5398.method358((byte) -125, (long) arg1.field7624);
                if (var4 != null) {
                    var3 = var4.field65;
                }
            } else if (arg1.field7624 >= 32768) {
                var3 = class530.field7747[arg1.field7624 - 32768];
            }
            if (var3 != null) {
                int var5 = arg1.field1275 - var3.field1275;
                int var6 = arg1.field1279 - var3.field1279;
                if (var5 != 0 || var6 != 0) {
                    arg1.method3104(-86, (int) (Math.atan2((double) var5, (double) var6) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg1 instanceof class511) {
            class511 var7 = (class511) arg1;
            if (var7.field7453 != -1 && (var7.field7658 == 0 || var7.field7655 > 0)) {
                var7.method3104(-81, var7.field7453);
                var7.field7453 = -1;
            }
        } else if (arg1 instanceof class46) {
            class46 var8 = (class46) arg1;
            if (var8.field707 != -1 && (var8.field7658 == 0 || var8.field7655 > 0)) {
                int var9 = var8.field1275 - ((var8.field707 - class422.field6201 - class422.field6201) * 64);
                int var10 = var8.field1279 - (var8.field723 - class23.field273 - class23.field273) * 64;
                if (var9 != 0 || var10 != 0) {
                    var8.method3104(116, (int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF);
                }
                var8.field707 = -1;
            }
        }
        return arg1.method3103(-10698);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method95(int arg0) {
        field173 = null;
        field170 = null;
        if (arg0 != 256) {
            field166 = -68;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(II)V")
    public class16(int arg0, int arg1) {
        this.field168 = arg1;
        this.field174 = arg0;
    }
}
