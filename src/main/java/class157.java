import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class157 {

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "Z")
    private boolean field1726;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "Z")
    private boolean field1727;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    private int field1725;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
    private int field1733;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "[I")
    public static int[] field1730 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method967(int arg0) {
        if (arg0 == 4) {
            field1728++;
            return this.field1727;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V", line = 14)
    public static void method968(byte arg0) {
        if (arg0 > 23) {
            field1730 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZI)B", line = 24)
    public static final byte method969(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1729 = -108;
        }
        field1723++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)I", line = 47)
    public final int method970(byte arg0) {
        if (arg0 > -68) {
            this.method972(23);
        }
        field1732++;
        return this.field1733;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I", line = 58)
    public final int method971(int arg0) {
        if (arg0 == -1) {
            field1731++;
            return this.field1725;
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)Z", line = 78)
    public final boolean method972(int arg0) {
        field1724++;
        if (arg0 != 1) {
            this.method971(8);
        }
        return this.field1726;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(ZIIZ)V", line = 89)
    public class157(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field1726 = arg0;
        this.field1727 = arg3;
        this.field1725 = arg2;
        this.field1733 = arg1;
    }
}
