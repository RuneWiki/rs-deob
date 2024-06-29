import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!ba")
public class class8 extends class35 {

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lt;")
    private class114 field150 = new class114();

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 4)
    public class8() {
        super(8000);
        AudioPlayer.player.start(this.field150);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()V", line = 13)
    public final void method114() {
        AudioPlayer.player.stop(this.field150);
        class114 var1 = this.field150;
        synchronized (this.field150) {
            this.field150.field2667 = true;
        }
    }
}
