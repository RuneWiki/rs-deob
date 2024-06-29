import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class125 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lhh;")
    public static class163 field2402 = class137.method1065(")4l=", 17);

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lhh;")
    public static class163 field2408 = class137.method1065("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 17);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field2404 = -1;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field2415 = 0;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lhh;")
    public static class163 field2410 = class137.method1065("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 17);

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field2414 = -1;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public int field2420;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "J")
    public long field2417;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lpa;")
    public static class123 field2406;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lta;")
    public class165 field2413;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lta;")
    public class165 field2418;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Lta;")
    public class165 field2421;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lqc;")
    public static class258 field2416;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[Lrh;")
    public static class242[] field2419;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "[[[B")
    public static byte[][][] field2411;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method994(int arg0) {
        if (arg0 <= 74) {
            field2402 = null;
        }
        field2416 = null;
        field2402 = null;
        field2408 = null;
        field2406 = null;
        field2411 = null;
        field2419 = null;
        field2410 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lqi;)V")
    public static final void method995(class132 arg0) {
        for (int var1 = arg0.field2555; var1 <= arg0.field2565; var1++) {
            for (int var2 = arg0.field2550; var2 <= arg0.field2551; var2++) {
                class144 var3 = class259.field4542[arg0.field2552][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2741; var4++) {
                        if (var3.field2746[var4] == arg0) {
                            var3.field2741--;
                            for (int var5 = var4; var5 < var3.field2741; var5++) {
                                var3.field2746[var5] = var3.field2746[var5 + 1];
                                var3.field2725[var5] = var3.field2725[var5 + 1];
                            }
                            var3.field2746[var3.field2741] = null;
                            break;
                        }
                    }
                    var3.field2747 = 0;
                    for (int var6 = 0; var6 < var3.field2741; var6++) {
                        var3.field2747 |= var3.field2725[var6];
                    }
                }
            }
        }
    }
}
