import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    public static int[] field1 = new int[1];

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 11)
    public static void method1(int arg0) {
        field1 = null;
        int var1 = 53 % ((arg0 - 15) / 45);
    }
}
