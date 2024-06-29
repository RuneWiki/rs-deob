import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class252 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "[[I")
    public static int[][] field4010 = new int[104][104];

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "J")
    public static long field4016 = 0L;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lok;")
    public static class41 field4007 = class137.method956("Lade Konfiguration )2 ", 45);

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lok;")
    public static class41 field4018 = class137.method956("hint_headicons", 45);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "[[[B")
    public static byte[][][] field4015;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V", line = 10)
    private static final void method1780(boolean arg0, int arg1) {
        field4019++;
        byte[][] var2;
        byte var3;
        if (class166.field2625 && arg0) {
            var2 = class124.field1840;
            var3 = 1;
        } else {
            var2 = class60.field887;
            var3 = 4;
        }
        for (int var4 = arg1; var4 < var3; var4++) {
            class234.method1685(-20783);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class248.field3959[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x39E8207) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFF5AF) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class110.field1557.length; var13++) {
                                if (class110.field1557[var13] == var12 && var2[var13] != null) {
                                    class88.method632(class222.field3548, (var10 & 0x7) * 8, var6 * 8, arg0, (byte) -37, var9, var8, var5 * 8, (var11 & 0x7) * 8, var2[var13], var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 94)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4012++;
        if (class43.field679 != null) {
            class78.field1154 = 0;
            class302.field4890 = arg0.getX();
            class139.field2139 = arg0.getY();
            class217.field3486 = class247.method1762(19166);
            if (arg0.isMetaDown()) {
                class208.field3366 = 2;
                class110.field1553 = 2;
            } else {
                class208.field3366 = 1;
                class110.field1553 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wh", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 143)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4009++;
        if (class43.field679 != null) {
            class78.field1154 = 0;
            class185.field3022 = -1;
            class67.field1017 = -1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 159)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4003++;
    }

    @OriginalMember(owner = "client!wh", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 178)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class43.field679 != null) {
            class78.field1154 = 0;
            class185.field3022 = arg0.getX();
            class67.field1017 = arg0.getY();
        }
        field4002++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 197)
    public static void method1781(int arg0) {
        field4007 = null;
        field4018 = null;
        if (arg0 != 10) {
            field4018 = (class41) null;
        }
        field4010 = (int[][]) null;
        field4015 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!wh", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 229)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class43.field679 != null) {
            class78.field1154 = 0;
            class185.field3022 = arg0.getX();
            class67.field1017 = arg0.getY();
        }
        field4017++;
    }

    @OriginalMember(owner = "client!wh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 250)
    public final void focusGained(FocusEvent arg0) {
        field4004++;
    }

    @OriginalMember(owner = "client!wh", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 258)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4006++;
        if (class43.field679 != null) {
            class78.field1154 = 0;
            class185.field3022 = arg0.getX();
            class67.field1017 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!wh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 276)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class43.field679 != null) {
            class110.field1553 = 0;
        }
        field4005++;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 300)
    public static final void method1782(int arg0) {
        boolean var1 = true;
        class126.method884(arg0 + 21657, false);
        field4014++;
        class93.field1374 = 0;
        for (int var2 = 0; var2 < class14.field187.length; var2++) {
            if (class314.field5297[var2] != -1 && class14.field187[var2] == null) {
                class14.field187[var2] = class245.field3938.method454(class314.field5297[var2], 0, 0);
                if (class14.field187[var2] == null) {
                    var1 = false;
                    class93.field1374++;
                }
            }
            if (class160.field2538[var2] != -1 && class60.field887[var2] == null) {
                class60.field887[var2] = class245.field3938.method483(1, class51.field778[var2], class160.field2538[var2], 0);
                if (class60.field887[var2] == null) {
                    var1 = false;
                    class93.field1374++;
                }
            }
            if (class166.field2625) {
                if (class125.field1862[var2] != -1 && class62.field902[var2] == null) {
                    class62.field902[var2] = class245.field3938.method454(class125.field1862[var2], 0, 0);
                    if (class62.field902[var2] == null) {
                        class93.field1374++;
                        var1 = false;
                    }
                }
                if (class203.field3279[var2] != -1 && class124.field1840[var2] == null) {
                    class124.field1840[var2] = class245.field3938.method454(class203.field3279[var2], 0, 0);
                    if (class124.field1840[var2] == null) {
                        class93.field1374++;
                        var1 = false;
                    }
                }
            }
            if (class77.field1143 != null && class158.field2482[var2] == null && class77.field1143[var2] != -1) {
                class158.field2482[var2] = class245.field3938.method483(arg0 + 21539, class51.field778[var2], class77.field1143[var2], 0);
                if (class158.field2482[var2] == null) {
                    var1 = false;
                    class93.field1374++;
                }
            }
        }
        if (class278.field4546 == null) {
            if (class248.field3958 == null || !class3.field42.method460((byte) 106, class187.method1346(new class41[] { class248.field3958.field2565, class92.field1348 }, 0))) {
                class278.field4546 = new class294(0);
            } else if (class3.field42.method482(class187.method1346(new class41[] { class248.field3958.field2565, class92.field1348 }, 0), -1)) {
                class278.field4546 = class193.method1384(false, class187.method1346(new class41[] { class248.field3958.field2565, class92.field1348 }, 0), class3.field42);
            } else {
                class93.field1374++;
                var1 = false;
            }
        }
        if (!var1) {
            class125.field1864 = 1;
            return;
        }
        class283.field4601 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class14.field187.length; var4++) {
            byte[] var5 = class60.field887[var4];
            if (var5 != null) {
                int var6 = (class110.field1557[var4] >> 8) * 64 - class88.field1300;
                int var7 = (class110.field1557[var4] & 0xFF) * 64 - class55.field809;
                if (class122.field1813) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class36.method240(var6, var7, var5, true);
            }
            if (class166.field2625) {
                byte[] var8 = class124.field1840[var4];
                if (var8 != null) {
                    int var9 = (class110.field1557[var4] >> 8) * 64 - class88.field1300;
                    int var10 = (class110.field1557[var4] & 0xFF) * 64 - class55.field809;
                    if (class122.field1813) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class36.method240(var9, var10, var8, true);
                }
            }
        }
        if (!var3) {
            class125.field1864 = 2;
            return;
        }
        if (class125.field1864 != 0) {
            class305.method2105(true, class187.method1346(new class41[] { class217.field3477, class265.field4191 }, 0), -19861);
        }
        class234.method1685(-20783);
        class235.method1693((byte) -114);
        boolean var11 = false;
        if (class166.field2625 && class27.field393) {
            for (int var12 = 0; var12 < class14.field187.length; var12++) {
                if (class124.field1840[var12] != null || class62.field902[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        client.method2121(4, 104, 104, class166.field2625 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class222.field3548[var13].method1609(16777215);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class126.field1879[var14][var15][var16] = 0;
                }
            }
        }
        class176.method1258(false, (byte) -101);
        if (class166.field2625) {
            class263.field4174.method1970();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class263.field4173[var17][var18].field2806 = true;
                }
            }
        }
        if (class166.field2625) {
            class179.method1270();
        }
        if (class166.field2625) {
            class185.method1340(-61);
        }
        class234.method1685(-20783);
        System.gc();
        class126.method884(119, true);
        class32.method219(false, 104);
        if (!class122.field1813) {
            class59.method421(arg0 + 21540, false);
            class126.method884(arg0 ^ 0xFFFFABA9, true);
            if (class166.field2625) {
                int var19 = class62.field913.field4306[0] >> 3;
                int var20 = class62.field913.field4341[0] >> 3;
                class122.method868(var20, arg0 + 21662, var19);
            }
            class101.method706(arg0 - 2147462111, false);
            if (class158.field2482 != null) {
                class305.method2100((byte) -80);
            }
        }
        if (class122.field1813) {
            class145.method1005(13, false);
            class126.method884(119, true);
            if (class166.field2625) {
                int var21 = class62.field913.field4341[0] >> 3;
                int var22 = class62.field913.field4306[0] >> 3;
                class122.method868(var21, 100, var22);
            }
            method1780(false, 0);
        }
        class235.method1693((byte) -114);
        class126.method884(119, true);
        class290.method2017((byte) -43, class222.field3548, false);
        if (class166.field2625) {
            class179.method1273();
        }
        class126.method884(arg0 + 21657, true);
        int var23 = class36.field539;
        if (class55.field807 < var23) {
            var23 = class55.field807;
        }
        if (var23 < (class55.field807 - 1)) {
            int var24 = class55.field807 - 1;
        }
        if (class75.method553(23987)) {
            class158.method1116(0);
        } else {
            class158.method1116(class36.field539);
        }
        class191.method1374(8736);
        if (class166.field2625 && var11) {
            class201.method1427(true);
            class32.method219(true, 104);
            if (!class122.field1813) {
                class59.method421(2, true);
                class126.method884(119, true);
                class101.method706(Integer.MAX_VALUE, true);
            }
            if (class122.field1813) {
                class145.method1005(13, true);
                class126.method884(119, true);
                method1780(true, arg0 + 21538);
            }
            class235.method1693((byte) -114);
            class126.method884(119, true);
            class290.method2017((byte) -43, class222.field3548, true);
            class126.method884(arg0 ^ 0xFFFFABA9, true);
            class191.method1374(arg0 + 30274);
            class201.method1427(false);
        }
        if (class166.field2625) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class263.field4173[var25][var26].method1234(class278.field4548[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class158.method1115((byte) 30, var28, var27);
            }
        }
        class265.method1874(120);
        class234.method1685(-20783);
        class161.method1142(-21852);
        if (arg0 != -21538) {
            method1780(true, -90);
        }
        class235.method1693((byte) -114);
        if (class238.field3817 != null && class118.field1724 != null && class94.field1377 == 25) {
            class285.field4642.method844(-4, 255);
            class285.field4642.method787(853918096, 1057001181);
            class65.field964++;
        }
        if (!class122.field1813) {
            int var29 = (class133.field1990 - 6) / 8;
            int var30 = (class133.field1990 + 6) / 8;
            int var31 = (class235.field3766 - 6) / 8;
            int var32 = (class235.field3766 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= var32 + 1; var34++) {
                    if (var29 > var33 || var33 > var30 || var34 < var31 || var34 > var32) {
                        class245.field3938.method461(class187.method1346(new class41[] { class221.field3527, class1.method4(var33, (byte) 34), class284.field4616, class1.method4(var34, (byte) 69) }, 0), arg0 + 21644);
                        class245.field3938.method461(class187.method1346(new class41[] { class26.field373, class1.method4(var33, (byte) 27), class284.field4616, class1.method4(var34, (byte) 18) }, 0), 103);
                    }
                }
            }
        }
        if (class94.field1377 == 28) {
            class282.method1991(-8, 10);
        } else {
            class282.method1991(arg0 ^ 0x5426, 30);
            if (class118.field1724 != null) {
                class285.field4642.method844(-4, 33);
            }
        }
        class234.method1685(-20783);
        class32.method216(44);
    }

    @OriginalMember(owner = "client!wh", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 787)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4011++;
        if (class43.field679 != null) {
            class78.field1154 = 0;
            class110.field1553 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
