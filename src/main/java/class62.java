import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class62 {

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Ljd;")
    public static class86 field1223 = class122.method868("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", true);

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
    public static int[] field1218 = new int[5];

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Ljd;")
    public static class86 field1228 = class122.method868("<col=ff0000>", true);

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Ljd;")
    public static class86 field1232 = class122.method868("leuchten1:", true);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Ljd;")
    public static class86 field1216 = class122.method868("welle2:", true);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lwb;")
    public static class26 field1219;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
    public abstract void method440(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILwj;)V")
    public static final void method441(int arg0, class6 arg1) {
        if (class227.field4116 == arg1.field124) {
            class21.field540[arg1.field125] = true;
        }
        field1230++;
        if (arg0 != -29481) {
            method446(56, 20, -61);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLwj;)I")
    public static final int method442(int arg0, byte arg1, class6 arg2) {
        field1231++;
        if (arg2.field99 == null || arg0 >= arg2.field99.length) {
            return -2;
        }
        try {
            if (arg1 < 93) {
                method441(48, (class6) null);
            }
            int[] var3 = arg2.field99[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 1) {
                    var8 = class221.field3974[var3[var4++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 2) {
                    var8 = class44.field976[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class69.field1351[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class6 var12 = class25.method178(75, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class272.method1853(0, var13).field1396 || class125.field2422)) {
                        for (int var14 = 0; var14 < var12.field232.length; var14++) {
                            if ((var13 + 1) == var12.field232[var14]) {
                                var8 += var12.field201[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class273.field4805[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class24.field586[class44.field976[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class273.field4805[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class124.field2412.field4045;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class236.field4257[var15]) {
                            var8 += class44.field976[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class6 var18 = class25.method178(110, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class272.method1853(0, var19).field1396 || class125.field2422)) {
                        for (int var20 = 0; var20 < var18.field232.length; var20++) {
                            if ((var19 + 1) == var18.field232[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class73.field1481;
                }
                if (var7 == 12) {
                    var8 = class257.field4565;
                }
                if (var7 == 13) {
                    int var21 = class273.field4805[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class233.method1615(var23, (byte) -112);
                }
                if (var7 == 18) {
                    var8 = (class124.field2412.field676 >> 7) + class252.field4481;
                }
                if (var7 == 19) {
                    var8 = (class124.field2412.field685 >> 7) + class79.field1554;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static final void method443(int arg0) {
        if (arg0 != 19) {
            method441(-11, (class6) null);
        }
        field1226++;
        class237.field4276.method703((byte) 122);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static void method444(int arg0) {
        field1223 = null;
        field1218 = null;
        field1232 = null;
        if (arg0 != 5) {
            method444(105);
        }
        field1219 = null;
        field1216 = null;
        field1228 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)V")
    public static final void method445(long arg0, byte arg1) {
        field1224++;
        if (arg0 == 0L || arg1 != 77) {
            return;
        }
        for (int var3 = 0; var3 < class56.field1146; var3++) {
            if (class119.field2325[var3] == arg0) {
                class56.field1146--;
                for (int var4 = var3; var4 < class56.field1146; var4++) {
                    class119.field2325[var4] = class119.field2325[var4 + 1];
                    class185.field3283[var4] = class185.field3283[var4 + 1];
                }
                class177.field3207 = class27.field621;
                class36.field809.method1356(93, true);
                class130.field2482++;
                class36.field809.method1399((byte) -28, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
    public static final void method446(int arg0, int arg1, int arg2) {
        if (arg0 <= 121) {
            field1219 = null;
        }
        class77 var3 = class273.method1858((byte) 14, arg2);
        field1221++;
        int var4 = var3.field1525;
        int var5 = var3.field1529;
        int var6 = var3.field1522;
        int var7 = class275.field4820[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class274.method1867(~var8 & class273.field4805[var4] | arg1 << var5 & var8, -1252116442, var4);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    public abstract void method447(int arg0, int arg1);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V")
    public static final void method448(byte arg0, int arg1) {
        int var2 = -25 / (arg0 / 52);
        class161 var3 = class204.method1456(true, 2, arg1);
        var3.method1173(true);
        field1225++;
    }
}
