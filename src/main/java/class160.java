import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class160 extends class89 {

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    private int field2797 = 0;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    private int field2795 = 2048;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    private int field2801 = 10;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "Lne;")
    public static class137 field2804 = new class137(64);

    @OriginalMember(owner = "client!oh", name = "mb", descriptor = "Z")
    public static boolean field2812 = false;

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "[I")
    public static int[] field2807 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!oh", name = "nb", descriptor = "I")
    public static int field2813 = 0;

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
    public static int field2808 = 0;

    @OriginalMember(owner = "client!oh", name = "kb", descriptor = "[[I")
    public static int[][] field2810 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!oh", name = "pb", descriptor = "Lda;")
    public static class275 field2815 = class255.method1672(127, "::clientdrop");

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!oh", name = "ob", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "[I")
    private int[] field2792;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "[I")
    private int[] field2798;

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "[I")
    public static int[] field2809;

    @OriginalMember(owner = "client!oh", name = "lb", descriptor = "[I")
    public static int[] field2811;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static final void method1116(boolean arg0) {
        if (class120.field2160 != null) {
            class120.field2160.method878(24820);
        }
        if (class72.field1166 != null) {
            class72.field1166.method878(24820);
        }
        ++field2800;
        if (!arg0) {
            method1120(98, -52);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2799;
        int var6 = 0;
        class36.method216(class19.field280[arg2], arg4 - arg1, arg5, arg0 + 1063810605, arg1 + arg4);
        int var7 = arg3;
        if (arg0 != -1063810718) {
            field2809 = null;
        }
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg3 << 1;
        int var13 = -((var12 + -1) * var11) + var8;
        int var14 = (-var12 + 1) * var9 + var10;
        int var15 = var9 << 2;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = (var6 + 1) * var16;
        int var19 = ((arg3 << 1) + -3) * var11;
        int var20 = (arg3 + -1) * var15;
        while (var7 > 0) {
            --var7;
            if (~var14 > -1) {
                while (var14 < 0) {
                    ++var6;
                    var13 += var18;
                    var18 += var16;
                    var14 += var17;
                    var17 += var16;
                }
            }
            if (var13 < 0) {
                ++var6;
                var14 += var17;
                var13 += var18;
                var18 += var16;
                var17 += var16;
            }
            int var21 = -var7 + arg2;
            var14 += -var20;
            var20 -= var15;
            int var22 = arg4 + var6;
            int var23 = arg2 + var7;
            var13 += -var19;
            var19 -= var15;
            int var24 = -var6 + arg4;
            class36.method216(class19.field280[var21], var24, arg5, -115, var22);
            class36.method216(class19.field280[var23], var24, arg5, arg0 + 1063810602, var22);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2797 = arg1.method564((byte) 90);
                }
            } else {
                this.field2795 = arg1.method608(arg0 + 20613);
            }
        } else {
            this.field2801 = arg1.method564((byte) 63);
        }
        if (arg0 != -20503) {
            this.method49(-46, (class85) null, 74);
        }
        ++field2802;
    }

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "(I)V")
    private final void method1118(int arg0) {
        ++field2794;
        this.field2798 = new int[this.field2801 + 1];
        this.field2792 = new int[this.field2801 + 1];
        int var2 = 4096 / this.field2801;
        int var3 = 0;
        int var4 = this.field2795 * var2 >> 12;
        for (int var5 = 0; this.field2801 > var5; ++var5) {
            this.field2792[var5] = var3;
            this.field2798[var5] = var3 + var4;
            var3 += var2;
        }
        this.field2792[this.field2801] = 4096;
        this.field2798[this.field2801] = this.field2798[0] + arg0;
    }

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "(I)V")
    public static void method1119(int arg0) {
        if (arg0 >= -40) {
            field2807 = null;
        }
        field2807 = null;
        field2804 = null;
        field2811 = null;
        field2810 = null;
        field2815 = null;
        field2809 = null;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class160() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[B")
    public static final byte[] method1120(int arg0, int arg1) {
        ++field2806;
        if (arg1 != -15246) {
            return null;
        } else {
            class211 var2 = (class211) class167.field2908.method252(true, (long) arg0);
            if (var2 == null) {
                byte[] var3 = new byte[512];
                Random var4 = new Random((long) arg0);
                for (int var5 = 0; var5 < 255; ++var5) {
                    var3[var5] = (byte) var5;
                }
                for (int var6 = 0; ~var6 > -256; ++var6) {
                    int var7 = 255 - var6;
                    int var8 = class116.method845((byte) -79, var4, var7);
                    byte var9 = var3[var8];
                    var3[var8] = var3[var7];
                    var3[var7] = var3[-var6 + 511] = var9;
                }
                var2 = new class211(var3);
                class167.field2908.method251(var2, (byte) 109, (long) arg0);
            }
            return var2.field3569;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        if (arg1) {
            method1122(-103, -113, (Color) null, (class275) null, false);
        }
        ++field2796;
        int[] var3 = super.field1503.method229(arg0, (byte) -90);
        if (super.field1503.field664) {
            int var4 = class91.field1552[arg0];
            if (~this.field2797 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field2801; ++var6) {
                    if (~var4 <= ~this.field2792[var6] && ~var4 > ~this.field2792[var6 + 1]) {
                        if (this.field2798[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class154.method1090(var3, 0, class65.field1070, var5);
            } else {
                for (int var7 = 0; class65.field1070 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class185.field3172[var7];
                    int var11 = this.field2797;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + var10 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field2801; ++var12) {
                        if (var8 >= this.field2792[var12] && ~var8 > ~this.field2792[var12 + 1]) {
                            if (~var8 > ~this.field2798[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILfd;IIIII)V")
    public static final void method1121(int arg0, class229 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 == 256) {
            ++field2793;
            int var7 = arg0 * arg0 + arg2 * arg2;
            if (var7 <= 360000) {
                int var8 = Math.min(arg1.field3885 / 2, arg1.field3980 / 2);
                if (var8 * var8 >= var7) {
                    class14.method72(arg3, class52.field874[arg4], arg0, arg2, 75, arg1, arg6);
                } else {
                    var8 -= 10;
                    int var9 = class218.field3699 + class169.field2938 & 2047;
                    int var10 = class223.field3769[var9];
                    int var11 = class223.field3760[var9];
                    int var12 = var10 * 256 / (class188.field3254 + 256);
                    int var13 = var11 * 256 / (class188.field3254 - -256);
                    int var14 = arg0 * var12 + arg2 * var13 >> 16;
                    int var15 = arg0 * var13 + -(arg2 * var12) >> 16;
                    double var16 = Math.atan2((double) var14, (double) var15);
                    int var18 = (int) ((double) var8 * Math.sin(var16));
                    int var19 = (int) ((double) var8 * Math.cos(var16));
                    ((class259) class251.field4457[arg4]).method727(arg1.field3885 / 2 + arg3 + var18 + -10, arg1.field3980 / 2 + arg6 + -10 + -var19, 20, 20, 15, 15, var16, 256);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILjava/awt/Color;Lda;Z)V")
    public static final void method1122(int arg0, int arg1, Color arg2, class275 arg3, boolean arg4) {
        int var5 = -46 / ((55 - arg1) / 59);
        try {
            Graphics var6 = class93.field1601.getGraphics();
            if (class267.field4644 == null) {
                class267.field4644 = new Font("Helvetica", 1, 13);
                class129.field2270 = class93.field1601.getFontMetrics(class267.field4644);
            }
            if (arg4) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class249.field4391, class212.field3587);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class25.field420 == null) {
                    class25.field420 = class93.field1601.createImage(304, 34);
                }
                Graphics var7 = class25.field420.getGraphics();
                var7.setColor(arg2);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg0 * 3 + 2, 2, -(arg0 * 3) + 300, 30);
                var7.setFont(class267.field4644);
                var7.setColor(Color.white);
                arg3.method1825((304 + -arg3.method1814(false, class129.field2270)) / 2, (byte) -90, 22, var7);
                var6.drawImage(class25.field420, class249.field4391 / 2 - 152, class212.field3587 / 2 + -18, (ImageObserver) null);
            } catch (Exception var10) {
                int var8 = class249.field4391 / 2 - 152;
                int var9 = class212.field3587 / 2 + -18;
                var6.setColor(arg2);
                var6.drawRect(var8, var9, 303, 33);
                var6.fillRect(var8 - -2, var9 + 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var8 - -1, var9 + 1, 301, 31);
                var6.fillRect(2 - -(arg0 * 3) + var8, var9 + 2, -(arg0 * 3) + 300, 30);
                var6.setFont(class267.field4644);
                var6.setColor(Color.white);
                arg3.method1825((-arg3.method1814(false, class129.field2270) + 304) / 2 + var8, (byte) -53, var9 + 22, var6);
            }
            if (class205.field3477 != null) {
                var6.setFont(class267.field4644);
                var6.setColor(Color.white);
                class205.field3477.method1825(class249.field4391 / 2 - class205.field3477.method1814(false, class129.field2270) / 2, (byte) -127, class212.field3587 / 2 + -26, var6);
            }
        } catch (Exception var11) {
            class93.field1601.repaint();
        }
        ++field2803;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        this.method1118(arg0 + 4095);
        if (arg0 != 1) {
            this.field2795 = 83;
        }
        ++field2814;
    }
}
