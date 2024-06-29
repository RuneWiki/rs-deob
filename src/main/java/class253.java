import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class253 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4153 = " is already on your ignore list.";

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4145 = new String[5];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lwb;")
    public static class28 field4148;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Z")
    public static boolean field4144;

    @OriginalMember(owner = "client!ra", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field4151++;
        if (class171.field2801 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class170.method1208(var2, -129)) {
                int var3 = class252.field4139 + 1 & 0x7F;
                if (class281.field4573 != var3) {
                    class166.field2737[class252.field4139] = -1;
                    class62.field957[class252.field4139] = var2;
                    class252.field4139 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field4157++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = arg7 - arg0;
        int var11 = arg2 - arg0;
        int var12 = 0;
        int var13 = arg7 * arg7;
        int var14 = arg2 * arg2;
        if (arg6 > -84) {
            method1714(-107, -11, 83, (class12) null, -29);
        }
        int var15 = var10 * var10;
        int var16 = var11 * var11;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var11 << 1;
        int var23 = var14 - ((var21 - 1) * var18);
        int var24 = (1 - var22) * var15 + var19;
        int var25 = (1 - var21) * var13 + var17;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var17 * 3;
        int var31 = var16 << 2;
        int var32 = (var21 - 3) * var18;
        int var33 = (var22 - 3) * var20;
        int var34 = var19 * 3;
        int var35 = var28;
        int var36 = var31;
        int var37 = (arg2 - 1) * var27;
        int var38 = (var11 - 1) * var29;
        int[] var39 = class232.field3629[arg4];
        class309.method2096(arg1, arg5 - var10, (byte) -117, var39, arg5 - arg7);
        class309.method2096(arg3, arg5 + var10, (byte) -117, var39, arg5 - var10);
        class309.method2096(arg1, arg5 + arg7, (byte) -117, var39, arg5 + var10);
        while (var9 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var8++;
                    var25 += var30;
                    var30 += var28;
                    var23 += var35;
                    var35 += var28;
                }
            }
            if (var23 < 0) {
                var23 += var35;
                var25 += var30;
                var30 += var28;
                var35 += var28;
                var8++;
            }
            var25 += -var37;
            var23 += -var32;
            var37 -= var27;
            var32 -= var27;
            boolean var40 = var11 >= var9;
            var9--;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var12++;
                        var24 += var34;
                        var34 += var31;
                        var26 += var36;
                        var36 += var31;
                    }
                }
                if (var26 < 0) {
                    var12++;
                    var24 += var34;
                    var34 += var31;
                    var26 += var36;
                    var36 += var31;
                }
                var26 += -var33;
                var24 += -var38;
                var33 -= var29;
                var38 -= var29;
            }
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg5 + var8;
            int var44 = arg5 - var8;
            if (var40) {
                int var45 = arg5 + var12;
                int var46 = arg5 - var12;
                class309.method2096(arg1, var46, (byte) -117, class232.field3629[var41], var44);
                class309.method2096(arg3, var45, (byte) -117, class232.field3629[var41], var46);
                class309.method2096(arg1, var43, (byte) -117, class232.field3629[var41], var45);
                class309.method2096(arg1, var46, (byte) -117, class232.field3629[var42], var44);
                class309.method2096(arg3, var45, (byte) -117, class232.field3629[var42], var46);
                class309.method2096(arg1, var43, (byte) -117, class232.field3629[var42], var45);
            } else {
                class309.method2096(arg1, var43, (byte) -117, class232.field3629[var41], var44);
                class309.method2096(arg1, var43, (byte) -117, class232.field3629[var42], var44);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field4152++;
        if (class171.field2801 == null) {
            return;
        }
        class62.field946 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class43.field643.length > var2) {
            var3 = class43.field643[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class242.field3842 >= 0 && var3 >= 0) {
            class275.field4498[class242.field3842] = var3;
            class242.field3842 = class242.field3842 + 1 & 0x7F;
            if (class81.field1309 == class242.field3842) {
                class242.field3842 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class252.field4139 + 1 & 0x7F;
            if (class281.field4573 != var4) {
                class166.field2737[class252.field4139] = var3;
                class62.field957[class252.field4139] = '\u0000';
                class252.field4139 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ra", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4146++;
        if (class171.field2801 != null) {
            class62.field946 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class43.field643.length) {
                var3 = class43.field643[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class242.field3842 >= 0 && var3 >= 0) {
                class275.field4498[class242.field3842] = ~var3;
                class242.field3842 = class242.field3842 + 1 & 0x7F;
                if (class81.field1309 == class242.field3842) {
                    class242.field3842 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    public static final void method1713(int arg0, int arg1) {
        field4154++;
        class12.field230 = false;
        class76.field1226 = arg0;
        class249.field4093 = -1;
        class122.field1928 = -1;
        class298.field4859 = null;
        class88.field1378 = 1;
        if (arg1 == 0) {
            class161.field2631 = 0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4155++;
        if (class171.field2801 != null) {
            class242.field3842 = -1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILhd;I)V")
    public static final void method1714(int arg0, int arg1, int arg2, class12 arg3, int arg4) {
        field4150++;
        if (class217.field3408 == arg3 || class291.field4776 >= 400) {
            return;
        }
        String var5;
        if (arg3.field244 == 0) {
            boolean var6 = true;
            if (class217.field3408.field226 != -1 && arg3.field226 != -1) {
                int var7 = class217.field3408.field224 <= arg3.field224 ? arg3.field224 : class217.field3408.field224;
                int var8 = class217.field3408.field224 - arg3.field224;
                int var9 = arg3.field226 <= class217.field3408.field226 ? arg3.field226 : class217.field3408.field226;
                int var10 = var9 + (var7 * 10 / 100) + 5;
                if (var8 < 0) {
                    var8 = -var8;
                }
                if (var10 < var8) {
                    var6 = false;
                }
            }
            String var11 = class106.field1656 == 1 ? class14.field293 : class299.field4911;
            if (arg3.field249 <= arg3.field224) {
                var5 = arg3.method105(-773) + (var6 ? class298.method2046(376, arg3.field224, class217.field3408.field224) : "<col=ffffff>") + " (" + var11 + arg3.field224 + ")";
            } else {
                var5 = arg3.method105(-773) + (var6 ? class298.method2046(376, arg3.field224, class217.field3408.field224) : "<col=ffffff>") + " (" + var11 + arg3.field224 + "+" + (arg3.field249 - arg3.field224) + ")";
            }
        } else {
            var5 = arg3.method105(-773) + " (" + class275.field4511 + arg3.field244 + ")";
        }
        if (class45.field669 == 1) {
            class208.field3316++;
            class205.method1420(class33.field537, (long) arg1, 124, arg4, arg0, class90.field1409, class259.field4248 + " -> <col=ffffff>" + var5, (short) 16);
        } else if (!class101.field1579) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class90.field1408[var12] != null) {
                    class304.field4948++;
                    short var13 = 0;
                    boolean var14 = false;
                    if (class106.field1656 == 0 && class90.field1408[var12].equalsIgnoreCase(class200.field3206)) {
                        if (arg3.field224 > class217.field3408.field224) {
                            var13 = 2000;
                        }
                        if (class217.field3408.field238 != 0 && arg3.field238 != 0) {
                            if (class217.field3408.field238 == arg3.field238) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class238.field3736[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class51.field743[var12];
                    short var16 = (short) (var13 + var15);
                    class205.method1420(class90.field1408[var12], (long) arg1, 120, arg4, arg0, class205.field3296[var12], "<col=ffffff>" + var5, var16);
                }
            }
        } else if ((class44.field652 & 0x8) != 0) {
            class240.field3759++;
            class205.method1420(class205.field3297, (long) arg1, 113, arg4, arg0, class189.field3096, class211.field3367 + " -> <col=ffffff>" + var5, (short) 22);
        }
        for (int var17 = 0; var17 < class291.field4776; var17++) {
            if (class26.field478[var17] == 25) {
                class226.field3550[var17] = "<col=ffffff>" + var5;
                break;
            }
        }
        if (arg2 != 5) {
            field4153 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)I")
    public static final int method1715(byte arg0) {
        int var1 = -94 % ((arg0 - 24) / 46);
        field4149++;
        return class62.field946;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V")
    public static final void method1716(boolean arg0, int arg1) {
        field4156++;
        if (arg1 == -1 || !class232.field3630[arg1]) {
            return;
        }
        class127.field2026.method1164(arg1, (byte) 54);
        if (class208.field3315[arg1] == null) {
            return;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < class208.field3315[arg1].length; var3++) {
            if (class208.field3315[arg1][var3] != null) {
                if (class208.field3315[arg1][var3].field4038 == 2) {
                    var2 = false;
                } else {
                    class208.field3315[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class208.field3315[arg1] = null;
        }
        class232.field3630[arg1] = false;
    }

    @OriginalMember(owner = "client!ra", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4158++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method1717(int arg0) {
        field4148 = null;
        field4145 = null;
        if (arg0 == 128) {
            field4153 = null;
        }
    }
}
