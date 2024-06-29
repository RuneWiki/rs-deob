import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class72 extends class272 {

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    private int field1253 = 0;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    private int field1262 = 0;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    private int field1263 = 1;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "Lli;")
    public static class185 field1254 = class245.method1649("0", 126);

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "Z")
    public static boolean field1264 = false;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field1265 = 1;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "[Ldd;")
    public static class211[] field1258;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        int[] var3 = super.field4819.method1632(0, arg0);
        if (arg1 != 4421) {
            return null;
        } else {
            if (super.field4819.field4294) {
                int var4 = class232.field4177[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; ~var6 > ~class246.field4385; ++var6) {
                    int var7 = class38.field598[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (this.field1253 == 0) {
                        var9 = (-var4 + var7) * this.field1263;
                    } else {
                        int var10 = var8 * var8 - -(var5 * var5) >> 12;
                        int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                        var9 = (int) ((double) (this.field1263 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (var9 & -4096);
                    if (this.field1262 != 0) {
                        if (this.field1262 == 2) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class13.field234[(var12 & 4094) >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            ++field1256;
            return var3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILie;B)V")
    public static final void method468(int arg0, int arg1, class71 arg2, byte arg3) {
        if (arg3 != -106) {
            method470(true);
        }
        if (arg2.field2655 == arg1 && ~arg1 != 0) {
            class2 var4 = class253.method1712(arg1, -121);
            int var5 = var4.field58;
            if (~var5 == -2) {
                arg2.field2658 = 0;
                arg2.field2663 = 0;
                arg2.field2673 = 0;
                arg2.field2691 = arg0;
                class31.method188(arg3 + 105, var4, arg2.field2687, false, arg2.field2663, arg2.field2694);
            }
            if (~var5 == -3) {
                arg2.field2673 = 0;
            }
        } else if (arg1 == -1 || arg2.field2655 == -1 || class253.method1712(arg1, -127).field32 >= class253.method1712(arg2.field2655, -128).field32) {
            arg2.field2663 = 0;
            arg2.field2658 = 0;
            arg2.field2655 = arg1;
            arg2.field2673 = 0;
            arg2.field2661 = arg2.field2686;
            arg2.field2691 = arg0;
            if (~arg2.field2655 != 0) {
                class31.method188(-1, class253.method1712(arg2.field2655, -123), arg2.field2687, false, arg2.field2663, arg2.field2694);
            }
        }
        ++field1266;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1257;
        if (~arg0 == ~arg7) {
            class221.method1529(arg3, arg2, arg7, arg5, arg4, arg1, (byte) -76);
        } else {
            if (arg6 != -5198) {
                field1254 = null;
            }
            if (~class207.field3810 >= ~(-arg7 + arg1) && class66.field1163 >= arg1 + arg7 && -arg0 + arg5 >= class216.field3964 && class113.field2040 >= arg0 + arg5) {
                class149.method1061(arg5, arg1, arg0, 0, arg3, arg4, arg2, arg7);
            } else {
                class179.method1269(arg0, arg1, arg7, arg3, arg6 + 5198, arg4, arg5, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class72() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(Z)V")
    public static void method470(boolean arg0) {
        field1258 = null;
        if (arg0) {
            field1254 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        if (arg0 != 0) {
            field1265 = -109;
        }
        class256.method1732((byte) -106);
        ++field1255;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = 72 % ((arg1 - -21) / 55);
        ++field1259;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field1263 = arg0.method867(false);
                }
            } else {
                this.field1262 = arg0.method867(false);
            }
        } else {
            this.field1253 = arg0.method867(false);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZLne;ZILne;I)I")
    public static final int method471(int arg0, boolean arg1, class199 arg2, boolean arg3, int arg4, class199 arg5, int arg6) {
        ++field1260;
        if (arg4 != 6255) {
            method470(true);
        }
        int var7 = class104.method732(arg3, arg6, arg5, arg2, false);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class104.method732(arg1, arg0, arg5, arg2, false);
            return arg1 ? -var8 : var8;
        }
    }
}
