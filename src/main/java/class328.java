import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class328 extends class139 {

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "I")
    private int field4749 = 4096;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "Ldk;")
    public static class326 field4743 = new class326("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "Z")
    public static volatile boolean field4746 = true;

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "[Z")
    public static boolean[] field4751 = new boolean[100];

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!gq", name = "R", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!gq", name = "S", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!gq", name = "T", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "Lb;")
    public static class201 field4750;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "Lhg;")
    public static class450 field4747;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(CI)Z")
    public static final boolean method2076(char arg0, int arg1) {
        ++field4752;
        if ((arg0 <= 0 || ~arg0 <= -129) && (arg0 < 160 || ~arg0 < -256)) {
            if (arg0 != arg1) {
                char[] var2 = class304.field4335;
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
    public static final void method2077(int arg0) {
        ++field4754;
        if (class86.field1045 == null) {
            int var1 = class377.field5436;
            int var2 = class236.field3552;
            if (arg0 == -1) {
                int var3 = -var1 + class284.field4156 + -class144.field1900;
                int var4 = -var2 + class199.field2901 + -class244.field3634;
                if (var1 > 0 || ~var3 < -1 || ~var2 < -1 || ~var4 < -1) {
                    try {
                        Container var5;
                        if (class239.field3589 == null) {
                            var5 = class252.field3718.field6021;
                        } else {
                            var5 = class239.field3589;
                        }
                        int var6 = 0;
                        int var7 = 0;
                        if (class239.field3589 == var5) {
                            Insets var8 = class239.field3589.getInsets();
                            var6 = var8.left;
                            var7 = var8.top;
                        }
                        Graphics var9 = var5.getGraphics();
                        var9.setColor(Color.black);
                        if (~var1 < -1) {
                            var9.fillRect(var6, var7, var1, class199.field2901);
                        }
                        if (var2 > 0) {
                            var9.fillRect(var6, var7, class284.field4156, var2);
                        }
                        if (var3 > 0) {
                            var9.fillRect(-var3 + var6 + class284.field4156, var7, var3, class199.field2901);
                        }
                        if (~var4 < -1) {
                            var9.fillRect(var6, -var4 + class199.field2901 + var7, class284.field4156, var4);
                            return;
                        }
                    } catch (Exception var10) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
    public class328() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg1 != -45) {
            field4746 = false;
        }
        ++field4742;
        if (arg2 == 0) {
            this.field4749 = arg0.method1729(65280);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBI)V")
    public static final void method2078(int arg0, byte arg1, int arg2) {
        ++field4744;
        if (arg1 > 71) {
            if (class395.field5614 < class395.field5615) {
                class395.field5614 = (float) ((double) class395.field5614 / 30.0D + (double) class395.field5614);
                if (class395.field5614 > class395.field5615) {
                    class395.field5614 = class395.field5615;
                }
                class81.method459((byte) -98);
                class395.field5617 = (int) class395.field5614 >> 1;
                class395.field5616 = class168.method1041(class395.field5617, 3);
            } else if (class395.field5615 < class395.field5614) {
                class395.field5614 = (float) ((double) class395.field5614 - (double) class395.field5614 / 30.0D);
                if (class395.field5615 > class395.field5614) {
                    class395.field5614 = class395.field5615;
                }
                class81.method459((byte) -109);
                class395.field5617 = (int) class395.field5614 >> 1;
                class395.field5616 = class168.method1041(class395.field5617, 3);
            }
            if (class377.field5427 != -1 && class230.field3474 != -1) {
                int var3 = -class128.field1666 + class377.field5427;
                if (var3 < 2 || ~var3 < -3) {
                    var3 /= 8;
                }
                int var4 = -class220.field3280 + class230.field3474;
                if (var4 < 2 || ~var4 < -3) {
                    var4 /= 8;
                }
                class128.field1666 += var3;
                if (~var3 == -1 && ~var4 == -1) {
                    class377.field5427 = -1;
                    class230.field3474 = -1;
                }
                class220.field3280 += var4;
                class81.method459((byte) -124);
            }
            if (class303.field4313 > 0) {
                --class393.field5582;
                if (class393.field5582 == 0) {
                    --class303.field4313;
                    class393.field5582 = 100;
                }
            } else {
                class269.field3930 = -1;
                class479.field6719 = -1;
            }
            if (class477.field6701 && class65.field839 != null) {
                for (class38 var5 = (class38) class65.field839.method2843(1123227612); var5 != null; var5 = (class38) class65.field839.method2842(1673506446)) {
                    class19 var6 = class395.field5604.method490(36, var5.field506.field980);
                    if (var5.method257(arg2, (byte) -14, arg0)) {
                        if (var6.field225 != null) {
                            if (var6.field225[4] != null) {
                                class265.method1633(1002, -1, var6.field238, 0, (long) var5.field506.field980, var6.field253, true, 500, var6.field225[4], false, -1);
                            }
                            if (var6.field225[3] != null) {
                                class265.method1633(1006, -1, var6.field238, 0, (long) var5.field506.field980, var6.field253, true, 500, var6.field225[3], false, -1);
                            }
                            if (var6.field225[2] != null) {
                                class265.method1633(1009, -1, var6.field238, 0, (long) var5.field506.field980, var6.field253, true, 500, var6.field225[2], false, -1);
                            }
                            if (var6.field225[1] != null) {
                                class265.method1633(1001, -1, var6.field238, 0, (long) var5.field506.field980, var6.field253, true, 500, var6.field225[1], false, -1);
                            }
                            if (var6.field225[0] != null) {
                                class265.method1633(1010, -1, var6.field238, 0, (long) var5.field506.field980, var6.field253, true, 500, var6.field225[0], false, -1);
                            }
                        }
                        if (!var5.field506.field982) {
                            var5.field506.field982 = true;
                            class290.method1817(class171.field2489, var5.field506.field980, var6.field238);
                        }
                        if (var5.field506.field982) {
                            class290.method1817(class151.field2247, var5.field506.field980, var6.field238);
                        }
                    } else if (var5.field506.field982) {
                        var5.field506.field982 = false;
                        class290.method1817(class239.field3587, var5.field506.field980, var6.field238);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "(B)V")
    public static final void method2079(byte arg0) {
        class303.field4310.method1478((byte) -82);
        ++field4753;
        class360.field5179.method1478((byte) -120);
        class272.field3966.method1478((byte) -84);
        if (arg0 > -54) {
            field4745 = -47;
        }
        class78.field964.method1478((byte) -91);
        class355.field5137.method1478((byte) -88);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field4748;
        if (arg1 != 27782) {
            method2078(110, (byte) -32, 7);
        }
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            int[] var4 = this.method879((byte) -29, arg0 - 1 & class388.field5511, 0);
            int[] var5 = this.method879((byte) -29, arg0, 0);
            int[] var6 = this.method879((byte) -29, arg0 - -1 & class388.field5511, 0);
            for (int var7 = 0; var7 < class356.field5147; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4749;
                int var9 = (var5[var7 + 1 & class414.field5822] - var5[var7 - 1 & class414.field5822]) * this.field4749;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 - -var13) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V")
    public static void method2080(int arg0) {
        field4747 = null;
        field4743 = null;
        if (arg0 != -3) {
            method2076((char) 65524, -35);
        }
        field4750 = null;
        field4751 = null;
    }
}
