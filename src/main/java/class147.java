import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class147 implements class229 {

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Le;")
    private class342 field2418 = new class342(256);

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Lbm;")
    private class307 field2414;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Lbm;")
    private class307 field2419;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "[Lbk;")
    private class51[] field2404;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field2416 = 0;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2410 = "M";

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field2401 = 0;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lab;")
    public static class279 field2415 = new class279(64);

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field2422 = 0;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lbm;")
    public static class307 field2402;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lbm;")
    public static class307 field2417;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(II)Ljava/lang/String;", line = 13)
    public static final String method955(int arg0, int arg1) {
        field2409++;
        if (arg0 != 4803) {
            field2421 = -72;
        }
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF2DEB) >> 16) + "." + ((arg1 & 0xFFA9) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(JZ)V", line = 24)
    public static final void method956(long arg0, boolean arg1) {
        field2420++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class274.field4197 < 100 || class77.field1534) || class274.field4197 >= 200) {
            class42.method321(class228.field3602, 0, 1, "");
            return;
        }
        String var3 = class159.method1024(arg0, (byte) 83);
        for (int var4 = 0; var4 < class274.field4197; var4++) {
            if (class248.field3859[var4] == arg0) {
                class42.method321(var3 + class180.field2901, 0, 1, "");
                return;
            }
        }
        for (int var5 = 0; var5 < class77.field1538; var5++) {
            if (class291.field4471[var5] == arg0) {
                class42.method321(class219.field3469 + var3 + class80.field1576, 0, 1, "");
                return;
            }
        }
        if (var3.equals(class66.field1265.field4269)) {
            class42.method321(class256.field4000, 0, 1, "");
            return;
        }
        class296.field4509[class274.field4197] = var3;
        class120.field2089++;
        class248.field3859[class274.field4197] = arg0;
        class306.field4633[class274.field4197] = 0;
        class293.field4485[class274.field4197] = "";
        class1.field16[class274.field4197] = 0;
        class95.field1707[class274.field4197] = false;
        class274.field4197++;
        class165.field2670 = class342.field5323;
        if (!arg1) {
            method959((byte) 111);
        }
        class14.field263.method80(75, (byte) 105);
        class14.field263.method1353((byte) -105, arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(FIIZZI)[I", line = 98)
    public final int[] method957(float arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        if (!arg3) {
            this.field2419 = (class307) null;
        }
        field2411++;
        return this.method387(9, arg5).method1205(this, 10100, (double) arg0, this.field2404[arg5].field1029, arg4, this.field2414, arg1, arg2);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(ZI)Z", line = 115)
    public final boolean method958(boolean arg0, int arg1) {
        if (arg0) {
            field2413++;
            class189 var3 = this.method387(9, arg1);
            return var3 != null && var3.method1210(this, this.field2414, false);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 127)
    public static void method959(byte arg0) {
        field2410 = null;
        field2415 = null;
        if (arg0 != -87) {
            method955(30, -97);
        }
        field2402 = null;
        field2417 = null;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(BI)Lbk;", line = 140)
    public final class51 method960(byte arg0, int arg1) {
        if (arg0 != 99) {
            field2415 = (class279) null;
        }
        field2412++;
        return this.field2404[arg1];
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 155)
    public static final void method961(int arg0) {
        for (int var1 = arg0; var1 < 100; var1++) {
            class337.field5220[var1] = true;
        }
        field2407++;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lbm;Lbm;Lbm;)V", line = 232)
    public class147(class307 arg0, class307 arg1, class307 arg2) {
        this.field2414 = arg2;
        this.field2419 = arg1;
        class202 var4 = new class202(arg0.method2036(0, 0, (byte) 78));
        int var5 = var4.method1315(14289);
        this.field2404 = new class51[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1317((byte) -81) == 1) {
                this.field2404[var6] = new class51();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2404[var7] != null) {
                this.field2404[var7].field1020 = var4.method1317((byte) -118) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2404[var8] != null) {
                this.field2404[var8].field1028 = var4.method1317((byte) -86) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2404[var9] != null) {
                this.field2404[var9].field1030 = var4.method1317((byte) -72) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2404[var10] != null) {
                this.field2404[var10].field1022 = var4.method1317((byte) -104) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2404[var11] != null) {
                this.field2404[var11].field1019 = var4.method1333(-126);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2404[var12] != null) {
                this.field2404[var12].field1034 = var4.method1333(-127);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2404[var13] != null) {
                this.field2404[var13].field1032 = var4.method1333(-128);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2404[var14] != null) {
                this.field2404[var14].field1023 = var4.method1333(-125);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2404[var15] != null) {
                this.field2404[var15].field1018 = (short) var4.method1315(14289);
            }
        }
        if (var4.field3249 < var4.field3273.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field2404[var16] != null) {
                    var4.method1333(-128);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field2404[var17] != null) {
                    var4.method1333(-125);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field2404[var18] != null) {
                    var4.method1317((byte) -126);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field2404[var19] != null) {
                    this.field2404[var19].field1029 = var4.method1317((byte) -105) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field2404[var20] != null) {
                    var4.method1333(-127);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field2404[var21] != null) {
                    var4.method1317((byte) -102);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field2404[var22] != null) {
                    var4.method1317((byte) -97);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field2404[var23] != null) {
                    var4.method1317((byte) -75);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIZ)V", line = 182)
    public static final void method962(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2406++;
        if (arg4) {
            field2401 = -54;
        }
        if (arg3 >= class59.field1162 && arg3 <= class186.field3028) {
            int var5 = class8.method73(8, class259.field4024, field2416, arg2);
            int var6 = class8.method73(8, class259.field4024, field2416, arg1);
            class202.method1351(var5, arg3, false, arg0, var6);
        }
    }

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(II)Lnm;", line = 202)
    public class189 method387(int arg0, int arg1) {
        field2408++;
        class305 var3 = this.field2418.method2367((long) arg1, arg0 - 12279);
        if (var3 != null) {
            return (class189) var3;
        }
        byte[] var4 = this.field2419.method2045(arg0 ^ arg0, arg1);
        if (var4 == null) {
            return null;
        } else {
            class189 var5 = new class189(new class202(var4));
            this.field2418.method2369((long) arg1, -28759, var5);
            return var5;
        }
    }
}
