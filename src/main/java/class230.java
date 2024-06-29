import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class230 extends class82 {

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    private int field4307 = 2048;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
    private int field4322 = 0;

    @OriginalMember(owner = "client!w", name = "gb", descriptor = "I")
    private int field4324 = 10;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
    public static int field4316 = 0;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public static int field4311 = 0;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "Ldj;")
    public static class44 field4315 = class89.method650(255, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!w", name = "U", descriptor = "[I")
    public static int[] field4312 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "[Z")
    public static boolean[] field4319 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!w", name = "fb", descriptor = "Ldj;")
    public static class44 field4323 = class89.method650(255, "Lade)3)3)3");

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!w", name = "db", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "[I")
    private int[] field4309;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "[I")
    private int[] field4318;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lve;Lve;ZLgb;I)V")
    public static final void method1507(class225 arg0, class225 arg1, boolean arg2, class69 arg3, int arg4) {
        class147.field2594 = arg2;
        class61.field1147 = arg0;
        class122.field2166 = arg1;
        if (arg4 > -86) {
            method1507((class225) null, (class225) null, false, (class69) null, -44);
        }
        ++field4320;
        int var5 = class122.field2166.method1477(-17161) - 1;
        class170.field2950 = class122.field2166.method1473(20756, var5) + var5 * 256;
        class108.field1974 = arg3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IJ)V")
    public static final void method1508(int arg0, long arg1) {
        ++field4310;
        if ((long) arg0 != arg1) {
            ++class90.field1699;
            class200.field3542.method1170(252, (byte) -128);
            class200.field3542.method536(arg1, 102);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        if (arg0 != 25238) {
            field4319 = null;
        }
        ++field4321;
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int var4 = class212.field3809[arg1];
            if (~this.field4322 != -1) {
                for (int var5 = 0; class129.field2287 > var5; ++var5) {
                    int var6 = 0;
                    int var7 = class49.field912[var5];
                    short var8 = 0;
                    int var9 = this.field4322;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var7 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var7 - -var4 - 4096 >> 1) + 2048;
                        }
                    } else {
                        var6 = var7;
                    }
                    for (int var10 = 0; ~this.field4324 < ~var10; ++var10) {
                        if (var6 >= this.field4309[var10] && ~this.field4309[var10 + 1] < ~var6) {
                            if (var6 < this.field4318[var10]) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var8;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field4324 < ~var12; ++var12) {
                    if (~this.field4309[var12] >= ~var4 && var4 < this.field4309[var12 - -1]) {
                        if (~var4 > ~this.field4318[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class18.method147(var3, 0, class129.field2287, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
    private final void method1509(int arg0) {
        ++field4317;
        this.field4318 = new int[this.field4324 + arg0];
        this.field4309 = new int[this.field4324 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field4324;
        int var4 = this.field4307 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field4324; ++var5) {
            this.field4309[var5] = var2;
            this.field4318[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field4309[this.field4324] = 4096;
        this.field4318[this.field4324] = this.field4318[0] + 4096;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
    public static void method1510(byte arg0) {
        field4323 = null;
        field4315 = null;
        field4312 = null;
        field4319 = null;
        int var1 = 125 % ((-18 - arg0) / 47);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field4314;
        if (arg2 != 68) {
            this.method2((class66) null, -104, (byte) -29);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field4322 = arg0.method506(255);
                }
            } else {
                this.field4307 = arg0.method500(47);
            }
        } else {
            this.field4324 = arg0.method506(arg2 ^ 187);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        ++field4308;
        this.method1509(1);
        if (arg0 < 95) {
            method1507((class225) null, (class225) null, true, (class69) null, -98);
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class230() {
        super(0, true);
    }
}
