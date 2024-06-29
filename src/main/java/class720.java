import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class720 extends class337 {

    @OriginalMember(owner = "client!lja", name = "o", descriptor = "I")
    public int field9461;

    @OriginalMember(owner = "client!lja", name = "m", descriptor = "I")
    public int field9459;

    @OriginalMember(owner = "client!lja", name = "r", descriptor = "Lrf;")
    public class784 field9464;

    @OriginalMember(owner = "client!lja", name = "q", descriptor = "Z")
    public boolean field9463;

    @OriginalMember(owner = "client!lja", name = "s", descriptor = "I")
    public static int field9465;

    @OriginalMember(owner = "client!lja", name = "l", descriptor = "Z")
    public boolean field9458;

    @OriginalMember(owner = "client!lja", name = "n", descriptor = "Z")
    public boolean field9460;

    @OriginalMember(owner = "client!lja", name = "p", descriptor = "Z")
    public boolean field9462;

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "(II)I", line = 11)
    public static final int method3863(int arg0, int arg1) {
        field9465++;
        return arg0 >= -82 ? -109 : arg1 >>> 7;
    }

    @OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(ILrf;IZ)V", line = 23)
    public class720(int arg0, class784 arg1, int arg2, boolean arg3) {
        this.field9461 = arg2;
        this.field9459 = arg0;
        this.field9464 = arg1;
        this.field9463 = arg3;
    }
}
