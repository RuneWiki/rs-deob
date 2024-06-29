import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public abstract class class37 extends class137 {

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Z")
    public volatile boolean field579 = true;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Lvc;")
    public class204 field581;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Lvk;")
    public class37 field580;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([III)V")
    public abstract void method265(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "()Lvk;")
    public abstract class37 method266();

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
    public abstract void method267(int arg0);

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "()I")
    public abstract int method268();

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "()Lvk;")
    public abstract class37 method269();

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "([III)V")
    public final void method270(int[] arg0, int arg1, int arg2) {
        if (this.field579) {
            this.method265(arg0, arg1, arg2);
        } else {
            this.method267(arg2);
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "()I")
    public int method271() {
        return 255;
    }
}
