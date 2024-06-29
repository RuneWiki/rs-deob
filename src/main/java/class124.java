import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class124 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    private static int field1966 = 0;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Z")
    private static boolean field1967 = false;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lfea;")
    private static class47 field1965 = new class47();

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZ)V")
    public static final synchronized void method985(byte arg0, boolean arg1) {
        field1967 = arg1;
        if (arg0 >= 0) {
            field1966 = -74;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final synchronized void method986(int arg0) {
        field1966--;
        if (field1966 == 0) {
            method987((byte) 90);
        }
        if (arg0 != 0) {
            field1967 = false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final synchronized void method987(byte arg0) {
        while (true) {
            class607 var1 = (class607) field1965.method417((byte) 51);
            if (var1 == null) {
                int var2 = -109 % ((26 - arg0) / 58);
                return;
            }
            var1.field8630.method810(true);
            var1.method911(-52);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static final synchronized void method988(boolean arg0) {
        if (!arg0) {
            field1966++;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILo;)V")
    public static final synchronized void method989(int arg0, class438 arg1) {
        if (field1967 || arg0 > -94) {
            return;
        }
        if (field1966 > 0) {
            class607 var2 = new class607();
            var2.field8630 = arg1;
            field1965.method414(var2, (byte) 126);
        } else {
            arg1.method810(false);
        }
    }
}
