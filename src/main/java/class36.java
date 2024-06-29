import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!fe")
public class class36 extends class75 {

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "Lee;")
    private class30 field893 = new class30();

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V", line = 5)
    public final void method266() {
        AudioPlayer.player.stop(this.field893);
        class30 var1 = this.field893;
        synchronized (this.field893) {
            this.field893.field801 = true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 15)
    public class36() {
        super(8000);
        AudioPlayer.player.start(this.field893);
    }
}
