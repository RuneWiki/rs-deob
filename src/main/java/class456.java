import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class456 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[S")
    public short[] field6077;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[I")
    public int[] field6079;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[S")
    public short[] field6078;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "J")
    public long field6080;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field6076 = -2;

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(J[I[S[S)V")
    public class456(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field6077 = arg3;
        this.field6079 = arg1;
        this.field6078 = arg2;
        this.field6080 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    protected class456() {
    }
}
