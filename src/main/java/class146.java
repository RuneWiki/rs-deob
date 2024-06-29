import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class146 extends class47 {

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[B")
    public byte[] field2789;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Z")
    public boolean field2790;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljg;)Lne;")
    public final class146 method1009(class104 arg0) {
        this.field2789 = arg0.method678(-1694746864, this.field2789);
        this.field2792 = arg0.method673(this.field2792, true);
        if (this.field2793 == this.field2791) {
            this.field2793 = this.field2791 = arg0.method677(this.field2793, 23596);
        } else {
            this.field2793 = arg0.method677(this.field2793, 23596);
            this.field2791 = arg0.method677(this.field2791, 23596);
            if (this.field2793 == this.field2791) {
                this.field2793--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I[BII)V")
    public class146(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2792 = arg0;
        this.field2789 = arg1;
        this.field2793 = arg2;
        this.field2791 = arg3;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I[BIIZ)V")
    public class146(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2792 = arg0;
        this.field2789 = arg1;
        this.field2793 = arg2;
        this.field2791 = arg3;
        this.field2790 = arg4;
    }
}
