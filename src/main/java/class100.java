import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class100 extends class176 {

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    private int field1790 = 0;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "B")
    private byte field1803 = 0;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "B")
    private byte field1814 = 0;

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "Z")
    public boolean field1825 = false;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    private int field1816 = 0;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    public int field1820 = 0;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "[I")
    private int[] field1808;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "[I")
    public int[] field1794;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "[I")
    public int[] field1817;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "[I")
    public int[] field1801;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "[I")
    private int[] field1819;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "[S")
    private short[] field1822;

    @OriginalMember(owner = "client!sk", name = "fb", descriptor = "[S")
    private short[] field1830;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "[S")
    private short[] field1810;

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "[S")
    private short[] field1823;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "[F")
    private float[] field1793;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "[F")
    private float[] field1802;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "[S")
    private short[] field1799;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "[B")
    private byte[] field1792;

    @OriginalMember(owner = "client!sk", name = "eb", descriptor = "[S")
    private short[] field1829;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "[S")
    private short[] field1795;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "[S")
    private short[] field1800;

    @OriginalMember(owner = "client!sk", name = "bb", descriptor = "[S")
    private short[] field1826;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "[B")
    private byte[] field1806;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "Lri;")
    public class227 field1821;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "Lsd;")
    public class214 field1815;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "Lsd;")
    private class214 field1807;

    @OriginalMember(owner = "client!sk", name = "db", descriptor = "Lsd;")
    private class214 field1828;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "Lsd;")
    private class214 field1818;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "Lsd;")
    private class214 field1809;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "S")
    private short field1791;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "S")
    private short field1797;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "[S")
    private short[] field1813;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "[I")
    private int[] field1812;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "Lb;")
    private static class94 field1796 = new class94(10000);

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "Lsk;")
    private static class100 field1811 = new class100();

    @OriginalMember(owner = "client!sk", name = "hb", descriptor = "Lsk;")
    private static class100 field1832 = new class100();

    @OriginalMember(owner = "client!sk", name = "ib", descriptor = "Lsk;")
    private static class100 field1833 = new class100();

    @OriginalMember(owner = "client!sk", name = "jb", descriptor = "Lsk;")
    private static class100 field1834 = new class100();

    @OriginalMember(owner = "client!sk", name = "ob", descriptor = "[I")
    private static int[] field1839 = new int[1];

    @OriginalMember(owner = "client!sk", name = "sb", descriptor = "[I")
    private static int[] field1843 = new int[1];

    @OriginalMember(owner = "client!sk", name = "lb", descriptor = "F")
    private static float field1836;

    @OriginalMember(owner = "client!sk", name = "mb", descriptor = "F")
    private static float field1837;

    @OriginalMember(owner = "client!sk", name = "qb", descriptor = "F")
    private static float field1841;

    @OriginalMember(owner = "client!sk", name = "rb", descriptor = "F")
    private static float field1842;

    @OriginalMember(owner = "client!sk", name = "tb", descriptor = "F")
    private static float field1844;

    @OriginalMember(owner = "client!sk", name = "ub", descriptor = "F")
    private static float field1845;

    @OriginalMember(owner = "client!sk", name = "kb", descriptor = "I")
    private static int field1835;

    @OriginalMember(owner = "client!sk", name = "nb", descriptor = "I")
    private static int field1838;

    @OriginalMember(owner = "client!sk", name = "pb", descriptor = "I")
    private static int field1840;

    @OriginalMember(owner = "client!sk", name = "cb", descriptor = "Lna;")
    private class246 field1827;

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "Lwa;")
    private class75 field1824;

    @OriginalMember(owner = "client!sk", name = "gb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1831;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "[J")
    private static long[] field1804;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "[[I")
    private int[][] field1798;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "[[I")
    private int[][] field1805;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lrk;IIIZ)V", line = 6)
    public final void method797(class255 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class100 var6 = (class100) arg0;
        if (this.field1816 == 0 || var6.field1816 == 0) {
            return;
        }
        int var7 = var6.field1820;
        int[] var8 = var6.field1794;
        int[] var9 = var6.field1817;
        int[] var10 = var6.field1801;
        short[] var11 = var6.field1822;
        short[] var12 = var6.field1830;
        short[] var13 = var6.field1810;
        short[] var14 = var6.field1823;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1827 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1827.field4085;
            var16 = this.field1827.field4082;
            var17 = this.field1827.field4084;
            var18 = this.field1827.field4083;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1827 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field1827.field4085;
            var20 = var6.field1827.field4082;
            var21 = var6.field1827.field4084;
            var22 = var6.field1827.field4083;
        }
        int[] var23 = var6.field1808;
        short[] var24 = var6.field1813;
        if (!var6.field1821.field3784) {
            var6.method828();
        }
        short var25 = var6.field1821.field3789;
        short var26 = var6.field1821.field3790;
        short var27 = var6.field1821.field3791;
        short var28 = var6.field1821.field3787;
        short var29 = var6.field1821.field3786;
        short var30 = var6.field1821.field3785;
        for (int var31 = 0; var31 < this.field1820; var31++) {
            int var32 = this.field1817[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field1794[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field1801[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1808[var31];
                        int var37 = this.field1808[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1813[var38] - 1;
                            if (var35 == -1 || this.field1823[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field1827 = new class246();
                                            var15 = this.field1827.field4085 = class201.method1502(this.field1822, 0);
                                            var16 = this.field1827.field4082 = class201.method1502(this.field1830, 0);
                                            var17 = this.field1827.field4084 = class201.method1502(this.field1810, 0);
                                            var18 = this.field1827.field4083 = class201.method1502(this.field1823, 0);
                                        }
                                        if (var19 == null) {
                                            class246 var44 = var6.field1827 = new class246();
                                            var19 = var44.field4085 = class201.method1502(var11, 0);
                                            var20 = var44.field4082 = class201.method1502(var12, 0);
                                            var21 = var44.field4084 = class201.method1502(var13, 0);
                                            var22 = var44.field4083 = class201.method1502(var14, 0);
                                        }
                                        short var45 = this.field1822[var35];
                                        short var46 = this.field1830[var35];
                                        short var47 = this.field1810[var35];
                                        short var48 = this.field1823[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field1808[var31];
                                        int var58 = this.field1808[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field1813[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lqj;IJIIIIFF)S", line = 244)
    private final short method798(class195 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field1808[arg1];
        int var12 = this.field1808[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field1813[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field1804[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field1813[var13] = (short) (this.field1790 + 1);
        field1804[var13] = arg2;
        this.field1822[this.field1790] = (short) arg3;
        this.field1830[this.field1790] = (short) arg4;
        this.field1810[this.field1790] = (short) arg5;
        this.field1823[this.field1790] = (short) arg6;
        this.field1793[this.field1790] = arg7;
        this.field1802[this.field1790] = arg8;
        return (short) (this.field1790++);
    }

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "()I", line = 279)
    public final int method77() {
        if (!this.field1821.field3784) {
            this.method828();
        }
        return this.field1821.field3787;
    }

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "()V", line = 286)
    public final void method799() {
        if (this.field1822 == null) {
            this.method85();
            return;
        }
        for (int var1 = 0; var1 < this.field1820; var1++) {
            int var2 = this.field1801[var1];
            this.field1801[var1] = this.field1794[var1];
            this.field1794[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1790; var3++) {
            short var4 = this.field1810[var3];
            this.field1810[var3] = this.field1822[var3];
            this.field1822[var3] = (short) (-var4);
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
        if (this.field1828 != null) {
            this.field1828.field3597 = false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lbf;I)V", line = 324)
    public final void method65(class54 arg0, int arg1) {
        if (this.field1805 == null || arg1 == -1) {
            return;
        }
        class52 var3 = arg0.field858[arg1];
        class149 var4 = var3.field836;
        field1840 = 0;
        field1838 = 0;
        field1835 = 0;
        for (int var5 = 0; var5 < var3.field832; var5++) {
            short var6 = var3.field824[var5];
            if (var4.field2687[var6]) {
                if (var3.field825[var5] != -1) {
                    this.method804(0, 0, 0, 0);
                }
                this.method804(var4.field2685[var6], var3.field827[var5], var3.field828[var5], var3.field835[var5]);
            }
        }
        this.field1815.field3597 = false;
        this.field1821.field3784 = false;
    }

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "()I", line = 360)
    public final int method800() {
        return this.field1791;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIJ)V", line = 365)
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field1790 == 0) {
            return;
        }
        if (!this.field1821.field3784) {
            this.method828();
        }
        short var11 = this.field1821.field3788;
        short var12 = this.field1821.field3789;
        short var13 = this.field1821.field3790;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class90.field1606) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class198.field3367) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class23.field403) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class80.field1402) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class312.field5262[arg0];
            var25 = class312.field5269[arg0];
        }
        if (arg8 > 0L && class231.field3864 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class13.field217 >= var26 && class13.field217 <= var27 && class91.field1609 >= var28 && class91.field1609 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field1821.field3791;
                short var35 = this.field1821.field3787;
                short var36 = this.field1821.field3786;
                short var37 = this.field1821.field3785;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
                        var42 = var45;
                    }
                    int var46 = arg5 + var42;
                    int var47 = arg6 + var43;
                    int var48 = arg7 + var44;
                    int var49 = arg3 * var48 + arg4 * var46 >> 16;
                    int var50 = arg4 * var48 - arg3 * var46 >> 16;
                    int var52 = arg2 * var47 - arg1 * var50 >> 16;
                    int var53 = arg1 * var47 + arg2 * var50 >> 16;
                    if (var53 > 0) {
                        int var55 = (var49 << 9) / var53;
                        int var56 = (var52 << 9) / var53;
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class13.field217 >= var30 && class13.field217 <= var31 && class91.field1609 >= var32 && class91.field1609 <= var33) {
                    if (this.field3024) {
                        class263.field4391[class90.field1596++] = arg8;
                    } else {
                        if (field1843.length < this.field1790) {
                            field1843 = new int[this.field1790];
                            field1839 = new int[this.field1790];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field1820) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field1816) {
                                        break label118;
                                    }
                                    short var78 = this.field1829[var77];
                                    short var79 = this.field1795[var77];
                                    short var80 = this.field1800[var77];
                                    if (this.method832(class13.field217, class91.field1609, field1839[var78], field1839[var79], field1839[var80], field1843[var78], field1843[var79], field1843[var80])) {
                                        class263.field4391[class90.field1596++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field1794[var57];
                            int var59 = this.field1817[var57];
                            int var60 = this.field1801[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field1808[var57];
                            int var74 = this.field1808[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field1813[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field1843[var76] = var71;
                                field1839[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class117.field2143;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method815();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(SS)V", line = 635)
    public final void method801(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1816; var3++) {
            if (this.field1826[var3] == arg0) {
                this.field1826[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class312.field5271.method140((byte) -127, arg0 & 0xFFFF);
            var5 = class312.field5271.method155(arg0 & 0xFFFF, 0);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class312.field5271.method140((byte) 29, arg1 & 0xFFFF);
            var7 = class312.field5271.method155(arg1 & 0xFFFF, 0);
        }
        if (var4 != var6 || var5 != var7) {
            this.field1807.field3597 = false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()I", line = 672)
    public final int method46() {
        if (!this.field1821.field3784) {
            this.method828();
        }
        return this.field1821.field3789;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([FI)[F", line = 681)
    private static final float[] method802(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class161.method1234(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ISIB)I", line = 687)
    private static final int method803(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class312.field5264[class11.method90(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class312.field5271.method140((byte) 44, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class312.field5271.method155(arg1 & 0xFFFF, 0);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIII)V", line = 745)
    private final void method804(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field1840 = 0;
            field1838 = 0;
            field1835 = 0;
            for (int var6 = 0; var6 < this.field1820; var6++) {
                field1840 += this.field1794[var6];
                field1838 += this.field1817[var6];
                field1835 += this.field1801[var6];
                var5++;
            }
            if (var5 > 0) {
                field1840 = field1840 / var5 + arg1;
                field1838 = field1838 / var5 + arg2;
                field1835 = field1835 / var5 + arg3;
            } else {
                field1840 = arg1;
                field1838 = arg2;
                field1835 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1820; var7++) {
                this.field1794[var7] += arg1;
                this.field1817[var7] += arg2;
                this.field1801[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1820; var8++) {
                this.field1794[var8] -= field1840;
                this.field1817[var8] -= field1838;
                this.field1801[var8] -= field1835;
                if (arg3 != 0) {
                    int var9 = class312.field5262[arg3];
                    int var10 = class312.field5269[arg3];
                    int var11 = this.field1817[var8] * var9 + this.field1794[var8] * var10 + 32767 >> 16;
                    this.field1817[var8] = this.field1817[var8] * var10 + 32767 - this.field1794[var8] * var9 >> 16;
                    this.field1794[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class312.field5262[arg1];
                    int var13 = class312.field5269[arg1];
                    int var14 = this.field1817[var8] * var13 + 32767 - this.field1801[var8] * var12 >> 16;
                    this.field1801[var8] = this.field1817[var8] * var12 + this.field1801[var8] * var13 + 32767 >> 16;
                    this.field1817[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class312.field5262[arg2];
                    int var16 = class312.field5269[arg2];
                    int var17 = this.field1801[var8] * var15 + this.field1794[var8] * var16 + 32767 >> 16;
                    this.field1801[var8] = this.field1801[var8] * var16 + 32767 - this.field1794[var8] * var15 >> 16;
                    this.field1794[var8] = var17;
                }
                this.field1794[var8] += field1840;
                this.field1817[var8] += field1838;
                this.field1801[var8] += field1835;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1820; var18++) {
                this.field1794[var18] -= field1840;
                this.field1817[var18] -= field1838;
                this.field1801[var18] -= field1835;
                this.field1794[var18] = this.field1794[var18] * arg1 / 128;
                this.field1817[var18] = this.field1817[var18] * arg2 / 128;
                this.field1801[var18] = this.field1801[var18] * arg3 / 128;
                this.field1794[var18] += field1840;
                this.field1817[var18] += field1838;
                this.field1801[var18] += field1835;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1816; var19++) {
                int var20 = (this.field1792[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field1792[var19] = (byte) var20;
            }
            this.field1807.field3597 = false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILsk;[[I[[IIII)V", line = 899)
    public final void method805(int arg0, int arg1, class100 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field1821.field3784) {
            arg2.method828();
        }
        int var9 = arg2.field1821.field3791 + arg5;
        int var10 = arg2.field1821.field3787 + arg5;
        int var11 = arg2.field1821.field3786 + arg7;
        int var12 = arg2.field1821.field3785 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field1820; var17++) {
                int var18 = this.field1794[var17] + arg5;
                int var19 = this.field1801[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field1817[var17] = this.field1817[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field1821.field3789;
            for (int var28 = 0; var28 < this.field1820; var28++) {
                int var29 = (this.field1817[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field1794[var28] + arg5;
                    int var31 = this.field1801[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field1817[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1339(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field1821.field3790 - arg2.field1821.field3789;
            for (int var42 = 0; var42 < this.field1820; var42++) {
                int var43 = this.field1794[var42] + arg5;
                int var44 = this.field1801[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field1817[var42] = var51 + this.field1817[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field1821.field3790 - arg2.field1821.field3789;
            for (int var53 = 0; var53 < this.field1820; var53++) {
                int var54 = this.field1794[var53] + arg5;
                int var55 = this.field1801[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field1817[var53] = ((this.field1817[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field1815.field3597 = false;
        this.field1821.field3784 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([SI)[S", line = 1097)
    private static final short[] method806(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class161.method1233(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "()V", line = 1104)
    public final void method73() {
        for (int var1 = 0; var1 < this.field1820; var1++) {
            int var2 = this.field1794[var1];
            this.field1794[var1] = this.field1801[var1];
            this.field1801[var1] = -var2;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "()I", line = 1118)
    public final int method97() {
        if (!this.field1821.field3784) {
            this.method828();
        }
        return this.field1821.field3788;
    }

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "()V", line = 1126)
    public final void method85() {
        for (int var1 = 0; var1 < this.field1820; var1++) {
            int var2 = this.field1801[var1];
            this.field1801[var1] = this.field1794[var1];
            this.field1794[var1] = -var2;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 1141)
    public final void method64(int arg0) {
        int var2 = class312.field5262[arg0];
        int var3 = class312.field5269[arg0];
        for (int var4 = 0; var4 < this.field1820; var4++) {
            int var5 = this.field1817[var4] * var3 - this.field1801[var4] * var2 >> 16;
            this.field1801[var4] = this.field1817[var4] * var2 + this.field1801[var4] * var3 >> 16;
            this.field1817[var4] = var5;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(III)V", line = 1162)
    public final void method71(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1820; var4++) {
            this.field1794[var4] += arg0;
            this.field1817[var4] += arg1;
            this.field1801[var4] += arg2;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V", line = 3734)
    private class100() {
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lqj;IIZ)V", line = 3741)
    public class100(class195 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field3286];
        this.field1808 = new int[arg0.field3320 + 1];
        for (int var6 = 0; var6 < arg0.field3286; var6++) {
            if ((arg0.field3325 == null || arg0.field3325[var6] != 2) && (arg0.field3313 == null || arg0.field3313[var6] == -1 || !class312.field5271.method159(arg0.field3313[var6] & 0xFFFF, true))) {
                var5[this.field1816++] = var6;
                this.field1808[arg0.field3327[var6]]++;
                this.field1808[arg0.field3292[var6]]++;
                this.field1808[arg0.field3284[var6]]++;
            }
        }
        long[] var7 = new long[this.field1816];
        for (int var8 = 0; var8 < this.field1816; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field3313 != null) {
                var14 = arg0.field3313[var9];
                if (var14 != -1) {
                    var12 = class312.field5271.method158(255, var14 & 0xFFFF);
                    var13 = class312.field5271.method145(var14 & 0xFFFF, 255);
                }
            }
            boolean var15 = arg0.field3287 != null && arg0.field3287[var9] != 0 || var14 != -1 && !class312.field5271.method146(var14 & 0xFFFF, 1);
            if ((arg3 || var15) && arg0.field3318 != null) {
                var10 += arg0.field3318[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class149.method1178(0, var5, var7);
        this.field1820 = arg0.field3320;
        this.field1794 = arg0.field3319;
        this.field1817 = arg0.field3309;
        this.field1801 = arg0.field3296;
        this.field1819 = arg0.field3279;
        int var20 = this.field1816 * 3;
        this.field1822 = new short[var20];
        this.field1830 = new short[var20];
        this.field1810 = new short[var20];
        this.field1823 = new short[var20];
        this.field1793 = new float[var20];
        this.field1802 = new float[var20];
        this.field1799 = new short[this.field1816];
        this.field1792 = new byte[this.field1816];
        this.field1829 = new short[this.field1816];
        this.field1795 = new short[this.field1816];
        this.field1800 = new short[this.field1816];
        this.field1826 = new short[this.field1816];
        if (arg0.field3312 != null) {
            this.field1806 = new byte[this.field1816];
        }
        this.field1821 = new class227();
        this.field1815 = new class214();
        this.field1807 = new class214();
        if (class92.field1634) {
            this.field1828 = new class214();
        }
        this.field1818 = new class214();
        this.field1809 = new class214();
        this.field1791 = (short) arg1;
        this.field1797 = (short) arg2;
        this.field1813 = new short[var20];
        field1804 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field3320; var22++) {
            int var23 = this.field1808[var22];
            this.field1808[var22] = var21;
            var21 += var23;
        }
        this.field1808[arg0.field3320] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field3293 != null) {
            int var28 = arg0.field3308;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field1816; var36++) {
                int var37 = var5[var36];
                if (arg0.field3293[var37] != -1) {
                    int var38 = arg0.field3293[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field3327[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field3292[var37];
                        } else {
                            var40 = arg0.field3284[var37];
                        }
                        int var41 = arg0.field3319[var40];
                        int var42 = arg0.field3309[var40];
                        int var43 = arg0.field3296[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field3301[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field3306[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field3303[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field3306[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field3303[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field3305[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field3306[var44] / 1024.0F;
                        var49 = (float) arg0.field3303[var44] / 1024.0F;
                        var48 = (float) arg0.field3305[var44] / 1024.0F;
                    }
                    var27[var44] = method829(arg0.field3311[var44], arg0.field3316[var44], arg0.field3314[var44], arg0.field3295[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field1816; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field3298[var51] & 0xFFFF;
            short var53;
            if (arg0.field3313 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field3313[var51];
            }
            int var54;
            if (arg0.field3293 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field3293[var51];
            }
            int var55;
            if (arg0.field3287 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field3287[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field3301[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field3327[var51];
                        int var67 = arg0.field3292[var51];
                        int var68 = arg0.field3284[var51];
                        short var69 = arg0.field3311[var54];
                        short var70 = arg0.field3316[var54];
                        short var71 = arg0.field3314[var54];
                        float var72 = (float) arg0.field3319[var69];
                        float var73 = (float) arg0.field3309[var69];
                        float var74 = (float) arg0.field3296[var69];
                        float var75 = (float) arg0.field3319[var70] - var72;
                        float var76 = (float) arg0.field3309[var70] - var73;
                        float var77 = (float) arg0.field3296[var70] - var74;
                        float var78 = (float) arg0.field3319[var71] - var72;
                        float var79 = (float) arg0.field3309[var71] - var73;
                        float var80 = (float) arg0.field3296[var71] - var74;
                        float var81 = (float) arg0.field3319[var66] - var72;
                        float var82 = (float) arg0.field3309[var66] - var73;
                        float var83 = (float) arg0.field3296[var66] - var74;
                        float var84 = (float) arg0.field3319[var67] - var72;
                        float var85 = (float) arg0.field3309[var67] - var73;
                        float var86 = (float) arg0.field3296[var67] - var74;
                        float var87 = (float) arg0.field3319[var68] - var72;
                        float var88 = (float) arg0.field3309[var68] - var73;
                        float var89 = (float) arg0.field3296[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field3327[var51];
                        int var102 = arg0.field3292[var51];
                        int var103 = arg0.field3284[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field3282[var54];
                        float var109 = (float) arg0.field3280[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field3305[var54] & 0xFFFF) / 1024.0F;
                            method823(arg0.field3319[var101], arg0.field3309[var101], arg0.field3296[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field1845;
                            var57 = field1837;
                            method823(arg0.field3319[var102], arg0.field3309[var102], arg0.field3296[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field1845;
                            var59 = field1837;
                            method823(arg0.field3319[var103], arg0.field3309[var103], arg0.field3296[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field1845;
                            var61 = field1837;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field3288[var54] / 256.0F;
                            float var113 = (float) arg0.field3299[var54] / 256.0F;
                            int var114 = arg0.field3319[var102] - arg0.field3319[var101];
                            int var115 = arg0.field3309[var102] - arg0.field3309[var101];
                            int var116 = arg0.field3296[var102] - arg0.field3296[var101];
                            int var117 = arg0.field3319[var103] - arg0.field3319[var101];
                            int var118 = arg0.field3309[var103] - arg0.field3309[var101];
                            int var119 = arg0.field3296[var103] - arg0.field3296[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field3306[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field3303[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field3305[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method813(var126, var127, var128);
                            method827(arg0.field3319[var101], arg0.field3309[var101], arg0.field3296[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field1842;
                            var57 = field1841;
                            method827(arg0.field3319[var102], arg0.field3309[var102], arg0.field3296[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field1842;
                            var59 = field1841;
                            method827(arg0.field3319[var103], arg0.field3309[var103], arg0.field3296[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field1842;
                            var61 = field1841;
                        } else if (var65 == 3) {
                            method826(arg0.field3319[var101], arg0.field3309[var101], arg0.field3296[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field1836;
                            var57 = field1844;
                            method826(arg0.field3319[var102], arg0.field3309[var102], arg0.field3296[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field1836;
                            var59 = field1844;
                            method826(arg0.field3319[var103], arg0.field3309[var103], arg0.field3296[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field1836;
                            var61 = field1844;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1455();
            byte var129;
            if (arg0.field3325 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field3325[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field3327[var51];
                class61 var133 = arg0.field3285[var132];
                this.field1829[var50] = this.method798(arg0, var132, var130, var133.field944, var133.field941, var133.field950, var133.field943, var56, var57);
                int var134 = arg0.field3292[var51];
                class61 var135 = arg0.field3285[var134];
                this.field1795[var50] = this.method798(arg0, var134, (long) var62 + var130, var135.field944, var135.field941, var135.field950, var135.field943, var58, var59);
                int var136 = arg0.field3284[var51];
                class61 var137 = arg0.field3285[var136];
                this.field1800[var50] = this.method798(arg0, var136, (long) var63 + var130, var137.field944, var137.field941, var137.field950, var137.field943, var60, var61);
            } else if (var129 == 1) {
                class242 var138 = arg0.field3302[var51];
                long var139 = (long) ((var54 << 2) + (var138.field4032 > 0 ? 1024 : 2048) + (var138.field4024 + 256 << 12) + (var138.field4018 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field1829[var50] = this.method798(arg0, arg0.field3327[var51], var139, var138.field4032, var138.field4024, var138.field4018, 0, var56, var57);
                this.field1795[var50] = this.method798(arg0, arg0.field3292[var51], (long) var62 + var139, var138.field4032, var138.field4024, var138.field4018, 0, var58, var59);
                this.field1800[var50] = this.method798(arg0, arg0.field3284[var51], (long) var63 + var139, var138.field4032, var138.field4024, var138.field4018, 0, var60, var61);
            }
            if (arg0.field3313 == null) {
                this.field1826[var50] = -1;
            } else {
                this.field1826[var50] = arg0.field3313[var51];
            }
            if (this.field1806 != null) {
                this.field1806[var50] = (byte) arg0.field3312[var51];
            }
            this.field1799[var50] = arg0.field3298[var51];
            if (arg0.field3287 != null) {
                this.field1792[var50] = arg0.field3287[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field1816; var143++) {
            short var144 = this.field1826[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field1812 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field1816; var147++) {
            short var148 = this.field1826[var147];
            if (var146 != var148) {
                this.field1812[var145++] = var147;
                var146 = var148;
            }
        }
        this.field1812[var145] = this.field1816;
        field1804 = null;
        this.field1822 = method806(this.field1822, this.field1790);
        this.field1830 = method806(this.field1830, this.field1790);
        this.field1810 = method806(this.field1810, this.field1790);
        this.field1823 = method806(this.field1823, this.field1790);
        this.field1793 = method802(this.field1793, this.field1790);
        this.field1802 = method802(this.field1802, this.field1790);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZZZZZZZ)V", line = 1178)
    public final void method807(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field1803 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field1790 != 0) {
            if (arg6) {
                boolean var8 = !this.field1807.field3597 && (arg1 || arg2 && !class92.field1634);
                this.method833(false, !this.field1815.field3597 && arg0, var8, this.field1828 != null && !this.field1828.field3597 && arg2, !this.field1818.field3597 && arg3);
                if (!this.field1809.field3597 && arg4 && arg1) {
                    this.method834();
                }
            }
            if (arg0) {
                if (this.field1815.field3597) {
                    this.field1794 = null;
                    this.field1817 = null;
                    this.field1801 = null;
                    this.field1813 = null;
                    this.field1808 = null;
                } else {
                    this.field1814 = (byte) (this.field1814 | 0x1);
                }
            }
            if (arg1) {
                if (this.field1807.field3597) {
                    this.field1799 = null;
                    this.field1792 = null;
                } else {
                    this.field1814 = (byte) (this.field1814 | 0x2);
                }
            }
            if (arg2 && class92.field1634) {
                if (this.field1828.field3597) {
                    this.field1822 = null;
                    this.field1830 = null;
                    this.field1810 = null;
                    this.field1823 = null;
                } else {
                    this.field1814 = (byte) (this.field1814 | 0x4);
                }
            }
            if (arg3) {
                if (this.field1818.field3597) {
                    this.field1793 = null;
                    this.field1802 = null;
                } else {
                    this.field1814 = (byte) (this.field1814 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field1809.field3597 && this.field1807.field3597) {
                    this.field1829 = null;
                    this.field1795 = null;
                    this.field1800 = null;
                } else {
                    this.field1814 = (byte) (this.field1814 | 0x10);
                }
            }
            if (arg5) {
                this.field1819 = null;
                this.field1806 = null;
                this.field1805 = (int[][]) null;
                this.field1798 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(ZZ)Lhi;", line = 1270)
    public final class176 method74(boolean arg0, boolean arg1) {
        return this.method822(arg0, arg1, field1832, field1811);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lpm;)Lpm;", line = 1273)
    public final class99 method808(class99 arg0) {
        if (this.field1790 == 0) {
            return null;
        }
        if (!this.field1821.field3784) {
            this.method828();
        }
        int var2;
        int var3;
        if (class108.field1949 > 0) {
            var2 = this.field1821.field3791 - (class108.field1949 * this.field1821.field3790 >> 8) >> 3;
            var3 = this.field1821.field3787 - (class108.field1949 * this.field1821.field3789 >> 8) >> 3;
        } else {
            var2 = this.field1821.field3791 - (class108.field1949 * this.field1821.field3789 >> 8) >> 3;
            var3 = this.field1821.field3787 - (class108.field1949 * this.field1821.field3790 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class108.field1948 > 0) {
            var4 = this.field1821.field3786 - (class108.field1948 * this.field1821.field3790 >> 8) >> 3;
            var5 = this.field1821.field3785 - (class108.field1948 * this.field1821.field3789 >> 8) >> 3;
        } else {
            var4 = this.field1821.field3786 - (class108.field1948 * this.field1821.field3789 >> 8) >> 3;
            var5 = this.field1821.field3785 - (class108.field1948 * this.field1821.field3790 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class99 var8;
        if (arg0 == null || arg0.field1789.length < var6 * var7) {
            var8 = new class99(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field547 = arg0.field556 = var6;
            arg0.field549 = arg0.field557 = var7;
            arg0.method796();
        }
        var8.field545 = var2;
        var8.field543 = var4;
        if (field1843.length < this.field1790) {
            field1843 = new int[this.field1790];
            field1839 = new int[this.field1790];
        }
        for (int var9 = 0; var9 < this.field1820; var9++) {
            int var10 = (this.field1794[var9] - (this.field1817[var9] * class108.field1949 >> 8) >> 3) - var2;
            int var11 = (this.field1801[var9] - (this.field1817[var9] * class108.field1948 >> 8) >> 3) - var4;
            int var12 = this.field1808[var9];
            int var13 = this.field1808[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field1813[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field1843[var15] = var10;
                field1839[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field1816; var16++) {
            if (this.field1792[var16] <= 128) {
                short var17 = this.field1829[var16];
                short var18 = this.field1795[var16];
                short var19 = this.field1800[var16];
                int var20 = field1843[var17];
                int var21 = field1843[var18];
                int var22 = field1843[var19];
                int var23 = field1839[var17];
                int var24 = field1839[var18];
                int var25 = field1839[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class312.method2127(var8.field1789, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "()V", line = 1398)
    public final void method809() {
        for (int var1 = 0; var1 < this.field1820; var1++) {
            this.field1801[var1] = -this.field1801[var1];
        }
        if (this.field1810 != null) {
            for (int var2 = 0; var2 < this.field1790; var2++) {
                this.field1810[var2] = (short) (-this.field1810[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field1816; var3++) {
            short var4 = this.field1829[var3];
            this.field1829[var3] = this.field1800[var3];
            this.field1800[var3] = var4;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
        if (this.field1828 != null) {
            this.field1828.field3597 = false;
        }
        this.field1809.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V", line = 1435)
    public final void method78(int arg0) {
        int var2 = class312.field5262[arg0];
        int var3 = class312.field5269[arg0];
        for (int var4 = 0; var4 < this.field1820; var4++) {
            int var5 = this.field1801[var4] * var2 + this.field1794[var4] * var3 >> 16;
            this.field1801[var4] = this.field1801[var4] * var3 - this.field1794[var4] * var2 >> 16;
            this.field1794[var4] = var5;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "()I", line = 1454)
    public final int method96() {
        if (!this.field1821.field3784) {
            this.method828();
        }
        return this.field1821.field3786;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lbf;ILbf;I[IZ)V", line = 1461)
    public final void method66(class54 arg0, int arg1, class54 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method92(arg0, arg1, arg5);
            return;
        }
        class52 var7 = arg0.field858[arg1];
        class52 var8 = arg2.field858[arg3];
        class149 var9 = var7.field836;
        for (int var10 = 0; var10 < this.field1820; var10++) {
            this.field1794[var10] <<= 0x4;
            this.field1817[var10] <<= 0x4;
            this.field1801[var10] <<= 0x4;
        }
        field1840 = 0;
        field1838 = 0;
        field1835 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field832; var13++) {
            short var14 = var7.field824[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field2685[var14] == 0) {
                if (var7.field825[var13] != -1) {
                    this.method825(0, var9.field2682[var7.field825[var13]], 0, 0, 0, arg5);
                }
                this.method825(var9.field2685[var14], var9.field2682[var14], var7.field827[var13], var7.field828[var13], var7.field835[var13], arg5);
            }
        }
        field1840 = 0;
        field1838 = 0;
        field1835 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field832; var17++) {
            short var18 = var8.field824[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field2685[var18] == 0) {
                if (var8.field825[var17] != -1) {
                    this.method825(0, var9.field2682[var8.field825[var17]], 0, 0, 0, arg5);
                }
                this.method825(var9.field2685[var18], var9.field2682[var18], var8.field827[var17], var8.field828[var17], var8.field835[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field1820; var19++) {
            this.field1794[var19] >>= 0x4;
            this.field1817[var19] >>= 0x4;
            this.field1801[var19] >>= 0x4;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZZ)Lhi;", line = 1556)
    public final class176 method88(boolean arg0, boolean arg1) {
        return this.method822(arg0, arg1, field1834, field1833);
    }

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "()I", line = 1561)
    public final int method75() {
        if (!this.field1821.field3784) {
            this.method828();
        }
        return this.field1821.field3785;
    }

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "()V", line = 1567)
    public static final void method810() {
        field1811 = new class100();
        field1832 = new class100();
        field1833 = new class100();
        field1834 = new class100();
    }

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "()V", line = 1574)
    public static void method811() {
        field1804 = null;
        field1796 = null;
        field1831 = null;
        field1811 = null;
        field1832 = null;
        field1833 = null;
        field1834 = null;
        field1843 = null;
        field1839 = null;
    }

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "()V", line = 1586)
    public final void method812() {
        if (this.field1822 == null) {
            this.method82();
            return;
        }
        for (int var1 = 0; var1 < this.field1820; var1++) {
            this.field1794[var1] = -this.field1794[var1];
            this.field1801[var1] = -this.field1801[var1];
        }
        for (int var2 = 0; var2 < this.field1790; var2++) {
            this.field1822[var2] = (short) (-this.field1822[var2]);
            this.field1810[var2] = (short) (-this.field1810[var2]);
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
        if (this.field1828 != null) {
            this.field1828.field3597 = false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(FFF)I", line = 1620)
    private static final int method813(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 1654)
    public final void method814(int arg0) {
        if (this.field1822 == null) {
            this.method78(arg0);
            return;
        }
        int var2 = class312.field5262[arg0];
        int var3 = class312.field5269[arg0];
        for (int var4 = 0; var4 < this.field1820; var4++) {
            int var5 = this.field1801[var4] * var2 + this.field1794[var4] * var3 >> 16;
            this.field1801[var4] = this.field1801[var4] * var3 - this.field1794[var4] * var2 >> 16;
            this.field1794[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field1790; var6++) {
            int var7 = this.field1822[var6] * var3 + this.field1810[var6] * var2 >> 16;
            this.field1810[var6] = (short) (this.field1810[var6] * var3 - this.field1822[var6] * var2 >> 16);
            this.field1822[var6] = (short) var7;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
        if (this.field1828 != null) {
            this.field1828.field3597 = false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "()V", line = 1696)
    private final void method815() {
        GL var1 = class117.field2143;
        if (this.field1816 == 0) {
            return;
        }
        if (this.field1803 != 0) {
            this.method833(true, !this.field1815.field3597 && (this.field1803 & 0x1) != 0, !this.field1807.field3597 && (this.field1803 & 0x2) != 0, this.field1828 != null && !this.field1828.field3597 && (this.field1803 & 0x4) != 0, false);
        }
        this.method833(false, !this.field1815.field3597, !this.field1807.field3597, this.field1828 != null && !this.field1828.field3597, !this.field1818.field3597);
        if (!this.field1809.field3597) {
            this.method834();
        }
        if (this.field1814 != 0) {
            if ((this.field1814 & 0x1) != 0) {
                this.field1794 = null;
                this.field1817 = null;
                this.field1801 = null;
                this.field1813 = null;
                this.field1808 = null;
            }
            if ((this.field1814 & 0x2) != 0) {
                this.field1799 = null;
                this.field1792 = null;
            }
            if ((this.field1814 & 0x4) != 0) {
                this.field1822 = null;
                this.field1830 = null;
                this.field1810 = null;
                this.field1823 = null;
            }
            if ((this.field1814 & 0x8) != 0) {
                this.field1793 = null;
                this.field1802 = null;
            }
            if ((this.field1814 & 0x10) != 0) {
                this.field1829 = null;
                this.field1795 = null;
                this.field1800 = null;
            }
            this.field1814 = 0;
        }
        class75 var2 = null;
        if (this.field1815.field3582 != null) {
            this.field1815.field3582.method536();
            var2 = this.field1815.field3582;
            var1.glVertexPointer(3, 5126, this.field1815.field3585, (long) this.field1815.field3590);
        }
        if (this.field1807.field3582 != null) {
            if (this.field1807.field3582 != var2) {
                this.field1807.field3582.method536();
                var2 = this.field1807.field3582;
            }
            var1.glColorPointer(4, 5121, this.field1807.field3585, (long) this.field1807.field3590);
        }
        if (class92.field1634 && this.field1828.field3582 != null) {
            if (this.field1828.field3582 != var2) {
                this.field1828.field3582.method536();
                var2 = this.field1828.field3582;
            }
            var1.glNormalPointer(5126, this.field1828.field3585, (long) this.field1828.field3590);
        }
        if (this.field1818.field3582 != null) {
            if (this.field1818.field3582 != var2) {
                this.field1818.field3582.method536();
                class75 var3 = this.field1818.field3582;
            }
            var1.glTexCoordPointer(2, 5126, this.field1818.field3585, (long) this.field1818.field3590);
        }
        if (this.field1809.field3582 != null) {
            this.field1809.field3582.method533();
        }
        if (this.field1815.field3582 == null || this.field1807.field3582 == null || class92.field1634 && this.field1828.field3582 == null || this.field1818.field3582 == null) {
            if (class117.field2145) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field1815.field3582 == null) {
                this.field1815.field3583.position(this.field1815.field3590);
                var1.glVertexPointer(3, 5126, this.field1815.field3585, this.field1815.field3583);
            }
            if (this.field1807.field3582 == null) {
                this.field1807.field3583.position(this.field1807.field3590);
                var1.glColorPointer(4, 5121, this.field1807.field3585, this.field1807.field3583);
            }
            if (class92.field1634 && this.field1828.field3582 == null) {
                this.field1828.field3583.position(this.field1828.field3590);
                var1.glNormalPointer(5126, this.field1828.field3585, this.field1828.field3583);
            }
            if (this.field1818.field3582 == null) {
                this.field1818.field3583.position(this.field1818.field3590);
                var1.glTexCoordPointer(2, 5126, this.field1818.field3585, this.field1818.field3583);
            }
        }
        if (this.field1809.field3582 == null && class117.field2145) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field1812.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field1812[var5];
            int var7 = this.field1812[var5 + 1];
            short var8 = this.field1826[var6];
            if (var8 == -1) {
                class117.method939(-1);
                class116.method913(true, 0, 0);
            } else {
                class312.field5271.method152(var8 & 0xFFFF, 255);
            }
            if (this.field1809.field3582 == null) {
                this.field1809.field3583.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field1809.field3583);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(SS)V", line = 1870)
    public final void method816(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1816; var3++) {
            if (this.field1799[var3] == arg0) {
                this.field1799[var3] = arg1;
            }
        }
        this.field1807.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V", line = 1883)
    public final void method817(int arg0) {
        this.field1797 = (short) arg0;
        if (this.field1828 != null) {
            this.field1828.field3597 = false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "()V", line = 1896)
    public final void method82() {
        for (int var1 = 0; var1 < this.field1820; var1++) {
            this.field1794[var1] = -this.field1794[var1];
            this.field1801[var1] = -this.field1801[var1];
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "()V", line = 1908)
    public final void method818() {
        if (this.field1822 == null) {
            this.method73();
            return;
        }
        for (int var1 = 0; var1 < this.field1820; var1++) {
            int var2 = this.field1794[var1];
            this.field1794[var1] = this.field1801[var1];
            this.field1801[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1790; var3++) {
            short var4 = this.field1822[var3];
            this.field1822[var3] = this.field1810[var3];
            this.field1810[var3] = (short) (-var4);
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
        if (this.field1828 != null) {
            this.field1828.field3597 = false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "()V", line = 1947)
    public final void method819() {
        int var10002;
        if (this.field1819 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1820; var3++) {
                int var4 = this.field1819[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1805 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1805[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1820) {
                int var7 = this.field1819[var6] & 0xFF;
                this.field1805[var7][var1[var7]++] = var6++;
            }
            this.field1819 = null;
        }
        if (this.field1806 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1816; var10++) {
            int var11 = this.field1806[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1798 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1798[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1816) {
            int var14 = this.field1806[var13] & 0xFF;
            this.field1798[var14][var8[var14]++] = var13++;
        }
        this.field1806 = null;
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)V", line = 2041)
    public final void method820(int arg0) {
        this.field1791 = (short) arg0;
        this.field1807.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V", line = 2047)
    public final void method86(int arg0) {
        int var2 = class312.field5262[arg0];
        int var3 = class312.field5269[arg0];
        for (int var4 = 0; var4 < this.field1820; var4++) {
            int var5 = this.field1817[var4] * var2 + this.field1794[var4] * var3 >> 16;
            this.field1817[var4] = this.field1817[var4] * var3 - this.field1794[var4] * var2 >> 16;
            this.field1794[var4] = var5;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZZZZZZZZZZZ)Lsk;", line = 2068)
    public final class100 method821(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class100 var12 = new class100();
        var12.field1820 = this.field1820;
        var12.field1790 = this.field1790;
        var12.field1816 = this.field1816;
        if (arg0) {
            var12.field1794 = this.field1794;
            var12.field1801 = this.field1801;
        } else {
            var12.field1794 = class72.method524(this.field1794, -30180);
            var12.field1801 = class72.method524(this.field1801, -30180);
        }
        if (arg1) {
            var12.field1817 = this.field1817;
        } else {
            var12.field1817 = class72.method524(this.field1817, -30180);
        }
        if (arg0 && arg1) {
            var12.field1815 = this.field1815;
            var12.field1821 = this.field1821;
        } else {
            var12.field1815 = new class214();
            var12.field1821 = new class227();
        }
        if (arg2) {
            var12.field1799 = this.field1799;
        } else {
            var12.field1799 = class201.method1502(this.field1799, 0);
        }
        if (arg3) {
            var12.field1792 = this.field1792;
        } else {
            var12.field1792 = class144.method1159((byte) -122, this.field1792);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class92.field1634) {
            var12.field1807 = new class214();
        } else {
            var12.field1807 = this.field1807;
        }
        if (arg5) {
            var12.field1822 = this.field1822;
            var12.field1830 = this.field1830;
            var12.field1810 = this.field1810;
            var12.field1823 = this.field1823;
        } else {
            var12.field1822 = class201.method1502(this.field1822, 0);
            var12.field1830 = class201.method1502(this.field1830, 0);
            var12.field1810 = class201.method1502(this.field1810, 0);
            var12.field1823 = class201.method1502(this.field1823, 0);
        }
        if (!class92.field1634) {
            var12.field1828 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field1828 = this.field1828;
        } else {
            var12.field1828 = new class214();
        }
        if (arg8) {
            var12.field1793 = this.field1793;
            var12.field1802 = this.field1802;
            var12.field1818 = this.field1818;
        } else {
            var12.field1793 = class115.method910((byte) 99, this.field1793);
            var12.field1802 = class115.method910((byte) 99, this.field1802);
            var12.field1818 = new class214();
        }
        if (arg9) {
            var12.field1829 = this.field1829;
            var12.field1795 = this.field1795;
            var12.field1800 = this.field1800;
            var12.field1809 = this.field1809;
        } else {
            var12.field1829 = class201.method1502(this.field1829, 0);
            var12.field1795 = class201.method1502(this.field1795, 0);
            var12.field1800 = class201.method1502(this.field1800, 0);
            var12.field1809 = new class214();
        }
        if (arg10) {
            var12.field1826 = this.field1826;
        } else {
            var12.field1826 = class201.method1502(this.field1826, 0);
        }
        var12.field1819 = this.field1819;
        var12.field1805 = this.field1805;
        var12.field1806 = this.field1806;
        var12.field1798 = this.field1798;
        var12.field1812 = this.field1812;
        var12.field1813 = this.field1813;
        var12.field1808 = this.field1808;
        var12.field1791 = this.field1791;
        var12.field1797 = this.field1797;
        return var12;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZZLsk;Lsk;)Lhi;", line = 2210)
    private final class176 method822(boolean arg0, boolean arg1, class100 arg2, class100 arg3) {
        arg2.field1820 = this.field1820;
        arg2.field1790 = this.field1790;
        arg2.field1816 = this.field1816;
        arg2.field1791 = this.field1791;
        arg2.field1797 = this.field1797;
        arg2.field1803 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field1794 == null || arg2.field1794.length < this.field1820) {
            arg2.field1794 = new int[this.field1820 + 100];
            arg2.field1817 = new int[this.field1820 + 100];
            arg2.field1801 = new int[this.field1820 + 100];
        }
        for (int var5 = 0; var5 < this.field1820; var5++) {
            arg2.field1794[var5] = this.field1794[var5];
            arg2.field1817[var5] = this.field1817[var5];
            arg2.field1801[var5] = this.field1801[var5];
        }
        if (arg2.field1815 == null) {
            arg2.field1815 = new class214();
        }
        arg2.field1815.field3597 = false;
        if (arg2.field1821 == null) {
            arg2.field1821 = new class227();
        }
        arg2.field1821.field3784 = false;
        if (arg0) {
            arg2.field1792 = this.field1792;
            arg2.field1807 = this.field1807;
        } else {
            if (arg3.field1792 == null || arg3.field1792.length < this.field1816) {
                arg3.field1792 = new byte[this.field1816 + 100];
            }
            arg2.field1792 = arg3.field1792;
            for (int var6 = 0; var6 < this.field1816; var6++) {
                arg2.field1792[var6] = this.field1792[var6];
            }
            if (arg3.field1807 == null) {
                arg3.field1807 = new class214();
            }
            arg2.field1807 = arg3.field1807;
            arg2.field1807.field3597 = false;
        }
        if (arg1) {
            arg2.field1822 = this.field1822;
            arg2.field1830 = this.field1830;
            arg2.field1810 = this.field1810;
            arg2.field1823 = this.field1823;
            arg2.field1828 = this.field1828;
        } else {
            if (arg3.field1822 == null || arg3.field1822.length < this.field1790) {
                arg3.field1822 = new short[this.field1790 + 100];
                arg3.field1830 = new short[this.field1790 + 100];
                arg3.field1810 = new short[this.field1790 + 100];
                arg3.field1823 = new short[this.field1790 + 100];
            }
            arg2.field1822 = arg3.field1822;
            arg2.field1830 = arg3.field1830;
            arg2.field1810 = arg3.field1810;
            arg2.field1823 = arg3.field1823;
            for (int var7 = 0; var7 < this.field1790; var7++) {
                arg2.field1822[var7] = this.field1822[var7];
                arg2.field1830[var7] = this.field1830[var7];
                arg2.field1810[var7] = this.field1810[var7];
                arg2.field1823[var7] = this.field1823[var7];
            }
            if (class92.field1634) {
                if (arg3.field1828 == null) {
                    arg3.field1828 = new class214();
                }
                arg2.field1828 = arg3.field1828;
                arg2.field1828.field3597 = false;
            } else {
                arg2.field1828 = null;
            }
        }
        arg2.field1793 = this.field1793;
        arg2.field1802 = this.field1802;
        arg2.field1819 = this.field1819;
        arg2.field1805 = this.field1805;
        arg2.field1799 = this.field1799;
        arg2.field1829 = this.field1829;
        arg2.field1795 = this.field1795;
        arg2.field1800 = this.field1800;
        arg2.field1826 = this.field1826;
        arg2.field1806 = this.field1806;
        arg2.field1798 = this.field1798;
        arg2.field1818 = this.field1818;
        arg2.field1809 = this.field1809;
        arg2.field1812 = this.field1812;
        arg2.field1813 = this.field1813;
        arg2.field1808 = this.field1808;
        arg2.field3024 = this.field3024;
        return arg2;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "()I", line = 2340)
    public final int method69() {
        if (!this.field1821.field3784) {
            this.method828();
        }
        return this.field1821.field3791;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII[FFIF)V", line = 2346)
    private static final void method823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field1845 = var16;
        field1837 = var17;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "()Z", line = 2392)
    public final boolean method824() {
        return this.field1825 && this.field1794 != null && this.field1822 != null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lbf;IZ)V", line = 2399)
    public final void method92(class54 arg0, int arg1, boolean arg2) {
        if (this.field1805 == null || arg1 == -1) {
            return;
        }
        class52 var4 = arg0.field858[arg1];
        class149 var5 = var4.field836;
        for (int var6 = 0; var6 < this.field1820; var6++) {
            this.field1794[var6] <<= 0x4;
            this.field1817[var6] <<= 0x4;
            this.field1801[var6] <<= 0x4;
        }
        field1840 = 0;
        field1838 = 0;
        field1835 = 0;
        for (int var7 = 0; var7 < var4.field832; var7++) {
            short var8 = var4.field824[var7];
            if (var4.field825[var7] != -1) {
                this.method825(0, var5.field2682[var4.field825[var7]], 0, 0, 0, arg2);
            }
            this.method825(var5.field2685[var8], var5.field2682[var8], var4.field827[var7], var4.field828[var7], var4.field835[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field1820; var9++) {
            this.field1794[var9] >>= 0x4;
            this.field1817[var9] >>= 0x4;
            this.field1801[var9] >>= 0x4;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[IIIIZ)V", line = 2453)
    private final void method825(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field1840 = 0;
            field1838 = 0;
            field1835 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field1805.length) {
                    int[] var14 = this.field1805[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field1840 += this.field1794[var16];
                        field1838 += this.field1817[var16];
                        field1835 += this.field1801[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field1840 = field1840 / var11 + var8;
                field1838 = field1838 / var11 + var9;
                field1835 = field1835 / var11 + var10;
            } else {
                field1840 = var8;
                field1838 = var9;
                field1835 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field1805.length) {
                    int[] var22 = this.field1805[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field1794[var24] += var17;
                        this.field1817[var24] += var18;
                        this.field1801[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1805.length) {
                    int[] var27 = this.field1805[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field1794[var29] -= field1840;
                        this.field1817[var29] -= field1838;
                        this.field1801[var29] -= field1835;
                        if (arg4 != 0) {
                            int var30 = class312.field5262[arg4];
                            int var31 = class312.field5269[arg4];
                            int var32 = this.field1817[var29] * var30 + this.field1794[var29] * var31 + 32767 >> 16;
                            this.field1817[var29] = this.field1817[var29] * var31 + 32767 - this.field1794[var29] * var30 >> 16;
                            this.field1794[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class312.field5262[arg2];
                            int var34 = class312.field5269[arg2];
                            int var35 = this.field1817[var29] * var34 + 32767 - this.field1801[var29] * var33 >> 16;
                            this.field1801[var29] = this.field1817[var29] * var33 + this.field1801[var29] * var34 + 32767 >> 16;
                            this.field1817[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class312.field5262[arg3];
                            int var37 = class312.field5269[arg3];
                            int var38 = this.field1801[var29] * var36 + this.field1794[var29] * var37 + 32767 >> 16;
                            this.field1801[var29] = this.field1801[var29] * var37 + 32767 - this.field1794[var29] * var36 >> 16;
                            this.field1794[var29] = var38;
                        }
                        this.field1794[var29] += field1840;
                        this.field1817[var29] += field1838;
                        this.field1801[var29] += field1835;
                    }
                }
            }
            if (arg5 && this.field1822 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field1805.length) {
                        int[] var41 = this.field1805[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field1808[var43];
                            int var45 = this.field1808[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field1813[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class312.field5262[arg4];
                                    int var49 = class312.field5269[arg4];
                                    int var50 = this.field1830[var47] * var48 + this.field1822[var47] * var49 + 32767 >> 16;
                                    this.field1830[var47] = (short) (this.field1830[var47] * var49 + 32767 - this.field1822[var47] * var48 >> 16);
                                    this.field1822[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class312.field5262[arg2];
                                    int var52 = class312.field5269[arg2];
                                    int var53 = this.field1830[var47] * var52 + 32767 - this.field1810[var47] * var51 >> 16;
                                    this.field1810[var47] = (short) (this.field1830[var47] * var51 + this.field1810[var47] * var52 + 32767 >> 16);
                                    this.field1830[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class312.field5262[arg3];
                                    int var55 = class312.field5269[arg3];
                                    int var56 = this.field1822[var47] * var55 + this.field1810[var47] * var54 + 32767 >> 16;
                                    this.field1810[var47] = (short) (this.field1810[var47] * var55 + 32767 - this.field1822[var47] * var54 >> 16);
                                    this.field1822[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field1828 != null) {
                    this.field1828.field3597 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field1805.length) {
                    int[] var59 = this.field1805[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field1794[var61] -= field1840;
                        this.field1817[var61] -= field1838;
                        this.field1801[var61] -= field1835;
                        this.field1794[var61] = this.field1794[var61] * arg2 >> 7;
                        this.field1817[var61] = this.field1817[var61] * arg3 >> 7;
                        this.field1801[var61] = this.field1801[var61] * arg4 >> 7;
                        this.field1794[var61] += field1840;
                        this.field1817[var61] += field1838;
                        this.field1801[var61] += field1835;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1798 != null && this.field1792 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field1798.length) {
                    int[] var64 = this.field1798[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field1792[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field1792[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field1807.field3597 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII)V", line = 2796)
    public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1790 == 0) {
            return;
        }
        GL var8 = class117.field2143;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method815();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII[FIF)V", line = 2820)
    private static final void method826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field1836 = var16;
        field1844 = var17;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2868)
    private static final void method827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field1842 = var18;
        field1841 = var19;
    }

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "()V", line = 2948)
    private final void method828() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field1820; var9++) {
            int var10 = this.field1794[var9];
            int var11 = this.field1817[var9];
            int var12 = this.field1801[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field1821.field3791 = (short) var1;
        this.field1821.field3787 = (short) var4;
        this.field1821.field3789 = (short) var2;
        this.field1821.field3790 = (short) var5;
        this.field1821.field3786 = (short) var3;
        this.field1821.field3785 = (short) var6;
        this.field1821.field3788 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field1821.field3784 = true;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIFFF)[F", line = 3018)
    private static final float[] method829(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "()I", line = 3095)
    public final int method830() {
        return this.field1797;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)V", line = 3103)
    public final void method67(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1820; var4++) {
            this.field1794[var4] = this.field1794[var4] * arg0 >> 7;
            this.field1817[var4] = this.field1817[var4] * arg1 >> 7;
            this.field1801[var4] = this.field1801[var4] * arg2 >> 7;
        }
        this.field1821.field3784 = false;
        this.field1815.field3597 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Lrk;", line = 3116)
    public final class255 method831(int arg0, int arg1, int arg2) {
        this.field1825 = false;
        if (this.field1827 != null) {
            this.field1822 = this.field1827.field4085;
            this.field1830 = this.field1827.field4082;
            this.field1810 = this.field1827.field4084;
            this.field1823 = this.field1827.field4083;
            this.field1827 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(IIIIIIII)Z", line = 3130)
    private final boolean method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZZZZZ)V", line = 3146)
    private final void method833(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field1815.field3590 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field1807.field3590 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field1828.field3590 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field1818.field3590 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field1796.field1681.length < this.field1790 * var6) {
            field1796 = new class94((this.field1790 + 100) * var6);
        } else {
            field1796.field1653 = 0;
        }
        if (arg1) {
            if (class117.field2135) {
                for (int var7 = 0; var7 < this.field1820; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field1794[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field1817[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field1801[var7]);
                    int var11 = this.field1808[var7];
                    int var12 = this.field1808[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field1813[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field1796.field1653 = var6 * var14;
                        field1796.method730(false, var8);
                        field1796.method730(false, var9);
                        field1796.method730(false, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field1820; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field1794[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field1817[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field1801[var15]);
                    int var19 = this.field1808[var15];
                    int var20 = this.field1808[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field1813[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field1796.field1653 = var6 * var22;
                        field1796.method718((byte) -107, var16);
                        field1796.method718((byte) -91, var17);
                        field1796.method718((byte) -111, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class92.field1634) {
                for (int var42 = 0; var42 < this.field1816; var42++) {
                    int var43 = method803(this.field1799[var42], this.field1826[var42], this.field1791, this.field1792[var42]);
                    field1796.field1653 = this.field1829[var42] * var6 + this.field1807.field3590;
                    field1796.method730(false, var43);
                    field1796.field1653 = this.field1795[var42] * var6 + this.field1807.field3590;
                    field1796.method730(false, var43);
                    field1796.field1653 = this.field1800[var42] * var6 + this.field1807.field3590;
                    field1796.method730(false, var43);
                }
            } else {
                int var23 = (int) class108.field1947[0];
                int var24 = (int) class108.field1947[1];
                int var25 = (int) class108.field1947[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field1791 * 1.3F);
                int var28 = this.field1797 * var26 >> 8;
                for (int var29 = 0; var29 < this.field1816; var29++) {
                    short var30 = this.field1829[var29];
                    short var31 = this.field1823[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field1810[var30] * var25 + this.field1830[var30] * var24 + this.field1822[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field1810[var30] * var25 + this.field1830[var30] * var24 + this.field1822[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field1823[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field1795[var29];
                    short var34 = this.field1823[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field1810[var33] * var25 + this.field1830[var33] * var24 + this.field1822[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field1810[var33] * var25 + this.field1830[var33] * var24 + this.field1822[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field1823[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field1800[var29];
                    short var37 = this.field1823[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field1810[var36] * var25 + this.field1830[var36] * var24 + this.field1822[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field1810[var36] * var25 + this.field1830[var36] * var24 + this.field1822[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field1823[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method803(this.field1799[var29], this.field1826[var29], var32, this.field1792[var29]);
                    int var40 = method803(this.field1799[var29], this.field1826[var29], var35, this.field1792[var29]);
                    int var41 = method803(this.field1799[var29], this.field1826[var29], var38, this.field1792[var29]);
                    field1796.field1653 = var6 * var30 + this.field1807.field3590;
                    field1796.method730(false, var39);
                    field1796.field1653 = var6 * var33 + this.field1807.field3590;
                    field1796.method730(false, var40);
                    field1796.field1653 = var6 * var36 + this.field1807.field3590;
                    field1796.method730(false, var41);
                }
                this.field1822 = null;
                this.field1830 = null;
                this.field1810 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field1797;
            float var45 = 3.0F / (float) (this.field1797 / 2 + this.field1797);
            field1796.field1653 = this.field1828.field3590;
            if (class117.field2135) {
                for (int var46 = 0; var46 < this.field1790; var46++) {
                    short var47 = this.field1823[var46];
                    if (var47 == 0) {
                        field1796.method710((float) this.field1822[var46] * var45, -102);
                        field1796.method710((float) this.field1830[var46] * var45, -109);
                        field1796.method710((float) this.field1810[var46] * var45, -124);
                    } else {
                        float var48 = var44 / (float) var47;
                        field1796.method710((float) this.field1822[var46] * var48, -107);
                        field1796.method710((float) this.field1830[var46] * var48, -118);
                        field1796.method710((float) this.field1810[var46] * var48, -128);
                    }
                    field1796.field1653 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field1790; var49++) {
                    short var50 = this.field1823[var49];
                    if (var50 == 0) {
                        field1796.method733(128, (float) this.field1822[var49] * var45);
                        field1796.method733(128, (float) this.field1830[var49] * var45);
                        field1796.method733(128, (float) this.field1810[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field1796.method733(128, (float) this.field1822[var49] * var51);
                        field1796.method733(128, (float) this.field1830[var49] * var51);
                        field1796.method733(128, (float) this.field1810[var49] * var51);
                    }
                    field1796.field1653 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field1796.field1653 = this.field1818.field3590;
            if (class117.field2135) {
                for (int var52 = 0; var52 < this.field1790; var52++) {
                    field1796.method710(this.field1793[var52], -100);
                    field1796.method710(this.field1802[var52], -98);
                    field1796.field1653 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field1790; var53++) {
                    field1796.method733(128, this.field1793[var53]);
                    field1796.method733(128, this.field1802[var53]);
                    field1796.field1653 += var6 - 8;
                }
            }
        }
        field1796.field1653 = this.field1790 * var6;
        if (arg0) {
            if (class117.field2148) {
                ByteBuffer var54 = ByteBuffer.wrap(field1796.field1681, 0, field1796.field1653);
                if (this.field1824 == null) {
                    this.field1824 = new class75(true);
                    this.field1824.method534(var54);
                } else {
                    this.field1824.method535(var54);
                }
                if (arg1) {
                    this.field1815.field3597 = true;
                    this.field1815.field3583 = null;
                    this.field1815.field3582 = this.field1824;
                    this.field1815.field3585 = var6;
                }
                if (arg2) {
                    this.field1807.field3597 = true;
                    this.field1807.field3583 = null;
                    this.field1807.field3582 = this.field1824;
                    this.field1807.field3585 = var6;
                }
                if (arg3) {
                    this.field1828.field3597 = true;
                    this.field1828.field3583 = null;
                    this.field1828.field3582 = this.field1824;
                    this.field1828.field3585 = var6;
                }
                if (arg4) {
                    this.field1818.field3597 = true;
                    this.field1818.field3583 = null;
                    this.field1818.field3582 = this.field1824;
                    this.field1818.field3585 = var6;
                }
            } else {
                if (field1831 == null || field1831.capacity() < field1796.field1653) {
                    field1831 = ByteBuffer.allocateDirect(var6 * 100 + field1796.field1653);
                } else {
                    field1831.clear();
                }
                field1831.put(field1796.field1681, 0, field1796.field1653);
                field1831.flip();
                if (arg1) {
                    this.field1815.field3597 = true;
                    this.field1815.field3583 = field1831;
                    this.field1815.field3582 = null;
                    this.field1815.field3585 = var6;
                }
                if (arg2) {
                    this.field1807.field3597 = true;
                    this.field1807.field3583 = field1831;
                    this.field1815.field3582 = null;
                    this.field1807.field3585 = var6;
                }
                if (arg3) {
                    this.field1828.field3597 = true;
                    this.field1828.field3583 = field1831;
                    this.field1828.field3582 = null;
                    this.field1828.field3585 = var6;
                }
                if (arg4) {
                    this.field1818.field3597 = true;
                    this.field1818.field3583 = field1831;
                    this.field1818.field3582 = null;
                    this.field1818.field3585 = var6;
                }
            }
        } else if (class117.field2145) {
            class75 var55 = new class75();
            ByteBuffer var56 = ByteBuffer.wrap(field1796.field1681, 0, field1796.field1653);
            var55.method534(var56);
            if (arg1) {
                this.field1815.field3597 = true;
                this.field1815.field3583 = null;
                this.field1815.field3582 = var55;
                this.field1815.field3585 = var6;
            }
            if (arg2) {
                this.field1807.field3597 = true;
                this.field1807.field3583 = null;
                this.field1807.field3582 = var55;
                this.field1807.field3585 = var6;
            }
            if (arg3) {
                this.field1828.field3597 = true;
                this.field1828.field3583 = null;
                this.field1828.field3582 = var55;
                this.field1828.field3585 = var6;
            }
            if (arg4) {
                this.field1818.field3597 = true;
                this.field1818.field3583 = null;
                this.field1818.field3582 = var55;
                this.field1818.field3585 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field1796.field1653);
            var57.put(field1796.field1681, 0, field1796.field1653);
            var57.flip();
            if (arg1) {
                this.field1815.field3597 = true;
                this.field1815.field3583 = var57;
                this.field1815.field3582 = null;
                this.field1815.field3585 = var6;
            }
            if (arg2) {
                this.field1807.field3597 = true;
                this.field1807.field3583 = var57;
                this.field1815.field3582 = null;
                this.field1807.field3585 = var6;
            }
            if (arg3) {
                this.field1828.field3597 = true;
                this.field1828.field3583 = var57;
                this.field1828.field3582 = null;
                this.field1828.field3585 = var6;
            }
            if (arg4) {
                this.field1818.field3597 = true;
                this.field1818.field3583 = var57;
                this.field1818.field3582 = null;
                this.field1818.field3585 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "()V", line = 3674)
    private final void method834() {
        if (field1796.field1681.length < this.field1790 * 12) {
            field1796 = new class94((this.field1790 + 100) * 12);
        } else {
            field1796.field1653 = 0;
        }
        if (class117.field2135) {
            for (int var1 = 0; var1 < this.field1816; var1++) {
                field1796.method730(false, this.field1829[var1]);
                field1796.method730(false, this.field1795[var1]);
                field1796.method730(false, this.field1800[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field1816; var2++) {
                field1796.method718((byte) -97, this.field1829[var2]);
                field1796.method718((byte) -79, this.field1795[var2]);
                field1796.method718((byte) -93, this.field1800[var2]);
            }
        }
        if (!class117.field2145) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field1796.field1653);
            var5.put(field1796.field1681, 0, field1796.field1653);
            var5.flip();
            this.field1809.field3597 = true;
            this.field1809.field3583 = var5;
            this.field1809.field3582 = null;
            return;
        }
        class75 var3 = new class75();
        ByteBuffer var4 = ByteBuffer.wrap(field1796.field1681, 0, field1796.field1653);
        var3.method534(var4);
        this.field1809.field3597 = true;
        this.field1809.field3583 = null;
        this.field1809.field3582 = var3;
    }
}
