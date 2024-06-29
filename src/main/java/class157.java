import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class157 extends class445 {

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Lbf;")
    public class344 field2172;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Z")
    public boolean field2173;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()I", line = 5)
    public int method917() {
        return 0;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)Z", line = 13)
    public final boolean method918(byte arg0) {
        int var2 = 108 / ((-arg0 - 61) / 47);
        return false;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I", line = 22)
    public final int method919(int arg0) {
        int var2 = 34 % ((arg0 + 22) / 62);
        return 1;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)Z", line = 31)
    public final boolean method920(byte arg0) {
        if (arg0 >= -14) {
            this.field2172 = (class344) null;
        }
        return this.field2173;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lbf;)V", line = 45)
    public class157(class344 arg0) {
        this.field2172 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()Z")
    public abstract boolean method916();

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()V")
    public abstract void method921();

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public abstract void method922(int arg0, int arg1);

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public abstract void method923(int arg0);

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "()Z")
    public abstract boolean method924();

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILal;Lal;)V")
    public abstract void method925(int arg0, class58 arg1, class58 arg2);
}
