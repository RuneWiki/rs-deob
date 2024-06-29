import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 implements class243 {

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "Ljn;")
    private class668 field579;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "Ljava/lang/String;")
    private String field573;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "Lmq;")
    public static class472 field576 = new class472(8);

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "[Ljava/awt/Color;")
    public static Color[] field578 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "F")
    public static float field581;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "Lhf;")
    public static class363 field580;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)Luv;")
    public final class333 method360(int arg0) {
        field577++;
        if (arg0 != -21954) {
            this.field579 = null;
        }
        return class333.field4430;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)I")
    public static final int method361(int arg0, int arg1, int arg2) {
        field575++;
        int var3 = arg1 + (arg2 * 57);
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return arg0 > -21 ? -63 : (var5 & 0x7FF25BE) >> 19;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BI)Z")
    public static final boolean method362(byte arg0, int arg1) {
        field574++;
        if (arg0 > -33) {
            field580 = null;
        }
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
    public static void method363(int arg0) {
        if (arg0 != 9179409) {
            method362((byte) 2, 21);
        }
        field580 = null;
        field576 = null;
        field578 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZI)Z")
    public static final boolean method364(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method363(-69);
        }
        field571++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)I")
    public final int method365(int arg0) {
        if (arg0 <= 81) {
            return -114;
        } else {
            field572++;
            return this.field579.method3795((byte) -59, this.field573) ? 100 : 0;
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Ljn;Ljava/lang/String;)V")
    public class24(class668 arg0, String arg1) {
        this.field579 = arg0;
        this.field573 = arg1;
    }
}
