import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!v")
public class class126 extends class14 {

    @OriginalMember(owner = "client!v", name = "F", descriptor = "Llb;")
    private class68 field3109 = new class68();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V", line = 5)
    public final void method257() {
        AudioPlayer.player.stop(this.field3109);
        class68 var1 = this.field3109;
        synchronized (this.field3109) {
            this.field3109.field1699 = true;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 15)
    public class126() {
        super(8000);
        AudioPlayer.player.start(this.field3109);
    }
}
