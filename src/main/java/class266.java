import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class266 extends class270 {

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "Z")
    public static boolean field4462 = true;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field4460 = 0;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Ljava/lang/String;")
    public String field4452;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
    public final int method1776(int arg0) {
        int var2 = 120 / ((-67 - arg0) / 36);
        ++field4464;
        return (int) super.field4542;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
    public static final int method1777(int arg0, int arg1, int arg2) {
        ++field4456;
        int var3 = arg2;
        while (arg1 > 0) {
            var3 = var3 << 1 | 1 & arg0;
            arg0 >>>= 1;
            --arg1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
    public final void method1778(int arg0) {
        ++field4459;
        if (arg0 == 17991) {
            super.field4496 = class19.method91((byte) 112) + 500L | Long.MIN_VALUE & super.field4496;
            class14.field157.method3050(this, 2);
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)I")
    public final int method1779(int arg0) {
        ++field4461;
        return arg0 != -143924128 ? 18 : (int) (255L & super.field4542 >>> 32);
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(II)V")
    public class266(int arg0, int arg1) {
        super.field4542 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)J")
    public final long method1780(int arg0) {
        if (arg0 != 0) {
            field4462 = false;
        }
        ++field4455;
        return super.field4496 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)V")
    public final void method1781(byte arg0) {
        ++field4463;
        super.field4496 |= Long.MIN_VALUE;
        if (this.method1780(arg0 + -95) == 0L) {
            class367.field5707.method3050(this, 2);
        }
        if (arg0 != 95) {
            this.field4452 = null;
        }
    }
}
