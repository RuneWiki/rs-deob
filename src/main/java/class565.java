import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class565 {

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "Lsb;")
    public static class266 field8252 = new class266(60, -1);

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "F")
    public static float field8253 = 0.0F;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "[Lgu;")
    public static class539[] field8254 = new class539[8];

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public static void method3272(byte arg0) {
        field8254 = null;
        if (arg0 >= -95) {
            method3273(85, -32, false);
        }
        field8252 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3273(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method3273(-30, -21, true);
        }
        field8251++;
        return class678.method3814((byte) 107, arg1, arg0) | (arg1 & 0x70000) != 0 || class102.method954(arg0, 7325, arg1);
    }
}
