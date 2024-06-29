import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class302 {

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[Lqk;")
    private class61[] field5204;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field5199 = 0;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lwm;")
    public static class152 field5203 = class157.method1048("Module texte charg-B", 124);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lwm;")
    public static class152 field5200 = class157.method1048("0", 123);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field5207 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILwm;)I", line = 11)
    public static final int method2110(int arg0, class152 arg1) {
        field5202++;
        for (int var2 = arg0; var2 < class270.field4555.length; var2++) {
            if (class270.field4555[var2].method995(-103, arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIB)I", line = 61)
    public static final int method2111(int arg0, int arg1, byte arg2) {
        field5201++;
        if (arg1 == -2) {
            return 12345678;
        }
        if (arg2 >= -87) {
            method2112(false);
        }
        if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V", line = 97)
    public class302(int arg0) {
        this.field5204 = new class61[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class61 var3 = this.field5204[var2] = new class61();
            var3.field930 = var3;
            var3.field927 = var3;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V", line = 122)
    public static void method2112(boolean arg0) {
        field5200 = null;
        field5203 = null;
        if (!arg0) {
            method2112(false);
        }
    }
}
