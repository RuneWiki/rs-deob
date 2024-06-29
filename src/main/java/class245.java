import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class245 extends class89 {

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    private int field4347 = 0;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    private int field4360 = 10;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    private int field4352 = 2048;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "Lha;")
    public static class46 field4348 = class271.method1828("<col=ffb000>", -46);

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "Z")
    public static boolean field4358 = false;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
    public static int field4355 = 0;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lha;")
    public static class46 field4359 = class271.method1828("<col=ffffff> )4 ", -46);

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "F")
    public static float field4353;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "[I")
    private int[] field4345;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "[I")
    private int[] field4356;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(BII)I")
    public static final int method1678(byte arg0, int arg1, int arg2) {
        ++field4354;
        if (arg0 <= 94) {
            method1678((byte) 82, 48, 99);
        }
        if (~arg2 == 0) {
            return 12345678;
        } else {
            int var3 = (127 & arg2) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (arg2 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
    private final void method1679(int arg0) {
        this.field4356 = new int[this.field4360 + 1];
        ++field4357;
        this.field4345 = new int[this.field4360 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field4360;
        int var4 = this.field4352 * var3 >> 12;
        for (int var5 = 0; ~this.field4360 < ~var5; ++var5) {
            this.field4356[var5] = var2;
            this.field4345[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 != 673025388) {
            this.method1679(94);
        }
        this.field4356[this.field4360] = 4096;
        this.field4345[this.field4360] = this.field4345[0] + 4096;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 != -641641492) {
            this.field4347 = 83;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field4347 = arg0.method558(1);
                }
            } else {
                this.field4352 = arg0.method545((byte) 62);
            }
        } else {
            this.field4360 = arg0.method558(arg1 ^ -641641491);
        }
        ++field4351;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        ++field4350;
        this.method1679(673025388);
        if (!arg0) {
            this.field4360 = -52;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int var3 = -29 / ((51 - arg1) / 44);
        ++field4349;
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int var5 = class87.field1652[arg0];
            if (~this.field4347 != -1) {
                for (int var6 = 0; ~class241.field4284 < ~var6; ++var6) {
                    int var7 = 0;
                    int var8 = class259.field4523[var6];
                    int var9 = this.field4347;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var7 = 2048 - -(-var5 + var8 >> 1);
                            }
                        } else {
                            var7 = 2048 - -(var8 + -4096 + var5 >> 1);
                        }
                    } else {
                        var7 = var8;
                    }
                    short var10 = 0;
                    for (int var11 = 0; this.field4360 > var11; ++var11) {
                        if (~this.field4356[var11] >= ~var7 && ~this.field4356[var11 - -1] < ~var7) {
                            if (~var7 > ~this.field4345[var11]) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var4[var6] = var10;
                }
            } else {
                short var12 = 0;
                for (int var13 = 0; ~var13 > ~this.field4360; ++var13) {
                    if (~this.field4356[var13] >= ~var5 && var5 < this.field4356[var13 - -1]) {
                        if (~this.field4345[var13] < ~var5) {
                            var12 = 4096;
                        }
                        break;
                    }
                }
                class104.method787(var4, 0, class241.field4284, var12);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
    public static void method1680(byte arg0) {
        field4348 = null;
        field4359 = null;
        if (arg0 < 42) {
            field4346 = 61;
        }
    }
}
