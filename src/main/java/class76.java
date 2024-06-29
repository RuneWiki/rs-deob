import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!md")
public class class76 extends class14 {

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Lpa;")
    private class91 field1916 = new class91();

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V", line = 5)
    public final void method101() {
        AudioPlayer.player.stop(this.field1916);
        class91 var1 = this.field1916;
        synchronized (this.field1916) {
            this.field1916.field2313 = true;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 15)
    public class76() {
        super(8000);
        AudioPlayer.player.start(this.field1916);
    }
}
