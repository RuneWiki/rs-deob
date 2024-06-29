import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class85 {

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "B")
    public byte field967;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "Lnt;")
    public class189 field968;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "Lbj;")
    public class205 field962;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "Lte;")
    public class534 field965;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "Lrw;")
    public class654 field963;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)Z")
    public final boolean method553(int arg0) {
        field966++;
        if (arg0 == -3) {
            return this.field967 == 2 || this.field967 == 3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(BIIIII)V")
    public class85(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field967 = arg0;
        this.field960 = arg3;
        this.field969 = arg5;
        this.field970 = arg4;
        this.field964 = arg1;
        this.field961 = arg2;
    }
}
