import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class276 implements class675 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[F")
    public float[] field3495;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lmq;")
    public static class78 field3492 = new class78(81, 0);

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1654(boolean arg0) {
        if (!arg0) {
            field3494 = -42;
        }
        field3492 = null;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(II)V", line = 24)
    public class276(int arg0, int arg1) {
        this.field3496 = arg0;
        this.field3493 = arg1;
        this.field3495 = new float[arg0 * arg1];
    }
}
