import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class280 {

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4634 = "Connecting to update server";

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lkf;")
    public static class193 field4632 = new class193(64);

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "[J")
    public static long[] field4637 = new long[500];

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field4639 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "[[[Lab;")
    public static class154[][][] field4638;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIBZIII)V")
    public static final void method1947(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, boolean arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var27 = 0; var27 < 104; var27++) {
                class171.field2647[var11][var27] = 0;
                class304.field4963[var11][var27] = 99999999;
            }
        }
        field4635++;
        class171.field2647[arg10][arg2] = 99;
        class304.field4963[arg10][arg2] = 0;
        int var12 = arg10;
        byte var13 = 0;
        class11.field140[var13] = arg10;
        int var14 = arg2;
        int var28 = var13 + 1;
        class171.field2652[var13] = arg2;
        int var15 = 0;
        boolean var16 = false;
        int[][] var17 = class183.field2841[class165.field2600].field2211;
        while (var28 != var15) {
            var12 = class11.field140[var15];
            var14 = class171.field2652[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg5 == var12 && arg4 == var14) {
                var16 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class183.field2841[class165.field2600].method960(arg8 - 1, arg0, 9270, arg4, 1, arg5, var14, var12)) {
                    var16 = true;
                    break;
                }
                if (arg8 < 10 && class183.field2841[class165.field2600].method962(arg4, var14, arg8 - 1, 1, arg0, (byte) -47, var12, arg5)) {
                    var16 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg1 != 0 && class183.field2841[class165.field2600].method958(arg5, 1, arg4, arg1, (byte) 105, var14, var12, arg9, arg3)) {
                var16 = true;
                break;
            }
            int var26 = class304.field4963[var12][var14] + 1;
            if (var12 > 0 && class171.field2647[var12 - 1][var14] == 0 && (var17[var12 - 1][var14] & 0x2C0108) == 0) {
                class11.field140[var28] = var12 - 1;
                class171.field2652[var28] = var14;
                class171.field2647[var12 - 1][var14] = 2;
                class304.field4963[var12 - 1][var14] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 < 103 && class171.field2647[var12 + 1][var14] == 0 && (var17[var12 + 1][var14] & 0x2C0180) == 0) {
                class11.field140[var28] = var12 + 1;
                class171.field2652[var28] = var14;
                var28 = var28 + 1 & 0xFFF;
                class171.field2647[var12 + 1][var14] = 8;
                class304.field4963[var12 + 1][var14] = var26;
            }
            if (var14 > 0 && class171.field2647[var12][var14 - 1] == 0 && (var17[var12][var14 - 1] & 0x2C0102) == 0) {
                class11.field140[var28] = var12;
                class171.field2652[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class171.field2647[var12][var14 - 1] = 1;
                class304.field4963[var12][var14 - 1] = var26;
            }
            if (var14 < 103 && class171.field2647[var12][var14 + 1] == 0 && (var17[var12][var14 + 1] & 0x2C0120) == 0) {
                class11.field140[var28] = var12;
                class171.field2652[var28] = var14 + 1;
                class171.field2647[var12][var14 + 1] = 4;
                class304.field4963[var12][var14 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 > 0 && var14 > 0 && class171.field2647[var12 - 1][var14 - 1] == 0 && (var17[var12 - 1][var14 - 1] & 0x2C010E) == 0 && (var17[var12 - 1][var14] & 0x2C0108) == 0 && (var17[var12][var14 - 1] & 0x2C0102) == 0) {
                class11.field140[var28] = var12 - 1;
                class171.field2652[var28] = var14 - 1;
                class171.field2647[var12 - 1][var14 - 1] = 3;
                var28 = var28 + 1 & 0xFFF;
                class304.field4963[var12 - 1][var14 - 1] = var26;
            }
            if (var12 < 103 && var14 > 0 && class171.field2647[var12 + 1][var14 - 1] == 0 && (var17[var12 + 1][var14 - 1] & 0x2C0183) == 0 && (var17[var12 + 1][var14] & 0x2C0180) == 0 && (var17[var12][var14 - 1] & 0x2C0102) == 0) {
                class11.field140[var28] = var12 + 1;
                class171.field2652[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class171.field2647[var12 + 1][var14 - 1] = 9;
                class304.field4963[var12 + 1][var14 - 1] = var26;
            }
            if (var12 > 0 && var14 < 103 && class171.field2647[var12 - 1][var14 + 1] == 0 && (var17[var12 - 1][var14 + 1] & 0x2C0138) == 0 && (var17[var12 - 1][var14] & 0x2C0108) == 0 && (var17[var12][var14 + 1] & 0x2C0120) == 0) {
                class11.field140[var28] = var12 - 1;
                class171.field2652[var28] = var14 + 1;
                class171.field2647[var12 - 1][var14 + 1] = 6;
                class304.field4963[var12 - 1][var14 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 < 103 && var14 < 103 && class171.field2647[var12 + 1][var14 + 1] == 0 && (var17[var12 + 1][var14 + 1] & 0x2C01E0) == 0 && (var17[var12 + 1][var14] & 0x2C0180) == 0 && (var17[var12][var14 + 1] & 0x2C0120) == 0) {
                class11.field140[var28] = var12 + 1;
                class171.field2652[var28] = var14 + 1;
                class171.field2647[var12 + 1][var14 + 1] = 12;
                class304.field4963[var12 + 1][var14 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
        }
        if (!var16) {
            if (!arg7) {
                return;
            }
            int var18 = 100;
            int var19 = 1000;
            byte var20 = 10;
            for (int var21 = arg5 - var20; var21 <= (arg5 + var20); var21++) {
                for (int var22 = arg4 - var20; var22 <= arg4 + var20; var22++) {
                    if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && class304.field4963[var21][var22] < 100) {
                        int var23 = 0;
                        int var24 = 0;
                        if (arg4 > var22) {
                            var24 = arg4 - var22;
                        } else if ((arg4 + arg1 - 1) < var22) {
                            var24 = 1 - (arg1 + arg4 - var22);
                        }
                        if (arg5 > var21) {
                            var23 = arg5 - var21;
                        } else if ((arg5 + arg3 - 1) < var21) {
                            var23 = -arg5 - (-var21 - 1) - arg3;
                        }
                        int var25 = var23 * var23 + var24 * var24;
                        if (var25 < var19 || var19 == var25 && var18 > class304.field4963[var21][var22]) {
                            var18 = class304.field4963[var21][var22];
                            var14 = var22;
                            var12 = var21;
                            var19 = var25;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return;
            }
            if (arg10 == var12 && arg2 == var14) {
                return;
            }
        }
        if (arg6 < 37) {
            method1948(30);
        }
        client.field2582 = false;
        class271.field4443 = var14;
        class281.field4649 = var12;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method1948(int arg0) {
        field4638 = null;
        field4634 = null;
        field4637 = null;
        if (arg0 != 1) {
            method1950((class206) null, true);
        }
        field4632 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method1949(boolean arg0, Component arg1) {
        if (arg0) {
            return;
        }
        field4631++;
        Method var2 = class255.field4220;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class73.field1080);
        arg1.addFocusListener(class73.field1080);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lgg;Z)V")
    public static final void method1950(class206 arg0, boolean arg1) {
        if (arg0.field3305 != null) {
            arg0.field3305.field2097 = 0;
        }
        field4636++;
        arg0.field3306 = false;
        if (!arg1) {
            method1947(-48, 9, 32, 59, -23, -17, (byte) -8, false, -82, 2, -58);
        }
        for (class206 var2 = arg0.method596(); var2 != null; var2 = arg0.method587()) {
            method1950(var2, true);
        }
    }
}
