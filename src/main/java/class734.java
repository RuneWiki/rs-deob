import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class734 extends class334 {

    @OriginalMember(owner = "client!jka", name = "J", descriptor = "I")
    private int field10205 = 32768;

    @OriginalMember(owner = "client!jka", name = "E", descriptor = "I")
    public static int field10200;

    @OriginalMember(owner = "client!jka", name = "F", descriptor = "I")
    public static int field10201;

    @OriginalMember(owner = "client!jka", name = "G", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!jka", name = "H", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!jka", name = "I", descriptor = "I")
    public static int field10204;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lnfa;ZZ)V", line = 6)
    public static final void method4060(class745 arg0, boolean arg1, boolean arg2) {
        arg0.field10346 = arg2;
        if (class494.field6789) {
            if (arg1) {
                class604.field8584[class604.field8584.length - 1].method3146(0, arg0);
            } else {
                int var3 = class217.method1496(arg0.field10352);
                int var4 = class629.field8923[2] * arg0.method1173(true) / arg0.field10348;
                int var5 = class217.method1496(arg0.field10352 - var4);
                int var6 = class217.method1496(arg0.field10352 + var4);
                if (var5 == var6) {
                    class604.field8584[var3].method3146(0, arg0);
                } else if (var6 - var5 == 1) {
                    class604.field8584[class402.field5541 + var5].method3146(0, arg0);
                } else {
                    class604.field8584[class604.field8584.length - 1].method3146(0, arg0);
                }
            }
        } else {
            class334.method2051(arg0, class726.field10110);
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lnba;IIII)V", line = 44)
    public static final void method4061(class636 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10203;
        long var5 = (long) (arg1 << 14 | arg2 << 28 | arg4);
        class482 var7 = (class482) class400.field5509.method4253(var5, arg3 ^ -2);
        if (var7 == null) {
            class482 var8 = new class482();
            class400.field5509.method4252(false, var8, var5);
            var8.field6618.method3728((byte) 118, arg0);
        } else {
            class42 var9 = class422.field5873.method2937((byte) -111, arg0.field8989);
            int var10 = var9.field556;
            if (~var9.field572 == -2) {
                var10 = (arg0.field8991 + 1) * var10;
            }
            for (class636 var11 = (class636) var7.field6618.method3731((byte) -94); var11 != null; var11 = (class636) var7.field6618.method3729((byte) 55)) {
                class42 var12 = class422.field5873.method2937((byte) -35, var11.field8989);
                int var13 = var12.field556;
                if (var12.field572 == 1) {
                    var13 = (var11.field8991 - -1) * var13;
                }
                if (~var10 < ~var13) {
                    class383.method2316(var11, arg3 + 123, arg0);
                    return;
                }
            }
            if (arg3 == 1) {
                var7.field6618.method3728((byte) 114, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jka", name = "b", descriptor = "(B)V", line = 100)
    public final void method27(byte arg0) {
        if (arg0 > -27) {
            this.field10205 = 121;
        }
        class177.method1292(0);
        ++field10202;
    }

    @OriginalMember(owner = "client!jka", name = "<init>", descriptor = "()V", line = 254)
    public class734() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(II)[I", line = 115)
    public final int[] method28(int arg0, int arg1) {
        ++field10200;
        if (arg1 != -22563988) {
            this.field10205 = 108;
        }
        int[] var3 = super.field4743.method1027((byte) -123, arg0);
        if (super.field4743.field1993) {
            int[] var4 = this.method2052(1, 0, arg0);
            int[] var5 = this.method2052(2, 0, arg0);
            for (int var6 = 0; ~class439.field6099 < ~var6; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field10205 >> 12;
                int var9 = class615.field8725[var7] * var8 >> 12;
                int var10 = class254.field3643[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class478.field6578;
                int var12 = (var10 >> 12) + arg0 & class147.field2360;
                int[] var13 = this.method2052(0, arg1 + 22563988, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IZLol;)V", line = 163)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field4747 = ~arg2.method2557(14929) == -2;
            }
        } else {
            this.field10205 = arg2.method2565((byte) -88) << 4;
        }
        if (arg1) {
            this.method283(true, -24);
        }
        ++field10201;
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(ZI)[[I", line = 197)
    public final int[][] method283(boolean arg0, int arg1) {
        ++field10204;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (!arg0) {
            this.field10205 = 73;
        }
        if (super.field4734.field425) {
            int[] var4 = this.method2052(1, 0, arg1);
            int[] var5 = this.method2052(2, 0, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class439.field6099; ++var9) {
                int var10 = (1046396 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field10205 >> 12;
                int var12 = class615.field8725[var10] * var11 >> 12;
                int var13 = class254.field3643[var10] * var11 >> 12;
                int var14 = class478.field6578 & (var12 >> 12) + var9;
                int var15 = arg1 - -(var13 >> 12) & class147.field2360;
                int[][] var16 = this.method2053(1, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
