import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sun.audio.AudioPlayer;

@OriginalClass("client!lc")
public class class68 extends class85 {

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Lac;")
    private class3 field1652 = new class3();

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()V", line = 4)
    public final void method490() {
        AudioPlayer.player.stop(this.field1652);
        class3 var1 = this.field1652;
        synchronized (this.field1652) {
            this.field1652.field72 = true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 14)
    public class68() {
        super(8000);
        AudioPlayer.player.start(this.field1652);
    }
}
