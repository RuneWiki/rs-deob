import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class304 {

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field3978 = 0;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field3981 = 0;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "[Lfu;")
    public static class354[] field3979;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static void method1742(int arg0) {
        if (arg0 == 0) {
            field3979 = null;
        }
    }
}
