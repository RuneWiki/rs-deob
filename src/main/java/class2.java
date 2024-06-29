import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "[I")
    public static int[] field35 = new int[128];

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lcc;")
    public static class209 field34 = class95.method669(88, "gr-Un:");

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lcc;")
    public static class209 field36 = class95.method669(101, " autres options");

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lsj;")
    public static class49 field31;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[Lcc;")
    public static class209[] field33;

    @OriginalMember(owner = "client!ud", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field30++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I")
    public static final int method7(int arg0, byte arg1) {
        field27++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        }
        if (arg1 >= -22) {
            field35 = null;
        }
        if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field25++;
        if (class226.field4117 == null) {
            return;
        }
        class161.field2915 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class49.field952.length > var2) {
            var3 = class49.field952[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class60.field1202 >= 0 && var3 >= 0) {
            class147.field2695[class60.field1202] = var3;
            class60.field1202 = class60.field1202 + 1 & 0x7F;
            if (class60.field1202 == class43.field867) {
                class60.field1202 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class70.field1337 + 1 & 0x7F;
            if (class205.field3660 != var4) {
                field35[class70.field1337] = var3;
                class196.field3523[class70.field1337] = -1;
                class70.field1337 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ud", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class226.field4117 != null) {
            class60.field1202 = -1;
        }
        field28++;
    }

    @OriginalMember(owner = "client!ud", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field32++;
        if (class226.field4117 != null) {
            int var2 = class84.method606(arg0, (byte) 103);
            if (var2 >= 0) {
                int var3 = class70.field1337 + 1 & 0x7F;
                if (class205.field3660 != var3) {
                    field35[class70.field1337] = -1;
                    class196.field3523[class70.field1337] = var2;
                    class70.field1337 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ud", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field29++;
        if (class226.field4117 != null) {
            class161.field2915 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class49.field952.length) {
                var3 = class49.field952[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class60.field1202 >= 0 && var3 >= 0) {
                class147.field2695[class60.field1202] = ~var3;
                class60.field1202 = class60.field1202 + 1 & 0x7F;
                if (class60.field1202 == class43.field867) {
                    class60.field1202 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public static final void method8(int arg0, int arg1) {
        field26++;
        class269 var2;
        if (class254.field4593 == null) {
            var2 = new class269(512, 512);
        } else {
            var2 = (class269) class254.field4593;
        }
        int[] var3 = var2.field4801;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class285.field5023[arg1][var25][var6] & 0x18) == 0) {
                    class289.method1941(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (class285.field5023[arg1 + 1][var25][var6] & 0x8) != 0) {
                    class289.method1941(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method1836();
        int var7 = ((int) (Math.random() * 20.0D)) - (-238 - ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - ((int) (Math.random() * 20.0D) + 238 + -10 << 16)) - 10;
        int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class285.field5023[arg1][var23][var9] & 0x18) == 0) {
                    class3.method16(var7, arg1, var23, var8, var9, 111);
                }
                if (arg1 < 3 && (class285.field5023[arg1 + 1][var23][var9] & 0x8) != 0) {
                    class3.method16(var7, arg1 + 1, var23, var8, var9, 75);
                }
            }
        }
        class52.field1031 = 0;
        for (int var10 = arg0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class275.method1870(class99.field1937, var10, var11);
                if (var12 != 0L) {
                    class218 var14 = class245.method1711(27093, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                    int var15 = var14.field3944;
                    if (var14.field3917 != null) {
                        for (int var16 = 0; var16 < var14.field3917.length; var16++) {
                            if (var14.field3917[var16] != -1) {
                                class218 var17 = class245.method1711(27093, var14.field3917[var16]);
                                if (var17.field3944 >= 0) {
                                    var15 = var17.field3944;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class122.field2404[class99.field1937].field3103;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && (var10 - 3) < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var22 == 1 && var18 < 103 && var18 < (var10 + 3) && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var22 == 2 && var19 > 0 && (var11 - 3) < var19 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                    var19--;
                                }
                                if (var22 == 3 && var19 < 103 && var19 < (var11 + 3) && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                    var19++;
                                }
                            }
                        }
                        class58.field1177[class52.field1031] = var14.field3952;
                        class153.field2763[class52.field1031] = var18;
                        class290.field5109[class52.field1031] = var19;
                        class52.field1031++;
                    }
                }
            }
        }
        class254.field4593 = var2;
        class187.field3374.method603(false);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([BB)[B")
    public static final byte[] method9(byte[] arg0, byte arg1) {
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        if (arg1 < 35) {
            return null;
        } else {
            class270.method1847(arg0, 0, var3, 0, var2);
            field37++;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method10(int arg0) {
        field35 = null;
        field34 = null;
        if (arg0 < 60) {
            field36 = null;
        }
        field31 = null;
        field36 = null;
        field33 = null;
    }
}
