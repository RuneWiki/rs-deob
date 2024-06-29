import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class305 extends class526 {

    @OriginalMember(owner = "client!saa", name = "r", descriptor = "I")
    public int field3864 = -1;

    @OriginalMember(owner = "client!saa", name = "t", descriptor = "I")
    public static int field3866 = -1;

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!saa", name = "q", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!saa", name = "s", descriptor = "I")
    public int field3865;

    @OriginalMember(owner = "client!saa", name = "u", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!saa", name = "v", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!saa", name = "x", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!saa", name = "o", descriptor = "Lji;")
    public static class572 field3861;

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "Ljava/lang/String;")
    public String field3860;

    @OriginalMember(owner = "client!saa", name = "w", descriptor = "Ljava/lang/String;")
    public String field3869;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lkda;IIFFFIFFIII[BI)V", line = 7)
    public static final void method1814(class361 arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte[] arg12, int arg13) {
        ++field3870;
        int var14 = arg1 * arg11;
        float[] var15 = new float[var14];
        for (int var16 = 0; ~var16 > ~arg13; ++var16) {
            arg0.method713(arg6, arg11, 11854, arg1, arg5 * 127.0F, arg8 / (float) arg9, arg9, arg7 / (float) arg1, 0, arg4 / (float) arg11, var15);
            int var19 = arg10;
            arg4 *= 2.0F;
            arg7 *= 2.0F;
            arg8 *= 2.0F;
            for (int var20 = 0; ~var14 < ~var20; ++var20) {
                arg12[var19] = (byte) ((int) ((float) arg12[var19] + var15[var20]));
                ++var19;
            }
            arg5 = arg3 * arg5;
        }
        int var17 = arg10;
        for (int var18 = arg2; var14 > var18; ++var18) {
            arg12[var17] = (byte) (arg12[var17] + 127);
            ++var17;
        }
    }

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "(I)V", line = 56)
    public static void method1815(int arg0) {
        field3861 = null;
        if (arg0 != 3072) {
            field3866 = 109;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V", line = 68)
    public static final void method1816(byte arg0) {
        ++field3868;
        int var1 = 0;
        if (arg0 != 2) {
            method1817(36, -68, -86);
        }
        if (class611.field8310.method3593(class628.field8526, (byte) -86)) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (!class611.field8310.field8685) {
            var1 |= 64;
        }
        class392.method2229(var1, -21628);
        class232.field3017.method2357(var1, 0);
        class504.field6287.method1625(3305, var1);
        class46.field620.method3768(var1, (byte) -108);
        class339.field4336.method2156(arg0 ^ -24243, var1);
        class455.method2499(var1, false);
        class668.method3711(var1, true);
        class182.method1081(var1, 0);
        class148.method931(-15414, var1);
        class303.method1800(-28818);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)V", line = 111)
    public static final void method1817(int arg0, int arg1, int arg2) {
        class565 var3 = class407.field5237[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field7082 != null) {
                var3.field7082 = null;
            }
            if (var3.field7073 != null) {
                var3.field7073 = null;
            }
        }
    }

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "(I)Lvea;", line = 124)
    public final class256 method1818(int arg0) {
        if (arg0 != 8) {
            field3861 = null;
        }
        ++field3867;
        return class618.field8384[super.field6644];
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(B)V", line = 141)
    public static final void method1819(byte arg0) {
        if (class23.field266 < 1024.0F) {
            class23.field266 = 1024.0F;
        }
        ++field3863;
        while (class689.field9561 >= 16384.0F) {
            class689.field9561 -= 16384.0F;
        }
        if (class23.field266 > 3072.0F) {
            class23.field266 = 3072.0F;
        }
        while (class689.field9561 < 0.0F) {
            class689.field9561 += 16384.0F;
        }
        int var1 = class415.field5323 >> 9;
        int var2 = field3862 >> 9;
        int var3 = class514.method2798(field3862, class415.field5323, class675.field9219, (byte) 23);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && ~(class85.field1090 - 4) < ~var1 && class656.field8932 + -4 > var2) {
            for (int var5 = var1 + -4; ~var5 >= ~(var1 + 4); ++var5) {
                for (int var6 = var2 + -4; ~var6 >= ~(var2 + 4); ++var6) {
                    int var7 = class675.field9219;
                    if (~var7 > -4 && class407.method2284(116, var5, var6)) {
                        ++var7;
                    }
                    int var8 = 0;
                    if (class639.field8665.field2228 != null && class639.field8665.field2228[var7] != null) {
                        var8 = (255 & class639.field8665.field2228[var7][var5][var6]) * 8;
                    }
                    int var9 = var3 + var8 + -class299.field3801[var7].method201(var5, var6);
                    if (~var9 < ~var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (arg0 >= -59) {
            method1816((byte) -22);
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class300.field3817) {
            class300.field3817 += (-class300.field3817 + var10) / 24;
        } else if (~class300.field3817 < ~var10) {
            class300.field3817 += (-class300.field3817 + var10) / 80;
        }
    }
}
