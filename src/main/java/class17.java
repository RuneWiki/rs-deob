import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class17 extends class276 {

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "Ljava/lang/String;")
    public String field192;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "Lpu;")
    public static class411 field189 = new class411();

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V", line = 3)
    public static final void method84(int arg0) {
        field193++;
        class512.field7505.method1604(4);
        if (arg0 != -28303) {
            method86(-17L, true);
        }
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)V", line = 15)
    public static void method85(int arg0) {
        int var1 = 90 % ((-arg0 - 23) / 36);
        field189 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(JZ)V", line = 30)
    public static final void method86(long arg0, boolean arg1) {
        field190++;
        if (!arg1) {
            return;
        }
        class261.field4357.field301 = 0;
        class261.field4357.method163(class23.field322.field955, (byte) 49);
        class261.field4357.method135(16056, arg0);
        class261.field4357.method163(class300.field4813, (byte) 49);
        class398.field6086 = 0;
        class266.field4460 = 1;
        class23.field311 = -3;
        class156.field2529 = 0;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V", line = 49)
    public class17() {
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 51)
    public class17(String arg0) {
        this.field192 = arg0;
    }
}
