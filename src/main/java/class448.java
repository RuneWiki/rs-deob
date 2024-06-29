import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public abstract class class448 extends class627 {

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "Leq;")
    public class357 field6297;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field6295 = 0;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "Z")
    public boolean field6298;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I", line = 7)
    public final int method2641(byte arg0) {
        int var2 = 124 / ((arg0 - 14) / 50);
        field6294++;
        return 1;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)I", line = 17)
    public int method1855(int arg0) {
        if (arg0 != 7) {
            this.method2642(true);
        }
        field6299++;
        return 0;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)Z", line = 33)
    public final boolean method2642(boolean arg0) {
        if (arg0) {
            field6300++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "(I)Z", line = 49)
    public final boolean method2643(int arg0) {
        field6296++;
        return arg0 == 0 ? this.field6298 : true;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Leq;)V", line = 63)
    public class448(class357 arg0) {
        this.field6297 = arg0;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)V")
    public abstract void method1863(int arg0, int arg1);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BII)V")
    public abstract void method1856(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)Z")
    public abstract boolean method1861(int arg0);

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)V")
    public abstract void method1857(int arg0);

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "(I)Z")
    public abstract boolean method1860(int arg0);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lhga;ILhga;B)V")
    public abstract void method1864(class185 arg0, int arg1, class185 arg2, byte arg3);
}
