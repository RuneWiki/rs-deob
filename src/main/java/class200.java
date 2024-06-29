import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class200 extends class626 {

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "Ljava/lang/Object;")
    public static volatile Object field2872 = null;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "Lqca;")
    public static class115 field2871 = new class115(0, 2, 2, 1);

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "Z")
    public static boolean field2876 = false;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "[Llda;")
    public static class483[] field2874;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 6)
    public static void method1407(int arg0) {
        field2871 = null;
        field2874 = null;
        int var1 = -122 % ((arg0 - 17) / 36);
        field2872 = null;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(II)V", line = 25)
    public class200(int arg0, int arg1) {
        this.field2873 = arg1;
        this.field2870 = arg0;
    }
}
