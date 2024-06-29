import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class466 {

    @OriginalMember(owner = "client!us", name = "O", descriptor = "[I")
    private int[] field11 = new int[3];

    @OriginalMember(owner = "client!us", name = "P", descriptor = "I")
    private int field12 = 4096;

    @OriginalMember(owner = "client!us", name = "J", descriptor = "I")
    private int field6 = 3216;

    @OriginalMember(owner = "client!us", name = "T", descriptor = "I")
    private int field16 = 3216;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "[I")
    public static int[] field2 = new int[16384];

    @OriginalMember(owner = "client!us", name = "K", descriptor = "[I")
    public static int[] field7 = new int[16384];

    @OriginalMember(owner = "client!us", name = "R", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!us", name = "Q", descriptor = "F")
    public static float field13 = 0.0F;

    @OriginalMember(owner = "client!us", name = "V", descriptor = "Lcba;")
    public static class471 field18;

    @OriginalMember(owner = "client!us", name = "W", descriptor = "[Ljava/awt/Color;")
    public static Color[] field19;

    @OriginalMember(owner = "client!us", name = "U", descriptor = "F")
    public static float field17;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "S", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "Lsv;")
    public static class567 field10;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
    private final void method1(byte arg0) {
        ++field3;
        double var2 = Math.cos((double) ((float) this.field6 / 4096.0F));
        int var4 = 84 / ((arg0 - -58) / 59);
        this.field11[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field16 / 4096.0F)));
        this.field11[1] = (int) (4096.0D * Math.cos((double) ((float) this.field16 / 4096.0F)) * var2);
        this.field11[2] = (int) (4096.0D * Math.sin((double) ((float) this.field6 / 4096.0F)));
        int var5 = this.field11[0] * this.field11[0] >> 12;
        int var6 = this.field11[1] * this.field11[1] >> 12;
        int var7 = this.field11[2] * this.field11[2] >> 12;
        int var8 = (int) (4096.0D * Math.sqrt((double) (var5 - -var6 + var7 >> 12)));
        if (~var8 != -1) {
            this.field11[1] = (this.field11[1] << 12) / var8;
            this.field11[0] = (this.field11[0] << 12) / var8;
            this.field11[2] = (this.field11[2] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field8;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            return null;
        } else {
            if (super.field6557.field1163) {
                int var4 = class576.field7931 * this.field12 >> 12;
                int[] var5 = this.method2721(0, arg0 + -1 & class105.field1581, 2);
                int[] var6 = this.method2721(0, arg0, 2);
                int[] var7 = this.method2721(0, arg0 + 1 & class105.field1581, 2);
                for (int var8 = 0; ~class312.field4207 < ~var8; ++var8) {
                    int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class340.field4582] + -var6[class340.field4582 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (~var11 > -1) {
                        var11 = -var11;
                    }
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = class317.field4279[((var12 - -1) * var12 >> 1) + var11] & 255;
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = var9 * var13 >> 8;
                    int var17 = this.field11[2] * var14 >> 12;
                    int var18 = this.field11[0] * var15 >> 12;
                    int var19 = this.field11[1] * var16 >> 12;
                    var3[var8] = var18 + var19 - -var17;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
    public class1() {
        super(1, true);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "()V")
    public static final void method3() {
        if (class317.field4302 != null) {
            for (int var0 = 0; var0 < class317.field4302.length; ++var0) {
                for (int var1 = 0; var1 < class332.field4447; ++var1) {
                    for (int var2 = 0; var2 < class34.field624; ++var2) {
                        if (class317.field4302[var0][var1][var2] != null) {
                            class317.field4302[var0][var1][var2].method3630(14791);
                        }
                        class317.field4302[var0][var1][var2] = null;
                    }
                }
            }
        }
        class317.field4302 = null;
        class608.field8767 = null;
        if (class118.field1941 != null) {
            for (int var3 = 0; var3 < class118.field1941.length; ++var3) {
                for (int var4 = 0; var4 < class332.field4447; ++var4) {
                    for (int var5 = 0; var5 < class34.field624; ++var5) {
                        if (class118.field1941[var3][var4][var5] != null) {
                            class118.field1941[var3][var4][var5].method3630(14791);
                        }
                        class118.field1941[var3][var4][var5] = null;
                    }
                }
            }
        }
        class118.field1941 = null;
        client.field3472 = null;
        class356.field4807 = null;
        class590.field8430 = null;
        class134.field2127 = 0;
        if (class120.field1964 != null) {
            for (int var6 = 0; var6 < class134.field2127; ++var6) {
                class120.field1964[var6] = null;
            }
        }
        if (class45.field858 != null) {
            for (int var7 = 0; var7 < class510.field7140; ++var7) {
                class45.field858[var7] = null;
            }
            class510.field7140 = 0;
        }
        if (class363.field4863 != null) {
            for (int var8 = 0; var8 < class517.field7258; ++var8) {
                class363.field4863[var8] = null;
            }
            for (int var9 = 0; var9 < class395.field5610; ++var9) {
                for (int var10 = 0; var10 < class332.field4447; ++var10) {
                    for (int var11 = 0; var11 < class34.field624; ++var11) {
                        class217.field3091[var9][var10][var11] = 0L;
                    }
                }
            }
            class517.field7258 = 0;
        }
        class277.field3830 = null;
        class90.method655((byte) 115);
        class402.field5723.method3144((byte) -124);
        class590.field8423 = null;
        class473.field6662 = null;
        class246.field3418 = null;
        class233.field3288 = null;
        class618.field8854 = null;
        class329.field4405 = null;
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V")
    public static void method4(int arg0) {
        field7 = null;
        field10 = null;
        field18 = null;
        if (arg0 > -34) {
            field19 = null;
        }
        field19 = null;
        field2 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method5(boolean arg0, int arg1, String arg2) {
        class152.field2307.field288 = arg1;
        ++field5;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; class181.field2574.field2017 > var6; ++var6) {
            class621 var9 = class181.field2574.method866(var6, (byte) 79);
            if ((!arg0 || var9.field8903) && var9.field8910 == -1 && var9.field8909 == -1 && ~var9.field8900 == -1 && ~var9.field8924.toLowerCase().indexOf(var3) != 0) {
                if (~var5 <= -251) {
                    class568.field7844 = -1;
                    class512.field7212 = null;
                    return;
                }
                if (~var5 <= ~var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var5 > var11; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class536.field7493 = 0;
        class512.field7212 = var4;
        class568.field7844 = var5;
        String[] var7 = new String[class568.field7844];
        for (int var8 = 0; ~var8 > ~class568.field7844; ++var8) {
            var7[var8] = class181.field2574.method866(var4[var8], (byte) 79).field8924;
        }
        class261.method1705(class512.field7212, -20809, var7);
        class152.field2307.method217(0);
        class152.field2307.field288 = 2;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            field19 = null;
        }
        ++field15;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field6 = arg0.method93((byte) 93);
                }
            } else {
                this.field16 = arg0.method93((byte) 73);
            }
        } else {
            this.field12 = arg0.method93((byte) 76);
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        this.method1((byte) -127);
        ++field9;
        if (arg0 != -806066388) {
            this.method7(-112);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIII)V")
    public static final void method8(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 == 6570) {
            if (~class341.field4590 == -2) {
                class228.field3257[class342.field4608 / 100].method497(class96.field1461 + -8, class16.field210 + -8);
            }
            ++field4;
            if (class341.field4590 == 2) {
                class228.field3257[class342.field4608 / 100 + 4].method497(class96.field1461 - 8, class16.field210 + -8);
            }
            class76.method585((byte) -49);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
    public static final String method9(int arg0, int arg1, int arg2, boolean arg3) {
        ++field1;
        if (~arg2 <= -3 && ~arg2 >= -37) {
            if (arg3 && arg1 >= 0) {
                int var4 = 2;
                int var5 = arg1 / arg2;
                while (~var5 != -1) {
                    var5 /= arg2;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = arg0 + var4; ~var7 < -1; --var7) {
                    int var8 = arg1;
                    arg1 /= arg2;
                    int var9 = -(arg1 * arg2) + var8;
                    if (var9 >= 10) {
                        var6[var7] = (char) (var9 + 87);
                    } else {
                        var6[var7] = (char) (var9 + 48);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg1, arg2);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field2[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field7[var2] = (int) (32768.0D * Math.cos((double) var2 * var0));
        }
        field18 = new class471(106, 4);
        field19 = new Color[] { new Color(9179409), new Color(3289650) };
    }
}
