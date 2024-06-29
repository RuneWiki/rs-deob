import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class165 {

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    private int field2990;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    private int field2980;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[[I")
    private int[][] field2986;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[Lkk;")
    public static class233[] field2988 = new class233[50];

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field2987 = -2;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "[Lij;")
    public static class194[] field2991;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
    public final int method1138(int arg0, int arg1) {
        field2979++;
        if (this.field2986 != null) {
            arg0 = ((int) ((long) this.field2990 * (long) arg0 / (long) this.field2980)) + 6;
        }
        if (arg1 <= 2) {
            this.field2986 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1139(int arg0) {
        field2988 = null;
        field2991 = null;
        if (arg0 != 0) {
            method1142(-114, (byte) -43);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Lij;")
    public static final class194 method1140(byte arg0) {
        class194 var1 = new class194(class241.field4360, class50.field996, class182.field3289[0], class271.field4815[0], class110.field2226[0], class185.field3332[0], class202.field3638[0], class117.field2341);
        if (arg0 <= 20) {
            return null;
        } else {
            class63.method468(125);
            field2989++;
            return var1;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)I")
    public final int method1141(boolean arg0, int arg1) {
        if (!arg0) {
            field2988 = null;
        }
        field2985++;
        if (this.field2986 != null) {
            arg1 = (int) ((long) this.field2990 * (long) arg1 / (long) this.field2980);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)Z")
    public static final boolean method1142(int arg0, byte arg1) {
        field2978++;
        if (arg1 != -105) {
            method1139(113);
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([BI)[B")
    public final byte[] method1143(byte[] arg0, int arg1) {
        field2983++;
        if (this.field2986 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2990 / (long) this.field2980) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2986[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2990 + var6;
                int var14 = var13 / this.field2980;
                var6 = var13 - this.field2980 * var14;
                var4 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        int var15 = 60 / ((arg1 + 61) / 49);
        return arg0;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V")
    public static final void method1144(int arg0, int arg1) {
        field2981++;
        class195 var2 = class178.method1229(arg0, 4, -113);
        if (arg1 <= -22) {
            var2.method1340(true);
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II)V")
    public class165(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class206.method1406(arg0, -120, arg1);
            int var4 = arg1 / var3;
            this.field2990 = var4;
            int var5 = arg0 / var3;
            this.field2980 = var5;
            this.field2986 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2986[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var4 / (double) var5;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 32767) {
            method1145(-102, 108, 55, 54, 126, -9, -102, 47);
        }
        field2984++;
        if (arg0 == arg7) {
            class60.method455(arg1, arg6, arg7, 122, arg2, arg5, arg3);
        } else if (class262.field4723 <= arg6 - arg7 && class230.field4184 >= (arg6 + arg7) && class102.field1957 <= (arg2 - arg0) && class155.field2847 >= arg2 + arg0) {
            class34.method264(arg7, arg2, arg3, arg6, arg5, 95, arg1, arg0);
        } else {
            class178.method1230((byte) 111, arg1, arg5, arg0, arg3, arg7, arg6, arg2);
        }
    }
}
