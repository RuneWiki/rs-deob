import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class185 {

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    private int field192 = 0;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    private int field193 = 4096;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    public static int field189 = 0;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 < 70) {
            field189 = 72;
        }
        ++field197;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int[] var4 = this.method1146((byte) 117, arg0, 0);
            for (int var5 = 0; var5 < class174.field2648; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field192) {
                    var3[var5] = this.field192;
                } else if (this.field193 < var6) {
                    var3[var5] = this.field193;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        if (!arg0) {
            this.method27(-105, (class248) null, -66);
        }
        ++field188;
        int[][] var3 = super.field2802.method753(1, arg1);
        if (super.field2802.field1807) {
            int[][] var4 = this.method1152(false, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class174.field2648 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field192) {
                    if (var12 <= this.field193) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field193;
                    }
                } else {
                    var8[var11] = this.field192;
                }
                if (~var13 <= ~this.field192) {
                    if (this.field193 < var13) {
                        var10[var11] = this.field193;
                    } else {
                        var10[var11] = var13;
                    }
                } else {
                    var10[var11] = this.field192;
                }
                if (var14 >= this.field192) {
                    if (this.field193 < var14) {
                        var9[var11] = this.field193;
                    } else {
                        var9[var11] = var14;
                    }
                } else {
                    var9[var11] = this.field192;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field2814 = arg1.method1593((byte) 27) == 1;
                }
            } else {
                this.field193 = arg1.method1575(false);
            }
        } else {
            this.field192 = arg1.method1575(false);
        }
        ++field194;
        if (arg2 != -6357) {
            this.field192 = 61;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class16() {
        super(1, false);
    }

    @OriginalMember(owner = "client!n", name = "i", descriptor = "(I)Ldi;")
    public static final class179 method115(int arg0) {
        class179 var1 = new class179(class162.field2494, class256.field3915, class10.field139[0], class273.field4104[0], class220.field3315[0], class82.field1312[0], class10.field129[0], class183.field2775);
        ++field195;
        if (arg0 > -99) {
            return null;
        } else {
            class82.method537(0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Z")
    public static final boolean method116(int arg0, int arg1) {
        ++field191;
        if (arg0 != 29960) {
            method116(111, -108);
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var2 = class84.field1339[arg1];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            return ~var2 == -1007;
        }
    }
}
