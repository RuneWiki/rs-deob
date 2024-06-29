import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public abstract class class618 {

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "[I")
    public static int[] field8641 = new int[1];

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Lfba;")
    public static class27 field8640 = new class27(36, 7);

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field8643 = 0;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public static int field8645 = 0;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field8644 = 0;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Leca;")
    public static class790 field8642;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBII)V")
    public static final void method3568(int arg0, byte arg1, int arg2, int arg3) {
        field8636++;
        if (arg1 != -28) {
            method3571((byte) 31);
        }
        class313 var4 = class312.method1998((long) arg2, 9, -1);
        var4.method2001((byte) 98);
        var4.field4464 = arg3;
        var4.field4455 = arg0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8638++;
        if (field8645 <= (arg3 - arg1) && arg1 + arg3 <= class463.field6533 && arg5 - arg1 >= class734.field10153 && (arg1 + arg5) <= class407.field5535) {
            class650.method3721(arg2, arg1, arg5, arg6, arg3, -1, arg4);
        } else {
            class491.method2928(arg2, arg5, arg4, arg6, (byte) 106, arg1, arg3);
        }
        if (arg0 >= -52) {
            method3568(-114, (byte) 27, -126, -1);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Z")
    public static final boolean method3570(int arg0, int arg1) {
        field8639++;
        if (arg0 != -31) {
            field8645 = -103;
        }
        return arg1 == 30 || arg1 == 6 || arg1 == 1004 || arg1 == 5 || arg1 == 3;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public static void method3571(byte arg0) {
        field8641 = null;
        int var1 = -74 % ((-arg0 - 11) / 62);
        field8640 = null;
        field8642 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3572(int arg0, int arg1, byte arg2) {
        if (arg2 < 111) {
            method3571((byte) -39);
        }
        field8637++;
        return (arg1 & 0x34) != 0;
    }
}
