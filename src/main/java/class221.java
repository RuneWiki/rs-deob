import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class221 extends class371 {

    @OriginalMember(owner = "client!pu", name = "Q", descriptor = "Z")
    private boolean field3263 = true;

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "Z")
    private boolean field3256 = true;

    @OriginalMember(owner = "client!pu", name = "O", descriptor = "[I")
    public static int[] field3261 = new int[128];

    @OriginalMember(owner = "client!pu", name = "V", descriptor = "Lno;")
    public static class483 field3268;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!pu", name = "P", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!pu", name = "R", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!pu", name = "S", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!pu", name = "T", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!pu", name = "U", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(III)Z")
    public static final boolean method1452(int arg0, int arg1, int arg2) {
        ++field3260;
        if (arg2 != 0) {
            return false;
        } else {
            return (arg0 & 34) != 0;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field3262;
        if (arg0 > -80) {
            field3261 = null;
        }
        int[] var3 = super.field5378.method1451(-112, arg1);
        if (super.field5378.field3254) {
            int[] var4 = this.method2260((byte) -114, this.field3263 ? -arg1 + class135.field1789 : arg1, 0);
            if (!this.field3256) {
                class473.method2880(var4, 0, var3, 0, class41.field455);
            } else {
                for (int var5 = 0; ~class41.field455 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class343.field5013];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
    public class221() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "(I)Lob;")
    public static final class385 method1453(int arg0) {
        ++field3267;
        if (arg0 != 1) {
            method1453(-117);
        }
        if (class113.field1428 != null && class613.field8998 != null) {
            for (class385 var1 = (class385) class613.field8998.method1224(16711680); var1 != null; var1 = (class385) class613.field8998.method1224(16711680)) {
                class42 var2 = class113.field1420.method1213(var1.field5633, arg0 ^ 7);
                if (var2 != null && var2.field485 && var2.method220((byte) 84, class113.field1422)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
    public static final void method1454(byte arg0) {
        class158.field2058 = -1;
        class529.field7847 = 0;
        class415.field5969 = -1;
        if (arg0 != -101) {
            method1456(-12, -17, (byte) -116, -10, true, 114);
        }
        ++field3255;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field5360 = arg2.method2561((byte) 118) == 1;
                }
            } else {
                this.field3263 = ~arg2.method2561((byte) 113) == -2;
            }
        } else {
            this.field3256 = ~arg2.method2561((byte) -128) == -2;
        }
        int var5 = 39 / ((-15 - arg1) / 39);
        ++field3257;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)I")
    public static final int method1455(int arg0, byte arg1) {
        ++field3258;
        if (arg1 != 7) {
            field3261 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIBIZI)V")
    public static final void method1456(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 < 80) {
            method1452(-41, -23, 58);
        }
        ++field3265;
        long var6 = (long) (arg3 | (arg4 ? Integer.MIN_VALUE : 0));
        class580 var8 = (class580) class143.field1860.method1333(var6, false);
        if (var8 == null) {
            var8 = new class580();
            class143.field1860.method1341(var8, (byte) -119, var6);
        }
        if (~var8.field8538.length >= ~arg1) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; ~var11 > ~var8.field8538.length; ++var11) {
                var9[var11] = var8.field8538[var11];
                var10[var11] = var8.field8543[var11];
            }
            for (int var12 = var8.field8538.length; ~arg1 < ~var12; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field8543 = var10;
            var8.field8538 = var9;
        }
        var8.field8538[arg1] = arg5;
        var8.field8543[arg1] = arg0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZII)I")
    public static final int method1457(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3259;
        class580 var4 = class585.method3419(-14473, arg1, arg3);
        if (var4 == null) {
            return -1;
        } else if (~arg0 <= -1 && ~arg0 > ~var4.field8538.length) {
            if (arg2 >= -83) {
                field3261 = null;
            }
            return var4.field8538[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(B)V")
    public static void method1458(byte arg0) {
        if (arg0 < 79) {
            field3261 = null;
        }
        field3261 = null;
        field3268 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        if (arg0 != 36) {
            return null;
        } else {
            ++field3264;
            int[][] var3 = super.field5364.method3064(arg0 + -35, arg1);
            if (super.field5364.field7632) {
                int[][] var4 = this.method2263((byte) -12, 0, this.field3263 ? -arg1 + class135.field1789 : arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field3256) {
                    for (int var11 = 0; class41.field455 > var11; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; ~class41.field455 < ~var12; ++var12) {
                        var8[var12] = var5[-var12 + class343.field5013];
                        var9[var12] = var6[-var12 + class343.field5013];
                        var10[var12] = var7[-var12 + class343.field5013];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "(I)Ljava/lang/String;")
    public static final String method1459(int arg0) {
        ++field3266;
        String var1 = "www";
        if (class582.field8561 == class118.field1545) {
            var1 = "www-wtrc";
        } else if (class582.field8561 == class179.field2709) {
            var1 = "www-wtqa";
        } else if (class582.field8561 == class177.field2694) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (arg0 > -40) {
            field3268 = null;
        }
        if (class311.field4583 != null) {
            var2 = "/p=" + class311.field4583;
        }
        return "http://" + var1 + "." + class461.field6666.field8299 + ".com/l=" + class77.field889 + "/a=" + class555.field8240 + var2 + "/";
    }

    static {
        for (int var0 = 0; field3261.length > var0; ++var0) {
            field3261[var0] = -1;
        }
        for (int var1 = 65; ~var1 >= -91; ++var1) {
            field3261[var1] = var1 + -65;
        }
        for (int var2 = 97; ~var2 >= -123; ++var2) {
            field3261[var2] = var2 + -97 + 26;
        }
        for (int var3 = 48; ~var3 >= -58; ++var3) {
            field3261[var3] = var3 + -48 + 52;
        }
        field3261[42] = field3261[43] = 62;
        field3261[45] = field3261[47] = 63;
        field3268 = new class483(5000);
    }
}
