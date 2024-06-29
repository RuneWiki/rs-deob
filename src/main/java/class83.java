import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!ne")
public class class83 extends class38 {

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "Lhd;")
    private class46 field2053 = new class46();

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 5)
    public final void method291() {
        AudioPlayer.player.stop(this.field2053);
        class46 var1 = this.field2053;
        synchronized (this.field2053) {
            this.field2053.field1115 = true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 15)
    public class83() {
        super(8000);
        AudioPlayer.player.start(this.field2053);
    }
}
