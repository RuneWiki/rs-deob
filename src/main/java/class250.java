import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class250 extends class187 {

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public int field3918;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "[Lka;")
    public class9[] field3919;

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(I[Lka;)V", line = 4)
    public class250(int arg0, class9[] arg1) {
        this.field3918 = arg0;
        this.field3919 = arg1;
    }
}
