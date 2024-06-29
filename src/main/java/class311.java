import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class311 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Ljf;")
    public static class216 field4991 = new class216(50);

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Z")
    public static boolean field4995 = false;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lol;")
    public static class220 field4994 = new class220();

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field4996 = 0;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([BB)Lfc;")
    public static final class213 method2093(byte[] arg0, byte arg1) {
        field4992++;
        if (arg1 >= -34) {
            method2093((byte[]) null, (byte) -28);
        }
        if (arg0 == null) {
            return null;
        } else {
            class109 var2 = new class109(arg0, class166.field2569, class277.field4480, class64.field924, class284.field4603, class190.field2959);
            class115.method762((byte) -98);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method2094(int arg0) {
        field4991 = null;
        if (arg0 != -16) {
            method2094(51);
        }
        field4994 = null;
    }
}
