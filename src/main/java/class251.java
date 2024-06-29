import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class251 extends class199 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!om", name = "u", descriptor = "[Z")
    private boolean[] field3722 = new boolean[112];

    @OriginalMember(owner = "client!om", name = "l", descriptor = "Lwa;")
    public static class433 field3713 = new class433(512);

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field3731 = 0;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "Lri;")
    public static class73 field3733 = new class73(86, -2);

    @OriginalMember(owner = "client!om", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field3737 = new String[100];

    @OriginalMember(owner = "client!om", name = "J", descriptor = "[I")
    public static int[] field3736 = new int[14];

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "Ltl;")
    public static class436 field3732;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "Lic;")
    public static class491 field3735;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "Lkr;")
    private class524 field3721;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "Lkr;")
    private class524 field3723;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "Lkr;")
    private class524 field3727;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "Ljava/awt/Component;")
    private Component field3726;

    // $FF: synthetic field
    @OriginalMember(owner = "client!om", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field3738;

    // $FF: synthetic method
    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1683(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V", line = 4)
    public static void method1677(int arg0) {
        field3733 = null;
        field3713 = null;
        field3735 = null;
        field3737 = null;
        field3732 = null;
        if (arg0 == 128) {
            field3736 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(CIII)V", line = 20)
    private final void method1678(char arg0, int arg1, int arg2, int arg3) {
        field3724++;
        class524 var5 = new class524();
        var5.field7760 = arg0;
        var5.field7755 = arg3;
        var5.field7759 = arg1;
        var5.field7762 = class256.method1708((byte) 118);
        if (this.field3723 == null) {
            this.field3727 = var5;
        } else {
            this.field3723.field7751 = var5;
        }
        if (arg2 != 8880) {
            this.focusGained(null);
        }
        this.field3723 = var5;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILqa;B)Z", line = 46)
    public static final boolean method1679(int arg0, class162 arg1, byte arg2) {
        field3719++;
        int var3 = (class30.field323 - 104) / 2;
        int var4 = (class182.field2661 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < (var4 + 104); var51++) {
                for (int var52 = arg0; var52 <= 3; var52++) {
                    if (class495.method2971(var51, 1, arg0, var52, var6)) {
                        int var53 = var52;
                        if (class57.method347(var51, var6, true)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class142.method940(var6, var53, true, var51);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class149.field2205 = arg1.method1078(var7, 0, 512, 512, 512);
        class91.method528(-109);
        int var9 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) - 10) + 238 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class150.field2235][class150.field2235];
        if (arg2 >= -48) {
            method1679(-92, null, (byte) -107);
        }
        for (int var13 = var3; var13 < var3 + 104; var13 += class150.field2235) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class150.field2235) {
                arg1.method1098(0, 0, class150.field2235 * 4, class150.field2235 * 4);
                arg1.method1044(-16777216);
                for (int var37 = arg0; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class150.field2235; var44++) {
                        for (int var50 = 0; var50 < class150.field2235; var50++) {
                            var12[var44][var50] = class495.method2971(var36 + var50, 1, arg0, var37, var13 + var44);
                        }
                    }
                    class307.field4415[var37].method203(0, 0, 1024, var13, var36, class150.field2235 + var13, var36 - -class150.field2235, var12);
                    if (!class258.field3806) {
                        for (int var45 = -4; var45 < class150.field2235; var45++) {
                            for (int var46 = -4; var46 < class150.field2235; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var4 <= var48 && class495.method2971(var48, 1, arg0, var37, var47)) {
                                    int var49 = var37;
                                    if (class57.method347(var48, var47, true)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class47.method294(arg1, var45 * 4, var9, var47, var48, false, var49, (class150.field2235 - var46) * 4 - 4, var10);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class258.field3806) {
                    class130 var38 = class434.field6500[arg0];
                    for (int var39 = 0; var39 < class150.field2235; var39++) {
                        for (int var40 = 0; var40 < class150.field2235; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field2008[var41 - var38.field2021][var42 - var38.field2009];
                            if ((var43 & 0x40240000) != 0) {
                                arg1.method1087((class150.field2235 - var40) * 4 - 4, var39 * 4, 126, 4, -1713569622, 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg1.method1124(1, (class150.field2235 - var40) * 4 - 4, var39 * 4, 4, -1713569622);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg1.method1027(4, 3323, (class150.field2235 - var40) * 4 - 4, var39 * 4 + 3, -1713569622);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg1.method1124(1, (class150.field2235 - var40) * 4 - 1, var39 * 4, 4, -1713569622);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg1.method1027(4, 3323, (class150.field2235 - var40) * 4 - 4, var39 * 4, -1713569622);
                            }
                        }
                    }
                }
                arg1.method1036(0, 0, class150.field2235 * 4, class150.field2235 * 4, var11, 2);
                class149.field2205.method102((var13 - var3) * 4 + 48, -(class150.field2235 * 4) + 464 - (-var4 + var36) * 4, class150.field2235 * 4, class150.field2235 * 4, 0, 0);
            }
        }
        arg1.method1112();
        arg1.method1044(-16777215);
        class377.method2315(false);
        class405.field6118 = 0;
        class133.field2042.method817(-4);
        if (!class258.field3806) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg0; arg0 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class495.method2971(var20, 1, arg0, var21, var14)) {
                            class351 var22 = (class351) class196.method1340(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class351) class342.method2093(var21, var14, var20, field3738 == null ? (field3738 = method1683("mq")) : field3738);
                            }
                            if (var22 == null) {
                                var22 = (class351) class426.method2557(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class351) class444.method2670(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class519 var23 = class252.field3743.method2686(var22.method20(-30685), (byte) 102);
                                if (!var23.field7604 || class410.field6174) {
                                    int var24 = var23.field7637;
                                    if (var23.field7596 != null) {
                                        for (int var25 = 0; var25 < var23.field7596.length; var25++) {
                                            if (var23.field7596[var25] != -1) {
                                                class519 var26 = class252.field3743.method2686(var23.field7596[var25], (byte) 93);
                                                if (var26.field7637 >= 0) {
                                                    var24 = var26.field7637;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class158 var28 = class14.field176.method539(var24, (byte) 60);
                                            if (var28 != null && var28.field2313) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class434.field6500[var21].field2008;
                                            int var32 = class434.field6500[var21].field2021;
                                            int var33 = class434.field6500[var21].field2009;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class154.field2279[class405.field6118] = var23.field7580;
                                        class139.field2091[class405.field6118] = var29;
                                        class172.field2542[class405.field6118] = var30;
                                        class405.field6118++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class27.field284 != null) {
                class434.field6497.field7271 = 1;
                class14.field176.method538(1024, 1, 64);
                for (int var15 = 0; var15 < class27.field284.field288; var15++) {
                    int var16 = class27.field284.field295[var15];
                    if (var16 >> 28 == class500.field7365.field1768) {
                        int var17 = ((var16 & 0xFFFFC85) >> 14) - class68.field1038;
                        int var18 = (var16 & 0x3FFF) - class24.field259;
                        if (var17 >= 0 && class30.field323 > var17 && var18 >= 0 && var18 < class182.field2661) {
                            class133.field2042.method809(new class427(var15), false);
                        } else {
                            class158 var19 = class14.field176.method539(class27.field284.field290[var15], (byte) 60);
                            if (var19.field2327 != null && (var19.field2306 + var17) >= 0 && (var19.field2310 + var17) < class30.field323 && var19.field2342 + var18 >= 0 && class182.field2661 > (var19.field2302 + var18)) {
                                class133.field2042.method809(new class427(var15), false);
                            }
                        }
                    }
                }
                class14.field176.method538(128, 1, 64);
                class434.field6497.field7271 = 2;
                class434.field6497.method2927(-2);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 454)
    public final synchronized void method1353(int arg0) {
        field3729++;
        for (class524 var2 = this.field3727; var2 != null; var2 = var2.field7751) {
            if (var2.field7759 == 0) {
                if (var2.field7755 >= 0) {
                    var2.field7753 = !this.field3722[var2.field7755];
                }
                this.field3722[var2.field7755] = true;
            } else if (var2.field7759 == 1) {
                this.field3722[var2.field7755] = false;
            } else if (var2.field7759 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field3722[var3] = false;
                }
            }
        }
        this.field3721 = this.field3727;
        this.field3723 = null;
        this.field3727 = null;
        if (arg0 != 0) {
            field3736 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 506)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3715++;
        this.method1681(false, arg0, 1);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 514)
    private final void method1680(byte arg0, Component arg1) {
        field3718++;
        if (arg0 < 7) {
            return;
        }
        this.method1682(true);
        this.field3726 = arg1;
        Method var3 = class432.field6474;
        if (var3 != null) {
            try {
                var3.invoke(this.field3726, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3726.addKeyListener(this);
        this.field3726.addFocusListener(this);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;I)V", line = 540)
    private final void method1681(boolean arg0, KeyEvent arg1, int arg2) {
        field3720++;
        if (arg0) {
            this.keyTyped(null);
        }
        int var4 = arg1.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class244.field3609.length > var4) {
            int var5 = class244.field3609[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method1678('\u0000', arg2, 8880, var6);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V", line = 577)
    public final void method1356(int arg0) {
        field3717++;
        this.method1682(true);
        if (arg0 != 128) {
            this.method1350(-104);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z", line = 589)
    public final boolean method1352(int arg0, int arg1) {
        if (arg1 < 88) {
            this.field3727 = null;
        }
        field3734++;
        return arg0 >= 0 && arg0 < 112 ? this.field3722[arg0] : false;
    }

    @OriginalMember(owner = "client!om", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 605)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1681(false, arg0, 0);
        field3716++;
    }

    @OriginalMember(owner = "client!om", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 619)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3730++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class204.method1383(var2, 6)) {
            this.method1678(var2, 2, 8880, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!om", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 635)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3714++;
        this.method1678('\u0000', -1, 8880, 0);
    }

    @OriginalMember(owner = "client!om", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 643)
    public final void focusGained(FocusEvent arg0) {
        field3712++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lmn;", line = 651)
    public final class246 method1350(int arg0) {
        field3728++;
        class524 var2;
        for (var2 = this.field3721; var2 != null && var2.field7759 == -1; var2 = var2.field7751) {
        }
        if (var2 == null) {
            this.field3721 = null;
        } else {
            this.field3721 = var2.field7751;
        }
        if (arg0 != 128) {
            field3737 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 673)
    private final void method1682(boolean arg0) {
        field3725++;
        if (this.field3726 == null) {
            return;
        }
        this.field3726.removeKeyListener(this);
        this.field3726.removeFocusListener(this);
        this.field3726 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3722[var2] = false;
        }
        this.field3721 = null;
        if (!arg0) {
            this.field3727 = null;
        }
        this.field3727 = null;
        this.field3723 = null;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 705)
    public class251(Component arg0) {
        class20.method136(9235);
        this.method1680((byte) 110, arg0);
    }
}
