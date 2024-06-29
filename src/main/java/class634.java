import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class634 extends class578 {

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public int field8444;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "Lmi;")
    public class498 field8442;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "[B")
    public byte[] field8441;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3483(int arg0, String arg1) {
        ++field8443;
        if (arg0 < 105) {
            return null;
        } else if (!class721.field10047.startsWith("win")) {
            if (!class721.field10047.startsWith("linux")) {
                return class721.field10047.startsWith("mac") ? "lib" + arg1 + ".dylib" : null;
            } else {
                return "lib" + arg1 + ".so";
            }
        } else {
            return arg1 + ".dll";
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)[B")
    public final byte[] method3171(int arg0) {
        ++field8445;
        if (super.field7580) {
            throw new RuntimeException();
        } else {
            if (arg0 != 0) {
                this.field8441 = null;
            }
            return this.field8441;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)I")
    public final int method3170(int arg0) {
        ++field8440;
        if (super.field7580) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field8441 = null;
            }
            return 100;
        }
    }
}
