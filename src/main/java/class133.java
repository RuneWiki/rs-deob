import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class133 extends class53 {

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    private int field2298 = 4;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    private int field2301 = 4;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "[I")
    public static int[] field2287 = new int[32];

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "Lwa;")
    private static class75 field2299 = class66.method560("Allocating memory", false);

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field2295 = 2301979;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "Lwa;")
    public static class75 field2294 = field2299;

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "Lwa;")
    public static class75 field2303 = class66.method560(" loggt sich aus)3", false);

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "Lc;")
    public static class289 field2300;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "[Lbh;")
    public static class258[] field2290;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILja;Z)V", line = 8)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (!arg2) {
            method1034((byte) -49, (class96) null);
        }
        field2286++;
        if (arg0 == 0) {
            this.field2301 = arg1.method501(0);
        } else if (arg0 == 1) {
            this.field2298 = arg1.method501(0);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[[I", line = 43)
    public final int[][] method66(int arg0, int arg1) {
        field2288++;
        int[][] var3 = this.field882.method874(false, arg0);
        int var4 = 51 % ((arg1 - 76) / 42);
        if (this.field882.field1935) {
            int var5 = class269.field4644 / this.field2301;
            int var6 = class303.field5189 / this.field2298;
            int[][] var8;
            if (var6 > 0) {
                int var7 = arg0 % var6;
                var8 = this.method388(111, 0, class303.field5189 * var7 / var6);
            } else {
                var8 = this.method388(118, 0, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var8[1];
            int[] var14 = var3[2];
            for (int var15 = 0; var15 < class269.field4644; var15++) {
                int var16;
                if (var5 <= 0) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var5;
                    var16 = class269.field4644 * var17 / var5;
                }
                var11[var15] = var9[var16];
                var12[var15] = var13[var16];
                var14[var15] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)[I", line = 127)
    public final int[] method59(int arg0, int arg1) {
        field2297++;
        if (arg0 != -15196) {
            this.field2298 = 20;
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 127);
        if (this.field878.field3749) {
            int var4 = class269.field4644 / this.field2301;
            int var5 = class303.field5189 / this.field2298;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method391(0, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method391(0, arg0 ^ 0xFFFFC4A4, class303.field5189 * var7 / var5);
            }
            for (int var8 = 0; var8 < class269.field4644; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class269.field4644 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)V", line = 179)
    public static void method1031(int arg0) {
        int var1 = 72 % ((47 - arg0) / 53);
        field2303 = null;
        field2290 = null;
        field2287 = null;
        field2299 = null;
        field2294 = null;
        field2300 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lre;I)Z", line = 192)
    public static final boolean method1032(class262 arg0, int arg1) {
        field2293++;
        if (arg0.field4529 == null) {
            return false;
        }
        if (arg1 != 4) {
            method1032((class262) null, -87);
        }
        for (int var2 = 0; var2 < arg0.field4529.length; var2++) {
            int var3 = class99.method757(0, arg0, var2);
            int var4 = arg0.field4409[var2];
            if (arg0.field4529[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field4529[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field4529[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[JI[II)V", line = 252)
    public static final void method1033(int arg0, long[] arg1, int arg2, int[] arg3, int arg4) {
        field2291++;
        if (arg2 > arg4) {
            int var5 = arg4;
            int var6 = (arg2 + arg4) / 2;
            long var7 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var7;
            int var9 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var9;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if ((long) (var10 & 0x1) + var7 > arg1[var10]) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var5];
                    arg1[var5] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var5];
                    arg3[var5++] = var13;
                }
            }
            arg1[arg2] = arg1[var5];
            arg1[var5] = var7;
            arg3[arg2] = arg3[var5];
            arg3[var5] = var9;
            method1033(-32, arg1, var5 - 1, arg3, arg4);
            method1033(-106, arg1, arg2, arg3, var5 + 1);
        }
        int var14 = -124 / ((43 - arg0) / 51);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 304)
    public class133() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLwc;)I", line = 322)
    public static final int method1034(byte arg0, class96 arg1) {
        if (arg0 <= 96) {
            method1032((class262) null, 121);
        }
        field2296++;
        int var2 = arg1.field1554;
        if (arg1.field3228 == arg1.field3215) {
            var2 = arg1.field1566;
        } else if (arg1.field3244 == arg1.field3215) {
            var2 = arg1.field1557;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)I", line = 357)
    public static final int method1035(int arg0, int arg1) {
        if (arg0 != 7127) {
            method1035(-105, -13);
        }
        field2289++;
        return arg1 >> 11 & 0x7F;
    }
}
