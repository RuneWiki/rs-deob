import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class71 extends class128 {

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
    public volatile boolean field1723 = true;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Lkb;")
    public class71 field1726;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Lnb;")
    public class92 field1724;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
    public final void method545(int[] arg0, int arg1, int arg2) {
        if (this.field1723) {
            this.method120(arg0, arg1, arg2);
        } else {
            this.method104(arg2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()Lkb;")
    public abstract class71 method109();

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public abstract void method104(int arg0);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()Lkb;")
    public abstract class71 method87();

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V")
    public abstract void method120(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
    public abstract int method113();

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()I")
    public int method546() {
        return 255;
    }
}
