import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class64 {

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Lhf;")
    public class287 field979 = new class287();

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Ltl;")
    public static class59 field986 = class85.method639("::clientjs5drop", 9588);

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field983 = 0;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field985 = 0;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Ltl;")
    public static class59 field975 = class85.method639(" ", 9588);

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field992 = 0;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Lhf;")
    private class287 field994;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "[[[Lcd;")
    public static class245[][][] field990;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V", line = 11)
    public static final void method524(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class105.field1732; var3++) {
            for (int var4 = 0; var4 < class120.field2000; var4++) {
                for (int var5 = 0; var5 < class78.field1244; var5++) {
                    class245 var6 = class120.field2010[var3][var4][var5];
                    if (var6 != null) {
                        class201 var7 = var6.field4098;
                        if (var7 != null && var7.field3323.method1310()) {
                            class77.method605(var7.field3323, var3, var4, var5, 1, 1);
                            if (var7.field3326 != null && var7.field3326.method1310()) {
                                class77.method605(var7.field3326, var3, var4, var5, 1, 1);
                                var7.field3323.method1307(var7.field3326, 0, 0, 0, false);
                                var7.field3326 = var7.field3326.method1309(arg0, arg1, arg2);
                            }
                            var7.field3323 = var7.field3323.method1309(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4092; var8++) {
                            class165 var9 = var6.field4107[var8];
                            if (var9 != null && var9.field2688.method1310()) {
                                class77.method605(var9.field2688, var3, var4, var5, var9.field2681 + 1 - var9.field2682, var9.field2676 - var9.field2670 + 1);
                                var9.field2688 = var9.field2688.method1309(arg0, arg1, arg2);
                            }
                        }
                        class296 var10 = var6.field4085;
                        if (var10 != null && var10.field5073.method1310()) {
                            class96.method722(var10.field5073, var3, var4, var5);
                            var10.field5073 = var10.field5073.method1309(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 81)
    public static final void method525(byte arg0) {
        if (class317.field5350[96]) {
            class105.field1741 += (-class105.field1741 - 24) / 2;
        } else if (class317.field5350[97]) {
            class105.field1741 += (24 - class105.field1741) / 2;
        } else {
            class105.field1741 /= 2;
        }
        class213.field3489 += class105.field1741 / 2;
        field980++;
        if (arg0 > -79) {
            return;
        }
        if (class317.field5350[98]) {
            class287.field4934 += (12 - class287.field4934) / 2;
        } else if (class317.field5350[99]) {
            class287.field4934 += (-class287.field4934 - 12) / 2;
        } else {
            class287.field4934 /= 2;
        }
        class124.field2057 += class287.field4934 / 2;
        int var1 = class4.field56 + class286.field4920.field1774;
        int var2 = class193.field3210 + class286.field4920.field1769;
        if (class238.field3975 - var1 < -500 || (class238.field3975 - var1) > 500 || (class265.field4583 - var2) < -500 || (class265.field4583 - var2) > 500) {
            class265.field4583 = var2;
            class238.field3975 = var1;
        }
        if (class238.field3975 != var1) {
            class238.field3975 += (var1 - class238.field3975) / 16;
        }
        if (class265.field4583 != var2) {
            class265.field4583 += (var2 - class265.field4583) / 16;
        }
        class140.method1023(true);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)Lhf;", line = 141)
    public final class287 method526(byte arg0) {
        class287 var2 = this.field979.field4939;
        field976++;
        if (this.field979 == var2) {
            return null;
        } else {
            int var3 = 35 % ((55 - arg0) / 47);
            var2.method2000(127);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 158)
    public static void method527(int arg0) {
        field990 = (class245[][][]) null;
        field986 = null;
        field975 = null;
        if (arg0 != -15523) {
            field983 = -119;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 170)
    public static final void method528(int arg0) {
        field982++;
        if (class120.field2005 < 0) {
            class120.field2005 = 0;
            class69.field1065 = -1;
            class119.field1942 = -1;
        }
        int var1 = -85 % ((arg0 - 62) / 59);
        if (class62.field966 < class120.field2005) {
            class69.field1065 = -1;
            class119.field1942 = -1;
            class120.field2005 = class62.field966;
        }
        if (class100.field1624 < 0) {
            class119.field1942 = -1;
            class100.field1624 = 0;
            class69.field1065 = -1;
        }
        if (class216.field3532 < class100.field1624) {
            class119.field1942 = -1;
            class100.field1624 = class216.field3532;
            class69.field1065 = -1;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)Lhf;", line = 214)
    public final class287 method529(boolean arg0) {
        field972++;
        class287 var2 = this.field979.field4941;
        if (this.field979 == var2) {
            this.field994 = null;
            return null;
        }
        this.field994 = var2.field4941;
        if (arg0) {
            this.method535(57);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 239)
    public final void method530(int arg0) {
        if (arg0 != -15068) {
            return;
        }
        field978++;
        while (true) {
            class287 var2 = this.field979.field4939;
            if (this.field979 == var2) {
                this.field994 = null;
                return;
            }
            var2.method2000(126);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILme;)V", line = 266)
    public static final void method531(int arg0, class295 arg1) {
        field993++;
        if (class248.field4140) {
            return;
        }
        if (class55.field815) {
            class240.method1678();
        } else {
            class272.method1903();
        }
        class131.field2168 = class162.method1152(class185.field3106, -65, arg1);
        int var2 = class53.field792;
        if (arg0 != 21924) {
            method538(false);
        }
        int var3 = var2 * 956 / 503;
        class131.field2168.method332((class152.field2498 - var3) / 2, 0, var3, var2);
        class155.field2536 = class127.method935(arg1, -7, class9.field126);
        class155.field2536.method38(class152.field2498 / 2 - (class155.field2536.field3162 / 2), 18);
        class248.field4140 = true;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILhf;)V", line = 294)
    public final void method532(int arg0, class287 arg1) {
        field987++;
        if (arg1.field4941 != null) {
            arg1.method2000(124);
        }
        arg1.field4939 = this.field979;
        arg1.field4941 = this.field979.field4941;
        arg1.field4941.field4939 = arg1;
        if (arg0 < 51) {
            field992 = -90;
        }
        arg1.field4939.field4941 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)Lhf;", line = 312)
    public final class287 method533(int arg0) {
        field977++;
        if (arg0 != 24) {
            field990 = (class245[][][]) ((class245[][][]) null);
        }
        class287 var2 = this.field994;
        if (this.field979 == var2) {
            this.field994 = null;
            return null;
        } else {
            this.field994 = var2.field4939;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lhf;Z)V", line = 333)
    public final void method534(class287 arg0, boolean arg1) {
        field991++;
        if (arg0.field4941 != null) {
            arg0.method2000(124);
        }
        if (!arg1) {
            arg0.field4939 = this.field979.field4939;
            arg0.field4941 = this.field979;
            arg0.field4941.field4939 = arg0;
            arg0.field4939.field4941 = arg0;
        }
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)Lhf;", line = 359)
    public final class287 method535(int arg0) {
        field988++;
        if (arg0 != 29548) {
            method537(-75, 107, true);
        }
        class287 var2 = this.field994;
        if (this.field979 == var2) {
            this.field994 = null;
            return null;
        } else {
            this.field994 = var2.field4941;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)Lhf;", line = 379)
    public final class287 method536(int arg0) {
        field981++;
        class287 var2 = this.field979.field4939;
        if (this.field979 == var2) {
            this.field994 = null;
            return null;
        } else {
            this.field994 = var2.field4939;
            return arg0 == 2 ? var2 : (class287) null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIZ)V", line = 418)
    public static final void method537(int arg0, int arg1, boolean arg2) {
        short var3 = 256;
        int var4 = 0;
        field989++;
        int var5 = 0;
        if (class11.field142 > 0) {
            class20.method133((byte) 120, class11.field142);
            class11.field142 = 0;
        }
        int var6 = class272.field4704 * arg0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class169.field2727[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class272.field4709[var6++ + arg1];
                int var11 = class156.field2557[var4++];
                if (var11 == 0) {
                    class59.field919.field757[var5++] = var10;
                } else {
                    int var12 = var11 + 18;
                    int var13 = 256 - var11 - 18;
                    int var14 = class223.field3612[var11];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    class59.field919.field757[var5++] = class93.method680(var13 * class93.method680(16711935, var10) + class93.method680(16711935, var14) * var12, -16711936) + class93.method680(16711680, var13 * class93.method680(65280, var10) + var12 * class93.method680(65280, var14)) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class59.field919.field757[var5++] = class272.field4709[var6++ + arg1];
            }
            var6 += class272.field4704 - 128;
        }
        if (!arg2) {
            method527(-73);
        }
        class59.field919.method341(arg1, arg0);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(Z)V", line = 505)
    public static final void method538(boolean arg0) {
        if (arg0) {
            field992 = -91;
        }
        field973++;
        class234.field3888.method1768(true, 201);
        class234.field3888.method1237(true, class101.field1653);
        class45.field724++;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 532)
    public class64() {
        this.field979.field4941 = this.field979;
        this.field979.field4939 = this.field979;
    }
}
