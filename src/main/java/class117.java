import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class117 extends class339 {

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field1491 = 0;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lri;")
    public static class634 field1492;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 4)
    public static void method685(int arg0) {
        field1492 = null;
        if (arg0 != 0) {
            field1492 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)Z", line = 16)
    public static final boolean method686(int arg0) {
        field1493++;
        try {
            if (arg0 <= 56) {
                return true;
            } else {
                class615 var1 = new class615();
                byte[] var2 = var1.method3399(class18.field230, (byte) -95);
                class499.method2829(74, var2);
                return true;
            }
        } catch (Exception var3) {
            return false;
        }
    }
}
