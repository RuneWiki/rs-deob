import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class99 extends class117 {

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    private int field1592 = 0;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    private int field1596 = 20;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    private int field1588 = 1365;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    private int field1600 = 0;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field1594 = 0;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method673(boolean arg0, String arg1) {
        class59.method402("", 0, 0, -1, arg1, "");
        ++field1601;
        if (!arg0) {
            method674(37, 10, 125);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(III)Lmf;")
    public static final class29 method674(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class29 var4 = var3.field2362;
            var3.field2362 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 2) {
            method673(false, (String) null);
        }
        int[] var3 = super.field1883.method531(arg1, (byte) 90);
        ++field1589;
        if (super.field1883.field1313) {
            for (int var4 = 0; ~var4 > ~class168.field2737; ++var4) {
                int var5 = (class173.field2835[arg1] << 12) / this.field1588 - -this.field1600;
                int var6 = var5;
                int var7 = (class243.field3869[var4] << 12) / this.field1588 - -this.field1592;
                int var8 = var5;
                int var9 = var7;
                int var10 = var7 * var7 >> 12;
                int var11 = var7;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (~(var10 + var12) > -16385 && var13 < this.field1596) {
                    var8 = (var8 * var11 >> 12) * 2 + var6;
                    ++var13;
                    var11 = -var12 + var10 + var9;
                    var12 = var8 * var8 >> 12;
                    var10 = var11 * var11 >> 12;
                }
                var3[var4] = this.field1596 + -1 > var13 ? (var13 << 12) / this.field1596 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(III)Lvj;")
    public static final class188 method675(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        return var3 != null && var3.field2364 != null ? var3.field2364 : null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILbl;IILag;I)V")
    public static final void method676(int arg0, int arg1, class146 arg2, int arg3, int arg4, class211 arg5, int arg6) {
        ++field1597;
        if (arg2 != null) {
            int var7;
            if (~class120.field1919 == -5) {
                var7 = 2047 & (int) class90.field1456;
            } else {
                var7 = 2047 & (int) class90.field1456 + class173.field2831;
            }
            int var8 = 10 + Math.max(arg5.field3430 / 2, arg5.field3394 / 2);
            int var9 = arg1 * arg1 - -(arg6 * arg6);
            if (~var9 >= ~(var8 * var8)) {
                int var10 = class302.field4823[var7];
                int var11 = class302.field4824[var7];
                if (arg4 == 26670) {
                    if (~class120.field1919 != -5) {
                        var11 = var11 * 256 / (class292.field4687 + 256);
                        var10 = var10 * 256 / (class292.field4687 + 256);
                    }
                    int var12 = arg1 * var11 + arg6 * var10 >> 16;
                    int var13 = arg6 * var11 - arg1 * var10 >> 16;
                    ((class232) arg2).method1563(arg5.field3430 / 2 - (-var12 - -(arg2.field2300 / 2)) + arg0, arg5.field3394 / 2 + -var13 + arg3 - arg2.field2309 / 2, arg5.field3460, arg5.field3505);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIIIIII)V")
    public static final void method677(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1591;
        class211 var7 = class32.method217(arg2, arg3, arg0 + 48);
        if (var7 != null && var7.field3487 != null) {
            class126 var8 = new class126();
            var8.field2000 = var7;
            var8.field1989 = var7.field3487;
            class137.method960(arg0 ^ 199938, var8);
        }
        class143.field2268 = arg5;
        class258.field4168 = arg4;
        class46.field767 = arg1;
        class139.field2211 = true;
        class251.field3997 = arg3;
        class92.field1481 = arg6;
        if (arg0 != 66) {
            field1594 = -91;
        }
        class78.field1310 = arg2;
        class117.method834(var7, (byte) -57);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field1595;
        if (arg1 != 255) {
            method675(-71, -2, 121);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field1600 = arg0.method1142(arg1 ^ -19175);
                    }
                } else {
                    this.field1592 = arg0.method1142(-18970);
                }
            } else {
                this.field1596 = arg0.method1142(-18970);
            }
        } else {
            this.field1588 = arg0.method1142(arg1 ^ -19175);
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(III)V")
    public static final void method678(int arg0, int arg1, int arg2) {
        ++field1593;
        class213.field3529 = new class173(arg0);
        int var3 = 30 % ((-41 - arg2) / 56);
        class72.field1214 = new class173(arg1);
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(III)I")
    public static final int method679(int arg0, int arg1, int arg2) {
        ++field1598;
        if (arg0 != 2047) {
            return -53;
        } else {
            int var3 = 1;
            while (arg1 > 1) {
                if ((arg1 & 1) != 0) {
                    var3 = arg2 * var3;
                }
                arg2 *= arg2;
                arg1 >>= 1;
            }
            if (~arg1 == -2) {
                return arg2 * var3;
            } else {
                return var3;
            }
        }
    }
}
