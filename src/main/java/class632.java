import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class632 extends class561 {

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "[I")
    public static int[] field9196 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public int field9197;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public int field9198;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public int field9203;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Ljava/lang/String;")
    public String field9204;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
    public final int method3650(int arg0) {
        ++field9199;
        if (arg0 <= 83) {
            this.method3652(true);
        }
        return (int) (super.field1401 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)I")
    public final int method3651(int arg0) {
        if (arg0 != 0) {
            return 18;
        } else {
            ++field9194;
            return (int) super.field1401;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)J")
    public final long method3652(boolean arg0) {
        if (!arg0) {
            this.method3651(101);
        }
        ++field9200;
        return super.field7830 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILjq;I)V")
    public static final void method3653(int arg0, int arg1, class447 arg2, int arg3) {
        ++field9195;
        if (class15.field162 == null && !class264.field3373) {
            if (arg2 != null && class331.method2082((byte) 117, arg2) != null) {
                if (arg3 == -1551917856) {
                    class15.field162 = arg2;
                    class254.field3157 = class331.method2082((byte) 127, arg2);
                    class582.field8216 = 0;
                    class496.field6917 = false;
                    class520.field7240 = arg0;
                    class624.field9002 = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method3654(byte arg0) {
        field9196 = null;
        if (arg0 != -86) {
            field9196 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
    public final void method3655(int arg0) {
        ++field9202;
        super.field7830 = 500L + class348.method2175(-117) | Long.MIN_VALUE & super.field7830;
        if (arg0 != 0) {
            this.method3651(88);
        }
        class545.field7595.method2228((byte) 52, this);
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V")
    public final void method3656(int arg0) {
        if (arg0 != 0) {
            this.field9204 = null;
        }
        super.field7830 |= Long.MIN_VALUE;
        ++field9201;
        if (~this.method3652(true) == -1L) {
            class413.field5685.method2228((byte) 63, this);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
    public class632(int arg0, int arg1) {
        super.field1401 = (long) arg1 | (long) arg0 << 32;
    }
}
