import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class24 extends class260 {

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "[B")
    public byte[] field332;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
    public boolean field331;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lga;)Lec;")
    public final class24 method169(class175 arg0) {
        this.field332 = arg0.method1153((byte) 104, this.field332);
        this.field333 = arg0.method1154(this.field333, 4875);
        if (this.field334 == this.field330) {
            this.field330 = this.field334 = arg0.method1151(this.field330, false);
        } else {
            this.field330 = arg0.method1151(this.field330, false);
            this.field334 = arg0.method1151(this.field334, false);
            if (this.field334 == this.field330) {
                this.field330--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I[BII)V")
    public class24(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field333 = arg0;
        this.field332 = arg1;
        this.field330 = arg2;
        this.field334 = arg3;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I[BIIZ)V")
    public class24(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field333 = arg0;
        this.field332 = arg1;
        this.field330 = arg2;
        this.field334 = arg3;
        this.field331 = arg4;
    }
}
