import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 {

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lod;")
    public static class101 field1144 = class46.method335(70, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lod;")
    public static class101 field1138 = class46.method335(104, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1139 = 0;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lod;")
    public static class101 field1142 = class46.method335(-92, ":trade:");

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)V")
    public static final void method353(int arg0, long arg1) {
        field1143++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class101.field2205; var3++) {
            if (class39.field929[var3] == arg1) {
                class101.field2205--;
                for (int var4 = var3; var4 < class101.field2205; var4++) {
                    class35.field899[var4] = class35.field899[var4 + 1];
                    class78.field1623[var4] = class78.field1623[var4 + 1];
                    class39.field929[var4] = class39.field929[var4 + 1];
                    class52.field1179[var4] = class52.field1179[var4 + 1];
                }
                class83.field1811++;
                class10.field148 = class108.field2306;
                class17.field364.method419(229, (byte) 0);
                class17.field364.method1087(arg1, -125);
                break;
            }
        }
        if (arg0 >= -55) {
            field1144 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I")
    public static final int method354(int arg0, int arg1) {
        if (arg0 == 22782) {
            field1151++;
            return arg1 >> 11 & 0x3F;
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method355(int arg0) {
        field1142 = null;
        if (arg0 < 115) {
            field1144 = null;
        }
        field1138 = null;
        field1144 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static final void method356(int arg0) {
        field1146++;
        class99.field2139.method135(0);
        int var1 = -69 % ((-arg0 - 77) / 37);
        class146.field3347.method135(0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILtf;IIIIII)V")
    public static final void method357(int arg0, class138 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= 0 && arg0 < 104 && arg4 >= 0 && arg4 < 104) {
            class86.field1905[arg5][arg0][arg4] = 0;
            while (true) {
                int var8 = arg1.method1055(115);
                if (var8 == 0) {
                    if (arg5 == 0) {
                        class20.field431[0][arg0][arg4] = -class54.method390((byte) -96, arg2 + arg0 + 932731, arg6 + 556238 + arg4) * 8;
                    } else {
                        class20.field431[arg5][arg0][arg4] = class20.field431[arg5 - 1][arg0][arg4] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg1.method1055(110);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg5 == 0) {
                        class20.field431[0][arg0][arg4] = -var9 * 8;
                    } else {
                        class20.field431[arg5][arg0][arg4] = class20.field431[arg5 - 1][arg0][arg4] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class11.field202[arg5][arg0][arg4] = arg1.method1079((byte) 0);
                    class63.field1404[arg5][arg0][arg4] = (byte) ((var8 - 2) / 4);
                    class144.field3329[arg5][arg0][arg4] = (byte) class41.method307(arg7 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class86.field1905[arg5][arg0][arg4] = (byte) (var8 - 49);
                } else {
                    class137.field3128[arg5][arg0][arg4] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg1.method1055(arg3 ^ 0x66);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg1.method1055(118);
                    break;
                }
                if (var10 <= 49) {
                    arg1.method1055(114);
                }
            }
        }
        field1147++;
        if (arg3 != 8) {
            method360(true, null, 3, null, null, true);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZZ)V")
    public static final void method358(boolean arg0, boolean arg1) {
        field1145++;
        if (arg1) {
            field1144 = null;
        }
        class67.field1509 = arg0;
        if (!class67.field1509) {
            int var2 = class118.field2611.method1098(true);
            int var3 = class118.field2611.method1051(-75);
            int var4 = (class8.field121 - class118.field2611.field3175) / 16;
            class125.field2732 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class125.field2732[var5][var14] = class118.field2611.method1062(1809568712);
                }
            }
            int var6 = class118.field2611.method1080((byte) -81);
            int var7 = class118.field2611.method1053((byte) -80);
            int var8 = class118.field2611.method1098(true);
            class43.field1035 = new byte[var4][];
            class138.field3197 = new int[var4];
            class34.field868 = new int[var4];
            class3.field53 = new byte[var4][];
            class57.field1315 = new int[var4];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && (var2 / 8) == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class57.field1315[var10] = var13;
                        class138.field3197[var10] = class152.field3469.method110(0, class15.method101(-78, new class101[] { class120.field2640, class82.method592(false, var11), class85.field1861, class82.method592(false, var12) }));
                        class34.field868[var10] = class152.field3469.method110(0, class15.method101(-62, new class101[] { class155.field3514, class82.method592(false, var11), class85.field1861, class82.method592(false, var12) }));
                        var10++;
                    }
                }
            }
            class111.method821(var7, (byte) -123, var6, var3, var2, var8);
            return;
        }
        int var15 = class118.field2611.method1084(-111);
        class118.field2611.method425((byte) -94);
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class118.field2611.method426(!arg1, 1);
                    if (var37 == 1) {
                        class84.field1842[var16][var35][var36] = class118.field2611.method426(true, 26);
                    } else {
                        class84.field1842[var16][var35][var36] = -1;
                    }
                }
            }
        }
        class118.field2611.method421(-64);
        int var17 = (class8.field121 - class118.field2611.field3175) / 16;
        class125.field2732 = new int[var17][4];
        for (int var18 = 0; var18 < var17; var18++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class125.field2732[var18][var34] = class118.field2611.method1064(16711680);
            }
        }
        int var19 = class118.field2611.method1053((byte) 126);
        int var20 = class118.field2611.method1098(true);
        int var21 = class118.field2611.method1055(125);
        int var22 = class118.field2611.method1084(-101);
        class43.field1035 = new byte[var17][];
        class34.field868 = new int[var17];
        class138.field3197 = new int[var17];
        class57.field1315 = new int[var17];
        class3.field53 = new byte[var17][];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class84.field1842[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 14 & 0x3FF;
                        int var29 = var27 >> 3 & 0x7FF;
                        int var30 = (var28 / 8 << 8) + var29 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class57.field1315[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            class57.field1315[var23] = var30;
                            int var32 = var30 >> 8 & 0xFF;
                            int var33 = var30 & 0xFF;
                            class138.field3197[var23] = class152.field3469.method110(0, class15.method101(-2, new class101[] { class120.field2640, class82.method592(false, var32), class85.field1861, class82.method592(false, var33) }));
                            class34.field868[var23] = class152.field3469.method110(0, class15.method101(-30, new class101[] { class155.field3514, class82.method592(false, var32), class85.field1861, class82.method592(false, var33) }));
                            var23++;
                        }
                    }
                }
            }
        }
        class111.method821(var22, (byte) -124, var21, var19, var20, var15);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Z")
    public static final boolean method359(byte arg0) {
        field1140++;
        class67 var1 = class132.field3005;
        synchronized (class132.field3005) {
            if (class40.field958 == class2.field35) {
                return false;
            }
            if (arg0 >= -67) {
                method354(-85, 69);
            }
            class99.field2147 = class44.field1053[class40.field958];
            class11.field204 = class99.field2152[class40.field958];
            class40.field958 = class40.field958 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLc;ILod;Lod;Z)V")
    public static final void method360(boolean arg0, class15 arg1, int arg2, class101 arg3, class101 arg4, boolean arg5) {
        field1141++;
        int var6 = arg1.method110(0, arg4);
        if (!arg0) {
            method357(122, null, -118, -72, -117, 38, -107, 33);
        }
        int var7 = arg1.method125(2, arg3, var6);
        class7.method33(var6, var7, (byte) -91, arg5, arg1, arg2);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZLc;Lc;)V")
    public static final void method361(int arg0, boolean arg1, class15 arg2, class15 arg3) {
        class27.field705 = arg1;
        class3.field56 = arg3;
        if (arg0 == 1) {
            field1149++;
            class142.field3268 = arg2;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)Z")
    public static final boolean method362(int arg0, byte arg1) {
        field1152++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else if (arg0 >= 129 && arg0 <= 159) {
            return false;
        } else {
            return arg1 <= -7;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
    public static final void method363(int arg0, int arg1) {
        class15.field332 += arg1 * 128;
        if (class95.field2037.length < class15.field332) {
            class15.field332 -= class95.field2037.length;
            int var2 = (int) (Math.random() * 12.0D);
            class27.method220(class11.field172[var2], (byte) 34);
        }
        short var3 = 256;
        int var4 = 0;
        field1150++;
        int var5 = (var3 - arg1) * 128;
        int var6 = arg1 * 128;
        if (arg0 <= 83) {
            return;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var27 = class98.field2131[var4 + var6] - class95.field2037[class95.field2037.length - 1 & class15.field332 + var4] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class98.field2131[var4++] = var27;
        }
        for (int var8 = var3 - arg1; var8 < var3; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class98.field2131[var24 + var25] = 255;
                } else {
                    class98.field2131[var24 + var25] = 0;
                }
            }
        }
        if (class118.field2613 > 0) {
            class118.field2613 -= arg1 * 4;
        }
        if (class67.field1516 > 0) {
            class67.field1516 -= arg1 * 4;
        }
        if (class67.field1516 == 0 && class118.field2613 == 0) {
            int var9 = (int) (Math.random() * (double) (2000 / arg1));
            if (var9 == 1) {
                class118.field2613 = 1024;
            }
            if (var9 == 0) {
                class67.field1516 = 1024;
            }
        }
        for (int var10 = 0; var10 < var3 - arg1; var10++) {
            class131.field2977[var10] = class131.field2977[arg1 + var10];
        }
        for (int var11 = var3 - arg1; var11 < var3; var11++) {
            class131.field2977[var11] = (int) (Math.sin((double) class94.field2024 / 14.0D) * 16.0D + Math.sin((double) class94.field2024 / 15.0D) * 14.0D + Math.sin((double) class94.field2024 / 16.0D) * 12.0D);
            class94.field2024++;
        }
        class150.field3432 += arg1;
        int var12 = ((class143.field3305 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class150.field3432 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class98.field2131[(var23 << 7) + var22] = 192;
        }
        class150.field3432 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class98.field2131[var12 + var21 + var20];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class98.field2131[var21 + var20 - var12 - 1];
                }
                if (var21 >= 0) {
                    class63.field1430[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var3 > var12 + var17) {
                    var16 += class63.field1430[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class63.field1430[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class98.field2131[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }
}
