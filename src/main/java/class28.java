import java.security.MessageDigest;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class28 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Z")
    private boolean field353 = false;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public int field360 = -1;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public int field354 = -1;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public int field381 = 2;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "Z")
    public boolean field377 = false;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public int field383 = 5;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public int field384 = -1;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public int field382 = -1;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public int field357 = -1;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public int field375 = 99;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "Lwa;")
    public static class75 field378 = null;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field364 = 0;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "Lwa;")
    public static class75 field370 = class66.method560("Cabbage", false);

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lgb;")
    public static class158 field362 = new class158(64);

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field392 = 0;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "[I")
    public static int[] field399 = new int[] { 0, 5, 0, 6, -1, -2, 0, 0, -2, 0, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 1, 0, 0, 0, 6, 10, 14, 0, 6, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, -1, 0, 0, 6, 5, 7, 0, -1, 0, 0, 0, 0, 0, 0, 3, 0, 0, 4, 14, -1, 0, 0, 0, 0, 0, 0, 10, 0, -2, 0, 3, -1, 0, 7, 0, 0, -1, 8, 24, 0, 0, 0, 0, 4, 0, 0, 3, 0, 0, 0, 6, 0, 0, -1, 0, -1, -2, 0, -1, -1, 0, -2, 0, 8, 6, 0, 0, 0, 0, 0, 5, 12, 0, 0, 0, 0, 0, 0, 0, 0, 7, 5, 0, 1, 10, 0, 0, 0, 0, 0, 7, 0, 0, 0, -1, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, -2, 2, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 2, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 4, 20, 0, 6, 0, 0, 0, 0, 0, 0, 0, 9, 1, 0, 0, 3, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, -1, 2, 6, -1, -2, 0, -1, 0, 1, 0, -2, 0, 0, -2, 5, 5, 6, 10, 0, 0, 2, 0, 2, 8, 0, 3, 0, 0, 0, 0, 1, 4, 0, 2, 15, 0, 0, -2, 15, 0, 0, 8, 0, -2, 0, 10, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field391 = 50;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "Lwa;")
    public static class75 field397 = class66.method560("leuchten2:", false);

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "[I")
    public static int[] field395 = new int[field391];

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "[I")
    public static int[] field390 = new int[field391];

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "[I")
    public static int[] field394 = new int[field391];

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "[I")
    public static int[] field398 = new int[field391];

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "[I")
    public static int[] field396 = new int[field391];

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "[I")
    public static int[] field393 = new int[field391];

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "[I")
    public static int[] field389 = new int[field391];

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "[Lwa;")
    public static class75[] field388 = new class75[field391];

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[I")
    private int[] field358;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "[I")
    public int[] field361;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "[I")
    public int[] field368;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "[I")
    private int[] field379;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[Lje;")
    public static class68[] field356;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "[[I")
    public int[][] field367;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 7)
    public static void method180(byte arg0) {
        field394 = null;
        if (arg0 != -45) {
            return;
        }
        field398 = null;
        field370 = null;
        field356 = null;
        field396 = null;
        field378 = null;
        field362 = null;
        field399 = null;
        field395 = null;
        field397 = null;
        field393 = null;
        field388 = null;
        field390 = null;
        field389 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 38)
    public static final void method181(int arg0) {
        if (class13.field171 != null) {
            class32 var1 = class13.field171;
            synchronized (class13.field171) {
                class13.field171 = null;
            }
        }
        if (arg0 >= -10) {
            field395 = (int[]) null;
        }
        field363++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILwa;)Z", line = 58)
    public static final boolean method182(int arg0, class75 arg1) {
        field385++;
        try {
            int var2 = arg1.method612(arg0 - 22047, 44);
            if (var2 == -1) {
                return false;
            }
            class75 var3 = arg1.method661(109, 0, var2);
            class75 var4 = arg1.method650(arg0 + 10353, var2 - -1);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method659(false));
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method616(0);
            class60 var8 = new class60(5000);
            var8.method494(var7, (byte) 100, 0, var7.length);
            var8.field1012 = 0;
            var8.method482(class261.field4364, -1898615740, class157.field2688);
            if (var8.field997[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field997[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            if (arg0 != -10353) {
                field399 = (int[]) null;
            }
            return true;
        } catch (Exception var11) {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V", line = 114)
    public static final void method183(byte arg0) {
        if (arg0 <= 66) {
            field398 = (int[]) null;
        }
        field380++;
        class47.method346();
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        if (class299.field5117 != null) {
            class39.method264(class210.field3585, class299.field5117, (byte) 16);
        }
        class299.field5117 = null;
        class29.method198(0, 765);
        class278.method1972(113);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lja;B)V", line = 134)
    public final void method184(class60 arg0, byte arg1) {
        if (arg1 != 58) {
            return;
        }
        while (true) {
            int var3 = arg0.method501(arg1 ^ 0x3A);
            if (var3 == 0) {
                field369++;
                return;
            }
            this.method190(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBLcc;)Lcc;", line = 159)
    public final class234 method185(int arg0, byte arg1, class234 arg2) {
        int var4 = this.field368[arg0];
        field387++;
        class176 var5 = class79.method672(var4 >> 16, 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method419(true, true);
        }
        if (arg1 != -7) {
            field398 = (int[]) null;
        }
        class234 var7 = arg2.method419(!var5.method1302((byte) -127, var6), !this.field353);
        var7.method418(var5, var6, this.field353);
        return var7;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V", line = 179)
    public final void method186(byte arg0) {
        if (arg0 <= 50) {
            field366 = -69;
        }
        field355++;
        if (this.field354 == -1) {
            if (this.field379 == null) {
                this.field354 = 0;
            } else {
                this.field354 = 2;
            }
        }
        if (this.field357 != -1) {
            return;
        }
        if (this.field379 == null) {
            this.field357 = 0;
        } else {
            this.field357 = 2;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILcc;I)Lcc;", line = 211)
    public final class234 method187(int arg0, class234 arg1, int arg2) {
        field372++;
        int var4 = this.field368[arg0];
        class176 var5 = class79.method672(var4 >> 16, 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method451(true, true);
        } else {
            class234 var7 = arg1.method451(!var5.method1302((byte) -109, var6), !this.field353);
            int var8 = 5 % ((-arg2 - 29) / 63);
            var7.method418(var5, var6, this.field353);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lre;III)V", line = 235)
    public static final void method188(class262 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2) {
            field396 = (int[]) null;
        }
        if (arg0.field4379 == 0) {
            arg0.field4439 = arg0.field4500;
        } else if (arg0.field4379 == 1) {
            arg0.field4439 = (arg2 - arg0.field4517) / 2 + arg0.field4500;
        } else if (arg0.field4379 == 2) {
            arg0.field4439 = arg2 - arg0.field4517 - arg0.field4500;
        } else if (arg0.field4379 == 3) {
            arg0.field4439 = arg0.field4500 * arg2 >> 14;
        } else if (arg0.field4379 == 4) {
            arg0.field4439 = (arg0.field4500 * arg2 >> 14) + (arg2 - arg0.field4517) / 2;
        } else {
            arg0.field4439 = arg2 - (arg0.field4500 * arg2 >> 14) - arg0.field4517;
        }
        field376++;
        if (arg0.field4539 == 0) {
            arg0.field4521 = arg0.field4486;
        } else if (arg0.field4539 == 1) {
            arg0.field4521 = (arg3 - arg0.field4531) / 2 + arg0.field4486;
        } else if (arg0.field4539 == 2) {
            arg0.field4521 = arg3 - arg0.field4531 - arg0.field4486;
        } else if (arg0.field4539 == 3) {
            arg0.field4521 = arg0.field4486 * arg3 >> 14;
        } else if (arg0.field4539 == 4) {
            arg0.field4521 = (arg3 - arg0.field4531) / 2 + (arg0.field4486 * arg3 >> 14);
        } else {
            arg0.field4521 = arg3 - arg0.field4531 - (arg0.field4486 * arg3 >> 14);
        }
        if (!class214.field3662 || !(client.method1734(arg0) != 0 || arg0.field4441 == 0)) {
            return;
        }
        if (arg0.field4439 < 0) {
            arg0.field4439 = 0;
        } else if (arg0.field4517 + arg0.field4439 > arg2) {
            arg0.field4439 = arg2 - arg0.field4517;
        }
        if (arg0.field4521 < 0) {
            arg0.field4521 = 0;
        } else if (arg0.field4531 + arg0.field4521 > arg3) {
            arg0.field4521 = arg3 - arg0.field4531;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILhj;IILcc;)Lcc;", line = 309)
    public final class234 method189(int arg0, class28 arg1, int arg2, int arg3, class234 arg4) {
        int var6 = this.field368[arg3];
        field359++;
        class176 var7 = class79.method672(var6 >> 16, 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method185(arg0, (byte) -7, arg4);
        }
        int var9 = arg1.field368[arg0];
        class176 var10 = class79.method672(var9 >> 16, 16);
        int var11 = var9 & arg2;
        if (var10 == null) {
            class234 var12 = arg4.method419(!var7.method1302((byte) -102, var8), !this.field353);
            var12.method418(var7, var8, this.field353);
            return var12;
        } else {
            class234 var13 = arg4.method419(!var7.method1302((byte) -124, var8) & !var10.method1302((byte) -91, var11), !arg1.field353 & !this.field353);
            var13.method441(var7, var8, var10, var11, this.field379, this.field353 | arg1.field353);
            return var13;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lja;IZ)V", line = 353)
    private final void method190(class60 arg0, int arg1, boolean arg2) {
        field386++;
        if (arg1 == 1) {
            int var13 = arg0.method485((byte) -2);
            this.field361 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field361[var14] = arg0.method485((byte) -2);
            }
            this.field368 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field368[var15] = arg0.method485((byte) -2);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field368[var16] += arg0.method485((byte) -2) << 16;
            }
        } else if (arg1 == 2) {
            this.field384 = arg0.method485((byte) -2);
        } else if (arg1 == 3) {
            int var4 = arg0.method501(0);
            this.field379 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field379[var5] = arg0.method501(0);
            }
            this.field379[var4] = 9999999;
        } else if (arg1 == 4) {
            this.field377 = true;
        } else if (arg1 == 5) {
            this.field383 = arg0.method501(0);
        } else if (arg1 == 6) {
            this.field360 = arg0.method485((byte) -2);
        } else if (arg1 == 7) {
            this.field382 = arg0.method485((byte) -2);
        } else if (arg1 == 8) {
            this.field375 = arg0.method501(0);
        } else if (arg1 == 9) {
            this.field354 = arg0.method501(0);
        } else if (arg1 == 10) {
            this.field357 = arg0.method501(0);
        } else if (arg1 == 11) {
            this.field381 = arg0.method501(0);
        } else if (arg1 == 12) {
            int var10 = arg0.method501(0);
            this.field358 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field358[var11] = arg0.method485((byte) -2);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field358[var12] = (arg0.method485((byte) -2) << 16) + this.field358[var12];
            }
        } else if (arg1 == 13) {
            int var6 = arg0.method485((byte) -2);
            this.field367 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method501(0);
                if (var8 > 0) {
                    this.field367[var7] = new int[var8];
                    this.field367[var7][0] = arg0.method489(-102);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field367[var7][var9] = arg0.method485((byte) -2);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field353 = true;
        }
        if (arg2) {
            method183((byte) 18);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lna;", line = 518)
    public static final class25 method191(Throwable arg0, String arg1) {
        field373++;
        class25 var2;
        if (arg0 instanceof class25) {
            var2 = (class25) arg0;
            var2.field321 = var2.field321 + ' ' + arg1;
        } else {
            var2 = new class25(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILcc;B)Lcc;", line = 535)
    public final class234 method192(int arg0, class234 arg1, byte arg2) {
        field371++;
        int var4 = this.field368[arg0];
        class176 var5 = class79.method672(var4 >> 16, 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method419(true, true);
        }
        int var7 = 0;
        class176 var8 = null;
        if (this.field358 != null && this.field358.length > arg0) {
            int var9 = this.field358[arg0];
            var8 = class79.method672(var9 >> 16, 16);
            var7 = var9 & 0xFFFF;
        }
        if (arg2 != -96) {
            this.field361 = (int[]) null;
        }
        if (var8 == null || var7 == 65535) {
            class234 var11 = arg1.method419(!var5.method1302((byte) -107, var6), !this.field353);
            var11.method418(var5, var6, this.field353);
            return var11;
        } else {
            class234 var10 = arg1.method419(!var5.method1302((byte) -102, var6) & !var8.method1302((byte) -117, var7), !this.field353);
            var10.method418(var5, var6, this.field353);
            var10.method418(var8, var7, this.field353);
            return var10;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)Lcm;", line = 614)
    public static final class181 method193(byte arg0) {
        field365++;
        byte[] var1 = class42.field687[0];
        if (arg0 != -66) {
            field364 = 24;
        }
        int var2 = class287.field4936[0] * class210.field3590[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class191.field3184[class235.method1710(var1[var4], 255)];
        }
        class181 var5 = new class181(class263.field4571, class76.field1321, class85.field1404[0], class232.field3934[0], class210.field3590[0], class287.field4936[0], var3);
        class235.method1713(0);
        return var5;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILcc;)Lcc;", line = 639)
    public final class234 method194(int arg0, int arg1, int arg2, class234 arg3) {
        field374++;
        int var5 = this.field368[arg2];
        class176 var6 = class79.method672(var5 >> 16, 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method419(true, true);
        }
        int var8 = arg1 & 0x3;
        int var9 = -83 % ((2 - arg0) / 44);
        class234 var10 = arg3.method419(!var6.method1302((byte) -110, var7), !this.field353);
        if (var8 == 1) {
            var10.method454();
        } else if (var8 == 2) {
            var10.method413();
        } else if (var8 == 3) {
            var10.method442();
        }
        var10.method418(var6, var7, this.field353);
        if (var8 == 1) {
            var10.method442();
        } else if (var8 == 2) {
            var10.method413();
        } else if (var8 == 3) {
            var10.method454();
        }
        return var10;
    }
}
