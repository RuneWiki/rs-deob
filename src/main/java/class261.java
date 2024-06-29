import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class261 {

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "()V")
    public class261() {
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Ljw;)V")
    public class261(class261 arg0) {
        this.field3228 = arg0.field3228;
        this.field3226 = arg0.field3226;
        this.field3227 = arg0.field3227;
    }
}
