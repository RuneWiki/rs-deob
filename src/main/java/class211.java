import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class211 extends class115 {

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lmj;")
    public static class129 field3644 = null;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "[S")
    public static short[] field3649 = new short[256];

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "Lqe;")
    public static class168 field3655 = class66.method448("sl_stars", 17);

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field3648 = 0;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "Lqe;")
    public static class168 field3651 = class66.method448("Lade Benutzeroberfl-=che )2 ", -117);

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 != 107) {
            method1365(-112);
        }
        if (arg2 == 0) {
            this.field3646 = (arg1.method758(true) << 12) / 255;
        }
        ++field3645;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZII)V")
    public static final void method1363(boolean arg0, int arg1, int arg2) {
        ++field3654;
        class110 var3 = class117.method802(0, arg1);
        if (!arg0) {
            method1366(-66);
        }
        int var4 = var3.field1764;
        int var5 = var3.field1757;
        int var6 = var3.field1759;
        int var7 = class179.field3151[-var5 + var6];
        if (~arg2 > -1 || ~var7 > ~arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class251.method1647((byte) 12, var4, class50.field682[var4] & ~var8 | arg2 << var5 & var8);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lnc;I)V")
    public static final void method1364(class136 arg0, int arg1) {
        ++field3647;
        if (arg1 != 5870) {
            method1365(58);
        }
        if (class254.field4403 == 0 || class254.field4403 == 5) {
            byte var2 = 20;
            arg0.method925(class16.field140, 382, 245 - var2, 16777215, -1);
            int var3 = -var2 + 253;
            class216.method1395(230, var3, 304, 34, 9179409);
            class216.method1395(231, var3 + 1, 302, 32, 0);
            class216.method1405(232, var3 + 2, class145.field2532 * 3, 30, 9179409);
            class216.method1405(232 - -(class145.field2532 * 3), var3 + 2, -(class145.field2532 * 3) + 300, 30, 0);
            arg0.method925(class186.field3277, 382, -var2 + 276, 16777215, -1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class211() {
        this(4096);
    }

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)V")
    public static void method1365(int arg0) {
        if (arg0 == 4096) {
            field3655 = null;
            field3649 = null;
            field3644 = null;
            field3651 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field3653;
        int[] var3 = super.field1872.method182((byte) -126, arg0);
        if (super.field1872.field341) {
            class22.method115(var3, 0, class130.field2297, this.field3646);
        }
        if (arg1 < 37) {
            method1363(true, 3, 127);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(I)V")
    private class211(int arg0) {
        super(0, true);
        this.field3646 = 4096;
        this.field3646 = arg0;
    }

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "(I)Z")
    public static final boolean method1366(int arg0) {
        ++field3652;
        try {
            int var1 = -117 % ((arg0 - -2) / 36);
            if (~class135.field2361 == -3) {
                if (class158.field2724 == null) {
                    class158.field2724 = class72.method492(class177.field3120, class233.field3968, class221.field3804);
                    if (class158.field2724 == null) {
                        return false;
                    }
                }
                if (class138.field2435 == null) {
                    class138.field2435 = new class43(class172.field2992, class190.field3314);
                }
                if (class114.field1866.method1306(class158.field2724, 32226, 22050, class190.field3305, class138.field2435)) {
                    class114.field1866.method1314(true);
                    class114.field1866.method1319((byte) 74, class161.field2764);
                    class114.field1866.method1297(class158.field2724, class243.field4222, (byte) -43);
                    class138.field2435 = null;
                    class158.field2724 = null;
                    class135.field2361 = 0;
                    class177.field3120 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class114.field1866.method1322(false);
            class138.field2435 = null;
            class177.field3120 = null;
            class135.field2361 = 0;
            class158.field2724 = null;
        }
        return false;
    }
}
