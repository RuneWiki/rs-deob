import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!ma")
public class class73 extends class111 {

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "Lvc;")
    private class126 field1857 = new class126();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 5)
    public final void method573() {
        AudioPlayer.player.stop(this.field1857);
        class126 var1 = this.field1857;
        synchronized (this.field1857) {
            this.field1857.field3016 = true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 15)
    public class73() {
        super(8000);
        AudioPlayer.player.start(this.field1857);
    }
}
