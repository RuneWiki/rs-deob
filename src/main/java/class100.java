import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class100 extends class189 {

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "J")
    public long field1194;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "Z")
    public static boolean field1193 = false;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "Z")
    public static boolean field1195 = false;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "[I")
    public static int[] field1196 = new int[1024];

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V", line = 4)
    public static void method725(int arg0) {
        field1196 = null;
        int var1 = 66 / ((81 - arg0) / 45);
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V", line = 14)
    public class100() {
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(J)V", line = 24)
    public class100(long arg0) {
        this.field1194 = arg0;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IB)V", line = 36)
    public static final void method726(int arg0, byte arg1) {
        field1192++;
        if (arg1 != 102) {
            field1196 = null;
        }
        class592 var2 = class682.method3825(arg1 - 652872198, 17, arg0);
        var2.method3350(0);
    }
}
