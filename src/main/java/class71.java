import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class71 {

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V", line = 5)
    public class71() {
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lhia;)V", line = 7)
    public class71(class71 arg0) {
        this.field841 = arg0.field841;
        this.field840 = arg0.field840;
        this.field839 = arg0.field839;
    }
}
