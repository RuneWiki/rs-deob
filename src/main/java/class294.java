import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class294 extends class230 {

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field3967;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[B")
    public byte[] field3966;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public int field3970;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Z")
    public boolean field3969;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lfm;)Lkf;", line = 7)
    public final class294 method1895(class316 arg0) {
        this.field3966 = arg0.method2016(0, this.field3966);
        this.field3967 = arg0.method2010(this.field3967, (byte) -127);
        if (this.field3970 == this.field3968) {
            this.field3968 = this.field3970 = arg0.method2008(4888, this.field3968);
        } else {
            this.field3968 = arg0.method2008(4888, this.field3968);
            this.field3970 = arg0.method2008(4888, this.field3970);
            if (this.field3970 == this.field3968) {
                this.field3968--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class294(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3967 = arg0;
        this.field3966 = arg1;
        this.field3968 = arg2;
        this.field3970 = arg3;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class294(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3967 = arg0;
        this.field3966 = arg1;
        this.field3968 = arg2;
        this.field3970 = arg3;
        this.field3969 = arg4;
    }
}
