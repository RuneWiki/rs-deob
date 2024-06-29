import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class577 extends class109 {

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public int field8164;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "Leq;")
    public static class209 field8167;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "Z")
    public static boolean field8163;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "[[[J")
    public static long[][][] field8165;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Ljw;")
    public final class551 method930(int arg0) {
        field8162++;
        return arg0 == 17503 ? class54.field1031 : null;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
    public static void method3345(int arg0) {
        int var1 = 0 % ((-arg0 - 36) / 50);
        field8165 = null;
        field8167 = null;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(ILjg;Ljha;III)V")
    public class577(int arg0, class338 arg1, class692 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field8164 = arg5;
    }
}
