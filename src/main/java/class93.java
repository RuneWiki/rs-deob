import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!pc")
public class class93 extends class27 {

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Lrd;")
    private class104 field2107 = new class104();

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 4)
    public class93() {
        super(8000);
        AudioPlayer.player.start(this.field2107);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V", line = 14)
    public final void method216() {
        AudioPlayer.player.stop(this.field2107);
        class104 var1 = this.field2107;
        synchronized (this.field2107) {
            this.field2107.field2399 = true;
        }
    }
}
