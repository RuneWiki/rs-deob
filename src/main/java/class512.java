import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class512 {

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "B")
    public byte field7194;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "B")
    public byte field7195;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "S")
    public short field7201;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "Lcd;")
    public class283 field7199;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "Lba;")
    public static class351 field7200 = new class351(2);

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field7203 = 0;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "Lr;")
    public static class166 field7202;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BILjava/lang/String;IZ)V", line = 5)
    public static final void method2929(byte arg0, int arg1, String arg2, int arg3, boolean arg4) {
        if (arg0 >= -94) {
            method2931(68, 55);
        }
        field7198++;
        class693.method3809(20644, null, false, arg1, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 16)
    public static void method2930(int arg0) {
        if (arg0 != 2) {
            field7200 = null;
        }
        field7202 = null;
        field7200 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V", line = 35)
    public static final void method2931(int arg0, int arg1) {
        field7196++;
        if (arg1 > 58) {
            class191 var2 = class6.method38(11, -127, arg0);
            var2.method1284((byte) -48);
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lcd;III)V", line = 49)
    public class512(class283 arg0, int arg1, int arg2, int arg3) {
        this.field7194 = (byte) arg3;
        this.field7195 = (byte) arg2;
        this.field7201 = (short) arg1;
        this.field7199 = arg0;
    }
}
