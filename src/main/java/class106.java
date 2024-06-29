import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class106 {

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lqk;")
    public static class207 field1886 = class24.method212(255, " s(West d-Bconnect-B)3");

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1883 = -1;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lqk;")
    public static class207 field1885 = class24.method212(255, "Veuillez commencer par supprimer ");

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Lse;")
    public static class204 field1888;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Ldc;")
    public class235 field1884;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lle;")
    public static class42 field1881;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[B")
    public static byte[] field1877;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "[[S")
    public static short[][] field1887;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[[[Lbc;IZIB)Z")
    public static final boolean method763(int arg0, class174[][][] arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        field1878++;
        byte var6 = arg3 ? 1 : (byte) (class89.field1609 & 0xFF);
        if (class16.field256[class93.field1645][arg4][arg2] == var6) {
            return false;
        } else if ((class271.field4791[class93.field1645][arg4][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class19.field315[var7] = arg4;
            int var31 = var7 + 1;
            class62.field1129[var7] = arg2;
            class16.field256[class93.field1645][arg4][arg2] = var6;
            if (arg5 < 122) {
                method763(111, (class174[][][]) null, -118, false, -73, (byte) -71);
            }
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class19.field315[var8] >> 16 & 0xFF;
                int var10 = class19.field315[var8] & 0xFFFF;
                int var11 = class62.field1129[var8] & 0xFFFF;
                int var12 = (class62.field1129[var8] & 0xFF59DF) >> 16;
                int var13 = class19.field315[var8] >> 24 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class271.field4791[class93.field1645][var10][var11] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label229: for (int var16 = class93.field1645 + 1; var16 <= 3; var16++) {
                    if ((class271.field4791[var16][var10][var11] & 0x8) == 0) {
                        if (var14 && arg1[var16][var10][var11] != null) {
                            if (arg1[var16][var10][var11].field3136 != null) {
                                int var19 = class92.method663(var9, -104);
                                if (arg1[var16][var10][var11].field3136.field3699 == var19 || arg1[var16][var10][var11].field3136.field3706 == var19) {
                                    continue;
                                }
                                if (var13 != 0) {
                                    int var20 = class92.method663(var13, -120);
                                    if (arg1[var16][var10][var11].field3136.field3699 == var20 || arg1[var16][var10][var11].field3136.field3706 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class92.method663(var12, -103);
                                    if (arg1[var16][var10][var11].field3136.field3699 == var21 || arg1[var16][var10][var11].field3136.field3706 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var10][var11].field3140 != null) {
                                for (int var22 = 0; var22 < arg1[var16][var10][var11].field3138; var22++) {
                                    int var23 = (int) (arg1[var16][var10][var11].field3140[var22].field5129 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg1[var16][var10][var11].field3140[var22].field5129 >> 20 & 0x3L);
                                    int var25 = var24 << 6 | var23;
                                    if (var9 == var25 || var13 != 0 && var13 == var25 || var12 != 0 && var12 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class174 var26 = arg1[var16][var10][var11];
                        if (var26 != null && var26.field3138 > 0) {
                            for (int var27 = 0; var27 < var26.field3138; var27++) {
                                class288 var28 = var26.field3140[var27];
                                if (var28.field5150 != var28.field5146 || var28.field5142 != var28.field5140) {
                                    for (int var29 = var28.field5150; var29 <= var28.field5146; var29++) {
                                        for (int var30 = var28.field5140; var30 <= var28.field5142; var30++) {
                                            class16.field256[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class16.field256[var16][var10][var11] = var6;
                    }
                }
                if (var15) {
                    if (class232.field4245[arg0] < class163.field2881[class93.field1645 + 1][var10][var11]) {
                        class232.field4245[arg0] = class163.field2881[class93.field1645 + 1][var10][var11];
                    }
                    int var17 = var10 << 7;
                    int var18 = var11 << 7;
                    if (class19.field320[arg0] > var17) {
                        class19.field320[arg0] = var17;
                    } else if (var17 > class207.field3687[arg0]) {
                        class207.field3687[arg0] = var17;
                    }
                    if (var18 < class20.field327[arg0]) {
                        class20.field327[arg0] = var18;
                    } else if (var18 > class121.field2097[arg0]) {
                        class121.field2097[arg0] = var18;
                    }
                }
                if (!var14) {
                    if (var10 >= 1 && class16.field256[class93.field1645][var10 - 1][var11] != var6) {
                        class19.field315[var31] = class281.method1906(class281.method1906(1179648, var10 - 1), -754974720);
                        class62.field1129[var31] = class281.method1906(var11, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class16.field256[class93.field1645][var10 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var10 - 1 >= 0 && class16.field256[class93.field1645][var10 - 1][var11] != var6 && (class271.field4791[class93.field1645][var10][var11] & 0x4) == 0 && (class271.field4791[class93.field1645][var10 - 1][var11 - 1] & 0x4) == 0) {
                            class19.field315[var31] = class281.method1906(1375731712, class281.method1906(var10 - 1, 1179648));
                            class62.field1129[var31] = class281.method1906(var11, 1245184);
                            var31 = var31 + 1 & 0xFFF;
                            class16.field256[class93.field1645][var10 - 1][var11] = var6;
                        }
                        if (class16.field256[class93.field1645][var10][var11] != var6) {
                            class19.field315[var31] = class281.method1906(318767104, class281.method1906(5373952, var10));
                            class62.field1129[var31] = class281.method1906(var11, 5439488);
                            class16.field256[class93.field1645][var10][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class16.field256[class93.field1645][var10 + 1][var11] != var6 && (class271.field4791[class93.field1645][var10][var11] & 0x4) == 0 && (class271.field4791[class93.field1645][var10 + 1][var11 - 1] & 0x4) == 0) {
                            class19.field315[var31] = class281.method1906(class281.method1906(5373952, var10 + 1), -1845493760);
                            class62.field1129[var31] = class281.method1906(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class16.field256[class93.field1645][var10 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if ((var10 + 1) < 104 && class16.field256[class93.field1645][var10 + 1][var11] != var6) {
                        class19.field315[var31] = class281.method1906(class281.method1906(var10 + 1, 9568256), 1392508928);
                        class62.field1129[var31] = class281.method1906(9633792, var11);
                        var31 = var31 + 1 & 0xFFF;
                        class16.field256[class93.field1645][var10 + 1][var11] = var6;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if (var10 - 1 >= 0 && class16.field256[class93.field1645][var10 - 1][var11] != var6 && (class271.field4791[class93.field1645][var10][var11] & 0x4) == 0 && (class271.field4791[class93.field1645][var10 - 1][var11 + 1] & 0x4) == 0) {
                            class19.field315[var31] = class281.method1906(301989888, class281.method1906(var10 - 1, 13762560));
                            class62.field1129[var31] = class281.method1906(13828096, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class16.field256[class93.field1645][var10 - 1][var11] = var6;
                        }
                        if (class16.field256[class93.field1645][var10][var11] != var6) {
                            class19.field315[var31] = class281.method1906(-1828716544, class281.method1906(var10, 13762560));
                            class62.field1129[var31] = class281.method1906(13828096, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class16.field256[class93.field1645][var10][var11] = var6;
                        }
                        if ((var10 + 1) < 104 && class16.field256[class93.field1645][var10 + 1][var11] != var6 && (class271.field4791[class93.field1645][var10][var11] & 0x4) == 0 && (class271.field4791[class93.field1645][var10 + 1][var11 + 1] & 0x4) == 0) {
                            class19.field315[var31] = class281.method1906(-771751936, class281.method1906(var10 + 1, 9568256));
                            class62.field1129[var31] = class281.method1906(9633792, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class16.field256[class93.field1645][var10 + 1][var11] = var6;
                        }
                    }
                }
            }
            if (class232.field4245[arg0] != -1000000) {
                class232.field4245[arg0] += 10;
                class19.field320[arg0] -= 50;
                class207.field3687[arg0] += 50;
                class121.field2097[arg0] += 50;
                class20.field327[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static final void method764(byte arg0) {
        field1880++;
        int var1 = class107.field1906;
        int var2 = class17.field267;
        if (arg0 <= 67) {
            field1883 = 1;
        }
        int var3 = class182.field3246 - class31.field625 - var2;
        int var4 = class215.field3821 - class244.field4428 - var1;
        if (var2 <= 0 && var3 <= 0 && var1 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class126.field2189 != null) {
                var5 = class126.field2189;
            } else if (class272.field4794 == null) {
                var5 = class20.field326.field4207;
            } else {
                var5 = class272.field4794;
            }
            int var6 = 0;
            int var7 = 0;
            if (class272.field4794 == var5) {
                Insets var8 = class272.field4794.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var2 > 0) {
                var9.fillRect(var6, var7, var2, class215.field3821);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class182.field3246, var1);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class182.field3246 - var3, var7, var3, class215.field3821);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class215.field3821 + var7 - var4, class182.field3246, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1882++;
        if (arg1 >= 1 && arg0 >= 1 && arg1 <= 102 && arg0 <= 102) {
            if (!class212.method1512(-97) && (class271.field4791[0][arg1][arg0] & 0x2) == 0) {
                int var8 = arg7;
                if ((class271.field4791[arg7][arg1][arg0] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class141.field2446 != var8) {
                    return;
                }
            }
            int var9 = arg7;
            if (arg7 < 3 && (class271.field4791[1][arg1][arg0] & 0x2) == 2) {
                var9 = arg7 + 1;
            }
            class176.method1258(false, arg7, arg1, arg0, class133.field2303[arg7], arg2, var9);
            if (arg5 >= 0) {
                boolean var10 = class278.field4884;
                class278.field4884 = true;
                class110.method787(arg1, false, false, arg5, arg6, arg3, arg7, var9, Integer.MAX_VALUE, class133.field2303[arg7], arg0);
                class278.field4884 = var10;
            }
        }
        int var11 = 109 / ((arg4 - 60) / 42);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method766(int arg0) {
        field1881 = null;
        field1877 = null;
        field1887 = null;
        field1888 = null;
        field1885 = null;
        if (arg0 == 0) {
            field1886 = null;
        }
    }
}
