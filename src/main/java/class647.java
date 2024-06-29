import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class647 extends class501 {

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "[B")
    public byte[] field9394;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    public static int field9400 = 2;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "Lwf;")
    public static class117 field9397 = new class117(4);

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    public static int field9402 = 0;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "Lkda;")
    public static class328 field9401;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method3728(int arg0, int arg1, byte arg2) {
        if (arg2 == -9) {
            field9398++;
            return (class408.method2397((byte) 59, arg1, arg0) | class638.method3697(arg1, (byte) -128, arg0) | class222.method1436(arg1, arg0, (byte) 2)) & class52.method311(arg0, (byte) 117, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V", line = 16)
    public static final void method3729(int arg0, int arg1, int arg2) {
        if (arg1 != 564038760) {
            method3730(null, 113, 53, 74);
        }
        field9395++;
        class221 var3 = class65.method413(14, arg0, (byte) -85);
        var3.method1426((byte) 21);
        var3.field3214 = arg2;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "([B)V", line = 30)
    public class647(byte[] arg0) {
        this.field9394 = arg0;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "([BIII)I", line = 43)
    public static final int method3730(byte[] arg0, int arg1, int arg2, int arg3) {
        field9396++;
        if (arg1 != -26639) {
            method3728(-100, -107, (byte) -8);
        }
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class50.field588[(arg0[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)I", line = 66)
    public static final int method3731(byte arg0, int arg1) {
        field9399++;
        if (arg1 < 96) {
            return 0;
        } else {
            if (arg0 <= 26) {
                field9401 = null;
            }
            return arg1 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 91)
    public static void method3732(byte arg0) {
        field9397 = null;
        int var1 = 73 / ((arg0 - 66) / 48);
        field9401 = null;
    }
}
