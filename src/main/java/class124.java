import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class124 extends class362 {

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "B")
    private byte field1721 = 0;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    private int field1710 = 0;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Z")
    public boolean field1732 = false;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public int field1730 = 0;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    private int field1744 = 0;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "B")
    private byte field1742 = 0;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    private int field1750 = 0;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "[I")
    private int[] field1745;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "[I")
    public int[] field1741;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "[I")
    public int[] field1723;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "[I")
    public int[] field1708;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "[I")
    private int[] field1738;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[S")
    private short[] field1734;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "[Luj;")
    public class160[] field1711;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "[Lud;")
    public class312[] field1752;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "[S")
    private short[] field1749;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[S")
    private short[] field1707;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "[S")
    private short[] field1728;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "[S")
    private short[] field1747;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "[F")
    private float[] field1731;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "[F")
    private float[] field1718;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "[S")
    private short[] field1725;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "[B")
    private byte[] field1737;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "[S")
    private short[] field1709;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[S")
    private short[] field1719;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "[S")
    private short[] field1724;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "[S")
    private short[] field1729;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "[B")
    private byte[] field1727;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "[S")
    private short[] field1735;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "Lth;")
    public class98 field1743;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "Lde;")
    public class71 field1720;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "Lde;")
    private class71 field1733;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lde;")
    private class71 field1712;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "Lde;")
    private class71 field1722;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "Lde;")
    private class71 field1736;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "S")
    private short field1713;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "S")
    private short field1739;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "[S")
    private short[] field1755;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[I")
    private int[] field1714;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "Llf;")
    private static class143 field1726 = new class143(10000);

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "Ldc;")
    private static class124 field1740 = new class124();

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "Ldc;")
    private static class124 field1753 = new class124();

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "Ldc;")
    private static class124 field1754 = new class124();

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "Ldc;")
    private static class124 field1756 = new class124();

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "Ldc;")
    private static class124 field1757 = new class124();

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "Ldc;")
    private static class124 field1758 = new class124();

    @OriginalMember(owner = "client!dc", name = "rb", descriptor = "[I")
    private static int[] field1766 = new int[1];

    @OriginalMember(owner = "client!dc", name = "mb", descriptor = "[I")
    private static int[] field1761 = new int[1];

    @OriginalMember(owner = "client!dc", name = "pb", descriptor = "Z")
    private static boolean field1764 = false;

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "F")
    private static float field1760;

    @OriginalMember(owner = "client!dc", name = "nb", descriptor = "F")
    private static float field1762;

    @OriginalMember(owner = "client!dc", name = "ob", descriptor = "F")
    private static float field1763;

    @OriginalMember(owner = "client!dc", name = "qb", descriptor = "F")
    private static float field1765;

    @OriginalMember(owner = "client!dc", name = "sb", descriptor = "F")
    private static float field1767;

    @OriginalMember(owner = "client!dc", name = "vb", descriptor = "F")
    private static float field1770;

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "I")
    private static int field1759;

    @OriginalMember(owner = "client!dc", name = "tb", descriptor = "I")
    private static int field1768;

    @OriginalMember(owner = "client!dc", name = "ub", descriptor = "I")
    private static int field1769;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lid;")
    private class287 field1715;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lan;")
    private class354 field1717;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1751;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "[J")
    private static long[] field1716;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "[[I")
    private int[][] field1746;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "[[I")
    private int[][] field1748;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([FI)[F", line = 7)
    private static final float[] method796(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class8.method48(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(ZZZ)Lbf;", line = 13)
    public final class362 method797(boolean arg0, boolean arg1, boolean arg2) {
        return this.method822(arg0, arg1, arg2, field1756, field1754);
    }

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "()V", line = 20)
    public final void method798() {
        for (int var1 = 0; var1 < this.field1730; var1++) {
            this.field1708[var1] = -this.field1708[var1];
        }
        if (this.field1728 != null) {
            for (int var2 = 0; var2 < this.field1744; var2++) {
                this.field1728[var2] = (short) (-this.field1728[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field1710; var3++) {
            short var4 = this.field1709[var3];
            this.field1709[var3] = this.field1724[var3];
            this.field1724[var3] = var4;
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
        if (this.field1712 != null) {
            this.field1712.field881 = false;
        }
        this.field1736.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()I", line = 59)
    public final int method417() {
        if (!this.field1743.field1326) {
            this.method804();
        }
        return this.field1743.field1329;
    }

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "()I", line = 66)
    public final int method799() {
        return this.field1739;
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "()V", line = 71)
    public final void method800() {
        for (int var1 = 0; var1 < this.field1730; var1++) {
            int var2 = this.field1708[var1];
            this.field1708[var1] = this.field1741[var1];
            this.field1741[var1] = -var2;
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Lio;", line = 85)
    public final class294 method801(int arg0, int arg1, int arg2) {
        this.field1732 = false;
        if (this.field1715 != null) {
            this.field1749 = this.field1715.field4539;
            this.field1707 = this.field1715.field4538;
            this.field1728 = this.field1715.field4537;
            this.field1747 = this.field1715.field4536;
            this.field1715 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "()Z", line = 100)
    public final boolean method802() {
        if (this.field1748 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1730; var1++) {
            this.field1741[var1] <<= 0x4;
            this.field1723[var1] <<= 0x4;
            this.field1708[var1] <<= 0x4;
        }
        field1769 = 0;
        field1768 = 0;
        field1759 = 0;
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "()I", line = 121)
    public final int method803() {
        if (!this.field1743.field1326) {
            this.method804();
        }
        return this.field1743.field1322;
    }

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "()V", line = 128)
    private final void method804() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field1750; var9++) {
            int var10 = this.field1741[var9];
            int var11 = this.field1723[var9];
            int var12 = this.field1708[var9];
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
        this.field1743.field1323 = (short) var1;
        this.field1743.field1328 = (short) var4;
        this.field1743.field1329 = (short) var2;
        this.field1743.field1327 = (short) var5;
        this.field1743.field1325 = (short) var3;
        this.field1743.field1322 = (short) var6;
        this.field1743.field1324 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field1743.field1326 = true;
    }

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "()V", line = 199)
    public final void method805() {
        for (int var1 = 0; var1 < this.field1730; var1++) {
            this.field1741[var1] = this.field1741[var1] + 7 >> 4;
            this.field1723[var1] = this.field1723[var1] + 7 >> 4;
            this.field1708[var1] = this.field1708[var1] + 7 >> 4;
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "()I", line = 212)
    public final int method806() {
        if (!this.field1743.field1326) {
            this.method804();
        }
        return this.field1743.field1327;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V", line = 218)
    public final void method807(int arg0) {
        this.field1739 = (short) arg0;
        if (this.field1712 != null) {
            this.field1712.field881 = false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V", line = 227)
    public final void method808(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field1769 = 0;
            field1768 = 0;
            field1759 = 0;
            for (int var6 = 0; var6 < this.field1730; var6++) {
                field1769 += this.field1741[var6];
                field1768 += this.field1723[var6];
                field1759 += this.field1708[var6];
                var5++;
            }
            if (var5 > 0) {
                field1769 = field1769 / var5 + arg1;
                field1768 = field1768 / var5 + arg2;
                field1759 = field1759 / var5 + arg3;
            } else {
                field1769 = arg1;
                field1768 = arg2;
                field1759 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1730; var7++) {
                this.field1741[var7] += arg1;
                this.field1723[var7] += arg2;
                this.field1708[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1730; var8++) {
                this.field1741[var8] -= field1769;
                this.field1723[var8] -= field1768;
                this.field1708[var8] -= field1759;
                if (arg3 != 0) {
                    int var9 = class104.field1426[arg3];
                    int var10 = class104.field1435[arg3];
                    int var11 = this.field1741[var8] * var10 + this.field1723[var8] * var9 + 32767 >> 16;
                    this.field1723[var8] = this.field1723[var8] * var10 + 32767 - this.field1741[var8] * var9 >> 16;
                    this.field1741[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class104.field1426[arg1];
                    int var13 = class104.field1435[arg1];
                    int var14 = this.field1723[var8] * var13 + 32767 - this.field1708[var8] * var12 >> 16;
                    this.field1708[var8] = this.field1723[var8] * var12 + this.field1708[var8] * var13 + 32767 >> 16;
                    this.field1723[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class104.field1426[arg2];
                    int var16 = class104.field1435[arg2];
                    int var17 = this.field1741[var8] * var16 + this.field1708[var8] * var15 + 32767 >> 16;
                    this.field1708[var8] = this.field1708[var8] * var16 + 32767 - this.field1741[var8] * var15 >> 16;
                    this.field1741[var8] = var17;
                }
                this.field1741[var8] += field1769;
                this.field1723[var8] += field1768;
                this.field1708[var8] += field1759;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1730; var18++) {
                this.field1741[var18] -= field1769;
                this.field1723[var18] -= field1768;
                this.field1708[var18] -= field1759;
                this.field1741[var18] = this.field1741[var18] * arg1 / 128;
                this.field1723[var18] = this.field1723[var18] * arg2 / 128;
                this.field1708[var18] = this.field1708[var18] * arg3 / 128;
                this.field1741[var18] += field1769;
                this.field1723[var18] += field1768;
                this.field1708[var18] += field1759;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1710; var19++) {
                int var20 = (this.field1737[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field1737[var19] = (byte) var20;
            }
            this.field1733.field881 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field1710; var21++) {
                int var22 = this.field1725[var21] & 0xFFFF;
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
                this.field1725[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field1733.field881 = false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "()V", line = 423)
    public final void method809() {
        for (int var1 = 0; var1 < this.field1730; var1++) {
            this.field1741[var1] = -this.field1741[var1];
            this.field1708[var1] = -this.field1708[var1];
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(ZZZ)Lbf;", line = 435)
    public final class362 method810(boolean arg0, boolean arg1, boolean arg2) {
        return this.method822(arg0, arg1, arg2, field1753, field1740);
    }

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "()I", line = 445)
    public final int method811() {
        if (!this.field1743.field1326) {
            this.method804();
        }
        return this.field1743.field1323;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZZZZZZ)V", line = 451)
    public final void method812(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field1742 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field1744 != 0) {
            if (arg6) {
                boolean var8 = !this.field1733.field881 && (arg1 || arg2 && !class290.field4566);
                this.method847(false, !this.field1720.field881 && arg0, var8, this.field1712 != null && !this.field1712.field881 && arg2, !this.field1722.field881 && arg3);
                if (!this.field1736.field881 && arg4 && arg1) {
                    this.method823();
                }
            }
            if (arg0) {
                if (this.field1720.field881) {
                    if (!this.field1743.field1326) {
                        this.method804();
                    }
                    this.field1741 = null;
                    this.field1723 = null;
                    this.field1708 = null;
                    this.field1755 = null;
                    this.field1745 = null;
                } else {
                    this.field1721 = (byte) (this.field1721 | 0x1);
                }
            }
            if (arg1) {
                if (this.field1733.field881) {
                    this.field1725 = null;
                    this.field1737 = null;
                } else {
                    this.field1721 = (byte) (this.field1721 | 0x2);
                }
            }
            if (arg2 && class290.field4566) {
                if (this.field1712.field881) {
                    this.field1749 = null;
                    this.field1707 = null;
                    this.field1728 = null;
                    this.field1747 = null;
                } else {
                    this.field1721 = (byte) (this.field1721 | 0x4);
                }
            }
            if (arg3) {
                if (this.field1722.field881) {
                    this.field1731 = null;
                    this.field1718 = null;
                } else {
                    this.field1721 = (byte) (this.field1721 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field1736.field881 && this.field1733.field881) {
                    this.field1709 = null;
                    this.field1719 = null;
                    this.field1724 = null;
                } else {
                    this.field1721 = (byte) (this.field1721 | 0x10);
                }
            }
            if (arg5) {
                this.field1738 = null;
                this.field1727 = null;
                this.field1748 = (int[][]) null;
                this.field1746 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "()I", line = 546)
    public final int method813() {
        if (!this.field1743.field1326) {
            this.method804();
        }
        return this.field1743.field1328;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(FFF)I", line = 553)
    private static final int method814(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "()I", line = 589)
    public final int method815() {
        return this.field1713;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIJILlg;)V", line = 592)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class141 arg10) {
        if (this.field1744 == 0) {
            return;
        }
        if (!this.field1743.field1326) {
            this.method804();
        }
        short var13 = this.field1743.field1324;
        short var14 = this.field1743.field1329;
        short var15 = this.field1743.field1327;
        if (arg10 != null) {
            arg10.method976(arg0, arg9, arg5, arg6, arg7);
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
        if (var21 / var18 <= class212.field3212) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class253.field4012) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class73.field917) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class76.field1003) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class104.field1426[arg0];
            var27 = class104.field1435[arg0];
        }
        if (arg8 > 0L && class86.field1141 && var19 > 0) {
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
            if (class101.field1369 >= var28 && class101.field1369 <= var29 && class205.field3101 >= var30 && class205.field3101 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field1743.field1323;
                short var37 = this.field1743.field1328;
                short var38 = this.field1743.field1325;
                short var39 = this.field1743.field1322;
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
                if (class101.field1369 >= var32 && class101.field1369 <= var33 && class205.field3101 >= var34 && class205.field3101 <= var35) {
                    if (this.field5720) {
                        class313.field4900[class49.field562++] = arg8;
                    } else {
                        if (field1766.length < this.field1744) {
                            field1766 = new int[this.field1744];
                            field1761 = new int[this.field1744];
                        }
                        int var59 = 0;
                        label124: while (true) {
                            if (var59 >= this.field1750) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field1710) {
                                        break label124;
                                    }
                                    short var80 = this.field1709[var79];
                                    short var81 = this.field1719[var79];
                                    short var82 = this.field1724[var79];
                                    if (this.method829(class101.field1369, class205.field3101, field1761[var80], field1761[var81], field1761[var82], field1766[var80], field1766[var81], field1766[var82])) {
                                        class313.field4900[class49.field562++] = arg8;
                                        break label124;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field1741[var59];
                            int var61 = this.field1723[var59];
                            int var62 = this.field1708[var59];
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
                            int var75 = this.field1745[var59];
                            int var76 = this.field1745[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field1755[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field1766[var78] = var73;
                                field1761[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class272.field4310;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method832();
        var83.glPopMatrix();
        if (arg10 != null) {
            arg10.method981(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 4568)
    private class124() {
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lrd;IIZ)V", line = 4570)
    public class124(class193 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2894];
        this.field1745 = new int[arg0.field2932 + 1];
        for (int var6 = 0; var6 < arg0.field2894; var6++) {
            if ((arg0.field2904 == null || arg0.field2904[var6] != 2) && (arg0.field2923 == null || arg0.field2923[var6] == -1 || !class104.field1438.method882(false, arg0.field2923[var6] & 0xFFFF))) {
                var5[this.field1710++] = var6;
                this.field1745[arg0.field2893[var6]]++;
                this.field1745[arg0.field2914[var6]]++;
                this.field1745[arg0.field2887[var6]]++;
            }
        }
        long[] var7 = new long[this.field1710];
        for (int var8 = 0; var8 < this.field1710; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2923 != null) {
                var14 = arg0.field2923[var9];
                if (var14 != -1) {
                    var12 = class104.field1438.method892(21235, var14 & 0xFFFF);
                    var13 = class104.field1438.method889((byte) 95, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field2933 != null && arg0.field2933[var9] != 0 || var14 != -1 && !class104.field1438.method886(11843, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field2895 != null) {
                var10 += arg0.field2895[var9] << 17;
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
        class151.method1101(var5, var7, 32767);
        this.field1730 = arg0.field2932;
        this.field1750 = arg0.field2903;
        this.field1741 = arg0.field2924;
        this.field1723 = arg0.field2919;
        this.field1708 = arg0.field2915;
        this.field1738 = arg0.field2908;
        this.field1734 = arg0.field2902;
        this.field1711 = arg0.field2917;
        this.field1752 = arg0.field2931;
        int var20 = this.field1710 * 3;
        this.field1749 = new short[var20];
        this.field1707 = new short[var20];
        this.field1728 = new short[var20];
        this.field1747 = new short[var20];
        this.field1731 = new float[var20];
        this.field1718 = new float[var20];
        this.field1725 = new short[this.field1710];
        this.field1737 = new byte[this.field1710];
        this.field1709 = new short[this.field1710];
        this.field1719 = new short[this.field1710];
        this.field1724 = new short[this.field1710];
        this.field1729 = new short[this.field1710];
        if (arg0.field2937 != null) {
            this.field1727 = new byte[this.field1710];
        }
        if (arg0.field2899 != null) {
            this.field1735 = new short[this.field1710];
        }
        this.field1743 = new class98();
        this.field1720 = new class71();
        this.field1733 = new class71();
        if (class290.field4566) {
            this.field1712 = new class71();
        }
        this.field1722 = new class71();
        this.field1736 = new class71();
        this.field1713 = (short) arg1;
        this.field1739 = (short) arg2;
        this.field1755 = new short[var20];
        field1716 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field1750; var22++) {
            int var23 = this.field1745[var22];
            this.field1745[var22] = var21;
            var21 += var23;
        }
        this.field1745[this.field1750] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2916 != null) {
            int var28 = arg0.field2922;
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
            for (int var36 = 0; var36 < this.field1710; var36++) {
                int var37 = var5[var36];
                if (arg0.field2916[var37] != -1) {
                    int var38 = arg0.field2916[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2893[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2914[var37];
                        } else {
                            var40 = arg0.field2887[var37];
                        }
                        int var41 = arg0.field2924[var40];
                        int var42 = arg0.field2919[var40];
                        int var43 = arg0.field2915[var40];
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
                byte var45 = arg0.field2885[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2927[var44];
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
                        var49 = 64.0F / (float) (arg0.field2928[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2927[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2928[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2921[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2927[var44] / 1024.0F;
                        var49 = (float) arg0.field2928[var44] / 1024.0F;
                        var48 = (float) arg0.field2921[var44] / 1024.0F;
                    }
                    var27[var44] = method850(arg0.field2907[var44], arg0.field2909[var44], arg0.field2920[var44], arg0.field2913[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field1710; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2884[var51] & 0xFFFF;
            short var53;
            if (arg0.field2923 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2923[var51];
            }
            int var54;
            if (arg0.field2916 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2916[var51];
            }
            int var55;
            if (arg0.field2933 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2933[var51] & 0xFF;
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
                    byte var65 = arg0.field2885[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2893[var51];
                        int var67 = arg0.field2914[var51];
                        int var68 = arg0.field2887[var51];
                        short var69 = arg0.field2907[var54];
                        short var70 = arg0.field2909[var54];
                        short var71 = arg0.field2920[var54];
                        float var72 = (float) arg0.field2924[var69];
                        float var73 = (float) arg0.field2919[var69];
                        float var74 = (float) arg0.field2915[var69];
                        float var75 = (float) arg0.field2924[var70] - var72;
                        float var76 = (float) arg0.field2919[var70] - var73;
                        float var77 = (float) arg0.field2915[var70] - var74;
                        float var78 = (float) arg0.field2924[var71] - var72;
                        float var79 = (float) arg0.field2919[var71] - var73;
                        float var80 = (float) arg0.field2915[var71] - var74;
                        float var81 = (float) arg0.field2924[var66] - var72;
                        float var82 = (float) arg0.field2919[var66] - var73;
                        float var83 = (float) arg0.field2915[var66] - var74;
                        float var84 = (float) arg0.field2924[var67] - var72;
                        float var85 = (float) arg0.field2919[var67] - var73;
                        float var86 = (float) arg0.field2915[var67] - var74;
                        float var87 = (float) arg0.field2924[var68] - var72;
                        float var88 = (float) arg0.field2919[var68] - var73;
                        float var89 = (float) arg0.field2915[var68] - var74;
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
                        int var101 = arg0.field2893[var51];
                        int var102 = arg0.field2914[var51];
                        int var103 = arg0.field2887[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2905[var54];
                        float var109 = (float) arg0.field2897[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2921[var54] & 0xFFFF) / 1024.0F;
                            method818(arg0.field2924[var101], arg0.field2919[var101], arg0.field2915[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field1762;
                            var57 = field1770;
                            method818(arg0.field2924[var102], arg0.field2919[var102], arg0.field2915[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field1762;
                            var59 = field1770;
                            method818(arg0.field2924[var103], arg0.field2919[var103], arg0.field2915[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field1762;
                            var61 = field1770;
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
                            float var112 = (float) arg0.field2889[var54] / 256.0F;
                            float var113 = (float) arg0.field2898[var54] / 256.0F;
                            int var114 = arg0.field2924[var102] - arg0.field2924[var101];
                            int var115 = arg0.field2919[var102] - arg0.field2919[var101];
                            int var116 = arg0.field2915[var102] - arg0.field2915[var101];
                            int var117 = arg0.field2924[var103] - arg0.field2924[var101];
                            int var118 = arg0.field2919[var103] - arg0.field2919[var101];
                            int var119 = arg0.field2915[var103] - arg0.field2915[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2927[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2928[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2921[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method814(var126, var127, var128);
                            method838(arg0.field2924[var101], arg0.field2919[var101], arg0.field2915[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field1765;
                            var57 = field1767;
                            method838(arg0.field2924[var102], arg0.field2919[var102], arg0.field2915[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field1765;
                            var59 = field1767;
                            method838(arg0.field2924[var103], arg0.field2919[var103], arg0.field2915[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field1765;
                            var61 = field1767;
                        } else if (var65 == 3) {
                            method837(arg0.field2924[var101], arg0.field2919[var101], arg0.field2915[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field1760;
                            var57 = field1763;
                            method837(arg0.field2924[var102], arg0.field2919[var102], arg0.field2915[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field1760;
                            var59 = field1763;
                            method837(arg0.field2924[var103], arg0.field2919[var103], arg0.field2915[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field1760;
                            var61 = field1763;
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
            arg0.method1326();
            byte var129;
            if (arg0.field2904 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2904[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2893[var51];
                class36 var133 = arg0.field2886[var132];
                this.field1709[var50] = this.method849(arg0, var132, var130, var133.field416, var133.field421, var133.field414, var133.field418, var56, var57);
                int var134 = arg0.field2914[var51];
                class36 var135 = arg0.field2886[var134];
                this.field1719[var50] = this.method849(arg0, var134, (long) var62 + var130, var135.field416, var135.field421, var135.field414, var135.field418, var58, var59);
                int var136 = arg0.field2887[var51];
                class36 var137 = arg0.field2886[var136];
                this.field1724[var50] = this.method849(arg0, var136, (long) var63 + var130, var137.field416, var137.field421, var137.field414, var137.field418, var60, var61);
            } else if (var129 == 1) {
                class145 var138 = arg0.field2891[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2306 > 0 ? 1024 : 2048) + (var138.field2304 + 256 << 12) + (var138.field2307 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field1709[var50] = this.method849(arg0, arg0.field2893[var51], var139, var138.field2306, var138.field2304, var138.field2307, 0, var56, var57);
                this.field1719[var50] = this.method849(arg0, arg0.field2914[var51], (long) var62 + var139, var138.field2306, var138.field2304, var138.field2307, 0, var58, var59);
                this.field1724[var50] = this.method849(arg0, arg0.field2887[var51], (long) var63 + var139, var138.field2306, var138.field2304, var138.field2307, 0, var60, var61);
            }
            if (arg0.field2923 == null) {
                this.field1729[var50] = -1;
            } else {
                this.field1729[var50] = arg0.field2923[var51];
            }
            if (this.field1727 != null) {
                this.field1727[var50] = (byte) arg0.field2937[var51];
            }
            this.field1725[var50] = arg0.field2884[var51];
            if (arg0.field2933 != null) {
                this.field1737[var50] = arg0.field2933[var51];
            }
            if (arg0.field2899 != null) {
                this.field1735[var50] = arg0.field2899[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field1710; var143++) {
            short var144 = this.field1729[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field1714 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field1710; var147++) {
            short var148 = this.field1729[var147];
            if (var146 != var148) {
                this.field1714[var145++] = var147;
                var146 = var148;
            }
        }
        this.field1714[var145] = this.field1710;
        field1716 = null;
        this.field1749 = method824(this.field1749, this.field1744);
        this.field1707 = method824(this.field1707, this.field1744);
        this.field1728 = method824(this.field1728, this.field1744);
        this.field1747 = method824(this.field1747, this.field1744);
        this.field1731 = method796(this.field1731, this.field1744);
        this.field1718 = method796(this.field1718, this.field1744);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(SS)V", line = 879)
    public final void method816(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1710; var3++) {
            if (this.field1725[var3] == arg0) {
                this.field1725[var3] = arg1;
            }
        }
        this.field1733.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(SS)V", line = 900)
    public final void method817(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1710; var3++) {
            if (this.field1729[var3] == arg0) {
                this.field1729[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class104.field1438.method879(-7796, arg0 & 0xFFFF);
            var5 = class104.field1438.method885(arg0 & 0xFFFF, (byte) 70);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class104.field1438.method879(-7796, arg1 & 0xFFFF);
            var7 = class104.field1438.method885(arg1 & 0xFFFF, (byte) 63);
        }
        if (var4 != var6 || var5 != var7) {
            this.field1733.field881 = false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIII[FFIF)V", line = 934)
    private static final void method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field1762 = var16;
        field1770 = var17;
    }

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "()V", line = 978)
    public final void method819() {
        if (this.field1749 == null) {
            this.method800();
            return;
        }
        for (int var1 = 0; var1 < this.field1730; var1++) {
            int var2 = this.field1708[var1];
            this.field1708[var1] = this.field1741[var1];
            this.field1741[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1744; var3++) {
            short var4 = this.field1728[var3];
            this.field1728[var3] = this.field1749[var3];
            this.field1749[var3] = (short) (-var4);
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
        if (this.field1712 != null) {
            this.field1712.field881 = false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILdc;[[I[[IIII)V", line = 1017)
    public final void method820(int arg0, int arg1, class124 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field1743.field1326) {
            arg2.method804();
        }
        int var9 = arg2.field1743.field1323 + arg5;
        int var10 = arg2.field1743.field1328 + arg5;
        int var11 = arg2.field1743.field1325 + arg7;
        int var12 = arg2.field1743.field1322 + arg7;
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
            for (int var17 = 0; var17 < this.field1750; var17++) {
                int var18 = this.field1741[var17] + arg5;
                int var19 = this.field1708[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field1723[var17] = this.field1723[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field1743.field1329;
            for (int var28 = 0; var28 < this.field1750; var28++) {
                int var29 = (this.field1723[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field1741[var28] + arg5;
                    int var31 = this.field1708[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field1723[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method2528(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field1743.field1327 - arg2.field1743.field1329;
            for (int var42 = 0; var42 < this.field1750; var42++) {
                int var43 = this.field1741[var42] + arg5;
                int var44 = this.field1708[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field1723[var42] = var51 + this.field1723[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field1743.field1327 - arg2.field1743.field1329;
            for (int var53 = 0; var53 < this.field1750; var53++) {
                int var54 = this.field1741[var53] + arg5;
                int var55 = this.field1708[var53] + arg7;
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
                this.field1723[var53] = ((this.field1723[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field1720.field881 = false;
        this.field1743.field1326 = false;
    }

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "()V", line = 1214)
    public static void method821() {
        field1716 = null;
        field1726 = null;
        field1751 = null;
        field1740 = null;
        field1753 = null;
        field1754 = null;
        field1756 = null;
        field1757 = null;
        field1758 = null;
        field1766 = null;
        field1761 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZZLdc;Ldc;)Lbf;", line = 1227)
    private final class362 method822(boolean arg0, boolean arg1, boolean arg2, class124 arg3, class124 arg4) {
        arg3.field1730 = this.field1730;
        arg3.field1750 = this.field1750;
        arg3.field1744 = this.field1744;
        arg3.field1710 = this.field1710;
        arg3.field1713 = this.field1713;
        arg3.field1739 = this.field1739;
        arg3.field1742 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field1741 == null || arg3.field1741.length < this.field1730) {
            arg3.field1741 = new int[this.field1730 + 100];
            arg3.field1723 = new int[this.field1730 + 100];
            arg3.field1708 = new int[this.field1730 + 100];
        }
        for (int var6 = 0; var6 < this.field1730; var6++) {
            arg3.field1741[var6] = this.field1741[var6];
            arg3.field1723[var6] = this.field1723[var6];
            arg3.field1708[var6] = this.field1708[var6];
        }
        if (arg3.field1720 == null) {
            arg3.field1720 = new class71();
        }
        arg3.field1720.field881 = false;
        if (arg3.field1743 == null) {
            arg3.field1743 = new class98();
        }
        arg3.field1743.field1326 = false;
        if (arg0) {
            arg3.field1737 = this.field1737;
        } else {
            if (arg4.field1737 == null || arg4.field1737.length < this.field1710) {
                arg4.field1737 = new byte[this.field1710 + 100];
            }
            arg3.field1737 = arg4.field1737;
            for (int var7 = 0; var7 < this.field1710; var7++) {
                arg3.field1737[var7] = this.field1737[var7];
            }
        }
        if (arg1) {
            arg3.field1725 = this.field1725;
        } else {
            if (arg4.field1725 == null || arg4.field1725.length < this.field1710) {
                arg4.field1725 = new short[this.field1710 + 100];
            }
            arg3.field1725 = arg4.field1725;
            for (int var8 = 0; var8 < this.field1710; var8++) {
                arg3.field1725[var8] = this.field1725[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field1733 = this.field1733;
        } else {
            if (arg4.field1733 == null) {
                arg4.field1733 = new class71();
            }
            arg3.field1733 = arg4.field1733;
            arg3.field1733.field881 = false;
        }
        if (arg2 || this.field1749 == null) {
            arg3.field1749 = this.field1749;
            arg3.field1707 = this.field1707;
            arg3.field1728 = this.field1728;
            arg3.field1747 = this.field1747;
            arg3.field1712 = this.field1712;
        } else {
            if (arg4.field1749 == null || arg4.field1749.length < this.field1744) {
                arg4.field1749 = new short[this.field1744 + 100];
                arg4.field1707 = new short[this.field1744 + 100];
                arg4.field1728 = new short[this.field1744 + 100];
                arg4.field1747 = new short[this.field1744 + 100];
            }
            arg3.field1749 = arg4.field1749;
            arg3.field1707 = arg4.field1707;
            arg3.field1728 = arg4.field1728;
            arg3.field1747 = arg4.field1747;
            for (int var9 = 0; var9 < this.field1744; var9++) {
                arg3.field1749[var9] = this.field1749[var9];
                arg3.field1707[var9] = this.field1707[var9];
                arg3.field1728[var9] = this.field1728[var9];
                arg3.field1747[var9] = this.field1747[var9];
            }
            if (class290.field4566) {
                if (arg4.field1712 == null) {
                    arg4.field1712 = new class71();
                }
                arg3.field1712 = arg4.field1712;
                arg3.field1712.field881 = false;
            } else {
                arg3.field1712 = null;
            }
        }
        arg3.field1731 = this.field1731;
        arg3.field1718 = this.field1718;
        arg3.field1738 = this.field1738;
        arg3.field1748 = this.field1748;
        arg3.field1709 = this.field1709;
        arg3.field1719 = this.field1719;
        arg3.field1724 = this.field1724;
        arg3.field1729 = this.field1729;
        arg3.field1727 = this.field1727;
        arg3.field1746 = this.field1746;
        arg3.field1722 = this.field1722;
        arg3.field1736 = this.field1736;
        arg3.field1714 = this.field1714;
        arg3.field1755 = this.field1755;
        arg3.field1745 = this.field1745;
        arg3.field5720 = this.field5720;
        arg3.field1734 = this.field1734;
        arg3.field1735 = this.field1735;
        arg3.field1711 = this.field1711;
        arg3.field1752 = this.field1752;
        return arg3;
    }

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "()V", line = 1388)
    private final void method823() {
        if (field1726.field2260.length < this.field1710 * 12) {
            field1726 = new class143((this.field1710 + 100) * 12);
        } else {
            field1726.field2295 = 0;
        }
        if (class272.field4318) {
            for (int var1 = 0; var1 < this.field1710; var1++) {
                field1726.method1052(this.field1709[var1], false);
                field1726.method1052(this.field1719[var1], false);
                field1726.method1052(this.field1724[var1], false);
            }
        } else {
            for (int var2 = 0; var2 < this.field1710; var2++) {
                field1726.method1012(this.field1709[var2], -11);
                field1726.method1012(this.field1719[var2], -11);
                field1726.method1012(this.field1724[var2], -11);
            }
        }
        if (!class272.field4302) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field1726.field2295);
            var5.put(field1726.field2260, 0, field1726.field2295);
            var5.flip();
            this.field1736.field881 = true;
            this.field1736.field885 = var5;
            this.field1736.field884 = null;
            return;
        }
        class354 var3 = new class354();
        ByteBuffer var4 = ByteBuffer.wrap(field1726.field2260, 0, field1726.field2295);
        var3.method2446(var4);
        this.field1736.field881 = true;
        this.field1736.field885 = null;
        this.field1736.field884 = var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([SI)[S", line = 1447)
    private static final short[] method824(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class8.method52(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "()V", line = 1454)
    public static final void method825() {
        field1740 = new class124();
        field1753 = new class124();
        field1754 = new class124();
        field1756 = new class124();
        field1757 = new class124();
        field1758 = new class124();
    }

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "()V", line = 1464)
    public final void method826() {
        for (int var1 = 0; var1 < this.field1730; var1++) {
            int var2 = this.field1741[var1];
            this.field1741[var1] = this.field1708[var1];
            this.field1708[var1] = -var2;
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "()I", line = 1483)
    public final int method827() {
        if (!this.field1743.field1326) {
            this.method804();
        }
        return this.field1743.field1324;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V", line = 1491)
    public final void method828(int arg0) {
        int var2 = class104.field1426[arg0];
        int var3 = class104.field1435[arg0];
        for (int var4 = 0; var4 < this.field1730; var4++) {
            int var5 = this.field1723[var4] * var3 - this.field1708[var4] * var2 >> 16;
            this.field1708[var4] = this.field1723[var4] * var2 + this.field1708[var4] * var3 >> 16;
            this.field1723[var4] = var5;
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIII)Z", line = 1510)
    private final boolean method829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "()I", line = 1525)
    public final int method830() {
        if (!this.field1743.field1326) {
            this.method804();
        }
        return this.field1743.field1325;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)V", line = 1534)
    public final void method831(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1730; var4++) {
            this.field1741[var4] = this.field1741[var4] * arg0 >> 7;
            this.field1723[var4] = this.field1723[var4] * arg1 >> 7;
            this.field1708[var4] = this.field1708[var4] * arg2 >> 7;
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "()V", line = 1551)
    private final void method832() {
        GL var1 = class272.field4310;
        if (this.field1710 == 0) {
            return;
        }
        if (this.field1742 != 0) {
            this.method847(true, !this.field1720.field881 && (this.field1742 & 0x1) != 0, !this.field1733.field881 && (this.field1742 & 0x2) != 0, this.field1712 != null && !this.field1712.field881 && (this.field1742 & 0x4) != 0, false);
        }
        this.method847(false, !this.field1720.field881, !this.field1733.field881, this.field1712 != null && !this.field1712.field881, !this.field1722.field881);
        if (!this.field1736.field881) {
            this.method823();
        }
        if (this.field1721 != 0) {
            if ((this.field1721 & 0x1) != 0) {
                this.field1741 = null;
                this.field1723 = null;
                this.field1708 = null;
                this.field1755 = null;
                this.field1745 = null;
            }
            if ((this.field1721 & 0x2) != 0) {
                this.field1725 = null;
                this.field1737 = null;
            }
            if ((this.field1721 & 0x4) != 0) {
                this.field1749 = null;
                this.field1707 = null;
                this.field1728 = null;
                this.field1747 = null;
            }
            if ((this.field1721 & 0x8) != 0) {
                this.field1731 = null;
                this.field1718 = null;
            }
            if ((this.field1721 & 0x10) != 0) {
                this.field1709 = null;
                this.field1719 = null;
                this.field1724 = null;
            }
            this.field1721 = 0;
        }
        class354 var2 = null;
        if (this.field1720.field884 != null) {
            this.field1720.field884.method2447();
            var2 = this.field1720.field884;
            var1.glVertexPointer(3, 5126, this.field1720.field886, (long) this.field1720.field880);
        }
        if (this.field1733.field884 != null) {
            if (this.field1733.field884 != var2) {
                this.field1733.field884.method2447();
                var2 = this.field1733.field884;
            }
            var1.glColorPointer(4, 5121, this.field1733.field886, (long) this.field1733.field880);
        }
        if (class290.field4566 && this.field1712.field884 != null) {
            if (this.field1712.field884 != var2) {
                this.field1712.field884.method2447();
                var2 = this.field1712.field884;
            }
            var1.glNormalPointer(5126, this.field1712.field886, (long) this.field1712.field880);
        }
        if (this.field1722.field884 != null) {
            if (this.field1722.field884 != var2) {
                this.field1722.field884.method2447();
                class354 var3 = this.field1722.field884;
            }
            var1.glTexCoordPointer(2, 5126, this.field1722.field886, (long) this.field1722.field880);
        }
        if (this.field1736.field884 != null) {
            this.field1736.field884.method2449();
        }
        if (this.field1720.field884 == null || this.field1733.field884 == null || class290.field4566 && this.field1712.field884 == null || this.field1722.field884 == null) {
            if (class272.field4302) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field1720.field884 == null) {
                this.field1720.field885.position(this.field1720.field880);
                var1.glVertexPointer(3, 5126, this.field1720.field886, this.field1720.field885);
            }
            if (this.field1733.field884 == null) {
                this.field1733.field885.position(this.field1733.field880);
                var1.glColorPointer(4, 5121, this.field1733.field886, this.field1733.field885);
            }
            if (class290.field4566 && this.field1712.field884 == null) {
                this.field1712.field885.position(this.field1712.field880);
                var1.glNormalPointer(5126, this.field1712.field886, this.field1712.field885);
            }
            if (this.field1722.field884 == null) {
                this.field1722.field885.position(this.field1722.field880);
                var1.glTexCoordPointer(2, 5126, this.field1722.field886, this.field1722.field885);
            }
        }
        if (this.field1736.field884 == null && class272.field4302) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field1714.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field1714[var5];
            int var7 = this.field1714[var5 + 1];
            short var8 = this.field1729[var6];
            if (var8 == -1) {
                class272.method1965(-1);
                class11.method69(-111, 0, 0);
            } else {
                class104.field1438.method883((byte) -20, var8 & 0xFFFF);
            }
            if (this.field1736.field884 == null) {
                this.field1736.field885.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field1736.field885);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lfe;)Lfe;", line = 1724)
    public final class270 method833(class270 arg0) {
        if (this.field1744 == 0) {
            return null;
        }
        if (!this.field1743.field1326) {
            this.method804();
        }
        int var2;
        int var3;
        if (class26.field305 > 0) {
            var2 = this.field1743.field1323 - (class26.field305 * this.field1743.field1327 >> 8) >> 3;
            var3 = this.field1743.field1328 - (class26.field305 * this.field1743.field1329 >> 8) >> 3;
        } else {
            var2 = this.field1743.field1323 - (class26.field305 * this.field1743.field1329 >> 8) >> 3;
            var3 = this.field1743.field1328 - (class26.field305 * this.field1743.field1327 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class26.field301 > 0) {
            var4 = this.field1743.field1325 - (class26.field301 * this.field1743.field1327 >> 8) >> 3;
            var5 = this.field1743.field1322 - (class26.field301 * this.field1743.field1329 >> 8) >> 3;
        } else {
            var4 = this.field1743.field1325 - (class26.field301 * this.field1743.field1329 >> 8) >> 3;
            var5 = this.field1743.field1322 - (class26.field301 * this.field1743.field1327 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class270 var8;
        if (arg0 == null || arg0.field4255.length < var6 * var7) {
            var8 = new class270(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field2369 = arg0.field2366 = var6;
            arg0.field2360 = arg0.field2361 = var7;
            arg0.method1904();
        }
        var8.field2362 = var2;
        var8.field2365 = var4;
        if (field1766.length < this.field1744) {
            field1766 = new int[this.field1744];
            field1761 = new int[this.field1744];
        }
        for (int var9 = 0; var9 < this.field1750; var9++) {
            int var10 = (this.field1741[var9] - (this.field1723[var9] * class26.field305 >> 8) >> 3) - var2;
            int var11 = (this.field1708[var9] - (this.field1723[var9] * class26.field301 >> 8) >> 3) - var4;
            int var12 = this.field1745[var9];
            int var13 = this.field1745[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field1755[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field1766[var15] = var10;
                field1761[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field1710; var16++) {
            if (this.field1737[var16] <= 128) {
                short var17 = this.field1709[var16];
                short var18 = this.field1719[var16];
                short var19 = this.field1724[var16];
                int var20 = field1766[var17];
                int var21 = field1766[var18];
                int var22 = field1766[var19];
                int var23 = field1761[var17];
                int var24 = field1761[var18];
                int var25 = field1761[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class104.method677(var8.field4255, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[IIIIZI[I)V", line = 1850)
    public final void method834(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field1769 = 0;
            field1768 = 0;
            field1759 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1748.length) {
                    int[] var16 = this.field1748[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1734 == null || (arg6 & this.field1734[var18]) != 0) {
                            field1769 += this.field1741[var18];
                            field1768 += this.field1723[var18];
                            field1759 += this.field1708[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field1769 = field1769 / var13 + var10;
                field1768 = field1768 / var13 + var11;
                field1759 = field1759 / var13 + var12;
                field1764 = true;
            } else {
                field1769 = var10;
                field1768 = var11;
                field1759 = var12;
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
                if (var26 < this.field1748.length) {
                    int[] var27 = this.field1748[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1734 == null || (arg6 & this.field1734[var29]) != 0) {
                            this.field1741[var29] += var22;
                            this.field1723[var29] += var23;
                            this.field1708[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field1748.length) {
                        int[] var92 = this.field1748[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field1734 == null || (arg6 & this.field1734[var94]) != 0) {
                                this.field1741[var94] -= field1769;
                                this.field1723[var94] -= field1768;
                                this.field1708[var94] -= field1759;
                                if (arg4 != 0) {
                                    int var95 = class104.field1426[arg4];
                                    int var96 = class104.field1435[arg4];
                                    int var97 = this.field1741[var94] * var96 + this.field1723[var94] * var95 + 32767 >> 16;
                                    this.field1723[var94] = this.field1723[var94] * var96 + 32767 - this.field1741[var94] * var95 >> 16;
                                    this.field1741[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class104.field1426[arg2];
                                    int var99 = class104.field1435[arg2];
                                    int var100 = this.field1723[var94] * var99 + 32767 - this.field1708[var94] * var98 >> 16;
                                    this.field1708[var94] = this.field1723[var94] * var98 + this.field1708[var94] * var99 + 32767 >> 16;
                                    this.field1723[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class104.field1426[arg3];
                                    int var102 = class104.field1435[arg3];
                                    int var103 = this.field1741[var94] * var102 + this.field1708[var94] * var101 + 32767 >> 16;
                                    this.field1708[var94] = this.field1708[var94] * var102 + 32767 - this.field1741[var94] * var101 >> 16;
                                    this.field1741[var94] = var103;
                                }
                                this.field1741[var94] += field1769;
                                this.field1723[var94] += field1768;
                                this.field1708[var94] += field1759;
                            }
                        }
                    }
                }
                if (arg5 && this.field1749 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field1748.length) {
                            int[] var106 = this.field1748[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field1734 == null || (arg6 & this.field1734[var108]) != 0) {
                                    int var109 = this.field1745[var108];
                                    int var110 = this.field1745[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field1755[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class104.field1426[arg4];
                                            int var114 = class104.field1435[arg4];
                                            int var115 = this.field1749[var112] * var114 + this.field1707[var112] * var113 + 32767 >> 16;
                                            this.field1707[var112] = (short) (this.field1707[var112] * var114 + 32767 - this.field1749[var112] * var113 >> 16);
                                            this.field1749[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class104.field1426[arg2];
                                            int var117 = class104.field1435[arg2];
                                            int var118 = this.field1707[var112] * var117 + 32767 - this.field1728[var112] * var116 >> 16;
                                            this.field1728[var112] = (short) (this.field1728[var112] * var117 + this.field1707[var112] * var116 + 32767 >> 16);
                                            this.field1707[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class104.field1426[arg3];
                                            int var120 = class104.field1435[arg3];
                                            int var121 = this.field1749[var112] * var120 + this.field1728[var112] * var119 + 32767 >> 16;
                                            this.field1728[var112] = (short) (this.field1728[var112] * var120 + 32767 - this.field1749[var112] * var119 >> 16);
                                            this.field1749[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1712 != null) {
                        this.field1712.field881 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field1764) {
                    int var36 = arg7[6] * field1759 + arg7[0] * field1769 + arg7[3] * field1768 + 16384 >> 15;
                    int var37 = arg7[7] * field1759 + arg7[1] * field1769 + arg7[4] * field1768 + 16384 >> 15;
                    int var38 = arg7[8] * field1759 + arg7[2] * field1769 + arg7[5] * field1768 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field1769 = var39;
                    field1768 = var40;
                    field1759 = var41;
                    field1764 = false;
                }
                int[] var42 = new int[9];
                int var43 = class104.field1435[arg2] >> 1;
                int var44 = class104.field1426[arg2] >> 1;
                int var45 = class104.field1435[arg3] >> 1;
                int var46 = class104.field1426[arg3] >> 1;
                int var47 = class104.field1435[arg4] >> 1;
                int var48 = class104.field1426[arg4] >> 1;
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
                int var51 = var42[2] * -field1759 + var42[0] * -field1769 + var42[1] * -field1768 + 16384 >> 15;
                int var52 = var42[5] * -field1759 + var42[3] * -field1769 + var42[4] * -field1768 + 16384 >> 15;
                int var53 = var42[8] * -field1759 + var42[6] * -field1769 + var42[7] * -field1768 + 16384 >> 15;
                int var54 = field1769 + var51;
                int var55 = field1768 + var52;
                int var56 = field1759 + var53;
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
                    if (var80 < this.field1748.length) {
                        int[] var81 = this.field1748[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field1734 == null || (arg6 & this.field1734[var83]) != 0) {
                                int var84 = this.field1708[var83] * var68[2] + this.field1741[var83] * var68[0] + this.field1723[var83] * var68[1] + 16384 >> 15;
                                int var85 = this.field1708[var83] * var68[5] + this.field1741[var83] * var68[3] + this.field1723[var83] * var68[4] + 16384 >> 15;
                                int var86 = this.field1708[var83] * var68[8] + this.field1741[var83] * var68[6] + this.field1723[var83] * var68[7] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field1741[var83] = var87;
                                this.field1723[var83] = var88;
                                this.field1708[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field1748.length) {
                        int[] var174 = this.field1748[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field1734 == null || (arg6 & this.field1734[var176]) != 0) {
                                this.field1741[var176] -= field1769;
                                this.field1723[var176] -= field1768;
                                this.field1708[var176] -= field1759;
                                this.field1741[var176] = this.field1741[var176] * arg2 >> 7;
                                this.field1723[var176] = this.field1723[var176] * arg3 >> 7;
                                this.field1708[var176] = this.field1708[var176] * arg4 >> 7;
                                this.field1741[var176] += field1769;
                                this.field1723[var176] += field1768;
                                this.field1708[var176] += field1759;
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
                if (field1764) {
                    int var128 = arg7[6] * field1759 + arg7[0] * field1769 + arg7[3] * field1768 + 16384 >> 15;
                    int var129 = arg7[7] * field1759 + arg7[1] * field1769 + arg7[4] * field1768 + 16384 >> 15;
                    int var130 = arg7[8] * field1759 + arg7[2] * field1769 + arg7[5] * field1768 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field1769 = var131;
                    field1768 = var132;
                    field1759 = var133;
                    field1764 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field1769 * var134 + 16384 >> 15;
                int var138 = -field1768 * var135 + 16384 >> 15;
                int var139 = -field1759 * var136 + 16384 >> 15;
                int var140 = field1769 + var137;
                int var141 = field1768 + var138;
                int var142 = field1759 + var139;
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
                    if (var162 < this.field1748.length) {
                        int[] var163 = this.field1748[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field1734 == null || (arg6 & this.field1734[var165]) != 0) {
                                int var166 = this.field1708[var165] * var150[2] + this.field1741[var165] * var150[0] + this.field1723[var165] * var150[1] + 16384 >> 15;
                                int var167 = this.field1708[var165] * var150[5] + this.field1741[var165] * var150[3] + this.field1723[var165] * var150[4] + 16384 >> 15;
                                int var168 = this.field1708[var165] * var150[8] + this.field1741[var165] * var150[6] + this.field1723[var165] * var150[7] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field1741[var165] = var169;
                                this.field1723[var165] = var170;
                                this.field1708[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1746 != null && this.field1737 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field1746.length) {
                        int[] var179 = this.field1746[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field1735 == null || (arg6 & this.field1735[var181]) != 0) {
                                int var182 = (this.field1737[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field1737[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field1733.field881 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field1746 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field1746.length) {
                    int[] var185 = this.field1746[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field1735 == null || (arg6 & this.field1735[var187]) != 0) {
                            int var188 = this.field1725[var187] & 0xFFFF;
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
                            this.field1725[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field1733.field881 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "()V", line = 2640)
    public final void method835() {
        if (this.field1749 == null) {
            this.method809();
            return;
        }
        for (int var1 = 0; var1 < this.field1730; var1++) {
            this.field1741[var1] = -this.field1741[var1];
            this.field1708[var1] = -this.field1708[var1];
        }
        for (int var2 = 0; var2 < this.field1744; var2++) {
            this.field1749[var2] = (short) (-this.field1749[var2]);
            this.field1728[var2] = (short) (-this.field1728[var2]);
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
        if (this.field1712 != null) {
            this.field1712.field881 = false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V", line = 2674)
    public final void method836(int arg0) {
        if (this.field1749 == null) {
            this.method839(arg0);
            return;
        }
        int var2 = class104.field1426[arg0];
        int var3 = class104.field1435[arg0];
        for (int var4 = 0; var4 < this.field1730; var4++) {
            int var5 = this.field1741[var4] * var3 + this.field1708[var4] * var2 >> 16;
            this.field1708[var4] = this.field1708[var4] * var3 - this.field1741[var4] * var2 >> 16;
            this.field1741[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field1744; var6++) {
            int var7 = this.field1749[var6] * var3 + this.field1728[var6] * var2 >> 16;
            this.field1728[var6] = (short) (this.field1728[var6] * var3 - this.field1749[var6] * var2 >> 16);
            this.field1749[var6] = (short) var7;
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
        if (this.field1712 != null) {
            this.field1712.field881 = false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIII[FIF)V", line = 2715)
    private static final void method837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field1760 = var16;
        field1763 = var17;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2758)
    private static final void method838(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field1765 = var18;
        field1767 = var19;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 2840)
    public final void method839(int arg0) {
        int var2 = class104.field1426[arg0];
        int var3 = class104.field1435[arg0];
        for (int var4 = 0; var4 < this.field1730; var4++) {
            int var5 = this.field1741[var4] * var3 + this.field1708[var4] * var2 >> 16;
            this.field1708[var4] = this.field1708[var4] * var3 - this.field1741[var4] * var2 >> 16;
            this.field1741[var4] = var5;
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "()V", line = 2859)
    public final void method840() {
        if (this.field1749 == null) {
            this.method826();
            return;
        }
        for (int var1 = 0; var1 < this.field1730; var1++) {
            int var2 = this.field1741[var1];
            this.field1741[var1] = this.field1708[var1];
            this.field1708[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1744; var3++) {
            short var4 = this.field1749[var3];
            this.field1749[var3] = this.field1728[var3];
            this.field1728[var3] = (short) (-var4);
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
        if (this.field1712 != null) {
            this.field1712.field881 = false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "()V", line = 2896)
    public final void method841() {
        int var10002;
        if (this.field1738 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1730; var3++) {
                int var4 = this.field1738[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1748 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1748[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1730) {
                int var7 = this.field1738[var6] & 0xFF;
                this.field1748[var7][var1[var7]++] = var6++;
            }
            this.field1738 = null;
        }
        if (this.field1727 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1710; var10++) {
            int var11 = this.field1727[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1746 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1746[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1710) {
            int var14 = this.field1727[var13] & 0xFF;
            this.field1746[var14][var8[var14]++] = var13++;
        }
        this.field1727 = null;
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V", line = 2989)
    public final void method842(int arg0) {
        this.field1713 = (short) arg0;
        this.field1733.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 2994)
    public final void method843(int arg0) {
        int var2 = class104.field1426[arg0];
        int var3 = class104.field1435[arg0];
        for (int var4 = 0; var4 < this.field1730; var4++) {
            int var5 = this.field1741[var4] * var3 + this.field1723[var4] * var2 >> 16;
            this.field1723[var4] = this.field1723[var4] * var3 - this.field1741[var4] * var2 >> 16;
            this.field1741[var4] = var5;
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZZ)Lbf;", line = 3015)
    public final class362 method844(boolean arg0, boolean arg1, boolean arg2) {
        return this.method822(arg0, arg1, arg2, field1758, field1757);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lio;IIIZ)V", line = 3020)
    public final void method845(class294 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class124 var6 = (class124) arg0;
        if (this.field1710 == 0 || var6.field1710 == 0) {
            return;
        }
        int var7 = var6.field1750;
        int[] var8 = var6.field1741;
        int[] var9 = var6.field1723;
        int[] var10 = var6.field1708;
        short[] var11 = var6.field1749;
        short[] var12 = var6.field1707;
        short[] var13 = var6.field1728;
        short[] var14 = var6.field1747;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1715 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1715.field4539;
            var16 = this.field1715.field4538;
            var17 = this.field1715.field4537;
            var18 = this.field1715.field4536;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1715 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field1715.field4539;
            var20 = var6.field1715.field4538;
            var21 = var6.field1715.field4537;
            var22 = var6.field1715.field4536;
        }
        int[] var23 = var6.field1745;
        short[] var24 = var6.field1755;
        if (!var6.field1743.field1326) {
            var6.method804();
        }
        short var25 = var6.field1743.field1329;
        short var26 = var6.field1743.field1327;
        short var27 = var6.field1743.field1323;
        short var28 = var6.field1743.field1328;
        short var29 = var6.field1743.field1325;
        short var30 = var6.field1743.field1322;
        for (int var31 = 0; var31 < this.field1750; var31++) {
            int var32 = this.field1723[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field1741[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field1708[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1745[var31];
                        int var37 = this.field1745[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1755[var38] - 1;
                            if (var35 == -1 || this.field1747[var35] != 0) {
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
                                            this.field1715 = new class287();
                                            var15 = this.field1715.field4539 = class242.method1715(this.field1749, -66);
                                            var16 = this.field1715.field4538 = class242.method1715(this.field1707, -73);
                                            var17 = this.field1715.field4537 = class242.method1715(this.field1728, -125);
                                            var18 = this.field1715.field4536 = class242.method1715(this.field1747, -105);
                                        }
                                        if (var19 == null) {
                                            class287 var44 = var6.field1715 = new class287();
                                            var19 = var44.field4539 = class242.method1715(var11, -54);
                                            var20 = var44.field4538 = class242.method1715(var12, -61);
                                            var21 = var44.field4537 = class242.method1715(var13, -81);
                                            var22 = var44.field4536 = class242.method1715(var14, -125);
                                        }
                                        short var45 = this.field1749[var35];
                                        short var46 = this.field1707[var35];
                                        short var47 = this.field1728[var35];
                                        short var48 = this.field1747[var35];
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
                                        int var57 = this.field1745[var31];
                                        int var58 = this.field1745[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field1755[var59] - 1;
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

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ISIB)I", line = 3260)
    private static final int method846(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class104.field1440[class133.method915(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class104.field1438.method879(-7796, arg1 & 0xFFFF);
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
            int var9 = class104.field1438.method885(arg1 & 0xFFFF, (byte) 42);
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

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZZZZ)V", line = 3319)
    private final void method847(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field1720.field880 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field1733.field880 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field1712.field880 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field1722.field880 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field1726.field2260.length < this.field1744 * var6) {
            field1726 = new class143((this.field1744 + 100) * var6);
        } else {
            field1726.field2295 = 0;
        }
        if (arg1) {
            if (class272.field4318) {
                for (int var7 = 0; var7 < this.field1750; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field1741[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field1723[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field1708[var7]);
                    int var11 = this.field1745[var7];
                    int var12 = this.field1745[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field1755[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field1726.field2295 = var6 * var14;
                        field1726.method1052(var8, false);
                        field1726.method1052(var9, false);
                        field1726.method1052(var10, false);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field1750; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field1741[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field1723[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field1708[var15]);
                    int var19 = this.field1745[var15];
                    int var20 = this.field1745[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field1755[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field1726.field2295 = var6 * var22;
                        field1726.method1012(var16, -11);
                        field1726.method1012(var17, -11);
                        field1726.method1012(var18, -11);
                    }
                }
            }
        }
        if (arg2) {
            if (class290.field4566) {
                for (int var42 = 0; var42 < this.field1710; var42++) {
                    int var43 = method846(this.field1725[var42], this.field1729[var42], this.field1713, this.field1737[var42]);
                    field1726.field2295 = this.field1709[var42] * var6 + this.field1733.field880;
                    field1726.method1052(var43, false);
                    field1726.field2295 = this.field1719[var42] * var6 + this.field1733.field880;
                    field1726.method1052(var43, false);
                    field1726.field2295 = this.field1724[var42] * var6 + this.field1733.field880;
                    field1726.method1052(var43, false);
                }
            } else {
                int var23 = (int) class26.field307[0];
                int var24 = (int) class26.field307[1];
                int var25 = (int) class26.field307[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field1713 * 1.3F);
                int var28 = this.field1739 * var26 >> 8;
                for (int var29 = 0; var29 < this.field1710; var29++) {
                    short var30 = this.field1709[var29];
                    short var31 = this.field1747[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field1728[var30] * var25 + this.field1749[var30] * var23 + this.field1707[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field1728[var30] * var25 + this.field1749[var30] * var23 + this.field1707[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field1747[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field1719[var29];
                    short var34 = this.field1747[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field1728[var33] * var25 + this.field1749[var33] * var23 + this.field1707[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field1728[var33] * var25 + this.field1749[var33] * var23 + this.field1707[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field1747[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field1724[var29];
                    short var37 = this.field1747[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field1728[var36] * var25 + this.field1749[var36] * var23 + this.field1707[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field1728[var36] * var25 + this.field1749[var36] * var23 + this.field1707[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field1747[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method846(this.field1725[var29], this.field1729[var29], var32, this.field1737[var29]);
                    int var40 = method846(this.field1725[var29], this.field1729[var29], var35, this.field1737[var29]);
                    int var41 = method846(this.field1725[var29], this.field1729[var29], var38, this.field1737[var29]);
                    field1726.field2295 = var6 * var30 + this.field1733.field880;
                    field1726.method1052(var39, false);
                    field1726.field2295 = var6 * var33 + this.field1733.field880;
                    field1726.method1052(var40, false);
                    field1726.field2295 = var6 * var36 + this.field1733.field880;
                    field1726.method1052(var41, false);
                }
                this.field1749 = null;
                this.field1707 = null;
                this.field1728 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field1739;
            float var45 = 3.0F / (float) (this.field1739 / 2 + this.field1739);
            field1726.field2295 = this.field1712.field880;
            if (class272.field4318) {
                for (int var46 = 0; var46 < this.field1744; var46++) {
                    short var47 = this.field1747[var46];
                    if (var47 == 0) {
                        field1726.method1053((byte) 124, (float) this.field1749[var46] * var45);
                        field1726.method1053((byte) 93, (float) this.field1707[var46] * var45);
                        field1726.method1053((byte) 91, (float) this.field1728[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field1726.method1053((byte) 108, (float) this.field1749[var46] * var48);
                        field1726.method1053((byte) 105, (float) this.field1707[var46] * var48);
                        field1726.method1053((byte) 98, (float) this.field1728[var46] * var48);
                    }
                    field1726.field2295 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field1744; var49++) {
                    short var50 = this.field1747[var49];
                    if (var50 == 0) {
                        field1726.method1060((byte) 47, (float) this.field1749[var49] * var45);
                        field1726.method1060((byte) 47, (float) this.field1707[var49] * var45);
                        field1726.method1060((byte) 47, (float) this.field1728[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field1726.method1060((byte) 47, (float) this.field1749[var49] * var51);
                        field1726.method1060((byte) 47, (float) this.field1707[var49] * var51);
                        field1726.method1060((byte) 47, (float) this.field1728[var49] * var51);
                    }
                    field1726.field2295 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field1726.field2295 = this.field1722.field880;
            if (class272.field4318) {
                for (int var52 = 0; var52 < this.field1744; var52++) {
                    field1726.method1053((byte) 108, this.field1731[var52]);
                    field1726.method1053((byte) 91, this.field1718[var52]);
                    field1726.field2295 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field1744; var53++) {
                    field1726.method1060((byte) 47, this.field1731[var53]);
                    field1726.method1060((byte) 47, this.field1718[var53]);
                    field1726.field2295 += var6 - 8;
                }
            }
        }
        field1726.field2295 = this.field1744 * var6;
        if (arg0) {
            if (class272.field4272) {
                ByteBuffer var54 = ByteBuffer.wrap(field1726.field2260, 0, field1726.field2295);
                if (this.field1717 == null) {
                    this.field1717 = new class354(true);
                    this.field1717.method2446(var54);
                } else {
                    this.field1717.method2448(var54);
                }
                if (arg1) {
                    this.field1720.field881 = true;
                    this.field1720.field885 = null;
                    this.field1720.field884 = this.field1717;
                    this.field1720.field886 = var6;
                }
                if (arg2) {
                    this.field1733.field881 = true;
                    this.field1733.field885 = null;
                    this.field1733.field884 = this.field1717;
                    this.field1733.field886 = var6;
                }
                if (arg3) {
                    this.field1712.field881 = true;
                    this.field1712.field885 = null;
                    this.field1712.field884 = this.field1717;
                    this.field1712.field886 = var6;
                }
                if (arg4) {
                    this.field1722.field881 = true;
                    this.field1722.field885 = null;
                    this.field1722.field884 = this.field1717;
                    this.field1722.field886 = var6;
                }
            } else {
                if (field1751 == null || field1751.capacity() < field1726.field2295) {
                    field1751 = ByteBuffer.allocateDirect(var6 * 100 + field1726.field2295);
                } else {
                    field1751.clear();
                }
                field1751.put(field1726.field2260, 0, field1726.field2295);
                field1751.flip();
                if (arg1) {
                    this.field1720.field881 = true;
                    this.field1720.field885 = field1751;
                    this.field1720.field884 = null;
                    this.field1720.field886 = var6;
                }
                if (arg2) {
                    this.field1733.field881 = true;
                    this.field1733.field885 = field1751;
                    this.field1720.field884 = null;
                    this.field1733.field886 = var6;
                }
                if (arg3) {
                    this.field1712.field881 = true;
                    this.field1712.field885 = field1751;
                    this.field1712.field884 = null;
                    this.field1712.field886 = var6;
                }
                if (arg4) {
                    this.field1722.field881 = true;
                    this.field1722.field885 = field1751;
                    this.field1722.field884 = null;
                    this.field1722.field886 = var6;
                }
            }
        } else if (class272.field4302) {
            class354 var55 = new class354();
            ByteBuffer var56 = ByteBuffer.wrap(field1726.field2260, 0, field1726.field2295);
            var55.method2446(var56);
            if (arg1) {
                this.field1720.field881 = true;
                this.field1720.field885 = null;
                this.field1720.field884 = var55;
                this.field1720.field886 = var6;
            }
            if (arg2) {
                this.field1733.field881 = true;
                this.field1733.field885 = null;
                this.field1733.field884 = var55;
                this.field1733.field886 = var6;
            }
            if (arg3) {
                this.field1712.field881 = true;
                this.field1712.field885 = null;
                this.field1712.field884 = var55;
                this.field1712.field886 = var6;
            }
            if (arg4) {
                this.field1722.field881 = true;
                this.field1722.field885 = null;
                this.field1722.field884 = var55;
                this.field1722.field886 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field1726.field2295);
            var57.put(field1726.field2260, 0, field1726.field2295);
            var57.flip();
            if (arg1) {
                this.field1720.field881 = true;
                this.field1720.field885 = var57;
                this.field1720.field884 = null;
                this.field1720.field886 = var6;
            }
            if (arg2) {
                this.field1733.field881 = true;
                this.field1733.field885 = var57;
                this.field1720.field884 = null;
                this.field1733.field886 = var6;
            }
            if (arg3) {
                this.field1712.field881 = true;
                this.field1712.field885 = var57;
                this.field1712.field884 = null;
                this.field1712.field886 = var6;
            }
            if (arg4) {
                this.field1722.field881 = true;
                this.field1722.field885 = var57;
                this.field1722.field884 = null;
                this.field1722.field886 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[IIIIZ)V", line = 3848)
    public final void method848(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field1769 = 0;
            field1768 = 0;
            field1759 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field1748.length) {
                    int[] var14 = this.field1748[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field1769 += this.field1741[var16];
                        field1768 += this.field1723[var16];
                        field1759 += this.field1708[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field1769 = field1769 / var11 + var8;
                field1768 = field1768 / var11 + var9;
                field1759 = field1759 / var11 + var10;
            } else {
                field1769 = var8;
                field1768 = var9;
                field1759 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field1748.length) {
                    int[] var22 = this.field1748[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field1741[var24] += var17;
                        this.field1723[var24] += var18;
                        this.field1708[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1748.length) {
                    int[] var27 = this.field1748[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field1741[var29] -= field1769;
                        this.field1723[var29] -= field1768;
                        this.field1708[var29] -= field1759;
                        if (arg4 != 0) {
                            int var30 = class104.field1426[arg4];
                            int var31 = class104.field1435[arg4];
                            int var32 = this.field1741[var29] * var31 + this.field1723[var29] * var30 + 32767 >> 16;
                            this.field1723[var29] = this.field1723[var29] * var31 + 32767 - this.field1741[var29] * var30 >> 16;
                            this.field1741[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class104.field1426[arg2];
                            int var34 = class104.field1435[arg2];
                            int var35 = this.field1723[var29] * var34 + 32767 - this.field1708[var29] * var33 >> 16;
                            this.field1708[var29] = this.field1723[var29] * var33 + this.field1708[var29] * var34 + 32767 >> 16;
                            this.field1723[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class104.field1426[arg3];
                            int var37 = class104.field1435[arg3];
                            int var38 = this.field1741[var29] * var37 + this.field1708[var29] * var36 + 32767 >> 16;
                            this.field1708[var29] = this.field1708[var29] * var37 + 32767 - this.field1741[var29] * var36 >> 16;
                            this.field1741[var29] = var38;
                        }
                        this.field1741[var29] += field1769;
                        this.field1723[var29] += field1768;
                        this.field1708[var29] += field1759;
                    }
                }
            }
            if (arg5 && this.field1749 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field1748.length) {
                        int[] var41 = this.field1748[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field1745[var43];
                            int var45 = this.field1745[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field1755[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class104.field1426[arg4];
                                    int var49 = class104.field1435[arg4];
                                    int var50 = this.field1749[var47] * var49 + this.field1707[var47] * var48 + 32767 >> 16;
                                    this.field1707[var47] = (short) (this.field1707[var47] * var49 + 32767 - this.field1749[var47] * var48 >> 16);
                                    this.field1749[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class104.field1426[arg2];
                                    int var52 = class104.field1435[arg2];
                                    int var53 = this.field1707[var47] * var52 + 32767 - this.field1728[var47] * var51 >> 16;
                                    this.field1728[var47] = (short) (this.field1728[var47] * var52 + this.field1707[var47] * var51 + 32767 >> 16);
                                    this.field1707[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class104.field1426[arg3];
                                    int var55 = class104.field1435[arg3];
                                    int var56 = this.field1749[var47] * var55 + this.field1728[var47] * var54 + 32767 >> 16;
                                    this.field1728[var47] = (short) (this.field1728[var47] * var55 + 32767 - this.field1749[var47] * var54 >> 16);
                                    this.field1749[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field1712 != null) {
                    this.field1712.field881 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field1748.length) {
                    int[] var59 = this.field1748[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field1741[var61] -= field1769;
                        this.field1723[var61] -= field1768;
                        this.field1708[var61] -= field1759;
                        this.field1741[var61] = this.field1741[var61] * arg2 >> 7;
                        this.field1723[var61] = this.field1723[var61] * arg3 >> 7;
                        this.field1708[var61] = this.field1708[var61] * arg4 >> 7;
                        this.field1741[var61] += field1769;
                        this.field1723[var61] += field1768;
                        this.field1708[var61] += field1759;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1746 != null && this.field1737 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field1746.length) {
                        int[] var64 = this.field1746[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field1737[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field1737[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field1733.field881 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field1746 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field1746.length) {
                    int[] var70 = this.field1746[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field1725[var72] & 0xFFFF;
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
                        this.field1725[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field1733.field881 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lrd;IJIIIIFF)S", line = 4256)
    private final short method849(class193 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field1745[arg1];
        int var12 = this.field1745[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field1755[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field1716[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field1755[var13] = (short) (this.field1744 + 1);
        field1716[var13] = arg2;
        this.field1749[this.field1744] = (short) arg3;
        this.field1707[this.field1744] = (short) arg4;
        this.field1728[this.field1744] = (short) arg5;
        this.field1747[this.field1744] = (short) arg6;
        this.field1731[this.field1744] = arg7;
        this.field1718[this.field1744] = arg8;
        return (short) (this.field1744++);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIFFF)[F", line = 4293)
    private static final float[] method850(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()Z", line = 4358)
    public final boolean method851() {
        return this.field1732 && this.field1741 != null && this.field1749 != null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZZZZZZZZZZ)Ldc;", line = 4365)
    public final class124 method852(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class124 var12 = new class124();
        var12.field1730 = this.field1730;
        var12.field1750 = this.field1750;
        var12.field1744 = this.field1744;
        var12.field1710 = this.field1710;
        if (arg0) {
            var12.field1741 = this.field1741;
            var12.field1708 = this.field1708;
        } else {
            var12.field1741 = class87.method551((byte) -111, this.field1741);
            var12.field1708 = class87.method551((byte) -111, this.field1708);
        }
        if (arg1) {
            var12.field1723 = this.field1723;
        } else {
            var12.field1723 = class87.method551((byte) -111, this.field1723);
        }
        if (arg0 && arg1) {
            var12.field1720 = this.field1720;
            var12.field1743 = this.field1743;
        } else {
            var12.field1720 = new class71();
            var12.field1743 = new class98();
        }
        if (arg2) {
            var12.field1725 = this.field1725;
        } else {
            var12.field1725 = class242.method1715(this.field1725, -84);
        }
        if (arg3) {
            var12.field1737 = this.field1737;
        } else {
            var12.field1737 = class109.method709(-18433, this.field1737);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class290.field4566) {
            var12.field1733 = new class71();
        } else {
            var12.field1733 = this.field1733;
        }
        if (arg5) {
            var12.field1749 = this.field1749;
            var12.field1707 = this.field1707;
            var12.field1728 = this.field1728;
            var12.field1747 = this.field1747;
        } else {
            var12.field1749 = class242.method1715(this.field1749, -56);
            var12.field1707 = class242.method1715(this.field1707, -76);
            var12.field1728 = class242.method1715(this.field1728, -123);
            var12.field1747 = class242.method1715(this.field1747, -65);
        }
        if (!class290.field4566) {
            var12.field1712 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field1712 = this.field1712;
        } else {
            var12.field1712 = new class71();
        }
        if (arg8) {
            var12.field1731 = this.field1731;
            var12.field1718 = this.field1718;
            var12.field1722 = this.field1722;
        } else {
            var12.field1731 = class52.method313(false, this.field1731);
            var12.field1718 = class52.method313(false, this.field1718);
            var12.field1722 = new class71();
        }
        if (arg9) {
            var12.field1709 = this.field1709;
            var12.field1719 = this.field1719;
            var12.field1724 = this.field1724;
            var12.field1736 = this.field1736;
        } else {
            var12.field1709 = class242.method1715(this.field1709, -121);
            var12.field1719 = class242.method1715(this.field1719, -111);
            var12.field1724 = class242.method1715(this.field1724, -121);
            var12.field1736 = new class71();
        }
        if (arg10) {
            var12.field1729 = this.field1729;
        } else {
            var12.field1729 = class242.method1715(this.field1729, -79);
        }
        var12.field1738 = this.field1738;
        var12.field1748 = this.field1748;
        var12.field1727 = this.field1727;
        var12.field1746 = this.field1746;
        var12.field1714 = this.field1714;
        var12.field1755 = this.field1755;
        var12.field1745 = this.field1745;
        var12.field1713 = this.field1713;
        var12.field1739 = this.field1739;
        var12.field1711 = this.field1711;
        var12.field1752 = this.field1752;
        var12.field1734 = this.field1734;
        var12.field1735 = this.field1735;
        return var12;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIJ)V", line = 4507)
    public final void method853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field1744 == 0) {
            return;
        }
        GL var10 = class272.field4310;
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
        this.method832();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)V", line = 4535)
    public final void method854(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1730; var4++) {
            this.field1741[var4] += arg0;
            this.field1723[var4] += arg1;
            this.field1708[var4] += arg2;
        }
        this.field1743.field1326 = false;
        this.field1720.field881 = false;
    }
}
