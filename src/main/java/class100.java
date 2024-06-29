import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class100 extends class86 {

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public int field1695 = 0;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public int field1702 = 0;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    private int field1704 = 0;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public int field1717 = 0;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    private int field1710 = 0;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    private int field1718 = 0;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "F")
    private float field1703;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "Z")
    public boolean field1689;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "Z")
    private boolean field1715;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public int field1716;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Lfe;")
    private static class229 field1691;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "Lfe;")
    private static class229 field1711;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Lt;")
    private class239 field1708;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "Ln;")
    private class268 field1694;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1692;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1706;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1714;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "[F")
    private float[] field1693;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "[F")
    private float[] field1701;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "[F")
    private float[] field1712;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "[F")
    private float[] field1713;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "[I")
    private int[] field1690;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "[I")
    private int[] field1698;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "[I")
    private int[] field1699;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "[I")
    private int[] field1700;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "[I")
    private int[] field1705;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "[I")
    private int[] field1707;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "[I")
    private int[] field1719;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "[Z")
    private boolean[] field1697;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "[[I")
    private int[][] field1696;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "[[I")
    private int[][] field1709;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([[[Lrd;FZ)V", line = 12)
    public final void method662(class160[][][] arg0, float arg1, boolean arg2) {
        if (field1711 == null || field1711.field3879.length < this.field1704 * 4) {
            field1711 = new class229(this.field1704 * 4);
        } else {
            field1711.field3905 = 0;
        }
        if (field1691 == null || field1691.field3879.length < this.field1718 * 4) {
            field1691 = new class229(this.field1718 * 4);
        } else {
            field1691.field3905 = 0;
        }
        if (class167.field2795) {
            for (int var4 = 0; var4 < this.field1710; var4++) {
                class160 var5 = arg0[this.field1690[var4]][this.field1719[var4]][this.field1699[var4]];
                if (var5 != null && var5.field2633) {
                    int[] var6 = this.field1709[var4];
                    class229 var9;
                    if (this.field1689) {
                        int[] var7 = this.field1696[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field1691.method1515(var7[var8], 112);
                            }
                        }
                        var9 = this.field1697[var4] ? field1691 : field1711;
                    } else {
                        var9 = field1711;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1515(var6[0], 100);
                        var9.method1515(var6[var10], 86);
                        var9.method1515(var6[var10 + 1], 61);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field1710; var11++) {
                class160 var12 = arg0[this.field1690[var11]][this.field1719[var11]][this.field1699[var11]];
                if (var12 != null && var12.field2633) {
                    int[] var13 = this.field1709[var11];
                    class229 var16;
                    if (this.field1689) {
                        int[] var14 = this.field1696[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1691.method1517(78, var14[var15]);
                            }
                        }
                        var16 = this.field1697[var11] ? field1691 : field1711;
                    } else {
                        var16 = field1711;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1517(124, var13[0]);
                        var16.method1517(98, var13[var17]);
                        var16.method1517(110, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field1711.field3905 == 0 && field1691.field3905 == 0) {
            return;
        }
        GL var18 = class167.field2806;
        if (this.field1688 == -1 || arg2) {
            class167.method1033(-1);
            class284.method1954(0, (byte) -40, 0);
        } else {
            class139.field2315.method634(this.field1688, 773268577);
        }
        int var19 = this.field1715 ? 40 : 36;
        if (this.field1694 == null) {
            if (class167.field2792) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field1692.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field1692);
            this.field1692.position(12);
            var18.glColorPointer(4, 5121, var19, this.field1692);
            if (class44.field601) {
                this.field1692.position(16);
                var18.glNormalPointer(5126, var19, this.field1692);
            }
            this.field1692.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field1692);
            if (this.field1715) {
                var18.glClientActiveTexture(class161.method978());
                this.field1692.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field1692);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field1694.method1803();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class44.field601) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field1715) {
                var18.glClientActiveTexture(class161.method978());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class167.field2792) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field1711.field3905 != 0) {
            if (field1714 == null || field1714.capacity() < field1711.field3905) {
                field1714 = ByteBuffer.allocateDirect(field1711.field3905).order(ByteOrder.nativeOrder());
            } else {
                field1714.clear();
            }
            field1714.put(field1711.field3879, 0, field1711.field3905);
            field1714.flip();
            class167.method1058(arg1);
            var18.glDrawElements(4, field1711.field3905 / 4, 5125, field1714);
        }
        if (field1691.field3905 == 0) {
            return;
        }
        if (field1706 == null || field1706.capacity() < field1691.field3905) {
            field1706 = ByteBuffer.allocateDirect(field1691.field3905).order(ByteOrder.nativeOrder());
        } else {
            field1706.clear();
        }
        field1706.put(field1691.field3879, 0, field1691.field3905);
        field1706.flip();
        class167.method1058(arg1 - 100.0F);
        class167.method1041();
        var18.glDrawElements(4, field1691.field3905 / 4, 5125, field1706);
        class167.method1037();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()V", line = 218)
    public static void method663() {
        field1711 = null;
        field1691 = null;
        field1714 = null;
        field1706 = null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IFZZI)V", line = 411)
    public class100(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field1688 = arg0;
        this.field1703 = arg1;
        this.field1689 = arg2;
        this.field1715 = arg3;
        this.field1716 = arg4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIFFFIF)I", line = 231)
    public final int method664(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class119 var11 = (class119) this.field1708.method1612(var9, 94);
            if (var11 != null) {
                if (arg1 < this.field1705[var11.field1998]) {
                    this.field1705[var11.field1998] = arg1;
                }
                return var11.field1998;
            }
        }
        this.field1700[this.field1702] = arg0;
        this.field1705[this.field1702] = arg1;
        this.field1707[this.field1702] = arg2;
        if (this.field1715) {
            this.field1712[this.field1702] = arg7;
        }
        this.field1713[this.field1702] = arg3;
        this.field1701[this.field1702] = arg4;
        this.field1693[this.field1702] = arg5;
        this.field1698[this.field1702] = arg6;
        if (var9 != 0L) {
            this.field1708.method1611(new class119(this.field1702), -1, var9);
        }
        return this.field1702++;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()V", line = 267)
    public final void method665() {
        class229 var1 = new class229((this.field1715 ? 40 : 36) * this.field1702);
        for (int var2 = 0; var2 < this.field1702; var2++) {
            if (class167.field2795) {
                var1.method1519((float) this.field1700[var2], -1161532440);
                var1.method1519((float) this.field1705[var2], -1161532440);
                var1.method1519((float) this.field1707[var2], -1161532440);
                var1.method1515(this.field1698[var2], 70);
                var1.method1519(this.field1713[var2], -1161532440);
                var1.method1519(this.field1701[var2], -1161532440);
                var1.method1519(this.field1693[var2], -1161532440);
                var1.method1519((float) this.field1700[var2] / this.field1703, -1161532440);
                var1.method1519((float) this.field1707[var2] / this.field1703, -1161532440);
                if (this.field1715) {
                    var1.method1519(this.field1712[var2], -1161532440);
                }
            } else {
                var1.method1531((byte) 58, (float) this.field1700[var2]);
                var1.method1531((byte) 58, (float) this.field1705[var2]);
                var1.method1531((byte) 58, (float) this.field1707[var2]);
                var1.method1515(this.field1698[var2], 81);
                var1.method1531((byte) 58, this.field1713[var2]);
                var1.method1531((byte) 58, this.field1701[var2]);
                var1.method1531((byte) 58, this.field1693[var2]);
                var1.method1531((byte) 58, (float) this.field1700[var2] / this.field1703);
                var1.method1531((byte) 58, (float) this.field1707[var2] / this.field1703);
                if (this.field1715) {
                    var1.method1531((byte) 58, this.field1712[var2]);
                }
            }
        }
        if (class167.field2792) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field3879, 0, var1.field3905);
            this.field1694 = new class268();
            this.field1694.method1806(var3);
        } else {
            this.field1692 = ByteBuffer.allocateDirect(var1.field3905).order(ByteOrder.nativeOrder());
            this.field1692.put(var1.field3879, 0, var1.field3905);
            this.field1692.flip();
        }
        this.field1700 = null;
        this.field1705 = null;
        this.field1707 = null;
        this.field1698 = null;
        this.field1713 = null;
        this.field1701 = null;
        this.field1693 = null;
        this.field1708 = null;
        this.field1712 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III[I[IZ)I", line = 336)
    public final int method666(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field1689) {
            this.field1696[this.field1710] = arg4;
            this.field1697[this.field1710] = arg5;
            if (arg4 != null) {
                this.field1718 += arg4.length;
            }
            if (arg5) {
                this.field1718 += (arg3.length - 2) * 3;
            } else {
                this.field1704 += (arg3.length - 2) * 3;
            }
        } else {
            this.field1704 += (arg3.length - 2) * 3;
        }
        this.field1690[this.field1710] = arg0;
        this.field1719[this.field1710] = arg1;
        this.field1699[this.field1710] = arg2;
        this.field1709[this.field1710] = arg3;
        return this.field1710++;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()V", line = 376)
    public final void method667() {
        this.field1700 = new int[this.field1695];
        this.field1705 = new int[this.field1695];
        this.field1707 = new int[this.field1695];
        if (this.field1715) {
            this.field1712 = new float[this.field1695];
        }
        this.field1698 = new int[this.field1695];
        this.field1713 = new float[this.field1695];
        this.field1701 = new float[this.field1695];
        this.field1693 = new float[this.field1695];
        this.field1719 = new int[this.field1717];
        this.field1699 = new int[this.field1717];
        this.field1690 = new int[this.field1717];
        this.field1709 = new int[this.field1717][];
        this.field1708 = new class239(class53.method336(-1753429918, this.field1695));
        if (this.field1689) {
            this.field1696 = new int[this.field1717][];
            this.field1697 = new boolean[this.field1717];
        }
    }
}
