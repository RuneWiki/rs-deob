import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class363 extends class388 {

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Z")
    public boolean field5039 = false;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "Z")
    public boolean field5043 = false;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public int field5042;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public int field5044;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field5041 = 1338;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(IIIZZ)V", line = 20)
    public class363(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field5042 = arg0;
        this.field5043 = arg3;
        this.field5044 = arg2;
        this.field5045 = arg1;
        this.field5039 = arg4;
    }
}
