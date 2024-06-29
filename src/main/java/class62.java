import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class62 extends class19 {

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public int field1263 = -1;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public int field1261 = -1;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public int field1277 = 99;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public int field1267 = -1;

    @OriginalMember(owner = "client!gg", name = "gb", descriptor = "I")
    public int field1282 = 5;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "Z")
    public boolean field1270 = false;

    @OriginalMember(owner = "client!gg", name = "pb", descriptor = "I")
    public int field1291 = -1;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public int field1271 = -1;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    public int field1276 = 2;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "[I")
    public static int[] field1273 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "Lsd;")
    private static class166 field1275 = class135.method935("Players", 0);

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "[Lre;")
    public static class158[] field1280 = new class158[1000];

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
    public static int field1281 = 0;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Lsd;")
    public static class166 field1265 = field1275;

    @OriginalMember(owner = "client!gg", name = "ib", descriptor = "I")
    public static int field1284 = 0;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!gg", name = "hb", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!gg", name = "jb", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!gg", name = "kb", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!gg", name = "lb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!gg", name = "mb", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!gg", name = "qb", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "[I")
    public int[] field1268;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "[I")
    public int[] field1279;

    @OriginalMember(owner = "client!gg", name = "nb", descriptor = "[I")
    private int[] field1289;

    @OriginalMember(owner = "client!gg", name = "ob", descriptor = "[I")
    public int[] field1290;

    @OriginalMember(owner = "client!gg", name = "rb", descriptor = "[I")
    private int[] field1293;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)Lsd;")
    public static final class166 method514(int arg0, int arg1) {
        if (arg0 != -13450) {
            return null;
        }
        field1283++;
        if (arg1 < 100000) {
            return class22.method148(new class166[] { class49.field909, class174.method1192(false, arg1), class98.field1877 }, 0);
        } else if (arg1 < 10000000) {
            return class22.method148(new class166[] { class79.field1624, class174.method1192(false, arg1 / 1000), class100.field1904, class98.field1877 }, 0);
        } else {
            return class22.method148(new class166[] { class144.field2795, class174.method1192(false, arg1 / 1000000), class139.field2717, class98.field1877 }, 0);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lgg;ILo;BI)Lo;")
    public final class126 method515(class62 arg0, int arg1, class126 arg2, byte arg3, int arg4) {
        field1264++;
        int var6 = this.field1279[arg4];
        class120 var7 = class169.method1177(var6 >> 16, false);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method524(arg1, arg2, (byte) -118);
        }
        int var9 = arg0.field1279[arg1];
        class120 var10 = class169.method1177(var9 >> 16, false);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class126 var12 = arg2.method852(!var7.method865(var8, (byte) -99));
            var12.method847(var7, var8);
            return var12;
        }
        if (arg3 <= 29) {
            method517(true);
        }
        class126 var13 = arg2.method852(!var7.method865(var8, (byte) -53) & !var10.method865(var11, (byte) -116));
        var13.method849(var7, var8, var10, var11, this.field1289);
        return var13;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lo;II)Lo;")
    public final class126 method516(class126 arg0, int arg1, int arg2) {
        int var4 = this.field1279[arg1];
        field1286++;
        class120 var5 = class169.method1177(var4 >> 16, false);
        int var6 = var4 & arg2;
        if (var5 == null) {
            return arg0.method845(true);
        } else {
            class126 var7 = arg0.method845(!var5.method865(var6, (byte) -96));
            var7.method847(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static void method517(boolean arg0) {
        field1273 = null;
        field1265 = null;
        if (arg0) {
            field1275 = null;
            field1280 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILff;)V")
    private final void method518(int arg0, int arg1, class53 arg2) {
        if (arg0 > -72) {
            return;
        }
        if (arg1 == 1) {
            int var4 = arg2.method405(2);
            this.field1268 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1268[var5] = arg2.method405(2);
            }
            this.field1279 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1279[var6] = arg2.method405(2);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1279[var7] += arg2.method405(2) << 16;
            }
        } else if (arg1 == 2) {
            this.field1267 = arg2.method405(2);
        } else if (arg1 == 3) {
            int var8 = arg2.method400(255);
            this.field1289 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1289[var9] = arg2.method400(255);
            }
            this.field1289[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field1270 = true;
        } else if (arg1 == 5) {
            this.field1282 = arg2.method400(255);
        } else if (arg1 == 6) {
            this.field1263 = arg2.method405(2);
        } else if (arg1 == 7) {
            this.field1261 = arg2.method405(2);
        } else if (arg1 == 8) {
            this.field1277 = arg2.method400(255);
        } else if (arg1 == 9) {
            this.field1271 = arg2.method400(255);
        } else if (arg1 == 10) {
            this.field1291 = arg2.method400(255);
        } else if (arg1 == 11) {
            this.field1276 = arg2.method400(255);
        } else if (arg1 == 12) {
            int var12 = arg2.method400(255);
            this.field1293 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1293[var13] = arg2.method405(2);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field1293[var14] += arg2.method405(2) << 16;
            }
        } else if (arg1 == 13) {
            int var10 = arg2.method400(255);
            this.field1290 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1290[var11] = arg2.method422((byte) 118);
            }
        }
        field1262++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILo;I)Lo;")
    public final class126 method519(int arg0, class126 arg1, int arg2) {
        field1278++;
        if (arg0 != -25747) {
            method514(18, -43);
        }
        int var4 = this.field1279[arg2];
        class120 var5 = class169.method1177(var4 >> 16, false);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method852(true);
        }
        class120 var7 = null;
        int var8 = 0;
        if (this.field1293 != null && this.field1293.length > arg2) {
            int var9 = this.field1293[arg2];
            var7 = class169.method1177(var9 >> 16, false);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class126 var11 = arg1.method852(!var5.method865(var6, (byte) -71));
            var11.method847(var5, var6);
            return var11;
        } else {
            class126 var10 = arg1.method852(!var5.method865(var6, (byte) -128) & !var7.method865(var8, (byte) -115));
            var10.method847(var5, var6);
            var10.method847(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "(I)V")
    public static final void method520(int arg0) {
        class85.field1699.method1093(0);
        field1266++;
        int var1 = 0;
        int var2 = 113 % ((arg0 + 19) / 34);
        while (var1 < 32) {
            class137.field2680[var1] = 0L;
            var1++;
        }
        for (int var3 = 0; var3 < 32; var3++) {
            class153.field2955[var3] = 0L;
        }
        class160.field3056 = 0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lff;I)V")
    public final void method521(class53 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method400(255);
            if (var3 == 0) {
                if (arg1 != 16298) {
                    return;
                }
                field1269++;
                return;
            }
            this.method518(-125, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public final void method522(byte arg0) {
        if (this.field1291 == -1) {
            if (this.field1289 == null) {
                this.field1291 = 0;
            } else {
                this.field1291 = 2;
            }
        }
        if (this.field1271 == -1) {
            if (this.field1289 == null) {
                this.field1271 = 0;
            } else {
                this.field1271 = 2;
            }
        }
        if (arg0 != -118) {
            this.method523(11, null, -22, -88);
        }
        field1274++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILo;II)Lo;")
    public final class126 method523(int arg0, class126 arg1, int arg2, int arg3) {
        int var5 = this.field1279[arg0];
        field1272++;
        class120 var6 = class169.method1177(var5 >> 16, false);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method852(true);
        }
        if (arg2 != -11) {
            this.field1276 = -63;
        }
        int var8 = arg3 & 0x3;
        class126 var9 = arg1.method852(!var6.method865(var7, (byte) -117));
        if (var8 == 1) {
            var9.method901();
        } else if (var8 == 2) {
            var9.method897();
        } else if (var8 == 3) {
            var9.method902();
        }
        var9.method847(var6, var7);
        if (var8 == 1) {
            var9.method902();
        } else if (var8 == 2) {
            var9.method897();
        } else if (var8 == 3) {
            var9.method901();
        }
        return var9;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILo;B)Lo;")
    public final class126 method524(int arg0, class126 arg1, byte arg2) {
        int var4 = this.field1279[arg0];
        class120 var5 = class169.method1177(var4 >> 16, false);
        int var6 = var4 & 0xFFFF;
        field1285++;
        if (var5 == null) {
            return arg1.method852(true);
        } else {
            class126 var7 = arg1.method852(!var5.method865(var6, (byte) -117));
            var7.method847(var5, var6);
            int var8 = 82 / ((arg2 + 55) / 57);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    public static final void method525(byte arg0) {
        int var1 = 33 % ((arg0 - 80) / 34);
        field1287++;
        if (!class179.field3393) {
            return;
        }
        class193 var2 = class121.method875(class127.field2497, class125.field2455, 95);
        if (var2 != null && var2.field3838 != null) {
            class137 var3 = new class137();
            var3.field2673 = var2;
            var3.field2668 = var2.field3838;
            class166.method1126((byte) -113, var3);
        }
        class179.field3393 = false;
        class68.method550(var2, 15);
    }
}
