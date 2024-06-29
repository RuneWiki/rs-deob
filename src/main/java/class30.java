import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class30 {

    @OriginalMember(owner = "client!iha", name = "q", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "S")
    public short field340;

    @OriginalMember(owner = "client!iha", name = "l", descriptor = "S")
    public short field348;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!iha", name = "n", descriptor = "Z")
    public boolean field350;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "B")
    public byte field339;

    @OriginalMember(owner = "client!iha", name = "o", descriptor = "S")
    public short field351;

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "F")
    public static float field338;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!iha", name = "m", descriptor = "Lfea;")
    public static class141 field349;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "Lclient;")
    public static client field343;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V", line = 18)
    public static void method152(int arg0) {
        if (arg0 <= 105) {
            method152(44);
        }
        field349 = null;
        field343 = null;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILtp;II)V", line = 30)
    public static final void method153(int arg0, class532 arg1, int arg2, int arg3) {
        if (arg1.field7582 == 0) {
            arg1.field7615 = arg1.field7622;
        } else if (arg1.field7582 == 1) {
            arg1.field7615 = (arg3 - arg1.field7658) / 2 + arg1.field7622;
        } else if (arg1.field7582 == 2) {
            arg1.field7615 = arg3 - arg1.field7658 - arg1.field7622;
        } else if (arg1.field7582 == 3) {
            arg1.field7615 = arg1.field7622 * arg3 >> 14;
        } else if (arg1.field7582 == 4) {
            arg1.field7615 = (arg1.field7622 * arg3 >> 14) + (arg3 - arg1.field7658) / 2;
        } else {
            arg1.field7615 = arg3 - (arg1.field7622 * arg3 >> 14) - arg1.field7658;
        }
        field337++;
        if (arg0 != -3334) {
            field349 = null;
        }
        if (arg1.field7693 == 0) {
            arg1.field7641 = arg1.field7583;
        } else if (arg1.field7693 == 1) {
            arg1.field7641 = (arg2 - arg1.field7573) / 2 + arg1.field7583;
        } else if (arg1.field7693 == 2) {
            arg1.field7641 = arg2 - arg1.field7583 - arg1.field7573;
        } else if (arg1.field7693 == 3) {
            arg1.field7641 = arg1.field7583 * arg2 >> 14;
        } else if (arg1.field7693 == 4) {
            arg1.field7641 = (arg2 - arg1.field7573) / 2 + (arg1.field7583 * arg2 >> 14);
        } else {
            arg1.field7641 = arg2 - arg1.field7573 - (arg1.field7583 * arg2 >> 14);
        }
        if (!class19.field164 || client.method1779(arg1).field10498 == 0 && arg1.field7543 != 0) {
            return;
        }
        if (arg1.field7641 < 0) {
            arg1.field7641 = 0;
        } else if (arg2 < (arg1.field7641 + arg1.field7573)) {
            arg1.field7641 = arg2 - arg1.field7573;
        }
        if (arg1.field7615 < 0) {
            arg1.field7615 = 0;
        } else if (arg3 < (arg1.field7658 + arg1.field7615)) {
            arg1.field7615 = arg3 - arg1.field7658;
            return;
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 107)
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field353 = arg0;
        this.field341 = arg1;
        this.field347 = arg11;
        this.field340 = (short) arg5;
        this.field348 = (short) arg6;
        this.field342 = arg2;
        this.field350 = arg10;
        this.field346 = arg3;
        this.field339 = (byte) arg8;
        this.field351 = (short) arg4;
    }
}
