import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class121 extends class66 {

    @OriginalMember(owner = "client!jr", name = "E", descriptor = "Z")
    private boolean field1632;

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "Z")
    private boolean field1634;

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "Ltca;")
    private class184 field1628;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!jr", name = "ab", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!jr", name = "T", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "client!jr", name = "fb", descriptor = "I")
    private int field1659;

    @OriginalMember(owner = "client!jr", name = "ib", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!jr", name = "S", descriptor = "Z")
    private boolean field1646;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!jr", name = "lb", descriptor = "I")
    private int field1665;

    @OriginalMember(owner = "client!jr", name = "kb", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!jr", name = "bb", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!jr", name = "pb", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "Lqj;")
    private class535 field1638;

    @OriginalMember(owner = "client!jr", name = "vb", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client!jr", name = "cb", descriptor = "Lqj;")
    private class535 field1656;

    @OriginalMember(owner = "client!jr", name = "Q", descriptor = "Lfn;")
    public class149 field1644;

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "client!jr", name = "V", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!jr", name = "W", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!jr", name = "db", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "client!jr", name = "eb", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client!jr", name = "gb", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!jr", name = "hb", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!jr", name = "jb", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!jr", name = "nb", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!jr", name = "ob", descriptor = "I")
    public int field1668;

    @OriginalMember(owner = "client!jr", name = "qb", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!jr", name = "tb", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client!jr", name = "ub", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!jr", name = "wb", descriptor = "Lhh;")
    private class140 field1676;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "Llea;")
    public class637 field1629;

    @OriginalMember(owner = "client!jr", name = "Z", descriptor = "Lbs;")
    private class714 field1653;

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1630;

    @OriginalMember(owner = "client!jr", name = "mb", descriptor = "[F")
    public float[] field1666;

    @OriginalMember(owner = "client!jr", name = "rb", descriptor = "[F")
    public float[] field1671;

    @OriginalMember(owner = "client!jr", name = "sb", descriptor = "[I")
    public int[] field1672;

    @OriginalMember(owner = "client!jr", name = "X", descriptor = "[Lhn;")
    private class750[] field1651;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "()Z")
    public final boolean method536() {
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lqca;IIII)V")
    private final void method859(class126 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field1733;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method866(arg1, arg2, arg3, arg4, arg0.field1727, 1);
        } else {
            if (this.field1675 != var6) {
                class140 var9 = (class140) this.field1638.method3109((byte) 109, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method869(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method874(var6) ? 64 : this.field1640;
                    var9 = this.method446(var10, -37, var11, var11, var11, 0);
                    this.field1638.method3108((long) var6, 16337, var9);
                }
                this.field1675 = var6;
                this.field1676 = var9;
            }
            ++var8;
            ((class367) this.field1676).method1397(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field1727, 1, 1);
        }
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)I")
    public final int method860(int arg0) {
        return super.field913.method1114(arg0, -76).field7854 & 65535;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lhg;)V")
    public final void method554(class718 arg0) {
        class714 var2 = (class714) arg0;
        this.field1650 = var2.field9744;
        this.field1652 = var2.field9745;
        this.field1672 = var2.field9741;
        this.field1653 = var2;
        this.field1657 = var2.field9744;
        this.field1658 = var2.field9745;
        this.field1666 = var2.field9739;
        this.method867();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lcj;Lcj;FLcj;)Lcj;")
    public final class720 method531(class720 arg0, class720 arg1, float arg2, class720 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "DA", descriptor = "(IIII)V")
    public final void method436(int arg0, int arg1, int arg2, int arg3) {
        this.field1670 = arg0;
        this.field1660 = arg1;
        this.field1664 = arg2;
        this.field1636 = arg3;
        this.method868();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lal;)V")
    public final void method509(class109 arg0) {
        this.field1644 = (class149) arg0;
    }

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "()V")
    public final void method535() {
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lcj;)V")
    public final void method440(class720 arg0) {
    }

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "()Z")
    public final boolean method460() {
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method521(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class283 {
        if (this.field1630 != null && this.field1629 != null) {
            try {
                Graphics var5 = this.field1630.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field1650 && var7.y + arg3 <= this.field1652 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field1629.method1260(-128, var7.height, var7.y + arg3, var7.x + arg2, var7.y, var5, var7.x, var7.width);
                    }
                }
            } catch (Exception var8) {
                this.field1630.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "()Z")
    public final boolean method455() {
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method555(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field1654 = (int) (arg1 * 65535.0F);
        this.field1647 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field1663 = (int) (arg3 * 65535.0F / var7);
        this.field1668 = (int) (arg4 * 65535.0F / var7);
        this.field1674 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!jr", name = "U", descriptor = "(IIIII)V")
    public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field1643 && arg1 < this.field1655) {
            if (arg0 < this.field1645) {
                arg2 -= this.field1645 - arg0;
                arg0 = this.field1645;
            }
            if (arg0 + arg2 > this.field1642) {
                arg2 = this.field1642 - arg0;
            }
            int var6 = this.field1650 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1672[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field1672[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field1672[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field1672[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field1672[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method556(Canvas arg0) {
        if (arg0 != null) {
            class637 var2 = (class637) this.field1628.method1248(126, (long) arg0.hashCode());
            if (var2 != null) {
                this.field1630 = arg0;
                Dimension var3 = arg0.getSize();
                this.field1633 = var3.width;
                this.field1631 = var3.height;
                this.field1629 = var2;
                if (this.field1653 == null) {
                    this.field1672 = var2.field8586;
                    this.field1650 = var2.field8584;
                    this.field1652 = var2.field8583;
                    if (this.field1657 != this.field1650 || this.field1658 != this.field1652) {
                        this.field1648 = this.field1657 = this.field1650;
                        this.field1673 = this.field1658 = this.field1652;
                        this.field1671 = this.field1666 = new float[this.field1658 * this.field1657];
                    }
                    this.method867();
                    return;
                }
            }
        } else {
            this.field1630 = null;
            this.field1629 = null;
            if (this.field1653 == null) {
                this.field1672 = null;
                this.field1650 = this.field1652 = 1;
                this.field1657 = this.field1658 = 1;
                this.method867();
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "EA", descriptor = "(IIII)V")
    public final void method456(int arg0, int arg1, int arg2, int arg3) {
        class750 var5 = this.method863(Thread.currentThread());
        var5.field10101 = arg0;
        var5.field10107 = arg1;
        var5.field10094 = arg2;
    }

    @OriginalMember(owner = "client!jr", name = "ya", descriptor = "()V")
    public final void method547() {
        if (this.field1645 == 0 && this.field1650 == this.field1642 && this.field1643 == 0 && this.field1655 == this.field1652) {
            int var1 = this.field1666.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field1666[var3++] = 2.1474836E9F;
                this.field1666[var3++] = 2.1474836E9F;
                this.field1666[var3++] = 2.1474836E9F;
                this.field1666[var3++] = 2.1474836E9F;
                this.field1666[var3++] = 2.1474836E9F;
                this.field1666[var3++] = 2.1474836E9F;
                this.field1666[var3++] = 2.1474836E9F;
                this.field1666[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field1666[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field1642 - this.field1645;
            int var5 = this.field1655 - this.field1643;
            int var6 = this.field1650 - var4;
            int var7 = this.field1650 * this.field1643 + this.field1645;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field1666[var10] = 2.1474836E9F;
                        ++var10;
                        this.field1666[var10] = 2.1474836E9F;
                        ++var10;
                        this.field1666[var10] = 2.1474836E9F;
                        ++var10;
                        this.field1666[var10] = 2.1474836E9F;
                        ++var10;
                        this.field1666[var10] = 2.1474836E9F;
                        ++var10;
                        this.field1666[var10] = 2.1474836E9F;
                        ++var10;
                        this.field1666[var10] = 2.1474836E9F;
                        ++var10;
                        this.field1666[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field1666[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Leb;[Lvf;Z)Lda;")
    public final class67 method502(class651 arg0, class162[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2156;
            var5[var7] = arg1[var7].field2155;
            if (arg1[var7].field2157 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class287(this, arg0, arg1, var4, var5);
            } else {
                return new class156(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class57(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "(II)V")
    public final void method497(int arg0, int arg1) {
        int var3 = this.field1650 * arg1 + arg0;
        int var4 = this.field1657 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field1672;
            float[] var6 = this.field1666;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class421.method2531(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class421.method2531(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class421.method2537(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class421.method2537(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "E", descriptor = "()I")
    public final int method496() {
        return 0;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(II)I")
    public final int method473(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!jr", name = "X", descriptor = "(I)V")
    public final void method477(int arg0) {
    }

    @OriginalMember(owner = "client!jr", name = "XA", descriptor = "()I")
    public final int method469() {
        return this.field1637;
    }

    @OriginalMember(owner = "client!jr", name = "JA", descriptor = "(IIIIII)I")
    public final int method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field1644.field2025 + (float) arg0 * this.field1644.field2009 + (float) arg1 * this.field1644.field2003 + this.field1644.field2006;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field1644.field2025 + (float) arg3 * this.field1644.field2009 + (float) arg4 * this.field1644.field2003 + this.field1644.field2006;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field1662 && var9 < (float) this.field1662) {
            var7 |= 16;
        } else if (var8 > (float) this.field1637 && var9 > (float) this.field1637) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field1644.field2018 + (float) arg0 * this.field1644.field2023 + (float) arg1 * this.field1644.field2004 + this.field1644.field2020) * (float) this.field1664 / var8);
        int var11 = (int) (((float) arg5 * this.field1644.field2018 + (float) arg3 * this.field1644.field2023 + (float) arg4 * this.field1644.field2004 + this.field1644.field2020) * (float) this.field1664 / var9);
        if (var10 < this.field1661 && var11 < this.field1661) {
            var7 |= 1;
        } else if (var10 > this.field1649 && var11 > this.field1649) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field1644.field2014 + (float) arg0 * this.field1644.field2001 + (float) arg1 * this.field1644.field2008 + this.field1644.field2015) * (float) this.field1636 / var8);
        int var13 = (int) (((float) arg5 * this.field1644.field2014 + (float) arg3 * this.field1644.field2001 + (float) arg4 * this.field1644.field2008 + this.field1644.field2015) * (float) this.field1636 / var9);
        if (var12 < this.field1641 && var13 < this.field1641) {
            var7 |= 4;
        } else if (var12 > this.field1639 && var13 > this.field1639) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method861(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method861(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method872(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method872(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
            }
        } else {
            int var20 = arg8 << 8;
            int var21 = arg6 << 8;
            int var22 = arg7 << 8;
            int var23 = var21 + var22;
            int var24 = var20 % var23;
            if (var10 + var11 < 0) {
                int var25 = (int) (Math.sqrt((double) (var10 * var10 + var11 * var11)) * 256.0D);
                int var26 = var25 % var23;
                int var27 = var21 + var23 - var24 - var26;
                var24 = var27 % var23;
                if (var24 < 0) {
                    var24 += var23;
                }
                arg0 += var10;
                var10 = -var10;
                arg1 += var11;
                var11 = -var11;
            }
            if (var10 > var11) {
                int var28 = arg1 << 16;
                int var29 = var28 + 32768;
                int var30 = var11 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var10 + 0.5D);
                int var32 = arg0 + var10;
                int var33 = arg4 >>> 24;
                int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                    if (arg5 == 1) {
                        int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                        int var36 = 256 - var33;
                        while (arg0 <= var32) {
                            int var37 = var29 >> 16;
                            if (arg0 >= this.field1645 && arg0 < this.field1642 && var37 >= this.field1643 && var37 < this.field1655 && var24 < var21) {
                                int var38 = this.field1650 * var37 + arg0;
                                int var39 = this.field1672[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field1672[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field1645 && arg0 < this.field1642 && var42 >= this.field1643 && var42 < this.field1655 && var24 < var21) {
                                int var43 = this.field1650 * var42 + arg0;
                                int var44 = this.field1672[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field1672[var43] = var45 - var47 | var47 - (var47 >>> 8);
                            }
                            var29 += var31;
                            ++arg0;
                            int var48 = var24 + var34;
                            var24 = var48 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var32) {
                        int var49 = var29 >> 16;
                        if (arg0 >= this.field1645 && arg0 < this.field1642 && var49 >= this.field1643 && var49 < this.field1655 && var24 < var21) {
                            this.field1672[this.field1650 * var49 + arg0] = arg4;
                        }
                        var29 += var31;
                        ++arg0;
                        int var50 = var24 + var34;
                        var24 = var50 % var23;
                    }
                }
            } else {
                int var51 = arg0 << 16;
                int var52 = var51 + 32768;
                int var53 = var10 << 16;
                int var54 = (int) Math.floor((double) var53 / (double) var11 + 0.5D);
                int var55 = arg1 + var11;
                int var56 = arg4 >>> 24;
                int var57 = (int) Math.sqrt((double) ((var54 >> 8) * (var54 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var56 != 255)) {
                    if (arg5 == 1) {
                        int var58 = (var56 << 24) + ((arg4 & 16711935) * var56 >> 8 & 16711935) + ((arg4 & 65280) * var56 >> 8 & 65280);
                        int var59 = 256 - var56;
                        while (arg1 <= var55) {
                            int var60 = var52 >> 16;
                            if (arg1 >= this.field1643 && arg1 < this.field1655 && var60 >= this.field1645 && var60 < this.field1642 && var24 < var21) {
                                int var61 = this.field1650 * arg1 + var60;
                                int var62 = this.field1672[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field1672[this.field1650 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field1643 && arg1 < this.field1655 && var65 >= this.field1645 && var65 < this.field1642 && var24 < var21) {
                                int var66 = this.field1650 * arg1 + var65;
                                int var67 = this.field1672[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field1672[var66] = var68 - var70 | var70 - (var70 >>> 8);
                            }
                            var52 += var54;
                            ++arg1;
                            int var71 = var24 + var57;
                            var24 = var71 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg1 <= var55) {
                        int var72 = var52 >> 16;
                        if (arg1 >= this.field1643 && arg1 < this.field1655 && var72 >= this.field1645 && var72 < this.field1642 && var24 < var21) {
                            this.field1672[this.field1650 * arg1 + var72] = arg4;
                        }
                        var52 += var54;
                        ++arg1;
                        int var73 = var24 + var57;
                        var24 = var73 % var23;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "()Z")
    public final boolean method450() {
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "()V")
    public final void method514() {
        if (this.field1630 != null) {
            this.field1672 = this.field1629.field8586;
            this.field1650 = this.field1629.field8584;
            this.field1652 = this.field1629.field8583;
            this.field1666 = this.field1671;
            this.field1657 = this.field1648;
            this.field1658 = this.field1673;
        } else {
            this.field1650 = 1;
            this.field1652 = 1;
            this.field1672 = null;
            this.field1657 = 1;
            this.field1658 = 1;
            this.field1666 = null;
        }
        this.field1653 = null;
        this.method867();
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
    public final void method533(int arg0) {
        int var2 = arg0 - this.field1635;
        for (Object var3 = this.field1656.method3107((byte) -124); var3 != null; var3 = this.field1656.method3106(-106)) {
            class326 var4 = (class326) var3;
            if (var4.field4629) {
                var4.field4624 += var2;
                int var5 = var4.field4624 / 20;
                if (var5 > 0) {
                    class577 var6 = super.field913.method1114(var4.field4628, -41);
                    var4.method2108(var6.field7861 * var2 * 50 / 1000, var6.field7852 * var2 * 50 / 1000);
                    var4.field4624 -= var5 * 20;
                }
                var4.field4629 = false;
            }
        }
        this.field1635 = arg0;
        this.field1638.method3101(false, 5);
        this.field1656.method3101(false, 5);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIII)V")
    private final void method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field1643 && arg1 < this.field1655) {
            int var9 = this.field1650 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field1645 && arg0 + var15 < this.field1642 && var12 < arg5) {
                            int var16 = this.field1672[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field1672[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field1645 && arg0 + var18 < this.field1642 && var12 < arg5) {
                            int var19 = this.field1672[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field1672[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
                        }
                        ++var18;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var23 = 0;
                while (var23 < arg2) {
                    if (arg0 + var23 >= this.field1645 && arg0 + var23 < this.field1642 && var12 < arg5) {
                        this.field1672[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "()Z")
    public final boolean method472() {
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "()Z")
    public final boolean method862() {
        return this.field1632;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/Runnable;)Lhn;")
    public final class750 method863(Runnable arg0) {
        for (int var2 = 0; var2 < this.field1667; ++var2) {
            if (this.field1651[var2].field10100 == arg0) {
                return this.field1651[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "(I)Z")
    public final boolean method864(int arg0) {
        return super.field913.method1114(arg0, -76).field7873 || super.field913.method1114(arg0, -31).field7858;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ltv;)V")
    public final void method534(class586 arg0) {
        class750 var2 = this.method863(Thread.currentThread());
        class455 var3 = arg0.field7972.field4051;
        for (class455 var4 = var3.field6516; var3 != var4; var4 = var4.field6516) {
            class126 var5 = (class126) var4;
            int var6 = var5.field1725 >> 12;
            int var7 = var5.field1729 >> 12;
            int var8 = var5.field1730 >> 12;
            float var9 = (float) var8 * this.field1644.field2025 + (float) var6 * this.field1644.field2009 + (float) var7 * this.field1644.field2003 + this.field1644.field2006;
            if (!(var9 < (float) this.field1662) && !(var9 > (float) var2.field10096)) {
                int var10 = (int) (((float) var8 * this.field1644.field2018 + (float) var6 * this.field1644.field2023 + (float) var7 * this.field1644.field2004 + this.field1644.field2020) * (float) this.field1664 / var9) + this.field1670;
                int var11 = (int) (((float) var8 * this.field1644.field2014 + (float) var6 * this.field1644.field2001 + (float) var7 * this.field1644.field2008 + this.field1644.field2015) * (float) this.field1636 / var9) + this.field1660;
                if (var10 >= this.field1645 && var10 <= this.field1642 && var11 >= this.field1643 && var11 <= this.field1655) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method859(var5, var10, var11, (int) var9, (int) ((float) (this.field1664 * var5.field1726 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "(IIIIIII)I")
    public final int method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field1644.field2025 + (float) arg0 * this.field1644.field2009 + (float) arg1 * this.field1644.field2003 + this.field1644.field2006;
        float var9 = (float) arg5 * this.field1644.field2025 + (float) arg3 * this.field1644.field2009 + (float) arg4 * this.field1644.field2003 + this.field1644.field2006;
        int var10 = 0;
        if (var8 < (float) this.field1662 && var9 < (float) this.field1662) {
            var10 |= 16;
        } else if (var8 > (float) this.field1637 && var9 > (float) this.field1637) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field1644.field2018 + (float) arg0 * this.field1644.field2023 + (float) arg1 * this.field1644.field2004 + this.field1644.field2020) * (float) this.field1664 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field1644.field2018 + (float) arg3 * this.field1644.field2023 + (float) arg4 * this.field1644.field2004 + this.field1644.field2020) * (float) this.field1664 / (float) arg6);
        if (var11 < this.field1661 && var12 < this.field1661) {
            var10 |= 1;
        } else if (var11 > this.field1649 && var12 > this.field1649) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field1644.field2014 + (float) arg0 * this.field1644.field2001 + (float) arg1 * this.field1644.field2008 + this.field1644.field2015) * (float) this.field1636 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field1644.field2014 + (float) arg3 * this.field1644.field2001 + (float) arg4 * this.field1644.field2008 + this.field1644.field2015) * (float) this.field1636 / (float) arg6);
        if (var13 < this.field1641 && var14 < this.field1641) {
            var10 |= 4;
        } else if (var13 > this.field1639 && var14 > this.field1639) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "()Z")
    public final boolean method479() {
        return true;
    }

    @OriginalMember(owner = "client!jr", name = "na", descriptor = "(IIII)[I")
    public final int[] method439(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field1650 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field1672[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)V")
    public final void method471(int arg0, int arg1) throws class283 {
        if (this.field1630 != null && this.field1629 != null) {
            try {
                Graphics var3 = this.field1630.getGraphics();
                this.field1629.method1260(73, this.field1631, arg1, arg0, 0, var3, 0, this.field1633);
            } catch (Exception var4) {
                this.field1630.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "()I")
    public final int method489() {
        return 0;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
    public final void method495(int arg0) {
        this.field1667 = arg0;
        this.field1651 = new class750[this.field1667];
        for (int var2 = 0; var2 < this.field1667; ++var2) {
            this.field1651[var2] = new class750(this);
        }
    }

    @OriginalMember(owner = "client!jr", name = "da", descriptor = "(III[I)V")
    public final void method530(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field1644.field2025 + (float) arg0 * this.field1644.field2009 + (float) arg1 * this.field1644.field2003 + this.field1644.field2006;
        if (!(var5 < (float) this.field1662) && !(var5 > (float) this.field1637)) {
            int var6 = (int) (((float) arg2 * this.field1644.field2018 + (float) arg0 * this.field1644.field2023 + (float) arg1 * this.field1644.field2004 + this.field1644.field2020) * (float) this.field1664 / var5);
            int var7 = (int) (((float) arg2 * this.field1644.field2014 + (float) arg0 * this.field1644.field2001 + (float) arg1 * this.field1644.field2008 + this.field1644.field2015) * (float) this.field1636 / var5);
            if (var6 >= this.field1661 && var6 <= this.field1649 && var7 >= this.field1641 && var7 <= this.field1639) {
                arg3[0] = var6 - this.field1661;
                arg3[1] = var7 - this.field1641;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "(I)[I")
    public final int[] method865(int arg0) {
        class535 var2 = this.field1656;
        class326 var3;
        synchronized (this.field1656) {
            var3 = (class326) this.field1656.method3109((byte) 127, (long) arg0);
            if (var3 == null) {
                if (!super.field913.method1112(29302, arg0)) {
                    return null;
                }
                class577 var5 = super.field913.method1114(arg0, -50);
                int var6 = !var5.field7853 && !this.field1646 ? this.field1640 : 64;
                var3 = new class326(arg0, var6, super.field913.method1113(-85, var6, var6, true, arg0, 0.7F), var5.field7860 != 1);
                this.field1656.method3108((long) arg0, 16337, var3);
            }
        }
        var3.field4629 = true;
        return var3.method2109();
    }

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "()V")
    public final void method511() {
    }

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "(ILaa;II)V")
    public final void method449(int arg0, class512 arg1, int arg2, int arg3) {
        class55 var5 = (class55) arg1;
        int[] var6 = var5.field650;
        int[] var7 = var5.field652;
        int var8;
        if (this.field1655 < var6.length + arg3) {
            var8 = this.field1655 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field1643 > arg3) {
            var9 = this.field1643 - arg3;
            arg3 = this.field1643;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field1650 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field1645 > var12) {
                    var13 -= this.field1645 - var12;
                    var12 = this.field1645;
                }
                if (this.field1642 < var12 + var13) {
                    var13 = this.field1642 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field1672[var14++] = arg0;
                }
                var10 += this.field1650;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "()Z")
    public final boolean method459() {
        return true;
    }

    @OriginalMember(owner = "client!jr", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field1650 * arg1 + arg0;
            int var15 = this.field1650 - arg2;
            if (arg1 + arg3 > this.field1655) {
                arg3 -= arg1 + arg3 - this.field1655;
            }
            if (arg1 < this.field1643) {
                int var16 = this.field1643 - arg1;
                arg3 -= var16;
                var14 += this.field1650 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field1642) {
                int var17 = arg0 + arg2 - this.field1642;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field1645) {
                int var18 = this.field1645 - arg0;
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
                            int var28 = this.field1672[var14];
                            this.field1672[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field1672[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field1672[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field1672[var14++] = arg5;
                        } else {
                            this.field1672[var14++] = arg4;
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

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ld;)V")
    private class121(class161 arg0) {
        super(arg0);
        this.field1632 = false;
        this.field1634 = false;
        this.field1628 = new class184(4);
        this.field1640 = 128;
        this.field1642 = 0;
        this.field1643 = 0;
        this.field1654 = 45823;
        this.field1647 = 78642;
        this.field1659 = 0;
        this.field1662 = 50;
        this.field1646 = false;
        this.field1637 = 3500;
        this.field1665 = 0;
        this.field1664 = 512;
        this.field1636 = 512;
        this.field1655 = 0;
        this.field1645 = 0;
        this.field1669 = 75518;
        this.field1638 = new class535(16);
        this.field1675 = -1;
        try {
            this.field1656 = new class535(256);
            this.field1644 = new class149();
            this.method495(1);
            this.method505(0);
            class96.method761(true, true, true);
            this.field1634 = true;
            this.field1635 = (int) class401.method2440(false);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method464((byte) -109);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!jr", name = "KA", descriptor = "(IIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field1650) {
            arg2 = this.field1650;
        }
        if (arg3 > this.field1652) {
            arg3 = this.field1652;
        }
        this.field1645 = arg0;
        this.field1642 = arg2;
        this.field1643 = arg1;
        this.field1655 = arg3;
        this.method868();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(FFF)V")
    public final void method549(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Lza;")
    public final class434 method478(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lvf;Z)Lhh;")
    public final class140 method466(class162 arg0, boolean arg1) {
        int[] var3 = arg0.field2160;
        byte[] var4 = arg0.field2154;
        int var5 = arg0.field2156;
        int var6 = arg0.field2155;
        class367 var11;
        if (arg1 && arg0.field2157 == null) {
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
            var11 = new class580(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field2157;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class686(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class218(this, var14, var5, var6);
            }
        }
        var11.method347(arg0.field2159, arg0.field2161, arg0.field2158, arg0.field2162);
        return var11;
    }

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "()Z")
    public final boolean method510() {
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(IIIIII)V")
    private final void method866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field1643) {
            var7 = this.field1643;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field1655) {
            var8 = this.field1655;
        }
        int var9 = var7;
        int var10 = arg3 * arg3;
        int var11 = 0;
        int var12 = arg1 - var7;
        int var13 = var12 * var12;
        int var14 = var13 - var12;
        if (arg1 > var8) {
            arg1 = var8;
        }
        int var15 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var15 == 255) {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var65 = arg0 - var11 + 1;
                if (var65 < this.field1645) {
                    var65 = this.field1645;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field1642) {
                    var66 = this.field1642;
                }
                int var67 = this.field1650 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field1666[var67]) {
                        this.field1672[var67] = arg4;
                    }
                    ++var67;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var56 = arg3;
            int var57 = var9 - arg1;
            int var58 = var57 * var57 + var10;
            int var59 = var58 - arg3;
            int var60 = var58 - var57;
            while (var9 < var8) {
                while (var60 > var10 && var59 > var10) {
                    var60 -= var56-- + var56;
                    var59 -= var56 + var56;
                }
                int var61 = arg0 - var56;
                if (var61 < this.field1645) {
                    var61 = this.field1645;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field1642 - 1) {
                    var62 = this.field1642 - 1;
                }
                int var63 = this.field1650 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field1666[var63]) {
                        this.field1672[var63] = arg4;
                    }
                    ++var63;
                }
                ++var9;
                var60 += var57 + var57;
                var59 += var57++ + var57;
            }
        } else if (arg5 == 1) {
            int var16 = (var15 << 24) + ((arg4 & 16711935) * var15 >> 8 & 16711935) + ((arg4 & 65280) * var15 >> 8 & 65280);
            int var17 = 256 - var15;
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var29 = arg0 - var11 + 1;
                if (var29 < this.field1645) {
                    var29 = this.field1645;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field1642) {
                    var30 = this.field1642;
                }
                int var31 = this.field1650 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field1666[var31]) {
                        int var33 = this.field1672[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field1672[var31] = var16 + var34;
                    }
                    ++var31;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var18 = arg3;
            int var19 = -var12;
            int var20 = var19 * var19 + var10;
            int var21 = var20 - arg3;
            int var22 = var20 - var19;
            while (var9 < var8) {
                while (var22 > var10 && var21 > var10) {
                    var22 -= var18-- + var18;
                    var21 -= var18 + var18;
                }
                int var23 = arg0 - var18;
                if (var23 < this.field1645) {
                    var23 = this.field1645;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field1642 - 1) {
                    var24 = this.field1642 - 1;
                }
                int var25 = this.field1650 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field1666[var25]) {
                        int var27 = this.field1672[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field1672[var25] = var16 + var28;
                    }
                    ++var25;
                }
                ++var9;
                var22 += var19 + var19;
                var21 += var19++ + var19;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var48 = arg0 - var11 + 1;
                if (var48 < this.field1645) {
                    var48 = this.field1645;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field1642) {
                    var49 = this.field1642;
                }
                int var50 = this.field1650 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field1666[var50]) {
                        int var52 = this.field1672[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field1672[var50] = var53 - var55 | var55 - (var55 >>> 8);
                    }
                    ++var50;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var35 = arg3;
            int var36 = -var12;
            int var37 = var36 * var36 + var10;
            int var38 = var37 - arg3;
            int var39 = var37 - var36;
            while (var9 < var8) {
                while (var39 > var10 && var38 > var10) {
                    var39 -= var35-- + var35;
                    var38 -= var35 + var35;
                }
                int var40 = arg0 - var35;
                if (var40 < this.field1645) {
                    var40 = this.field1645;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field1642 - 1) {
                    var41 = this.field1642 - 1;
                }
                int var42 = this.field1650 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field1666[var42]) {
                        int var44 = this.field1672[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field1672[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "()V")
    public final void method490() {
        this.field1656.method3103(-11294);
        this.field1638.method3103(-11294);
    }

    @OriginalMember(owner = "client!jr", name = "GA", descriptor = "(I)V")
    public final void method493(int arg0) {
        this.method434(0, 0, this.field1650, this.field1652, arg0, 0);
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(IIIIII)V")
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method474(arg0, arg1, arg2, arg4, arg5);
        this.method474(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method451(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method451(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "()V")
    private final void method867() {
        for (int var1 = 0; var1 < this.field1667; ++var1) {
            this.field1651[var1].method4097((byte) 62);
        }
        this.method526();
    }

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "(I)V")
    public final void method537(int arg0) {
        this.field1651[arg0].method4099((byte) 108, (Runnable) null);
    }

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "()Z")
    public final boolean method538() {
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V")
    public final void method528(int arg0) {
        this.field1640 = arg0;
        this.field1656.method3103(-11294);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIF)Luaa;")
    public final class127 method551(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
        class55 var10 = (class55) arg6;
        int[] var11 = var10.field650;
        int[] var12 = var10.field652;
        int var13 = this.field1643 > arg8 ? this.field1643 : arg8;
        int var14 = this.field1655 < var11.length + arg8 ? this.field1655 : var11.length + arg8;
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
            if (arg0 < this.field1645) {
                var18 += (this.field1645 - arg0) * var20;
                arg0 = this.field1645;
            }
            if (var21 >= this.field1642) {
                var21 = this.field1642 - 1;
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
                                int var28 = this.field1650 * var25 + arg0;
                                int var29 = this.field1672[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field1672[var28] = var23 + var30;
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
                                int var34 = this.field1650 * var31 + arg0;
                                int var35 = this.field1672[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field1672[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field1672[this.field1650 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field1645 && var64 < this.field1642 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field1672[this.field1650 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field1645 && var50 < this.field1642 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field1650 * arg1 + var50;
                        int var54 = this.field1672[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field1672[this.field1650 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field1645 && var56 < this.field1642 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field1650 * arg1 + var56;
                        int var60 = this.field1672[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field1672[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class121(Canvas arg0, class161 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method492(arg0, arg2, arg3);
            this.method556(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method464((byte) -94);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "()Lal;")
    public final class109 method444() {
        return this.field1644;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method543(Canvas arg0) {
        if (this.field1630 == arg0) {
            this.method556((Canvas) null);
        }
        class637 var2 = (class637) this.field1628.method1248(127, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1102((byte) 72);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class750 var14 = this.method863(Thread.currentThread());
        class736 var15 = var14.field10129;
        var15.field9985 = false;
        int var16 = arg0 - this.field1661;
        int var17 = arg3 - this.field1661;
        int var18 = arg6 - this.field1661;
        int var19 = arg1 - this.field1641;
        int var20 = arg4 - this.field1641;
        int var21 = arg7 - this.field1641;
        var15.field9977 = var16 < 0 || var16 > var15.field9984 || var17 < 0 || var17 > var15.field9984 || var18 < 0 || var18 > var15.field9984;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field9978 = 255 - var22;
                var15.field9970 = false;
                var15.method4065((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field9978 = 128;
                var15.field9970 = true;
                var15.method4065((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field9978 = 0;
            var15.field9970 = false;
            var15.method4065((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field9985 = true;
    }

    @OriginalMember(owner = "client!jr", name = "za", descriptor = "(IIIII)V")
    public final void method465(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field1643) {
            var6 = this.field1643;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field1655) {
            var7 = this.field1655;
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
                if (var64 < this.field1645) {
                    var64 = this.field1645;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field1642) {
                    var65 = this.field1642;
                }
                int var66 = this.field1650 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field1672[var66++] = arg3;
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
                if (var60 < this.field1645) {
                    var60 = this.field1645;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field1642 - 1) {
                    var61 = this.field1642 - 1;
                }
                int var62 = this.field1650 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field1672[var62++] = arg3;
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
                if (var28 < this.field1645) {
                    var28 = this.field1645;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field1642) {
                    var29 = this.field1642;
                }
                int var30 = this.field1650 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field1672[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field1672[var30++] = var15 + var33;
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
                if (var22 < this.field1645) {
                    var22 = this.field1645;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field1642 - 1) {
                    var23 = this.field1642 - 1;
                }
                int var24 = this.field1650 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field1672[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field1672[var24++] = var15 + var27;
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
                if (var47 < this.field1645) {
                    var47 = this.field1645;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field1642) {
                    var48 = this.field1642;
                }
                int var49 = this.field1650 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field1672[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field1672[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field1645) {
                    var39 = this.field1645;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field1642 - 1) {
                    var40 = this.field1642 - 1;
                }
                int var41 = this.field1650 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field1672[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field1672[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "()V")
    private final void method868() {
        this.field1661 = this.field1645 - this.field1670;
        this.field1649 = this.field1642 - this.field1670;
        this.field1641 = this.field1643 - this.field1660;
        this.field1639 = this.field1655 - this.field1660;
        for (int var1 = 0; var1 < this.field1667; ++var1) {
            class736 var5 = this.field1651[var1].field10129;
            var5.field9972 = this.field1670 - this.field1645;
            var5.field9971 = this.field1660 - this.field1643;
            var5.field9984 = this.field1642 - this.field1645;
            var5.field9980 = this.field1655 - this.field1643;
        }
        int var2 = this.field1650 * this.field1643 + this.field1645;
        for (int var3 = this.field1643; var3 < this.field1655; ++var3) {
            for (int var4 = 0; var4 < this.field1667; ++var4) {
                this.field1651[var4].field10129.field9983[var3 - this.field1643] = var2;
            }
            var2 += this.field1650;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIII)V")
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class750 var8 = this.method863(Thread.currentThread());
        class736 var9 = var8.field10129;
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
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method4061();
            int var24 = arg1 - var9.method4064();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field9978 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field9978 = 255 - (arg4 >>> 24);
            }
            this.method508(false);
            var9.field9977 = var25 < 0 || var25 > var9.field9984 || var26 < 0 || var26 > var9.field9984 || var27 < 0 || var27 > var9.field9984;
            var9.method4055((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field9977 = var25 < 0 || var25 > var9.field9984 || var27 < 0 || var27 > var9.field9984 || var28 < 0 || var28 > var9.field9984;
            var9.method4055((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method508(true);
        }
    }

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "()I")
    public final int method507() {
        return this.field1662;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "()Z")
    public final boolean method448() {
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "()Z")
    public final boolean method503() {
        return true;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II[I[I)Laa;")
    public final class512 method504(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class55(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class295 method516(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class783(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(II)V")
    public final void method518(int arg0, int arg1) {
        class750 var3 = this.method863(Thread.currentThread());
        this.field1662 = arg0;
        this.field1637 = arg1;
        var3.field10096 = this.field1637 - 255;
    }

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "(I)[I")
    public final int[] method869(int arg0) {
        class535 var2 = this.field1656;
        class326 var3;
        synchronized (this.field1656) {
            var3 = (class326) this.field1656.method3109((byte) 99, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field913.method1112(29302, arg0)) {
                    return null;
                }
                class577 var5 = super.field913.method1114(arg0, -26);
                int var6 = !var5.field7853 && !this.field1646 ? this.field1640 : 64;
                var3 = new class326(arg0, var6, super.field913.method1111(-82, 0.7F, var6, arg0, var6, true), var5.field7860 != 1);
                this.field1656.method3108((long) arg0 | Long.MIN_VALUE, 16337, var3);
            }
        }
        var3.field4629 = true;
        return var3.method2109();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field913.method1114(arg6, -107).field7868) {
                if (this.field1675 != arg6) {
                    class140 var11 = (class140) this.field1638.method3109((byte) 106, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method869(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method874(arg6) ? 64 : this.field1640;
                        var11 = this.method446(var12, -121, var13, var13, var13, 0);
                        this.field1638.method3108((long) arg6, 16337, var11);
                    }
                    this.field1675 = arg6;
                    this.field1676 = var11;
                }
                ((class367) this.field1676).method1397(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method866(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method546(Canvas arg0, int arg1, int arg2) {
        class637 var4 = (class637) this.field1628.method1248(110, (long) arg0.hashCode());
        if (var4 != null) {
            var4.method1102((byte) 126);
            class637 var5 = class139.method965(arg2, arg1, -30, arg0);
            this.field1628.method1247(4070, (long) arg0.hashCode(), var5);
            if (this.field1630 == arg0 && this.field1653 == null) {
                Dimension var6 = arg0.getSize();
                this.field1633 = var6.width;
                this.field1631 = var6.height;
                this.field1629 = var5;
                this.field1672 = var5.field8586;
                this.field1650 = var5.field8584;
                this.field1652 = var5.field8583;
                if (this.field1657 != this.field1650 || this.field1658 != this.field1652) {
                    this.field1648 = this.field1657 = this.field1650;
                    this.field1673 = this.field1658 = this.field1652;
                    this.field1671 = this.field1666 = new float[this.field1658 * this.field1657];
                }
                this.method867();
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "(I)Z")
    public final boolean method871(int arg0) {
        return super.field913.method1112(29302, arg0);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method492(Canvas arg0, int arg1, int arg2) {
        class637 var4 = (class637) this.field1628.method1248(92, (long) arg0.hashCode());
        if (var4 == null) {
            class637 var5 = class139.method965(arg2, arg1, -80, arg0);
            this.field1628.method1247(4070, (long) arg0.hashCode(), var5);
        } else {
            if (var4.field8584 != arg1 || var4.field8583 != arg2) {
                this.method546(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "()Lal;")
    public final class109 method541() {
        return new class149();
    }

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "()Ldca;")
    public final class189 method542() {
        return new class189(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lgl;IIII)Lka;")
    public final class497 method484(class625 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class491(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIII)V")
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method474(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method474(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method451(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method451(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field1645) {
                    var10 += (this.field1645 - arg0) * var12;
                    arg0 = this.field1645;
                }
                if (var13 >= this.field1642) {
                    var13 = this.field1642 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field1643 && var17 < this.field1655) {
                                int var18 = this.field1650 * var17 + arg0;
                                int var19 = this.field1672[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field1672[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field1643 && var21 < this.field1655) {
                                int var22 = this.field1650 * var21 + arg0;
                                int var23 = this.field1672[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field1672[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field1643 && var27 < this.field1655) {
                            this.field1672[this.field1650 * var27 + arg0] = arg4;
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
                if (arg1 < this.field1643) {
                    var29 += (this.field1643 - arg1) * var31;
                    arg1 = this.field1643;
                }
                if (var32 >= this.field1655) {
                    var32 = this.field1655 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field1645 && var46 < this.field1642) {
                            this.field1672[this.field1650 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field1645 && var36 < this.field1642) {
                            int var37 = this.field1650 * arg1 + var36;
                            int var38 = this.field1672[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field1672[this.field1650 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field1645 && var40 < this.field1642) {
                            int var41 = this.field1650 * arg1 + var40;
                            int var42 = this.field1672[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field1672[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(Z)V")
    public final void method485(boolean arg0) {
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class55 var13 = (class55) arg6;
        int[] var14 = var13.field650;
        int[] var15 = var13.field652;
        int var16 = this.field1643 > arg8 ? this.field1643 : arg8;
        int var17 = this.field1655 < var14.length + arg8 ? this.field1655 : var14.length + arg8;
        int var18 = arg11 << 8;
        int var19 = arg9 << 8;
        int var20 = arg10 << 8;
        int var21 = var19 + var20;
        int var22 = var18 % var21;
        int var23 = arg2 - arg0;
        int var24 = arg3 - arg1;
        if (var23 + var24 < 0) {
            int var25 = (int) (Math.sqrt((double) (var23 * var23 + var24 * var24)) * 256.0D);
            int var26 = var25 % var21;
            int var27 = var19 + var21 - var22 - var26;
            var22 = var27 % var21;
            if (var22 < 0) {
                var22 += var21;
            }
            arg0 += var23;
            var23 = -var23;
            arg1 += var24;
            var24 = -var24;
        }
        if (var23 > var24) {
            int var28 = arg1 << 16;
            int var29 = var28 + 32768;
            int var30 = var24 << 16;
            int var31 = (int) Math.floor((double) var30 / (double) var23 + 0.5D);
            int var32 = arg0 + var23;
            int var33 = arg4 >>> 24;
            int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                if (arg5 == 1) {
                    int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var36 = 256 - var33;
                    while (arg0 <= var32) {
                        int var37 = var29 >> 16;
                        int var38 = var37 - arg8;
                        if (arg0 >= this.field1645 && arg0 < this.field1642 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field1650 * var37 + arg0;
                                int var41 = this.field1672[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field1672[var40] = var35 + var42;
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var43 = var22 + var34;
                        var22 = var43 % var21;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var32) {
                        int var44 = var29 >> 16;
                        int var45 = var44 - arg8;
                        if (arg0 >= this.field1645 && arg0 < this.field1642 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field1650 * var44 + arg0;
                                int var48 = this.field1672[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field1672[var47] = var49 - var51 | var51 - (var51 >>> 8);
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var52 = var22 + var34;
                        var22 = var52 % var21;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var32) {
                    int var53 = var29 >> 16;
                    int var54 = var53 - arg8;
                    if (arg0 >= this.field1645 && arg0 < this.field1642 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field1672[this.field1650 * var53 + arg0] = arg4;
                        }
                    }
                    var29 += var31;
                    ++arg0;
                    int var56 = var22 + var34;
                    var22 = var56 % var21;
                }
            }
        } else {
            int var57 = arg0 << 16;
            int var58 = var57 + 32768;
            int var59 = var23 << 16;
            int var60 = (int) Math.floor((double) var59 / (double) var24 + 0.5D);
            int var61 = (int) Math.sqrt((double) ((var60 >> 8) * (var60 >> 8) + 65536));
            int var62 = arg1 + var24;
            int var63 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var63 == 255) {
                while (arg1 <= var62) {
                    int var80 = var58 >> 16;
                    int var81 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field1645 && var80 < this.field1642 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field1672[this.field1650 * arg1 + var80] = arg4;
                    }
                    var58 += var60;
                    ++arg1;
                    int var82 = var22 + var61;
                    var22 = var82 % var21;
                }
            } else if (arg5 == 1) {
                int var64 = (var63 << 24) + ((arg4 & 16711935) * var63 >> 8 & 16711935) + ((arg4 & 65280) * var63 >> 8 & 65280);
                int var65 = 256 - var63;
                while (arg1 <= var62) {
                    int var66 = var58 >> 16;
                    int var67 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field1645 && var66 < this.field1642 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field1650 * arg1 + var66;
                        int var69 = this.field1672[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field1672[this.field1650 * arg1 + var66] = var64 + var70;
                    }
                    var58 += var60;
                    ++arg1;
                    int var71 = var22 + var61;
                    var22 = var71 % var21;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var62) {
                    int var72 = var58 >> 16;
                    int var73 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field1645 && var72 < this.field1642 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field1650 * arg1 + var72;
                        int var75 = this.field1672[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field1672[var74] = var76 - var78 | var78 - (var78 >>> 8);
                    }
                    var58 += var60;
                    ++arg1;
                    int var79 = var22 + var61;
                    var22 = var79 % var21;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "(III)V")
    public final void method540(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1651.length; ++var4) {
            class750 var5 = this.field1651[var4];
            var5.field10107 = arg0 & 16777215;
            int var6 = var5.field10107 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field10107 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field10107 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field10107 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field10095 = false;
            } else {
                var5.field10095 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ltv;I)V")
    public final void method524(class586 arg0, int arg1) {
        class750 var3 = this.method863(Thread.currentThread());
        class455 var4 = arg0.field7972.field4051;
        for (class455 var5 = var4.field6516; var4 != var5; var5 = var5.field6516) {
            class126 var6 = (class126) var5;
            int var7 = var6.field1725 >> 12;
            int var8 = var6.field1729 >> 12;
            int var9 = var6.field1730 >> 12;
            float var10 = (float) var9 * this.field1644.field2025 + (float) var7 * this.field1644.field2009 + (float) var8 * this.field1644.field2003 + this.field1644.field2006;
            if (!(var10 < (float) this.field1662) && !(var10 > (float) var3.field10096)) {
                int var11 = (int) (((float) var9 * this.field1644.field2018 + (float) var7 * this.field1644.field2023 + (float) var8 * this.field1644.field2004 + this.field1644.field2020) * (float) this.field1664 / (float) arg1) + this.field1670;
                int var12 = (int) (((float) var9 * this.field1644.field2014 + (float) var7 * this.field1644.field2001 + (float) var8 * this.field1644.field2008 + this.field1644.field2015) * (float) this.field1636 / (float) arg1) + this.field1660;
                if (var11 >= this.field1645 && var11 <= this.field1642 && var12 >= this.field1643 && var12 <= this.field1655) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method859(var6, var11, var12, (int) var10, (this.field1664 * var6.field1726 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "ra", descriptor = "(IIII)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1651.length; ++var5) {
            this.field1651[var5].field10102 = this.field1651[var5].field10107;
            this.field1651[var5].field10101 = arg0;
            this.field1651[var5].field10107 = arg1;
            this.field1651[var5].field10094 = arg2;
            this.field1651[var5].field10104 = true;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lio;Lrr;)Lhg;")
    public final class718 method461(class461 arg0, class381 arg1) {
        return new class714(this, (class140) arg0, (class785) arg1);
    }

    @OriginalMember(owner = "client!jr", name = "HA", descriptor = "(IIII[I)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field1644.field2025 + (float) arg0 * this.field1644.field2009 + (float) arg1 * this.field1644.field2003 + this.field1644.field2006;
        if (!(var6 < (float) this.field1662) && !(var6 > (float) this.field1637)) {
            int var7 = (int) (((float) arg2 * this.field1644.field2018 + (float) arg0 * this.field1644.field2023 + (float) arg1 * this.field1644.field2004 + this.field1644.field2020) * (float) this.field1664 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field1644.field2014 + (float) arg0 * this.field1644.field2001 + (float) arg1 * this.field1644.field2008 + this.field1644.field2015) * (float) this.field1636 / (float) arg3);
            if (var7 >= this.field1661 && var7 <= this.field1649 && var8 >= this.field1641 && var8 <= this.field1639) {
                arg4[0] = var7 - this.field1661;
                arg4[1] = var8 - this.field1641;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V")
    public final void method505(int arg0) {
        this.field1651[arg0].method4099((byte) 108, Thread.currentThread());
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "()Z")
    public final boolean method458() {
        return true;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(IIIIII)Lcj;")
    public final class720 method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "()V")
    public final void method482() {
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
    public final void method470(boolean arg0) {
        this.field1646 = arg0;
        this.field1656.method3103(-11294);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([I)V")
    public final void method447(int[] arg0) {
        arg0[0] = this.field1650;
        arg0[1] = this.field1652;
    }

    @OriginalMember(owner = "client!jr", name = "xa", descriptor = "(F)V")
    public final void method468(float arg0) {
        this.field1669 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(II)Lio;")
    public final class461 method498(int arg0, int arg1) {
        return this.method488(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIZ)Lhh;")
    public final class140 method454(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field1650 * arg1 + arg0;
        int var8 = this.field1650 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field1672[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class686(this, var6, arg2, arg3);
        } else {
            return new class218(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!jr", name = "la", descriptor = "()V")
    public final void method526() {
        this.field1645 = 0;
        this.field1643 = 0;
        this.field1642 = this.field1650;
        this.field1655 = this.field1652;
        this.method868();
    }

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "()Lal;")
    public final class109 method475() {
        class750 var1 = this.method863(Thread.currentThread());
        return var1.field10106;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(IIIIIIII)V")
    private final void method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field1645 && arg0 < this.field1642) {
            int var9 = this.field1650 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field1643 && arg1 + var15 < this.field1655 && var12 < arg5) {
                            int var16 = this.field1650 * var15 + var9;
                            int var17 = this.field1672[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field1672[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field1643 && arg1 + var19 < this.field1655 && var12 < arg5) {
                            int var20 = this.field1650 * var19 + var9;
                            int var21 = this.field1672[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field1672[var20] = var22 - var24 | var24 - (var24 >>> 8);
                        }
                        ++var19;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var25 = 0;
                while (var25 < arg2) {
                    if (arg1 + var25 >= this.field1643 && arg1 + var25 < this.field1655 && var12 < arg5) {
                        this.field1672[this.field1650 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "()I")
    public final int method445() {
        int var1 = this.field1659;
        this.field1659 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!jr", name = "pa", descriptor = "()V")
    public final void method500() {
        for (int var1 = 0; var1 < this.field1651.length; ++var1) {
            this.field1651[var1].field10107 = this.field1651[var1].field10102;
            this.field1651[var1].field10104 = false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "()V")
    public final void method527() {
    }

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "(Z)V")
    public final void method508(boolean arg0) {
        class750 var2 = this.method863(Thread.currentThread());
        var2.field10105 = arg0;
    }

    @OriginalMember(owner = "client!jr", name = "T", descriptor = "(IIII)V")
    public final void method525(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1645 < arg0) {
            this.field1645 = arg0;
        }
        if (this.field1643 < arg1) {
            this.field1643 = arg1;
        }
        if (this.field1642 > arg2) {
            this.field1642 = arg2;
        }
        if (this.field1655 > arg3) {
            this.field1655 = arg3;
        }
        this.method868();
    }

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "(I)I")
    public final int method873(int arg0) {
        return super.field913.method1114(arg0, -110).field7860;
    }

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "()V")
    public final void method476() {
        if (this.field1634) {
            class186.method1251(true, false, (byte) -81);
            this.field1634 = false;
        }
        this.field1629 = null;
        this.field1630 = null;
        this.field1633 = 0;
        this.field1631 = 0;
        this.field1628 = null;
        this.field1632 = true;
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(II)I")
    public final int method520(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "([I)V")
    public final void method467(int[] arg0) {
        arg0[0] = this.field1645;
        arg0[1] = this.field1643;
        arg0[2] = this.field1642;
        arg0[3] = this.field1655;
    }

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "(IIIII)V")
    public final void method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field1645 && arg0 < this.field1642) {
            if (arg1 < this.field1643) {
                arg2 -= this.field1643 - arg1;
                arg1 = this.field1643;
            }
            if (arg1 + arg2 > this.field1655) {
                arg2 = this.field1655 - arg1;
            }
            int var6 = this.field1650 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1650 * var10 + var6;
                        int var12 = this.field1672[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field1672[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field1650 * var14 + var6;
                        int var16 = this.field1672[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field1672[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field1672[this.field1650 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "()Z")
    public final boolean method480() {
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Lrr;")
    public final class381 method437(int arg0, int arg1) {
        return new class785(arg0, arg1);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(IIIID)V")
    public final void method499(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field1657 - arg2;
        int var8 = this.field1657 * arg1 + arg0;
        float[] var9 = this.field1666;
        int var10 = 0;
        while (var10 < arg3) {
            int var11 = 0;
            while (var11 < arg2) {
                float var12 = var9[var8];
                if (var12 != 2.1474836E9F) {
                    var9[var8] = (float) ((double) var12 + arg4);
                }
                ++var11;
                ++var8;
            }
            ++var10;
            var8 += var7;
        }
    }

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "(III[I)V")
    public final void method552(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field1644.field2025 + (float) arg0 * this.field1644.field2009 + (float) arg1 * this.field1644.field2003 + this.field1644.field2006;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field1644.field2018 + (float) arg0 * this.field1644.field2023 + (float) arg1 * this.field1644.field2004 + this.field1644.field2020) * (float) this.field1664 / var5);
            int var7 = (int) (((float) arg2 * this.field1644.field2014 + (float) arg0 * this.field1644.field2001 + (float) arg1 * this.field1644.field2008 + this.field1644.field2015) * (float) this.field1636 / var5);
            arg3[0] = var6 - this.field1661;
            arg3[1] = var7 - this.field1641;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "(I)Z")
    public final boolean method874(int arg0) {
        return this.field1646 || super.field913.method1114(arg0, -21).field7853;
    }

    @OriginalMember(owner = "client!jr", name = "Y", descriptor = "()[I")
    public final int[] method532() {
        return new int[] { this.field1670, this.field1660, this.field1664, this.field1636 };
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I[Luaa;)V")
    public final void method481(int arg0, class127[] arg1) {
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public final void method442(int arg0) {
        class491.field6906 = arg0;
        class491.field6863 = arg0;
        if (this.field1667 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method495(this.field1667);
            this.method505(0);
        }
    }

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "()I")
    public final int method494() {
        int var1 = this.field1665;
        this.field1665 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!jr", name = "aa", descriptor = "(IIIIII)V")
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field1645) {
            arg2 -= this.field1645 - arg0;
            arg0 = this.field1645;
        }
        if (arg1 < this.field1643) {
            arg3 -= this.field1643 - arg1;
            arg1 = this.field1643;
        }
        if (arg0 + arg2 > this.field1642) {
            arg2 = this.field1642 - arg0;
        }
        if (arg1 + arg3 > this.field1655) {
            arg3 = this.field1655 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field1642 && arg1 <= this.field1655) {
            int var7 = this.field1650 - arg2;
            int var8 = this.field1650 * arg1 + arg0;
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
                            this.field1672[var24] = arg4;
                            ++var24;
                            this.field1672[var24] = arg4;
                            ++var24;
                            this.field1672[var24] = arg4;
                            ++var24;
                            this.field1672[var24] = arg4;
                            ++var24;
                            this.field1672[var24] = arg4;
                            ++var24;
                            this.field1672[var24] = arg4;
                            ++var24;
                            this.field1672[var24] = arg4;
                            ++var24;
                            this.field1672[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field1672[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field1672[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field1672[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field1672[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field1672[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lza;)V")
    public final void method501(class434 arg0) {
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIZ)Lhh;")
    public final class140 method488(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class686(this, arg0, arg1) : new class218(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([IIIIIZ)Lhh;")
    public final class140 method462(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class686(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class218(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class686(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class218(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIII)V")
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
    }
}
