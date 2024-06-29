import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class121 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field1765 = -1;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1766 = 0;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1769 = "skill: ";

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field1772 = 0;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "[I")
    public static int[] field1775 = new int[32];

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[I")
    public static int[] field1770 = new int[32];

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field1773 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[I")
    public static int[] field1767;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "[[[I")
    public static int[][][] field1771;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lwg;IIIII)V")
    public static final void method885(class178 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class80.field1158 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class106.field1537) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class232.field3724 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class286 var14 = class220.field3525[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class220.field3533[var11][var12 + 1][var13] + class220.field3533[var11][var12][var13] + class220.field3533[var11][var12][var13 + 1] + class220.field3533[var11][var12 + 1][var13 + 1]) / 4 - (class220.field3533[arg1][arg2 + 1][arg3] + class220.field3533[arg1][arg2][arg3] + class220.field3533[arg1][arg2][arg3 + 1] + class220.field3533[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class99 var16 = var14.field4526;
                                    if (var16 != null) {
                                        if (var16.field1466.method1304()) {
                                            arg0.method1298(var16.field1466, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1458 != null && var16.field1458.method1304()) {
                                            arg0.method1298(var16.field1458, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4541; var17++) {
                                        class166 var18 = var14.field4530[var17];
                                        if (var18 != null && var18.field2681.method1304() && (var18.field2678 == var12 || var7 == var12) && (var18.field2684 == var13 || var9 == var13)) {
                                            int var19 = var18.field2688 + 1 - var18.field2678;
                                            int var20 = var18.field2692 + 1 - var18.field2684;
                                            arg0.method1298(var18.field2681, (var18.field2678 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2684 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method886(byte arg0) {
        if (arg0 != -57) {
            return;
        }
        field1769 = null;
        field1770 = null;
        field1767 = null;
        field1775 = null;
        field1771 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BI)V")
    public static final void method887(byte[] arg0, int arg1) {
        class152 var2 = new class152(arg0);
        field1768++;
        var2.field2511 = arg0.length - 2;
        class143.field2318 = var2.method1126(false);
        class19.field214 = new int[class143.field2318];
        class201.field3220 = new int[class143.field2318];
        class272.field4377 = new int[class143.field2318];
        class8.field83 = new byte[class143.field2318][];
        class152.field2505 = new byte[class143.field2318][];
        class217.field3457 = new int[class143.field2318];
        if (arg1 != -24725) {
            method885((class178) null, 117, 53, 39, -37, -73);
        }
        class186.field3003 = new boolean[class143.field2318];
        var2.field2511 = arg0.length - (class143.field2318 * 8) - 7;
        class262.field4258 = var2.method1126(false);
        class62.field912 = var2.method1126(false);
        int var3 = (var2.method1111(arg1 ^ 0xFFFF9F94) & 0xFF) + 1;
        for (int var4 = 0; var4 < class143.field2318; var4++) {
            class217.field3457[var4] = var2.method1126(false);
        }
        for (int var5 = 0; var5 < class143.field2318; var5++) {
            class272.field4377[var5] = var2.method1126(false);
        }
        for (int var6 = 0; var6 < class143.field2318; var6++) {
            class19.field214[var6] = var2.method1126(false);
        }
        for (int var7 = 0; var7 < class143.field2318; var7++) {
            class201.field3220[var7] = var2.method1126(false);
        }
        var2.field2511 = arg0.length + 3 - (class143.field2318 * 8) - var3 * 3 - 7;
        class101.field1476 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class101.field1476[var8] = var2.method1128((byte) -88);
            if (class101.field1476[var8] == 0) {
                class101.field1476[var8] = 1;
            }
        }
        var2.field2511 = 0;
        for (int var9 = 0; var9 < class143.field2318; var9++) {
            int var10 = class19.field214[var9];
            int var11 = class201.field3220[var9];
            int var12 = var10 * var11;
            boolean var13 = false;
            byte[] var14 = new byte[var12];
            byte[] var15 = new byte[var12];
            class152.field2505[var9] = var15;
            class8.field83[var9] = var14;
            int var16 = var2.method1111(255);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var15[var17] = var2.method1092((byte) -62);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method1092((byte) -62);
                        var13 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var10) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var14[var10 * var22 + var21] = var2.method1092((byte) -62);
                                var13 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var15[var10 * var24 + var20] = var2.method1092((byte) -62);
                    }
                    var20++;
                }
            }
            class186.field3003[var9] = var13;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method888(Component arg0, boolean arg1) {
        if (!arg1) {
            arg0.addMouseListener(class276.field4431);
            field1774++;
            arg0.addMouseMotionListener(class276.field4431);
            arg0.addFocusListener(class276.field4431);
        }
    }
}
