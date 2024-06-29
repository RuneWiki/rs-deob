import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class51 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lok;")
    private static class41 field771 = class137.method956("Choose Option", 45);

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field774 = 0;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Lok;")
    public static class41 field773 = field771;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lok;")
    public static class41 field775 = class137.method956("::breakcon", 45);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[[I")
    public static int[][] field778;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)I", line = 18)
    public static final int method354(byte arg0) {
        int var1 = -39 % ((27 - arg0) / 43);
        field768++;
        return class208.field3368 == 0 ? 0 : class109.field1530[class208.field3368].method153();
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V", line = 35)
    public static final void method355(byte arg0) {
        int var1 = 29 / ((-arg0 - 68) / 49);
        field777++;
        for (int var2 = 0; var2 < class127.field1892; var2++) {
            class238 var3 = class187.method1348((byte) 121, var2);
            if (var3 != null && var3.field3807 == 0) {
                class268.field4291[var2] = 0;
                class60.field885[var2] = 0;
            }
        }
        class16.field206 = new class86(16);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(III)V", line = 59)
    public class51(int arg0, int arg1, int arg2) {
        this.field767 = arg1;
        this.field769 = arg2;
        this.field772 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 93)
    public static void method356(int arg0) {
        field778 = (int[][]) null;
        field775 = null;
        if (arg0 != 0) {
            method355((byte) 41);
        }
        field773 = null;
        field771 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public abstract void method72(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)V")
    public abstract void method71(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(III)V")
    public abstract void method73(int arg0, int arg1, int arg2);
}
