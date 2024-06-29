import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class41 extends class178 {

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "Lqg;")
    public class256 field575 = new class256();

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "Lca;")
    public class106 field579 = new class106();

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Ldf;")
    private class175 field563;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field564 = 0;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "[Lbb;")
    public static class99[] field565 = new class99[6];

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "Lkn;")
    public static class210 field572 = new class210(5000);

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "[I")
    public static int[] field571;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "[[[B")
    public static byte[][][] field578;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([BIIILjava/lang/String;B)I", line = 5)
    public static final int method280(byte[] arg0, int arg1, int arg2, int arg3, String arg4, byte arg5) {
        int var6 = arg2 - arg3;
        field567++;
        if (arg5 != 85) {
            field578 = (byte[][][]) ((byte[][][]) null);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg1 + var7] = -97;
            } else {
                arg0[arg1 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()Lba;", line = 146)
    public final class178 method281() {
        field573++;
        class340 var1 = (class340) this.field575.method1807((byte) 101);
        if (var1 == null) {
            return null;
        } else if (var1.field5296 == null) {
            return this.method287();
        } else {
            return var1.field5296;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()I", line = 163)
    public final int method282() {
        field570++;
        return 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BILoj;I[II)V", line = 174)
    private final void method283(byte arg0, int arg1, class340 arg2, int arg3, int[] arg4, int arg5) {
        if (arg0 < 95) {
            return;
        }
        field569++;
        if ((this.field563.field2836[arg2.field5281] & 0x4) != 0 && arg2.field5292 < 0) {
            int var7 = this.field563.field2789[arg2.field5281] / class264.field4185;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field5302) / var7;
                if (var8 > arg3) {
                    arg2.field5302 += arg3 * var7;
                    break;
                }
                arg2.field5296.method284(arg4, arg1, var8);
                arg3 -= var8;
                int var9 = 262144 / var7;
                arg1 += var8;
                arg2.field5302 += var7 * var8 - 1048576;
                int var10 = class264.field4185 / 100;
                class141 var11 = arg2.field5296;
                if (var10 > var9) {
                    var10 = var9;
                }
                if (this.field563.field2790[arg2.field5281] == 0) {
                    arg2.field5296 = class141.method956(arg2.field5290, var11.method954(), var11.method940(), var11.method961());
                } else {
                    arg2.field5296 = class141.method956(arg2.field5290, var11.method954(), 0, var11.method961());
                    this.field563.method1196((byte) -75, arg2.field5294.field4857[arg2.field5291] < 0, arg2);
                    arg2.field5296.method978(var10, var11.method940());
                }
                if (arg2.field5294.field4857[arg2.field5291] < 0) {
                    arg2.field5296.method979(-1);
                }
                var11.method942(var10);
                var11.method284(arg4, arg1, arg5 - arg1);
                if (var11.method975()) {
                    this.field579.method741(var11);
                }
            }
        }
        arg2.field5296.method284(arg4, arg1, arg3);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([III)V", line = 238)
    public final void method284(int[] arg0, int arg1, int arg2) {
        field568++;
        this.field579.method284(arg0, arg1, arg2);
        for (class340 var4 = (class340) this.field575.method1807((byte) 7); var4 != null; var4 = (class340) this.field575.method1808(18051)) {
            if (!this.field563.method1209(0, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field5276) {
                        this.method283((byte) 98, var5, var4, var6, arg0, var5 + var6);
                        var4.field5276 -= var6;
                        break;
                    }
                    this.method283((byte) 99, var5, var4, var4.field5276, arg0, var5 + var6);
                    var5 += var4.field5276;
                    var6 -= var4.field5276;
                } while (!this.field563.method1195(var5, var6, var4, 127, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILoj;)V", line = 278)
    private final void method285(int arg0, int arg1, class340 arg2) {
        field562++;
        if (arg0 != 28453) {
            return;
        }
        if ((this.field563.field2836[arg2.field5281] & 0x4) != 0 && arg2.field5292 < 0) {
            int var4 = this.field563.field2789[arg2.field5281] / class264.field4185;
            int var5 = (var4 + 1048575 - arg2.field5302) / var4;
            arg2.field5302 = arg2.field5302 + (arg1 * var4) & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field563.field2790[arg2.field5281] == 0) {
                    arg2.field5296 = class141.method956(arg2.field5290, arg2.field5296.method954(), arg2.field5296.method940(), arg2.field5296.method961());
                } else {
                    arg2.field5296 = class141.method956(arg2.field5290, arg2.field5296.method954(), 0, arg2.field5296.method961());
                    this.field563.method1196((byte) -75, arg2.field5294.field4857[arg2.field5291] < 0, arg2);
                }
                if (arg2.field5294.field4857[arg2.field5291] < 0) {
                    arg2.field5296.method979(-1);
                }
                arg1 = arg2.field5302 / var4;
            }
        }
        arg2.field5296.method288(arg1);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V", line = 318)
    public static void method286(boolean arg0) {
        if (arg0) {
            method286(true);
        }
        field572 = null;
        field578 = (byte[][][]) null;
        field565 = null;
        field571 = null;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()Lba;", line = 331)
    public final class178 method287() {
        field574++;
        class340 var1;
        do {
            var1 = (class340) this.field575.method1808(18051);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5296 == null);
        return var1.field5296;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 357)
    public final void method288(int arg0) {
        this.field579.method288(arg0);
        field577++;
        for (class340 var2 = (class340) this.field575.method1807((byte) 101); var2 != null; var2 = (class340) this.field575.method1808(18051)) {
            if (!this.field563.method1209(0, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field5276 >= var3) {
                        this.method285(28453, var3, var2);
                        var2.field5276 -= var3;
                        break;
                    }
                    this.method285(28453, var2.field5276, var2);
                    var3 -= var2.field5276;
                } while (!this.field563.method1195(0, var3, var2, 127, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ldf;)V", line = 411)
    public class41(class175 arg0) {
        this.field563 = arg0;
    }
}
