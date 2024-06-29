import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class240 {

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "S")
    public short field3320;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "Lhk;")
    public class203 field3322;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "B")
    public byte field3321;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "B")
    public byte field3323;

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lhd;Lhk;III)V")
    public class240(class17 arg0, class203 arg1, int arg2, int arg3, int arg4) {
        this.field3320 = (short) arg2;
        this.field3322 = arg1;
        this.field3321 = (byte) arg3;
        this.field3323 = (byte) arg4;
    }
}
