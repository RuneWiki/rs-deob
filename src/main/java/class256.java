import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class256 {

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "[Li;")
    public static class272[] field3127;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 10)
    public static void method1495(byte arg0) {
        if (arg0 == -119) {
            field3127 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIII)V", line = 20)
    public static final void method1496(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 << 3;
        int var5 = arg1 << 3;
        int var6 = arg0 << 3;
        field3126++;
        class331.field4223 = var5;
        class133.field1739 = var4;
        int var7 = 95 / ((arg3 + 61) / 63);
        if (class296.field3661 == 2) {
            class654.field9226 = var6;
            class693.field9826 = var5;
            class215.field2673 = var4;
        }
        class285.method1600(5126);
        class365.field4649 = true;
    }
}
