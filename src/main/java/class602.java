import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class602 extends RuntimeException {

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "Ljava/lang/String;")
    public String field8137;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field8138;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "J")
    public static long field8135;

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class602(Throwable arg0, String arg1) {
        this.field8137 = arg1;
        this.field8138 = arg0;
    }
}
