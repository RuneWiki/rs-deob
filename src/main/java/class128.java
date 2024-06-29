import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class128 extends class81 {

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public int field1716 = 0;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    private int field1715 = 0;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "B")
    private byte field1714 = 0;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    private int field1721 = 0;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "Z")
    public boolean field1734 = false;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "B")
    private byte field1742 = 0;

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
    private int field1744 = 0;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "[I")
    private int[] field1729;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "[I")
    public int[] field1732;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "[I")
    public int[] field1710;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
    public int[] field1699;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "[I")
    private int[] field1704;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "[S")
    private short[] field1730;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "[Lsk;")
    public class238[] field1746;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "[Lu;")
    public class35[] field1712;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "[S")
    private short[] field1727;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "[S")
    private short[] field1706;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "[S")
    private short[] field1698;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "[S")
    private short[] field1703;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "[F")
    private float[] field1728;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "[F")
    private float[] field1722;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "[S")
    private short[] field1711;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "[B")
    private byte[] field1738;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "[S")
    private short[] field1720;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "[S")
    private short[] field1731;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "[S")
    private short[] field1733;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "[S")
    private short[] field1709;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "[B")
    private byte[] field1726;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[S")
    private short[] field1700;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "Lba;")
    public class334 field1724;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Lff;")
    public class353 field1701;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "Lff;")
    private class353 field1723;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Lff;")
    private class353 field1702;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "Lff;")
    private class353 field1708;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "Lff;")
    private class353 field1717;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "S")
    private short field1705;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "S")
    private short field1707;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "[S")
    private short[] field1718;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "[I")
    private int[] field1719;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "Lfd;")
    private static class299 field1725 = new class299(10000);

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "Ls;")
    private static class128 field1739 = new class128();

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "Ls;")
    private static class128 field1743 = new class128();

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "Ls;")
    private static class128 field1745 = new class128();

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "Ls;")
    private static class128 field1747 = new class128();

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "Ls;")
    private static class128 field1748 = new class128();

    @OriginalMember(owner = "client!s", name = "ob", descriptor = "Ls;")
    private static class128 field1749 = new class128();

    @OriginalMember(owner = "client!s", name = "qb", descriptor = "Z")
    private static boolean field1751 = false;

    @OriginalMember(owner = "client!s", name = "yb", descriptor = "[I")
    private static int[] field1759 = new int[1];

    @OriginalMember(owner = "client!s", name = "ub", descriptor = "[I")
    private static int[] field1755 = new int[1];

    @OriginalMember(owner = "client!s", name = "sb", descriptor = "F")
    private static float field1753;

    @OriginalMember(owner = "client!s", name = "tb", descriptor = "F")
    private static float field1754;

    @OriginalMember(owner = "client!s", name = "vb", descriptor = "F")
    private static float field1756;

    @OriginalMember(owner = "client!s", name = "wb", descriptor = "F")
    private static float field1757;

    @OriginalMember(owner = "client!s", name = "zb", descriptor = "F")
    private static float field1760;

    @OriginalMember(owner = "client!s", name = "Ab", descriptor = "F")
    private static float field1761;

    @OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
    private static int field1750;

    @OriginalMember(owner = "client!s", name = "rb", descriptor = "I")
    private static int field1752;

    @OriginalMember(owner = "client!s", name = "xb", descriptor = "I")
    private static int field1758;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "Lrj;")
    private class19 field1713;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "Llk;")
    private class34 field1736;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1741;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "[J")
    private static long[] field1737;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "[[I")
    private int[][] field1735;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "[[I")
    private int[][] field1740;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lvc;", line = 5)
    public final class260 method943(int arg0, int arg1, int arg2) {
        this.field1734 = false;
        if (this.field1713 != null) {
            this.field1727 = this.field1713.field216;
            this.field1706 = this.field1713.field214;
            this.field1698 = this.field1713.field215;
            this.field1703 = this.field1713.field217;
            this.field1713 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "()I", line = 18)
    public final int method575() {
        if (!this.field1724.field5221) {
            this.method966();
        }
        return this.field1724.field5220;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(SS)V", line = 28)
    public final void method944(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1721; var3++) {
            if (this.field1709[var3] == arg0) {
                this.field1709[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class350.field5467.method911(arg0 & 0xFFFF, false);
            var5 = class350.field5467.method908((byte) -119, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class350.field5467.method911(arg1 & 0xFFFF, false);
            var7 = class350.field5467.method908((byte) -119, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field1723.field5506 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "n", descriptor = "()V", line = 63)
    public static void method945() {
        field1737 = null;
        field1725 = null;
        field1741 = null;
        field1739 = null;
        field1743 = null;
        field1745 = null;
        field1747 = null;
        field1748 = null;
        field1749 = null;
        field1759 = null;
        field1755 = null;
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "()I", line = 76)
    public final int method588() {
        if (!this.field1724.field5221) {
            this.method966();
        }
        return this.field1724.field5222;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIJILne;)V", line = 83)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class187 arg10) {
        if (this.field1744 == 0) {
            return;
        }
        if (!this.field1724.field5221) {
            this.method966();
        }
        short var13 = this.field1724.field5225;
        short var14 = this.field1724.field5226;
        short var15 = this.field1724.field5219;
        if (arg10 != null) {
            arg10.method1372(arg0, arg9, arg5, arg6, arg7);
        }
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class7.field71) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class237.field3432) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class124.field1652) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class40.field499) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class350.field5476[arg0];
            var27 = class350.field5474[arg0];
        }
        if (arg8 > 0L && class273.field3917 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class56.field723 >= var28 && class56.field723 <= var29 && class208.field2952 >= var30 && class208.field2952 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field1724.field5222;
                short var37 = this.field1724.field5223;
                short var38 = this.field1724.field5220;
                short var39 = this.field1724.field5224;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class56.field723 >= var32 && class56.field723 <= var33 && class208.field2952 >= var34 && class208.field2952 <= var35) {
                    if (this.field1040) {
                        class302.field4429[class66.field835++] = arg8;
                    } else {
                        if (field1759.length < this.field1744) {
                            field1759 = new int[this.field1744];
                            field1755 = new int[this.field1744];
                        }
                        int var59 = 0;
                        label124: while (true) {
                            if (var59 >= this.field1715) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field1721) {
                                        break label124;
                                    }
                                    short var80 = this.field1720[var79];
                                    short var81 = this.field1731[var79];
                                    short var82 = this.field1733[var79];
                                    if (this.method969(class56.field723, class208.field2952, field1755[var80], field1755[var81], field1755[var82], field1759[var80], field1759[var81], field1759[var82])) {
                                        class302.field4429[class66.field835++] = arg8;
                                        break label124;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field1732[var59];
                            int var61 = this.field1710[var59];
                            int var62 = this.field1699[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field1729[var59];
                            int var76 = this.field1729[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field1718[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field1759[var78] = var73;
                                field1755[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class47.field592;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method958();
        var83.glPopMatrix();
        if (arg10 != null) {
            arg10.method1355(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IIIIZ)V", line = 368)
    public final void method602(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field1750 = 0;
            field1752 = 0;
            field1758 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field1735.length) {
                    int[] var14 = this.field1735[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field1750 += this.field1732[var16];
                        field1752 += this.field1710[var16];
                        field1758 += this.field1699[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field1750 = field1750 / var11 + var8;
                field1752 = field1752 / var11 + var9;
                field1758 = field1758 / var11 + var10;
            } else {
                field1750 = var8;
                field1752 = var9;
                field1758 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field1735.length) {
                    int[] var22 = this.field1735[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field1732[var24] += var17;
                        this.field1710[var24] += var18;
                        this.field1699[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1735.length) {
                    int[] var27 = this.field1735[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field1732[var29] -= field1750;
                        this.field1710[var29] -= field1752;
                        this.field1699[var29] -= field1758;
                        if (arg4 != 0) {
                            int var30 = class350.field5476[arg4];
                            int var31 = class350.field5474[arg4];
                            int var32 = this.field1732[var29] * var31 + this.field1710[var29] * var30 + 32767 >> 16;
                            this.field1710[var29] = this.field1710[var29] * var31 + 32767 - this.field1732[var29] * var30 >> 16;
                            this.field1732[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class350.field5476[arg2];
                            int var34 = class350.field5474[arg2];
                            int var35 = this.field1710[var29] * var34 + 32767 - this.field1699[var29] * var33 >> 16;
                            this.field1699[var29] = this.field1710[var29] * var33 + this.field1699[var29] * var34 + 32767 >> 16;
                            this.field1710[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class350.field5476[arg3];
                            int var37 = class350.field5474[arg3];
                            int var38 = this.field1732[var29] * var37 + this.field1699[var29] * var36 + 32767 >> 16;
                            this.field1699[var29] = this.field1699[var29] * var37 + 32767 - this.field1732[var29] * var36 >> 16;
                            this.field1732[var29] = var38;
                        }
                        this.field1732[var29] += field1750;
                        this.field1710[var29] += field1752;
                        this.field1699[var29] += field1758;
                    }
                }
            }
            if (arg5 && this.field1727 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field1735.length) {
                        int[] var41 = this.field1735[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field1729[var43];
                            int var45 = this.field1729[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field1718[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class350.field5476[arg4];
                                    int var49 = class350.field5474[arg4];
                                    int var50 = this.field1727[var47] * var49 + this.field1706[var47] * var48 + 32767 >> 16;
                                    this.field1706[var47] = (short) (this.field1706[var47] * var49 + 32767 - this.field1727[var47] * var48 >> 16);
                                    this.field1727[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class350.field5476[arg2];
                                    int var52 = class350.field5474[arg2];
                                    int var53 = this.field1706[var47] * var52 + 32767 - this.field1698[var47] * var51 >> 16;
                                    this.field1698[var47] = (short) (this.field1706[var47] * var51 + this.field1698[var47] * var52 + 32767 >> 16);
                                    this.field1706[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class350.field5476[arg3];
                                    int var55 = class350.field5474[arg3];
                                    int var56 = this.field1727[var47] * var55 + this.field1698[var47] * var54 + 32767 >> 16;
                                    this.field1698[var47] = (short) (this.field1698[var47] * var55 + 32767 - this.field1727[var47] * var54 >> 16);
                                    this.field1727[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field1702 != null) {
                    this.field1702.field5506 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field1735.length) {
                    int[] var59 = this.field1735[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field1732[var61] -= field1750;
                        this.field1710[var61] -= field1752;
                        this.field1699[var61] -= field1758;
                        this.field1732[var61] = this.field1732[var61] * arg2 >> 7;
                        this.field1710[var61] = this.field1710[var61] * arg3 >> 7;
                        this.field1699[var61] = this.field1699[var61] * arg4 >> 7;
                        this.field1732[var61] += field1750;
                        this.field1710[var61] += field1752;
                        this.field1699[var61] += field1758;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1740 != null && this.field1738 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field1740.length) {
                        int[] var64 = this.field1740[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field1738[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field1738[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field1723.field5506 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field1740 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field1740.length) {
                    int[] var70 = this.field1740[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field1711[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field1711[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field1723.field5506 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "()I", line = 775)
    public final int method583() {
        if (!this.field1724.field5221) {
            this.method966();
        }
        return this.field1724.field5226;
    }

    @OriginalMember(owner = "client!s", name = "o", descriptor = "()I", line = 782)
    public final int method946() {
        return this.field1705;
    }

    @OriginalMember(owner = "client!s", name = "p", descriptor = "()V", line = 785)
    public final void method947() {
        if (this.field1727 == null) {
            this.method586();
            return;
        }
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1699[var1];
            this.field1699[var1] = this.field1732[var1];
            this.field1732[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1744; var3++) {
            short var4 = this.field1698[var3];
            this.field1698[var3] = this.field1727[var3];
            this.field1727[var3] = (short) (-var4);
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
        if (this.field1702 != null) {
            this.field1702.field5506 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "()I", line = 826)
    public final int method584() {
        if (!this.field1724.field5221) {
            this.method966();
        }
        return this.field1724.field5225;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIJ)V", line = 832)
    public final void method579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field1744 == 0) {
            return;
        }
        GL var10 = class47.field592;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method958();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 857)
    public final void method571(int arg0) {
        int var2 = class350.field5476[arg0];
        int var3 = class350.field5474[arg0];
        for (int var4 = 0; var4 < this.field1716; var4++) {
            int var5 = this.field1732[var4] * var3 + this.field1699[var4] * var2 >> 16;
            this.field1699[var4] = this.field1699[var4] * var3 - this.field1732[var4] * var2 >> 16;
            this.field1732[var4] = var5;
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "q", descriptor = "()V", line = 879)
    public final void method948() {
        if (this.field1727 == null) {
            this.method587();
            return;
        }
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1732[var1] = -this.field1732[var1];
            this.field1699[var1] = -this.field1699[var1];
        }
        for (int var2 = 0; var2 < this.field1744; var2++) {
            this.field1727[var2] = (short) (-this.field1727[var2]);
            this.field1698[var2] = (short) (-this.field1698[var2]);
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
        if (this.field1702 != null) {
            this.field1702.field5506 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "r", descriptor = "()V", line = 914)
    public final void method949() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1699[var1] = -this.field1699[var1];
        }
        if (this.field1698 != null) {
            for (int var2 = 0; var2 < this.field1744; var2++) {
                this.field1698[var2] = (short) (-this.field1698[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field1721; var3++) {
            short var4 = this.field1720[var3];
            this.field1720[var3] = this.field1733[var3];
            this.field1733[var3] = var4;
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
        if (this.field1702 != null) {
            this.field1702.field5506 = false;
        }
        this.field1717.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "j", descriptor = "()Z", line = 950)
    public final boolean method589() {
        if (this.field1735 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1732[var1] <<= 0x4;
            this.field1710[var1] <<= 0x4;
            this.field1699[var1] <<= 0x4;
        }
        field1750 = 0;
        field1752 = 0;
        field1758 = 0;
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()Z", line = 971)
    public final boolean method950() {
        return this.field1734 && this.field1732 != null && this.field1727 != null;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V", line = 976)
    public final void method591(int arg0) {
        int var2 = class350.field5476[arg0];
        int var3 = class350.field5474[arg0];
        for (int var4 = 0; var4 < this.field1716; var4++) {
            int var5 = this.field1710[var4] * var3 - this.field1699[var4] * var2 >> 16;
            this.field1699[var4] = this.field1710[var4] * var2 + this.field1699[var4] * var3 >> 16;
            this.field1710[var4] = var5;
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "s", descriptor = "()V", line = 997)
    private final void method951() {
        if (field1725.field4350.length < this.field1721 * 12) {
            field1725 = new class299((this.field1721 + 100) * 12);
        } else {
            field1725.field4351 = 0;
        }
        if (class47.field593) {
            for (int var1 = 0; var1 < this.field1721; var1++) {
                field1725.method2084(true, this.field1720[var1]);
                field1725.method2084(true, this.field1731[var1]);
                field1725.method2084(true, this.field1733[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field1721; var2++) {
                field1725.method2066(this.field1720[var2], false);
                field1725.method2066(this.field1731[var2], false);
                field1725.method2066(this.field1733[var2], false);
            }
        }
        if (!class47.field618) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field1725.field4351);
            var5.put(field1725.field4350, 0, field1725.field4351);
            var5.flip();
            this.field1717.field5506 = true;
            this.field1717.field5511 = var5;
            this.field1717.field5513 = null;
            return;
        }
        class34 var3 = new class34();
        ByteBuffer var4 = ByteBuffer.wrap(field1725.field4350, 0, field1725.field4351);
        var3.method218(var4);
        this.field1717.field5506 = true;
        this.field1717.field5511 = null;
        this.field1717.field5513 = var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZZZZZZZ)Ls;", line = 1057)
    public final class128 method952(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class128 var12 = new class128();
        var12.field1716 = this.field1716;
        var12.field1715 = this.field1715;
        var12.field1744 = this.field1744;
        var12.field1721 = this.field1721;
        if (arg0) {
            var12.field1732 = this.field1732;
            var12.field1699 = this.field1699;
        } else {
            var12.field1732 = class15.method111(this.field1732, -123);
            var12.field1699 = class15.method111(this.field1699, -116);
        }
        if (arg1) {
            var12.field1710 = this.field1710;
        } else {
            var12.field1710 = class15.method111(this.field1710, -105);
        }
        if (arg0 && arg1) {
            var12.field1701 = this.field1701;
            var12.field1724 = this.field1724;
        } else {
            var12.field1701 = new class353();
            var12.field1724 = new class334();
        }
        if (arg2) {
            var12.field1711 = this.field1711;
        } else {
            var12.field1711 = class198.method1448(this.field1711, (byte) 119);
        }
        if (arg3) {
            var12.field1738 = this.field1738;
        } else {
            var12.field1738 = class209.method1538(64, this.field1738);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class67.field856) {
            var12.field1723 = new class353();
        } else {
            var12.field1723 = this.field1723;
        }
        if (arg5) {
            var12.field1727 = this.field1727;
            var12.field1706 = this.field1706;
            var12.field1698 = this.field1698;
            var12.field1703 = this.field1703;
        } else {
            var12.field1727 = class198.method1448(this.field1727, (byte) 121);
            var12.field1706 = class198.method1448(this.field1706, (byte) 119);
            var12.field1698 = class198.method1448(this.field1698, (byte) -120);
            var12.field1703 = class198.method1448(this.field1703, (byte) -85);
        }
        if (!class67.field856) {
            var12.field1702 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field1702 = this.field1702;
        } else {
            var12.field1702 = new class353();
        }
        if (arg8) {
            var12.field1728 = this.field1728;
            var12.field1722 = this.field1722;
            var12.field1708 = this.field1708;
        } else {
            var12.field1728 = class14.method105(-5899, this.field1728);
            var12.field1722 = class14.method105(-5899, this.field1722);
            var12.field1708 = new class353();
        }
        if (arg9) {
            var12.field1720 = this.field1720;
            var12.field1731 = this.field1731;
            var12.field1733 = this.field1733;
            var12.field1717 = this.field1717;
        } else {
            var12.field1720 = class198.method1448(this.field1720, (byte) -105);
            var12.field1731 = class198.method1448(this.field1731, (byte) 126);
            var12.field1733 = class198.method1448(this.field1733, (byte) 127);
            var12.field1717 = new class353();
        }
        if (arg10) {
            var12.field1709 = this.field1709;
        } else {
            var12.field1709 = class198.method1448(this.field1709, (byte) 119);
        }
        var12.field1704 = this.field1704;
        var12.field1735 = this.field1735;
        var12.field1726 = this.field1726;
        var12.field1740 = this.field1740;
        var12.field1719 = this.field1719;
        var12.field1718 = this.field1718;
        var12.field1729 = this.field1729;
        var12.field1705 = this.field1705;
        var12.field1707 = this.field1707;
        var12.field1746 = this.field1746;
        var12.field1712 = this.field1712;
        var12.field1730 = this.field1730;
        var12.field1700 = this.field1700;
        return var12;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lml;IJIIIIFF)S", line = 1202)
    private final short method953(class197 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field1729[arg1];
        int var12 = this.field1729[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field1718[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field1737[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field1718[var13] = (short) (this.field1744 + 1);
        field1737[var13] = arg2;
        this.field1727[this.field1744] = (short) arg3;
        this.field1706[this.field1744] = (short) arg4;
        this.field1698[this.field1744] = (short) arg5;
        this.field1703[this.field1744] = (short) arg6;
        this.field1728[this.field1744] = arg7;
        this.field1722[this.field1744] = arg8;
        return (short) (this.field1744++);
    }

    @OriginalMember(owner = "client!s", name = "l", descriptor = "()I", line = 1238)
    public final int method600() {
        if (!this.field1724.field5221) {
            this.method966();
        }
        return this.field1724.field5224;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lfe;)Lfe;", line = 1244)
    public final class153 method954(class153 arg0) {
        if (this.field1744 == 0) {
            return null;
        }
        if (!this.field1724.field5221) {
            this.method966();
        }
        int var2;
        int var3;
        if (class41.field518 > 0) {
            var2 = this.field1724.field5222 - (class41.field518 * this.field1724.field5219 >> 8) >> 3;
            var3 = this.field1724.field5223 - (class41.field518 * this.field1724.field5226 >> 8) >> 3;
        } else {
            var2 = this.field1724.field5222 - (class41.field518 * this.field1724.field5226 >> 8) >> 3;
            var3 = this.field1724.field5223 - (class41.field518 * this.field1724.field5219 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class41.field511 > 0) {
            var4 = this.field1724.field5220 - (class41.field511 * this.field1724.field5219 >> 8) >> 3;
            var5 = this.field1724.field5224 - (class41.field511 * this.field1724.field5226 >> 8) >> 3;
        } else {
            var4 = this.field1724.field5220 - (class41.field511 * this.field1724.field5226 >> 8) >> 3;
            var5 = this.field1724.field5224 - (class41.field511 * this.field1724.field5219 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class153 var8;
        if (arg0 == null || arg0.field2140.length < var6 * var7) {
            var8 = new class153(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field2028 = arg0.field2024 = var6;
            arg0.field2026 = arg0.field2029 = var7;
            arg0.method1174();
        }
        var8.field2018 = var2;
        var8.field2019 = var4;
        if (field1759.length < this.field1744) {
            field1759 = new int[this.field1744];
            field1755 = new int[this.field1744];
        }
        for (int var9 = 0; var9 < this.field1715; var9++) {
            int var10 = (this.field1732[var9] - (this.field1710[var9] * class41.field518 >> 8) >> 3) - var2;
            int var11 = (this.field1699[var9] - (this.field1710[var9] * class41.field511 >> 8) >> 3) - var4;
            int var12 = this.field1729[var9];
            int var13 = this.field1729[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field1718[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field1759[var15] = var10;
                field1755[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field1721; var16++) {
            if (this.field1738[var16] <= 128) {
                short var17 = this.field1720[var16];
                short var18 = this.field1731[var16];
                short var19 = this.field1733[var16];
                int var20 = field1759[var17];
                int var21 = field1759[var18];
                int var22 = field1759[var19];
                int var23 = field1755[var17];
                int var24 = field1755[var18];
                int var25 = field1755[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class350.method2435(var8.field2140, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 4564)
    private class128() {
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lml;IIZ)V", line = 4583)
    public class128(class197 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2719];
        this.field1729 = new int[arg0.field2759 + 1];
        for (int var6 = 0; var6 < arg0.field2719; var6++) {
            if ((arg0.field2758 == null || arg0.field2758[var6] != 2) && (arg0.field2713 == null || arg0.field2713[var6] == -1 || !class350.field5467.method903(arg0.field2713[var6] & 0xFFFF, (byte) 26))) {
                var5[this.field1721++] = var6;
                this.field1729[arg0.field2760[var6]]++;
                this.field1729[arg0.field2754[var6]]++;
                this.field1729[arg0.field2761[var6]]++;
            }
        }
        long[] var7 = new long[this.field1721];
        for (int var8 = 0; var8 < this.field1721; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2713 != null) {
                var14 = arg0.field2713[var9];
                if (var14 != -1) {
                    var12 = class350.field5467.method905(var14 & 0xFFFF, 255);
                    var13 = class350.field5467.method916(var14 & 0xFFFF, 114);
                }
            }
            boolean var15 = arg0.field2727 != null && arg0.field2727[var9] != 0 || var14 != -1 && !class350.field5467.method904(-1, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field2742 != null) {
                var10 += arg0.field2742[var9] << 17;
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
        class287.method1963((byte) -46, var5, var7);
        this.field1716 = arg0.field2759;
        this.field1715 = arg0.field2749;
        this.field1732 = arg0.field2753;
        this.field1710 = arg0.field2724;
        this.field1699 = arg0.field2744;
        this.field1704 = arg0.field2723;
        this.field1730 = arg0.field2715;
        this.field1746 = arg0.field2734;
        this.field1712 = arg0.field2750;
        int var20 = this.field1721 * 3;
        this.field1727 = new short[var20];
        this.field1706 = new short[var20];
        this.field1698 = new short[var20];
        this.field1703 = new short[var20];
        this.field1728 = new float[var20];
        this.field1722 = new float[var20];
        this.field1711 = new short[this.field1721];
        this.field1738 = new byte[this.field1721];
        this.field1720 = new short[this.field1721];
        this.field1731 = new short[this.field1721];
        this.field1733 = new short[this.field1721];
        this.field1709 = new short[this.field1721];
        if (arg0.field2735 != null) {
            this.field1726 = new byte[this.field1721];
        }
        if (arg0.field2730 != null) {
            this.field1700 = new short[this.field1721];
        }
        this.field1724 = new class334();
        this.field1701 = new class353();
        this.field1723 = new class353();
        if (class67.field856) {
            this.field1702 = new class353();
        }
        this.field1708 = new class353();
        this.field1717 = new class353();
        this.field1705 = (short) arg1;
        this.field1707 = (short) arg2;
        this.field1718 = new short[var20];
        field1737 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field1715; var22++) {
            int var23 = this.field1729[var22];
            this.field1729[var22] = var21;
            var21 += var23;
        }
        this.field1729[this.field1715] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2739 != null) {
            int var28 = arg0.field2718;
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
            for (int var36 = 0; var36 < this.field1721; var36++) {
                int var37 = var5[var36];
                if (arg0.field2739[var37] != -1) {
                    int var38 = arg0.field2739[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2760[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2754[var37];
                        } else {
                            var40 = arg0.field2761[var37];
                        }
                        int var41 = arg0.field2753[var40];
                        int var42 = arg0.field2724[var40];
                        int var43 = arg0.field2744[var40];
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
                byte var45 = arg0.field2748[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2766[var44];
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
                        var49 = 64.0F / (float) (arg0.field2736[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2766[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2736[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2763[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2766[var44] / 1024.0F;
                        var49 = (float) arg0.field2736[var44] / 1024.0F;
                        var48 = (float) arg0.field2763[var44] / 1024.0F;
                    }
                    var27[var44] = method965(arg0.field2764[var44], arg0.field2738[var44], arg0.field2755[var44], arg0.field2740[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field1721; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2720[var51] & 0xFFFF;
            short var53;
            if (arg0.field2713 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2713[var51];
            }
            int var54;
            if (arg0.field2739 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2739[var51];
            }
            int var55;
            if (arg0.field2727 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2727[var51] & 0xFF;
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
                    byte var65 = arg0.field2748[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2760[var51];
                        int var67 = arg0.field2754[var51];
                        int var68 = arg0.field2761[var51];
                        short var69 = arg0.field2764[var54];
                        short var70 = arg0.field2738[var54];
                        short var71 = arg0.field2755[var54];
                        float var72 = (float) arg0.field2753[var69];
                        float var73 = (float) arg0.field2724[var69];
                        float var74 = (float) arg0.field2744[var69];
                        float var75 = (float) arg0.field2753[var70] - var72;
                        float var76 = (float) arg0.field2724[var70] - var73;
                        float var77 = (float) arg0.field2744[var70] - var74;
                        float var78 = (float) arg0.field2753[var71] - var72;
                        float var79 = (float) arg0.field2724[var71] - var73;
                        float var80 = (float) arg0.field2744[var71] - var74;
                        float var81 = (float) arg0.field2753[var66] - var72;
                        float var82 = (float) arg0.field2724[var66] - var73;
                        float var83 = (float) arg0.field2744[var66] - var74;
                        float var84 = (float) arg0.field2753[var67] - var72;
                        float var85 = (float) arg0.field2724[var67] - var73;
                        float var86 = (float) arg0.field2744[var67] - var74;
                        float var87 = (float) arg0.field2753[var68] - var72;
                        float var88 = (float) arg0.field2724[var68] - var73;
                        float var89 = (float) arg0.field2744[var68] - var74;
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
                        int var101 = arg0.field2760[var51];
                        int var102 = arg0.field2754[var51];
                        int var103 = arg0.field2761[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2751[var54];
                        float var109 = (float) arg0.field2733[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2763[var54] & 0xFFFF) / 1024.0F;
                            method972(arg0.field2753[var101], arg0.field2724[var101], arg0.field2744[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field1753;
                            var57 = field1757;
                            method972(arg0.field2753[var102], arg0.field2724[var102], arg0.field2744[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field1753;
                            var59 = field1757;
                            method972(arg0.field2753[var103], arg0.field2724[var103], arg0.field2744[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field1753;
                            var61 = field1757;
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
                            float var112 = (float) arg0.field2722[var54] / 256.0F;
                            float var113 = (float) arg0.field2714[var54] / 256.0F;
                            int var114 = arg0.field2753[var102] - arg0.field2753[var101];
                            int var115 = arg0.field2724[var102] - arg0.field2724[var101];
                            int var116 = arg0.field2744[var102] - arg0.field2744[var101];
                            int var117 = arg0.field2753[var103] - arg0.field2753[var101];
                            int var118 = arg0.field2724[var103] - arg0.field2724[var101];
                            int var119 = arg0.field2744[var103] - arg0.field2744[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2766[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2736[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2763[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method978(var126, var127, var128);
                            method956(arg0.field2753[var101], arg0.field2724[var101], arg0.field2744[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field1760;
                            var57 = field1754;
                            method956(arg0.field2753[var102], arg0.field2724[var102], arg0.field2744[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field1760;
                            var59 = field1754;
                            method956(arg0.field2753[var103], arg0.field2724[var103], arg0.field2744[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field1760;
                            var61 = field1754;
                        } else if (var65 == 3) {
                            method975(arg0.field2753[var101], arg0.field2724[var101], arg0.field2744[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field1761;
                            var57 = field1756;
                            method975(arg0.field2753[var102], arg0.field2724[var102], arg0.field2744[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field1761;
                            var59 = field1756;
                            method975(arg0.field2753[var103], arg0.field2724[var103], arg0.field2744[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field1761;
                            var61 = field1756;
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
            arg0.method1442();
            byte var129;
            if (arg0.field2758 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2758[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2760[var51];
                class100 var133 = arg0.field2741[var132];
                this.field1720[var50] = this.method953(arg0, var132, var130, var133.field1304, var133.field1302, var133.field1310, var133.field1303, var56, var57);
                int var134 = arg0.field2754[var51];
                class100 var135 = arg0.field2741[var134];
                this.field1731[var50] = this.method953(arg0, var134, (long) var62 + var130, var135.field1304, var135.field1302, var135.field1310, var135.field1303, var58, var59);
                int var136 = arg0.field2761[var51];
                class100 var137 = arg0.field2741[var136];
                this.field1733[var50] = this.method953(arg0, var136, (long) var63 + var130, var137.field1304, var137.field1302, var137.field1310, var137.field1303, var60, var61);
            } else if (var129 == 1) {
                class73 var138 = arg0.field2743[var51];
                long var139 = (long) ((var54 << 2) + (var138.field972 > 0 ? 1024 : 2048) + (var138.field969 + 256 << 12) + (var138.field973 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field1720[var50] = this.method953(arg0, arg0.field2760[var51], var139, var138.field972, var138.field969, var138.field973, 0, var56, var57);
                this.field1731[var50] = this.method953(arg0, arg0.field2754[var51], (long) var62 + var139, var138.field972, var138.field969, var138.field973, 0, var58, var59);
                this.field1733[var50] = this.method953(arg0, arg0.field2761[var51], (long) var63 + var139, var138.field972, var138.field969, var138.field973, 0, var60, var61);
            }
            if (arg0.field2713 == null) {
                this.field1709[var50] = -1;
            } else {
                this.field1709[var50] = arg0.field2713[var51];
            }
            if (this.field1726 != null) {
                this.field1726[var50] = (byte) arg0.field2735[var51];
            }
            this.field1711[var50] = arg0.field2720[var51];
            if (arg0.field2727 != null) {
                this.field1738[var50] = arg0.field2727[var51];
            }
            if (arg0.field2730 != null) {
                this.field1700[var50] = arg0.field2730[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field1721; var143++) {
            short var144 = this.field1709[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field1719 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field1721; var147++) {
            short var148 = this.field1709[var147];
            if (var146 != var148) {
                this.field1719[var145++] = var147;
                var146 = var148;
            }
        }
        this.field1719[var145] = this.field1721;
        field1737 = null;
        this.field1727 = method960(this.field1727, this.field1744);
        this.field1706 = method960(this.field1706, this.field1744);
        this.field1698 = method960(this.field1698, this.field1744);
        this.field1703 = method960(this.field1703, this.field1744);
        this.field1728 = method976(this.field1728, this.field1744);
        this.field1722 = method976(this.field1722, this.field1744);
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V", line = 1370)
    public final void method955(int arg0) {
        this.field1705 = (short) arg0;
        this.field1723.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(ZZZ)Lvg;", line = 1375)
    public final class81 method595(boolean arg0, boolean arg1, boolean arg2) {
        return this.method974(arg0, arg1, arg2, field1747, field1745);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 1378)
    private static final void method956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field1760 = var18;
        field1754 = var19;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IIIIZI[I)V", line = 1457)
    public final void method596(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field1750 = 0;
            field1752 = 0;
            field1758 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1735.length) {
                    int[] var16 = this.field1735[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1730 == null || (arg6 & this.field1730[var18]) != 0) {
                            field1750 += this.field1732[var18];
                            field1752 += this.field1710[var18];
                            field1758 += this.field1699[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field1750 = field1750 / var13 + var10;
                field1752 = field1752 / var13 + var11;
                field1758 = field1758 / var13 + var12;
                field1751 = true;
            } else {
                field1750 = var10;
                field1752 = var11;
                field1758 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1735.length) {
                    int[] var27 = this.field1735[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1730 == null || (arg6 & this.field1730[var29]) != 0) {
                            this.field1732[var29] += var22;
                            this.field1710[var29] += var23;
                            this.field1699[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field1735.length) {
                        int[] var92 = this.field1735[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field1730 == null || (arg6 & this.field1730[var94]) != 0) {
                                this.field1732[var94] -= field1750;
                                this.field1710[var94] -= field1752;
                                this.field1699[var94] -= field1758;
                                if (arg4 != 0) {
                                    int var95 = class350.field5476[arg4];
                                    int var96 = class350.field5474[arg4];
                                    int var97 = this.field1732[var94] * var96 + this.field1710[var94] * var95 + 32767 >> 16;
                                    this.field1710[var94] = this.field1710[var94] * var96 + 32767 - this.field1732[var94] * var95 >> 16;
                                    this.field1732[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class350.field5476[arg2];
                                    int var99 = class350.field5474[arg2];
                                    int var100 = this.field1710[var94] * var99 + 32767 - this.field1699[var94] * var98 >> 16;
                                    this.field1699[var94] = this.field1710[var94] * var98 + this.field1699[var94] * var99 + 32767 >> 16;
                                    this.field1710[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class350.field5476[arg3];
                                    int var102 = class350.field5474[arg3];
                                    int var103 = this.field1732[var94] * var102 + this.field1699[var94] * var101 + 32767 >> 16;
                                    this.field1699[var94] = this.field1699[var94] * var102 + 32767 - this.field1732[var94] * var101 >> 16;
                                    this.field1732[var94] = var103;
                                }
                                this.field1732[var94] += field1750;
                                this.field1710[var94] += field1752;
                                this.field1699[var94] += field1758;
                            }
                        }
                    }
                }
                if (arg5 && this.field1727 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field1735.length) {
                            int[] var106 = this.field1735[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field1730 == null || (arg6 & this.field1730[var108]) != 0) {
                                    int var109 = this.field1729[var108];
                                    int var110 = this.field1729[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field1718[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class350.field5476[arg4];
                                            int var114 = class350.field5474[arg4];
                                            int var115 = this.field1727[var112] * var114 + this.field1706[var112] * var113 + 32767 >> 16;
                                            this.field1706[var112] = (short) (this.field1706[var112] * var114 + 32767 - this.field1727[var112] * var113 >> 16);
                                            this.field1727[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class350.field5476[arg2];
                                            int var117 = class350.field5474[arg2];
                                            int var118 = this.field1706[var112] * var117 + 32767 - this.field1698[var112] * var116 >> 16;
                                            this.field1698[var112] = (short) (this.field1706[var112] * var116 + this.field1698[var112] * var117 + 32767 >> 16);
                                            this.field1706[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class350.field5476[arg3];
                                            int var120 = class350.field5474[arg3];
                                            int var121 = this.field1727[var112] * var120 + this.field1698[var112] * var119 + 32767 >> 16;
                                            this.field1698[var112] = (short) (this.field1698[var112] * var120 + 32767 - this.field1727[var112] * var119 >> 16);
                                            this.field1727[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1702 != null) {
                        this.field1702.field5506 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field1751) {
                    int var36 = arg7[6] * field1758 + arg7[0] * field1750 + arg7[3] * field1752 + 16384 >> 15;
                    int var37 = arg7[7] * field1758 + arg7[1] * field1750 + arg7[4] * field1752 + 16384 >> 15;
                    int var38 = arg7[8] * field1758 + arg7[2] * field1750 + arg7[5] * field1752 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field1750 = var39;
                    field1752 = var40;
                    field1758 = var41;
                    field1751 = false;
                }
                int[] var42 = new int[9];
                int var43 = class350.field5474[arg2] >> 1;
                int var44 = class350.field5476[arg2] >> 1;
                int var45 = class350.field5474[arg3] >> 1;
                int var46 = class350.field5476[arg3] >> 1;
                int var47 = class350.field5474[arg4] >> 1;
                int var48 = class350.field5476[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field1758 + var42[0] * -field1750 + var42[1] * -field1752 + 16384 >> 15;
                int var52 = var42[5] * -field1758 + var42[3] * -field1750 + var42[4] * -field1752 + 16384 >> 15;
                int var53 = var42[8] * -field1758 + var42[6] * -field1750 + var42[7] * -field1752 + 16384 >> 15;
                int var54 = field1750 + var51;
                int var55 = field1752 + var52;
                int var56 = field1758 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field1735.length) {
                        int[] var81 = this.field1735[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field1730 == null || (arg6 & this.field1730[var83]) != 0) {
                                int var84 = this.field1699[var83] * var68[2] + this.field1732[var83] * var68[0] + this.field1710[var83] * var68[1] + 16384 >> 15;
                                int var85 = this.field1699[var83] * var68[5] + this.field1732[var83] * var68[3] + this.field1710[var83] * var68[4] + 16384 >> 15;
                                int var86 = this.field1699[var83] * var68[8] + this.field1732[var83] * var68[6] + this.field1710[var83] * var68[7] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field1732[var83] = var87;
                                this.field1710[var83] = var88;
                                this.field1699[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field1735.length) {
                        int[] var174 = this.field1735[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field1730 == null || (arg6 & this.field1730[var176]) != 0) {
                                this.field1732[var176] -= field1750;
                                this.field1710[var176] -= field1752;
                                this.field1699[var176] -= field1758;
                                this.field1732[var176] = this.field1732[var176] * arg2 >> 7;
                                this.field1710[var176] = this.field1710[var176] * arg3 >> 7;
                                this.field1699[var176] = this.field1699[var176] * arg4 >> 7;
                                this.field1732[var176] += field1750;
                                this.field1710[var176] += field1752;
                                this.field1699[var176] += field1758;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field1751) {
                    int var128 = arg7[6] * field1758 + arg7[0] * field1750 + arg7[3] * field1752 + 16384 >> 15;
                    int var129 = arg7[7] * field1758 + arg7[1] * field1750 + arg7[4] * field1752 + 16384 >> 15;
                    int var130 = arg7[8] * field1758 + arg7[2] * field1750 + arg7[5] * field1752 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field1750 = var131;
                    field1752 = var132;
                    field1758 = var133;
                    field1751 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field1750 * var134 + 16384 >> 15;
                int var138 = -field1752 * var135 + 16384 >> 15;
                int var139 = -field1758 * var136 + 16384 >> 15;
                int var140 = field1750 + var137;
                int var141 = field1752 + var138;
                int var142 = field1758 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field1735.length) {
                        int[] var163 = this.field1735[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field1730 == null || (arg6 & this.field1730[var165]) != 0) {
                                int var166 = this.field1699[var165] * var150[2] + this.field1732[var165] * var150[0] + this.field1710[var165] * var150[1] + 16384 >> 15;
                                int var167 = this.field1699[var165] * var150[5] + this.field1732[var165] * var150[3] + this.field1710[var165] * var150[4] + 16384 >> 15;
                                int var168 = this.field1699[var165] * var150[8] + this.field1732[var165] * var150[6] + this.field1710[var165] * var150[7] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field1732[var165] = var169;
                                this.field1710[var165] = var170;
                                this.field1699[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1740 != null && this.field1738 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field1740.length) {
                        int[] var179 = this.field1740[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field1700 == null || (arg6 & this.field1700[var181]) != 0) {
                                int var182 = (this.field1738[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field1738[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field1723.field5506 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field1740 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field1740.length) {
                    int[] var185 = this.field1740[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field1700 == null || (arg6 & this.field1700[var187]) != 0) {
                            int var188 = this.field1711[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field1711[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field1723.field5506 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V", line = 2247)
    public final void method957(int arg0) {
        if (this.field1727 == null) {
            this.method571(arg0);
            return;
        }
        int var2 = class350.field5476[arg0];
        int var3 = class350.field5474[arg0];
        for (int var4 = 0; var4 < this.field1716; var4++) {
            int var5 = this.field1732[var4] * var3 + this.field1699[var4] * var2 >> 16;
            this.field1699[var4] = this.field1699[var4] * var3 - this.field1732[var4] * var2 >> 16;
            this.field1732[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field1744; var6++) {
            int var7 = this.field1727[var6] * var3 + this.field1698[var6] * var2 >> 16;
            this.field1698[var6] = (short) (this.field1698[var6] * var3 - this.field1727[var6] * var2 >> 16);
            this.field1727[var6] = (short) var7;
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
        if (this.field1702 != null) {
            this.field1702.field5506 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "t", descriptor = "()V", line = 2291)
    private final void method958() {
        GL var1 = class47.field592;
        if (this.field1721 == 0) {
            return;
        }
        if (this.field1714 != 0) {
            this.method971(true, !this.field1701.field5506 && (this.field1714 & 0x1) != 0, !this.field1723.field5506 && (this.field1714 & 0x2) != 0, this.field1702 != null && !this.field1702.field5506 && (this.field1714 & 0x4) != 0, false);
        }
        this.method971(false, !this.field1701.field5506, !this.field1723.field5506, this.field1702 != null && !this.field1702.field5506, !this.field1708.field5506);
        if (!this.field1717.field5506) {
            this.method951();
        }
        if (this.field1742 != 0) {
            if ((this.field1742 & 0x1) != 0) {
                this.field1732 = null;
                this.field1710 = null;
                this.field1699 = null;
                this.field1718 = null;
                this.field1729 = null;
            }
            if ((this.field1742 & 0x2) != 0) {
                this.field1711 = null;
                this.field1738 = null;
            }
            if ((this.field1742 & 0x4) != 0) {
                this.field1727 = null;
                this.field1706 = null;
                this.field1698 = null;
                this.field1703 = null;
            }
            if ((this.field1742 & 0x8) != 0) {
                this.field1728 = null;
                this.field1722 = null;
            }
            if ((this.field1742 & 0x10) != 0) {
                this.field1720 = null;
                this.field1731 = null;
                this.field1733 = null;
            }
            this.field1742 = 0;
        }
        class34 var2 = null;
        if (this.field1701.field5513 != null) {
            this.field1701.field5513.method220();
            var2 = this.field1701.field5513;
            var1.glVertexPointer(3, 5126, this.field1701.field5512, (long) this.field1701.field5510);
        }
        if (this.field1723.field5513 != null) {
            if (this.field1723.field5513 != var2) {
                this.field1723.field5513.method220();
                var2 = this.field1723.field5513;
            }
            var1.glColorPointer(4, 5121, this.field1723.field5512, (long) this.field1723.field5510);
        }
        if (class67.field856 && this.field1702.field5513 != null) {
            if (this.field1702.field5513 != var2) {
                this.field1702.field5513.method220();
                var2 = this.field1702.field5513;
            }
            var1.glNormalPointer(5126, this.field1702.field5512, (long) this.field1702.field5510);
        }
        if (this.field1708.field5513 != null) {
            if (this.field1708.field5513 != var2) {
                this.field1708.field5513.method220();
                class34 var3 = this.field1708.field5513;
            }
            var1.glTexCoordPointer(2, 5126, this.field1708.field5512, (long) this.field1708.field5510);
        }
        if (this.field1717.field5513 != null) {
            this.field1717.field5513.method219();
        }
        if (this.field1701.field5513 == null || this.field1723.field5513 == null || class67.field856 && this.field1702.field5513 == null || this.field1708.field5513 == null) {
            if (class47.field618) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field1701.field5513 == null) {
                this.field1701.field5511.position(this.field1701.field5510);
                var1.glVertexPointer(3, 5126, this.field1701.field5512, this.field1701.field5511);
            }
            if (this.field1723.field5513 == null) {
                this.field1723.field5511.position(this.field1723.field5510);
                var1.glColorPointer(4, 5121, this.field1723.field5512, this.field1723.field5511);
            }
            if (class67.field856 && this.field1702.field5513 == null) {
                this.field1702.field5511.position(this.field1702.field5510);
                var1.glNormalPointer(5126, this.field1702.field5512, this.field1702.field5511);
            }
            if (this.field1708.field5513 == null) {
                this.field1708.field5511.position(this.field1708.field5510);
                var1.glTexCoordPointer(2, 5126, this.field1708.field5512, this.field1708.field5511);
            }
        }
        if (this.field1717.field5513 == null && class47.field618) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field1719.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field1719[var5];
            int var7 = this.field1719[var5 + 1];
            short var8 = this.field1709[var6];
            if (var8 == -1) {
                class47.method357(-1);
                class255.method1781(0, 0, -51);
            } else {
                class350.field5467.method912(64, var8 & 0xFFFF);
            }
            if (this.field1717.field5513 == null) {
                this.field1717.field5511.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field1717.field5511);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "k", descriptor = "()I", line = 2463)
    public final int method597() {
        if (!this.field1724.field5221) {
            this.method966();
        }
        return this.field1724.field5223;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "()V", line = 2472)
    public final void method576() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1732[var1] = this.field1732[var1] + 7 >> 4;
            this.field1710[var1] = this.field1710[var1] + 7 >> 4;
            this.field1699[var1] = this.field1699[var1] + 7 >> 4;
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(III)V", line = 2487)
    public final void method581(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1716; var4++) {
            this.field1732[var4] = this.field1732[var4] * arg0 >> 7;
            this.field1710[var4] = this.field1710[var4] * arg1 >> 7;
            this.field1699[var4] = this.field1699[var4] * arg2 >> 7;
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILs;[[I[[IIII)V", line = 2500)
    public final void method959(int arg0, int arg1, class128 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field1724.field5221) {
            arg2.method966();
        }
        int var9 = arg2.field1724.field5222 + arg5;
        int var10 = arg2.field1724.field5223 + arg5;
        int var11 = arg2.field1724.field5220 + arg7;
        int var12 = arg2.field1724.field5224 + arg7;
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
            for (int var17 = 0; var17 < this.field1715; var17++) {
                int var18 = this.field1732[var17] + arg5;
                int var19 = this.field1699[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field1710[var17] = this.field1710[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field1724.field5226;
            for (int var28 = 0; var28 < this.field1715; var28++) {
                int var29 = (this.field1710[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field1732[var28] + arg5;
                    int var31 = this.field1699[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field1710[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method599(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field1724.field5219 - arg2.field1724.field5226;
            for (int var42 = 0; var42 < this.field1715; var42++) {
                int var43 = this.field1732[var42] + arg5;
                int var44 = this.field1699[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field1710[var42] = var51 + this.field1710[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field1724.field5219 - arg2.field1724.field5226;
            for (int var53 = 0; var53 < this.field1715; var53++) {
                int var54 = this.field1732[var53] + arg5;
                int var55 = this.field1699[var53] + arg7;
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
                this.field1710[var53] = ((this.field1710[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field1701.field5506 = false;
        this.field1724.field5221 = false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([SI)[S", line = 2699)
    private static final short[] method960(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class87.method633(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V", line = 2705)
    public final void method961(int arg0) {
        this.field1707 = (short) arg0;
        if (this.field1702 != null) {
            this.field1702.field5506 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lvc;IIIZ)V", line = 2716)
    public final void method962(class260 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class128 var6 = (class128) arg0;
        if (this.field1721 == 0 || var6.field1721 == 0) {
            return;
        }
        int var7 = var6.field1715;
        int[] var8 = var6.field1732;
        int[] var9 = var6.field1710;
        int[] var10 = var6.field1699;
        short[] var11 = var6.field1727;
        short[] var12 = var6.field1706;
        short[] var13 = var6.field1698;
        short[] var14 = var6.field1703;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1713 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1713.field216;
            var16 = this.field1713.field214;
            var17 = this.field1713.field215;
            var18 = this.field1713.field217;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1713 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field1713.field216;
            var20 = var6.field1713.field214;
            var21 = var6.field1713.field215;
            var22 = var6.field1713.field217;
        }
        int[] var23 = var6.field1729;
        short[] var24 = var6.field1718;
        if (!var6.field1724.field5221) {
            var6.method966();
        }
        short var25 = var6.field1724.field5226;
        short var26 = var6.field1724.field5219;
        short var27 = var6.field1724.field5222;
        short var28 = var6.field1724.field5223;
        short var29 = var6.field1724.field5220;
        short var30 = var6.field1724.field5224;
        for (int var31 = 0; var31 < this.field1715; var31++) {
            int var32 = this.field1710[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field1732[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field1699[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1729[var31];
                        int var37 = this.field1729[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1718[var38] - 1;
                            if (var35 == -1 || this.field1703[var35] != 0) {
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
                                            this.field1713 = new class19();
                                            var15 = this.field1713.field216 = class198.method1448(this.field1727, (byte) -35);
                                            var16 = this.field1713.field214 = class198.method1448(this.field1706, (byte) -50);
                                            var17 = this.field1713.field215 = class198.method1448(this.field1698, (byte) -60);
                                            var18 = this.field1713.field217 = class198.method1448(this.field1703, (byte) 127);
                                        }
                                        if (var19 == null) {
                                            class19 var44 = var6.field1713 = new class19();
                                            var19 = var44.field216 = class198.method1448(var11, (byte) -128);
                                            var20 = var44.field214 = class198.method1448(var12, (byte) -107);
                                            var21 = var44.field215 = class198.method1448(var13, (byte) 121);
                                            var22 = var44.field217 = class198.method1448(var14, (byte) 126);
                                        }
                                        short var45 = this.field1727[var35];
                                        short var46 = this.field1706[var35];
                                        short var47 = this.field1698[var35];
                                        short var48 = this.field1703[var35];
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
                                        int var57 = this.field1729[var31];
                                        int var58 = this.field1729[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field1718[var59] - 1;
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

    @OriginalMember(owner = "client!s", name = "u", descriptor = "()V", line = 2954)
    public final void method963() {
        if (this.field1727 == null) {
            this.method577();
            return;
        }
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1732[var1];
            this.field1732[var1] = this.field1699[var1];
            this.field1699[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1744; var3++) {
            short var4 = this.field1727[var3];
            this.field1727[var3] = this.field1698[var3];
            this.field1698[var3] = (short) (-var4);
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
        if (this.field1702 != null) {
            this.field1702.field5506 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ISIB)I", line = 2996)
    private static final int method964(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class350.field5463[class332.method2314(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class350.field5467.method911(arg1 & 0xFFFF, false);
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
            int var9 = class350.field5467.method908((byte) -119, arg1 & 0xFFFF);
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

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V", line = 3056)
    public final void method580(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1716; var4++) {
            this.field1732[var4] += arg0;
            this.field1710[var4] += arg1;
            this.field1699[var4] += arg2;
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "()V", line = 3073)
    public final void method587() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1732[var1] = -this.field1732[var1];
            this.field1699[var1] = -this.field1699[var1];
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIFFF)[F", line = 3086)
    private static final float[] method965(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!s", name = "v", descriptor = "()V", line = 3152)
    private final void method966() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field1715; var9++) {
            int var10 = this.field1732[var9];
            int var11 = this.field1710[var9];
            int var12 = this.field1699[var9];
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
        this.field1724.field5222 = (short) var1;
        this.field1724.field5223 = (short) var4;
        this.field1724.field5226 = (short) var2;
        this.field1724.field5219 = (short) var5;
        this.field1724.field5220 = (short) var3;
        this.field1724.field5224 = (short) var6;
        this.field1724.field5225 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field1724.field5221 = true;
    }

    @OriginalMember(owner = "client!s", name = "w", descriptor = "()V", line = 3222)
    public final void method967() {
        int var10002;
        if (this.field1704 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1716; var3++) {
                int var4 = this.field1704[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1735 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1735[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1716) {
                int var7 = this.field1704[var6] & 0xFF;
                this.field1735[var7][var1[var7]++] = var6++;
            }
            this.field1704 = null;
        }
        if (this.field1726 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1721; var10++) {
            int var11 = this.field1726[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1740 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1740[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1721) {
            int var14 = this.field1726[var13] & 0xFF;
            this.field1740[var14][var8[var14]++] = var13++;
        }
        this.field1726 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(SS)V", line = 3317)
    public final void method968(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1721; var3++) {
            if (this.field1711[var3] == arg0) {
                this.field1711[var3] = arg1;
            }
        }
        this.field1723.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)Z", line = 3329)
    private final boolean method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!s", name = "x", descriptor = "()I", line = 3344)
    public final int method970() {
        return this.field1707;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "()V", line = 3350)
    public final void method577() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1732[var1];
            this.field1732[var1] = this.field1699[var1];
            this.field1699[var1] = -var2;
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZ)V", line = 3366)
    private final void method971(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field1701.field5510 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field1723.field5510 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field1702.field5510 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field1708.field5510 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field1725.field4350.length < this.field1744 * var6) {
            field1725 = new class299((this.field1744 + 100) * var6);
        } else {
            field1725.field4351 = 0;
        }
        if (arg1) {
            if (class47.field593) {
                for (int var7 = 0; var7 < this.field1715; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field1732[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field1710[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field1699[var7]);
                    int var11 = this.field1729[var7];
                    int var12 = this.field1729[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field1718[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field1725.field4351 = var6 * var14;
                        field1725.method2084(true, var8);
                        field1725.method2084(true, var9);
                        field1725.method2084(true, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field1715; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field1732[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field1710[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field1699[var15]);
                    int var19 = this.field1729[var15];
                    int var20 = this.field1729[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field1718[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field1725.field4351 = var6 * var22;
                        field1725.method2066(var16, false);
                        field1725.method2066(var17, false);
                        field1725.method2066(var18, false);
                    }
                }
            }
        }
        if (arg2) {
            if (class67.field856) {
                for (int var42 = 0; var42 < this.field1721; var42++) {
                    int var43 = method964(this.field1711[var42], this.field1709[var42], this.field1705, this.field1738[var42]);
                    field1725.field4351 = this.field1720[var42] * var6 + this.field1723.field5510;
                    field1725.method2084(true, var43);
                    field1725.field4351 = this.field1731[var42] * var6 + this.field1723.field5510;
                    field1725.method2084(true, var43);
                    field1725.field4351 = this.field1733[var42] * var6 + this.field1723.field5510;
                    field1725.method2084(true, var43);
                }
            } else {
                int var23 = (int) class41.field515[0];
                int var24 = (int) class41.field515[1];
                int var25 = (int) class41.field515[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field1705 * 1.3F);
                int var28 = this.field1707 * var26 >> 8;
                for (int var29 = 0; var29 < this.field1721; var29++) {
                    short var30 = this.field1720[var29];
                    short var31 = this.field1703[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field1698[var30] * var25 + this.field1727[var30] * var23 + this.field1706[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field1698[var30] * var25 + this.field1727[var30] * var23 + this.field1706[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field1703[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field1731[var29];
                    short var34 = this.field1703[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field1698[var33] * var25 + this.field1727[var33] * var23 + this.field1706[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field1698[var33] * var25 + this.field1727[var33] * var23 + this.field1706[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field1703[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field1733[var29];
                    short var37 = this.field1703[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field1698[var36] * var25 + this.field1727[var36] * var23 + this.field1706[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field1698[var36] * var25 + this.field1727[var36] * var23 + this.field1706[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field1703[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method964(this.field1711[var29], this.field1709[var29], var32, this.field1738[var29]);
                    int var40 = method964(this.field1711[var29], this.field1709[var29], var35, this.field1738[var29]);
                    int var41 = method964(this.field1711[var29], this.field1709[var29], var38, this.field1738[var29]);
                    field1725.field4351 = var6 * var30 + this.field1723.field5510;
                    field1725.method2084(true, var39);
                    field1725.field4351 = var6 * var33 + this.field1723.field5510;
                    field1725.method2084(true, var40);
                    field1725.field4351 = var6 * var36 + this.field1723.field5510;
                    field1725.method2084(true, var41);
                }
                this.field1727 = null;
                this.field1706 = null;
                this.field1698 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field1707;
            float var45 = 3.0F / (float) (this.field1707 / 2 + this.field1707);
            field1725.field4351 = this.field1702.field5510;
            if (class47.field593) {
                for (int var46 = 0; var46 < this.field1744; var46++) {
                    short var47 = this.field1703[var46];
                    if (var47 == 0) {
                        field1725.method2071(true, (float) this.field1727[var46] * var45);
                        field1725.method2071(true, (float) this.field1706[var46] * var45);
                        field1725.method2071(true, (float) this.field1698[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field1725.method2071(true, (float) this.field1727[var46] * var48);
                        field1725.method2071(true, (float) this.field1706[var46] * var48);
                        field1725.method2071(true, (float) this.field1698[var46] * var48);
                    }
                    field1725.field4351 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field1744; var49++) {
                    short var50 = this.field1703[var49];
                    if (var50 == 0) {
                        field1725.method2099((float) this.field1727[var49] * var45, -2503);
                        field1725.method2099((float) this.field1706[var49] * var45, -2503);
                        field1725.method2099((float) this.field1698[var49] * var45, -2503);
                    } else {
                        float var51 = var44 / (float) var50;
                        field1725.method2099((float) this.field1727[var49] * var51, -2503);
                        field1725.method2099((float) this.field1706[var49] * var51, -2503);
                        field1725.method2099((float) this.field1698[var49] * var51, -2503);
                    }
                    field1725.field4351 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field1725.field4351 = this.field1708.field5510;
            if (class47.field593) {
                for (int var52 = 0; var52 < this.field1744; var52++) {
                    field1725.method2071(true, this.field1728[var52]);
                    field1725.method2071(true, this.field1722[var52]);
                    field1725.field4351 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field1744; var53++) {
                    field1725.method2099(this.field1728[var53], -2503);
                    field1725.method2099(this.field1722[var53], -2503);
                    field1725.field4351 += var6 - 8;
                }
            }
        }
        field1725.field4351 = this.field1744 * var6;
        if (arg0) {
            if (class47.field603) {
                ByteBuffer var54 = ByteBuffer.wrap(field1725.field4350, 0, field1725.field4351);
                if (this.field1736 == null) {
                    this.field1736 = new class34(true);
                    this.field1736.method218(var54);
                } else {
                    this.field1736.method216(var54);
                }
                if (arg1) {
                    this.field1701.field5506 = true;
                    this.field1701.field5511 = null;
                    this.field1701.field5513 = this.field1736;
                    this.field1701.field5512 = var6;
                }
                if (arg2) {
                    this.field1723.field5506 = true;
                    this.field1723.field5511 = null;
                    this.field1723.field5513 = this.field1736;
                    this.field1723.field5512 = var6;
                }
                if (arg3) {
                    this.field1702.field5506 = true;
                    this.field1702.field5511 = null;
                    this.field1702.field5513 = this.field1736;
                    this.field1702.field5512 = var6;
                }
                if (arg4) {
                    this.field1708.field5506 = true;
                    this.field1708.field5511 = null;
                    this.field1708.field5513 = this.field1736;
                    this.field1708.field5512 = var6;
                }
            } else {
                if (field1741 == null || field1741.capacity() < field1725.field4351) {
                    field1741 = ByteBuffer.allocateDirect(var6 * 100 + field1725.field4351);
                } else {
                    field1741.clear();
                }
                field1741.put(field1725.field4350, 0, field1725.field4351);
                field1741.flip();
                if (arg1) {
                    this.field1701.field5506 = true;
                    this.field1701.field5511 = field1741;
                    this.field1701.field5513 = null;
                    this.field1701.field5512 = var6;
                }
                if (arg2) {
                    this.field1723.field5506 = true;
                    this.field1723.field5511 = field1741;
                    this.field1701.field5513 = null;
                    this.field1723.field5512 = var6;
                }
                if (arg3) {
                    this.field1702.field5506 = true;
                    this.field1702.field5511 = field1741;
                    this.field1702.field5513 = null;
                    this.field1702.field5512 = var6;
                }
                if (arg4) {
                    this.field1708.field5506 = true;
                    this.field1708.field5511 = field1741;
                    this.field1708.field5513 = null;
                    this.field1708.field5512 = var6;
                }
            }
        } else if (class47.field618) {
            class34 var55 = new class34();
            ByteBuffer var56 = ByteBuffer.wrap(field1725.field4350, 0, field1725.field4351);
            var55.method218(var56);
            if (arg1) {
                this.field1701.field5506 = true;
                this.field1701.field5511 = null;
                this.field1701.field5513 = var55;
                this.field1701.field5512 = var6;
            }
            if (arg2) {
                this.field1723.field5506 = true;
                this.field1723.field5511 = null;
                this.field1723.field5513 = var55;
                this.field1723.field5512 = var6;
            }
            if (arg3) {
                this.field1702.field5506 = true;
                this.field1702.field5511 = null;
                this.field1702.field5513 = var55;
                this.field1702.field5512 = var6;
            }
            if (arg4) {
                this.field1708.field5506 = true;
                this.field1708.field5511 = null;
                this.field1708.field5513 = var55;
                this.field1708.field5512 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field1725.field4351);
            var57.put(field1725.field4350, 0, field1725.field4351);
            var57.flip();
            if (arg1) {
                this.field1701.field5506 = true;
                this.field1701.field5511 = var57;
                this.field1701.field5513 = null;
                this.field1701.field5512 = var6;
            }
            if (arg2) {
                this.field1723.field5506 = true;
                this.field1723.field5511 = var57;
                this.field1701.field5513 = null;
                this.field1723.field5512 = var6;
            }
            if (arg3) {
                this.field1702.field5506 = true;
                this.field1702.field5511 = var57;
                this.field1702.field5513 = null;
                this.field1702.field5512 = var6;
            }
            if (arg4) {
                this.field1708.field5506 = true;
                this.field1708.field5511 = var57;
                this.field1708.field5513 = null;
                this.field1708.field5512 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(ZZZ)Lvg;", line = 3894)
    public final class81 method592(boolean arg0, boolean arg1, boolean arg2) {
        return this.method974(arg0, arg1, arg2, field1749, field1748);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3898)
    private static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field1753 = var16;
        field1757 = var17;
    }

    @OriginalMember(owner = "client!s", name = "m", descriptor = "()I", line = 3943)
    public final int method601() {
        if (!this.field1724.field5221) {
            this.method966();
        }
        return this.field1724.field5219;
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "()V", line = 3951)
    public final void method586() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1699[var1];
            this.field1699[var1] = this.field1732[var1];
            this.field1732[var1] = -var2;
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 3966)
    public final void method574(int arg0) {
        int var2 = class350.field5476[arg0];
        int var3 = class350.field5474[arg0];
        for (int var4 = 0; var4 < this.field1716; var4++) {
            int var5 = this.field1732[var4] * var3 + this.field1710[var4] * var2 >> 16;
            this.field1710[var4] = this.field1710[var4] * var3 - this.field1732[var4] * var2 >> 16;
            this.field1732[var4] = var5;
        }
        this.field1724.field5221 = false;
        this.field1701.field5506 = false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZZZ)V", line = 3985)
    public final void method973(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field1714 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field1744 != 0) {
            if (arg6) {
                boolean var8 = !this.field1723.field5506 && (arg1 || arg2 && !class67.field856);
                this.method971(false, !this.field1701.field5506 && arg0, var8, this.field1702 != null && !this.field1702.field5506 && arg2, !this.field1708.field5506 && arg3);
                if (!this.field1717.field5506 && arg4 && arg1) {
                    this.method951();
                }
            }
            if (arg0) {
                if (this.field1701.field5506) {
                    if (!this.field1724.field5221) {
                        this.method966();
                    }
                    this.field1732 = null;
                    this.field1710 = null;
                    this.field1699 = null;
                    this.field1718 = null;
                    this.field1729 = null;
                } else {
                    this.field1742 = (byte) (this.field1742 | 0x1);
                }
            }
            if (arg1) {
                if (this.field1723.field5506) {
                    this.field1711 = null;
                    this.field1738 = null;
                } else {
                    this.field1742 = (byte) (this.field1742 | 0x2);
                }
            }
            if (arg2 && class67.field856) {
                if (this.field1702.field5506) {
                    this.field1727 = null;
                    this.field1706 = null;
                    this.field1698 = null;
                    this.field1703 = null;
                } else {
                    this.field1742 = (byte) (this.field1742 | 0x4);
                }
            }
            if (arg3) {
                if (this.field1708.field5506) {
                    this.field1728 = null;
                    this.field1722 = null;
                } else {
                    this.field1742 = (byte) (this.field1742 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field1717.field5506 && this.field1723.field5506) {
                    this.field1720 = null;
                    this.field1731 = null;
                    this.field1733 = null;
                } else {
                    this.field1742 = (byte) (this.field1742 | 0x10);
                }
            }
            if (arg5) {
                this.field1704 = null;
                this.field1726 = null;
                this.field1735 = (int[][]) null;
                this.field1740 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZ)Lvg;", line = 4081)
    public final class81 method590(boolean arg0, boolean arg1, boolean arg2) {
        return this.method974(arg0, arg1, arg2, field1743, field1739);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZLs;Ls;)Lvg;", line = 4084)
    private final class81 method974(boolean arg0, boolean arg1, boolean arg2, class128 arg3, class128 arg4) {
        arg3.field1716 = this.field1716;
        arg3.field1715 = this.field1715;
        arg3.field1744 = this.field1744;
        arg3.field1721 = this.field1721;
        arg3.field1705 = this.field1705;
        arg3.field1707 = this.field1707;
        arg3.field1714 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field1732 == null || arg3.field1732.length < this.field1716) {
            arg3.field1732 = new int[this.field1716 + 100];
            arg3.field1710 = new int[this.field1716 + 100];
            arg3.field1699 = new int[this.field1716 + 100];
        }
        for (int var6 = 0; var6 < this.field1716; var6++) {
            arg3.field1732[var6] = this.field1732[var6];
            arg3.field1710[var6] = this.field1710[var6];
            arg3.field1699[var6] = this.field1699[var6];
        }
        if (arg3.field1701 == null) {
            arg3.field1701 = new class353();
        }
        arg3.field1701.field5506 = false;
        if (arg3.field1724 == null) {
            arg3.field1724 = new class334();
        }
        arg3.field1724.field5221 = false;
        if (arg0) {
            arg3.field1738 = this.field1738;
        } else {
            if (arg4.field1738 == null || arg4.field1738.length < this.field1721) {
                arg4.field1738 = new byte[this.field1721 + 100];
            }
            arg3.field1738 = arg4.field1738;
            for (int var7 = 0; var7 < this.field1721; var7++) {
                arg3.field1738[var7] = this.field1738[var7];
            }
        }
        if (arg1) {
            arg3.field1711 = this.field1711;
        } else {
            if (arg4.field1711 == null || arg4.field1711.length < this.field1721) {
                arg4.field1711 = new short[this.field1721 + 100];
            }
            arg3.field1711 = arg4.field1711;
            for (int var8 = 0; var8 < this.field1721; var8++) {
                arg3.field1711[var8] = this.field1711[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field1723 = this.field1723;
        } else {
            if (arg4.field1723 == null) {
                arg4.field1723 = new class353();
            }
            arg3.field1723 = arg4.field1723;
            arg3.field1723.field5506 = false;
        }
        if (arg2 || this.field1727 == null) {
            arg3.field1727 = this.field1727;
            arg3.field1706 = this.field1706;
            arg3.field1698 = this.field1698;
            arg3.field1703 = this.field1703;
            arg3.field1702 = this.field1702;
        } else {
            if (arg4.field1727 == null || arg4.field1727.length < this.field1744) {
                arg4.field1727 = new short[this.field1744 + 100];
                arg4.field1706 = new short[this.field1744 + 100];
                arg4.field1698 = new short[this.field1744 + 100];
                arg4.field1703 = new short[this.field1744 + 100];
            }
            arg3.field1727 = arg4.field1727;
            arg3.field1706 = arg4.field1706;
            arg3.field1698 = arg4.field1698;
            arg3.field1703 = arg4.field1703;
            for (int var9 = 0; var9 < this.field1744; var9++) {
                arg3.field1727[var9] = this.field1727[var9];
                arg3.field1706[var9] = this.field1706[var9];
                arg3.field1698[var9] = this.field1698[var9];
                arg3.field1703[var9] = this.field1703[var9];
            }
            if (class67.field856) {
                if (arg4.field1702 == null) {
                    arg4.field1702 = new class353();
                }
                arg3.field1702 = arg4.field1702;
                arg3.field1702.field5506 = false;
            } else {
                arg3.field1702 = null;
            }
        }
        arg3.field1728 = this.field1728;
        arg3.field1722 = this.field1722;
        arg3.field1704 = this.field1704;
        arg3.field1735 = this.field1735;
        arg3.field1720 = this.field1720;
        arg3.field1731 = this.field1731;
        arg3.field1733 = this.field1733;
        arg3.field1709 = this.field1709;
        arg3.field1726 = this.field1726;
        arg3.field1740 = this.field1740;
        arg3.field1708 = this.field1708;
        arg3.field1717 = this.field1717;
        arg3.field1719 = this.field1719;
        arg3.field1718 = this.field1718;
        arg3.field1729 = this.field1729;
        arg3.field1040 = this.field1040;
        arg3.field1730 = this.field1730;
        arg3.field1700 = this.field1700;
        arg3.field1746 = this.field1746;
        arg3.field1712 = this.field1712;
        return arg3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII[FIF)V", line = 4246)
    private static final void method975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field1761 = var16;
        field1756 = var17;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V", line = 4289)
    public final void method593(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field1750 = 0;
            field1752 = 0;
            field1758 = 0;
            for (int var6 = 0; var6 < this.field1716; var6++) {
                field1750 += this.field1732[var6];
                field1752 += this.field1710[var6];
                field1758 += this.field1699[var6];
                var5++;
            }
            if (var5 > 0) {
                field1750 = field1750 / var5 + arg1;
                field1752 = field1752 / var5 + arg2;
                field1758 = field1758 / var5 + arg3;
            } else {
                field1750 = arg1;
                field1752 = arg2;
                field1758 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1716; var7++) {
                this.field1732[var7] += arg1;
                this.field1710[var7] += arg2;
                this.field1699[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1716; var8++) {
                this.field1732[var8] -= field1750;
                this.field1710[var8] -= field1752;
                this.field1699[var8] -= field1758;
                if (arg3 != 0) {
                    int var9 = class350.field5476[arg3];
                    int var10 = class350.field5474[arg3];
                    int var11 = this.field1732[var8] * var10 + this.field1710[var8] * var9 + 32767 >> 16;
                    this.field1710[var8] = this.field1710[var8] * var10 + 32767 - this.field1732[var8] * var9 >> 16;
                    this.field1732[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class350.field5476[arg1];
                    int var13 = class350.field5474[arg1];
                    int var14 = this.field1710[var8] * var13 + 32767 - this.field1699[var8] * var12 >> 16;
                    this.field1699[var8] = this.field1710[var8] * var12 + this.field1699[var8] * var13 + 32767 >> 16;
                    this.field1710[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class350.field5476[arg2];
                    int var16 = class350.field5474[arg2];
                    int var17 = this.field1732[var8] * var16 + this.field1699[var8] * var15 + 32767 >> 16;
                    this.field1699[var8] = this.field1699[var8] * var16 + 32767 - this.field1732[var8] * var15 >> 16;
                    this.field1732[var8] = var17;
                }
                this.field1732[var8] += field1750;
                this.field1710[var8] += field1752;
                this.field1699[var8] += field1758;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1716; var18++) {
                this.field1732[var18] -= field1750;
                this.field1710[var18] -= field1752;
                this.field1699[var18] -= field1758;
                this.field1732[var18] = this.field1732[var18] * arg1 / 128;
                this.field1710[var18] = this.field1710[var18] * arg2 / 128;
                this.field1699[var18] = this.field1699[var18] * arg3 / 128;
                this.field1732[var18] += field1750;
                this.field1710[var18] += field1752;
                this.field1699[var18] += field1758;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1721; var19++) {
                int var20 = (this.field1738[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field1738[var19] = (byte) var20;
            }
            this.field1723.field5506 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field1721; var21++) {
                int var22 = this.field1711[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field1711[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field1723.field5506 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([FI)[F", line = 4487)
    private static final float[] method976(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class87.method632(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "y", descriptor = "()V", line = 4493)
    public static final void method977() {
        field1739 = new class128();
        field1743 = new class128();
        field1745 = new class128();
        field1747 = new class128();
        field1748 = new class128();
        field1749 = new class128();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(FFF)I", line = 4515)
    private static final int method978(float arg0, float arg1, float arg2) {
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
}
