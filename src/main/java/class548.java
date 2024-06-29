import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class548 extends class143 {

    @OriginalMember(owner = "client!kea", name = "M", descriptor = "Lkfa;")
    private class382 field8051;

    @OriginalMember(owner = "client!kea", name = "E", descriptor = "I")
    public int field8043;

    @OriginalMember(owner = "client!kea", name = "C", descriptor = "J")
    private long field8041;

    @OriginalMember(owner = "client!kea", name = "H", descriptor = "I")
    public static int field8046 = 0;

    @OriginalMember(owner = "client!kea", name = "F", descriptor = "I")
    public static int field8044 = 0;

    @OriginalMember(owner = "client!kea", name = "A", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!kea", name = "B", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!kea", name = "D", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!kea", name = "G", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!kea", name = "I", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!kea", name = "J", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!kea", name = "K", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!kea", name = "L", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!kea", name = "O", descriptor = "[[[B")
    public static byte[][][] field8052;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lqda;B)I")
    public static final int method3213(class689 arg0, byte arg1) {
        field8050++;
        if (class689.field9766 == arg0) {
            return 5120;
        } else if (class689.field9769 == arg0) {
            return 5122;
        } else if (class689.field9770 == arg0) {
            return 5124;
        } else if (class689.field9771 == arg0) {
            return 5121;
        } else if (class689.field9772 == arg0) {
            return 5123;
        } else if (class689.field9773 == arg0) {
            return 5125;
        } else if (class689.field9774 == arg0) {
            return 5131;
        } else if (class689.field9775 == arg0) {
            return 5126;
        } else if (arg1 >= -34) {
            return 82;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(B)V")
    public static void method3214(byte arg0) {
        field8052 = null;
        if (arg0 < 121) {
            method3216(40, 60);
        }
    }

    @OriginalMember(owner = "client!kea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3217((byte) -96);
        field8049++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(III)Lbda;")
    public static final class197 method3215(int arg0, int arg1, int arg2) {
        class293 var3 = class541.field7946[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4095;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)V")
    public static final void method3216(int arg0, int arg1) {
        if (arg0 != 5124) {
            field8052 = null;
        }
        field8042++;
        class449 var2 = class611.method3463(arg1, (byte) -119, 8);
        var2.method2614(arg0 - 5050);
    }

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "(B)V")
    private final void method3217(byte arg0) {
        if (arg0 >= -53) {
            return;
        }
        if (this.field8041 > 0L) {
            this.field8051.field5323.releasePbuffer(this.field8041);
            this.field8041 = 0L;
        }
        field8045++;
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(III)Z")
    public static final boolean method3218(int arg0, int arg1, int arg2) {
        field8047++;
        if (arg0 != 0) {
            field8046 = -28;
        }
        return class636.method3591(arg0 - 9676, arg1, arg2) || class621.method3504(arg1, arg2, -84);
    }

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "(B)J")
    public final long method3219(byte arg0) {
        if (arg0 == 0) {
            field8048++;
            return this.field8041;
        } else {
            return 75L;
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lkfa;II)V")
    public class548(class382 arg0, int arg1, int arg2) {
        this.field8051 = arg0;
        this.field8043 = arg1 * arg2;
        this.field8041 = this.field8051.field5323.createPbuffer(arg1, arg2);
    }
}
