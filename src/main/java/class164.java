import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class164 extends class51 {

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    private int field3278 = 2048;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    private int field3280 = 10;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    private int field3274 = 0;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
    public static int field3279 = 0;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "Led;")
    public static class43 field3284 = class191.method1219("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", false);

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "Led;")
    private static class43 field3287 = class191.method1219("Create a free account", false);

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "Led;")
    public static class43 field3273 = field3287;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "[I")
    private int[] field3275;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "[I")
    private int[] field3282;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.method1023(false);
        ++field3285;
        if (arg0 >= -83) {
            this.field3280 = -62;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public static void method1021(byte arg0) {
        field3287 = null;
        field3273 = null;
        field3284 = null;
        int var1 = -44 / ((75 - arg0) / 45);
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V")
    public static final void method1022(byte arg0) {
        while (true) {
            if (class38.field723.method326(8, class114.field2215) >= 27) {
                int var1 = class38.field723.method330((byte) 109, 15);
                if (~var1 != -32768) {
                    boolean var2 = false;
                    if (class172.field3433[var1] == null) {
                        var2 = true;
                        class172.field3433[var1] = new class77();
                    }
                    class77 var3 = class172.field3433[var1];
                    class158.field3202[class95.field1864++] = var1;
                    var3.field2343 = client.field559;
                    int var4 = class64.field1314[class38.field723.method330((byte) 118, 3)];
                    if (var2) {
                        var3.field2372 = var3.field2352 = var4;
                    }
                    int var5 = class38.field723.method330((byte) 120, 5);
                    int var6 = class38.field723.method330((byte) 71, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var7 = class38.field723.method330((byte) 92, 1);
                    var3.field1539 = class2.method7(false, class38.field723.method330((byte) 52, 14));
                    int var8 = class38.field723.method330((byte) 73, 1);
                    if (var8 == 1) {
                        class67.field1347[class115.field2241++] = var1;
                    }
                    var3.field2323 = var3.field1539.field1222;
                    var3.field2361 = var3.field1539.field1207;
                    var3.field2378 = var3.field1539.field1186;
                    var3.field2320 = var3.field1539.field1197;
                    var3.field2327 = var3.field1539.field1219;
                    var3.field2326 = var3.field1539.field1175;
                    var3.field2371 = var3.field1539.field1182;
                    var3.field2334 = var3.field1539.field1200;
                    var3.field2322 = var3.field1539.field1199;
                    if (var3.field2322 == 0) {
                        var3.field2352 = 0;
                    }
                    var3.method758((byte) 77, class67.field1348.field2357[0] + var6, class67.field1348.field2335[0] - -var5, ~var7 == -2);
                    continue;
                }
            }
            if (arg0 >= -94) {
                field3273 = null;
            }
            class38.field723.method337(18);
            ++field3276;
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field3283;
        if (arg1 != 0) {
            field3273 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3274 = arg0.method538((byte) -116);
                }
            } else {
                this.field3278 = arg0.method555(-1113627096);
            }
        } else {
            this.field3280 = arg0.method538((byte) 94);
        }
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(Z)V")
    private final void method1023(boolean arg0) {
        ++field3281;
        this.field3282 = new int[this.field3280 + 1];
        this.field3275 = new int[this.field3280 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field3280;
        int var4 = this.field3278 * var3 >> 12;
        for (int var5 = 0; var5 < this.field3280; ++var5) {
            this.field3275[var5] = var2;
            this.field3282[var5] = var2 + var4;
            var2 += var3;
        }
        if (!arg0) {
            this.field3275[this.field3280] = 4096;
            this.field3282[this.field3280] = 4096 - -this.field3282[0];
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int var4 = class40.field771[arg1];
            if (this.field3274 == 0) {
                short var5 = 0;
                for (int var6 = 0; this.field3280 > var6; ++var6) {
                    if (this.field3275[var6] <= var4 && var4 < this.field3275[var6 + 1]) {
                        if (~var4 > ~this.field3282[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class42.method233(var3, 0, class122.field2442, var5);
            } else {
                for (int var7 = 0; class122.field2442 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class95.field1855[var7];
                    int var11 = this.field3274;
                    if (var11 != 1) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field3280; ++var12) {
                        if (var8 >= this.field3275[var12] && this.field3275[var12 + 1] > var8) {
                            if (~this.field3282[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        ++field3286;
        if (arg0 != 16) {
            this.method64(-102);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }
}
