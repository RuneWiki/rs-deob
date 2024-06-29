import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class107 implements class488 {

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "[F")
    public float[] field1536;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method861(int arg0, int arg1, int arg2) {
        if (arg1 != 32768) {
            method861(40, 25, 51);
        }
        field1538++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(II)V", line = 17)
    public class107(int arg0, int arg1) {
        this.field1539 = arg1;
        this.field1536 = new float[arg0 * arg1];
        this.field1537 = arg0;
    }
}
