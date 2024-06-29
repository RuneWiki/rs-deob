import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class210 {

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "Ljb;")
    private class206 field3191 = null;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "Z")
    private boolean field3178;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "Lwc;")
    private class30 field3177;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Z")
    private boolean field3159;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "Z")
    public static boolean field3171 = true;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "[I")
    public static int[] field3167 = new int[2];

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "Llm;")
    public static class210 field3172;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Llm;")
    public static class210 field3181;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "[Ljava/lang/Object;")
    private Object[] field3182;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3189;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Z", line = 5)
    public final boolean method1431(int arg0, int arg1) {
        if (arg1 > -9) {
            this.method1451((String) null, 33);
        }
        field3184++;
        if (!this.method1457((byte) -84)) {
            return false;
        } else if (this.field3191.field3111.length == 1) {
            return this.method1463(0, (byte) -55, arg0);
        } else if (!this.method1447((byte) -123, arg0)) {
            return false;
        } else if (this.field3191.field3111[arg0] == 1) {
            return this.method1463(arg0, (byte) -55, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)I", line = 36)
    private final int method1432(int arg0, byte arg1) {
        if (arg1 != -15) {
            return -71;
        }
        field3195++;
        if (this.method1447((byte) -123, arg0)) {
            return this.field3182[arg0] == null ? this.field3177.method194(arg1 - 3686, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)V", line = 59)
    public final void method1433(byte arg0, int arg1) {
        field3194++;
        if (arg0 != 0) {
            this.method1434(false);
        }
        if (this.method1447((byte) -117, arg1) && this.field3189 != null) {
            this.field3189[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)I", line = 78)
    public final int method1434(boolean arg0) {
        field3198++;
        if (!arg0) {
            field3181 = (class210) null;
        }
        if (!this.method1457((byte) -84)) {
            throw new IllegalStateException("");
        }
        return this.field3191.field3113;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 99)
    public final void method1435(byte arg0) {
        if (arg0 != 118) {
            return;
        }
        if (this.field3189 != null) {
            for (int var2 = 0; var2 < this.field3189.length; var2++) {
                this.field3189[var2] = null;
            }
        }
        field3160++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B", line = 131)
    public final byte[] method1436(String arg0, String arg1, byte arg2) {
        field3161++;
        if (!this.method1457((byte) -84)) {
            return null;
        }
        if (arg2 != -59) {
            this.method1436((String) null, (String) null, (byte) 13);
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field3191.field3106.method35(class292.method2049(arg2 ^ 0x6270CA00, var4), -1888);
        if (this.method1447((byte) -98, var6)) {
            int var7 = this.field3191.field3115[var6].method35(class292.method2049(-1651558971, var5), -1888);
            return this.method1441(var7, (byte) -44, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)I", line = 157)
    public final int method1437(byte arg0) {
        field3154++;
        if (!this.method1457((byte) -84)) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != 91) {
            this.method1458((byte) -24, 105);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3182.length; var4++) {
            if (this.field3191.field3119[var4] > 0) {
                var2 += 100;
                var3 += this.method1432(var4, (byte) -15);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 196)
    public final boolean method1438(int arg0, String arg1) {
        field3166++;
        if (!this.method1457((byte) -84)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 == -64) {
            int var4 = this.field3191.field3106.method35(class292.method2049(arg0 ^ 0x6270CA05, var3), -1888);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([IIB)Z", line = 216)
    private final boolean method1439(int[] arg0, int arg1, byte arg2) {
        field3192++;
        if (!this.method1447((byte) -81, arg1)) {
            return false;
        } else if (this.field3182[arg1] == null) {
            return false;
        } else {
            int var4 = this.field3191.field3119[arg1];
            int[] var5 = this.field3191.field3110[arg1];
            if (this.field3189[arg1] == null) {
                this.field3189[arg1] = new Object[this.field3191.field3111[arg1]];
            }
            boolean var6 = true;
            Object[] var7 = this.field3189[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            if (arg2 != 118) {
                this.field3191 = (class206) null;
            }
            byte[] var10;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class67.method446(this.field3182[arg1], true, false);
                class263 var11 = new class263(var10);
                var11.method1820(var11.field3986.length, arg0, 5, 0);
            } else {
                var10 = class67.method446(this.field3182[arg1], false, false);
            }
            byte[] var12;
            try {
                var12 = class101.method711(var10, false);
            } catch (RuntimeException var31) {
                throw class194.method1340(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class177.method1228(var10, var10.length, 2913) + "," + class177.method1228(var10, var10.length - 2, 2913) + "," + this.field3191.field3125[arg1] + "," + this.field3191.field3113);
            }
            if (this.field3178) {
                this.field3182[arg1] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field3159) {
                    var7[var14] = var12;
                } else {
                    var7[var14] = class123.method890(false, var12, -12641);
                }
            } else {
                int[] var15 = new int[var4];
                int var16 = var12.length;
                int var32 = var16 - 1;
                int var17 = var12[var32] & 0xFF;
                int var18 = var32 - var4 * var17 * 4;
                class263 var19 = new class263(var12);
                var19.field4025 = var18;
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        var21 += var19.method1826(-206227536);
                        if (var5 != null) {
                        }
                        var15[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var15[var24]];
                    var15[var24] = 0;
                }
                int var25 = 0;
                var19.field4025 = var18;
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var19.method1826(-206227536);
                        class85.method589(var12, var25, var23[var28], var15[var28], var27);
                        var15[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field3159) {
                        var7[var30] = var23[var29];
                    } else {
                        var7[var30] = class123.method890(false, var23[var29], -12641);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([BIZIBI[Lla;I)V", line = 411)
    public static final void method1440(byte[] arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class191[] arg6, int arg7) {
        field3174++;
        if (!arg2) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg3 + var9) > 0 && arg3 + var9 < 103 && arg1 + var10 > 0 && arg1 + var10 < 103) {
                            arg6[var8].field2857[arg3 + var9][arg1 + var10] = class124.method893(arg6[var8].field2857[arg3 + var9][arg1 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg2) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class263 var12 = new class263(arg0);
        int var13 = 0;
        if (arg4 > -120) {
            field3183 = -86;
        }
        while (var13 < var11) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class288.method1999(-1, var13, arg7, arg5, var15 + arg1, var12, var14 + arg3, arg2, 0);
                }
            }
            var13++;
        }
        boolean var16 = false;
        while (var12.field4025 < var12.field3986.length) {
            int var17 = var12.method1787(false);
            if (var17 != 129) {
                var12.field4025--;
                break;
            }
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var12.method1810((byte) 120);
                if (var19 == 0) {
                    int var29 = arg3;
                    if (arg3 < 0) {
                        var29 = 0;
                    } else if (arg3 >= 104) {
                        var29 = 104;
                    }
                    int var30 = arg3 + 64;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    int var31 = arg1;
                    int var32 = arg1 + 64;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= 104) {
                        var32 = 104;
                    }
                    if (arg1 < 0) {
                        var31 = 0;
                    } else if (arg1 >= 104) {
                        var31 = 104;
                    }
                    while (var30 > var29) {
                        while (var32 > var31) {
                            class187.field2783[var18][var29][var31] = 0;
                            var31++;
                        }
                        var29++;
                    }
                } else if (var19 == 1) {
                    for (int var24 = 0; var24 < 64; var24 += 4) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            byte var26 = var12.method1810((byte) 127);
                            for (int var27 = var24 + arg3; var27 < (arg3 + var24 + 4); var27++) {
                                for (int var28 = var25 + arg1; var28 < var25 + arg1 + 4; var28++) {
                                    if (var27 >= 0 && var27 < 104 && var28 >= 0 && var28 < 104) {
                                        class187.field2783[var18][var27][var28] = var26;
                                    }
                                }
                            }
                        }
                    }
                } else if (var19 == 2 && var18 > 0) {
                    int var20 = arg3 + 64;
                    int var21 = arg3;
                    if (arg3 < 0) {
                        var21 = 0;
                    } else if (arg3 >= 104) {
                        var21 = 104;
                    }
                    int var22 = arg1;
                    if (var20 < 0) {
                        var20 = 0;
                    } else if (var20 >= 104) {
                        var20 = 104;
                    }
                    int var23 = arg1 + 64;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 >= 104) {
                        var23 = 104;
                    }
                    if (arg1 < 0) {
                        var22 = 0;
                    } else if (arg1 >= 104) {
                        var22 = 104;
                    }
                    while (var20 > var21) {
                        while (var23 > var22) {
                            class187.field2783[var18][var21][var22] = class187.field2783[var18 - 1][var21][var22];
                            var22++;
                        }
                        var21++;
                    }
                }
            }
            var16 = true;
        }
        if (class117.field1817 && !arg2) {
            class183 var33 = null;
            label271: while (true) {
                int var35;
                label264: do {
                    while (var12.field4025 < var12.field3986.length) {
                        int var34 = var12.method1787(false);
                        if (var34 != 0) {
                            if (var34 != 1) {
                                throw new IllegalStateException();
                            }
                            var35 = var12.method1787(false);
                            continue label264;
                        }
                        var33 = new class183(var12);
                    }
                    if (var33 == null) {
                        var33 = new class183();
                    }
                    for (int var41 = 0; var41 < 8; var41++) {
                        for (int var42 = 0; var42 < 8; var42++) {
                            int var43 = (arg3 >> 3) + var41;
                            int var44 = (arg1 >> 3) + var42;
                            if (var43 >= 0 && var43 < 13 && var44 >= 0 && var44 < 13) {
                                class38.field462[var43][var44] = var33;
                            }
                        }
                    }
                    break label271;
                } while (var35 <= 0);
                for (int var36 = 0; var36 < var35; var36++) {
                    class266 var37 = new class266(var12);
                    if (var37.field4081 == 31) {
                        class234 var38 = class155.method1107(var12.method1830((byte) -77), true);
                        var37.method1867(var38.field3509, 1002, var38.field3517, var38.field3513, var38.field3521);
                    }
                    var37.field4088 += arg3 << 7;
                    var37.field4074 += arg1 << 7;
                    int var39 = var37.field4088 >> 7;
                    int var40 = var37.field4074 >> 7;
                    if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                        var37.field4086 = (class179.field2645[1][var39][var40] & 0x2) != 0;
                        var37.field4092 = class294.field4502[var37.field4076][var39][var40] - var37.field4092;
                        class31.method212(var37);
                    }
                }
            }
        }
        if (var16) {
            return;
        }
        for (int var45 = 0; var45 < 4; var45++) {
            for (int var46 = 0; var46 < 16; var46++) {
                for (int var47 = 0; var47 < 16; var47++) {
                    int var48 = (arg3 >> 2) + var46;
                    int var49 = (arg1 >> 2) + var47;
                    if (var48 >= 0 && var48 < 26 && var49 >= 0 && var49 < 26) {
                        class187.field2783[var45][var48][var49] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)[B", line = 802)
    public final byte[] method1441(int arg0, byte arg1, int arg2) {
        if (arg1 != -44) {
            method1462((byte) 34, (class329) null);
        }
        field3196++;
        return this.method1459(false, arg2, arg0, (int[]) null);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IB)[I", line = 814)
    public final int[] method1442(int arg0, byte arg1) {
        field3173++;
        if (!this.method1447((byte) -115, arg0)) {
            return null;
        }
        if (arg1 != 104) {
            this.field3189 = (Object[][]) ((Object[][]) null);
        }
        int[] var3 = this.field3191.field3110[arg0];
        if (var3 == null) {
            var3 = new int[this.field3191.field3119[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V", line = 849)
    private final void method1443(boolean arg0, int arg1) {
        field3185++;
        if (!arg0) {
            field3172 = (class210) null;
        }
        this.field3177.method199(3332, arg1);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZZ)V", line = 863)
    public final void method1444(int arg0, boolean arg1, boolean arg2) {
        field3193++;
        if (!this.method1457((byte) -84)) {
            return;
        }
        if (arg2) {
            this.field3191.field3106 = null;
            this.field3191.field3114 = null;
        }
        if (arg1) {
            this.field3191.field3124 = (int[][]) null;
            this.field3191.field3115 = null;
        }
        if (arg0 != -2519) {
            this.field3177 = (class30) null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I", line = 888)
    public final int method1445(int arg0) {
        if (arg0 != -17371) {
            this.field3182 = (Object[]) null;
        }
        field3158++;
        return this.method1457((byte) -84) ? this.field3191.field3111.length : -1;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 903)
    public static final void method1446(byte arg0, Component arg1) {
        arg1.removeMouseListener(class186.field2779);
        arg1.removeMouseMotionListener(class186.field2779);
        arg1.removeFocusListener(class186.field2779);
        class132.field2035 = 0;
        field3157++;
        if (arg0 != -40) {
            field3183 = 104;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)Z", line = 920)
    private final boolean method1447(byte arg0, int arg1) {
        field3170++;
        if (!this.method1457((byte) -84)) {
            return false;
        }
        if (arg0 > -68) {
            this.field3177 = (class30) null;
        }
        if (arg1 >= 0 && arg1 < this.field3191.field3111.length && this.field3191.field3111[arg1] != 0) {
            return true;
        } else if (class60.field795) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLjava/lang/String;)I", line = 947)
    public final int method1448(byte arg0, String arg1) {
        field3164++;
        if (!this.method1457((byte) -84)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3191.field3106.method35(class292.method2049(-1651558971, var3), -1888);
        if (this.method1447((byte) -125, var4)) {
            return arg0 == 10 ? var4 : -27;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BII)[B", line = 970)
    public final byte[] method1449(byte arg0, int arg1, int arg2) {
        field3163++;
        if (!this.method1456(arg2, arg1, 97)) {
            return null;
        }
        if (this.field3189[arg2] == null || this.field3189[arg2][arg1] == null) {
            boolean var4 = this.method1439((int[]) null, arg2, (byte) 118);
            if (!var4) {
                this.method1461(arg2, (byte) 108);
                boolean var5 = this.method1439((int[]) null, arg2, (byte) 118);
                if (!var5) {
                    return null;
                }
            }
        }
        if (arg0 > -59) {
            field3172 = (class210) null;
        }
        return class67.method446(this.field3189[arg2][arg1], false, false);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(ILjava/lang/String;)I", line = 1004)
    public final int method1450(int arg0, String arg1) {
        field3186++;
        if (arg0 != -23076) {
            this.method1465(true);
        }
        if (this.method1457((byte) -84)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3191.field3106.method35(class292.method2049(-1651558971, var3), -1888);
            return this.method1432(var4, (byte) -15);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 1025)
    public final boolean method1451(String arg0, int arg1) {
        field3176++;
        if (!this.method1457((byte) -84)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 == -64) {
            int var4 = this.field3191.field3106.method35(class292.method2049(arg1 ^ 0x6270CA05, var3), arg1 - 1824);
            return this.method1455(var4, -84);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 1044)
    public static void method1452(int arg0) {
        field3167 = null;
        field3172 = null;
        if (arg0 != 7884) {
            method1452(124);
        }
        field3181 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 1056)
    public final boolean method1453(String arg0, byte arg1, String arg2) {
        field3175++;
        if (!this.method1457((byte) -84)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3191.field3106.method35(class292.method2049(-1651558971, var4), -1888);
        if (!this.method1447((byte) -118, var6)) {
            return false;
        }
        int var7 = this.field3191.field3115[var6].method35(class292.method2049(-1651558971, var5), -1888);
        if (arg1 >= -96) {
            this.method1436((String) null, (String) null, (byte) -29);
        }
        return this.method1463(var6, (byte) -55, var7);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 1084)
    public final void method1454(String arg0, int arg1) {
        field3155++;
        if (!this.method1457((byte) -84)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 < 2) {
            this.method1435((byte) 14);
        }
        int var4 = this.field3191.field3106.method35(class292.method2049(-1651558971, var3), -1888);
        this.method1443(true, var4);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)Z", line = 1102)
    public final boolean method1455(int arg0, int arg1) {
        field3187++;
        if (!this.method1447((byte) -89, arg0)) {
            return false;
        }
        if (arg1 > -40) {
            this.method1439((int[]) null, -6, (byte) -23);
        }
        if (this.field3182[arg0] == null) {
            this.method1461(arg0, (byte) 123);
            return this.field3182[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z", line = 1133)
    private final boolean method1456(int arg0, int arg1, int arg2) {
        int var4 = -55 % ((35 - arg2) / 34);
        field3179++;
        if (!this.method1457((byte) -84)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field3191.field3111.length && arg1 < this.field3191.field3111[arg0]) {
            return true;
        } else if (class60.field795) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)Z", line = 1155)
    private final boolean method1457(byte arg0) {
        field3197++;
        if (this.field3191 == null) {
            this.field3191 = this.field3177.method191(false);
            if (this.field3191 == null) {
                return false;
            }
            this.field3189 = new Object[this.field3191.field3123][];
            this.field3182 = new Object[this.field3191.field3123];
        }
        return arg0 == -84;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(BI)[B", line = 1176)
    public final byte[] method1458(byte arg0, int arg1) {
        field3168++;
        if (!this.method1457((byte) -84)) {
            return null;
        } else if (this.field3191.field3111.length == 1) {
            return this.method1441(arg1, (byte) -44, 0);
        } else if (this.method1447((byte) -89, arg1)) {
            if (arg0 != -96) {
                this.method1464((byte) -51, -54);
            }
            if (this.field3191.field3111[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method1441(0, (byte) -44, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZII[I)[B", line = 1208)
    public final byte[] method1459(boolean arg0, int arg1, int arg2, int[] arg3) {
        field3199++;
        if (!this.method1456(arg1, arg2, -22)) {
            return null;
        }
        if (this.field3189[arg1] == null || this.field3189[arg1][arg2] == null) {
            boolean var5 = this.method1439(arg3, arg1, (byte) 118);
            if (!var5) {
                this.method1461(arg1, (byte) -51);
                boolean var6 = this.method1439(arg3, arg1, (byte) 118);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class67.method446(this.field3189[arg1][arg2], false, arg0);
        if (this.field3159) {
            this.field3189[arg1][arg2] = null;
            if (this.field3191.field3111[arg1] == 1) {
                this.field3189[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 1253)
    public static final boolean method1460(String arg0, byte arg1, String arg2) {
        field3156++;
        int var3 = arg2.length();
        if (arg1 >= -90) {
            return false;
        }
        int var4 = arg0.length();
        if (var4 > var3) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg2.charAt(var5);
            char var7 = arg0.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(IB)V", line = 1290)
    private final void method1461(int arg0, byte arg1) {
        if (this.field3178) {
            this.field3182[arg0] = this.field3177.method195(5072, arg0);
        } else {
            this.field3182[arg0] = class123.method890(false, this.field3177.method195(5072, arg0), -12641);
        }
        field3162++;
        int var3 = 117 / ((51 - arg1) / 33);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLf;)V", line = 1304)
    public static final void method1462(byte arg0, class329 arg1) {
        field3180++;
        class329 var2 = class193.method1333((byte) -35, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class251.field3747;
            var4 = class136.field2071;
        } else {
            var3 = var2.field4994;
            var4 = var2.field5018;
        }
        if (arg0 == 62) {
            class300.method2084(false, var3, arg1, var4, (byte) -5);
            class8.method32(var4, var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lwc;ZZ)V", line = 1335)
    public class210(class30 arg0, boolean arg1, boolean arg2) {
        this.field3178 = arg1;
        this.field3177 = arg0;
        this.field3159 = arg2;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IBI)Z", line = 1346)
    public final boolean method1463(int arg0, byte arg1, int arg2) {
        field3188++;
        if (!this.method1456(arg0, arg2, 71)) {
            return false;
        } else if (this.field3189[arg0] == null || this.field3189[arg0][arg2] == null) {
            if (arg1 != -55) {
                this.method1454((String) null, 12);
            }
            if (this.field3182[arg0] == null) {
                this.method1461(arg0, (byte) -6);
                return this.field3182[arg0] != null;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(BI)I", line = 1373)
    public final int method1464(byte arg0, int arg1) {
        field3190++;
        if (arg0 < 10) {
            this.method1444(108, true, false);
        }
        return this.method1447((byte) -100, arg1) ? this.field3191.field3111[arg1] : 0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)Z", line = 1388)
    public final boolean method1465(boolean arg0) {
        field3169++;
        if (!this.method1457((byte) -84)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0) {
            return false;
        }
        while (this.field3191.field3122.length > var3) {
            int var4 = this.field3191.field3122[var3];
            if (this.field3182[var4] == null) {
                this.method1461(var4, (byte) -1);
                if (this.field3182[var4] == null) {
                    var2 = false;
                }
            }
            var3++;
        }
        return var2;
    }
}
