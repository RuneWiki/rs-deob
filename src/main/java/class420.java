import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class420 extends class235 implements class529 {

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "S")
    private short field6217;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "Z")
    private boolean field6225;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "B")
    private byte field6227;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Z")
    private boolean field6196;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "B")
    private byte field6197;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "Z")
    private boolean field6201;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "B")
    private byte field6200;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "Z")
    private boolean field6213;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lba;")
    private class263 field6221;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "Lt;")
    public class471 field6209;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "Z")
    public static boolean field6219 = false;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "[I")
    public static int[] field6207 = new int[3];

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field6205 = 0;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "F")
    public static float field6220;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lya;I)V")
    public final void method31(class38 arg0, int arg1) {
        ++field6202;
        if (arg1 != -12694) {
            this.method22((byte) 34);
        }
        Object var3 = null;
        class263 var5;
        if (this.field6221 == null && this.field6213) {
            class101 var4 = this.method2578(arg1 + 12585, 262144, arg0, true);
            var5 = var4 != null ? var4.field1416 : null;
        } else {
            var5 = this.field6221;
            this.field6221 = null;
        }
        if (var5 != null) {
            class452.method2728(var5, this.field6227, super.field3445, super.field3447, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILya;Z)Lmg;")
    private final class101 method2578(int arg0, int arg1, class38 arg2, boolean arg3) {
        ++field6211;
        class222 var5 = class384.field5645.method786(65535 & this.field6217, 0);
        if (arg0 > -103) {
            this.field6217 = -58;
        }
        class142 var6;
        class142 var7;
        if (!this.field6201) {
            if (~this.field6227 <= -4) {
                var6 = null;
            } else {
                var6 = class283.field4115[this.field6227 + 1];
            }
            var7 = class283.field4115[this.field6227];
        } else {
            var6 = class283.field4115[0];
            var7 = class52.field578[this.field6227];
        }
        return var5.method1514(arg2, super.field3445, 3, arg1, super.field3449, arg3, this.field6197, var6, super.field3447, this.field6200, var7);
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Z")
    public final boolean method32(byte arg0) {
        if (arg0 < 104) {
            return false;
        } else {
            ++field6223;
            return this.field6196;
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
    public static void method2579(int arg0) {
        if (arg0 != 65535) {
            field6220 = -1.1378508F;
        }
        field6207 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLwn;[[B)V")
    public static final void method2580(byte arg0, class507 arg1, byte[][] arg2) {
        if (arg0 > -2) {
            method2583(-81, -50, 16);
        }
        ++field6206;
        int var3 = class265.field3914.length;
        for (int var4 = 0; ~var4 > ~var3; ++var4) {
            byte[] var5 = arg2[var4];
            if (var5 != null) {
                int var6 = (class411.field6110[var4] >> 8) * 64 - class340.field4713;
                int var7 = (255 & class411.field6110[var4]) * 64 + -class476.field7013;
                class106.method876((byte) -109);
                arg1.method3026(class455.field6684, var7, var5, var6, 1, class225.field3300);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)I")
    public final int method22(byte arg0) {
        if (arg0 != -70) {
            this.field6197 = -93;
        }
        ++field6212;
        return this.field6197;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Lya;I)V")
    public final void method35(class38 arg0, int arg1) {
        if (arg1 < 53) {
            this.method2582((byte) 43, -75, (class38) null);
        }
        ++field6228;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lya;II)Lt;")
    public final class471 method24(class38 arg0, int arg1, int arg2) {
        int var4 = -112 % ((arg2 - 54) / 56);
        ++field6208;
        return this.method2582((byte) 32, arg1, arg0);
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
    public final void method29(int arg0) {
        ++field6199;
        this.field6196 = false;
        if (this.field6209 != null) {
            this.field6209.method465(-65537 & this.field6209.method459());
        }
        int var2 = -2 % ((arg0 - 57) / 44);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILfi;BZLya;I)V")
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        if (arg2 instanceof class420) {
            class420 var8 = (class420) arg2;
            if (this.field6209 != null && var8.field6209 != null) {
                this.field6209.method437(var8.field6209, arg1, arg6, arg0, arg4);
            }
        } else if (arg2 instanceof class131) {
            class131 var9 = (class131) arg2;
            if (this.field6209 != null && var9.field1879 != null) {
                this.field6209.method437(var9.field1879, arg1, arg6, arg0, arg4);
            }
        }
        if (arg3 != -99) {
            this.method2578(79, -28, (class38) null, true);
        }
        ++field6224;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lya;Lrd;IIIIZIIZ)V")
    public class420(class38 arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class444.method2707(arg7, arg8, 31654));
        this.field6217 = (short) arg1.field3217;
        super.field3445 = arg3;
        this.field6225 = arg1.field3200 != 0 && !arg6;
        this.field6227 = (byte) arg2;
        this.field6196 = arg9;
        this.field6197 = (byte) arg8;
        super.field3447 = arg5;
        this.field6201 = arg6;
        this.field6200 = (byte) arg7;
        this.field6213 = arg0.method297() && arg1.field3193 && !this.field6201 && class478.field7044.method1536(class65.field802, (byte) -28) != 0;
        int var11 = 2048;
        if (this.field6196) {
            var11 |= 65536;
        }
        class101 var12 = this.method2578(-104, var11, arg0, this.field6213);
        if (var12 != null) {
            this.field6221 = var12.field1416;
            this.field6209 = var12.field1418;
            if (this.field6196) {
                this.field6209 = this.field6209.method458((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z")
    public static final boolean method2581(int arg0, int arg1, int arg2) {
        int var3 = 77 % ((arg1 - 80) / 43);
        ++field6215;
        return ~(arg2 & 458752) != -1 | class439.method2686((byte) 101, arg2, arg0) || class148.method1070(arg0, -1, arg2);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)I")
    public final int method28(boolean arg0) {
        if (!arg0) {
            this.method32((byte) 1);
        }
        ++field6216;
        return this.field6217 & 65535;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BILya;)Lt;")
    private final class471 method2582(byte arg0, int arg1, class38 arg2) {
        ++field6222;
        if (this.field6209 != null && ~arg2.method335(this.field6209.method459(), arg1) == -1) {
            return this.field6209;
        } else if (arg0 != 32) {
            return null;
        } else {
            class101 var4 = this.method2578(arg0 + -143, arg1, arg2, false);
            return var4 == null ? null : var4.field1418;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(Lya;I)Lfk;")
    public final class462 method38(class38 arg0, int arg1) {
        ++field6198;
        if (this.field6209 == null) {
            return null;
        } else {
            class122 var3 = arg0.method362();
            if (arg1 > -87) {
                return null;
            } else {
                var3.method249(super.field3445, super.field3449, super.field3447);
                class462 var4 = null;
                if (this.field6225) {
                    var4 = class482.method2908(1, (byte) -95);
                }
                this.field6209.method457(var3, var4 == null ? null : var4.field6800[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I")
    public final int method27(int arg0) {
        int var2 = -108 % ((39 - arg0) / 41);
        ++field6214;
        return this.field6200;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
    public final void method39(int arg0) {
        ++field6203;
        if (this.field6209 != null) {
            this.field6209.method441();
        }
        if (arg0 > -18) {
            method2583(-95, 42, 22);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILya;I)Z")
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        if (arg1 != 0) {
            field6219 = true;
        }
        ++field6210;
        class471 var5 = this.method2582((byte) 32, 131072, arg2);
        if (var5 != null) {
            class122 var6 = arg2.method362();
            var6.method249(super.field3445, super.field3449, super.field3447);
            return var5.method443(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
    public final boolean method30(int arg0) {
        ++field6218;
        if (arg0 != 10869) {
            this.method38((class38) null, -97);
        }
        return this.field6213;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLya;)V")
    public final void method26(boolean arg0, class38 arg1) {
        ++field6226;
        Object var3 = null;
        class263 var5;
        if (this.field6221 == null && this.field6213) {
            class101 var4 = this.method2578(-122, 262144, arg1, true);
            var5 = var4 == null ? null : var4.field1416;
        } else {
            var5 = this.field6221;
            this.field6221 = null;
        }
        if (var5 != null) {
            class465.method2785(var5, this.field6227, super.field3445, super.field3447, (boolean[]) null);
        }
        if (!arg0) {
            this.field6209 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)V")
    public static final void method2583(int arg0, int arg1, int arg2) {
        ++field6204;
        int var3 = class387.field5731.method1969(-1, class192.field2804.method2031(true, class377.field5585));
        for (class97 var4 = (class97) class498.field7394.method1018(119); var4 != null; var4 = (class97) class498.field7394.method1022((byte) -112)) {
            int var8 = class236.method1571(var4, 3);
            if (~var3 > ~var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class291.field4175 * 16 + 21;
        int var6 = -(var3 / 2) + arg2;
        if (class94.field1278 < var3 + var6) {
            var6 = -var3 + class94.field1278;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg1;
        if (~class410.field6100 > ~(var5 + arg1)) {
            var7 = -var5 + class410.field6100;
        }
        class389.field5748 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        if (arg0 >= -53) {
            method2581(49, -22, -7);
        }
        class500.field7415 = true;
        class429.field6318 = var7;
        class22.field244 = var3;
        class518.field7624 = (!class473.field6974 ? 22 : 26) + class291.field4175 * 16;
    }
}
