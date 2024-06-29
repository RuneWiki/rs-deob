import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!fb")
public class class37 extends class138 {

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Ltb;")
    private class120 field861 = new class120();

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V", line = 4)
    public final void method299() {
        AudioPlayer.player.stop(this.field861);
        class120 var1 = this.field861;
        synchronized (this.field861) {
            this.field861.field2823 = true;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 14)
    public class37() {
        AudioPlayer.player.start(this.field861);
    }
}
