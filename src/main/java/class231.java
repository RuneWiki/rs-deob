import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class231 extends class165 {

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "[I")
    public int[] field3255;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[I")
    public int[] field3254;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lij;")
    public static class316 field3251;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)V")
    public static final void method1508(byte arg0, int arg1) {
        if (class1.field1 == null || class1.field1.length < arg1) {
            class1.field1 = new int[arg1];
        }
        field3247++;
        if (arg0 != 44) {
            field3248 = 61;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lij;BLij;)V")
    public static final void method1509(class316 arg0, byte arg1, class316 arg2) {
        field3249++;
        class344.field4657 = arg0;
        if (arg1 != -6) {
            method1511(false);
        }
        class309.field4194 = arg2;
        class24.field311 = class344.field4657.method1934((byte) 28, 3);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZ)V")
    public static final void method1510(int arg0, int arg1, boolean arg2) {
        class436.field6155 = new byte[arg1][class11.field107 + 1][class264.field3620 + 1];
        class278.field3794 = new int[arg1][class11.field107 + 1][class264.field3620 + 1];
        if (!arg2) {
            class91.field1276 = null;
        }
        class305.field4155 = new byte[arg1][class11.field107][class264.field3620];
        if (arg0 < 22) {
            field3253 = 4;
        }
        class362.field4988 = new byte[arg1][class11.field107][class264.field3620];
        class334.field4530 = new int[class264.field3620];
        class56.field733 = 99;
        class302.field4124 = new int[class264.field3620];
        class408.field5694 = new int[class264.field3620];
        class25.field321 = new byte[arg1][class11.field107][class264.field3620];
        field3246++;
        class81.field1124 = new int[class264.field3620];
        class80.field1104 = new int[5];
        class408.field5693 = new byte[arg1][class11.field107][class264.field3620];
        class163.field2329 = new int[class264.field3620];
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method1511(boolean arg0) {
        if (!arg0) {
            method1511(true);
        }
        field3251 = null;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II[I[I)V")
    public class231(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field3255 = arg2;
        this.field3254 = arg3;
    }

    static {
        new class368("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field3253 = 127;
    }
}
