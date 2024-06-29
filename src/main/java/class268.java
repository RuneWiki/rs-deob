import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class268 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field4162;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public int field4173;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4161 = "flash3:";

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    public static int[] field4166 = new int[1000];

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field4164 = -1;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lgi;")
    public static class310 field4172;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Ljd;")
    public static class95 field4171;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Ljd;")
    public static class95 field4174;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 5)
    public static void method1878(byte arg0) {
        field4161 = null;
        field4171 = null;
        field4174 = null;
        field4172 = null;
        field4166 = null;
        if (arg0 != -91) {
            field4163 = -52;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 31)
    public static final void method1879(int arg0) {
        field4169++;
        if (arg0 != 27784) {
            return;
        }
        if (class6.field90.toLowerCase().indexOf("microsoft") != -1) {
            class319.field4932[191] = 73;
            class319.field4932[223] = 28;
            class319.field4932[188] = 71;
            class319.field4932[222] = 59;
            class319.field4932[221] = 43;
            class319.field4932[190] = 72;
            class319.field4932[187] = 27;
            class319.field4932[219] = 42;
            class319.field4932[186] = 57;
            class319.field4932[220] = 74;
            class319.field4932[189] = 26;
            class319.field4932[192] = 58;
            return;
        }
        class319.field4932[44] = 71;
        if (class6.field103 == null) {
            class319.field4932[192] = 58;
            class319.field4932[222] = 59;
        } else {
            class319.field4932[192] = 28;
            class319.field4932[222] = 58;
            class319.field4932[520] = 59;
        }
        class319.field4932[93] = 43;
        class319.field4932[46] = 72;
        class319.field4932[47] = 73;
        class319.field4932[59] = 57;
        class319.field4932[91] = 42;
        class319.field4932[45] = 26;
        class319.field4932[61] = 27;
        class319.field4932[92] = 74;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZ)Z", line = 89)
    public static final boolean method1880(int arg0, int arg1, boolean arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        class32 var3 = class226.method1607(44, arg0);
        if (arg2) {
            field4168 = -7;
        }
        field4167++;
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method261((byte) 104, arg1);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(III)V", line = 115)
    public class268(int arg0, int arg1, int arg2) {
        this.field4162 = arg2;
        this.field4173 = arg1;
        this.field4170 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public abstract void method406(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
    public abstract void method400(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(III)V")
    public abstract void method405(int arg0, int arg1, int arg2);
}
