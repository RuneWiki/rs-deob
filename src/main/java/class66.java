import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class66 extends class61 {

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public int field1248 = 0;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "Leb;")
    public static class230 field1261 = class68.method589(0, "Angreifen");

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "Lth;")
    public class109 field1252;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "Lbf;")
    public class194 field1256;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Ltj;")
    public class260 field1247;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Le;")
    public class64 field1235;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "Le;")
    public class64 field1250;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "Z")
    public boolean field1245;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "[I")
    public int[] field1242;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "[Lge;")
    public static class69[] field1234;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "[[I")
    public static int[][] field1254;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([IIIIII)V")
    public static final void method577(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class233 var6 = class53.field916[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class36 var7 = var6.field4051;
        if (var7 != null) {
            int var8 = var7.field670;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class224 var10 = var6.field4066;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3872;
        int var12 = var10.field3873;
        int var13 = var10.field3864;
        int var14 = var10.field3860;
        int[] var15 = class35.field664[var11];
        int[] var16 = class8.field150[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)V")
    public static final void method578(int arg0, byte arg1, int arg2) {
        field1241++;
        if (arg1 == -62) {
            class197 var3 = class164.method1228(12, arg0, -1665874464);
            var3.method1402((byte) -102);
            var3.field3527 = arg2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILkk;)Lfb;")
    public static final class29 method579(int arg0, int arg1, class223 arg2) {
        byte[] var3 = arg2.method1543(false, arg1);
        field1238++;
        if (arg0 != 0) {
            method584(-105);
        }
        return var3 == null ? null : new class29(var3);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static final void method580(int arg0) {
        field1246++;
        int var1 = class183.field3182.method971(arg0 - 110, arg0);
        if (class169.field2984 > var1) {
            for (int var2 = var1; var2 < class169.field2984; var2++) {
                class234.field4080[class216.field3736++] = class233.field4042[var2];
            }
        }
        if (class169.field2984 < var1) {
            throw new RuntimeException("gppov1");
        }
        class169.field2984 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class233.field4042[var3];
            class260 var5 = class230.field4011[var4];
            int var6 = class183.field3182.method971(-80, 1);
            if (var6 == 0) {
                class233.field4042[class169.field2984++] = var4;
                var5.field2256 = class259.field4584;
            } else {
                int var7 = class183.field3182.method971(-74, 2);
                if (var7 == 0) {
                    class233.field4042[class169.field2984++] = var4;
                    var5.field2256 = class259.field4584;
                    class121.field2132[class105.field1911++] = var4;
                } else if (var7 == 1) {
                    class233.field4042[class169.field2984++] = var4;
                    var5.field2256 = class259.field4584;
                    int var8 = class183.field3182.method971(-94, 3);
                    var5.method1011(false, (byte) -80, var8);
                    int var9 = class183.field3182.method971(arg0 ^ 0xFFFFFFAD, 1);
                    if (var9 == 1) {
                        class121.field2132[class105.field1911++] = var4;
                    }
                } else if (var7 == 2) {
                    class233.field4042[class169.field2984++] = var4;
                    var5.field2256 = class259.field4584;
                    int var10 = class183.field3182.method971(-97, 3);
                    var5.method1011(true, (byte) -97, var10);
                    int var11 = class183.field3182.method971(-59, 3);
                    var5.method1011(true, (byte) -122, var11);
                    int var12 = class183.field3182.method971(-47, 1);
                    if (var12 == 1) {
                        class121.field2132[class105.field1911++] = var4;
                    }
                } else if (var7 == 3) {
                    class234.field4080[class216.field3736++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static void method581(boolean arg0) {
        field1234 = null;
        field1254 = null;
        field1261 = null;
        if (!arg0) {
            field1240 = -29;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public final void method582(boolean arg0) {
        if (arg0) {
            this.field1237 = 70;
        }
        field1260++;
        int var2 = this.field1255;
        if (this.field1256 != null) {
            class194 var5 = this.field1256.method1385((byte) 39);
            if (var5 == null) {
                this.field1249 = 0;
                this.field1242 = null;
                this.field1258 = 0;
                this.field1253 = 0;
                this.field1255 = -1;
            } else {
                this.field1258 = var5.field3464 * 128;
                this.field1255 = var5.field3446;
                this.field1242 = var5.field3442;
                this.field1253 = var5.field3489;
                this.field1249 = var5.field3471;
            }
        } else if (this.field1252 != null) {
            int var3 = class13.method138(this.field1252, -3217);
            if (var2 != var3) {
                this.field1255 = var3;
                class97 var4 = this.field1252.field1956;
                if (var4.field1787 != null) {
                    var4 = var4.method825((byte) -48);
                }
                if (var4 == null) {
                    this.field1258 = 0;
                } else {
                    this.field1258 = var4.field1743 * 128;
                }
            }
        } else if (this.field1247 != null) {
            this.field1255 = class60.method512(2183, this.field1247);
            this.field1258 = this.field1247.field4589 * 128;
        }
        if (this.field1255 != var2 && this.field1235 != null) {
            class117.field2096.method1682(this.field1235);
            this.field1235 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
    public static final void method583(byte arg0) {
        field1244++;
        int var1 = class53.field920;
        int var2 = class275.field4826;
        int var3 = class218.field3759;
        int var4 = 6116423;
        int var5 = class30.field555;
        if (arg0 != 27) {
            return;
        }
        class87.method705(var5, var2, var1, var3, var4);
        class87.method705(var5 + 1, var2 + 1, var1 - 2, 16, 0);
        class87.method713(var5 + 1, var2 - -18, var1 - 2, var3 + -19, 0);
        class76.field1382.method800(class155.field2756, var5 + 3, var2 - -14, var4, -1);
        int var6 = class34.field620;
        int var7 = class251.field4497;
        for (int var8 = 0; var8 < class186.field3266; var8++) {
            int var9 = 16777215;
            int var10 = (class186.field3266 - var8 - 1) * 15 + var2 + 31;
            if (var5 < var6 && var6 < (var1 + var5) && var7 > var10 - 13 && var10 + 3 > var7) {
                var9 = 16776960;
            }
            class76.field1382.method800(class158.method1201(false, var8), var5 + 3, var10, var9, 0);
        }
        class35.method324(0, class30.field555, class275.field4826, class53.field920, class218.field3759);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static final void method584(int arg0) {
        int var1 = 0;
        if (arg0 <= 120) {
            method584(-93);
        }
        while (class225.field3889 > var1) {
            class210 var2 = class125.method983((byte) 127, var1);
            if (var2 != null && var2.field3672 == 0) {
                class225.field3887[var1] = 0;
                class99.field1838[var1] = 0;
            }
            var1++;
        }
        field1236++;
        class138.field2464 = new class46(16);
    }
}
