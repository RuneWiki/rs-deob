import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class164 {

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "[I")
    public static int[] field2532 = new int[2];

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IJ)V", line = 5)
    public static final void method1231(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 == 30410) {
            field2531++;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V", line = 23)
    public static void method1232(byte arg0) {
        int var1 = 31 / ((arg0 - 45) / 48);
        field2532 = null;
    }
}
