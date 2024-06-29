import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class50 {

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lke;")
    public static class65 field1276 = class1.method17("Lade Eingabe)2Steuerungsprogramm)3)3)3", -119);

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static volatile int field1275 = 0;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lke;")
    public static class65 field1280 = class1.method17(" x", -121);

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lke;")
    private static class65 field1278 = class1.method17("Close", -116);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lke;")
    public static class65 field1270 = field1278;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lke;")
    private static class65 field1279 = class1.method17("Private chat", -116);

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lke;")
    public static class65 field1273 = class1.method17("Lade Spiel)2Fenster )2 ", -127);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lke;")
    public static class65 field1269 = class1.method17("Absender:", -111);

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static volatile int field1281 = 0;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lke;")
    public static class65 field1282 = field1279;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lke;")
    private static class65 field1284 = class1.method17("Unable to connect)3", -119);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lke;")
    public static class65 field1268 = field1284;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lke;")
    public static class65 field1271 = field1284;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lke;")
    public static class65 field1267 = class1.method17("@yel@", -122);

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lqd;")
    public static class100 field1274 = new class100(30);

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Lke;")
    public static class65 field1285 = class1.method17("Missbrauch melden", -123);

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V", line = 53)
    public static final void method404(int arg0, int arg1, int arg2) {
        field1272++;
        if (arg0 != -14) {
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class78.field2084[var4] != null) {
                int var5 = class93.field2469 + 74 - var3 * 14;
                int var6 = class47.field1229[var4];
                if (var5 < -20) {
                    break;
                }
                if (var6 == 0) {
                    var3++;
                }
                class65 var7 = class48.field1256[var4];
                if (var7 != null && var7.method533(class53.field1371, false)) {
                    var7 = var7.method539(-27693, 5);
                }
                if (var7 != null && var7.method533(class19.field445, false)) {
                    var7 = var7.method539(arg0 - 27679, 5);
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || class6.field108 == 0 || class6.field108 == 1 && class41.method365(113, var7))) {
                    var3++;
                    if (var5 - 14 < arg1 && var5 >= arg1 && !var7.method564((byte) 44, class32.field833.field2866)) {
                        class41.field1082++;
                        class39.field1038++;
                        if (class89.field2374 >= 1) {
                            class97.method812(0, class80.field2137, -123, class21.method172(arg0 - 40, new class65[] { class90.field2380, var7 }), 31, 0, 0);
                            class131.field3171++;
                        }
                        class97.method812(0, class98.field2543, -126, class21.method172(-104, new class65[] { class90.field2380, var7 }), 4, 0, 0);
                        class97.method812(0, class57.field1531, arg0 - 112, class21.method172(arg0 + -76, new class65[] { class90.field2380, var7 }), 2, 0, 0);
                    }
                }
                if ((var6 == 3 || var6 == 7) && class44.field1165 == 0 && (var6 == 7 || class114.field2865 == 0 || class114.field2865 == 1 && class41.method365(116, var7))) {
                    var3++;
                    if (var5 - 14 < arg1 && var5 >= arg1) {
                        if (class89.field2374 >= 1) {
                            class97.method812(0, class80.field2137, arg0 - 114, class21.method172(-43, new class65[] { class90.field2380, var7 }), 31, 0, 0);
                            class131.field3171++;
                        }
                        class97.method812(0, class98.field2543, -118, class21.method172(-73, new class65[] { class90.field2380, var7 }), 4, 0, 0);
                        class39.field1038++;
                        class41.field1082++;
                        class97.method812(0, class57.field1531, -127, class21.method172(-111, new class65[] { class90.field2380, var7 }), 2, 0, 0);
                    }
                }
                if (var6 == 4 && (class93.field2442 == 0 || class93.field2442 == 1 && class41.method365(126, var7))) {
                    var3++;
                    if (var5 - 14 < arg1 && var5 >= arg1) {
                        class97.method812(0, class23.field570, -123, class21.method172(arg0 ^ 0x48, new class65[] { class90.field2380, var7 }), 54, 0, 0);
                        class99.field2581++;
                    }
                }
                if ((var6 == 5 || var6 == 6) && class44.field1165 == 0 && class114.field2865 < 2) {
                    var3++;
                }
                if (var6 == 8 && (class93.field2442 == 0 || class93.field2442 == 1 && class41.method365(126, var7))) {
                    var3++;
                    if (var5 - 14 < arg1 && arg1 <= var5) {
                        class46.field1199++;
                        class97.method812(0, class84.field2210, -124, class21.method172(arg0 - 23, new class65[] { class90.field2380, var7 }), 17, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 220)
    public static void method405(boolean arg0) {
        field1271 = null;
        field1276 = null;
        field1270 = null;
        field1282 = null;
        if (arg0) {
            field1275 = -93;
        }
        field1268 = null;
        field1284 = null;
        field1269 = null;
        field1267 = null;
        field1285 = null;
        field1273 = null;
        field1280 = null;
        field1278 = null;
        field1279 = null;
        field1274 = null;
    }
}
