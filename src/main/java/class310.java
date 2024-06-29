import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class310 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lwr;")
    public static class459 field4196 = new class459(512);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lpt;")
    public static class531 field4199;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[B")
    public byte[] field4198;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[S")
    public short[] field4197;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[S")
    public short[] field4200;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[S")
    public short[] field4201;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method1866(byte arg0) {
        if (arg0 == -6) {
            field4199 = null;
            field4196 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1867(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 <= 79) {
            return;
        }
        field4195++;
        if (arg1 < 512 || arg5 < 512 || (class272.field3589 * 512 - 1024) < arg1 || (class3.field26 * 512 - 1024) < arg5) {
            class118.field1560[0] = class118.field1560[1] = -1;
            return;
        }
        int var10 = class86.method624(arg7, arg5, arg1, 24111) - arg9;
        if (class247.field3206) {
            class503.method2805(true, (byte) 88);
        } else {
            class736.field10270.method39(arg3, 0, 0);
            class21.field142.method367(class736.field10270);
        }
        if (class670.field9312) {
            class21.field142.method436(arg1, var10, arg5, class661.field9249, class118.field1560);
        } else {
            class21.field142.method422(arg1, var10, arg5, class118.field1560);
        }
        if (class247.field3206) {
            class522.method2905((byte) 38);
        } else {
            class736.field10270.method39(-arg3, 0, 0);
            class21.field142.method367(class736.field10270);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)Z")
    public static final boolean method1868(byte arg0) {
        field4202++;
        if (arg0 > -126) {
            field4199 = null;
        }
        return class226.field2934 != 0;
    }
}
