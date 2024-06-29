import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class284 extends class326 {

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    private int field4396;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static volatile int field4399 = -1;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "Lma;")
    public static class5 field4394 = new class5();

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field4401 = -1;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    public static int field4404 = 0;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    public static int field4405 = 0;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "Z")
    public static boolean field4406 = false;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "[Lql;")
    public static class337[] field4403 = new class337[2048];

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "[[I")
    public static int[][] field4402;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZLvl;)V", line = 11)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field4392++;
        if (arg1) {
            method2013(-100);
        }
        if (arg0 == 0) {
            this.field4396 = (arg2.method58(-288140008) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V", line = 36)
    public class284() {
        this(4096);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILo;I)V", line = 46)
    public static final void method2011(int arg0, class15 arg1, int arg2) {
        field4400++;
        Object[] var3 = arg1.field243;
        int var4 = (Integer) var3[0];
        class336 var5 = class24.method236(var4, 72);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class302.field4639 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field5229;
        byte var10 = -1;
        int[] var11 = var5.field5236;
        try {
            class47.field623 = new int[var5.field5231];
            int var12 = 0;
            int var13 = arg0;
            class51.field653 = new String[var5.field5244];
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field259;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field261;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field248 == null ? -1 : arg1.field248.field2069;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field251;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field248 == null ? -1 : arg1.field248.field2086;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field244 == null ? -1 : arg1.field244.field2069;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field244 == null ? -1 : arg1.field244.field2086;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field245;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field260;
                    }
                    class47.field623[var12++] = var16;
                } else if (var3[var14] instanceof String) {
                    String var15 = (String) var3[var14];
                    if (var15.equals("event_opbase")) {
                        var15 = arg1.field247;
                    }
                    class51.field653[var13++] = var15;
                }
            }
            int var17 = 0;
            label4459: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var528 = var9[var8];
                if (var528 < 100) {
                    if (var528 == 0) {
                        class15.field242[var6++] = var11[var8];
                        continue;
                    }
                    if (var528 == 1) {
                        int var18 = var11[var8];
                        class15.field242[var6++] = class220.field3477[var18];
                        continue;
                    }
                    if (var528 == 2) {
                        int var19 = var11[var8];
                        var6--;
                        class119.method851(class15.field242[var6], 3924, var19);
                        continue;
                    }
                    if (var528 == 3) {
                        class263.field4117[var7++] = var5.field5237[var8];
                        continue;
                    }
                    if (var528 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var528 == 7) {
                        var6 -= 2;
                        if (class15.field242[var6 + 1] != class15.field242[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 8) {
                        var6 -= 2;
                        if (class15.field242[var6 + 1] == class15.field242[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 9) {
                        var6 -= 2;
                        if (class15.field242[var6 + 1] > class15.field242[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 10) {
                        var6 -= 2;
                        if (class15.field242[var6 + 1] < class15.field242[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 21) {
                        if (class302.field4639 == 0) {
                            return;
                        }
                        class36 var20 = class344.field5347[--class302.field4639];
                        var5 = var20.field522;
                        var11 = var5.field5236;
                        var8 = var20.field528;
                        var9 = var5.field5229;
                        class47.field623 = var20.field521;
                        class51.field653 = var20.field524;
                        continue;
                    }
                    if (var528 == 25) {
                        int var21 = var11[var8];
                        class15.field242[var6++] = class333.method2321(0, var21);
                        continue;
                    }
                    if (var528 == 27) {
                        int var22 = var11[var8];
                        int var10000 = arg0 + 93;
                        var6--;
                        class333.method2322(var10000, var22, class15.field242[var6]);
                        continue;
                    }
                    if (var528 == 31) {
                        var6 -= 2;
                        if (class15.field242[var6] <= class15.field242[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 32) {
                        var6 -= 2;
                        if (class15.field242[var6 + 1] <= class15.field242[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 33) {
                        class15.field242[var6++] = class47.field623[var11[var8]];
                        continue;
                    }
                    int var10001;
                    if (var528 == 34) {
                        var10001 = var11[var8];
                        var6--;
                        class47.field623[var10001] = class15.field242[var6];
                        continue;
                    }
                    if (var528 == 35) {
                        class263.field4117[var7++] = class51.field653[var11[var8]];
                        continue;
                    }
                    if (var528 == 36) {
                        var10001 = var11[var8];
                        var7--;
                        class51.field653[var10001] = class263.field4117[var7];
                        continue;
                    }
                    if (var528 == 37) {
                        int var23 = var11[var8];
                        var7 -= var23;
                        String var24 = class339.method2354(0, class263.field4117, var23, var7);
                        class263.field4117[var7++] = var24;
                        continue;
                    }
                    if (var528 == 38) {
                        var6--;
                        continue;
                    }
                    if (var528 == 39) {
                        var7--;
                        continue;
                    }
                    if (var528 == 40) {
                        int var25 = var11[var8];
                        class336 var26 = class24.method236(var25, arg0 ^ 0xFFFFFF81);
                        String[] var27 = new String[var26.field5244];
                        int[] var28 = new int[var26.field5231];
                        for (int var29 = 0; var29 < var26.field5242; var29++) {
                            var28[var29] = class15.field242[var6 + var29 - var26.field5242];
                        }
                        for (int var30 = 0; var30 < var26.field5233; var30++) {
                            var27[var30] = class263.field4117[var7 - (var26.field5233 - var30)];
                        }
                        var6 -= var26.field5242;
                        var7 -= var26.field5233;
                        class36 var31 = new class36();
                        var31.field522 = var5;
                        var31.field528 = var8;
                        var31.field524 = class51.field653;
                        var31.field521 = class47.field623;
                        if (class302.field4639 >= class344.field5347.length) {
                            throw new RuntimeException();
                        }
                        class344.field5347[class302.field4639++] = var31;
                        var5 = var26;
                        var9 = var26.field5229;
                        class47.field623 = var28;
                        var8 = -1;
                        class51.field653 = var27;
                        var11 = var26.field5236;
                        continue;
                    }
                    if (var528 == 42) {
                        class15.field242[var6++] = class166.field2733[var11[var8]];
                        continue;
                    }
                    if (var528 == 43) {
                        int var32 = var11[var8];
                        var6--;
                        class166.field2733[var32] = class15.field242[var6];
                        class82.method601(var32, 100);
                        continue;
                    }
                    if (var528 == 44) {
                        var6--;
                        int var33 = class15.field242[var6];
                        int var34 = var11[var8] >> 16;
                        int var35 = var11[var8] & 0xFFFF;
                        if (var33 >= 0 && var33 <= 5000) {
                            byte var36 = -1;
                            class105.field1389[var34] = var33;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var33 <= var37) {
                                    continue label4459;
                                }
                                class200.field3210[var34][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 45) {
                        int var38 = var11[var8];
                        var6--;
                        int var39 = class15.field242[var6];
                        if (var39 >= 0 && class105.field1389[var38] > var39) {
                            class15.field242[var6++] = class200.field3210[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 46) {
                        int var40 = var11[var8];
                        var6 -= 2;
                        int var41 = class15.field242[var6];
                        if (var41 >= 0 && var41 < class105.field1389[var40]) {
                            class200.field3210[var40][var41] = class15.field242[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 47) {
                        String var42 = class336.field5240[var11[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class263.field4117[var7++] = var42;
                        continue;
                    }
                    if (var528 == 48) {
                        int var43 = var11[var8];
                        var7--;
                        class336.field5240[var43] = class263.field4117[var7];
                        class29.method259(var43, arg0 ^ 0x2);
                        continue;
                    }
                    if (var528 == 51) {
                        class311 var44 = var5.field5234[var11[var8]];
                        var6--;
                        class233 var45 = (class233) var44.method2168((long) class15.field242[var6], (byte) -90);
                        if (var45 != null) {
                            var8 += var45.field3633;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var528 < 300) {
                    if (var528 == 100) {
                        var6 -= 3;
                        int var47 = class15.field242[var6];
                        int var48 = class15.field242[var6 + 1];
                        int var49 = class15.field242[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class136 var50 = class14.method140(var47, 1036508464);
                        if (var50.field2062 == null) {
                            var50.field2062 = new class136[var49 + 1];
                        }
                        if (var50.field2062.length <= var49) {
                            class136[] var51 = new class136[var49 + 1];
                            for (int var52 = 0; var52 < var50.field2062.length; var52++) {
                                var51[var52] = var50.field2062[var52];
                            }
                            var50.field2062 = var51;
                        }
                        if (var49 > 0 && var50.field2062[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class136 var53 = new class136();
                        var53.field2090 = var53.field2069 = var50.field2069;
                        var53.field2086 = var49;
                        var53.field2164 = true;
                        var53.field2063 = var48;
                        var50.field2062[var49] = var53;
                        if (var46) {
                            class126.field1827 = var53;
                        } else {
                            class76.field1017 = var53;
                        }
                        class167.method1250(var50, 412);
                        continue;
                    }
                    if (var528 == 101) {
                        class136 var54 = var46 ? class126.field1827 : class76.field1017;
                        if (var54.field2086 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class136 var55 = class14.method140(var54.field2069, 1036508464);
                        var55.field2062[var54.field2086] = null;
                        class167.method1250(var55, 412);
                        continue;
                    }
                    if (var528 == 102) {
                        var6--;
                        class136 var56 = class14.method140(class15.field242[var6], 1036508464);
                        var56.field2062 = null;
                        class167.method1250(var56, 412);
                        continue;
                    }
                    if (var528 == 200) {
                        var6 -= 2;
                        int var57 = class15.field242[var6];
                        int var58 = class15.field242[var6 + 1];
                        class136 var59 = class294.method2048((byte) 109, var57, var58);
                        if (var59 != null && var58 != -1) {
                            class15.field242[var6++] = 1;
                            if (var46) {
                                class126.field1827 = var59;
                            } else {
                                class76.field1017 = var59;
                            }
                            continue;
                        }
                        class15.field242[var6++] = 0;
                        continue;
                    }
                    if (var528 == 201) {
                        var6--;
                        int var60 = class15.field242[var6];
                        class136 var61 = class14.method140(var60, 1036508464);
                        if (var61 == null) {
                            class15.field242[var6++] = 0;
                        } else {
                            class15.field242[var6++] = 1;
                            if (var46) {
                                class126.field1827 = var61;
                            } else {
                                class76.field1017 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var528 < 500) {
                    if (var528 == 403) {
                        var6 -= 2;
                        int var62 = class15.field242[var6];
                        int var63 = class15.field242[var6 + 1];
                        for (int var64 = 0; var64 < class47.field618.length; var64++) {
                            if (class47.field618[var64] == var62) {
                                class146.field2310.field5264.method431(Integer.MIN_VALUE, var63, var64);
                                continue label4459;
                            }
                        }
                        int var65 = 0;
                        while (true) {
                            if (class47.field612.length <= var65) {
                                continue label4459;
                            }
                            if (class47.field612[var65] == var62) {
                                class146.field2310.field5264.method431(Integer.MIN_VALUE, var63, var65);
                                continue label4459;
                            }
                            var65++;
                        }
                    }
                    if (var528 == 404) {
                        var6 -= 2;
                        int var66 = class15.field242[var6];
                        int var67 = class15.field242[var6 + 1];
                        class146.field2310.field5264.method434(var66, var67, arg0 ^ 0xFFFFFF83);
                        continue;
                    }
                    if (var528 == 410) {
                        var6--;
                        boolean var68 = class15.field242[var6] != 0;
                        class146.field2310.field5264.method433(-16384, var68);
                        continue;
                    }
                } else if (var528 >= 1000 && var528 < 1100 || var528 >= 2000 && var528 < 2100) {
                    class136 var517;
                    if (var528 >= 2000) {
                        var6--;
                        var517 = class14.method140(class15.field242[var6], 1036508464);
                        var528 -= 1000;
                    } else {
                        var517 = var46 ? class126.field1827 : class76.field1017;
                    }
                    if (var528 == 1000) {
                        var6 -= 4;
                        var517.field2011 = class15.field242[var6];
                        var517.field2095 = class15.field242[var6 + 1];
                        int var518 = class15.field242[var6 + 2];
                        if (var518 < 0) {
                            var518 = 0;
                        } else if (var518 > 5) {
                            var518 = 5;
                        }
                        int var519 = class15.field242[var6 + 3];
                        if (var519 < 0) {
                            var519 = 0;
                        } else if (var519 > 5) {
                            var519 = 5;
                        }
                        var517.field2159 = (byte) var518;
                        var517.field2142 = (byte) var519;
                        class167.method1250(var517, 412);
                        class319.method2241((byte) 96, var517);
                        if (var517.field2086 == -1) {
                            class260.method1869(true, var517.field2069);
                        }
                        continue;
                    }
                    if (var528 == 1001) {
                        var6 -= 4;
                        var517.field2048 = class15.field242[var6];
                        var517.field2104 = class15.field242[var6 + 1];
                        var517.field2020 = 0;
                        var517.field2041 = 0;
                        int var520 = class15.field242[var6 + 3];
                        if (var520 < 0) {
                            var520 = 0;
                        } else if (var520 > 4) {
                            var520 = 4;
                        }
                        int var521 = class15.field242[var6 + 2];
                        if (var521 < 0) {
                            var521 = 0;
                        } else if (var521 > 4) {
                            var521 = 4;
                        }
                        var517.field2143 = (byte) var520;
                        var517.field2150 = (byte) var521;
                        class167.method1250(var517, 412);
                        class319.method2241((byte) 96, var517);
                        if (var517.field2063 == 0) {
                            class82.method602((byte) 65, var517, false);
                        }
                        continue;
                    }
                    if (var528 == 1003) {
                        var6--;
                        boolean var522 = class15.field242[var6] == 1;
                        if (var517.field2123 != var522) {
                            var517.field2123 = var522;
                            class167.method1250(var517, 412);
                        }
                        if (var517.field2086 == -1) {
                            class337.method2338(var517.field2069, 32);
                        }
                        continue;
                    }
                    if (var528 == 1004) {
                        var6 -= 2;
                        var517.field2118 = class15.field242[var6];
                        var517.field2122 = class15.field242[var6 + 1];
                        class167.method1250(var517, 412);
                        class319.method2241((byte) 96, var517);
                        if (var517.field2063 == 0) {
                            class82.method602((byte) 65, var517, false);
                        }
                        continue;
                    }
                    if (var528 == 1005) {
                        var6--;
                        var517.field2148 = class15.field242[var6] == 1;
                        continue;
                    }
                } else if (!(var528 < 1100 || var528 >= 1200) || !(var528 < 2100 || var528 >= 2200)) {
                    class136 var513;
                    if (var528 >= 2000) {
                        var6--;
                        var513 = class14.method140(class15.field242[var6], 1036508464);
                        var528 -= 1000;
                    } else {
                        var513 = var46 ? class126.field1827 : class76.field1017;
                    }
                    if (var528 == 1100) {
                        var6 -= 2;
                        var513.field2129 = class15.field242[var6];
                        if (var513.field2129 > (var513.field1991 - var513.field2137)) {
                            var513.field2129 = var513.field1991 - var513.field2137;
                        }
                        if (var513.field2129 < 0) {
                            var513.field2129 = 0;
                        }
                        var513.field2018 = class15.field242[var6 + 1];
                        if (var513.field2018 > var513.field2007 - var513.field2078) {
                            var513.field2018 = var513.field2007 - var513.field2078;
                        }
                        if (var513.field2018 < 0) {
                            var513.field2018 = 0;
                        }
                        class167.method1250(var513, 412);
                        if (var513.field2086 == -1) {
                            class160.method1187(12, var513.field2069);
                        }
                        continue;
                    }
                    if (var528 == 1101) {
                        var6--;
                        var513.field2094 = class15.field242[var6];
                        class167.method1250(var513, 412);
                        if (var513.field2086 == -1) {
                            class221.method1614(-115, var513.field2069);
                        }
                        continue;
                    }
                    if (var528 == 1102) {
                        var6--;
                        var513.field1996 = class15.field242[var6] == 1;
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1103) {
                        var6--;
                        var513.field2022 = class15.field242[var6];
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1104) {
                        var6--;
                        var513.field2079 = class15.field242[var6];
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1105) {
                        var6--;
                        var513.field2093 = class15.field242[var6];
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1106) {
                        var6--;
                        var513.field2013 = class15.field242[var6];
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1107) {
                        var6--;
                        var513.field2001 = class15.field242[var6] == 1;
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1108) {
                        var513.field2166 = 1;
                        var6--;
                        var513.field2117 = class15.field242[var6];
                        class167.method1250(var513, 412);
                        if (var513.field2086 == -1) {
                            class5.method20(arg0 + 62, var513.field2069);
                        }
                        continue;
                    }
                    if (var528 == 1109) {
                        var6 -= 6;
                        var513.field2075 = class15.field242[var6];
                        var513.field2044 = class15.field242[var6 + 1];
                        var513.field2145 = class15.field242[var6 + 2];
                        var513.field2096 = class15.field242[var6 + 3];
                        var513.field2119 = class15.field242[var6 + 4];
                        var513.field2168 = class15.field242[var6 + 5];
                        class167.method1250(var513, 412);
                        if (var513.field2086 == -1) {
                            class302.method2091(127, var513.field2069);
                            class42.method344(var513.field2069, (byte) 113);
                        }
                        continue;
                    }
                    if (var528 == 1110) {
                        var6--;
                        int var514 = class15.field242[var6];
                        if (var513.field2128 != var514) {
                            var513.field2088 = 0;
                            var513.field2128 = var514;
                            var513.field2147 = 0;
                            var513.field2130 = 1;
                            class167.method1250(var513, 412);
                        }
                        if (var513.field2086 == -1) {
                            class273.method1924(var513.field2069, 32);
                        }
                        continue;
                    }
                    if (var528 == 1111) {
                        var6--;
                        var513.field2105 = class15.field242[var6] == 1;
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1112) {
                        var7--;
                        String var515 = class263.field4117[var7];
                        if (!var515.equals(var513.field2158)) {
                            var513.field2158 = var515;
                            class167.method1250(var513, 412);
                        }
                        if (var513.field2086 == -1) {
                            client.method948(var513.field2069, (byte) 90);
                        }
                        continue;
                    }
                    if (var528 == 1113) {
                        var6--;
                        var513.field2050 = class15.field242[var6];
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1114) {
                        var6 -= 3;
                        var513.field2021 = class15.field242[var6];
                        var513.field2000 = class15.field242[var6 + 1];
                        var513.field2135 = class15.field242[var6 + 2];
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1115) {
                        var6--;
                        var513.field2015 = class15.field242[var6] == 1;
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1116) {
                        var6--;
                        var513.field2056 = class15.field242[var6];
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1117) {
                        var6--;
                        var513.field2127 = class15.field242[var6];
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1118) {
                        var6--;
                        var513.field2152 = class15.field242[var6] == 1;
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1119) {
                        var6--;
                        var513.field2033 = class15.field242[var6] == 1;
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1120) {
                        var6 -= 2;
                        var513.field1991 = class15.field242[var6];
                        var513.field2007 = class15.field242[var6 + 1];
                        class167.method1250(var513, 412);
                        if (var513.field2063 == 0) {
                            class82.method602((byte) 65, var513, false);
                        }
                        continue;
                    }
                    if (var528 == 1121) {
                        var6 -= 2;
                        var513.field2046 = (short) class15.field242[var6];
                        var513.field2066 = (short) class15.field242[var6 + 1];
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1122) {
                        var6--;
                        var513.field2009 = class15.field242[var6] == 1;
                        class167.method1250(var513, 412);
                        continue;
                    }
                    if (var528 == 1123) {
                        var6--;
                        var513.field2168 = class15.field242[var6];
                        class167.method1250(var513, 412);
                        if (var513.field2086 == -1) {
                            class302.method2091(-23, var513.field2069);
                        }
                        continue;
                    }
                    if (var528 == 1124) {
                        var6--;
                        int var516 = class15.field242[var6];
                        var513.field2081 = var516 == 1;
                        class167.method1250(var513, 412);
                        continue;
                    }
                } else if (!(var528 < 1200 || var528 >= 1300) || !(var528 < 2200 || var528 >= 2300)) {
                    class136 var509;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var6--;
                        var509 = class14.method140(class15.field242[var6], 1036508464);
                    } else {
                        var509 = var46 ? class126.field1827 : class76.field1017;
                    }
                    class167.method1250(var509, 412);
                    if (var528 == 1200 || var528 == 1205 || var528 == 1208 || var528 == 1209) {
                        var6 -= 2;
                        int var510 = class15.field242[var6 + 1];
                        int var511 = class15.field242[var6];
                        if (var509.field2086 == -1) {
                            class25.method237(var509.field2069, arg0 - 68);
                            class302.method2091(124, var509.field2069);
                            class42.method344(var509.field2069, (byte) 125);
                        }
                        if (var511 == -1) {
                            var509.field2117 = -1;
                            var509.field2166 = 1;
                            var509.field1997 = -1;
                            continue;
                        }
                        var509.field2087 = var510;
                        if (var528 == 1208 || var528 == 1209) {
                            var509.field2060 = true;
                        } else {
                            var509.field2060 = false;
                        }
                        var509.field1997 = var511;
                        class316 var512 = class149.method1092((byte) -104, var511);
                        var509.field2119 = var512.field4965;
                        var509.field2044 = var512.field5009;
                        var509.field2075 = var512.field5001;
                        if (var528 == 1205) {
                            var509.field2057 = false;
                        } else {
                            var509.field2057 = true;
                        }
                        var509.field2096 = var512.field5007;
                        var509.field2145 = var512.field5002;
                        var509.field2168 = var512.field4989;
                        if (var509.field2041 > 0) {
                            var509.field2168 = var509.field2168 * 32 / var509.field2041;
                        } else if (var509.field2048 > 0) {
                            var509.field2168 = var509.field2168 * 32 / var509.field2048;
                        }
                        continue;
                    }
                    if (var528 == 1201) {
                        var509.field2166 = 2;
                        var6--;
                        var509.field2117 = class15.field242[var6];
                        if (var509.field2086 == -1) {
                            class5.method20(107, var509.field2069);
                        }
                        continue;
                    }
                    if (var528 == 1202) {
                        var509.field2166 = 3;
                        var509.field2117 = class146.field2310.field5264.method429((byte) -18);
                        if (var509.field2086 == -1) {
                            class5.method20(arg0 ^ 0x2C, var509.field2069);
                        }
                        continue;
                    }
                    if (var528 == 1203) {
                        var509.field2166 = 6;
                        var6--;
                        var509.field2117 = class15.field242[var6];
                        if (var509.field2086 == -1) {
                            class5.method20(66, var509.field2069);
                        }
                        continue;
                    }
                    if (var528 == 1204) {
                        var509.field2166 = 5;
                        var6--;
                        var509.field2117 = class15.field242[var6];
                        if (var509.field2086 == -1) {
                            class5.method20(103, var509.field2069);
                        }
                        continue;
                    }
                    if (var528 == 1206) {
                        var6 -= 4;
                        var509.field2017 = class15.field242[var6];
                        var509.field2100 = class15.field242[var6 + 1];
                        var509.field1999 = class15.field242[var6 + 2];
                        var509.field2149 = class15.field242[var6 + 3];
                        class167.method1250(var509, 412);
                        continue;
                    }
                    if (var528 == 1207) {
                        var6 -= 2;
                        var509.field2102 = class15.field242[var6];
                        var509.field2161 = class15.field242[var6 + 1];
                        class167.method1250(var509, 412);
                        continue;
                    }
                } else if ((var528 < 1300 || var528 >= 1400) && (var528 < 2300 || var528 >= 2400)) {
                    if (var528 >= 1400 && var528 < 1500 || var528 >= 2400 && var528 < 2500) {
                        class136 var496;
                        if (var528 < 2000) {
                            var496 = var46 ? class126.field1827 : class76.field1017;
                        } else {
                            var528 -= 1000;
                            var6--;
                            var496 = class14.method140(class15.field242[var6], arg0 ^ 0x3DC7DD30);
                        }
                        var7--;
                        String var497 = class263.field4117[var7];
                        int[] var498 = null;
                        if (var497.length() > 0 && var497.charAt(var497.length() - 1) == 'Y') {
                            var6--;
                            int var499 = class15.field242[var6];
                            if (var499 > 0) {
                                var498 = new int[var499];
                                while (var499-- > 0) {
                                    var6--;
                                    var498[var499] = class15.field242[var6];
                                }
                            }
                            var497 = var497.substring(0, var497.length() - 1);
                        }
                        Object[] var500 = new Object[var497.length() + 1];
                        for (int var501 = var500.length - 1; var501 >= 1; var501--) {
                            if (var497.charAt(var501 - 1) == 's') {
                                var7--;
                                var500[var501] = class263.field4117[var7];
                            } else {
                                var6--;
                                var500[var501] = Integer.valueOf(class15.field242[var6]);
                            }
                        }
                        var6--;
                        int var502 = class15.field242[var6];
                        if (var502 == -1) {
                            var500 = null;
                        } else {
                            var500[0] = Integer.valueOf(var502);
                        }
                        var496.field2026 = true;
                        if (var528 == 1400) {
                            var496.field1998 = var500;
                        } else if (var528 == 1401) {
                            var496.field2014 = var500;
                        } else if (var528 == 1402) {
                            var496.field2058 = var500;
                        } else if (var528 == 1403) {
                            var496.field1993 = var500;
                        } else if (var528 == 1404) {
                            var496.field2073 = var500;
                        } else if (var528 == 1405) {
                            var496.field2004 = var500;
                        } else if (var528 == 1406) {
                            var496.field2133 = var500;
                        } else if (var528 == 1407) {
                            var496.field2012 = var498;
                            var496.field2024 = var500;
                        } else if (var528 == 1408) {
                            var496.field2059 = var500;
                        } else if (var528 == 1409) {
                            var496.field2112 = var500;
                        } else if (var528 == 1410) {
                            var496.field2029 = var500;
                        } else if (var528 == 1411) {
                            var496.field1994 = var500;
                        } else if (var528 == 1412) {
                            var496.field2042 = var500;
                        } else if (var528 == 1414) {
                            var496.field2028 = var498;
                            var496.field2016 = var500;
                        } else if (var528 == 1415) {
                            var496.field2030 = var500;
                            var496.field2170 = var498;
                        } else if (var528 == 1416) {
                            var496.field2025 = var500;
                        } else if (var528 == 1417) {
                            var496.field2141 = var500;
                        } else if (var528 == 1418) {
                            var496.field2023 = var500;
                        } else if (var528 == 1419) {
                            var496.field2099 = var500;
                        } else if (var528 == 1420) {
                            var496.field2047 = var500;
                        } else if (var528 == 1421) {
                            var496.field2034 = var500;
                        } else if (var528 == 1422) {
                            var496.field2171 = var500;
                        } else if (var528 == 1423) {
                            var496.field2120 = var500;
                        } else if (var528 == 1424) {
                            var496.field2003 = var500;
                        } else if (var528 == 1425) {
                            var496.field2092 = var500;
                        } else if (var528 == 1426) {
                            var496.field2010 = var500;
                        } else if (var528 == 1427) {
                            var496.field2165 = var500;
                        } else if (var528 == 1428) {
                            var496.field2132 = var500;
                            var496.field2138 = var498;
                        } else if (var528 == 1429) {
                            var496.field2116 = var498;
                            var496.field2006 = var500;
                        }
                        continue;
                    }
                    if (var528 < 1600) {
                        class136 var69 = var46 ? class126.field1827 : class76.field1017;
                        if (var528 == 1500) {
                            class15.field242[var6++] = var69.field2131;
                            continue;
                        }
                        if (var528 == 1501) {
                            class15.field242[var6++] = var69.field2111;
                            continue;
                        }
                        if (var528 == 1502) {
                            class15.field242[var6++] = var69.field2137;
                            continue;
                        }
                        if (var528 == 1503) {
                            class15.field242[var6++] = var69.field2078;
                            continue;
                        }
                        if (var528 == 1504) {
                            class15.field242[var6++] = var69.field2123 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 1505) {
                            class15.field242[var6++] = var69.field2090;
                            continue;
                        }
                    } else if (var528 < 1700) {
                        class136 var495 = var46 ? class126.field1827 : class76.field1017;
                        if (var528 == 1600) {
                            class15.field242[var6++] = var495.field2129;
                            continue;
                        }
                        if (var528 == 1601) {
                            class15.field242[var6++] = var495.field2018;
                            continue;
                        }
                        if (var528 == 1602) {
                            class263.field4117[var7++] = var495.field2158;
                            continue;
                        }
                        if (var528 == 1603) {
                            class15.field242[var6++] = var495.field1991;
                            continue;
                        }
                        if (var528 == 1604) {
                            class15.field242[var6++] = var495.field2007;
                            continue;
                        }
                        if (var528 == 1605) {
                            class15.field242[var6++] = var495.field2168;
                            continue;
                        }
                        if (var528 == 1606) {
                            class15.field242[var6++] = var495.field2145;
                            continue;
                        }
                        if (var528 == 1607) {
                            class15.field242[var6++] = var495.field2119;
                            continue;
                        }
                        if (var528 == 1608) {
                            class15.field242[var6++] = var495.field2096;
                            continue;
                        }
                        if (var528 == 1609) {
                            class15.field242[var6++] = var495.field2022;
                            continue;
                        }
                        if (var528 == 1610) {
                            class15.field242[var6++] = var495.field2075;
                            continue;
                        }
                        if (var528 == 1611) {
                            class15.field242[var6++] = var495.field2044;
                            continue;
                        }
                        if (var528 == 1612) {
                            class15.field242[var6++] = var495.field2093;
                            continue;
                        }
                    } else if (var528 < 1800) {
                        class136 var494 = var46 ? class126.field1827 : class76.field1017;
                        if (var528 == 1700) {
                            class15.field242[var6++] = var494.field1997;
                            continue;
                        }
                        if (var528 == 1701) {
                            if (var494.field1997 == -1) {
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = var494.field2087;
                            }
                            continue;
                        }
                        if (var528 == 1702) {
                            class15.field242[var6++] = var494.field2086;
                            continue;
                        }
                    } else if (var528 < 1900) {
                        class136 var492 = var46 ? class126.field1827 : class76.field1017;
                        if (var528 == 1800) {
                            class15.field242[var6++] = client.method953(var492).method927(-1);
                            continue;
                        }
                        if (var528 == 1801) {
                            var6--;
                            int var493 = class15.field242[var6];
                            int var530 = var493 - 1;
                            if (var492.field2140 != null && var530 < var492.field2140.length && var492.field2140[var530] != null) {
                                class263.field4117[var7++] = var492.field2140[var530];
                                continue;
                            }
                            class263.field4117[var7++] = "";
                            continue;
                        }
                        if (var528 == 1802) {
                            if (var492.field2035 == null) {
                                class263.field4117[var7++] = "";
                            } else {
                                class263.field4117[var7++] = var492.field2035;
                            }
                            continue;
                        }
                    } else if (var528 < 2600) {
                        var6--;
                        class136 var70 = class14.method140(class15.field242[var6], 1036508464);
                        if (var528 == 2500) {
                            class15.field242[var6++] = var70.field2131;
                            continue;
                        }
                        if (var528 == 2501) {
                            class15.field242[var6++] = var70.field2111;
                            continue;
                        }
                        if (var528 == 2502) {
                            class15.field242[var6++] = var70.field2137;
                            continue;
                        }
                        if (var528 == 2503) {
                            class15.field242[var6++] = var70.field2078;
                            continue;
                        }
                        if (var528 == 2504) {
                            class15.field242[var6++] = var70.field2123 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 2505) {
                            class15.field242[var6++] = var70.field2090;
                            continue;
                        }
                    } else if (var528 < 2700) {
                        var6--;
                        class136 var491 = class14.method140(class15.field242[var6], 1036508464);
                        if (var528 == 2600) {
                            class15.field242[var6++] = var491.field2129;
                            continue;
                        }
                        if (var528 == 2601) {
                            class15.field242[var6++] = var491.field2018;
                            continue;
                        }
                        if (var528 == 2602) {
                            class263.field4117[var7++] = var491.field2158;
                            continue;
                        }
                        if (var528 == 2603) {
                            class15.field242[var6++] = var491.field1991;
                            continue;
                        }
                        if (var528 == 2604) {
                            class15.field242[var6++] = var491.field2007;
                            continue;
                        }
                        if (var528 == 2605) {
                            class15.field242[var6++] = var491.field2168;
                            continue;
                        }
                        if (var528 == 2606) {
                            class15.field242[var6++] = var491.field2145;
                            continue;
                        }
                        if (var528 == 2607) {
                            class15.field242[var6++] = var491.field2119;
                            continue;
                        }
                        if (var528 == 2608) {
                            class15.field242[var6++] = var491.field2096;
                            continue;
                        }
                        if (var528 == 2609) {
                            class15.field242[var6++] = var491.field2022;
                            continue;
                        }
                        if (var528 == 2610) {
                            class15.field242[var6++] = var491.field2075;
                            continue;
                        }
                        if (var528 == 2611) {
                            class15.field242[var6++] = var491.field2044;
                            continue;
                        }
                        if (var528 == 2612) {
                            class15.field242[var6++] = var491.field2093;
                            continue;
                        }
                    } else if (var528 < 2800) {
                        if (var528 == 2700) {
                            var6--;
                            class136 var71 = class14.method140(class15.field242[var6], 1036508464);
                            class15.field242[var6++] = var71.field1997;
                            continue;
                        }
                        if (var528 == 2701) {
                            var6--;
                            class136 var72 = class14.method140(class15.field242[var6], arg0 + 1036508464);
                            if (var72.field1997 == -1) {
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = var72.field2087;
                            }
                            continue;
                        }
                        if (var528 == 2702) {
                            var6--;
                            int var73 = class15.field242[var6];
                            class25 var74 = (class25) class210.field3304.method2168((long) var73, (byte) -77);
                            if (var74 == null) {
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = 1;
                            }
                            continue;
                        }
                        if (var528 == 2703) {
                            var6--;
                            class136 var75 = class14.method140(class15.field242[var6], 1036508464);
                            if (var75.field2062 == null) {
                                class15.field242[var6++] = 0;
                                continue;
                            }
                            int var76 = var75.field2062.length;
                            for (int var77 = 0; var77 < var75.field2062.length; var77++) {
                                if (var75.field2062[var77] == null) {
                                    var76 = var77;
                                    break;
                                }
                            }
                            class15.field242[var6++] = var76;
                            continue;
                        }
                        if (var528 == 2704 || var528 == 2705) {
                            var6 -= 2;
                            int var78 = class15.field242[var6 + 1];
                            int var79 = class15.field242[var6];
                            class25 var80 = (class25) class210.field3304.method2168((long) var79, (byte) -127);
                            if (var80 != null && var80.field376 == var78) {
                                class15.field242[var6++] = 1;
                                continue;
                            }
                            class15.field242[var6++] = 0;
                            continue;
                        }
                    } else if (var528 < 2900) {
                        var6--;
                        class136 var489 = class14.method140(class15.field242[var6], 1036508464);
                        if (var528 == 2800) {
                            class15.field242[var6++] = client.method953(var489).method927(-1);
                            continue;
                        }
                        if (var528 == 2801) {
                            var6--;
                            int var490 = class15.field242[var6];
                            int var529 = var490 - 1;
                            if (var489.field2140 != null && var489.field2140.length > var529 && var489.field2140[var529] != null) {
                                class263.field4117[var7++] = var489.field2140[var529];
                                continue;
                            }
                            class263.field4117[var7++] = "";
                            continue;
                        }
                        if (var528 == 2802) {
                            if (var489.field2035 == null) {
                                class263.field4117[var7++] = "";
                            } else {
                                class263.field4117[var7++] = var489.field2035;
                            }
                            continue;
                        }
                    } else if (var528 < 3200) {
                        if (var528 == 3100) {
                            var7--;
                            String var81 = class263.field4117[var7];
                            class131.method971("", (byte) -32, 0, var81);
                            continue;
                        }
                        if (var528 == 3101) {
                            var6 -= 2;
                            class235.method1686(class146.field2310, class15.field242[var6 + 1], (byte) -67, class15.field242[var6]);
                            continue;
                        }
                        if (var528 == 3103) {
                            class175.method1290(-106);
                            continue;
                        }
                        if (var528 == 3104) {
                            class325.field5094++;
                            var7--;
                            String var82 = class263.field4117[var7];
                            int var83 = 0;
                            if (class195.method1445(10066, var82)) {
                                var83 = class192.method1420(var82, arg0 + 10);
                            }
                            class183.field2965.method1947((byte) -122, 175);
                            class183.field2965.method34(var83, 294335144);
                            continue;
                        }
                        if (var528 == 3105) {
                            class215.field3394++;
                            var7--;
                            String var84 = class263.field4117[var7];
                            class183.field2965.method1947((byte) -96, 250);
                            class183.field2965.method53((byte) 122, class83.method608(var84, (byte) 64));
                            continue;
                        }
                        if (var528 == 3106) {
                            var7--;
                            String var85 = class263.field4117[var7];
                            class183.field2965.method1947((byte) 94, 120);
                            class172.field2832++;
                            class183.field2965.method81((byte) -111, var85.length() + 1);
                            class183.field2965.method48(128, var85);
                            continue;
                        }
                        if (var528 == 3107) {
                            var7--;
                            String var86 = class263.field4117[var7];
                            var6--;
                            int var87 = class15.field242[var6];
                            class18.method199(var86, var87, false);
                            continue;
                        }
                        if (var528 == 3108) {
                            var6 -= 3;
                            int var88 = class15.field242[var6];
                            int var89 = class15.field242[var6 + 2];
                            int var90 = class15.field242[var6 + 1];
                            class136 var91 = class14.method140(var89, 1036508464);
                            class3.method12(false, var91, var90, var88);
                            continue;
                        }
                        if (var528 == 3109) {
                            var6 -= 2;
                            int var92 = class15.field242[var6];
                            class136 var93 = var46 ? class126.field1827 : class76.field1017;
                            int var94 = class15.field242[var6 + 1];
                            class3.method12(false, var93, var94, var92);
                            continue;
                        }
                        if (var528 == 3110) {
                            class251.field3945++;
                            var6--;
                            int var95 = class15.field242[var6];
                            class183.field2965.method1947((byte) 122, 38);
                            class183.field2965.method65((byte) -9, var95);
                            continue;
                        }
                    } else if (var528 < 3300) {
                        if (var528 == 3200) {
                            var6 -= 3;
                            class234.method1681(255, class15.field242[var6], (byte) 39, class15.field242[var6 + 1], class15.field242[var6 + 2]);
                            continue;
                        }
                        if (var528 == 3201) {
                            var6--;
                            class84.method612(class15.field242[var6], (byte) -95, 255);
                            continue;
                        }
                        if (var528 == 3202) {
                            var6 -= 2;
                            class21.method210(-76, class15.field242[var6 + 1], class15.field242[var6], 255);
                            continue;
                        }
                    } else if (var528 < 3400) {
                        if (var528 == 3300) {
                            class15.field242[var6++] = class229.field3595;
                            continue;
                        }
                        if (var528 == 3301) {
                            var6 -= 2;
                            int var96 = class15.field242[var6];
                            int var97 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class111.method794(var97, var96, (byte) 29);
                            continue;
                        }
                        if (var528 == 3302) {
                            var6 -= 2;
                            int var98 = class15.field242[var6];
                            int var99 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class141.method1046(var98, var99, false);
                            continue;
                        }
                        if (var528 == 3303) {
                            var6 -= 2;
                            int var100 = class15.field242[var6];
                            int var101 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class184.method1346(var101, class4.method16(arg0, 62), var100);
                            continue;
                        }
                        if (var528 == 3304) {
                            var6--;
                            int var102 = class15.field242[var6];
                            class15.field242[var6++] = class135.method988(-20887, var102).field5172;
                            continue;
                        }
                        if (var528 == 3305) {
                            var6--;
                            int var103 = class15.field242[var6];
                            class15.field242[var6++] = class206.field3262[var103];
                            continue;
                        }
                        if (var528 == 3306) {
                            var6--;
                            int var104 = class15.field242[var6];
                            class15.field242[var6++] = class15.field252[var104];
                            continue;
                        }
                        if (var528 == 3307) {
                            var6--;
                            int var105 = class15.field242[var6];
                            class15.field242[var6++] = class79.field1084[var105];
                            continue;
                        }
                        if (var528 == 3308) {
                            int var106 = (class146.field2310.field4698 >> 7) + class326.field5108;
                            int var107 = (class146.field2310.field4731 >> 7) + class198.field3168;
                            int var108 = class154.field2392;
                            class15.field242[var6++] = (var106 << 14) + (var108 << 28) + var107;
                            continue;
                        }
                        if (var528 == 3309) {
                            var6--;
                            int var109 = class15.field242[var6];
                            class15.field242[var6++] = class333.method2319(16383, var109 >> 14);
                            continue;
                        }
                        if (var528 == 3310) {
                            var6--;
                            int var110 = class15.field242[var6];
                            class15.field242[var6++] = var110 >> 28;
                            continue;
                        }
                        if (var528 == 3311) {
                            var6--;
                            int var111 = class15.field242[var6];
                            class15.field242[var6++] = class333.method2319(16383, var111);
                            continue;
                        }
                        if (var528 == 3312) {
                            class15.field242[var6++] = class7.field156 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3313) {
                            var6 -= 2;
                            int var112 = class15.field242[var6] + 32768;
                            int var113 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class111.method794(var113, var112, (byte) 29);
                            continue;
                        }
                        if (var528 == 3314) {
                            var6 -= 2;
                            int var114 = class15.field242[var6] + 32768;
                            int var115 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class141.method1046(var114, var115, false);
                            continue;
                        }
                        if (var528 == 3315) {
                            var6 -= 2;
                            int var116 = class15.field242[var6] + 32768;
                            int var117 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class184.method1346(var117, 30, var116);
                            continue;
                        }
                        if (var528 == 3316) {
                            if (client.field1905 >= 2) {
                                class15.field242[var6++] = client.field1905;
                            } else {
                                class15.field242[var6++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 3317) {
                            class15.field242[var6++] = class5.field59;
                            continue;
                        }
                        if (var528 == 3318) {
                            class15.field242[var6++] = class271.field4209;
                            continue;
                        }
                        if (var528 == 3321) {
                            class15.field242[var6++] = class111.field1550;
                            continue;
                        }
                        if (var528 == 3322) {
                            class15.field242[var6++] = class175.field2875;
                            continue;
                        }
                        if (var528 == 3323) {
                            if (class305.field4772 >= 5 && class305.field4772 <= 9) {
                                class15.field242[var6++] = 1;
                                continue;
                            }
                            class15.field242[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3324) {
                            if (class305.field4772 >= 5 && class305.field4772 <= 9) {
                                class15.field242[var6++] = class305.field4772;
                                continue;
                            }
                            class15.field242[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3325) {
                            class15.field242[var6++] = class47.field613 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3326) {
                            class15.field242[var6++] = class146.field2310.field5259;
                            continue;
                        }
                        if (var528 == 3327) {
                            class15.field242[var6++] = class146.field2310.field5264.field756 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3328) {
                            class15.field242[var6++] = class336.field5241 && !class26.field392 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3329) {
                            class15.field242[var6++] = class83.field1136 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3330) {
                            var6--;
                            int var118 = class15.field242[var6];
                            class15.field242[var6++] = class286.method2021(0, var118);
                            continue;
                        }
                        if (var528 == 3331) {
                            var6 -= 2;
                            int var119 = class15.field242[var6 + 1];
                            int var120 = class15.field242[var6];
                            class15.field242[var6++] = class214.method1561(false, -1, var120, var119);
                            continue;
                        }
                        if (var528 == 3332) {
                            var6 -= 2;
                            int var121 = class15.field242[var6 + 1];
                            int var122 = class15.field242[var6];
                            class15.field242[var6++] = class214.method1561(true, -1, var122, var121);
                            continue;
                        }
                        if (var528 == 3333) {
                            class15.field242[var6++] = class254.field4016;
                            continue;
                        }
                        if (var528 == 3335) {
                            class15.field242[var6++] = class141.field2240;
                            continue;
                        }
                        if (var528 == 3336) {
                            var6 -= 4;
                            int var123 = class15.field242[var6];
                            int var124 = class15.field242[var6 + 1];
                            int var125 = (var124 << 14) + var123;
                            int var126 = class15.field242[var6 + 3];
                            int var127 = class15.field242[var6 + 2];
                            int var128 = (var127 << 28) + var125;
                            int var129 = var126 + var128;
                            class15.field242[var6++] = var129;
                            continue;
                        }
                        if (var528 == 3337) {
                            class15.field242[var6++] = class105.field1393;
                            continue;
                        }
                    } else if (var528 < 3500) {
                        if (var528 == 3400) {
                            var6 -= 2;
                            int var472 = class15.field242[var6 + 1];
                            int var473 = class15.field242[var6];
                            class224 var474 = class304.method2109(var473, 71);
                            if (var474.field3533 == 's') {
                            }
                            class263.field4117[var7++] = var474.method1642(64, var472);
                            continue;
                        }
                        if (var528 == 3408) {
                            var6 -= 4;
                            int var475 = class15.field242[var6];
                            int var476 = class15.field242[var6 + 1];
                            int var477 = class15.field242[var6 + 2];
                            int var478 = class15.field242[var6 + 3];
                            class224 var479 = class304.method2109(var477, 70);
                            if (var479.field3557 == var475 && var479.field3533 == var476) {
                                if (var476 == 115) {
                                    class263.field4117[var7++] = var479.method1642(64, var478);
                                } else {
                                    class15.field242[var6++] = var479.method1641((byte) 114, var478);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var528 == 3409) {
                            var6 -= 3;
                            int var480 = class15.field242[var6];
                            int var481 = class15.field242[var6 + 1];
                            int var482 = class15.field242[var6 + 2];
                            if (var481 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class224 var483 = class304.method2109(var481, arg0 ^ 0x45);
                            if (var483.field3533 != var480) {
                                throw new RuntimeException("C3409-1");
                            }
                            class15.field242[var6++] = var483.method1644(var482, true) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3410) {
                            var6--;
                            int var484 = class15.field242[var6];
                            var7--;
                            String var485 = class263.field4117[var7];
                            if (var484 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class224 var486 = class304.method2109(var484, 113);
                            if (var486.field3533 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class15.field242[var6++] = var486.method1637(16901, var485) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3411) {
                            var6--;
                            int var487 = class15.field242[var6];
                            class224 var488 = class304.method2109(var487, arg0 ^ 0x44);
                            class15.field242[var6++] = var488.field3543.method2169(false);
                            continue;
                        }
                    } else if (var528 < 3700) {
                        if (var528 == 3600) {
                            if (class20.field306 == 0) {
                                class15.field242[var6++] = -2;
                            } else if (class20.field306 == 1) {
                                class15.field242[var6++] = -1;
                            } else {
                                class15.field242[var6++] = class301.field4626;
                            }
                            continue;
                        }
                        if (var528 == 3601) {
                            var6--;
                            int var448 = class15.field242[var6];
                            if (class20.field306 == 2 && class301.field4626 > var448) {
                                class263.field4117[var7++] = class55.field768[var448];
                                continue;
                            }
                            class263.field4117[var7++] = "";
                            continue;
                        }
                        if (var528 == 3602) {
                            var6--;
                            int var449 = class15.field242[var6];
                            if (class20.field306 == 2 && class301.field4626 > var449) {
                                class15.field242[var6++] = class99.field1336[var449];
                                continue;
                            }
                            class15.field242[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3603) {
                            var6--;
                            int var450 = class15.field242[var6];
                            if (class20.field306 == 2 && class301.field4626 > var450) {
                                class15.field242[var6++] = class270.field4195[var450];
                                continue;
                            }
                            class15.field242[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3604) {
                            var7--;
                            String var451 = class263.field4117[var7];
                            var6--;
                            int var452 = class15.field242[var6];
                            class224.method1645(-12878, var451, var452);
                            continue;
                        }
                        if (var528 == 3605) {
                            var7--;
                            String var453 = class263.field4117[var7];
                            class156.method1132((byte) 112, class83.method608(var453, (byte) 96));
                            continue;
                        }
                        if (var528 == 3606) {
                            var7--;
                            String var454 = class263.field4117[var7];
                            class70.method548(class83.method608(var454, (byte) -82), 59);
                            continue;
                        }
                        if (var528 == 3607) {
                            var7--;
                            String var455 = class263.field4117[var7];
                            class183.method1340(false, class83.method608(var455, (byte) -116), arg0 ^ 0xFFFFFF82);
                            continue;
                        }
                        if (var528 == 3608) {
                            var7--;
                            String var456 = class263.field4117[var7];
                            class113.method799(class83.method608(var456, (byte) 80), (byte) -61);
                            continue;
                        }
                        if (var528 == 3609) {
                            var7--;
                            String var457 = class263.field4117[var7];
                            if (var457.startsWith("<img=0>") || var457.startsWith("<img=1>")) {
                                var457 = var457.substring(7);
                            }
                            class15.field242[var6++] = class282.method2004(var457, 21216) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3610) {
                            var6--;
                            int var458 = class15.field242[var6];
                            if (class20.field306 == 2 && var458 < class301.field4626) {
                                class263.field4117[var7++] = class166.field2736[var458];
                                continue;
                            }
                            class263.field4117[var7++] = "";
                            continue;
                        }
                        if (var528 == 3611) {
                            if (class337.field5278 == null) {
                                class263.field4117[var7++] = "";
                            } else {
                                class263.field4117[var7++] = class7.method101(class337.field5278, (byte) 115);
                            }
                            continue;
                        }
                        if (var528 == 3612) {
                            if (class337.field5278 == null) {
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = class229.field3593;
                            }
                            continue;
                        }
                        if (var528 == 3613) {
                            var6--;
                            int var459 = class15.field242[var6];
                            if (class337.field5278 != null && class229.field3593 > var459) {
                                class263.field4117[var7++] = class7.method101(class235.field3666[var459].field470, (byte) 99);
                                continue;
                            }
                            class263.field4117[var7++] = "";
                            continue;
                        }
                        if (var528 == 3614) {
                            var6--;
                            int var460 = class15.field242[var6];
                            if (class337.field5278 != null && var460 < class229.field3593) {
                                class15.field242[var6++] = class235.field3666[var460].field477;
                                continue;
                            }
                            class15.field242[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3615) {
                            var6--;
                            int var461 = class15.field242[var6];
                            if (class337.field5278 != null && var461 < class229.field3593) {
                                class15.field242[var6++] = class235.field3666[var461].field469;
                                continue;
                            }
                            class15.field242[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3616) {
                            class15.field242[var6++] = class241.field3763;
                            continue;
                        }
                        if (var528 == 3617) {
                            var7--;
                            String var462 = class263.field4117[var7];
                            class195.method1450(var462, true);
                            continue;
                        }
                        if (var528 == 3618) {
                            class15.field242[var6++] = class292.field4516;
                            continue;
                        }
                        if (var528 == 3619) {
                            var7--;
                            String var463 = class263.field4117[var7];
                            class84.method609(class83.method608(var463, (byte) -105), (byte) -118);
                            continue;
                        }
                        if (var528 == 3620) {
                            class311.method2160(arg0 ^ 0xFFFFFFBF);
                            continue;
                        }
                        if (var528 == 3621) {
                            if (class20.field306 == 0) {
                                class15.field242[var6++] = -1;
                            } else {
                                class15.field242[var6++] = class162.field2640;
                            }
                            continue;
                        }
                        if (var528 == 3622) {
                            var6--;
                            int var464 = class15.field242[var6];
                            if (class20.field306 != 0 && class162.field2640 > var464) {
                                class263.field4117[var7++] = class154.method1118(114, class316.field4982[var464]);
                                continue;
                            }
                            class263.field4117[var7++] = "";
                            continue;
                        }
                        if (var528 == 3623) {
                            var7--;
                            String var465 = class263.field4117[var7];
                            if (var465.startsWith("<img=0>") || var465.startsWith("<img=1>")) {
                                var465 = var465.substring(7);
                            }
                            class15.field242[var6++] = class345.method2384(0, var465) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3624) {
                            var6--;
                            int var466 = class15.field242[var6];
                            if (class235.field3666 != null && var466 < class229.field3593 && class235.field3666[var466].field470.equalsIgnoreCase(class146.field2310.field5277)) {
                                class15.field242[var6++] = 1;
                                continue;
                            }
                            class15.field242[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3625) {
                            if (class235.field3691 == null) {
                                class263.field4117[var7++] = "";
                            } else {
                                class263.field4117[var7++] = class7.method101(class235.field3691, (byte) 111);
                            }
                            continue;
                        }
                        if (var528 == 3626) {
                            var6--;
                            int var467 = class15.field242[var6];
                            if (class337.field5278 != null && var467 < class229.field3593) {
                                class263.field4117[var7++] = class235.field3666[var467].field478;
                                continue;
                            }
                            class263.field4117[var7++] = "";
                            continue;
                        }
                        if (var528 == 3627) {
                            var6--;
                            int var468 = class15.field242[var6];
                            if (class20.field306 == 2 && var468 >= 0 && var468 < class301.field4626) {
                                class15.field242[var6++] = class11.field202[var468] ? 1 : 0;
                                continue;
                            }
                            class15.field242[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3628) {
                            var7--;
                            String var469 = class263.field4117[var7];
                            if (var469.startsWith("<img=0>") || var469.startsWith("<img=1>")) {
                                var469 = var469.substring(7);
                            }
                            class15.field242[var6++] = class4.method13(26, var469);
                            continue;
                        }
                        if (var528 == 3629) {
                            class15.field242[var6++] = class211.field3321;
                            continue;
                        }
                        if (var528 == 3630) {
                            var7--;
                            String var470 = class263.field4117[var7];
                            class183.method1340(true, class83.method608(var470, (byte) 124), -99);
                            continue;
                        }
                        if (var528 == 3631) {
                            var6--;
                            int var471 = class15.field242[var6];
                            class15.field242[var6++] = class214.field3385[var471] ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4000) {
                        if (var528 == 3903) {
                            var6--;
                            int var130 = class15.field242[var6];
                            class15.field242[var6++] = class47.field611[var130].method2117(126);
                            continue;
                        }
                        if (var528 == 3904) {
                            var6--;
                            int var131 = class15.field242[var6];
                            class15.field242[var6++] = class47.field611[var131].field4780;
                            continue;
                        }
                        if (var528 == 3905) {
                            var6--;
                            int var132 = class15.field242[var6];
                            class15.field242[var6++] = class47.field611[var132].field4773;
                            continue;
                        }
                        if (var528 == 3906) {
                            var6--;
                            int var133 = class15.field242[var6];
                            class15.field242[var6++] = class47.field611[var133].field4787;
                            continue;
                        }
                        if (var528 == 3907) {
                            var6--;
                            int var134 = class15.field242[var6];
                            class15.field242[var6++] = class47.field611[var134].field4775;
                            continue;
                        }
                        if (var528 == 3908) {
                            var6--;
                            int var135 = class15.field242[var6];
                            class15.field242[var6++] = class47.field611[var135].field4777;
                            continue;
                        }
                        if (var528 == 3910) {
                            var6--;
                            int var136 = class15.field242[var6];
                            int var137 = class47.field611[var136].method2118(true);
                            class15.field242[var6++] = var137 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3911) {
                            var6--;
                            int var138 = class15.field242[var6];
                            int var139 = class47.field611[var138].method2118(true);
                            class15.field242[var6++] = var139 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3912) {
                            var6--;
                            int var140 = class15.field242[var6];
                            int var141 = class47.field611[var140].method2118(true);
                            class15.field242[var6++] = var141 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3913) {
                            var6--;
                            int var142 = class15.field242[var6];
                            int var143 = class47.field611[var142].method2118(true);
                            class15.field242[var6++] = var143 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4100) {
                        if (var528 == 4000) {
                            var6 -= 2;
                            int var144 = class15.field242[var6];
                            int var145 = class15.field242[var6 + 1];
                            class15.field242[var6++] = var144 + var145;
                            continue;
                        }
                        if (var528 == 4001) {
                            var6 -= 2;
                            int var146 = class15.field242[var6];
                            int var147 = class15.field242[var6 + 1];
                            class15.field242[var6++] = var146 - var147;
                            continue;
                        }
                        if (var528 == 4002) {
                            var6 -= 2;
                            int var148 = class15.field242[var6];
                            int var149 = class15.field242[var6 + 1];
                            class15.field242[var6++] = var148 * var149;
                            continue;
                        }
                        if (var528 == 4003) {
                            var6 -= 2;
                            int var150 = class15.field242[var6];
                            int var151 = class15.field242[var6 + 1];
                            class15.field242[var6++] = var150 / var151;
                            continue;
                        }
                        if (var528 == 4004) {
                            var6--;
                            int var152 = class15.field242[var6];
                            class15.field242[var6++] = (int) (Math.random() * (double) var152);
                            continue;
                        }
                        if (var528 == 4005) {
                            var6--;
                            int var153 = class15.field242[var6];
                            class15.field242[var6++] = (int) ((double) (var153 + 1) * Math.random());
                            continue;
                        }
                        if (var528 == 4006) {
                            var6 -= 5;
                            int var154 = class15.field242[var6];
                            int var155 = class15.field242[var6 + 1];
                            int var156 = class15.field242[var6 + 2];
                            int var157 = class15.field242[var6 + 3];
                            int var158 = class15.field242[var6 + 4];
                            class15.field242[var6++] = (var158 - var156) * (var155 - var154) / (var157 - var156) + var154;
                            continue;
                        }
                        if (var528 == 4007) {
                            var6 -= 2;
                            long var159 = (long) class15.field242[var6];
                            long var161 = (long) class15.field242[var6 + 1];
                            class15.field242[var6++] = (int) (var159 * var161 / 100L + var159);
                            continue;
                        }
                        if (var528 == 4008) {
                            var6 -= 2;
                            int var163 = class15.field242[var6 + 1];
                            int var164 = class15.field242[var6];
                            class15.field242[var6++] = class214.method1562(0x1 << var163, var164);
                            continue;
                        }
                        if (var528 == 4009) {
                            var6 -= 2;
                            int var165 = class15.field242[var6];
                            int var166 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class333.method2319(var165, -(0x1 << var166) - 1);
                            continue;
                        }
                        if (var528 == 4010) {
                            var6 -= 2;
                            int var167 = class15.field242[var6];
                            int var168 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class333.method2319(0x1 << var168, var167) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var528 == 4011) {
                            var6 -= 2;
                            int var169 = class15.field242[var6];
                            int var170 = class15.field242[var6 + 1];
                            class15.field242[var6++] = var169 % var170;
                            continue;
                        }
                        if (var528 == 4012) {
                            var6 -= 2;
                            int var171 = class15.field242[var6 + 1];
                            int var172 = class15.field242[var6];
                            if (var172 == 0) {
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = (int) Math.pow((double) var172, (double) var171);
                            }
                            continue;
                        }
                        if (var528 == 4013) {
                            var6 -= 2;
                            int var173 = class15.field242[var6 + 1];
                            int var174 = class15.field242[var6];
                            if (var174 == 0) {
                                class15.field242[var6++] = 0;
                            } else if (var173 == 0) {
                                class15.field242[var6++] = Integer.MAX_VALUE;
                            } else {
                                class15.field242[var6++] = (int) Math.pow((double) var174, 1.0D / (double) var173);
                            }
                            continue;
                        }
                        if (var528 == 4014) {
                            var6 -= 2;
                            int var175 = class15.field242[var6 + 1];
                            int var176 = class15.field242[var6];
                            class15.field242[var6++] = class333.method2319(var175, var176);
                            continue;
                        }
                        if (var528 == 4015) {
                            var6 -= 2;
                            int var177 = class15.field242[var6 + 1];
                            int var178 = class15.field242[var6];
                            class15.field242[var6++] = class214.method1562(var177, var178);
                            continue;
                        }
                        if (var528 == 4016) {
                            var6 -= 2;
                            int var179 = class15.field242[var6 + 1];
                            int var180 = class15.field242[var6];
                            class15.field242[var6++] = var179 <= var180 ? var179 : var180;
                            continue;
                        }
                        if (var528 == 4017) {
                            var6 -= 2;
                            int var181 = class15.field242[var6];
                            int var182 = class15.field242[var6 + 1];
                            class15.field242[var6++] = var182 >= var181 ? var182 : var181;
                            continue;
                        }
                        if (var528 == 4018) {
                            var6 -= 3;
                            long var183 = (long) class15.field242[var6];
                            long var185 = (long) class15.field242[var6 + 1];
                            long var187 = (long) class15.field242[var6 + 2];
                            class15.field242[var6++] = (int) (var183 * var187 / var185);
                            continue;
                        }
                    } else if (var528 < 4200) {
                        if (var528 == 4100) {
                            var6--;
                            int var189 = class15.field242[var6];
                            var7--;
                            String var190 = class263.field4117[var7];
                            class263.field4117[var7++] = var190 + var189;
                            continue;
                        }
                        if (var528 == 4101) {
                            var7 -= 2;
                            String var191 = class263.field4117[var7];
                            String var192 = class263.field4117[var7 + 1];
                            class263.field4117[var7++] = var191 + var192;
                            continue;
                        }
                        if (var528 == 4102) {
                            var6--;
                            int var193 = class15.field242[var6];
                            var7--;
                            String var194 = class263.field4117[var7];
                            class263.field4117[var7++] = var194 + class71.method553(0, var193, true);
                            continue;
                        }
                        if (var528 == 4103) {
                            var7--;
                            String var195 = class263.field4117[var7];
                            class263.field4117[var7++] = var195.toLowerCase();
                            continue;
                        }
                        if (var528 == 4104) {
                            var6--;
                            int var196 = class15.field242[var6];
                            long var197 = (long) var196 * 86400000L + 1014768000000L;
                            class265.field4143.setTime(new Date(var197));
                            int var199 = class265.field4143.get(5);
                            int var200 = class265.field4143.get(2);
                            int var201 = class265.field4143.get(1);
                            class263.field4117[var7++] = var199 + "-" + class83.field1135[var200] + "-" + var201;
                            continue;
                        }
                        if (var528 == 4105) {
                            var7 -= 2;
                            String var202 = class263.field4117[var7];
                            String var203 = class263.field4117[var7 + 1];
                            if (class146.field2310.field5264 != null && class146.field2310.field5264.field756) {
                                class263.field4117[var7++] = var203;
                                continue;
                            }
                            class263.field4117[var7++] = var202;
                            continue;
                        }
                        if (var528 == 4106) {
                            var6--;
                            int var204 = class15.field242[var6];
                            class263.field4117[var7++] = Integer.toString(var204);
                            continue;
                        }
                        if (var528 == 4107) {
                            var7 -= 2;
                            class15.field242[var6++] = class282.method2000(class308.method2128(class263.field4117[var7], 0, class263.field4117[var7 + 1], class141.field2240), 5771);
                            continue;
                        }
                        if (var528 == 4108) {
                            var7--;
                            String var205 = class263.field4117[var7];
                            var6 -= 2;
                            int var206 = class15.field242[var6 + 1];
                            int var207 = class15.field242[var6];
                            class15.field242[var6++] = class21.method209(-31640, var206).method2249(var205, var207);
                            continue;
                        }
                        if (var528 == 4109) {
                            var7--;
                            String var208 = class263.field4117[var7];
                            var6 -= 2;
                            int var209 = class15.field242[var6];
                            int var210 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class21.method209(-31640, var210).method2270(var208, var209);
                            continue;
                        }
                        if (var528 == 4110) {
                            var7 -= 2;
                            String var211 = class263.field4117[var7];
                            String var212 = class263.field4117[var7 + 1];
                            var6--;
                            if (class15.field242[var6] == 1) {
                                class263.field4117[var7++] = var211;
                            } else {
                                class263.field4117[var7++] = var212;
                            }
                            continue;
                        }
                        if (var528 == 4111) {
                            var7--;
                            String var213 = class263.field4117[var7];
                            class263.field4117[var7++] = class321.method2255(var213);
                            continue;
                        }
                        if (var528 == 4112) {
                            var7--;
                            String var214 = class263.field4117[var7];
                            var6--;
                            int var215 = class15.field242[var6];
                            if (var215 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class263.field4117[var7++] = var214 + (char) var215;
                            continue;
                        }
                        if (var528 == 4113) {
                            var6--;
                            int var216 = class15.field242[var6];
                            class15.field242[var6++] = class254.method1846((char) var216, -18338) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4114) {
                            var6--;
                            int var217 = class15.field242[var6];
                            class15.field242[var6++] = class20.method202((char) var217, true) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4115) {
                            var6--;
                            int var218 = class15.field242[var6];
                            class15.field242[var6++] = class72.method557(-59, (char) var218) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4116) {
                            var6--;
                            int var219 = class15.field242[var6];
                            class15.field242[var6++] = class255.method1851((char) var219, (byte) 122) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4117) {
                            var7--;
                            String var220 = class263.field4117[var7];
                            if (var220 == null) {
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = var220.length();
                            }
                            continue;
                        }
                        if (var528 == 4118) {
                            var6 -= 2;
                            var7--;
                            String var221 = class263.field4117[var7];
                            int var222 = class15.field242[var6];
                            int var223 = class15.field242[var6 + 1];
                            class263.field4117[var7++] = var221.substring(var222, var223);
                            continue;
                        }
                        if (var528 == 4119) {
                            var7--;
                            String var224 = class263.field4117[var7];
                            boolean var225 = false;
                            StringBuffer var226 = new StringBuffer(var224.length());
                            for (int var227 = 0; var227 < var224.length(); var227++) {
                                char var228 = var224.charAt(var227);
                                if (var228 == '<') {
                                    var225 = true;
                                } else if (var228 == '>') {
                                    var225 = false;
                                } else if (!var225) {
                                    var226.append(var228);
                                }
                            }
                            class263.field4117[var7++] = var226.toString();
                            continue;
                        }
                        if (var528 == 4120) {
                            var6 -= 2;
                            var7--;
                            String var229 = class263.field4117[var7];
                            int var230 = class15.field242[var6];
                            int var231 = class15.field242[var6 + 1];
                            class15.field242[var6++] = var229.indexOf(var230, var231);
                            continue;
                        }
                        if (var528 == 4121) {
                            var7 -= 2;
                            String var232 = class263.field4117[var7 + 1];
                            String var233 = class263.field4117[var7];
                            var6--;
                            int var234 = class15.field242[var6];
                            class15.field242[var6++] = var233.indexOf(var232, var234);
                            continue;
                        }
                        if (var528 == 4122) {
                            var6--;
                            int var235 = class15.field242[var6];
                            class15.field242[var6++] = Character.toLowerCase((char) var235);
                            continue;
                        }
                        if (var528 == 4123) {
                            var6--;
                            int var236 = class15.field242[var6];
                            class15.field242[var6++] = Character.toUpperCase((char) var236);
                            continue;
                        }
                        if (var528 == 4124) {
                            var6--;
                            boolean var237 = class15.field242[var6] != 0;
                            var6--;
                            int var238 = class15.field242[var6];
                            class263.field4117[var7++] = class343.method2372(var237, 101, class141.field2240, (long) var238, 0);
                            continue;
                        }
                    } else if (var528 < 4300) {
                        if (var528 == 4200) {
                            var6--;
                            int var429 = class15.field242[var6];
                            class263.field4117[var7++] = class149.method1092((byte) -104, var429).field4988;
                            continue;
                        }
                        if (var528 == 4201) {
                            var6 -= 2;
                            int var430 = class15.field242[var6];
                            int var431 = class15.field242[var6 + 1];
                            class316 var432 = class149.method1092((byte) -104, var430);
                            if (var431 >= 1 && var431 <= 5 && var432.field4969[var431 - 1] != null) {
                                class263.field4117[var7++] = var432.field4969[var431 - 1];
                                continue;
                            }
                            class263.field4117[var7++] = "";
                            continue;
                        }
                        if (var528 == 4202) {
                            var6 -= 2;
                            int var433 = class15.field242[var6];
                            int var434 = class15.field242[var6 + 1];
                            class316 var435 = class149.method1092((byte) -104, var433);
                            if (var434 >= 1 && var434 <= 5 && var435.field4968[var434 - 1] != null) {
                                class263.field4117[var7++] = var435.field4968[var434 - 1];
                                continue;
                            }
                            class263.field4117[var7++] = "";
                            continue;
                        }
                        if (var528 == 4203) {
                            var6--;
                            int var436 = class15.field242[var6];
                            class15.field242[var6++] = class149.method1092((byte) -104, var436).field4993;
                            continue;
                        }
                        if (var528 == 4204) {
                            var6--;
                            int var437 = class15.field242[var6];
                            class15.field242[var6++] = class149.method1092((byte) -104, var437).field4981 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4205) {
                            var6--;
                            int var438 = class15.field242[var6];
                            class316 var439 = class149.method1092((byte) -104, var438);
                            if (var439.field4996 == -1 && var439.field4958 >= 0) {
                                class15.field242[var6++] = var439.field4958;
                                continue;
                            }
                            class15.field242[var6++] = var438;
                            continue;
                        }
                        if (var528 == 4206) {
                            var6--;
                            int var440 = class15.field242[var6];
                            class316 var441 = class149.method1092((byte) -104, var440);
                            if (var441.field4996 >= 0 && var441.field4958 >= 0) {
                                class15.field242[var6++] = var441.field4958;
                                continue;
                            }
                            class15.field242[var6++] = var440;
                            continue;
                        }
                        if (var528 == 4207) {
                            var6--;
                            int var442 = class15.field242[var6];
                            class15.field242[var6++] = class149.method1092((byte) -104, var442).field4990 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4208) {
                            var6 -= 2;
                            int var443 = class15.field242[var6 + 1];
                            int var444 = class15.field242[var6];
                            class58 var445 = class246.method1769(var443, (byte) -120);
                            if (var445.method472(arg0 ^ 0x17)) {
                                class263.field4117[var7++] = class149.method1092((byte) -104, var444).method2211(11556, var443, var445.field829);
                            } else {
                                class15.field242[var6++] = class149.method1092((byte) -104, var444).method2214(var445.field826, var443, -50);
                            }
                            continue;
                        }
                        if (var528 == 4210) {
                            var7--;
                            String var446 = class263.field4117[var7];
                            var6--;
                            int var447 = class15.field242[var6];
                            class144.method1069(var447 == 1, var446, (byte) 104);
                            class15.field242[var6++] = class325.field5099;
                            continue;
                        }
                        if (var528 == 4211) {
                            if (class277.field4273 != null && class325.field5099 > class220.field3481) {
                                class15.field242[var6++] = class333.method2319(65535, class277.field4273[class220.field3481++]);
                                continue;
                            }
                            class15.field242[var6++] = -1;
                            continue;
                        }
                        if (var528 == 4212) {
                            class220.field3481 = 0;
                            continue;
                        }
                    } else if (var528 < 4400) {
                        if (var528 == 4300) {
                            var6 -= 2;
                            int var239 = class15.field242[var6 + 1];
                            int var240 = class15.field242[var6];
                            class58 var241 = class246.method1769(var239, (byte) -114);
                            if (var241.method472(-106)) {
                                class263.field4117[var7++] = class41.method339(49, var240).method1197(-1, var239, var241.field829);
                            } else {
                                class15.field242[var6++] = class41.method339(102, var240).method1193(84, var241.field826, var239);
                            }
                            continue;
                        }
                    } else if (var528 < 4500) {
                        if (var528 == 4400) {
                            var6 -= 2;
                            int var242 = class15.field242[var6 + 1];
                            int var243 = class15.field242[var6];
                            class58 var244 = class246.method1769(var242, (byte) -121);
                            if (var244.method472(arg0 - 122)) {
                                class263.field4117[var7++] = class249.method1790(34, var243).method867((byte) 126, var244.field829, var242);
                            } else {
                                class15.field242[var6++] = class249.method1790(95, var243).method866((byte) 66, var242, var244.field826);
                            }
                            continue;
                        }
                    } else if (var528 < 4600) {
                        if (var528 == 4500) {
                            var6 -= 2;
                            int var245 = class15.field242[var6];
                            int var246 = class15.field242[var6 + 1];
                            class58 var247 = class246.method1769(var246, (byte) -120);
                            if (var247.method472(-121)) {
                                class263.field4117[var7++] = class205.method1509(var245, true).method1363(var247.field829, (byte) 116, var246);
                            } else {
                                class15.field242[var6++] = class205.method1509(var245, true).method1362(var247.field826, (byte) 42, var246);
                            }
                            continue;
                        }
                    } else if (var528 < 5100) {
                        if (var528 == 5000) {
                            class15.field242[var6++] = class164.field2657;
                            continue;
                        }
                        if (var528 == 5001) {
                            class316.field4998++;
                            var6 -= 3;
                            class164.field2657 = class15.field242[var6];
                            class345.field5353 = class15.field242[var6 + 1];
                            class156.field2411 = class15.field242[var6 + 2];
                            class183.field2965.method1947((byte) 123, 48);
                            class183.field2965.method81((byte) -127, class164.field2657);
                            class183.field2965.method81((byte) -107, class345.field5353);
                            class183.field2965.method81((byte) -118, class156.field2411);
                            continue;
                        }
                        if (var528 == 5002) {
                            class249.field3926++;
                            var6 -= 2;
                            var7--;
                            String var248 = class263.field4117[var7];
                            int var249 = class15.field242[var6];
                            int var250 = class15.field242[var6 + 1];
                            class183.field2965.method1947((byte) 63, 201);
                            class183.field2965.method53((byte) 110, class83.method608(var248, (byte) -57));
                            class183.field2965.method81((byte) -123, var249 - 1);
                            class183.field2965.method81((byte) -121, var250);
                            continue;
                        }
                        if (var528 == 5003) {
                            var6--;
                            int var251 = class15.field242[var6];
                            String var252 = null;
                            if (var251 < 100) {
                                var252 = class107.field1418[var251];
                            }
                            if (var252 == null) {
                                var252 = "";
                            }
                            class263.field4117[var7++] = var252;
                            continue;
                        }
                        if (var528 == 5004) {
                            var6--;
                            int var253 = class15.field242[var6];
                            int var254 = -1;
                            if (var253 < 100 && class107.field1418[var253] != null) {
                                var254 = class283.field4380[var253];
                            }
                            class15.field242[var6++] = var254;
                            continue;
                        }
                        if (var528 == 5005) {
                            class15.field242[var6++] = class345.field5353;
                            continue;
                        }
                        if (var528 == 5008) {
                            var7--;
                            String var255 = class263.field4117[var7];
                            if (var255.startsWith("::")) {
                                class24.method232(var255, -61);
                                continue;
                            }
                            if (client.field1905 == 0 && (class336.field5241 && !class26.field392 || class83.field1136)) {
                                continue;
                            }
                            class191.field3046++;
                            String var256 = var255.toLowerCase();
                            byte var257 = 0;
                            byte var258 = 0;
                            if (var256.startsWith(class83.field1139)) {
                                var255 = var255.substring(class83.field1139.length());
                                var257 = 0;
                            } else if (var256.startsWith(class273.field4228)) {
                                var257 = 1;
                                var255 = var255.substring(class273.field4228.length());
                            } else if (var256.startsWith(class42.field576)) {
                                var255 = var255.substring(class42.field576.length());
                                var257 = 2;
                            } else if (var256.startsWith(class1.field10)) {
                                var255 = var255.substring(class1.field10.length());
                                var257 = 3;
                            } else if (var256.startsWith(class291.field4504)) {
                                var255 = var255.substring(class291.field4504.length());
                                var257 = 4;
                            } else if (var256.startsWith(class256.field4040)) {
                                var257 = 5;
                                var255 = var255.substring(class256.field4040.length());
                            } else if (var256.startsWith(class18.field299)) {
                                var257 = 6;
                                var255 = var255.substring(class18.field299.length());
                            } else if (var256.startsWith(class257.field4059)) {
                                var255 = var255.substring(class257.field4059.length());
                                var257 = 7;
                            } else if (var256.startsWith(class223.field3525)) {
                                var257 = 8;
                                var255 = var255.substring(class223.field3525.length());
                            } else if (var256.startsWith(class267.field4167)) {
                                var257 = 9;
                                var255 = var255.substring(class267.field4167.length());
                            } else if (var256.startsWith(class344.field5346)) {
                                var255 = var255.substring(class344.field5346.length());
                                var257 = 10;
                            } else if (var256.startsWith(class311.field4866)) {
                                var257 = 11;
                                var255 = var255.substring(class311.field4866.length());
                            } else if (class141.field2240 != 0) {
                                if (var256.startsWith(class333.field5187)) {
                                    var255 = var255.substring(class333.field5187.length());
                                    var257 = 0;
                                } else if (var256.startsWith(class325.field5095)) {
                                    var255 = var255.substring(class325.field5095.length());
                                    var257 = 1;
                                } else if (var256.startsWith(class15.field262)) {
                                    var257 = 2;
                                    var255 = var255.substring(class15.field262.length());
                                } else if (var256.startsWith(class61.field896)) {
                                    var255 = var255.substring(class61.field896.length());
                                    var257 = 3;
                                } else if (var256.startsWith(class283.field4379)) {
                                    var255 = var255.substring(class283.field4379.length());
                                    var257 = 4;
                                } else if (var256.startsWith(class2.field25)) {
                                    var257 = 5;
                                    var255 = var255.substring(class2.field25.length());
                                } else if (var256.startsWith(class127.field1837)) {
                                    var257 = 6;
                                    var255 = var255.substring(class127.field1837.length());
                                } else if (var256.startsWith(class225.field3580)) {
                                    var257 = 7;
                                    var255 = var255.substring(class225.field3580.length());
                                } else if (var256.startsWith(class251.field3947)) {
                                    var257 = 8;
                                    var255 = var255.substring(class251.field3947.length());
                                } else if (var256.startsWith(class107.field1448)) {
                                    var257 = 9;
                                    var255 = var255.substring(class107.field1448.length());
                                } else if (var256.startsWith(class130.field1926)) {
                                    var255 = var255.substring(class130.field1926.length());
                                    var257 = 10;
                                } else if (var256.startsWith(class98.field1294)) {
                                    var255 = var255.substring(class98.field1294.length());
                                    var257 = 11;
                                }
                            }
                            String var259 = var255.toLowerCase();
                            if (var259.startsWith(class71.field982)) {
                                var255 = var255.substring(class71.field982.length());
                                var258 = 1;
                            } else if (var259.startsWith(class328.field5146)) {
                                var258 = 2;
                                var255 = var255.substring(class328.field5146.length());
                            } else if (var259.startsWith(class43.field587)) {
                                var255 = var255.substring(class43.field587.length());
                                var258 = 3;
                            } else if (var259.startsWith(class161.field2615)) {
                                var258 = 4;
                                var255 = var255.substring(class161.field2615.length());
                            } else if (var259.startsWith(class276.field4265)) {
                                var255 = var255.substring(class276.field4265.length());
                                var258 = 5;
                            } else if (class141.field2240 != 0) {
                                if (var259.startsWith(class179.field2905)) {
                                    var255 = var255.substring(class179.field2905.length());
                                    var258 = 1;
                                } else if (var259.startsWith(class39.field559)) {
                                    var255 = var255.substring(class39.field559.length());
                                    var258 = 2;
                                } else if (var259.startsWith(class193.field3078)) {
                                    var255 = var255.substring(class193.field3078.length());
                                    var258 = 3;
                                } else if (var259.startsWith(class174.field2852)) {
                                    var255 = var255.substring(class174.field2852.length());
                                    var258 = 4;
                                } else if (var259.startsWith(class265.field4140)) {
                                    var258 = 5;
                                    var255 = var255.substring(class265.field4140.length());
                                }
                            }
                            class183.field2965.method1947((byte) 102, 251);
                            class183.field2965.method81((byte) -121, 0);
                            int var260 = class183.field2965.field111;
                            class183.field2965.method81((byte) -101, var257);
                            class183.field2965.method81((byte) -123, var258);
                            class311.method2172(var255, 15994, class183.field2965);
                            class183.field2965.method64(class183.field2965.field111 - var260, 1557888296);
                            continue;
                        }
                        if (var528 == 5009) {
                            var7 -= 2;
                            String var261 = class263.field4117[var7];
                            String var262 = class263.field4117[var7 + 1];
                            if (client.field1905 != 0 || (!class336.field5241 || class26.field392) && !class83.field1136) {
                                class183.field2965.method1947((byte) 120, 165);
                                class183.field2965.method81((byte) -121, 0);
                                class193.field3085++;
                                int var263 = class183.field2965.field111;
                                class183.field2965.method53((byte) 111, class83.method608(var261, (byte) 91));
                                class311.method2172(var262, 15994, class183.field2965);
                                class183.field2965.method64(class183.field2965.field111 - var263, 1557888296);
                            }
                            continue;
                        }
                        if (var528 == 5010) {
                            var6--;
                            int var264 = class15.field242[var6];
                            String var265 = null;
                            if (var264 < 100) {
                                var265 = class153.field2377[var264];
                            }
                            if (var265 == null) {
                                var265 = "";
                            }
                            class263.field4117[var7++] = var265;
                            continue;
                        }
                        if (var528 == 5011) {
                            var6--;
                            int var266 = class15.field242[var6];
                            String var267 = null;
                            if (var266 < 100) {
                                var267 = class174.field2854[var266];
                            }
                            if (var267 == null) {
                                var267 = "";
                            }
                            class263.field4117[var7++] = var267;
                            continue;
                        }
                        if (var528 == 5012) {
                            var6--;
                            int var268 = class15.field242[var6];
                            int var269 = -1;
                            if (var268 < 100) {
                                var269 = class83.field1140[var268];
                            }
                            class15.field242[var6++] = var269;
                            continue;
                        }
                        if (var528 == 5015) {
                            String var270;
                            if (class146.field2310 == null || class146.field2310.field5277 == null) {
                                var270 = class336.field5243;
                            } else {
                                var270 = class146.field2310.method2335((byte) 94);
                            }
                            class263.field4117[var7++] = var270;
                            continue;
                        }
                        if (var528 == 5016) {
                            class15.field242[var6++] = class156.field2411;
                            continue;
                        }
                        if (var528 == 5017) {
                            class15.field242[var6++] = class198.field3169;
                            continue;
                        }
                        if (var528 == 5050) {
                            var6--;
                            int var271 = class15.field242[var6];
                            class263.field4117[var7++] = class141.method1048(true, var271).field3822;
                            continue;
                        }
                        if (var528 == 5051) {
                            var6--;
                            int var272 = class15.field242[var6];
                            class245 var273 = class141.method1048(true, var272);
                            if (var273.field3829 == null) {
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = var273.field3829.length;
                            }
                            continue;
                        }
                        if (var528 == 5052) {
                            var6 -= 2;
                            int var274 = class15.field242[var6];
                            int var275 = class15.field242[var6 + 1];
                            class245 var276 = class141.method1048(true, var274);
                            int var277 = var276.field3829[var275];
                            class15.field242[var6++] = var277;
                            continue;
                        }
                        if (var528 == 5053) {
                            var6--;
                            int var278 = class15.field242[var6];
                            class245 var279 = class141.method1048(true, var278);
                            if (var279.field3815 == null) {
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = var279.field3815.length;
                            }
                            continue;
                        }
                        if (var528 == 5054) {
                            var6 -= 2;
                            int var280 = class15.field242[var6];
                            int var281 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class141.method1048(true, var280).field3815[var281];
                            continue;
                        }
                        if (var528 == 5055) {
                            var6--;
                            int var282 = class15.field242[var6];
                            class263.field4117[var7++] = class142.method1059(class4.method16(arg0, -90), var282).method2237((byte) 105);
                            continue;
                        }
                        if (var528 == 5056) {
                            var6--;
                            int var283 = class15.field242[var6];
                            class318 var284 = class142.method1059(-112, var283);
                            if (var284.field5040 == null) {
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = var284.field5040.length;
                            }
                            continue;
                        }
                        if (var528 == 5057) {
                            var6 -= 2;
                            int var285 = class15.field242[var6 + 1];
                            int var286 = class15.field242[var6];
                            class15.field242[var6++] = class142.method1059(-53, var286).field5040[var285];
                            continue;
                        }
                        if (var528 == 5058) {
                            class27.field408 = new class214();
                            var6--;
                            class27.field408.field3381 = class15.field242[var6];
                            class27.field408.field3375 = class142.method1059(-75, class27.field408.field3381);
                            class27.field408.field3379 = new int[class27.field408.field3375.method2228((byte) -109)];
                            continue;
                        }
                        if (var528 == 5059) {
                            class342.field5317++;
                            class183.field2965.method1947((byte) -75, 197);
                            class183.field2965.method81((byte) -101, 0);
                            int var287 = class183.field2965.field111;
                            class183.field2965.method81((byte) -107, 0);
                            class183.field2965.method65((byte) -9, class27.field408.field3381);
                            class27.field408.field3375.method2229(arg0 + 109, class27.field408.field3379, class183.field2965);
                            class183.field2965.method64(class183.field2965.field111 - var287, 1557888296);
                            continue;
                        }
                        if (var528 == 5060) {
                            class78.field1050++;
                            var7--;
                            String var288 = class263.field4117[var7];
                            class183.field2965.method1947((byte) 85, 104);
                            class183.field2965.method81((byte) -122, 0);
                            int var289 = class183.field2965.field111;
                            class183.field2965.method53((byte) -73, class83.method608(var288, (byte) -119));
                            class183.field2965.method65((byte) -9, class27.field408.field3381);
                            class27.field408.field3375.method2229(arg0 ^ 0x62, class27.field408.field3379, class183.field2965);
                            class183.field2965.method64(class183.field2965.field111 - var289, 1557888296);
                            continue;
                        }
                        if (var528 == 5061) {
                            class183.field2965.method1947((byte) 56, 197);
                            class342.field5317++;
                            class183.field2965.method81((byte) -111, 0);
                            int var290 = class183.field2965.field111;
                            class183.field2965.method81((byte) -128, 1);
                            class183.field2965.method65((byte) -9, class27.field408.field3381);
                            class27.field408.field3375.method2229(115, class27.field408.field3379, class183.field2965);
                            class183.field2965.method64(class183.field2965.field111 - var290, 1557888296);
                            continue;
                        }
                        if (var528 == 5062) {
                            var6 -= 2;
                            int var291 = class15.field242[var6];
                            int var292 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class141.method1048(true, var291).field3827[var292];
                            continue;
                        }
                        if (var528 == 5063) {
                            var6 -= 2;
                            int var293 = class15.field242[var6 + 1];
                            int var294 = class15.field242[var6];
                            class15.field242[var6++] = class141.method1048(true, var294).field3818[var293];
                            continue;
                        }
                        if (var528 == 5064) {
                            var6 -= 2;
                            int var295 = class15.field242[var6];
                            int var296 = class15.field242[var6 + 1];
                            if (var296 == -1) {
                                class15.field242[var6++] = -1;
                            } else {
                                class15.field242[var6++] = class141.method1048(true, var295).method1763(arg0 + 124, (char) var296);
                            }
                            continue;
                        }
                        if (var528 == 5065) {
                            var6 -= 2;
                            int var297 = class15.field242[var6];
                            int var298 = class15.field242[var6 + 1];
                            if (var298 == -1) {
                                class15.field242[var6++] = -1;
                            } else {
                                class15.field242[var6++] = class141.method1048(true, var297).method1762((byte) -104, (char) var298);
                            }
                            continue;
                        }
                        if (var528 == 5066) {
                            var6--;
                            int var299 = class15.field242[var6];
                            class15.field242[var6++] = class142.method1059(class4.method16(arg0, -41), var299).method2228((byte) -109);
                            continue;
                        }
                        if (var528 == 5067) {
                            var6 -= 2;
                            int var300 = class15.field242[var6];
                            int var301 = class15.field242[var6 + 1];
                            int var302 = class142.method1059(-56, var300).method2238(var301, 118);
                            class15.field242[var6++] = var302;
                            continue;
                        }
                        if (var528 == 5068) {
                            var6 -= 2;
                            int var303 = class15.field242[var6];
                            int var304 = class15.field242[var6 + 1];
                            class27.field408.field3379[var303] = var304;
                            continue;
                        }
                        if (var528 == 5069) {
                            var6 -= 2;
                            int var305 = class15.field242[var6 + 1];
                            int var306 = class15.field242[var6];
                            class27.field408.field3379[var306] = var305;
                            continue;
                        }
                        if (var528 == 5070) {
                            var6 -= 3;
                            int var307 = class15.field242[var6 + 1];
                            int var308 = class15.field242[var6 + 2];
                            int var309 = class15.field242[var6];
                            class318 var310 = class142.method1059(arg0 ^ 0xFFFFFFC7, var309);
                            if (var310.method2238(var307, 126) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class15.field242[var6++] = var310.method2232(50, var308, var307);
                            continue;
                        }
                        if (var528 == 5071) {
                            var7--;
                            String var311 = class263.field4117[var7];
                            var6--;
                            boolean var312 = class15.field242[var6] == 1;
                            class327.method2298((byte) -114, var311, var312);
                            class15.field242[var6++] = class325.field5099;
                            continue;
                        }
                        if (var528 == 5072) {
                            if (class277.field4273 != null && class220.field3481 < class325.field5099) {
                                class15.field242[var6++] = class333.method2319(class277.field4273[class220.field3481++], 65535);
                                continue;
                            }
                            class15.field242[var6++] = -1;
                            continue;
                        }
                        if (var528 == 5073) {
                            class220.field3481 = 0;
                            continue;
                        }
                    } else if (var528 < 5200) {
                        if (var528 == 5100) {
                            if (class260.field4093[86]) {
                                class15.field242[var6++] = 1;
                            } else {
                                class15.field242[var6++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 5101) {
                            if (class260.field4093[82]) {
                                class15.field242[var6++] = 1;
                            } else {
                                class15.field242[var6++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 5102) {
                            if (class260.field4093[81]) {
                                class15.field242[var6++] = 1;
                            } else {
                                class15.field242[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var528 < 5300) {
                        if (var528 == 5200) {
                            var6--;
                            class132.method974(class15.field242[var6], (byte) 116);
                            continue;
                        }
                        if (var528 == 5201) {
                            class15.field242[var6++] = class341.method2361(37);
                            continue;
                        }
                        if (var528 == 5202) {
                            var6--;
                            class302.method2089(class15.field242[var6], (byte) 121);
                            continue;
                        }
                        if (var528 == 5203) {
                            var7--;
                            class199.method1470(false, class263.field4117[var7]);
                            continue;
                        }
                        if (var528 == 5204) {
                            class263.field4117[var7 - 1] = class251.method1800(class263.field4117[var7 - 1], false);
                            continue;
                        }
                        if (var528 == 5205) {
                            var6--;
                            class26.method245(-1, class15.field242[var6], false, -1);
                            continue;
                        }
                        if (var528 == 5206) {
                            var6--;
                            int var313 = class15.field242[var6];
                            class294 var314 = class133.method978(var313 & 0x3FFF, var313 >> 14 & 0x3FFF, (byte) 117);
                            if (var314 == null) {
                                class15.field242[var6++] = -1;
                            } else {
                                class15.field242[var6++] = var314.field4559;
                            }
                            continue;
                        }
                        if (var528 == 5207) {
                            var6--;
                            class294 var315 = class34.method309(class15.field242[var6], 255);
                            if (var315 != null && var315.field4546 != null) {
                                class263.field4117[var7++] = var315.field4546;
                                continue;
                            }
                            class263.field4117[var7++] = "";
                            continue;
                        }
                        if (var528 == 5208) {
                            class15.field242[var6++] = class6.field90;
                            class15.field242[var6++] = class156.field2413;
                            continue;
                        }
                        if (var528 == 5209) {
                            class15.field242[var6++] = class60.field885 + class322.field5081;
                            class15.field242[var6++] = class340.field5301 + class4.field42 - class191.field3045 - 1;
                            continue;
                        }
                        if (var528 == 5210) {
                            var6--;
                            int var316 = class15.field242[var6];
                            class294 var317 = class34.method309(var316, 255);
                            if (var317 == null) {
                                class15.field242[var6++] = 0;
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = class333.method2319(var317.field4568, 268434186) >> 14;
                                class15.field242[var6++] = class333.method2319(var317.field4568, 16383);
                            }
                            continue;
                        }
                        if (var528 == 5211) {
                            var6--;
                            int var318 = class15.field242[var6];
                            class294 var319 = class34.method309(var318, 255);
                            if (var319 == null) {
                                class15.field242[var6++] = 0;
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = var319.field4565 - var319.field4550;
                                class15.field242[var6++] = var319.field4556 - var319.field4558;
                            }
                            continue;
                        }
                        if (var528 == 5212) {
                            int var320 = class311.method2158(arg0 - 2265);
                            int var321 = 0;
                            String var322;
                            if (var320 == -1) {
                                var322 = "";
                            } else {
                                var322 = class278.field4290.field4246[var320];
                                var321 = class278.field4290.method1934(false, var320);
                            }
                            String var323 = class110.method783(119, " ", "<br>", var322);
                            class263.field4117[var7++] = var323;
                            class15.field242[var6++] = var321;
                            continue;
                        }
                        if (var528 == 5213) {
                            int var324 = class216.method1572((byte) -14);
                            int var325 = 0;
                            String var326;
                            if (var324 == -1) {
                                var326 = "";
                            } else {
                                var326 = class278.field4290.field4246[var324];
                                var325 = class278.field4290.method1934(false, var324);
                            }
                            String var327 = class110.method783(127, " ", "<br>", var326);
                            class263.field4117[var7++] = var327;
                            class15.field242[var6++] = var325;
                            continue;
                        }
                        if (var528 == 5214) {
                            var6--;
                            int var328 = class15.field242[var6];
                            class294 var329 = class220.method1610((byte) -42);
                            if (var329 != null) {
                                int[] var330 = var329.method2049(var328 & 0x3FFF, (var328 & 0x3A4DD547) >> 28, var328 >> 14 & 0x3FFF, 24540);
                                if (var330 != null) {
                                    class25.method242(var330[2], true, var330[1]);
                                }
                            }
                            continue;
                        }
                        if (var528 == 5215) {
                            var6 -= 2;
                            int var331 = class15.field242[var6 + 1];
                            int var332 = class15.field242[var6];
                            boolean var333 = false;
                            class315 var334 = class99.method689((var332 & 0xFFFC230) >> 14, (byte) -35, var332 & 0x3FFF);
                            for (class294 var335 = (class294) var334.method2198(200); var335 != null; var335 = (class294) var334.method2192((byte) -86)) {
                                if (var335.field4559 == var331) {
                                    var333 = true;
                                    break;
                                }
                            }
                            if (var333) {
                                class15.field242[var6++] = 1;
                            } else {
                                class15.field242[var6++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 5216) {
                            var6--;
                            int var336 = class15.field242[var6];
                            class248.method1788(var336, (byte) 49);
                            continue;
                        }
                        if (var528 == 5217) {
                            var6--;
                            int var337 = class15.field242[var6];
                            if (class274.method1929(var337, arg0 - 1)) {
                                class15.field242[var6++] = 1;
                            } else {
                                class15.field242[var6++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 5218) {
                            var6--;
                            int var338 = class15.field242[var6];
                            class294 var339 = class34.method309(var338, 255);
                            if (var339 == null) {
                                class15.field242[var6++] = -1;
                            } else {
                                class15.field242[var6++] = var339.field4553;
                            }
                            continue;
                        }
                        if (var528 == 5219) {
                            var7--;
                            class160.method1189(2236, class263.field4117[var7]);
                            continue;
                        }
                        if (var528 == 5220) {
                            class15.field242[var6++] = class2.field22 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 5221) {
                            var6--;
                            int var340 = class15.field242[var6];
                            class25.method242(var340 & 0x3FFF, true, var340 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var528 == 5222) {
                            class294 var341 = class220.method1610((byte) -108);
                            if (var341 == null) {
                                class15.field242[var6++] = -1;
                                class15.field242[var6++] = -1;
                            } else {
                                int[] var342 = var341.method2053(class4.field42 + class340.field5301 - class191.field3045 - 1, (byte) 119, class60.field885 + class322.field5081);
                                if (var342 == null) {
                                    class15.field242[var6++] = -1;
                                    class15.field242[var6++] = -1;
                                } else {
                                    class15.field242[var6++] = var342[1];
                                    class15.field242[var6++] = var342[2];
                                }
                            }
                            continue;
                        }
                        if (var528 == 5223) {
                            var6 -= 2;
                            int var343 = class15.field242[var6];
                            int var344 = class15.field242[var6 + 1];
                            class26.method245(var344 & 0x3FFF, var343, false, var344 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var528 == 5224) {
                            var6--;
                            int var345 = class15.field242[var6];
                            class294 var346 = class220.method1610((byte) -41);
                            if (var346 == null) {
                                class15.field242[var6++] = -1;
                                class15.field242[var6++] = -1;
                            } else {
                                int[] var347 = var346.method2049(var345 & 0x3FFF, var345 >> 28 & 0x3, (var345 & 0xFFFCFD6) >> 14, 24540);
                                if (var347 == null) {
                                    class15.field242[var6++] = -1;
                                    class15.field242[var6++] = -1;
                                } else {
                                    class15.field242[var6++] = var347[1];
                                    class15.field242[var6++] = var347[2];
                                }
                            }
                            continue;
                        }
                        if (var528 == 5225) {
                            var6--;
                            int var348 = class15.field242[var6];
                            class294 var349 = class220.method1610((byte) -67);
                            if (var349 == null) {
                                class15.field242[var6++] = -1;
                                class15.field242[var6++] = -1;
                            } else {
                                int[] var350 = var349.method2053(var348 & 0x3FFF, (byte) 121, (var348 & 0xFFFFA59) >> 14);
                                if (var350 == null) {
                                    class15.field242[var6++] = -1;
                                    class15.field242[var6++] = -1;
                                } else {
                                    class15.field242[var6++] = var350[1];
                                    class15.field242[var6++] = var350[2];
                                }
                            }
                            continue;
                        }
                    } else if (var528 < 5400) {
                        if (var528 == 5300) {
                            var6 -= 2;
                            int var416 = class15.field242[var6];
                            int var417 = class15.field242[var6 + 1];
                            class308.method2132(false, (byte) 13, 3, var417, var416);
                            class15.field242[var6++] = class134.field1966 == null ? 0 : 1;
                            continue;
                        }
                        if (var528 == 5301) {
                            if (class134.field1966 != null) {
                                class308.method2132(false, (byte) 13, class232.field3630, -1, -1);
                            }
                            continue;
                        }
                        if (var528 == 5302) {
                            class56[] var418 = class282.method2002(47);
                            class15.field242[var6++] = var418.length;
                            continue;
                        }
                        if (var528 == 5303) {
                            var6--;
                            int var419 = class15.field242[var6];
                            class56[] var420 = class282.method2002(80);
                            class15.field242[var6++] = var420[var419].field784;
                            class15.field242[var6++] = var420[var419].field780;
                            continue;
                        }
                        if (var528 == 5305) {
                            int var421 = class202.field3214;
                            int var422 = class180.field2926;
                            int var423 = -1;
                            class56[] var424 = class282.method2002(97);
                            for (int var425 = 0; var425 < var424.length; var425++) {
                                class56 var426 = var424[var425];
                                if (var426.field784 == var421 && var426.field780 == var422) {
                                    var423 = var425;
                                    break;
                                }
                            }
                            class15.field242[var6++] = var423;
                            continue;
                        }
                        if (var528 == 5306) {
                            class15.field242[var6++] = class113.method800((byte) -43);
                            continue;
                        }
                        if (var528 == 5307) {
                            var6--;
                            int var427 = class15.field242[var6];
                            if (var427 < 0 || var427 > 2) {
                                var427 = 0;
                            }
                            class308.method2132(false, (byte) 13, var427, -1, -1);
                            continue;
                        }
                        if (var528 == 5308) {
                            class15.field242[var6++] = class232.field3630;
                            continue;
                        }
                        if (var528 == 5309) {
                            var6--;
                            int var428 = class15.field242[var6];
                            if (var428 < 0 || var428 > 2) {
                                var428 = 0;
                            }
                            class232.field3630 = var428;
                            class135.method985(class42.field581, -105);
                            continue;
                        }
                    } else if (var528 < 5500) {
                        if (var528 == 5400) {
                            var7 -= 2;
                            class182.field2952++;
                            String var351 = class263.field4117[var7];
                            String var352 = class263.field4117[var7 + 1];
                            var6--;
                            int var353 = class15.field242[var6];
                            class183.field2965.method1947((byte) 54, 176);
                            class183.field2965.method81((byte) -105, class159.method1182(var351, arg0 - 19) + class159.method1182(var352, 118) + 1);
                            class183.field2965.method48(128, var351);
                            class183.field2965.method48(128, var352);
                            class183.field2965.method81((byte) -99, var353);
                            continue;
                        }
                        if (var528 == 5401) {
                            var6 -= 2;
                            class240.field3741[class15.field242[var6]] = (short) class194.method1435(-13929, class15.field242[var6 + 1]);
                            class16.method146(6);
                            class202.method1498((byte) 116);
                            class311.method2163(30023);
                            class181.method1332(false);
                            class1.method4(0);
                            continue;
                        }
                        if (var528 == 5405) {
                            var6 -= 2;
                            int var354 = class15.field242[var6];
                            int var355 = class15.field242[var6 + 1];
                            if (var354 >= 0 && var354 < 2) {
                                class83.field1131[var354] = new int[var355 << 1][4];
                            }
                            continue;
                        }
                        if (var528 == 5406) {
                            var6 -= 7;
                            int var356 = class15.field242[var6];
                            int var357 = class15.field242[var6 + 3];
                            int var358 = class15.field242[var6 + 1] << 1;
                            int var359 = class15.field242[var6 + 4];
                            int var360 = class15.field242[var6 + 5];
                            int var361 = class15.field242[var6 + 2];
                            int var362 = class15.field242[var6 + 6];
                            if (var356 >= 0 && var356 < 2 && class83.field1131[var356] != null && var358 >= 0 && class83.field1131[var356].length > var358) {
                                class83.field1131[var356][var358] = new int[] { (class333.method2319(268426691, var361) >> 14) * 128, var357, class333.method2319(var361, 16383) * 128, var362 };
                                class83.field1131[var356][var358 + 1] = new int[] { class333.method2319(16383, var359 >> 14) * 128, var360, class333.method2319(16383, var359) * 128 };
                            }
                            continue;
                        }
                        if (var528 == 5407) {
                            var6--;
                            int var363 = class83.field1131[class15.field242[var6]].length >> 1;
                            class15.field242[var6++] = var363;
                            continue;
                        }
                        if (var528 == 5411) {
                            if (class134.field1966 != null) {
                                class308.method2132(false, (byte) 13, class232.field3630, -1, -1);
                            }
                            if (class184.field2976 == null) {
                                class136.method997(false, class193.method1427(4398), 0);
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var528 == 5419) {
                            String var364 = "";
                            if (class270.field4199 != null) {
                                if (class270.field4199.field1591 == null) {
                                    var364 = class290.method2031(class270.field4199.field1596, -115);
                                } else {
                                    var364 = (String) class270.field4199.field1591;
                                }
                            }
                            class263.field4117[var7++] = var364;
                            continue;
                        }
                        if (var528 == 5420) {
                            class15.field242[var6++] = class137.field2190 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 5421) {
                            if (class134.field1966 != null) {
                                class308.method2132(false, (byte) 13, class232.field3630, -1, -1);
                            }
                            var7--;
                            String var365 = class263.field4117[var7];
                            var6--;
                            boolean var366 = class15.field242[var6] == 1;
                            String var367 = class193.method1427(4398) + var365;
                            if (class184.field2976 != null || var366 && class137.field2190 != 3 && class137.field2193.startsWith("win") && !class298.field4592) {
                                class127.field1852 = var366;
                                class81.field1107 = var367;
                                class91.field1213 = class42.field581.method1026(0, var367);
                                continue;
                            }
                            class136.method997(var366, var367, 0);
                            continue;
                        }
                        if (var528 == 5422) {
                            var7 -= 2;
                            String var368 = class263.field4117[var7 + 1];
                            String var369 = class263.field4117[var7];
                            var6--;
                            int var370 = class15.field242[var6];
                            if (var369.length() > 0) {
                                if (class254.field4027 == null) {
                                    class254.field4027 = new String[class290.field4466[class27.field409]];
                                }
                                class254.field4027[var370] = var369;
                            }
                            if (var368.length() > 0) {
                                if (class2.field20 == null) {
                                    class2.field20 = new String[class290.field4466[class27.field409]];
                                }
                                class2.field20[var370] = var368;
                            }
                            continue;
                        }
                        if (var528 == 5423) {
                            var7--;
                            System.out.println(class263.field4117[var7]);
                            continue;
                        }
                        if (var528 == 5424) {
                            var6 -= 11;
                            class107.field1412 = class15.field242[var6];
                            class282.field4368 = class15.field242[var6 + 1];
                            class335.field5222 = class15.field242[var6 + 2];
                            class294.field4566 = class15.field242[var6 + 3];
                            class167.field2742 = class15.field242[var6 + 4];
                            class153.field2362 = class15.field242[var6 + 5];
                            class5.field61 = class15.field242[var6 + 6];
                            class269.field4177 = class15.field242[var6 + 7];
                            class298.field4594 = class15.field242[var6 + 8];
                            class39.field552 = class15.field242[var6 + 9];
                            class248.field3912 = class15.field242[var6 + 10];
                            class256.field4042.method1837(114, class167.field2742);
                            class256.field4042.method1837(111, class153.field2362);
                            class256.field4042.method1837(arg0 ^ 0x57, class5.field61);
                            class256.field4042.method1837(114, class269.field4177);
                            class256.field4042.method1837(112, class298.field4594);
                            class334.field5196 = true;
                            continue;
                        }
                        if (var528 == 5425) {
                            class210.method1533(false);
                            class334.field5196 = false;
                            continue;
                        }
                        if (var528 == 5426) {
                            var6--;
                            class220.field3491 = class15.field242[var6];
                            continue;
                        }
                        if (var528 == 5427) {
                            var6 -= 2;
                            class3.field32 = class15.field242[var6];
                            class123.field1767 = class15.field242[var6 + 1];
                            continue;
                        }
                        if (var528 == 5428) {
                            var6 -= 2;
                            int var371 = class15.field242[var6];
                            int var372 = class15.field242[var6 + 1];
                            class15.field242[var6++] = class71.method550(false, var371, var372) ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 5600) {
                        if (var528 == 5500) {
                            var6 -= 4;
                            int var373 = class15.field242[var6 + 3];
                            int var374 = class15.field242[var6 + 1];
                            int var375 = class15.field242[var6 + 2];
                            int var376 = class15.field242[var6];
                            class267.method1899(var375, (var376 >> 14 & 0x3FFF) - class326.field5108, var374, var373, arg0 + 90, false, (var376 & 0x3FFF) - class198.field3168);
                            continue;
                        }
                        if (var528 == 5501) {
                            var6 -= 4;
                            int var377 = class15.field242[var6 + 1];
                            int var378 = class15.field242[var6];
                            int var379 = class15.field242[var6 + 2];
                            int var380 = class15.field242[var6 + 3];
                            class294.method2052(((var378 & 0xFFFC5F5) >> 14) - class326.field5108, var379, -4, (var378 & 0x3FFF) - class198.field3168, var380, var377);
                            continue;
                        }
                        if (var528 == 5502) {
                            var6 -= 6;
                            int var381 = class15.field242[var6];
                            if (var381 >= 2) {
                                throw new RuntimeException();
                            }
                            class185.field3006 = var381;
                            int var382 = class15.field242[var6 + 1];
                            if ((var382 + 1) >= (class83.field1131[class185.field3006].length >> 1)) {
                                throw new RuntimeException();
                            }
                            class229.field3587 = 0;
                            class265.field4148 = var382;
                            class283.field4389 = class15.field242[var6 + 2];
                            class265.field4144 = class15.field242[var6 + 3];
                            int var383 = class15.field242[var6 + 4];
                            if (var383 >= 2) {
                                throw new RuntimeException();
                            }
                            class255.field4035 = var383;
                            int var384 = class15.field242[var6 + 5];
                            if ((class83.field1131[class255.field4035].length >> 1) <= (var384 + 1)) {
                                throw new RuntimeException();
                            }
                            class166.field2715 = 3;
                            class153.field2360 = var384;
                            continue;
                        }
                        if (var528 == 5503) {
                            class214.method1565(1);
                            continue;
                        }
                        if (var528 == 5504) {
                            var6 -= 2;
                            class286.method2020(class15.field242[var6 + 1], true, class15.field242[var6]);
                            continue;
                        }
                        if (var528 == 5505) {
                            class15.field242[var6++] = (int) class6.field114;
                            continue;
                        }
                        if (var528 == 5506) {
                            class15.field242[var6++] = (int) class45.field604;
                            continue;
                        }
                        if (var528 == 5507) {
                            class14.method135((byte) 64);
                            continue;
                        }
                        if (var528 == 5508) {
                            class265.method1894(true);
                            continue;
                        }
                        if (var528 == 5509) {
                            class7.method97((byte) 46);
                            continue;
                        }
                        if (var528 == 5510) {
                            class245.method1759(104);
                            continue;
                        }
                        if (var528 == 5512) {
                            class304.method2110(arg0 + 122);
                            continue;
                        }
                    } else if (var528 < 5700) {
                        if (var528 == 5600) {
                            var7 -= 2;
                            var6--;
                            int var385 = class15.field242[var6];
                            String var386 = class263.field4117[var7];
                            String var387 = class263.field4117[var7 + 1];
                            if (class105.field1388 == 10 && class308.field4800 == 0 && class124.field1797 == 0 && class52.field665 == 0 && class14.field221 == 0) {
                                class253.method1832(var386, (byte) -118, var387, var385);
                            }
                            continue;
                        }
                        if (var528 == 5601) {
                            class332.method2315(0);
                            continue;
                        }
                        if (var528 == 5602) {
                            if (class124.field1797 == 0) {
                                class91.field1216 = -2;
                            }
                            continue;
                        }
                        if (var528 == 5603) {
                            var6 -= 4;
                            if (class105.field1388 == 10 && class308.field4800 == 0 && class124.field1797 == 0 && class52.field665 == 0 && class14.field221 == 0) {
                                class187.method1376(arg0 ^ 0xFFFFFF8A, class15.field242[var6 + 3], class15.field242[var6 + 2], class15.field242[var6 + 1], class15.field242[var6]);
                            }
                            continue;
                        }
                        if (var528 == 5604) {
                            var7--;
                            if (class105.field1388 == 10 && class308.field4800 == 0 && class124.field1797 == 0 && class52.field665 == 0 && class14.field221 == 0) {
                                class244.method1751(arg0 ^ 0xFFFFF300, class83.method608(class263.field4117[var7], (byte) -75));
                            }
                            continue;
                        }
                        if (var528 == 5605) {
                            var6 -= 7;
                            var7 -= 3;
                            if (class105.field1388 == 10 && class308.field4800 == 0 && class124.field1797 == 0 && class52.field665 == 0 && class14.field221 == 0) {
                                class255.method1849(class263.field4117[var7 + 1], class15.field242[var6 + 4] == 1, class15.field242[var6 + 1], class83.method608(class263.field4117[var7], (byte) 56), 124, class15.field242[var6 + 3], class15.field242[var6 + 6] == 1, class263.field4117[var7 + 2], class15.field242[var6], class15.field242[var6 + 2], class15.field242[var6 + 5] == 1);
                            }
                            continue;
                        }
                        if (var528 == 5606) {
                            if (class52.field665 == 0) {
                                class150.field2354 = -2;
                            }
                            continue;
                        }
                        if (var528 == 5607) {
                            class15.field242[var6++] = class91.field1216;
                            continue;
                        }
                        if (var528 == 5608) {
                            class15.field242[var6++] = class81.field1110;
                            continue;
                        }
                        if (var528 == 5609) {
                            class15.field242[var6++] = class150.field2354;
                            continue;
                        }
                        if (var528 == 5610) {
                            for (int var388 = 0; var388 < 5; var388++) {
                                class263.field4117[var7++] = var388 < class339.field5297.length ? class7.method101(class339.field5297[var388], (byte) 94) : "";
                            }
                            class339.field5297 = null;
                            continue;
                        }
                        if (var528 == 5611) {
                            class15.field242[var6++] = class135.field1981;
                            continue;
                        }
                    } else if (var528 < 6100) {
                        if (var528 == 6001) {
                            var6--;
                            int var406 = class15.field242[var6];
                            if (var406 < 1) {
                                var406 = 1;
                            }
                            if (var406 > 4) {
                                var406 = 4;
                            }
                            class326.field5123 = var406;
                            if (!class109.field1458 || !class220.field3482) {
                                if (class326.field5123 == 1) {
                                    class31.method297(0.9F);
                                }
                                if (class326.field5123 == 2) {
                                    class31.method297(0.8F);
                                }
                                if (class326.field5123 == 3) {
                                    class31.method297(0.7F);
                                }
                                if (class326.field5123 == 4) {
                                    class31.method297(0.6F);
                                }
                            }
                            if (class109.field1458) {
                                class113.method806((byte) -46);
                                if (!class220.field3482) {
                                    class197.method1463(-2547);
                                }
                            }
                            class202.method1498((byte) 125);
                            class135.method985(class42.field581, arg0 ^ 0xFFFFFF8E);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6002) {
                            var6--;
                            class80.method590(true, class15.field242[var6] == 1);
                            class101.method703((byte) -13);
                            class197.method1463(-2547);
                            class119.method856(false);
                            class135.method985(class42.field581, -113);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6003) {
                            var6--;
                            class317.field5019 = class15.field242[var6] == 1;
                            class119.method856(false);
                            class135.method985(class42.field581, -109);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6005) {
                            var6--;
                            class99.field1334 = class15.field242[var6] == 1;
                            class197.method1463(arg0 - 2547);
                            class135.method985(class42.field581, -127);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6006) {
                            var6--;
                            class206.field3280 = class15.field242[var6] == 1;
                            ((class57) class31.field466).method459(65535, !class206.field3280);
                            class135.method985(class42.field581, -101);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6007) {
                            var6--;
                            class187.field3018 = class15.field242[var6] == 1;
                            class135.method985(class42.field581, arg0 - 111);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6008) {
                            var6--;
                            class47.field622 = class15.field242[var6] == 1;
                            class135.method985(class42.field581, -101);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6009) {
                            var6--;
                            class14.field240 = class15.field242[var6] == 1;
                            class135.method985(class42.field581, -109);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6010) {
                            var6--;
                            class95.field1259 = class15.field242[var6] == 1;
                            class135.method985(class42.field581, -99);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6011) {
                            var6--;
                            int var407 = class15.field242[var6];
                            if (var407 < 0 || var407 > 2) {
                                var407 = 0;
                            }
                            class27.field399 = var407;
                            class135.method985(class42.field581, -110);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6012) {
                            if (class109.field1458) {
                                class256.method1855(0, -103, 0);
                            }
                            var6--;
                            class220.field3482 = class15.field242[var6] == 1;
                            if (class109.field1458 && class220.field3482) {
                                class31.method297(0.7F);
                            } else {
                                if (class326.field5123 == 1) {
                                    class31.method297(0.9F);
                                }
                                if (class326.field5123 == 2) {
                                    class31.method297(0.8F);
                                }
                                if (class326.field5123 == 3) {
                                    class31.method297(0.7F);
                                }
                                if (class326.field5123 == 4) {
                                    class31.method297(0.6F);
                                }
                            }
                            class197.method1463(-2547);
                            class135.method985(class42.field581, -106);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6014) {
                            var6--;
                            class71.field985 = class15.field242[var6] == 1;
                            if (class109.field1458) {
                                class197.method1463(-2547);
                            }
                            class135.method985(class42.field581, -109);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6015) {
                            var6--;
                            class198.field3163 = class15.field242[var6] == 1;
                            if (class109.field1458) {
                                class113.method806((byte) -46);
                            }
                            class135.method985(class42.field581, arg0 - 119);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6016) {
                            var6--;
                            int var408 = class15.field242[var6];
                            if (var408 < 0 || var408 > 2) {
                                var408 = 0;
                            }
                            class196.field3127 = var408;
                            if (class109.field1458) {
                                class333.field5183 = true;
                            }
                            continue;
                        }
                        if (var528 == 6017) {
                            var6--;
                            class86.field1164 = class15.field242[var6] == 1;
                            class281.method1995(arg0 ^ 0x48);
                            class135.method985(class42.field581, -107);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6018) {
                            var6--;
                            int var409 = class15.field242[var6];
                            if (var409 < 0) {
                                var409 = 0;
                            }
                            if (var409 > 127) {
                                var409 = 127;
                            }
                            class144.field2277 = var409;
                            class135.method985(class42.field581, -104);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6019) {
                            var6--;
                            int var410 = class15.field242[var6];
                            if (var410 < 0) {
                                var410 = 0;
                            }
                            if (var410 > 255) {
                                var410 = 255;
                            }
                            if (class204.field3233 != var410) {
                                if (class204.field3233 == 0 && class149.field2331 != -1) {
                                    class76.method573(class149.field2331, var410, -1, false, 0, class249.field3913);
                                    class4.field43 = false;
                                } else if (var410 == 0) {
                                    class144.method1068(arg0 ^ 0xFF);
                                    class4.field43 = false;
                                } else {
                                    class307.method2126(1, var410);
                                }
                                class204.field3233 = var410;
                            }
                            class135.method985(class42.field581, arg0 ^ 0xFFFFFF96);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6020) {
                            var6--;
                            int var411 = class15.field242[var6];
                            if (var411 < 0) {
                                var411 = 0;
                            }
                            if (var411 > 127) {
                                var411 = 127;
                            }
                            class10.field183 = var411;
                            class135.method985(class42.field581, -102);
                            class129.field1892 = false;
                            continue;
                        }
                        if (var528 == 6021) {
                            var6--;
                            class47.field616 = class15.field242[var6] == 1;
                            class119.method856(false);
                            continue;
                        }
                        if (var528 == 6023) {
                            boolean var412 = false;
                            var6--;
                            int var413 = class15.field242[var6];
                            if (var413 < 0) {
                                var413 = 0;
                            }
                            if (var413 > 2) {
                                var413 = 2;
                            }
                            if (class234.field3641 < 96) {
                                var412 = true;
                                var413 = 0;
                            }
                            class151.method1105(var413);
                            class135.method985(class42.field581, -122);
                            class129.field1892 = false;
                            class15.field242[var6++] = var412 ? 0 : 1;
                            continue;
                        }
                        if (var528 == 6024) {
                            var6--;
                            int var414 = class15.field242[var6];
                            if (var414 < 0 || var414 > 2) {
                                var414 = 0;
                            }
                            class48.field635 = var414;
                            class135.method985(class42.field581, arg0 - 99);
                            continue;
                        }
                        if (var528 == 6027) {
                            var6--;
                            int var415 = class15.field242[var6];
                            if (!class109.field1458) {
                                continue;
                            }
                            if (var415 < 0 || var415 > 1) {
                                var415 = 0;
                            }
                            class14.method138((byte) 11, var415 == 1);
                            continue;
                        }
                        if (var528 == 6028) {
                            var6--;
                            class245.field3828 = class15.field242[var6] != 0;
                            class135.method985(class42.field581, -110);
                            continue;
                        }
                    } else if (var528 < 6200) {
                        if (var528 == 6101) {
                            class15.field242[var6++] = class326.field5123;
                            continue;
                        }
                        if (var528 == 6102) {
                            class15.field242[var6++] = class154.method1119((byte) 16) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6103) {
                            class15.field242[var6++] = class317.field5019 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6105) {
                            class15.field242[var6++] = class99.field1334 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6106) {
                            class15.field242[var6++] = class206.field3280 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6107) {
                            class15.field242[var6++] = class187.field3018 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6108) {
                            class15.field242[var6++] = class47.field622 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6109) {
                            class15.field242[var6++] = class14.field240 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6110) {
                            class15.field242[var6++] = class95.field1259 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6111) {
                            class15.field242[var6++] = class27.field399;
                            continue;
                        }
                        if (var528 == 6112) {
                            class15.field242[var6++] = class220.field3482 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6114) {
                            class15.field242[var6++] = class71.field985 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6115) {
                            class15.field242[var6++] = class198.field3163 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6116) {
                            class15.field242[var6++] = class196.field3127;
                            continue;
                        }
                        if (var528 == 6117) {
                            class15.field242[var6++] = class86.field1164 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6118) {
                            class15.field242[var6++] = class144.field2277;
                            continue;
                        }
                        if (var528 == 6119) {
                            class15.field242[var6++] = class204.field3233;
                            continue;
                        }
                        if (var528 == 6120) {
                            class15.field242[var6++] = class10.field183;
                            continue;
                        }
                        if (var528 == 6121) {
                            if (class109.field1458) {
                                class15.field242[var6++] = class109.field1475 ? 1 : 0;
                            } else {
                                class15.field242[var6++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 6123) {
                            class15.field242[var6++] = class151.method1104();
                            continue;
                        }
                        if (var528 == 6124) {
                            class15.field242[var6++] = class48.field635;
                            continue;
                        }
                        if (var528 == 6126) {
                            if (class109.field1458) {
                                class15.field242[var6++] = class189.method1389() ? 1 : 0;
                            } else {
                                class15.field242[var6++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 6127) {
                            class15.field242[var6++] = class163.field2648 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6128) {
                            class15.field242[var6++] = class245.field3828 ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 6300) {
                        if (var528 == 6200) {
                            var6 -= 2;
                            class166.field2737 = (short) class15.field242[var6];
                            if (class166.field2737 <= 0) {
                                class166.field2737 = 256;
                            }
                            class293.field4537 = (short) class15.field242[var6 + 1];
                            if (class293.field4537 <= 0) {
                                class293.field4537 = 205;
                            }
                            continue;
                        }
                        if (var528 == 6201) {
                            var6 -= 2;
                            class113.field1567 = (short) class15.field242[var6];
                            if (class113.field1567 <= 0) {
                                class113.field1567 = 256;
                            }
                            class81.field1112 = (short) class15.field242[var6 + 1];
                            if (class81.field1112 <= 0) {
                                class81.field1112 = 320;
                            }
                            continue;
                        }
                        if (var528 == 6202) {
                            var6 -= 4;
                            class328.field5139 = (short) class15.field242[var6];
                            if (class328.field5139 <= 0) {
                                class328.field5139 = 1;
                            }
                            class51.field650 = (short) class15.field242[var6 + 1];
                            if (class51.field650 <= 0) {
                                class51.field650 = 32767;
                            } else if (class51.field650 < class328.field5139) {
                                class51.field650 = class328.field5139;
                            }
                            class286.field4420 = (short) class15.field242[var6 + 2];
                            if (class286.field4420 <= 0) {
                                class286.field4420 = 1;
                            }
                            class25.field379 = (short) class15.field242[var6 + 3];
                            if (class25.field379 <= 0) {
                                class25.field379 = 32767;
                            } else if (class25.field379 < class286.field4420) {
                                class25.field379 = class286.field4420;
                            }
                            continue;
                        }
                        if (var528 == 6203) {
                            class123.method899(0, class30.field450.field2078, 0, false, 0, class30.field450.field2137);
                            class15.field242[var6++] = class72.field1005;
                            class15.field242[var6++] = class270.field4194;
                            continue;
                        }
                        if (var528 == 6204) {
                            class15.field242[var6++] = class113.field1567;
                            class15.field242[var6++] = class81.field1112;
                            continue;
                        }
                        if (var528 == 6205) {
                            class15.field242[var6++] = class166.field2737;
                            class15.field242[var6++] = class293.field4537;
                            continue;
                        }
                    } else if (var528 < 6400) {
                        if (var528 == 6300) {
                            class15.field242[var6++] = (int) (class219.method1609(class4.method16(arg0, -898)) / 60000L);
                            continue;
                        }
                        if (var528 == 6301) {
                            class15.field242[var6++] = (int) (class219.method1609(-898) / 86400000L) - 11745;
                            continue;
                        }
                        if (var528 == 6302) {
                            var6 -= 3;
                            int var389 = class15.field242[var6 + 2];
                            int var390 = class15.field242[var6 + 1];
                            int var391 = class15.field242[var6];
                            class265.field4143.clear();
                            class265.field4143.set(11, 12);
                            class265.field4143.set(var389, var390, var391);
                            class15.field242[var6++] = (int) (class265.field4143.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var528 == 6303) {
                            class265.field4143.clear();
                            class265.field4143.setTime(new Date(class219.method1609(-898)));
                            class15.field242[var6++] = class265.field4143.get(1);
                            continue;
                        }
                        if (var528 == 6304) {
                            boolean var392 = true;
                            var6--;
                            int var393 = class15.field242[var6];
                            if (var393 < 0) {
                                var392 = (var393 + 1) % 4 == 0;
                            } else if (var393 < 1582) {
                                var392 = (var393 % 4) == 0;
                            } else if ((var393 % 4) != 0) {
                                var392 = false;
                            } else if (var393 % 100 != 0) {
                                var392 = true;
                            } else if ((var393 % 400) != 0) {
                                var392 = false;
                            }
                            class15.field242[var6++] = var392 ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 6500) {
                        if (var528 == 6405) {
                            class15.field242[var6++] = class332.method2311((byte) -31) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6406) {
                            class15.field242[var6++] = class130.method965(0) ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 6600) {
                        if (var528 == 6500) {
                            if (class105.field1388 == 10 && class308.field4800 == 0 && class124.field1797 == 0 && class52.field665 == 0) {
                                class15.field242[var6++] = class225.method1657(0) == -1 ? 0 : 1;
                                continue;
                            }
                            class15.field242[var6++] = 1;
                            continue;
                        }
                        if (var528 == 6501) {
                            class187 var394 = class21.method212(arg0 - 16777216);
                            if (var394 == null) {
                                class15.field242[var6++] = -1;
                                class15.field242[var6++] = 0;
                                class263.field4117[var7++] = "";
                                class15.field242[var6++] = 0;
                                class263.field4117[var7++] = "";
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = var394.field3009;
                                class15.field242[var6++] = var394.field1210;
                                class263.field4117[var7++] = var394.field3012;
                                class68 var395 = var394.method1374(0);
                                class15.field242[var6++] = var395.field956;
                                class263.field4117[var7++] = var395.field957;
                                class15.field242[var6++] = var394.field1215;
                            }
                            continue;
                        }
                        if (var528 == 6502) {
                            class187 var396 = class27.method251(false);
                            if (var396 == null) {
                                class15.field242[var6++] = -1;
                                class15.field242[var6++] = 0;
                                class263.field4117[var7++] = "";
                                class15.field242[var6++] = 0;
                                class263.field4117[var7++] = "";
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = var396.field3009;
                                class15.field242[var6++] = var396.field1210;
                                class263.field4117[var7++] = var396.field3012;
                                class68 var397 = var396.method1374(arg0 ^ 0x0);
                                class15.field242[var6++] = var397.field956;
                                class263.field4117[var7++] = var397.field957;
                                class15.field242[var6++] = var396.field1215;
                            }
                            continue;
                        }
                        if (var528 == 6503) {
                            var6--;
                            int var398 = class15.field242[var6];
                            if (class105.field1388 == 10 && class308.field4800 == 0 && class124.field1797 == 0 && class52.field665 == 0) {
                                class15.field242[var6++] = class64.method516(var398, (byte) 86) ? 1 : 0;
                                continue;
                            }
                            class15.field242[var6++] = 0;
                            continue;
                        }
                        if (var528 == 6504) {
                            var6--;
                            class332.field5180 = class15.field242[var6];
                            class135.method985(class42.field581, -114);
                            continue;
                        }
                        if (var528 == 6505) {
                            class15.field242[var6++] = class332.field5180;
                            continue;
                        }
                        if (var528 == 6506) {
                            var6--;
                            int var399 = class15.field242[var6];
                            class187 var400 = class291.method2036(var399, 30725);
                            if (var400 == null) {
                                class15.field242[var6++] = -1;
                                class263.field4117[var7++] = "";
                                class15.field242[var6++] = 0;
                                class263.field4117[var7++] = "";
                                class15.field242[var6++] = 0;
                            } else {
                                class15.field242[var6++] = var400.field1210;
                                class263.field4117[var7++] = var400.field3012;
                                class68 var401 = var400.method1374(0);
                                class15.field242[var6++] = var401.field956;
                                class263.field4117[var7++] = var401.field957;
                                class15.field242[var6++] = var400.field1215;
                            }
                            continue;
                        }
                        if (var528 == 6507) {
                            var6 -= 4;
                            int var402 = class15.field242[var6];
                            boolean var403 = class15.field242[var6 + 1] == 1;
                            int var404 = class15.field242[var6 + 2];
                            boolean var405 = class15.field242[var6 + 3] == 1;
                            class29.method262(var403, arg0 - 117, var402, var404, var405);
                            continue;
                        }
                    } else if (var528 < 6700) {
                        if (var528 == 6600) {
                            var6--;
                            class82.field1124 = class15.field242[var6] == 1;
                            class135.method985(class42.field581, -104);
                            continue;
                        }
                        if (var528 == 6601) {
                            class15.field242[var6++] = class82.field1124 ? 1 : 0;
                            continue;
                        }
                    }
                } else {
                    class136 var503;
                    if (var528 >= 2000) {
                        var6--;
                        var503 = class14.method140(class15.field242[var6], arg0 + 1036508464);
                        var528 -= 1000;
                    } else {
                        var503 = var46 ? class126.field1827 : class76.field1017;
                    }
                    if (var528 == 1300) {
                        var6--;
                        int var504 = class15.field242[var6] - 1;
                        if (var504 >= 0 && var504 <= 9) {
                            var7--;
                            var503.method999(var504, class263.field4117[var7], (byte) -40);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var528 == 1301) {
                        var6 -= 2;
                        int var505 = class15.field242[var6];
                        int var506 = class15.field242[var6 + 1];
                        var503.field2126 = class294.method2048((byte) 87, var505, var506);
                        continue;
                    }
                    if (var528 == 1302) {
                        var6--;
                        var503.field2070 = class15.field242[var6] == 1;
                        continue;
                    }
                    if (var528 == 1303) {
                        var6--;
                        var503.field1989 = class15.field242[var6];
                        continue;
                    }
                    if (var528 == 1304) {
                        var6--;
                        var503.field2114 = class15.field242[var6];
                        continue;
                    }
                    if (var528 == 1305) {
                        var7--;
                        var503.field2035 = class263.field4117[var7];
                        continue;
                    }
                    if (var528 == 1306) {
                        var7--;
                        var503.field2080 = class263.field4117[var7];
                        continue;
                    }
                    if (var528 == 1307) {
                        var503.field2140 = null;
                        continue;
                    }
                    if (var528 == 1308) {
                        var6--;
                        var503.field2103 = class15.field242[var6];
                        var6--;
                        var503.field2037 = class15.field242[var6];
                        continue;
                    }
                    if (var528 == 1309) {
                        var6--;
                        int var507 = class15.field242[var6];
                        var6--;
                        int var508 = class15.field242[var6];
                        if (var508 >= 1 && var508 <= 10) {
                            var503.method1006(var508 - 1, 27, var507);
                        }
                        continue;
                    }
                    if (var528 == 1310) {
                        var7--;
                        var503.field2097 = class263.field4117[var7];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var527) {
            if (var5.field5235 == null) {
                if (class6.field109 != 0) {
                    class131.method971("", (byte) -32, 0, "Clientscript error - check log for details");
                }
                client.method949("CS2 - scr:" + var5.field4430 + " op:" + var10, var527, arg0 ^ 0x18);
            } else {
                StringBuffer var524 = new StringBuffer(30);
                var524.append("%0a - in: ").append(var5.field5235);
                for (int var525 = class302.field4639 - 1; var525 >= 0; var525--) {
                    var524.append("%0a - via: ").append(class344.field5347[var525].field522.field5235);
                }
                if (var10 == 40) {
                    int var526 = var11[var8];
                    var524.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var526));
                }
                if (class6.field109 != 0) {
                    class131.method971("", (byte) -32, 0, "Clientscript error in: " + var5.field5235);
                }
                client.method949("CS2 - scr:" + var5.field4430 + " op:" + var10 + var524.toString(), var527, 24);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I", line = 6566)
    public final int[] method103(int arg0, int arg1) {
        field4397++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            class54.method425(var3, 0, class166.field2731, this.field4396);
        }
        if (arg0 >= -25) {
            field4403 = (class337[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)I", line = 6593)
    public static final int method2012(int arg0, int arg1) {
        int var2 = arg1 & 0x3F;
        field4398++;
        int var3 = (arg1 & 0xEC) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return arg0 < 96 ? -124 : 0;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(I)V", line = 6673)
    public class284(int arg0) {
        super(0, true);
        this.field4396 = 4096;
        this.field4396 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 6645)
    public static void method2013(int arg0) {
        if (arg0 != 2) {
            field4399 = 11;
        }
        field4403 = null;
        field4394 = null;
        field4402 = (int[][]) null;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(II)I", line = 6659)
    public static final int method2014(int arg0, int arg1) {
        field4393++;
        if (arg1 != -508020886) {
            method2013(77);
        }
        return arg0 >>> 10;
    }
}
