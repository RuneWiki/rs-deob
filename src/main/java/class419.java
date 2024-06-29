import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class419 extends class115 {

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    private int field6018 = 0;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    private int field6021 = 2048;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    private int field6028 = 10;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "[I")
    public static int[] field6024 = new int[500];

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field6031 = "slide:";

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field6029 = "wave:";

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "Lwf;")
    private static class70 field6030 = new class70(64);

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "[I")
    private int[] field6015;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "[I")
    private int[] field6023;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V", line = 3)
    private final void method2601(int arg0) {
        ++field6017;
        this.field6023 = new int[this.field6028 + 1];
        this.field6015 = new int[this.field6028 - -1];
        int var2 = 0;
        int var3 = 4096 / this.field6028;
        int var4 = this.field6021 * var3 >> 12;
        for (int var5 = 0; var5 < this.field6028; ++var5) {
            this.field6023[var5] = var2;
            this.field6015[var5] = var2 - -var4;
            var2 += var3;
        }
        if (arg0 != -1891460180) {
            method2605((class174) null, -53, 110, (class71) null, 7, -100, 81, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 68, (byte) 90, 2, -59, true);
        }
        this.field6023[this.field6028] = 4096;
        this.field6015[this.field6028] = this.field6015[0] + 4096;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)V", line = 41)
    public static final void method2602(int arg0, int arg1) {
        ++field6025;
        if (arg1 != 3) {
            field6030 = null;
        }
        class175.field2435.method2054(arg1 + 84, arg0);
        class72.field808.method2054(97, arg0);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 238)
    public class419() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)Ljb;", line = 56)
    public static final class286 method2603(int arg0, boolean arg1) {
        ++field6032;
        class286 var2 = (class286) field6030.method410((byte) -113, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg0 >= 32768) {
                var3 = class132.field1812.method361(1, 62, arg0 & 32767);
            } else {
                var3 = class233.field3154.method361(1, 50, arg0);
            }
            class286 var4 = new class286();
            if (!arg1) {
                field6026 = -124;
            }
            if (var3 != null) {
                var4.method1820(121, new class211(var3));
            }
            if (~arg0 <= -32769) {
                var4.method1825((byte) -107);
            }
            field6030.method414(var4, (byte) 66, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V", line = 97)
    public static void method2604(byte arg0) {
        field6030 = null;
        if (arg0 <= 87) {
            field6029 = null;
        }
        field6024 = null;
        field6029 = null;
        field6031 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I", line = 110)
    public final int[] method57(int arg0, int arg1) {
        ++field6020;
        if (arg1 != 0) {
            method2605((class174) null, 127, 11, (class71) null, 57, 96, -4, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -61, (byte) -103, 108, -16, true);
        }
        int[] var3 = super.field1340.method14(97, arg0);
        if (super.field1340.field35) {
            int var4 = class193.field2634[arg0];
            if (~this.field6018 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field6028; ++var6) {
                    if (~this.field6023[var6] >= ~var4 && this.field6023[var6 + 1] > var4) {
                        if (this.field6015[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class408.method2569(var3, 0, class218.field2979, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class218.field2979; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class43.field530[var7];
                    int var11 = this.field6018;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (-4096 - (-var4 - var10) >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field6028; ++var12) {
                        if (this.field6023[var12] <= var8 && ~this.field6023[var12 - -1] < ~var8) {
                            if (this.field6015[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 226)
    public final void method140(int arg0) {
        this.method2601(-1891460180);
        if (arg0 != 0) {
            this.method2601(-111);
        }
        ++field6019;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLbk;I)V", line = 244)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        ++field6022;
        if (arg0 < 83) {
            this.method149((byte) -98, (class211) null, 83);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field6018 = arg1.method1342((byte) -127);
                }
            } else {
                this.field6021 = arg1.method1355(32136);
            }
        } else {
            this.field6028 = arg1.method1342((byte) -126);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Len;IILvr;III[[[B[I[I[I[I[IIBIIZ)V", line = 288)
    public static final void method2605(class174 arg0, int arg1, int arg2, class71 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class118.field1400 = arg0;
        class225.field3072 = arg1;
        class300.field4277 = arg3;
        class324.field4572 = class118.field1400.method994() > 0;
        class239.field3251 = arg4 >> 7;
        class326.field4585 = arg6 >> 7;
        class170.field2390 = arg4;
        class24.field238 = arg6;
        class268.field3773 = arg5;
        class279.field3932 = class239.field3251 - class118.field1410;
        if (class279.field3932 < 0) {
            class271.field3844 = -class279.field3932;
            class279.field3932 = 0;
        } else {
            class271.field3844 = 0;
        }
        class256.field3445 = class326.field4585 - class118.field1410;
        if (class256.field3445 < 0) {
            class142.field1997 = -class256.field3445;
            class256.field3445 = 0;
        } else {
            class142.field1997 = 0;
        }
        class197.field2682 = class239.field3251 + class118.field1410;
        if (class197.field2682 > class158.field2245) {
            class197.field2682 = class158.field2245;
        }
        class440.field6441 = class326.field4585 + class118.field1410;
        if (class440.field6441 > class52.field598) {
            class440.field6441 = class52.field598;
        }
        for (int var18 = 0; var18 < class118.field1410 + class118.field1410 + 2; ++var18) {
            for (int var23 = 0; var23 < class118.field1410 + class118.field1410 + 2; ++var23) {
                int var24 = class239.field3251 - class118.field1410 + var18;
                int var25 = class326.field4585 - class118.field1410 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class158.field2245 && var25 < class52.field598) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class78.field887[3].method1990(var24, var25) - 1000;
                    int var29 = class111.field1285 != null ? class111.field1285[0].method1990(var24, var25) + 128 : class78.field887[0].method1990(var24, var25) + 128;
                    class240.field3264[var18][var23] = class118.field1400.method1023(var26, var28, var27, var26, var29, var27);
                } else {
                    class240.field3264[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class118.field1410 + class118.field1410 + 1; ++var19) {
            for (int var22 = 0; var22 < class118.field1410 + class118.field1410 + 1; ++var22) {
                class289.field4111[var19][var22] = class240.field3264[var19][var22] || class240.field3264[var19 + 1][var22] || class240.field3264[var19][var22 + 1] || class240.field3264[var19 + 1][var22 + 1];
            }
        }
        class147.field2064 = arg8;
        class147.field2058 = arg9;
        class407.field5922 = arg10;
        class70.field786 = arg11;
        class257.field3500 = arg12;
        class160.method1048();
        class307.method1921(false);
        for (class19 var20 = (class19) class148.field2068.method1604((byte) 63); var20 != null; var20 = (class19) class148.field2068.method1612(-1)) {
            var20.method96(3);
            class148.method886(var20, 1);
        }
        if (class324.field4572) {
            for (int var21 = 0; var21 < class242.field3280; ++var21) {
                class256.field3438[var21].method392((byte) 125, arg1, arg17);
            }
        }
        if (arg2 > 1) {
            class118.field1400.method998(0);
            if (class341.field5015 == null || class341.field5015 instanceof class166) {
                class341.field5015 = new class272();
            }
        } else if (class341.field5015 == null || class341.field5015 instanceof class272) {
            class341.field5015 = new class166();
        }
        class341.field5015.method1095((byte) 73, arg2);
        class341.field5015.method1093((byte) 89);
        if (class379.field5582 != null) {
            class103.method559(true);
            class341.field5015.method1097(22, 7);
            class268.method1706(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class341.field5015.method1093((byte) 89);
            class341.field5015.method1097(23, 7);
            class103.method559(false);
        }
        class268.method1706(arg2, arg7, arg13, arg14, arg15, arg16);
        class341.field5015.method1093((byte) 89);
        class341.field5015.method1098((byte) -67);
        class341.field5015.method1093((byte) 89);
        if (arg2 > 1) {
            class118.field1400.method985(0);
        }
        class118.field1400.method926(0, (class33[]) null);
    }
}
