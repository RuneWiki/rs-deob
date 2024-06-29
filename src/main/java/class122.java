import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class122 extends class430 {

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "Lmt;")
    private class410 field1672;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "Lwh;")
    private class40 field1675;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lkw;")
    private class346 field1652;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    private int field1662;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    private int field1655;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "[[F")
    private float[][] field1663;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "[[F")
    private float[][] field1676;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "[[F")
    private float[][] field1677;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lsl;")
    private class479 field1657;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lag;")
    private class212 field1661;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Lqp;")
    private class715 field1671;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Llo;")
    private class116 field1666;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "Llca;")
    private class52 field1658;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "Ljaa;")
    private class745 field1673;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Ljaa;")
    private class745 field1665;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field1659 = 0;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Llc;")
    public static class435 field1660 = new class435(49, 8);

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    private int field1667;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BS)V", line = 3)
    private final void method861(byte arg0, short arg1) {
        if (this.field1652.field5047) {
            this.field1657.method2862(arg1, -1166933656);
        } else {
            this.field1657.method2918(arg1, (byte) 120);
        }
        if (arg0 != -1) {
            this.field1662 = 28;
        }
        field1654++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIII)V", line = 21)
    private final void method862(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1668++;
        long var8 = -1L;
        int var10 = (arg5 << this.field1672.field4674) + arg2;
        int var11 = arg6 + (arg4 << this.field1672.field4674);
        int var12 = this.field1672.method2089(26448, var10, var11);
        if ((arg2 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class430 var13 = this.field1671.method4020(var8, (byte) -123);
            if (var13 != null) {
                this.method861((byte) -1, ((class219) var13).field3265);
                return;
            }
        }
        short var14 = (short) (this.field1667++);
        if (var8 != -1L) {
            this.field1671.method4022(new class219(var14), -107, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg6 == 0) {
            var15 = this.field1663[arg3][arg1];
            var16 = this.field1676[arg3][arg1];
            var17 = this.field1677[arg3][arg1];
        } else if (this.field1672.field4675 == arg2 && arg6 == 0) {
            var17 = this.field1677[arg3 + 1][arg1];
            var16 = this.field1676[arg3 + 1][arg1];
            var15 = this.field1663[arg3 + 1][arg1];
        } else if (this.field1672.field4675 == arg2 && this.field1672.field4675 == arg6) {
            var15 = this.field1663[arg3 + 1][arg1 + 1];
            var17 = this.field1677[arg3 + 1][arg1 + 1];
            var16 = this.field1676[arg3 + 1][arg1 + 1];
        } else if (arg2 == 0 && this.field1672.field4675 == arg6) {
            var15 = this.field1663[arg3][arg1 + 1];
            var17 = this.field1677[arg3][arg1 + 1];
            var16 = this.field1676[arg3][arg1 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field1672.field4675;
            float var19 = (float) arg6 / (float) this.field1672.field4675;
            float var20 = this.field1677[arg3][arg1];
            float var21 = this.field1663[arg3][arg1];
            float var22 = this.field1676[arg3][arg1];
            float var23 = this.field1677[arg3 + 1][arg1];
            float var24 = this.field1663[arg3 + 1][arg1];
            float var25 = (this.field1677[arg3 + 1][arg1 + 1] - var23) * var18 + var23;
            float var26 = (this.field1676[arg3][arg1 + 1] - var22) * var18 + var22;
            float var27 = this.field1676[arg3 + 1][arg1];
            float var28 = (this.field1663[arg3][arg1 + 1] - var21) * var18 + var21;
            float var29 = (this.field1663[arg3 + 1][arg1 + 1] - var24) * var18 + var24;
            float var30 = (this.field1677[arg3][arg1 + 1] - var20) * var18 + var20;
            var17 = (var25 - var30) * var19 + var30;
            var15 = (var29 - var28) * var19 + var28;
            float var31 = (this.field1676[arg3 + 1][arg1 + 1] - var27) * var18 + var27;
            var16 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field1675.method422((byte) -71) - var10);
        float var33 = (float) (this.field1675.method421(118) - var12);
        float var34 = (float) (this.field1675.method427(-1) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field1675.method425((byte) 101);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > (float) arg0) {
            var43 = 1.0F;
        }
        int var44 = this.field1675.method420(-1);
        int var45 = (int) ((float) ((var44 & 0xFF4C2C) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field1652.field5047) {
            this.field1661.method1502((float) var10, (byte) 111);
            this.field1661.method1502((float) var12, (byte) 123);
            this.field1661.method1502((float) var11, (byte) 102);
        } else {
            this.field1661.method1501((float) var10, (byte) -76);
            this.field1661.method1501((float) var12, (byte) -51);
            this.field1661.method1501((float) var11, (byte) -98);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field1661.method2881(var45, (byte) 123);
        this.field1661.method2881(var46, (byte) 109);
        this.field1661.method2881(var47, (byte) 111);
        this.field1661.method2881(255, (byte) 124);
        this.method861((byte) -1, var14);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 188)
    public static void method863(byte arg0) {
        int var1 = -120 / ((23 - arg0) / 62);
        field1660 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lsl;B)V", line = 214)
    public static final void method864(class479 arg0, byte arg1) {
        field1653++;
        if (arg1 != 127) {
            return;
        }
        for (int var2 = 0; var2 < class243.field3581; var2++) {
            int var3 = arg0.method2889(arg1 ^ 0xFFFFB931);
            int var4 = arg0.method2882(-1);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class142.field1940[var3] != null) {
                class142.field1940[var3].field4068 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 243)
    public static final Class method865(String arg0, int arg1) throws ClassNotFoundException {
        field1669++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else if (arg1 == 22428) {
            return Class.forName(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZI[[Z)V", line = 283)
    public final void method866(int arg0, int arg1, boolean arg2, int arg3, boolean[][] arg4) {
        field1664++;
        if (this.field1666 == null || this.field1670 > arg0 + arg3 || this.field1662 < (arg0 - arg3) || arg1 + arg3 < this.field1674 || arg1 - arg3 > this.field1655) {
            return;
        }
        if (!arg2) {
            this.method866(124, -126, true, 9, null);
        }
        for (int var6 = this.field1674; var6 <= this.field1655; var6++) {
            for (int var7 = this.field1670; var7 <= this.field1662; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg1;
                if (var8 > (-arg3) && var8 < arg3 && var9 > (-arg3) && var9 < arg3 && arg4[arg3 + var8][arg3 + var9]) {
                    this.field1652.method2123((int) (this.field1675.method429(-1) * 255.0F) << 24, 2);
                    this.field1652.method2134(this.field1673, this.field1665, null, null, 32888);
                    this.field1652.method2135(4, this.field1666, 0, this.field1656, -74);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lkw;Lmt;Lwh;[I)V", line = 348)
    public class122(class346 arg0, class410 arg1, class40 arg2, int[] arg3) {
        this.field1672 = arg1;
        this.field1675 = arg2;
        this.field1652 = arg0;
        int var5 = this.field1675.method425((byte) 82) - (arg1.field4675 >> 1);
        this.field1670 = this.field1675.method422((byte) -81) - var5 >> arg1.field4674;
        this.field1662 = this.field1675.method422((byte) -95) + var5 >> arg1.field4674;
        this.field1674 = this.field1675.method427(-1) - var5 >> arg1.field4674;
        this.field1655 = this.field1675.method427(-1) + var5 >> arg1.field4674;
        int var6 = this.field1662 + 1 - this.field1670;
        int var7 = this.field1655 + 1 - this.field1674;
        this.field1663 = new float[var6 + 1][var7 + 1];
        this.field1676 = new float[var6 + 1][var7 + 1];
        this.field1677 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = var8 + this.field1674;
            if (var25 > 0 && var25 < this.field1672.field4672 - 1) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field1670 + var26;
                    if (var27 > 0 && (this.field1672.field4679 - 1) > var27) {
                        int var28 = arg1.method2087(77, var27 + 1, var25) - arg1.method2087(127, var27 - 1, var25);
                        int var29 = arg1.method2087(78, var27, var25 + 1) - arg1.method2087(59, var27, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + (var29 * var29) + 65536)));
                        this.field1677[var26][var8] = (float) var28 * var30;
                        this.field1663[var26][var8] = var30 * -256.0F;
                        this.field1676[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field1674; var10 <= this.field1655; var10++) {
            if (var10 >= 0 && var10 < arg1.field4672) {
                for (int var21 = this.field1670; var21 <= this.field1662; var21++) {
                    if (var21 >= 0 && var21 < arg1.field4679) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field5826[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field1656 += 3;
                                    }
                                }
                            } else {
                                this.field1656 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field1662 - this.field1670;
            }
        }
        if (this.field1656 > 0) {
            this.field1657 = new class479(this.field1656 * 2);
            this.field1661 = new class212(this.field1656 * 16);
            this.field1671 = new class715(class68.method609(this.field1656, (byte) 0));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field1674; var13 <= this.field1655; var13++) {
                if (var13 >= 0 && arg1.field4672 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field1670; var15 <= this.field1662; var15++) {
                        if (var15 >= 0 && var15 < arg1.field4679) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field5826[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field5820[var15][var13];
                                    int[] var19 = arg1.field5821[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method862(1, var12, var18[var20], var14, var13, var15, var19[var20]);
                                                var20++;
                                                this.method862(1, var12, var18[var20], var14, var13, var15, var19[var20]);
                                                var20++;
                                                this.method862(1, var12, var18[var20], var14, var13, var15, var19[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method862(1, var12, 0, var14, var13, var15, 0);
                                    this.method862(1, var12, arg1.field4675, var14, var13, var15, 0);
                                    this.method862(1, var12, 0, var14, var13, var15, arg1.field4675);
                                } else if (var16 == 2) {
                                    this.method862(1, var12, arg1.field4675, var14, var13, var15, 0);
                                    this.method862(1, var12, arg1.field4675, var14, var13, var15, arg1.field4675);
                                    this.method862(1, var12, 0, var14, var13, var15, 0);
                                } else if (var16 == 5) {
                                    this.method862(1, var12, arg1.field4675, var14, var13, var15, arg1.field4675);
                                    this.method862(1, var12, 0, var14, var13, var15, arg1.field4675);
                                    this.method862(1, var12, arg1.field4675, var14, var13, var15, 0);
                                } else if (var16 == 4) {
                                    this.method862(1, var12, 0, var14, var13, var15, arg1.field4675);
                                    this.method862(1, var12, 0, var14, var13, var15, 0);
                                    this.method862(1, var12, arg1.field4675, var14, var13, var15, arg1.field4675);
                                }
                            }
                        }
                        var14++;
                        var11++;
                    }
                } else {
                    var11 += this.field1662 - this.field1670;
                }
                var12++;
            }
            this.field1666 = this.field1652.method2139(true, 5123, this.field1657.field6864, false, this.field1657.field6800);
            this.field1658 = this.field1652.method2178(false, this.field1661.field6864, this.field1661.field6800, 16, true);
            this.field1673 = new class745(this.field1658, 5126, 3, 0);
            this.field1665 = new class745(this.field1658, 5121, 4, 12);
        } else {
            this.field1673 = null;
            this.field1658 = null;
            this.field1665 = null;
            this.field1666 = null;
        }
        this.field1661 = null;
        this.field1671 = null;
        this.field1657 = null;
        this.field1677 = this.field1663 = this.field1676 = null;
    }
}
