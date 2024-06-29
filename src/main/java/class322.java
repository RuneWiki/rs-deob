import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class322 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
    public static int[] field5529 = new int[500];

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Lna;")
    public static class26 field5534 = class69.method505("unzap", (byte) -120);

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5533 = -1;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lna;")
    public static class26 field5532 = class69.method505(":duelstake:", (byte) -120);

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5535 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "[I")
    public static int[] field5527 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Ln;")
    public static class282 field5528 = new class282(30);

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lna;")
    public static class26 field5538 = class69.method505("Chargement des interfaces )2 ", (byte) -126);

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Lna;")
    private static class26 field5545 = class69.method505("level: ", (byte) -118);

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lna;")
    private static class26 field5537 = class69.method505("skill: ", (byte) -120);

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Lna;")
    public static class26 field5543 = field5545;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lna;")
    private static class26 field5539 = class69.method505("scroll:", (byte) -127);

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Lbe;")
    public static class297 field5544 = null;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lna;")
    public static class26 field5540 = field5537;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Lna;")
    public static class26 field5541 = field5539;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lna;")
    public static class26 field5546 = field5539;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lvj;")
    public static class107 field5542;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lmm;")
    public static class256 field5536;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)I", line = 6)
    public static final int method2241(int arg0) {
        field5530++;
        if (arg0 == 1536) {
            return class38.field621 == 0 ? 0 : class9.field121[class38.field621].method18();
        } else {
            return 96;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 24)
    public static void method2242(byte arg0) {
        field5546 = null;
        field5541 = null;
        field5543 = null;
        field5529 = null;
        field5545 = null;
        field5538 = null;
        field5536 = null;
        if (arg0 > -44) {
            field5540 = (class26) null;
        }
        field5544 = null;
        field5527 = null;
        field5540 = null;
        field5539 = null;
        field5532 = null;
        field5534 = null;
        field5537 = null;
        field5542 = null;
        field5528 = null;
    }
}
