import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class252 {

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Z")
    public boolean field3479;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "B")
    public byte field3477;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "B")
    public byte field3480;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "S")
    public short field3476;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "S")
    public short field3482;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "S")
    public short field3486;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Lju;")
    public static class102 field3481 = new class102(33, 7);

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Lgca;")
    public static class209 field3488 = new class209(8);

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Z")
    public static boolean field3489 = false;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Ljm;")
    public static class6 field3474;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Z")
    public static boolean field3475;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method1594(int arg0) {
        field3481 = null;
        field3488 = null;
        if (arg0 != 31332) {
            method1594(-51);
        }
        field3474 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1595(int arg0, String arg1, int arg2) {
        class585.field8424++;
        field3487++;
        class120 var3 = class292.method1716(class608.field8668, true, class136.field1827);
        var3.field1653.method184(class678.method3882(arg1, (byte) 109) + arg2, arg2 ^ 0xFFFFFFC1);
        var3.field1653.method162((byte) -105, arg0);
        var3.field1653.method187(arg1, (byte) -112);
        class471.method2805(arg2 + 99, var3);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field3479 = arg9;
        this.field3477 = (byte) arg7;
        this.field3480 = (byte) arg8;
        this.field3476 = (short) arg6;
        this.field3478 = arg10;
        this.field3482 = (short) arg4;
        this.field3486 = (short) arg5;
        this.field3485 = arg0;
    }
}
