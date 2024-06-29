import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class172 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "J")
    public static long field2771 = 0L;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Ljj;")
    public static class134 field2769;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Lol;")
    public static class209 field2782;

    @OriginalMember(owner = "client!gl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class9.field128 != null) {
            class30.field361 = 0;
        }
        field2783++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIZ[[[Lpk;IB)Z")
    public static final boolean method1198(int arg0, int arg1, boolean arg2, class99[][][] arg3, int arg4, byte arg5) {
        field2778++;
        byte var6 = arg2 ? 1 : (byte) (class23.field293 & 0xFF);
        if (arg5 != 24) {
            field2782 = null;
        }
        if (class243.field3894[class28.field336][arg4][arg1] == var6) {
            return false;
        } else if ((class134.field2251[class28.field336][arg4][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class34.field418[var7] = arg4;
            int var31 = var7 + 1;
            class148.field2389[var7] = arg1;
            class243.field3894[class28.field336][arg4][arg1] = var6;
            while (var31 != var8) {
                int var9 = class34.field418[var8] & 0xFFFF;
                int var10 = class34.field418[var8] >> 16 & 0xFF;
                int var11 = class34.field418[var8] >> 24 & 0xFF;
                int var12 = (class148.field2389[var8] & 0xFFAC1E) >> 16;
                boolean var13 = false;
                int var14 = class148.field2389[var8] & 0xFFFF;
                if ((class134.field2251[class28.field336][var9][var14] & 0x4) == 0) {
                    var13 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                label229: for (int var16 = class28.field336 + 1; var16 <= 3; var16++) {
                    if ((class134.field2251[var16][var9][var14] & 0x8) == 0) {
                        if (var13 && arg3[var16][var9][var14] != null) {
                            if (arg3[var16][var9][var14].field1502 != null) {
                                int var19 = class257.method1687(65, var10);
                                if (arg3[var16][var9][var14].field1502.field3717 == var19 || arg3[var16][var9][var14].field1502.field3703 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class257.method1687(92, var11);
                                    if (arg3[var16][var9][var14].field1502.field3717 == var20 || arg3[var16][var9][var14].field1502.field3703 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class257.method1687(91, var12);
                                    if (arg3[var16][var9][var14].field1502.field3717 == var21 || arg3[var16][var9][var14].field1502.field3703 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var9][var14].field1496 != null) {
                                for (int var22 = 0; var22 < arg3[var16][var9][var14].field1503; var22++) {
                                    int var23 = (int) (arg3[var16][var9][var14].field1496[var22].field2275 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg3[var16][var9][var14].field1496[var22].field2275 >> 20 & 0x3L);
                                    int var25 = var24 << 6 | var23;
                                    if (var10 == var25 || var11 != 0 && var11 == var25 || var12 != 0 && var12 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class99 var26 = arg3[var16][var9][var14];
                        if (var26 != null && var26.field1503 > 0) {
                            for (int var27 = 0; var27 < var26.field1503; var27++) {
                                class138 var28 = var26.field1496[var27];
                                if (var28.field2289 != var28.field2272 || var28.field2285 != var28.field2284) {
                                    for (int var29 = var28.field2272; var29 <= var28.field2289; var29++) {
                                        for (int var30 = var28.field2284; var30 <= var28.field2285; var30++) {
                                            class243.field3894[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class243.field3894[var16][var9][var14] = var6;
                    }
                }
                if (var15) {
                    if (class229.field3641[class28.field336 + 1][var9][var14] > class160.field2604[arg0]) {
                        class160.field2604[arg0] = class229.field3641[class28.field336 + 1][var9][var14];
                    }
                    int var17 = var14 << 7;
                    int var18 = var9 << 7;
                    if (class164.field2664[arg0] > var18) {
                        class164.field2664[arg0] = var18;
                    } else if (class8.field110[arg0] < var18) {
                        class8.field110[arg0] = var18;
                    }
                    if (class129.field2163[arg0] > var17) {
                        class129.field2163[arg0] = var17;
                    } else if (var17 > class16.field186[arg0]) {
                        class16.field186[arg0] = var17;
                    }
                }
                if (!var13) {
                    if (var9 >= 1 && class243.field3894[class28.field336][var9 - 1][var14] != var6) {
                        class34.field418[var31] = class45.method348(-754974720, class45.method348(1179648, var9 - 1));
                        class148.field2389[var31] = class45.method348(var14, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class243.field3894[class28.field336][var9 - 1][var14] = var6;
                    }
                    var14++;
                    if (var14 < 104) {
                        if ((var9 - 1) >= 0 && class243.field3894[class28.field336][var9 - 1][var14] != var6 && (class134.field2251[class28.field336][var9][var14] & 0x4) == 0 && (class134.field2251[class28.field336][var9 - 1][var14 - 1] & 0x4) == 0) {
                            class34.field418[var31] = class45.method348(class45.method348(1179648, var9 - 1), 1375731712);
                            class148.field2389[var31] = class45.method348(var14, 1245184);
                            class243.field3894[class28.field336][var9 - 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class243.field3894[class28.field336][var9][var14] != var6) {
                            class34.field418[var31] = class45.method348(318767104, class45.method348(var9, 5373952));
                            class148.field2389[var31] = class45.method348(var14, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class243.field3894[class28.field336][var9][var14] = var6;
                        }
                        if ((var9 + 1) < 104 && class243.field3894[class28.field336][var9 + 1][var14] != var6 && (class134.field2251[class28.field336][var9][var14] & 0x4) == 0 && (class134.field2251[class28.field336][var9 + 1][var14 - 1] & 0x4) == 0) {
                            class34.field418[var31] = class45.method348(-1845493760, class45.method348(5373952, var9 + 1));
                            class148.field2389[var31] = class45.method348(var14, 5439488);
                            class243.field3894[class28.field336][var9 + 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var14--;
                    if (var9 + 1 < 104 && class243.field3894[class28.field336][var9 + 1][var14] != var6) {
                        class34.field418[var31] = class45.method348(1392508928, class45.method348(9568256, var9 + 1));
                        class148.field2389[var31] = class45.method348(var14, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class243.field3894[class28.field336][var9 + 1][var14] = var6;
                    }
                    var14--;
                    if (var14 >= 0) {
                        if (var9 - 1 >= 0 && class243.field3894[class28.field336][var9 - 1][var14] != var6 && (class134.field2251[class28.field336][var9][var14] & 0x4) == 0 && (class134.field2251[class28.field336][var9 - 1][var14 + 1] & 0x4) == 0) {
                            class34.field418[var31] = class45.method348(class45.method348(var9 - 1, 13762560), 301989888);
                            class148.field2389[var31] = class45.method348(var14, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class243.field3894[class28.field336][var9 - 1][var14] = var6;
                        }
                        if (class243.field3894[class28.field336][var9][var14] != var6) {
                            class34.field418[var31] = class45.method348(class45.method348(13762560, var9), -1828716544);
                            class148.field2389[var31] = class45.method348(13828096, var14);
                            var31 = var31 + 1 & 0xFFF;
                            class243.field3894[class28.field336][var9][var14] = var6;
                        }
                        if ((var9 + 1) < 104 && class243.field3894[class28.field336][var9 + 1][var14] != var6 && (class134.field2251[class28.field336][var9][var14] & 0x4) == 0 && (class134.field2251[class28.field336][var9 + 1][var14 + 1] & 0x4) == 0) {
                            class34.field418[var31] = class45.method348(-771751936, class45.method348(9568256, var9 + 1));
                            class148.field2389[var31] = class45.method348(9633792, var14);
                            class243.field3894[class28.field336][var9 + 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class160.field2604[arg0] != -1000000) {
                class160.field2604[arg0] += 10;
                class164.field2664[arg0] -= 50;
                class8.field110[arg0] += 50;
                class16.field186[arg0] += 50;
                class129.field2163[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)V")
    public static final void method1199(int arg0, boolean arg1) {
        field2779++;
        if (arg0 > -27) {
            field2775 = 31;
        }
        if (class144.field2331 != arg1) {
            class144.field2331 = arg1;
            class175.method1212(false);
        }
    }

    @OriginalMember(owner = "client!gl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2772++;
    }

    @OriginalMember(owner = "client!gl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2773++;
        if (class9.field128 != null) {
            class6.field78 = 0;
            class206.field3300 = arg0.getX();
            class243.field3897 = arg0.getY();
            class78.field1075 = class182.method1253(20215);
            if (arg0.isMetaDown()) {
                class185.field2964 = 2;
                class30.field361 = 2;
            } else {
                class185.field2964 = 1;
                class30.field361 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2768++;
        if (class9.field128 != null) {
            class6.field78 = 0;
            class42.field499 = -1;
            class7.field108 = -1;
        }
    }

    @OriginalMember(owner = "client!gl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2777++;
        if (class9.field128 != null) {
            class6.field78 = 0;
            class42.field499 = arg0.getX();
            class7.field108 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!gl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2780++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2770++;
        if (class9.field128 != null) {
            class6.field78 = 0;
            class42.field499 = arg0.getX();
            class7.field108 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method1200(byte arg0) {
        field2769 = null;
        field2782 = null;
        if (arg0 != 4) {
            field2782 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2781++;
        if (class9.field128 != null) {
            class6.field78 = 0;
            class42.field499 = arg0.getX();
            class7.field108 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1201(byte arg0, String arg1) {
        int var2 = 117 / ((arg0 + 28) / 46);
        field2776++;
        if (arg1 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < class264.field4224; var3++) {
            if (arg1.equalsIgnoreCase(class28.field338[var3])) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2774++;
        if (class9.field128 != null) {
            class6.field78 = 0;
            class30.field361 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
