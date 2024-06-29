import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class61 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field997 = "cyan:";

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
    public static int[] field1002 = new int[14];

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1000 = "white:";

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
    public static final void method435(int arg0, int arg1) {
        class134 var2 = class288.field4563[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class134 var4 = class288.field4563[var3][arg0][arg1] = class288.field4563[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2138--;
                for (int var5 = 0; var5 < var4.field2151; var5++) {
                    class289 var6 = var4.field2153[var5];
                    if ((var6.field4574 >> 29 & 0x3L) == 2L && var6.field4567 == arg0 && var6.field4575 == arg1) {
                        var6.field4569--;
                    }
                }
            }
        }
        if (class288.field4563[0][arg0][arg1] == null) {
            class288.field4563[0][arg0][arg1] = new class134(0, arg0, arg1);
        }
        class288.field4563[0][arg0][arg1].field2152 = var2;
        class288.field4563[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method436(int arg0) {
        field1000 = null;
        field997 = null;
        field1002 = null;
        if (arg0 != 32450) {
            field1000 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method437(int arg0, String arg1) {
        field1001++;
        if (arg0 != 8346) {
            return null;
        }
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class258.method1761(var6, arg0 - 8429);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method438(String arg0, int arg1, int arg2) {
        field998++;
        boolean var3 = false;
        String var4 = class121.method875(false, class184.method1248(64, arg0));
        for (int var5 = arg2; var5 < class155.field2514; var5++) {
            class33 var6 = class35.field548[class57.field973[var5]];
            if (var6 != null && var6.field525 != null && var6.field525.equalsIgnoreCase(var4)) {
                var3 = true;
                class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 1, var6.field3321[0], 1, 2, 0, 11027, 0, 0, false, var6.field3340[0]);
                if (arg1 == 1) {
                    class19.field321++;
                    class68.field1113.method534((byte) -128, 96);
                    class68.field1113.method1559((byte) 118, class57.field973[var5]);
                } else if (arg1 == 4) {
                    class68.field1113.method534((byte) -120, 43);
                    class170.field2699++;
                    class68.field1113.method1559((byte) 118, class57.field973[var5]);
                } else if (arg1 == 5) {
                    class68.field1113.method534((byte) -123, 60);
                    class68.field1113.method1547(class57.field973[var5], (byte) 58);
                    class13.field238++;
                } else if (arg1 == 6) {
                    class68.field1113.method534((byte) 121, 247);
                    class68.field1113.method1547(class57.field973[var5], (byte) 58);
                    class100.field1650++;
                } else if (arg1 == 7) {
                    class54.field922++;
                    class68.field1113.method534((byte) 34, 189);
                    class68.field1113.method1554(class57.field973[var5], (byte) 89);
                }
                break;
            }
        }
        if (!var3) {
            class226.method1588("", 0, (byte) -13, class288.field4562 + var4);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)C")
    public static final char method439(int arg0, byte arg1) {
        field999++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        int var3 = 71 % ((arg0 + 37) / 50);
        if (var2 >= 128 && var2 < 160) {
            char var4 = class40.field748[var2 - 128];
            if (var4 == '\u0000') {
                throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
            }
            var2 = var4;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJ)V")
    public static final void method440(int arg0, long arg1) {
        field1003++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class239.field3875 < 100 || class95.field1560) || class239.field3875 >= 200) {
            class226.method1588("", 0, (byte) -70, class115.field1922);
            return;
        }
        String var3 = class118.method862(true, arg1);
        if (arg0 != -9935) {
            method437(-28, (String) null);
        }
        for (int var4 = 0; var4 < class239.field3875; var4++) {
            if (class60.field992[var4] == arg1) {
                class226.method1588("", 0, (byte) -81, var3 + class154.field2494);
                return;
            }
        }
        for (int var5 = 0; var5 < class185.field2910; var5++) {
            if (class183.field2884[var5] == arg1) {
                class226.method1588("", 0, (byte) -110, class108.field1784 + var3 + class34.field538);
                return;
            }
        }
        if (var3.equals(class167.field2655.field525)) {
            class226.method1588("", 0, (byte) -99, class183.field2870);
            return;
        }
        class76.field1226++;
        class86.field1379[class239.field3875] = var3;
        class60.field992[class239.field3875] = arg1;
        class141.field2288[class239.field3875] = 0;
        class239.field3878[class239.field3875] = "";
        class137.field2263[class239.field3875] = 0;
        class197.field3132[class239.field3875] = false;
        class239.field3875++;
        class99.field1633 = class66.field1094;
        class68.field1113.method534((byte) 109, 136);
        class68.field1113.method1502((byte) -19, arg1);
    }
}
