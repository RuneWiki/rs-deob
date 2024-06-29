import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class128 {

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static final void method873(byte arg0) {
        class168.field2261.method3135(1);
        field1733++;
        class538.field7879.field2185 = 0;
        class409.field6214.field2185 = 0;
        class485.field7175 = 0;
        class101.field1471 = null;
        class14.field261 = 0;
        class250.field3479 = null;
        class205.field2737 = null;
        class501.field7394 = null;
        if (arg0 <= 107) {
            method873((byte) 91);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class208.field2884[var1] = null;
        }
        class5.field41 = null;
        class283.field4158 = 0;
        class454.field6834 = 0;
        class177.field2371 = null;
        class490.field7241 = 0;
        class400.field6094 = 0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)Lkk;")
    public final class128 method874(int arg0, byte arg1) {
        field1732++;
        if (arg1 <= 59) {
            this.field1735 = -40;
        }
        return new class128(this.field1734, arg0, this.field1736, this.field1730);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIII)V")
    public class128(int arg0, int arg1, int arg2, int arg3) {
        this.field1736 = arg2;
        this.field1735 = arg1;
        this.field1730 = arg3;
        this.field1734 = arg0;
    }
}
