import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public abstract class class302 extends class513 {

    @OriginalMember(owner = "client!ria", name = "x", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!ria", name = "y", descriptor = "Lwf;")
    public class147 field4150;

    @OriginalMember(owner = "client!ria", name = "v", descriptor = "I")
    public static int field4147 = 0;

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "[F")
    public static float[] field4151 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ria", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field4148;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V", line = 12)
    public static void method1934(byte arg0) {
        field4151 = null;
        if (arg0 != 87) {
            method1934((byte) -113);
        }
        field4148 = null;
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lwf;I)V", line = 25)
    public class302(class147 arg0, int arg1) {
        this.field4149 = arg1;
        this.field4150 = arg0;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)Z")
    public abstract boolean method187(int arg0);

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method189(int arg0);
}
