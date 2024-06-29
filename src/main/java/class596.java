import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class596 extends class175 {

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    private int field8114 = -1;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "Led;")
    public static class732 field8108 = new class732(15, 0, 1, 0);

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    private int field8109;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    private int field8110;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "[I")
    private int[] field8112;

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 3)
    public class596() {
        super(0, false);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZIIII)V", line = 6)
    public static final void method3337(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8111;
        int var6 = class269.method1790(arg2, class233.field3099, class291.field4156, 13094);
        int var7 = class269.method1790(arg4, class233.field3099, class291.field4156, 13094);
        int var8 = class269.method1790(arg0, class45.field472, class297.field4199, 13094);
        if (!arg1) {
            int var9 = class269.method1790(arg3, class45.field472, class297.field4199, 13094);
            for (int var10 = var6; ~var7 <= ~var10; ++var10) {
                class464.method2733(arg5, var8, var9, -22816, class228.field2951[var10]);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILdt;Z)V", line = 33)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field8115;
        if (~arg0 == -1) {
            this.field8114 = arg1.method1728((byte) 116);
        }
        if (arg2) {
            field8108 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)I", line = 48)
    public final int method1201(int arg0) {
        if (arg0 <= 118) {
            this.method1203((byte) 40);
        }
        ++field8117;
        return this.field8114;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 59)
    public final void method1203(byte arg0) {
        super.method1203(arg0);
        ++field8120;
        this.field8112 = null;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V", line = 73)
    public static void method3338(byte arg0) {
        if (arg0 <= 40) {
            field8108 = null;
        }
        field8108 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BZIZILjava/lang/String;Ljava/lang/String;)V", line = 87)
    public static final void method3339(byte arg0, boolean arg1, int arg2, boolean arg3, int arg4, String arg5, String arg6) {
        class16.field162.field2259 = 1;
        ++field8118;
        String var7 = arg6.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (~arg2 != 0) {
            class560 var11 = class315.field4447.method3515(arg2, 0);
            if (var11 == null || !var11.method3196(-103) == arg3) {
                return;
            }
            if (var11.method3196(-112)) {
                var10 = var11.field7683;
            } else {
                var9 = var11.field7679;
            }
        }
        int var12 = 0;
        for (int var13 = 0; ~class16.field156.field4654 < ~var13; ++var13) {
            class369 var16 = class16.field156.method2121(var13, 25928);
            if ((!arg1 || var16.field5343) && ~var16.field5339 == 0 && ~var16.field5354 == 0 && ~var16.field5345 == 0 && ~var16.field5359 == -1 && var16.field5349.toLowerCase().indexOf(var7) != -1) {
                if (arg2 != -1) {
                    if (!arg3) {
                        if (arg4 != var16.method2312(var9, arg2, (byte) 109)) {
                            continue;
                        }
                    } else if (!arg5.equals(var16.method2317(false, var10, arg2))) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class235.field3136 = null;
                    class236.field3145 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; ~var18 > ~var12; ++var18) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        if (arg0 < 28) {
            method3339((byte) 61, false, 95, false, 37, (String) null, (String) null);
        }
        class236.field3145 = var12;
        class235.field3136 = var8;
        class585.field7967 = 0;
        String[] var14 = new String[class236.field3145];
        for (int var15 = 0; ~class236.field3145 < ~var15; ++var15) {
            var14[var15] = class16.field156.method2121(var8[var15], 25928).field5349;
        }
        class573.method3257(class235.field3136, var14, 15);
        class16.field162.method1187(80);
        class16.field162.field2259 = 2;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)[[I", line = 201)
    public final int[][] method238(int arg0, byte arg1) {
        ++field8116;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (arg1 >= -47) {
            this.field8109 = 62;
        }
        if (super.field2316.field8746) {
            int var4 = this.field8110 * (~class561.field7687 == ~this.field8109 ? arg0 : this.field8109 * arg0 / class561.field7687);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class598.field8136 != this.field8110) {
                for (int var8 = 0; ~var8 > ~class598.field8136; ++var8) {
                    int var9 = this.field8110 * var8 / class598.field8136;
                    int var10 = this.field8112[var4 + var9];
                    var7[var8] = class519.method3018(var10, 255) << 4;
                    var6[var8] = class519.method3018(var10, 65280) >> 4;
                    var5[var8] = class519.method3018(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class598.field8136; ++var11) {
                    int var12 = this.field8112[var4++];
                    var7[var11] = class519.method3018(var12, 255) << 4;
                    var6[var11] = class519.method3018(var12 >> 4, 4080);
                    var5[var11] = class519.method3018(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I[BIIIIZLlf;)Lfu;", line = 265)
    public static final class411 method3340(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class250 arg7) {
        ++field8113;
        if (arg3 != 3553) {
            method3337(-100, false, 99, -83, 59, -91);
        }
        if (!arg7.field3588 && (!class439.method2627(0, arg0) || !class439.method2627(arg3 ^ 3553, arg4))) {
            return arg7.field3616 ? new class411(arg7, 34037, arg5, arg0, arg4, arg6, arg1, arg2) : new class411(arg7, arg5, arg0, arg4, class8.method45(arg3 ^ 20803, arg0), class8.method45(23714, arg4), arg1, arg2);
        } else {
            return new class411(arg7, 3553, arg5, arg0, arg4, arg6, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIB)V", line = 284)
    public final void method1204(int arg0, int arg1, byte arg2) {
        super.method1204(arg0, arg1, arg2);
        ++field8119;
        if (~this.field8114 <= -1 && class588.field8020 != null) {
            int var4 = class588.field8020.method1114(this.field8114, -57).field7853 ? 64 : 128;
            this.field8112 = class588.field8020.method1113(-61, var4, var4, false, this.field8114, 1.0F);
            this.field8109 = var4;
            this.field8110 = var4;
        }
    }
}
