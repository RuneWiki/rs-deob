import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class77 extends class196 {

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public int field1330 = 5;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public int field1338 = -1;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public int field1346 = -1;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public int field1354 = -1;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public int field1352 = 99;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public int field1347 = 2;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "Z")
    public boolean field1356 = false;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    public int field1359 = -1;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public int field1355 = -1;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "Lai;")
    public static class10 field1343 = class44.method278("Bitte laden Sie die Seite neu)3", -34);

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "[I")
    public static int[] field1341 = new int[200];

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lai;")
    public static class10 field1353 = class44.method278("::noclip", -86);

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "Lai;")
    public static class10 field1333 = class44.method278("Spieler", -27);

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "Lwa;")
    public static class200 field1342;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "[I")
    private int[] field1337;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "[I")
    public int[] field1339;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "[I")
    private int[] field1350;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "[I")
    public int[] field1351;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "[I")
    public int[] field1358;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "[I")
    public static int[] field1360;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILwa;I)V")
    public static final void method473(int arg0, int arg1, class200 arg2, int arg3) {
        field1332++;
        if (class100.field1871 != null || class180.field3415 || (arg2 == null || class117.method841(arg2, 119) == null)) {
            return;
        }
        if (arg1 != -7) {
            method473(-16, -35, null, 64);
        }
        class100.field1871 = arg2;
        class11.field174 = class117.method841(arg2, 80);
        class155.field3009 = 0;
        class184.field3507 = false;
        class109.field2034 = arg3;
        class108.field2015 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLsa;I)Lsa;")
    public final class164 method474(boolean arg0, class164 arg1, int arg2) {
        field1344++;
        int var4 = this.field1339[arg2];
        class185 var5 = class179.method1158(var4 >> 16, 120);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1087(true);
        } else {
            class164 var7 = arg1.method1087(!var5.method1192(var6, (byte) 15));
            var7.method1084(var5, var6);
            return arg0 ? var7 : null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lsa;Lic;III)Lsa;")
    public final class164 method475(class164 arg0, class77 arg1, int arg2, int arg3, int arg4) {
        field1345++;
        int var6 = this.field1339[arg4];
        class185 var7 = class179.method1158(var6 >> 16, 123);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method476((byte) -34, arg0, arg2);
        }
        int var9 = arg1.field1339[arg2];
        if (arg3 != 4) {
            return null;
        }
        class185 var10 = class179.method1158(var9 >> 16, -128);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class164 var12 = arg0.method1088(!var7.method1192(var8, (byte) 15));
            var12.method1084(var7, var8);
            return var12;
        } else {
            class164 var13 = arg0.method1088(!var7.method1192(var8, (byte) 15) & !var10.method1192(var11, (byte) 15));
            var13.method1092(var7, var8, var10, var11, this.field1350);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLsa;I)Lsa;")
    public final class164 method476(byte arg0, class164 arg1, int arg2) {
        if (arg0 != -34) {
            this.method474(false, null, 46);
        }
        int var4 = this.field1339[arg2];
        field1336++;
        class185 var5 = class179.method1158(var4 >> 16, arg0 - 42);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1088(true);
        } else {
            class164 var7 = arg1.method1088(!var5.method1192(var6, (byte) 15));
            var7.method1084(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(BLsa;I)Lsa;")
    public final class164 method477(byte arg0, class164 arg1, int arg2) {
        field1340++;
        if (arg0 != -102) {
            field1360 = null;
        }
        int var4 = this.field1339[arg2];
        class185 var5 = class179.method1158(var4 >> 16, -78);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1088(true);
        }
        int var7 = 0;
        class185 var8 = null;
        if (this.field1337 != null && this.field1337.length > arg2) {
            int var9 = this.field1337[arg2];
            var8 = class179.method1158(var9 >> 16, 41);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class164 var11 = arg1.method1088(!var5.method1192(var6, (byte) 15));
            var11.method1084(var5, var6);
            return var11;
        } else {
            class164 var10 = arg1.method1088(!var5.method1192(var6, (byte) 15) & !var8.method1192(var7, (byte) 15));
            var10.method1084(var5, var6);
            var10.method1084(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILme;)V")
    public final void method478(int arg0, class114 arg1) {
        while (true) {
            int var3 = arg1.method767(true);
            if (var3 == 0) {
                if (arg0 != -2) {
                    this.field1352 = 126;
                }
                field1357++;
                return;
            }
            this.method482(arg1, var3, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZLsa;)Lsa;")
    public final class164 method479(int arg0, int arg1, boolean arg2, class164 arg3) {
        field1329++;
        int var5 = this.field1339[arg0];
        class185 var6 = class179.method1158(var5 >> 16, 65);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method1088(true);
        }
        int var8 = arg1 & 0x3;
        class164 var9 = arg3.method1088(!var6.method1192(var7, (byte) 15));
        if (var8 == 1) {
            var9.method1082();
        } else if (var8 == 2) {
            var9.method1080();
        } else if (var8 == 3) {
            var9.method1085();
        }
        var9.method1084(var6, var7);
        if (var8 == 1) {
            var9.method1085();
        } else if (var8 == 2) {
            var9.method1080();
        } else if (var8 == 3) {
            var9.method1082();
        }
        return arg2 ? null : var9;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public static void method480(int arg0) {
        field1341 = null;
        field1333 = null;
        field1353 = null;
        field1342 = null;
        if (arg0 != -1) {
            field1341 = null;
        }
        field1343 = null;
        field1360 = null;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public final void method481(int arg0) {
        if (this.field1359 == -1) {
            if (this.field1350 == null) {
                this.field1359 = 0;
            } else {
                this.field1359 = 2;
            }
        }
        if (this.field1346 == -1) {
            if (this.field1350 == null) {
                this.field1346 = 0;
            } else {
                this.field1346 = 2;
            }
        }
        if (arg0 != -29187) {
            this.method479(-10, 4, false, null);
        }
        field1334++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lme;IB)V")
    private final void method482(class114 arg0, int arg1, byte arg2) {
        field1335++;
        int var4 = -10 % ((arg2 - 54) / 59);
        if (arg1 == 1) {
            int var12 = arg0.method762((byte) 82);
            this.field1358 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1358[var13] = arg0.method762((byte) 111);
            }
            this.field1339 = new int[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                this.field1339[var14] = arg0.method762((byte) 119);
            }
            for (int var15 = 0; var15 < var12; var15++) {
                this.field1339[var15] += arg0.method762((byte) 122) << 16;
            }
        } else if (arg1 == 2) {
            this.field1355 = arg0.method762((byte) 79);
        } else if (arg1 == 3) {
            int var10 = arg0.method767(true);
            this.field1350 = new int[var10 + 1];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1350[var11] = arg0.method767(true);
            }
            this.field1350[var10] = 9999999;
        } else if (arg1 == 4) {
            this.field1356 = true;
        } else if (arg1 == 5) {
            this.field1330 = arg0.method767(true);
        } else if (arg1 == 6) {
            this.field1338 = arg0.method762((byte) 95);
        } else if (arg1 == 7) {
            this.field1354 = arg0.method762((byte) 100);
        } else if (arg1 == 8) {
            this.field1352 = arg0.method767(true);
        } else if (arg1 == 9) {
            this.field1359 = arg0.method767(true);
        } else if (arg1 == 10) {
            this.field1346 = arg0.method767(true);
        } else if (arg1 == 11) {
            this.field1347 = arg0.method767(true);
        } else if (arg1 == 12) {
            int var7 = arg0.method767(true);
            this.field1337 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1337[var8] = arg0.method762((byte) 93);
            }
            for (int var9 = 0; var9 < var7; var9++) {
                this.field1337[var9] = (arg0.method762((byte) 123) << 16) + this.field1337[var9];
            }
        } else if (arg1 == 13) {
            int var5 = arg0.method767(true);
            this.field1351 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1351[var6] = arg0.method771(126);
            }
            return;
        }
    }
}
