import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class class39 extends class687 {

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "S")
    public short field519;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "Z")
    public boolean field513;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "S")
    public short field512;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "S")
    public short field516;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "B")
    public byte field520;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "B")
    public byte field510;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "S")
    public short field517;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)V")
    public void method178(int arg0) {
        if (arg0 == 12) {
            field511++;
        }
    }

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)I")
    public abstract int method179(int arg0);

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "(I)Z")
    public static final boolean method180(int arg0) {
        field508++;
        if (arg0 >= -24) {
            return true;
        } else {
            return class315.field4697 > 0;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field518 = arg2;
        this.field519 = (short) arg7;
        this.field514 = arg3;
        this.field509 = arg1;
        this.field513 = arg8;
        this.field512 = (short) arg6;
        this.field516 = (short) arg5;
        this.field520 = (byte) arg0;
        this.field510 = arg9;
        this.field517 = (short) arg4;
    }
}
