import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 extends class59 {

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    private int field263 = 4096;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    private int field261 = 4096;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "[I")
    private int[] field274 = new int[3];

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
    private int field273 = 4096;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
    private int field267 = 409;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "[I")
    public static int[] field262 = new int[500];

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "Lsd;")
    private static class166 field269 = class135.method935("Loading)3)3)3", 0);

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
    public static int field276 = 0;

    @OriginalMember(owner = "client!be", name = "ib", descriptor = "Lsd;")
    public static class166 field277 = class135.method935("event_opbase", 0);

    @OriginalMember(owner = "client!be", name = "jb", descriptor = "Z")
    public static boolean field278 = false;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "Lsd;")
    public static class166 field265 = field269;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "Lvd;")
    public static class193 field271 = null;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
    public static void method84(byte arg0) {
        field271 = null;
        if (arg0 == -64) {
            field262 = null;
            field269 = null;
            field277 = null;
            field265 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method85(Component arg0, int arg1) {
        if (arg1 != 16956) {
            field271 = null;
        }
        ++field264;
        arg0.addMouseListener(class129.field2532);
        arg0.addMouseMotionListener(class129.field2532);
        arg0.addFocusListener(class129.field2532);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILsd;I)V")
    public static final void method86(int arg0, class166 arg1, int arg2) {
        class156.field2989.method705(192, (byte) 9);
        ++class129.field2524;
        if (arg2 == 26805) {
            class156.field2989.method413(-19272, arg1.method1133((byte) 30));
            class156.field2989.method386(arg0, arg2 + -26805);
            ++field272;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 < 18) {
            this.field273 = -55;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg0.method422((byte) 108);
                            this.field274[1] = class22.method151(var5, 65280) >> 4;
                            this.field274[2] = class22.method151(var5 >> 12, 0);
                            this.field274[0] = class22.method151(var5 << 4, 267386880);
                        }
                    } else {
                        this.field261 = arg0.method405(2);
                    }
                } else {
                    this.field273 = arg0.method405(2);
                }
            } else {
                this.field263 = arg0.method405(2);
            }
        } else {
            this.field267 = arg0.method405(2);
        }
        ++field266;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Leh;I)V")
    public static final void method87(class46 arg0, int arg1) {
        ++field275;
        int var2 = 0;
        if (~arg0.field832 == -1) {
            var2 = class131.field2556.method595(arg0.field825, arg0.field828, arg0.field826);
        }
        int var3 = -1;
        if (arg1 == 1) {
            if (~arg0.field832 == -2) {
                var2 = class131.field2556.method622(arg0.field825, arg0.field828, arg0.field826);
            }
            if (~arg0.field832 == -3) {
                var2 = class131.field2556.method620(arg0.field825, arg0.field828, arg0.field826);
            }
            int var4 = 0;
            int var5 = 0;
            if (~arg0.field832 == -4) {
                var2 = class131.field2556.method600(arg0.field825, arg0.field828, arg0.field826);
            }
            if (~var2 != -1) {
                var3 = (var2 & 536857450) >> 14;
                int var6 = class131.field2556.method576(arg0.field825, arg0.field828, arg0.field826, var2);
                var5 = 3 & var6 >> 6;
                var4 = 31 & var6;
            }
            arg0.field823 = var3;
            arg0.field830 = var5;
            arg0.field834 = var4;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)V")
    public static final void method88(int arg0, int arg1, int arg2, int arg3) {
        ++field268;
        if (arg3 >= 128 && arg0 >= 128 && arg3 <= 13056 && ~arg0 >= -13057) {
            int var4 = class119.method864(arg3, arg0, class165.field3130, true) + -arg2;
            int var5 = arg0 - class22.field385;
            int var6 = arg3 - class38.field690;
            int var7 = var4 - class61.field1242;
            int var8 = class40.field717[class143.field2786];
            int var9 = class40.field717[class159.field3046];
            int var10 = class40.field719[class159.field3046];
            int var11 = class40.field719[class143.field2786];
            int var12 = var5 * var9 + var6 * var10 >> 16;
            int var13 = var5 * var10 - var6 * var9 >> 16;
            int var15 = var7 * var11 + -(var8 * var13) >> 16;
            if (arg1 != -11931) {
                method85((Component) null, 83);
            }
            int var16 = var7 * var8 + var11 * var13 >> 16;
            if (~var16 <= -51) {
                class29.field532 = (var15 << 9) / var16 + 167;
                class52.field943 = (var12 << 9) / var16 + 256;
            } else {
                class29.field532 = -1;
                class52.field943 = -1;
            }
        } else {
            class52.field943 = -1;
            class29.field532 = -1;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class16() {
        super(1, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        ++field270;
        if (!arg0) {
            this.method37(false, 0);
        }
        int[][] var3 = super.field1207.method528(84, arg1);
        if (super.field1207.field1320) {
            int[][] var4 = this.method498(arg1, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class98.field1879; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field274[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field267 < var13) {
                    var6[var11] = var12;
                    var9[var11] = var7[var11];
                    var8[var11] = var10[var11];
                } else {
                    int var14 = var7[var11];
                    int var15 = var14 - this.field274[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field267) {
                        var6[var11] = var12;
                        var9[var11] = var14;
                        var8[var11] = var10[var11];
                    } else {
                        int var16 = var10[var11];
                        int var17 = var16 - this.field274[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (this.field267 < var17) {
                            var6[var11] = var12;
                            var9[var11] = var14;
                            var8[var11] = var16;
                        } else {
                            var6[var11] = this.field261 * var12 >> 12;
                            var9[var11] = this.field273 * var14 >> 12;
                            var8[var11] = this.field263 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
