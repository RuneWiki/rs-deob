import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class180 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lmb;")
    public static class96 field3100 = class243.method1708("Musik)2Engine vorbereitet)3", (byte) 94);

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "Lmb;")
    public static class96 field3114 = class243.method1708("Bitte entfernen Sie ", (byte) 94);

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Lmb;")
    private static class96 field3118 = class243.method1708("Opened title screen", (byte) 101);

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lmb;")
    public static class96 field3108 = field3118;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "F")
    public static float field3097;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "[Z")
    public static boolean[] field3113;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static final void method1275(int arg0) {
        field3110++;
        if (arg0 < 76) {
            field3101 = -14;
        }
        if (class71.field1223 != 2) {
            if (class167.field2950 == class146.field2601 && class272.field4722 == class122.field2267) {
                class71.field1223 = 0;
                class100.method754(class73.field1254 - 1, 114);
                return;
            }
            class17.field253 = class167.field2950;
            class71.field1223 = 2;
            class140.field2504 = class272.field4722;
        } else if (class17.field253 == class146.field2601 && class140.field2504 == class122.field2267) {
            class71.field1223 = 0;
            class100.method754(class73.field1254 - 1, -5);
            return;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static final void method1276(int arg0) {
        if (arg0 != -25210) {
            method1278((class96) null, 71);
        }
        field3115++;
        int var1 = class262.method1812(true);
        if (var1 == 0) {
            class153.field2690 = null;
            class128.method977(1, 0);
        } else if (var1 == 1) {
            class51.method392((byte) 0, arg0 ^ 0x6214);
            class128.method977(1, 512);
            class234.method1585(68);
        } else {
            class51.method392((byte) (class51.field899 - 4 & 0xFF), -16);
            class128.method977(1, 2);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static void method1277(byte arg0) {
        if (arg0 >= -13) {
            field3101 = 54;
        }
        field3113 = null;
        field3108 = null;
        field3100 = null;
        field3118 = null;
        field3114 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lmb;I)V")
    public static final void method1278(class96 arg0, int arg1) {
        field3096++;
        class192.field3320 = arg0;
        if (class234.field4017.field2277 == null) {
            return;
        }
        try {
            class96 var2 = class193.field3337.method675(arg1 ^ 0x1118, class234.field4017.field2277);
            class96 var3 = class60.field1041.method675(arg1 - 4376, class234.field4017.field2277);
            class96 var4 = class36.method289(arg1 ^ 0x15EE, new class96[] { var2, class106.field1779, arg0, class138.field2477, var3 });
            class96 var5;
            if (arg1 == ~arg0.method707(-20)) {
                var5 = class36.method289(-5615, new class96[] { var4, class68.field1191 });
            } else {
                var5 = class36.method289(-5615, new class96[] { var4, class39.field672, class50.method381(class155.method1133(124) + 94608000000L, false), class54.field941, class95.method668(10, 94608000L) });
            }
            class36.method289(-5615, new class96[] { class253.field4376, var5, class122.field2271 }).method711(false, class234.field4017.field2277);
        } catch (Throwable var6) {
        }
    }
}
