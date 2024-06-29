import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class440 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "[Lil;")
    public class586[] field6361 = null;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lfp;")
    public class535 field6364 = null;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Lfp;")
    public class535 field6369 = null;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "[Lil;")
    public class586[] field6370 = null;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "Lfp;")
    public class535 field6372 = null;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Z")
    public boolean field6360;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Leda;")
    public static class116 field6362 = new class116(10, 6);

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Lkga;")
    public static class520 field6367 = new class520("WIP", 2);

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field6368 = 2;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII[B)Z", line = 5)
    public static final boolean method2569(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field6365++;
        boolean var6 = true;
        class465 var7 = new class465(arg5);
        int var8 = -1;
        if (arg2 != 11103) {
            return true;
        }
        label72: while (true) {
            int var9 = var7.method2723(121);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class119 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method2720(-128);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method2705(-120);
                                    }
                                    int var12 = var7.method2720(-127);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method2705(-73) >> 2;
                                    var16 = var14 + arg0;
                                    var17 = var13 + arg3;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (arg4 - 1 <= var16);
                    } while ((arg1 - 1) <= var17);
                    var18 = class14.field224.method2834(0, var8);
                } while (var15 == 22 && !class525.field7713.field5962 && var18.field1903 == 0 && var18.field1921 != 1 && !var18.field1898);
                if (!var18.method959((byte) -56)) {
                    var6 = false;
                    class113.field1806++;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lkfa;)V", line = 230)
    public class440(class382 arg0) {
        this.field6360 = arg0.field5584;
        class109.method894(arg0, 128);
        if (this.field6360) {
            byte[] var2 = class600.method3420(class335.field4673, false, false);
            this.field6364 = new class535(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class600.method3420(class435.field6263, false, false);
            this.field6369 = new class535(arg0, 6410, 128, 128, 16, var3, 6410);
            class266 var4 = arg0.field5458;
            if (var4.method1689((byte) 9)) {
                byte[] var5 = class600.method3420(class691.field9794, false, false);
                this.field6372 = new class535(arg0, 6408, 128, 128, 16);
                class535 var6 = new class535(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1687((byte) -59, 2.0F, var6, this.field6372)) {
                    this.field6372.method2009(9729);
                } else {
                    this.field6372.method2008(-7656);
                    this.field6372 = null;
                }
                var6.method2008(-7656);
                return;
            }
        } else {
            this.field6370 = new class586[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class346.method2106(class335.field4673, -40, 32768, var7 * 128 * 2 * 128);
                this.field6370[var7] = new class586(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field6361 = new class586[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class346.method2106(class435.field6263, -109, 32768, var8 * 128 * 2 * 128);
                this.field6361[var8] = new class586(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIC)C", line = 93)
    public static final char method2570(int arg0, int arg1, char arg2) {
        field6366++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        }
        if (arg0 != -14280) {
            field6371 = -106;
        }
        if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 175)
    public static final void method2571(byte arg0) {
        field6363++;
        int var1 = 63 / ((6 - arg0) / 47);
        if (class623.field8870 != null) {
            class623.field8870.method753(1);
            class623.field8870 = null;
            class171.field2775 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 209)
    public static void method2572(int arg0) {
        int var1 = -61 % ((arg0 + 27) / 38);
        field6362 = null;
        field6367 = null;
    }
}
