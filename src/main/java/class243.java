import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class243 extends class98 {

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    private int field3450 = 0;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    private int field3447 = 4096;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field3446 = 0;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field3448;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int[][] var4 = this.method546(arg0, (byte) 33, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class268.field3811 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field3450 < ~var12) {
                    var8[var11] = this.field3450;
                } else if (~this.field3447 > ~var12) {
                    var8[var11] = this.field3447;
                } else {
                    var8[var11] = var12;
                }
                if (this.field3450 <= var13) {
                    if (this.field3447 < var13) {
                        var9[var11] = this.field3447;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field3450;
                }
                if (~this.field3450 >= ~var14) {
                    if (~var14 >= ~this.field3447) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field3447;
                    }
                } else {
                    var10[var11] = this.field3450;
                }
            }
        }
        int var15 = -27 % ((60 - arg1) / 43);
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field3451;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int[] var4 = this.method539(0, (byte) -113, arg1);
            for (int var5 = 0; class268.field3811 > var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field3450) {
                    if (var6 > this.field3447) {
                        var3[var5] = this.field3447;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field3450;
                }
            }
        }
        if (arg0 != 0) {
            this.field3450 = -28;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field3445;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field1176 = ~arg1.method1574(arg2 + -76) == -2;
                }
            } else {
                this.field3447 = arg1.method1617((byte) 48);
            }
        } else {
            this.field3450 = arg1.method1617((byte) 48);
        }
        if (arg2 != 0) {
            this.field3450 = 110;
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public static final void method1653(int arg0) {
        class237 var1 = class406.field5860;
        synchronized (class406.field5860) {
            class406.field5860.method1626((byte) 106);
        }
        ++field3449;
        class237 var2 = class66.field755;
        synchronized (class66.field755) {
            class66.field755.method1626((byte) 106);
        }
        if (arg0 > -46) {
            method1653(27);
        }
        class101 var3 = class26.field322;
        synchronized (class26.field322) {
            class26.field322.method557(0);
        }
    }
}
