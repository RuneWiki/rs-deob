import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class42 extends class175 {

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    private int field447 = 4096;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    private int field449 = 0;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "Ljb;")
    public static class519 field452 = new class519(85, 0);

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "J")
    public static long field453;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field450;
        if (arg2) {
            this.field447 = -113;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2305 = ~arg1.method1731((byte) 64) == -2;
                }
            } else {
                this.field447 = arg1.method1728((byte) 8);
            }
        } else {
            this.field449 = arg1.method1728((byte) 27);
        }
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
    public static void method237(int arg0) {
        field452 = null;
        if (arg0 > -101) {
            method237(24);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field448;
        int[] var3 = super.field2310.method91(0, arg1);
        if (!arg0) {
            return null;
        } else {
            if (super.field2310.field169) {
                int[] var4 = this.method1202(arg1, -1150480797, 0);
                for (int var5 = 0; ~class598.field8136 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (var6 < this.field449) {
                        var3[var5] = this.field449;
                    } else if (~var6 >= ~this.field447) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field447;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method238(int arg0, byte arg1) {
        ++field451;
        if (arg1 >= -47) {
            field453 = 25L;
        }
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (super.field2316.field8746) {
            int[][] var4 = this.method1205(0, arg0, 29179);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class598.field8136 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field449 >= ~var12) {
                    if (var12 > this.field447) {
                        var8[var11] = this.field447;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field449;
                }
                if (var13 >= this.field449) {
                    if (this.field447 >= var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field447;
                    }
                } else {
                    var9[var11] = this.field449;
                }
                if (~var14 <= ~this.field449) {
                    if (~var14 < ~this.field447) {
                        var10[var11] = this.field447;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field449;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class42() {
        super(1, false);
    }
}
