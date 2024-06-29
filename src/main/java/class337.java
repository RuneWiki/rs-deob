import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class337 extends class299 {

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    private int field4243;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    private int field4239;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    private int field4238;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "Lqg;")
    public static class216 field4237;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "[Lrb;")
    public static class383[] field4241;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
    public static final void method1935(byte arg0) {
        ++field4236;
        class296.method1736(128);
        class185.field2107 = null;
        class307.field3797 = null;
        class258.field3245 = null;
        if (arg0 > -58) {
            field4237 = null;
        }
        class266.field3308 = null;
        class235.field2879 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
    public final void method1481(int arg0, int arg1, int arg2) {
        ++field4235;
        if (arg0 == 0) {
            int var4 = this.field4238 * arg2 >> 12;
            int var5 = this.field4242 * arg2 >> 12;
            int var6 = this.field4239 * arg1 >> 12;
            int var7 = this.field4243 * arg1 >> 12;
            class39.method205(-45, super.field3725, var5, var4, var7, var6);
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIIII)V")
    public class337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4243 = arg3;
        this.field4239 = arg1;
        this.field4238 = arg0;
        this.field4242 = arg2;
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)V")
    public static void method1936(byte arg0) {
        if (arg0 >= -48) {
            field4241 = null;
        }
        field4237 = null;
        field4241 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BII)V")
    public final void method1477(byte arg0, int arg1, int arg2) {
        if (arg0 >= -118) {
            method1935((byte) -61);
        }
        ++field4240;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(III)V")
    public final void method1480(int arg0, int arg1, int arg2) {
        ++field4234;
        if (arg0 != 4096) {
            field4241 = null;
        }
    }
}
