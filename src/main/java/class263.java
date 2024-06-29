import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class263 extends class198 {

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    private int field4344 = -1;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field4337 = 0;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "[Lqd;")
    public static class3[] field4340 = new class3[8];

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4347 = "Loading sprites - ";

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "[I")
    public int[] field4335;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "[I")
    public static int[] field4341;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)Z")
    public final boolean method1819(byte arg0) {
        int var2 = 5 / ((74 - arg0) / 50);
        ++field4343;
        if (this.field4335 != null) {
            return true;
        } else if (~this.field4344 <= -1) {
            class38 var3 = class78.field1241 >= 0 ? class14.method86(this.field4344, class78.field1241, -100, class15.field215) : class192.method1331(this.field4344, true, class15.field215);
            var3.method259();
            this.field4335 = var3.field488;
            this.field4342 = var3.field4830;
            this.field4336 = var3.field4833;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        int var4 = -117 % ((60 - arg0) / 61);
        if (arg2 == 0) {
            this.field4344 = arg1.method1419(122);
        }
        ++field4346;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4348;
        int var6 = -arg0 + arg3;
        int var7 = arg2 - arg4;
        if (~var7 == -1) {
            if (~var6 != -1) {
                class142.method957(arg0, arg4, 32, arg5, arg3);
            }
        } else if (var6 == 0) {
            class103.method669(16, arg4, arg5, arg0, arg2);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg4;
                arg4 = arg0;
                arg0 = var9;
                int var10 = arg2;
                arg2 = arg3;
                arg3 = var10;
            }
            if (~arg4 < ~arg2) {
                int var11 = arg4;
                arg4 = arg2;
                arg2 = var11;
                int var12 = arg0;
                arg0 = arg3;
                arg3 = var12;
            }
            int var13 = arg0;
            int var14 = -arg0 + arg3;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var15 = -arg4 + arg2;
            int var16 = -(var15 >> 1);
            if (arg1 != 1) {
                field4347 = null;
            }
            int var17 = ~arg3 < ~arg0 ? 1 : -1;
            if (var8) {
                for (int var18 = arg4; var18 <= arg2; ++var18) {
                    var16 += var14;
                    class130.field2005[var18][var13] = arg5;
                    if (~var16 < -1) {
                        var16 -= var15;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg4; var19 <= arg2; ++var19) {
                    class130.field2005[var13][var19] = arg5;
                    var16 += var14;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method1821(byte arg0, String arg1, boolean arg2) {
        String var3 = arg1.toLowerCase();
        ++field4345;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; ~class120.field1845 < ~var6; ++var6) {
            class132 var9 = class14.method92(var6, false);
            if ((!arg2 || var9.field2086) && var9.field2068 == -1 && ~var9.field2087 == 0 && var9.field2089 == 0 && var9.field2071.toLowerCase().indexOf(var3) != -1) {
                if (~var5 <= -251) {
                    class231.field3704 = -1;
                    class230.field3684 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; ~var11 > ~var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class230.field3684 = var4;
        class231.field3704 = var5;
        if (arg0 != 81) {
            field4341 = null;
        }
        class29.field365 = 0;
        String[] var7 = new String[class231.field3704];
        for (int var8 = 0; class231.field3704 > var8; ++var8) {
            var7[var8] = class14.method92(var4[var8], false).field2071;
        }
        class76.method496((byte) -96, class230.field3684, var7);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[[I")
    public int[][] method200(int arg0, int arg1) {
        if (arg1 != -2) {
            this.field4336 = -2;
        }
        ++field4334;
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (super.field3150.field1498 && this.method1819((byte) 124)) {
            int[] var4 = var3[0];
            int var5 = this.field4342 * (class258.field4243 == this.field4336 ? arg0 : this.field4336 * arg0 / class258.field4243);
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (~class42.field590 == ~this.field4342) {
                for (int var8 = 0; ~class42.field590 < ~var8; ++var8) {
                    int var9 = this.field4335[var5++];
                    var6[var8] = class10.method53(4080, var9 << 4);
                    var7[var8] = class10.method53(65280, var9) >> 4;
                    var4[var8] = class10.method53(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; class42.field590 > var10; ++var10) {
                    int var11 = this.field4342 * var10 / class42.field590;
                    int var12 = this.field4335[var5 + var11];
                    var6[var10] = class10.method53(255, var12) << 4;
                    var7[var10] = class10.method53(var12 >> 4, 4080);
                    var4[var10] = class10.method53(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class263() {
        super(0, false);
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
    public final void method696(int arg0) {
        super.method696(arg0);
        this.field4335 = null;
        ++field4338;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V")
    public static void method1822(byte arg0) {
        field4347 = null;
        field4340 = null;
        int var1 = 37 % ((arg0 - 58) / 49);
        field4341 = null;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)I")
    public final int method1368(int arg0) {
        ++field4339;
        if (arg0 != -1) {
            this.method200(3, -1);
        }
        return this.field4344;
    }
}
