import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class444 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public int field6625;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field6627;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field6626;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class444() {
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lmh;)V")
    public class444(class444 arg0) {
        this.field6625 = arg0.field6625;
        this.field6627 = arg0.field6627;
        this.field6626 = arg0.field6626;
    }
}
