import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public abstract class class320 extends class513 {

    @OriginalMember(owner = "client!caa", name = "v", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!caa", name = "w", descriptor = "Lul;")
    public static class599 field4368 = new class599(3);

    @OriginalMember(owner = "client!caa", name = "x", descriptor = "[I")
    public static int[] field4369 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!caa", name = "y", descriptor = "Lvl;")
    public static class15 field4370 = new class15(63, 0);

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "Lvl;")
    public static class15 field4371 = new class15(57, -1);

    @OriginalMember(owner = "client!caa", name = "C", descriptor = "Lwg;")
    public static class450 field4374 = new class450(0, 2, 2, 1);

    @OriginalMember(owner = "client!caa", name = "A", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!caa", name = "B", descriptor = "[I")
    public static int[] field4373;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(B)V", line = 9)
    public static void method2035(byte arg0) {
        if (arg0 <= 22) {
            return;
        }
        field4371 = null;
        field4369 = null;
        field4374 = null;
        field4368 = null;
        field4370 = null;
        field4373 = null;
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(I)V", line = 32)
    public class320(int arg0) {
        this.field4367 = arg0;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1512(byte arg0);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z")
    public abstract boolean method1511(int arg0);
}
