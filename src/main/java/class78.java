import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class78 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "[J")
    public static long[] field1189 = new long[100];

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method608(Component arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I")
    public abstract int method609(int arg0);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method610(byte arg0) {
        class192.field3003++;
        if (arg0 != 91) {
            field1189 = null;
        }
        class240.field3826.method1762(105, true);
        for (class288 var1 = (class288) class48.field787.method2049(arg0 ^ 0x5B); var1 != null; var1 = (class288) class48.field787.method2047(94)) {
            if (var1.field4506 == 0) {
                class22.method192(true, var1, (byte) 114);
            }
        }
        field1187++;
        if (class260.field4115 != null) {
            class80.method628((byte) -87, class260.field4115);
            class260.field4115 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public static final void method611(int arg0, int arg1) {
        class254.field4063 = -1;
        class129.field1920 = arg1;
        class232.field3674 = -1;
        field1186++;
        class195.method1395(28690);
        if (arg0 <= 106) {
            field1189 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method612(int arg0) {
        if (arg0 < -95) {
            field1189 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method613(int arg0, int arg1, int arg2) {
        field1192++;
        if (arg0 != -18652) {
            return null;
        }
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method614(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != -19) {
            field1189 = null;
        }
        int var9 = arg5 - arg8;
        field1191++;
        int var10 = (arg6 - arg0 << 16) / var9;
        int var11 = arg7 - arg4;
        int var12 = (arg1 - arg2 << 16) / var11;
        class150.method1086(0, arg5, arg7, arg4, arg0, var10, var12, 0, arg2, 121, arg8);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method615(Component arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZIII)V")
    public static final void method616(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1190++;
        int var6 = arg3;
        if (!arg2) {
            return;
        }
        while (var6 <= arg1 + arg3) {
            for (int var11 = arg5; var11 <= (arg4 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class247.field3927[arg0][var11][var6] = 127;
                }
            }
            var6++;
        }
        for (int var7 = arg3; var7 < (arg1 + arg3); var7++) {
            for (int var10 = arg5; var10 < (arg4 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class233.field3684[arg0][var10][var7] = arg0 <= 0 ? 0 : class233.field3684[arg0 - 1][var10][var7];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var8 = arg3 + 1; var8 < (arg1 + arg3); var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class233.field3684[arg0][arg5][var8] = class233.field3684[arg0][arg5 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var9 = arg5 + 1; var9 < (arg4 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class233.field3684[arg0][var9][arg3] = class233.field3684[arg0][var9][arg3 - 1];
                }
            }
        }
        if (arg5 < 0 || arg3 < 0 || arg5 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 > 0 && class233.field3684[arg0][arg5 - 1][arg3] != 0) {
                class233.field3684[arg0][arg5][arg3] = class233.field3684[arg0][arg5 - 1][arg3];
                return;
            }
            if (arg3 > 0 && class233.field3684[arg0][arg5][arg3 - 1] != 0) {
                class233.field3684[arg0][arg5][arg3] = class233.field3684[arg0][arg5][arg3 - 1];
                return;
            }
            if (arg5 > 0 && arg3 > 0 && class233.field3684[arg0][arg5 - 1][arg3 - 1] != 0) {
                class233.field3684[arg0][arg5][arg3] = class233.field3684[arg0][arg5 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg5 > 0 && class233.field3684[arg0 - 1][arg5 - 1][arg3] != class233.field3684[arg0][arg5 - 1][arg3]) {
            class233.field3684[arg0][arg5][arg3] = class233.field3684[arg0][arg5 - 1][arg3];
            return;
        }
        if (arg3 > 0 && class233.field3684[arg0 - 1][arg5][arg3 - 1] != class233.field3684[arg0][arg5][arg3 - 1]) {
            class233.field3684[arg0][arg5][arg3] = class233.field3684[arg0][arg5][arg3 - 1];
            return;
        }
        if (arg5 > 0 && arg3 > 0 && class233.field3684[arg0 - 1][arg5 - 1][arg3 - 1] != class233.field3684[arg0][arg5 - 1][arg3 - 1]) {
            class233.field3684[arg0][arg5][arg3] = class233.field3684[arg0][arg5 - 1][arg3 - 1];
            return;
        }
    }
}
