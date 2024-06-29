import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class126 extends class272 {

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    private int field2260 = 409;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    private int field2261 = 4096;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "[I")
    private int[] field2262 = new int[3];

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    private int field2254 = 4096;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    private int field2264 = 4096;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field2253 = 0;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "Lqk;")
    public static class50 field2255;

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILli;B)V")
    public static final void method908(int arg0, class185 arg1, byte arg2) {
        ++field2258;
        class185 var3 = arg1.method1314(false).method1334(38);
        boolean var4 = false;
        int var5 = 0;
        int var6 = -92 / ((arg2 - -12) / 38);
        while (~var5 > ~class17.field281) {
            class188 var7 = class93.field1774[class174.field3187[var5]];
            if (var7 != null && var7.field3514 != null && var7.field3514.method1312(var3, -30055)) {
                var4 = true;
                class256.method1739(var7.field2720[0], 0, var7.field2651[0], 2, class241.field4310.field2720[0], (byte) -89, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                if (arg0 != 1) {
                    if (arg0 == 4) {
                        class182.field3349.method577(178, 0);
                        class182.field3349.method843((byte) 107, class174.field3187[var5]);
                        ++class108.field1961;
                    } else if (arg0 == 5) {
                        class182.field3349.method577(174, 0);
                        ++class22.field374;
                        class182.field3349.method874(class174.field3187[var5], 1538997896);
                    } else if (~arg0 == -7) {
                        ++class103.field1870;
                        class182.field3349.method577(203, 0);
                        class182.field3349.method843((byte) -67, class174.field3187[var5]);
                    } else if (~arg0 == -8) {
                        class182.field3349.method577(56, 0);
                        ++class130.field2329;
                        class182.field3349.method843((byte) 117, class174.field3187[var5]);
                    }
                } else {
                    ++class229.field4162;
                    class182.field3349.method577(147, 0);
                    class182.field3349.method843((byte) -87, class174.field3187[var5]);
                }
                break;
            }
            ++var5;
        }
        if (!var4) {
            class1.method5(class20.field336, 0, true, class87.method567(-11039, new class185[] { class118.field2165, var3 }));
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILli;Ljava/awt/Color;BZ)V")
    public static final void method909(int arg0, class185 arg1, Color arg2, byte arg3, boolean arg4) {
        ++field2265;
        try {
            Graphics var5 = class30.field500.getGraphics();
            if (class86.field1695 == null) {
                class86.field1695 = new Font("Helvetica", 1, 13);
                class147.field2781 = class30.field500.getFontMetrics(class86.field1695);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class204.field3738, class148.field2796);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class211.field3846 == null) {
                    class211.field3846 = class30.field500.createImage(304, 34);
                }
                int var6 = 42 % ((arg3 - -37) / 63);
                Graphics var7 = class211.field3846.getGraphics();
                var7.setColor(arg2);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg0 * 3 + 2, 2, -(arg0 * 3) + 300, 30);
                var7.setFont(class86.field1695);
                var7.setColor(Color.white);
                arg1.method1343(-125, 22, (304 + -arg1.method1342(-83, class147.field2781)) / 2, var7);
                var5.drawImage(class211.field3846, class204.field3738 / 2 + -152, class148.field2796 / 2 + -18, (ImageObserver) null);
            } catch (Exception var10) {
                int var8 = class204.field3738 / 2 + -152;
                int var9 = class148.field2796 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var8 + 2, var9 - -2, 300 - arg0 * 3, 30);
                var5.setFont(class86.field1695);
                var5.setColor(Color.white);
                arg1.method1343(-127, var9 - -22, (-arg1.method1342(-105, class147.field2781) + 304) / 2 + var8, var5);
            }
            if (class31.field506 != null) {
                var5.setFont(class86.field1695);
                var5.setColor(Color.white);
                class31.field506.method1343(-123, class148.field2796 / 2 + -26, class204.field3738 / 2 - class31.field506.method1342(-120, class147.field2781) / 2, var5);
            }
        } catch (Exception var11) {
            class30.field500.repaint();
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    public static void method910(byte arg0) {
        if (arg0 != -24) {
            field2255 = null;
        }
        field2255 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = 67 % ((arg1 - -21) / 55);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            int var6 = arg0.method873((byte) -111);
                            this.field2262[2] = class220.method1526(var6 >> 12, 0);
                            this.field2262[1] = class220.method1526(65280, var6) >> 4;
                            this.field2262[0] = class220.method1526(16711680, var6) << 4;
                        }
                    } else {
                        this.field2264 = arg0.method827(255);
                    }
                } else {
                    this.field2261 = arg0.method827(255);
                }
            } else {
                this.field2254 = arg0.method827(255);
            }
        } else {
            this.field2260 = arg0.method827(255);
        }
        ++field2256;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        int var3 = -81 / ((-60 - arg1) / 45);
        int[][] var4 = super.field4818.method1514(-2, arg0);
        ++field2257;
        if (super.field4818.field3954) {
            int[][] var5 = this.method1860(arg0, 3, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var5[0];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class246.field4385; ++var12) {
                int var13 = var10[var12];
                int var14 = -this.field2262[0] + var13;
                if (~var14 > -1) {
                    var14 = -var14;
                }
                if (~var14 < ~this.field2260) {
                    var9[var12] = var13;
                    var8[var12] = var6[var12];
                    var11[var12] = var7[var12];
                } else {
                    int var15 = var6[var12];
                    int var16 = -this.field2262[1] + var15;
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (this.field2260 < var16) {
                        var9[var12] = var13;
                        var8[var12] = var15;
                        var11[var12] = var7[var12];
                    } else {
                        int var17 = var7[var12];
                        int var18 = var17 - this.field2262[2];
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (~var18 < ~this.field2260) {
                            var9[var12] = var13;
                            var8[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field2264 * var13 >> 12;
                            var8[var12] = this.field2261 * var15 >> 12;
                            var11[var12] = this.field2254 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V")
    public static final void method911(int arg0) {
        class132.field2368.method80(arg0 ^ 14112);
        ++field2259;
        if (arg0 != -1) {
            field2253 = -91;
        }
    }
}
