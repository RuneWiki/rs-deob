import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class144 extends RuntimeException {

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2521;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Ljava/lang/String;")
    public String field2520;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lsf;")
    public static class33 field2522 = new class33();

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lia;")
    public static class257 field2527 = class28.method234(121, " GMT");

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Lsf;")
    public static class33 field2525 = new class33();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "[[S")
    public static short[][] field2526;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static void method976(boolean arg0) {
        field2526 = null;
        field2522 = null;
        field2527 = null;
        field2525 = null;
        if (arg0) {
            field2523 = 64;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[Lia;)[Lia;")
    public static final class257[] method977(int arg0, class257[] arg1) {
        field2524++;
        if (arg0 != 29212) {
            return null;
        }
        class257[] var2 = new class257[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class233.method1528(new class257[] { class111.method808(10, var3), class208.field3562 }, 0);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class233.method1528(new class257[] { var2[var3], arg1[var3] }, class238.method1553(arg0, 29212));
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class144(Throwable arg0, String arg1) {
        this.field2521 = arg0;
        this.field2520 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([II)[I")
    public static final int[] method978(int[] arg0, int arg1) {
        field2519++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        if (arg1 != -14789) {
            field2526 = null;
        }
        class86.method643(arg0, 0, var2, 0, arg0.length);
        return var2;
    }
}
