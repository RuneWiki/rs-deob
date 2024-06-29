import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class25 extends class142 {

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    private int field378 = 4;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    private int field375 = 4;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "Z")
    public static boolean field377 = false;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "Lai;")
    private static class10 field382 = class44.method278("Type", 119);

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field384 = 0;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "Lai;")
    public static class10 field373 = field382;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lai;")
    public static class10 field385 = class44.method278("Der Anmelde)2Server ist offline)3", -78);

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lc;")
    public static class21 field387;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    public static void method166(int arg0) {
        field385 = null;
        field373 = null;
        field382 = null;
        if (arg0 != 32567) {
            method166(-17);
        }
        field387 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        int[][] var3 = super.field2666.method956(arg0, -125);
        if (arg1) {
            this.method6(true, 71);
        }
        if (super.field2666.field2664) {
            int var4 = class133.field2499 / this.field378;
            int var5 = class13.field219 / this.field375;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method961(2, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method961(2, 0, class13.field219 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[2];
            int[] var10 = var6[1];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class133.field2499 > var14; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class133.field2499 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var10[var16];
                var13[var14] = var9[var16];
            }
        }
        ++field386;
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            int[] var3 = super.field2683.method1186((byte) -114, arg1);
            if (super.field2683.field3516) {
                int var4 = class133.field2499 / this.field378;
                int var5 = class13.field219 / this.field375;
                int[] var6;
                if (~var5 >= -1) {
                    var6 = this.method963((byte) -121, 0, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method963((byte) -121, 0, class13.field219 * var7 / var5);
                }
                for (int var8 = 0; class133.field2499 > var8; ++var8) {
                    if (~var4 < -1) {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class133.field2499 * var9 / var4];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            ++field381;
            return var3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lc;Lc;Lc;B)V")
    public static final void method167(class21 arg0, class21 arg1, class21 arg2, byte arg3) {
        class49.field861 = arg2;
        if (arg3 != 113) {
            field373 = null;
        }
        ++field383;
        class179.field3397 = arg1;
        class99.field1821 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
    public static final void method168(byte arg0) {
        if (class20.field297 != null) {
            class20.field297.method552(-5034);
        }
        ++field379;
        int var1 = 12 / ((arg0 - 24) / 40);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)V")
    public static final void method169(int arg0, byte arg1, int arg2) {
        class67 var3 = class28.method180(127, arg0);
        ++field374;
        int var4 = var3.field1165;
        if (arg1 >= -72) {
            method167((class21) null, (class21) null, (class21) null, (byte) 119);
        }
        int var5 = var3.field1184;
        int var6 = var3.field1166;
        int var7 = class107.field1986[-var5 + var6];
        if (arg2 < 0 || ~var7 > ~arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class13.field215[var4] = class66.method434(class123.method861(arg2 << var5, var8), class123.method861(class13.field215[var4], ~var8));
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class25() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 <= -34) {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    this.field375 = arg0.method767(true);
                }
            } else {
                this.field378 = arg0.method767(true);
            }
            ++field376;
        }
    }
}
