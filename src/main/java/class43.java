import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class43 extends class345 {

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Lvn;")
    public class169 field518 = new class169();

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "Lms;")
    public class451 field533 = new class451();

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "Lla;")
    private class262 field531;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "[I")
    public static int[] field530;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field532;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 3)
    public final void method265(int arg0) {
        this.field533.method265(arg0);
        field524++;
        for (class287 var2 = (class287) this.field518.method1124(-1); var2 != null; var2 = (class287) this.field518.method1119(false)) {
            if (!this.field531.method1648(var2, -90)) {
                int var3 = arg0;
                do {
                    if (var2.field4062 >= var3) {
                        this.method272((byte) -128, var2, var3);
                        var2.field4062 -= var3;
                        break;
                    }
                    this.method272((byte) -128, var2, var2.field4062);
                    var3 -= var2.field4062;
                } while (!this.field531.method1650((byte) 48, var3, (int[]) null, var2, 0));
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lbo;I)V", line = 42)
    public static final void method266(class433 arg0, int arg1) {
        field527++;
        boolean var2 = false;
        if (class221.field3033 == arg0.field6285 || arg0.field6312 == -1 || arg0.field6250 != 0) {
            var2 = true;
        } else {
            class182 var3 = class437.method2717(arg0.field6312, (byte) -103);
            if (var3.field2490 || var3.field2513[arg0.field6277] < (arg0.field6322 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field6285 - arg0.field6331;
            int var5 = class221.field3033 - arg0.field6331;
            int var6 = arg0.field6246 * 128 + arg0.method786((byte) 70) * 64;
            int var7 = arg0.field6302 * 128 + (arg0.method786((byte) 70) * 64);
            int var8 = arg0.field6294 * 128 + (arg0.method786((byte) 70) * 64);
            int var9 = arg0.field6267 * 128 + (arg0.method786((byte) 70) * 64);
            arg0.field1304 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field1311 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
        }
        arg0.field6339 = 0;
        if (arg0.field6311 == 0) {
            arg0.method2687(8192, true);
        }
        if (arg0.field6311 == 1) {
            arg0.method2687(12288, true);
        }
        if (arg0.field6311 == 2) {
            arg0.method2687(0, true);
        }
        if (arg0.field6311 == 3) {
            arg0.method2687(4096, true);
        }
        if (arg1 != -27548) {
            field532 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 99)
    public static void method267(byte arg0) {
        if (arg0 != -7) {
            field535 = 108;
        }
        field532 = null;
        field530 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()Lnf;", line = 112)
    public final class345 method268() {
        field529++;
        class287 var1;
        do {
            var1 = (class287) this.field518.method1119(false);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4042 == null);
        return var1.field4042;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V", line = 134)
    public static final void method269(byte arg0) {
        field520++;
        if (arg0 > 39) {
            class240.field3257.method2043(-110);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "([III)V", line = 145)
    public final void method270(int[] arg0, int arg1, int arg2) {
        field521++;
        this.field533.method270(arg0, arg1, arg2);
        for (class287 var4 = (class287) this.field518.method1124(-1); var4 != null; var4 = (class287) this.field518.method1119(false)) {
            if (!this.field531.method1648(var4, -74)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field4062 >= var5) {
                        this.method276(arg0, var4, -1, var5, var5 + var6, var6);
                        var4.field4062 -= var5;
                        break;
                    }
                    this.method276(arg0, var4, -1, var4.field4062, var5 + var6, var6);
                    var6 += var4.field4062;
                    var5 -= var4.field4062;
                } while (!this.field531.method1650((byte) 48, var5, arg0, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Len;Lfs;IIIII)V", line = 186)
    public static final void method271(class174 arg0, class330 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class52.field594 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class158.field2245) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class52.field598 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class302 var15 = class19.field202[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class132.field1814[var12].method1990(var13, var14) + class132.field1814[var12].method1990(var13 + 1, var14) + class132.field1814[var12].method1990(var13, var14 + 1) + class132.field1814[var12].method1990(var13 + 1, var14 + 1)) / 4 - (class132.field1814[arg2].method1990(arg3, arg4) + class132.field1814[arg2].method1990(arg3 + 1, arg4) + class132.field1814[arg2].method1990(arg3, arg4 + 1) + class132.field1814[arg2].method1990(arg3 + 1, arg4 + 1)) / 4;
                                    class436 var17 = var15.field4313;
                                    class436 var18 = var15.field4324;
                                    if (var17 != null && var17.method217(-118)) {
                                        arg1.method206(var16, arg0, (var13 - arg3) * 128 + (1 - arg5) * 64, (byte) -42, var17, (var14 - arg4) * 128 + (1 - arg6) * 64, var7);
                                    }
                                    if (var18 != null && var18.method217(-117)) {
                                        arg1.method206(var16, arg0, (var13 - arg3) * 128 + (1 - arg5) * 64, (byte) -42, var18, (var14 - arg4) * 128 + (1 - arg6) * 64, var7);
                                    }
                                    for (class299 var19 = var15.field4308; var19 != null; var19 = var19.field4263) {
                                        class113 var20 = var19.field4261;
                                        if (var20 != null && var20.method217(-103) && (var20.field1316 == var13 || var8 == var13) && (var20.field1305 == var14 || var10 == var14)) {
                                            int var21 = var20.field1298 + 1 - var20.field1316;
                                            int var22 = var20.field1299 + 1 - var20.field1305;
                                            arg1.method206(var16, arg0, (var20.field1316 - arg3) * 128 + (var21 - arg5) * 64, (byte) -42, var20, (var20.field1305 - arg4) * 128 + (var22 - arg6) * 64, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLmi;I)V", line = 279)
    private final void method272(byte arg0, class287 arg1, int arg2) {
        field519++;
        if (arg0 != -128) {
            this.method268();
        }
        if ((this.field531.field3645[arg1.field4046] & 0x4) != 0 && arg1.field4057 < 0) {
            int var4 = this.field531.field3672[arg1.field4046] / class233.field3158;
            int var5 = (var4 + 1048575 - arg1.field4061) / var4;
            arg1.field4061 = arg1.field4061 + (arg2 * var4) & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field531.field3611[arg1.field4046] == 0) {
                    arg1.field4042 = class380.method2430(arg1.field4054, arg1.field4042.method2449(), arg1.field4042.method2433(), arg1.field4042.method2432());
                } else {
                    arg1.field4042 = class380.method2430(arg1.field4054, arg1.field4042.method2449(), 0, arg1.field4042.method2432());
                    this.field531.method1667(arg1.field4060.field6229[arg1.field4058] < 0, -16385, arg1);
                }
                if (arg1.field4060.field6229[arg1.field4058] < 0) {
                    arg1.field4042.method2442(-1);
                }
                arg2 = arg1.field4061 / var4;
            }
        }
        arg1.field4042.method265(arg2);
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "()Lnf;", line = 319)
    public final class345 method273() {
        field525++;
        class287 var1 = (class287) this.field518.method1124(-1);
        if (var1 == null) {
            return null;
        } else if (var1.field4042 == null) {
            return this.method268();
        } else {
            return var1.field4042;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()I", line = 337)
    public final int method274() {
        field534++;
        return 0;
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(B)V", line = 351)
    public static final void method275(byte arg0) {
        class260.method1637(28313);
        field523++;
        class299.method1887((byte) 118);
        class117.method658((byte) 122);
        class100.method538(-1);
        class3.method23(-5);
        class101.method544((byte) -69);
        class434.method2702((byte) 113);
        class388.method2476(360);
        class121.method686((byte) 57);
        class335.method2157(-22271);
        class152.method911(127);
        class42.method264(arg0 ^ 0xFFFFFF89);
        class315.method1967((byte) -75);
        if (arg0 != -119) {
            method267((byte) 1);
        }
        class16.method110(32);
        class256.method1600(-108);
        class242.method1533(50);
        class339.method2183(1136568300);
        class351.method2238((byte) 96);
        class72.method424(-98);
        class102.method555(3);
        class207.method1315(arg0 + 169);
        class207.method1312((byte) -128);
        class256.method1598(arg0 + 26);
        class24.field241.method2052(0);
        class297.field4240.method2052(0);
        class330.field4714.method2052(0);
        class410.field5935.method2052(0);
        class387.field5680.method2052(0);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lla;)V", line = 462)
    public class43(class262 arg0) {
        this.field531 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([ILmi;IIII)V", line = 401)
    private final void method276(int[] arg0, class287 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~(this.field531.field3645[arg1.field4046] & 0x4) != arg2 && arg1.field4057 < 0) {
            int var7 = this.field531.field3672[arg1.field4046] / class233.field3158;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field4061) / var7;
                if (arg3 < var8) {
                    arg1.field4061 += arg3 * var7;
                    break;
                }
                arg1.field4042.method270(arg0, arg5, var8);
                arg3 -= var8;
                arg1.field4061 += var7 * var8 - 1048576;
                arg5 += var8;
                int var9 = class233.field3158 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class380 var11 = arg1.field4042;
                if (this.field531.field3611[arg1.field4046] == 0) {
                    arg1.field4042 = class380.method2430(arg1.field4054, var11.method2449(), var11.method2433(), var11.method2432());
                } else {
                    arg1.field4042 = class380.method2430(arg1.field4054, var11.method2449(), 0, var11.method2432());
                    this.field531.method1667(arg1.field4060.field6229[arg1.field4058] < 0, -16385, arg1);
                    arg1.field4042.method2421(var9, var11.method2433());
                }
                if (arg1.field4060.field6229[arg1.field4058] < 0) {
                    arg1.field4042.method2442(-1);
                }
                var11.method2414(var9);
                var11.method270(arg0, arg5, arg4 - arg5);
                if (var11.method2441()) {
                    this.field533.method2810(var11);
                }
            }
        }
        field526++;
        arg1.field4042.method270(arg0, arg5, arg3);
    }
}
