import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class78 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Lqj;")
    public static class296 field1217;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public static final void method560(int arg0) {
        class190 var1 = class229.field3061;
        synchronized (class229.field3061) {
            class229.field3061.method1249(arg0 ^ 0x7D9D);
        }
        field1218++;
        if (arg0 != 32156) {
            method560(40);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public static void method561(byte arg0) {
        int var1 = -62 % ((arg0 - 35) / 60);
        field1217 = null;
    }
}
