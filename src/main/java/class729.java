import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class729 extends class226 {

    @OriginalMember(owner = "client!sha", name = "Q", descriptor = "I")
    public static int field10110 = 4;

    @OriginalMember(owner = "client!sha", name = "M", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!sha", name = "O", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!sha", name = "P", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!sha", name = "R", descriptor = "I")
    public static int field10111;

    @OriginalMember(owner = "client!sha", name = "S", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!sha", name = "N", descriptor = "[B")
    private byte[] field10107;

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method4088(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10112++;
        class302 var8 = null;
        for (class302 var9 = (class302) class409.field5677.method21(2); var9 != null; var9 = (class302) class409.field5677.method9(-128)) {
            if (var9.field4283 == arg4 && var9.field4286 == arg0 && var9.field4289 == arg6 && var9.field4284 == arg1) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class302();
            var8.field4286 = arg0;
            var8.field4284 = arg1;
            var8.field4289 = arg6;
            var8.field4283 = arg4;
            if (arg0 >= 0 && arg6 >= 0 && class719.field10004 > arg0 && arg6 < class107.field1453) {
                class207.method1382(var8, false);
            }
            class409.field5677.method11(var8, -121);
        }
        var8.field4279 = true;
        var8.field4280 = arg2;
        var8.field4285 = arg5;
        var8.field4288 = false;
        if (arg7 <= 59) {
            field10110 = -125;
        }
        var8.field4275 = arg3;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BIB)V")
    public final void method1443(byte arg0, int arg1, byte arg2) {
        if (arg2 != -111) {
            return;
        }
        field10108++;
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field10107[var10001] = -1;
        this.field10107[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILbk;BIII)V")
    public static final void method4089(int arg0, class379 arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 48) {
            method4089(74, null, (byte) 107, -118, 30, 51);
        }
        field10109++;
        if (arg0 < 1 || arg5 < 1 || arg0 > class719.field10004 - 2 || (class107.field1453 - 2) < arg5) {
            return;
        }
        if (class660.field8718 == null) {
            return;
        }
        class624 var6 = class491.field6656.method2284(false, arg0, arg5, arg4, arg3);
        if (var6 == null) {
            return;
        }
        if (var6 instanceof class284) {
            ((class284) var6).method1753(arg1, arg2 - 48);
            return;
        }
        if (!(var6 instanceof class462)) {
            if ((var6 instanceof class435)) {
                ((class435) var6).method2503((byte) 123, arg1);
            } else if (var6 instanceof class353) {
                ((class353) var6).method2115((byte) -124, arg1);
                return;
            }
            return;
        }
        ((class462) var6).method2623(arg1, (byte) -127);
        return;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBII)[B")
    public final byte[] method4090(int arg0, byte arg1, int arg2, int arg3) {
        this.field10107 = new byte[arg2 * arg3 * arg0 * 2];
        field10106++;
        this.method3292(arg0, arg3, arg2, 0);
        if (arg1 < 111) {
            this.field10107 = null;
        }
        return this.field10107;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLft;)Lft;")
    public static final class3 method4091(byte arg0, class3 arg1) {
        field10111++;
        class3 var2 = arg1 == null ? new class3() : new class3(arg1);
        if (arg0 > -84) {
            field10110 = -57;
        }
        var2.method62(9, (byte) -90, 128);
        return var2;
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "()V")
    public class729() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
