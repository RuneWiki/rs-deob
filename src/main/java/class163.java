import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class163 extends RuntimeException {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Ljava/lang/String;")
    public String field2643;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2649;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field2650 = 0;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lje;")
    public static class188 field2646;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lvb;")
    public static class61 field2644;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[[[B")
    public static byte[][][] field2647;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1208(int arg0, String arg1, int arg2) {
        field2648++;
        String var3 = class34.method257(class10.method79(95, arg1), 15578);
        boolean var4 = false;
        for (int var5 = 0; var5 < class121.field1772; var5++) {
            class29 var6 = class92.field1374[class207.field3326[var5]];
            if (var6 != null && var6.field344 != null && var6.field344.equalsIgnoreCase(var3)) {
                if (arg0 == 1) {
                    class220.field3532.method557(150, 8);
                    class128.field1884++;
                    class220.field3532.method1122(false, 0);
                    class220.field3532.method1084((byte) 99, class207.field3326[var5]);
                } else if (arg0 == 4) {
                    class220.field3532.method557(180, 8);
                    class220.field3532.method1087(arg2 - 1228603123, class207.field3326[var5]);
                    class267.field4311++;
                    class220.field3532.method1123(arg2 ^ 0xFFFFD634, 0);
                } else if (arg0 == 5) {
                    class220.field3532.method557(207, 8);
                    class189.field3053++;
                    class220.field3532.method1122(false, 0);
                    class220.field3532.method1084((byte) 86, class207.field3326[var5]);
                } else if (arg0 == 6) {
                    class220.field3532.method557(43, 8);
                    class180.field2897++;
                    class220.field3532.method1108(class207.field3326[var5], (byte) -78);
                    class220.field3532.method1123(arg2 - 21996, 0);
                } else if (arg0 == 7) {
                    class191.field3082++;
                    class220.field3532.method557(60, arg2 ^ 0x1713);
                    class220.field3532.method1087(-1228597208, class207.field3326[var5]);
                    class220.field3532.method1122(false, 0);
                }
                var4 = true;
                break;
            }
        }
        if (arg2 != 5915) {
            method1210((byte) -32, -123);
        }
        if (!var4) {
            class172.method1276(0, "", (byte) 40, class136.field2226 + var3);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method1209(int arg0) {
        field2644 = null;
        if (arg0 != -31861) {
            field2647 = null;
        }
        field2646 = null;
        field2647 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V")
    public static final void method1210(byte arg0, int arg1) {
        field2645++;
        class57.field812.method1548(arg1, 0);
        if (arg0 == -87) {
            class264.field4282.method1548(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class163(Throwable arg0, String arg1) {
        this.field2643 = arg1;
        this.field2649 = arg0;
    }
}
