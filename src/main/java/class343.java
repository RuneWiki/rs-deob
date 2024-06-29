import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class343 extends class70 {

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field5424;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "[Led;")
    public class327[] field5423;

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I[Led;)V", line = 4)
    public class343(int arg0, class327[] arg1) {
        this.field5424 = arg0;
        this.field5423 = arg1;
    }
}
