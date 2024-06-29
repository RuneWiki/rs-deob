import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class463 {

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public int field6667;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Ljava/lang/String;")
    public String field6665;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Ljava/lang/String;")
    public String field6666;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "J")
    public long field6668;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public int field6669;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(JJ)J")
    public static long method2729(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class463(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field6667 = arg2;
        this.field6665 = arg1;
        this.field6666 = arg3;
        this.field6668 = arg4;
        this.field6669 = arg0;
    }
}
