import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class34 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Z")
    public static boolean field311 = false;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[Lgba;")
    public static class700[] field313 = new class700[14];

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 10)
    public static void method179(byte arg0) {
        if (arg0 != 41) {
            method179((byte) -25);
        }
        field313 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)V", line = 21)
    public static final void method180(int arg0, byte arg1, int arg2) {
        field312++;
        int var3 = 92 / ((-arg1 - 52) / 41);
        class503 var4 = class512.method3112(6, arg0, 0);
        var4.method3075((byte) -102);
        var4.field7310 = arg2;
    }
}
