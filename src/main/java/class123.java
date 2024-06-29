import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class123 extends class303 {

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "[I")
    private int[] field1963 = new int[3];

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    private int field1957 = 4096;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    private int field1964 = 4096;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field1961 = 409;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    private int field1966 = 4096;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field1958 = -1;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "Lik;")
    public static class259 field1965 = new class259(5);

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field1967 = 1;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "Z")
    public static boolean field1968 = false;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public static int field1970 = 0;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "C")
    public static char field1969;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "[I")
    public static int[] field1971;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)V", line = 6)
    public static void method931(int arg0) {
        field1971 = null;
        if (arg0 <= -105) {
            field1965 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[[I", line = 22)
    public final int[][] method74(int arg0, int arg1) {
        if (arg1 != 82) {
            this.field1964 = 29;
        }
        int[][] var3 = this.field4772.method1175(-105, arg0);
        if (this.field4772.field2488) {
            int[][] var4 = this.method2106(arg0, 0, 32);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class70.field1108; var11++) {
                int var12 = var6[var11];
                int var13 = var12 - this.field1963[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field1961) {
                    var8[var11] = var12;
                    var9[var11] = var7[var11];
                    var10[var11] = var5[var11];
                } else {
                    int var14 = var7[var11];
                    int var15 = var14 - this.field1963[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field1961) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var5[var11];
                    } else {
                        int var16 = var5[var11];
                        int var17 = var16 - this.field1963[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field1961) {
                            var8[var11] = this.field1957 * var12 >> 12;
                            var9[var11] = this.field1966 * var14 >> 12;
                            var10[var11] = this.field1964 * var16 >> 12;
                        } else {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        }
                    }
                }
            }
        }
        field1959++;
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILpe;I)V", line = 112)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field1960++;
        if (arg2 == 0) {
            this.field1961 = arg1.method731(false);
        } else if (arg2 == 1) {
            this.field1964 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field1966 = arg1.method731(false);
        } else if (arg2 == 3) {
            this.field1957 = arg1.method731(false);
        } else if (arg2 == 4) {
            int var5 = arg1.method776(-1574267376);
            this.field1963[2] = class280.method2001(var5 >> 12, 0);
            this.field1963[0] = class280.method2001(267386880, var5 << 4);
            this.field1963[1] = class280.method2001(65280, var5) >> 4;
        }
        if (arg0 != -4004) {
            method931(85);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILob;)Z", line = 178)
    public static final boolean method932(int arg0, class292 arg1) {
        field1962++;
        if (arg1.field4524 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field4524.length; var2++) {
            int var3 = class178.method1320(arg1, var2, (byte) -81);
            int var4 = arg1.field4466[var2];
            if (arg1.field4524[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field4524[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field4524[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        int var5 = -20 % ((arg0 + 37) / 39);
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 233)
    public class123() {
        super(1, false);
    }
}
