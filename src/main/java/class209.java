import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class209 extends class359 {

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lpo;")
    public class332 field2828;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Z")
    public boolean field2829;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()Z")
    public abstract boolean method1320();

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    public abstract void method1321(int arg0, int arg1);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public abstract void method1322(int arg0);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
    public abstract void method1323();

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()I")
    public int method1324() {
        return 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILfc;Lfc;)V")
    public abstract void method1325(int arg0, class141 arg1, class141 arg2);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)I")
    public final int method1326(int arg0) {
        if (arg0 != 1) {
            this.field2829 = false;
        }
        return 1;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()Z")
    public abstract boolean method1327();

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lpo;)V")
    public class209(class332 arg0) {
        this.field2828 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)Z")
    public final boolean method1328(byte arg0) {
        int var2 = 81 % ((38 - arg0) / 57);
        return false;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)Z")
    public final boolean method1329(int arg0) {
        if (arg0 != -12506) {
            this.method1328((byte) -27);
        }
        return this.field2829;
    }
}
