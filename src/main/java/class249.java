import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class249 extends class154 {

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
    private int field4467 = 4096;

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "I")
    private int field4465 = 4096;

    @OriginalMember(owner = "client!rg", name = "eb", descriptor = "[I")
    private int[] field4472 = new int[3];

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
    private int field4468 = 409;

    @OriginalMember(owner = "client!rg", name = "gb", descriptor = "I")
    private int field4474 = 4096;

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "Ldb;")
    public static class121 field4466 = new class121(0, 0);

    @OriginalMember(owner = "client!rg", name = "jb", descriptor = "[I")
    public static int[] field4477 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!rg", name = "kb", descriptor = "I")
    public static int field4478 = 0;

    @OriginalMember(owner = "client!rg", name = "nb", descriptor = "Leg;")
    private static class37 field4481 = class174.method1167("Loaded interfaces", 73);

    @OriginalMember(owner = "client!rg", name = "mb", descriptor = "Leg;")
    public static class37 field4480 = field4481;

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!rg", name = "fb", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!rg", name = "hb", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!rg", name = "lb", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!rg", name = "ib", descriptor = "[I")
    public static int[] field4476;

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class249() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILva;)Lga;")
    public static final class154 method1715(int arg0, class187 arg1) {
        ++field4475;
        arg1.method1268(255);
        int var2 = arg1.method1268(255);
        class154 var3 = class32.method191(var2, (byte) -22);
        var3.field2589 = arg1.method1268(255);
        int var4 = arg1.method1268(255);
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            int var6 = arg1.method1268(255);
            var3.method142(arg1, -14015, var6);
        }
        var3.method144(-9);
        if (arg0 <= 85) {
            method1716((byte) 49);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field4470;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg0.method1248((byte) 118);
                            this.field4472[1] = class96.method626(65280, var5) >> 4;
                            this.field4472[0] = class96.method626(267386880, var5 << 4);
                            this.field4472[2] = class96.method626(var5 >> 12, 0);
                        }
                    } else {
                        this.field4467 = arg0.method1244(false);
                    }
                } else {
                    this.field4474 = arg0.method1244(false);
                }
            } else {
                this.field4465 = arg0.method1244(false);
            }
        } else {
            this.field4468 = arg0.method1244(false);
        }
        if (arg1 != -14015) {
            field4478 = 13;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    public static void method1716(byte arg0) {
        if (arg0 == 59) {
            field4466 = null;
            field4477 = null;
            field4480 = null;
            field4476 = null;
            field4481 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        ++field4471;
        int[][] var3 = super.field2585.method1532(arg1, arg0 ^ -84);
        if (arg0 != 115) {
            this.method142((class187) null, 100, -108);
        }
        if (super.field2585.field3761) {
            int[][] var4 = this.method1054(0, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class227.field3898 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field4472[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field4468 < var13) {
                    var9[var11] = var12;
                    var8[var11] = var5[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field4472[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field4468) {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4472[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field4468 < var17) {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field4467 * var12 >> 12;
                            var8[var11] = this.field4474 * var14 >> 12;
                            var10[var11] = this.field4465 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
