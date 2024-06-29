import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class367 extends class42 {

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "S")
    public short field4960;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "Lff;")
    public static class9 field4961 = new class9(35, 8);

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public static int field4963 = 0;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "Lff;")
    public static class9 field4962 = new class9(19, 4);

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "Lcu;")
    public static class145 field4964 = new class145(18, 3);

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 5)
    public static void method2135(int arg0) {
        if (arg0 != 4) {
            method2135(43);
        }
        field4964 = null;
        field4961 = null;
        field4962 = null;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V", line = 20)
    public class367() {
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(S)V", line = 23)
    public class367(short arg0) {
        this.field4960 = arg0;
    }
}
