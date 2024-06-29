import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class685 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[S")
    public short[] field9688;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "J")
    public long field9689;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[I")
    public int[] field9685;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "[S")
    public short[] field9687;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(J[I[S[S)V")
    public class685(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field9688 = arg2;
        this.field9689 = arg0;
        this.field9685 = arg1;
        this.field9687 = arg3;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    protected class685() {
    }
}
