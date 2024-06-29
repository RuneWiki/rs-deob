import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class685 extends class591 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ldca;")
    public class612 field9733;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field9735 = 0;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field9736 = -1;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[F")
    public static float[] field9734 = new float[4];

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method3869(byte arg0) {
        class506.field7522.method794(((float) class525.field7713.field5966 * 0.1F + 0.7F) * 1.1523438F);
        field9732++;
        class506.field7522.method756(class466.field6729, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class506.field7522.method763(class512.field7623, -1, 0);
        if (arg0 < 73) {
            method3869((byte) -114);
        }
        class506.field7522.method744(class319.field4403);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method3870(boolean arg0) {
        if (arg0) {
            field9734 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lnh;II[B)V")
    public class685(class495 arg0, int arg1, int arg2, byte[] arg3) {
        this.field9733 = arg0.method2902(arg3, 0, arg2, class665.field9353, arg1, false);
        this.field9733.method414(97, false, false);
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lnh;II[I)V")
    public class685(class495 arg0, int arg1, int arg2, int[] arg3) {
        this.field9733 = arg0.method2928(false, arg2, false, arg1, arg3);
        this.field9733.method414(120, false, false);
    }
}
