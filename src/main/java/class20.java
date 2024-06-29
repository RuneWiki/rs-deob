import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!db")
public class class20 extends class12 {

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Lcc;")
    private class15 field478 = new class15();

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 5)
    public class20() {
        super(8000);
        AudioPlayer.player.start(this.field478);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V", line = 14)
    public final void method71() {
        AudioPlayer.player.stop(this.field478);
        class15 var1 = this.field478;
        synchronized (this.field478) {
            this.field478.field413 = true;
        }
    }
}
