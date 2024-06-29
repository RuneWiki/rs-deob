import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class430 {

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Lqj;")
    private class535 field6228 = new class535(128);

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "Luq;")
    private class172 field6224;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field6223 = 0;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)Lwga;")
    public static final class778 method2582(boolean arg0) {
        field6226++;
        if (!arg0) {
            method2582(true);
        }
        class778 var1 = (class778) class626.field8485.method152((byte) -13);
        if (var1 != null) {
            var1.method1102((byte) 79);
            var1.method3659(1);
            return var1;
        }
        class778 var2;
        do {
            var2 = (class778) class119.field1611.method152((byte) -13);
            if (var2 == null) {
                return null;
            }
            if (var2.method4277((byte) 118) > class401.method2440(false)) {
                return null;
            }
            var2.method1102((byte) 76);
            var2.method3659(1);
        } while ((var2.field8883 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Lbc;")
    public final class385 method2583(int arg0, int arg1) {
        field6222++;
        class535 var3 = this.field6228;
        class385 var4;
        synchronized (this.field6228) {
            var4 = (class385) this.field6228.method3109((byte) 108, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6224.method1188(class778.method4272(9601, arg1), -18047, class742.method4077(-17388, arg1));
        if (arg0 <= 122) {
            return null;
        }
        class385 var6 = new class385();
        if (var5 != null) {
            var6.method2400(new class254(var5), (byte) 115);
        }
        class535 var7 = this.field6228;
        synchronized (this.field6228) {
            this.field6228.method3108((long) arg1, 16337, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lkw;ILuq;)V")
    public class430(class263 arg0, int arg1, class172 arg2) {
        this.field6224 = arg2;
        if (this.field6224 != null) {
            int var4 = this.field6224.method1193(true) - 1;
            this.field6224.method1175(var4, (byte) 89);
        }
    }
}
