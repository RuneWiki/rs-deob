import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class686 {

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "[I")
    public int[] field9619 = new int[4];

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
    public int[] field9617 = new int[4];

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "B")
    public byte field9618;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "B")
    public byte field9614;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "[I")
    public int[] field9623;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "S")
    public short field9620;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "S")
    public short field9615;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "S")
    public short field9611;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "[S")
    public short[] field9616;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "[S")
    public short[] field9612;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[S")
    public short[] field9613;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "S")
    public short field9622;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 16)
    public class686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field9618 = (byte) arg0;
        this.field9614 = (byte) arg1;
        this.field9623 = new int[4];
        this.field9623[3] = arg5;
        this.field9623[1] = arg3;
        this.field9623[2] = arg4;
        this.field9623[0] = arg2;
        this.field9617[2] = arg8;
        this.field9617[0] = arg6;
        this.field9617[3] = arg9;
        this.field9617[1] = arg7;
        this.field9619[1] = arg11;
        this.field9620 = (short) (arg2 >> class439.field6699);
        this.field9619[2] = arg12;
        this.field9619[0] = arg10;
        this.field9619[3] = arg13;
        this.field9615 = (short) (arg4 >> class439.field6699);
        this.field9611 = (short) (arg10 >> class439.field6699);
        this.field9616 = new short[4];
        this.field9612 = new short[4];
        this.field9613 = new short[4];
        this.field9622 = (short) (arg12 >> class439.field6699);
    }
}
