import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class728 {

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field10227 = 0;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field10228;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field10229;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "Ltr;")
    public static class564 field10226;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIB)V")
    public static final void method4064(int arg0, int arg1, byte arg2) {
        field10229++;
        class503 var3 = class512.method3112(1, arg1, 0);
        if (arg2 == -94) {
            var3.method3075((byte) -69);
            var3.field7310 = arg0;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public static final void method4065(int arg0) {
        field10228++;
        class558.field8116 = true;
        if (arg0 != -1386) {
            method4064(28, 127, (byte) -36);
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)V")
    public static void method4066(int arg0) {
        field10226 = null;
        if (arg0 != 0) {
            field10227 = -122;
        }
    }
}
