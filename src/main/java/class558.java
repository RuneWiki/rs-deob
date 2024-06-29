import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class558 extends class4 {

    @OriginalMember(owner = "client!sba", name = "C", descriptor = "I")
    public int field7761;

    @OriginalMember(owner = "client!sba", name = "x", descriptor = "I")
    public int field7756;

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "J")
    public long field7758;

    @OriginalMember(owner = "client!sba", name = "y", descriptor = "Z")
    public boolean field7757;

    @OriginalMember(owner = "client!sba", name = "w", descriptor = "Ljava/lang/String;")
    public String field7755;

    @OriginalMember(owner = "client!sba", name = "A", descriptor = "Ljava/lang/String;")
    public String field7759;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "Z")
    public boolean field7751;

    @OriginalMember(owner = "client!sba", name = "u", descriptor = "Z")
    public boolean field7753;

    @OriginalMember(owner = "client!sba", name = "D", descriptor = "J")
    public long field7762;

    @OriginalMember(owner = "client!sba", name = "v", descriptor = "I")
    public int field7754;

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
    public int field7752;

    @OriginalMember(owner = "client!sba", name = "B", descriptor = "I")
    public int field7760;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "[I")
    public static int[] field7750 = null;

    @OriginalMember(owner = "client!sba", name = "F", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!sba", name = "E", descriptor = "Ljava/lang/String;")
    public String field7763;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public static void method3283(int arg0) {
        if (arg0 == -1) {
            field7750 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "(I)V")
    public static final void method3284(int arg0) {
        field7764++;
        if (class513.field7087 < 0) {
            class609.field8207 = -1;
            class513.field7087 = 0;
            class329.field4660 = -1;
        }
        if (class461.field6404 < class513.field7087) {
            class609.field8207 = -1;
            class513.field7087 = class461.field6404;
            class329.field4660 = -1;
        }
        if (arg0 < ~class718.field10001) {
            class609.field8207 = -1;
            class329.field4660 = -1;
            class718.field10001 = 0;
        }
        if (class461.field6413 < class718.field10001) {
            class329.field4660 = -1;
            class609.field8207 = -1;
            class718.field10001 = class461.field6413;
        }
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class558(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field7761 = arg4;
        this.field7756 = arg6;
        this.field7758 = arg10;
        this.field7757 = arg9;
        this.field7755 = arg0;
        this.field7759 = arg1;
        this.field7751 = arg11;
        this.field7753 = arg8;
        this.field7762 = arg5;
        this.field7754 = arg3;
        this.field7752 = arg7;
        this.field7760 = arg2;
    }
}
