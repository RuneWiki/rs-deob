import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class277 extends class484 {

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Lm;")
    public class189 field3912;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Z")
    public static boolean field3913 = false;

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Loea;II[B)V")
    public class277(class594 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3912 = class41.method379(6406, 6406, arg3, arg1, arg2, arg0, false, 3553);
        this.field3912.method1346((byte) -61, false, false);
    }
}
