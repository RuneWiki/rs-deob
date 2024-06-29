import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class112 extends class120 {

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Ljc;")
    private class57 field2720;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "[Lv;")
    public static class122[] field2717 = new class122[100];

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lv;")
    public static class122 field2714 = class55.method425(-119, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!t", name = "J", descriptor = "Lv;")
    public static class122 field2727 = class55.method425(-64, "redstone2");

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "Lv;")
    private static class122 field2734 = class55.method425(-61, "Password: ");

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public static int field2736 = -1;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "Lv;")
    public static class122 field2726 = class55.method425(-61, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!t", name = "H", descriptor = "Lv;")
    private static class122 field2725 = class55.method425(-57, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R\u001c1(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "Lv;")
    private static class122 field2743 = class55.method425(-118, "flash3:");

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Lv;")
    private static class122 field2713 = field2725;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "Lv;")
    public static class122 field2745 = class55.method425(-105, "Neuer Benutzer");

    @OriginalMember(owner = "client!t", name = "fb", descriptor = "Lv;")
    public static class122 field2749 = field2743;

    @OriginalMember(owner = "client!t", name = "db", descriptor = "[J")
    public static long[] field2747 = new long[100];

    @OriginalMember(owner = "client!t", name = "M", descriptor = "Lv;")
    public static class122 field2730 = class55.method425(-68, "backbase2");

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public static int field2738 = 0;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "Lv;")
    private static class122 field2729 = class55.method425(-74, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!t", name = "gb", descriptor = "Lv;")
    private static class122 field2750 = class55.method425(-67, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!t", name = "T", descriptor = "Lv;")
    public static class122 field2737 = class55.method425(-78, "@whi@ )4 ");

    @OriginalMember(owner = "client!t", name = "X", descriptor = "Lv;")
    public static class122 field2741 = field2729;

    @OriginalMember(owner = "client!t", name = "hb", descriptor = "Lv;")
    private static class122 field2751 = class55.method425(-65, "Enter object name");

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "Lv;")
    public static class122 field2744 = field2734;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
    public static int field2746 = 0;

    @OriginalMember(owner = "client!t", name = "ib", descriptor = "Lv;")
    public static class122 field2752 = field2751;

    @OriginalMember(owner = "client!t", name = "eb", descriptor = "Lv;")
    public static class122 field2748 = field2750;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    private int field2740;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "Lqb;")
    private class98 field2721;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "Lqb;")
    public static class98 field2735;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "Z")
    private boolean field2719;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "Z")
    private boolean field2724;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "[B")
    private byte[] field2722;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "[I")
    public static int[] field2739;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "[I")
    public static int[] field2742;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 3)
    public final void method755(int arg0, int arg1) {
        if (arg1 >= -53) {
            method860(-101);
        }
        field2723++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V", line = 16)
    public final void method754(int arg0, int arg1, int arg2) {
        field2732++;
        if (arg0 == 0) {
            arg0 = 1;
        }
        int var4 = class63.method477(arg0, (byte) -125) - arg1;
        if (arg2 != -6427) {
            method861(true);
        }
        if (this.field2721 != null) {
            this.field2740 = var4;
        } else if (this.field2724) {
            try {
                class31.method287(20517, this.field2720.field1497, "midibox.volume=" + var4 + ";");
                return;
            } catch (Throwable var5) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V", line = 56)
    public static final void method860(int arg0) {
        class38.method333(true);
        field2731++;
        if (arg0 != 7218) {
            field2734 = null;
        }
        if (class44.field1156 != 10) {
            return;
        }
        int var1 = class93.field2382;
        int var2 = class34.field865 - 171;
        int var3 = class125.field3049 - 202;
        if (class24.field657 == 0) {
            byte var4 = 100;
            byte var5 = 120;
            if (var1 == 1 && var3 >= var4 - 75 && var4 + 75 >= var3 && var5 - 20 <= var2 && var2 <= var5 + 20) {
                class127.field3072 = 0;
                class24.field657 = 3;
            }
            short var6 = 260;
            if (var1 == 1 && var3 >= var6 - 75 && var6 + 75 >= var3 && var5 - 20 <= var2 && var2 <= var5 + 20) {
                class88.field2258 = class131.field3138;
                class24.field657 = 2;
                class88.field2254 = class67.field1712;
                class88.field2253 = class131.field3180;
                class127.field3072 = 0;
            }
        } else if (class24.field657 == 2) {
            byte var7 = 60;
            int var15 = var7 + 30;
            if (var1 == 1 && var15 - 15 <= var2 && var2 < var15) {
                class127.field3072 = 0;
            }
            var15 += 15;
            short var8 = 150;
            byte var9 = 100;
            if (var1 == 1 && var15 - 15 <= var2 && var2 < var15) {
                class127.field3072 = 1;
            }
            var15 += 15;
            if (var1 == 1 && var3 >= var9 - 75 && var3 <= var9 + 75 && var2 >= var8 - 20 && var2 <= var8 + 20) {
                class88.field2261 = class88.field2261.method950((byte) -3).method939(arg0 + 8147);
                class44.method374(class18.field428, class131.field3164, class131.field3147, false);
                class76.method641(20, true);
            } else {
                short var10 = 260;
                if (var1 == 1 && var10 - 75 <= var3 && var10 + 75 >= var3 && var2 >= var8 - 20 && var2 <= var8 + 20) {
                    class88.field2261 = class88.field2260;
                    class88.field2250 = class88.field2260;
                    class24.field657 = 0;
                }
                while (true) {
                    boolean var11;
                    label141: do {
                        while (class56.method438(-84)) {
                            var11 = false;
                            for (int var12 = 0; field2713.method946(70) > var12; var12++) {
                                if (class113.field2761 == field2713.method968(var12, 255)) {
                                    var11 = true;
                                    break;
                                }
                            }
                            if (class127.field3072 != 0) {
                                continue label141;
                            }
                            if (class47.field1216 == 85 && class88.field2261.method946(70) > 0) {
                                class88.field2261 = class88.field2261.method951(7835, class88.field2261.method946(70) - 1, 0);
                            }
                            if (class47.field1216 == 84 || class47.field1216 == 80) {
                                class127.field3072 = 1;
                            }
                            if (var11 && class88.field2261.method946(70) < 12) {
                                class88.field2261 = class88.field2261.method942(false, class113.field2761);
                            }
                        }
                        return;
                    } while (class127.field3072 != 1);
                    if (class47.field1216 == 85 && class88.field2250.method946(70) > 0) {
                        class88.field2250 = class88.field2250.method951(7835, class88.field2250.method946(70) - 1, 0);
                    }
                    if (class47.field1216 == 84 || class47.field1216 == 80) {
                        class127.field3072 = 0;
                    }
                    if (var11 && class88.field2250.method946(70) < 20) {
                        class88.field2250 = class88.field2250.method942(false, class113.field2761);
                    }
                }
            }
        } else if (class24.field657 == 3) {
            short var13 = 180;
            short var14 = 150;
            if (var1 == 1 && var3 >= var13 - 75 && var3 <= var13 + 75 && var2 >= var14 - 20 && var14 + 20 >= var2) {
                class24.field657 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 206)
    public final void method758(int arg0) {
        field2728++;
        if (arg0 >= -44) {
            this.method757(false, -90, null, 19);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 229)
    public final void method759(byte arg0) {
        if (this.field2724) {
            try {
                class31.method287(20517, this.field2720.field1497, "midibox.src=\"c:/silence.mid\";");
            } catch (Throwable var2) {
            }
            this.field2724 = false;
        }
        if (arg0 < -11) {
            this.field2721 = null;
            field2715++;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V", line = 264)
    public static final void method861(boolean arg0) {
        field2716++;
        try {
            Graphics var1 = class54.field1411.getGraphics();
            class129.field3124.method122(126, var1, 0, 4);
            class52.field1338.method122(-112, var1, 0, 357);
            class8.field188.method122(115, var1, 722, 4);
            class93.field2368.method122(-107, var1, 743, 205);
            class95.field2437.method122(-2, var1, 0, 0);
            if (!arg0) {
                method860(-57);
            }
            class103.field2556.method122(118, var1, 516, 4);
            class109.field2701.method122(11, var1, 516, 205);
            class81.field2104.method122(-12, var1, 496, 357);
            class46.field1196.method122(127, var1, 0, 338);
        } catch (Exception var2) {
            class54.field1411.repaint();
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 294)
    public final void method756(int arg0) {
        if (arg0 <= 69) {
            this.method756(-56);
        }
        field2733++;
        if (this.field2721 == null || this.field2721.field2454 == 0) {
            return;
        }
        if (this.field2721.field2454 == 1) {
            class12 var2 = (class12) this.field2721.field2456;
            try {
                var2.method121(0, this.field2722.length, true, this.field2722);
                var2.method120((byte) -116);
                try {
                    class31.method287(20517, this.field2720.field1497, "midibox.loop=" + (this.field2719 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method117((byte) -97).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field2740 + ";");
                    this.field2724 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method120((byte) -128);
                } catch (Exception var3) {
                }
            }
        }
        this.field2721 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI[BI)V", line = 337)
    public final void method757(boolean arg0, int arg1, byte[] arg2, int arg3) {
        this.field2721 = this.field2720.method443(true);
        int var5 = 125 / ((37 - arg3) / 61);
        field2718++;
        if (this.field2721 == null) {
            return;
        }
        if (arg1 == 0) {
            arg1 = 1;
        }
        this.field2740 = class63.method477(arg1, (byte) -125);
        this.field2719 = arg0;
        this.field2722 = arg2;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljc;)V", line = 385)
    public class112(class57 arg0) {
        this.field2720 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V", line = 393)
    public static void method862(int arg0) {
        field2751 = null;
        field2748 = null;
        field2713 = null;
        field2730 = null;
        field2735 = null;
        field2725 = null;
        field2734 = null;
        field2745 = null;
        field2742 = null;
        if (arg0 != 1684) {
            field2737 = null;
        }
        field2750 = null;
        field2727 = null;
        field2726 = null;
        field2749 = null;
        field2752 = null;
        field2729 = null;
        field2737 = null;
        field2747 = null;
        field2744 = null;
        field2743 = null;
        field2741 = null;
        field2739 = null;
        field2717 = null;
        field2714 = null;
    }
}
