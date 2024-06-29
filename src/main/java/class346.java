import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class346 {

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public int field4458;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "[Llba;")
    public class515[] field4457;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1996(String arg0, byte arg1) {
        field4460++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        int var5 = -38 / ((6 - arg1) / 50);
        return var3;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
    public static final byte[] method1997(int arg0, int arg1, int arg2, Object arg3) {
        field4456++;
        if (arg2 != -21928) {
            return null;
        } else if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class210.method1236(0, arg0, arg1, var4);
        } else if (arg3 instanceof class29) {
            class29 var5 = (class29) arg3;
            return var5.method182((byte) 41, arg0, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILmc;I)V")
    public static final void method1998(int arg0, int arg1, int arg2, class124 arg3, int arg4) {
        arg3.field1516.method3061(arg0, (byte) 115);
        field4454++;
        arg3.field1516.method3065(-1, arg4);
        if (arg2 == -1100097275) {
            arg3.field1516.method3051(true, arg1);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljd;ZLji;)Llba;")
    private final class515 method1999(class216 arg0, boolean arg1, class572 arg2) {
        field4455++;
        if (class653.field8904 == arg0) {
            return class380.method2186(arg2, (byte) 27);
        } else if (class256.field3285 == arg0) {
            return class580.method3207(arg2, true);
        } else if (class435.field5476 == arg0) {
            return class196.method1150(arg2, 69);
        } else if (class300.field3807 == arg0) {
            return class711.method3908(arg2, (byte) -123);
        } else {
            if (!arg1) {
                this.field4457 = null;
            }
            if (class45.field613 == arg0) {
                return class75.method601(arg2, true);
            } else if (class89.field1148 == arg0) {
                return class41.method256(7, arg2);
            } else if (class146.field1748 == arg0) {
                return class416.method2318(arg2, -121);
            } else if (class677.field9226 == arg0) {
                return class241.method1444(arg2, -12516);
            } else if (class340.field4342 == arg0) {
                return class160.method986(0, arg2);
            } else if (class613.field8335 == arg0) {
                return class300.method1791(arg2, -22650);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lji;I)V")
    public final void method2000(class572 arg0, int arg1) {
        this.field4453 = arg0.method3059(1);
        field4459++;
        this.field4458 = arg0.method3031(-1);
        this.field4457 = new class515[arg0.method3097((byte) 12)];
        class216[] var3 = class36.method237(arg1 ^ 0x479A);
        if (arg1 == 7680) {
            for (int var4 = 0; var4 < this.field4457.length; var4++) {
                this.field4457[var4] = this.method1999(var3[arg0.method3097((byte) 12)], true, arg0);
            }
        }
    }
}
