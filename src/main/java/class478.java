import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class478 extends class659 {

    @OriginalMember(owner = "client!td", name = "x", descriptor = "J")
    public long field6708;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Ljava/lang/String;")
    public String field6710;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public int field6712;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public int field6711;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Z")
    public boolean field6702;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public int field6713;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public int field6703;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "Z")
    public boolean field6709;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "J")
    public long field6719;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public int field6718;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "Ljava/lang/String;")
    public String field6720;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "Z")
    public boolean field6706;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Ljb;")
    public static class519 field6705 = new class519(17, 6);

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Lmw;")
    public static class517 field6715 = new class517(52, 16);

    @OriginalMember(owner = "client!td", name = "L", descriptor = "Ljb;")
    public static class519 field6721 = new class519(8, 4);

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Lgi;")
    public static class705 field6707;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Ljava/lang/String;")
    public String field6704;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V")
    public static void method2825(byte arg0) {
        field6707 = null;
        field6705 = null;
        if (arg0 < 87) {
            method2826(3, (byte) 67);
        }
        field6721 = null;
        field6715 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I")
    public static final int method2826(int arg0, byte arg1) {
        field6714++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            if (arg1 < 94) {
                field6715 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZILka;Lln;II)V")
    public static final void method2827(boolean arg0, int arg1, class497 arg2, class398 arg3, int arg4, int arg5) {
        field6716++;
        if (arg2 != null) {
            arg3.method2432(768, arg2.method250(), arg2.method265(), arg2.method291(), arg1, arg2.method280(), arg5, arg2.method252(), arg4, arg2.method273(), arg2.method246());
            if (!arg0) {
                method2827(false, -115, null, null, -124, 109);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class478(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field6708 = arg10;
        this.field6710 = arg0;
        this.field6712 = arg6;
        this.field6711 = arg2;
        this.field6702 = arg8;
        this.field6713 = arg7;
        this.field6703 = arg4;
        this.field6709 = arg11;
        this.field6719 = arg5;
        this.field6718 = arg3;
        this.field6720 = arg1;
        this.field6706 = arg9;
    }
}
