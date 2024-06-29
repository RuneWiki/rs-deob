import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class17 extends class102 {

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    private int field454 = 20;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    private int field457 = 0;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "I")
    private int field461 = 0;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "I")
    private int field465 = 1365;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "Lqe;")
    public static class179 field448 = class206.method1380("blaugr-Un:", (byte) -27);

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "Lqe;")
    private static class179 field458 = class206.method1380("Type", (byte) 101);

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "Lqe;")
    private static class179 field450 = class206.method1380("Unable to find ", (byte) 37);

    @OriginalMember(owner = "client!be", name = "R", descriptor = "Lqe;")
    private static class179 field451 = class206.method1380("Connecting to update server", (byte) 34);

    @OriginalMember(owner = "client!be", name = "P", descriptor = "Lqe;")
    public static class179 field449 = class206.method1380(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) -126);

    @OriginalMember(owner = "client!be", name = "V", descriptor = "Lqe;")
    public static class179 field455 = field451;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "Lqe;")
    public static class179 field452 = field458;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "Lqe;")
    private static class179 field464 = class206.method1380("Connecting to server)3)3)3", (byte) -127);

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "Lqe;")
    public static class179 field463 = field450;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "Lqe;")
    public static class179 field446 = class206.method1380("settings", (byte) 112);

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "Lqe;")
    public static class179 field467 = field464;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class17() {
        super(0, true);
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
    public static final void method129(byte arg0) {
        class143.field2611 = null;
        class150.field2703 = null;
        class175.field3185 = null;
        class173.field3102 = null;
        class31.field674 = null;
        class187.field3493 = null;
        if (arg0 > -74) {
            field449 = null;
        }
        ++field456;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
    public static final void method130(byte arg0) {
        ++field459;
        for (class112 var1 = (class112) class58.field1253.method242(16711680); var1 != null; var1 = (class112) class58.field1253.method237(arg0 + -52)) {
            if (var1.field2098 > 0) {
                --var1.field2098;
            }
            if (var1.field2098 == 0) {
                if (var1.field2097 < 0 || class189.method1272(4096, var1.field2094, var1.field2097)) {
                    class175.method1107(var1.field2115, (byte) -100, var1.field2104, var1.field2094, var1.field2095, var1.field2102, var1.field2099, var1.field2097);
                    var1.method592((byte) -128);
                }
            } else {
                if (~var1.field2096 < -1) {
                    --var1.field2096;
                }
                if (~var1.field2096 == -1 && var1.field2104 >= 1 && var1.field2102 >= 1 && var1.field2104 <= 102 && var1.field2102 <= 102 && (var1.field2112 < 0 || class189.method1272(arg0 ^ 4158, var1.field2103, var1.field2112))) {
                    class175.method1107(var1.field2093, (byte) -100, var1.field2104, var1.field2103, var1.field2095, var1.field2102, var1.field2099, var1.field2112);
                    var1.field2096 = -1;
                    if (var1.field2112 == var1.field2097 && ~var1.field2097 == 0) {
                        var1.method592((byte) -128);
                    } else if (var1.field2112 == var1.field2097 && var1.field2115 == var1.field2093 && ~var1.field2103 == ~var1.field2094) {
                        var1.method592((byte) -128);
                    }
                }
            }
        }
        if (arg0 != 62) {
            field458 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field466;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field461 = arg0.method1252(2);
                    }
                } else {
                    this.field457 = arg0.method1252(2);
                }
            } else {
                this.field454 = arg0.method1252(2);
            }
        } else {
            this.field465 = arg0.method1252(2);
        }
        if (arg2) {
            method129((byte) -120);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            for (int var4 = 0; ~var4 > ~class155.field2796; ++var4) {
                int var5 = (class124.field2292[var4] << 12) / this.field465 - -this.field457;
                int var6 = (class94.field1769[arg1] << 12) / this.field465 + this.field461;
                int var7 = var5;
                int var8 = var6;
                int var9 = var6;
                int var10 = var5 * var5 >> 12;
                int var11 = var6 * var6 >> 12;
                int var12 = 0;
                int var13 = var5;
                while (~(var10 + var11) > -16385 && ~var12 > ~this.field454) {
                    ++var12;
                    var9 = (var9 * var13 >> 12) * 2 + var8;
                    var13 = var7 + var10 + -var11;
                    var11 = var9 * var9 >> 12;
                    var10 = var13 * var13 >> 12;
                }
                var3[var4] = ~var12 > ~(this.field454 + -1) ? (var12 << 12) / this.field454 : 0;
            }
        }
        ++field462;
        if (!arg0) {
            this.method11(true, 23);
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public static void method131(int arg0) {
        field451 = null;
        if (arg0 != -16385) {
            field463 = null;
        }
        field448 = null;
        field450 = null;
        field449 = null;
        field467 = null;
        field455 = null;
        field464 = null;
        field446 = null;
        field458 = null;
        field452 = null;
        field463 = null;
    }
}
