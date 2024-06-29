import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class135 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2913 = 0;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lgg;")
    public static class63 field2917 = class116.method911(43, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!p", name = "k", descriptor = "[I")
    public static int[] field2923 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!p", name = "o", descriptor = "[Z")
    public static boolean[] field2927 = new boolean[100];

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lgg;")
    private static class63 field2920 = class116.method911(43, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lgg;")
    public static class63 field2922 = field2920;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Lgg;")
    private static class63 field2931 = class116.method911(43, "Could not complete login)3");

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lgg;")
    public static class63 field2925 = field2931;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ljc;")
    public static class85 field2924;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static final void method982(boolean arg0) {
        field2914++;
        int var1 = 0;
        if (!arg0) {
            return;
        }
        while (var1 < class89.field2092) {
            int var2 = class3.field84[var1];
            class6 var3 = class55.field1458[var2];
            int var4 = class167.field3437.method64(31790);
            if ((var4 & 0x8) != 0) {
                var3.field1132 = class167.field3437.method31((byte) -127);
                if (var3.field1132 == 65535) {
                    var3.field1132 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class167.field3437.method69((byte) 52);
                int var6 = class167.field3437.method64(31790);
                var3.method469(var6, (byte) -39, var5, class173.field3571);
                var3.field1156 = class173.field3571 + 300;
                var3.field1137 = class167.field3437.method69((byte) 52);
            }
            if ((var4 & 0x1) != 0) {
                int var7 = class167.field3437.method64(31790);
                int var8 = class167.field3437.method34(-857795632);
                var3.method469(var8, (byte) -39, var7, class173.field3571);
            }
            if ((var4 & 0x4) != 0) {
                var3.field1165 = class167.field3437.method40(2);
                var3.field1120 = class167.field3437.method46((byte) 65);
            }
            if ((var4 & 0x40) != 0) {
                int var9 = class167.field3437.method36((byte) -83);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class167.field3437.method64(31790);
                if (var3.field1167 == var9 && var9 != -1) {
                    int var11 = class49.method480(1000, var9).field220;
                    if (var11 == 1) {
                        var3.field1152 = var10;
                        var3.field1121 = 0;
                        var3.field1112 = 0;
                        var3.field1097 = 0;
                    }
                    if (var11 == 2) {
                        var3.field1112 = 0;
                    }
                } else if (var9 == -1 || var3.field1167 == -1 || class49.method480(1000, var9).field202 >= class49.method480(1000, var3.field1167).field202) {
                    var3.field1152 = var10;
                    var3.field1155 = var3.field1154;
                    var3.field1112 = 0;
                    var3.field1121 = 0;
                    var3.field1167 = var9;
                    var3.field1097 = 0;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1135 = class167.field3437.method36((byte) -53);
                int var12 = class167.field3437.method50((byte) 103);
                var3.field1150 = class173.field3571 + (var12 & 0xFFFF);
                var3.field1114 = 0;
                if (class173.field3571 < var3.field1150) {
                    var3.field1114 = -1;
                }
                var3.field1116 = var12 >> 16;
                if (var3.field1135 == 65535) {
                    var3.field1135 = -1;
                }
                var3.field1128 = 0;
            }
            if ((var4 & 0x80) != 0) {
                var3.field1151 = class167.field3437.method28(-1);
                var3.field1147 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field150 = class140.method1007(-201, class167.field3437.method46((byte) 65));
                var3.field1136 = var3.field150.field617;
                var3.field1124 = var3.field150.field621;
                var3.field1157 = var3.field150.field665;
                var3.field1160 = var3.field150.field633;
                var3.field1123 = var3.field150.field647;
                var3.field1113 = var3.field150.field636;
                var3.field1115 = var3.field150.field642;
                var3.field1149 = var3.field150.field662;
                var3.field1110 = var3.field150.field618;
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!p", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class45.field1066 != null) {
            class108.field2441 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class8.field176.length) {
                var3 = class8.field176[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class85.field2020 >= 0 && var3 >= 0) {
                class198.field3955[class85.field2020] = ~var3;
                class85.field2020 = class85.field2020 + 1 & 0x7F;
                if (class85.field2020 == class116.field2587) {
                    class85.field2020 = -1;
                }
            }
        }
        field2921++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!p", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class45.field1066 != null) {
            class108.field2441 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class8.field176.length > var2) {
                var3 = class8.field176[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class85.field2020 >= 0 && var3 >= 0) {
                class198.field3955[class85.field2020] = var3;
                class85.field2020 = class85.field2020 + 1 & 0x7F;
                if (class85.field2020 == class116.field2587) {
                    class85.field2020 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class103.field2382 + 1 & 0x7F;
                if (class47.field1106 != var4) {
                    class26.field600[class103.field2382] = var3;
                    class113.field2534[class103.field2382] = -1;
                    class103.field2382 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2928++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjc;B)Lkd;")
    public static final class94 method983(int arg0, class85 arg1, byte arg2) {
        field2918++;
        byte[] var3 = arg1.method758((byte) -106, arg0);
        if (var3 == null) {
            return null;
        } else if (arg2 <= 13) {
            return null;
        } else {
            return new class94(var3);
        }
    }

    @OriginalMember(owner = "client!p", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field2926++;
        if (class45.field1066 != null) {
            int var2 = class114.method903(arg0, 0);
            if (var2 >= 0) {
                int var3 = class103.field2382 + 1 & 0x7F;
                if (class47.field1106 != var3) {
                    class26.field600[class103.field2382] = -1;
                    class113.field2534[class103.field2382] = var2;
                    class103.field2382 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I")
    public static final int method984(byte arg0) {
        field2930++;
        return arg0 == -101 ? 6 : -106;
    }

    @OriginalMember(owner = "client!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class45.field1066 != null) {
            class85.field2020 = -1;
        }
        field2916++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method985(int arg0) {
        field2925 = null;
        field2920 = null;
        if (arg0 > -4) {
            field2917 = null;
        }
        field2917 = null;
        field2924 = null;
        field2931 = null;
        field2927 = null;
        field2922 = null;
        field2923 = null;
    }

    @OriginalMember(owner = "client!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2929++;
    }
}
