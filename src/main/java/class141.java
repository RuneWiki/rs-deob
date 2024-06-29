import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class141 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field2494 = 0;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[Lnd;")
    public static class192[] field2499 = new class192[2048];

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[I")
    public static int[] field2495 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lsb;")
    public static class98 field2500 = class47.method368("Lade Texturen )2 ", 0);

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lq;")
    public static class148 field2492 = null;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lsb;")
    public static class98 field2491 = class47.method368("Texturen geladen)3", 0);

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static final void method1054(int arg0) {
        class211.field3614.method1554((byte) -109);
        if (arg0 == 23178) {
            field2493++;
            class156.field2843.method1554((byte) -109);
            class121.field2230.method1554((byte) -109);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLsb;)Z")
    public static final boolean method1055(boolean arg0, class98 arg1) {
        field2501++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class99.field1751; var2++) {
            if (arg1.method731((byte) -59, class49.field817[var2])) {
                return true;
            }
        }
        if (!arg0) {
            field2500 = null;
        }
        return arg1.method731((byte) -32, class163.field2943.field3323);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Z")
    public static final boolean method1056(int arg0, byte arg1) {
        field2497++;
        if (class248.field4361[arg0]) {
            return true;
        } else if (class252.field4414.method559(-11561, arg0)) {
            int var2 = class252.field4414.method550(-1757152080, arg0);
            if (var2 == 0) {
                class248.field4361[arg0] = true;
                return true;
            }
            if (class33.field585[arg0] == null) {
                class33.field585[arg0] = new class148[var2];
            }
            int var3 = 31 % ((arg1 + 13) / 32);
            for (int var4 = 0; var4 < var2; var4++) {
                if (class33.field585[arg0][var4] == null) {
                    byte[] var5 = class252.field4414.method571(arg0, var4, -112);
                    if (var5 != null) {
                        class33.field585[arg0][var4] = new class148();
                        class33.field585[arg0][var4].field2728 = (arg0 << 16) + var4;
                        if (var5[0] == -1) {
                            class33.field585[arg0][var4].method1086(-119, new class216(var5));
                        } else {
                            class33.field585[arg0][var4].method1092(new class216(var5), (byte) 119);
                        }
                    }
                }
            }
            class248.field4361[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
    public static final void method1057(int arg0, int arg1) {
        field2496++;
        class16.method133(-1);
        class239.method1630((byte) 55);
        int var2 = class215.method1431(0, arg0).field1629;
        int var3 = -98 % ((-arg1 - 63) / 37);
        if (var2 == 0) {
            return;
        }
        int var4 = class118.field2117[arg0];
        if (var2 == 5) {
            class164.field2953 = var4;
        }
        if (var2 == 6) {
            class143.field2522 = var4;
        }
        if (var2 == 9) {
            class166.field2966 = var4;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static void method1058(boolean arg0) {
        if (!arg0) {
            field2499 = null;
        }
        field2492 = null;
        field2495 = null;
        field2499 = null;
        field2500 = null;
        field2491 = null;
    }
}
