import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class135 extends class326 {

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "[I")
    public static int[] field1974 = new int[500];

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "F")
    public static float field1975 = 0.0F;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field1981 = -1;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "[Lq;")
    public static class193[] field1983 = new class193[14];

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "[I")
    public static int[] field1979;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)[[I", line = 12)
    public final int[][] method253(int arg0, byte arg1) {
        field1977++;
        int[][] var3 = this.field5104.method2365((byte) 57, arg0);
        int var4 = 123 / ((arg1 - 60) / 51);
        if (this.field5104.field5325) {
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class166.field2731; var8++) {
                this.method982(var8, -2048, arg0);
                int[][] var9 = this.method2293(-15033, class181.field2939, 0);
                var6[var8] = var9[0][class68.field955];
                var5[var8] = var9[1][class68.field955];
                var7[var8] = var9[2][class68.field955];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(III)V", line = 58)
    private final void method982(int arg0, int arg1, int arg2) {
        field1976++;
        int var4 = class110.field1527[arg0];
        int var5 = class34.field508[arg2];
        float var6 = (float) Math.atan2((double) (arg1 + var4), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && -2.356194490192345D >= (double) var6) {
            class68.field955 = arg0;
            class181.field2939 = arg2;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class181.field2939 = arg0;
            class68.field955 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class68.field955 = class166.field2731 - arg2;
            class181.field2939 = arg0;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class68.field955 = arg0;
            class181.field2939 = class302.field4637 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class68.field955 = class166.field2731 - arg0;
            class181.field2939 = class302.field4637 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class68.field955 = class166.field2731 - arg2;
            class181.field2939 = class302.field4637 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class68.field955 = arg2;
            class181.field2939 = class302.field4637 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class68.field955 = class166.field2731 - arg0;
            class181.field2939 = arg2;
        }
        class181.field2939 &= class29.field427;
        class68.field955 &= class215.field3397;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V", line = 129)
    public static void method983(int arg0) {
        field1983 = null;
        field1979 = null;
        field1974 = null;
        if (arg0 > -116) {
            field1981 = 23;
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)V", line = 141)
    public static final void method984(int arg0) {
        class284.field4405 = arg0;
        for (int var1 = 0; var1 < class131.field1938; var1++) {
            for (int var2 = 0; var2 < class308.field4794; var2++) {
                if (class83.field1138[arg0][var1][var2] == null) {
                    class83.field1138[arg0][var1][var2] = new class124(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 164)
    public class135() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lvc;I)V", line = 169)
    public static final void method985(class137 arg0, int arg1) {
        class309 var2 = null;
        field1984++;
        try {
            class114 var3 = arg0.method1010("runescape", true);
            while (var3.field1595 == 0) {
                class272.method1918((byte) 22, 1L);
            }
            if (var3.field1595 == 1) {
                var2 = (class309) var3.field1591;
                class6 var4 = class169.method1266(-122);
                var2.method2136((byte) -69, var4.field115, var4.field111, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2135(122);
            }
            if (arg1 > -98) {
                field1974 = (int[]) null;
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BII)V", line = 208)
    public static final void method986(byte arg0, int arg1, int arg2) {
        field1978++;
        class34 var3 = class91.method656(arg1, -2, 1);
        if (arg0 >= -76) {
            method984(90);
        }
        var3.method307(-19063);
        var3.field500 = arg2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIFIZII)[[I", line = 224)
    public static final int[][] method987(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field1985++;
        int[][] var9 = new int[arg0][arg2];
        class113 var10 = new class113();
        var10.field1564 = arg1;
        var10.field1563 = arg8;
        if (arg5 != 18324) {
            field1983 = (class193[]) null;
        }
        var10.field1562 = arg6;
        var10.field1584 = (int) (arg4 * 4096.0F);
        var10.field1576 = arg3;
        var10.method99((byte) 31);
        class121.method874(arg2, arg0, true);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method804(var9[var11], 41, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[I", line = 257)
    public final int[] method103(int arg0, int arg1) {
        field1986++;
        if (arg0 >= -25) {
            method984(-82);
        }
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            for (int var4 = 0; var4 < class166.field2731; var4++) {
                this.method982(var4, -2048, arg1);
                int[] var5 = this.method2287(0, class181.field2939, -3896);
                var3[var4] = var5[class68.field955];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)Lcm;", line = 290)
    public static final class332 method988(int arg0, int arg1) {
        field1982++;
        class332 var2 = (class332) class200.field3200.method1628(true, (long) arg1);
        if (arg0 != -20887) {
            field1979 = (int[]) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class163.field2643.method1813(arg1, 5, true);
        class332 var4 = new class332();
        if (var3 != null) {
            var4.method2312(new class6(var3), false);
        }
        class200.field3200.method1627((byte) 97, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZLvl;)V", line = 324)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field5121 = arg2.method58(-288140008) == 1;
        }
        if (arg1) {
            field1974 = (int[]) null;
        }
        field1980++;
    }
}
