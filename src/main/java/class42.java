import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class42 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lgd;")
    public class40 field892 = new class40();

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Lec;")
    public static class28 field901 = class28.method210(-46, "chatback");

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field905 = 0;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lpa;")
    public static class91 field888 = new class91(100);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
    public static int[] field907 = new int[50];

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[I")
    public static int[] field909 = new int[5];

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Lcc;")
    public static class16 field910;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Lgd;")
    private class40 field902;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILgd;)V")
    public final void method324(int arg0, class40 arg1) {
        if (arg1.field875 != null) {
            arg1.method319((byte) -126);
        }
        field906++;
        arg1.field873 = this.field892.field873;
        int var3 = 54 % ((arg0 + 1) / 43);
        arg1.field875 = this.field892;
        arg1.field875.field873 = arg1;
        arg1.field873.field875 = arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Lgd;")
    public final class40 method325(byte arg0) {
        class40 var2 = this.field902;
        field899++;
        if (arg0 < 117) {
            method336(115);
        }
        if (this.field892 == var2) {
            this.field902 = null;
            return null;
        } else {
            this.field902 = var2.field873;
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lgd;")
    public final class40 method326(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field889++;
        class40 var2 = this.field892.field873;
        if (this.field892 == var2) {
            this.field902 = null;
            return null;
        } else {
            this.field902 = var2.field873;
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lgd;ZLgd;)V")
    public final void method327(class40 arg0, boolean arg1, class40 arg2) {
        if (arg0.field875 != null) {
            arg0.method319((byte) 72);
        }
        arg0.field875 = arg2.field875;
        field891++;
        arg0.field873 = arg2;
        if (arg1) {
            field901 = null;
        }
        arg0.field875.field873 = arg0;
        arg0.field873.field875 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III[Lec;)Lec;")
    public static final class28 method328(int arg0, int arg1, int arg2, class28[] arg3) {
        int var4 = 0;
        field903++;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class56.field1283;
            }
            var4 += arg3[arg2 + var5].field606;
        }
        int var6 = -66 / ((16 - arg0) / 48);
        byte[] var7 = new byte[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class28 var11 = arg3[arg2 + var9];
            class84.method637(var11.field628, 0, var7, var8, var11.field606);
            var8 += var11.field606;
        }
        class28 var10 = new class28();
        var10.field628 = var7;
        var10.field606 = var4;
        return var10;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    public final void method329(byte arg0) {
        field904++;
        if (arg0 != -57) {
            return;
        }
        while (true) {
            class40 var2 = this.field892.field873;
            if (this.field892 == var2) {
                return;
            }
            var2.method319((byte) -28);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Lj;")
    public static final class54 method330(boolean arg0) {
        field897++;
        class54 var1 = new class54(class25.field552, class118.field2514, class62.field1382, class53.field1219, class123.field2682);
        if (arg0) {
            method328(-118, 29, 23, null);
        }
        class51.method409(-115);
        return var1;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Lgd;")
    public final class40 method331(int arg0) {
        field895++;
        if (arg0 != 0) {
            field907 = null;
        }
        class40 var2 = this.field902;
        if (this.field892 == var2) {
            this.field902 = null;
            return null;
        } else {
            this.field902 = var2.field875;
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)Lgd;")
    public final class40 method332(int arg0) {
        class40 var2 = this.field892.field875;
        field887++;
        if (arg0 != 1518) {
            method330(false);
        }
        if (this.field892 == var2) {
            this.field902 = null;
            return null;
        } else {
            this.field902 = var2.field875;
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZ)V")
    public static final void method333(int arg0, int arg1, boolean arg2) {
        field890++;
        if (!arg2) {
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class117.field2500[var4] != null) {
                int var5 = class22.field501[var4];
                int var6 = class21.field476 + 70 + 4 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                if (var5 == 0) {
                    var3++;
                }
                class28 var7 = class125.field2705[var4];
                if (var7 != null && var7.method208(class88.field1961, false)) {
                    var7 = var7.method218(5, false);
                }
                if (var7 != null && var7.method208(class63.field1394, false)) {
                    var7 = var7.method218(5, false);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class16.field317 == 0 || class16.field317 == 1 && class27.method200((byte) 25, var7))) {
                    if (var6 - 14 < arg0 && var6 >= arg0 && !var7.method219(105, class37.field848.field919)) {
                        class94.field2065++;
                        class118.field2517++;
                        if (class32.field691 >= 1) {
                            client.method124(-7765, class68.method537(1, new class28[] { class20.field444, var7 }), 0, 0, 36, 0);
                            class127.field2751++;
                        }
                        client.method124(-7765, class68.method537(1, new class28[] { class32.field687, var7 }), 0, 0, 45, 0);
                        client.method124(-7765, class68.method537(1, new class28[] { class61.field1374, var7 }), 0, 0, 13, 0);
                    }
                    var3++;
                }
                if ((var5 == 3 || var5 == 7) && class80.field1847 == 0 && (var5 == 7 || class126.field2735 == 0 || class126.field2735 == 1 && class27.method200((byte) 25, var7))) {
                    var3++;
                    if (arg0 > var6 - 14 && arg0 <= var6) {
                        class94.field2065++;
                        if (class32.field691 >= 1) {
                            class127.field2751++;
                            client.method124(-7765, class68.method537(1, new class28[] { class20.field444, var7 }), 0, 0, 36, 0);
                        }
                        class118.field2517++;
                        client.method124(-7765, class68.method537(1, new class28[] { class32.field687, var7 }), 0, 0, 45, 0);
                        client.method124(-7765, class68.method537(1, new class28[] { class61.field1374, var7 }), 0, 0, 13, 0);
                    }
                }
                if (var5 == 4 && (class112.field2418 == 0 || class112.field2418 == 1 && class27.method200((byte) 25, var7))) {
                    if (arg0 > var6 - 14 && arg0 <= var6) {
                        class76.field1712++;
                        client.method124(-7765, class68.method537(1, new class28[] { class9.field171, var7 }), 0, 0, 34, 0);
                    }
                    var3++;
                }
                if ((var5 == 5 || var5 == 6) && class80.field1847 == 0 && class126.field2735 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class112.field2418 == 0 || class112.field2418 == 1 && class27.method200((byte) 25, var7))) {
                    var3++;
                    if (arg0 > var6 - 14 && arg0 <= var6) {
                        class11.field177++;
                        client.method124(-7765, class68.method537(1, new class28[] { class36.field791, var7 }), 0, 0, 27, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[BIIIILta;IB[Lub;)V")
    public static final void method334(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, class111 arg7, int arg8, byte arg9, class117[] arg10) {
        field894++;
        if (arg9 >= -58) {
            return;
        }
        class119 var11 = new class119(arg2);
        int var12 = -1;
        while (true) {
            int var13 = var11.method899(-4);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method899(-4);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method879((byte) 45);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg1 == var18 && arg6 <= var16 && var16 < arg6 + 8 && var17 >= arg4 && arg4 + 8 > var17) {
                    class45 var22 = class72.method566(var12, 71);
                    int var23 = arg8 + class86.method642(var17 & 0x7, var22.field1002, var21, 1, arg3, var22.field979, var16 & 0x7);
                    int var24 = class55.method453(var22.field979, 39, var17 & 0x7, var21, var16 & 0x7, var22.field1002, arg3) + arg5;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg0;
                        if ((class47.field1080[1][var23][var24] & 0x2) == 2) {
                            var25 = arg0 - 1;
                        }
                        class117 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg10[var25];
                        }
                        class3.method16(var24, arg3 + var21 & 0x3, var12, arg7, var26, -2, var23, arg0, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lec;")
    public static final class28 method335(int arg0, int arg1, int arg2) {
        int var3 = arg1 - arg2;
        field898++;
        if (var3 < -9) {
            return class7.field118;
        } else if (var3 < -6) {
            return class13.field247;
        } else if (arg0 != 626) {
            return null;
        } else if (var3 < -3) {
            return class63.field1407;
        } else if (var3 < 0) {
            return class32.field683;
        } else if (var3 > 9) {
            return class112.field2421;
        } else if (var3 > 6) {
            return class22.field514;
        } else if (var3 > 3) {
            return class106.field2248;
        } else if (var3 > 0) {
            return class40.field871;
        } else {
            return class124.field2699;
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public static void method336(int arg0) {
        if (arg0 != 27025) {
            method330(true);
        }
        field888 = null;
        field907 = null;
        field910 = null;
        field901 = null;
        field909 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(ILgd;)V")
    public final void method337(int arg0, class40 arg1) {
        if (arg1.field875 != null) {
            arg1.method319((byte) -45);
        }
        arg1.field873 = this.field892;
        field893++;
        arg1.field875 = this.field892.field875;
        arg1.field875.field873 = arg1;
        if (arg0 == 25563) {
            arg1.field873.field875 = arg1;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)Lgd;")
    public final class40 method338(byte arg0) {
        if (arg0 != 108) {
            method330(false);
        }
        field896++;
        class40 var2 = this.field892.field875;
        if (this.field892 == var2) {
            return null;
        } else {
            var2.method319((byte) -126);
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)Lgd;")
    public final class40 method339(int arg0) {
        int var2 = 2 % ((28 - arg0) / 57);
        class40 var3 = this.field892.field873;
        field900++;
        if (this.field892 == var3) {
            return null;
        } else {
            var3.method319((byte) -126);
            return var3;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class42() {
        this.field892.field875 = this.field892;
        this.field892.field873 = this.field892;
    }
}
