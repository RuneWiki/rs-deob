import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class364 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5354 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lnn;")
    public static class151 field5359 = new class151("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lsc;")
    public static class239 field5351;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[B")
    public static byte[] field5350;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIB)V")
    public static final void method2183(int arg0, int arg1, int arg2, byte arg3) {
        class37.field451 = arg1;
        class180.field2714 = arg0;
        int var4 = 75 / ((arg3 - 47) / 57);
        class455.field6755 = arg2;
        field5358++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZJII)V")
    public static final void method2184(boolean arg0, long arg1, int arg2, int arg3) {
        field5360++;
        if (!arg0) {
            field5351 = null;
        }
        int var5 = ((int) arg1 & 0x7F1B2) >> 14;
        int var6 = ((int) arg1 & 0x3427C3) >> 20;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class416.method2595(0, -119, arg2, 0, class113.field1500.field2019[0], class113.field1500.field2018[0], var5, arg3, 0, true, var6);
            return;
        }
        class85 var8 = class411.method2575(0, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field1122;
            var10 = var8.field1197;
        } else {
            var9 = var8.field1197;
            var10 = var8.field1122;
        }
        int var11 = var8.field1192;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class416.method2595(var9, -75, arg2, var11, class113.field1500.field2019[0], class113.field1500.field2018[0], 0, arg3, var10, true, 0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method2185(int arg0) {
        class240.field3597++;
        class177.method1082(class271.field4160, 0);
        if (arg0 != 17147) {
            field5359 = null;
        }
        field5356++;
        class189.field2840.method2366(class246.method1503((byte) -108), true);
        class189.field2840.method2377(class221.field3368, -94);
        class189.field2840.method2377(class161.field2232, -65);
        class189.field2840.method2366(class287.field4376, true);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lfh;B)Lfh;")
    public static final class170 method2186(class170 arg0, byte arg1) {
        field5352++;
        if (arg0.field2474 != -1) {
            return class168.method1020(arg0.field2474, (byte) 114);
        }
        int var2 = arg0.field2525 >>> 16;
        class247 var3 = new class247(class308.field4647);
        if (arg1 >= -41) {
            method2185(48);
        }
        for (class333 var4 = (class333) var3.method1506(0); var4 != null; var4 = (class333) var3.method1509((byte) -50)) {
            if (var4.field4965 == var2) {
                return class168.method1020((int) var4.field1339, (byte) 113);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILdr;)V")
    public static final void method2187(int arg0, int arg1, class261 arg2) {
        class146.method913(arg2);
        field5357++;
        if (arg0 > 1) {
            for (int var3 = 0; var3 < class115.field1522; var3++) {
                for (int var4 = 0; var4 < class198.field3004; var4++) {
                    if ((class341.field5085[1][var3][var4] & 0x2) == 2) {
                        class19.method121(var3, var4);
                    }
                }
            }
        }
        if (arg1 != 2) {
            return;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            for (int var6 = 0; var6 <= class198.field3004; var6++) {
                for (int var7 = 0; var7 <= class115.field1522; var7++) {
                    if ((class354.field5235[var5][var7][var6] & 0x1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && (class354.field5235[var5][var7][var8 - 1] & 0x1) != 0) {
                            var8--;
                        }
                        while (class198.field3004 > var9 && (class354.field5235[var5][var7][var9 + 1] & 0x1) != 0) {
                            var9++;
                        }
                        int var11 = var5;
                        label171: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; var12++) {
                                if ((class354.field5235[var10 - 1][var7][var12] & 0x1) == 0) {
                                    break label171;
                                }
                            }
                            var10--;
                        }
                        label160: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; var13++) {
                                if ((class354.field5235[var11 + 1][var7][var13] & 0x1) == 0) {
                                    break label160;
                                }
                            }
                            var11++;
                        }
                        int var14 = (var9 + 1 - var8) * (var11 + 1 - var10);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class355.field5243[var11][var7][var8] - var15;
                            int var17 = class355.field5243[var10][var7][var8];
                            class109.method672(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; var18++) {
                                for (int var19 = var8; var19 <= var9; var19++) {
                                    class354.field5235[var18][var7][var19] = (byte) class406.method2552(class354.field5235[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class354.field5235[var5][var7][var6] & 0x2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (var20 > 0 && (class354.field5235[var5][var20 - 1][var6] & 0x2) != 0) {
                            var20--;
                        }
                        int var23 = var5;
                        while (var21 < class115.field1522 && (class354.field5235[var5][var21 + 1][var6] & 0x2) != 0) {
                            var21++;
                        }
                        label225: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; var24++) {
                                if ((class354.field5235[var22 - 1][var24][var6] & 0x2) == 0) {
                                    break label225;
                                }
                            }
                            var22--;
                        }
                        label214: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; var25++) {
                                if ((class354.field5235[var23 + 1][var25][var6] & 0x2) == 0) {
                                    break label214;
                                }
                            }
                            var23++;
                        }
                        int var26 = (var23 + 1 - var22) * (var21 + 1 - var20);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class355.field5243[var23][var20][var6] - var27;
                            int var29 = class355.field5243[var22][var20][var6];
                            class109.method672(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; var30++) {
                                for (int var31 = var20; var31 <= var21; var31++) {
                                    class354.field5235[var30][var31][var6] = (byte) class406.method2552(class354.field5235[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class354.field5235[var5][var7][var6] & 0x4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && (class354.field5235[var5][var7][var34 - 1] & 0x4) != 0) {
                            var34--;
                        }
                        while (var35 < class198.field3004 && (class354.field5235[var5][var7][var35 + 1] & 0x4) != 0) {
                            var35++;
                        }
                        label279: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; var36++) {
                                if ((class354.field5235[var5][var32 - 1][var36] & 0x4) == 0) {
                                    break label279;
                                }
                            }
                            var32--;
                        }
                        label268: while (class115.field1522 > var33) {
                            for (int var37 = var34; var37 <= var35; var37++) {
                                if ((class354.field5235[var5][var33 + 1][var37] & 0x4) == 0) {
                                    break label268;
                                }
                            }
                            var33++;
                        }
                        if ((var33 + 1 - var32) * (var35 + 1 - var34) >= 4) {
                            int var38 = class355.field5243[var5][var32][var34];
                            class109.method672(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; var39++) {
                                for (int var40 = var34; var40 <= var35; var40++) {
                                    class354.field5235[var5][var39][var40] = (byte) class406.method2552(class354.field5235[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILfh;)Ljava/lang/String;")
    public static final String method2188(int arg0, class170 arg1) {
        field5355++;
        if (client.method2796(arg1).method1903(5) == arg0) {
            return null;
        } else if (arg1.field2519 == null || arg1.field2519.trim().length() == 0) {
            return class120.field1586 ? "Hidden-use" : null;
        } else {
            return arg1.field2519;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method2189(byte arg0) {
        int var1 = 123 / ((-arg0 - 34) / 62);
        field5354 = null;
        field5351 = null;
        field5350 = null;
        field5359 = null;
    }
}
