import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class163 extends class401 {

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public int field2338 = -1;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "Z")
    public boolean field2340 = false;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field2336 = 500;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(I)V", line = 43)
    public class163(int arg0) {
        this.field2338 = arg0;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIZ)V", line = 17)
    public static final void method1145(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class503.field6917 == 0) {
            class152.method1095(false, true);
        } else {
            class127.field1823 = class503.field6917;
            class203.method1327((byte) 63, 0);
        }
        field2337++;
        class201.field2845 = arg3;
        class23.field288 = arg4;
        class664.field9315 = arg2;
        int var5 = 82 / ((78 - arg0) / 32);
        class510.method2913(arg1);
    }
}
