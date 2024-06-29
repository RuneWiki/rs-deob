import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class382 extends class444 {

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Ltc;")
    public class196 field5409 = new class196();

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "Lfa;")
    public class128 field5419 = new class128();

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Lbe;")
    private class25 field5411;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "J")
    public static volatile long field5414 = 0L;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "[[I")
    public static int[][] field5417 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "Llf;")
    public static class130 field5408;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()I", line = 3)
    public final int method208() {
        field5410++;
        return 0;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V", line = 18)
    public final void method198(int arg0) {
        field5407++;
        this.field5419.method198(arg0);
        for (class267 var2 = (class267) this.field5409.method1312((byte) 25); var2 != null; var2 = (class267) this.field5409.method1304(106)) {
            if (!this.field5411.method187((byte) -116, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3638) {
                        this.method2493(var3, var2, -1);
                        var2.field3638 -= var3;
                        break;
                    }
                    this.method2493(var2.field3638, var2, -1);
                    var3 -= var2.field3638;
                } while (!this.field5411.method188(0, true, var3, var2, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIBIII)V", line = 55)
    public static final void method2490(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -97) {
            method2491(44);
        }
        class451[] var7 = class132.field1831;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class451 var9 = var7[var8];
            if (var9 != null && var9.field6581 == 2) {
                class231.method1451((var9.field6580 - class449.field6509 << 7) + var9.field6570, (byte) -125, arg6, arg2 >> 1, arg4 >> 1, arg5, (var9.field6564 - class354.field4981 << 7) + var9.field6565, var9.field6568 * 2);
                if (class401.field5848[0] > -1 && class35.field541 % 20 < 10) {
                    class11.field150[var9.field6579].method867(class401.field5848[0] + arg0 - 12, class401.field5848[1] + arg1 + -28);
                }
            }
        }
        field5415++;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V", line = 86)
    public static final void method2491(int arg0) {
        if (class79.field1220 == 10 || class79.field1220 == 28) {
            class264.method1633(5000, 500, class368.field5158 >> 10, class336.field4561 >> 10);
        } else {
            class264.method1633(5000, 500, class307.field4211.field956[0] >> 3, class307.field4211.field944[0] >> 3);
        }
        if (arg0 != 9) {
            method2490(93, 97, 29, (byte) -96, -15, 71, 101);
        }
        field5405++;
        class194.method1292(arg0 + 7);
        class171.method1158(true);
        class264.method1631(68);
        class156.method1047(true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lvq;IIBI[I)V", line = 106)
    private final void method2492(class267 arg0, int arg1, int arg2, byte arg3, int arg4, int[] arg5) {
        if (arg3 != 1) {
            field5414 = -12L;
        }
        field5418++;
        if ((this.field5411.field353[arg0.field3664] & 0x4) != 0 && arg0.field3648 < 0) {
            int var7 = this.field5411.field389[arg0.field3664] / class327.field4473;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field3644) / var7;
                if (var8 > arg4) {
                    arg0.field3644 += arg4 * var7;
                    break;
                }
                arg0.field3641.method196(arg5, arg1, var8);
                arg1 += var8;
                arg4 -= var8;
                arg0.field3644 += var7 * var8 - 1048576;
                int var9 = class327.field4473 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class96 var11 = arg0.field3641;
                if (this.field5411.field401[arg0.field3664] == 0) {
                    arg0.field3641 = class96.method678(arg0.field3642, var11.method647(), var11.method667(), var11.method651());
                } else {
                    arg0.field3641 = class96.method678(arg0.field3642, var11.method647(), 0, var11.method651());
                    this.field5411.method193(false, arg0.field3660.field1956[arg0.field3662] < 0, arg0);
                    arg0.field3641.method668(var9, var11.method667());
                }
                if (arg0.field3660.field1956[arg0.field3662] < 0) {
                    arg0.field3641.method673(-1);
                }
                var11.method650(var9);
                var11.method196(arg5, arg1, arg2 - arg1);
                if (var11.method659()) {
                    this.field5419.method857(var11);
                }
            }
        }
        arg0.field3641.method196(arg5, arg1, arg4);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([III)V", line = 168)
    public final void method196(int[] arg0, int arg1, int arg2) {
        field5406++;
        this.field5419.method196(arg0, arg1, arg2);
        for (class267 var4 = (class267) this.field5409.method1312((byte) 25); var4 != null; var4 = (class267) this.field5409.method1304(-83)) {
            if (!this.field5411.method187((byte) -120, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field3638 >= var5) {
                        this.method2492(var4, var6, var5 + var6, (byte) 1, var5, arg0);
                        var4.field3638 -= var5;
                        break;
                    }
                    this.method2492(var4, var6, var5 + var6, (byte) 1, var4.field3638, arg0);
                    var6 += var4.field3638;
                    var5 -= var4.field3638;
                } while (!this.field5411.method188(var6, true, var5, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "()Lpn;", line = 212)
    public final class444 method179() {
        field5412++;
        class267 var1;
        do {
            var1 = (class267) this.field5409.method1304(124);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3641 == null);
        return var1.field3641;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILvq;I)V", line = 231)
    private final void method2493(int arg0, class267 arg1, int arg2) {
        field5416++;
        if (~(this.field5411.field353[arg1.field3664] & 0x4) != arg2 && arg1.field3648 < 0) {
            int var4 = this.field5411.field389[arg1.field3664] / class327.field4473;
            int var5 = (var4 + 1048575 - arg1.field3644) / var4;
            arg1.field3644 = arg0 * var4 + arg1.field3644 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field5411.field401[arg1.field3664] == 0) {
                    arg1.field3641 = class96.method678(arg1.field3642, arg1.field3641.method647(), arg1.field3641.method667(), arg1.field3641.method651());
                } else {
                    arg1.field3641 = class96.method678(arg1.field3642, arg1.field3641.method647(), 0, arg1.field3641.method651());
                    this.field5411.method193(false, arg1.field3660.field1956[arg1.field3662] < 0, arg1);
                }
                if (arg1.field3660.field1956[arg1.field3662] < 0) {
                    arg1.field3641.method673(-1);
                }
                arg0 = arg1.field3644 / var4;
            }
        }
        arg1.field3641.method198(arg0);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lbe;)V", line = 312)
    public class382(class25 arg0) {
        this.field5411 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V", line = 281)
    public static void method2494(int arg0) {
        field5417 = null;
        if (arg0 != 5000) {
            field5414 = -72L;
        }
        field5408 = null;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "()Lpn;", line = 296)
    public final class444 method180() {
        field5413++;
        class267 var1 = (class267) this.field5409.method1312((byte) 25);
        if (var1 == null) {
            return null;
        } else if (var1.field3641 == null) {
            return this.method179();
        } else {
            return var1.field3641;
        }
    }
}
