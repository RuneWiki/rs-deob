import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class102 extends class223 {

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "Lnj;")
    private class317 field1486 = new class317();

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    private int field1480 = this.field3753 + -2;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Lna;")
    public class211 field1470;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "[[I")
    private int[][] field1487;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "[[S")
    public short[][] field1461;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "[[B")
    private byte[][] field1494;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "[[[I")
    private int[][][] field1479;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "[[[I")
    public int[][][] field1466;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "[[F")
    private float[][] field1493;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "[[F")
    private float[][] field1492;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "[[[Loj;")
    private class449[][][] field1456;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "[[[I")
    public int[][][] field1464;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "[[[I")
    private int[][][] field1477;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[[B")
    private byte[][] field1455;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "[[[I")
    private int[][][] field1489;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "[[F")
    private float[][] field1499;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "Lru;")
    private class177 field1490;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "Ltj;")
    private class468 field1482;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field1488 = new String[100];

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "[Lrt;")
    public static class322[] field1484 = new class322[30];

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "Lui;")
    private class383 field1498;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "Ldb;")
    private class67 field1491;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "Ldb;")
    public class67 field1496;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "Ldb;")
    public class67 field1497;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "Ldb;")
    public class67 field1500;

    @OriginalMember(owner = "client!hk", name = "db", descriptor = "[Loj;")
    private class449[] field1502;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "[[[I")
    private int[][][] field1481;

    @OriginalMember(owner = "client!hk", name = "qa", descriptor = "(III)V")
    public final void method684(int arg0, int arg1, int arg2) {
        ++field1471;
        if ((this.field1494[arg0][arg1] & 255) < arg2) {
            this.field1494[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!hk", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final void method685(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1459;
        if (this.field1482 != null && arg0 != null) {
            int var7 = -(this.field1470.field3535 * arg2 >> 8) + arg1 >> this.field1470.field3483;
            int var8 = -(this.field1470.field3578 * arg2 >> 8) + arg3 >> this.field1470.field3483;
            this.field1482.method2921(arg0, var7, var8, 0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method686(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field1462;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method687(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!hk", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method687(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field1481 == null) {
            this.field1481 = new int[super.field3755][super.field3752][];
        }
        if (arg3 != null && this.field1477 == null) {
            this.field1477 = new int[super.field3755][super.field3752][];
        }
        ++field1472;
        this.field1466[arg0][arg1] = arg2;
        this.field1464[arg0][arg1] = arg4;
        this.field1489[arg0][arg1] = arg6;
        this.field1479[arg0][arg1] = arg7;
        if (this.field1481 != null) {
            this.field1481[arg0][arg1] = arg5;
        }
        if (this.field1477 != null) {
            this.field1477[arg0][arg1] = arg3;
        }
        class449[] var15 = this.field1456[arg0][arg1] = new class449[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class529 var19;
            for (var19 = this.field1490.method1122((byte) 59, var17); var19 != null; var19 = this.field1490.method1124((byte) -128)) {
                class449 var20 = (class449) var19;
                if (arg8[var16] == var20.field6964 && (float) arg9[var16] == var20.field6966 && var20.field6959 == arg10 && ~var20.field6963 == ~arg11 && ~var20.field6950 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class449) var19;
            } else {
                var15[var16] = new class449(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field1490.method1127(var15[var16], (byte) 42, var17);
            }
        }
        if (arg13) {
            this.field1455[arg0][arg1] = (byte) class410.method2621(this.field1455[arg0][arg1], 1);
        }
        if (arg6.length > this.field1495) {
            this.field1495 = arg6.length;
        }
        this.field1501 += arg6.length;
    }

    @OriginalMember(owner = "client!hk", name = "ua", descriptor = "(II)I")
    public final int method688(int arg0, int arg1) {
        ++field1476;
        return this.field1487[arg0][arg1];
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III[[ZZ)V")
    public final void method689(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method693(arg1, arg2, arg3, -1, arg4, arg0, (byte) 125);
        ++field1469;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field1457;
        if (~this.field1501 < -1) {
            this.field1470.method1561(-111);
            this.field1470.method1563(1205, false);
            this.field1470.method1504(false, -2414);
            this.field1470.method1572(false, -32);
            this.field1470.method1571(false, (byte) -113);
            this.field1470.method1566((byte) 95, 0);
            this.field1470.method1553(-2, true);
            this.field1470.method1540(49, (class427) null);
            class198.field3048[9] = 0.0F;
            class198.field3048[8] = 0.0F;
            class198.field3048[11] = 0.0F;
            class198.field3048[15] = 1.0F;
            class198.field3048[1] = 0.0F;
            class198.field3048[5] = (float) arg2 / ((float) super.field3754 * 128.0F * (float) this.field1470.field3433);
            class198.field3048[3] = 0.0F;
            class198.field3048[10] = 0.0F;
            class198.field3048[4] = 0.0F;
            class198.field3048[0] = (float) arg2 / ((float) super.field3754 * 128.0F * (float) this.field1470.field3368);
            class198.field3048[6] = 0.0F;
            class198.field3048[7] = 0.0F;
            class198.field3048[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field1470.field3368;
            class198.field3048[2] = 0.0F;
            class198.field3048[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field1470.field3433) + 1.0F;
            class198.field3048[14] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class198.field3048, 0);
            class198.field3048[0] = 1.0F;
            class198.field3048[8] = 0.0F;
            class198.field3048[5] = 0.0F;
            class198.field3048[4] = 0.0F;
            class198.field3048[11] = 0.0F;
            class198.field3048[7] = 0.0F;
            class198.field3048[3] = 0.0F;
            class198.field3048[9] = 1.0F;
            class198.field3048[13] = 0.0F;
            class198.field3048[6] = 1.0F;
            class198.field3048[12] = 0.0F;
            class198.field3048[2] = 0.0F;
            class198.field3048[15] = 1.0F;
            class198.field3048[10] = 0.0F;
            class198.field3048[1] = 0.0F;
            class198.field3048[14] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class198.field3048, 0);
            if (~(this.field1468 & 7) != -1) {
                this.field1470.method1504(true, -2414);
                this.field1470.method1532(-95);
            } else {
                this.field1470.method1504(false, -2414);
            }
            this.field1470.method1548(this.field1491, this.field1500, this.field1496, 32886, this.field1497);
            if (this.field1473 * 2 > this.field1470.field3617.field3193.length) {
                this.field1470.field3617 = new class302(this.field1473 * 2);
            } else {
                this.field1470.field3617.field3162 = 0;
            }
            int var9 = 0;
            class302 var10 = this.field1470.field3617;
            if (!this.field1470.field3560) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field3755 * var11 + arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[var13 - arg3][-arg4 + var11]) {
                            short[] var14 = this.field1461[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    ++var9;
                                    var10.method1467((byte) 23, 65535 & var14[var15]);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field3755 * var16 - -arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][var16 - arg4]) {
                            short[] var20 = this.field1461[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    var10.method1437(var20[var21] & 65535, 0);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class264 var17 = new class264(this.field1470, 5123, var10.field3193, var10.field3162);
                this.field1470.method1537(var17, 0, 0, var9, 4);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static void method691(boolean arg0) {
        field1488 = null;
        field1484 = null;
        if (arg0) {
            field1488 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "ca", descriptor = "(II)I")
    public final int method692(int arg0, int arg1) {
        ++field1454;
        int var3 = arg0 >> super.field3753;
        int var4 = arg1 >> super.field3753;
        if (var3 >= 0 && ~var4 <= -1 && super.field3755 + -1 >= var3 && ~(super.field3752 + -1) <= ~var4) {
            int var5 = super.field3754 - 1 & arg0;
            int var6 = super.field3754 + -1 & arg1;
            int var7 = (-var5 + super.field3754) * this.field1487[var3][var4] + this.field1487[var3 - -1][var4] * var5 >> super.field3753;
            int var8 = (-var5 + super.field3754) * this.field1487[var3][var4 - -1] + this.field1487[var3 - -1][var4 - -1] * var5 >> super.field3753;
            return (super.field3754 - var6) * var7 + var6 * var8 >> super.field3753;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[[ZIZIB)V")
    private final void method693(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        if (this.field1502 != null) {
            float var8 = this.field1470.field3510;
            float var9 = this.field1470.field3530;
            int var10 = arg1 + arg1 + 1;
            int var11 = var10 * var10;
            if (this.field1470.field3621.length < var11) {
                this.field1470.field3621 = new int[var11];
            }
            if (this.field1473 * 2 > this.field1470.field3617.field3193.length) {
                this.field1470.field3617 = new class302(this.field1473 * 2);
            }
            int var12 = -arg1 + arg5;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg1 + arg0;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg5 - -arg1;
            if (~var16 < ~(super.field3755 + -1)) {
                var16 = super.field3755 + -1;
            }
            int var17 = arg0 - -arg1;
            if (super.field3752 - 1 < var17) {
                var17 = super.field3752 - 1;
            }
            int var18 = 0;
            int[] var19 = this.field1470.field3621;
            for (int var20 = var12; var16 >= var20; ++var20) {
                boolean[] var26 = arg2[-var13 + var20];
                for (int var27 = var14; var17 >= var27; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field3755 * var27 + var20;
                    }
                }
            }
            if (~arg3 == 0) {
                this.field1470.method1559(-15631);
            } else {
                this.field1470.method1557((float) arg3, 125);
                this.field1470.method1542(16);
            }
            this.field1470.method1504((7 & this.field1468) != 0, -2414);
            for (int var21 = 0; var21 < this.field1502.length; ++var21) {
                this.field1502[var21].method2829((byte) 78, var18, var19);
            }
            if (!this.field1486.method2122(-12191)) {
                int var22 = this.field1470.field3508;
                int var23 = this.field1470.field3563;
                this.field1470.method1297(0, var23, this.field1470.field3564);
                this.field1470.method1309(var9, var8 - 4.0F);
                this.field1470.method1504(false, -2414);
                this.field1470.method1571(false, (byte) -113);
                this.field1470.method1566((byte) 95, 128);
                this.field1470.method1553(-2, true);
                this.field1470.method1540(120, this.field1470.field3532);
                this.field1470.method1568(7681, 2896, 8448);
                this.field1470.method1498(34192, 0, 34166, 770);
                this.field1470.method1539(0, 34167, 770, (byte) 120);
                for (class529 var24 = this.field1486.method2123(-98); var24 != null; var24 = this.field1486.method2126((byte) 61)) {
                    class365 var25 = (class365) var24;
                    var25.method2399(arg0, arg2, arg5, -68, arg1);
                }
                this.field1470.method1498(34192, 0, 5890, 768);
                this.field1470.method1539(0, 5890, 770, (byte) 117);
                this.field1470.method1540(46, (class427) null);
                this.field1470.method1297(var22, var23, this.field1470.field3564);
            }
            if (this.field1482 != null) {
                this.field1470.method1309(var9, var8 - 8.0F);
                this.field1470.method1559(-15631);
                this.field1470.method1548((class67) null, this.field1500, this.field1496, 32886, (class67) null);
                this.field1482.method2920(arg0, true, arg4, arg1, arg5, arg2);
            }
            this.field1470.method1309(var9, var8);
        }
        if (arg6 < 106) {
            this.field1464 = null;
        }
        ++field1478;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Las;[I)V")
    public final void method694(class415 arg0, int[] arg1) {
        ++field1458;
        this.field1486.method2124(new class365(this.field1470, this, arg0, arg1), (byte) 117);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lrr;III)V")
    private final void method695(class283 arg0, int arg1, int arg2, int arg3) {
        ++field1463;
        int[] var5 = this.field1466[arg2][arg3];
        int[] var6 = this.field1464[arg2][arg3];
        int var7 = var5.length;
        if (~var7 < ~this.field1470.field3625.length) {
            this.field1470.field3623 = new int[var7];
            this.field1470.field3625 = new int[var7];
        }
        int[] var8 = this.field1470.field3625;
        int[] var9 = this.field1470.field3623;
        if (arg1 <= 67) {
            this.field1479 = null;
        }
        for (int var10 = 0; var10 < var7; ++var10) {
            var8[var10] = class272.method1842(255, var5[var10]) >> this.field1470.field3483;
            var9[var10] = class272.method1842(var6[var10], 255) >> this.field1470.field3483;
        }
        int var11 = 0;
        while (~var11 > ~var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((var15 - var17) * (-var14 + var12) - (var16 - var14) * (-var13 + var15)) < -1) {
                arg0.method1904(var13, var16, var17, var14, -98, var12, var15);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method696(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1485;
        if (this.field1482 != null && arg0 != null) {
            int var7 = arg1 - (this.field1470.field3535 * arg2 >> 8) >> this.field1470.field3483;
            int var8 = -(this.field1470.field3578 * arg2 >> 8) + arg3 >> this.field1470.field3483;
            return this.field1482.method2922(var8, var7, arg0, (byte) -117);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "OA", descriptor = "(IILi;)Li;")
    public final class521 method697(int arg0, int arg1, class521 arg2) {
        ++field1465;
        if (~(1 & this.field1455[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field3754 >> this.field1470.field3483;
            class283 var5 = (class283) arg2;
            class283 var6;
            if (var5 != null && var5.method1901(var4, 298126800, var4)) {
                var6 = var5;
                var5.method1902((byte) 0);
            } else {
                var6 = new class283(this.field1470, var4, var4);
            }
            var6.method1903(0, var4, var4, -2048629008, 0);
            this.method695(var6, 122, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "(Li;IIIIZ)V")
    public final void method698(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1467;
        if (this.field1482 != null && arg0 != null) {
            int var7 = -(this.field1470.field3535 * arg2 >> 8) + arg1 >> this.field1470.field3483;
            int var8 = -(this.field1470.field3578 * arg2 >> 8) + arg3 >> this.field1470.field3483;
            this.field1482.method2916((byte) -39, arg0, var8, var7);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
    public final void method699(int arg0, int arg1) {
        ++field1460;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lna;IIII[[I[[II)V")
    public class102(class211 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field1470 = arg0;
        this.field1487 = arg5;
        this.field1461 = new short[arg3 * arg4][];
        this.field1494 = new byte[arg3 - -1][arg4 + 1];
        this.field1479 = new int[arg3][arg4][];
        this.field1466 = new int[arg3][arg4][];
        this.field1493 = new float[super.field3755 + 1][super.field3752 + 1];
        this.field1492 = new float[super.field3755 + 1][super.field3752 - -1];
        this.field1456 = new class449[arg3][arg4][];
        this.field1464 = new int[arg3][arg4][];
        this.field1477 = new int[arg3][arg4][];
        this.field1455 = new byte[arg3][arg4];
        this.field1489 = new int[arg3][arg4][];
        this.field1468 = arg2;
        this.field1483 = 1 << this.field1480;
        this.field1499 = new float[super.field3755 + 1][super.field3752 + 1];
        for (int var9 = 1; var9 < super.field3752; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field3755; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var11 * var11 - -(var12 * var12))));
                this.field1499[var10][var9] = (float) var11 * var13;
                this.field1493[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field1492[var10][var9] = (float) var12 * var13;
            }
        }
        this.field1490 = new class177(128);
        if (~(16 & this.field1468) != -1) {
            this.field1482 = new class468(this.field1470, this);
        }
    }

    @OriginalMember(owner = "client!hk", name = "aa", descriptor = "()V")
    public final void method700() {
        ++field1474;
        if (this.field1501 <= 0) {
            this.field1482 = null;
        } else {
            byte[][] var1 = new byte[super.field3755 + 1][super.field3752 - -1];
            for (int var2 = 1; super.field3755 > var2; ++var2) {
                for (int var103 = 1; ~super.field3752 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field1494[var2][var103] >> 1) + (this.field1494[var2][var103 - -1] >> 3) + (this.field1494[var2 + 1][var103] >> 3) + (this.field1494[var2][var103 + -1] >> 2) + (this.field1494[var2 - 1][var103] >> 2));
                }
            }
            this.field1502 = new class449[this.field1490.method1126(24946)];
            this.field1490.method1120(this.field1502, 0);
            for (int var3 = 0; var3 < this.field1502.length; ++var3) {
                this.field1502[var3].method2831(this.field1501, 75);
            }
            int var4 = 24;
            if (this.field1481 != null) {
                var4 += 4;
            }
            if ((7 & this.field1468) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field1470.field3480.method121(this.field1501 * var4);
            NativeStream var6 = new NativeStream(var5);
            class449[] var7 = new class449[this.field1501];
            int var8 = class340.method2258(this.field1501 / 4, (byte) -114);
            if (var8 < 1) {
                var8 = 1;
            }
            class177 var9 = new class177(var8);
            class449[] var10 = new class449[this.field1495];
            for (int var11 = 0; ~super.field3755 < ~var11; ++var11) {
                for (int var30 = 0; var30 < super.field3752; ++var30) {
                    if (this.field1489[var11][var30] != null) {
                        class449[] var31 = this.field1456[var11][var30];
                        int[] var32 = this.field1466[var11][var30];
                        int[] var33 = this.field1464[var11][var30];
                        int[] var34 = this.field1479[var11][var30];
                        int[] var35 = this.field1489[var11][var30];
                        int[] var36 = this.field1477 != null ? this.field1477[var11][var30] : null;
                        int[] var37 = this.field1481 == null ? null : this.field1481[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field1499[var11][var30];
                        float var39 = this.field1493[var11][var30];
                        float var40 = this.field1492[var11][var30];
                        float var41 = this.field1499[var11][var30 - -1];
                        float var42 = this.field1493[var11][var30 + 1];
                        float var43 = this.field1492[var11][var30 + 1];
                        float var44 = this.field1499[var11 + 1][var30 + 1];
                        float var45 = this.field1493[var11 - -1][var30 + 1];
                        float var46 = this.field1492[var11 - -1][var30 + 1];
                        float var47 = this.field1499[var11 + 1][var30];
                        float var48 = this.field1493[var11 + 1][var30];
                        float var49 = this.field1492[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = 255 & var1[var11 + 1][var30 - -1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label340: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class449 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label340;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field1461[super.field3755 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field3753) + var32[var57];
                            int var59 = (var30 << super.field3753) - -var33[var57];
                            int var60 = var58 >> this.field1480;
                            int var61 = var59 >> this.field1480;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16);
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            int var72;
                            float var73;
                            float var74;
                            float var75;
                            if (~var67 == -1 && var68 == 0) {
                                var72 = var69 - var50;
                                var73 = var40;
                                var74 = var39;
                                var75 = var38;
                            } else if (~var67 == -1 && super.field3754 == var68) {
                                var72 = var69 - var51;
                                var74 = var42;
                                var75 = var41;
                                var73 = var43;
                            } else if (super.field3754 == var67 && ~super.field3754 == ~var68) {
                                var72 = var69 - var52;
                                var73 = var46;
                                var75 = var44;
                                var74 = var45;
                            } else if (super.field3754 == var67 && var68 == 0) {
                                var73 = var49;
                                var74 = var48;
                                var72 = var69 - var53;
                                var75 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field3754;
                                float var77 = (float) var68 / (float) super.field3754;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var75 = (-var78 + var81) * var77 + var78;
                                var74 = (var82 - var79) * var77 + var79;
                                float var83 = (var46 - var43) * var76 + var43;
                                var73 = (var83 - var80) * var77 + var80;
                                int var84 = ((var53 - var50) * var67 >> super.field3753) + var50;
                                int var85 = ((var52 - var51) * var67 >> super.field3753) + var51;
                                var72 = var69 - (((-var84 + var85) * var68 >> super.field3753) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var72 >> 7;
                                if (~var86 <= -3) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class301.field4730[var86 | var62 & 65408];
                                if (~(this.field1468 & 7) == -1) {
                                    float var87 = this.field1470.field3572[2] * var73 + this.field1470.field3572[1] * var74 + this.field1470.field3572[0] * var75;
                                    var71 = this.field1470.field3613 + var87 * (var87 > 0.0F ? this.field1470.field3598 : this.field1470.field3558);
                                }
                            }
                            class529 var88 = null;
                            if (~(var58 & this.field1483 + -1) == -1 && (var59 & this.field1483 + -1) == 0) {
                                var88 = var9.method1122((byte) 59, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class79) var88).field1183;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && ~var31[var57].field7780 > ~var7[var89].field7780) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (var62 != var63) {
                                    int var90 = (var63 & 127) * var72 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var91 = class301.field4730[var63 & 65408 | var90];
                                    if ((this.field1468 & 7) == 0) {
                                        float var92 = this.field1470.field3572[2] * var73 + this.field1470.field3572[0] * var75 + this.field1470.field3572[1] * var74;
                                        float var93 = (!(var71 > 0.0F) ? this.field1470.field3558 : this.field1470.field3598) * var71 + this.field1470.field3613;
                                        int var94 = (16732774 & var91) >> 16;
                                        int var95 = 255 & var91 >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = 255 & var91;
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var96 >= 0) {
                                            if (var96 > 255) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        int var99 = (int) ((float) var97 * var93);
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        if (~var99 <= -1) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var91 = var99 | var96 << 16 | var98 << 8;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (!this.field1470.field3560) {
                                    var6.method118((float) var58);
                                    var6.method118((float) (this.method692(var58, var59) + var64));
                                    var6.method118((float) var59);
                                    var6.method119((byte) (var91 >> 16));
                                    var6.method119((byte) (var91 >> 8));
                                    var6.method119((byte) var91);
                                    var6.method119(-1);
                                    var6.method118((float) var58);
                                    var6.method118((float) var59);
                                    if (this.field1481 != null) {
                                        var6.method118((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(this.field1468 & 7) != -1) {
                                        var6.method118(var75);
                                        var6.method118(var74);
                                        var6.method118(var73);
                                    }
                                } else {
                                    var6.method116((float) var58);
                                    var6.method116((float) (var64 + this.method692(var58, var59)));
                                    var6.method116((float) var59);
                                    var6.method119((byte) (var91 >> 16));
                                    var6.method119((byte) (var91 >> 8));
                                    var6.method119((byte) var91);
                                    var6.method119(-1);
                                    var6.method116((float) var58);
                                    var6.method116((float) var59);
                                    if (this.field1481 != null) {
                                        var6.method116((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field1468) != -1) {
                                        var6.method116(var75);
                                        var6.method116(var74);
                                        var6.method116(var73);
                                    }
                                }
                                var89 = this.field1475++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1127(new class79(var56[var57]), (byte) 88, var65);
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method2825(var89, var71, var70, var72, false);
                            }
                            ++this.field1473;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field1475; ++var12) {
                class449 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2832(var12, 103);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field3755; ++var13) {
                for (int var18 = 0; super.field3752 > var18; ++var18) {
                    short[] var19 = this.field1461[super.field3755 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class449 var25 = var7[var22];
                            class449 var26 = var7[var23];
                            class449 var27 = var7[var24];
                            class449 var28 = null;
                            if (var25 != null) {
                                var25.method2824(var20, (byte) 97, var13, var18);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method2824(var20, (byte) 97, var13, var18);
                                if (var28 == null || ~var28.field7780 < ~var26.field7780) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2824(var20, (byte) 97, var13, var18);
                                if (var28 == null || var27.field7780 < var28.field7780) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2832(var22, 68);
                                }
                                if (var26 != null) {
                                    var28.method2832(var23, 114);
                                }
                                if (var27 != null) {
                                    var28.method2832(var24, 86);
                                }
                                var28.method2824(var20, (byte) 97, var13, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method115();
            this.field1498 = this.field1470.method1502(var6.method120(), false, var5, var4, -3875);
            this.field1500 = new class67(this.field1498, 5126, 3, 0);
            this.field1491 = new class67(this.field1498, 5121, 4, 12);
            byte var14;
            if (this.field1481 != null) {
                this.field1496 = new class67(this.field1498, 5126, 3, 16);
                var14 = 28;
            } else {
                this.field1496 = new class67(this.field1498, 5126, 2, 16);
                var14 = 24;
            }
            if ((this.field1468 & 7) != 0) {
                this.field1497 = new class67(this.field1498, 5126, 3, var14);
            }
            long[] var15 = new long[this.field1502.length];
            for (int var16 = 0; ~var16 > ~this.field1502.length; ++var16) {
                class449 var17 = this.field1502[var16];
                var15[var16] = var17.field7780;
                var17.method2827(this.field1475, (byte) 127);
            }
            class172.method1083(var15, 25437, this.field1502);
            if (this.field1482 != null) {
                this.field1482.method2917(0);
            }
        }
        this.field1466 = this.field1464 = null;
        this.field1494 = null;
        this.field1477 = null;
        this.field1479 = null;
        this.field1456 = null;
        this.field1499 = this.field1493 = this.field1492 = null;
        this.field1490 = null;
        this.field1481 = null;
        this.field1489 = null;
    }
}
