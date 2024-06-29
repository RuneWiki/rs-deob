import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class402 extends class404 {

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    private int field5847 = 32768;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "[B")
    public static byte[] field5850 = new byte[2048];

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "[F")
    public static float[] field5848 = new float[16384];

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
    public static int field5846 = -1;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "[F")
    public static float[] field5856 = new float[16384];

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "F")
    public static float field5858;

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "F")
    public static float field5861;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    public static int field5860;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nu", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field5862;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2389(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field5848[var2] = (float) Math.sin((double) var2 * var0);
            field5856[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILha;I)V", line = 3)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field5873 = ~arg1.method257((byte) 126) == -2;
            }
        } else {
            this.field5847 = arg1.method254((byte) -86) << 4;
        }
        if (arg0 == 0) {
            ++field5849;
        }
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(II)I", line = 39)
    public static final int method2383(int arg0, int arg1) {
        int var2 = -118 % ((51 - arg0) / 54);
        ++field5854;
        int var3 = 0;
        if (~arg1 > -1 || arg1 >= 65536) {
            var3 += 16;
            arg1 >>>= 16;
        }
        if (~arg1 <= -257) {
            arg1 >>>= 8;
            var3 += 8;
        }
        if (arg1 >= 16) {
            var3 += 4;
            arg1 >>>= 4;
        }
        if (~arg1 <= -5) {
            var3 += 2;
            arg1 >>>= 2;
        }
        if (~arg1 <= -2) {
            ++var3;
            arg1 >>>= 1;
        }
        return arg1 + var3;
    }

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "(I)V", line = 82)
    public static void method2384(int arg0) {
        field5856 = null;
        field5850 = null;
        if (arg0 != -1644) {
            field5848 = null;
        }
        field5848 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I", line = 98)
    public final int[] method90(int arg0, int arg1) {
        ++field5851;
        if (arg0 > -47) {
            field5856 = null;
        }
        int[] var3 = super.field5870.method372(arg1, (byte) -28);
        if (super.field5870.field810) {
            int[] var4 = this.method2394(1, (byte) 64, arg1);
            int[] var5 = this.method2394(2, (byte) 64, arg1);
            for (int var6 = 0; var6 < class431.field6348; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field5847 >> 12;
                int var9 = class251.field3841[var7] * var8 >> 12;
                int var10 = class486.field7407[var7] * var8 >> 12;
                int var11 = class98.field1757 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg1 & class435.field6374;
                int[] var13 = this.method2394(0, (byte) 64, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V", line = 147)
    public static final void method2385(byte arg0) {
        ++field5857;
        int var1 = 113 % ((-71 - arg0) / 37);
        if (~class260.field3942 != -3) {
            try {
                Method var2 = (field5862 != null ? field5862 : (field5862 = method2389("java.lang.Runtime"))).getMethod("maxMemory");
                if (var2 != null) {
                    try {
                        Runtime var3 = Runtime.getRuntime();
                        Long var4 = (Long) var2.invoke(var3, (Object[]) null);
                        class322.field4841 = (int) (var4 / 1048576L) + 1;
                        return;
                    } catch (Throwable var5) {
                        return;
                    }
                }
            } catch (Exception var6) {
                return;
            }
        } else {
            class322.field4841 = 96;
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)[[I", line = 179)
    public final int[][] method89(int arg0, int arg1) {
        if (arg0 != -1) {
            method2386((class282) null, -25, (byte[][]) null);
        }
        ++field5860;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (super.field5869.field7156) {
            int[] var4 = this.method2394(1, (byte) 64, arg1);
            int[] var5 = this.method2394(2, (byte) 64, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class431.field6348; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field5847 >> 12;
                int var12 = class251.field3841[var10] * var11 >> 12;
                int var13 = class486.field7407[var10] * var11 >> 12;
                int var14 = class98.field1757 & (var12 >> 12) + var9;
                int var15 = class435.field6374 & (var13 >> 12) + arg1;
                int[][] var16 = this.method2400(-11872, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lq;I[[B)V", line = 237)
    public static final void method2386(class282 arg0, int arg1, byte[][] arg2) {
        ++field5852;
        for (int var3 = 0; ~arg0.field4299 < ~var3; ++var3) {
            class233.method1400(false);
            for (int var4 = 0; class150.field2422 >> 3 > var4; ++var4) {
                for (int var5 = 0; class21.field272 >> 3 > var5; ++var5) {
                    int var6 = class420.field6038[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 62008563) >> 24;
                        if (!arg0.field4301 || ~var7 == -1) {
                            int var8 = (var6 & 6) >> 1;
                            int var9 = (var6 & 16764167) >> 14;
                            int var10 = 2047 & var6 >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class61.field1032.length; ++var12) {
                                if (class61.field1032[var12] == var11 && arg2[var12] != null) {
                                    arg0.method1716((7 & var9) * 8, var4 * 8, var8, class345.field5116, var3, var5 * 8, arg2[var12], (7 & var10) * 8, var7, 4, class91.field1641);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 8) {
            method2385((byte) 116);
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(III)V", line = 310)
    public static final void method2387(int arg0, int arg1, int arg2) {
        ++field5855;
        class226.field3471 = -class492.field7494 + arg1;
        int var3 = -8 / ((-62 - arg2) / 32);
        class403.field5863 = arg0 - class492.field7497;
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V", line = 321)
    public final void method211(int arg0) {
        ++field5853;
        class331.method2053(false);
        if (arg0 != -3) {
            field5861 = -0.9392775F;
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V", line = 332)
    public class402() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lha;I)Lnb;", line = 350)
    public static final class189 method2388(class40 arg0, int arg1) {
        ++field5859;
        if (arg1 <= 109) {
            field5858 = -0.15453774F;
        }
        return new class189(arg0.method249(false), arg0.method249(false), arg0.method249(false), arg0.method249(false), arg0.method224(-2), arg0.method257((byte) 25));
    }
}
