import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class367 extends class606 {

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "Z")
    private boolean field5206 = false;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Lbg;")
    public static class464 field5197 = new class464();

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "F")
    public static float field5201;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "Lbe;")
    public static class37 field5202;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V", line = 3)
    public static void method2342(int arg0) {
        field5197 = null;
        field5202 = null;
        if (arg0 <= 30) {
            field5197 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lsr;)V", line = 15)
    public class367(class251 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)Z", line = 21)
    public final boolean method525(int arg0) {
        ++field5203;
        if (arg0 < 19) {
            this.field5206 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V", line = 35)
    public final void method518(int arg0, boolean arg1) {
        if (arg0 != 5486) {
            field5197 = null;
        }
        super.field8525.method1613(-30, class502.field7202, class719.field9987);
        ++field5204;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V", line = 46)
    public final void method516(int arg0, int arg1, int arg2) {
        if (arg1 <= 91) {
            this.method521((byte) -4);
        }
        ++field5199;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lma;II)V", line = 58)
    public final void method523(class12 arg0, int arg1, int arg2) {
        ++field5200;
        if (arg2 == 3) {
            super.field8525.method1663(arg0, -2);
            super.field8525.method1628((byte) 107, arg1);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V", line = 73)
    public final void method521(byte arg0) {
        if (this.field5206) {
            super.field8525.method1648(1, (byte) 66);
            super.field8525.method1478(class569.field8074, -1);
            super.field8525.method1613(-30, class502.field7202, class502.field7202);
            super.field8525.method1664((byte) -56, class679.field9315, 2);
            super.field8525.method1601(class597.field8397, 0, 256);
            super.field8525.method1632((byte) -122);
            super.field8525.method1663((class12) null, -2);
            super.field8525.method1648(0, (byte) 66);
            this.field5206 = false;
        } else {
            super.field8525.method1601(class597.field8397, 0, 256);
        }
        ++field5205;
        int var2 = -4 % ((-26 - arg0) / 56);
        super.field8525.method1613(-30, class502.field7202, class502.field7202);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V", line = 100)
    public final void method517(boolean arg0, int arg1) {
        if (arg1 > -64) {
            method2342(125);
        }
        ++field5198;
        class168 var3 = super.field8525.method1590(31);
        if (var3 != null && arg0) {
            super.field8525.method1648(1, (byte) 66);
            super.field8525.method1663(var3, -2);
            super.field8525.method1478(class254.field3721, -1);
            super.field8525.method1648(1, (byte) 66);
            super.field8525.method1613(-30, class589.field8300, class719.field9987);
            super.field8525.method1450(false, class240.field3203, 2, true, false);
            super.field8525.method1601(class539.field7554, 0, 256);
            class328 var4 = super.field8525.method1593(127);
            var4.method2134(super.field8525.method1631(0), -3603);
            super.field8525.method1600((byte) 95, class224.field3006);
            super.field8525.method1648(0, (byte) 66);
            this.field5206 = true;
        } else {
            super.field8525.method1601(class539.field7554, 0, 256);
        }
    }
}
