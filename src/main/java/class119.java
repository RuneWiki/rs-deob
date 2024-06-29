import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class119 {

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lvj;")
    public static class26 field1827 = new class26(9, 2);

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static void method939(boolean arg0) {
        field1827 = null;
        if (!arg0) {
            method941(61, -114);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)Z")
    public static final boolean method940(int arg0, byte arg1) {
        if (arg1 >= -18) {
            method939(true);
        }
        field1831++;
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lnfa;")
    public static final class225 method941(int arg0, int arg1) {
        field1829++;
        int var2 = 8 % ((arg1 + 17) / 59);
        return class443.field6439 && arg0 >= class27.field275 && arg0 <= class404.field5993 ? class155.field2403[arg0 - class27.field275] : null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
    public abstract void method465(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZ)V")
    public abstract void method460(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZII)V")
    public abstract void method463(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V")
    public class119(int arg0, int arg1, int arg2) {
        this.field1828 = arg2;
        this.field1830 = arg0;
        this.field1832 = arg1;
    }
}
