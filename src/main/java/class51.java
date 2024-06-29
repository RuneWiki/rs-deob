import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class51 extends class72 {

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field1181 = -1;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "Z")
    public static boolean field1196 = false;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "Lec;")
    public static class28 field1193 = class28.method210(-46, "white:");

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "client!ic", name = "kb", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Lvb;")
    public static class122 field1183;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "Lea;")
    public static class26 field1190;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "[Lea;")
    public static class26[] field1186;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method409(int arg0) {
        class123.field2682 = null;
        class62.field1382 = null;
        class118.field2514 = null;
        class25.field552 = null;
        class61.field1365 = null;
        if (arg0 >= -63) {
            field1181 = 96;
        }
        class53.field1219 = null;
        field1179++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lub;II[BIIZIII)V")
    public static final void method410(class117[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field1185++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg8 + var15 > 0 && arg8 + var15 < 103) {
                    arg0[arg4].field2479[arg5 + var10][arg8 + var15] = class106.method732(arg0[arg4].field2479[arg5 + var10][arg8 + var15], -16777217);
                }
            }
        }
        if (arg6) {
            return;
        }
        class119 var11 = new class119(arg3);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 == var12 && var13 >= arg7 && arg7 + 8 > var13 && var14 >= arg9 && arg9 + 8 > var14) {
                        class23.method167(arg2, var11, true, 0, arg5 + class119.method894(var13 & 0x7, var14 & 0x7, arg2, -125654008), arg8 - -class79.method600(arg2, var13 & 0x7, var14 & 0x7, (byte) 46), arg4, 0);
                    } else {
                        class23.method167(0, var11, true, 0, -1, -1, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lud;B)V")
    public final void method411(class119 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method879((byte) 45);
            if (var3 == 0) {
                if (arg1 > -98) {
                    this.field1197 = -15;
                }
                field1184++;
                return;
            }
            this.method414(var3, arg0, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILvb;Lec;Lec;)Lj;")
    public static final class54 method412(int arg0, class122 arg1, class28 arg2, class28 arg3) {
        field1182++;
        if (arg0 == 1) {
            int var4 = arg1.method942(arg3, arg0);
            int var5 = arg1.method930((byte) 101, var4, arg2);
            return class50.method406(var4, 100, arg1, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lvb;I)I")
    public static final int method413(class122 arg0, int arg1) {
        int var2 = arg1;
        field1195++;
        if (arg0.method935(class94.field2075, 1, class123.field2671)) {
            var2 = arg1 + 1;
        }
        if (arg0.method935(class94.field2075, 1, class42.field901)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class76.field1707)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class1.field11)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, arg1 + 1, class7.field123)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class22.field499)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class72.field1611)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, arg1 + 1, class65.field1507)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class95.field2086)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class112.field2395)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class49.field1153)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class31.field660)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class22.field510)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class4.field63)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class118.field2512)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, arg1 ^ 0x1, class112.field2405)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class34.field762)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class4.field62)) {
            var2++;
        }
        if (arg0.method935(class94.field2075, 1, class68.field1538)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILud;B)V")
    private final void method414(int arg0, class119 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field1197 = arg1.method903(2);
            this.field1192 = arg1.method879((byte) 45);
            this.field1189 = arg1.method879((byte) 45);
        }
        if (arg2 != -79) {
            field1193 = null;
        }
        field1187++;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
    public static void method415(byte arg0) {
        field1183 = null;
        int var1 = 45 % ((-arg0 - 22) / 41);
        field1186 = null;
        field1193 = null;
        field1190 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public static final boolean method416(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1180++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class46.field1053[var12][var36] = 0;
                class37.field853[var12][var36] = 99999999;
            }
        }
        class46.field1053[arg7][arg10] = 99;
        class37.field853[arg7][arg10] = 0;
        int var13 = arg10;
        int var14 = arg7;
        int var15 = 0;
        byte var16 = 0;
        class117.field2485[var16] = arg7;
        boolean var17 = false;
        int var37 = var16 + 1;
        class43.field935[var16] = arg10;
        int var18 = class117.field2485.length;
        int[][] var19 = class43.field922[class122.field2657].field2479;
        while (var15 != var37) {
            var14 = class117.field2485[var15];
            var13 = class43.field935[var15];
            var15 = (var15 + 1) % var18;
            if (arg11 == var14 && arg4 == var13) {
                var17 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class43.field922[class122.field2657].method838(arg1 - 1, arg4, var13, arg11, 0, var14, arg9)) {
                    var17 = true;
                    break;
                }
                if (arg1 < 10 && class43.field922[class122.field2657].method837(arg1 - 1, var13, arg4, (byte) -123, arg9, arg11, var14)) {
                    var17 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg5 != 0 && class43.field922[class122.field2657].method847(arg8, false, arg5, arg4, arg2, var13, var14, arg11)) {
                var17 = true;
                break;
            }
            int var35 = class37.field853[var14][var13] + 1;
            if (var14 > 0 && class46.field1053[var14 - 1][var13] == 0 && (var19[var14 - 1][var13] & 0x1280108) == 0) {
                class117.field2485[var37] = var14 - 1;
                class43.field935[var37] = var13;
                class46.field1053[var14 - 1][var13] = 2;
                class37.field853[var14 - 1][var13] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 < 103 && class46.field1053[var14 + 1][var13] == 0 && (var19[var14 + 1][var13] & 0x1280180) == 0) {
                class117.field2485[var37] = var14 + 1;
                class43.field935[var37] = var13;
                class46.field1053[var14 + 1][var13] = 8;
                class37.field853[var14 + 1][var13] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && class46.field1053[var14][var13 - 1] == 0 && (var19[var14][var13 - 1] & 0x1280102) == 0) {
                class117.field2485[var37] = var14;
                class43.field935[var37] = var13 - 1;
                var37 = (var37 + 1) % var18;
                class46.field1053[var14][var13 - 1] = 1;
                class37.field853[var14][var13 - 1] = var35;
            }
            if (var13 < 103 && class46.field1053[var14][var13 + 1] == 0 && (var19[var14][var13 + 1] & 0x1280120) == 0) {
                class117.field2485[var37] = var14;
                class43.field935[var37] = var13 + 1;
                var37 = (var37 + 1) % var18;
                class46.field1053[var14][var13 + 1] = 4;
                class37.field853[var14][var13 + 1] = var35;
            }
            if (var14 > 0 && var13 > 0 && class46.field1053[var14 - 1][var13 - 1] == 0 && (var19[var14 - 1][var13 - 1] & 0x128010E) == 0 && (var19[var14 - 1][var13] & 0x1280108) == 0 && (var19[var14][var13 - 1] & 0x1280102) == 0) {
                class117.field2485[var37] = var14 - 1;
                class43.field935[var37] = var13 - 1;
                var37 = (var37 + 1) % var18;
                class46.field1053[var14 - 1][var13 - 1] = 3;
                class37.field853[var14 - 1][var13 - 1] = var35;
            }
            if (var14 < 103 && var13 > 0 && class46.field1053[var14 + 1][var13 - 1] == 0 && (var19[var14 + 1][var13 - 1] & 0x1280183) == 0 && (var19[var14 + 1][var13] & 0x1280180) == 0 && (var19[var14][var13 - 1] & 0x1280102) == 0) {
                class117.field2485[var37] = var14 + 1;
                class43.field935[var37] = var13 - 1;
                var37 = (var37 + 1) % var18;
                class46.field1053[var14 + 1][var13 - 1] = 9;
                class37.field853[var14 + 1][var13 - 1] = var35;
            }
            if (var14 > 0 && var13 < 103 && class46.field1053[var14 - 1][var13 + 1] == 0 && (var19[var14 - 1][var13 + 1] & 0x1280138) == 0 && (var19[var14 - 1][var13] & 0x1280108) == 0 && (var19[var14][var13 + 1] & 0x1280120) == 0) {
                class117.field2485[var37] = var14 - 1;
                class43.field935[var37] = var13 + 1;
                class46.field1053[var14 - 1][var13 + 1] = 6;
                class37.field853[var14 - 1][var13 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 < 103 && var13 < 103 && class46.field1053[var14 + 1][var13 + 1] == 0 && (var19[var14 + 1][var13 + 1] & 0x12801E0) == 0 && (var19[var14 + 1][var13] & 0x1280180) == 0 && (var19[var14][var13 + 1] & 0x1280120) == 0) {
                class117.field2485[var37] = var14 + 1;
                class43.field935[var37] = var13 + 1;
                class46.field1053[var14 + 1][var13 + 1] = 12;
                class37.field853[var14 + 1][var13 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
        }
        class46.field1032 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg11 - var22; var23 <= arg11 + var22; var23++) {
                for (int var24 = arg4 - var22; var24 <= arg4 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class37.field853[var23][var24] < 100) {
                        int var25 = 0;
                        if (var24 < arg4) {
                            var25 = arg4 - var24;
                        } else if (var24 > arg4 + arg5 - 1) {
                            var25 = var24 + 1 - arg4 - arg5;
                        }
                        int var26 = 0;
                        if (var23 < arg11) {
                            var26 = arg11 - var23;
                        } else if (arg11 + arg8 - 1 < var23) {
                            var26 = var23 + 1 - arg11 - arg8;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class37.field853[var23][var24] < var21) {
                            var21 = class37.field853[var23][var24];
                            var14 = var23;
                            var13 = var24;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg7 == var14 && arg10 == var13) {
                return false;
            }
            class46.field1032 = 1;
        }
        byte var28 = 0;
        class117.field2485[var28] = var14;
        if (arg3 >= -6) {
            field1186 = null;
        }
        int var38 = var28 + 1;
        class43.field935[var28] = var13;
        int var29;
        int var30 = var29 = class46.field1053[var14][var13];
        while (arg7 != var14 || arg10 != var13) {
            if (var29 != var30) {
                class117.field2485[var38] = var14;
                var29 = var30;
                class43.field935[var38++] = var13;
            }
            if ((var30 & 0x1) != 0) {
                var13++;
            } else if ((var30 & 0x4) != 0) {
                var13--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class46.field1053[var14][var13];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class117.field2485[var38];
            int var33 = class43.field935[var38];
            if (arg6 == 0) {
                class5.field85.method161((byte) 116, 130);
                class5.field85.method888(var31 + var31 + 3, 118);
                class78.field1763++;
            }
            if (arg6 == 1) {
                class55.field1270++;
                class5.field85.method161((byte) 85, 136);
                class5.field85.method888(var31 + var31 + 14 + 3, -119);
            }
            if (arg6 == 2) {
                class5.field85.method161((byte) 125, 89);
                class5.field85.method888(var31 + var31 + 3, 119);
                field1191++;
            }
            class5.field85.method886(class74.field1634[82] ? 1 : 0, true);
            class5.field85.method866(-791766776, class18.field366 + var32);
            class5.field85.method892(class87.field1934 + var33, 1815787688);
            class127.field2750 = class117.field2485[0];
            class27.field585 = class43.field935[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class5.field85.method886(class117.field2485[var38] - var32, true);
                class5.field85.method897(class43.field935[var38] - var33, (byte) -43);
            }
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method417(String arg0, int arg1) {
        field1194++;
        System.out.println("Error: " + arg0);
        try {
            String var2 = arg0.replace(':', '.');
            int var3 = 84 / ((arg1 + 37) / 44);
            String var4 = var2.replace('@', '_');
            String var5 = var4.replace('&', '_');
            String var6 = var5.replace('#', '_');
            class97 var7 = class96.field2147.method622(new URL(class96.field2147.field1871.getCodeBase(), "reporterror.ws?c=" + class94.field2077 + "&u=" + class30.field641 + "&v1=" + class82.field1867 + "&v2=" + class82.field1879 + "&e=" + var6), 127);
            while (var7.field2157 == 0) {
                class31.method247(1L, (byte) 123);
            }
            if (var7.field2157 == 1) {
                DataInputStream var8 = (DataInputStream) var7.field2154;
                var8.read();
                var8.close();
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZII)Lbb;")
    public static final class9 method418(boolean arg0, boolean arg1, int arg2, int arg3) {
        field1188++;
        class63 var4 = null;
        if (class13.field236 != null) {
            var4 = new class63(arg2, class13.field236, class4.field74[arg2], 1000000);
        }
        if (arg3 != 3537) {
            method418(true, false, 14, 47);
        }
        return new class9(class93.field2057, var4, arg2, arg1, arg0);
    }
}
