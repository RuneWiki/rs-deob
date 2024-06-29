import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class391 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lno;")
    private class704 field5890;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "J")
    public long field5891;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Lhe;")
    public static class372 field5887 = new class372(8);

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lmia;")
    public static class63 field5892 = new class63(14, 8);

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field5895 = 100;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Ljt;")
    public static class106 field5893 = new class106(5);

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "F")
    public static float field5888;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "[Lpga;")
    public static class536[] field5894;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[Ljava/lang/String;)V")
    public static final void method2508(boolean arg0, String[] arg1) {
        field5889++;
        if (arg1.length <= 1) {
            class241.field3505 = class241.field3505 + arg1[0];
            class37.field379 += arg1[0].length();
        } else {
            for (int var2 = 0; var2 < arg1.length; var2++) {
                if (arg1[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg1[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class533.method3136(122, "Pausing for " + var3 + " seconds...");
                    class673.field9389 = var2 + 1;
                    class371.field5325 = arg1;
                    class93.field1342 = class524.method3075(18) + (long) (var3 * 1000);
                    return;
                }
                class241.field3505 = arg1[var2];
                class686.method3909(106, false);
            }
        }
        if (arg0) {
            method2508(false, null);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static void method2509(byte arg0) {
        field5894 = null;
        field5887 = null;
        field5892 = null;
        field5893 = null;
        if (arg0 != -31) {
            field5893 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5886++;
        this.field5890.method4004(0, this.field5891);
        super.finalize();
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lno;J[Lfk;)V")
    public class391(class704 arg0, long arg1, class656[] arg2) {
        this.field5890 = arg0;
        this.field5891 = arg1;
    }
}
