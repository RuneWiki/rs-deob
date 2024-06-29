import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class58 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field949 = "Checking for updates - ";

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[Lw;")
    public static class146[] field953;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(JI)V")
    public static final void method440(long arg0, int arg1) {
        if (class259.field4130 == 1 || class259.field4130 == 5) {
            class272.method1839(arg0, false);
        } else if (class259.field4130 == 2) {
            class20.method189((byte) 54);
        } else {
            class113.method801(128);
        }
        if (!class47.field687) {
            class146.field2319[0] = 1004;
            if (class40.field571 != 0) {
                class179.field2796 = class213.field3321;
                class147.field2332 = class15.field236;
            } else if (class164.field2581 == 0) {
                class179.field2796 = class79.field1323;
                class147.field2332 = class115.field1883;
            } else {
                class179.field2796 = class291.field4584;
                class147.field2332 = class112.field1838;
            }
            class268.field4273[0] = class248.field4020;
            class88.field1492[0] = class94.field1600;
            class256.field4099[0] = "";
            class128.field2018 = 1;
        }
        field952++;
        if (class75.field1236 != -1) {
            class111.method789(99, class75.field1236);
        }
        if (arg1 < 47) {
            method443((byte) 106, (char) 65488, (String) null);
        }
        for (int var3 = 0; var3 < class77.field1262; var3++) {
            if (class25.field335[var3]) {
                class85.field1428[var3] = true;
            }
            class126.field1995[var3] = class25.field335[var3];
            class25.field335[var3] = false;
        }
        class212.field3291 = -1;
        class104.field1739 = null;
        class185.field2867 = class192.field2978;
        class146.field2321 = null;
        class212.field3289 = -1;
        if (class75.field1236 != -1) {
            class77.field1262 = 0;
            class100.method733(-10890);
        }
        class211.method1415();
        class50.method375(1);
        if (class47.field687) {
            if (class180.field2798) {
                class112.method796((byte) 113);
            } else {
                class61.method463(0);
            }
        } else if (class104.field1739 != null) {
            class60.method451(class104.field1739, 2, class205.field3197, class71.field1143);
        } else if (class212.field3291 != -1) {
            class60.method451((class228) null, 2, class212.field3289, class212.field3291);
        }
        int var4 = class47.field687 ? -1 : class152.method1019(0);
        if (var4 == -1) {
            var4 = class28.field395;
        }
        class230.method1537(-1, var4);
        if (class177.field2772 == 1) {
            class177.field2772 = 2;
        }
        if (class79.field1330 == 1) {
            class79.field1330 = 2;
        }
        if (class42.field605 == 3) {
            for (int var5 = 0; var5 < class77.field1262; var5++) {
                if (class126.field1995[var5]) {
                    class211.method1423(class129.field2025[var5], class115.field1879[var5], class251.field4040[var5], class278.field4418[var5], 16711935, 128);
                } else if (class85.field1428[var5]) {
                    class211.method1423(class129.field2025[var5], class115.field1879[var5], class251.field4040[var5], class278.field4418[var5], 16711680, 128);
                }
            }
        }
        class190.method1278(class240.field3892, class283.field4473.field2240, class84.field1413, class283.field4473.field2278, 3);
        class84.field1413 = 0;
    }

    @OriginalMember(owner = "client!pd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field950++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lpl;)V")
    public static final void method441(class293 arg0) {
        for (int var1 = arg0.field4616; var1 <= arg0.field4623; var1++) {
            for (int var2 = arg0.field4612; var2 <= arg0.field4615; var2++) {
                class6 var3 = class269.field4298[arg0.field4613][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field125; var4++) {
                        if (var3.field134[var4] == arg0) {
                            var3.field125--;
                            for (int var5 = var4; var5 < var3.field125; var5++) {
                                var3.field134[var5] = var3.field134[var5 + 1];
                                var3.field143[var5] = var3.field143[var5 + 1];
                            }
                            var3.field134[var3.field125] = null;
                            break;
                        }
                    }
                    var3.field139 = 0;
                    for (int var6 = 0; var6 < var3.field125; var6++) {
                        var3.field139 |= var3.field143[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static final void method442(byte arg0) {
        class167.field2612.method1888(-94);
        class171.field2676.method1888(114);
        field951++;
        int var1 = 6 % ((arg0 + 20) / 45);
    }

    @OriginalMember(owner = "client!pd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class254.field4065 != null) {
            class196.field3097 = -1;
        }
        field957++;
    }

    @OriginalMember(owner = "client!pd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field960++;
        if (class254.field4065 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class77.method548(true, var2)) {
                int var3 = class157.field2443 + 1 & 0x7F;
                if (class280.field4431 != var3) {
                    class205.field3206[class157.field2443] = -1;
                    class143.field2183[class157.field2443] = var2;
                    class157.field2443 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!pd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field955++;
        if (class254.field4065 != null) {
            class86.field1437 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class65.field1091.length) {
                var3 = class65.field1091[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class196.field3097 >= 0 && var3 >= 0) {
                class62.field1063[class196.field3097] = ~var3;
                class196.field3097 = class196.field3097 + 1 & 0x7F;
                if (class196.field3097 == class149.field2358) {
                    class196.field3097 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method443(byte arg0, char arg1, String arg2) {
        field954++;
        int var3 = class157.method1064(arg2, arg1, -22452);
        String[] var4 = new String[var3 + 1];
        int var5 = -103 / ((60 - arg0) / 50);
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = var7; arg2.charAt(var9) != arg1; var9++) {
            }
            var4[var6++] = arg2.substring(var7, var9);
            var7 = var9 + 1;
        }
        var4[var3] = arg2.substring(var7);
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
    public static void method444(byte arg0) {
        field949 = null;
        field953 = null;
        if (arg0 != -13) {
            method440(120L, -41);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
    public static final int method445(int arg0) {
        field959++;
        return arg0 == 31032 ? 15 : 89;
    }

    @OriginalMember(owner = "client!pd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class254.field4065 != null) {
            class86.field1437 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class65.field1091.length) {
                var3 = class65.field1091[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class196.field3097 >= 0 && var3 >= 0) {
                class62.field1063[class196.field3097] = var3;
                class196.field3097 = class196.field3097 + 1 & 0x7F;
                if (class196.field3097 == class149.field2358) {
                    class196.field3097 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class157.field2443 + 1 & 0x7F;
                if (class280.field4431 != var4) {
                    class205.field3206[class157.field2443] = var3;
                    class143.field2183[class157.field2443] = '\u0000';
                    class157.field2443 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field958++;
    }
}
