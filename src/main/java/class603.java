import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class603 {

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "Lmga;")
    private class666 field8013 = new class666(128);

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "Lbi;")
    private class449 field8011;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "Lmga;")
    public static class666 field8015 = new class666(260);

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "[[Z")
    public static boolean[][] field8017 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "Lbi;")
    public static class449 field8016;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method3323(byte arg0, int arg1) {
        class704.field9906 = null;
        class71.field1059 = 1;
        class462.field6257 = -1;
        class369.field4989 = -1;
        class344.field4715 = false;
        class515.field6877 = arg1;
        class254.field3517 = 0;
        int var2 = -38 / ((arg0 - 10) / 34);
        field8012++;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(BI)Lhn;", line = 25)
    public final class676 method3324(byte arg0, int arg1) {
        field8014++;
        class666 var3 = this.field8013;
        class676 var4;
        synchronized (this.field8013) {
            var4 = (class676) this.field8013.method3750((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field8011.method2537(false, class524.method2927(2, arg1), class305.method1844(arg1, (byte) 95));
        int var6 = -9 % ((arg0 - 10) / 47);
        class676 var7 = new class676();
        if (var5 != null) {
            var7.method3779(0, new class335(var5));
        }
        class666 var8 = this.field8013;
        synchronized (this.field8013) {
            this.field8013.method3745(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V", line = 54)
    public static void method3325(boolean arg0) {
        field8016 = null;
        field8017 = null;
        field8015 = null;
        if (arg0) {
            field8017 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lpca;ILbi;)V", line = 76)
    public class603(class671 arg0, int arg1, class449 arg2) {
        this.field8011 = arg2;
        if (this.field8011 != null) {
            int var4 = this.field8011.method2545(0) - 1;
            this.field8011.method2527(0, var4);
        }
    }
}
