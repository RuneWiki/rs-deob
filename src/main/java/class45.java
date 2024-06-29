import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class45 extends class142 {

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    private int field728 = 4096;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    private int field736 = 0;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    private int field732 = 0;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    private int field742 = 16;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
    private int field747 = 2000;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "Lai;")
    public static class10 field735 = class44.method278(" (X", -49);

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static volatile int field737 = 0;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "Lai;")
    public static class10 field730 = class44.method278("<)4col> x", -106);

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "Lai;")
    public static class10 field745 = class44.method278("welle2:", -46);

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "Lai;")
    public static class10 field744 = class44.method278("Ung-Ultiges Anmelde)2Paket)3", 99);

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lai;")
    public static class10 field746 = class44.method278("AUS", 111);

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class45() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILme;)V")
    public static final void method279(int arg0, class114 arg1) {
        ++field729;
        if (class205.field3988 != null) {
            try {
                class205.field3988.method524(0L, (byte) 112);
                class205.field3988.method525(arg0 ^ -4488, 24, arg1.field2170, arg1.field2160);
            } catch (Exception var2) {
            }
        }
        if (arg0 == -4594) {
            arg1.field2170 += 24;
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        if (arg0 == -1) {
            class58.method392(113);
            ++field738;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field733;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field728 = arg0.method762((byte) 116);
                        }
                    } else {
                        this.field736 = arg0.method762((byte) 115);
                    }
                } else {
                    this.field742 = arg0.method767(true);
                }
            } else {
                this.field747 = arg0.method762((byte) 107);
            }
        } else {
            this.field732 = arg0.method767(true);
        }
        if (arg2 > -34) {
            this.field736 = 43;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)Lbi;")
    public static final class20 method280(int arg0, int arg1) {
        class20 var2 = (class20) class93.field1668.method222(120, (long) arg1);
        ++field740;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class47.field822.method159((byte) -100, arg1, arg0);
            class20 var4 = new class20();
            if (var3 != null) {
                var4.method133(0, new class114(var3));
            }
            class93.field1668.method225(-21284, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int var4 = this.field728 >> 1;
            int[][] var5 = super.field2683.method1187(0);
            Random var6 = new Random((long) this.field732);
            for (int var7 = 0; ~this.field747 < ~var7; ++var7) {
                int var8 = ~this.field728 >= -1 ? this.field736 : -var4 + this.field736 + class89.method548(this.field728, var6, (byte) -73);
                int var9 = (var8 & 4084) >> 4;
                int var10 = class89.method548(class133.field2499, var6, (byte) -73);
                int var11 = class89.method548(class13.field219, var6, (byte) -73);
                int var12 = var10 - -(class179.field3400[var9] * this.field742 >> 12);
                int var13 = -var10 + var12;
                int var14 = var11 - -(class196.field3709[var9] * this.field742 >> 12);
                int var15 = var14 - var11;
                if (var13 != 0 || ~var15 != -1) {
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 > var13;
                    if (var16) {
                        int var17 = var12;
                        int var18 = var10;
                        var12 = var14;
                        var14 = var17;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var14;
                        var14 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var14 - var11;
                    int var24 = 2048 / var22;
                    int var25 = -var22 / 2;
                    int var26 = -(class89.method548(4096, var6, (byte) -73) >> 2) + 1024;
                    int var27 = ~var11 > ~var14 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        var25 += var23;
                        int var29 = var28 & class56.field997;
                        int var30 = var26 + 1024 - -((-var10 + var28) * var24);
                        int var31 = class205.field3986 & var21;
                        if (var25 > 0) {
                            var21 += var27;
                            var25 += -var22;
                        }
                        if (!var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                    }
                }
            }
        }
        ++field731;
        if (arg0) {
            this.field728 = 126;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)I")
    public static final int method281(int arg0, int arg1, int arg2) {
        ++field739;
        long var3 = (long) ((arg0 << 16) + arg2);
        if (class154.field2983 != null && class154.field2983.field2291 == var3) {
            if (arg1 <= 42) {
                method283((byte) -43);
            }
            return class100.field1872.field2170 * 99 / (class100.field1872.field2160.length + -class154.field2983.field3695) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lai;Ljava/awt/Color;IB)V")
    public static final void method282(class10 arg0, Color arg1, int arg2, byte arg3) {
        ++field734;
        try {
            Graphics var4 = class134.field2513.getGraphics();
            if (class153.field2947 == null) {
                class153.field2947 = new Font("Helvetica", 1, 13);
                class47.field784 = class134.field2513.getFontMetrics(class153.field2947);
            }
            if (class87.field1550) {
                class87.field1550 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class194.field3690, class196.field3716);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class30.field473 == null) {
                    class30.field473 = class134.field2513.createImage(304, 34);
                }
                Graphics var5 = class30.field473.getGraphics();
                var5.setColor(arg1);
                if (arg3 < -16) {
                    var5.drawRect(0, 0, 303, 33);
                    var5.fillRect(2, 2, arg2 * 3, 30);
                    var5.setColor(Color.black);
                    var5.drawRect(1, 1, 301, 31);
                    var5.fillRect(2 - -(arg2 * 3), 2, -(arg2 * 3) + 300, 30);
                    var5.setFont(class153.field2947);
                    var5.setColor(Color.white);
                    arg0.method58(22, (304 + -arg0.method34((byte) -127, class47.field784)) / 2, var5, 109);
                    var4.drawImage(class30.field473, class194.field3690 / 2 + -152, class196.field3716 / 2 - 18, (ImageObserver) null);
                }
            } catch (Exception var8) {
                int var6 = class194.field3690 / 2 - 152;
                int var7 = class196.field3716 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 - -2, var7 + 2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg2 * 3 + var6 + 2, var7 + 2, -(arg2 * 3) + 300, 30);
                var4.setFont(class153.field2947);
                var4.setColor(Color.white);
                arg0.method58(var7 + 22, (-arg0.method34((byte) 26, class47.field784) + 304) / 2 + var6, var4, 102);
            }
        } catch (Exception var9) {
            class134.field2513.repaint();
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
    public static void method283(byte arg0) {
        field745 = null;
        if (arg0 != 78) {
            field730 = null;
        }
        field746 = null;
        field735 = null;
        field744 = null;
        field730 = null;
    }
}
