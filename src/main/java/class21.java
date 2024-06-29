import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class21 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field228 = 0;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field233 = new String[100];

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lsd;")
    public static class27 field229;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Llb;II)Lob;", line = 17)
    public static final class292 method145(class211 arg0, int arg1, int arg2) {
        if (arg1 <= 35) {
            method145((class211) null, 5, -88);
        }
        field232++;
        return class57.method513(arg2, arg0, 11332) ? class312.method2155(0) : null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V", line = 55)
    public static final void method146(byte arg0, int arg1) {
        field230++;
        for (class217 var2 = class76.field1074.method200(0); var2 != null; var2 = class76.field1074.method202((byte) -57)) {
            if (((long) arg1) == (var2.field3418 >> 48 & 0xFFFFL)) {
                var2.method1554((byte) -110);
            }
        }
        int var3 = 103 / ((65 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 85)
    public static void method147(int arg0) {
        if (arg0 < 31) {
            method145((class211) null, -46, 15);
        }
        field229 = null;
        field233 = null;
    }
}
