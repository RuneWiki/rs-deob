import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!w")
public class class124 extends class128 {

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Lda;")
    private class20 field2765 = new class20();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V", line = 4)
    public final void method405() {
        AudioPlayer.player.stop(this.field2765);
        class20 var1 = this.field2765;
        synchronized (this.field2765) {
            this.field2765.field376 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 15)
    public class124() {
        super(8000);
        AudioPlayer.player.start(this.field2765);
    }
}
