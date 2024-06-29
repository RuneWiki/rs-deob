import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class384 {

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "Z")
    public boolean field5382;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public int field5374;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "B")
    public byte field5373;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public int field5380;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "S")
    public short field5375;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "S")
    public short field5377;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public int field5378;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public int field5376;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "S")
    public short field5381;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public int field5372;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field5379 = 0;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field5382 = arg10;
        this.field5374 = arg2;
        this.field5373 = (byte) arg8;
        this.field5380 = arg11;
        this.field5375 = (short) arg5;
        this.field5377 = (short) arg6;
        this.field5378 = arg3;
        this.field5376 = arg0;
        this.field5381 = (short) arg4;
        this.field5372 = arg1;
    }
}
