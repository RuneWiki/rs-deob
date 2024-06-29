import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class255 extends class195 {

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    private int field4099 = 204;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    private int field4096 = 1;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    private int field4095 = 1;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "Lvk;")
    public static class67 field4098 = new class67(100);

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public static int field4101 = 0;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "Lck;")
    private static class119 field4104 = class298.method1987((byte) 70, "Loading title screen )2 ");

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "Lck;")
    public static class119 field4103 = class298.method1987((byte) 71, "::fpsoff");

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "S")
    public static short field4102 = 320;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lck;")
    public static class119 field4100 = field4104;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "Lck;")
    public static class119 field4105 = class298.method1987((byte) 48, "Hidden)2");

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)[I", line = 5)
    public final int[] method11(int arg0, boolean arg1) {
        if (arg1) {
            field4100 = (class119) null;
        }
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            for (int var4 = 0; var4 < class157.field2504; var4++) {
                int var5 = class215.field3424[arg0];
                int var6 = class157.field2505[var4];
                int var7 = this.field4096 * var6 >> 12;
                int var8 = var5 % (4096 / this.field4095) * this.field4095;
                int var9 = this.field4095 * var5 >> 12;
                int var10 = var6 % (4096 / this.field4096) * this.field4096;
                if (this.field4099 > var8) {
                    for (var7 -= var9; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var10 < this.field4099) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var10 < this.field4099) {
                    int var11;
                    for (var11 = var7 - var9; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        field4106++;
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 87)
    public static final void method1638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class37 var20 = new class37(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class150.field2390[var21][arg1][arg2] == null) {
                    class150.field2390[var21][arg1][arg2] = new class104(var21, arg1, arg2);
                }
            }
            class150.field2390[arg0][arg1][arg2].field1605 = var20;
        } else if (arg3 == 1) {
            class37 var22 = new class37(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class150.field2390[var23][arg1][arg2] == null) {
                    class150.field2390[var23][arg1][arg2] = new class104(var23, arg1, arg2);
                }
            }
            class150.field2390[arg0][arg1][arg2].field1605 = var22;
        } else {
            class41 var24 = new class41(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class150.field2390[var25][arg1][arg2] == null) {
                    class150.field2390[var25][arg1][arg2] = new class104(var25, arg1, arg2);
                }
            }
            class150.field2390[arg0][arg1][arg2].field1594 = var24;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIBII)V", line = 138)
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4094++;
        if (arg4 > -108) {
            method1640((byte) -64);
        }
        if (arg0 >= class79.field1226 && class59.field957 >= arg6 && arg5 >= class108.field1650 && arg1 <= class236.field3800) {
            if (arg3 == 1) {
                class197.method1262(arg5, 13697, arg2, arg6, arg0, arg1);
            } else {
                class71.method511(arg2, (byte) 125, arg1, arg6, arg3, arg5, arg0);
            }
        } else if (arg3 == 1) {
            class209.method1312(arg5, arg2, (byte) -60, arg6, arg1, arg0);
        } else {
            class150.method969(arg5, arg6, -71, arg3, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lfj;II)V", line = 169)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 > -117) {
            method1640((byte) -88);
        }
        field4097++;
        if (arg2 == 0) {
            this.field4096 = arg0.method64((byte) -119);
        } else if (arg2 == 1) {
            this.field4095 = arg0.method64((byte) 78);
        } else if (arg2 == 2) {
            this.field4099 = arg0.method63((byte) 1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 212)
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V", line = 233)
    public static void method1640(byte arg0) {
        field4100 = null;
        field4103 = null;
        field4105 = null;
        field4098 = null;
        field4104 = null;
        if (arg0 <= 93) {
            field4105 = (class119) null;
        }
    }
}
