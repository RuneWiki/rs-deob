import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!vb")
public class class136 extends class31 {

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Lda;")
    private class23 field3301 = new class23();

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class136() {
        AudioPlayer.player.start(this.field3301);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
    public final void method229() {
        AudioPlayer.player.stop(this.field3301);
        class23 var1 = this.field3301;
        synchronized (this.field3301) {
            this.field3301.field446 = true;
        }
    }
}
