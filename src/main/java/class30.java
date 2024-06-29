import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class30 extends class179 {

    @OriginalMember(owner = "client!kha", name = "F", descriptor = "[I")
    public static int[] field279 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kha", name = "E", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!kha", name = "G", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!kha", name = "H", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!kha", name = "I", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(Z)V", line = 4)
    public static void method148(boolean arg0) {
        if (arg0) {
            field279 = null;
        }
        field279 = null;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIIII)V", line = 14)
    public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field282;
        int var6 = super.field2482.method784();
        int var7 = ((class53) super.field5449).field832 * class115.method817(arg2 ^ 125) / 10 % var6;
        if (arg2 != 2) {
            method148(true);
        }
        super.field2482.method3135(-var6 + arg1 - -var7, arg3, -var7 + arg0 + var6, arg4);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method150(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            method151(-17);
        }
        ++field280;
        return class699.method3926(arg0, arg1 ^ -2, arg2) & class14.method70(arg2, (byte) -103, arg0);
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lla;Lla;Lcba;)V", line = 44)
    public class30(class423 arg0, class423 arg1, class53 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V", line = 50)
    public static final void method151(int arg0) {
        if (arg0 != -24851) {
            field279 = null;
        }
        ++field281;
        class461.field6565 = null;
    }
}
