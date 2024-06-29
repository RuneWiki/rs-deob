import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class203 extends class6 {

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "[B")
    public byte[] field2854;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Z")
    public boolean field2855;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lh;)Lgl;", line = 5)
    public final class203 method1390(class232 arg0) {
        this.field2854 = arg0.method1635(this.field2854, true);
        this.field2853 = arg0.method1631(this.field2853, 1033634818);
        if (this.field2857 == this.field2856) {
            this.field2857 = this.field2856 = arg0.method1629(this.field2857, (byte) -83);
        } else {
            this.field2857 = arg0.method1629(this.field2857, (byte) -83);
            this.field2856 = arg0.method1629(this.field2856, (byte) -83);
            if (this.field2857 == this.field2856) {
                this.field2857--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class203(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2853 = arg0;
        this.field2854 = arg1;
        this.field2857 = arg2;
        this.field2856 = arg3;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class203(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2853 = arg0;
        this.field2854 = arg1;
        this.field2857 = arg2;
        this.field2856 = arg3;
        this.field2855 = arg4;
    }
}
