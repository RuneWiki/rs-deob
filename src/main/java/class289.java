import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class289 extends class206 {

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public int field4926;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    private int field4920;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "[[I")
    public int[][] field4918;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "[I")
    public int[] field4921;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "[Z")
    public boolean[] field4922;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "Lhi;")
    public static class26 field4923;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "Lhi;")
    public static class26 field4925;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(B)V", line = 4)
    public static void method1972(byte arg0) {
        if (arg0 != 15) {
            field4925 = (class26) null;
        }
        field4925 = null;
        field4923 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIBIII)V", line = 31)
    public static final void method1973(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 <= 83) {
            field4923 = (class26) null;
        }
        if ((arg1 - arg0) >= class176.field2819 && class52.field755 >= arg0 + arg1 && arg5 - arg0 >= class99.field1630 && class81.field1348 >= (arg5 + arg0)) {
            class81.method623(arg4, arg0, arg2, false, arg1, arg6, arg5);
        } else {
            class238.method1677(arg4, arg6, arg5, arg1, -1, arg0, arg2);
        }
        field4917++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([BB)Ltj;", line = 51)
    public static final class11 method1974(byte[] arg0, byte arg1) {
        int var2 = 64 / ((7 - arg1) / 54);
        field4919++;
        if (arg0 == null) {
            return null;
        } else {
            class11 var3 = new class11(arg0, class183.field2931, class113.field1878, class15.field132, class184.field2940, class42.field645);
            class135.method1020(-77);
            return var3;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(I[B)V", line = 80)
    public class289(int arg0, byte[] arg1) {
        this.field4926 = arg0;
        class92 var3 = new class92(arg1);
        this.field4920 = var3.method702(-1);
        this.field4918 = new int[this.field4920][];
        this.field4921 = new int[this.field4920];
        this.field4922 = new boolean[this.field4920];
        for (int var4 = 0; var4 < this.field4920; var4++) {
            this.field4921[var4] = var3.method702(-1);
        }
        for (int var5 = 0; var5 < this.field4920; var5++) {
            this.field4922[var5] = var3.method702(-1) == 1;
        }
        for (int var6 = 0; var6 < this.field4920; var6++) {
            this.field4918[var6] = new int[var3.method702(-1)];
        }
        for (int var7 = 0; var7 < this.field4920; var7++) {
            for (int var8 = 0; var8 < this.field4918[var7].length; var8++) {
                this.field4918[var7][var8] = var3.method702(-1);
            }
        }
    }
}
