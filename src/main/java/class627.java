import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class627 extends class665 {

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "Z")
    public boolean field8778 = false;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public int field8781 = -1;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "Z")
    public static boolean field8775 = true;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public int field8773;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public int field8774;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public int field8777;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
    public int field8779;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
    public int field8782;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "Lbfa;")
    public static class335 field8780;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method3498(int arg0) {
        field8780 = null;
        if (arg0 != 12411) {
            field8780 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
    public static final void method3499(int arg0) {
        field8776++;
        int var1 = arg0;
        if (class287.field4270 != null) {
            var1 = class287.field4270.method2749((byte) 4, class328.field4859);
        }
        if (var1 == 2) {
            int var4 = class319.field4702 > 800 ? 800 : class319.field4702;
            class142.field2102 = (class319.field4702 - var4) / 2;
            int var5 = class443.field6457 <= 600 ? class443.field6457 : 600;
            class487.field6930 = var4;
            class31.field494 = var5;
            class525.field7410 = 0;
        } else if (var1 == 1) {
            int var2 = class319.field4702 > 1024 ? 1024 : class319.field4702;
            int var3 = class443.field6457 > 768 ? 768 : class443.field6457;
            class487.field6930 = var2;
            class142.field2102 = (class319.field4702 - var2) / 2;
            class525.field7410 = 0;
            class31.field494 = var3;
        } else {
            class487.field6930 = class319.field4702;
            class525.field7410 = 0;
            class142.field2102 = 0;
            class31.field494 = class443.field6457;
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V")
    public class627(int arg0) {
        this.field8781 = arg0;
    }
}
