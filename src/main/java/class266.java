import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class266 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lnh;")
    public static class54 field4731 = new class54(4);

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field4738 = 0;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lcf;")
    public static class93 field4737 = class147.method1066("", -48);

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Lcf;")
    private static class93 field4740 = class147.method1066("Examine", -48);

    @OriginalMember(owner = "client!of", name = "s", descriptor = "[Lpd;")
    public static class57[] field4741 = new class57[28];

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lcf;")
    public static class93 field4735 = field4740;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lmd;")
    public static class221 field4736;

    @OriginalMember(owner = "client!of", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4727++;
    }

    @OriginalMember(owner = "client!of", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4724++;
        if (class172.field3011 != null) {
            class164.field2888 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class4.field55.length) {
                var3 = class4.field55[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class33.field522 >= 0 && var3 >= 0) {
                class55.field924[class33.field522] = ~var3;
                class33.field522 = class33.field522 + 1 & 0x7F;
                if (class80.field1489 == class33.field522) {
                    class33.field522 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!of", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field4732++;
        if (class172.field3011 != null) {
            int var2 = class63.method406((byte) 62, arg0);
            if (var2 >= 0) {
                int var3 = class196.field3590 + 1 & 0x7F;
                if (class123.field2194 != var3) {
                    class263.field4684[class196.field3590] = -1;
                    class195.field3566[class196.field3590] = var2;
                    class196.field3590 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4725++;
        if (class146.method1062((byte) -103, arg1)) {
            class111.method796(arg6, class6.field82[arg1], arg5, arg3, arg4, arg7, arg2, 21175, arg0, arg8);
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class25.field314[var9] = true;
            }
        } else {
            class25.field314[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ltg;B)Z")
    public static final boolean method1776(class181 arg0, byte arg1) {
        if (arg1 > -65) {
            field4738 = 4;
        }
        field4729++;
        if (arg0.field3218 == 205) {
            class213.field3908 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII[[[Lr;Z)Z")
    public static final boolean method1777(int arg0, int arg1, int arg2, int arg3, class41[][][] arg4, boolean arg5) {
        field4726++;
        byte var6 = arg5 ? 1 : (byte) (class278.field4975 & 0xFF);
        if (class42.field659[class138.field2405][arg3][arg2] == var6) {
            return false;
        } else if ((class4.field53[class138.field2405][arg3][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class163.field2878[var7] = arg3;
            if (arg1 != 3931) {
                return true;
            }
            int var31 = var7 + 1;
            class101.field1759[var7] = arg2;
            class42.field659[class138.field2405][arg3][arg2] = var6;
            while (var31 != var8) {
                int var9 = class163.field2878[var8] >> 24 & 0xFF;
                int var10 = class163.field2878[var8] & 0xFFFF;
                int var11 = class163.field2878[var8] >> 16 & 0xFF;
                int var12 = (class101.field1759[var8] & 0xFF61F1) >> 16;
                int var13 = class101.field1759[var8] & 0xFFFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class4.field53[class138.field2405][var10][var13] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label229: for (int var16 = class138.field2405 + 1; var16 <= 3; var16++) {
                    if ((class4.field53[var16][var10][var13] & 0x8) == 0) {
                        if (var14 && arg4[var16][var10][var13] != null) {
                            if (arg4[var16][var10][var13].field643 != null) {
                                int var19 = class260.method1752(var11, 21);
                                if (arg4[var16][var10][var13].field643.field1267 == var19 || arg4[var16][var10][var13].field643.field1273 == var19) {
                                    continue;
                                }
                                if (var9 != 0) {
                                    int var20 = class260.method1752(var9, 21);
                                    if (arg4[var16][var10][var13].field643.field1267 == var20 || arg4[var16][var10][var13].field643.field1273 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class260.method1752(var12, 21);
                                    if (arg4[var16][var10][var13].field643.field1267 == var21 || arg4[var16][var10][var13].field643.field1273 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var10][var13].field637 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var10][var13].field645; var22++) {
                                    int var23 = (int) (arg4[var16][var10][var13].field637[var22].field4094 >> 14 & 0x3FL);
                                    int var24 = (int) (arg4[var16][var10][var13].field637[var22].field4094 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var23 | var24 << 6;
                                    if (var11 == var25 || var9 != 0 && var9 == var25 || var12 != 0 && var12 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class41 var26 = arg4[var16][var10][var13];
                        if (var26 != null && var26.field645 > 0) {
                            for (int var27 = 0; var27 < var26.field645; var27++) {
                                class229 var28 = var26.field637[var27];
                                if (var28.field4100 != var28.field4095 || var28.field4110 != var28.field4099) {
                                    for (int var29 = var28.field4095; var29 <= var28.field4100; var29++) {
                                        for (int var30 = var28.field4099; var30 <= var28.field4110; var30++) {
                                            class42.field659[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class42.field659[var16][var10][var13] = var6;
                    }
                }
                if (var15) {
                    if (class233.field4151[class138.field2405 + 1][var10][var13] > class144.field2498[arg0]) {
                        class144.field2498[arg0] = class233.field4151[class138.field2405 + 1][var10][var13];
                    }
                    int var17 = var10 << 7;
                    if (class69.field1249[arg0] > var17) {
                        class69.field1249[arg0] = var17;
                    } else if (class124.field2212[arg0] < var17) {
                        class124.field2212[arg0] = var17;
                    }
                    int var18 = var13 << 7;
                    if (var18 < class144.field2496[arg0]) {
                        class144.field2496[arg0] = var18;
                    } else if (class268.field4787[arg0] < var18) {
                        class268.field4787[arg0] = var18;
                    }
                }
                if (!var14) {
                    if (var10 >= 1 && class42.field659[class138.field2405][var10 - 1][var13] != var6) {
                        class163.field2878[var31] = class270.method1797(class270.method1797(var10 - 1, 1179648), -754974720);
                        class101.field1759[var31] = class270.method1797(1245184, var13);
                        var31 = var31 + 1 & 0xFFF;
                        class42.field659[class138.field2405][var10 - 1][var13] = var6;
                    }
                    var13++;
                    if (var13 < 104) {
                        if ((var10 - 1) >= 0 && class42.field659[class138.field2405][var10 - 1][var13] != var6 && (class4.field53[class138.field2405][var10][var13] & 0x4) == 0 && (class4.field53[class138.field2405][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class163.field2878[var31] = class270.method1797(1375731712, class270.method1797(var10 - 1, 1179648));
                            class101.field1759[var31] = class270.method1797(1245184, var13);
                            class42.field659[class138.field2405][var10 - 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class42.field659[class138.field2405][var10][var13] != var6) {
                            class163.field2878[var31] = class270.method1797(class270.method1797(var10, 5373952), 318767104);
                            class101.field1759[var31] = class270.method1797(5439488, var13);
                            class42.field659[class138.field2405][var10][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class42.field659[class138.field2405][var10 + 1][var13] != var6 && (class4.field53[class138.field2405][var10][var13] & 0x4) == 0 && (class4.field53[class138.field2405][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class163.field2878[var31] = class270.method1797(class270.method1797(5373952, var10 + 1), -1845493760);
                            class101.field1759[var31] = class270.method1797(5439488, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class42.field659[class138.field2405][var10 + 1][var13] = var6;
                        }
                    }
                    var13--;
                    if (var10 + 1 < 104 && class42.field659[class138.field2405][var10 + 1][var13] != var6) {
                        class163.field2878[var31] = class270.method1797(class270.method1797(var10 + 1, 9568256), 1392508928);
                        class101.field1759[var31] = class270.method1797(9633792, var13);
                        var31 = var31 + 1 & 0xFFF;
                        class42.field659[class138.field2405][var10 + 1][var13] = var6;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var10 - 1 >= 0 && class42.field659[class138.field2405][var10 - 1][var13] != var6 && (class4.field53[class138.field2405][var10][var13] & 0x4) == 0 && (class4.field53[class138.field2405][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class163.field2878[var31] = class270.method1797(class270.method1797(13762560, var10 - 1), 301989888);
                            class101.field1759[var31] = class270.method1797(var13, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class42.field659[class138.field2405][var10 - 1][var13] = var6;
                        }
                        if (class42.field659[class138.field2405][var10][var13] != var6) {
                            class163.field2878[var31] = class270.method1797(-1828716544, class270.method1797(13762560, var10));
                            class101.field1759[var31] = class270.method1797(13828096, var13);
                            class42.field659[class138.field2405][var10][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class42.field659[class138.field2405][var10 + 1][var13] != var6 && (class4.field53[class138.field2405][var10][var13] & 0x4) == 0 && (class4.field53[class138.field2405][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class163.field2878[var31] = class270.method1797(class270.method1797(var10 + 1, 9568256), -771751936);
                            class101.field1759[var31] = class270.method1797(9633792, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class42.field659[class138.field2405][var10 + 1][var13] = var6;
                        }
                    }
                }
            }
            if (class144.field2498[arg0] != -1000000) {
                class144.field2498[arg0] += 10;
                class69.field1249[arg0] -= 50;
                class124.field2212[arg0] += 50;
                class268.field4787[arg0] += 50;
                class144.field2496[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static final void method1778(int arg0) {
        field4728++;
        int[] var1 = new int[class186.field3435];
        if (arg0 != -26817) {
            field4734 = 90;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class186.field3435; var3++) {
            class29 var5 = class89.method617(var3, 0);
            if (var5.field389 >= 0 || var5.field363 >= 0) {
                var1[var2++] = var3;
            }
        }
        class237.field4217 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class237.field4217[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method1779(int arg0) {
        field4736 = null;
        field4737 = null;
        field4740 = null;
        field4731 = null;
        field4741 = null;
        field4735 = null;
        if (arg0 < 48) {
            method1779(-83);
        }
    }

    @OriginalMember(owner = "client!of", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class172.field3011 != null) {
            class33.field522 = -1;
        }
        field4730++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
    public static final int method1780(byte arg0) {
        field4723++;
        if (arg0 != -90) {
            method1781(120, -12, 61);
        }
        return class129.field2272.method299((byte) 76);
    }

    @OriginalMember(owner = "client!of", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class172.field3011 != null) {
            class164.field2888 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class4.field55.length) {
                var3 = class4.field55[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class33.field522 >= 0 && var3 >= 0) {
                class55.field924[class33.field522] = var3;
                class33.field522 = class33.field522 + 1 & 0x7F;
                if (class80.field1489 == class33.field522) {
                    class33.field522 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class196.field3590 + 1 & 0x7F;
                if (class123.field2194 != var4) {
                    class263.field4684[class196.field3590] = var3;
                    class195.field3566[class196.field3590] = -1;
                    class196.field3590 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4733++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Lgh;")
    public static final class24 method1781(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class24 var4 = var3.field641;
            var3.field641 = null;
            return var4;
        }
    }
}
