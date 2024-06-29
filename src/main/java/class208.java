import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class208 extends class128 {

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    private int field2948 = 4;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    private int field2950 = 4;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "[I")
    public static int[] field2954 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field2955 = 0;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "Ldh;")
    public static class179 field2951 = new class179(200);

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "[[B")
    public static byte[][] field2956 = new byte[50][];

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V", line = 4)
    public static final void method1430(int arg0, Object[] arg1, long[] arg2) {
        class240.method1722(arg2, false, arg1, 0, arg2.length - 1);
        if (arg0 != 22590) {
            field2956 = (byte[][]) ((byte[][]) null);
        }
        field2945++;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(BI)[I", line = 21)
    public final int[] method126(byte arg0, int arg1) {
        field2946++;
        if (arg0 <= 100) {
            this.method102(19, -75);
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int var4 = class10.field141 / this.field2948;
            int var5 = class322.field4940 / this.field2950;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method851((byte) -126, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method851((byte) -95, 0, class322.field4940 * var7 / var5);
            }
            for (int var8 = 0; var8 < class10.field141; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class10.field141 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lp;II)V", line = 82)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2948 = arg0.method661(-1);
        } else if (arg1 == 1) {
            this.field2950 = arg0.method661(-1);
        }
        if (arg2 > -85) {
            field2956 = (byte[][]) ((byte[][]) null);
        }
        field2953++;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 128)
    public class208() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)J", line = 115)
    public static final long method1431(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        return var3 == null || var3.field3209 == null ? 0L : var3.field3209.field1937;
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V", line = 132)
    public static void method1432(int arg0) {
        if (arg0 == 2) {
            field2954 = null;
            field2951 = null;
            field2956 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[[I", line = 146)
    public final int[][] method102(int arg0, int arg1) {
        field2952++;
        int[][] var3 = this.field1755.method875(49, arg0);
        if (this.field1755.field1815) {
            int var4 = class10.field141 / this.field2948;
            int var5 = class322.field4940 / this.field2950;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method855(-3102, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method855(-3102, class322.field4940 * var7 / var5, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var3[0];
            int[] var11 = var6[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class10.field141; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class10.field141 * var16 / var4;
                }
                var10[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var11[var15];
            }
        }
        return arg1 == 5110 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)Z", line = 219)
    public static final boolean method1433(int arg0, int arg1, int arg2, int arg3) {
        if (!class99.method600(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class167.field2324[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class330.field5053) {
                    if (!class184.method1282(var4, var6, var5)) {
                        return false;
                    }
                    if (!class184.method1282(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class184.method1282(var4, var7, var5)) {
                        return false;
                    }
                    if (!class184.method1282(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class184.method1282(var4, var8, var5)) {
                    return false;
                }
                if (!class184.method1282(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class165.field2287) {
                    if (!class184.method1282(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class184.method1282(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class184.method1282(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class184.method1282(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class184.method1282(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class184.method1282(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class330.field5053) {
                    if (!class184.method1282(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class184.method1282(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class184.method1282(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class184.method1282(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class184.method1282(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class184.method1282(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class165.field2287) {
                    if (!class184.method1282(var4, var6, var5)) {
                        return false;
                    }
                    if (!class184.method1282(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class184.method1282(var4, var7, var5)) {
                        return false;
                    }
                    if (!class184.method1282(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class184.method1282(var4, var8, var5)) {
                    return false;
                }
                if (!class184.method1282(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class184.method1282(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class184.method1282(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class184.method1282(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class184.method1282(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class184.method1282(var4, var8, var5);
        } else {
            return true;
        }
    }
}
