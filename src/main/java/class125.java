import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class125 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Loc;")
    private static class99 field2993 = class48.method402((byte) -104, "Loading ignore list");

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Loc;")
    public static class99 field2992 = field2993;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Loc;")
    private static class99 field2999 = class48.method402((byte) -104, "Loaded config");

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Loc;")
    public static class99 field2996 = field2999;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lr;")
    public static class118 field2991 = new class118(64);

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "[Z")
    public static boolean[] field3011 = new boolean[5];

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Loc;")
    public static class99 field3009 = class48.method402((byte) -104, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Lma;")
    public static class83 field3010 = new class83();

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Loc;")
    public static class99 field3012 = class48.method402((byte) -104, "Benutzername: ");

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lra;")
    public static class115 field2998;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[Ljc;")
    public static class64[] field3003;

    @OriginalMember(owner = "client!sd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class39.field978 != null) {
            class104.field2533 = -1;
        }
        field3002++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method1022(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class148 var10 = null;
        field2990++;
        for (class148 var11 = (class148) class105.field2546.method722(121); var11 != null; var11 = (class148) class105.field2546.method716(true)) {
            if (var11.field3676 == arg3 && var11.field3655 == arg6 && var11.field3668 == arg8 && var11.field3677 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class148();
            var10.field3655 = arg6;
            var10.field3668 = arg8;
            var10.field3677 = arg4;
            var10.field3676 = arg3;
            class12.method127(var10, -4);
            class105.field2546.method720(var10, 0);
        }
        var10.field3660 = arg7;
        var10.field3662 = arg9;
        var10.field3651 = arg2;
        if (arg1 <= 110) {
            method1026(40);
        }
        var10.field3682 = arg0;
        var10.field3673 = arg5;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static final void method1023(byte arg0) {
        field2995++;
        int var1 = class7.field197 * 128 + 64;
        int var2 = class35.field884 * 128 + 64;
        int var3 = class137.method1144(true, var1, var2, class84.field2116) - class113.field2815;
        if (arg0 != -124) {
            method1025((byte) 91);
        }
        if (class94.field2290 < var2) {
            class94.field2290 += (var2 - class94.field2290) * class15.field364 / 1000 + class105.field2543;
            if (class94.field2290 > var2) {
                class94.field2290 = var2;
            }
        }
        if (var1 > class145.field3611) {
            class145.field3611 += class105.field2543 + (var1 - class145.field3611) * class15.field364 / 1000;
            if (var1 < class145.field3611) {
                class145.field3611 = var1;
            }
        }
        if (var3 > class12.field266) {
            class12.field266 += (var3 - class12.field266) * class15.field364 / 1000 + class105.field2543;
            if (var3 < class12.field266) {
                class12.field266 = var3;
            }
        }
        if (class145.field3611 > var1) {
            class145.field3611 -= (class145.field3611 - var1) * class15.field364 / 1000 + class105.field2543;
            if (class145.field3611 < var1) {
                class145.field3611 = var1;
            }
        }
        int var4 = class16.field380 * 128 + 64;
        if (var2 < class94.field2290) {
            class94.field2290 -= (class94.field2290 - var2) * class15.field364 / 1000 + class105.field2543;
            if (class94.field2290 < var2) {
                class94.field2290 = var2;
            }
        }
        int var5 = class141.field3498 * 128 + 64;
        if (var3 < class12.field266) {
            class12.field266 -= class105.field2543 + (class12.field266 - var3) * class15.field364 / 1000;
            if (var3 > class12.field266) {
                class12.field266 = var3;
            }
        }
        int var6 = class137.method1144(true, var4, var5, class84.field2116) - class72.field1823;
        int var7 = var6 - class12.field266;
        int var8 = var4 - class145.field3611;
        int var9 = var5 - class94.field2290;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class94.field2288;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (class32.field754 < var11) {
            class32.field754 += (var11 - class32.field754) * class30.field721 / 1000 + class68.field1752;
            if (var11 < class32.field754) {
                class32.field754 = var11;
            }
        }
        if (var13 > 0) {
            class94.field2288 += class68.field1752 + class30.field721 * var13 / 1000;
            class94.field2288 &= 0x7FF;
        }
        if (class32.field754 > var11) {
            class32.field754 -= class68.field1752 + (class32.field754 - var11) * class30.field721 / 1000;
            if (class32.field754 < var11) {
                class32.field754 = var11;
            }
        }
        if (var13 < 0) {
            class94.field2288 -= class68.field1752 + -var13 * class30.field721 / 1000;
            class94.field2288 &= 0x7FF;
        }
        int var14 = var12 - class94.field2288;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class94.field2288 = var12;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public static final void method1024(byte arg0) {
        class23.field539 = null;
        field3008++;
        class149.field3692 = null;
        class112.field2807 = null;
        class9.field227 = null;
        class4.field74 = null;
        class133.field3259 = null;
        class11.field264 = null;
        class2.field39 = null;
        class20.field486 = null;
        if (arg0 == 125) {
            class16.field385 = null;
            class86.field2160 = null;
            class2.field31 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
    public static void method1025(byte arg0) {
        field3011 = null;
        field2999 = null;
        field2996 = null;
        field2991 = null;
        field2992 = null;
        field3012 = null;
        field2993 = null;
        if (arg0 != 61) {
            method1024((byte) -56);
        }
        field3010 = null;
        field3009 = null;
        field3003 = null;
        field2998 = null;
    }

    @OriginalMember(owner = "client!sd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3001++;
    }

    @OriginalMember(owner = "client!sd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3005++;
        if (class39.field978 != null) {
            class52.field1239 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class101.field2471.length) {
                var3 = class101.field2471[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class104.field2533 >= 0 && var3 >= 0) {
                client.field523[class104.field2533] = ~var3;
                class104.field2533 = class104.field2533 + 1 & 0x7F;
                if (class36.field909 == class104.field2533) {
                    class104.field2533 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!sd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3007++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method1026(int arg0) {
        if (arg0 != 1000) {
            field3012 = null;
        }
        field3004++;
        class112.field2803.method998(true);
    }

    @OriginalMember(owner = "client!sd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class39.field978 != null) {
            class52.field1239 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class101.field2471.length > var2) {
                var3 = class101.field2471[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class122.method1019(arg0, 124);
            }
            if (class104.field2533 >= 0 && var3 >= 0) {
                client.field523[class104.field2533] = var3;
                class104.field2533 = class104.field2533 + 1 & 0x7F;
                if (class36.field909 == class104.field2533) {
                    class104.field2533 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class55.field1407 + 1 & 0x7F;
                if (class14.field351 != var5) {
                    class108.field2639[class55.field1407] = var3;
                    class122.field2985[class55.field1407] = var4;
                    class55.field1407 = var5;
                }
            }
        }
        field3006++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static final void method1027(int arg0) {
        if (arg0 != 128) {
            method1024((byte) 35);
        }
        for (int var1 = 0; var1 < class141.field3493; var1++) {
            int var2 = class126.field3041[var1];
            class149 var3 = class149.field3691[var2];
            int var4 = class39.field965.method510(-125);
            if ((var4 & 0x20) != 0) {
                int var5 = class39.field965.method479(arg0 ^ 0xFA);
                int var6 = class39.field965.method510(-110);
                var3.method1036((byte) 105, class101.field2444, var5, var6);
                var3.field3085 = class101.field2444 + 300;
                var3.field3080 = class39.field965.method510(-110);
                var3.field3094 = class39.field965.method510(arg0 - 247);
            }
            if ((var4 & 0x1) != 0) {
                var3.field3088 = class39.field965.method504((byte) 31);
                int var7 = class39.field965.method495(16711680);
                var3.field3106 = var7 >> 16;
                var3.field3062 = 0;
                if (var3.field3088 == 65535) {
                    var3.field3088 = -1;
                }
                var3.field3083 = (var7 & 0xFFFF) + class101.field2444;
                var3.field3091 = 0;
                if (class101.field2444 < var3.field3083) {
                    var3.field3062 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var8 = class39.field965.method506(-1);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class39.field965.method510(-122);
                if (var3.field3132 == var8 && var8 != -1) {
                    int var10 = class142.method1163(-123, var8).field2015;
                    if (var10 == 1) {
                        var3.field3081 = 0;
                        var3.field3128 = var9;
                        var3.field3104 = 0;
                        var3.field3060 = 0;
                    }
                    if (var10 == 2) {
                        var3.field3060 = 0;
                    }
                } else if (var8 == -1 || var3.field3132 == -1 || class142.method1163(-108, var8).field2020 >= class142.method1163(arg0 ^ 0xFFFFFF11, var3.field3132).field2020) {
                    var3.field3060 = 0;
                    var3.field3104 = 0;
                    var3.field3113 = var3.field3070;
                    var3.field3081 = 0;
                    var3.field3132 = var8;
                    var3.field3128 = var9;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field3129 = class39.field965.method504((byte) 106);
                if (var3.field3129 == 65535) {
                    var3.field3129 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var11 = class39.field965.method479(110);
                int var12 = class39.field965.method510(arg0 ^ 0xFFFFFF00);
                var3.method1036((byte) 105, class101.field2444, var11, var12);
                var3.field3085 = class101.field2444 + 300;
                var3.field3080 = class39.field965.method475(2);
                var3.field3094 = class39.field965.method475(2);
            }
            if ((var4 & 0x8) != 0) {
                var3.field3131 = class39.field965.method506(-1);
                var3.field3071 = class39.field965.method504((byte) 98);
            }
            if ((var4 & 0x4) != 0) {
                var3.field3121 = class39.field965.method518(261);
                var3.field3105 = 100;
            }
            if ((var4 & 0x40) != 0) {
                var3.field3689 = class149.method1206(class39.field965.method506(arg0 - 129), (byte) 46);
                var3.field3114 = var3.field3689.field1093;
                var3.field3126 = var3.field3689.field1114;
                var3.field3109 = var3.field3689.field1106;
                var3.field3090 = var3.field3689.field1103;
                var3.field3082 = var3.field3689.field1120;
                var3.field3078 = var3.field3689.field1124;
                var3.field3119 = var3.field3689.field1095;
                var3.field3099 = var3.field3689.field1110;
                var3.field3084 = var3.field3689.field1115;
            }
        }
        field2997++;
    }
}
