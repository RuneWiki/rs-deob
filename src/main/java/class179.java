import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class179 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Z")
    public static boolean field2741 = false;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field2743 = 0;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static volatile int field2740 = 0;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Lbk;")
    public static class180 field2736;

    @OriginalMember(owner = "client!sm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 5)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2744++;
        if (class158.field2464 == null) {
            return;
        }
        class206.field3112 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class96.field1481.length > var2) {
            var3 = class96.field1481[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class18.field254 >= 0 && var3 >= 0) {
            class181.field2777[class18.field254] = var3;
            class18.field254 = class18.field254 + 1 & 0x7F;
            if (class18.field254 == class159.field2475) {
                class18.field254 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class59.field831 + 1 & 0x7F;
            if (class33.field417 != var4) {
                class306.field4793[class59.field831] = var3;
                class71.field1062[class59.field831] = '\u0000';
                class59.field831 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 67)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2742++;
        if (class158.field2464 != null) {
            class18.field254 = -1;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 85)
    public static final void method1222(byte arg0) {
        field2749++;
        if (class294.field4529 != null) {
            return;
        }
        if (arg0 < 66) {
            field2743 = 18;
        }
        if (class50.field706 != null) {
            return;
        }
        int var1 = class256.field3994;
        if (!class260.field4036) {
            if (var1 == 1 && class168.field2565 > 0) {
                short var13 = class194.field2925[class168.field2565 - 1];
                if (var13 == 19 || var13 == 20 || var13 == 26 || var13 == 5 || var13 == 2 || var13 == 58 || var13 == 29 || var13 == 8 || var13 == 18 || var13 == 15 || var13 == 12 || var13 == 1005) {
                    int var14 = class76.field1135[class168.field2565 - 1];
                    int var15 = class167.field2560[class168.field2565 - 1];
                    class207 var16 = class78.method547(var14, 122);
                    class108 var17 = client.method888(var16);
                    if (var17.method734(18546) || var17.method725((byte) -96)) {
                        class52.field739 = 0;
                        class315.field4959 = false;
                        if (class294.field4529 != null) {
                            class277.method1822(4096, class294.field4529);
                        }
                        class294.field4529 = class78.method547(var14, 107);
                        class272.field4180 = class85.field1295;
                        class64.field974 = var15;
                        class155.field2427 = class7.field81;
                        class277.method1822(4096, class294.field4529);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class183.field2797 == 1 && class168.field2565 > 2 || class298.method1959(class168.field2565 - 1, 0))) {
                var1 = 2;
            }
            if (var1 == 2 && class168.field2565 > 0 || class310.field4923 == 1) {
                class246.method1665((byte) -21);
            }
            if (var1 == 1 && class168.field2565 > 0 || class310.field4923 == 2) {
                class293.method1912((byte) -76);
            }
            return;
        }
        if (var1 != 1) {
            int var2 = class199.field2985;
            int var3 = class107.field1636;
            if (var2 < class246.field3858 - 10 || field2748 + class246.field3858 + 10 < var2 || (class307.field4832 - 10) > var3 || var3 > class307.field4832 + class116.field1797 + 10) {
                class260.field4036 = false;
                class136.method928(713, class246.field3858, field2748, class116.field1797, class307.field4832);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class246.field3858;
        int var5 = class307.field4832;
        int var6 = field2748;
        int var7 = class7.field81;
        int var8 = -1;
        int var9 = class85.field1295;
        for (int var10 = 0; var10 < class168.field2565; var10++) {
            if (class151.field2373) {
                int var11 = (class168.field2565 - var10 - 1) * 15 + var5 + 33;
                if (var4 < var9 && var9 < (var4 + var6) && var11 - 13 < var7 && var7 < (var11 + 3)) {
                    var8 = var10;
                }
            } else {
                int var12 = (class168.field2565 - var10 - 1) * 15 + var5 + 31;
                if (var9 > var4 && var4 + var6 > var9 && var7 > var12 - 13 && var7 < (var12 + 3)) {
                    var8 = var10;
                }
            }
        }
        if (var8 != -1) {
            class215.method1436((byte) -3, var8);
        }
        class260.field4036 = false;
        class136.method928(713, class246.field3858, field2748, class116.field1797, class307.field4832);
    }

    @OriginalMember(owner = "client!sm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 227)
    public final void focusGained(FocusEvent arg0) {
        field2746++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 234)
    public static final void method1223(int arg0) {
        if (arg0 != 0) {
            method1222((byte) 99);
        }
        while (true) {
            class198 var1;
            class38 var3;
            do {
                var1 = (class198) class269.field4145.method12(arg0 - 51);
                if (var1 == null) {
                    field2738++;
                    return;
                }
                if (var1.field2981 < 0) {
                    int var2 = -var1.field2981 - 1;
                    if (class124.field1944 == var2) {
                        var3 = class79.field1173;
                    } else {
                        var3 = class64.field966[var2];
                    }
                } else {
                    int var4 = var1.field2981 - 1;
                    var3 = class208.field3313[var4];
                }
            } while (var3 == null);
            class17 var5 = class277.method1819((byte) -127, var1.field2978);
            if (class77.field1154 < 3) {
            }
            int var6;
            int var7;
            if (var1.field2982 == 1 || var1.field2982 == 3) {
                var7 = var5.field212;
                var6 = var5.field187;
            } else {
                var6 = var5.field212;
                var7 = var5.field187;
            }
            int var8 = (var7 >> 1) + var1.field2972;
            int var9 = (var6 >> 1) + var1.field2975;
            int[][] var10 = client.field2034[class77.field1154];
            int var11 = var1.field2975 + (var6 + 1 >> 1);
            int var12 = (var7 + 1 >> 1) + var1.field2972;
            int var13 = var10[var9][var12] + var10[var11][var8] + var10[var9][var8] + var10[var11][var12] >> 2;
            class94 var14 = null;
            int var15 = class315.field4958[var1.field2976];
            if (var15 == 0) {
                class157 var16 = class199.method1341(class77.field1154, var1.field2975, var1.field2972);
                if (var16 != null) {
                    var14 = var16.field2454;
                }
            } else if (var15 == 1) {
                class152 var19 = class82.method564(class77.field1154, var1.field2975, var1.field2972);
                if (var19 != null) {
                    var14 = var19.field2405;
                }
            } else if (var15 == 2) {
                class272 var18 = class298.method1964(class77.field1154, var1.field2975, var1.field2972);
                if (var18 != null) {
                    var14 = var18.field4173;
                }
            } else if (var15 == 3) {
                class23 var17 = class146.method1014(class77.field1154, var1.field2975, var1.field2972);
                if (var17 != null) {
                    var14 = var17.field285;
                }
            }
            if (var14 != null) {
                class136.method930(var1.field2975, class77.field1154, 0, (byte) -96, 0, -1, var1.field2968 + 1, var1.field2970 + 1, var1.field2972, var15);
                int var20 = var1.field2973;
                var3.field532 = class343.field5341 + var1.field2968;
                int var21 = var1.field2969;
                if (var20 < var21) {
                    int var22 = var21;
                    var21 = var20;
                    var20 = var22;
                }
                var3.field484 = var1.field2975 * 128 + (var6 * 64);
                var3.field516 = var1.field2972 * 128 + (var7 * 64);
                var3.field514 = class343.field5341 + var1.field2970;
                var3.field511 = var1.field2975 + var20;
                var3.field566 = var1.field2975 + var21;
                var3.field547 = var13;
                int var23 = var1.field2971;
                int var24 = var1.field2977;
                var3.field463 = var14;
                if (var24 > var23) {
                    int var25 = var24;
                    var24 = var23;
                    var23 = var25;
                }
                var3.field552 = var1.field2972 + var23;
                var3.field488 = var1.field2972 + var24;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 399)
    public static void method1224(int arg0) {
        if (arg0 == 5) {
            field2736 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 410)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class158.field2464 != null) {
            class206.field3112 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class96.field1481.length > var2) {
                var3 = class96.field1481[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class18.field254 >= 0 && var3 >= 0) {
                class181.field2777[class18.field254] = ~var3;
                class18.field254 = class18.field254 + 1 & 0x7F;
                if (class18.field254 == class159.field2475) {
                    class18.field254 = -1;
                }
            }
        }
        arg0.consume();
        field2745++;
    }

    @OriginalMember(owner = "client!sm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 449)
    public final void keyTyped(KeyEvent arg0) {
        field2735++;
        if (class158.field2464 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class297.method1951(101, var2)) {
                int var3 = class59.field831 + 1 & 0x7F;
                if (class33.field417 != var3) {
                    class306.field4793[class59.field831] = -1;
                    class71.field1062[class59.field831] = var2;
                    class59.field831 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V", line = 476)
    public static final void method1225(int arg0, int arg1, int arg2) {
        if (class219.field3489 == 2) {
            class305.field4781 = arg0;
            class199.field2989 = arg1;
        }
        class123.field1922 = (float) arg0;
        field2747++;
        class309.field4866 = (float) arg1;
        class338.method2339(59);
        class171.field2602 = true;
        if (arg2 != 18) {
            field2737 = 112;
        }
    }
}
