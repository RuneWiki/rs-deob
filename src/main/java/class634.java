import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class634 {

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Ltt;")
    public static class338 field8769 = new class338(64, 3);

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Z")
    public static boolean field8770 = true;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lrc;")
    public class29 field8767;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lri;")
    public class634 field8764;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lga;B)V", line = 5)
    public static final void method3511(class332 arg0, byte arg1) {
        class376.field4982 = 0;
        class33.field465 = 0;
        field8768++;
        class251.field3302 = new class204();
        class324.field4368 = new class145[1024];
        class163.field2347 = new class514[class16.field218[class310.field4194] + 1];
        class308.field4139 = 0;
        if (arg1 > -38) {
            method3511(null, (byte) 89);
        }
        class348.field4634 = 0;
        class149.method871((byte) 67, arg0);
        class181.method1212(arg0, -2);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 27)
    public static void method3512(byte arg0) {
        if (arg0 <= 105) {
            field8770 = true;
        }
        field8769 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIILtc;Lr;I)V", line = 39)
    public static final void method3513(byte arg0, int arg1, int arg2, class600 arg3, class562 arg4, int arg5) {
        field8771++;
        class55 var6 = class291.field3852.method1013(arg3.field8300, (byte) 124);
        if (var6.field717 == -1) {
            return;
        }
        int var8;
        if (arg3.field8352) {
            int var7 = arg3.field8296 + arg5;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        if (arg0 != 86) {
            method3514(25, null, 57);
        }
        class532 var9 = var6.method326(arg3.field8258, var8, arg4, arg0 ^ 0x40056);
        if (var9 == null) {
            return;
        }
        int var10 = arg3.field8290;
        int var11 = arg3.field8343;
        if ((var8 & 0x1) == 1) {
            var11 = arg3.field8290;
            var10 = arg3.field8343;
        }
        int var12 = var9.method523();
        int var13 = var9.method532();
        if (var6.field718) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field722 == 0) {
            var9.method2993(arg1, arg2 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method2991(arg1, arg2 + 4 - (var11 * 4), var12, var13, 0, var6.field722 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILga;I)Lifa;", line = 93)
    public static final class147 method3514(int arg0, class332 arg1, int arg2) {
        field8765++;
        if (arg0 == 1) {
            byte[] var3 = arg1.method1946(0, arg2);
            return var3 == null ? null : new class147(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 114)
    public final void method3515(int arg0) {
        field8766++;
        if (arg0 == 1 && class316.field4236 < 500) {
            this.field8764 = class117.field1492;
            this.field8767 = null;
            class316.field4236++;
            class117.field1492 = this;
        }
    }
}
