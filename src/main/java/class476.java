import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class476 extends class722 {

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field6619 = 0;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    public int field6622;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "Ltk;")
    public class364 field6620;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "Ldr;")
    public static class751 field6616;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "[B")
    public byte[] field6618;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "[[B")
    public static byte[][] field6617;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V")
    public static void method2785(int arg0) {
        field6617 = null;
        if (arg0 != 15) {
            field6616 = null;
        }
        field6616 = null;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(B)[B")
    public final byte[] method1123(byte arg0) {
        ++field6623;
        if (super.field10051) {
            throw new RuntimeException();
        } else {
            if (arg0 > -106) {
                field6616 = null;
            }
            return this.field6618;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(III)V")
    public static final void method2786(int arg0, int arg1, int arg2) {
        ++field6621;
        class16 var3 = class94.method753(15, 13175, 0L);
        if (arg2 > -6) {
            method2785(63);
        }
        var3.method119(-66);
        var3.field244 = arg0;
        var3.field237 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)I")
    public final int method1120(int arg0) {
        ++field6614;
        if (arg0 >= -7) {
            this.method1120(-48);
        }
        return super.field10051 ? 0 : 100;
    }
}
