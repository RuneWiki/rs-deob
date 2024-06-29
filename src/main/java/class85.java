import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class85 {

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Len;")
    public static class3 field1092;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZII)I", line = 20)
    public static final int method620(boolean arg0, int arg1, int arg2) {
        field1093++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 ? (arg1 & 0xFF80) + var3 : 59;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V", line = 52)
    public static final void method621(boolean arg0) {
        if (arg0) {
            class345.field5367 = class300.field4410;
            class74.field978 = class161.field2296;
            class240.field3491 = class7.field66;
        } else {
            class345.field5367 = class217.field3069;
            class74.field978 = class185.field2517;
            class240.field3491 = class133.field1810;
        }
        class23.field258 = class345.field5367.length;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 79)
    public static void method622(byte arg0) {
        if (arg0 > -85) {
            field1091 = -119;
        }
        field1092 = null;
    }
}
