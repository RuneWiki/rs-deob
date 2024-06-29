import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class225 {

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Lpk;")
    private class120 field3407 = new class120();

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lus;")
    public static class1 field3412 = new class1(22, -1);

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Lus;")
    public static class1 field3414 = new class1(6, -2);

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Lck;")
    public static class419 field3415 = new class419(5000);

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "[Z")
    public static boolean[] field3416 = new boolean[200];

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field3418 = 0;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Ldk;")
    public static class326 field3417 = new class326("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Ldk;")
    public static class326 field3419 = new class326("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Lpk;")
    private class120 field3413;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lwh;")
    public static class90 field3402;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Z")
    public final boolean method1440(byte arg0) {
        field3411++;
        int var2 = -63 % ((arg0 - 68) / 57);
        return this.field3407.field1508 == this.field3407;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)Lpk;")
    public final class120 method1441(byte arg0) {
        int var2 = -13 % ((72 - arg0) / 36);
        field3409++;
        class120 var3 = this.field3407.field1509;
        if (this.field3407 == var3) {
            this.field3413 = null;
            return null;
        } else {
            this.field3413 = var3.field1509;
            return var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method1442(int arg0) {
        field3416 = null;
        field3419 = null;
        field3417 = null;
        field3415 = null;
        field3414 = null;
        field3402 = null;
        field3412 = null;
        if (arg0 != 0) {
            method1446(-14);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)Lpk;")
    public final class120 method1443(byte arg0) {
        field3403++;
        class120 var2 = this.field3407.field1508;
        if (this.field3407 == var2) {
            return null;
        }
        var2.method738((byte) -2);
        if (arg0 > -13) {
            field3417 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lpk;B)V")
    public final void method1444(class120 arg0, byte arg1) {
        if (arg0.field1509 != null) {
            arg0.method738((byte) -2);
        }
        field3408++;
        if (arg1 <= 95) {
            this.field3413 = null;
        }
        arg0.field1508 = this.field3407;
        arg0.field1509 = this.field3407.field1509;
        arg0.field1509.field1508 = arg0;
        arg0.field1508.field1509 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lvf;)V")
    public static final void method1445(class94 arg0) {
        if (class480.field6737 >= 65535) {
            return;
        }
        class478.field6712[class480.field6737] = arg0;
        class213.field3212[class480.field6737] = false;
        class480.field6737++;
        int var1 = arg0.field1215;
        if (arg0.field1211) {
            var1 = 0;
        }
        int var2 = arg0.field1215;
        if (arg0.field1206) {
            var2 = class314.field4441 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field2546 + class248.field3674 - arg0.field2557 >> class216.field3242;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field2557 + arg0.field2546 - class248.field3674 >> class216.field3242;
            if (var6 >= class360.field5188) {
                var6 = class360.field5188 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field1203[var4++];
                int var9 = (var8 >>> 8) + (arg0.field2552 + class248.field3674 - arg0.field2557 >> class216.field3242);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class287.field4186) {
                    var10 = class287.field4186 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    long var12 = class337.field4910[var3][var11][var7];
                    if ((var12 & 0xFFFFL) == 0L) {
                        class337.field4910[var3][var11][var7] = var12 | (long) class480.field6737;
                    } else if ((var12 & 0xFFFF0000L) == 0L) {
                        class337.field4910[var3][var11][var7] = var12 | (long) class480.field6737 << 16;
                    } else if ((var12 & 0xFFFF00000000L) == 0L) {
                        class337.field4910[var3][var11][var7] = var12 | (long) class480.field6737 << 32;
                    } else if ((var12 & 0xFFFF000000000000L) == 0L) {
                        class337.field4910[var3][var11][var7] = var12 | (long) class480.field6737 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static final void method1446(int arg0) {
        field3410++;
        if (class314.field4438.method1176(class437.field6083, arg0 ^ 0x6E1E) != 2) {
            return;
        }
        byte var1 = (byte) (class492.field6932 - 4 & 0xFF);
        int var2 = class492.field6932 % class58.field758;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class287.field4181; var16++) {
                class177.field2545[var3][var2][var16] = var1;
            }
        }
        if (class29.field394 == 3) {
            return;
        }
        if (arg0 != 28191) {
            method1445((class94) null);
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class69.field875[var4] = -1000000;
            class320.field4633[var4] = 1000000;
            class34.field444[var4] = 0;
            class30.field405[var4] = 1000000;
            class421.field5881[var4] = 0;
        }
        if (class136.field1807 != 1) {
            int var5 = class132.method835(class343.field4996, class29.field394, class490.field6904, arg0 - 26189);
            if ((var5 - class134.field1778) < 800 && (class413.field5813[class29.field394][class490.field6904 >> 7][class343.field4996 >> 7] & 0x4) != 0) {
                class321.method2053(class343.field4996 >> 7, (byte) 127, class330.field4786, 1, false, class490.field6904 >> 7);
                return;
            }
            return;
        }
        if ((class413.field5813[class29.field394][class492.field6935.field4331 >> 7][class492.field6935.field4317 >> 7] & 0x4) != 0) {
            class321.method2053(class492.field6935.field4317 >> 7, (byte) 127, class330.field4786, 0, false, class492.field6935.field4331 >> 7);
        }
        if (class214.field3219 >= 2560) {
            return;
        }
        int var6 = class490.field6904 >> 7;
        int var7 = class343.field4996 >> 7;
        int var8 = class492.field6935.field4331 >> 7;
        int var9 = class492.field6935.field4317 >> 7;
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var9 <= var7) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if (var10 == 0 && var11 == 0 || var10 <= -class58.field758 || var10 >= class58.field758 || (-class287.field4181) >= var11 || class287.field4181 <= var11) {
            class267.method1641("RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class240.field3602 + "," + class360.field5180, (Throwable) null, (byte) -87);
            return;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class413.field5813[class29.field394][var6][var7] & 0x4) != 0) {
                    class321.method2053(var7, (byte) 126, class330.field4786, 1, false, var6);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class413.field5813[class29.field394][var6][var7] & 0x4) != 0) {
                        class321.method2053(var7, (byte) 126, class330.field4786, 1, false, var6);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var8) {
            if (var8 > var6) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class413.field5813[class29.field394][var6][var7] & 0x4) != 0) {
                class321.method2053(var7, (byte) 127, class330.field4786, 1, false, var6);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                var15 -= 65536;
                if ((class413.field5813[class29.field394][var6][var7] & 0x4) != 0) {
                    class321.method2053(var7, (byte) 126, class330.field4786, 1, false, var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public final void method1447(int arg0) {
        int var2 = 69 % ((arg0 + 28) / 44);
        field3404++;
        while (true) {
            class120 var3 = this.field3407.field1508;
            if (this.field3407 == var3) {
                this.field3413 = null;
                return;
            }
            var3.method738((byte) -2);
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)I")
    public final int method1448(int arg0) {
        field3405++;
        int var2 = arg0;
        for (class120 var3 = this.field3407.field1508; var3 != this.field3407; var3 = var3.field1508) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)Lpk;")
    public final class120 method1449(int arg0) {
        field3401++;
        class120 var2 = this.field3407.field1508;
        if (this.field3407 == var2) {
            this.field3413 = null;
            return null;
        }
        if (arg0 < 107) {
            field3419 = null;
        }
        this.field3413 = var2.field1508;
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class225() {
        this.field3407.field1508 = this.field3407;
        this.field3407.field1509 = this.field3407;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)Lpk;")
    public final class120 method1450(int arg0) {
        if (arg0 != 0) {
            this.method1449(-106);
        }
        field3400++;
        class120 var2 = this.field3413;
        if (this.field3407 == var2) {
            this.field3413 = null;
            return null;
        } else {
            this.field3413 = var2.field1508;
            return var2;
        }
    }

    static {
        new class326("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }
}
