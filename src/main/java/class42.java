import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class42 {

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lsc;")
    public static class128 field776 = class129.method1017(false, "Okay");

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lla;")
    public static class77 field773 = new class77();

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lrb;")
    public static class120 field782 = new class120(64);

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Lsc;")
    public static class128 field784 = class129.method1017(false, "(U4");

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lrb;")
    public static class120 field783 = new class120(500);

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lsc;")
    private static class128 field786 = class129.method1017(false, "glow2:");

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Lsc;")
    private static class128 field785 = class129.method1017(false, "Members object");

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Lsc;")
    public static class128 field787 = field786;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "Lsc;")
    public static class128 field788 = field785;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lsc;")
    public static class128 field789 = field786;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method297(byte arg0) {
        field783 = null;
        field782 = null;
        field788 = null;
        field787 = null;
        field773 = null;
        int var1 = -49 % ((-arg0 - 13) / 36);
        field786 = null;
        field776 = null;
        field785 = null;
        field784 = null;
        field789 = null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)I")
    public abstract int method12(byte arg0);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIIII)V")
    public static final void method298(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field779++;
        if (arg0 != -15) {
            field782 = null;
        }
        for (class79 var5 = (class79) class1.field8.method920((byte) -88); var5 != null; var5 = (class79) class1.field8.method932(-6)) {
            if (var5.field1764 != -1 || var5.field1771 != null) {
                int var6 = 0;
                if (var5.field1773 < arg2) {
                    var6 += arg2 - var5.field1773;
                } else if (var5.field1774 > arg2) {
                    var6 += var5.field1774 - arg2;
                }
                if (arg4 > var5.field1766) {
                    var6 += arg4 - var5.field1766;
                } else if (arg4 < var5.field1779) {
                    var6 += var5.field1779 - arg4;
                }
                if (var5.field1775 < var6 - 64 || class143.field3348 == 0 || var5.field1778 != arg1) {
                    if (var5.field1761 != null) {
                        class92.field2088.method434(var5.field1761);
                        var5.field1761 = null;
                    }
                    if (var5.field1757 != null) {
                        class92.field2088.method434(var5.field1757);
                        var5.field1757 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1775 - var6) * class143.field3348 / var5.field1775;
                    if (var5.field1761 != null) {
                        var5.field1761.method801(var7);
                    } else if (var5.field1764 >= 0) {
                        class17 var8 = class17.method158(class108.field2446, var5.field1764, 0);
                        if (var8 != null) {
                            class139 var9 = var8.method157().method1144(class72.field1620);
                            class107 var10 = class107.method807(var9, 100, var7);
                            var10.method814(-1);
                            class92.field2088.method438(var10);
                            var5.field1761 = var10;
                        }
                    }
                    if (var5.field1757 != null) {
                        var5.field1757.method801(var7);
                        if (!var5.field1757.method171((byte) 104)) {
                            var5.field1757 = null;
                        }
                    } else if (var5.field1771 != null && (var5.field1769 -= arg3) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field1771.length);
                        class17 var12 = class17.method158(class108.field2446, var5.field1771[var11], 0);
                        if (var12 != null) {
                            class139 var13 = var12.method157().method1144(class72.field1620);
                            class107 var14 = class107.method807(var13, 100, var7);
                            var14.method814(0);
                            class92.field2088.method438(var14);
                            var5.field1757 = var14;
                            var5.field1769 = (int) ((double) (var5.field1765 - var5.field1752) * Math.random()) + var5.field1752;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lgf;Lgf;I)V")
    public static final void method299(class48 arg0, class48 arg1, int arg2) {
        field780++;
        if (class20.field387 == null) {
            class20.field387 = class65.method489(class154.field3552, true, class132.field3059, class135.field3184);
        }
        if (class43.field812 == null) {
            class43.field812 = class50.method392(class75.field1655, arg2 ^ 0x68, class135.field3184, class132.field3059);
        }
        if (class6.field94 == null) {
            class6.field94 = class50.method392(class121.field2752, arg2 ^ 0xFFFFFF81, class135.field3184, class132.field3059);
        }
        if (class72.field1610 == null) {
            class72.field1610 = class50.method392(class102.field2334, -43, class135.field3184, class132.field3059);
        }
        class138.method1136(0, 23, 765, 480, 0);
        class138.method1141(0, 0, 125, 23, 12425273, 9135624);
        class138.method1141(125, 0, 640, 23, 5197647, 2697513);
        arg1.method1070(class87.field1981, 62, 15, 0, -1);
        if (class72.field1610 != null) {
            class72.field1610[1].method430(140, 1);
            arg0.method1078(class73.field1627, 152, 10, 16777215, -1);
            class72.field1610[0].method430(140, 12);
            arg0.method1078(class127.field2885, 152, 21, 16777215, -1);
        }
        if (class6.field94 != null) {
            short var3 = 280;
            if (class143.field3346[0] == 0 && class55.field1231[0] == 0) {
                class6.field94[2].method430(var3, 4);
            } else {
                class6.field94[0].method430(var3, 4);
            }
            if (class143.field3346[0] == 0 && class55.field1231[0] == 1) {
                class6.field94[3].method430(var3 + 15, 4);
            } else {
                class6.field94[1].method430(var3 + 15, 4);
            }
            short var4 = 500;
            arg1.method1078(class65.field1447, var3 + 32, 17, 16777215, -1);
            short var5 = 390;
            short var6 = 610;
            if (class143.field3346[0] == 1 && class55.field1231[0] == 0) {
                class6.field94[2].method430(var5, 4);
            } else {
                class6.field94[0].method430(var5, 4);
            }
            if (class143.field3346[0] == 1 && class55.field1231[0] == 1) {
                class6.field94[3].method430(var5 + 15, 4);
            } else {
                class6.field94[1].method430(var5 + 15, 4);
            }
            arg1.method1078(class115.field2601, var5 + 32, 17, 16777215, -1);
            if (class143.field3346[0] == 2 && class55.field1231[0] == 0) {
                class6.field94[2].method430(var4, 4);
            } else {
                class6.field94[0].method430(var4, 4);
            }
            if (class143.field3346[0] == 2 && class55.field1231[0] == 1) {
                class6.field94[3].method430(var4 + 15, 4);
            } else {
                class6.field94[1].method430(var4 + 15, 4);
            }
            arg1.method1078(class121.field2758, var4 + 32, 17, 16777215, -1);
            if (class143.field3346[0] == 3 && class55.field1231[0] == 0) {
                class6.field94[2].method430(var6, 4);
            } else {
                class6.field94[0].method430(var6, 4);
            }
            if (class143.field3346[0] == 3 && class55.field1231[0] == 1) {
                class6.field94[3].method430(var6 + 15, 4);
            } else {
                class6.field94[1].method430(var6 + 15, 4);
            }
            arg1.method1078(class86.field1971, var6 + 32, 17, 16777215, -1);
        }
        class138.method1136(708, 4, 50, 16, 0);
        arg0.method1070(class125.field2833, 733, 16, 16777215, -1);
        class156.field3577 = -1;
        if (class20.field387 != null) {
            byte var7 = 88;
            int var8 = 765 / (var7 + 1);
            byte var9 = 19;
            int var10 = 480 / (var9 + 1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var8;
                if ((var8 - 1) * var10 >= class122.field2782) {
                    var8--;
                }
                if (class122.field2782 <= (var10 - 1) * var8) {
                    var10--;
                }
                if ((var10 - 1) * var8 >= class122.field2782) {
                    var10--;
                }
            } while (var10 != var11 || var8 != var12);
            int var13 = (765 - var7 * var8) / (var8 + 1);
            int var14 = (480 - var9 * var10) / (var10 + 1);
            if (var14 > 5) {
                var14 = 5;
            }
            if (var13 > 5) {
                var13 = 5;
            }
            int var15 = (480 - (var10 - 1) * var14 - var9 * var10) / 2;
            int var16 = var15 + 23;
            int var17 = (765 - var7 * var8 - (var8 - 1) * var13) / 2;
            int var18 = var17;
            int var19 = 0;
            for (int var20 = 0; var20 < class122.field2782; var20++) {
                class5 var21 = class23.field475[var20];
                boolean var22 = true;
                class128 var23 = class111.method857(var21.field64, (byte) 108);
                if (var21.field64 == -1) {
                    var22 = false;
                    var23 = class69.field1539;
                } else if (var21.field64 > 1980) {
                    var23 = class102.field2327;
                    var22 = false;
                }
                if (class64.field1380 >= var18 && class18.field330 >= var16 && var7 + var18 > class64.field1380 && class18.field330 < var9 + var16 && var22) {
                    class156.field3577 = var20;
                    class20.field387[var21.field66 ? 1 : 0].method43(var18, var16, 128, 16777215);
                } else {
                    class20.field387[var21.field66 ? 1 : 0].method40(var18, var16);
                }
                if (class43.field812 != null) {
                    class43.field812[var21.field52 + (var21.field66 ? 8 : 0)].method430(var18 + 29, var16);
                }
                arg1.method1070(class111.method857(var21.field54, (byte) 99), var18 + 15, var9 / 2 + var16 + 5, 0, -1);
                arg0.method1070(var23, var18 + 60, var16 - -(var9 / 2) + 5, 268435455, -1);
                var16 += var14 + var9;
                var19++;
                if (var10 <= var19) {
                    var19 = 0;
                    var18 += var7 + var13;
                    var16 = var15 + 23;
                }
            }
        }
        try {
            if (arg2 != 2) {
                field782 = null;
            }
            Graphics var24 = class127.field2888.getGraphics();
            class5.field51.method66((byte) 85, 0, var24, 0);
        } catch (Exception var25) {
            class127.field2888.repaint();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lsc;I)Z")
    public static final boolean method300(class128 arg0, int arg1) {
        field781++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != -22613) {
            method299(null, null, -72);
        }
        while (class151.field3476 > var2) {
            if (arg0.method1010(arg1 ^ 0xFFFFA7AA, class148.field3415[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method11(byte arg0, Component arg1);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
    public static final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0;
        if (arg1 != 10772) {
            field774 = 109;
        }
        while (arg0 + arg3 >= var5) {
            for (int var6 = arg2; var6 <= arg2 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class29.field559[0][var6][var5] = 127;
                    if (arg2 == var6 && var6 > 0) {
                        class55.field1229[0][var6][var5] = class55.field1229[0][var6 - 1][var5];
                    }
                    if (arg2 + arg4 == var6 && var6 < 103) {
                        class55.field1229[0][var6][var5] = class55.field1229[0][var6 + 1][var5];
                    }
                    if (arg0 == var5 && var5 > 0) {
                        class55.field1229[0][var6][var5] = class55.field1229[0][var6][var5 - 1];
                    }
                    if (arg0 + arg3 == var5 && var5 < 103) {
                        class55.field1229[0][var6][var5] = class55.field1229[0][var6][var5 + 1];
                    }
                }
            }
            var5++;
        }
        field772++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BZ)V")
    public static final void method302(byte arg0, boolean arg1) {
        if (arg0 <= 71) {
            field773 = null;
        }
        for (int var2 = 0; var2 < class41.field767; var2++) {
            class51 var3 = class92.field2104[class68.field1528[var2]];
            int var4 = (class68.field1528[var2] << 14) + 536870912;
            if (var3 != null && var3.method391(-30036) && arg1 == var3.field1028.field1283 && var3.field1028.method458(false)) {
                int var5 = var3.field975 >> 7;
                int var6 = var3.field987 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field960 == 1 && (var3.field975 & 0x7F) == 64 && (var3.field987 & 0x7F) == 64) {
                        if (class51.field1032[var5][var6] == class58.field1251) {
                            continue;
                        }
                        class51.field1032[var5][var6] = class58.field1251;
                    }
                    if (!var3.field1028.field1268) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class154.field3553.method106(class29.field553, var3.field975, var3.field987, class97.method755((var3.field960 - 1) * 64 + var3.field987, class29.field553, var3.field975 + var3.field960 * 64 - 64, 256), var3.field960 * 64 + 60 - 64, var3, var3.field1012, var4, var3.field984);
                }
            }
        }
        field775++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZII)I")
    public static final int method303(boolean arg0, int arg1, int arg2) {
        field778++;
        if (!arg0) {
            return 119;
        }
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method13(byte arg0, Component arg1);
}
