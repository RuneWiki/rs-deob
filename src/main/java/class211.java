import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class211 extends class89 {

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "Lqe;")
    public static class179 field3938 = class206.method1380("Lade Konfiguration )2 ", (byte) -128);

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field3940 = 1;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "Lqe;")
    private static class179 field3941 = class206.method1380("glow3:", (byte) -24);

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Lqe;")
    public static class179 field3944 = class206.method1380("p12_full", (byte) -126);

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "Lqe;")
    public static class179 field3945 = class206.method1380("Startseite auf (WSpielkonto wiederherstellen(W)3", (byte) -126);

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Lqe;")
    public static class179 field3934 = class206.method1380("cookieprefix", (byte) -127);

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field3947 = 0;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "J")
    public static long field3946 = 0L;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "Lqe;")
    public static class179 field3942 = field3941;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lqe;")
    public static class179 field3931 = field3941;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "[I")
    public int[] field3930;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[I")
    public int[] field3932;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "[I")
    public static int[] field3937;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "[I")
    public int[] field3948;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "[Lcd;")
    public class26[] field3939;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "[Lcd;")
    public class26[] field3943;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "[[[B")
    public byte[][][] field3949;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lqe;BLqe;Leh;)Llg;")
    public static final class126 method1400(class179 arg0, byte arg1, class179 arg2, class52 arg3) {
        field3933++;
        int var4 = arg3.method359(-1, arg2);
        if (arg1 > -10) {
            return null;
        } else {
            int var5 = arg3.method362(-8, var4, arg0);
            return class67.method432(-128, var4, var5, arg3);
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public static void method1401(byte arg0) {
        field3944 = null;
        field3934 = null;
        if (arg0 != 52) {
            field3934 = null;
        }
        field3938 = null;
        field3942 = null;
        field3937 = null;
        field3931 = null;
        field3941 = null;
        field3945 = null;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)Lm;")
    public static final class130 method1402(byte arg0) {
        if (arg0 > -110) {
            field3944 = null;
        }
        field3935++;
        try {
            return (class130) Class.forName("jg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class84();
        }
    }
}
