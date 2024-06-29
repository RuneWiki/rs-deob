import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class92 extends class601 {

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "[I")
    public static int[] field1282 = new int[2];

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IB)I", line = 6)
    public final int method36(int arg0, byte arg1) {
        ++field1284;
        if (arg1 != 22) {
            this.method630(-32);
        }
        return 1;
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(ILqea;)V", line = 21)
    public class92(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V", line = 25)
    public final void method41(byte arg0) {
        ++field1283;
        int var2 = 49 / ((arg0 - 59) / 33);
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V", line = 41)
    public static void method629(int arg0) {
        int var1 = 71 / ((arg0 - -54) / 36);
        field1282 = null;
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lqea;)V", line = 52)
    public class92(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(II)V", line = 56)
    public final void method43(int arg0, int arg1) {
        ++field1280;
        super.field8131 = arg1;
        int var3 = 23 % ((arg0 - 22) / 34);
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)I", line = 66)
    public final int method630(int arg0) {
        ++field1279;
        if (arg0 != 0) {
            field1282 = null;
        }
        return super.field8131;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)I", line = 77)
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            field1282 = null;
        }
        ++field1281;
        return 0;
    }
}
