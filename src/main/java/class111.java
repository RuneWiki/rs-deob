import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class111 extends class465 implements class36 {

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    private int field1773;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIBIIIIILr;[[[BIII)V")
    public static final void method1030(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class167 arg8, byte[][][] arg9, int arg10, int arg11, int arg12) {
        ++field1770;
        if (arg0 != 0 && ~arg10 != -1) {
            if (~arg0 == -10) {
                arg0 = 1;
                arg1 = 3 & arg1 + 1;
            }
            if (arg0 == 10) {
                arg0 = 1;
                arg1 = 3 & arg1 + 3;
            }
            if (~arg0 == -12) {
                arg1 = arg1 + 3 & 3;
                arg0 = 8;
            }
            int var13 = -30 % ((arg2 - -6) / 50);
            arg8.method283(arg6, arg3, arg5, arg11, arg4, arg12, arg9[arg0 - 1][arg1], arg10, arg7);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)I")
    public final int method469(boolean arg0) {
        if (!arg0) {
            this.field1773 = 51;
        }
        ++field1772;
        return this.field1773;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B[BII)V")
    public final void method472(byte arg0, byte[] arg1, int arg2, int arg3) {
        ++field1776;
        this.method2900(arg1, arg3);
        this.field1773 = arg2;
        int var5 = 15 % ((arg0 - -48) / 48);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZILcw;II)V")
    public static final void method1031(boolean arg0, int arg1, class165 arg2, int arg3, int arg4) {
        ++field1775;
        if (arg0) {
            arg2.field2776.method82(false, arg3);
            arg2.field2776.method25(arg0, arg4);
            arg2.field2776.method76(false, arg1);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I")
    public final int method470(int arg0) {
        if (arg0 != -2834) {
            this.field1773 = -128;
        }
        ++field1774;
        return 0;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Ler;I[BI)V")
    public class111(class92 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1773 = arg1;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Ler;ILjaclib/memory/Buffer;)V")
    public class111(class92 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field1773 = arg1;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(Z)I")
    public static final int method1032(boolean arg0) {
        if (!arg0) {
            method1032(true);
        }
        ++field1777;
        return class427.field6492++;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(Z)J")
    public final long method471(boolean arg0) {
        if (!arg0) {
            return -9L;
        } else {
            ++field1771;
            return super.field6933.getAddress();
        }
    }
}
