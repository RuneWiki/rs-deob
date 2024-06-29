import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class245 extends class23 {

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    private int field4396 = 0;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    private int field4408 = 2048;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    private int field4404 = 10;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field4394 = 0;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "Llc;")
    public static class143 field4401 = class66.method374(" autres options", -1);

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "Llc;")
    public static class143 field4407 = class66.method374(" (X", -1);

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "Llc;")
    public static class143 field4398 = class66.method374("Lade Liste der Welten", -1);

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field4397 = 0;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "Llc;")
    public static class143 field4390 = class66.method374("<col=ff9040>", -1);

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "[I")
    public static int[] field4411 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    public static int field4409 = 0;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "Lda;")
    public static class102 field4395;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "Llc;")
    public static class143 field4393;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "[I")
    private int[] field4391;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "[I")
    private int[] field4403;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
    public static final void method1626(byte arg0) {
        class175.field3135.method823(true);
        if (arg0 <= -19) {
            ++field4400;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field4387;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (arg0 > -13) {
            method1631((byte) 106);
        }
        if (super.field369.field1005) {
            int var4 = class31.field495[arg1];
            if (this.field4396 != 0) {
                for (int var5 = 0; ~class72.field1359 < ~var5; ++var5) {
                    int var6 = 0;
                    int var7 = class3.field43[var5];
                    int var8 = this.field4396;
                    if (~var8 != -2) {
                        if (~var8 != -3) {
                            if (~var8 == -4) {
                                var6 = (-var4 + var7 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + -4096 + var7 >> 1) + 2048;
                        }
                    } else {
                        var6 = var7;
                    }
                    short var9 = 0;
                    for (int var10 = 0; var10 < this.field4404; ++var10) {
                        if (this.field4391[var10] <= var6 && ~this.field4391[var10 + 1] < ~var6) {
                            if (~var6 > ~this.field4403[var10]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var9;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field4404 > var12; ++var12) {
                    if (this.field4391[var12] <= var4 && ~this.field4391[var12 + 1] < ~var4) {
                        if (~this.field4403[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class275.method1812(var3, 0, class72.field1359, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZLgf;Lgf;)V")
    public static final void method1627(int arg0, boolean arg1, class7 arg2, class7 arg3) {
        if (arg0 != -7270) {
            field4407 = null;
        }
        class114.field1992 = arg2;
        class50.field993 = arg1;
        ++field4388;
        class194.field3589 = arg3;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)Llc;")
    public static final class143 method1628(int arg0, int arg1) {
        ++field4392;
        if (~arg1 > arg0) {
            return class25.method179(0, new class143[] { class1.field10, class274.method1806(arg1, true), class20.field328 });
        } else {
            return arg1 < 10000000 ? class25.method179(0, new class143[] { class15.field272, class274.method1806(arg1 / 1000, true), class244.field4386, class20.field328 }) : class25.method179(arg0 + 100001, new class143[] { class37.field652, class274.method1806(arg1 / 1000000, true), class54.field1045, class20.field328 });
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    private final void method1629(boolean arg0) {
        this.field4391 = new int[this.field4404 - -1];
        this.field4403 = new int[this.field4404 + 1];
        int var2 = 4096 / this.field4404;
        ++field4402;
        int var3 = this.field4408 * var2 >> 12;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field4404; ++var5) {
            this.field4391[var5] = var4;
            this.field4403[var5] = var4 - -var3;
            var4 += var2;
        }
        if (!arg0) {
            field4389 = 121;
        }
        this.field4391[this.field4404] = 4096;
        this.field4403[this.field4404] = this.field4403[0] + 4096;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Lwb;")
    public static final class133 method1630(boolean arg0) {
        if (!arg0) {
            field4389 = -72;
        }
        ++field4406;
        return class212.field3943.length > class274.field4870 ? class212.field3943[class274.field4870++] : null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method85((byte) 17);
        }
        ++field4410;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field4396 = arg0.method1265(119);
                }
            } else {
                this.field4408 = arg0.method1275(128);
            }
        } else {
            this.field4404 = arg0.method1265(114);
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        ++field4399;
        this.method1629(true);
        int var2 = 80 / ((22 - arg0) / 60);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V")
    public static void method1631(byte arg0) {
        field4398 = null;
        field4390 = null;
        if (arg0 != -115) {
            method1631((byte) 90);
        }
        field4407 = null;
        field4393 = null;
        field4411 = null;
        field4401 = null;
        field4395 = null;
    }
}
