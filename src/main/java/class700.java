import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class700 {

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "Lwn;")
    public static class585 field9769 = new class585("", 12);

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field9770 = -1;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Lib;")
    public static class1 field9771;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BZ)V", line = 10)
    public static final void method3958(byte arg0, boolean arg1) {
        class11.method51(94);
        field9768++;
        if (!class379.method2379(arg0 ^ 0x26, class102.field1401)) {
            return;
        }
        class221.field2992++;
        if (class221.field2992 < 50 && !arg1) {
            return;
        }
        class221.field2992 = 0;
        if (!class320.field4450 && class713.field9960 != null) {
            class732.field10163++;
            class583 var2 = class54.method400(class213.field2800, (byte) -124, class579.field7936);
            class463.method2838(var2, (byte) 122);
            try {
                class48.method348(arg0 ^ 0x4E99);
            } catch (IOException var3) {
                class320.field4450 = true;
            }
        }
        if (arg0 != -90) {
            method3958((byte) -71, false);
        }
        class11.method51(75);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V", line = 48)
    public static void method3959(byte arg0) {
        field9769 = null;
        field9771 = null;
        if (arg0 < 53) {
            field9769 = null;
        }
    }
}
