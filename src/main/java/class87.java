import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class87 extends class148 {

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Z")
    public volatile boolean field2075 = true;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lie;")
    public class61 field2076;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lmd;")
    public class87 field2074;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()Lmd;")
    public abstract class87 method30();

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([III)V")
    public abstract void method44(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public abstract void method41(int arg0);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
    public abstract int method42();

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()Lmd;")
    public abstract class87 method35();

    @OriginalMember(owner = "client!md", name = "d", descriptor = "()I")
    public int method673() {
        return 255;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "([III)V")
    public final void method674(int[] arg0, int arg1, int arg2) {
        if (this.field2075) {
            this.method44(arg0, arg1, arg2);
        } else {
            this.method41(arg2);
        }
    }
}
