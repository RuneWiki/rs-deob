import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class120 extends class449 {

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Lfu;")
    public class42 field1657;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Z")
    public boolean field1656;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Z", line = 5)
    public final boolean method925(int arg0) {
        return arg0 == 23620 ? this.field1656 : true;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I", line = 21)
    public final int method932(int arg0) {
        if (arg0 != 1) {
            this.field1656 = false;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z", line = 31)
    public final boolean method933(byte arg0) {
        if (arg0 <= 114) {
            this.field1657 = (class42) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()I", line = 41)
    public int method934() {
        return 0;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lfu;)V", line = 48)
    public class120(class42 arg0) {
        this.field1657 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()Z")
    public abstract boolean method926();

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()Z")
    public abstract boolean method927();

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
    public abstract void method928(int arg0, int arg1);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILuo;Luo;)V")
    public abstract void method929(int arg0, class429 arg1, class429 arg2);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()V")
    public abstract void method930();

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
    public abstract void method931(int arg0);
}
