import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class76 extends class142 {

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    private int field1311 = 10;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    private int field1309 = 0;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    private int field1320 = 2048;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "Lke;")
    public static class96 field1323 = new class96(5000);

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "Lai;")
    private static class10 field1324 = class44.method278("Cancel", -45);

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "Lai;")
    public static class10 field1328 = class44.method278("", -41);

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "Lai;")
    private static class10 field1327 = class44.method278("Please enter your username)3", -85);

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "Lai;")
    public static class10 field1325 = field1324;

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "Lai;")
    public static class10 field1326 = field1327;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "[I")
    private int[] field1317;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "[I")
    private int[] field1322;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public static void method469(int arg0) {
        field1324 = null;
        field1326 = null;
        field1327 = null;
        field1328 = null;
        if (arg0 == 7) {
            field1325 = null;
            field1323 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class76() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 >= -34) {
            this.field1322 = null;
        }
        ++field1321;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field1309 = arg0.method767(true);
                }
            } else {
                this.field1320 = arg0.method762((byte) 105);
            }
        } else {
            this.field1311 = arg0.method767(true);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        if (arg0 != -1) {
            this.field1311 = 64;
        }
        ++field1314;
        this.method471((byte) -46);
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Z")
    public static final boolean method470(int arg0) {
        ++field1319;
        if (~class75.field1290 != -1) {
            return true;
        } else {
            if (arg0 != 0) {
                field1326 = null;
            }
            return class101.field1887.method971((byte) 126);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    private final void method471(byte arg0) {
        this.field1317 = new int[this.field1311 - -1];
        int var2 = 0;
        this.field1322 = new int[this.field1311 + 1];
        int var3 = 4096 / this.field1311;
        ++field1310;
        if (arg0 >= -28) {
            this.field1322 = null;
        }
        int var4 = this.field1320 * var3 >> 12;
        for (int var5 = 0; this.field1311 > var5; ++var5) {
            this.field1322[var5] = var2;
            this.field1317[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1322[this.field1311] = 4096;
        this.field1317[this.field1311] = this.field1317[0] + 4096;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)I")
    public static final int method472(int arg0, int arg1, int arg2, int arg3) {
        ++field1313;
        int var4 = arg3 & 3;
        if (arg2 != 22373) {
            field1324 = null;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else {
            return ~var4 == -3 ? 7 - arg1 : 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field1318;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int var4 = class13.field212[arg1];
            if (this.field1309 != 0) {
                for (int var5 = 0; class133.field2499 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class79.field1395[var5];
                    int var9 = this.field1309;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = 2048 - -(var8 - (4096 - var4) >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field1311 < ~var10; ++var10) {
                        if (this.field1322[var10] <= var6 && ~var6 > ~this.field1322[var10 + 1]) {
                            if (~this.field1317[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field1311 < ~var12; ++var12) {
                    if (~this.field1322[var12] >= ~var4 && var4 < this.field1322[var12 - -1]) {
                        if (this.field1317[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class12.method84(var3, 0, class133.field2499, var11);
            }
        }
        if (arg0) {
            field1324 = null;
        }
        return var3;
    }
}
