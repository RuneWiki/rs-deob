import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class287 {

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field4943 = -1;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lwa;")
    public static class75 field4933 = class66.method560("Ablegen", false);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Z")
    public static boolean field4937 = true;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lwa;")
    public static class75 field4941 = class66.method560("T", false);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field4938 = 0;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lhk;")
    public static class288 field4939;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lpd;")
    public class3 field4942;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[I")
    public int[] field4932;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[I")
    public static int[] field4936;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "[Lwa;")
    public class75[] field4940;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V", line = 3)
    public static final void method2018() {
        class96.field1585 = 0;
        label194: for (int var0 = 0; var0 < class89.field1466; var0++) {
            class202 var1 = class273.field4721[var0];
            if (class65.field1123 != null) {
                for (int var2 = 0; var2 < class65.field1123.length; var2++) {
                    if (class65.field1123[var2] != -1000000 && (var1.field3416 <= class65.field1123[var2] || var1.field3419 <= class65.field1123[var2]) && (var1.field3400 <= class63.field1094[var2] || var1.field3428 <= class63.field1094[var2]) && (var1.field3400 >= class137.field2347[var2] || var1.field3428 >= class137.field2347[var2]) && (var1.field3413 <= class177.field2972[var2] || var1.field3424 <= class177.field2972[var2]) && (var1.field3413 >= class82.field1376[var2] || var1.field3424 >= class82.field1376[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field3401 == 1) {
                int var3 = var1.field3409 + class260.field4359 - class53.field875;
                if (var3 >= 0 && var3 <= class260.field4359 + class260.field4359) {
                    int var4 = var1.field3407 + class260.field4359 - class188.field3131;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3402 + class260.field4359 - class188.field3131;
                    if (var5 > class260.field4359 + class260.field4359) {
                        var5 = class260.field4359 + class260.field4359;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class7.field84[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class199.field3347 - var1.field3400;
                        if (var7 > 32) {
                            var1.field3420 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3420 = 2;
                            var7 = -var7;
                        }
                        var1.field3422 = (var1.field3413 - class207.field3509 << 8) / var7;
                        var1.field3411 = (var1.field3424 - class207.field3509 << 8) / var7;
                        var1.field3414 = (var1.field3416 - class300.field5129 << 8) / var7;
                        var1.field3408 = (var1.field3419 - class300.field5129 << 8) / var7;
                        class274.field4732[class96.field1585++] = var1;
                    }
                }
            } else if (var1.field3401 == 2) {
                int var8 = var1.field3407 + class260.field4359 - class188.field3131;
                if (var8 >= 0 && var8 <= class260.field4359 + class260.field4359) {
                    int var9 = var1.field3409 + class260.field4359 - class53.field875;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3403 + class260.field4359 - class53.field875;
                    if (var10 > class260.field4359 + class260.field4359) {
                        var10 = class260.field4359 + class260.field4359;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class7.field84[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class207.field3509 - var1.field3413;
                        if (var12 > 32) {
                            var1.field3420 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3420 = 4;
                            var12 = -var12;
                        }
                        var1.field3423 = (var1.field3400 - class199.field3347 << 8) / var12;
                        var1.field3406 = (var1.field3428 - class199.field3347 << 8) / var12;
                        var1.field3414 = (var1.field3416 - class300.field5129 << 8) / var12;
                        var1.field3408 = (var1.field3419 - class300.field5129 << 8) / var12;
                        class274.field4732[class96.field1585++] = var1;
                    }
                }
            } else if (var1.field3401 == 4) {
                int var13 = var1.field3416 - class300.field5129;
                if (var13 > 128) {
                    int var14 = var1.field3407 + class260.field4359 - class188.field3131;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3402 + class260.field4359 - class188.field3131;
                    if (var15 > class260.field4359 + class260.field4359) {
                        var15 = class260.field4359 + class260.field4359;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3409 + class260.field4359 - class53.field875;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3403 + class260.field4359 - class53.field875;
                        if (var17 > class260.field4359 + class260.field4359) {
                            var17 = class260.field4359 + class260.field4359;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class7.field84[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3420 = 5;
                            var1.field3423 = (var1.field3400 - class199.field3347 << 8) / var13;
                            var1.field3406 = (var1.field3428 - class199.field3347 << 8) / var13;
                            var1.field3422 = (var1.field3413 - class207.field3509 << 8) / var13;
                            var1.field3411 = (var1.field3424 - class207.field3509 << 8) / var13;
                            class274.field4732[class96.field1585++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([BI)[B", line = 228)
    public static final byte[] method2019(byte[] arg0, int arg1) {
        field4935++;
        if (arg0 == null) {
            return null;
        }
        byte[] var2 = new byte[arg0.length];
        if (arg1 != -18050) {
            method2018();
        }
        class231.method1687(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 251)
    public static void method2020(int arg0) {
        field4941 = null;
        int var1 = -23 % ((arg0 - 55) / 61);
        field4939 = null;
        field4936 = null;
        field4933 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Lmj;", line = 270)
    public static final class217 method2021(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        return var3 == null || var3.field4092 == null ? null : var3.field4092;
    }
}
