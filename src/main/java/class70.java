import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class70 implements Runnable {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Z")
    public boolean field1115 = true;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field1120 = new Object();

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
    public int[] field1121 = new int[500];

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public int field1122 = 0;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "[I")
    public int[] field1123 = new int[500];

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lsc;")
    public static class181 field1119 = class149.method967(255, ":assistreq:");

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lsc;")
    private static class181 field1116 = class149.method967(255, "Select a world");

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lsc;")
    public static class181 field1124 = field1116;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljd;")
    public static class265 field1113 = new class265(64);

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "[[[B")
    public static byte[][][] field1129 = new byte[4][104][104];

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field1128 = 0;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field1131 = 0;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lsc;")
    public static class181 field1125 = class149.method967(255, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "[Ltg;")
    public static class107[] field1130;

    @OriginalMember(owner = "client!ve", name = "run", descriptor = "()V")
    public final void run() {
        field1117++;
        while (this.field1115) {
            Object var1 = this.field1120;
            synchronized (this.field1120) {
                if (this.field1122 < 500) {
                    this.field1121[this.field1122] = class79.field1279;
                    this.field1123[this.field1122] = class183.field3215;
                    this.field1122++;
                }
            }
            class95.method632(true, 50L);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method486(byte arg0) {
        field1129 = null;
        field1119 = null;
        field1116 = null;
        if (arg0 != 3) {
            field1113 = null;
        }
        field1124 = null;
        field1125 = null;
        field1113 = null;
        field1130 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
    public static final int method487(int arg0, int arg1) {
        if (arg1 != 21563) {
            field1126 = 69;
        }
        field1118++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public static final void method488(byte arg0) {
        field1114++;
        class218.method1453((byte) -92, class244.field4229);
        class38.field582++;
        if (class190.field3356 && class170.field2863) {
            int var1 = class79.field1279;
            int var2 = var1 - class98.field1587;
            if (var2 < class110.field1803) {
                var2 = class110.field1803;
            }
            if (class244.field4229.field3057 + var2 > class110.field1803 + class242.field4213.field3057) {
                var2 = class242.field4213.field3057 + class110.field1803 - class244.field4229.field3057;
            }
            int var3 = class183.field3215;
            int var4 = var2 - class75.field1200;
            int var5 = var3 - class239.field4150;
            if (var5 < class258.field4505) {
                var5 = class258.field4505;
            }
            int var6 = class242.field4213.field3014 + var2 - class110.field1803;
            int var7 = class244.field4229.field3043;
            if (class258.field4505 + class242.field4213.field3041 < class244.field4229.field3041 + var5) {
                var5 = class258.field4505 + class242.field4213.field3041 - class244.field4229.field3041;
            }
            int var8 = var5 - class215.field3696;
            int var9 = class242.field4213.field2946 + var5 - class258.field4505;
            if (class244.field4229.field2949 < class38.field582 && (var7 < var4 || var4 < -var7 || var8 > var7 || var8 < (-var7))) {
                class94.field1499 = true;
            }
            if (class244.field4229.field2928 != null && class94.field1499) {
                class94 var10 = new class94();
                var10.field1496 = var9;
                var10.field1488 = class244.field4229;
                var10.field1489 = class244.field4229.field2928;
                var10.field1500 = var6;
                class27.method225(var10, (byte) 120);
            }
            if (class39.field599 == 0) {
                if (class94.field1499) {
                    if (class244.field4229.field3009 != null) {
                        class94 var11 = new class94();
                        var11.field1500 = var6;
                        var11.field1486 = class85.field1361;
                        var11.field1488 = class244.field4229;
                        var11.field1489 = class244.field4229.field3009;
                        var11.field1496 = var9;
                        class27.method225(var11, (byte) 120);
                    }
                    if (class85.field1361 != null && client.method1062(class244.field4229) != null) {
                        class108.field1777++;
                        class141.field2275.method541(144, -84);
                        class141.field2275.method1522(class244.field4229.field2987, true);
                        class141.field2275.method1505((byte) -88, class85.field1361.field2987);
                        class141.field2275.method1559(class85.field1361.field2934, 0);
                        class141.field2275.method1559(class244.field4229.field2934, 0);
                    }
                } else if (!(class238.field4133 != 1 && !class136.method876(2000, class131.field2177 - 1) || class131.field2177 <= 2) || class94.field1492 == 1) {
                    class169.method1122(118);
                } else if (class131.field2177 > 0 || class94.field1492 == 2) {
                    class230.method1533(class131.field2177 - 1, 1);
                }
                class244.field4229 = null;
            }
            if (arg0 > -12) {
                method488((byte) -6);
            }
        } else if (class38.field582 > 1) {
            class244.field4229 = null;
        }
    }
}
