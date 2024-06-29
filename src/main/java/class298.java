import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class298 {

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public static int field3995 = 100;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "[[B")
    public static byte[][] field3992;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V", line = 3)
    public static void method1779(byte arg0) {
        field3992 = null;
        if (arg0 != 34) {
            field3995 = 123;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZII)Z", line = 14)
    public static final boolean method1780(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field3993++;
            return (arg1 & 0x10000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)V", line = 29)
    public static final void method1781(int arg0, byte arg1) {
        field3994++;
        if (class361.field5210 == null) {
            class361.field5210 = new byte[4][class588.field8082][class12.field113];
        }
        for (int var2 = arg0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class588.field8082; var3++) {
                for (int var4 = 0; var4 < class12.field113; var4++) {
                    class361.field5210[var2][var3][var4] = arg1;
                }
            }
        }
    }
}
