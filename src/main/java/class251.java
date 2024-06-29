import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class251 {

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "B")
    public byte field3721;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "Z")
    public boolean field3714;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "S")
    public short field3718;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "S")
    public short field3722;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public int field3717;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "S")
    public short field3724;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3720 = null;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "Lda;")
    public static class66 field3716;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lor;III)V", line = 5)
    public static final void method1682(class668 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field9359 == 0) {
            arg0.field9257 = arg0.field9328;
        } else if (arg0.field9359 == 1) {
            arg0.field9257 = (arg1 - arg0.field9297) / 2 + arg0.field9328;
        } else if (arg0.field9359 == 2) {
            arg0.field9257 = arg1 - arg0.field9297 - arg0.field9328;
        } else if (arg0.field9359 == 3) {
            arg0.field9257 = arg0.field9328 * arg1 >> 14;
        } else if (arg0.field9359 == 4) {
            arg0.field9257 = (arg0.field9328 * arg1 >> 14) + (arg1 - arg0.field9297) / 2;
        } else {
            arg0.field9257 = arg1 - arg0.field9297 - (arg0.field9328 * arg1 >> 14);
        }
        if (arg0.field9392 == 0) {
            arg0.field9242 = arg0.field9225;
        } else if (arg0.field9392 == 1) {
            arg0.field9242 = (arg2 - arg0.field9282) / 2 + arg0.field9225;
        } else if (arg0.field9392 == 2) {
            arg0.field9242 = arg2 - arg0.field9225 - arg0.field9282;
        } else if (arg0.field9392 == 3) {
            arg0.field9242 = arg0.field9225 * arg2 >> 14;
        } else if (arg0.field9392 == 4) {
            arg0.field9242 = (arg0.field9225 * arg2 >> 14) + (arg2 - arg0.field9282) / 2;
        } else {
            arg0.field9242 = arg2 - (arg0.field9225 * arg2 >> 14) - arg0.field9282;
        }
        field3723++;
        if (arg3 != 2) {
            method1683((byte) 8);
        }
        if (!class688.field9683 || client.method2022(arg0).field1521 == 0 && arg0.field9353 != 0) {
            return;
        }
        if (arg0.field9257 < 0) {
            arg0.field9257 = 0;
        } else if ((arg0.field9257 + arg0.field9297) > arg1) {
            arg0.field9257 = arg1 - arg0.field9297;
        }
        if (arg0.field9242 < 0) {
            arg0.field9242 = 0;
        } else if (arg0.field9282 + arg0.field9242 > arg2) {
            arg0.field9242 = arg2 - arg0.field9282;
            return;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V", line = 85)
    public static void method1683(byte arg0) {
        field3720 = null;
        field3716 = null;
        if (arg0 != 3) {
            method1683((byte) 35);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZLjava/lang/String;ZILjava/lang/String;BZIIJIIJ)V", line = 97)
    public static final void method1684(boolean arg0, String arg1, boolean arg2, int arg3, String arg4, byte arg5, boolean arg6, int arg7, int arg8, long arg9, int arg10, int arg11, long arg12) {
        field3711++;
        if (!class526.field7216 && class746.field10297 < 500) {
            int var15 = arg11 == -1 ? class660.field9129 : arg11;
            class275 var16 = new class275(arg1, arg4, var15, arg8, arg3, arg12, arg7, arg10, arg6, arg0, arg9, arg2);
            class354.method2238(1, var16);
            int var17 = 2 % ((-arg5 - 11) / 56);
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 124)
    public class251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3721 = (byte) arg8;
        this.field3712 = arg0;
        this.field3719 = arg1;
        this.field3714 = arg10;
        this.field3718 = (short) arg5;
        this.field3722 = (short) arg6;
        this.field3715 = arg2;
        this.field3717 = arg11;
        this.field3724 = (short) arg4;
        this.field3713 = arg3;
    }
}
