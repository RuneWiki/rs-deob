import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class291 extends class750 {

    @OriginalMember(owner = "client!gga", name = "w", descriptor = "I")
    private int field4094;

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "I")
    private int field4090;

    @OriginalMember(owner = "client!gga", name = "v", descriptor = "I")
    private int field4093;

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "I")
    private int field4097;

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "I")
    private int field4084;

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
    private int field4088;

    @OriginalMember(owner = "client!gga", name = "u", descriptor = "Lgt;")
    private class453 field4092;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "Z")
    public static boolean field4082 = false;

    @OriginalMember(owner = "client!gga", name = "t", descriptor = "[I")
    public static int[] field4091 = new int[2];

    @OriginalMember(owner = "client!gga", name = "x", descriptor = "Z")
    public static boolean field4095 = false;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "Lnga;")
    public static class510 field4083 = new class510(64);

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!gga", name = "y", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "Lsaa;")
    private class326 field4089;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)V", line = 17)
    public static void method1873(int arg0) {
        if (arg0 != 1) {
            method1876(110);
        }
        field4083 = null;
        field4091 = null;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB)V", line = 32)
    public static final void method1874(int arg0, byte arg1) {
        field4085++;
        class236 var2 = (class236) class160.field2387.method4203(true, (long) arg0);
        if (arg1 > -113) {
            field4087 = -43;
        }
        if (var2 != null) {
            var2.field3344 = !var2.field3344;
            var2.field3348.method3307(var2.field3344, 24);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Lsaa;", line = 52)
    public final class326 method1875(byte arg0) {
        field4096++;
        if (arg0 != 13) {
            this.field4088 = 52;
        }
        if (this.field4089 == null) {
            class623.field8967[5] = this.field4093;
            class623.field8967[1] = this.field4084;
            class623.field8967[4] = this.field4094;
            class623.field8967[0] = this.field4090;
            class623.field8967[3] = this.field4088;
            class149 var2 = this.field4092.field1084;
            class623.field8967[2] = this.field4097;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1152(class623.field8967[var5], arg0 + 15)) {
                    return null;
                }
                class546 var7 = var2.method1154(arg0 - 123, class623.field8967[var5]);
                int var8 = var7.field7706 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field7709 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class130.field1945[var6] = var2.method1151(1.0F, var4, false, -18596, class623.field8967[var6], var4);
            }
            this.field4089 = this.field4092.method1015(var3, var4, false, class130.field1945);
        }
        return this.field4089;
    }

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "(I)Llda;", line = 113)
    public static final class483 method1876(int arg0) {
        if (arg0 != 17210) {
            field4083 = null;
        }
        field4086++;
        class595.field8699 = 0;
        return class394.method2448(0);
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lgt;IIIIII)V", line = 135)
    public class291(class453 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4094 = arg5;
        this.field4090 = arg1;
        this.field4093 = arg6;
        this.field4097 = arg3;
        this.field4084 = arg2;
        this.field4088 = arg4;
        this.field4092 = arg0;
    }
}
