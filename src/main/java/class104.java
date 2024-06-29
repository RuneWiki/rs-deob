import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!rd")
public class class104 extends class88 {

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lua;")
    private class116 field2208 = new class116();

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
    public final void method557() {
        AudioPlayer.player.stop(this.field2208);
        class116 var1 = this.field2208;
        synchronized (this.field2208) {
            this.field2208.field2468 = true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class104() {
        super(8000);
        AudioPlayer.player.start(this.field2208);
    }
}
