import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class60 {

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "[B")
    public static byte[] field626 = new byte[2048];

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Lfu;")
    public class354 field625;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Lqr;")
    public class60 field623;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 6)
    public final void method403(byte arg0) {
        field621++;
        if (class419.field5574 >= 500) {
            return;
        }
        this.field624 = 0;
        this.field623 = class394.field5251;
        this.field625 = null;
        class394.field5251 = this;
        class419.field5574++;
        if (arg0 != -77) {
            field626 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BII)I", line = 29)
    public static final int method404(byte arg0, int arg1, int arg2) {
        field622++;
        int var3 = -85 % ((74 - arg0) / 34);
        int var4 = class569.method3218((byte) 90, arg2 - 1, arg1 + -1) - (-class569.method3218((byte) 98, arg2 + 1, arg1 - 1) - class569.method3218((byte) 101, arg2 - 1, arg1 - -1)) + class569.method3218((byte) 77, arg2 - -1, arg1 + 1);
        int var5 = class569.method3218((byte) 90, arg2 - 1, arg1) + class569.method3218((byte) 88, arg2 + 1, arg1) + class569.method3218((byte) 126, arg2, arg1 + -1) + class569.method3218((byte) 81, arg2, arg1 + 1);
        int var6 = class569.method3218((byte) 104, arg2, arg1);
        return var4 / 16 + var5 / 8 + var6 / 4;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V", line = 45)
    public static void method405(byte arg0) {
        if (arg0 != 8) {
            method405((byte) 112);
        }
        field626 = null;
    }
}
