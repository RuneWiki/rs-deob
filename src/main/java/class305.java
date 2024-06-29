import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class305 {

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Lec;")
    public static class157 field4166;

    static {
        new class466("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field4167 = 0;
        field4168 = 16777215;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 9)
    public static void method1772(boolean arg0) {
        field4166 = null;
        if (!arg0) {
            method1777((byte) 74, -95);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V", line = 19)
    public static final void method1773(boolean arg0, int arg1) {
        class491.method2878((byte) 92, class427.field6260);
        class519.field7674++;
        field4162++;
        for (class295 var2 = (class295) class212.field2960.method1494(arg1); var2 != null; var2 = (class295) class212.field2960.method1493((byte) 127)) {
            if (!var2.method1564(4)) {
                var2 = (class295) class212.field2960.method1494(0);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field4059 == 0) {
                class51.method447(var2, true, true, arg0);
            }
        }
        if (class408.field5971 != null) {
            class370.method2222(arg1, class408.field5971);
            class408.field5971 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lmg;B)V", line = 61)
    public static final void method1774(class101 arg0, byte arg1) {
        field4164++;
        class266.field3670 = 0;
        class295.field4058 = 0;
        class458.field6717 = new class410();
        if (arg1 < 0) {
            field4168 = -112;
        }
        class527.field7796 = new class114[1024];
        class108.method795((byte) 120, arg0);
        class354.method2119(2048, arg0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lmg;I)V", line = 77)
    public static final void method1775(class101 arg0, int arg1) {
        field4169++;
        if (arg1 != 0) {
            field4166 = null;
        }
        class521.field7727 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 91)
    public static final void method1776(int arg0) {
        if (arg0 != 2722) {
            method1775(null, -61);
        }
        if (class453.field6662 <= 0) {
            class218.field3047 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class63.field790.length; var2++) {
                if (class63.field790[var2].startsWith("--> ")) {
                    var1++;
                    if (class453.field6662 == var1) {
                        class218.field3047 = class63.field790[var2].substring(4);
                        break;
                    }
                }
            }
        }
        field4165++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V", line = 125)
    public static final void method1777(byte arg0, int arg1) {
        class195.field2782 = new int[arg1];
        class115.field1727 = new int[arg1];
        class172.field2563 = new int[arg1];
        class264.field3654 = new int[arg1];
        field4163++;
        class485.field7092 = new int[arg1];
        if (arg0 < 41) {
            method1775(null, 65);
        }
    }
}
