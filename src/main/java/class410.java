import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class410 extends class467 {

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "[I")
    public int[] field6169 = new int[] { -1 };

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "[I")
    public int[] field6166 = new int[1];

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "Lcm;")
    public static class449 field6167 = new class449(1, 1);

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "Lui;")
    public static class375 field6172 = new class375("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "Lcm;")
    public static class449 field6174;

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "Lru;")
    public static class174 field6175;

    static {
        new class375("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field6174 = new class449(52, 4);
        field6176 = 0;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V", line = 4)
    public static void method2492(byte arg0) {
        field6167 = null;
        field6175 = null;
        field6174 = null;
        field6172 = null;
        if (arg0 != -54) {
            field6167 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V", line = 18)
    public static final void method2493(byte arg0) {
        field6168++;
        if (class96.field1399.method1738(-97, class441.field6563) != 2) {
            return;
        }
        int var1 = 30 / ((arg0 - 74) / 36);
        byte var2 = (byte) (class527.field7787 - 4 & 0xFF);
        int var3 = class527.field7787 % class96.field1403;
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var17 = 0; var17 < class485.field7122; var17++) {
                class307.field4504[var4][var3][var17] = var2;
            }
        }
        if (class195.field2770 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class66.field915[var5] = -1000000;
            class415.field6220[var5] = 1000000;
            class205.field2898[var5] = 0;
            class34.field538[var5] = 1000000;
            class344.field5392[var5] = 0;
        }
        if (class432.field6409 != 1) {
            int var16 = class500.method2985(class34.field539, 5293, class195.field2770, class301.field4447);
            if ((var16 - class154.field2246) >= 800 || (class129.field1816[class195.field2770][class34.field539 >> 7][class301.field4447 >> 7] & 0x4) == 0) {
                return;
            }
            class217.method1472((byte) -124, false, 1, class34.field539 >> 7, class380.field5802, class301.field4447 >> 7);
            return;
        }
        if ((class129.field1816[class195.field2770][class339.field5365.field2217 >> 7][class339.field5365.field2215 >> 7] & 0x4) != 0) {
            class217.method1472((byte) -121, false, 0, class339.field5365.field2217 >> 7, class380.field5802, class339.field5365.field2215 >> 7);
        }
        if (class353.field5478 >= 2560) {
            return;
        }
        int var6 = class34.field539 >> 7;
        int var7 = class301.field4447 >> 7;
        int var8 = class339.field5365.field2217 >> 7;
        int var9 = class339.field5365.field2215 >> 7;
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var7 < var9) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if ((var10 != 0 || var11 != 0) && var10 > -class96.field1403 && var10 < class96.field1403 && var11 > (-class485.field7122) && var11 < class485.field7122) {
            if (var10 > var11) {
                int var12 = var11 * 65536 / var10;
                int var13 = 32768;
                while (var6 != var8) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class129.field1816[class195.field2770][var6][var7] & 0x4) != 0) {
                        class217.method1472((byte) -112, false, 1, var6, class380.field5802, var7);
                        return;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        if (var7 < var9) {
                            var7++;
                        } else if (var9 < var7) {
                            var7--;
                        }
                        var13 -= 65536;
                        if ((class129.field1816[class195.field2770][var6][var7] & 0x4) != 0) {
                            class217.method1472((byte) -117, false, 1, var6, class380.field5802, var7);
                            return;
                        }
                    }
                }
                return;
            }
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class129.field1816[class195.field2770][var6][var7] & 0x4) != 0) {
                    class217.method1472((byte) -128, false, 1, var6, class380.field5802, var7);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    var15 -= 65536;
                    if ((class129.field1816[class195.field2770][var6][var7] & 0x4) != 0) {
                        class217.method1472((byte) -119, false, 1, var6, class380.field5802, var7);
                        return;
                    }
                }
            }
            return;
        }
        class438.method2644("RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class82.field1105 + "," + class437.field6477, -1, null);
        return;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIZ[I[I)J", line = 212)
    private final long method2494(int arg0, int arg1, boolean arg2, int[] arg3, int[] arg4) {
        int var6 = 66 % ((-arg0 - 5) / 59);
        field6171++;
        long[] var7 = class94.field1364;
        long var8 = -1L;
        long var10 = var8 >>> 8 ^ var7[(int) (((long) (arg1 >> 8) ^ var8) & 0xFFL)];
        long var12 = var10 >>> 8 ^ var7[(int) (((long) arg1 ^ var10) & 0xFFL)];
        for (int var14 = 0; var14 < arg3.length; var14++) {
            long var18 = var7[(int) (((long) (arg3[var14] >> 24) ^ var12) & 0xFFL)] ^ var12 >>> 8;
            long var20 = var18 >>> 8 ^ var7[(int) (((long) (arg3[var14] >> 16) ^ var18) & 0xFFL)];
            long var22 = var20 >>> 8 ^ var7[(int) (((long) (arg3[var14] >> 8) ^ var20) & 0xFFL)];
            var12 = var7[(int) (((long) arg3[var14] ^ var22) & 0xFFL)] ^ var22 >>> 8;
        }
        if (arg4 != null) {
            for (int var15 = 0; var15 < 5; var15++) {
                var12 = var12 >>> 8 ^ var7[(int) (((long) arg4[var15] ^ var12) & 0xFFL)];
            }
        }
        return var7[(int) ((var12 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ var12 >>> 8;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ltq;IZLpt;Lqa;IIIII)Lc;", line = 264)
    public final class201 method2495(class270 arg0, int arg1, boolean arg2, class395 arg3, class496 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6170++;
        class201 var11 = null;
        int var12 = arg1;
        class219 var13 = null;
        if (arg5 != -1) {
            var13 = class186.field2620.method2681(arg9 ^ 0xFFFFFFB0, arg5);
        }
        int[] var14 = this.field6169;
        if (var13 != null && var13.field3039 != null) {
            var14 = new int[var13.field3039.length];
            for (int var15 = 0; var15 < var13.field3039.length; var15++) {
                int var16 = var13.field3039[var15];
                if (var16 >= 0 && this.field6169.length > var16) {
                    var14[var15] = this.field6169[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class472 var24 = null;
        class472 var25 = null;
        if (arg0 != null) {
            int var26 = arg0.field3765[arg6];
            var12 = arg1 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class260.field3621.method1936(var27, 213);
            if (var24 != null) {
                var18 |= var24.method2837(var21, 26582);
                var17 |= var24.method2834((byte) 122, var21);
                var20 |= var24.method2836(var21, (byte) 11);
                var19 |= arg0.field3760;
            }
            if ((arg0.field3744 || class58.field786) && arg7 != -1 && arg7 < arg0.field3765.length) {
                int var28 = arg0.field3765[arg7];
                var23 = arg0.field3746[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class260.field3621.method1936(var22 >>> 16, 213);
                }
                if (var25 != null) {
                    var18 |= var25.method2837(var22, 26582);
                    var17 |= var25.method2834((byte) 93, var22);
                    var20 |= var25.method2836(var22, (byte) 11);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method2494(-99, arg5, arg2, var14, arg3 == null ? null : arg3.field5996);
        if (class339.field5359 != null) {
            var11 = (class201) class339.field5359.method1013(var30, (byte) -106);
        }
        if (var11 == null || arg4.method1141(var11.method279(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method1130(var12, var11.method279());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class84.field1154.method2451(-1, var14[var34]).method407((byte) 81, arg2)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class192[] var35 = new class192[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class84.field1154.method2451(-1, var14[var36]).method414(arg2, (byte) -124);
                }
            }
            if (var13 != null && var13.field3057 != null) {
                for (int var37 = 0; var37 < var13.field3057.length; var37++) {
                    if (var13.field3057[var37] != null && var35[var37] != null) {
                        int var38 = var13.field3057[var37][0];
                        int var39 = var13.field3057[var37][1];
                        int var40 = var13.field3057[var37][2];
                        int var41 = var13.field3057[var37][3];
                        int var42 = var13.field3057[var37][4];
                        int var43 = var13.field3057[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1351(var43, var42, var41, (byte) -85);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1340(false, var40, var38, var39);
                        }
                    }
                }
            }
            if (arg3 != null) {
                var32 = var12 | 0x4000;
            }
            class192 var44 = new class192(var35, var35.length);
            var11 = arg4.method1076(var44, var32, class254.field3513, 64, 850);
            if (arg3 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg3.field5996[var45] < class19.field287[var45].length) {
                        var11.method276(class336.field5218[var45], class19.field287[var45][arg3.field5996[var45]]);
                    }
                    if (arg3.field5996[var45] < class301.field4446[var45].length) {
                        var11.method276(class102.field1461[var45], class301.field4446[var45][arg3.field5996[var45]]);
                    }
                }
            }
            if (class339.field5359 != null) {
                var11.method297(var12);
                class339.field5359.method1012(-126, var30, var11);
            }
        }
        if (arg0 == null || var24 == null) {
            return var11;
        } else {
            class201 var46 = var11.method292((byte) 1, var12, true);
            var46.method1398(var23, arg9, var22, arg9, var21, arg0.field3760, var24, arg8 - 1, var25);
            return var46;
        }
    }
}
