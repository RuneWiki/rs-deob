import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class476 extends class337 {

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Z")
    public volatile boolean field6182 = true;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public int field6181;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "Ltfa;")
    public class300 field6183;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "Lkm;")
    public class476 field6184;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()I")
    public abstract int method31();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([III)V")
    public abstract void method33(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!km", name = "b", descriptor = "([III)V")
    public final void method2679(int[] arg0, int arg1, int arg2) {
        if (this.field6182) {
            this.method33(arg0, arg1, arg2);
        } else {
            this.method36(arg2);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "()Lkm;")
    public abstract class476 method42();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public abstract void method36(int arg0);

    @OriginalMember(owner = "client!km", name = "c", descriptor = "()I")
    public int method2680() {
        return 255;
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "()Lkm;")
    public abstract class476 method40();
}
