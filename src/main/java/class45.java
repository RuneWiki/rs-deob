import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class45 extends class99 {

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "[I")
    private int[] field1105 = new int[6];

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "Z")
    public boolean field1106 = false;

    @OriginalMember(owner = "client!h", name = "mb", descriptor = "[I")
    private int[] field1113 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!h", name = "pb", descriptor = "[I")
    private int[] field1116 = new int[6];

    @OriginalMember(owner = "client!h", name = "ub", descriptor = "I")
    public int field1121 = -1;

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
    public static int field1108 = -1;

    @OriginalMember(owner = "client!h", name = "rb", descriptor = "Lpd;")
    public static class94 field1118 = class28.method249(126, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!h", name = "kb", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!h", name = "nb", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!h", name = "qb", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!h", name = "sb", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!h", name = "tb", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!h", name = "ob", descriptor = "[I")
    private int[] field1115;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Luc;BI)V", line = 9)
    private final void method332(class122 arg0, byte arg1, int arg2) {
        field1111++;
        if (arg2 == 1) {
            this.field1121 = arg0.method943(-1025);
        } else if (arg2 == 2) {
            int var4 = arg0.method943(-1025);
            this.field1115 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1115[var5] = arg0.method938((byte) 52);
            }
        } else if (arg2 == 3) {
            this.field1106 = true;
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field1116[arg2 - 40] = arg0.method938((byte) 92);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field1105[arg2 - 50] = arg0.method938((byte) -117);
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field1113[arg2 - 60] = arg0.method938((byte) 118);
        }
        if (arg1 <= 114) {
            this.field1105 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Lpd;", line = 56)
    public static final class94 method333(byte arg0, int arg1) {
        field1103++;
        if (arg1 < 999999999) {
            return class51.method403(arg1, true);
        } else if (arg0 == -92) {
            return class81.field2070;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Luc;Z)V", line = 93)
    public final void method334(class122 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method943(-1025);
            if (var3 == 0) {
                if (!arg1) {
                    field1117 = -82;
                }
                field1114++;
                return;
            }
            this.method332(arg0, (byte) 119, var3);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 114)
    public static void method335(int arg0) {
        field1118 = null;
        if (arg0 != -4308) {
            field1117 = 40;
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)Lia;", line = 128)
    public final class48 method336(int arg0) {
        field1110++;
        if (this.field1115 == null) {
            return null;
        }
        class48[] var2 = new class48[this.field1115.length];
        if (arg0 != 3) {
            return null;
        }
        for (int var3 = 0; var3 < this.field1115.length; var3++) {
            var2[var3] = class48.method364(class122.field3079, this.field1115[var3], 0);
        }
        class48 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class48(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1116[var5] != 0; var5++) {
            var4.method363(this.field1116[var5], this.field1105[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(B)Z", line = 170)
    public final boolean method337(byte arg0) {
        field1109++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1113[var3] != -1 && !class122.field3079.method822(this.field1113[var3], 18345, 0)) {
                var2 = false;
            }
        }
        int var4 = -95 % ((-arg0 - 42) / 48);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)Lia;", line = 195)
    public final class48 method338(int arg0) {
        field1104++;
        class48[] var2 = new class48[5];
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 9571) {
            field1108 = 126;
        }
        while (var4 < 5) {
            if (this.field1113[var4] != -1) {
                var2[var3++] = class48.method364(class122.field3079, this.field1113[var4], 0);
            }
            var4++;
        }
        class48 var5 = new class48(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field1116[var6] != 0; var6++) {
            var5.method363(this.field1116[var6], this.field1105[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(B)Z", line = 239)
    public final boolean method339(byte arg0) {
        field1112++;
        if (this.field1115 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1115.length; var3++) {
            if (!class122.field3079.method822(this.field1115[var3], arg0 + 18322, 0)) {
                var2 = false;
            }
        }
        if (arg0 == 23) {
            return var2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(B)V", line = 281)
    public static final void method340(byte arg0) {
        field1119++;
        class123.method967((byte) -15);
        if (class25.field691 == 2) {
            byte[] var1 = class86.field2198.field105;
            int[] var2 = class130.field3242;
            int var3 = var1.length;
            for (int var4 = 0; var4 < var3; var4++) {
                if (var1[var4] == 0) {
                    var2[var4] = 0;
                }
            }
            class30.field852.method867(0, 0, 33, 33, 25, 25, class107.field2668, 256, class88.field2272, class27.field738);
            class90.method676((byte) -79);
            return;
        }
        int var5 = class80.field2044.field177 / 32 + 48;
        int var6 = class119.field2976 + class107.field2668 & 0x7FF;
        int var7 = 464 - class80.field2044.field222 / 32;
        class89.field2292.method867(25, 5, 146, 151, var5, var7, var6, class50.field1244 + 256, class115.field2909, class75.field1823);
        for (int var8 = 0; var8 < class67.field1641; var8++) {
            int var38 = class29.field845[var8] * 4 + 2 - class80.field2044.field177 / 32;
            int var39 = class112.field2823[var8] * 4 + 2 - class80.field2044.field222 / 32;
            class69.method508(89, var38, class62.field1521[var8], var39);
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var34 = 0; var34 < 104; var34++) {
                class119 var35 = class9.field243[class64.field1589][var9][var34];
                if (var35 != null) {
                    int var36 = var9 * 4 + 2 - class80.field2044.field177 / 32;
                    int var37 = var34 * 4 + 2 - class80.field2044.field222 / 32;
                    class69.method508(103, var36, class135.field3321[0], var37);
                }
            }
        }
        for (int var10 = 0; var10 < class115.field2906; var10++) {
            class80 var30 = class28.field803[class95.field2442[var10]];
            if (var30 != null && var30.method48((byte) -126)) {
                class113 var31 = var30.field2037;
                if (var31.field2850 != null) {
                    var31 = var31.method836(-122);
                }
                if (var31 != null && var31.field2870 && var31.field2844) {
                    int var32 = var30.field177 / 32 - class80.field2044.field177 / 32;
                    int var33 = var30.field222 / 32 - class80.field2044.field222 / 32;
                    class69.method508(112, var32, class135.field3321[1], var33);
                }
            }
        }
        for (int var11 = 0; var11 < class113.field2886; var11++) {
            class89 var22 = class85.field2138[class38.field985[var11]];
            if (var22 != null && var22.method48((byte) -121)) {
                boolean var23 = false;
                int var24 = var22.field177 / 32 - class80.field2044.field177 / 32;
                int var25 = var22.field222 / 32 - class80.field2044.field222 / 32;
                long var26 = var22.field2295.method709((byte) 116);
                for (int var28 = 0; var28 < class77.field1963; var28++) {
                    if (class10.field265[var28] == var26 && class72.field1723[var28] != 0) {
                        var23 = true;
                        break;
                    }
                }
                boolean var29 = false;
                if (class80.field2044.field2306 != 0 && var22.field2306 != 0 && class80.field2044.field2306 == var22.field2306) {
                    var29 = true;
                }
                if (var23) {
                    class69.method508(124, var24, class135.field3321[3], var25);
                } else if (var29) {
                    class69.method508(124, var24, class135.field3321[4], var25);
                } else {
                    class69.method508(108, var24, class135.field3321[2], var25);
                }
            }
        }
        if (arg0 <= 75) {
            field1108 = -8;
        }
        if (class103.field2605 != 0 && class26.field699 % 20 < 10) {
            if (class103.field2605 == 1 && class95.field2438 >= 0 && class28.field803.length > class95.field2438) {
                class80 var12 = class28.field803[class95.field2438];
                if (var12 != null) {
                    int var13 = var12.field177 / 32 - class80.field2044.field177 / 32;
                    int var14 = var12.field222 / 32 - class80.field2044.field222 / 32;
                    class42.method313((byte) -65, var13, class75.field1834[1], var14);
                }
            }
            if (class103.field2605 == 2) {
                int var15 = (class43.field1078 - field1117) * 4 + 2 - class80.field2044.field222 / 32;
                int var16 = (class90.field2346 - class31.field891) * 4 + 2 - class80.field2044.field177 / 32;
                class42.method313((byte) -24, var16, class75.field1834[1], var15);
            }
            if (class103.field2605 == 10 && class17.field424 >= 0 && class85.field2138.length > class17.field424) {
                class89 var17 = class85.field2138[class17.field424];
                if (var17 != null) {
                    int var18 = var17.field222 / 32 - class80.field2044.field222 / 32;
                    int var19 = var17.field177 / 32 - class80.field2044.field177 / 32;
                    class42.method313((byte) -43, var19, class75.field1834[1], var18);
                }
            }
        }
        if (class14.field355 != 0) {
            int var20 = class12.field306 * 4 + 2 - class80.field2044.field222 / 32;
            int var21 = class14.field355 * 4 + 2 - class80.field2044.field177 / 32;
            class69.method508(97, var21, class75.field1834[0], var20);
        }
        class130.method1028(97, 78, 3, 3, 16777215);
        class30.field852.method867(0, 0, 33, 33, 25, 25, class107.field2668, 256, class88.field2272, class27.field738);
        class90.method676((byte) -104);
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Z)V", line = 490)
    public static final void method341(boolean arg0) {
        field1120++;
        try {
            Graphics var1 = class128.field3218.getGraphics();
            if (arg0) {
                field1118 = null;
            }
            class135.field3319.method498(4, 4, (byte) -12, var1);
        } catch (Exception var2) {
            class128.field3218.repaint();
        }
    }
}
