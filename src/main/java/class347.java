import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class347 extends class94 implements class339 {

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
    private int field4338;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "[I")
    public static int[] field4340 = new int[200];

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "Lgp;")
    public static class53 field4341 = new class53();

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "Lhh;")
    public static class141 field4336;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)J", line = 5)
    public final long method466(byte arg0) {
        ++field4339;
        int var2 = 83 / ((-25 - arg0) / 44);
        return super.field1237.getAddress();
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIZI)V", line = 16)
    public static final void method2062(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class308.field3822 = arg6;
        ++field4342;
        int var7 = -90 % ((57 - arg4) / 56);
        class671.field9213 = arg2;
        class465.field6515 = arg0;
        class215.field2534 = arg1;
        class486.field6791 = arg3;
        if (arg5 && class215.field2534 >= 100) {
            class350.field4366 = class486.field6791 * 512 - -256;
            class599.field8107 = class308.field3822 * 512 + 256;
            class303.field3622 = class483.method2867(class581.field7921, (byte) -66, class350.field4366, class599.field8107) - class671.field9213;
        }
        class719.field10094 = -1;
        class131.field1617 = -1;
        class7.field100 = 2;
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)I", line = 43)
    public final int method470(int arg0) {
        if (arg0 >= -85) {
            this.field4338 = 56;
        }
        ++field4337;
        return this.field4338;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(III[B)V", line = 55)
    public final void method467(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method828(arg3, arg1);
        if (arg0 > -96) {
            this.method466((byte) 71);
        }
        ++field4344;
        this.field4338 = arg2;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lpc;I[BI)V", line = 69)
    public class347(class700 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4338 = arg1;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V", line = 78)
    public static void method2063(boolean arg0) {
        field4340 = null;
        field4336 = null;
        field4341 = null;
        if (!arg0) {
            field4343 = 59;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)I", line = 91)
    public final int method469(int arg0) {
        ++field4345;
        return arg0 != -30665 ? -22 : 0;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lpc;ILjaclib/memory/Buffer;)V", line = 102)
    public class347(class700 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field4338 = arg1;
    }
}
