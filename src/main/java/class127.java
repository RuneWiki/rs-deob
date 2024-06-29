import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class127 extends class63 {

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public int field1744 = 0;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Z")
    private boolean field1732 = false;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public int field1739 = 78642;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    private int field1741 = 0;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public int field1729 = 512;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public int field1752 = 3500;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public int field1754 = 50;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public int field1757 = 0;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public int field1742 = 0;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public int field1759 = 512;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "Z")
    public boolean field1760 = false;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public int field1756 = 0;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "Z")
    private boolean field1763 = false;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    private int field1746 = 0;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    public int field1770 = 75518;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public int field1737 = 0;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public int field1766 = 0;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Z")
    private boolean field1751 = false;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
    private int field1769 = 0;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
    private int field1772 = 3500;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "I")
    public int field1773 = 0;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public int field1750 = 45823;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public int field1734 = this.field1772 - 255;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "Ltl;")
    private class400 field1733 = new class400(16);

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1762;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Ltn;")
    private class402 field1745;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "[I")
    public int[] field1743;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "F")
    private float field1731;

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "F")
    private float field1768;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    private int field1749;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "Ltl;")
    private class400 field1764;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Lk;")
    public class62 field1728;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "Lok;")
    private class68 field1774;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "Z")
    public boolean field1755;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "[Lte;")
    private class344[] field1740;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(IIIIII)V")
    public final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method550(arg0, arg1, arg2, arg4, arg5);
        this.method550(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method579(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method579(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)I")
    public final int method578(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public final void method553(int arg0) {
        if (this.field1758 != arg0) {
            this.field1758 = arg0;
            this.field1740 = new class344[this.field1758];
            for (int var2 = 0; var2 < this.field1758; ++var2) {
                this.field1740[var2] = new class344(this);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "()V")
    public final void method573() {
    }

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "()Z")
    public final boolean method514() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class344 var11 = this.method882(Thread.currentThread());
        class339 var12 = var11.field5194;
        var12.field5088 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field5088 = false;
            var12.field5087 = 0;
            var12.field5079 = true;
            var12.method2072(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field5088 = false;
            var12.field5087 = 255 - var13;
            var12.field5079 = true;
            var12.method2072(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field5088 = true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([Lns;Lim;Lmu;[Lro;I)V")
    public final void method503(class57[] arg0, class268 arg1, class315 arg2, class117[] arg3, int arg4) {
        class133[] var6 = new class133[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class133) arg0[var7];
            }
        }
        class133 var8 = class133.method941(this, var6);
        var8.method932(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([IIIII)Ldp;")
    public final class319 method536(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class112(this, arg0, arg1, arg2, arg3, arg4) : new class359(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class112(this, arg0, arg1, arg2, arg3, arg4) : new class359(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "()Lmu;")
    public final class315 method580() {
        return new class62();
    }

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "()I")
    public final int method524() {
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lis;[Lff;Z)Ltr;")
    public final class229 method539(class1 arg0, class368[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field5561;
            var5[var7] = arg1[var7].field5559;
            if (arg1[var7].field5557 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class160(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class348(this, arg0, arg1, var4, var5);
        } else {
            return new class474(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "()V")
    public final void method492() {
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lim;)V")
    public final void method502(class268 arg0) {
        class342 var2 = arg0.field3965.field5876;
        for (class342 var3 = var2.field5114; var2 != var3; var3 = var3.field5114) {
            class394 var4 = (class394) var3;
            int var5 = var4.field5806 >> 12;
            int var6 = var4.field5799 >> 12;
            int var7 = var4.field5801 >> 12;
            int var8 = (this.field1728.field846 * var7 + this.field1728.field851 * var5 + this.field1728.field847 * var6 >> 15) + this.field1728.field853;
            if (var8 >= this.field1754 && var8 <= this.field1772) {
                int var9 = ((this.field1728.field849 * var7 + this.field1728.field854 * var6 + this.field1728.field850 * var5 >> 15) + this.field1728.field845) * this.field1729 / var8 + this.field1753;
                int var10 = ((this.field1728.field852 * var7 + this.field1728.field855 * var6 + this.field1728.field848 * var5 >> 15) + this.field1728.field856) * this.field1759 / var8 + this.field1761;
                if (var9 >= this.field1744 && var9 <= this.field1773 && var10 >= this.field1737 && var10 <= this.field1756) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method881(var4, var9, var10, (var4.field5807 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public final void method532(int arg0) {
        this.field1740[arg0].method2118((Runnable) null, 127);
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(IIII)[I")
    public final int[] method560(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field1738 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field1743[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[I)V")
    public final void method518(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field1728.field846 * arg2 + this.field1728.field851 * arg0 + this.field1728.field847 * arg1 >> 15) + this.field1728.field853;
        if (var5 >= this.field1754 && var5 <= this.field1772) {
            int var6 = ((this.field1728.field849 * arg2 + this.field1728.field854 * arg1 + this.field1728.field850 * arg0 >> 15) + this.field1728.field845) * this.field1729 / var5;
            int var7 = ((this.field1728.field852 * arg2 + this.field1728.field855 * arg1 + this.field1728.field848 * arg0 >> 15) + this.field1728.field856) * this.field1759 / var5;
            if (var6 >= this.field1771 && var6 <= this.field1747 && var7 >= this.field1735 && var7 <= this.field1767) {
                arg3[0] = var6 - this.field1771;
                arg3[1] = var7 - this.field1735;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "()V")
    public final void method587() {
        this.field1764.method2401((byte) -37);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(IIIIII)V")
    public final void method551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method550(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method550(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method579(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method579(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
            }
        } else {
            if (var7 + var8 < 0) {
                arg0 += var7;
                var7 = -var7;
                arg1 += var8;
                var8 = -var8;
            }
            if (var7 > var8) {
                int var9 = arg1 << 16;
                int var10 = var9 + 32768;
                int var11 = var8 << 16;
                int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
                int var13 = arg0 + var7;
                if (arg0 < this.field1744) {
                    var10 += (this.field1744 - arg0) * var12;
                    arg0 = this.field1744;
                }
                if (var13 >= this.field1773) {
                    var13 = this.field1773 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field1737 && var17 < this.field1756) {
                                int var18 = this.field1738 * var17 + arg0;
                                int var19 = this.field1743[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field1743[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field1737 && var21 < this.field1756) {
                                int var22 = this.field1738 * var21 + arg0;
                                int var23 = this.field1743[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field1743[var22] = var24 - var26 | var26 - (var26 >>> 8);
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var13) {
                        int var27 = var10 >> 16;
                        if (var27 >= this.field1737 && var27 < this.field1756) {
                            this.field1743[this.field1738 * var27 + arg0] = arg4;
                        }
                        var10 += var12;
                        ++arg0;
                    }
                }
            } else {
                int var28 = arg0 << 16;
                int var29 = var28 + 32768;
                int var30 = var7 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
                int var32 = arg1 + var8;
                if (arg1 < this.field1737) {
                    var29 += (this.field1737 - arg1) * var31;
                    arg1 = this.field1737;
                }
                if (var32 >= this.field1756) {
                    var32 = this.field1756 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field1744 && var46 < this.field1773) {
                            this.field1743[this.field1738 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field1744 && var36 < this.field1773) {
                            int var37 = this.field1738 * arg1 + var36;
                            int var38 = this.field1743[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field1743[this.field1738 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field1744 && var40 < this.field1773) {
                            int var41 = this.field1738 * arg1 + var40;
                            int var42 = this.field1743[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field1743[var41] = var43 - var45 | var45 - (var45 >>> 8);
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lcp;I)V")
    public class127(Canvas arg0, class481 arg1, int arg2) {
        super(arg2, arg1);
        this.field1762 = arg0;
        this.field1745 = class103.method776(this.field1762, (byte) 8);
        this.field1743 = this.field1745.field5869;
        this.field1738 = this.field1745.field5866;
        this.field1730 = this.field1745.field5865;
        this.method884();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method537(Rectangle[] arg0, int arg1) {
        if (this.field1762 != null && this.field1745 != null) {
            try {
                Graphics var3 = this.field1762.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field1738 && var5.y <= this.field1730 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field1745.method2358(var3, (byte) -107, var5.width, var5.y, var5.height, var5.x);
                    }
                }
            } catch (Exception var6) {
                this.field1762.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "()V")
    public final void method493() {
        this.field1744 = 0;
        this.field1737 = 0;
        this.field1773 = this.field1738;
        this.field1756 = this.field1730;
        this.method880();
    }

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "()Z")
    public final boolean method556() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "()V")
    public final void method533() {
        if (this.field1763) {
            class120.method850(-1, false, true);
            this.field1763 = false;
        }
        this.field1762 = null;
        this.field1745 = null;
        this.field1732 = true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IFFFFF)V")
    public final void method575(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field1750 = (int) (arg1 * 65535.0F);
        this.field1739 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field1736 = (int) (arg3 * 65535.0F / var7);
        this.field1748 = (int) (arg4 * 65535.0F / var7);
        this.field1765 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(IIII)V")
    public final void method572(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1744 < arg0) {
            this.field1744 = arg0;
        }
        if (this.field1737 < arg1) {
            this.field1737 = arg1;
        }
        if (this.field1773 > arg2) {
            this.field1773 = arg2;
        }
        if (this.field1756 > arg3) {
            this.field1756 = arg3;
        }
        this.method880();
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "()Z")
    public final boolean method496() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)Z")
    public final boolean method879(int arg0) {
        return super.field871.method1331(9386, arg0).field1210;
    }

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "()Z")
    public final boolean method581() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Las;)V")
    public final void method498(class15 arg0) {
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
    private final void method880() {
        this.field1771 = this.field1744 - this.field1753;
        this.field1747 = this.field1773 - this.field1753;
        this.field1735 = this.field1737 - this.field1761;
        this.field1767 = this.field1756 - this.field1761;
        for (int var1 = 0; var1 < this.field1758; ++var1) {
            class339 var5 = this.field1740[var1].field5194;
            var5.field5089 = this.field1753 - this.field1744;
            var5.field5085 = this.field1761 - this.field1737;
            var5.field5084 = this.field1773 - this.field1744;
            var5.field5080 = this.field1756 - this.field1737;
        }
        int var2 = this.field1738 * this.field1737 + this.field1744;
        for (int var3 = this.field1737; var3 < this.field1756; ++var3) {
            for (int var4 = 0; var4 < this.field1758; ++var4) {
                this.field1740[var4].field5194.field5083[var3 - this.field1737] = var2;
            }
            var2 += this.field1738;
        }
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "()Z")
    public final boolean method495() {
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIILus;II)V")
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class401 arg6, int arg7, int arg8) {
        class473 var10 = (class473) arg6;
        int[] var11 = var10.field6629;
        int[] var12 = var10.field6625;
        int var13 = this.field1737 > arg8 ? this.field1737 : arg8;
        int var14 = this.field1756 < var11.length + arg8 ? this.field1756 : var11.length + arg8;
        int var15 = arg2 - arg0;
        int var16 = arg3 - arg1;
        if (var15 + var16 < 0) {
            arg0 += var15;
            var15 = -var15;
            arg1 += var16;
            var16 = -var16;
        }
        if (var15 > var16) {
            int var17 = arg1 << 16;
            int var18 = var17 + 32768;
            int var19 = var16 << 16;
            int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
            int var21 = arg0 + var15;
            if (arg0 < this.field1744) {
                var18 += (this.field1744 - arg0) * var20;
                arg0 = this.field1744;
            }
            if (var21 >= this.field1773) {
                var21 = this.field1773 - 1;
            }
            int var22 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
                if (arg5 == 1) {
                    int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
                    int var24 = 256 - var22;
                    while (arg0 <= var21) {
                        int var25 = var18 >> 16;
                        int var26 = var25 - arg8;
                        if (var25 >= var13 && var25 < var14) {
                            int var27 = var11[var26] + arg7;
                            if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                                int var28 = this.field1738 * var25 + arg0;
                                int var29 = this.field1743[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field1743[var28] = var23 + var30;
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var21) {
                        int var31 = var18 >> 16;
                        int var32 = var31 - arg8;
                        if (var31 >= var13 && var31 < var14) {
                            int var33 = var11[var32] + arg7;
                            if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                                int var34 = this.field1738 * var31 + arg0;
                                int var35 = this.field1743[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field1743[var34] = var36 - var38 | var38 - (var38 >>> 8);
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var21) {
                    int var39 = var18 >> 16;
                    int var40 = var39 - arg8;
                    if (var39 >= var13 && var39 < var14) {
                        int var41 = var11[var40] + arg7;
                        if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                            this.field1743[this.field1738 * var39 + arg0] = arg4;
                        }
                    }
                    var18 += var20;
                    ++arg0;
                }
            }
        } else {
            int var42 = arg0 << 16;
            int var43 = var42 + 32768;
            int var44 = var15 << 16;
            int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
            int var46 = arg1 + var16;
            if (arg1 < var13) {
                var43 += (var13 - arg1) * var45;
                arg1 = var13;
            }
            if (var46 >= var14) {
                var46 = var14 - 1;
            }
            int var47 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var47 == 255) {
                while (arg1 <= var46) {
                    int var64 = var43 >> 16;
                    int var65 = arg1 - arg8;
                    int var66 = var11[var65] + arg7;
                    if (var64 >= this.field1744 && var64 < this.field1773 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field1743[this.field1738 * arg1 + var64] = arg4;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 1) {
                int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
                int var49 = 256 - var47;
                while (arg1 <= var46) {
                    int var50 = var43 >> 16;
                    int var51 = arg1 - arg8;
                    int var52 = var11[var51] + arg7;
                    if (var50 >= this.field1744 && var50 < this.field1773 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field1738 * arg1 + var50;
                        int var54 = this.field1743[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field1743[this.field1738 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field1744 && var56 < this.field1773 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field1738 * arg1 + var56;
                        int var60 = this.field1743[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field1743[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "()V")
    public final void method563() {
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lft;III)V")
    public final void method881(class394 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field5802;
        if (var6 == -1) {
            this.method519(arg1, arg2, var5, arg0.field5810, 1);
        } else {
            if (this.field1774 == null || (long) var6 != this.field1774.field436) {
                this.field1774 = (class68) this.field1733.method2393(-120, (long) var6);
            }
            if (this.field1774 == null) {
                int[] var7 = this.method889(var6);
                if (var7 == null) {
                    return;
                }
                this.field1774 = new class68();
                this.field1774.field927 = this.method885(var6);
                int var8 = this.field1774.field927 ? 64 : 128;
                this.field1774.field921 = this.method536(var7, 0, var8, var8, var8);
                this.field1733.method2395(0, this.field1774, (long) var6);
            }
            if (this.field1774.field927) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field1774.field921.method792(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field5810, 1);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V")
    public final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class344 var8 = this.method882(Thread.currentThread());
        class339 var9 = var8.field5194;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var17 = arg5 * var16 >> 17;
            int var18 = arg5 * var16 + 1 >> 17;
            int var19 = arg5 * var15 >> 17;
            int var20 = arg5 * var15 + 1 >> 17;
            int var21 = arg0 - var9.method2082();
            int var22 = arg1 - var9.method2077();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field5087 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field5087 = 255 - (arg4 >> 24);
            }
            var9.field5079 = var23 < 0 || var23 > var9.field5084 || var24 < 0 || var24 > var9.field5084 || var25 < 0 || var25 > var9.field5084;
            var9.method2079(var27, var28, var29, var23, var24, var25, arg4);
            var9.field5079 = var23 < 0 || var23 > var9.field5084 || var24 < 0 || var24 > var9.field5084 || var26 < 0 || var26 > var9.field5084;
            var9.method2079(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(FFF)V")
    public final void method586(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(IIII)V")
    public final void method570(int arg0, int arg1, int arg2, int arg3) {
        this.field1742 = arg0;
        this.field1757 = arg1;
        this.field1766 = arg2;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    public final void method554(int arg0) {
        int var2 = arg0 - this.field1749;
        for (Object var3 = this.field1764.method2392(95); var3 != null; var3 = this.field1764.method2399(0)) {
            class291 var4 = (class291) var3;
            if (var4.field4412) {
                var4.field4414 += var2;
                int var5 = var4.field4414 / 20;
                if (var5 > 0) {
                    class85 var6 = super.field871.method1331(9386, var4.field4409);
                    var4.method1838(var6.field1208 * var2 * 50 / 1000, var6.field1195 * var2 * 50 / 1000);
                    var4.field4414 -= var5 * 20;
                }
                var4.field4412 = false;
            }
        }
        this.field1749 = arg0;
        this.field1733.method2389(false, 5);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/Runnable;)Lte;")
    public final class344 method882(Runnable arg0) {
        for (int var2 = 0; var2 < this.field1758; ++var2) {
            if (this.field1740[var2].field5199 == arg0) {
                return this.field1740[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)[I")
    public final int[] method883(int arg0) {
        class400 var2 = this.field1764;
        class291 var3;
        synchronized (this.field1764) {
            var3 = (class291) this.field1764.method2393(-126, (long) arg0);
            if (var3 == null) {
                if (!super.field871.method1335(arg0, (byte) 9)) {
                    return null;
                }
                class85 var5 = super.field871.method1331(9386, arg0);
                int var6 = !var5.field1197 && !this.field1751 ? 128 : 64;
                var3 = new class291(arg0, var6, super.field871.method1332(false, var6, arg0, var6, 0.7F, true), var5.field1212);
                this.field1764.method2395(0, var3, (long) arg0);
            }
        }
        var3.field4412 = true;
        return var3.method1839();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Lku;")
    public final class381 method505(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(FF)V")
    public final void method501(float arg0, float arg1) {
        this.field1768 = arg0;
        this.field1731 = arg1;
        this.method886();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[Lma;)V")
    public final void method542(int arg0, class233[] arg1) {
    }

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "()Z")
    public final boolean method576() {
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lff;Z)Ldp;")
    public final class319 method547(class368 arg0, boolean arg1) {
        int[] var3 = arg0.field5553;
        byte[] var4 = arg0.field5554;
        int var5 = arg0.field5561;
        int var6 = arg0.field5559;
        class108 var11;
        if (arg1 && arg0.field5557 == null) {
            int[] var7 = new int[var3.length];
            byte[] var8 = new byte[var5 * var6];
            for (int var9 = 0; var9 < var6; ++var9) {
                int var12 = var5 * var9;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var8[var12 + var13] = var4[var12 + var13];
                }
            }
            for (int var10 = 0; var10 < var3.length; ++var10) {
                var7[var10] = var3[var10];
            }
            var11 = new class248(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field5557;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class112(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class112(this, var14, var5, var6);
                var11 = new class359(this, var14, var5, var6);
            }
        }
        var11.method797(arg0.field5560, arg0.field5555, arg0.field5556, arg0.field5558);
        return var11;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method509(Canvas arg0) {
        this.field1762 = arg0;
        this.method546();
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
    public final void method589(int arg0) {
        this.method508(0, 0, this.field1738, this.field1730, arg0, 0);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()V")
    public final void method490() {
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)I")
    public final int method583(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(IIII)V")
    public final void method521(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([Lns;Lmu;[Lro;I)V")
    public final void method557(class57[] arg0, class315 arg1, class117[] arg2, int arg3) {
        class133[] var5 = new class133[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class133) arg0[var6];
            }
        }
        class133 var7 = class133.method941(this, var5);
        var7.method932(arg1, arg2 != null ? arg2[0] : null, (class268) null, arg3);
    }

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "()Z")
    public final boolean method528() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public final void method564(int arg0) {
        this.field1740[arg0].method2118(Thread.currentThread(), 124);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
    private final void method884() {
        this.field1764 = new class400(20);
        this.field1728 = new class62();
        class200.method1359(true, 1, false);
        this.field1763 = true;
        this.method553(1);
        this.method564(0);
        this.method493();
    }

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "()Z")
    public final boolean method566() {
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[I[I)Lus;")
    public final class401 method506(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class473(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lns;Lim;Lmu;Lro;I)V")
    public final void method552(class57 arg0, class268 arg1, class315 arg2, class117 arg3, int arg4) {
        ((class133) arg0).method932(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field1737) {
            var6 = this.field1737;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field1756) {
            var7 = this.field1756;
        }
        int var8 = var6;
        int var9 = arg2 * arg2;
        int var10 = 0;
        int var11 = arg1 - var6;
        int var12 = var11 * var11;
        int var13 = var12 - var11;
        if (arg1 > var7) {
            arg1 = var7;
        }
        int var14 = arg3 >>> 24;
        if (arg4 == 0 || arg4 == 1 && var14 == 255) {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var64 = arg0 - var10 + 1;
                if (var64 < this.field1744) {
                    var64 = this.field1744;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field1773) {
                    var65 = this.field1773;
                }
                int var66 = this.field1738 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field1743[var66++] = arg3;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var55 = arg2;
            int var56 = var8 - arg1;
            int var57 = var56 * var56 + var9;
            int var58 = var57 - arg2;
            int var59 = var57 - var56;
            while (var8 < var7) {
                while (var59 > var9 && var58 > var9) {
                    var59 -= var55-- + var55;
                    var58 -= var55 + var55;
                }
                int var60 = arg0 - var55;
                if (var60 < this.field1744) {
                    var60 = this.field1744;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field1773 - 1) {
                    var61 = this.field1773 - 1;
                }
                int var62 = this.field1738 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field1743[var62++] = arg3;
                }
                ++var8;
                var59 += var56 + var56;
                var58 += var56++ + var56;
            }
        } else if (arg4 == 1) {
            int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
            int var16 = 256 - var14;
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var28 = arg0 - var10 + 1;
                if (var28 < this.field1744) {
                    var28 = this.field1744;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field1773) {
                    var29 = this.field1773;
                }
                int var30 = this.field1738 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field1743[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field1743[var30++] = var15 + var33;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var17 = arg2;
            int var18 = -var11;
            int var19 = var18 * var18 + var9;
            int var20 = var19 - arg2;
            int var21 = var19 - var18;
            while (var8 < var7) {
                while (var21 > var9 && var20 > var9) {
                    var21 -= var17-- + var17;
                    var20 -= var17 + var17;
                }
                int var22 = arg0 - var17;
                if (var22 < this.field1744) {
                    var22 = this.field1744;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field1773 - 1) {
                    var23 = this.field1773 - 1;
                }
                int var24 = this.field1738 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field1743[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field1743[var24++] = var15 + var27;
                }
                ++var8;
                var21 += var18 + var18;
                var20 += var18++ + var18;
            }
        } else if (arg4 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var47 = arg0 - var10 + 1;
                if (var47 < this.field1744) {
                    var47 = this.field1744;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field1773) {
                    var48 = this.field1773;
                }
                int var49 = this.field1738 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field1743[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field1743[var49++] = var52 - var54 | var54 - (var54 >>> 8);
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var34 = arg2;
            int var35 = -var11;
            int var36 = var35 * var35 + var9;
            int var37 = var36 - arg2;
            int var38 = var36 - var35;
            while (var8 < var7) {
                while (var38 > var9 && var37 > var9) {
                    var38 -= var34-- + var34;
                    var37 -= var34 + var34;
                }
                int var39 = arg0 - var34;
                if (var39 < this.field1744) {
                    var39 = this.field1744;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field1773 - 1) {
                    var40 = this.field1773 - 1;
                }
                int var41 = this.field1738 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field1743[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field1743[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(IIIII)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field1737 && arg1 < this.field1756) {
            if (arg0 < this.field1744) {
                arg2 -= this.field1744 - arg0;
                arg0 = this.field1744;
            }
            if (arg0 + arg2 > this.field1773) {
                arg2 = this.field1773 - arg0;
            }
            int var6 = this.field1738 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1743[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field1743[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field1743[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field1743[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field1743[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "()Z")
    public final boolean method523() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "()Z")
    public final boolean method504() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)Z")
    public final boolean method885(int arg0) {
        return this.field1751 || super.field871.method1331(9386, arg0).field1197;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([I)V")
    public final void method540(int[] arg0) {
        arg0[0] = this.field1744;
        arg0[1] = this.field1737;
        arg0[2] = this.field1773;
        arg0[3] = this.field1756;
    }

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "()F")
    public final float method520() {
        return this.field1731;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
    private final void method886() {
        if (this.field1731 != 0.0F) {
            float var1 = (float) this.field1772;
            float var2 = (float) this.field1754;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field1768 / (this.field1768 + this.field1731);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field1731;
            this.field1752 = (int) (((float) this.field1772 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field1752 = this.field1772;
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(IIIIII)Z")
    public final boolean method567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field1728.field846 * arg2 + this.field1728.field851 * arg0 + this.field1728.field847 * arg1 >> 15) + this.field1728.field853;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field1728.field846 * arg5 + this.field1728.field851 * arg3 + this.field1728.field847 * arg4 >> 15) + this.field1728.field853;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field1754 || var8 >= this.field1754) && (var7 <= this.field1772 || var8 <= this.field1772)) {
            int var9 = ((this.field1728.field849 * arg2 + this.field1728.field854 * arg1 + this.field1728.field850 * arg0 >> 15) + this.field1728.field845) * this.field1729 / var7;
            int var10 = ((this.field1728.field849 * arg5 + this.field1728.field854 * arg4 + this.field1728.field850 * arg3 >> 15) + this.field1728.field845) * this.field1729 / var8;
            if (var9 < this.field1771 && var10 < this.field1771 || var9 > this.field1747 && var10 > this.field1747) {
                return false;
            } else {
                int var11 = ((this.field1728.field852 * arg2 + this.field1728.field855 * arg1 + this.field1728.field848 * arg0 >> 15) + this.field1728.field856) * this.field1759 / var7;
                int var12 = ((this.field1728.field852 * arg5 + this.field1728.field855 * arg4 + this.field1728.field848 * arg3 >> 15) + this.field1728.field856) * this.field1759 / var8;
                return (var11 >= this.field1735 || var12 >= this.field1735) && (var11 <= this.field1767 || var12 <= this.field1767);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V")
    public final void method527(boolean arg0) {
        this.field1751 = arg0;
        this.field1764.method2401((byte) -86);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Las;Las;FLas;)Las;")
    public final class15 method529(class15 arg0, class15 arg1, float arg2, class15 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lvn;IIII)Lns;")
    public final class57 method555(class246 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class133(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "()V")
    public final void method546() {
        this.field1745 = class103.method776(this.field1762, (byte) 8);
        this.field1743 = this.field1745.field5869;
        this.field1738 = this.field1745.field5866;
        this.field1730 = this.field1745.field5865;
        for (int var1 = 0; var1 < this.field1758; ++var1) {
            this.field1740[var1].method2120((byte) 101);
        }
        this.method493();
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        this.field1753 = arg0;
        this.field1761 = arg1;
        this.field1729 = arg2;
        this.field1759 = arg3;
        this.method880();
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(IIII)V")
    public final void method517(int arg0, int arg1, int arg2, int arg3) {
        this.field1746 = this.field1757;
        this.field1742 = arg0;
        this.field1757 = arg1;
        this.field1766 = arg2;
        this.field1760 = true;
    }

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "()I")
    public final int method559() {
        int var1 = this.field1769;
        this.field1769 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "()V")
    public final void method591() {
        if (this.field1762 != null && this.field1745 != null) {
            try {
                Graphics var1 = this.field1762.getGraphics();
                this.field1745.method2360(0, 0, (byte) 75, var1);
            } catch (Exception var2) {
                this.field1762.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    public final void method513(boolean arg0) {
    }

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "()I")
    public final int method535() {
        return this.field1772;
    }

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "()I")
    public final int method562() {
        int var1 = this.field1741;
        this.field1741 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "()Z")
    public final boolean method568() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIIIII)Las;")
    public final class15 method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(IIIII)V")
    public final void method579(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field1744 && arg0 < this.field1773) {
            if (arg1 < this.field1737) {
                arg2 -= this.field1737 - arg1;
                arg1 = this.field1737;
            }
            if (arg1 + arg2 > this.field1756) {
                arg2 = this.field1756 - arg1;
            }
            int var6 = this.field1738 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1738 * var10 + var6;
                        int var12 = this.field1743[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field1743[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field1738 * var14 + var6;
                        int var16 = this.field1743[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field1743[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field1743[this.field1738 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIZ)Ldp;")
    public final class319 method574(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field1738 * arg1 + arg0;
        int var8 = this.field1738 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field1743[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class112(this, var6, arg2, arg3);
        } else {
            return new class359(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
    public final void method577(int arg0, int arg1) {
        this.field1754 = arg0;
        this.field1772 = arg1;
        this.field1734 = this.field1772 - 255;
        this.method886();
    }

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "()Z")
    public final boolean method887() {
        return this.field1732;
    }

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "()Z")
    public final boolean method515() {
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "()V")
    public final void method511() {
        this.field1757 = this.field1746;
        this.field1760 = false;
    }

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "()Z")
    public final boolean method571() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lku;)V")
    public final void method561(class381 arg0) {
    }

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "()I")
    public final int method534() {
        return this.field1754;
    }

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "(I)I")
    public final int method888(int arg0) {
        return super.field871.method1331(9386, arg0).field1213 & 65535;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public final void method494(boolean arg0) {
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field1738) {
            arg2 = this.field1738;
        }
        if (arg3 > this.field1730) {
            arg3 = this.field1730;
        }
        this.field1744 = arg0;
        this.field1773 = arg2;
        this.field1737 = arg1;
        this.field1756 = arg3;
        this.method880();
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "()Z")
    public final boolean method491() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "(I)[I")
    private final int[] method889(int arg0) {
        class400 var2 = this.field1764;
        class291 var3;
        synchronized (this.field1764) {
            var3 = (class291) this.field1764.method2393(-119, (long) arg0);
            if (var3 == null) {
                if (!super.field871.method1335(arg0, (byte) 9)) {
                    return null;
                }
                class85 var5 = super.field871.method1331(9386, arg0);
                int var6 = !var5.field1197 && !this.field1751 ? 128 : 64;
                var3 = new class291(arg0, var6, super.field871.method1333(69, true, 0.7F, var6, var6, arg0), var5.field1212);
                this.field1764.method2395(0, var3, (long) arg0);
            }
        }
        var3.field4412 = true;
        return var3.method1839();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILus;II)V")
    public final void method499(int arg0, class401 arg1, int arg2, int arg3) {
        class473 var5 = (class473) arg1;
        int[] var6 = var5.field6629;
        int[] var7 = var5.field6625;
        int var8;
        if (this.field1756 < var6.length + arg3) {
            var8 = this.field1756 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field1737 > arg3) {
            var9 = this.field1737 - arg3;
            arg3 = this.field1737;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field1738 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field1744 > var12) {
                    var13 -= this.field1744 - var12;
                    var12 = this.field1744;
                }
                if (this.field1773 < var12 + var13) {
                    var13 = this.field1773 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field1743[var14++] = arg0;
                }
                var10 += this.field1738;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field1738 * arg1 + arg0;
            int var15 = this.field1738 - arg2;
            if (arg1 + arg3 > this.field1756) {
                arg3 -= arg1 + arg3 - this.field1756;
            }
            if (arg1 < this.field1737) {
                int var16 = this.field1737 - arg1;
                arg3 -= var16;
                var14 += this.field1738 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field1773) {
                int var17 = arg0 + arg2 - this.field1773;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field1744) {
                int var18 = this.field1744 - arg0;
                arg2 -= var18;
                var14 += var18;
                var10 += var12 * var18;
                var15 += var18;
            }
            int var19 = arg4 >>> 24;
            int var20 = arg5 >>> 24;
            if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
                if (arg8 == 1) {
                    int var21 = var10;
                    for (int var22 = -arg3; var22 < 0; ++var22) {
                        int var23 = (var11 >> 16) * arg7;
                        for (int var24 = -arg2; var24 < 0; ++var24) {
                            int var25 = arg4;
                            if (arg6[(var10 >> 16) + var23] != 0) {
                                var25 = arg5;
                            }
                            int var26 = var25 >>> 24;
                            int var27 = 255 - var26;
                            int var28 = this.field1743[var14];
                            this.field1743[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var21;
                        var14 += var15;
                    }
                } else if (arg8 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var29 = var10;
                    for (int var30 = -arg3; var30 < 0; ++var30) {
                        int var31 = (var11 >> 16) * arg7;
                        for (int var32 = -arg2; var32 < 0; ++var32) {
                            int var33 = arg4;
                            if (arg6[(var10 >> 16) + var31] != 0) {
                                var33 = arg5;
                            }
                            if (var33 != 0) {
                                int var34 = this.field1743[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field1743[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                            } else {
                                ++var14;
                            }
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var29;
                        var14 += var15;
                    }
                }
            } else {
                int var38 = var10;
                for (int var39 = -arg3; var39 < 0; ++var39) {
                    int var40 = (var11 >> 16) * arg7;
                    for (int var41 = -arg2; var41 < 0; ++var41) {
                        if (arg6[(var10 >> 16) + var40] != 0) {
                            this.field1743[var14++] = arg5;
                        } else {
                            this.field1743[var14++] = arg4;
                        }
                        var10 += var12;
                    }
                    var11 += var13;
                    var10 = var38;
                    var14 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lmu;)V")
    public final void method544(class315 arg0) {
        this.field1728 = (class62) arg0;
    }

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "()Lmu;")
    public final class315 method565() {
        class344 var1 = this.method882(Thread.currentThread());
        return var1.field5200;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field1744) {
            arg2 -= this.field1744 - arg0;
            arg0 = this.field1744;
        }
        if (arg1 < this.field1737) {
            arg3 -= this.field1737 - arg1;
            arg1 = this.field1737;
        }
        if (arg0 + arg2 > this.field1773) {
            arg2 = this.field1773 - arg0;
        }
        if (arg1 + arg3 > this.field1756) {
            arg3 = this.field1756 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field1773 && arg1 <= this.field1756) {
            int var7 = this.field1738 - arg2;
            int var8 = this.field1738 * arg1 + arg0;
            int var9 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var9 == 255) {
                int var22 = arg2 >> 3;
                int var23 = arg2 & 7;
                int var24 = var8 - 1;
                for (int var25 = -arg3; var25 < 0; ++var25) {
                    if (var22 > 0) {
                        int var26 = var22;
                        do {
                            ++var24;
                            this.field1743[var24] = arg4;
                            ++var24;
                            this.field1743[var24] = arg4;
                            ++var24;
                            this.field1743[var24] = arg4;
                            ++var24;
                            this.field1743[var24] = arg4;
                            ++var24;
                            this.field1743[var24] = arg4;
                            ++var24;
                            this.field1743[var24] = arg4;
                            ++var24;
                            this.field1743[var24] = arg4;
                            ++var24;
                            this.field1743[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field1743[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = (var9 << 24) + ((arg4 & 16711935) * var9 >> 8 & 16711935) + ((arg4 & 65280) * var9 >> 8 & 65280);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field1743[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field1743[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field1743[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field1743[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "()F")
    public final float method525() {
        return this.field1768;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(F)V")
    public final void method585(float arg0) {
        this.field1770 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[[I[[IIII)Lcl;")
    public final class48 method590(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class211(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public final void method548(int arg0, int arg1) {
        this.field1757 = arg0 & 16777215;
        int var3 = this.field1757 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field1757 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field1757 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field1757 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field1755 = false;
        } else {
            this.field1755 = true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "()I")
    public final int method510() {
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "()Z")
    public final boolean method592() {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "(I)Z")
    public final boolean method890(int arg0) {
        return super.field871.method1335(arg0, (byte) 9);
    }
}
