import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public abstract class class343 extends class381 {

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "Lhd;")
    public class17 field4661;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "Z")
    public boolean field4660;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
    public abstract void method1737(int arg0);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "()Z")
    public abstract boolean method1735();

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "()I")
    public int method1736() {
        return 0;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "()Z")
    public abstract boolean method1738();

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "()V")
    public abstract void method1732();

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)Z")
    public final boolean method2171(byte arg0) {
        return arg0 <= 57 ? false : false;
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Z")
    public final boolean method2172(int arg0) {
        if (arg0 < 92) {
            this.field4660 = true;
        }
        return this.field4660;
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)I")
    public final int method2173(int arg0) {
        return arg0 == 1 ? 1 : 24;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
    public abstract void method1733(int arg0, int arg1);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILoe;Loe;)V")
    public abstract void method1734(int arg0, class231 arg1, class231 arg2);

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lhd;)V")
    public class343(class17 arg0) {
        this.field4661 = arg0;
    }
}
