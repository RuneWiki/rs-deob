import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class102 {

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Lqk;")
    public static class207 field1835 = class24.method212(255, "Hierhin gehen");

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Lqk;")
    public static class207 field1837 = class24.method212(255, ")4l=");

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "[I")
    public static int[] field1840 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lbf;")
    public static class199 field1843 = new class199(64);

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "Lle;")
    public static class42 field1842;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lpk;")
    public static class99 field1836;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
    public abstract void method25(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method743(int arg0) {
        field1835 = null;
        field1837 = null;
        field1843 = null;
        field1840 = null;
        field1836 = null;
        if (arg0 != 1) {
            method743(115);
        }
        field1842 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZI)V")
    public abstract void method23(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)V")
    public abstract void method22(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(III)V")
    public class102(int arg0, int arg1, int arg2) {
        this.field1844 = arg0;
        this.field1834 = arg1;
        this.field1838 = arg2;
    }
}
