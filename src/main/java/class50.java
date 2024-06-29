import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class50 extends class72 {

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
    public int field1124 = 0;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "Lae;")
    public static class6 field1109 = class64.method474(109, "Versteckt");

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field1116 = 0;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field1120 = 3353893;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "Lae;")
    private static class6 field1121 = class64.method474(110, "Your account is already logged in)3");

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "Lae;")
    private static class6 field1115 = class64.method474(127, "This computers address has been blocked");

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "Lae;")
    private static class6 field1122 = class64.method474(123, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "Lae;")
    public static class6 field1125 = field1121;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "Lae;")
    public static class6 field1123 = field1115;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "Lae;")
    private static class6 field1111 = class64.method474(114, "Prepared visibility map");

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "Lae;")
    public static class6 field1110 = field1122;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "Lae;")
    public static class6 field1119 = field1111;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "Z")
    public static boolean field1128 = false;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "Lbf;")
    public static class14 field1118;

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "Lbf;")
    public static class14 field1127;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field1129;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method403(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 14)
    public static final void method397(byte arg0) {
        if (arg0 > -121) {
            return;
        }
        field1117++;
        if (class89.field2140 != 1) {
            return;
        }
        if (class52.field1170 >= 6 && class52.field1170 <= 106 && class116.field2728 >= 467 && class116.field2728 <= 499) {
            class41.field940++;
            class116.field2725 = (class116.field2725 + 1) % 4;
            class20.field427 = true;
            class76.field1724 = true;
            class111.field2660.method938((byte) 63, 76);
            class111.field2660.method641((byte) -28, class116.field2725);
            class111.field2660.method641((byte) -28, class15.field304);
            class111.field2660.method641((byte) -28, class12.field244);
        }
        if (class52.field1170 >= 135 && class52.field1170 <= 235 && class116.field2728 >= 467 && class116.field2728 <= 499) {
            class41.field940++;
            class15.field304 = (class15.field304 + 1) % 3;
            class76.field1724 = true;
            class20.field427 = true;
            class111.field2660.method938((byte) 63, 76);
            class111.field2660.method641((byte) -28, class116.field2725);
            class111.field2660.method641((byte) -28, class15.field304);
            class111.field2660.method641((byte) -28, class12.field244);
        }
        if (class52.field1170 >= 273 && class52.field1170 <= 373 && class116.field2728 >= 467 && class116.field2728 <= 499) {
            class76.field1724 = true;
            class12.field244 = (class12.field244 + 1) % 3;
            class41.field940++;
            class20.field427 = true;
            class111.field2660.method938((byte) 63, 76);
            class111.field2660.method641((byte) -28, class116.field2725);
            class111.field2660.method641((byte) -28, class15.field304);
            class111.field2660.method641((byte) -28, class12.field244);
        }
        if (class52.field1170 < 412 || class52.field1170 > 512 || class116.field2728 < 467 || class116.field2728 > 499) {
            return;
        }
        if (class103.field2449 == -1) {
            class108.method911(31121);
            if (class91.field2174 != -1) {
                class125.field3046 = false;
                class43.field968 = class103.field2449 = class91.field2174;
                class133.field3260 = class133.field3262;
                return;
            }
        } else {
            class73.method575(class133.field3262, class59.field1304, false, 0);
        }
        return;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLm;I)V", line = 98)
    private final void method398(byte arg0, class77 arg1, int arg2) {
        if (arg0 >= 9) {
            if (arg2 == 2) {
                this.field1124 = arg1.method636(97);
            }
            field1112++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V", line = 118)
    public static void method399(int arg0) {
        field1109 = null;
        field1121 = null;
        field1125 = null;
        if (arg0 != 1000) {
            field1119 = null;
        }
        field1123 = null;
        field1122 = null;
        field1119 = null;
        field1118 = null;
        field1111 = null;
        field1127 = null;
        field1115 = null;
        field1110 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lm;B)V", line = 140)
    public final void method400(class77 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method620((byte) -8);
            if (var3 == 0) {
                int var4 = 111 / ((arg1 + 88) / 34);
                field1113++;
                return;
            }
            this.method398((byte) 31, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V", line = 169)
    public static final void method401(int arg0) {
        field1126++;
        if (class27.field681 == null) {
            return;
        }
        long var1 = class5.method22(24);
        if (class118.field2812 >= var1) {
            return;
        }
        class27.field681.method186(var1);
        int var3 = (int) (var1 - class118.field2812);
        if (arg0 != 6) {
            field1111 = null;
        }
        class118.field2812 = var1;
        synchronized (field1129 == null ? (field1129 = method403("cd")) : field1129) {
            class126.field3082 += class24.field603 * var3;
            int var5 = (class126.field3082 - class24.field603 * 2000) / 1000;
            if (var5 > 0) {
                if (class38.field856 != null) {
                    class38.field856.method15(var5);
                }
                class126.field3082 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)Lkc;", line = 208)
    public static final class64 method402(int arg0, byte arg1) {
        field1114++;
        class64 var2 = (class64) class5.field68.method128((byte) -72, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class30.field730.method160(30605, 1, arg0);
        class64 var4 = new class64();
        if (var3 != null) {
            var4.method471(arg0, (byte) 90, new class77(var3));
        }
        if (arg1 < 39) {
            return null;
        } else {
            var4.method476(-84);
            class5.field68.method130(var4, (long) arg0, (byte) -112);
            return var4;
        }
    }
}
