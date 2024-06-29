import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class314 extends class132 {

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "[B")
    public static byte[] field4224 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "Lcba;")
    public static class471 field4233 = new class471(85, 3);

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    public static int field4236 = 0;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "[I")
    public static int[] field4234 = new int[50];

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "Lcp;")
    public static class618 field4235 = new class618();

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public int field4223;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public int field4227;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "Ljava/lang/String;")
    public String field4228;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)J")
    public final long method1957(int arg0) {
        ++field4226;
        if (arg0 != 50) {
            this.method1957(114);
        }
        return super.field2110 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method1958(byte arg0) {
        field4234 = null;
        field4235 = null;
        field4233 = null;
        field4224 = null;
        if (arg0 != 8) {
            method1958((byte) -3);
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public final void method1959(int arg0) {
        if (arg0 == 19793) {
            super.field2110 |= Long.MIN_VALUE;
            ++field4231;
            if (~this.method1957(50) == -1L) {
                class526.field7393.method2199(-23751, this);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)I")
    public final int method1960(int arg0) {
        ++field4222;
        if (arg0 != -3657) {
            this.field4223 = -45;
        }
        return (int) (super.field2524 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "(I)I")
    public final int method1961(int arg0) {
        if (arg0 >= -26) {
            return -20;
        } else {
            ++field4229;
            return (int) super.field2524;
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(II)V")
    public class314(int arg0, int arg1) {
        super.field2524 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public final void method1962(byte arg0) {
        if (arg0 == 0) {
            ++field4225;
            super.field2110 = super.field2110 & Long.MIN_VALUE | class488.method2835(30160) - -500L;
            class451.field6368.method2199(-23751, this);
        }
    }
}
