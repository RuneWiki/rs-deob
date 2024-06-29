import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 extends class145 {

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "Lfc;")
    public static class39 field1313 = class90.method774("Fehler beim Laden Ihres Spielcharakters)3", -105);

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field1323 = -1;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lfc;")
    public static class39 field1334 = class90.method774("", -108);

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "Lfc;")
    public static class39 field1319 = class90.method774("backleft2", -127);

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "Loc;")
    public static class100 field1338;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "Loe;")
    public class102 field1339;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Lpa;")
    public class105 field1311;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "Ltd;")
    public class134 field1309;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "Lla;")
    public class77 field1320;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lmf;")
    public static class89 field1333;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "Lmf;")
    public static class89 field1337;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "[I")
    public static int[] field1316;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V", line = 3)
    public static final void method558(int arg0, byte arg1) {
        class140 var2 = (class140) class149.field3705.method992(true);
        int var3 = 89 % ((arg1 - 61) / 39);
        while (var2 != null) {
            if ((long) arg0 == (var2.field3619 >> 48 & 0xFFFFL)) {
                var2.method1170(40);
            }
            var2 = (class140) class149.field3705.method993(-20300);
        }
        field1336++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V", line = 29)
    public static void method559(boolean arg0) {
        field1334 = null;
        if (arg0) {
            method560(-12, -20, null, -31, null, -128, -5);
        }
        field1337 = null;
        field1333 = null;
        field1338 = null;
        field1313 = null;
        field1319 = null;
        field1316 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II[Lod;I[BII)V", line = 61)
    public static final void method560(int arg0, int arg1, class101[] arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        for (int var7 = arg0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg5 + var12 > 0 && arg5 + var12 < 103 && arg1 + var13 > 0 && arg1 + var13 < 103) {
                        arg2[var7].field2526[arg5 + var12][arg1 + var13] = class87.method747(arg2[var7].field2526[arg5 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        field1322++;
        class25 var8 = new class25(arg4);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class43.method505(var9, arg6, var8, (byte) 10, arg3, 0, arg5 + var10, var11 - -arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIII)V", line = 123)
    public static final void method561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1328++;
        class131 var10 = (class131) class43.field1162.method8(-1);
        class131 var11 = null;
        while (var10 != null) {
            if (var10.field3303 == arg4 && var10.field3295 == arg5 && var10.field3288 == arg0 && var10.field3292 == arg3) {
                var11 = var10;
                break;
            }
            var10 = (class131) class43.field1162.method9(1);
        }
        if (var11 == null) {
            var11 = new class131();
            var11.field3288 = arg0;
            var11.field3303 = arg4;
            var11.field3295 = arg5;
            var11.field3292 = arg3;
            class132.method1073(var11, 86);
            class43.field1162.method19(var11, 7);
        }
        var11.field3305 = arg2;
        var11.field3311 = arg6;
        var11.field3307 = arg8;
        if (arg7 < 76) {
            method563(null, (byte) -35);
        }
        var11.field3289 = arg1;
        var11.field3298 = arg9;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)V", line = 171)
    public static final void method562(int arg0, int arg1, byte arg2) {
        field1317++;
        class43 var3 = class137.method1112(-1, arg1);
        if (arg2 < 48) {
            field1323 = -27;
        }
        int var4 = var3.field1158;
        int var5 = var3.field1168;
        int var6 = var3.field1178;
        int var7 = class14.field362[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class110.field2834[var4] = class126.method1050(class87.method747(class110.field2834[var4], ~var8), class87.method747(var8, arg0 << var5));
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lob;B)Z", line = 215)
    public static final boolean method563(class99 arg0, byte arg1) {
        field1305++;
        if (arg0.field2333 == null) {
            return false;
        }
        if (arg1 != -33) {
            field1313 = null;
        }
        for (int var2 = 0; var2 < arg0.field2333.length; var2++) {
            int var3 = class113.method988(arg0, (byte) 52, var2);
            int var4 = arg0.field2433[var2];
            if (arg0.field2333[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field2333[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field2333[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 278)
    public final void method564(int arg0) {
        this.field1311 = null;
        this.field1320 = null;
        this.field1309 = null;
        field1330++;
        if (arg0 != 10249) {
            this.field1315 = 114;
        }
        this.field1339 = null;
    }
}
