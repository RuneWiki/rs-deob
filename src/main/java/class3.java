import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!ab")
public class class3 extends class86 {

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "Lob;")
    private class94 field47 = new class94();

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class3() {
        AudioPlayer.player.start(this.field47);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
    public final void method21() {
        AudioPlayer.player.stop(this.field47);
        class94 var1 = this.field47;
        synchronized (this.field47) {
            this.field47.field2216 = true;
        }
    }
}
