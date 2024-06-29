import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class22 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lva;")
    public static class121 field574 = class107.method797("(U2", -10983);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field573 = 0;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lva;")
    private static class121 field584 = class107.method797("Private chat", -10983);

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field583 = 0;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    public static int[] field581 = new int[25];

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lva;")
    public static class121 field578 = field584;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lva;")
    private static class121 field586 = class107.method797("Press (Wchange your password(W on front page)3", -10983);

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lva;")
    public static class121 field576 = field586;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Li;")
    public static class48 field585 = new class48(100);

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lva;")
    private static class121 field587 = class107.method797("Accept challenge", -10983);

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Lva;")
    public static class121 field589 = class107.method797("@gre@", -10983);

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field591 = 0;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lva;")
    public static class121 field592 = field587;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "J")
    public long field577;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lbc;")
    public static class10 field572;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Ldc;")
    public class22 field575;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Ldc;")
    public class22 field579;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 16)
    public static void method185(byte arg0) {
        field576 = null;
        field592 = null;
        field578 = null;
        field581 = null;
        field587 = null;
        int var1 = 87 / ((arg0 + 42) / 61);
        field589 = null;
        field574 = null;
        field572 = null;
        field586 = null;
        field584 = null;
        field585 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ltc;I)Lva;", line = 45)
    public static final class121 method186(class113 arg0, int arg1) {
        field582++;
        if (arg1 != 32767) {
            method186(null, 51);
        }
        return class27.method213(32767, true, arg0);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V", line = 76)
    public final void method187(byte arg0) {
        field580++;
        if (this.field575 == null) {
            return;
        }
        this.field575.field579 = this.field579;
        this.field579.field575 = this.field575;
        if (arg0 != 39) {
            field578 = null;
        }
        this.field579 = null;
        this.field575 = null;
    }
}
