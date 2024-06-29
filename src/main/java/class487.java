import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class487 extends class305 {

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    private int field7122 = 585;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field7124 = 0;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "Lsc;")
    public static class270 field7123 = new class270(7, 0, 1, 1);

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field7128;
        if (arg2 <= 76) {
            field7123 = null;
        }
        if (arg0 == 0) {
            this.field7122 = arg1.method1396(-12);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public static final void method2943(String arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7125;
        class38 var5 = class327.method2148(arg3, -7153, arg1);
        if (var5 != null) {
            if (var5.field533 != null) {
                class510 var6 = new class510();
                var6.field7424 = arg0;
                var6.field7427 = arg4;
                var6.field7423 = var5;
                var6.field7413 = var5.field533;
                class152.method1090(var6);
            }
            if (class460.field6813 == 9) {
                if (client.method3078(var5).method793(1, arg4 - 1)) {
                    if (~arg4 == -2) {
                        class110.method857(4095, class534.field7795);
                        ++class90.field1453;
                        class304.method2013(arg1, var5.field499, arg3, 17012);
                    }
                    if (arg2 > -116) {
                        field7129 = 52;
                    }
                    if (arg4 == 2) {
                        class110.method857(4095, class101.field1573);
                        ++class364.field5374;
                        class304.method2013(arg1, var5.field499, arg3, 17012);
                    }
                    if (~arg4 == -4) {
                        class110.method857(4095, class505.field7330);
                        ++class8.field97;
                        class304.method2013(arg1, var5.field499, arg3, 17012);
                    }
                    if (~arg4 == -5) {
                        ++class449.field6682;
                        class110.method857(4095, class156.field2400);
                        class304.method2013(arg1, var5.field499, arg3, 17012);
                    }
                    if (arg4 == 5) {
                        ++class344.field5132;
                        class110.method857(4095, class313.field4766);
                        class304.method2013(arg1, var5.field499, arg3, 17012);
                    }
                    if (arg4 == 6) {
                        ++class224.field3423;
                        class110.method857(4095, class311.field4747);
                        class304.method2013(arg1, var5.field499, arg3, 17012);
                    }
                    if (arg4 == 7) {
                        class110.method857(4095, class271.field4281);
                        ++class287.field4473;
                        class304.method2013(arg1, var5.field499, arg3, 17012);
                    }
                    if (~arg4 == -9) {
                        class110.method857(4095, class7.field87);
                        ++class429.field6370;
                        class304.method2013(arg1, var5.field499, arg3, 17012);
                    }
                    if (arg4 == 9) {
                        class110.method857(4095, class472.field6931);
                        ++class472.field6927;
                        class304.method2013(arg1, var5.field499, arg3, 17012);
                    }
                    if (arg4 == 10) {
                        ++class463.field6860;
                        class110.method857(4095, class80.field1323);
                        class304.method2013(arg1, var5.field499, arg3, 17012);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(B)V")
    public static void method2944(byte arg0) {
        field7123 = null;
        if (arg0 <= 5) {
            field7129 = 61;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 4688) {
            this.method14(-40, (class194) null, (byte) 20);
        }
        ++field7126;
        int[] var3 = super.field4677.method2174(arg0, 50);
        if (super.field4677.field5040) {
            int var4 = class301.field4614[arg0];
            for (int var5 = 0; ~var5 > ~class91.field1471; ++var5) {
                int var6 = class78.field1298[var5];
                if (var6 > this.field7122 && 4096 - this.field7122 > var6 && var4 > 2048 - this.field7122 && ~(this.field7122 + 2048) < ~var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field7122);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field7122 + 2048 && var6 < this.field7122 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field7122;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field7122 + 2048);
                } else if (~var4 <= ~this.field7122 && ~var4 >= ~(-this.field7122 + 4096)) {
                    if (this.field7122 <= var6 && var6 <= -this.field7122 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field7122 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field7122;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field7122 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class487() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZB)V")
    public static final void method2945(boolean arg0, boolean arg1, byte arg2) {
        if (arg0) {
            --class455.field6767;
            if (~class455.field6767 == -1) {
                class471.field6909 = null;
            }
        }
        ++field7127;
        if (arg1) {
            --class383.field5639;
            if (class383.field5639 == 0) {
                class203.field3141 = null;
            }
        }
        if (arg2 != -60) {
            method2944((byte) -104);
        }
    }

    static {
        new class179("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        new class179(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field7129 = 0;
    }
}
