import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class432 extends RuntimeException {

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field6334;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Ljava/lang/String;")
    public String field6333;

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class432(Throwable arg0, String arg1) {
        this.field6334 = arg0;
        this.field6333 = arg1;
    }
}
