import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class133 extends class240 {

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "Lgj;")
    public class593 field2183 = new class593();

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "Lds;")
    public class14 field2184 = new class14();

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "Lnb;")
    private class278 field2175;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "Lnaa;")
    public static class66 field2174;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([[BBLeda;)V")
    public static final void method998(byte[][] arg0, byte arg1, class90 arg2) {
        int var3 = 0;
        int var4 = 70 / ((40 - arg1) / 38);
        while (var3 < arg2.field3490) {
            class381.method2226((byte) -102);
            for (int var5 = 0; var5 < class34.field530 >> 3; var5++) {
                for (int var6 = 0; var6 < class34.field531 >> 3; var6++) {
                    int var7 = class242.field3381[var3][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3EB298E) >> 24;
                        if (!arg2.field3479 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFF39E) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class376.field5072.length; var13++) {
                                if (class376.field5072[var13] == var12 && arg0[var13] != null) {
                                    arg2.method714(arg0[var13], var6 * 8, var5 * 8, (var11 & 0x7) * 8, var3, 7, class591.field7820, var8, (var10 & 0x7) * 8, var9, class10.field197);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var3++;
        }
        field2176++;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public final void method162(int arg0) {
        this.field2184.method162(arg0);
        field2177++;
        for (class156 var2 = (class156) this.field2183.method3257(-36); var2 != null; var2 = (class156) this.field2183.method3263((byte) -93)) {
            if (!this.field2175.method1722(false, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2469) {
                        this.method1000(var2, true, var3);
                        var2.field2469 -= var3;
                        break;
                    }
                    this.method1000(var2, true, var2.field2469);
                    var3 -= var2.field2469;
                } while (!this.field2175.method1729((byte) -99, var2, null, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "()Lsda;")
    public final class240 method165() {
        field2173++;
        class156 var1 = (class156) this.field2183.method3257(-115);
        if (var1 == null) {
            return null;
        } else if (var1.field2458 == null) {
            return this.method156();
        } else {
            return var1.field2458;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "([III)V")
    public final void method160(int[] arg0, int arg1, int arg2) {
        field2180++;
        this.field2184.method160(arg0, arg1, arg2);
        for (class156 var4 = (class156) this.field2183.method3257(-117); var4 != null; var4 = (class156) this.field2183.method3263((byte) -128)) {
            if (!this.field2175.method1722(false, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2469) {
                        this.method999(var5 + var6, arg0, var5, var6, false, var4);
                        var4.field2469 -= var6;
                        break;
                    }
                    this.method999(var5 + var6, arg0, var5, var4.field2469, false, var4);
                    var5 += var4.field2469;
                    var6 -= var4.field2469;
                } while (!this.field2175.method1729((byte) -99, var4, arg0, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I[IIIZLcfa;)V")
    private final void method999(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, class156 arg5) {
        field2172++;
        if ((this.field2175.field3918[arg5.field2466] & 0x4) != 0 && arg5.field2477 < 0) {
            int var7 = this.field2175.field3926[arg5.field2466] / class443.field6071;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field2461) / var7;
                if (var8 > arg3) {
                    arg5.field2461 += arg3 * var7;
                    break;
                }
                arg5.field2458.method160(arg1, arg2, var8);
                arg3 -= var8;
                arg5.field2461 += var7 * var8 - 1048576;
                arg2 += var8;
                int var9 = class443.field6071 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class81 var11 = arg5.field2458;
                if (this.field2175.field3927[arg5.field2466] == 0) {
                    arg5.field2458 = class81.method657(arg5.field2465, var11.method672(), var11.method666(), var11.method662());
                } else {
                    arg5.field2458 = class81.method657(arg5.field2465, var11.method672(), 0, var11.method662());
                    this.field2175.method1727(arg5, arg5.field2463.field3094[arg5.field2481] < 0, -445874938);
                    arg5.field2458.method665(var9, var11.method666());
                }
                if (arg5.field2463.field3094[arg5.field2481] < 0) {
                    arg5.field2458.method650(-1);
                }
                var11.method647(var9);
                var11.method160(arg1, arg2, arg0 - arg2);
                if (var11.method645()) {
                    this.field2184.method159(var11);
                }
            }
        }
        arg5.field2458.method160(arg1, arg2, arg3);
        if (arg4) {
            field2174 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lcfa;ZI)V")
    private final void method1000(class156 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return;
        }
        if ((this.field2175.field3918[arg0.field2466] & 0x4) != 0 && arg0.field2477 < 0) {
            int var4 = this.field2175.field3926[arg0.field2466] / class443.field6071;
            int var5 = (var4 + 1048575 - arg0.field2461) / var4;
            arg0.field2461 = arg2 * var4 + arg0.field2461 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field2175.field3927[arg0.field2466] == 0) {
                    arg0.field2458 = class81.method657(arg0.field2465, arg0.field2458.method672(), arg0.field2458.method666(), arg0.field2458.method662());
                } else {
                    arg0.field2458 = class81.method657(arg0.field2465, arg0.field2458.method672(), 0, arg0.field2458.method662());
                    this.field2175.method1727(arg0, arg0.field2463.field3094[arg0.field2481] < 0, -445874938);
                }
                if (arg0.field2463.field3094[arg0.field2481] < 0) {
                    arg0.field2458.method650(-1);
                }
                arg2 = arg0.field2461 / var4;
            }
        }
        field2171++;
        arg0.field2458.method162(arg2);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public static void method1001(int arg0) {
        if (arg0 >= -103) {
            field2174 = null;
        }
        field2174 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "()Lsda;")
    public final class240 method156() {
        field2182++;
        class156 var1;
        do {
            var1 = (class156) this.field2183.method3263((byte) -82);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2458 == null);
        return var1.field2458;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "()I")
    public final int method163() {
        field2178++;
        return 0;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lnb;)V")
    public class133(class278 arg0) {
        this.field2175 = arg0;
    }
}
