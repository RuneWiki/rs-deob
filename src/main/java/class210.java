import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class210 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lsc;")
    public static class181 field3603 = class149.method967(255, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Ljd;")
    public static class265 field3596 = new class265(500);

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "Lo;")
    public static class175 field3608 = null;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "Lsc;")
    public static class181 field3611 = class149.method967(255, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Lsc;")
    public static class181 field3609 = class149.method967(255, "welle:");

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Lsc;")
    public static class181 field3613 = class149.method967(255, "Ablegen");

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!rg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class46.field726 != null) {
            class78.field1260 = 0;
            class41.field625 = 0;
            int var2 = arg0.getModifiers();
        }
        field3594++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class46.field726 != null) {
            class78.field1260 = 0;
            class62.field963 = arg0.getX();
            class185.field3292 = arg0.getY();
            class243.field4225 = class213.method1414(-9292);
            if (arg0.isMetaDown()) {
                class248.field4329 = 2;
                class41.field625 = 2;
            } else {
                class248.field4329 = 1;
                class41.field625 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3604++;
    }

    @OriginalMember(owner = "client!rg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class46.field726 != null) {
            class78.field1260 = 0;
            class59.field885 = arg0.getX();
            class89.field1413 = arg0.getY();
        }
        field3598++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[[[Lfa;ZIII)Z")
    public static final boolean method1391(int arg0, class220[][][] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        byte var6 = arg2 ? 1 : (byte) (class94.field1505 & 0xFF);
        field3600++;
        if (class174.field2919[class38.field581][arg0][arg5] == var6) {
            return false;
        } else if ((class70.field1129[class38.field581][arg0][arg5] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class94.field1510[var8] = arg0;
            int var31 = var8 + 1;
            class26.field456[var8] = arg5;
            class174.field2919[class38.field581][arg0][arg5] = var6;
            while (var7 != var31) {
                int var9 = class94.field1510[var7] & 0xFFFF;
                int var10 = class94.field1510[var7] >> 24 & 0xFF;
                int var11 = class26.field456[var7] & 0xFFFF;
                int var12 = (class94.field1510[var7] & 0xFFD9D2) >> 16;
                int var13 = (class26.field456[var7] & 0xFF815B) >> 16;
                boolean var14 = false;
                var7 = var7 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class70.field1129[class38.field581][var9][var11] & 0x4) == 0) {
                    var15 = true;
                }
                label229: for (int var16 = class38.field581 + 1; var16 <= 3; var16++) {
                    if ((class70.field1129[var16][var9][var11] & 0x8) == 0) {
                        if (var15 && arg1[var16][var9][var11] != null) {
                            if (arg1[var16][var9][var11].field3801 != null) {
                                int var19 = class35.method262(var12, true);
                                if (arg1[var16][var9][var11].field3801.field1202 == var19 || arg1[var16][var9][var11].field3801.field1205 == var19) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var20 = class35.method262(var10, true);
                                    if (arg1[var16][var9][var11].field3801.field1202 == var20 || arg1[var16][var9][var11].field3801.field1205 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class35.method262(var13, true);
                                    if (arg1[var16][var9][var11].field3801.field1202 == var21 || arg1[var16][var9][var11].field3801.field1205 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var9][var11].field3797 != null) {
                                for (int var22 = 0; var22 < arg1[var16][var9][var11].field3806; var22++) {
                                    int var23 = (int) (arg1[var16][var9][var11].field3797[var22].field1677 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg1[var16][var9][var11].field3797[var22].field1677 >> 20 & 0x3L);
                                    int var25 = var23 | var24 << 6;
                                    if (var12 == var25 || var10 != 0 && var10 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class220 var26 = arg1[var16][var9][var11];
                        if (var26 != null && var26.field3806 > 0) {
                            for (int var27 = 0; var27 < var26.field3806; var27++) {
                                class100 var28 = var26.field3797[var27];
                                if (var28.field1688 != var28.field1671 || var28.field1676 != var28.field1672) {
                                    for (int var29 = var28.field1688; var29 <= var28.field1671; var29++) {
                                        for (int var30 = var28.field1672; var30 <= var28.field1676; var30++) {
                                            class174.field2919[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class174.field2919[var16][var9][var11] = var6;
                    }
                }
                if (var14) {
                    if (class69.field1108[arg3] < class31.field505[class38.field581 + 1][var9][var11]) {
                        class69.field1108[arg3] = class31.field505[class38.field581 + 1][var9][var11];
                    }
                    int var17 = var9 << 7;
                    if (class143.field2325[arg3] > var17) {
                        class143.field2325[arg3] = var17;
                    } else if (var17 > class60.field907[arg3]) {
                        class60.field907[arg3] = var17;
                    }
                    int var18 = var11 << 7;
                    if (class85.field1344[arg3] > var18) {
                        class85.field1344[arg3] = var18;
                    } else if (class38.field577[arg3] < var18) {
                        class38.field577[arg3] = var18;
                    }
                }
                if (!var15) {
                    if (var9 >= 1 && class174.field2919[class38.field581][var9 - 1][var11] != var6) {
                        class94.field1510[var31] = class185.method1291(class185.method1291(var9 - 1, 1179648), -754974720);
                        class26.field456[var31] = class185.method1291(var11, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class174.field2919[class38.field581][var9 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if ((var9 - 1) >= 0 && class174.field2919[class38.field581][var9 - 1][var11] != var6 && (class70.field1129[class38.field581][var9][var11] & 0x4) == 0 && (class70.field1129[class38.field581][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class94.field1510[var31] = class185.method1291(class185.method1291(1179648, var9 - 1), 1375731712);
                            class26.field456[var31] = class185.method1291(1245184, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class174.field2919[class38.field581][var9 - 1][var11] = var6;
                        }
                        if (class174.field2919[class38.field581][var9][var11] != var6) {
                            class94.field1510[var31] = class185.method1291(class185.method1291(var9, 5373952), 318767104);
                            class26.field456[var31] = class185.method1291(var11, 5439488);
                            class174.field2919[class38.field581][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class174.field2919[class38.field581][var9 + 1][var11] != var6 && (class70.field1129[class38.field581][var9][var11] & 0x4) == 0 && (class70.field1129[class38.field581][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class94.field1510[var31] = class185.method1291(class185.method1291(var9 + 1, 5373952), -1845493760);
                            class26.field456[var31] = class185.method1291(var11, 5439488);
                            class174.field2919[class38.field581][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var11--;
                    if (var9 + 1 < 104 && class174.field2919[class38.field581][var9 + 1][var11] != var6) {
                        class94.field1510[var31] = class185.method1291(class185.method1291(9568256, var9 + 1), 1392508928);
                        class26.field456[var31] = class185.method1291(9633792, var11);
                        var31 = var31 + 1 & 0xFFF;
                        class174.field2919[class38.field581][var9 + 1][var11] = var6;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if ((var9 - 1) >= 0 && class174.field2919[class38.field581][var9 - 1][var11] != var6 && (class70.field1129[class38.field581][var9][var11] & 0x4) == 0 && (class70.field1129[class38.field581][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class94.field1510[var31] = class185.method1291(301989888, class185.method1291(13762560, var9 - 1));
                            class26.field456[var31] = class185.method1291(var11, 13828096);
                            class174.field2919[class38.field581][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class174.field2919[class38.field581][var9][var11] != var6) {
                            class94.field1510[var31] = class185.method1291(class185.method1291(var9, 13762560), -1828716544);
                            class26.field456[var31] = class185.method1291(13828096, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class174.field2919[class38.field581][var9][var11] = var6;
                        }
                        if ((var9 + 1) < 104 && class174.field2919[class38.field581][var9 + 1][var11] != var6 && (class70.field1129[class38.field581][var9][var11] & 0x4) == 0 && (class70.field1129[class38.field581][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class94.field1510[var31] = class185.method1291(class185.method1291(var9 + 1, 9568256), -771751936);
                            class26.field456[var31] = class185.method1291(var11, 9633792);
                            class174.field2919[class38.field581][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class69.field1108[arg3] != -1000000) {
                class69.field1108[arg3] += 10;
                class143.field2325[arg3] -= 50;
                class60.field907[arg3] += 50;
                class38.field577[arg3] += 50;
                class85.field1344[arg3] -= 50;
            }
            if (arg4 < 8) {
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3595++;
        if (class46.field726 != null) {
            class78.field1260 = 0;
            class59.field885 = arg0.getX();
            class89.field1413 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3593++;
    }

    @OriginalMember(owner = "client!rg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class46.field726 != null) {
            class78.field1260 = 0;
            class59.field885 = -1;
            class89.field1413 = -1;
        }
        field3602++;
    }

    @OriginalMember(owner = "client!rg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class46.field726 != null) {
            class78.field1260 = 0;
            class59.field885 = arg0.getX();
            class89.field1413 = arg0.getY();
        }
        field3607++;
    }

    @OriginalMember(owner = "client!rg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class46.field726 != null) {
            class41.field625 = 0;
        }
        field3597++;
    }

    @OriginalMember(owner = "client!rg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3601++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class82.field1322 = arg4;
        class76.field1232 = arg3;
        field3605++;
        class33.field533 = arg2;
        class51.field799 = arg1;
        class75.field1209 = arg0;
        if (arg5 != -1845493760) {
            method1393((byte) 53);
        }
        if (class76.field1232 >= 100) {
            int var6 = class82.field1322 * 128 + 64;
            int var7 = class51.field799 * 128 + 64;
            int var8 = class232.method1606(class38.field581, (byte) -64, var6, var7) - class33.field533;
            int var9 = var6 - class86.field1370;
            int var10 = var8 - class228.field3916;
            int var11 = var7 - class127.field2100;
            int var12 = (int) Math.sqrt((double) (var11 * var11 + (var9 * var9)));
            class208.field3559 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class47.field734 = (int) (Math.atan2((double) var11, (double) var9) * -325.949D) & 0x7FF;
            if (class208.field3559 < 128) {
                class208.field3559 = 128;
            }
            if (class208.field3559 > 383) {
                class208.field3559 = 383;
            }
        }
        class110.field1792 = 2;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method1393(byte arg0) {
        field3609 = null;
        field3596 = null;
        field3611 = null;
        if (arg0 <= 40) {
            method1393((byte) -79);
        }
        field3603 = null;
        field3608 = null;
        field3613 = null;
    }
}
