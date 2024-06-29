import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class213 extends class335 {

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    private int field3239 = 4096;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "[I")
    private int[] field3240 = new int[3];

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    private int field3242 = 409;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
    private int field3245 = 4096;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    private int field3244 = 4096;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "Lpg;")
    public static class320 field3248 = new class320(64);

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "I")
    public static int field3251 = 0;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    public static int field3250 = 0;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "Ljava/lang/String;")
    public static String field3254 = "Drop";

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "F")
    public static float field3252;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)I", line = 4)
    public static final int method1497(boolean arg0) {
        field3243++;
        if (class162.field2445 == null) {
            return -1;
        }
        while (class162.field2445.field4696 > class342.field5327) {
            if (class162.field2445.method2051((byte) -123, class342.field5327)) {
                return class342.field5327++;
            }
            class342.field5327++;
        }
        if (!arg0) {
            method1501(-122, 90, -62, (class133) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 27)
    public class213() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILkh;I)V", line = 39)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg2 < 51) {
            method1500((class133) null, -105, -104, 22);
        }
        if (arg0 == 0) {
            this.field3242 = arg1.method1151(-110);
        } else if (arg0 == 1) {
            this.field3239 = arg1.method1151(-58);
        } else if (arg0 == 2) {
            this.field3244 = arg1.method1151(-123);
        } else if (arg0 == 3) {
            this.field3245 = arg1.method1151(-81);
        } else if (arg0 == 4) {
            int var5 = arg1.method1156((byte) 126);
            this.field3240[2] = class270.method1860(0, var5 >> 12);
            this.field3240[1] = class270.method1860(65280, var5) >> 4;
            this.field3240[0] = class270.method1860(var5, 16711680) << 4;
        }
        field3237++;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)Ljava/lang/String;", line = 102)
    public static final String method1498(int arg0, int arg1) {
        field3247++;
        String var2 = Integer.toString(arg0);
        if (arg1 != 700) {
            method1497(false);
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() <= 9) {
            return var2.length() <= 6 ? " <col=ffff00>" + var2 + "</col>" : " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class52.field864 + " (" + var2 + ")</col>";
        } else {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class5.field46 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V", line = 132)
    public static void method1499(int arg0) {
        if (arg0 == -382808628) {
            field3248 = null;
            field3254 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)[[I", line = 162)
    public final int[][] method249(int arg0, byte arg1) {
        if (arg1 != 51) {
            return (int[][]) ((int[][]) null);
        }
        field3236++;
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int[][] var4 = this.method2328(arg0, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class105.field1630; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3240[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field3242) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field3240[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field3242) {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field3240[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field3242) {
                            var8[var11] = this.field3245 * var12 >> 12;
                            var9[var11] = this.field3244 * var14 >> 12;
                            var10[var11] = this.field3239 * var16 >> 12;
                        } else {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        }
                    } else {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ll;III)Lin;", line = 261)
    public static final class168 method1500(class133 arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 69) {
            method1498(38, -101);
        }
        field3238++;
        return class181.method1296(false, arg0, arg3, arg2) ? class170.method1232(false) : null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIILl;)[Lqd;", line = 280)
    public static final class252[] method1501(int arg0, int arg1, int arg2, class133 arg3) {
        field3241++;
        if (arg0 <= 126) {
            field3248 = (class320) null;
        }
        return class181.method1296(false, arg3, arg2, arg1) ? class239.method1665(0) : null;
    }
}
