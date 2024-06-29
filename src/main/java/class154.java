import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class154 extends class426 implements class52 {

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    private int field2234;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lmr;")
    public static class611 field2233 = new class611();

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Lsea;")
    public static class281 field2237;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I", line = 3)
    public final int method476(int arg0) {
        int var2 = 58 % ((arg0 - -40) / 35);
        ++field2236;
        return super.field6153;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I", line = 14)
    public final int method475(int arg0) {
        ++field2235;
        if (arg0 != -8745) {
            this.method475(-50);
        }
        return this.field2234;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)J", line = 25)
    public final long method477(int arg0) {
        ++field2229;
        int var2 = -6 / ((arg0 - -59) / 32);
        return 0L;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V", line = 36)
    public final void method1109(int arg0) {
        if (arg0 >= -40) {
            method1110(-22, -114, -91);
        }
        super.field6157.method2183(this, -11097);
        ++field2231;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZII[B)V", line = 49)
    public final void method474(boolean arg0, int arg1, int arg2, byte[] arg3) {
        ++field2232;
        this.method2650(arg3, arg2, 24637);
        this.field2234 = arg1;
        if (!arg0) {
            field2233 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z", line = 61)
    public static final boolean method1110(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            return true;
        } else {
            ++field2230;
            return class634.method3631(arg2 ^ -11, arg1, arg0) | ~(arg0 & 262144) != -1 || class584.method3437(arg1, arg0, -90);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lkw;ILjaclib/memory/Buffer;IZ)V", line = 75)
    public class154(class346 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2234 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)V", line = 89)
    public static final void method1111(byte arg0, int arg1) {
        ++field2238;
        class430 var2 = class491.field7069.method4023((byte) -119);
        int var3 = -2 % ((-41 - arg0) / 61);
        while (var2 != null) {
            if (~((long) arg1) == ~(65535L & var2.field6188 >> 48)) {
                var2.method2656((byte) 118);
            }
            var2 = class491.field7069.method4021((byte) 80);
        }
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V", line = 109)
    public static void method1112(int arg0) {
        field2237 = null;
        if (arg0 == 65535) {
            field2233 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lkw;I[BIZ)V", line = 121)
    public class154(class346 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2234 = arg1;
    }
}
