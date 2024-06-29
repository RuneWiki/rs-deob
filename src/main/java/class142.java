import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public abstract class class142 extends class631 {

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public int field1804;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public int field1803;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public int field1805;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "[Lcea;")
    public static class124[] field1807 = new class124[2048];

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "Ljj;")
    public static class398 field1806 = new class398(25, -1);

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "Llp;")
    public static class270 field1810 = new class270(8, 0, 4, 1);

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "Lhv;")
    public static class97 field1811 = new class97();

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)V")
    public static void method974(byte arg0) {
        field1806 = null;
        field1807 = null;
        field1811 = null;
        field1810 = null;
        if (arg0 <= 7) {
            field1811 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(B)V")
    public static final void method975(byte arg0) {
        field1808++;
        class179.field2242 = 0;
        class37.field371.method365(-1);
        int var1 = -51 / ((-arg0 - 42) / 62);
        class37.field371.method378(class681.field9681, 31316);
        class179.field2242++;
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(IIII)V")
    public class142(int arg0, int arg1, int arg2, int arg3) {
        this.field1809 = arg3;
        this.field1804 = arg1;
        this.field1803 = arg2;
        this.field1805 = arg0;
    }
}
