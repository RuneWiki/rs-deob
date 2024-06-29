import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class306 extends class761 implements class274 {

    @OriginalMember(owner = "client!tha", name = "q", descriptor = "I")
    private int field4574;

    @OriginalMember(owner = "client!tha", name = "n", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!tha", name = "o", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!tha", name = "p", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!tha", name = "r", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!tha", name = "s", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!tha", name = "t", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!tha", name = "u", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!tha", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4570;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)I", line = 3)
    public final int method1775(boolean arg0) {
        ++field4571;
        if (arg0) {
            method2014(-14, -107, -17, 114);
        }
        return this.field4574;
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(Z)V", line = 17)
    public static void method2012(boolean arg0) {
        field4570 = null;
        if (arg0) {
            method2016();
        }
    }

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)V", line = 28)
    public final void method2013(int arg0) {
        super.field10488.method1847(this, (byte) -92);
        if (arg0 != 59838567) {
            field4570 = null;
        }
        ++field4576;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)I", line = 40)
    public final int method1774(int arg0) {
        int var2 = -19 % ((7 - arg0) / 61);
        ++field4575;
        return super.field10486;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIII)I", line = 50)
    public static final int method2014(int arg0, int arg1, int arg2, int arg3) {
        ++field4572;
        if (~arg1 == ~arg2) {
            return arg1;
        } else {
            if (arg0 != 16209) {
                field4570 = null;
            }
            int var4 = -arg3 + 128;
            int var5 = (127 & arg1) * var4 + (127 & arg2) * arg3 >> 7;
            int var6 = (896 & arg1) * var4 + (896 & arg2) * arg3 >> 7;
            int var7 = (arg1 & 64512) * var4 + (64512 & arg2) * arg3 >> 7;
            return 896 & var6 | var7 & 64512 | var5 & 127;
        }
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lkv;I[BIZ)V", line = 75)
    public class306(class280 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4574 = arg1;
    }

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)V", line = 84)
    public static final void method2015(int arg0) {
        class387 var1 = class211.field3052;
        synchronized (class211.field3052) {
            class211.field3052.method2369(-1);
        }
        ++field4578;
        if (arg0 != 34963) {
            field4570 = null;
        }
        class387 var2 = class204.field2986;
        synchronized (class204.field2986) {
            class204.field2986.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "()V", line = 101)
    public static final void method2016() {
        class619.field8726 = class619.field8727;
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)J", line = 105)
    public final long method1777(int arg0) {
        if (arg0 != -30677) {
            method2014(-25, -87, 124, 121);
        }
        ++field4577;
        return 0L;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BII[B)V", line = 117)
    public final void method1776(byte arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = 5 / ((arg0 - 58) / 41);
        ++field4573;
        this.method4195(arg1, arg3, true);
        this.field4574 = arg2;
    }
}
