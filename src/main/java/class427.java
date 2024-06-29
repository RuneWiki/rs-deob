import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class427 {

    @OriginalMember(owner = "client!hja", name = "d", descriptor = "Lhj;")
    public static class596 field5652 = new class596(14, -2);

    @OriginalMember(owner = "client!hja", name = "e", descriptor = "[I")
    public static int[] field5653 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!hja", name = "f", descriptor = "I")
    public static int field5654 = 0;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!hja", name = "c", descriptor = "Lqh;")
    public static class75 field5651;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(ILiaa;)I", line = 5)
    public static final int method2544(int arg0, class521 arg1) {
        field5650++;
        int var2 = arg1.field7363;
        class15 var3 = arg1.method1676(0);
        if (arg1.field3399 == -1 || arg1.field3426) {
            var2 = arg1.field7370;
        } else if (arg1.field3399 == var3.field245 || arg1.field3399 == var3.field241 || arg1.field3399 == var3.field258 || arg1.field3399 == var3.field270) {
            var2 = arg1.field7375;
        } else if (arg1.field3399 == var3.field271 || arg1.field3399 == var3.field276 || arg1.field3399 == var3.field261 || arg1.field3399 == var3.field251) {
            var2 = arg1.field7361;
        }
        return arg0 == -4293 ? var2 : -107;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(III)Z", line = 32)
    public static final boolean method2545(int arg0, int arg1, int arg2) {
        field5649++;
        if (arg0 != 65536) {
            method2545(96, -37, 40);
        }
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(B)V", line = 48)
    public static void method2546(byte arg0) {
        field5651 = null;
        field5653 = null;
        if (arg0 != -101) {
            field5651 = null;
        }
        field5652 = null;
    }
}
