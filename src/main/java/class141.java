import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class141 {

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)Z")
    public static final boolean method874(int arg0) {
        if (arg0 == -16768) {
            field1682++;
            return class244.field3142 == 0 ? class106.field1297.method3678(1715984807) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1681++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Z")
    public static final boolean method875(int arg0, int arg1, int arg2) {
        if (arg2 != 32768) {
            method874(-15);
        }
        field1676++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(IIII)V")
    public class141(int arg0, int arg1, int arg2, int arg3) {
        this.field1680 = arg0;
        this.field1679 = arg2;
        this.field1678 = arg1;
        this.field1677 = arg3;
    }
}
