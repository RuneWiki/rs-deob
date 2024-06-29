import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class354 extends class224 {

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public int field4979;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
    public int field4990;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "Ljava/lang/String;")
    public String field4988;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)J")
    public final long method2215(byte arg0) {
        int var2 = -123 / ((arg0 - 29) / 36);
        ++field4982;
        return super.field3211 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public final void method2216(int arg0) {
        ++field4983;
        super.field3211 = 500L + class742.method4128(1) | Long.MIN_VALUE & super.field3211;
        if (arg0 != 0) {
            this.method2222(-93);
        }
        class322.field4579.method1203(this, -101);
    }

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "(I)I")
    public final int method2217(int arg0) {
        ++field4984;
        int var2 = -60 / ((33 - arg0) / 61);
        return (int) super.field8991;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)I")
    public final int method2218(byte arg0) {
        ++field4987;
        return arg0 > -30 ? -109 : (int) (255L & super.field8991 >>> 32);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILeq;)V")
    public static final void method2219(int arg0, class209 arg1) {
        class360.field5050 = arg1;
        if (arg0 == 0) {
            ++field4978;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ldm;I)V")
    public static final void method2220(class50 arg0, int arg1) {
        if (arg1 != 350590048) {
            field4985 = -27;
        }
        if (~arg0.field765 == -6 && arg0.field861 != -1) {
            class406.method2492(119, arg0, class359.field5046);
        }
        ++field4981;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BII)Z")
    public static final boolean method2221(byte arg0, int arg1, int arg2) {
        if (arg0 != 77) {
            field4985 = 119;
        }
        ++field4986;
        return (arg1 & 2048) != 0 | class546.method3225(0, arg1, arg2) || class189.method1330(arg1, 21721, arg2);
    }

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "(I)V")
    public final void method2222(int arg0) {
        if (arg0 > -22) {
            field4985 = -60;
        }
        ++field4989;
        super.field3211 |= Long.MIN_VALUE;
        if (~this.method2215((byte) 112) == -1L) {
            class146.field2237.method1203(this, -101);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(II)V")
    public class354(int arg0, int arg1) {
        super.field8991 = (long) arg0 << 32 | (long) arg1;
    }
}
