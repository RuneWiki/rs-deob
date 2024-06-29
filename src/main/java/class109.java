import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!sd")
public class class109 extends class101 {

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lod;")
    private class88 field2412 = new class88();

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class109() {
        super(8000);
        AudioPlayer.player.start(this.field2412);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
    public final void method766() {
        AudioPlayer.player.stop(this.field2412);
        class88 var1 = this.field2412;
        synchronized (this.field2412) {
            this.field2412.field1928 = true;
        }
    }
}
