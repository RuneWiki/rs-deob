import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class141 extends class125 {

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lod;")
    public static class101 field3239 = class46.method335(-84, " )2> ");

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lod;")
    private static class101 field3240 = class46.method335(117, "The server is being updated)3");

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Lod;")
    public static class101 field3251 = field3240;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field3242 = 0;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field3243 = 0;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Lod;")
    public class101 field3245;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lsa;")
    public class126 field3238;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lsa;")
    public class126 field3244;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Lt;")
    public static class132 field3258;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "[Ljava/lang/Object;")
    public Object[] field3247;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZZ)I")
    public static final int method1123(int arg0, boolean arg1, boolean arg2) {
        field3237++;
        int var3 = arg0;
        if (arg2) {
            var3 = class87.field1911 + class112.field2417 + arg0;
        }
        if (arg1) {
            var3 += class35.field901 + class121.field2655;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lc;BZLc;Lme;)V")
    public static final void method1124(class15 arg0, byte arg1, boolean arg2, class15 arg3, class88 arg4) {
        field3259++;
        class32.field812 = arg3;
        class25.field653 = arg0;
        class153.field3499 = arg2;
        if (arg1 != 92) {
            method1123(-100, false, false);
        }
        class25.field653.method112(10, 1);
        class93.field2003 = arg4;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public static final void method1125(int arg0) {
        field3253++;
        if (class54.field1228 > 0) {
            class149.method1165(26294);
            return;
        }
        class35.method262(0, 40);
        class5.field77 = class90.field1958;
        if (arg0 < 74) {
            method1123(-120, false, true);
        }
        class90.field1958 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lpd;")
    public static final class108 method1126(int arg0, int arg1) {
        field3241++;
        class108 var2 = (class108) class112.field2416.method140(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -6897) {
            method1123(-109, false, false);
        }
        byte[] var3 = class98.field2122.method114((byte) -88, 5, arg1);
        class108 var4 = new class108();
        if (var3 != null) {
            var4.method774(new class138(var3), (byte) -22);
        }
        class112.field2416.method141(var4, (long) arg1, (byte) -125);
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public static final void method1127(int arg0) {
        class106.field2278++;
        class17.field364.method419(131, (byte) 0);
        if (arg0 != -12304) {
            method1129(-104);
        }
        class17.field364.method1087(0L, arg0 + 12212);
        field3249++;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
    public static final void method1128(int arg0) {
        class98.field2114.method12((byte) 30);
        for (int var1 = 0; var1 < 32; var1++) {
            class131.field2991[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class24.field621[var2] = 0L;
        }
        class57.field1326 = 0;
        field3254++;
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
    public static void method1129(int arg0) {
        field3251 = null;
        if (arg0 < 1) {
            method1124(null, (byte) 23, false, null, null);
        }
        field3240 = null;
        field3239 = null;
        field3258 = null;
    }
}
