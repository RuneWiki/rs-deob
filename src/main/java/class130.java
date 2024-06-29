import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!wc")
public class class130 extends class22 {

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ltd;")
    private class116 field3135 = new class116();

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V", line = 4)
    public final void method229() {
        AudioPlayer.player.stop(this.field3135);
        class116 var1 = this.field3135;
        synchronized (this.field3135) {
            this.field3135.field2826 = true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 14)
    public class130() {
        super(8000);
        AudioPlayer.player.start(this.field3135);
    }
}
