import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class269 extends class496 {

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lqp;")
    public static class586 field3987 = new class586(2, 5);

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field3989 = 0;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "J")
    public static long field3988;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 4)
    public static void method1709(int arg0) {
        if (arg0 != -24933) {
            field3987 = null;
        }
        field3987 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 17)
    public class269() {
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V", line = 24)
    public class269(int arg0) {
        this.field3986 = arg0;
    }
}
