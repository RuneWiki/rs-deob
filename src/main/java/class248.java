import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class248 extends class119 {

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    private int field4351 = -1;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "Lqh;")
    private class24 field4348 = null;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    private int field4365 = -1;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    private int field4366 = -32768;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    private int field4344;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    private int field4355;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    private int field4360;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    private int field4349;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    private int field4362;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    private int field4369;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "Lje;")
    private class138 field4347;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    private int field4358;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    private int field4357;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "Lsb;")
    public static class98 field4346 = class47.method368("", 0);

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "Lsb;")
    private static class98 field4354 = class47.method368("Allocating memory", 0);

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Lsb;")
    public static class98 field4359 = class47.method368("floorshadows", 0);

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "Lsb;")
    public static class98 field4352 = class47.method368("Art", 0);

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "Lsb;")
    private static class98 field4356 = class47.method368("Loading fonts )2 ", 0);

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Lsb;")
    public static class98 field4339 = field4356;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "Lsb;")
    public static class98 field4353 = field4354;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "[Z")
    public static boolean[] field4361;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
    public final void method888(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1722((arg2 + (arg0 - arg2 >> 1)) * 128 + 64, ((arg1 - arg3 >> 1) + arg3) * 128 - -64, -97);
        field4364++;
        if (arg4 != -1) {
            this.field4351 = -113;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()I")
    public final int method90() {
        field4345++;
        return this.field4366;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)V")
    private final void method1722(int arg0, int arg1, int arg2) {
        field4342++;
        if (this.field4347 != null) {
            int var4 = class236.field4071 - this.field4358;
            if (var4 > 100 && this.field4347.field2458 > 0) {
                int var5 = this.field4347.field2454.length - this.field4347.field2458;
                while (this.field4357 < var5 && var4 > this.field4347.field2439[this.field4357]) {
                    var4 -= this.field4347.field2439[this.field4357];
                    this.field4357++;
                }
                if (this.field4357 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4347.field2454.length; var7++) {
                        var6 += this.field4347.field2439[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field4347.field2439[this.field4357]) {
                            break label62;
                        }
                        class114.method850(false, arg1, arg0, this.field4357, this.field4347, 4096);
                        var4 -= this.field4347.field2439[this.field4357];
                        this.field4357++;
                    } while (this.field4357 < this.field4347.field2454.length);
                    this.field4357 -= this.field4347.field2458;
                } while (this.field4357 >= 0 && this.field4357 < this.field4347.field2454.length);
                this.field4347 = null;
            }
            this.field4358 = class236.field4071 - var4;
        }
        if (arg2 > -15) {
            field4354 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4367++;
        class119 var11 = this.method1723(102);
        if (var11 != null) {
            var11.method91(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4366 = var11.method90();
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)Lsc;")
    private final class119 method1723(int arg0) {
        if (arg0 != 102) {
            this.method1723(105);
        }
        field4340++;
        return this.method1728(false, (byte) -45);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1724(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4343++;
        if (arg0 >= 1 && arg1 >= 1 && arg0 <= 102 && arg1 <= 102) {
            if (!class181.method1249((byte) 62) && (class138.field2461[0][arg0][arg1] & 0x2) == 0) {
                int var8 = arg3;
                if ((class138.field2461[arg3][arg0][arg1] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class93.field1632 != var8) {
                    return;
                }
            }
            int var9 = arg3;
            if (arg3 < 3 && (class138.field2461[1][arg0][arg1] & 0x2) == 2) {
                var9 = arg3 + 1;
            }
            class199.method1359(arg0, -82, arg3, arg1, class110.field1961[arg3], arg6, var9);
            if (arg5 >= 0) {
                boolean var10 = class104.field1848;
                class104.field1848 = true;
                class148.method1094(arg3, -30945, arg1, var9, arg4, arg7, arg5, false, class110.field1961[arg3], false, arg0);
                class104.field1848 = var10;
            }
        }
        if (arg2 != 66) {
            field4346 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static void method1725(int arg0) {
        field4352 = null;
        if (arg0 != -972372090) {
            method1727(103, -71);
        }
        field4353 = null;
        field4361 = null;
        field4346 = null;
        field4354 = null;
        field4356 = null;
        field4339 = null;
        field4359 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lsb;I)Z")
    public static final boolean method1726(class98 arg0, int arg1) {
        field4341++;
        try {
            int var2 = arg0.method711(44, false);
            if (var2 == -1) {
                return false;
            }
            if (arg1 != -7896) {
                field4353 = null;
            }
            class98 var3 = arg0.method742(arg1 ^ 0x1E9E, 0, var2);
            class98 var4 = arg0.method740(var2 + 1, true);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method725(false));
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method709(true);
            class216 var8 = new class216(5000);
            var8.method1488(0, -52, var7, var7.length);
            var8.field3728 = 0;
            var8.method1454(false, class37.field622, class13.field252);
            if (var8.field3706[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field3706[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var10) {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)I")
    public static final int method1727(int arg0, int arg1) {
        field4350++;
        return arg0 == 28380 ? arg1 >>> 8 : 11;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZB)Lsc;")
    private final class119 method1728(boolean arg0, byte arg1) {
        field4363++;
        boolean var3 = class78.field1393 != class244.field4248;
        class21 var4 = class125.method929(this.field4344, (byte) -124);
        if (var4.field393 != null) {
            var4 = var4.method236(0);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field4369 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field397;
            var6 = var4.field398;
        } else {
            var6 = var4.field397;
            var7 = var4.field398;
        }
        int var8 = (var7 >> 1) + this.field4349;
        int var9 = (var7 + 1 >> 1) + this.field4349;
        int var10 = (var6 >> 1) + this.field4362;
        int var11 = (var6 + 1 >> 1) + this.field4362;
        this.method1722(var10 * 128, var8 * 128, -75);
        boolean var12 = !var3 && var4.field422 && (this.field4365 != var4.field404 || this.field4357 != this.field4351 && class177.field3069 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class78.field1393[this.field4355];
        int var14 = (this.field4362 << 7) + (var6 << 6);
        if (arg1 > -12) {
            this.method90();
        }
        int[][] var15 = null;
        int var16 = var13[var8][var10] + var13[var9][var11] + var13[var8][var11] + var13[var9][var10] >> 2;
        if (var3) {
            var15 = class244.field4248[0];
        } else if (this.field4355 < 3) {
            var15 = class78.field1393[this.field4355 + 1];
        }
        int var17 = (this.field4349 << 7) + (var7 << 6);
        boolean var18 = this.field4348 == null;
        class122 var19;
        if (this.field4347 == null) {
            var19 = var4.method232(false, this.field4369, var13, var17, var12, -8188, var14, this.field4360, var15, var16, var18 ? class37.field625 : this.field4348);
        } else {
            var19 = var4.method227(var18 ? class37.field625 : this.field4348, this.field4347, this.field4369, var16, var15, var14, var13, true, this.field4360, this.field4357, var12, var17);
        }
        return var19 == null ? null : var19.field2241;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIIIZLsc;)V")
    public class248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class119 arg8) {
        this.field4344 = arg0;
        this.field4355 = arg3;
        this.field4360 = arg1;
        this.field4349 = arg4;
        this.field4362 = arg5;
        this.field4369 = arg2;
        if (arg6 != -1) {
            this.field4347 = class16.method144(1, arg6);
            this.field4358 = class236.field4071 - 1;
            this.field4357 = 0;
            if (this.field4347.field2448 == 0 && arg8 != null && arg8 instanceof class248) {
                class248 var10 = (class248) arg8;
                if (this.field4347 == var10.field4347) {
                    this.field4358 = var10.field4358;
                    this.field4357 = var10.field4357;
                    return;
                }
            }
            if (arg7 && this.field4347.field2458 != -1) {
                this.field4357 = (int) ((double) this.field4347.field2454.length * Math.random());
                this.field4358 -= (int) ((double) this.field4347.field2439[this.field4357] * Math.random());
                return;
            }
        }
    }
}
