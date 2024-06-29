import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1411 = -1;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1412 = 0;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lkc;")
    public static class67 field1415 = class19.method144("Anmelde)2Zeitlimit -Uberschritten)3", 117);

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lkc;")
    public static class67 field1419 = class19.method144("Verbindung mit", 96);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1413 = 0;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Lkc;")
    private static class67 field1429 = class19.method144("Hide", 79);

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "[I")
    public static int[] field1430 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lkc;")
    public static class67 field1425 = field1429;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "Lkc;")
    public static class67 field1434 = class19.method144("Verbindung konnte nicht hergestellt werden)3", 119);

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[I")
    public static int[] field1435 = new int[1000];

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lvc;")
    public static class133 field1428 = new class133();

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 5)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1433++;
        if (class66.field1543 != null) {
            class115.field2717 = 0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lac;II)Lab;", line = 16)
    public static final class3 method470(class4 arg0, int arg1, int arg2) {
        field1414++;
        if (arg1 <= 93) {
            return null;
        } else if (class97.method757(arg0, arg2, 13)) {
            return class63.method489(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 31)
    public static void method471(int arg0) {
        field1415 = null;
        if (arg0 != 32002) {
            field1428 = null;
        }
        field1429 = null;
        field1419 = null;
        field1435 = null;
        field1434 = null;
        field1430 = null;
        field1428 = null;
        field1425 = null;
    }

    @OriginalMember(owner = "client!jb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 49)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class66.field1543 != null) {
            class70.field1661 = 0;
            class121.field2850 = arg0.getX();
            class127.field2975 = arg0.getY();
        }
        field1421++;
    }

    @OriginalMember(owner = "client!jb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 69)
    public final void focusGained(FocusEvent arg0) {
        field1424++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)Z", line = 86)
    public static final boolean method472(int arg0, int arg1, int arg2, int arg3) {
        field1422++;
        int var4 = arg2 >> 14 & 0x7FFF;
        int var5 = class103.field2332.method868(class112.field2593, arg1, arg0, arg2);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 >> 6 & 0x3;
        int var7 = var5 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class106 var8 = class2.method12(var4, 21876);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field2369;
                var9 = var8.field2432;
            } else {
                var9 = var8.field2369;
                var10 = var8.field2432;
            }
            int var11 = var8.field2394;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class38.method308(var10, 0, class69.field1640.field1263[0], var9, arg1, 2, arg0, 0, true, var11, arg3 ^ 0xFFFFC7B1, class69.field1640.field1198[0]);
        } else {
            class38.method308(0, var7 + 1, class69.field1640.field1263[0], 0, arg1, 2, arg0, var6, true, 0, -14415, class69.field1640.field1198[0]);
        }
        class50.field1242 = class74.field1758;
        class9.field195 = 2;
        class20.field406 = class109.field2504;
        class112.field2591 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 138)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class66.field1543 != null) {
            class70.field1661 = 0;
            class121.field2850 = -1;
            class127.field2975 = -1;
        }
        field1423++;
    }

    @OriginalMember(owner = "client!jb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 181)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1426++;
        if (class66.field1543 != null) {
            class70.field1661 = 0;
            class115.field2717 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 199)
    public static final void method473(byte arg0) {
        field1417++;
        class60 var1 = class66.field1543;
        synchronized (class66.field1543) {
            if (arg0 != -83) {
                field1413 = 81;
            }
            class90.field2084 = class115.field2717;
            class138.field3298 = class121.field2850;
            class80.field1889 = class127.field2975;
            class115.field2705 = class88.field2035;
            class74.field1758 = class7.field170;
            class109.field2504 = class140.field3322;
            class101.field2275 = class114.field2670;
            class88.field2035 = 0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 227)
    public final void mouseClicked(MouseEvent arg0) {
        field1420++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V", line = 237)
    public static final void method474(int arg0, boolean arg1) {
        field1410++;
        class130.field3038 = arg1;
        if (arg0 != -25619) {
            return;
        }
        if (!class130.field3038) {
            int var25 = class112.field2558.method1119(-16894);
            int var26 = class112.field2558.method1072(68);
            int var27 = class112.field2558.method1084(arg0 + 25742);
            int var28 = class112.field2558.method1084(106);
            int var29 = (class133.field3166 - class112.field2558.field3347) / 16;
            class101.field2282 = new int[var29][4];
            for (int var30 = 0; var30 < var29; var30++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class101.field2282[var30][var37] = class112.field2558.method1073(114);
                }
            }
            int var31 = class112.field2558.method1097(false);
            class46.field1111 = new int[var29];
            class20.field414 = new byte[var29][];
            boolean var32 = false;
            class25.field542 = new int[var29];
            class33.field819 = new int[var29];
            class42.field1061 = new byte[var29][];
            int var33 = 0;
            if ((var27 / 8 == 48 || var27 / 8 == 49) && (var28 / 8) == 48) {
                var32 = true;
            }
            if (var27 / 8 == 48 && var28 / 8 == 148) {
                var32 = true;
            }
            for (int var34 = (var27 - 6) / 8; var34 <= (var27 + 6) / 8; var34++) {
                for (int var35 = (var28 - 6) / 8; var35 <= (var28 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var32 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class25.field542[var33] = var36;
                        class33.field819[var33] = class132.field3138.method31(class63.method479(new class67[] { class128.field3002, class71.method586(103, var34), class135.field3250, class71.method586(arg0 + 25722, var35) }, class63.method487(arg0, -25619)), 0);
                        class46.field1111[var33] = class132.field3138.method31(class63.method479(new class67[] { class70.field1676, class71.method586(103, var34), class135.field3250, class71.method586(103, var35) }, 0), arg0 + 25619);
                        var33++;
                    }
                }
            }
            class21.method161(var25, var26, var27, var28, (byte) -102, var31);
            return;
        }
        int var2 = class112.field2558.method1084(126);
        int var3 = class112.field2558.method1084(arg0 ^ 0xFFFF9BB0);
        int var4 = class112.field2558.method1097(false);
        int var5 = class112.field2558.method1072(70);
        class112.field2558.method718(74);
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class112.field2558.method709(1, (byte) 86);
                    if (var24 == 1) {
                        class65.field1537[var6][var22][var23] = class112.field2558.method709(26, (byte) 86);
                    } else {
                        class65.field1537[var6][var22][var23] = -1;
                    }
                }
            }
        }
        class112.field2558.method716((byte) 110);
        int var7 = (class133.field3166 - class112.field2558.field3347) / 16;
        class101.field2282 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class101.field2282[var8][var21] = class112.field2558.method1078(109);
            }
        }
        int var9 = class112.field2558.method1084(109);
        class46.field1111 = new int[var7];
        class25.field542 = new int[var7];
        class33.field819 = new int[var7];
        class42.field1061 = new byte[var7][];
        class20.field414 = new byte[var7][];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class65.field1537[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + (var16 / 8);
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class25.field542[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class25.field542[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class33.field819[var10] = class132.field3138.method31(class63.method479(new class67[] { class128.field3002, class71.method586(103, var19), class135.field3250, class71.method586(103, var20) }, class63.method487(arg0, -25619)), 0);
                            class46.field1111[var10] = class132.field3138.method31(class63.method479(new class67[] { class70.field1676, class71.method586(103, var19), class135.field3250, class71.method586(103, var20) }, 0), 0);
                            var10++;
                        }
                    }
                }
            }
        }
        class21.method161(var3, var2, var9, var5, (byte) -93, var4);
    }

    @OriginalMember(owner = "client!jb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 476)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1416++;
        if (class66.field1543 != null) {
            class70.field1661 = 0;
            class121.field2850 = arg0.getX();
            class127.field2975 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 493)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class66.field1543 != null) {
            class70.field1661 = 0;
            class121.field2850 = arg0.getX();
            class127.field2975 = arg0.getY();
        }
        field1436++;
    }

    @OriginalMember(owner = "client!jb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 516)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class66.field1543 != null) {
            class70.field1661 = 0;
            class7.field170 = arg0.getX();
            class140.field3322 = arg0.getY();
            class114.field2670 = class82.method644(0);
            if (arg0.isMetaDown()) {
                class88.field2035 = 2;
                class115.field2717 = 2;
            } else {
                class88.field2035 = 1;
                class115.field2717 = 1;
            }
        }
        field1418++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
