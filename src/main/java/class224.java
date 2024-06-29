import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class224 extends class173 {

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "[B")
    public byte[] field3115;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Z")
    public boolean field3112;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljh;)Ldg;", line = 5)
    public final class224 method1470(class446 arg0) {
        this.field3115 = arg0.method2756(this.field3115, (byte) -110);
        this.field3111 = arg0.method2755(0, this.field3111);
        if (this.field3114 == this.field3113) {
            this.field3113 = this.field3114 = arg0.method2754(this.field3113, (byte) -121);
        } else {
            this.field3113 = arg0.method2754(this.field3113, (byte) -74);
            this.field3114 = arg0.method2754(this.field3114, (byte) -85);
            if (this.field3114 == this.field3113) {
                this.field3113--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class224(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3111 = arg0;
        this.field3115 = arg1;
        this.field3113 = arg2;
        this.field3114 = arg3;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class224(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3111 = arg0;
        this.field3115 = arg1;
        this.field3113 = arg2;
        this.field3114 = arg3;
        this.field3112 = arg4;
    }
}
