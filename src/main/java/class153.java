import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class153 extends class157 {

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "[B")
    public byte[] field3173;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "Z")
    public boolean field3175;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lua;)Lqe;")
    public final class153 method982(class185 arg0) {
        this.field3173 = arg0.method1252(54, this.field3173);
        this.field3176 = arg0.method1251(this.field3176, (byte) -102);
        if (this.field3174 == this.field3172) {
            this.field3174 = this.field3172 = arg0.method1254((byte) -84, this.field3174);
        } else {
            this.field3174 = arg0.method1254((byte) -72, this.field3174);
            this.field3172 = arg0.method1254((byte) -81, this.field3172);
            if (this.field3174 == this.field3172) {
                this.field3174--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BII)V")
    public class153(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3176 = arg0;
        this.field3173 = arg1;
        this.field3174 = arg2;
        this.field3172 = arg3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I[BIIZ)V")
    public class153(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3176 = arg0;
        this.field3173 = arg1;
        this.field3174 = arg2;
        this.field3172 = arg3;
        this.field3175 = arg4;
    }
}
