import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class199 extends class282 {

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "Ljava/lang/Object;")
    private Object field3308;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "[Lhe;")
    public static class242[] field3302 = new class242[4];

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "Z")
    public static boolean field3298 = true;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "[I")
    public static int[] field3304 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "[Z")
    public static boolean[] field3303 = new boolean[100];

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "Ltl;")
    public static class59 field3306 = class85.method639("compass", 9588);

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "Loj;")
    public static class260 field3307;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILme;Lme;)V", line = 7)
    public static final void method1431(int arg0, class295 arg1, class295 arg2) {
        class221.field3575 = arg1;
        if (arg0 == 5) {
            class31.field432 = arg2;
            field3299++;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZZ)V", line = 26)
    public static final void method1432(boolean arg0, boolean arg1) {
        field3309++;
        if (!arg0 && class276.field4754 != arg1) {
            class276.field4754 = arg1;
            class305.method2116(true);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)Z", line = 42)
    public final boolean method1433(byte arg0) {
        if (arg0 <= 10) {
            field3304 = (int[]) null;
        }
        field3300++;
        return false;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)V", line = 68)
    public static void method1434(byte arg0) {
        field3307 = null;
        field3304 = null;
        field3303 = null;
        int var1 = 102 % ((arg0 - 35) / 52);
        field3302 = null;
        field3306 = null;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 84)
    public final Object method1435(byte arg0) {
        field3305++;
        return arg0 == -97 ? this.field3308 : (Object) null;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 95)
    public class199(Object arg0) {
        this.field3308 = arg0;
    }
}
