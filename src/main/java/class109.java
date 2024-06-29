import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class109 extends class42 {

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "Lad;")
    public static class5 field2733 = class88.method674(" Sekunde(Xn(Y -Ubertragen)3", -83);

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field2727 = 0;

    @OriginalMember(owner = "client!sa", name = "tb", descriptor = "[I")
    public static int[] field2744 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "[I")
    public static int[] field2735 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!sa", name = "zb", descriptor = "Lad;")
    public static class5 field2750 = class88.method674("auf einer freien Welt zu spielen)3", -102);

    @OriginalMember(owner = "client!sa", name = "sb", descriptor = "I")
    public static int field2743 = 50;

    @OriginalMember(owner = "client!sa", name = "wb", descriptor = "Lad;")
    public static class5 field2747 = class88.method674("", -77);

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "Lad;")
    public static class5 field2734 = field2747;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "Lad;")
    public static class5 field2732 = field2747;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "Lad;")
    public static class5 field2736 = field2747;

    @OriginalMember(owner = "client!sa", name = "Cb", descriptor = "Lad;")
    public static class5 field2753 = field2747;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "J")
    public static long field2738 = 0L;

    @OriginalMember(owner = "client!sa", name = "vb", descriptor = "Lad;")
    public static class5 field2746 = field2747;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "Lad;")
    public static class5 field2728 = field2747;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "B")
    public byte field2737;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!sa", name = "ub", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!sa", name = "xb", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!sa", name = "yb", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!sa", name = "Bb", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "Lrd;")
    public static class106 field2741;

    @OriginalMember(owner = "client!sa", name = "Ab", descriptor = "Lsb;")
    public static class110 field2751;

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "Ltb;")
    public class116 field2739;

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "Z")
    public static boolean field2740;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V", line = 20)
    public static final void method881(int arg0) {
        field2742++;
        class5.field206.method101((byte) -115);
        class118.field2914.method101((byte) -82);
        if (arg0 != 50) {
            method883((byte) -102);
        }
        class39.field984.method101((byte) -84);
        class30.field749.method101((byte) -115);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)I", line = 71)
    public static final int method882(int arg0, int arg1, byte arg2) {
        int var3 = -28 % ((arg2 - 9) / 38);
        field2752++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var4 = (arg0 & 0x7F) * arg1 / 128;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg0 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V", line = 92)
    public static void method883(byte arg0) {
        field2746 = null;
        field2734 = null;
        field2735 = null;
        field2736 = null;
        field2744 = null;
        field2753 = null;
        field2732 = null;
        field2741 = null;
        field2747 = null;
        if (arg0 > -96) {
            method883((byte) -77);
        }
        field2733 = null;
        field2751 = null;
        field2728 = null;
        field2750 = null;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)Z", line = 131)
    public static final boolean method884(byte arg0) {
        field2745++;
        int var1 = -23 / ((6 - arg0) / 46);
        class133 var2 = class5.field209;
        synchronized (class5.field209) {
            if (class43.field1090 == class27.field713) {
                return false;
            } else {
                class131.field3182 = class96.field2288[class27.field713];
                class52.field1296 = class133.field3217[class27.field713];
                class27.field713 = class27.field713 + 1 & 0x7F;
                return true;
            }
        }
    }
}
