import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class175 extends class149 {

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "Z")
    public boolean field3387 = true;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "Z")
    public boolean field3393 = true;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "Lsg;")
    public class169 field3403 = class7.field189;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public int field3395 = -1;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    private int field3386 = 128;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "I")
    private int field3411 = -1;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    private int field3389 = 0;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "[Lsg;")
    public class169[] field3396 = new class169[5];

    @OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
    public int field3417 = 32;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public int field3397 = -1;

    @OriginalMember(owner = "client!td", name = "pb", descriptor = "I")
    private int field3412 = -1;

    @OriginalMember(owner = "client!td", name = "sb", descriptor = "I")
    private int field3415 = 0;

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
    private int field3409 = 128;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public int field3390 = -1;

    @OriginalMember(owner = "client!td", name = "Bb", descriptor = "I")
    public int field3424 = -1;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public int field3401 = -1;

    @OriginalMember(owner = "client!td", name = "xb", descriptor = "I")
    public int field3420 = -1;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public int field3392 = 1;

    @OriginalMember(owner = "client!td", name = "Fb", descriptor = "I")
    public int field3428 = -1;

    @OriginalMember(owner = "client!td", name = "Eb", descriptor = "Z")
    public boolean field3427 = true;

    @OriginalMember(owner = "client!td", name = "qb", descriptor = "I")
    public int field3413 = -1;

    @OriginalMember(owner = "client!td", name = "Ib", descriptor = "Z")
    public boolean field3431 = false;

    @OriginalMember(owner = "client!td", name = "zb", descriptor = "I")
    public int field3422 = -1;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "Lsg;")
    public static class169 field3399 = class165.method1060("<col=40ff00>", 1536);

    @OriginalMember(owner = "client!td", name = "Db", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "Z")
    public static boolean field3398 = false;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!td", name = "tb", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!td", name = "vb", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!td", name = "yb", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!td", name = "Ab", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!td", name = "Gb", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!td", name = "Cb", descriptor = "Lw;")
    public static class198 field3425;

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "[I")
    private int[] field3410;

    @OriginalMember(owner = "client!td", name = "rb", descriptor = "[I")
    private int[] field3414;

    @OriginalMember(owner = "client!td", name = "Hb", descriptor = "[I")
    public int[] field3430;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "[S")
    private short[] field3394;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "[S")
    private short[] field3400;

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "[S")
    private short[] field3405;

    @OriginalMember(owner = "client!td", name = "wb", descriptor = "[S")
    private short[] field3419;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(ZI)Z")
    public static final boolean method1168(boolean arg0, int arg1) {
        field3429++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            if (!arg0) {
                method1168(true, 39);
            }
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    public final void method1169(byte arg0) {
        if (arg0 != -24) {
            method1176(-60);
        }
        field3406++;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
    public static void method1170(int arg0) {
        field3425 = null;
        if (arg0 < -5) {
            field3399 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)Z")
    public final boolean method1171(int arg0) {
        field3391++;
        if (this.field3430 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 > -111) {
            this.field3420 = 65;
        }
        if (this.field3412 != -1) {
            var2 = class60.method374((byte) 88, this.field3412);
        } else if (this.field3411 != -1) {
            var2 = class6.field119[this.field3411];
        }
        return var2 >= 0 && this.field3430.length > var2 && this.field3430[var2] != -1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ltc;IIILtc;)Lcd;")
    public final class24 method1172(class174 arg0, int arg1, int arg2, int arg3, class174 arg4) {
        field3402++;
        if (this.field3430 != null) {
            class175 var6 = this.method1173((byte) 103);
            return var6 == null ? null : var6.method1172(arg0, arg1, arg2, -97, arg4);
        }
        class24 var7 = (class24) class95.field1808.method1206((long) this.field3404, -24742);
        if (arg3 > -64) {
            method1176(16);
        }
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field3414.length; var9++) {
                if (!class202.field3942.method567(0, 19406, this.field3414[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class52[] var10 = new class52[this.field3414.length];
            for (int var11 = 0; var11 < this.field3414.length; var11++) {
                var10[var11] = class52.method337(class202.field3942, this.field3414[var11], 0);
            }
            class52 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class52(var10, var10.length);
            }
            if (this.field3394 != null) {
                for (int var13 = 0; var13 < this.field3394.length; var13++) {
                    var12.method324(this.field3394[var13], this.field3405[var13]);
                }
            }
            if (this.field3400 != null) {
                for (int var14 = 0; var14 < this.field3400.length; var14++) {
                    var12.method340(this.field3400[var14], this.field3419[var14]);
                }
            }
            var7 = var12.method325(this.field3389 + 64, this.field3415 + 850, -30, -50, -30, true, true);
            class95.field1808.method1208((long) this.field3404, -107, var7);
        }
        class24 var15;
        if (arg0 != null && arg4 != null) {
            var15 = arg0.method1160(var7, arg2, 29426, arg4, arg1);
        } else if (arg0 != null) {
            var15 = arg0.method1167(-103, arg1, var7);
        } else if (arg4 == null) {
            var15 = var7.method161(true);
        } else {
            var15 = arg4.method1167(-125, arg2, var7);
        }
        if (this.field3386 != 128 || this.field3409 != 128) {
            var15.method176(this.field3386, this.field3409, this.field3386);
        }
        return var15;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Ltd;")
    public final class175 method1173(byte arg0) {
        field3423++;
        if (arg0 < 61) {
            this.field3427 = false;
        }
        int var2 = -1;
        if (this.field3412 != -1) {
            var2 = class60.method374((byte) 123, this.field3412);
        } else if (this.field3411 != -1) {
            var2 = class6.field119[this.field3411];
        }
        return var2 < 0 || this.field3430.length <= var2 || this.field3430[var2] == -1 ? null : class149.method974(this.field3430[var2], 9);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Loa;B)V")
    public final void method1174(class127 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method819((byte) 22);
            if (var3 == 0) {
                field3407++;
                if (arg1 <= 65) {
                    this.field3412 = 94;
                    return;
                }
                return;
            }
            this.method1175(-122, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILoa;I)V")
    private final void method1175(int arg0, class127 arg1, int arg2) {
        int var4 = -111 / ((arg0 + 76) / 44);
        if (arg2 == 1) {
            int var5 = arg1.method819((byte) 22);
            this.field3414 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3414[var6] = arg1.method785(true);
            }
        } else if (arg2 == 2) {
            this.field3403 = arg1.method793((byte) -97);
        } else if (arg2 == 12) {
            this.field3392 = arg1.method819((byte) 22);
        } else if (arg2 == 13) {
            this.field3413 = arg1.method785(true);
        } else if (arg2 == 14) {
            this.field3397 = arg1.method785(true);
        } else if (arg2 == 15) {
            this.field3401 = arg1.method785(true);
        } else if (arg2 == 16) {
            this.field3422 = arg1.method785(true);
        } else if (arg2 == 17) {
            this.field3397 = arg1.method785(true);
            this.field3395 = arg1.method785(true);
            this.field3390 = arg1.method785(true);
            this.field3420 = arg1.method785(true);
        } else if (arg2 >= 30 && arg2 < 35) {
            this.field3396[arg2 - 30] = arg1.method793((byte) -50);
            if (this.field3396[arg2 - 30].method1110(class136.field2542, 70)) {
                this.field3396[arg2 - 30] = null;
            }
        } else if (arg2 == 40) {
            int var13 = arg1.method819((byte) 22);
            this.field3394 = new short[var13];
            this.field3405 = new short[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3394[var14] = (short) arg1.method785(true);
                this.field3405[var14] = (short) arg1.method785(true);
            }
        } else if (arg2 == 41) {
            int var7 = arg1.method819((byte) 22);
            this.field3419 = new short[var7];
            this.field3400 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3400[var8] = (short) arg1.method785(true);
                this.field3419[var8] = (short) arg1.method785(true);
            }
        } else if (arg2 == 60) {
            int var9 = arg1.method819((byte) 22);
            this.field3410 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3410[var10] = arg1.method785(true);
            }
        } else if (arg2 == 93) {
            this.field3387 = false;
        } else if (arg2 == 95) {
            this.field3428 = arg1.method785(true);
        } else if (arg2 == 97) {
            this.field3386 = arg1.method785(true);
        } else if (arg2 == 98) {
            this.field3409 = arg1.method785(true);
        } else if (arg2 == 99) {
            this.field3431 = true;
        } else if (arg2 == 100) {
            this.field3389 = arg1.method824((byte) 57);
        } else if (arg2 == 101) {
            this.field3415 = arg1.method824((byte) -83) * 5;
        } else if (arg2 == 102) {
            this.field3424 = arg1.method785(true);
        } else if (arg2 == 103) {
            this.field3417 = arg1.method785(true);
        } else if (arg2 == 106) {
            this.field3412 = arg1.method785(true);
            if (this.field3412 == 65535) {
                this.field3412 = -1;
            }
            this.field3411 = arg1.method785(true);
            if (this.field3411 == 65535) {
                this.field3411 = -1;
            }
            int var11 = arg1.method819((byte) 22);
            this.field3430 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field3430[var12] = arg1.method785(true);
                if (this.field3430[var12] == 65535) {
                    this.field3430[var12] = -1;
                }
            }
        } else if (arg2 == 107) {
            this.field3427 = false;
        } else if (arg2 == 109) {
            this.field3393 = false;
        }
        field3408++;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
    public static final void method1176(int arg0) {
        field3416++;
        class85.field1559.method1033(true);
        int var1 = class85.field1559.method1031(1, (byte) -118);
        if (var1 == 0) {
            return;
        }
        int var2 = class85.field1559.method1031(2, (byte) 103);
        if (var2 == 0) {
            class6.field120[class199.field3895++] = 2047;
        } else if (var2 == 1) {
            int var3 = class85.field1559.method1031(3, (byte) 23);
            class4.field79.method1244(var3, false, 0);
            int var4 = class85.field1559.method1031(1, (byte) -106);
            if (var4 == 1) {
                class6.field120[class199.field3895++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class85.field1559.method1031(3, (byte) -117);
            class4.field79.method1244(var5, true, arg0 ^ 0x64);
            int var6 = class85.field1559.method1031(3, (byte) 32);
            class4.field79.method1244(var6, true, 0);
            int var7 = class85.field1559.method1031(1, (byte) 70);
            if (var7 == 1) {
                class6.field120[class199.field3895++] = 2047;
            }
        } else {
            if (arg0 != 100) {
                method1176(-70);
            }
            if (var2 == 3) {
                int var8 = class85.field1559.method1031(7, (byte) 83);
                int var9 = class85.field1559.method1031(7, (byte) 94);
                class61.field1132 = class85.field1559.method1031(2, (byte) 113);
                int var10 = class85.field1559.method1031(1, (byte) -76);
                if (var10 == 1) {
                    class6.field120[class199.field3895++] = 2047;
                }
                int var11 = class85.field1559.method1031(1, (byte) -89);
                class4.field79.method1246(var8, (byte) 20, var11 == 1, var9);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILtc;)Lcd;")
    public final class24 method1177(int arg0, int arg1, class174 arg2) {
        field3421++;
        if (this.field3430 != null) {
            class175 var4 = this.method1173((byte) 101);
            return var4 == null ? null : var4.method1177(-10, arg1, arg2);
        } else if (this.field3410 == null) {
            return null;
        } else {
            if (arg0 != -10) {
                method1168(true, 78);
            }
            class24 var5 = (class24) class6.field127.method1206((long) this.field3404, -24742);
            if (var5 == null) {
                boolean var6 = false;
                for (int var7 = 0; var7 < this.field3410.length; var7++) {
                    if (!class202.field3942.method567(0, 19406, this.field3410[var7])) {
                        var6 = true;
                    }
                }
                if (var6) {
                    return null;
                }
                class52[] var8 = new class52[this.field3410.length];
                for (int var9 = 0; var9 < this.field3410.length; var9++) {
                    var8[var9] = class52.method337(class202.field3942, this.field3410[var9], 0);
                }
                class52 var10;
                if (var8.length == 1) {
                    var10 = var8[0];
                } else {
                    var10 = new class52(var8, var8.length);
                }
                if (this.field3394 != null) {
                    for (int var11 = 0; var11 < this.field3394.length; var11++) {
                        var10.method324(this.field3394[var11], this.field3405[var11]);
                    }
                }
                if (this.field3400 != null) {
                    for (int var12 = 0; var12 < this.field3400.length; var12++) {
                        var10.method340(this.field3400[var12], this.field3419[var12]);
                    }
                }
                var5 = var10.method325(64, 768, -50, -10, -50, true, true);
                class6.field127.method1208((long) this.field3404, 114, var5);
            }
            if (arg2 != null) {
                var5 = arg2.method1158(arg1, var5, 65535);
            }
            return var5;
        }
    }
}
