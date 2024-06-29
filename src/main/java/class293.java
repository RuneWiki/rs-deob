import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class293 {

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lhu;")
    public static class115 field3954 = new class115("", 16);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([BI)V")
    public static final void method1737(byte[] arg0, int arg1) {
        field3953++;
        if (arg1 != -1) {
            field3954 = null;
        }
        class389 var2 = new class389(arg0);
        while (true) {
            int var3 = var2.method2229(255);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class418.field5920 = var2.method2260(arg1 - 33);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1738(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (class221.field2851.field4155 != 0 && arg1 != 0 && class244.field3334 < 50 && arg3 != -1) {
            class465.field6487[class244.field3334++] = new class68((byte) 1, arg3, arg1, arg2, arg6, arg4, arg0, null);
        }
        field3952++;
        if (arg5 >= -16) {
            method1738(-25, 61, -44, -71, 62, (byte) 47, 30);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method1739(int arg0) {
        field3954 = null;
        if (arg0 != -51) {
            field3954 = null;
        }
    }
}
