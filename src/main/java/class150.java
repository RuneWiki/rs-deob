import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class150 extends class397 {

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    private int field1934 = 0;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    private int field1945 = 4096;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "[[S")
    public static short[][] field1942 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Liu;")
    public static class390 field1938 = new class390(54, 9);

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field1941;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field1946;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "[I")
    public static int[] field1944;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "[Lqg;")
    public static class307[] field1943;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method925(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lrl;IBLjava/lang/String;)Lmt;", line = 7)
    public static final class260 method921(class487 arg0, int arg1, byte arg2, String arg3) {
        ++field1935;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class18.field254, 0);
        int var6 = -70 / ((arg2 - 41) / 33);
        if (~class18.field254[0] == -1) {
            if (~class18.field254[0] == -1) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class18.field254, 1);
            if (~class18.field254[1] < -2) {
                byte[] var7 = new byte[class18.field254[1]];
                OpenGL.glGetInfoLogARB(var4, class18.field254[1], class18.field254, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class18.field254[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class260(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIII)Z", line = 47)
    public static final boolean method922(byte arg0, int arg1, int arg2, int arg3) {
        ++field1941;
        class113 var4 = (class113) class478.method2795(arg1, arg2, arg3);
        int var5 = 125 % ((-13 - arg0) / 63);
        boolean var6 = true;
        if (var4 != null) {
            var6 &= class105.method631(-119, var4);
        }
        class113 var7 = (class113) class124.method701(arg1, arg2, arg3, field1946 != null ? field1946 : (field1946 = method925("sq")));
        if (var7 != null) {
            var6 &= class105.method631(-121, var7);
        }
        class113 var8 = (class113) class79.method515(arg1, arg2, arg3);
        if (var8 != null) {
            var6 &= class105.method631(-120, var8);
        }
        return var6;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[I", line = 73)
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -780833076) {
            return null;
        } else {
            ++field1936;
            int[] var3 = super.field5854.method465(arg1, arg0 ^ -780833105);
            if (super.field5854.field991) {
                int[] var4 = this.method2376(arg0 + 780833159, 0, arg1);
                for (int var5 = 0; ~var5 > ~class164.field2152; ++var5) {
                    int var6 = var4[var5];
                    if (this.field1934 <= var6) {
                        if (~this.field1945 > ~var6) {
                            var3[var5] = this.field1945;
                        } else {
                            var3[var5] = var6;
                        }
                    } else {
                        var3[var5] = this.field1934;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 196)
    public class150() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V", line = 122)
    public static void method923(int arg0) {
        field1938 = null;
        field1944 = null;
        if (arg0 == -21217) {
            field1942 = null;
            field1943 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(III)I", line = 136)
    public static final int method924(int arg0, int arg1, int arg2) {
        ++field1937;
        if (~arg0 != -2 && ~arg0 != -4) {
            int var3 = 16 / ((-60 - arg1) / 51);
            return class288.field4110[3 & arg2];
        } else {
            return class204.field2824[arg2 & 3];
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBLae;)V", line = 153)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field1940;
        if (arg1 == 80) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        super.field5859 = arg2.method941((byte) 125) == 1;
                    }
                } else {
                    this.field1945 = arg2.method993((byte) -91);
                }
            } else {
                this.field1934 = arg2.method993((byte) -49);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[[I", line = 206)
    public final int[][] method486(byte arg0, int arg1) {
        ++field1939;
        if (arg0 < 81) {
            this.field1934 = 11;
        }
        int[][] var3 = super.field5848.method1692(arg1, 59);
        if (super.field5848.field3939) {
            int[][] var4 = this.method2377(arg1, -20, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class164.field2152 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field1934 <= var12) {
                    if (var12 <= this.field1945) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field1945;
                    }
                } else {
                    var8[var11] = this.field1934;
                }
                if (var13 >= this.field1934) {
                    if (this.field1945 < var13) {
                        var9[var11] = this.field1945;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field1934;
                }
                if (this.field1934 > var14) {
                    var10[var11] = this.field1934;
                } else if (~this.field1945 > ~var14) {
                    var10[var11] = this.field1945;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }
}
