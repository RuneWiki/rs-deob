import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class204 extends class307 {

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "[I")
    public static int[] field2645 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 3)
    public static void method1322(byte arg0) {
        field2645 = null;
        if (arg0 != -85) {
            method1322((byte) 3);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Lgfa;")
    public abstract class660 method928(int arg0);
}
