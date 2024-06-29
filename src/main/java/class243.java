import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class243 extends class89 {

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
    private int field4312 = 0;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "I")
    private int field4318 = 0;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "I")
    private int field4314 = 20;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "I")
    private int field4316 = 1365;

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "Lha;")
    public static class46 field4313 = class271.method1828("3D)2Softwarebibliothek gestartet)3", -46);

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "Lha;")
    public static class46 field4309 = class271.method1828(":clanreq:", -46);

    @OriginalMember(owner = "client!gk", name = "db", descriptor = "I")
    public static int field4321 = 0;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "Lha;")
    public static class46 field4315 = class271.method1828("document)3cookie=(R", -46);

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!gk", name = "bb", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!gk", name = "cb", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "Lpi;")
    public static class181 field4310;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
    public static final void method1666(int arg0, int arg1) {
        ++field4311;
        if (arg1 <= -38) {
            class146 var2 = class6.method22((byte) 16, 7, arg0);
            var2.method1082((byte) -101);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lwe;B)V")
    public static final void method1667(class75 arg0, byte arg1) {
        ++field4320;
        if (class66.field1115 != null) {
            try {
                class66.field1115.method1736(105, 0L);
                class66.field1115.method1735(24, arg0.field1380, arg0.field1368, false);
            } catch (Exception var2) {
            }
        }
        if (arg1 >= -61) {
            method1668((class139) null, -65, -114, 124);
        }
        arg0.field1380 += 24;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field4312 = arg0.method545((byte) 82);
                    }
                } else {
                    this.field4318 = arg0.method545((byte) -122);
                }
            } else {
                this.field4314 = arg0.method545((byte) 112);
            }
        } else {
            this.field4316 = arg0.method545((byte) 104);
        }
        if (arg1 != -641641492) {
            field4315 = null;
        }
        ++field4317;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lj;III)V")
    public static final void method1668(class139 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class173.field3076) {
            class201 var4 = class111.field2080[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3607 != null && var4.field3607.field3269.method486()) {
                arg0.method467(var4.field3607.field3269, 128, 0, 0, true);
            }
        }
        if (arg3 < class173.field3076) {
            class201 var5 = class111.field2080[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3607 != null && var5.field3607.field3269.method486()) {
                arg0.method467(var5.field3607.field3269, 0, 0, 128, true);
            }
        }
        if (arg2 < class173.field3076 && arg3 < class128.field2359) {
            class201 var6 = class111.field2080[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3607 != null && var6.field3607.field3269.method486()) {
                arg0.method467(var6.field3607.field3269, 128, 0, 128, true);
            }
        }
        if (arg2 < class173.field3076 && arg3 > 0) {
            class201 var7 = class111.field2080[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3607 != null && var7.field3607.field3269.method486()) {
                arg0.method467(var7.field3607.field3269, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)V")
    public static void method1669(byte arg0) {
        field4315 = null;
        field4310 = null;
        field4309 = null;
        if (arg0 == -44) {
            field4313 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int[] var3 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            for (int var4 = 0; ~var4 > ~class241.field4284; ++var4) {
                int var5 = (class87.field1652[arg0] << 12) / this.field4316 - -this.field4312;
                int var6 = (class259.field4523[var4] << 12) / this.field4316 + this.field4318;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = var5;
                int var11 = var6 * var6 >> 12;
                int var12 = 0;
                for (int var13 = var5 * var5 >> 12; ~(var11 - -var13) > -16385 && ~this.field4314 < ~var12; var13 = var10 * var10 >> 12) {
                    ++var12;
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var13 + var11 + var7;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~var12 <= ~(this.field4314 + -1) ? 0 : (var12 << 12) / this.field4314;
            }
        }
        ++field4319;
        int var14 = -74 % ((51 - arg1) / 44);
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class243() {
        super(0, true);
    }
}
