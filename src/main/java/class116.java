import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class116 extends class223 {

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    private int field1769 = 32768;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1775 = "";

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "[Lgk;")
    public static class161[] field1781 = new class161[32768];

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "[I")
    public static int[] field1768;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "[[[B")
    public static byte[][][] field1773;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIIIB)V")
    public static final void method851(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field1776;
        if (arg4 != -72) {
            field1781 = null;
        }
        if (class48.method401(105, arg2)) {
            class109.method815(arg3, class8.field144[arg2], arg0, -1, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        int[] var3 = super.field3588.method1611(0, arg1);
        if (arg0 <= 14) {
            field1768 = null;
        }
        ++field1778;
        if (super.field3588.field3722) {
            int[] var4 = this.method1533(1, arg1, -102);
            int[] var5 = this.method1533(2, arg1, -89);
            for (int var6 = 0; class250.field4008 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field1769 >> 12;
                int var9 = class214.field3290[var7] * var8 >> 12;
                int var10 = class222.field3571[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class280.field4430;
                int var12 = arg1 - -(var10 >> 12) & class75.field1168;
                int[] var13 = this.method1533(0, var12, -64);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)V")
    public static void method852(int arg0) {
        if (arg0 == 0) {
            field1775 = null;
            field1781 = null;
            field1768 = null;
            field1773 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method853(byte arg0, String arg1) {
        ++field1774;
        if (arg0 != 82) {
            method853((byte) -43, (String) null);
        }
        int var2 = class37.method346(arg1, (byte) -39);
        if (~var2 != 0) {
            int[] var3 = class92.field1467.method2033((268428147 & class183.field2895.field4796[var2]) >> 14, 0, class183.field2895.field4796[var2] & 16383, (class183.field2895.field4796[var2] & 941420767) >> 28);
            class61.method496(var3[1], var3[2], -56);
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field1777;
        class298.method2000((byte) -101);
        if (arg0 != 500) {
            method854(97, (class92) null);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILub;)V")
    public static final void method854(int arg0, class92 arg1) {
        class121.field1823 = arg1;
        if (arg0 == 3) {
            class200.field3097 = class121.field1823.method700((byte) -106, 4);
            ++field1770;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field1772;
        if (arg0 < 0) {
            this.method135(-43, 74);
        }
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int[] var4 = this.method1533(1, arg1, -62);
            int[] var5 = this.method1533(2, arg1, -64);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class250.field4008; ++var9) {
                int var10 = var5[var9] * this.field1769 >> 12;
                int var11 = (var4[var9] * 255 & 1044705) >> 12;
                int var12 = class214.field3290[var11] * var10 >> 12;
                int var13 = class222.field3571[var11] * var10 >> 12;
                int var14 = (var13 >> 12) + arg1 & class75.field1168;
                int var15 = class280.field4430 & (var12 >> 12) + var9;
                int[][] var16 = this.method1534(false, 0, var14);
                var7[var9] = var16[0][var15];
                var6[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLvd;)V")
    public static final void method855(boolean arg0, class4 arg1) {
        class245 var2 = null;
        class150.field2228 = 3;
        ++field1771;
        class129.method958(0, true);
        class70.field1106 = 127;
        class94.field1483 = 0;
        class292.field4536 = true;
        class52.field825 = 0;
        class296.field4688 = 0;
        class142.field2111 = true;
        class178.field2730 = true;
        client.field2386 = 2;
        class174.field2684 = 127;
        class106.field1665 = true;
        class216.field3309 = true;
        class201.field3105 = true;
        class189.field2971 = true;
        class40.field678 = true;
        class164.field2472 = 0;
        class109.field1685 = true;
        class218.field3335 = true;
        class140.field2089 = true;
        class85.field1274 = 255;
        if (class49.field805 < 96) {
            class249.method1684(0);
        } else {
            class249.method1684(2);
        }
        class57.field897 = arg0;
        class189.field2972 = false;
        class58.field904 = false;
        class230.field3648 = true;
        class84.field1259 = 0;
        class48.field793 = 0;
        class42.field709 = 0;
        try {
            class139 var3 = arg1.method24((byte) -91, "runescape");
            while (var3.field2082 == 0) {
                class122.method922(1L, (byte) -98);
            }
            if (var3.field2082 == 1) {
                var2 = (class245) var3.field2080;
                byte[] var4 = new byte[(int) var2.method1660((byte) -108)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method1665(90, var4, var4.length + -var5, var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class237.method1619(-108, new class31(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1663(1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            method856(-102, 3, 54, -113, -68, 104);
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field3583 = ~arg0.method265(-95) == -2;
            }
        } else {
            this.field1769 = arg0.method260((byte) -67) << 4;
        }
        ++field1767;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class116() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V")
    public static final void method856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1780;
        int var6 = -arg5 + arg2;
        int var7 = -arg0 + arg3;
        if (~var6 != -1) {
            if (~var7 == -1) {
                class257.method1736((byte) 69, arg1, arg5, arg2, arg0);
            } else if (arg4 < -83) {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg5 * var8 >> 12) + arg0;
                int var10;
                int var11;
                if (arg5 < class184.field2914) {
                    var10 = (class184.field2914 * var8 >> 12) + var9;
                    var11 = class184.field2914;
                } else if (class2.field42 >= arg5) {
                    var11 = arg5;
                    var10 = arg0;
                } else {
                    var10 = (class2.field42 * var8 >> 12) + var9;
                    var11 = class2.field42;
                }
                int var12;
                int var13;
                if (~class184.field2914 < ~arg2) {
                    var12 = var9 - -(class184.field2914 * var8 >> 12);
                    var13 = class184.field2914;
                } else if (class2.field42 < arg2) {
                    var12 = (class2.field42 * var8 >> 12) + var9;
                    var13 = class2.field42;
                } else {
                    var13 = arg2;
                    var12 = arg3;
                }
                if (var10 < class112.field1727) {
                    var11 = (-var9 + class112.field1727 << 12) / var8;
                    var10 = class112.field1727;
                } else if (~var10 < ~class278.field4410) {
                    var10 = class278.field4410;
                    var11 = (-var9 + class278.field4410 << 12) / var8;
                }
                if (~class112.field1727 < ~var12) {
                    var13 = (-var9 + class112.field1727 << 12) / var8;
                    var12 = class112.field1727;
                } else if (~var12 < ~class278.field4410) {
                    var12 = class278.field4410;
                    var13 = (-var9 + class278.field4410 << 12) / var8;
                }
                class18.method133(var13, arg1, 65, var12, var10, var11);
            }
        } else {
            if (var7 != 0) {
                class36.method338((byte) 125, arg3, arg1, arg5, arg0);
            }
        }
    }
}
