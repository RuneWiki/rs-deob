import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class224 extends class94 {

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "[B")
    public byte[] field3943;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Z")
    public boolean field3941;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljc;)Lci;")
    public final class224 method1544(class221 arg0) {
        this.field3943 = arg0.method1517((byte) 98, this.field3943);
        this.field3942 = arg0.method1519(88, this.field3942);
        if (this.field3944 == this.field3940) {
            this.field3940 = this.field3944 = arg0.method1518(this.field3940, -32768);
        } else {
            this.field3940 = arg0.method1518(this.field3940, -32768);
            this.field3944 = arg0.method1518(this.field3944, -32768);
            if (this.field3944 == this.field3940) {
                this.field3940--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I[BII)V")
    public class224(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3942 = arg0;
        this.field3943 = arg1;
        this.field3940 = arg2;
        this.field3944 = arg3;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I[BIIZ)V")
    public class224(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3942 = arg0;
        this.field3943 = arg1;
        this.field3940 = arg2;
        this.field3944 = arg3;
        this.field3941 = arg4;
    }
}
