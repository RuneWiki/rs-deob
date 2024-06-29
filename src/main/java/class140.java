import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class140 extends class444 {

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "B")
    public byte field1866;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "B")
    public byte field1860;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "S")
    public short field1871;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public int field1862;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "S")
    public short field1863;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public int field1867;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Z")
    public boolean field1861;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "S")
    public short field1874;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "S")
    public short field1868;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[[B")
    public static byte[][] field1870;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)Z", line = 3)
    public static final boolean method935(byte arg0, int arg1) {
        if (arg0 <= 110) {
            return true;
        } else {
            field1864++;
            return arg1 == 2 || arg1 == 4 || arg1 == 5;
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(Z)V", line = 19)
    public static final void method936(boolean arg0) {
        field1859++;
        class134.method908(10, 2);
        class439.method2661(-63);
        System.gc();
        if (!arg0) {
            method939(92);
        }
    }

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "(I)V", line = 33)
    public static final void method937(int arg0) {
        field1872++;
        class235.field3332.method386(1206);
        for (int var1 = 0; var1 < 32; var1++) {
            class215.field3036[var1] = 0L;
        }
        if (arg0 < 95) {
            field1869 = 108;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class229.field3258[var2] = 0L;
        }
        class435.field6594 = 0;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V", line = 63)
    public void method938(byte arg0) {
        field1865++;
        if (arg0 != -47) {
            this.field1871 = -40;
        }
    }

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)V", line = 81)
    public static void method939(int arg0) {
        if (arg0 != 5) {
            method937(-77);
        }
        field1870 = null;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 94)
    public class140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field1866 = (byte) arg0;
        this.field1860 = arg9;
        this.field1873 = arg2;
        this.field1871 = (short) arg5;
        this.field1862 = arg3;
        this.field1863 = (short) arg6;
        this.field1867 = arg1;
        this.field1861 = arg8;
        this.field1874 = (short) arg7;
        this.field1868 = (short) arg4;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)I")
    public abstract int method174(byte arg0);
}
