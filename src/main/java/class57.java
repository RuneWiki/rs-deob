import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class57 extends class69 {

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field957 = 0;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lha;")
    public static class46 field955 = class271.method1828("::rect_debug", -46);

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[I")
    public int[] field952;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "[I")
    public int[] field954;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "[I")
    public int[] field961;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[Lmc;")
    public class165[] field949;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[Lmc;")
    public class165[] field953;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "[[[B")
    public byte[][][] field963;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
    public static final int method393(int arg0) {
        field956++;
        if (arg0 != 2) {
            field955 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILhi;)Lha;")
    public static final class46 method394(int arg0, class24 arg1) {
        field962++;
        int var2 = 112 % ((4 - arg0) / 43);
        if (class189.method1370(client.method1811(arg1), false) == 0) {
            return null;
        } else if (arg1.field353 == null || arg1.field353.method303(0).method314(110) == 0) {
            return class40.field701 ? class4.field68 : null;
        } else {
            return arg1.field353;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static void method395(int arg0) {
        if (arg0 < -64) {
            field955 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I)[I")
    public static final int[] method396(int arg0, int[] arg1) {
        field951++;
        if (arg0 != -1) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class104.method784(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)J")
    public static final long method397(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        return var3 == null || var3.field3607 == null ? 0L : var3.field3607.field3272;
    }
}
