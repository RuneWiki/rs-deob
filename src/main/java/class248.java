import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class248 extends class176 {

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
    public volatile int field3448 = -1;

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field3447;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "Z")
    public static volatile boolean field3446 = true;

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class248(String arg0) {
        this.field3447 = arg0;
    }
}
