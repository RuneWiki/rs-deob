import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class403 implements class258 {

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field5828;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "[Z")
    public static boolean[] field5830 = new boolean[8];

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Z")
    public static boolean field5831 = false;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V")
    public class403(int arg0) {
        this.field5828 = arg0;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2462(int arg0, int arg1, byte arg2) {
        field5829++;
        if (arg2 == 1) {
            return class167.method1268(arg0, arg1, arg2 + 64) | (arg1 & 0x70000) != 0 || class637.method3635(arg0, arg1, (byte) 122);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Lph;")
    public final class598 method474(int arg0) {
        field5827++;
        if (arg0 != 6686) {
            field5831 = true;
        }
        return class536.field7507;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V")
    public static void method2463(boolean arg0) {
        field5830 = null;
        if (arg0) {
            method2462(2, 86, (byte) -39);
        }
    }
}
