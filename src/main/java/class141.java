import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class141 extends class98 {

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    private int field1748;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field1738 = 0;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field1739 = 2;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field1743 = 0;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "Z")
    public static boolean field1741 = false;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "Llg;")
    public static class237 field1742 = new class237(64);

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "Lpc;")
    public static class402 field1740;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "[[[B")
    public static byte[][][] field1747;

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V", line = 14)
    public class141(int arg0) {
        super(0, true);
        this.field1748 = 4096;
        this.field1748 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)I", line = 24)
    public static final int method861(byte arg0, int arg1) {
        ++field1744;
        int var2 = 116 / ((arg0 - 64) / 44);
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)[I", line = 36)
    public final int[] method83(int arg0, int arg1) {
        ++field1745;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            class316.method2073(var3, 0, class268.field3811, this.field1748);
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)V", line = 59)
    public static void method862(boolean arg0) {
        field1740 = null;
        field1742 = null;
        if (!arg0) {
            field1747 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 74)
    public class141() {
        this(4096);
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V", line = 88)
    public static final void method863(int arg0) {
        if (arg0 != -31174) {
            method861((byte) -118, -28);
        }
        ++field1746;
        class72.field867.method1626((byte) 106);
        class392.field5521.method1626((byte) 106);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILdg;I)V", line = 101)
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field1749;
        if (~arg0 == -1) {
            this.field1748 = (arg1.method1574(-91) << 12) / 255;
        }
        if (arg2 != 0) {
            field1747 = null;
        }
    }
}
