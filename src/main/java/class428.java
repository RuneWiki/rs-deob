import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class428 extends class145 {

    @OriginalMember(owner = "client!h", name = "I", descriptor = "[S")
    private short[] field6082 = new short[257];

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    private int field6091 = 0;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Ljava/lang/String;")
    public static String field6087 = "glow3:";

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field6080 = 0;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "Ltd;")
    public static class107 field6084;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "[I")
    private int[] field6079;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "[I")
    private int[] field6081;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "[[I")
    private int[][] field6085;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLjava/lang/String;)V", line = 8)
    public static final void method2659(byte arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg0 != -57) {
            method2665(-102, -124, true);
        }
        ++field6090;
        System.exit(1);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 407)
    public class428() {
        super(1, true);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lap;IILbd;)V", line = 35)
    public static final void method2660(class289 arg0, int arg1, int arg2, class304 arg3) {
        ++field6094;
        class185 var4 = new class185();
        var4.field2680 = arg0.method1861((byte) -72);
        var4.field2685 = arg0.method1856((byte) 93);
        var4.field2689 = new int[var4.field2680];
        var4.field2686 = new class242[var4.field2680];
        var4.field2683 = new byte[var4.field2680][][];
        var4.field2688 = new int[var4.field2680];
        var4.field2687 = new class242[var4.field2680];
        var4.field2681 = new int[var4.field2680];
        int var5 = 0;
        if (arg2 != 15) {
            field6080 = 62;
        }
        while (~var5 > ~var4.field2680) {
            try {
                int var6 = arg0.method1861((byte) -72);
                if (var6 != 0 && ~var6 != -2 && ~var6 != -3) {
                    if (var6 == 3 || ~var6 == -5) {
                        String var7 = arg0.method1871(-1);
                        String var8 = arg0.method1871(-1);
                        int var9 = arg0.method1861((byte) -72);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; ~var11 > ~var9; ++var11) {
                            var10[var11] = arg0.method1871(-1);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (~var6 == -4) {
                            for (int var13 = 0; ~var13 > ~var9; ++var13) {
                                int var14 = arg0.method1856((byte) 20);
                                var12[var13] = new byte[var14];
                                arg0.method1882(-127, var14, 0, var12[var13]);
                            }
                        }
                        var4.field2688[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var9 > var16; ++var16) {
                            var15[var16] = class235.method1570((byte) 115, var10[var16]);
                        }
                        var4.field2687[var5] = arg3.method1956(class331.method2109(arg2, 8147), var8, var15, class235.method1570((byte) 110, var7));
                        var4.field2683[var5] = var12;
                    }
                } else {
                    String var17 = arg0.method1871(-1);
                    String var18 = arg0.method1871(-1);
                    int var19 = 0;
                    if (~var6 == -2) {
                        var19 = arg0.method1856((byte) 18);
                    }
                    var4.field2688[var5] = var6;
                    var4.field2689[var5] = var19;
                    var4.field2686[var5] = arg3.method1959(class235.method1570((byte) 117, var17), var18, 0);
                }
            } catch (ClassNotFoundException var20) {
                var4.field2681[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2681[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2681[var5] = -3;
            } catch (Exception var23) {
                var4.field2681[var5] = -4;
            } catch (Throwable var24) {
                var4.field2681[var5] = -5;
            }
            ++var5;
        }
        class220.field3041.method1249(var4, (byte) -106);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V", line = 151)
    public static final void method2661(int arg0, byte arg1) {
        class430.field6116.method2534(0, arg0);
        ++field6096;
        int var2 = -57 / ((-13 - arg1) / 36);
        class89.field1330.method2534(0, arg0);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(B)V", line = 163)
    private final void method2662(byte arg0) {
        ++field6092;
        int[] var2 = this.field6085[0];
        if (arg0 == -55) {
            int[] var3 = this.field6085[1];
            int[] var4 = this.field6085[this.field6085.length + -2];
            int[] var5 = this.field6085[this.field6085.length + -1];
            this.field6079 = new int[] { var4[0] + var4[0] + -var5[0], var4[1] - var5[1] + var4[1] };
            this.field6081 = new int[] { -var3[0] - (-var2[0] - var2[0]), -var3[1] - (-var2[1] - var2[1]) };
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(B)V", line = 184)
    public static void method2663(byte arg0) {
        if (arg0 > 95) {
            field6087 = null;
            field6084 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lap;BI)V", line = 196)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field6091 = arg0.method1861((byte) -72);
            this.field6085 = new int[arg0.method1861((byte) -72)][2];
            for (int var4 = 0; ~this.field6085.length < ~var4; ++var4) {
                this.field6085[var4][0] = arg0.method1853(105);
                this.field6085[var4][1] = arg0.method1853(104);
            }
        }
        ++field6097;
        int var5 = -106 / ((arg1 - 11) / 52);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 221)
    private final void method2664(int arg0) {
        ++field6086;
        int var2 = this.field6091;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field6085.length + -1 && ~var4 <= ~this.field6085[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field6085[var5 + -1];
                    int[] var7 = this.field6085[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class381.field5351[(8175 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field6082[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field6085.length + -1) && ~this.field6085[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field6085[var14 - 1];
                    int[] var16 = this.field6085[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field6082[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field6085.length + -1) < ~var22 && this.field6085[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field6085[var22 + -1];
                int[] var24 = this.field6085[var22];
                int var25 = this.method2667(-1, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2667(-1, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var37 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field6082[var20] = (short) var38;
            }
        }
        if (arg0 != -5) {
            this.field6082 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZ)V", line = 410)
    public static final void method2665(int arg0, int arg1, boolean arg2) {
        ++field6095;
        class450 var3 = class59.method540(15, 0, 1000);
        var3.method2800(256);
        var3.field6509 = arg0;
        if (arg2) {
            method2666(119, -50);
        }
        var3.field6498 = arg1;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V", line = 426)
    public final void method87(byte arg0) {
        if (this.field6085 == null) {
            this.field6085 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field6089;
        if (arg0 == 77) {
            if (~this.field6085.length > -3) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (this.field6091 == 2) {
                    this.method2662((byte) -55);
                }
                class377.method2347(arg0 ^ -25);
                this.method2664(arg0 + -82);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Lks;", line = 449)
    public static final class167 method2666(int arg0, int arg1) {
        ++field6093;
        class410 var2 = class105.field1538;
        class167 var4;
        synchronized (class105.field1538) {
            if (arg1 != -32769) {
                return null;
            }
            var4 = (class167) class105.field1538.method2537(-43, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else {
            byte[] var5 = class400.field5591.method2633(class89.method788(arg0, (byte) 103), -1, class8.method49(true, arg0));
            class167 var6 = new class167();
            if (var5 != null) {
                var6.method1257(arg1 ^ 45308, new class289(var5));
            }
            class410 var7 = class105.field1538;
            synchronized (class105.field1538) {
                class105.field1538.method2542(var6, (byte) 112, (long) arg0);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[I", line = 477)
    public final int[] method3(int arg0, int arg1) {
        ++field6088;
        int[] var3 = super.field2218.method1614(76, arg0);
        if (super.field2218.field3396) {
            int[] var4 = this.method1119(0, 0, arg0);
            for (int var5 = 0; var5 < class156.field2364; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field6082[var6];
            }
        }
        int var7 = -104 / ((arg1 - 16) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)[I", line = 519)
    private final int[] method2667(int arg0, int arg1) {
        ++field6083;
        if (arg1 < 0) {
            return this.field6081;
        } else if (arg1 >= this.field6085.length) {
            return this.field6079;
        } else {
            if (arg0 != -1) {
                method2665(105, -58, false);
            }
            return this.field6085[arg1];
        }
    }
}
