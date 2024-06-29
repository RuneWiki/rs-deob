import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class214 {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    private int field4077 = -1;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    private int field4081 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lpi;")
    private class158 field4073 = new class158();

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Z")
    public boolean field4093 = false;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    private int field4086;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    private int field4083;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "[[[I")
    private int[][][] field4091;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[Lhb;")
    private class72[] field4075;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lob;")
    public static class141 field4076 = class175.method1195(40, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lob;")
    public static class141 field4079 = class175.method1195(40, "weiss:");

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4084 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4074 = 2;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lae;")
    public static class6 field4088 = new class6(5000);

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "[I")
    public static int[] field4092 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lca;")
    public static class22 field4078;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public final void method1393(boolean arg0) {
        field4082++;
        int var2 = 0;
        if (arg0) {
            return;
        }
        while (var2 < this.field4083) {
            this.field4091[var2][0] = null;
            this.field4091[var2][1] = null;
            this.field4091[var2][2] = null;
            this.field4091[var2] = null;
            var2++;
        }
        this.field4075 = null;
        this.field4091 = null;
        this.field4073.method1102(90);
        this.field4073 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1394(int arg0) {
        field4080++;
        if (arg0 != 9924) {
            field4084 = -62;
        }
        if (this.field4086 != this.field4083) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4083; var2++) {
            this.field4075[var2] = class165.field3186;
        }
        return this.field4091;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method1395(byte arg0) {
        if (arg0 != -83) {
            method1395((byte) -121);
        }
        field4079 = null;
        field4078 = null;
        field4076 = null;
        field4092 = null;
        field4088 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1396(int arg0, byte arg1) {
        if (arg1 != 45) {
            this.field4091 = null;
        }
        field4087++;
        if (this.field4086 == this.field4083) {
            this.field4093 = this.field4075[arg0] == null;
            this.field4075[arg0] = class165.field3186;
            return this.field4091[arg0];
        } else if (this.field4083 == 1) {
            this.field4093 = this.field4077 != arg0;
            this.field4077 = arg0;
            return this.field4091[0];
        } else {
            class72 var3 = this.field4075[arg0];
            if (var3 == null) {
                this.field4093 = true;
                if (this.field4083 > this.field4081) {
                    var3 = new class72(arg0, this.field4081);
                    this.field4081++;
                } else {
                    class72 var4 = (class72) this.field4073.method1104(44);
                    var3 = new class72(arg0, var4.field1440);
                    this.field4075[var4.field1443] = null;
                    var4.method1392(128);
                }
                this.field4075[arg0] = var3;
            } else {
                this.field4093 = false;
            }
            this.field4073.method1100(var3, true);
            return this.field4091[var3.field1440];
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lwc;II)V")
    public static final void method1397(class220 arg0, int arg1, int arg2) {
        field4089++;
        Object[] var3 = arg0.field4177;
        int var4 = (Integer) var3[0];
        class147 var5 = class157.method1095(false, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        if (arg2 != 26186) {
            return;
        }
        int[] var7 = var5.field2874;
        class126.field2422 = 0;
        int[] var8 = var5.field2869;
        int var9 = -1;
        byte var10 = -1;
        int var11 = 0;
        try {
            class90.field1788 = new int[var5.field2872];
            class167.field3224 = new class141[var5.field2866];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field4161;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field4162;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field4168 == null ? -1 : arg0.field4168.field3396;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field4164;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field4168 == null ? -1 : arg0.field4168.field3357;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field4166 == null ? -1 : arg0.field4166.field3396;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field4166 == null ? -1 : arg0.field4166.field3357;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field4155;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field4156;
                    }
                    class90.field1788[var12++] = var16;
                } else if (var3[var14] instanceof class141) {
                    class141 var15 = (class141) var3[var14];
                    if (var15.method922((byte) 42, class113.field2173)) {
                        var15 = arg0.field4154;
                    }
                    class167.field3224[var13++] = var15;
                }
            }
            int var17 = 0;
            label2234: while (true) {
                var17++;
                if (arg1 < var17) {
                    throw new RuntimeException("slow");
                }
                var9++;
                int var320 = var7[var9];
                if (var320 < 100) {
                    if (var320 == 0) {
                        class223.field4220[var11++] = var8[var9];
                        continue;
                    }
                    if (var320 == 1) {
                        int var18 = var8[var9];
                        class223.field4220[var11++] = class180.field3538[var18];
                        continue;
                    }
                    if (var320 == 2) {
                        int var19 = var8[var9];
                        var11--;
                        class180.field3538[var19] = class223.field4220[var11];
                        continue;
                    }
                    if (var320 == 3) {
                        class135.field2577[var6++] = var5.field2873[var9];
                        continue;
                    }
                    if (var320 == 6) {
                        var9 += var8[var9];
                        continue;
                    }
                    if (var320 == 7) {
                        var11 -= 2;
                        if (class223.field4220[var11 + 1] != class223.field4220[var11]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var320 == 8) {
                        var11 -= 2;
                        if (class223.field4220[var11 + 1] == class223.field4220[var11]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var320 == 9) {
                        var11 -= 2;
                        if (class223.field4220[var11] < class223.field4220[var11 + 1]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var320 == 10) {
                        var11 -= 2;
                        if (class223.field4220[var11] > class223.field4220[var11 + 1]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var320 == 21) {
                        if (class126.field2422 == 0) {
                            return;
                        }
                        class118 var20 = class181.field3556[--class126.field2422];
                        var9 = var20.field2289;
                        class90.field1788 = var20.field2304;
                        class167.field3224 = var20.field2306;
                        var5 = var20.field2299;
                        var7 = var5.field2874;
                        var8 = var5.field2869;
                        continue;
                    }
                    if (var320 == 25) {
                        int var21 = var8[var9];
                        class223.field4220[var11++] = class7.method53(var21, -106);
                        continue;
                    }
                    if (var320 == 27) {
                        int var22 = var8[var9];
                        var11--;
                        class88.method602(class223.field4220[var11], var22, 23207);
                        continue;
                    }
                    if (var320 == 31) {
                        var11 -= 2;
                        if (class223.field4220[var11] <= class223.field4220[var11 + 1]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var320 == 32) {
                        var11 -= 2;
                        if (class223.field4220[var11 + 1] <= class223.field4220[var11]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var320 == 33) {
                        class223.field4220[var11++] = class90.field1788[var8[var9]];
                        continue;
                    }
                    int var10001;
                    if (var320 == 34) {
                        var10001 = var8[var9];
                        var11--;
                        class90.field1788[var10001] = class223.field4220[var11];
                        continue;
                    }
                    if (var320 == 35) {
                        class135.field2577[var6++] = class167.field3224[var8[var9]];
                        continue;
                    }
                    if (var320 == 36) {
                        var10001 = var8[var9];
                        var6--;
                        class167.field3224[var10001] = class135.field2577[var6];
                        continue;
                    }
                    if (var320 == 37) {
                        int var23 = var8[var9];
                        var6 -= var23;
                        class141 var24 = class20.method123(-71, var6, var23, class135.field2577);
                        class135.field2577[var6++] = var24;
                        continue;
                    }
                    if (var320 == 38) {
                        var11--;
                        continue;
                    }
                    if (var320 == 39) {
                        var6--;
                        continue;
                    }
                    if (var320 == 40) {
                        int var25 = var8[var9];
                        class147 var26 = class157.method1095(false, var25);
                        int[] var27 = new int[var26.field2872];
                        class141[] var28 = new class141[var26.field2866];
                        for (int var29 = 0; var29 < var26.field2877; var29++) {
                            var27[var29] = class223.field4220[var11 + var29 - var26.field2877];
                        }
                        for (int var30 = 0; var30 < var26.field2878; var30++) {
                            var28[var30] = class135.field2577[var30 + var6 - var26.field2878];
                        }
                        var6 -= var26.field2878;
                        var11 -= var26.field2877;
                        class118 var31 = new class118();
                        var31.field2304 = class90.field1788;
                        var31.field2289 = var9;
                        var31.field2299 = var5;
                        var31.field2306 = class167.field3224;
                        if (class181.field3556.length <= class126.field2422) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        var9 = -1;
                        class181.field3556[class126.field2422++] = var31;
                        var7 = var26.field2874;
                        var8 = var26.field2869;
                        class167.field3224 = var28;
                        class90.field1788 = var27;
                        continue;
                    }
                    if (var320 == 42) {
                        class223.field4220[var11++] = class11.field229[var8[var9]];
                        continue;
                    }
                    if (var320 == 43) {
                        var10001 = var8[var9];
                        var11--;
                        class11.field229[var10001] = class223.field4220[var11];
                        continue;
                    }
                    if (var320 == 44) {
                        int var32 = var8[var9] & 0xFFFF;
                        int var33 = var8[var9] >> 16;
                        var11--;
                        int var34 = class223.field4220[var11];
                        if (var34 >= 0 && var34 <= 5000) {
                            class212.field4044[var33] = var34;
                            byte var35 = -1;
                            if (var32 == 105) {
                                var35 = 0;
                            }
                            int var36 = 0;
                            while (true) {
                                if (var36 >= var34) {
                                    continue label2234;
                                }
                                class195.field3734[var33][var36] = var35;
                                var36++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var320 == 45) {
                        int var37 = var8[var9];
                        var11--;
                        int var38 = class223.field4220[var11];
                        if (var38 >= 0 && class212.field4044[var37] > var38) {
                            class223.field4220[var11++] = class195.field3734[var37][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var320 == 46) {
                        var11 -= 2;
                        int var39 = class223.field4220[var11];
                        int var40 = var8[var9];
                        if (var39 >= 0 && class212.field4044[var40] > var39) {
                            class195.field3734[var40][var39] = class223.field4220[var11 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var320 == 47) {
                        class141 var41 = class3.field35[var8[var9]];
                        if (var41 == null) {
                            var41 = class82.field1639;
                        }
                        class135.field2577[var6++] = var41;
                        continue;
                    }
                    if (var320 == 48) {
                        var10001 = var8[var9];
                        var6--;
                        class3.field35[var10001] = class135.field2577[var6];
                        continue;
                    }
                    if (var320 == 51) {
                        class123 var42 = var5.field2870[var8[var9]];
                        var11--;
                        class110 var43 = (class110) var42.method792((long) class223.field4220[var11], 22346);
                        if (var43 != null) {
                            var9 += var43.field2114;
                        }
                        continue;
                    }
                }
                boolean var44;
                if (var8[var9] == 1) {
                    var44 = true;
                } else {
                    var44 = false;
                }
                if (var320 < 300) {
                    if (var320 == 100) {
                        var11 -= 3;
                        int var300 = class223.field4220[var11];
                        int var301 = class223.field4220[var11 + 1];
                        int var302 = class223.field4220[var11 + 2];
                        if (var301 == 0) {
                            throw new RuntimeException();
                        }
                        class170 var303 = class192.method1268(var300, -61);
                        if (var303.field3337 == null) {
                            var303.field3337 = new class170[var302 + 1];
                        }
                        if (var303.field3337.length <= var302) {
                            class170[] var304 = new class170[var302 + 1];
                            for (int var305 = 0; var305 < var303.field3337.length; var305++) {
                                var304[var305] = var303.field3337[var305];
                            }
                            var303.field3337 = var304;
                        }
                        if (var302 > 0 && var303.field3337[var302 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var302 - 1));
                        }
                        class170 var306 = new class170();
                        var306.field3305 = true;
                        var306.field3357 = var302;
                        var306.field3392 = var301;
                        var306.field3400 = var306.field3396 = var303.field3396;
                        var303.field3337[var302] = var306;
                        if (var44) {
                            class144.field2777 = var306;
                        } else {
                            class63.field1241 = var306;
                        }
                        class38.method252(var303, -83);
                        continue;
                    }
                    if (var320 == 101) {
                        class170 var307 = var44 ? class144.field2777 : class63.field1241;
                        if (var307.field3357 == -1) {
                            if (!var44) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class170 var308 = class192.method1268(var307.field3396, -47);
                        var308.field3337[var307.field3357] = null;
                        class38.method252(var308, arg2 - 26303);
                        continue;
                    }
                    if (var320 == 102) {
                        var11--;
                        class170 var309 = class192.method1268(class223.field4220[var11], arg2 ^ 0xFFFF99F9);
                        var309.field3337 = null;
                        class38.method252(var309, arg2 - 26280);
                        continue;
                    }
                    if (var320 == 200) {
                        var11 -= 2;
                        int var310 = class223.field4220[var11 + 1];
                        int var311 = class223.field4220[var11];
                        class170 var312 = class204.method1352(var310, (byte) 56, var311);
                        if (var312 != null && var310 != -1) {
                            class223.field4220[var11++] = 1;
                            if (var44) {
                                class144.field2777 = var312;
                            } else {
                                class63.field1241 = var312;
                            }
                            continue;
                        }
                        class223.field4220[var11++] = 0;
                        continue;
                    }
                    if (var320 == 201) {
                        var11--;
                        int var313 = class223.field4220[var11];
                        class170 var314 = class192.method1268(var313, -84);
                        if (var314 == null) {
                            class223.field4220[var11++] = 0;
                        } else {
                            class223.field4220[var11++] = 1;
                            if (var44) {
                                class144.field2777 = var314;
                            } else {
                                class63.field1241 = var314;
                            }
                        }
                        continue;
                    }
                } else if (var320 < 500) {
                    if (var320 == 403) {
                        var11 -= 2;
                        int var45 = class223.field4220[var11];
                        if (var45 >= 7) {
                            var45 -= 7;
                        }
                        int var46 = class223.field4220[var11 + 1];
                        class114.field2176.field765.method504(var46, var45, 127);
                        continue;
                    }
                    if (var320 == 404) {
                        var11 -= 2;
                        int var47 = class223.field4220[var11 + 1];
                        int var48 = class223.field4220[var11];
                        class114.field2176.field765.method513(84, var47, var48);
                        continue;
                    }
                    if (var320 == 410) {
                        var11--;
                        boolean var49 = class223.field4220[var11] != 0;
                        class114.field2176.field765.method510((byte) 123, var49);
                        continue;
                    }
                } else if (var320 >= 1000 && var320 < 1100 || !(var320 < 2000 || var320 >= 2100)) {
                    class170 var298;
                    if (var320 >= 2000) {
                        var320 -= 1000;
                        var11--;
                        var298 = class192.method1268(class223.field4220[var11], -79);
                    } else {
                        var298 = var44 ? class144.field2777 : class63.field1241;
                    }
                    if (var320 == 1000) {
                        var11 -= 2;
                        var298.field3353 = class223.field4220[var11];
                        var298.field3372 = class223.field4220[var11 + 1];
                        class38.method252(var298, -104);
                        continue;
                    }
                    if (var320 == 1001) {
                        var11 -= 2;
                        var298.field3299 = class223.field4220[var11];
                        var298.field3284 = class223.field4220[var11 + 1];
                        class38.method252(var298, -108);
                        continue;
                    }
                    if (var320 == 1003) {
                        var11--;
                        boolean var299 = class223.field4220[var11] == 1;
                        if (var298.field3292 != var299) {
                            var298.field3292 = var299;
                            class38.method252(var298, -126);
                        }
                        continue;
                    }
                } else if (var320 >= 1100 && var320 < 1200 || var320 >= 2100 && var320 < 2200) {
                    class170 var295;
                    if (var320 < 2000) {
                        var295 = var44 ? class144.field2777 : class63.field1241;
                    } else {
                        var11--;
                        var295 = class192.method1268(class223.field4220[var11], -81);
                        var320 -= 1000;
                    }
                    if (var320 == 1100) {
                        var11 -= 2;
                        var295.field3346 = class223.field4220[var11];
                        if (var295.field3346 > var295.field3377 - var295.field3299) {
                            var295.field3346 = var295.field3377 - var295.field3299;
                        }
                        if (var295.field3346 < 0) {
                            var295.field3346 = 0;
                        }
                        var295.field3383 = class223.field4220[var11 + 1];
                        if (var295.field3383 > var295.field3316 - var295.field3284) {
                            var295.field3383 = var295.field3316 - var295.field3284;
                        }
                        if (var295.field3383 < 0) {
                            var295.field3383 = 0;
                        }
                        class38.method252(var295, arg2 ^ 0xFFFF99D7);
                        continue;
                    }
                    if (var320 == 1101) {
                        var11--;
                        var295.field3301 = class223.field4220[var11];
                        class38.method252(var295, -86);
                        continue;
                    }
                    if (var320 == 1102) {
                        var11--;
                        var295.field3318 = class223.field4220[var11] == 1;
                        class38.method252(var295, -108);
                        continue;
                    }
                    if (var320 == 1103) {
                        var11--;
                        var295.field3324 = class223.field4220[var11];
                        class38.method252(var295, arg2 ^ 0xFFFF99EE);
                        continue;
                    }
                    if (var320 == 1104) {
                        var11--;
                        var295.field3336 = class223.field4220[var11];
                        class38.method252(var295, -112);
                        continue;
                    }
                    if (var320 == 1105) {
                        var11--;
                        var295.field3264 = class223.field4220[var11];
                        class38.method252(var295, arg2 - 26291);
                        continue;
                    }
                    if (var320 == 1106) {
                        var11--;
                        var295.field3312 = class223.field4220[var11];
                        class38.method252(var295, -80);
                        continue;
                    }
                    if (var320 == 1107) {
                        var11--;
                        var295.field3279 = class223.field4220[var11] == 1;
                        class38.method252(var295, -98);
                        continue;
                    }
                    if (var320 == 1108) {
                        var295.field3315 = 1;
                        var11--;
                        var295.field3327 = class223.field4220[var11];
                        class38.method252(var295, -96);
                        continue;
                    }
                    if (var320 == 1109) {
                        var11 -= 6;
                        var295.field3323 = class223.field4220[var11];
                        var295.field3405 = class223.field4220[var11 + 1];
                        var295.field3272 = class223.field4220[var11 + 2];
                        var295.field3306 = class223.field4220[var11 + 3];
                        var295.field3381 = class223.field4220[var11 + 4];
                        var295.field3290 = class223.field4220[var11 + 5];
                        class38.method252(var295, -107);
                        continue;
                    }
                    if (var320 == 1110) {
                        var11--;
                        int var296 = class223.field4220[var11];
                        if (var295.field3379 != var296) {
                            var295.field3406 = 0;
                            var295.field3345 = 0;
                            var295.field3379 = var296;
                            class38.method252(var295, -121);
                        }
                        continue;
                    }
                    if (var320 == 1111) {
                        var11--;
                        var295.field3269 = class223.field4220[var11] == 1;
                        class38.method252(var295, arg2 ^ 0xFFFF99DB);
                        continue;
                    }
                    if (var320 == 1112) {
                        var6--;
                        class141 var297 = class135.field2577[var6];
                        if (!var297.method922((byte) 63, var295.field3325)) {
                            var295.field3325 = var297;
                            class38.method252(var295, -110);
                        }
                        continue;
                    }
                    if (var320 == 1113) {
                        var11--;
                        var295.field3390 = class223.field4220[var11];
                        class38.method252(var295, -121);
                        continue;
                    }
                    if (var320 == 1114) {
                        var11 -= 3;
                        var295.field3297 = class223.field4220[var11];
                        var295.field3338 = class223.field4220[var11 + 1];
                        var295.field3266 = class223.field4220[var11 + 2];
                        class38.method252(var295, -123);
                        continue;
                    }
                    if (var320 == 1115) {
                        var11--;
                        var295.field3262 = class223.field4220[var11] == 1;
                        class38.method252(var295, -83);
                        continue;
                    }
                    if (var320 == 1116) {
                        var11--;
                        var295.field3366 = class223.field4220[var11];
                        class38.method252(var295, -103);
                        continue;
                    }
                    if (var320 == 1117) {
                        var11--;
                        var295.field3278 = class223.field4220[var11];
                        class38.method252(var295, -105);
                        continue;
                    }
                    if (var320 == 1118) {
                        var11--;
                        var295.field3303 = class223.field4220[var11] == 1;
                        class38.method252(var295, -96);
                        continue;
                    }
                    if (var320 == 1119) {
                        var11--;
                        var295.field3393 = class223.field4220[var11] == 1;
                        class38.method252(var295, -84);
                        continue;
                    }
                    if (var320 == 1120) {
                        var11 -= 2;
                        var295.field3377 = class223.field4220[var11];
                        var295.field3316 = class223.field4220[var11 + 1];
                        class38.method252(var295, -105);
                        continue;
                    }
                } else if (var320 >= 1200 && var320 < 1300 || var320 >= 2200 && var320 < 2300) {
                    class170 var291;
                    if (var320 >= 2000) {
                        var320 -= 1000;
                        var11--;
                        var291 = class192.method1268(class223.field4220[var11], arg2 - 26293);
                    } else {
                        var291 = var44 ? class144.field2777 : class63.field1241;
                    }
                    class38.method252(var291, -95);
                    if (var320 == 1200) {
                        var11 -= 2;
                        int var292 = class223.field4220[var11];
                        int var293 = class223.field4220[var11 + 1];
                        if (var292 == -1) {
                            var291.field3359 = -1;
                            var291.field3327 = -1;
                            var291.field3315 = 1;
                        } else {
                            var291.field3402 = var293;
                            var291.field3359 = var292;
                            class50 var294 = class96.method645((byte) -61, var292);
                            var291.field3323 = var294.field967;
                            var291.field3381 = var294.field972;
                            var291.field3306 = var294.field959;
                            var291.field3272 = var294.field970;
                            var291.field3405 = var294.field936;
                            var291.field3290 = var294.field934;
                            if (var291.field3299 > 0) {
                                var291.field3290 = var291.field3290 * 32 / var291.field3299;
                            }
                        }
                        continue;
                    }
                    if (var320 == 1201) {
                        var291.field3315 = 2;
                        var11--;
                        var291.field3327 = class223.field4220[var11];
                        continue;
                    }
                    if (var320 == 1202) {
                        var291.field3315 = 3;
                        var291.field3327 = class114.field2176.field765.method507(24295);
                        continue;
                    }
                    if (var320 == 1203) {
                        var291.field3315 = 6;
                        var11--;
                        var291.field3327 = class223.field4220[var11];
                        continue;
                    }
                    if (var320 == 1204) {
                        var291.field3315 = 5;
                        var11--;
                        var291.field3327 = class223.field4220[var11];
                        continue;
                    }
                } else if ((var320 < 1300 || var320 >= 1400) && (var320 < 2300 || var320 >= 2400)) {
                    if (var320 >= 1400 && var320 < 1500 || var320 >= 2400 && var320 < 2500) {
                        class170 var284;
                        if (var320 >= 2000) {
                            var320 -= 1000;
                            var11--;
                            var284 = class192.method1268(class223.field4220[var11], -53);
                        } else {
                            var284 = var44 ? class144.field2777 : class63.field1241;
                        }
                        int[] var285 = null;
                        var6--;
                        class141 var286 = class135.field2577[var6];
                        if (var286.method908(false) > 0 && var286.method900(arg2 - 26060, var286.method908(false) + -1) == 89) {
                            var11--;
                            int var287 = class223.field4220[var11];
                            if (var287 > 0) {
                                var285 = new int[var287];
                                while (var287-- > 0) {
                                    var11--;
                                    var285[var287] = class223.field4220[var11];
                                }
                            }
                            var286 = var286.method902(var286.method908(false) - 1, 0, (byte) 62);
                        }
                        Object[] var288 = new Object[var286.method908(false) + 1];
                        for (int var289 = var288.length - 1; var289 >= 1; var289--) {
                            if (var286.method900(arg2 ^ 0x6635, var289 - 1) == 115) {
                                var6--;
                                var288[var289] = class135.field2577[var6];
                            } else {
                                var11--;
                                var288[var289] = Integer.valueOf(class223.field4220[var11]);
                            }
                        }
                        var11--;
                        int var290 = class223.field4220[var11];
                        if (var290 == -1) {
                            var288 = null;
                        } else {
                            var288[0] = Integer.valueOf(var290);
                        }
                        if (var320 == 1425) {
                            var284.field3399 = var288;
                        }
                        if (var320 == 1411) {
                            var284.field3280 = var288;
                        }
                        if (var320 == 1419) {
                            var284.field3291 = var288;
                        }
                        if (var320 == 1412) {
                            var284.field3389 = var288;
                        }
                        if (var320 == 1400) {
                            var284.field3322 = var288;
                        }
                        if (var320 == 1415) {
                            var284.field3326 = var285;
                            var284.field3329 = var288;
                        }
                        if (var320 == 1422) {
                            var284.field3369 = var288;
                        }
                        if (var320 == 1417) {
                            var284.field3360 = var288;
                        }
                        if (var320 == 1418) {
                            var284.field3334 = var288;
                        }
                        if (var320 == 1402) {
                            var284.field3398 = var288;
                        }
                        if (var320 == 1421) {
                            var284.field3308 = var288;
                        }
                        if (var320 == 1407) {
                            var284.field3273 = var285;
                            var284.field3335 = var288;
                        }
                        if (var320 == 1405) {
                            var284.field3271 = var288;
                        }
                        if (var320 == 1409) {
                            var284.field3288 = var288;
                        }
                        if (var320 == 1424) {
                            var284.field3376 = var288;
                        }
                        var284.field3361 = true;
                        if (var320 == 1414) {
                            var284.field3304 = var285;
                            var284.field3365 = var288;
                        }
                        if (var320 == 1416) {
                            var284.field3349 = var288;
                        }
                        if (var320 == 1423) {
                            var284.field3310 = var288;
                        }
                        if (var320 == 1408) {
                            var284.field3311 = var288;
                        }
                        if (var320 == 1406) {
                            var284.field3343 = var288;
                        }
                        if (var320 == 1401) {
                            var284.field3294 = var288;
                        }
                        if (var320 == 1404) {
                            var284.field3293 = var288;
                        }
                        if (var320 == 1420) {
                            var284.field3368 = var288;
                        }
                        if (var320 == 1410) {
                            var284.field3263 = var288;
                        }
                        if (var320 == 1403) {
                            var284.field3286 = var288;
                        }
                        continue;
                    }
                    if (var320 < 1600) {
                        class170 var283 = var44 ? class144.field2777 : class63.field1241;
                        if (var320 == 1500) {
                            class223.field4220[var11++] = var283.field3353;
                            continue;
                        }
                        if (var320 == 1501) {
                            class223.field4220[var11++] = var283.field3372;
                            continue;
                        }
                        if (var320 == 1502) {
                            class223.field4220[var11++] = var283.field3299;
                            continue;
                        }
                        if (var320 == 1503) {
                            class223.field4220[var11++] = var283.field3284;
                            continue;
                        }
                        if (var320 == 1504) {
                            class223.field4220[var11++] = var283.field3292 ? 1 : 0;
                            continue;
                        }
                        if (var320 == 1505) {
                            class223.field4220[var11++] = var283.field3400;
                            continue;
                        }
                    } else if (var320 < 1700) {
                        class170 var282 = var44 ? class144.field2777 : class63.field1241;
                        if (var320 == 1600) {
                            class223.field4220[var11++] = var282.field3346;
                            continue;
                        }
                        if (var320 == 1601) {
                            class223.field4220[var11++] = var282.field3383;
                            continue;
                        }
                        if (var320 == 1602) {
                            class135.field2577[var6++] = var282.field3325;
                            continue;
                        }
                        if (var320 == 1603) {
                            class223.field4220[var11++] = var282.field3377;
                            continue;
                        }
                        if (var320 == 1604) {
                            class223.field4220[var11++] = var282.field3316;
                            continue;
                        }
                        if (var320 == 1605) {
                            class223.field4220[var11++] = var282.field3290;
                            continue;
                        }
                        if (var320 == 1606) {
                            class223.field4220[var11++] = var282.field3272;
                            continue;
                        }
                        if (var320 == 1607) {
                            class223.field4220[var11++] = var282.field3381;
                            continue;
                        }
                        if (var320 == 1608) {
                            class223.field4220[var11++] = var282.field3306;
                            continue;
                        }
                        if (var320 == 1609) {
                            class223.field4220[var11++] = var282.field3324;
                            continue;
                        }
                    } else if (var320 < 1800) {
                        class170 var54 = var44 ? class144.field2777 : class63.field1241;
                        if (var320 == 1700) {
                            class223.field4220[var11++] = var54.field3359;
                            continue;
                        }
                        if (var320 == 1701) {
                            if (var54.field3359 == -1) {
                                class223.field4220[var11++] = 0;
                            } else {
                                class223.field4220[var11++] = var54.field3402;
                            }
                            continue;
                        }
                        if (var320 == 1702) {
                            class223.field4220[var11++] = var54.field3357;
                            continue;
                        }
                    } else if (var320 < 1900) {
                        class170 var280 = var44 ? class144.field2777 : class63.field1241;
                        if (var320 == 1800) {
                            class223.field4220[var11++] = class54.method365(class26.method180(var280, arg2 - 8061), false);
                            continue;
                        }
                        if (var320 == 1801) {
                            var11--;
                            int var281 = class223.field4220[var11];
                            int var322 = var281 - 1;
                            if (var280.field3404 != null && var322 < var280.field3404.length && var280.field3404[var322] != null) {
                                class135.field2577[var6++] = var280.field3404[var322];
                                continue;
                            }
                            class135.field2577[var6++] = class131.field2500;
                            continue;
                        }
                        if (var320 == 1802) {
                            if (var280.field3352 == null) {
                                class135.field2577[var6++] = class131.field2500;
                            } else {
                                class135.field2577[var6++] = var280.field3352;
                            }
                            continue;
                        }
                    } else if (var320 < 2600) {
                        var11--;
                        class170 var55 = class192.method1268(class223.field4220[var11], -98);
                        if (var320 == 2500) {
                            class223.field4220[var11++] = var55.field3353;
                            continue;
                        }
                        if (var320 == 2501) {
                            class223.field4220[var11++] = var55.field3372;
                            continue;
                        }
                        if (var320 == 2502) {
                            class223.field4220[var11++] = var55.field3299;
                            continue;
                        }
                        if (var320 == 2503) {
                            class223.field4220[var11++] = var55.field3284;
                            continue;
                        }
                        if (var320 == 2504) {
                            class223.field4220[var11++] = var55.field3292 ? 1 : 0;
                            continue;
                        }
                        if (var320 == 2505) {
                            class223.field4220[var11++] = var55.field3400;
                            continue;
                        }
                    } else if (var320 < 2700) {
                        var11--;
                        class170 var279 = class192.method1268(class223.field4220[var11], -57);
                        if (var320 == 2600) {
                            class223.field4220[var11++] = var279.field3346;
                            continue;
                        }
                        if (var320 == 2601) {
                            class223.field4220[var11++] = var279.field3383;
                            continue;
                        }
                        if (var320 == 2602) {
                            class135.field2577[var6++] = var279.field3325;
                            continue;
                        }
                        if (var320 == 2603) {
                            class223.field4220[var11++] = var279.field3377;
                            continue;
                        }
                        if (var320 == 2604) {
                            class223.field4220[var11++] = var279.field3316;
                            continue;
                        }
                        if (var320 == 2605) {
                            class223.field4220[var11++] = var279.field3290;
                            continue;
                        }
                        if (var320 == 2606) {
                            class223.field4220[var11++] = var279.field3272;
                            continue;
                        }
                        if (var320 == 2607) {
                            class223.field4220[var11++] = var279.field3381;
                            continue;
                        }
                        if (var320 == 2608) {
                            class223.field4220[var11++] = var279.field3306;
                            continue;
                        }
                        if (var320 == 2609) {
                            class223.field4220[var11++] = var279.field3324;
                            continue;
                        }
                    } else if (var320 < 2800) {
                        if (var320 == 2700) {
                            var11--;
                            class170 var269 = class192.method1268(class223.field4220[var11], -84);
                            class223.field4220[var11++] = var269.field3359;
                            continue;
                        }
                        if (var320 == 2701) {
                            var11--;
                            class170 var270 = class192.method1268(class223.field4220[var11], -98);
                            if (var270.field3359 == -1) {
                                class223.field4220[var11++] = 0;
                            } else {
                                class223.field4220[var11++] = var270.field3402;
                            }
                            continue;
                        }
                        if (var320 == 2702) {
                            var11--;
                            int var271 = class223.field4220[var11];
                            class174 var272 = (class174) class173.field3437.method792((long) var271, arg2 - 3840);
                            if (var272 == null) {
                                class223.field4220[var11++] = 0;
                            } else {
                                class223.field4220[var11++] = 1;
                            }
                            continue;
                        }
                        if (var320 == 2703) {
                            var11--;
                            class170 var273 = class192.method1268(class223.field4220[var11], arg2 ^ 0xFFFF9989);
                            if (var273.field3337 == null) {
                                class223.field4220[var11++] = 0;
                                continue;
                            }
                            int var274 = var273.field3337.length;
                            for (int var275 = 0; var275 < var273.field3337.length; var275++) {
                                if (var273.field3337[var275] == null) {
                                    var274 = var275;
                                    break;
                                }
                            }
                            class223.field4220[var11++] = var274;
                            continue;
                        }
                        if (var320 == 2704 || var320 == 2705) {
                            var11 -= 2;
                            int var276 = class223.field4220[var11];
                            int var277 = class223.field4220[var11 + 1];
                            class174 var278 = (class174) class173.field3437.method792((long) var276, arg2 ^ 0x3100);
                            if (var278 != null && var278.field3454 == var277) {
                                class223.field4220[var11++] = 1;
                                continue;
                            }
                            class223.field4220[var11++] = 0;
                            continue;
                        }
                    } else if (var320 < 2900) {
                        var11--;
                        class170 var56 = class192.method1268(class223.field4220[var11], -44);
                        if (var320 == 2800) {
                            class223.field4220[var11++] = class54.method365(class26.method180(var56, 18125), false);
                            continue;
                        }
                        if (var320 == 2801) {
                            var11--;
                            int var57 = class223.field4220[var11];
                            int var321 = var57 - 1;
                            if (var56.field3404 != null && var321 < var56.field3404.length && var56.field3404[var321] != null) {
                                class135.field2577[var6++] = var56.field3404[var321];
                                continue;
                            }
                            class135.field2577[var6++] = class131.field2500;
                            continue;
                        }
                        if (var320 == 2802) {
                            if (var56.field3352 == null) {
                                class135.field2577[var6++] = class131.field2500;
                            } else {
                                class135.field2577[var6++] = var56.field3352;
                            }
                            continue;
                        }
                    } else if (var320 < 3200) {
                        if (var320 == 3100) {
                            var6--;
                            class141 var254 = class135.field2577[var6];
                            class131.method836(0, (byte) -124, class131.field2500, var254);
                            continue;
                        }
                        if (var320 == 3101) {
                            var11 -= 2;
                            class86.method589(class223.field4220[var11], 0, class223.field4220[var11 + 1], class114.field2176);
                            continue;
                        }
                        if (var320 == 3103) {
                            class190.method1262(108015568);
                            continue;
                        }
                        if (var320 == 3104) {
                            var6--;
                            class141 var255 = class135.field2577[var6];
                            class2.field26++;
                            int var256 = 0;
                            if (var255.method934((byte) 107)) {
                                var256 = var255.method927(10);
                            }
                            class7.field120.method32(186, 12885);
                            class7.field120.method970(var256, (byte) 27);
                            continue;
                        }
                        if (var320 == 3105) {
                            class178.field3511++;
                            var6--;
                            class141 var257 = class135.field2577[var6];
                            class7.field120.method32(207, 12885);
                            class7.field120.method978(-102, var257.method926(19790));
                            continue;
                        }
                        if (var320 == 3106) {
                            class162.field3144++;
                            var6--;
                            class141 var258 = class135.field2577[var6];
                            class7.field120.method32(113, arg2 ^ 0x541F);
                            class7.field120.method997(arg2 ^ 0x6601, var258.method908(false) + 1);
                            class7.field120.method999(var258, (byte) 32);
                            continue;
                        }
                        if (var320 == 3107) {
                            var6--;
                            class141 var259 = class135.field2577[var6];
                            var11--;
                            int var260 = class223.field4220[var11];
                            class31.method229(var260, var259, -102);
                            continue;
                        }
                        if (var320 == 3108) {
                            var11 -= 3;
                            int var261 = class223.field4220[var11 + 1];
                            int var262 = class223.field4220[var11];
                            int var263 = class223.field4220[var11 + 2];
                            class170 var264 = class192.method1268(var263, arg2 - 26235);
                            class216.method1408(var264, var262, var261, -54);
                            continue;
                        }
                        if (var320 == 3109) {
                            var11 -= 2;
                            class170 var265 = var44 ? class144.field2777 : class63.field1241;
                            int var266 = class223.field4220[var11];
                            int var267 = class223.field4220[var11 + 1];
                            class216.method1408(var265, var266, var267, -59);
                            continue;
                        }
                        if (var320 == 3110) {
                            class201.field3799++;
                            var11--;
                            int var268 = class223.field4220[var11];
                            class7.field120.method32(170, 12885);
                            class7.field120.method972(arg2 + 708, var268);
                            continue;
                        }
                    } else if (var320 < 3300) {
                        if (var320 == 3200) {
                            var11 -= 3;
                            class87.method592(class223.field4220[var11 + 1], class223.field4220[var11], 0, class223.field4220[var11 + 2]);
                            continue;
                        }
                        if (var320 == 3201) {
                            var11--;
                            class192.method1267(class223.field4220[var11], (byte) 114);
                            continue;
                        }
                        if (var320 == 3202) {
                            var11 -= 2;
                            class135.method852(arg2 ^ 0x662C, class223.field4220[var11 + 1], class223.field4220[var11]);
                            continue;
                        }
                    } else if (var320 < 3400) {
                        if (var320 == 3300) {
                            class223.field4220[var11++] = class20.field344;
                            continue;
                        }
                        if (var320 == 3301) {
                            var11 -= 2;
                            int var58 = class223.field4220[var11];
                            int var59 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = class40.method264(var59, var58, 0);
                            continue;
                        }
                        if (var320 == 3302) {
                            var11 -= 2;
                            int var60 = class223.field4220[var11 + 1];
                            int var61 = class223.field4220[var11];
                            class223.field4220[var11++] = class117.method761(var60, var61, (byte) 85);
                            continue;
                        }
                        if (var320 == 3303) {
                            var11 -= 2;
                            int var62 = class223.field4220[var11];
                            int var63 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = class109.method722(var62, var63, (byte) 11);
                            continue;
                        }
                        if (var320 == 3304) {
                            var11--;
                            int var64 = class223.field4220[var11];
                            class223.field4220[var11++] = class213.method1388(var64, (byte) -120).field460;
                            continue;
                        }
                        if (var320 == 3305) {
                            var11--;
                            int var65 = class223.field4220[var11];
                            class223.field4220[var11++] = class36.field728[var65];
                            continue;
                        }
                        if (var320 == 3306) {
                            var11--;
                            int var66 = class223.field4220[var11];
                            class223.field4220[var11++] = class68.field1344[var66];
                            continue;
                        }
                        if (var320 == 3307) {
                            var11--;
                            int var67 = class223.field4220[var11];
                            class223.field4220[var11++] = class38.field768[var67];
                            continue;
                        }
                        if (var320 == 3308) {
                            int var68 = (class114.field2176.field3889 >> 7) + class83.field1649;
                            int var69 = class66.field1287;
                            int var70 = (class114.field2176.field3854 >> 7) + class83.field1644;
                            class223.field4220[var11++] = (var68 << 14) + (var69 << 28) + var70;
                            continue;
                        }
                        if (var320 == 3309) {
                            var11--;
                            int var71 = class223.field4220[var11];
                            class223.field4220[var11++] = class15.method94(var71 >> 14, 16383);
                            continue;
                        }
                        if (var320 == 3310) {
                            var11--;
                            int var72 = class223.field4220[var11];
                            class223.field4220[var11++] = var72 >> 28;
                            continue;
                        }
                        if (var320 == 3311) {
                            var11--;
                            int var73 = class223.field4220[var11];
                            class223.field4220[var11++] = class15.method94(16383, var73);
                            continue;
                        }
                        if (var320 == 3312) {
                            class223.field4220[var11++] = class118.field2296 ? 1 : 0;
                            continue;
                        }
                        if (var320 == 3313) {
                            var11 -= 2;
                            int var74 = class223.field4220[var11] + 32768;
                            int var75 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = class40.method264(var75, var74, 0);
                            continue;
                        }
                        if (var320 == 3314) {
                            var11 -= 2;
                            int var76 = class223.field4220[var11] + 32768;
                            int var77 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = class117.method761(var77, var76, (byte) 101);
                            continue;
                        }
                        if (var320 == 3315) {
                            var11 -= 2;
                            int var78 = class223.field4220[var11] + 32768;
                            int var79 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = class109.method722(var78, var79, (byte) 56);
                            continue;
                        }
                        if (var320 == 3316) {
                            if (class2.field20 < 2) {
                                class223.field4220[var11++] = 0;
                            } else {
                                class223.field4220[var11++] = class2.field20;
                            }
                            continue;
                        }
                        if (var320 == 3317) {
                            class223.field4220[var11++] = class106.field2029;
                            continue;
                        }
                        if (var320 == 3318) {
                            class223.field4220[var11++] = class173.field3443;
                            continue;
                        }
                        if (var320 == 3321) {
                            class223.field4220[var11++] = class109.field2098;
                            continue;
                        }
                        if (var320 == 3322) {
                            class223.field4220[var11++] = class170.field3296;
                            continue;
                        }
                        if (var320 == 3323) {
                            if (class27.field519 >= 5 && class27.field519 <= 9) {
                                class223.field4220[var11++] = 1;
                                continue;
                            }
                            class223.field4220[var11++] = 0;
                            continue;
                        }
                        if (var320 == 3324) {
                            if (class27.field519 >= 5 && class27.field519 <= 9) {
                                class223.field4220[var11++] = class27.field519;
                                continue;
                            }
                            class223.field4220[var11++] = 0;
                            continue;
                        }
                        if (var320 == 3325) {
                            if (class129.field2455 > 0) {
                                class223.field4220[var11++] = 1;
                            } else {
                                class223.field4220[var11++] = 0;
                            }
                            continue;
                        }
                        if (var320 == 3326) {
                            class223.field4220[var11++] = class114.field2176.field767;
                            continue;
                        }
                        if (var320 == 3327) {
                            class223.field4220[var11++] = class114.field2176.field765.field1464 ? 1 : 0;
                            continue;
                        }
                    } else if (var320 < 3500) {
                        if (var320 == 3400) {
                            var11 -= 2;
                            int var246 = class223.field4220[var11];
                            int var247 = class223.field4220[var11 + 1];
                            class83 var248 = class86.method586(78, var246);
                            class135.field2577[var6++] = var248.method569(var247, -27);
                            continue;
                        }
                        if (var320 == 3408) {
                            var11 -= 4;
                            int var249 = class223.field4220[var11 + 3];
                            int var250 = class223.field4220[var11 + 1];
                            int var251 = class223.field4220[var11 + 2];
                            int var252 = class223.field4220[var11];
                            class83 var253 = class86.method586(104, var251);
                            if (var253.field1656 == var252 && var253.field1647 == var250) {
                                if (var250 == 115) {
                                    class135.field2577[var6++] = var253.method569(var249, -32);
                                } else {
                                    class223.field4220[var11++] = var253.method574((byte) 55, var249);
                                }
                                continue;
                            }
                            if (var250 == 115) {
                                class135.field2577[var6++] = class82.field1639;
                            } else {
                                class223.field4220[var11++] = 0;
                            }
                            continue;
                        }
                    } else if (var320 < 3700) {
                        if (var320 == 3600) {
                            if (class29.field567 == 0) {
                                class223.field4220[var11++] = -2;
                            } else if (class29.field567 == 1) {
                                class223.field4220[var11++] = -1;
                            } else {
                                class223.field4220[var11++] = class88.field1750;
                            }
                            continue;
                        }
                        if (var320 == 3601) {
                            var11--;
                            int var226 = class223.field4220[var11];
                            if (class29.field567 == 2 && class88.field1750 > var226) {
                                class135.field2577[var6++] = class188.field3640[var226];
                                continue;
                            }
                            class135.field2577[var6++] = class131.field2500;
                            continue;
                        }
                        if (var320 == 3602) {
                            var11--;
                            int var227 = class223.field4220[var11];
                            if (class29.field567 == 2 && class88.field1750 > var227) {
                                class223.field4220[var11++] = class103.field1993[var227];
                                continue;
                            }
                            class223.field4220[var11++] = 0;
                            continue;
                        }
                        if (var320 == 3603) {
                            var11--;
                            int var228 = class223.field4220[var11];
                            if (class29.field567 == 2 && var228 < class88.field1750) {
                                class223.field4220[var11++] = class203.field3897[var228];
                                continue;
                            }
                            class223.field4220[var11++] = 0;
                            continue;
                        }
                        if (var320 == 3604) {
                            var11--;
                            int var229 = class223.field4220[var11];
                            var6--;
                            class141 var230 = class135.field2577[var6];
                            class129.method815(var229, -36, var230);
                            continue;
                        }
                        if (var320 == 3605) {
                            var6--;
                            class141 var231 = class135.field2577[var6];
                            class130.method825((byte) -74, var231.method926(19790));
                            continue;
                        }
                        if (var320 == 3606) {
                            var6--;
                            class141 var232 = class135.field2577[var6];
                            class90.method618(var232.method926(arg2 - 6396), 113);
                            continue;
                        }
                        if (var320 == 3607) {
                            var6--;
                            class141 var233 = class135.field2577[var6];
                            class169.method1157(0, var233.method926(arg2 ^ 0x2B04));
                            continue;
                        }
                        if (var320 == 3608) {
                            var6--;
                            class141 var234 = class135.field2577[var6];
                            class211.method1375((byte) 77, var234.method926(19790));
                            continue;
                        }
                        if (var320 == 3609) {
                            var6--;
                            class141 var235 = class135.field2577[var6];
                            if (var235.method932(105, class174.field3460) || var235.method932(104, class62.field1217)) {
                                var235 = var235.method907((byte) -94, 7);
                            }
                            class223.field4220[var11++] = class157.method1092(var235, (byte) -115) ? 1 : 0;
                            continue;
                        }
                        if (var320 == 3610) {
                            var11--;
                            int var236 = class223.field4220[var11];
                            if (class29.field567 == 2 && class88.field1750 > var236) {
                                class135.field2577[var6++] = class25.field478[var236];
                                continue;
                            }
                            class135.field2577[var6++] = class131.field2500;
                            continue;
                        }
                        if (var320 == 3611) {
                            if (class97.field1918 == null) {
                                class135.field2577[var6++] = class131.field2500;
                            } else {
                                class135.field2577[var6++] = class97.field1918.method898(class157.method1091(arg2, 26140));
                            }
                            continue;
                        }
                        if (var320 == 3612) {
                            if (class97.field1918 == null) {
                                class223.field4220[var11++] = 0;
                            } else {
                                class223.field4220[var11++] = class142.field2744;
                            }
                            continue;
                        }
                        if (var320 == 3613) {
                            var11--;
                            int var237 = class223.field4220[var11];
                            if (class97.field1918 != null && var237 < class142.field2744) {
                                class135.field2577[var6++] = class180.field3541[var237].field4094.method898(13);
                                continue;
                            }
                            class135.field2577[var6++] = class131.field2500;
                            continue;
                        }
                        if (var320 == 3614) {
                            var11--;
                            int var238 = class223.field4220[var11];
                            if (class97.field1918 != null && class142.field2744 > var238) {
                                class223.field4220[var11++] = class180.field3541[var238].field4106;
                                continue;
                            }
                            class223.field4220[var11++] = 0;
                            continue;
                        }
                        if (var320 == 3615) {
                            var11--;
                            int var239 = class223.field4220[var11];
                            if (class97.field1918 != null && var239 < class142.field2744) {
                                class223.field4220[var11++] = class180.field3541[var239].field4098;
                                continue;
                            }
                            class223.field4220[var11++] = 0;
                            continue;
                        }
                        if (var320 == 3616) {
                            class223.field4220[var11++] = class124.field2382;
                            continue;
                        }
                        if (var320 == 3617) {
                            var6--;
                            class141 var240 = class135.field2577[var6];
                            class31.method230((byte) 6, var240);
                            continue;
                        }
                        if (var320 == 3618) {
                            class223.field4220[var11++] = class117.field2262;
                            continue;
                        }
                        if (var320 == 3619) {
                            var6--;
                            class141 var241 = class135.field2577[var6];
                            class142.method941(arg2 - 26239, var241.method926(19790));
                            continue;
                        }
                        if (var320 == 3620) {
                            class151.method1048((byte) 10);
                            continue;
                        }
                        if (var320 == 3621) {
                            if (class29.field567 == 0) {
                                class223.field4220[var11++] = -1;
                            } else {
                                class223.field4220[var11++] = class96.field1912;
                            }
                            continue;
                        }
                        if (var320 == 3622) {
                            var11--;
                            int var242 = class223.field4220[var11];
                            if (class29.field567 != 0 && class96.field1912 > var242) {
                                class135.field2577[var6++] = class206.method1361(class154.field2999[var242], 0).method898(96);
                                continue;
                            }
                            class135.field2577[var6++] = class131.field2500;
                            continue;
                        }
                        if (var320 == 3623) {
                            var6--;
                            class141 var243 = class135.field2577[var6];
                            if (var243.method932(arg2 ^ 0xFFFF99F5, class174.field3460) || var243.method932(127, class62.field1217)) {
                                var243 = var243.method907((byte) 107, 7);
                            }
                            class223.field4220[var11++] = class130.method828(31, var243) ? 1 : 0;
                            continue;
                        }
                        if (var320 == 3624) {
                            var11--;
                            int var244 = class223.field4220[var11];
                            if (class180.field3541 != null && class142.field2744 > var244 && class180.field3541[var244].field4094.method933((byte) -95, class114.field2176.field773)) {
                                class223.field4220[var11++] = 1;
                                continue;
                            }
                            class223.field4220[var11++] = 0;
                            continue;
                        }
                        if (var320 == 3625) {
                            if (class4.field42 == null) {
                                class135.field2577[var6++] = class131.field2500;
                            } else {
                                class135.field2577[var6++] = class4.field42.method898(class157.method1091(arg2, 26139));
                            }
                            continue;
                        }
                        if (var320 == 3626) {
                            var11--;
                            int var245 = class223.field4220[var11];
                            if (class97.field1918 != null && var245 < class142.field2744) {
                                class135.field2577[var6++] = class180.field3541[var245].field4104;
                                continue;
                            }
                            class135.field2577[var6++] = class131.field2500;
                            continue;
                        }
                    } else if (var320 < 4000) {
                        if (var320 == 3903) {
                            var11--;
                            int var80 = class223.field4220[var11];
                            class223.field4220[var11++] = class106.field2032[var80].method650(52);
                            continue;
                        }
                        if (var320 == 3904) {
                            var11--;
                            int var81 = class223.field4220[var11];
                            class223.field4220[var11++] = class106.field2032[var81].field1897;
                            continue;
                        }
                        if (var320 == 3905) {
                            var11--;
                            int var82 = class223.field4220[var11];
                            class223.field4220[var11++] = class106.field2032[var82].field1902;
                            continue;
                        }
                        if (var320 == 3906) {
                            var11--;
                            int var83 = class223.field4220[var11];
                            class223.field4220[var11++] = class106.field2032[var83].field1899;
                            continue;
                        }
                        if (var320 == 3907) {
                            var11--;
                            int var84 = class223.field4220[var11];
                            class223.field4220[var11++] = class106.field2032[var84].field1909;
                            continue;
                        }
                        if (var320 == 3908) {
                            var11--;
                            int var85 = class223.field4220[var11];
                            class223.field4220[var11++] = class106.field2032[var85].field1904;
                            continue;
                        }
                        if (var320 == 3910) {
                            var11--;
                            int var86 = class223.field4220[var11];
                            int var87 = class106.field2032[var86].method648((byte) -105);
                            class223.field4220[var11++] = var87 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var320 == 3911) {
                            var11--;
                            int var88 = class223.field4220[var11];
                            int var89 = class106.field2032[var88].method648((byte) -85);
                            class223.field4220[var11++] = var89 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var320 == 3912) {
                            var11--;
                            int var90 = class223.field4220[var11];
                            int var91 = class106.field2032[var90].method648((byte) -81);
                            class223.field4220[var11++] = var91 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var320 == 3913) {
                            var11--;
                            int var92 = class223.field4220[var11];
                            int var93 = class106.field2032[var92].method648((byte) -112);
                            class223.field4220[var11++] = var93 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var320 < 4100) {
                        if (var320 == 4000) {
                            var11 -= 2;
                            int var94 = class223.field4220[var11];
                            int var95 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = var94 + var95;
                            continue;
                        }
                        if (var320 == 4001) {
                            var11 -= 2;
                            int var96 = class223.field4220[var11 + 1];
                            int var97 = class223.field4220[var11];
                            class223.field4220[var11++] = var97 - var96;
                            continue;
                        }
                        if (var320 == 4002) {
                            var11 -= 2;
                            int var98 = class223.field4220[var11 + 1];
                            int var99 = class223.field4220[var11];
                            class223.field4220[var11++] = var98 * var99;
                            continue;
                        }
                        if (var320 == 4003) {
                            var11 -= 2;
                            int var100 = class223.field4220[var11];
                            int var101 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = var100 / var101;
                            continue;
                        }
                        if (var320 == 4004) {
                            var11--;
                            int var102 = class223.field4220[var11];
                            class223.field4220[var11++] = (int) (Math.random() * (double) var102);
                            continue;
                        }
                        if (var320 == 4005) {
                            var11--;
                            int var103 = class223.field4220[var11];
                            class223.field4220[var11++] = (int) ((double) (var103 + 1) * Math.random());
                            continue;
                        }
                        if (var320 == 4006) {
                            var11 -= 5;
                            int var104 = class223.field4220[var11];
                            int var105 = class223.field4220[var11 + 2];
                            int var106 = class223.field4220[var11 + 1];
                            int var107 = class223.field4220[var11 + 4];
                            int var108 = class223.field4220[var11 + 3];
                            class223.field4220[var11++] = (var106 - var104) * (-var105 + var107) / (var108 - var105) + var104;
                            continue;
                        }
                        if (var320 == 4007) {
                            var11 -= 2;
                            long var109 = (long) class223.field4220[var11 + 1];
                            long var111 = (long) class223.field4220[var11];
                            class223.field4220[var11++] = (int) (var109 * var111 / 100L + var111);
                            continue;
                        }
                        if (var320 == 4008) {
                            var11 -= 2;
                            int var113 = class223.field4220[var11];
                            int var114 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = class57.method389(var113, 0x1 << var114);
                            continue;
                        }
                        if (var320 == 4009) {
                            var11 -= 2;
                            int var115 = class223.field4220[var11];
                            int var116 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = class15.method94(-(0x1 << var116) - 1, var115);
                            continue;
                        }
                        if (var320 == 4010) {
                            var11 -= 2;
                            int var117 = class223.field4220[var11];
                            int var118 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = class15.method94(var117, 0x1 << var118) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var320 == 4011) {
                            var11 -= 2;
                            int var119 = class223.field4220[var11];
                            int var120 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = var119 % var120;
                            continue;
                        }
                        if (var320 == 4012) {
                            var11 -= 2;
                            int var121 = class223.field4220[var11 + 1];
                            int var122 = class223.field4220[var11];
                            if (var122 == 0) {
                                class223.field4220[var11++] = 0;
                            } else {
                                class223.field4220[var11++] = (int) Math.pow((double) var122, (double) var121);
                            }
                            continue;
                        }
                        if (var320 == 4013) {
                            var11 -= 2;
                            int var123 = class223.field4220[var11 + 1];
                            int var124 = class223.field4220[var11];
                            if (var124 == 0) {
                                class223.field4220[var11++] = 0;
                            } else if (var123 == 0) {
                                class223.field4220[var11++] = Integer.MAX_VALUE;
                            } else {
                                class223.field4220[var11++] = (int) Math.pow((double) var124, 1.0D / (double) var123);
                            }
                            continue;
                        }
                        if (var320 == 4014) {
                            var11 -= 2;
                            int var125 = class223.field4220[var11];
                            int var126 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = class15.method94(var126, var125);
                            continue;
                        }
                        if (var320 == 4015) {
                            var11 -= 2;
                            int var127 = class223.field4220[var11 + 1];
                            int var128 = class223.field4220[var11];
                            class223.field4220[var11++] = class57.method389(var127, var128);
                            continue;
                        }
                        if (var320 == 4016) {
                            var11 -= 2;
                            int var129 = class223.field4220[var11];
                            int var130 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = var129 < var130 ? var129 : var130;
                            continue;
                        }
                        if (var320 == 4017) {
                            var11 -= 2;
                            int var131 = class223.field4220[var11 + 1];
                            int var132 = class223.field4220[var11];
                            class223.field4220[var11++] = var131 >= var132 ? var131 : var132;
                            continue;
                        }
                        if (var320 == 4018) {
                            var11 -= 3;
                            long var133 = (long) class223.field4220[var11 + 1];
                            long var135 = (long) class223.field4220[var11];
                            long var137 = (long) class223.field4220[var11 + 2];
                            class223.field4220[var11++] = (int) (var135 * var137 / var133);
                            continue;
                        }
                    } else if (var320 < 4200) {
                        if (var320 == 4100) {
                            var6--;
                            class141 var139 = class135.field2577[var6];
                            var11--;
                            int var140 = class223.field4220[var11];
                            class135.field2577[var6++] = class220.method1422(new class141[] { var139, class78.method543((byte) 93, var140) }, -3);
                            continue;
                        }
                        if (var320 == 4101) {
                            var6 -= 2;
                            class141 var141 = class135.field2577[var6];
                            class141 var142 = class135.field2577[var6 + 1];
                            class135.field2577[var6++] = class220.method1422(new class141[] { var141, var142 }, -3);
                            continue;
                        }
                        if (var320 == 4102) {
                            var6--;
                            class141 var143 = class135.field2577[var6];
                            var11--;
                            int var144 = class223.field4220[var11];
                            class135.field2577[var6++] = class220.method1422(new class141[] { var143, class147.method1017((byte) -101, true, var144) }, class157.method1091(arg2, -26185));
                            continue;
                        }
                        if (var320 == 4103) {
                            var6--;
                            class141 var145 = class135.field2577[var6];
                            class135.field2577[var6++] = var145.method914((byte) -79);
                            continue;
                        }
                        if (var320 == 4104) {
                            var11--;
                            int var146 = class223.field4220[var11];
                            long var147 = (long) var146 * 86400000L + 1014768000000L;
                            class106.field2046.setTime(new Date(var147));
                            int var149 = class106.field2046.get(5);
                            int var150 = class106.field2046.get(2);
                            int var151 = class106.field2046.get(1);
                            class135.field2577[var6++] = class220.method1422(new class141[] { class78.method543((byte) 93, var149), class93.field1860, class111.field2131[var150], class93.field1860, class78.method543((byte) 93, var151) }, -3);
                            continue;
                        }
                        if (var320 == 4105) {
                            var6 -= 2;
                            class141 var152 = class135.field2577[var6 + 1];
                            class141 var153 = class135.field2577[var6];
                            if (class114.field2176.field765 != null && class114.field2176.field765.field1464) {
                                class135.field2577[var6++] = var152;
                                continue;
                            }
                            class135.field2577[var6++] = var153;
                            continue;
                        }
                        if (var320 == 4106) {
                            var11--;
                            int var154 = class223.field4220[var11];
                            class135.field2577[var6++] = class78.method543((byte) 93, var154);
                            continue;
                        }
                        if (var320 == 4107) {
                            var6 -= 2;
                            class223.field4220[var11++] = class135.field2577[var6].method920(false, class135.field2577[var6 + 1]);
                            continue;
                        }
                        if (var320 == 4108) {
                            var11 -= 2;
                            var6--;
                            class141 var155 = class135.field2577[var6];
                            int var156 = class223.field4220[var11];
                            int var157 = class223.field4220[var11 + 1];
                            byte[] var158 = field4078.method1065((byte) -103, 0, var157);
                            class80 var159 = new class80(var158);
                            var159.method883(class22.field363, null);
                            class223.field4220[var11++] = var159.method859(var155, var156);
                            continue;
                        }
                        if (var320 == 4109) {
                            var11 -= 2;
                            var6--;
                            class141 var160 = class135.field2577[var6];
                            int var161 = class223.field4220[var11 + 1];
                            int var162 = class223.field4220[var11];
                            byte[] var163 = field4078.method1065((byte) 64, 0, var161);
                            class80 var164 = new class80(var163);
                            var164.method883(class22.field363, null);
                            class223.field4220[var11++] = var164.method877(var160, var162);
                            continue;
                        }
                        if (var320 == 4110) {
                            var6 -= 2;
                            class141 var165 = class135.field2577[var6];
                            class141 var166 = class135.field2577[var6 + 1];
                            var11--;
                            if (class223.field4220[var11] == 1) {
                                class135.field2577[var6++] = var165;
                            } else {
                                class135.field2577[var6++] = var166;
                            }
                            continue;
                        }
                        if (var320 == 4111) {
                            var6--;
                            class141 var167 = class135.field2577[var6];
                            class135.field2577[var6++] = class137.method858(var167);
                            continue;
                        }
                        if (var320 == 4112) {
                            var6--;
                            class141 var168 = class135.field2577[var6];
                            var11--;
                            int var169 = class223.field4220[var11];
                            class135.field2577[var6++] = var168.method912(var169, -109);
                            continue;
                        }
                        if (var320 == 4113) {
                            var11--;
                            int var170 = class223.field4220[var11];
                            class223.field4220[var11++] = class72.method498(true, var170) ? 1 : 0;
                            continue;
                        }
                        if (var320 == 4114) {
                            var11--;
                            int var171 = class223.field4220[var11];
                            class223.field4220[var11++] = class66.method442((byte) -80, var171) ? 1 : 0;
                            continue;
                        }
                        if (var320 == 4115) {
                            var11--;
                            int var172 = class223.field4220[var11];
                            class223.field4220[var11++] = class39.method257(126, var172) ? 1 : 0;
                            continue;
                        }
                        if (var320 == 4116) {
                            var11--;
                            int var173 = class223.field4220[var11];
                            class223.field4220[var11++] = class146.method1016(-58, var173) ? 1 : 0;
                            continue;
                        }
                        if (var320 == 4117) {
                            var6--;
                            class141 var174 = class135.field2577[var6];
                            if (var174 == null) {
                                class223.field4220[var11++] = 0;
                            } else {
                                class223.field4220[var11++] = var174.method908(false);
                            }
                            continue;
                        }
                        if (var320 == 4118) {
                            var11 -= 2;
                            var6--;
                            class141 var175 = class135.field2577[var6];
                            int var176 = class223.field4220[var11 + 1];
                            int var177 = class223.field4220[var11];
                            class135.field2577[var6++] = var175.method902(var176, var177, (byte) 35);
                            continue;
                        }
                        if (var320 == 4119) {
                            var6--;
                            class141 var178 = class135.field2577[var6];
                            class141 var179 = class211.method1374(var178.method908(false), 256);
                            boolean var180 = false;
                            for (int var181 = 0; var181 < var178.method908(false); var181++) {
                                int var182 = var178.method900(125, var181);
                                if (var182 == 60) {
                                    var180 = true;
                                } else if (var182 == 62) {
                                    var180 = false;
                                } else if (!var180) {
                                    var179.method929(-58, var182);
                                }
                            }
                            var179.method936((byte) 90);
                            class135.field2577[var6++] = var179;
                            continue;
                        }
                        if (var320 == 4120) {
                            var11 -= 2;
                            var6--;
                            class141 var183 = class135.field2577[var6];
                            int var184 = class223.field4220[var11];
                            int var185 = class223.field4220[var11 + 1];
                            class223.field4220[var11++] = var183.method911(-123, var184, var185);
                            continue;
                        }
                        if (var320 == 4121) {
                            var6 -= 2;
                            var11--;
                            int var186 = class223.field4220[var11];
                            class141 var187 = class135.field2577[var6 + 1];
                            class141 var188 = class135.field2577[var6];
                            class223.field4220[var11++] = var188.method928(-1, var186, var187);
                            continue;
                        }
                    } else if (var320 < 4300) {
                        if (var320 == 4200) {
                            var11--;
                            int var210 = class223.field4220[var11];
                            class135.field2577[var6++] = class96.method645((byte) -61, var210).field937;
                            continue;
                        }
                        if (var320 == 4201) {
                            var11 -= 2;
                            int var211 = class223.field4220[var11];
                            int var212 = class223.field4220[var11 + 1];
                            class50 var213 = class96.method645((byte) -61, var211);
                            if (var212 >= 1 && var212 <= 5 && var213.field932[var212 - 1] != null) {
                                class135.field2577[var6++] = var213.field932[var212 - 1];
                                continue;
                            }
                            class135.field2577[var6++] = class131.field2500;
                            continue;
                        }
                        if (var320 == 4202) {
                            var11 -= 2;
                            int var214 = class223.field4220[var11];
                            int var215 = class223.field4220[var11 + 1];
                            class50 var216 = class96.method645((byte) -61, var214);
                            if (var215 >= 1 && var215 <= 5 && var216.field952[var215 - 1] != null) {
                                class135.field2577[var6++] = var216.field952[var215 - 1];
                                continue;
                            }
                            class135.field2577[var6++] = class131.field2500;
                            continue;
                        }
                        if (var320 == 4203) {
                            var11--;
                            int var217 = class223.field4220[var11];
                            class223.field4220[var11++] = class96.method645((byte) -61, var217).field980;
                            continue;
                        }
                        if (var320 == 4204) {
                            var11--;
                            int var218 = class223.field4220[var11];
                            class223.field4220[var11++] = class96.method645((byte) -61, var218).field945 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var320 == 4205) {
                            var11--;
                            int var219 = class223.field4220[var11];
                            class50 var220 = class96.method645((byte) -61, var219);
                            if (var220.field948 == -1 && var220.field942 >= 0) {
                                class223.field4220[var11++] = var220.field942;
                                continue;
                            }
                            class223.field4220[var11++] = var219;
                            continue;
                        }
                        if (var320 == 4206) {
                            var11--;
                            int var221 = class223.field4220[var11];
                            class50 var222 = class96.method645((byte) -61, var221);
                            if (var222.field948 >= 0 && var222.field942 >= 0) {
                                class223.field4220[var11++] = var222.field942;
                                continue;
                            }
                            class223.field4220[var11++] = var221;
                            continue;
                        }
                        if (var320 == 4207) {
                            var11--;
                            int var223 = class223.field4220[var11];
                            class223.field4220[var11++] = class96.method645((byte) -61, var223).field971 ? 1 : 0;
                            continue;
                        }
                        if (var320 == 4210) {
                            var11--;
                            int var224 = class223.field4220[var11];
                            var6--;
                            class141 var225 = class135.field2577[var6];
                            class58.method390(0, var225, var224 == 1);
                            class223.field4220[var11++] = class95.field1891;
                            continue;
                        }
                        if (var320 == 4211) {
                            if (class88.field1752 != null && field4090 < class95.field1891) {
                                class223.field4220[var11++] = class15.method94(class88.field1752[field4090++], 65535);
                                continue;
                            }
                            class223.field4220[var11++] = -1;
                            continue;
                        }
                        if (var320 == 4212) {
                            field4090 = 0;
                            continue;
                        }
                    } else if (var320 < 5100) {
                        if (var320 == 5000) {
                            class223.field4220[var11++] = class67.field1316;
                            continue;
                        }
                        if (var320 == 5001) {
                            var11 -= 3;
                            class67.field1316 = class223.field4220[var11];
                            class22.field399 = class223.field4220[var11 + 1];
                            class168.field3241++;
                            class136.field2597 = class223.field4220[var11 + 2];
                            class7.field120.method32(221, 12885);
                            class7.field120.method997(82, class67.field1316);
                            class7.field120.method997(119, class22.field399);
                            class7.field120.method997(111, class136.field2597);
                            continue;
                        }
                        if (var320 == 5002) {
                            var11 -= 2;
                            class79.field1593++;
                            int var189 = class223.field4220[var11];
                            int var190 = class223.field4220[var11 + 1];
                            var6--;
                            class141 var191 = class135.field2577[var6];
                            class7.field120.method32(75, 12885);
                            class7.field120.method978(-117, var191.method926(arg2 ^ 0x2B04));
                            class7.field120.method997(105, var189 - 1);
                            class7.field120.method997(127, var190);
                            continue;
                        }
                        if (var320 == 5003) {
                            var11--;
                            int var192 = class223.field4220[var11];
                            class141 var193 = null;
                            if (var192 < 100) {
                                var193 = class223.field4217[var192];
                            }
                            if (var193 == null) {
                                var193 = class131.field2500;
                            }
                            class135.field2577[var6++] = var193;
                            continue;
                        }
                        if (var320 == 5004) {
                            var11--;
                            int var194 = class223.field4220[var11];
                            int var195 = -1;
                            if (var194 < 100 && class223.field4217[var194] != null) {
                                var195 = class113.field2170[var194];
                            }
                            class223.field4220[var11++] = var195;
                            continue;
                        }
                        if (var320 == 5005) {
                            class223.field4220[var11++] = class22.field399;
                            continue;
                        }
                        if (var320 == 5008) {
                            var6--;
                            class141 var196 = class135.field2577[var6];
                            if (var196.method932(123, class29.field561)) {
                                class47.method311((byte) 26, var196);
                            } else {
                                class135.field2565++;
                                class141 var197 = var196.method914((byte) 78);
                                byte var198 = 0;
                                if (var197.method932(-26, class123.field2364)) {
                                    var198 = 0;
                                    var196 = var196.method907((byte) -116, class123.field2364.method908(false));
                                } else if (var197.method932(-119, class6.field91)) {
                                    var196 = var196.method907((byte) -98, class6.field91.method908(false));
                                    var198 = 1;
                                } else if (var197.method932(-17, class49.field922)) {
                                    var196 = var196.method907((byte) -125, class49.field922.method908(false));
                                    var198 = 2;
                                } else if (var197.method932(118, class34.field687)) {
                                    var196 = var196.method907((byte) -106, class34.field687.method908(false));
                                    var198 = 3;
                                } else if (var197.method932(100, class220.field4159)) {
                                    var196 = var196.method907((byte) -109, class220.field4159.method908(false));
                                    var198 = 4;
                                } else if (var197.method932(124, class39.field779)) {
                                    var198 = 5;
                                    var196 = var196.method907((byte) 38, class39.field779.method908(false));
                                } else if (var197.method932(126, client.field595)) {
                                    var196 = var196.method907((byte) -108, client.field595.method908(false));
                                    var198 = 6;
                                } else if (var197.method932(arg2 ^ 0xFFFF9984, class94.field1876)) {
                                    var196 = var196.method907((byte) 97, class94.field1876.method908(false));
                                    var198 = 7;
                                } else if (var197.method932(119, class167.field3230)) {
                                    var196 = var196.method907((byte) 125, class167.field3230.method908(false));
                                    var198 = 8;
                                } else if (var197.method932(arg2 ^ 0x663E, class188.field3645)) {
                                    var196 = var196.method907((byte) -92, class188.field3645.method908(false));
                                    var198 = 9;
                                } else if (var197.method932(122, class61.field1189)) {
                                    var198 = 10;
                                    var196 = var196.method907((byte) 119, class61.field1189.method908(false));
                                } else if (var197.method932(-124, class58.field1134)) {
                                    var198 = 11;
                                    var196 = var196.method907((byte) 70, class58.field1134.method908(false));
                                } else if (class147.field2875 != 0) {
                                    if (var197.method932(arg2 - 26235, class123.field2351)) {
                                        var198 = 0;
                                        var196 = var196.method907((byte) -103, class123.field2351.method908(false));
                                    } else if (var197.method932(arg2 ^ 0x6633, class6.field83)) {
                                        var196 = var196.method907((byte) -117, class6.field83.method908(false));
                                        var198 = 1;
                                    } else if (var197.method932(-94, class49.field920)) {
                                        var196 = var196.method907((byte) -123, class49.field920.method908(false));
                                        var198 = 2;
                                    } else if (var197.method932(104, class34.field692)) {
                                        var196 = var196.method907((byte) 73, class34.field692.method908(false));
                                        var198 = 3;
                                    } else if (var197.method932(-83, class220.field4174)) {
                                        var196 = var196.method907((byte) 100, class220.field4174.method908(false));
                                        var198 = 4;
                                    } else if (var197.method932(-34, class39.field791)) {
                                        var198 = 5;
                                        var196 = var196.method907((byte) 73, class39.field791.method908(false));
                                    } else if (var197.method932(104, client.field586)) {
                                        var196 = var196.method907((byte) -96, client.field586.method908(false));
                                        var198 = 6;
                                    } else if (var197.method932(arg2 ^ 0x6617, class94.field1870)) {
                                        var196 = var196.method907((byte) 54, class94.field1870.method908(false));
                                        var198 = 7;
                                    } else if (var197.method932(-67, class167.field3231)) {
                                        var198 = 8;
                                        var196 = var196.method907((byte) 103, class167.field3231.method908(false));
                                    } else if (var197.method932(-119, class188.field3644)) {
                                        var196 = var196.method907((byte) -123, class188.field3644.method908(false));
                                        var198 = 9;
                                    } else if (var197.method932(-118, class61.field1193)) {
                                        var196 = var196.method907((byte) 51, class61.field1193.method908(false));
                                        var198 = 10;
                                    } else if (var197.method932(arg2 ^ 0x662B, class58.field1125)) {
                                        var198 = 11;
                                        var196 = var196.method907((byte) -101, class58.field1125.method908(false));
                                    }
                                }
                                class141 var199 = var196.method914((byte) 51);
                                byte var200 = 0;
                                if (var199.method932(108, class8.field124)) {
                                    var196 = var196.method907((byte) 83, class8.field124.method908(false));
                                    var200 = 1;
                                } else if (var199.method932(arg2 ^ 0xFFFF99A5, class81.field1629)) {
                                    var196 = var196.method907((byte) -117, class81.field1629.method908(false));
                                    var200 = 2;
                                } else if (var199.method932(-119, class168.field3243)) {
                                    var196 = var196.method907((byte) -90, class168.field3243.method908(false));
                                    var200 = 3;
                                } else if (var199.method932(89, class87.field1748)) {
                                    var200 = 4;
                                    var196 = var196.method907((byte) 93, class87.field1748.method908(false));
                                } else if (var199.method932(arg2 ^ 0xFFFF9994, class47.field895)) {
                                    var200 = 5;
                                    var196 = var196.method907((byte) -116, class47.field895.method908(false));
                                } else if (class147.field2875 != 0) {
                                    if (var199.method932(100, class8.field122)) {
                                        var196 = var196.method907((byte) -127, class8.field122.method908(false));
                                        var200 = 1;
                                    } else if (var199.method932(-118, class81.field1623)) {
                                        var196 = var196.method907((byte) -115, class81.field1623.method908(false));
                                        var200 = 2;
                                    } else if (var199.method932(108, class168.field3238)) {
                                        var200 = 3;
                                        var196 = var196.method907((byte) -115, class168.field3238.method908(false));
                                    } else if (var199.method932(-56, class87.field1721)) {
                                        var196 = var196.method907((byte) -112, class87.field1721.method908(false));
                                        var200 = 4;
                                    } else if (var199.method932(115, class47.field902)) {
                                        var200 = 5;
                                        var196 = var196.method907((byte) 100, class47.field902.method908(false));
                                    }
                                }
                                class7.field120.method32(124, 12885);
                                class7.field120.method997(101, 0);
                                int var201 = class7.field120.field2865;
                                class7.field120.method997(121, var198);
                                class7.field120.method997(112, var200);
                                class181.method1226(class7.field120, var196, arg2 - 26297);
                                class7.field120.method973(class7.field120.field2865 - var201, (byte) 17);
                            }
                            continue;
                        }
                        if (var320 == 5009) {
                            class184.field3592++;
                            var6 -= 2;
                            class141 var202 = class135.field2577[var6];
                            class141 var203 = class135.field2577[var6 + 1];
                            class7.field120.method32(122, 12885);
                            class7.field120.method997(96, 0);
                            int var204 = class7.field120.field2865;
                            class7.field120.method978(-116, var202.method926(19790));
                            class181.method1226(class7.field120, var203, 100);
                            class7.field120.method973(class7.field120.field2865 - var204, (byte) 17);
                            continue;
                        }
                        if (var320 == 5010) {
                            class141 var205 = null;
                            var11--;
                            int var206 = class223.field4220[var11];
                            if (var206 < 100) {
                                var205 = class96.field1895[var206];
                            }
                            if (var205 == null) {
                                var205 = class131.field2500;
                            }
                            class135.field2577[var6++] = var205;
                            continue;
                        }
                        if (var320 == 5011) {
                            class141 var207 = null;
                            var11--;
                            int var208 = class223.field4220[var11];
                            if (var208 < 100) {
                                var207 = client.field589[var208];
                            }
                            if (var207 == null) {
                                var207 = class131.field2500;
                            }
                            class135.field2577[var6++] = var207;
                            continue;
                        }
                        if (var320 == 5015) {
                            class141 var209;
                            if (class114.field2176 == null || class114.field2176.field773 == null) {
                                var209 = class105.field2027;
                            } else {
                                var209 = class114.field2176.field773;
                            }
                            class135.field2577[var6++] = var209;
                            continue;
                        }
                        if (var320 == 5016) {
                            class223.field4220[var11++] = class136.field2597;
                            continue;
                        }
                        if (var320 == 5017) {
                            class223.field4220[var11++] = class108.field2092;
                            continue;
                        }
                    } else if (var320 < 5200) {
                        if (var320 == 5100) {
                            if (class60.field1177[86]) {
                                class223.field4220[var11++] = 1;
                            } else {
                                class223.field4220[var11++] = 0;
                            }
                            continue;
                        }
                        if (var320 == 5101) {
                            if (class60.field1177[82]) {
                                class223.field4220[var11++] = 1;
                            } else {
                                class223.field4220[var11++] = 0;
                            }
                            continue;
                        }
                        if (var320 == 5102) {
                            if (class60.field1177[81]) {
                                class223.field4220[var11++] = 1;
                            } else {
                                class223.field4220[var11++] = 0;
                            }
                            continue;
                        }
                    }
                } else {
                    class170 var50;
                    if (var320 >= 2000) {
                        var11--;
                        var50 = class192.method1268(class223.field4220[var11], -64);
                        var320 -= 1000;
                    } else {
                        var50 = var44 ? class144.field2777 : class63.field1241;
                    }
                    if (var320 == 1300) {
                        var11--;
                        int var51 = class223.field4220[var11] - 1;
                        if (var51 >= 0 && var51 <= 9) {
                            var6--;
                            var50.method1171(var51, class135.field2577[var6], (byte) -50);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var320 == 1301) {
                        var11 -= 2;
                        int var52 = class223.field4220[var11 + 1];
                        int var53 = class223.field4220[var11];
                        var50.field3276 = class204.method1352(var52, (byte) 56, var53);
                        continue;
                    }
                    if (var320 == 1302) {
                        var11--;
                        var50.field3382 = class223.field4220[var11] == 1;
                        continue;
                    }
                    if (var320 == 1303) {
                        var11--;
                        var50.field3339 = class223.field4220[var11];
                        continue;
                    }
                    if (var320 == 1304) {
                        var11--;
                        var50.field3374 = class223.field4220[var11];
                        continue;
                    }
                    if (var320 == 1305) {
                        var6--;
                        var50.field3352 = class135.field2577[var6];
                        continue;
                    }
                    if (var320 == 1306) {
                        var6--;
                        var50.field3267 = class135.field2577[var6];
                        continue;
                    }
                    if (var320 == 1307) {
                        var50.field3404 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var319) {
            if (var5.field2867 == null) {
                if (class160.field3097 != 0) {
                    class131.method836(0, (byte) -112, class131.field2500, class27.field514);
                }
                class170.method1162("CS2 - scr:" + var5.field4067 + " op:" + var10, var319, (byte) 118);
            } else {
                class141 var316 = class211.method1374(30, 256);
                var316.method905(class8.field127, (byte) 34).method905(var5.field2867, (byte) 34);
                for (int var317 = class126.field2422 - 1; var317 >= 0; var317--) {
                    var316.method905(class223.field4214, (byte) 34).method905(class181.field3556[var317].field2299.field2867, (byte) 34);
                }
                if (var10 == 40) {
                    int var318 = var8[var9];
                    var316.method905(class157.field3038, (byte) 34).method905(class78.method543((byte) 93, var318), (byte) 34);
                }
                if (class160.field3097 != 0) {
                    class131.method836(0, (byte) -126, class131.field2500, class220.method1422(new class141[] { class128.field2437, var5.field2867 }, -3));
                }
                class170.method1162("CS2 - scr:" + var5.field4067 + " op:" + var10 + new String(var316.method909(-35)), var319, (byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static final void method1398(int arg0) {
        field4085++;
        if (arg0 != 3610) {
            return;
        }
        for (int var1 = 0; var1 < class165.field3199; var1++) {
            int var2 = class125.field2416[var1];
            class38 var3 = class116.field2231[var2];
            int var4 = class156.field3014.method991(arg0 - 3355);
            if ((var4 & 0x1) != 0) {
                var4 += class156.field3014.method991(255) << 8;
            }
            class126.method808(var4, var3, var2, true);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
    public static final boolean method1399(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class225.field4246; var3++) {
            class87 var4 = class9.field159[var3];
            if (var4.field1743 == 1) {
                int var5 = var4.field1720 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1744 * var5 >> 8) + var4.field1719;
                    int var7 = (var4.field1731 * var5 >> 8) + var4.field1740;
                    int var8 = (var4.field1736 * var5 >> 8) + var4.field1718;
                    int var9 = (var4.field1746 * var5 >> 8) + var4.field1749;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1743 == 2) {
                int var10 = arg0 - var4.field1720;
                if (var10 > 0) {
                    int var11 = (var4.field1744 * var10 >> 8) + var4.field1719;
                    int var12 = (var4.field1731 * var10 >> 8) + var4.field1740;
                    int var13 = (var4.field1736 * var10 >> 8) + var4.field1718;
                    int var14 = (var4.field1746 * var10 >> 8) + var4.field1749;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1743 == 3) {
                int var15 = var4.field1719 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1726 * var15 >> 8) + var4.field1720;
                    int var17 = (var4.field1742 * var15 >> 8) + var4.field1728;
                    int var18 = (var4.field1736 * var15 >> 8) + var4.field1718;
                    int var19 = (var4.field1746 * var15 >> 8) + var4.field1749;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1743 == 4) {
                int var20 = arg2 - var4.field1719;
                if (var20 > 0) {
                    int var21 = (var4.field1726 * var20 >> 8) + var4.field1720;
                    int var22 = (var4.field1742 * var20 >> 8) + var4.field1728;
                    int var23 = (var4.field1736 * var20 >> 8) + var4.field1718;
                    int var24 = (var4.field1746 * var20 >> 8) + var4.field1749;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1743 == 5) {
                int var25 = arg1 - var4.field1718;
                if (var25 > 0) {
                    int var26 = (var4.field1726 * var25 >> 8) + var4.field1720;
                    int var27 = (var4.field1742 * var25 >> 8) + var4.field1728;
                    int var28 = (var4.field1744 * var25 >> 8) + var4.field1719;
                    int var29 = (var4.field1731 * var25 >> 8) + var4.field1740;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(III)V")
    public class214(int arg0, int arg1, int arg2) {
        this.field4086 = arg1;
        this.field4083 = arg0;
        this.field4091 = new int[this.field4083][3][arg2];
        this.field4075 = new class72[this.field4086];
    }
}
