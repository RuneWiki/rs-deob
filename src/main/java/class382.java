import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class382 {

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "I")
    public int field5544 = 0;

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
    public int field5543 = 0;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "Ljr;")
    private class112 field5541 = new class112(64);

    @OriginalMember(owner = "client!aha", name = "l", descriptor = "Lbq;")
    private class292 field5552 = null;

    @OriginalMember(owner = "client!aha", name = "g", descriptor = "Lin;")
    private class91 field5547;

    @OriginalMember(owner = "client!aha", name = "h", descriptor = "Lin;")
    private class91 field5548;

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "J")
    public static long field5546 = -1L;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field5545;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V")
    public static final void method2410(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field5550++;
        if (!class216.field3137) {
            class216.field3137 = true;
            class392.field5766 = true;
            class55.field1119 += (-12.0F - class55.field1119) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IB)Ltd;")
    public final class454 method2411(int arg0, byte arg1) {
        field5542++;
        class454 var3 = (class454) this.field5541.method992((long) arg0, 70);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field5548.method863(-1860, 1, arg0 & 0x7FFF);
        } else {
            var4 = this.field5547.method863(-1860, 1, arg0);
        }
        class454 var5 = new class454();
        var5.field6402 = this;
        if (var4 != null) {
            var5.method2709(new class215(var4), 0);
        }
        if (arg1 >= -86) {
            method2413(-12);
        }
        if (arg0 >= 32768) {
            var5.method2700(false);
        }
        this.field5541.method991(var5, (long) arg0, (byte) -125);
        return var5;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(J[IILoaa;)Ljava/lang/String;")
    public final String method2412(long arg0, int[] arg1, int arg2, class290 arg3) {
        if (arg2 != -1) {
            this.field5547 = null;
        }
        field5549++;
        if (this.field5552 != null) {
            String var6 = this.field5552.method1093(1, arg0, arg3, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)V")
    public static void method2413(int arg0) {
        if (arg0 != 12949) {
            field5551 = -30;
        }
        field5545 = null;
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(ILin;Lin;Lbq;)V")
    public class382(int arg0, class91 arg1, class91 arg2, class292 arg3) {
        this.field5552 = arg3;
        this.field5547 = arg1;
        this.field5548 = arg2;
        if (this.field5547 != null) {
            this.field5544 = this.field5547.method860(0, 1);
        }
        if (this.field5548 != null) {
            this.field5543 = this.field5548.method860(0, 1);
        }
    }
}
