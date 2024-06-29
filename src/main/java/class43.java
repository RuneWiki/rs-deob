import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 extends Canvas {

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field1149;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lid;")
    public static class60 field1136 = class11.method72("Benutzen Sie bitte eine andere Welt)3", (byte) 100);

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lid;")
    private static class60 field1138 = class11.method72("Your profile will be transferred in:", (byte) -48);

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lid;")
    public static class60 field1145 = class11.method72(" )2>", (byte) 101);

    @OriginalMember(owner = "client!g", name = "l", descriptor = "[[B")
    public static byte[][] field1147 = new byte[250][];

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lid;")
    public static class60 field1137 = class11.method72("Wir vermuten)1 dass Ihr Konto gestohlen wurde", (byte) -121);

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field1153 = 0;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "[I")
    public static int[] field1150 = new int[100];

    @OriginalMember(owner = "client!g", name = "g", descriptor = "[B")
    public static byte[] field1142 = new byte[520];

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field1157 = 0;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lid;")
    private static class60 field1140 = class11.method72("slide:", (byte) 2);

    @OriginalMember(owner = "client!g", name = "w", descriptor = "[I")
    public static int[] field1158 = new int[2000];

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Lid;")
    public static class60 field1156 = field1138;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lid;")
    public static class60 field1148 = field1140;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Lid;")
    public static class60 field1154 = field1140;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Ll;")
    public static class76 field1151;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method337(int arg0, int arg1) {
        field1155++;
        int[] var2 = class30.field700.field89;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class124.field2869[arg0][var21][var5] & 0x18) == 0) {
                    field1151.method594(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class124.field2869[arg0 + 1][var21][var5] & 0x8) != 0) {
                    field1151.method594(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class30.field700.method40();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - arg1 << 8) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class124.field2869[arg0][var19][var8] & 0x18) == 0) {
                    class40.method310(var8, arg1 ^ 0xA, var19, var6, arg0, var7);
                }
                if (arg0 < 3 && (class124.field2869[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class40.method310(var8, 0, var19, var6, arg0 + 1, var7);
                }
            }
        }
        class64.field1608 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = field1151.method592(class46.field1222, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class31.method238(-29628, var12).field3316;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class133.field3030[class46.field1222].field2602;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var9 - 3 < var15 && (var16[var15 - 1][var14] & 0x12C0108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var15 < var9 + 3 && (var16[var15 + 1][var14] & 0x12C0180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var10 - 3 < var14 && (var16[var15][var14 - 1] & 0x12C0102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var10 + 3 > var14 && (var16[var15][var14 + 1] & 0x12C0120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class42.field1120[class64.field1608] = class157.field3610[var13];
                        class90.field2252[class64.field1608] = var15;
                        class74.field1792[class64.field1608] = var14;
                        class64.field1608++;
                    }
                }
            }
        }
        class69.field1660.method1156(85);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lie;Lie;I)V")
    public static final void method338(class61 arg0, class61 arg1, int arg2) {
        class131.field2977 = arg0;
        class145.field3269 = arg1;
        if (arg2 != -47) {
            field1142 = null;
        }
        field1144++;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class43(Component arg0) {
        this.field1149 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1141++;
        this.field1149.update(arg0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static void method339(boolean arg0) {
        field1145 = null;
        field1138 = null;
        field1148 = null;
        field1156 = null;
        field1151 = null;
        field1142 = null;
        field1150 = null;
        if (!arg0) {
            return;
        }
        field1154 = null;
        field1140 = null;
        field1147 = null;
        field1158 = null;
        field1136 = null;
        field1137 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Z")
    public static final boolean method340(int arg0, byte arg1) {
        field1159++;
        int var2 = 25 % ((arg1 + 90) / 34);
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([II[III[Lea;)V")
    public static final void method341(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, class30[] arg5) {
        field1146++;
        if (arg1 > arg4) {
            int var6 = arg4 - 1;
            int var7 = arg1 + 1;
            int var8 = (arg1 + arg4) / 2;
            class30 var9 = arg5[var8];
            arg5[var8] = arg5[arg4];
            arg5[arg4] = var9;
            while (var7 > var6) {
                boolean var10 = true;
                do {
                    var7--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg2[var11] == 2) {
                            var13 = var9.field714;
                            var12 = arg5[var7].field714;
                        } else if (arg2[var11] == 1) {
                            var12 = arg5[var7].field715;
                            var13 = var9.field715;
                            if (var13 == -1 && arg0[var11] == 1) {
                                var13 = 2001;
                            }
                            if (var12 == -1 && arg0[var11] == 1) {
                                var12 = 2001;
                            }
                        } else if (arg2[var11] == 3) {
                            var13 = var9.field699 ? 1 : 0;
                            var12 = arg5[var7].field699 ? 1 : 0;
                        } else {
                            var13 = var9.field703;
                            var12 = arg5[var7].field703;
                        }
                        if (var12 != var13) {
                            if ((arg0[var11] != 1 || var12 <= var13) && (arg0[var11] != 0 || var13 <= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var6++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg2[var15] == 2) {
                            var16 = var9.field714;
                            var17 = arg5[var6].field714;
                        } else if (arg2[var15] == 1) {
                            var17 = arg5[var6].field715;
                            var16 = var9.field715;
                            if (var17 == -1 && arg0[var15] == 1) {
                                var17 = 2001;
                            }
                            if (var16 == -1 && arg0[var15] == 1) {
                                var16 = 2001;
                            }
                        } else if (arg2[var15] == 3) {
                            var16 = var9.field699 ? 1 : 0;
                            var17 = arg5[var6].field699 ? 1 : 0;
                        } else {
                            var17 = arg5[var6].field703;
                            var16 = var9.field703;
                        }
                        if (var16 != var17) {
                            if ((arg0[var15] != 1 || var16 <= var17) && (arg0[var15] != 0 || var17 <= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var6 < var7) {
                    class30 var18 = arg5[var6];
                    arg5[var6] = arg5[var7];
                    arg5[var7] = var18;
                }
            }
            method341(arg0, var7, arg2, 68, arg4, arg5);
            method341(arg0, arg1, arg2, -92, var7 + 1, arg5);
        }
        int var19 = 50 % ((arg3 - 12) / 52);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lid;ILid;I)V")
    public static final void method342(class60 arg0, int arg1, class60 arg2, int arg3) {
        if (arg3 != 2001) {
            field1150 = null;
        }
        class2.method6((byte) 109, null, arg2, arg0, arg1);
        field1139++;
    }

    @OriginalMember(owner = "client!g", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1149.paint(arg0);
        field1152++;
    }
}
