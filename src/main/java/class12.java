import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class12 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Lbe;")
    public static class283 field103 = class153.method941(126, "overlay2");

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lbe;")
    public static class283 field110 = class153.method941(-33, "null");

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lbe;")
    private static class283 field104 = class153.method941(-1, "purple:");

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lbe;")
    public static class283 field109 = field104;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Lbe;")
    public static class283 field117 = field104;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "[Llf;")
    public static class116[] field120 = new class116[500];

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "[Lbe;")
    public static class283[] field121 = new class283[8];

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Lnh;")
    public static class107 field107;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lek;")
    public static class172 field111;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 9)
    public static final void method61(byte arg0) {
        field116++;
        if (arg0 != 36) {
            field102 = 84;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class201.field3434[var1] = true;
        }
    }

    @OriginalMember(owner = "client!nk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 28)
    public final void focusGained(FocusEvent arg0) {
        field115++;
    }

    @OriginalMember(owner = "client!nk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 58)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field119++;
        if (class278.field4645 == null) {
            return;
        }
        class92.field1547 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class149.field2439.length) {
            var3 = class149.field2439[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class232.field3937 >= 0 && var3 >= 0) {
            class94.field1582[class232.field3937] = var3;
            class232.field3937 = class232.field3937 + 1 & 0x7F;
            if (class232.field3937 == class166.field2774) {
                class232.field3937 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class128.field2129 + 1 & 0x7F;
            if (class7.field75 != var4) {
                class122.field2042[class128.field2129] = var3;
                class163.field2675[class128.field2129] = -1;
                class128.field2129 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 120)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field106++;
        if (class278.field4645 != null) {
            class92.field1547 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class149.field2439.length) {
                var3 = class149.field2439[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class232.field3937 >= 0 && var3 >= 0) {
                class94.field1582[class232.field3937] = ~var3;
                class232.field3937 = class232.field3937 + 1 & 0x7F;
                if (class232.field3937 == class166.field2774) {
                    class232.field3937 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 151)
    public static void method62(int arg0) {
        field111 = null;
        field110 = null;
        field117 = null;
        field121 = null;
        if (arg0 != 10) {
            method62(4);
        }
        field120 = null;
        field109 = null;
        field103 = null;
        field104 = null;
        field107 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BILkg;)I", line = 173)
    public static final int method63(byte arg0, int arg1, class69 arg2) {
        field105++;
        if (arg2.field1062 == null || arg2.field1062.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg2.field1062[arg1];
            int var4 = 0;
            int var5 = 0;
            int var6 = 122 % ((arg0 - 43) / 38);
            byte var7 = 0;
            while (true) {
                int var8 = 0;
                int var9 = var3[var5++];
                byte var10 = 0;
                if (var9 == 0) {
                    return var4;
                }
                if (var9 == 15) {
                    var10 = 1;
                }
                if (var9 == 16) {
                    var10 = 2;
                }
                if (var9 == 1) {
                    var8 = class269.field4548[var3[var5++]];
                }
                if (var9 == 2) {
                    var8 = class7.field70[var3[var5++]];
                }
                if (var9 == 17) {
                    var10 = 3;
                }
                if (var9 == 3) {
                    var8 = class34.field513[var3[var5++]];
                }
                if (var9 == 4) {
                    int var11 = var3[var5++] << 16;
                    int var12 = var11 + var3[var5++];
                    class69 var13 = class65.method418(-8429, var12);
                    int var14 = var3[var5++];
                    if (var14 != -1 && (!class103.method676(var14, -1).field5125 || class110.field1860)) {
                        for (int var15 = 0; var15 < var13.field1073.length; var15++) {
                            if ((var14 + 1) == var13.field1073[var15]) {
                                var8 += var13.field973[var15];
                            }
                        }
                    }
                }
                if (var9 == 5) {
                    var8 = class6.field63[var3[var5++]];
                }
                if (var9 == 6) {
                    var8 = class298.field5048[class7.field70[var3[var5++]] - 1];
                }
                if (var9 == 7) {
                    var8 = class6.field63[var3[var5++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var8 = class213.field3624.field3259;
                }
                if (var9 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class112.field1889[var16]) {
                            var8 += class7.field70[var16];
                        }
                    }
                }
                if (var9 == 10) {
                    int var17 = var3[var5++] << 16;
                    int var18 = var17 + var3[var5++];
                    class69 var19 = class65.method418(-8429, var18);
                    int var20 = var3[var5++];
                    if (var20 != -1 && (!class103.method676(var20, -1).field5125 || class110.field1860)) {
                        for (int var21 = 0; var21 < var19.field1073.length; var21++) {
                            if (var20 + 1 == var19.field1073[var21]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var8 = class104.field1801;
                }
                if (var9 == 12) {
                    var8 = class269.field4552;
                }
                if (var9 == 13) {
                    int var22 = class6.field63[var3[var5++]];
                    int var23 = var3[var5++];
                    var8 = (var22 & 0x1 << var23) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var24 = var3[var5++];
                    var8 = class184.method1216((byte) -55, var24);
                }
                if (var9 == 18) {
                    var8 = (class213.field3624.field1193 >> 7) + class214.field3637;
                }
                if (var9 == 19) {
                    var8 = (class213.field3624.field1210 >> 7) + class107.field1833;
                }
                if (var9 == 20) {
                    var8 = var3[var5++];
                }
                if (var10 == 0) {
                    if (var7 == 0) {
                        var4 += var8;
                    }
                    if (var7 == 1) {
                        var4 -= var8;
                    }
                    if (var7 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var7 == 3) {
                        var4 *= var8;
                    }
                    var7 = 0;
                } else {
                    var7 = var10;
                }
            }
        } catch (Exception var26) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZJ)V", line = 411)
    public static final void method64(boolean arg0, long arg1) {
        field101++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0) {
            method61((byte) -124);
        }
        for (int var3 = 0; var3 < class195.field3330; var3++) {
            if (class110.field1854[var3] == arg1) {
                class195.field3330--;
                class119.field2004++;
                for (int var4 = var3; var4 < class195.field3330; var4++) {
                    class110.field1854[var4] = class110.field1854[var4 + 1];
                    class127.field2102[var4] = class127.field2102[var4 + 1];
                }
                class141.field2359 = class252.field4284;
                class228.field3831.method621(45, 8);
                class228.field3831.method1544((byte) 8, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 465)
    public final void keyTyped(KeyEvent arg0) {
        if (class278.field4645 != null) {
            int var2 = class207.method1378(arg0, -103);
            if (var2 >= 0) {
                int var3 = class128.field2129 + 1 & 0x7F;
                if (class7.field75 != var3) {
                    class122.field2042[class128.field2129] = -1;
                    class163.field2675[class128.field2129] = var2;
                    class128.field2129 = var3;
                }
            }
        }
        field118++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!nk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 509)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class278.field4645 != null) {
            class232.field3937 = -1;
        }
        field113++;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)[Lnh;", line = 531)
    public static final class107[] method65(byte arg0) {
        field108++;
        class107[] var1 = new class107[class160.field2613];
        for (int var2 = 0; var2 < class160.field2613; var2++) {
            int var3 = class202.field3451[var2] * class201.field3440[var2];
            byte[] var4 = class256.field4329[var2];
            if (class126.field2080[var2]) {
                byte[] var7 = class69.field1146[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class53.method337(class296.field5018[class178.method1174(255, var4[var9])], class178.method1174(-16777216, var7[var9] << 24));
                }
                var1[var2] = new class80(class197.field3372, class193.field3301, class247.field4226[var2], class232.field3933[var2], class202.field3451[var2], class201.field3440[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class296.field5018[class178.method1174(var4[var6], 255)];
                }
                var1[var2] = new class266(class197.field3372, class193.field3301, class247.field4226[var2], class232.field3933[var2], class202.field3451[var2], class201.field3440[var2], var5);
            }
        }
        class88.method571(-4);
        if (arg0 == 27) {
            return var1;
        } else {
            return (class107[]) null;
        }
    }
}
