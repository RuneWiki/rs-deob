import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class315 {

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "Ljava/lang/String;")
    public String field4260;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public int field4258;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Lkca;")
    public static class755 field4259 = new class755(1);

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Z")
    public static boolean field4262 = false;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V", line = 6)
    public static void method1940(byte arg0) {
        int var1 = -104 % ((arg0 + 39) / 53);
        field4259 = null;
    }

    @OriginalMember(owner = "client!mp", name = "toString", descriptor = "()Ljava/lang/String;", line = 17)
    public final String toString() {
        field4261++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 40)
    public class315(String arg0, int arg1) {
        this.field4260 = arg0;
        this.field4258 = arg1;
    }
}
