import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class334 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[Lbq;")
    public static class51[] field4786 = new class51[14];

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field4790 = 1;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "[I")
    public static int[] field4791 = new int[14];

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lvq;")
    public static class22 field4787 = new class22();

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field4792 = 0;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "[I")
    public static int[] field4793 = new int[25];

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Luf;")
    public static class281 field4788;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method2182(boolean arg0) {
        field4789++;
        if (class46.field750) {
            return;
        }
        class46.field750 = true;
        class206.field3020 = true;
        if (arg0) {
            return;
        }
        if (class324.field4673) {
            class106.field1756 = (float) ((int) class106.field1756 + 191 & 0xFFFFFF80);
        } else {
            class278.field4183 += (24.0F - class278.field4183) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V", line = 44)
    public static void method2183(boolean arg0) {
        field4787 = null;
        field4791 = null;
        field4786 = null;
        field4793 = null;
        if (arg0) {
            method2182(true);
        }
        field4788 = null;
    }
}
