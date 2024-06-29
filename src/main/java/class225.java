import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class225 extends class28 {

    @OriginalMember(owner = "client!sca", name = "v", descriptor = "Llu;")
    public class46 field2927;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "Lhca;")
    public static class365 field2926 = new class365();

    @OriginalMember(owner = "client!sca", name = "y", descriptor = "I")
    public static int field2930 = 0;

    @OriginalMember(owner = "client!sca", name = "x", descriptor = "Lnj;")
    public static class415 field2929 = new class415(46, -1);

    @OriginalMember(owner = "client!sca", name = "w", descriptor = "[Ldm;")
    public static class684[] field2928;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)V", line = 5)
    public static void method1416(int arg0) {
        field2929 = null;
        int var1 = -21 / ((27 - arg0) / 42);
        field2926 = null;
        field2928 = null;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Llu;)V", line = 17)
    public class225(class46 arg0) {
        this.field2927 = arg0;
    }
}
