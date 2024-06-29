import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class198 extends RuntimeException {

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2707;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "Ljava/lang/String;")
    public String field2706;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "Lvg;")
    public static class622 field2709 = new class622(81, -1);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;", line = 6)
    public static final String[] method1293(String[] arg0, boolean arg1) {
        field2708++;
        String[] var2 = new String[5];
        if (arg1) {
            field2709 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)V", line = 35)
    public static void method1294(boolean arg0) {
        if (!arg0) {
            method1293(null, true);
        }
        field2709 = null;
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 45)
    public class198(Throwable arg0, String arg1) {
        this.field2707 = arg0;
        this.field2706 = arg1;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "([BIZ)V", line = 54)
    public static final void method1295(byte[] arg0, int arg1, boolean arg2) {
        field2705++;
        if (class374.field5524 == null) {
            class374.field5524 = new class540(20000);
        }
        class374.field5524.method3149(0, arg0, arg0.length, -100);
        if (arg2) {
            class690.method3866(-106, class374.field5524.field7952);
            class568.field8284 = new class116[class169.field2383];
            int var3 = 0;
            for (int var4 = class465.field6709; var4 <= class697.field9825; var4++) {
                class116 var5 = class378.method2334(arg1 ^ 0xFFFFF164, var4);
                if (var5 != null) {
                    class568.field8284[var3++] = var5;
                }
            }
            class483.field6897 = false;
            class5.field112 = class60.method371(false);
            class374.field5524 = null;
        }
        if (arg1 != 3739) {
            field2709 = null;
        }
    }
}
