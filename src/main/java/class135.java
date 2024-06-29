import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class135 extends class124 {

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "[B")
    public byte[] field3311;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lqb;)Lwd;", line = 5)
    public final class135 method1058(class98 arg0) {
        this.field3311 = arg0.method848(this.field3311, false);
        this.field3314 = arg0.method845(this.field3314, 4);
        if (this.field3313 == this.field3312) {
            this.field3312 = this.field3313 = arg0.method843(this.field3312, 54);
        } else {
            this.field3312 = arg0.method843(this.field3312, 54);
            this.field3313 = arg0.method843(this.field3313, 54);
            if (this.field3313 == this.field3312) {
                this.field3312--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I[BII)V", line = 24)
    public class135(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3314 = arg0;
        this.field3311 = arg1;
        this.field3312 = arg2;
        this.field3313 = arg3;
    }
}
