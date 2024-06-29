import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!ic")
public class class51 extends class100 {

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Ll;")
    private class66 field1293 = new class66();

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V", line = 4)
    public final void method433() {
        AudioPlayer.player.stop(this.field1293);
        class66 var1 = this.field1293;
        synchronized (this.field1293) {
            this.field1293.field1581 = true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 15)
    public class51() {
        super(8000);
        AudioPlayer.player.start(this.field1293);
    }
}
