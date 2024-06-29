import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class162 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Ltl;")
    private static class59 field2627 = class85.method639("Checking for updates )2 ", 9588);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Ltl;")
    public static class59 field2626 = class85.method639("Hidden)2use", 9588);

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Ltl;")
    public static class59 field2636 = class85.method639("sch-Utteln:", 9588);

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Ltl;")
    public static class59 field2635 = field2627;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2641 = 0;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Ltl;")
    public static class59 field2645 = class85.method639(":assistreq:", 9588);

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Lme;")
    public static class295 field2642;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "[B")
    public byte[] field2629;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[B")
    public byte[] field2644;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[I")
    public static int[] field2628;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "[[[I")
    public static int[][][] field2647;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 11)
    public static final void method1151(byte arg0, Component arg1) {
        if (arg0 != -96) {
            method1155(-112);
        }
        field2634++;
        arg1.addMouseListener(class262.field4365);
        arg1.addMouseMotionListener(class262.field4365);
        arg1.addFocusListener(class262.field4365);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILme;)Loj;", line = 24)
    public static final class260 method1152(int arg0, int arg1, class295 arg2) {
        if (arg1 != -65) {
            field2628 = (int[]) null;
        }
        field2637++;
        return class96.method727(arg0, (byte) -122, arg2) ? class254.method1771((byte) 61) : null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ls;B)V", line = 39)
    public static final void method1153(class170 arg0, byte arg1) {
        if (arg1 < 91) {
            method1151((byte) -106, (Component) null);
        }
        field2633++;
        while (true) {
            while (arg0.field2787 < arg0.field2758.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1221(127) == 1) {
                    var3 = arg0.method1221(98);
                    var2 = true;
                    var4 = arg0.method1221(104);
                }
                int var5 = arg0.method1221(88);
                int var6 = arg0.method1221(73);
                int var7 = var5 * 64 - class140.field2304;
                int var8 = class155.field2540 + class216.field3532 - (var6 * 64 + 1);
                if (var7 >= 0 && (var8 - 63) >= 0 && var7 + 63 < class62.field966 && var8 < class216.field3532) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method1221(77);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1221(127);
                                        if (class11.field148[var9][var10] == null) {
                                            class11.field148[var9][var10] = new byte[4096];
                                        }
                                        class11.field148[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1214(-18254);
                                        if (class306.field5195[var9][var10] == null) {
                                            class306.field5195[var9][var10] = new short[4096];
                                        }
                                        class306.field5195[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg0.method1221(90) & 0xFF) << 16) - (-(arg0.method1221(126) & 0xFF << 8) - (arg0.method1221(111) & 0xFF));
                                        if (field2647[var9][var10] == null) {
                                            field2647[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class180 var17 = class188.method1390(var16, false);
                                        if (var17.field3005 != null) {
                                            var17 = var17.method1335(false);
                                            if (var17 == null || var17.field2996 == -1) {
                                                continue;
                                            }
                                        }
                                        field2647[var9][var10][(63 - var12 << 6) + var11] = var17.field2981 + 1;
                                        class243 var18 = new class243();
                                        var18.field4070 = var7;
                                        var18.field4071 = var8;
                                        var18.field4069 = var17.field2996;
                                        class36.field529.method532(63, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method1221(120);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field2787++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field2787 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field2787 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 205)
    public static void method1154(int arg0) {
        field2628 = null;
        field2647 = (int[][][]) null;
        field2626 = null;
        field2627 = null;
        field2636 = null;
        if (arg0 == 8) {
            field2642 = null;
            field2635 = null;
            field2645 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 234)
    public static final void method1155(int arg0) {
        if (class53.field787 == null || class243.field4064 == null) {
            class53.field787 = new int[256];
            class243.field4064 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class53.field787[var1] = (int) (Math.sin(var2) * 4096.0D);
                class243.field4064[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2639++;
        if (arg0 != 0) {
            method1156(-81, 93);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V", line = 285)
    public static final void method1156(int arg0, int arg1) {
        class219.field3566 = -1;
        class113.field1823 = arg1;
        class228.field3687 = false;
        class7.field92 = 0;
        class149.field2442 = null;
        class97.field1561 = arg0;
        field2648++;
        class212.field3471 = 1;
    }
}
