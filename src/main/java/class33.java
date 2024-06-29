import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public abstract class class33 extends class198 {

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "Z")
    public boolean field359 = false;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "Z")
    public boolean field360 = false;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "S")
    public short field364;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "[I")
    public static int[] field365 = new int[13];

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "(B)V", line = 3)
    public static void method153(byte arg0) {
        if (arg0 != -66) {
            method153((byte) -71);
        }
        field365 = null;
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(IIIIZZ)V", line = 31)
    public class33(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field363 = arg1;
        this.field366 = arg2;
        this.field360 = arg4;
        this.field364 = (short) arg3;
        this.field362 = arg0;
        this.field359 = arg5;
    }
}
