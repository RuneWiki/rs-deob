import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class118 extends class122 implements class61 {

    @OriginalMember(owner = "client!jja", name = "e", descriptor = "I")
    private int field1827;

    @OriginalMember(owner = "client!jja", name = "c", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!jja", name = "d", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!jja", name = "f", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!jja", name = "g", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!jja", name = "h", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!jja", name = "i", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(Z)I", line = 3)
    public final int method407(boolean arg0) {
        ++field1826;
        return arg0 ? -114 : 0;
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)I", line = 14)
    public final int method408(int arg0) {
        if (arg0 < 102) {
            this.field1827 = 66;
        }
        ++field1825;
        return this.field1827;
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(Lqfa;I[BI)V", line = 25)
    public class118(class106 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1827 = arg1;
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(III[B)V", line = 39)
    public final void method410(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != -9859) {
            this.method410(13, 93, -36, (byte[]) null);
        }
        ++field1830;
        this.method930(arg3, arg0);
        this.field1827 = arg2;
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(IZI)I", line = 52)
    public static final int method896(int arg0, boolean arg1, int arg2) {
        int var3 = (127 & arg2) * arg0 >> 7;
        ++field1829;
        if (~var3 <= -3) {
            if (var3 > 126) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        if (!arg1) {
            method896(-82, true, -88);
        }
        return (arg2 & 65408) - -var3;
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(Lqfa;ILjaclib/memory/Buffer;)V", line = 71)
    public class118(class106 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field1827 = arg1;
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(B)J", line = 79)
    public final long method409(byte arg0) {
        ++field1831;
        if (arg0 != -58) {
            this.field1827 = 13;
        }
        return super.field1903.getAddress();
    }
}
