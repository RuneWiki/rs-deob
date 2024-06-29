import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!vd")
public class class132 extends class19 {

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Lsa;")
    private class110 field3237 = new class110();

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 4)
    public class132() {
        AudioPlayer.player.start(this.field3237);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V", line = 13)
    public final void method180() {
        AudioPlayer.player.stop(this.field3237);
        class110 var1 = this.field3237;
        synchronized (this.field3237) {
            this.field3237.field2653 = true;
        }
    }
}
