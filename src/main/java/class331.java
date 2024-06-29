import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class331 extends class264 {

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "J")
    public long field4908;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "[Ljf;")
    public static class99[] field4910 = new class99[8];

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Lge;")
    public static class108 field4907 = new class108(5000);

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "[I")
    public static int[] field4911;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I")
    public static final int method2159(int arg0, int arg1) {
        return class299.field4360 == null ? 0 : class299.field4360[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V")
    public static void method2160(byte arg0) {
        field4911 = null;
        field4910 = null;
        field4907 = null;
        if (arg0 < 122) {
            field4907 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class331() {
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(J)V")
    public class331(long arg0) {
        this.field4908 = arg0;
    }
}
