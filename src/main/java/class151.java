import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class151 extends class646 {

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V", line = 5)
    public static final void method1149(int arg0) {
        class5.field46 = new class684(8);
        ++field2535;
        class443.field6423 = 0;
        if (arg0 == 2409) {
            for (class635 var1 = (class635) class18.field268.method3313((byte) 99); var1 != null; var1 = (class635) class18.field268.method3308(-111)) {
                var1.method3578();
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Ljava/lang/String;", line = 28)
    public static final String method1150(int arg0, int arg1) {
        ++field2536;
        if (arg1 != -1469107176) {
            method1149(67);
        }
        return (arg0 >> 24 & 255) + "." + ((arg0 & 16760107) >> 16) + "." + ((65532 & arg0) >> 8) + "." + (255 & arg0);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 39)
    public class151() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IB)[I", line = 42)
    public final int[] method424(int arg0, byte arg1) {
        ++field2537;
        int[] var3 = super.field9156.method2193(arg1 ^ -1155, arg0);
        if (super.field9156.field5075) {
            class553.method3238(var3, 0, class89.field1330, class78.field1195[arg0]);
        }
        if (arg1 != -120) {
            this.method424(-96, (byte) -115);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)Z", line = 64)
    public static final boolean method1151(int arg0, int arg1, byte arg2) {
        ++field2538;
        if (arg2 != -49) {
            method1151(-77, -61, (byte) 83);
        }
        if (~arg1 <= -1 && ~arg0 <= -1 && class548.field8052[1].length > arg1 && class548.field8052[1][arg1].length > arg0) {
            return ~(2 & class548.field8052[1][arg1][arg0]) != -1;
        } else {
            return false;
        }
    }
}
