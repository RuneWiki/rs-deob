import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class137 {

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[J")
    public static long[] field3327 = new long[32];

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lae;")
    public static class6 field3324 = class64.method474(125, "backleft2");

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lae;")
    public static class6 field3330 = class64.method474(106, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lae;")
    private static class6 field3320 = class64.method474(112, "To create a new account you need to");

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lae;")
    public static class6 field3332 = field3320;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Lae;")
    public static class6 field3334 = class64.method474(124, "Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

    @OriginalMember(owner = "client!w", name = "m", descriptor = "[[[I")
    public static int[][][] field3331 = new int[4][105][105];

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field3340 = 0;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lae;")
    public static class6 field3328 = class64.method474(110, "Entfernen");

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public int field3337;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lvb;")
    public static class129 field3325;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lgd;")
    public class42 field3333;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lgd;")
    public class42 field3338;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Lgd;")
    public class42 field3339;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[[[B")
    public static byte[][][] field3335;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1109(int arg0) {
        class6.field79.method129(27392);
        if (arg0 < -2) {
            field3323++;
            class138.field3352.method129(27392);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 17)
    public static void method1110(byte arg0) {
        field3324 = null;
        field3330 = null;
        field3325 = null;
        field3332 = null;
        field3334 = null;
        field3331 = null;
        field3328 = null;
        if (arg0 >= -123) {
            method1112(null, null, null, -91);
        }
        field3320 = null;
        field3327 = null;
        field3335 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lba;ZI[B)V", line = 43)
    public static final void method1111(class8 arg0, boolean arg1, int arg2, byte[] arg3) {
        field3322++;
        class87 var4 = new class87();
        var4.field1501 = arg2;
        var4.field2086 = arg3;
        var4.field2094 = 0;
        if (arg1) {
            return;
        }
        var4.field2093 = arg0;
        class95 var5 = class21.field509;
        synchronized (class21.field509) {
            class21.field509.method785((byte) -96, var4);
        }
        class130.method1052(120);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lbf;Lbf;Lbf;I)V", line = 86)
    public static final void method1112(class14 arg0, class14 arg1, class14 arg2, int arg3) {
        int var4 = 38 / ((arg3 - 32) / 61);
        class100.field2333 = arg2;
        class68.field1508 = arg0;
        field3329++;
        class88.field2117 = arg1;
    }
}
