import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class269 extends class262 {

    @OriginalMember(owner = "client!gia", name = "I", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!gia", name = "J", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!gia", name = "K", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!gia", name = "L", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!gia", name = "M", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!gia", name = "N", descriptor = "[B")
    private byte[] field3333;

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(BIII)[B")
    public final byte[] method1605(byte arg0, int arg1, int arg2, int arg3) {
        field3330++;
        int var5 = -24 / ((65 - arg0) / 38);
        this.field3333 = new byte[arg1 * arg2 * arg3 * 2];
        this.method3296((byte) -48, arg3, arg2, arg1);
        return this.field3333;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILha;IIIII)Lka;")
    public static final class470 method1606(int arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3332++;
        long var7 = (long) arg6;
        class470 var9 = (class470) class430.field6248.method3538(var7, 0);
        short var10 = 2055;
        if (var9 == null) {
            class260 var11 = class359.method2109(4763, 0, class557.field7980, arg6);
            if (var11 == null) {
                return null;
            }
            if (var11.field3182 < 13) {
                var11.method1568(2, (byte) -17);
            }
            var9 = arg1.method383(var11, var10, class120.field1257, 64, 768);
            class430.field6248.method3537(110, var7, var9);
        }
        class470 var12 = var9.method237((byte) 2, var10, true);
        if (arg5 != 0) {
            var12.method211(arg5);
        }
        if (arg2 != 0) {
            var12.method204(arg2);
        }
        if (arg4 != 0) {
            var12.method214(arg4);
        }
        int var13 = 27 % ((arg0 - 32) / 42);
        if (arg3 != 0) {
            var12.method195(0, arg3, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIB)V")
    public final void method1574(int arg0, int arg1, byte arg2) {
        field3329++;
        int var4 = arg0 * 2;
        if (arg1 == 3) {
            byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
            this.field3333[var4++] = var5;
            this.field3333[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IBI)V")
    public static final void method1607(int arg0, byte arg1, int arg2) {
        field3328++;
        if (class99.field1034 == class15.field130) {
            if (class647.method3689(false, 0, -2, arg0, 1, 1, 0, arg2, (byte) -80)) {
                return;
            }
            class647.method3689(false, 0, -3, arg0, 1, 1, 0, arg2, (byte) -80);
        } else if (class647.method3689(false, 0, -3, arg0, 1, 1, 0, arg2, (byte) -80)) {
            return;
        } else {
            class647.method3689(false, 0, -2, arg0, 1, 1, 0, arg2, (byte) -80);
        }
        if (arg1 == -24) {
            ;
        }
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V")
    public class269() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI)Ltp;")
    public static final class532 method1608(byte arg0, int arg1) {
        field3331++;
        if (arg0 != -72) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class643.field9209[var2] == null || class643.field9209[var2][var3] == null) {
            boolean var4 = class650.method3697(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class643.field9209[var2][var3];
    }
}
