import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class544 extends class546 {

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field7389 = -1;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Ldca;")
    public static class160 field7382 = new class160();

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Lem;")
    public static class206 field7392 = new class206(69, 8);

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "F")
    public static float field7387;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public int field7380;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field7381;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field7383;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public int field7385;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public int field7386;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Ljava/lang/String;")
    public String field7384;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "[Ltg;")
    public static class210[] field7388;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3068(int arg0) {
        field7391++;
        if (class486.field6678) {
            return;
        }
        class486.field6678 = true;
        if (arg0 != 25298) {
            method3068(118);
        }
        class498.field6773 = true;
        if (class366.field4875.field9367) {
            class705.field9964 = ((int) class705.field9964 - 65 & 0xFFFFFF80);
        } else {
            class367.field4942 += (-class367.field4942 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 34)
    public static void method3069(boolean arg0) {
        field7388 = null;
        if (!arg0) {
            field7382 = null;
            field7392 = null;
        }
    }
}
