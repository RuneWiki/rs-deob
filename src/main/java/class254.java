import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class254 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[B")
    public byte[] field3568;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[B")
    public byte[] field3575;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Leb;)V")
    public static final void method1677(class650 arg0) {
        class619.field8726 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BJ)I")
    public static final int method1678(byte arg0, long arg1) {
        field3574++;
        if (arg0 <= 90) {
            method1677(null);
        }
        return (int) (arg1 / 86400000L) - 11745;
    }
}
