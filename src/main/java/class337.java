import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class337 extends class264 implements class440 {

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "Lkr;")
    public static class602 field4730 = new class602(31, -1);

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "B")
    private byte field4736;

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "J")
    public static long field4739;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I", line = 4)
    public static final int method2139(int arg0, int arg1, int arg2) {
        int var3 = (127 & arg1) * arg2 >> 7;
        ++field4735;
        if (~var3 > -3) {
            var3 = 2;
        } else if (~var3 < -127) {
            var3 = 126;
        }
        if (arg0 != -22186) {
            field4730 = null;
        }
        return (arg1 & 65408) - -var3;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)Z", line = 30)
    public final boolean method2140(byte arg0, int arg1, int arg2) {
        ++field4734;
        this.field4736 = (byte) arg1;
        super.method969(false, arg2);
        int var4 = -125 / ((68 - arg0) / 40);
        return true;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZLjaclib/memory/Source;)Z", line = 48)
    public final boolean method2141(int arg0, int arg1, boolean arg2, Source arg3) {
        if (arg2) {
            return false;
        } else {
            this.field4736 = (byte) arg1;
            ++field4738;
            super.method1806(arg0, (byte) -108, arg3);
            return true;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 63)
    public final void method970(int arg0) {
        super.method970(-119);
        if (arg0 > -95) {
            this.method2141(18, -61, false, (Source) null);
        }
        ++field4729;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)I", line = 74)
    public final int method2142(int arg0) {
        ++field4731;
        if (arg0 != 11215) {
            this.method2142(-84);
        }
        return this.field4736;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)Z", line = 87)
    public final boolean method2143(int arg0) {
        if (arg0 >= -56) {
            method2144(125);
        }
        ++field4732;
        return super.method1807(super.field3860.field709, true);
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)I", line = 102)
    public final int method971(int arg0) {
        if (arg0 != -127) {
            this.field4736 = 8;
        }
        ++field4733;
        return super.method971(-127);
    }

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "(I)V", line = 114)
    public static void method2144(int arg0) {
        field4730 = null;
        int var1 = -6 / ((63 - arg0) / 60);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lhj;Z)V", line = 123)
    public class337(class47 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 128)
    public final Buffer method2145(boolean arg0, int arg1) {
        if (arg1 != 27425) {
            method2139(-103, -31, -40);
        }
        ++field4737;
        return super.method1803((byte) -114, super.field3860.field709, arg0);
    }
}
