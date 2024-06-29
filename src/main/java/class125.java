import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class125 {

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public int field3067 = 0;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public int field3064 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3045 = -1;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lmc;")
    private static class75 field3049 = class30.method234(true, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3063 = 0;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lmc;")
    public static class75 field3046 = field3049;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3066 = 0;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lmc;")
    private static class75 field3062 = class30.method234(true, "Unexpected server response");

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Lmc;")
    public static class75 field3069 = class30.method234(true, "Hierhin gehen");

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Lmc;")
    public static class75 field3065 = field3062;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lmc;")
    public static class75 field3047 = class30.method234(true, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public int field3061;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lkd;")
    public class64 field3054;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Lp;")
    public static class90 field3070;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 10)
    public static final void method994(boolean arg0) {
        field3048++;
        if (class97.field2435 == 1) {
            if (class12.field245 >= 6 && class12.field245 <= 106 && class71.field1813 >= 467 && class71.field1813 <= 499) {
                class71.field1814 = (class71.field1814 + 1) % 4;
                class55.field1350 = true;
                class127.field3114++;
                class35.field841 = true;
                class118.field2923.method707(35, 4);
                class118.field2923.method493((byte) 88, class71.field1814);
                class118.field2923.method493((byte) 88, class37.field894);
                class118.field2923.method493((byte) 88, class76.field1932);
            }
            if (class12.field245 >= 135 && class12.field245 <= 235 && class71.field1813 >= 467 && class71.field1813 <= 499) {
                class37.field894 = (class37.field894 + 1) % 3;
                class35.field841 = true;
                class127.field3114++;
                class55.field1350 = true;
                class118.field2923.method707(85, 4);
                class118.field2923.method493((byte) 88, class71.field1814);
                class118.field2923.method493((byte) 88, class37.field894);
                class118.field2923.method493((byte) 88, class76.field1932);
            }
            if (class12.field245 >= 273 && class12.field245 <= 373 && class71.field1813 >= 467 && class71.field1813 <= 499) {
                class35.field841 = true;
                class55.field1350 = true;
                class127.field3114++;
                class76.field1932 = (class76.field1932 + 1) % 3;
                class118.field2923.method707(-3, 4);
                class118.field2923.method493((byte) 88, class71.field1814);
                class118.field2923.method493((byte) 88, class37.field894);
                class118.field2923.method493((byte) 88, class76.field1932);
            }
            if (class12.field245 >= 412 && class12.field245 <= 512 && class71.field1813 >= 467 && class71.field1813 <= 499) {
                if (class130.field3155 == -1) {
                    class47.method357(86);
                    if (class32.field736 != -1) {
                        class58.field1455 = false;
                        client.field364 = class130.field3155 = class32.field736;
                        class16.field293 = class16.field309;
                    }
                } else {
                    class31.method242(class16.field309, 0, -1, class56.field1422);
                }
            }
        }
        if (!arg0) {
            field3065 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[BILbe;)V", line = 114)
    public static final void method995(int arg0, byte[] arg1, int arg2, class12 arg3) {
        field3058++;
        class65 var4 = new class65();
        var4.field1709 = arg1;
        var4.field1706 = arg3;
        var4.field1765 = arg0;
        var4.field1711 = 0;
        class32 var5 = class88.field2169;
        synchronized (class88.field2169) {
            class88.field2169.method245(var4, 0);
            int var6 = -111 / ((arg2 - 18) / 44);
        }
        class97.method815((byte) 89);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 161)
    public static void method996(byte arg0) {
        field3047 = null;
        field3070 = null;
        field3049 = null;
        if (arg0 != -120) {
            method996((byte) 109);
        }
        field3065 = null;
        field3069 = null;
        field3046 = null;
        field3062 = null;
    }
}
