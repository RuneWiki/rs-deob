import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class82 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lkh;")
    public static class117 field1540 = class224.method1450((byte) 127, "welle2:");

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Z")
    public static boolean field1543 = false;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lkh;")
    public static class117 field1548 = class224.method1450((byte) 120, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lkh;")
    public static class117 field1544 = class224.method1450((byte) 109, "blinken3:");

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lkh;")
    private static class117 field1556 = class224.method1450((byte) 112, "Close");

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Lkh;")
    public static class117 field1551 = class224.method1450((byte) -29, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1552 = 0;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lkh;")
    private static class117 field1550 = class224.method1450((byte) 126, "Service unavailable)3");

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lkh;")
    public static class117 field1542 = field1550;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lkh;")
    public static class117 field1547 = field1556;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "[I")
    public static int[] field1560 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!he", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class94.field1719 != null) {
            int var2 = class61.method453(arg0, (byte) -112);
            if (var2 >= 0) {
                int var3 = class187.field3349 + 1 & 0x7F;
                if (class159.field2913 != var3) {
                    class38.field879[class187.field3349] = -1;
                    class200.field3622[class187.field3349] = var2;
                    class187.field3349 = var3;
                }
            }
        }
        arg0.consume();
        field1549++;
    }

    @OriginalMember(owner = "client!he", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class94.field1719 != null) {
            class128.field2371 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class60.field1215.length) {
                var3 = class60.field1215[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class240.field4347 >= 0 && var3 >= 0) {
                class12.field398[class240.field4347] = ~var3;
                class240.field4347 = class240.field4347 + 1 & 0x7F;
                if (class93.field1709 == class240.field4347) {
                    class240.field4347 = -1;
                }
            }
        }
        arg0.consume();
        field1546++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method560(byte arg0) {
        if (arg0 != 26) {
            return;
        }
        for (int var1 = -1; var1 < class229.field4121; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class139.field2539[var1];
            }
            class56 var6 = class43.field950[var5];
            if (var6 != null && var6.field4217 > 0) {
                var6.field4217--;
                if (var6.field4217 == 0) {
                    var6.field4263 = null;
                }
            }
        }
        field1555++;
        for (int var2 = 0; var2 < class61.field1229; var2++) {
            int var3 = class21.field565[var2];
            class207 var4 = class1.field18[var3];
            if (var4 != null && var4.field4217 > 0) {
                var4.field4217--;
                if (var4.field4217 == 0) {
                    var4.field4263 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1541++;
        if (class94.field1719 == null) {
            return;
        }
        class128.field2371 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class60.field1215.length) {
            var3 = class60.field1215[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class240.field4347 >= 0 && var3 >= 0) {
            class12.field398[class240.field4347] = var3;
            class240.field4347 = class240.field4347 + 1 & 0x7F;
            if (class93.field1709 == class240.field4347) {
                class240.field4347 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class187.field3349 + 1 & 0x7F;
            if (class159.field2913 != var4) {
                class38.field879[class187.field3349] = var3;
                class200.field3622[class187.field3349] = -1;
                class187.field3349 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lai;Lai;I)V")
    public static final void method561(class10 arg0, class10 arg1, int arg2) {
        class18.field529 = arg1;
        class230.field4139 = arg0;
        field1558++;
        if (arg2 != 37) {
            method561(null, null, 37);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1557++;
        if (arg7 != 127) {
            method561(null, null, -39);
        }
        int var8 = class119.method843(class159.field2910, -128, arg0, class224.field4040);
        int var9 = class119.method843(class159.field2910, -126, arg3, class224.field4040);
        int var10 = class119.method843(class240.field4355, -113, arg1, class146.field2678);
        int var11 = class119.method843(class240.field4355, -110, arg5, class146.field2678);
        int var12 = class119.method843(class159.field2910, -123, arg0 + arg4, class224.field4040);
        int var13 = class119.method843(class159.field2910, -115, arg3 - arg4, class224.field4040);
        for (int var14 = var8; var14 < var12; var14++) {
            class114.method762(var10, arg7 - 7, var11, arg6, class167.field3030[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class114.method762(var10, 106, var11, arg6, class167.field3030[var15]);
        }
        int var16 = class119.method843(class240.field4355, arg7 ^ 0xFFFFFFF2, arg1 + arg4, class146.field2678);
        int var17 = class119.method843(class240.field4355, -110, arg5 - arg4, class146.field2678);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class167.field3030[var18];
            class114.method762(var10, 121, var16, arg6, var19);
            class114.method762(var16, 68, var17, arg2, var19);
            class114.method762(var17, arg7 - 31, var11, arg6, var19);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lch;")
    public static final class31 method563(byte arg0) {
        field1545++;
        int var1 = class204.field3690[0] * class11.field376[0];
        int[] var2 = new int[var1];
        byte[] var3 = class105.field1921[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class122.field2287[class209.method1370(var3[var4], 255)];
        }
        class144 var5 = new class144(class106.field1934, class199.field3582, class100.field1827[0], class106.field1927[0], class204.field3690[0], class11.field376[0], var2);
        class45.method376(5851);
        return arg0 > -89 ? null : var5;
    }

    @OriginalMember(owner = "client!he", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class94.field1719 != null) {
            class240.field4347 = -1;
        }
        field1559++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method564(int arg0) {
        field1542 = null;
        field1547 = null;
        field1544 = null;
        field1551 = null;
        field1540 = null;
        field1556 = null;
        field1550 = null;
        field1560 = null;
        field1548 = null;
        if (arg0 >= -12) {
            method561(null, null, -105);
        }
    }

    @OriginalMember(owner = "client!he", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1553++;
    }
}
