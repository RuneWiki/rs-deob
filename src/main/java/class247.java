import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class247 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[I")
    public static int[] field4481 = new int[5];

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field4479 = 0;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Z")
    public static boolean field4476 = true;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "[I")
    public static int[] field4486 = new int[25];

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
    public static int[] field4487 = new int[1000];

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[Lae;")
    public static class169[] field4478 = new class169[28];

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "[Ldg;")
    public static class139[] field4484;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILqk;)V")
    public static final void method1734(int arg0, class207 arg1) {
        field4483++;
        class121.field2093 = arg1;
        if (class20.field326.field4207 == null) {
            return;
        }
        try {
            if (arg0 != -15034) {
                field4478 = null;
            }
            class207 var2 = class204.field3594.method1435((byte) -72, class20.field326.field4207);
            class207 var3 = class250.field4526.method1435((byte) -72, class20.field326.field4207);
            class207 var4 = class105.method757(false, new class207[] { var2, class33.field668, arg1, class49.field973, var3 });
            class207 var5;
            if (arg1.method1450((byte) 20) == 0) {
                var5 = class105.method757(false, new class207[] { var4, class172.field3043 });
            } else {
                var5 = class105.method757(false, new class207[] { var4, class262.field4663, class20.method121(class53.method405(21) + 94608000000L, (byte) -84), class11.field152, class113.method809(13216, 94608000L) });
            }
            class105.method757(false, new class207[] { class9.field132, var5, class157.field2788 }).method1430(class20.field326.field4207, arg0 + 14938);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lv;II)Lqk;")
    public static final class207 method1735(class149 arg0, int arg1, int arg2) {
        field4474++;
        try {
            class207 var3 = new class207();
            var3.field3663 = arg0.method1067(-32768);
            if (var3.field3663 > arg1) {
                var3.field3663 = arg1;
            }
            var3.field3652 = new byte[var3.field3663];
            int var4 = -77 % ((-arg2 - 38) / 39);
            arg0.field2593 += class25.field524.method1898(arg0.field2593, 0, arg0.field2568, -8337, var3.field3663, var3.field3652);
            return var3;
        } catch (Exception var5) {
            return class196.field3455;
        }
    }

    @OriginalMember(owner = "client!pj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class70.field1244 != null) {
            class78.field1426 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class71.field1267.length) {
                var3 = class71.field1267[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class219.field3863 >= 0 && var3 >= 0) {
                class127.field2193[class219.field3863] = ~var3;
                class219.field3863 = class219.field3863 + 1 & 0x7F;
                if (class8.field109 == class219.field3863) {
                    class219.field3863 = -1;
                }
            }
        }
        field4475++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILmd;I)I")
    public static final int method1736(int arg0, class220 arg1, int arg2) {
        if (arg2 != -10) {
            field4476 = true;
        }
        field4470++;
        if (arg1.field3976 == null || arg1.field3976.length <= arg0) {
            return -2;
        }
        try {
            int[] var3 = arg1.field3976[arg0];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = field4486[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class119.field2059[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class62.field1135[var3[var4++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class220 var12 = class233.method1667(var11, 95);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class117.method829(var13, (byte) 107).field3071 || class16.field253)) {
                        for (int var14 = 0; var14 < var12.field3963.length; var14++) {
                            if (var13 + 1 == var12.field3963[var14]) {
                                var8 += var12.field3939[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class83.field1535[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class155.field2726[class119.field2059[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class83.field1535[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class202.field3565.field224;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class195.field3430[var15]) {
                            var8 += class119.field2059[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class220 var18 = class233.method1667(var17, 125);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class117.method829(var19, (byte) 110).field3071 || class16.field253)) {
                        for (int var20 = 0; var20 < var18.field3963.length; var20++) {
                            if (var19 + 1 == var18.field3963[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class36.field687;
                }
                if (var7 == 12) {
                    var8 = class40.field800;
                }
                if (var7 == 13) {
                    int var21 = class83.field1535[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class20.method117(-31663, var23);
                }
                if (var7 == 18) {
                    var8 = (class202.field3565.field5104 >> 7) + class21.field349;
                }
                if (var7 == 19) {
                    var8 = (class202.field3565.field5072 >> 7) + class180.field3231;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var6 += var8;
                    }
                    if (var5 == 1) {
                        var6 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var6 /= var8;
                    }
                    if (var5 == 3) {
                        var6 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static final void method1737(int arg0) {
        field4482++;
        if (class165.field2915 != -1) {
            class24.method182(class165.field2915, (byte) -117);
        }
        int var1 = -35 / ((-arg0 - 40) / 39);
        for (int var2 = 0; var2 < class110.field1930; var2++) {
            if (class140.field2431[var2]) {
                class212.field3766[var2] = true;
            }
            class9.field137[var2] = class140.field2431[var2];
            class140.field2431[var2] = false;
        }
        class185.field3282 = null;
        class154.field2672 = class160.field2844;
        class127.field2196 = -1;
        class206.field3613 = -1;
        if (class165.field2915 != -1) {
            class110.field1930 = 0;
            class95.method685(-109);
        }
        class23.method148();
        class20.field325 = 0;
    }

    @OriginalMember(owner = "client!pj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field4471++;
        if (class70.field1244 != null) {
            int var2 = class213.method1519(arg0, (byte) -126);
            if (var2 >= 0) {
                int var3 = class14.field220 + 1 & 0x7F;
                if (class41.field814 != var3) {
                    class82.field1515[class14.field220] = -1;
                    class41.field824[class14.field220] = var2;
                    class14.field220 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static final void method1738(int arg0) {
        field4488++;
        if (arg0 != 25) {
            method1738(21);
        }
        class108.field1917.method1382(31346);
    }

    @OriginalMember(owner = "client!pj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4480++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILpk;B)Ldg;")
    public static final class139 method1739(int arg0, class99 arg1, byte arg2) {
        field4473++;
        if (class135.method943(arg0, arg1, 2)) {
            return arg2 < 17 ? null : class82.method615(12339);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
    public static final void method1740(boolean arg0, int arg1) {
        class48.field950 = -1;
        if (arg1 == 37) {
            class108.field1913 = 3.0F;
        } else if (arg1 == 50) {
            class108.field1913 = 4.0F;
        } else if (arg1 == 75) {
            class108.field1913 = 6.0F;
        } else if (arg1 == 100) {
            class108.field1913 = 8.0F;
        } else if (arg1 == 200) {
            class108.field1913 = 16.0F;
        }
        if (arg0) {
            method1738(-91);
        }
        field4485++;
        class48.field950 = -1;
    }

    @OriginalMember(owner = "client!pj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class70.field1244 != null) {
            class78.field1426 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class71.field1267.length > var2) {
                var3 = class71.field1267[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class219.field3863 >= 0 && var3 >= 0) {
                class127.field2193[class219.field3863] = var3;
                class219.field3863 = class219.field3863 + 1 & 0x7F;
                if (class8.field109 == class219.field3863) {
                    class219.field3863 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class14.field220 + 1 & 0x7F;
                if (class41.field814 != var4) {
                    class82.field1515[class14.field220] = var3;
                    class41.field824[class14.field220] = -1;
                    class14.field220 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4472++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method1741(byte arg0) {
        field4484 = null;
        int var1 = 76 % ((-arg0 - 43) / 47);
        field4486 = null;
        field4487 = null;
        field4478 = null;
        field4481 = null;
    }

    @OriginalMember(owner = "client!pj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4477++;
        if (class70.field1244 != null) {
            class219.field3863 = -1;
        }
    }
}
