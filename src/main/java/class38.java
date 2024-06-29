import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class38 extends class2 {

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lkc;")
    public static class67 field864 = class19.method144("Ung-Ultiger Benutzername", 84);

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Lkc;")
    public static class67 field870 = class19.method144("@cr2@", 75);

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Lkc;")
    public static class67 field879 = class19.method144("mapedge", 72);

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Lkc;")
    private static class67 field882 = class19.method144("Accept challenge", 76);

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Lkc;")
    public static class67 field876 = class19.method144("Diese Betatest)2Welt ist nur f-Ur eingeladene", 113);

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "Lkc;")
    public static class67 field888 = field882;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "Lkc;")
    private static class67 field889 = class19.method144("K", 99);

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lkc;")
    public static class67 field865 = field889;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "Lkc;")
    private static class67 field891 = class19.method144("This world is running a closed Beta)3", 118);

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "Lkc;")
    public static class67 field890 = class19.method144("Benutzeroberfl-=che geladen)3", 118);

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Lkc;")
    public static class67 field880 = field889;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lkc;")
    public static class67 field871 = field891;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Lkc;")
    public static class67 field866 = class19.method144("@yel@*V", 118);

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Lbf;")
    public class14 field869;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "Lac;")
    public static class4 field892;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Lje;")
    public static class63 field877;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "Lje;")
    public class63 field886;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "[B")
    public byte[] field884;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "[Lkc;")
    public static class67[] field868;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I", line = 14)
    public static final int method306(byte arg0) {
        field874++;
        if (arg0 >= -49) {
            method315(false);
        }
        return class70.field1661++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZIIII)V", line = 26)
    public static final void method307(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1) {
            return;
        }
        int var6 = class103.field2332.method879(arg2, arg5, arg4);
        field887++;
        if (var6 != 0) {
            int var7 = class103.field2332.method868(arg2, arg5, arg4, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg0;
            if (var6 > 0) {
                var10 = arg3;
            }
            int var11 = (52736 - arg4 * 512) * 4 + arg5 * 4 + 24624;
            int var12 = var6 >> 14 & 0x7FFF;
            int[] var13 = class7.field158.field2015;
            class106 var14 = class2.method12(var12, 21876);
            if (var14.field2379 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var13[var11] = var10;
                        var13[var11 + 512] = var10;
                        var13[var11 + 1024] = var10;
                        var13[var11 + 1536] = var10;
                    } else if (var8 == 1) {
                        var13[var11] = var10;
                        var13[var11 + 1] = var10;
                        var13[var11 + 2] = var10;
                        var13[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var13[var11 + 3] = var10;
                        var13[var11 + 3 + 512] = var10;
                        var13[var11 + 1027] = var10;
                        var13[var11 + 1539] = var10;
                    } else if (var8 == 3) {
                        var13[var11 + 1536] = var10;
                        var13[var11 + 1536 + 1] = var10;
                        var13[var11 + 2 + 1536] = var10;
                        var13[var11 + 1539] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var13[var11] = var10;
                    } else if (var8 == 1) {
                        var13[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var13[var11 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var13[var11 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var13[var11] = var10;
                        var13[var11 + 512] = var10;
                        var13[var11 + 1024] = var10;
                        var13[var11 + 1536] = var10;
                    } else if (var8 == 0) {
                        var13[var11] = var10;
                        var13[var11 + 1] = var10;
                        var13[var11 + 2] = var10;
                        var13[var11 + 3] = var10;
                    } else if (var8 == 1) {
                        var13[var11 + 3] = var10;
                        var13[var11 + 512 + 3] = var10;
                        var13[var11 + 1027] = var10;
                        var13[var11 + 1536 + 3] = var10;
                    } else if (var8 == 2) {
                        var13[var11 + 1536] = var10;
                        var13[var11 + 1536 + 1] = var10;
                        var13[var11 + 1536 + 2] = var10;
                        var13[var11 + 1536 + 3] = var10;
                    }
                }
            } else {
                class3 var15 = class134.field3209[var14.field2379];
                if (var15 != null) {
                    int var16 = (var14.field2432 * 4 - var15.field36) / 2;
                    int var17 = (var14.field2369 * 4 - var15.field34) / 2;
                    var15.method20(arg5 * 4 + var16 + 48, 48 - (-((104 - arg4 + -var14.field2369) * 4) - var17));
                }
            }
        }
        int var18 = class103.field2332.method871(arg2, arg5, arg4);
        if (var18 != 0) {
            int var19 = class103.field2332.method868(arg2, arg5, arg4, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class106 var23 = class2.method12(var22, 21876);
            if (var23.field2379 != -1) {
                class3 var24 = class134.field3209[var23.field2379];
                if (var24 != null) {
                    int var25 = (var23.field2369 * 4 - var24.field34) / 2;
                    int var26 = (var23.field2432 * 4 - var24.field36) / 2;
                    var24.method20(arg5 * 4 + var26 + 48, (-arg4 + 104 - var23.field2369) * 4 + var25 + 48);
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                int var28 = (103 - arg4) * 512 * 4 + arg5 * 4 + 24624;
                if (var18 > 0) {
                    var27 = 15597568;
                }
                int[] var29 = class7.field158.field2015;
                if (var20 == 0 || var20 == 2) {
                    var29[var28 + 1536] = var27;
                    var29[var28 + 1 + 1024] = var27;
                    var29[var28 + 514] = var27;
                    var29[var28 + 3] = var27;
                } else {
                    var29[var28] = var27;
                    var29[var28 + 1 + 512] = var27;
                    var29[var28 + 1026] = var27;
                    var29[var28 + 1539] = var27;
                }
            }
        }
        int var30 = class103.field2332.method882(arg2, arg5, arg4);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class106 var32 = class2.method12(var31, 21876);
        if (var32.field2379 == -1) {
            return;
        }
        class3 var33 = class134.field3209[var32.field2379];
        if (var33 != null) {
            int var34 = (var32.field2432 * 4 - var33.field36) / 2;
            int var35 = (var32.field2369 * 4 - var33.field34) / 2;
            var33.method20(arg5 * 4 + var34 + 48, (-arg4 + 104 - var32.field2369) * 4 + 48 + var35);
            return;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIZIII)Z", line = 272)
    public static final boolean method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class63.field1481[var12][var36] = 0;
                class81.field1941[var12][var36] = 99999999;
            }
        }
        field862++;
        int var13 = arg11;
        class63.field1481[arg11][arg2] = 99;
        class81.field1941[arg11][arg2] = 0;
        byte var14 = 0;
        class41.field1007[var14] = arg11;
        int var37 = var14 + 1;
        class140.field3356[var14] = arg2;
        int var15 = 0;
        int var16 = arg2;
        boolean var17 = false;
        int[][] var18 = class14.field295[class112.field2593].field98;
        if (arg10 != -14415) {
            field879 = null;
        }
        int var19 = class41.field1007.length;
        while (var37 != var15) {
            var13 = class41.field1007[var15];
            var16 = class140.field3356[var15];
            var15 = (var15 + 1) % var19;
            if (arg4 == var13 && arg6 == var16) {
                var17 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class14.field295[class112.field2593].method49(arg1 - 1, arg6, var16, var13, arg4, arg7, -50)) {
                    var17 = true;
                    break;
                }
                if (arg1 < 10 && class14.field295[class112.field2593].method48(arg6, arg7, var16, arg1 - 1, var13, true, arg4)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg0 != 0 && class14.field295[class112.field2593].method53(arg4, 1024, arg0, arg3, var16, arg9, arg6, var13)) {
                var17 = true;
                break;
            }
            int var35 = class81.field1941[var13][var16] + 1;
            if (var13 > 0 && class63.field1481[var13 - 1][var16] == 0 && (var18[var13 - 1][var16] & 0x1280108) == 0) {
                class41.field1007[var37] = var13 - 1;
                class140.field3356[var37] = var16;
                var37 = (var37 + 1) % var19;
                class63.field1481[var13 - 1][var16] = 2;
                class81.field1941[var13 - 1][var16] = var35;
            }
            if (var13 < 103 && class63.field1481[var13 + 1][var16] == 0 && (var18[var13 + 1][var16] & 0x1280180) == 0) {
                class41.field1007[var37] = var13 + 1;
                class140.field3356[var37] = var16;
                class63.field1481[var13 + 1][var16] = 8;
                var37 = (var37 + 1) % var19;
                class81.field1941[var13 + 1][var16] = var35;
            }
            if (var16 > 0 && class63.field1481[var13][var16 - 1] == 0 && (var18[var13][var16 - 1] & 0x1280102) == 0) {
                class41.field1007[var37] = var13;
                class140.field3356[var37] = var16 - 1;
                var37 = (var37 + 1) % var19;
                class63.field1481[var13][var16 - 1] = 1;
                class81.field1941[var13][var16 - 1] = var35;
            }
            if (var16 < 103 && class63.field1481[var13][var16 + 1] == 0 && (var18[var13][var16 + 1] & 0x1280120) == 0) {
                class41.field1007[var37] = var13;
                class140.field3356[var37] = var16 + 1;
                class63.field1481[var13][var16 + 1] = 4;
                var37 = (var37 + 1) % var19;
                class81.field1941[var13][var16 + 1] = var35;
            }
            if (var13 > 0 && var16 > 0 && class63.field1481[var13 - 1][var16 - 1] == 0 && (var18[var13 - 1][var16 - 1] & 0x128010E) == 0 && (var18[var13 - 1][var16] & 0x1280108) == 0 && (var18[var13][var16 - 1] & 0x1280102) == 0) {
                class41.field1007[var37] = var13 - 1;
                class140.field3356[var37] = var16 - 1;
                var37 = (var37 + 1) % var19;
                class63.field1481[var13 - 1][var16 - 1] = 3;
                class81.field1941[var13 - 1][var16 - 1] = var35;
            }
            if (var13 < 103 && var16 > 0 && class63.field1481[var13 + 1][var16 - 1] == 0 && (var18[var13 + 1][var16 - 1] & 0x1280183) == 0 && (var18[var13 + 1][var16] & 0x1280180) == 0 && (var18[var13][var16 - 1] & 0x1280102) == 0) {
                class41.field1007[var37] = var13 + 1;
                class140.field3356[var37] = var16 - 1;
                var37 = (var37 + 1) % var19;
                class63.field1481[var13 + 1][var16 - 1] = 9;
                class81.field1941[var13 + 1][var16 - 1] = var35;
            }
            if (var13 > 0 && var16 < 103 && class63.field1481[var13 - 1][var16 + 1] == 0 && (var18[var13 - 1][var16 + 1] & 0x1280138) == 0 && (var18[var13 - 1][var16] & 0x1280108) == 0 && (var18[var13][var16 + 1] & 0x1280120) == 0) {
                class41.field1007[var37] = var13 - 1;
                class140.field3356[var37] = var16 + 1;
                class63.field1481[var13 - 1][var16 + 1] = 6;
                class81.field1941[var13 - 1][var16 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && var16 < 103 && class63.field1481[var13 + 1][var16 + 1] == 0 && (var18[var13 + 1][var16 + 1] & 0x12801E0) == 0 && (var18[var13 + 1][var16] & 0x1280180) == 0 && (var18[var13][var16 + 1] & 0x1280120) == 0) {
                class41.field1007[var37] = var13 + 1;
                class140.field3356[var37] = var16 + 1;
                var37 = (var37 + 1) % var19;
                class63.field1481[var13 + 1][var16 + 1] = 12;
                class81.field1941[var13 + 1][var16 + 1] = var35;
            }
        }
        client.field458 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg4 - var22; var23 <= arg4 + var22; var23++) {
                for (int var24 = arg6 - var22; var24 <= arg6 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class81.field1941[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg4) {
                            var25 = arg4 - var23;
                        } else if (var23 > arg3 + arg4 - 1) {
                            var25 = var23 + 1 - arg4 - arg3;
                        }
                        int var26 = 0;
                        if (arg6 > var24) {
                            var26 = arg6 - var24;
                        } else if (var24 > arg0 + arg6 - 1) {
                            var26 = var24 + 1 - arg6 - arg0;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class81.field1941[var23][var24]) {
                            var16 = var24;
                            var21 = class81.field1941[var23][var24];
                            var13 = var23;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg11 == var13 && arg2 == var16) {
                return false;
            }
            client.field458 = 1;
        }
        byte var28 = 0;
        class41.field1007[var28] = var13;
        int var38 = var28 + 1;
        class140.field3356[var28] = var16;
        int var29;
        int var30 = var29 = class63.field1481[var13][var16];
        while (arg11 != var13 || arg2 != var16) {
            if (var29 != var30) {
                var29 = var30;
                class41.field1007[var38] = var13;
                class140.field3356[var38++] = var16;
            }
            if ((var30 & 0x1) != 0) {
                var16++;
            } else if ((var30 & 0x4) != 0) {
                var16--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class63.field1481[var13][var16];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class140.field3356[var38];
            int var33 = class41.field1007[var38];
            if (arg5 == 0) {
                class54.field1295.method713(arg10 + 14918, 142);
                class52.field1279++;
                class54.field1295.method1115((byte) 49, var31 + var31 + 3);
            }
            if (arg5 == 1) {
                class54.field1295.method713(arg10 + 14918, 22);
                class137.field3292++;
                class54.field1295.method1115((byte) 49, var31 + var31 + 3 + 14);
            }
            if (arg5 == 2) {
                class54.field1295.method713(503, 148);
                class81.field1926++;
                class54.field1295.method1115((byte) 49, var31 + var31 + 3);
            }
            class54.field1295.method1085(class30.field640 + var32, (byte) 32);
            class54.field1295.method1098(class32.field685 + var33, (byte) 2);
            class96.field2174 = class140.field3356[0];
            class29.field609 = class41.field1007[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class54.field1295.method1115((byte) 49, class41.field1007[var38] - var33);
                class54.field1295.method1102(-16910, class140.field3356[var38] - var32);
            }
            class54.field1295.method1087((byte) 120, class75.field1792[82] ? 1 : 0);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 613)
    public static final Class method309(byte arg0, String arg1) throws ClassNotFoundException {
        field878++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg0 != 114) {
                method311((byte) 41);
            }
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLed;)[I", line = 653)
    public static final int[] method310(boolean arg0, class33 arg1) {
        field885++;
        int var2 = arg1.field740 >> 16;
        if (!class42.method365(99, var2)) {
            return null;
        }
        int var3 = arg1.field813;
        int var4 = arg1.field750;
        if (arg0) {
            return null;
        }
        int var5 = arg1.field719;
        while (var5 != -1) {
            class33 var7 = class54.field1305[var2][var5 & 0xFFFF];
            var4 += var7.field750 - var7.field806;
            var5 = var7.field719;
            var3 += var7.field813 - var7.field728;
        }
        return new int[] { var3, var4 };
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 689)
    public static final void method311(byte arg0) {
        field875++;
        if (class75.field1796 != 0 || class31.field654 != null) {
            return;
        }
        int var1 = class115.field2705;
        if (class70.field1674 && class74.field1758 >= 516 && class109.field2504 >= 160 && class74.field1758 <= 765 && class109.field2504 <= 205) {
            var1 = 0;
        }
        if (class90.field2066) {
            if (var1 != 1) {
                int var6 = class138.field3298;
                int var7 = class80.field1889;
                if (class31.field663 == 0) {
                    var6 -= 4;
                    var7 -= 4;
                }
                if (class31.field663 == 1) {
                    var7 -= 205;
                    var6 -= 553;
                }
                if (class31.field663 == 2) {
                    var7 -= 357;
                    var6 -= 17;
                }
                if (class76.field1815 - 10 > var6 || var6 > class114.field2681 + class76.field1815 + 10 || class94.field2155 - 10 > var7 || class115.field2701 + class94.field2155 + 10 < var7) {
                    class90.field2066 = false;
                    if (class31.field663 == 2) {
                        class138.field3304 = true;
                    }
                    if (class31.field663 == 1) {
                        class121.field2849 = true;
                    }
                }
            }
            if (var1 == 1) {
                int var8 = class76.field1815;
                int var9 = class94.field2155;
                int var10 = class74.field1758;
                int var11 = class114.field2681;
                int var12 = -1;
                int var13 = class109.field2504;
                if (class31.field663 == 0) {
                    var13 -= 4;
                    var10 -= 4;
                }
                if (class31.field663 == 1) {
                    var10 -= 553;
                    var13 -= 205;
                }
                if (class31.field663 == 2) {
                    var10 -= 17;
                    var13 -= 357;
                }
                for (int var14 = 0; var14 < class55.field1323; var14++) {
                    int var15 = (class55.field1323 - var14 - 1) * 15 + var9 + 31;
                    if (var10 > var8 && var10 < var8 + var11 && var13 > var15 - 13 && var13 < var15 + 3) {
                        var12 = var14;
                    }
                }
                if (var12 != -1) {
                    class69.method573(var12, (byte) 117);
                }
                class90.field2066 = false;
                if (class31.field663 == 2) {
                    class138.field3304 = true;
                }
                if (class31.field663 == 1) {
                    class121.field2849 = true;
                }
            }
        } else {
            if (var1 == 1 && class55.field1323 > 0) {
                int var2 = class69.field1650[class55.field1323 - 1];
                if (var2 == 8 || var2 == 15 || var2 == 4 || var2 == 37 || var2 == 43 || var2 == 2 || var2 == 24 || var2 == 27 || var2 == 55 || var2 == 19 || var2 == 56 || var2 == 1005) {
                    int var3 = class71.field1698[class55.field1323 - 1];
                    int var4 = class65.field1538[class55.field1323 - 1];
                    class33 var5 = class88.method685((byte) -102, var4);
                    if (class12.method107(class83.method649((byte) -102, var5), true) || class121.method946(class83.method649((byte) -102, var5), (byte) -105)) {
                        class81.field1942 = 0;
                        class18.field352 = class109.field2504;
                        class75.field1796 = 2;
                        if (var4 >> 16 == class96.field2163) {
                            class75.field1796 = 1;
                        }
                        if (var4 >> 16 == class63.field1487) {
                            class75.field1796 = 3;
                        }
                        class52.field1274 = false;
                        class119.field2811 = class74.field1758;
                        class122.field2864 = var4;
                        class94.field2158 = var3;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class121.field2839 == 1 || class66.method512((byte) -82, class55.field1323 - 1)) && class55.field1323 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class55.field1323 > 0) {
                class69.method573(class55.field1323 - 1, (byte) 110);
            }
            if (var1 == 2 && class55.field1323 > 0) {
                class135.method1048(-78);
            }
        }
        if (arg0 != -75) {
            method308(42, 2, 70, -30, -95, 104, 86, 22, true, -118, 92, 63);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)V", line = 879)
    public static final void method312(int arg0, int arg1, boolean arg2) {
        field883++;
        long var3 = (long) ((arg1 << 16) + arg0);
        class11 var5 = (class11) class75.field1782.method462(arg2, var3);
        if (var5 != null) {
            class42.field1029.method2(arg2, var5);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V", line = 895)
    public static void method313(byte arg0) {
        field868 = null;
        field892 = null;
        int var1 = 37 % ((50 - arg0) / 60);
        field877 = null;
        field888 = null;
        field870 = null;
        field871 = null;
        field879 = null;
        field889 = null;
        field880 = null;
        field866 = null;
        field891 = null;
        field876 = null;
        field882 = null;
        field865 = null;
        field864 = null;
        field890 = null;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V", line = 967)
    public static final void method314(int arg0) {
        if (class25.field535 == 0 && !class70.field1674) {
            class44.method379(18, class80.field1889, class138.field3298, class127.field2976, 0, class30.field636, (byte) 92);
            class34.field833++;
        }
        if (arg0 != 1) {
            method313((byte) 6);
        }
        field863++;
        int var1 = -1;
        for (int var2 = 0; var2 < class39.field959; var2++) {
            int var3 = class39.field944[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var6 == 2 && class103.field2332.method868(class112.field2593, var4, var5, var3) >= 0) {
                    class106 var8 = class2.method12(var7, 21876);
                    if (var8.field2433 != null) {
                        var8 = var8.method814((byte) 93);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class25.field535 == 1) {
                        class45.field1090++;
                        class44.method379(38, var5, var4, class63.method479(new class67[] { class96.field2168, class22.field493, var8.field2400 }, arg0 - 1), var3, class34.field832, (byte) 59);
                    } else if (!class70.field1674) {
                        class22.field488++;
                        class67[] var9 = var8.field2391;
                        if (class25.field541) {
                            var9 = class49.method403(var9, arg0 ^ 0xFFFFFF9B);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class119.field2810++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 23;
                                    }
                                    if (var10 == 1) {
                                        var11 = 39;
                                    }
                                    if (var10 == 2) {
                                        var11 = 57;
                                    }
                                    if (var10 == 3) {
                                        var11 = 29;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1003;
                                    }
                                    class44.method379(var11, var5, var4, class63.method479(new class67[] { class12.field254, var8.field2400 }, 0), var3, var9[var10], (byte) 96);
                                }
                            }
                        }
                        class44.method379(1004, var5, var4, class63.method479(new class67[] { class12.field254, var8.field2400 }, 0), var8.field2414 << 14, class140.field3339, (byte) 123);
                    } else if ((class106.field2423 & 0x4) == 4) {
                        class100.field2252++;
                        class44.method379(35, var5, var4, class63.method479(new class67[] { class90.field2068, class22.field493, var8.field2400 }, arg0 - 1), var3, class69.field1652, (byte) 96);
                    }
                }
                if (var6 == 1) {
                    class66 var12 = class9.field189[var7];
                    if (var12.field1542.field1707 == 1 && (var12.field1260 & 0x7F) == 64 && (var12.field1190 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class130.field3042; var13++) {
                            class66 var16 = class9.field189[class65.field1530[var13]];
                            if (var16 != null && var12 != var16 && var16.field1542.field1707 == 1 && var12.field1260 == var16.field1260 && var12.field1190 == var16.field1190) {
                                class50.method414(var5, var16.field1542, class65.field1530[var13], var4, -92);
                            }
                        }
                        for (int var14 = 0; var14 < class81.field1948; var14++) {
                            class103 var15 = class44.field1067[class119.field2820[var14]];
                            if (var15 != null && var12.field1260 == var15.field1260 && var12.field1190 == var15.field1190) {
                                class42.method369(arg0 ^ 0xFFFF93CE, var4, var15, class119.field2820[var14], var5);
                            }
                        }
                    }
                    class50.method414(var5, var12.field1542, var7, var4, -124);
                }
                if (var6 == 0) {
                    class103 var17 = class44.field1067[var7];
                    if ((var17.field1260 & 0x7F) == 64 && (var17.field1190 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class130.field3042; var18++) {
                            class66 var21 = class9.field189[class65.field1530[var18]];
                            if (var21 != null && var21.field1542.field1707 == 1 && var17.field1260 == var21.field1260 && var17.field1190 == var21.field1190) {
                                class50.method414(var5, var21.field1542, class65.field1530[var18], var4, -40);
                            }
                        }
                        for (int var19 = 0; var19 < class81.field1948; var19++) {
                            class103 var20 = class44.field1067[class119.field2820[var19]];
                            if (var20 != null && var17 != var20 && var17.field1260 == var20.field1260 && var17.field1190 == var20.field1190) {
                                class42.method369(arg0 - 27698, var4, var20, class119.field2820[var19], var5);
                            }
                        }
                    }
                    class42.method369(-27697, var4, var17, var7, var5);
                }
                if (var6 == 3) {
                    class10 var22 = class4.field67[class112.field2593][var4][var5];
                    if (var22 != null) {
                        for (class85 var23 = (class85) var22.method93((byte) -54); var23 != null; var23 = (class85) var22.method84(109)) {
                            class131 var24 = class55.method440(var23.field1998, 21467);
                            if (class25.field535 == 1) {
                                class44.method379(47, var5, var4, class63.method479(new class67[] { class96.field2168, class10.field227, var24.field3103 }, arg0 - 1), var23.field1998, class34.field832, (byte) 87);
                                class133.field3186++;
                            } else if (!class70.field1674) {
                                class67[] var25 = var24.field3067;
                                class25.field525++;
                                if (class25.field541) {
                                    var25 = class49.method403(var25, -93);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 31;
                                        }
                                        if (var26 == 1) {
                                            var27 = 34;
                                        }
                                        if (var26 == 2) {
                                            var27 = 5;
                                        }
                                        if (var26 == 3) {
                                            var27 = 22;
                                        }
                                        class133.field3158++;
                                        if (var26 == 4) {
                                            var27 = 30;
                                        }
                                        class44.method379(var27, var5, var4, class63.method479(new class67[] { class116.field2741, var24.field3103 }, 0), var23.field1998, var25[var26], (byte) 47);
                                    } else if (var26 == 2) {
                                        class44.method379(5, var5, var4, class63.method479(new class67[] { class116.field2741, var24.field3103 }, 0), var23.field1998, class101.field2279, (byte) 78);
                                        class130.field3035++;
                                    }
                                }
                                class44.method379(1001, var5, var4, class63.method479(new class67[] { class116.field2741, var24.field3103 }, arg0 - 1), var23.field1998, class140.field3339, (byte) 52);
                            } else if ((class106.field2423 & 0x1) == 1) {
                                class44.method379(6, var5, var4, class63.method479(new class67[] { class90.field2068, class10.field227, var24.field3103 }, arg0 ^ 0x1), var23.field1998, class69.field1652, (byte) 60);
                                class138.field3300++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V", line = 1267)
    public static final void method315(boolean arg0) {
        field881++;
        if (class75.field1792[96]) {
            class69.field1647 += (-class69.field1647 - 24) / 2;
        } else if (class75.field1792[97]) {
            class69.field1647 += (24 - class69.field1647) / 2;
        } else {
            class69.field1647 /= 2;
        }
        if (class75.field1792[98]) {
            class119.field2806 += (12 - class119.field2806) / 2;
        } else if (class75.field1792[99]) {
            class119.field2806 += (-class119.field2806 - 12) / 2;
        } else {
            class119.field2806 /= 2;
        }
        class19.field376 = class69.field1647 / 2 + class19.field376 & 0x7FF;
        class121.field2847 += class119.field2806 / 2;
        int var1 = class78.field1849 + class69.field1640.field1260;
        if (class121.field2847 < 128) {
            class121.field2847 = 128;
        }
        int var2 = class69.field1640.field1190 + class71.field1697;
        if (class116.field2739 - var1 < -500 || class116.field2739 - var1 > 500 || class65.field1536 - var2 < -500 || class65.field1536 - var2 > 500) {
            class116.field2739 = var1;
            class65.field1536 = var2;
        }
        if (class65.field1536 != var2) {
            class65.field1536 += (var2 - class65.field1536) / 16;
        }
        if (class121.field2847 > 383) {
            class121.field2847 = 383;
        }
        int var3 = class65.field1536 >> 7;
        int var4 = 0;
        if (!arg0) {
            return;
        }
        if (class116.field2739 != var1) {
            class116.field2739 += (var1 - class116.field2739) / 16;
        }
        int var5 = class116.field2739 >> 7;
        int var6 = class70.method575(class65.field1536, 1, class116.field2739, class112.field2593);
        if (var5 > 3 && var3 > 3 && var5 < 100 && var3 < 100) {
            for (int var7 = var5 - 4; var7 <= var5 + 4; var7++) {
                for (int var8 = var3 - 4; var8 <= var3 + 4; var8++) {
                    int var9 = class112.field2593;
                    if (var9 < 3 && (class21.field443[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class34.field823[var9][var7][var8];
                    if (var10 > var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class18.field351 < var11) {
            class18.field351 += (var11 - class18.field351) / 24;
        } else if (class18.field351 > var11) {
            class18.field351 += (var11 - class18.field351) / 80;
            return;
        }
    }
}
