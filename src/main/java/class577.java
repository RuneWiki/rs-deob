import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class577 extends class363 {

    @OriginalMember(owner = "client!mfa", name = "s", descriptor = "I")
    public int field7747;

    @OriginalMember(owner = "client!mfa", name = "x", descriptor = "Ljaa;")
    private class576 field7752;

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "J")
    private long field7754;

    @OriginalMember(owner = "client!mfa", name = "t", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!mfa", name = "v", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!mfa", name = "w", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!mfa", name = "y", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!mfa", name = "u", descriptor = "Lpd;")
    public static class241 field7749;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Z)J", line = 3)
    public final long method3195(boolean arg0) {
        if (arg0) {
            return 75L;
        } else {
            field7750++;
            return this.field7754;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "(I)V", line = 18)
    private final void method3196(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field7748++;
        if (this.field7754 > 0L) {
            this.field7752.field7442.releasePbuffer(this.field7754);
            this.field7754 = 0L;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "(I)V", line = 36)
    public static final void method3197(int arg0) {
        class700.field9707++;
        field7751++;
        class124 var1 = class336.method1924(class142.field1704, class636.field8620, (byte) 87);
        var1.field1516.method3080((byte) -61, class340.field4343);
        if (arg0 <= 38) {
            method3198((byte) 31);
        }
        class197.method1156((byte) 97, var1);
    }

    @OriginalMember(owner = "client!mfa", name = "finalize", descriptor = "()V", line = 51)
    protected final void finalize() throws Throwable {
        field7753++;
        this.method3196(0);
        super.finalize();
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)V", line = 61)
    public static void method3198(byte arg0) {
        field7749 = null;
        if (arg0 >= -100) {
            method3197(62);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Ljaa;II)V", line = 78)
    public class577(class576 arg0, int arg1, int arg2) {
        this.field7747 = arg1 * arg2;
        this.field7752 = arg0;
        this.field7754 = this.field7752.field7442.createPbuffer(arg1, arg2);
    }
}
