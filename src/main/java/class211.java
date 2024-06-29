import java.awt.Canvas;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class211 extends class346 {

    @OriginalMember(owner = "client!dp", name = "P", descriptor = "Z")
    public boolean field2864 = true;

    @OriginalMember(owner = "client!dp", name = "T", descriptor = "I")
    public int field2868 = 4;

    @OriginalMember(owner = "client!dp", name = "W", descriptor = "[B")
    private byte[] field2871 = new byte[512];

    @OriginalMember(owner = "client!dp", name = "U", descriptor = "I")
    public int field2869 = 4;

    @OriginalMember(owner = "client!dp", name = "bb", descriptor = "I")
    public int field2876 = 4;

    @OriginalMember(owner = "client!dp", name = "gb", descriptor = "I")
    public int field2881 = 0;

    @OriginalMember(owner = "client!dp", name = "ib", descriptor = "I")
    public int field2883 = 1638;

    @OriginalMember(owner = "client!dp", name = "L", descriptor = "I")
    public static int field2860 = 0;

    @OriginalMember(owner = "client!dp", name = "hb", descriptor = "I")
    public static volatile int field2882 = 0;

    @OriginalMember(owner = "client!dp", name = "I", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!dp", name = "J", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!dp", name = "K", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!dp", name = "M", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!dp", name = "N", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!dp", name = "O", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!dp", name = "R", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!dp", name = "V", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!dp", name = "Y", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!dp", name = "Z", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!dp", name = "ab", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!dp", name = "cb", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!dp", name = "db", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!dp", name = "eb", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!dp", name = "fb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!dp", name = "X", descriptor = "Ljava/awt/Frame;")
    public static Frame field2872;

    @OriginalMember(owner = "client!dp", name = "H", descriptor = "[Lsj;")
    public static class248[] field2856;

    @OriginalMember(owner = "client!dp", name = "Q", descriptor = "[S")
    private short[] field2865;

    @OriginalMember(owner = "client!dp", name = "S", descriptor = "[S")
    private short[] field2867;

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V", line = 9)
    public class211() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lir;Lir;I)V", line = 16)
    public static final void method1375(class185 arg0, class185 arg1, int arg2) {
        class217.field3026 = arg1;
        if (arg2 != -1) {
            field2872 = null;
        }
        ++field2875;
        class128.field1669 = arg0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I[II)V", line = 29)
    public final void method1376(int arg0, int[] arg1, int arg2) {
        ++field2873;
        int var4 = class436.field6337[arg0] * this.field2868;
        if (arg2 != 12718) {
            field2872 = null;
        }
        if (this.field2869 != 1) {
            short var5 = this.field2867[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field2865[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field2868 * var6 >> 12;
                int var9 = this.field2876 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 + 1;
                if (var8 <= var11) {
                    var11 = 0;
                }
                int var12 = var7 & 4095;
                int var13 = 255 & this.field2871[var10 & 255];
                int var14 = 255 & this.field2871[var11 & 255];
                int var15 = class72.field1016[var12];
                for (int var16 = 0; var16 < class134.field1753; ++var16) {
                    int var36 = class361.field5340[var16] * this.field2876;
                    int var37 = this.method1377(var15, var6 * var36 >> 12, var12, true, var14, var9, var13);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~var17 > ~this.field2869; ++var17) {
                short var18 = this.field2867[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field2865[var17] << 12;
                    int var20 = this.field2868 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field2876 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var21 & 4095;
                    if (var20 <= var24) {
                        var24 = 0;
                    }
                    int var26 = class72.field1016[var25];
                    int var27 = 255 & this.field2871[255 & var24];
                    int var28 = 255 & this.field2871[255 & var23];
                    if (this.field2864 && this.field2869 + -1 == var17) {
                        for (int var29 = 0; ~class134.field1753 < ~var29; ++var29) {
                            int var30 = class361.field5340[var29] * this.field2876;
                            int var31 = this.method1377(var26, var19 * var30 >> 12, var25, true, var27, var22, var28);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class134.field1753; ++var33) {
                            int var34 = class361.field5340[var33] * this.field2876;
                            int var35 = this.method1377(var26, var19 * var34 >> 12, var25, true, var27, var22, var28);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field2867[0];
            int var39 = this.field2865[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = this.field2876 * var39 >> 12;
            int var42 = this.field2868 * var39 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 - -1;
            int var45 = var40 & 4095;
            if (~var44 <= ~var42) {
                var44 = 0;
            }
            int var46 = class72.field1016[var45];
            int var47 = this.field2871[var43 & 255] & 255;
            int var48 = 255 & this.field2871[var44 & 255];
            if (!this.field2864) {
                for (int var49 = 0; var49 < class134.field1753; ++var49) {
                    int var50 = class361.field5340[var49] * this.field2876;
                    int var51 = this.method1377(var46, var39 * var50 >> 12, var45, true, var48, var41, var47);
                    arg1[var49] = var38 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~var52 > ~class134.field1753; ++var52) {
                    int var53 = class361.field5340[var52] * this.field2876;
                    int var54 = this.method1377(var46, var39 * var53 >> 12, var45, true, var48, var41, var47);
                    int var55 = var38 * var54 >> 12;
                    arg1[var52] = 2048 - -(var55 >> 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIZIII)I", line = 188)
    private final int method1377(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field2861;
        if (!arg3) {
            field2872 = null;
        }
        int var8 = arg1 >> 12;
        int var9 = var8 + 1;
        int var10 = arg1 & 4095;
        if (~arg5 >= ~var9) {
            var9 = 0;
        }
        int var11 = var8 & 255;
        int var12 = arg2 + -4096;
        int var13 = var10 + -4096;
        int var14 = var9 & 255;
        int var15 = this.field2871[arg6 + var11] & 3;
        int var16 = class72.field1016[var10];
        int var17;
        if (var15 <= 1) {
            var17 = var15 == 0 ? arg2 + var10 : -var10 + arg2;
        } else {
            var17 = ~var15 != -3 ? -var10 - arg2 : var10 - arg2;
        }
        int var18 = 3 & this.field2871[var14 - -arg6];
        int var19;
        if (~var18 < -2) {
            var19 = ~var18 == -3 ? var13 - arg2 : -arg2 + -var13;
        } else {
            var19 = ~var18 == -1 ? arg2 + var13 : -var13 + arg2;
        }
        int var20 = 3 & this.field2871[arg4 + var11];
        int var21 = ((var19 - var17) * var16 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var10 - -var12 : -var10 + var12;
        } else {
            var22 = var20 != 2 ? -var10 + -var12 : var10 - var12;
        }
        int var23 = 3 & this.field2871[arg4 + var14];
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var13 - var12 : -var12 + -var13;
        } else {
            var24 = ~var23 != -1 ? -var13 + var12 : var13 - -var12;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((-var21 + var25) * arg0 >> 12) + var21;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZII)V", line = 271)
    public static final void method1378(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            ++field2878;
            class92 var3 = class406.method2575(14880, arg1);
            int var4 = var3.field1260;
            int var5 = var3.field1259;
            int var6 = var3.field1262;
            int var7 = class354.field5246[-var5 + var6];
            if (~arg2 > -1 || var7 < arg2) {
                arg2 = 0;
            }
            int var8 = var7 << var5;
            class366.method2414(var4, ~var8 & class385.field5632[var4] | arg2 << var5 & var8, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)V", line = 299)
    public final void method237(byte arg0) {
        ++field2859;
        this.field2871 = class248.method1631(125, this.field2881);
        this.method1383(16590);
        if (arg0 > -95) {
            method1381(false);
        }
        for (int var2 = this.field2869 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field2867[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field2869;
        }
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(Z)V", line = 329)
    public static final void method1379(boolean arg0) {
        class27.field471.method1839((byte) 95);
        ++field2874;
        int var1 = class27.field471.method1832(8, (byte) -109);
        if (~class93.field1274 < ~var1) {
            for (int var2 = var1; class93.field1274 > var2; ++var2) {
                class3.field41[class388.field5678++] = class62.field943[var2];
            }
        }
        if (~class93.field1274 > ~var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class93.field1274 = 0;
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class62.field943[var3];
                class163 var5 = class388.field5670[var4];
                int var6 = class27.field471.method1832(1, (byte) -80);
                if (var6 == 0) {
                    class62.field943[class93.field1274++] = var4;
                    var5.field2154 = class231.field3179;
                } else {
                    int var7 = class27.field471.method1832(2, (byte) -58);
                    if (var7 == 0) {
                        class62.field943[class93.field1274++] = var4;
                        var5.field2154 = class231.field3179;
                        class298.field4500[class421.field6124++] = var4;
                    } else if (~var7 == -2) {
                        class62.field943[class93.field1274++] = var4;
                        var5.field2154 = class231.field3179;
                        int var8 = class27.field471.method1832(3, (byte) -112);
                        var5.method1085(1, 0, var8);
                        int var9 = class27.field471.method1832(1, (byte) -44);
                        if (~var9 == -2) {
                            class298.field4500[class421.field6124++] = var4;
                        }
                    } else if (var7 == 2) {
                        class62.field943[class93.field1274++] = var4;
                        var5.field2154 = class231.field3179;
                        if (class27.field471.method1832(1, (byte) -81) != 1) {
                            int var10 = class27.field471.method1832(3, (byte) -64);
                            var5.method1085(0, 0, var10);
                        } else {
                            int var11 = class27.field471.method1832(3, (byte) -65);
                            var5.method1085(2, 0, var11);
                            int var12 = class27.field471.method1832(3, (byte) -38);
                            var5.method1085(2, 0, var12);
                        }
                        int var13 = class27.field471.method1832(1, (byte) -95);
                        if (~var13 == -2) {
                            class298.field4500[class421.field6124++] = var4;
                        }
                    } else if (var7 == 3) {
                        class3.field41[class388.field5678++] = var4;
                    }
                }
            }
            if (arg0) {
                field2856 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIII)V", line = 453)
    public static final void method1380(int arg0, int arg1, int arg2, int arg3) {
        ++field2866;
        int var4 = class154.field1961 * arg0 >> 8;
        if (~var4 != arg2 && arg1 != -1) {
            class232.method1510(var4, -10668, false, 0, class394.field5733, arg1);
            class60.field919 = true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "(Z)V", line = 469)
    public static void method1381(boolean arg0) {
        field2872 = null;
        if (!arg0) {
            field2856 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;", line = 489)
    public static final String method1382(int arg0, int arg1, String[] arg2, int arg3) {
        ++field2877;
        if (~arg1 == arg0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg3];
            return var4 != null ? var4.toString() : "null";
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var5 > var7; ++var7) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; ~var5 < ~var9; ++var9) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V", line = 549)
    private final void method1383(int arg0) {
        if (this.field2883 > 0) {
            this.field2865 = new short[this.field2869];
            this.field2867 = new short[this.field2869];
            for (int var2 = 0; ~this.field2869 < ~var2; ++var2) {
                this.field2867[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2883 / 4096.0F), (double) var2)));
                this.field2865[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2867 != null && this.field2867.length == this.field2869) {
            this.field2865 = new short[this.field2869];
            for (int var3 = 0; ~var3 > ~this.field2869; ++var3) {
                this.field2865[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 16590) {
            this.field2868 = 58;
        }
        ++field2880;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BIZ)V", line = 594)
    public static final void method1384(byte arg0, int arg1, boolean arg2) {
        try {
            if (arg1 != 0 && arg2) {
                class126.field1647 = class107.method813(0, class63.field948, 0, class422.field6138, class74.field1035, 8);
                class126.field1647.method486(0);
                class431 var3 = class290.method1970(class409.field5942, 0, -1, class341.field5043);
                class129 var4 = class126.field1647.method446(var3, class10.method75(class118.field1532, class409.field5942, 0), true);
                class447.method2773(class165.field2240, true, (byte) -41, var4);
                class126.field1647.method471();
                class20.method162(1016);
            }
            class126.field1647 = class107.method813(class104.field1359 * 2, class63.field948, arg1, class422.field6138, class74.field1035, 8);
            if (class126.field1647.method507()) {
                class247 var5 = class126.field1647.method452(536870912);
                class126.field1647.method461(var5);
            }
        } catch (Throwable var8) {
            if (~arg1 != -1) {
                class126.field1647 = class107.method813(0, class63.field948, 0, class422.field6138, class74.field1035, 8);
                arg1 = 0;
            }
        }
        ++field2858;
        class397.field5796 = arg1;
        class217.method1430(1013274631);
        if (!class126.field1647.method442()) {
            class334.field4918 = 1;
        }
        class126.field1647.method492(class334.field4918);
        class126.field1647.method527(0);
        class369.field5449 = class126.field1647.method429();
        class96.field1309 = class126.field1647.method429();
        int var6 = (int) ((double) class351.field5217 * 34.46D);
        if (class126.field1647.method524()) {
            var6 += 128;
        }
        class126.field1647.method489(50, var6);
        int var7 = -20 / ((arg0 - 35) / 45);
        class126.field1647.method433(!class397.field5799);
        if (class126.field1647.method469()) {
            class390.method2518(class256.field3747, -17);
        }
        class322.field4803 = !class226.method1467(0);
        class84.method688(class351.field5217 >> 3, false, class143.field1815 >> 3, class126.field1647);
        class104.method795(false);
        class113.field1470 = false;
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "(I)V", line = 666)
    public static final void method1385(int arg0) {
        ++field2879;
        int var1 = class233.field3232.method2695(-1, class337.field4983);
        for (class138 var2 = (class138) class186.field2547.method1575(0); var2 != null; var2 = (class138) class186.field2547.method1573((byte) -128)) {
            int var6 = class258.method1705((byte) -99, var2);
            if (~var6 < ~var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class402.field5874 * 16 + 21;
        int var4 = -(var1 / 2) + class277.field4060;
        if (~class357.field5298 > ~(var4 - -var1)) {
            var4 = -var1 + class357.field5298;
        }
        if (~var4 > -1) {
            var4 = 0;
        }
        int var5 = class217.field3032;
        if (~class435.field6313 > ~(var3 + var5)) {
            var5 = class435.field6313 - var3;
        }
        class184.field2469 = var4;
        if (~var5 > -1) {
            var5 = 0;
        }
        class341.field5066 = var5;
        class389.field5694 = var1;
        if (arg0 < -97) {
            class145.field1858 = (class167.field2266 ? 26 : 22) + class402.field5874 * 16;
            class165.field2244 = true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lwh;Ljava/awt/Canvas;II)Ltj;", line = 719)
    public static final class298 method1386(class288 arg0, Canvas arg1, int arg2, int arg3) {
        ++field2870;
        if (arg2 != 0) {
            field2882 = -81;
        }
        return new class59(arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lfb;ZI)V", line = 733)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field2868 = arg0.method2233((byte) 104);
                                }
                            } else {
                                this.field2876 = arg0.method2233((byte) 104);
                            }
                        } else {
                            this.field2881 = arg0.method2233((byte) 104);
                        }
                    } else {
                        this.field2876 = this.field2868 = arg0.method2233((byte) 104);
                    }
                } else {
                    this.field2883 = arg0.method2212(-2);
                    if (this.field2883 < 0) {
                        this.field2867 = new short[this.field2869];
                        for (int var5 = 0; var5 < this.field2869; ++var5) {
                            this.field2867[var5] = (short) arg0.method2212(-2);
                        }
                    }
                }
            } else {
                this.field2869 = arg0.method2233((byte) 104);
            }
        } else {
            this.field2864 = ~arg0.method2233((byte) 104) == -2;
        }
        ++field2857;
        if (arg1) {
            this.field2883 = 86;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)[I", line = 825)
    public final int[] method45(int arg0, int arg1) {
        ++field2862;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            this.method1376(arg0, var3, 12718);
        }
        return arg1 != 3 ? null : var3;
    }
}
