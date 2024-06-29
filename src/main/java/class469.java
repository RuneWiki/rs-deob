import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class469 {

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
    private int field6482 = -1;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "Z")
    private boolean field6481 = true;

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "I")
    private int field6493;

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "[Lls;")
    private class141[] field6491;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
    private int field6489;

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
    private int field6484;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    private int field6477;

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "[Lls;")
    private class141[] field6485;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "Lls;")
    private class141 field6487;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "[[I")
    public static int[][] field6478 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "F")
    public static float field6486;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "I")
    private int field6483;

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
    private int field6492;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "Lufa;")
    private class680 field6479;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V", line = 11)
    public final void method2636(byte arg0) {
        field6490++;
        if (arg0 != -87) {
            return;
        }
        if (this.field6491 != null) {
            for (int var2 = 0; var2 < this.field6491.length; var2++) {
                this.field6491[var2].method872();
            }
        }
        this.field6479 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IILha;)Z", line = 40)
    public final boolean method2637(int arg0, int arg1, class60 arg2) {
        if (this.field6482 != arg0) {
            this.field6482 = arg0;
            int var4 = class115.method761(31, arg0);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field6483 != var4) {
                this.field6483 = var4;
                this.field6479 = null;
            }
            if (this.field6491 != null) {
                this.field6492 = 0;
                int[] var5 = new int[this.field6491.length];
                for (int var6 = 0; var6 < this.field6491.length; var6++) {
                    class141 var7 = this.field6491[var6];
                    if (var7.method877(this.field6484, this.field6477, this.field6493, this.field6482)) {
                        var5[this.field6492] = var7.field1813;
                        this.field6485[this.field6492++] = var7;
                    }
                }
                class139.method860(var5, this.field6485, 0, this.field6492 - 1, 0);
            }
            this.field6481 = true;
        }
        if (arg1 != 6) {
            this.method2637(-20, 36, null);
        }
        field6488++;
        boolean var8 = false;
        if (this.field6481) {
            this.field6481 = false;
            for (int var9 = this.field6492 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field6485[var9].method879(arg2, this.field6487);
                var8 |= var10;
                this.field6481 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(I[Lls;IIII)V", line = 621)
    public class469(int arg0, class141[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6493 = arg5;
        this.field6491 = arg1;
        this.field6489 = arg0;
        this.field6484 = arg3;
        this.field6477 = arg4;
        if (arg1 == null) {
            this.field6485 = null;
            this.field6487 = null;
        } else {
            this.field6485 = new class141[arg1.length];
            this.field6487 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(CI)C", line = 122)
    public static final char method2638(char arg0, int arg1) {
        if (arg1 != 0) {
            return (char) 65422;
        }
        field6476++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 519)
    public static void method2639(int arg0) {
        field6478 = null;
        if (arg0 != -211) {
            field6486 = -0.43294057F;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIIILha;III)V", line = 538)
    public final void method2640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class60 arg6, int arg7, int arg8, int arg9) {
        field6475++;
        int var11 = arg0 + arg2 & 0x3FFF;
        if (this.field6489 == -1 || this.field6483 == 0) {
            arg6.method447(arg5, arg3, arg8, arg7, arg9, 0);
        } else {
            class335 var12 = class124.field1622.method925(this.field6489, arg4 ^ 0x2F2F);
            if (this.field6479 == null && class124.field1622.method922(115, this.field6489)) {
                int[] var13 = var12.field4520 == 2 ? class124.field1622.method927(111, this.field6483, this.field6489, 0.7F, false, this.field6483) : class124.field1622.method923(this.field6489, (byte) -112, this.field6483, 0.7F, false, this.field6483);
                this.field6479 = arg6.method351(-7962, 0, this.field6483, this.field6483, var13, this.field6483);
            }
            if (var12.field4520 == 2) {
                arg6.method447(arg5, arg3, arg8, arg7, arg9, 0);
            }
            if (this.field6479 != null) {
                int var14 = var12.field4520 == 2 ? 1 : 0;
                int var15 = arg1 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg8 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (arg7 < var15) {
                    var15 -= arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg8; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field6479.method3856(var17 + arg5, var18 - -arg3, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        if (arg4 != -24446) {
            this.method2640(-115, -58, 66, 67, 6, -61, null, -35, -42, 87);
        }
        for (int var19 = this.field6492 - 1; var19 >= 0; var19--) {
            this.field6485[var19].method875(arg6, arg5, arg3, arg8, arg7, arg1, var11);
        }
    }
}
