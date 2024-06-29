import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class194 extends class3 {

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Ltu;")
    public class7 field2504 = new class7();

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "Lsv;")
    public class317 field2513 = new class317();

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "Lli;")
    private class382 field2510;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2511 = null;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "[I")
    public static int[] field2507;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIBII)V")
    public static final void method1253(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 74) {
            field2511 = null;
        }
        field2506++;
        class436 var5 = class459.method2712(4, arg1, -1759243680);
        var5.method2574((byte) 82);
        var5.field5977 = arg4;
        var5.field5980 = arg3;
        var5.field5979 = arg0;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "()Lar;")
    public final class3 method15() {
        field2503++;
        class458 var1 = (class458) this.field2504.method49(-106);
        if (var1 == null) {
            return null;
        } else if (var1.field6391 == null) {
            return this.method16();
        } else {
            return var1.field6391;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIB)V")
    public static final void method1254(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 45) {
            return;
        }
        field2502++;
        if (class65.field827 <= (arg0 - arg1) && class281.field3589 >= (arg0 + arg1) && (arg2 - arg1) >= class418.field5559 && class456.field6365 >= (arg1 + arg2)) {
            class513.method3053(arg3, arg2, arg1, arg4 - 43, arg0);
        } else {
            class272.method1678(arg1, arg0, arg2, arg3, 563866657);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()I")
    public final int method13() {
        field2505++;
        return 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public final void method18(int arg0) {
        this.field2513.method18(arg0);
        field2508++;
        for (class458 var2 = (class458) this.field2504.method49(-14); var2 != null; var2 = (class458) this.field2504.method46((byte) 13)) {
            if (!this.field2510.method2250(var2, -1)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field6412) {
                        this.method1258(-1, var3, var2);
                        var2.field6412 -= var3;
                        break;
                    }
                    this.method1258(-1, var2.field6412, var2);
                    var3 -= var2.field6412;
                } while (!this.field2510.method2229(127, 0, null, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
    public static void method1255(byte arg0) {
        field2507 = null;
        field2511 = null;
        if (arg0 != 52) {
            field2511 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
    public static final void method1256(int arg0, int arg1, int arg2) {
        field2512++;
        if (arg1 != 0) {
            field2507 = null;
        }
        if (class495.method2961(arg0, arg1 ^ 0x6A)) {
            class378.method2203(arg2, class296.field3842[arg0], (byte) 117);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZ[IILld;)V")
    private final void method1257(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, class458 arg5) {
        if ((this.field2510.field4975[arg5.field6399] & 0x4) != 0 && arg5.field6385 < 0) {
            int var7 = this.field2510.field5001[arg5.field6399] / class426.field5847;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field6387) / var7;
                if (var8 > arg4) {
                    arg5.field6387 += arg4 * var7;
                    break;
                }
                arg5.field6391.method17(arg3, arg0, var8);
                arg5.field6387 += var7 * var8 - 1048576;
                arg0 += var8;
                arg4 -= var8;
                int var9 = class426.field5847 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class383 var11 = arg5.field6391;
                if (this.field2510.field5029[arg5.field6399] == 0) {
                    arg5.field6391 = class383.method2266(arg5.field6397, var11.method2285(), var11.method2275(), var11.method2267());
                } else {
                    arg5.field6391 = class383.method2266(arg5.field6397, var11.method2285(), 0, var11.method2267());
                    this.field2510.method2251(arg5, 112, arg5.field6392.field1272[arg5.field6390] < 0);
                    arg5.field6391.method2258(var9, var11.method2275());
                }
                if (arg5.field6392.field1272[arg5.field6390] < 0) {
                    arg5.field6391.method2287(-1);
                }
                var11.method2273(var9);
                var11.method17(arg3, arg0, arg1 - arg0);
                if (var11.method2259()) {
                    this.field2513.method1891(var11);
                }
            }
        }
        field2514++;
        if (arg2) {
            this.field2513 = null;
        }
        arg5.field6391.method17(arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILld;)V")
    private final void method1258(int arg0, int arg1, class458 arg2) {
        field2509++;
        if (~(this.field2510.field4975[arg2.field6399] & 0x4) != arg0 && arg2.field6385 < 0) {
            int var4 = this.field2510.field5001[arg2.field6399] / class426.field5847;
            int var5 = (var4 + 1048575 - arg2.field6387) / var4;
            arg2.field6387 = arg2.field6387 + (arg1 * var4) & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field2510.field5029[arg2.field6399] == 0) {
                    arg2.field6391 = class383.method2266(arg2.field6397, arg2.field6391.method2285(), arg2.field6391.method2275(), arg2.field6391.method2267());
                } else {
                    arg2.field6391 = class383.method2266(arg2.field6397, arg2.field6391.method2285(), 0, arg2.field6391.method2267());
                    this.field2510.method2251(arg2, arg0 ^ 0xFFFFFFA5, arg2.field6392.field1272[arg2.field6390] < 0);
                }
                if (arg2.field6392.field1272[arg2.field6390] < 0) {
                    arg2.field6391.method2287(-1);
                }
                arg1 = arg2.field6387 / var4;
            }
        }
        arg2.field6391.method18(arg1);
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "()Lar;")
    public final class3 method16() {
        field2515++;
        class458 var1;
        do {
            var1 = (class458) this.field2504.method46((byte) 74);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6391 == null);
        return var1.field6391;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([III)V")
    public final void method17(int[] arg0, int arg1, int arg2) {
        field2501++;
        this.field2513.method17(arg0, arg1, arg2);
        for (class458 var4 = (class458) this.field2504.method49(41); var4 != null; var4 = (class458) this.field2504.method46((byte) 85)) {
            if (!this.field2510.method2250(var4, -1)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field6412) {
                        this.method1257(var6, var5 + var6, false, arg0, var5, var4);
                        var4.field6412 -= var5;
                        break;
                    }
                    this.method1257(var6, var5 + var6, false, arg0, var4.field6412, var4);
                    var5 -= var4.field6412;
                    var6 += var4.field6412;
                } while (!this.field2510.method2229(127, var6, arg0, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lqa;Lrn;III)V")
    public static final void method1259(class129 arg0, class242 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class166.field2155) {
            class510 var5 = class470.field6877[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field7492 != null && var5.field7492.method177(5)) {
                arg1.method174((byte) 91, var5.field7492, true, 0, 0, arg0, class286.field3658);
            }
        }
        if (arg4 < class166.field2155) {
            class510 var6 = class470.field6877[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field7492 != null && var6.field7492.method177(5)) {
                arg1.method174((byte) 91, var6.field7492, true, class286.field3658, 0, arg0, 0);
            }
        }
        if (arg3 < class166.field2155 && arg4 < class13.field230) {
            class510 var7 = class470.field6877[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field7492 != null && var7.field7492.method177(5)) {
                arg1.method174((byte) 91, var7.field7492, true, class286.field3658, 0, arg0, class286.field3658);
            }
        }
        if (arg3 < class166.field2155 && arg4 > 0) {
            class510 var8 = class470.field6877[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field7492 != null && var8.field7492.method177(5)) {
                arg1.method174((byte) 91, var8.field7492, true, -class286.field3658, 0, arg0, class286.field3658);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lli;)V")
    public class194(class382 arg0) {
        this.field2510 = arg0;
    }
}
