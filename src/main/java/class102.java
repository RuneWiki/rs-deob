import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 {

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lhe;")
    public static class54 field2551 = class6.method58("headicons_pk", false);

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lhe;")
    private static class54 field2554 = class6.method58("Error connecting to server)3", false);

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lhe;")
    public static class54 field2545 = field2554;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lhe;")
    private static class54 field2557 = class6.method58("and choose the (Wcreate account(W", false);

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static volatile int field2547 = 0;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Lhe;")
    private static class54 field2559 = class6.method58("You need a members account to login to this world)3", false);

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lhe;")
    public static class54 field2548 = field2557;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lhe;")
    public static class54 field2549 = field2559;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lhe;")
    private static class54 field2560 = class6.method58("Loaded sprites", false);

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lhe;")
    public static class54 field2555 = field2560;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[I")
    public static int[] field2553;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBII)V")
    public static final void method799(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 6) {
            method802(-113, 7);
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class141.field3211[arg0][arg3 + var4][arg2 + var7] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class141.field3211[arg0][arg3][arg2 + var5] = class141.field3211[arg0][arg3 - 1][arg2 + var5];
            }
        }
        field2556++;
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class141.field3211[arg0][arg3 + var6][arg2] = class141.field3211[arg0][arg3 + var6][arg2 - 1];
            }
        }
        if (arg3 > 0 && class141.field3211[arg0][arg3 - 1][arg2] != 0) {
            class141.field3211[arg0][arg3][arg2] = class141.field3211[arg0][arg3 - 1][arg2];
        } else if (arg2 > 0 && class141.field3211[arg0][arg3][arg2 - 1] != 0) {
            class141.field3211[arg0][arg3][arg2] = class141.field3211[arg0][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && class141.field3211[arg0][arg3 - 1][arg2 - 1] != 0) {
            class141.field3211[arg0][arg3][arg2] = class141.field3211[arg0][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final void method800(byte arg0) {
        if (arg0 >= -2) {
            method803(true);
        }
        field2544++;
        if (class148.field3334.toLowerCase().indexOf("microsoft") != -1) {
            class28.field737[189] = 26;
            class28.field737[220] = 74;
            class28.field737[186] = 57;
            class28.field737[190] = 72;
            class28.field737[222] = 59;
            class28.field737[219] = 42;
            class28.field737[221] = 43;
            class28.field737[188] = 71;
            class28.field737[191] = 73;
            class28.field737[192] = 58;
            class28.field737[223] = 28;
            class28.field737[187] = 27;
            return;
        }
        class28.field737[46] = 72;
        class28.field737[61] = 27;
        class28.field737[44] = 71;
        class28.field737[47] = 73;
        class28.field737[92] = 74;
        class28.field737[59] = 57;
        class28.field737[45] = 26;
        class28.field737[91] = 42;
        class28.field737[93] = 43;
        if (class148.field3342 == null) {
            class28.field737[192] = 58;
            class28.field737[222] = 59;
        } else {
            class28.field737[222] = 58;
            class28.field737[192] = 28;
            class28.field737[520] = 59;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)J")
    public static final synchronized long method801(byte arg0) {
        field2558++;
        long var1 = System.currentTimeMillis();
        if (arg0 != -42) {
            method801((byte) -124);
        }
        if (var1 < class44.field1118) {
            class2.field23 += class44.field1118 - var1;
        }
        class44.field1118 = var1;
        return class2.field23 + var1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public static final void method802(int arg0, int arg1) {
        field2550++;
        if (arg1 == -1 || !class140.field3197[arg1]) {
            return;
        }
        class15.field455.method274(-91, arg1);
        if (class59.field1481[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class59.field1481[arg1].length; var3++) {
            if (class59.field1481[arg1][var3] != null) {
                if (class59.field1481[arg1][var3].field2359 == 2) {
                    var2 = false;
                } else {
                    class59.field1481[arg1][var3] = null;
                }
            }
        }
        if (arg0 >= -113) {
            field2557 = null;
        }
        if (var2) {
            class59.field1481[arg1] = null;
        }
        class140.field3197[arg1] = false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method803(boolean arg0) {
        field2549 = null;
        field2548 = null;
        if (arg0) {
            return;
        }
        field2557 = null;
        field2559 = null;
        field2545 = null;
        field2555 = null;
        field2554 = null;
        field2553 = null;
        field2560 = null;
        field2551 = null;
    }
}
