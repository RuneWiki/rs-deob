import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class43 extends class14 {

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    private int field634 = 32768;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "Lcu;")
    public static class145 field632 = new class145(35, 6);

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field637 = 0;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public static void method304(int arg0) {
        field632 = null;
        if (arg0 != -1982245396) {
            field632 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field635;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 > -2) {
            field632 = null;
        }
        if (super.field270.field5222) {
            int[] var4 = this.method145(arg0, 1, -18596);
            int[] var5 = this.method145(arg0, 2, -18596);
            for (int var6 = 0; class115.field1637 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field634 >> 12;
                int var9 = class289.field3779[var7] * var8 >> 12;
                int var10 = class383.field5225[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class305.field4023;
                int var12 = (var10 >> 12) + arg0 & class511.field7361;
                int[] var13 = this.method145(var12, 0, -18596);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field633;
        class204.method1307((byte) 64);
        int var2 = -44 / ((39 - arg0) / 59);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field263 = ~arg2.method2238(255) == -2;
            }
        } else {
            this.field634 = arg2.method2212((byte) 83) << 4;
        }
        int var5 = 71 % ((-51 - arg1) / 37);
        ++field638;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class43() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        ++field636;
        int[][] var3 = super.field268.method2561(arg1, arg0 + 30909);
        if (super.field268.field6091) {
            int[] var4 = this.method145(arg1, 1, arg0 + 12313);
            int[] var5 = this.method145(arg1, 2, -18596);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class115.field1637 < ~var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1047702) >> 12;
                int var11 = var5[var9] * this.field634 >> 12;
                int var12 = class289.field3779[var10] * var11 >> 12;
                int var13 = class383.field5225[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class305.field4023;
                int var15 = class511.field7361 & (var13 >> 12) + arg1;
                int[][] var16 = this.method139(0, 2, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 != -30909) {
            this.method147(-101, (byte) 27, (class379) null);
        }
        return var3;
    }
}
