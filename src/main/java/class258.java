import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class258 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lhj;")
    public static class69 field4626 = class181.method1318("null", (byte) -118);

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "[I")
    public static int[] field4629 = new int[2000];

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lka;")
    public static class243 field4619 = new class243();

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "Lhj;")
    public static class69 field4634 = class181.method1318("Bitte warten Sie)3)3)3", (byte) -127);

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Lta;")
    public static class241 field4631 = new class241(50);

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "Lhj;")
    public static class69 field4638 = class181.method1318("Hidden)2", (byte) -115);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "[I")
    public static int[] field4632;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "[I")
    public static int[] field4636;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "[I")
    public static int[] field4637;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static final void method1778(int arg0) {
        field4623++;
        class12.field124.method1709((byte) -40);
        if (arg0 >= -38) {
            method1780((class50) null, -29, 102, true, 85);
        }
        class229.field4197.method1709((byte) -55);
        class80.field1536.method1709((byte) -82);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lhj;I)V")
    public static final void method1779(class69 arg0, int arg1) {
        field4620++;
        client.method1151(85);
        class212.method1531(arg0, arg1 ^ 0x7C);
        if (arg1 != -1) {
            field4636 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class141.field2626 != null) {
            class63.field1229 = -1;
        }
        field4617++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ltk;IIZI)V")
    public static final void method1780(class50 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4624++;
        class17.method105(-113);
        class15.method89(arg1, arg4, arg0.field798 + arg1, arg0.field727 + arg4);
        if (class265.field4715 == 2 || class265.field4715 == 5 || class207.field3770 == null) {
            class15.method76(arg1, arg4, 0, arg0.field800, arg0.field760);
        } else {
            int var5 = client.field2812 + class179.field3257 & 0x7FF;
            int var6 = class156.field2904.field3985 / 32 + 48;
            int var7 = 464 - (class156.field2904.field4005 / 32);
            ((class264) class207.field3770).method559(arg1, arg4, arg0.field798, arg0.field727, var6, var7, var5, class59.field1080 + 256, arg0.field800, arg0.field760);
            if (class246.field4506 != null) {
                for (int var8 = 0; var8 < class246.field4506.field1724; var8++) {
                    if (class246.field4506.method643(var8, (byte) 103)) {
                        int var9 = (class246.field4506.field1720[var8] - class220.field3962) * 4 + 2 - (class156.field2904.field4005 / 32);
                        int var10 = (class246.field4506.field1717[var8] - class242.field4441) * 4 + 2 - (class156.field2904.field3985 / 32);
                        int var11 = class178.field3247[var5];
                        int var12 = var11 * 256 / (class59.field1080 + 256);
                        int var13 = class178.field3232[var5];
                        int var14 = var13 * 256 / (class59.field1080 + 256);
                        int var15 = var9 * var14 - (var10 * var12) >> 16;
                        int var16 = var9 * var12 + (var10 * var14) >> 16;
                        class225 var17 = class227.field4139;
                        if (class246.field4506.method648(var8, 13326) == 1) {
                            var17 = class155.field2897;
                        }
                        if (class246.field4506.method648(var8, 13326) == 2) {
                            var17 = class26.field378;
                        }
                        int var18 = var17.method1601(class246.field4506.field1729[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (var19 >= -arg0.field798 && arg0.field798 >= var19 && (-arg0.field727) <= var15 && var15 <= arg0.field727) {
                            int var20 = 16777215;
                            if (class246.field4506.field1730[var8] != -1) {
                                var20 = class246.field4506.field1730[var8];
                            }
                            class15.method97(arg0.field800, arg0.field760);
                            var17.method1617(class246.field4506.field1729[var8], arg0.field798 / 2 + arg1 + var19, arg0.field727 / 2 + -var15 + arg4, var18, 50, var20, 0, 256, 1, 0, 0);
                            class15.method96();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class239.field4380; var21++) {
                int var54 = class23.field327[var21] * 4 + (2 - class156.field2904.field3985 / 32);
                int var55 = class50.field857[var21] * 4 + 2 - (class156.field2904.field4005 / 32);
                class12 var56 = class145.method1102(class209.field3814[var21], 0);
                if (var56.field120 != null) {
                    var56 = var56.method63(92);
                    if (var56 == null || var56.field154 == -1) {
                        continue;
                    }
                }
                class31.method171(arg1, var54, var55, arg4, arg0, class58.field1043[var56.field154], 33);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    class243 var51 = class32.field437[class52.field927][var22][var50];
                    if (var51 != null) {
                        int var52 = var22 * 4 + 2 - (class156.field2904.field3985 / 32);
                        int var53 = var50 * 4 + 2 - class156.field2904.field4005 / 32;
                        class31.method171(arg1, var52, var53, arg4, arg0, class105.field1976[0], 34);
                    }
                }
            }
            for (int var23 = 0; var23 < class46.field659; var23++) {
                class38 var46 = class131.field2428[class245.field4490[var23]];
                if (var46 != null && var46.method210(-30948)) {
                    class186 var47 = var46.field517;
                    if (var47 != null && var47.field3375 != null) {
                        var47 = var47.method1358((byte) -36);
                    }
                    if (var47 != null && var47.field3352 && var47.field3410) {
                        int var48 = var46.field3985 / 32 - (class156.field2904.field3985 / 32);
                        int var49 = var46.field4005 / 32 - (class156.field2904.field4005 / 32);
                        class31.method171(arg1, var48, var49, arg4, arg0, class105.field1976[1], 113);
                    }
                }
            }
            for (int var24 = 0; var24 < class98.field1856; var24++) {
                class108 var38 = class35.field491[class38.field525[var24]];
                if (var38 != null && var38.method210(-30948)) {
                    int var39 = var38.field4005 / 32 - class156.field2904.field4005 / 32;
                    boolean var40 = false;
                    int var41 = var38.field3985 / 32 - (class156.field2904.field3985 / 32);
                    long var42 = var38.field2045.method473((byte) 54);
                    for (int var44 = 0; var44 < class273.field4828; var44++) {
                        if (class141.field2642[var44] == var42 && class112.field2163[var44] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class156.field2904.field2054 != 0 && var38.field2054 != 0 && class156.field2904.field2054 == var38.field2054) {
                        var45 = true;
                    }
                    if (var40) {
                        class31.method171(arg1, var41, var39, arg4, arg0, class105.field1976[3], 121);
                    } else if (var45) {
                        class31.method171(arg1, var41, var39, arg4, arg0, class105.field1976[4], 44);
                    } else {
                        class31.method171(arg1, var41, var39, arg4, arg0, class105.field1976[2], 99);
                    }
                }
            }
            class232[] var25 = class60.field1094;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class232 var29 = var25[var26];
                if (var29 != null && var29.field4241 != 0 && (class180.field3272 % 20) < 10) {
                    if (var29.field4241 == 1 && var29.field4236 >= 0 && var29.field4236 < class131.field2428.length) {
                        class38 var30 = class131.field2428[var29.field4236];
                        if (var30 != null) {
                            int var31 = var30.field4005 / 32 - class156.field2904.field4005 / 32;
                            int var32 = var30.field3985 / 32 - class156.field2904.field3985 / 32;
                            class152.method1156(var31, 27910, arg4, arg0, var32, var29.field4242, arg1);
                        }
                    }
                    if (var29.field4241 == 2) {
                        int var33 = (var29.field4248 - class242.field4441) * 4 + 2 - (class156.field2904.field3985 / 32);
                        int var34 = (var29.field4245 - class220.field3962) * 4 + (2 - class156.field2904.field4005 / 32);
                        class152.method1156(var34, 27910, arg4, arg0, var33, var29.field4242, arg1);
                    }
                    if (var29.field4241 == 10 && var29.field4236 >= 0 && class35.field491.length > var29.field4236) {
                        class108 var35 = class35.field491[var29.field4236];
                        if (var35 != null) {
                            int var36 = var35.field3985 / 32 - (class156.field2904.field3985 / 32);
                            int var37 = var35.field4005 / 32 - (class156.field2904.field4005 / 32);
                            class152.method1156(var37, 27910, arg4, arg0, var36, var29.field4242, arg1);
                        }
                    }
                }
            }
            if (class129.field2408 != 0) {
                int var27 = class100.field1884 * 4 + 2 - (class156.field2904.field4005 / 32);
                int var28 = class129.field2408 * 4 + 2 - (class156.field2904.field3985 / 32);
                class31.method171(arg1, var28, var27, arg4, arg0, class229.field4195, 42);
            }
            class15.method77(arg0.field798 / 2 + arg1 - 1, arg0.field727 / 2 + arg4 + -1, 3, 3, 16777215);
        }
        class49.field723[arg2] = arg3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)V")
    public static final void method1781(int arg0, int arg1, byte arg2) {
        field4627++;
        if (arg2 == -24) {
            class135 var3 = class8.method38((byte) 116, 5, arg0);
            var3.method1011((byte) 122);
            var3.field2539 = arg1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class141.field2626 != null) {
            class141.field2635 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class82.field1566.length > var2) {
                var3 = class82.field1566[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class63.field1229 >= 0 && var3 >= 0) {
                class213.field3878[class63.field1229] = var3;
                class63.field1229 = class63.field1229 + 1 & 0x7F;
                if (class63.field1229 == class165.field3039) {
                    class63.field1229 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class75.field1474 + 1 & 0x7F;
                if (class32.field443 != var4) {
                    class60.field1107[class75.field1474] = var3;
                    class246.field4495[class75.field1474] = -1;
                    class75.field1474 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4625++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lfh;B)V")
    public static final void method1782(class128 arg0, byte arg1) {
        field4630++;
        if (arg1 < 4) {
            field4633 = 43;
        }
        while (true) {
            while (arg0.field2379 < arg0.field2385.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method937(false) == 1) {
                    var2 = arg0.method937(false);
                    var3 = true;
                    var4 = arg0.method937(false);
                }
                int var5 = arg0.method937(false);
                int var6 = arg0.method937(false);
                int var7 = var5 * 64 - class250.field4539;
                int var8 = -(var6 * 64) - (-class209.field3806 - (class22.field306 - 1));
                if (var7 >= 0 && (var8 - 63) >= 0 && class84.field1626 > var7 + 63 && class22.field306 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var11 >= var2 * 8 && var11 < (var2 * 8 + 8) && var12 >= (var4 * 8) && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method950(1495791448);
                                if (var13 != 0) {
                                    if (class51.field904[var9][var10] == null) {
                                        class51.field904[var9][var10] = new byte[4096];
                                    }
                                    class51.field904[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method950(1495791448);
                                    if (class66.field1265[var9][var10] == null) {
                                        class66.field1265[var9][var10] = new byte[4096];
                                    }
                                    class66.field1265[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method950(1495791448);
                        if (var16 != 0) {
                            arg0.field2379++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method1783(byte arg0) {
        field4632 = null;
        field4631 = null;
        field4638 = null;
        field4636 = null;
        field4629 = null;
        field4619 = null;
        if (arg0 > 114) {
            field4637 = null;
            field4626 = null;
            field4634 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class141.field2626 != null) {
            int var2 = class177.method1281(arg0, -8365);
            if (var2 >= 0) {
                int var3 = class75.field1474 + 1 & 0x7F;
                if (class32.field443 != var3) {
                    class60.field1107[class75.field1474] = -1;
                    class246.field4495[class75.field1474] = var2;
                    class75.field1474 = var3;
                }
            }
        }
        field4621++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!tj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4628++;
    }

    @OriginalMember(owner = "client!tj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4618++;
        if (class141.field2626 != null) {
            class141.field2635 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class82.field1566.length > var2) {
                var3 = class82.field1566[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class63.field1229 >= 0 && var3 >= 0) {
                class213.field3878[class63.field1229] = ~var3;
                class63.field1229 = class63.field1229 + 1 & 0x7F;
                if (class63.field1229 == class165.field3039) {
                    class63.field1229 = -1;
                }
            }
        }
        arg0.consume();
    }
}
