import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class396 extends class253 {

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public int field5989;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "[B")
    public byte[] field5988;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public int field5987;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public int field5991;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "Z")
    public boolean field5990;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lgu;)Lwm;")
    public final class396 method2465(class501 arg0) {
        this.field5988 = arg0.method2856((byte) -64, this.field5988);
        this.field5989 = arg0.method2855(this.field5989, false);
        if (this.field5991 == this.field5987) {
            this.field5987 = this.field5991 = arg0.method2857(this.field5987, 32767);
        } else {
            this.field5987 = arg0.method2857(this.field5987, 32767);
            this.field5991 = arg0.method2857(this.field5991, 32767);
            if (this.field5991 == this.field5987) {
                this.field5987--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I[BII)V")
    public class396(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5989 = arg0;
        this.field5988 = arg1;
        this.field5987 = arg2;
        this.field5991 = arg3;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I[BIIZ)V")
    public class396(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5989 = arg0;
        this.field5988 = arg1;
        this.field5987 = arg2;
        this.field5991 = arg3;
        this.field5990 = arg4;
    }
}
