import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class351 extends class53 {

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Lgj;")
    public class257 field5596 = new class257();

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "Lvf;")
    public class340 field5603 = new class340();

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "Lwd;")
    private class93 field5598;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Ltg;")
    public static class345 field5591 = new class345();

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field5604 = 0;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field5607 = 50;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "[I")
    public static int[] field5608 = new int[1000];

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "Ljava/lang/String;")
    public static String field5605 = "wave2:";

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "F")
    public static float field5602;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "()I", line = 4)
    public final int method322() {
        field5595++;
        return 0;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "([III)V", line = 13)
    public final void method323(int[] arg0, int arg1, int arg2) {
        this.field5603.method323(arg0, arg1, arg2);
        for (class180 var4 = (class180) this.field5596.method1812(1); var4 != null; var4 = (class180) this.field5596.method1809(128)) {
            if (!this.field5598.method612((byte) 122, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field2701) {
                        this.method2436(var6, var6 + var5, var4, -12, arg0, var5);
                        var4.field2701 -= var5;
                        break;
                    }
                    this.method2436(var6, var6 + var5, var4, -12, arg0, var4.field2701);
                    var5 -= var4.field2701;
                    var6 += var4.field2701;
                } while (!this.field5598.method593(var4, var5, arg0, (byte) -3, var6));
            }
        }
        field5593++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIII)V", line = 56)
    public static final void method2432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1335820511) {
            method2435((byte) 99);
        }
        field5601++;
        class89[] var7 = class106.field1471;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class89 var9 = var7[var8];
            if (var9 != null && var9.field1170 == 2) {
                class196.method1371(arg0, arg2 >> 1, arg5, var9.field1183 * 2, (var9.field1169 - class16.field160 << 7) + var9.field1171, arg1 >> 1, (var9.field1175 - class322.field4999 << 7) + var9.field1168, (byte) -116);
                if (class89.field1167 > -1 && class102.field1381 % 20 < 10) {
                    class290.field4572[var9.field1182].method11(arg4 + class89.field1167 - 12, arg3 + -28 + class64.field771);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V", line = 88)
    public static final void method2433(int arg0) {
        field5600++;
        class218.field3280 = 0;
        class44.field492 = 0;
        class60.method366((byte) -17);
        class342.method2350(2712);
        class344.method2391((byte) 112);
        class300.method2118(-21112);
        for (int var1 = 0; var1 < class44.field492; var1++) {
            int var2 = field5608[var1];
            if (class102.field1381 != class105.field1443[var2].field3772) {
                if (class105.field1443[var2].field820 > 0) {
                    class62.method385((byte) -45, class105.field1443[var2]);
                }
                class105.field1443[var2] = null;
            }
        }
        if (arg0 != -24421) {
            method2432(109, 107, -118, 61, 94, 76, -36);
        }
        if (class191.field2869 != class282.field4499.field2295) {
            throw new RuntimeException("gpp1 pos:" + class282.field4499.field2295 + " psize:" + class191.field2869);
        }
        for (int var3 = 0; var3 < class302.field4704; var3++) {
            if (class105.field1443[class80.field1067[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class302.field4704);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 147)
    public final void method318(int arg0) {
        this.field5603.method318(arg0);
        for (class180 var2 = (class180) this.field5596.method1812(1); var2 != null; var2 = (class180) this.field5596.method1809(128)) {
            if (!this.field5598.method612((byte) 122, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2701) {
                        this.method2434(var2, var3, (byte) 35);
                        var2.field2701 -= var3;
                        break;
                    }
                    this.method2434(var2, var2.field2701, (byte) 35);
                    var3 -= var2.field2701;
                } while (!this.field5598.method593(var2, var3, (int[]) null, (byte) -3, 0));
            }
        }
        field5590++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Le;IB)V", line = 180)
    private final void method2434(class180 arg0, int arg1, byte arg2) {
        field5592++;
        if (arg2 != 35) {
            this.method317();
        }
        if ((this.field5598.field1271[arg0.field2721] & 0x4) != 0 && arg0.field2723 < 0) {
            int var4 = this.field5598.field1214[arg0.field2721] / class361.field5710;
            int var5 = (var4 + 1048575 - arg0.field2700) / var4;
            arg0.field2700 = arg1 * var4 + arg0.field2700 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field5598.field1266[arg0.field2721] == 0) {
                    arg0.field2709 = class359.method2502(arg0.field2724, arg0.field2709.method2486(), arg0.field2709.method2505(), arg0.field2709.method2485());
                } else {
                    arg0.field2709 = class359.method2502(arg0.field2724, arg0.field2709.method2486(), 0, arg0.field2709.method2485());
                    this.field5598.method577((byte) 24, arg0.field2718.field4000[arg0.field2704] < 0, arg0);
                }
                if (arg0.field2718.field4000[arg0.field2704] < 0) {
                    arg0.field2709.method2500(-1);
                }
                arg1 = arg0.field2700 / var4;
            }
        }
        arg0.field2709.method318(arg1);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 219)
    public static void method2435(byte arg0) {
        field5591 = null;
        field5608 = null;
        if (arg0 <= 86) {
            method2433(47);
        }
        field5605 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILe;I[II)V", line = 232)
    private final void method2436(int arg0, int arg1, class180 arg2, int arg3, int[] arg4, int arg5) {
        field5599++;
        if ((this.field5598.field1271[arg2.field2721] & 0x4) != 0 && arg2.field2723 < 0) {
            int var7 = this.field5598.field1214[arg2.field2721] / class361.field5710;
            while (true) {
                int var8 = (1048575 - (arg2.field2700 - var7)) / var7;
                if (var8 > arg5) {
                    arg2.field2700 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg2.field2709.method323(arg4, arg0, var8);
                class359 var9 = arg2.field2709;
                int var10 = class361.field5710 / 100;
                int var11 = 262144 / var7;
                if (var11 < var10) {
                    var10 = var11;
                }
                arg2.field2700 += var7 * var8 - 1048576;
                if (this.field5598.field1266[arg2.field2721] == 0) {
                    arg2.field2709 = class359.method2502(arg2.field2724, var9.method2486(), var9.method2505(), var9.method2485());
                } else {
                    arg2.field2709 = class359.method2502(arg2.field2724, var9.method2486(), 0, var9.method2485());
                    this.field5598.method577((byte) 24, arg2.field2718.field4000[arg2.field2704] < 0, arg2);
                    arg2.field2709.method2490(var10, var9.method2505());
                }
                if (arg2.field2718.field4000[arg2.field2704] < 0) {
                    arg2.field2709.method2500(-1);
                }
                var9.method2501(var10);
                arg0 += var8;
                var9.method323(arg4, arg0, arg1 - arg0);
                if (var9.method2513()) {
                    this.field5603.method2335(var9);
                }
            }
        }
        arg2.field2709.method323(arg4, arg0, arg5);
        if (arg3 != -12) {
            field5604 = 80;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()Lqd;", line = 299)
    public final class53 method317() {
        field5606++;
        class180 var1 = (class180) this.field5596.method1812(1);
        if (var1 == null) {
            return null;
        } else if (var1.field2709 == null) {
            return this.method321();
        } else {
            return var1.field2709;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lwd;)V", line = 364)
    public class351(class93 arg0) {
        this.field5598 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "()Lqd;", line = 330)
    public final class53 method321() {
        field5597++;
        class180 var1;
        do {
            var1 = (class180) this.field5596.method1809(128);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2709 == null);
        return var1.field2709;
    }
}
