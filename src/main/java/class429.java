import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class429 extends class452 {

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Lkn;")
    public static class442 field6073 = new class442("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6076 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Z")
    public static boolean field6078 = false;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 4)
    public static final void method2709(int arg0) {
        class77.method567((byte) 4);
        field6071++;
        class382.field5450 = null;
        class341.field4664 = null;
        class66.field986 = null;
        if (arg0 >= -123) {
            method2712(true);
        }
        class255.field3585 = null;
        class222.field3099 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBLuo;)V", line = 23)
    public static final void method2710(int arg0, byte arg1, class345 arg2) {
        if (arg1 != 10) {
            field6076 = null;
        }
        class360.method2309(arg2);
        field6072++;
        if (arg0 > 1) {
            for (int var3 = 0; var3 < class211.field2954; var3++) {
                for (int var4 = 0; var4 < class290.field4061; var4++) {
                    if ((class368.field5193[1][var3][var4] & 0x2) == 2) {
                        class64.method493(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            for (int var6 = 0; var6 <= class290.field4061; var6++) {
                for (int var7 = 0; var7 <= class211.field2954; var7++) {
                    if ((class195.field2682[var5][var7][var6] & 0x1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (class290.field4061 > var9 && (class195.field2682[var5][var7][var9 + 1] & 0x1) != 0) {
                            var9++;
                        }
                        while (var8 > 0 && (class195.field2682[var5][var7][var8 - 1] & 0x1) != 0) {
                            var8--;
                        }
                        label170: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; var12++) {
                                if ((class195.field2682[var10 - 1][var7][var12] & 0x1) == 0) {
                                    break label170;
                                }
                            }
                            var10--;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; var13++) {
                                if ((class195.field2682[var11 + 1][var7][var13] & 0x1) == 0) {
                                    break label159;
                                }
                            }
                            var11++;
                        }
                        int var14 = (var11 + 1 - var10) * (var9 + 1 - var8);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class57.field783[var11][var7][var8] - var15;
                            int var17 = class57.field783[var10][var7][var8];
                            class194.method1256(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; var18++) {
                                for (int var19 = var8; var19 <= var9; var19++) {
                                    class195.field2682[var18][var7][var19] = (byte) class387.method2454(class195.field2682[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class195.field2682[var5][var7][var6] & 0x2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (class211.field2954 > var21 && (class195.field2682[var5][var21 + 1][var6] & 0x2) != 0) {
                            var21++;
                        }
                        while (var20 > 0 && (class195.field2682[var5][var20 - 1][var6] & 0x2) != 0) {
                            var20--;
                        }
                        int var23 = var5;
                        label223: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; var24++) {
                                if ((class195.field2682[var22 - 1][var24][var6] & 0x2) == 0) {
                                    break label223;
                                }
                            }
                            var22--;
                        }
                        label212: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; var25++) {
                                if ((class195.field2682[var23 + 1][var25][var6] & 0x2) == 0) {
                                    break label212;
                                }
                            }
                            var23++;
                        }
                        int var26 = (var21 + 1 - var20) * (var23 + 1 - var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class57.field783[var23][var20][var6] - var27;
                            int var29 = class57.field783[var22][var20][var6];
                            class194.method1256(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; var30++) {
                                for (int var31 = var20; var31 <= var21; var31++) {
                                    class195.field2682[var30][var31][var6] = (byte) class387.method2454(class195.field2682[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class195.field2682[var5][var7][var6] & 0x4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; var34 > 0 && (class195.field2682[var5][var7][var34 - 1] & 0x4) != 0; var34--) {
                        }
                        int var35;
                        for (var35 = var6; class290.field4061 > var35 && (class195.field2682[var5][var7][var35 + 1] & 0x4) != 0; var35++) {
                        }
                        label277: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; var36++) {
                                if ((class195.field2682[var5][var32 - 1][var36] & 0x4) == 0) {
                                    break label277;
                                }
                            }
                            var32--;
                        }
                        label266: while (var33 < class211.field2954) {
                            for (int var37 = var34; var37 <= var35; var37++) {
                                if ((class195.field2682[var5][var33 + 1][var37] & 0x4) == 0) {
                                    break label266;
                                }
                            }
                            var33++;
                        }
                        if ((var33 + 1 - var32) * (var35 + 1 - var34) >= 4) {
                            int var38 = class57.field783[var5][var32][var34];
                            class194.method1256(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; var39++) {
                                for (int var40 = var34; var40 <= var35; var40++) {
                                    class195.field2682[var5][var39][var40] = (byte) class387.method2454(class195.field2682[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBII)V", line = 317)
    public static final void method2711(int arg0, byte arg1, int arg2, int arg3) {
        field6075++;
        if (arg0 == 1008) {
            class177.method1166(10, arg2, arg3);
        } else if (arg0 == 1009) {
            class177.method1166(11, arg2, arg3);
        } else if (arg0 == 1007) {
            class177.method1166(12, arg2, arg3);
        } else if (arg0 == 1001) {
            class177.method1166(13, arg2, arg3);
        } else if (arg0 == 1012) {
            class177.method1166(14, arg2, arg3);
        }
        int var4 = 50 % ((36 - arg1) / 54);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 352)
    public static void method2712(boolean arg0) {
        field6073 = null;
        if (arg0) {
            field6076 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 365)
    public static final void method2713(byte arg0) {
        if (arg0 != 58) {
            field6078 = false;
        }
        field6077++;
        class167.field2304 = new class87(class190.field2615.method2763(arg0 - 168, class210.field2935), "", class267.field3695, 1006, 0L, 0, 0);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIILog;)V", line = 379)
    public static final void method2714(int arg0, int arg1, int arg2, int arg3, class388 arg4) {
        field6074++;
        long var5 = (long) (arg3 | arg1 << 14 | arg2 << 28);
        class107 var7 = (class107) class367.field5182.method886(var5, 25651);
        if (var7 == null) {
            class107 var8 = new class107();
            class367.field5182.method883((byte) -54, var5, var8);
            var8.field1478.method643(arg4, -109);
            return;
        }
        class360 var9 = class51.method433((byte) 87, arg4.field5569);
        int var10 = var9.field4954;
        if (var9.field4958 == 1) {
            var10 = (arg4.field5574 + 1) * var10;
        }
        if (arg0 <= 7) {
            field6076 = null;
        }
        for (class388 var11 = (class388) var7.field1478.method646(48); var11 != null; var11 = (class388) var7.field1478.method641(false)) {
            class360 var12 = class51.method433((byte) 87, var11.field5569);
            int var13 = var12.field4954;
            if (var12.field4958 == 1) {
                var13 = (var11.field5574 + 1) * var13;
            }
            if (var10 > var13) {
                class214.method1400(var11, arg4, -90);
                return;
            }
        }
        var7.field1478.method643(arg4, -90);
    }
}
