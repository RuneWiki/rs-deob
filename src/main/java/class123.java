import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class123 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
    public static boolean field2192 = false;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Loc;")
    private static class151 field2204 = class137.method873(2, "Connection timed out)3");

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Loc;")
    public static class151 field2200 = class137.method873(2, "Konfig geladen)3");

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field2201 = 0;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Loc;")
    public static class151 field2193 = field2204;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field2209 = 10;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Loc;")
    public static class151 field2207 = class137.method873(2, "Mem:");

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Loc;")
    public static class151 field2194 = class137.method873(2, "leuchten1:");

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field2212 = 0;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[Lcg;")
    public static class30[] field2195;

    @OriginalMember(owner = "client!le", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class139.field2545 != null) {
            class107.field1895 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class124.field2232.length > var2) {
                var3 = class124.field2232[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class206.field3651 >= 0 && var3 >= 0) {
                class81.field1545[class206.field3651] = var3;
                class206.field3651 = class206.field3651 + 1 & 0x7F;
                if (class206.field3651 == class200.field3536) {
                    class206.field3651 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class138.field2513 + 1 & 0x7F;
                if (class148.field2654 != var4) {
                    class223.field3873[class138.field2513] = var3;
                    class93.field1745[class138.field2513] = -1;
                    class138.field2513 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2208++;
    }

    @OriginalMember(owner = "client!le", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2196++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lsd;IIZLsd;)Lsg;")
    public static final class195 method741(class192 arg0, int arg1, int arg2, boolean arg3, class192 arg4) {
        field2206++;
        boolean var5 = true;
        int[] var6 = arg4.method1190(false, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method1204(-1, var6[var7], arg1);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg0.method1204(arg2 ^ 0xFFFFB401, var9, 0);
                } else {
                    var10 = arg0.method1204(-1, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg2 != 19454) {
            method741(null, 47, 121, true, null);
        }
        if (!var5) {
            return null;
        }
        try {
            return new class195(arg4, arg0, arg1, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method742(int arg0) {
        field2193 = null;
        int var1 = -41 % (arg0 / 50);
        field2204 = null;
        field2195 = null;
        field2207 = null;
        field2200 = null;
        field2194 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lsd;Lsd;I)V")
    public static final void method743(class192 arg0, class192 arg1, int arg2) {
        class57.field1137 = arg0;
        class36.field729 = arg1;
        int var3 = -97 / ((arg2 - 48) / 53);
        class236.field4407 = class36.field729.method1210(true, 3);
        field2205++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2199++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg6 - arg7;
        int var12 = arg3 - arg7;
        int var13 = arg6 * arg6;
        int var14 = arg3 * arg3;
        if (arg1 != 771989793) {
            method745(90, -70, -42, 89L);
        }
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var13 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var19;
        int var25 = (1 - var22) * var15 + var18;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var19;
        int var33 = var18 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = (arg3 - 1) * var27;
        int var36 = var30;
        if (arg4 >= class233.field4281 && class154.field2793 >= arg4) {
            int[] var37 = class43.field887[arg4];
            int var38 = class116.method704(class25.field524, arg0 - arg6, 27104, class79.field1526);
            int var39 = class116.method704(class25.field524, arg0 + arg6, 27104, class79.field1526);
            int var40 = class116.method704(class25.field524, arg0 - var11, 27104, class79.field1526);
            int var41 = class116.method704(class25.field524, arg0 + var11, 27104, class79.field1526);
            class55.method380(arg5, 127, var37, var40, var38);
            class55.method380(arg2, arg1 - 771989679, var37, var41, var40);
            class55.method380(arg5, 119, var37, var39, var41);
        }
        int var42 = var29;
        int var43 = (var12 - 1) * var28;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var42;
                    var23 += var31;
                    var8++;
                    var42 += var29;
                    var31 += var29;
                }
            }
            if (var24 < 0) {
                var8++;
                var23 += var31;
                var31 += var29;
                var24 += var42;
                var42 += var29;
            }
            var23 += -var35;
            var35 -= var27;
            var24 += -var32;
            var32 -= var27;
            boolean var44 = var9 <= var12;
            var9--;
            int var45 = arg4 - var9;
            int var46 = arg4 + var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var25 += var33;
                        var26 += var36;
                        var36 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var36;
                    var25 += var33;
                    var33 += var30;
                    var10++;
                    var36 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var28;
                var34 -= var28;
            }
            if (class233.field4281 <= var46 && class154.field2793 >= var45) {
                int var47 = class116.method704(class25.field524, arg0 + var8, 27104, class79.field1526);
                int var48 = class116.method704(class25.field524, arg0 - var8, 27104, class79.field1526);
                if (var44) {
                    int var49 = class116.method704(class25.field524, arg0 + var10, arg1 ^ 0x2E03C8C1, class79.field1526);
                    int var50 = class116.method704(class25.field524, arg0 - var10, arg1 ^ 0x2E03C8C1, class79.field1526);
                    if (class233.field4281 <= var45) {
                        int[] var51 = class43.field887[var45];
                        class55.method380(arg5, arg1 ^ 0x2E03A14D, var51, var50, var48);
                        class55.method380(arg2, arg1 - 771989673, var51, var49, var50);
                        class55.method380(arg5, 124, var51, var47, var49);
                    }
                    if (var46 <= class154.field2793) {
                        int[] var52 = class43.field887[var46];
                        class55.method380(arg5, 114, var52, var50, var48);
                        class55.method380(arg2, 112, var52, var49, var50);
                        class55.method380(arg5, arg1 - 771989669, var52, var47, var49);
                    }
                } else {
                    if (class233.field4281 <= var45) {
                        class55.method380(arg5, 122, class43.field887[var45], var47, var48);
                    }
                    if (var46 <= class154.field2793) {
                        class55.method380(arg5, arg1 ^ 0x2E03A146, class43.field887[var46], var47, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class139.field2545 != null) {
            int var2 = class67.method443((byte) -121, arg0);
            if (var2 >= 0) {
                int var3 = class138.field2513 + 1 & 0x7F;
                if (class148.field2654 != var3) {
                    class223.field3873[class138.field2513] = -1;
                    class93.field1745[class138.field2513] = var2;
                    class138.field2513 = var3;
                }
            }
        }
        field2202++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!le", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class139.field2545 != null) {
            class206.field3651 = -1;
        }
        field2198++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method745(int arg0, int arg1, int arg2, long arg3) {
        class72 var5 = class95.field1776[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1412 != null && var5.field1412.field503 == arg3) {
            return true;
        } else if (var5.field1419 != null && var5.field1419.field3739 == arg3) {
            return true;
        } else if (var5.field1400 != null && var5.field1400.field1421 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1397; var6++) {
                if (var5.field1405[var6].field2230 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!le", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2197++;
        if (class139.field2545 != null) {
            class107.field1895 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class124.field2232.length > var2) {
                var3 = class124.field2232[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class206.field3651 >= 0 && var3 >= 0) {
                class81.field1545[class206.field3651] = ~var3;
                class206.field3651 = class206.field3651 + 1 & 0x7F;
                if (class206.field3651 == class200.field3536) {
                    class206.field3651 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method746(Throwable arg0, String arg1, int arg2) {
        field2211++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class182.method1145(-90, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            if (arg2 != -12134) {
                field2192 = true;
            }
            String var7 = var6.replace('#', '_');
            if (class188.field3335.field724 != null) {
                class77 var8 = class188.field3335.method262(new URL(class188.field3335.field724.getCodeBase(), "clienterror.ws?c=" + class155.field2805 + "&u=" + class162.field2939 + "&v1=" + class35.field715 + "&v2=" + class35.field726 + "&e=" + var7), arg2 ^ 0xFFFFD0B1);
                while (var8.field1501 == 0) {
                    class156.method1027(0, 1L);
                }
                if (var8.field1501 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1503;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
