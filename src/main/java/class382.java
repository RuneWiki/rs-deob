import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class382 extends class11 {

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "Ljava/lang/String;")
    public static String field5102 = null;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
    public int field5099;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
    public int field5104;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
    public int field5106;

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "Lsa;")
    public static class192 field5097;

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "Ljava/lang/String;")
    public String field5103;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)Z")
    public static final boolean method2227(int arg0, int arg1, int arg2) {
        ++field5095;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg0 != 13) {
            method2227(12, -101, 46);
        }
        class58 var3 = class470.field6288.method1258(arg1, (byte) -126);
        if (~arg2 <= -6 && ~arg2 >= -9) {
            arg2 = 4;
        }
        return var3.method482(arg2, (byte) -61);
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(B)V")
    public final void method2228(byte arg0) {
        super.field207 = 500L + class681.method3802(-23600) | super.field207 & Long.MIN_VALUE;
        ++field5108;
        class462.field6256.method3396(this, arg0 + 54);
        if (arg0 != -55) {
            this.field5104 = 98;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
    public final int method2229(int arg0) {
        if (arg0 <= 43) {
            this.field5104 = 92;
        }
        ++field5105;
        return (int) (255L & super.field6724 >>> 32);
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)J")
    public final long method2230(int arg0) {
        ++field5107;
        if (arg0 != 1024) {
            this.field5106 = 42;
        }
        return super.field207 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2231(int arg0, int arg1, boolean arg2) {
        ++field5098;
        if (arg2) {
            field5102 = null;
        }
        return ~(arg1 & 1024) != -1;
    }

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)V")
    public final void method2232(int arg0) {
        ++field5101;
        super.field207 |= Long.MIN_VALUE;
        if (this.method2230(1024) == 0L) {
            class80.field1259.method3396(this, -1);
        }
        int var2 = -128 % ((arg0 - 62) / 43);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)I")
    public final int method2233(boolean arg0) {
        ++field5096;
        if (!arg0) {
            this.field5104 = 50;
        }
        return (int) super.field6724;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(II)V")
    public class382(int arg0, int arg1) {
        super.field6724 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(B)V")
    public static void method2234(byte arg0) {
        int var1 = -27 % ((34 - arg0) / 54);
        field5097 = null;
        field5102 = null;
    }
}
