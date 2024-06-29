import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class46 extends class2 {

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "[I")
    public static int[] field1107 = new int[200];

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Lkc;")
    public static class67 field1110 = class19.method144("lila:", 111);

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field1115 = 2;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lkc;")
    public static class67 field1112 = class19.method144("Zu viele Verbindungen von Ihrer Adresse)3", 91);

    @OriginalMember(owner = "client!h", name = "C", descriptor = "Lkc;")
    public static class67 field1122 = class19.method144("Handel akzeptieren", 124);

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Lkc;")
    public static class67 field1120 = class19.method144("@whi@", 116);

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Lac;")
    public static class4 field1108;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "[I")
    public static int[] field1111;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[I")
    public static int[] field1121;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Lsd;", line = 5)
    public static final class116 method383(int arg0, int arg1) {
        field1117++;
        class116 var2 = (class116) class10.field207.method373((byte) 109, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class64.field1521.method27(arg1, true, arg0);
        class116 var4 = new class116();
        if (var3 != null) {
            var4.method924(new class140(var3), (byte) -42);
        }
        class10.field207.method374(arg0 - 16, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lbf;IBLje;)V", line = 39)
    public static final void method384(class14 arg0, int arg1, byte arg2, class63 arg3) {
        byte[] var4 = null;
        class10 var5 = class58.field1369;
        synchronized (class58.field1369) {
            if (arg2 > -13) {
                return;
            }
            for (class38 var6 = (class38) class58.field1369.method83(64); var6 != null; var6 = (class38) class58.field1369.method81(-85)) {
                if ((long) arg1 == var6.field22 && var6.field869 == arg0 && var6.field872 == 0) {
                    var4 = var6.field884;
                    break;
                }
            }
        }
        field1123++;
        if (var4 == null) {
            byte[] var7 = arg0.method117(false, arg1);
            arg3.method482(var7, false, arg1, true, arg0);
        } else {
            arg3.method482(var4, false, arg1, true, arg0);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZ[B)V", line = 82)
    public static final void method385(int arg0, int arg1, boolean arg2, byte[] arg3) {
        field1113++;
        if (class52.field1280 == null) {
            return;
        }
        if (class97.field2189 >= 0) {
            class52.field1280.method450(arg1 - 13569);
            class48.field1163 = 20;
            client.field465 = null;
            class119.field2805 = 0;
            class97.field2189 = -1;
        }
        if (arg3 != null) {
            if (class48.field1163 > 0) {
                class52.field1280.method447(arg0, false);
                class48.field1163 = 0;
            }
            class97.field2189 = arg0;
            class52.field1280.method448(arg2, arg3, arg0, -100);
        }
        if (arg1 != 7833) {
            method390(116);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)V", line = 118)
    public static final void method386(boolean arg0, int arg1) {
        if (arg0) {
            field1122 = null;
        }
        field1118++;
        int[] var2 = class7.field158.field2015;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class21.field443[arg1][var21][var5] & 0x18) == 0) {
                    class103.field2332.method897(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class21.field443[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class103.field2332.method897(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class7.field158.method672();
        int var6 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var7 = (int) (Math.random() * 20.0D) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class21.field443[arg1][var19][var8] & 0x18) == 0) {
                    class38.method307(var7, arg0, arg1, var6, var8, var19);
                }
                if (arg1 < 3 && (class21.field443[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class38.method307(var7, false, arg1 + 1, var6, var8, var19);
                }
            }
        }
        class30.field631 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class103.field2332.method882(class112.field2593, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class2.method12(var12, 21876).field2375;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class14.field295[class112.field2593].field98;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var9 - 3 < var14 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class58.field1373[class30.field631] = class71.field1685[var13];
                        class111.field2539[class30.field631] = var14;
                        class134.field3202[class30.field631] = var15;
                        class30.field631++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZ[BI)Lkc;", line = 280)
    public static final class67 method387(int arg0, boolean arg1, byte[] arg2, int arg3) {
        field1116++;
        class67 var4 = new class67();
        var4.field1597 = new byte[arg3];
        var4.field1572 = 0;
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            if (arg2[var5] != 0) {
                var4.field1597[var4.field1572++] = arg2[var5];
            }
        }
        if (!arg1) {
            field1112 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILac;)V", line = 313)
    public static final void method388(int arg0, class4 arg1) {
        if (arg0 != 238) {
            field1107 = null;
        }
        class64.field1521 = arg1;
        field1124++;
        class117.field2767 = class64.field1521.method45(-124, 16);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 325)
    public static final void method389(int arg0) {
        if (arg0 != 1385) {
            method391((byte) -46);
        }
        field1109++;
        if (class94.field2156 != null) {
            class12 var1 = class94.field2156;
            synchronized (class94.field2156) {
                class94.field2156 = null;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V", line = 352)
    public static void method390(int arg0) {
        field1122 = null;
        field1110 = null;
        field1108 = null;
        field1111 = null;
        field1120 = null;
        field1121 = null;
        field1112 = null;
        field1107 = null;
        if (arg0 != -22039) {
            method389(-3);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 369)
    public static final void method391(byte arg0) {
        if (arg0 >= -71) {
            field1110 = null;
        }
        field1114++;
        class99.field2220.method378((byte) -113);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 379)
    public class46() {
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V", line = 381)
    public class46(int arg0) {
        this.field1119 = arg0;
    }
}
