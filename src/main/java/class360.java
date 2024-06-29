import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class360 extends class28 {

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public int field5197;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field5195 = 0;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field5198 = -1;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Ljj;")
    public static class398 field5196 = new class398(2, -1);

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Z")
    public static boolean field5199 = false;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Lpq;")
    public static class159 field5194;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 8)
    public static void method2215(byte arg0) {
        field5194 = null;
        field5196 = null;
        if (arg0 >= -87) {
            method2215((byte) -8);
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 23)
    public class360() {
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V", line = 30)
    public class360(int arg0) {
        this.field5197 = arg0;
    }
}
