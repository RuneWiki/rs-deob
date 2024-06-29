import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class287 extends class36 {

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "Z")
    public boolean field4270 = true;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Z")
    public static boolean field4256 = true;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field4274 = 0;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "Z")
    public static boolean field4275 = false;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    public static int field4278 = 0;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "Lkm;")
    public static class133 field4267;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "[I")
    private int[] field4263;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "[I")
    public int[] field4272;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field4264;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "[[I")
    private int[][] field4273;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)I", line = 12)
    public final int method1964(int arg0) {
        field4271++;
        if (this.field4263 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field4272 = (int[]) null;
            }
            return this.field4263.length;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[ILcg;)V", line = 28)
    public final void method1965(int arg0, int[] arg1, class316 arg2) {
        field4259++;
        if (this.field4263 == null) {
            return;
        }
        for (int var4 = arg0; var4 < this.field4263.length && var4 < arg1.length; var4++) {
            int var5 = class339.field5097[this.method1970(var4, -116)];
            if (var5 > 0) {
                arg2.method2209((byte) 110, (long) arg1[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIII)V", line = 54)
    public static final void method1966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4262++;
        int var9 = arg3 - arg7;
        int var10 = (arg8 - arg5 << 16) / var9;
        if (arg0 != -799384912) {
            method1977((byte) -59, -82);
        }
        int var11 = arg1 - arg4;
        int var12 = (arg2 - arg6 << 16) / var11;
        class128.method922(arg1, arg6, (byte) 111, arg3, var10, arg7, arg4, 0, var12, arg5, 0);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLcg;)Ljava/lang/String;", line = 75)
    public final String method1967(byte arg0, class316 arg1) {
        if (arg0 < 84) {
            return (String) null;
        }
        field4261++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4263 != null) {
            for (int var4 = 0; var4 < this.field4263.length; var4++) {
                var3.append(this.field4264[var4]);
                var3.append(class68.method502(this.field4273[var4], (byte) -125, arg1.method2200(true, class313.field4726[this.field4263[var4]]), this.field4263[var4]));
            }
        }
        var3.append(this.field4264[this.field4264.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLjava/lang/String;)J", line = 105)
    public static final long method1968(byte arg0, String arg1) {
        field4269++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0 >= -114) {
            method1975(false, -8);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V", line = 126)
    public static void method1969(int arg0) {
        field4267 = null;
        if (arg0 != -13299) {
            field4278 = 19;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)I", line = 137)
    public final int method1970(int arg0, int arg1) {
        field4276++;
        if (arg1 >= -87) {
            method1971(-58, -79);
        }
        return this.field4263 == null || arg0 < 0 || this.field4263.length < arg0 ? -1 : this.field4263[arg0];
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)Lkk;", line = 151)
    public static final class71 method1971(int arg0, int arg1) {
        field4268++;
        class71 var2 = (class71) class42.field482.method365((long) arg0, 35);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class143.field1968.method955(0, arg0, -21853);
        } else {
            var3 = class83.field1203.method955(0, arg0 & 0x7FFF, -21853);
        }
        class71 var4 = new class71();
        if (var3 != null) {
            var4.method518(new class316(var3), (byte) -102);
        }
        int var5 = -94 % ((arg1 + 39) / 55);
        if (arg0 >= 32768) {
            var4.method524((byte) 9);
        }
        class42.field482.method369(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)I", line = 185)
    public final int method1972(int arg0, int arg1, byte arg2) {
        field4266++;
        if (arg2 != -56) {
            this.method1974(21);
        }
        if (this.field4263 == null || arg1 < 0 || arg1 > this.field4263.length) {
            return -1;
        } else if (this.field4273[arg1] == null || arg0 < 0 || this.field4273[arg1].length < arg0) {
            return -1;
        } else {
            return this.field4273[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lcg;IB)V", line = 204)
    private final void method1973(class316 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field4264 = class159.method1150(arg0.method2158(-872702056), (byte) -83, '<');
        } else if (arg1 == 2) {
            int var4 = arg0.method2219(16448);
            this.field4272 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4272[var5] = arg0.method2220((byte) 78);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method2219(16448);
            this.field4273 = new int[var6][];
            this.field4263 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method2220((byte) 43);
                this.field4263[var7] = var8;
                this.field4273[var7] = new int[class151.field2108[var8]];
                for (int var9 = 0; var9 < class151.field2108[var8]; var9++) {
                    this.field4273[var7][var9] = arg0.method2220((byte) 104);
                }
            }
        } else if (arg1 == 4) {
            this.field4270 = false;
        }
        field4277++;
        if (arg2 <= 27) {
            field4256 = false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)Ljava/lang/String;", line = 274)
    public final String method1974(int arg0) {
        field4265++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4264 == null) {
            return "";
        }
        var2.append(this.field4264[0]);
        int var3 = 1;
        if (arg0 != -773382907) {
            this.field4273 = (int[][]) ((int[][]) null);
        }
        while (this.field4264.length > var3) {
            var2.append("...");
            var2.append(this.field4264[var3]);
            var3++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V", line = 301)
    public static final void method1975(boolean arg0, int arg1) {
        if (!arg0) {
            class42.field473.method720(arg1, 1088);
            field4260++;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILcg;)V", line = 314)
    public final void method1976(int arg0, class316 arg1) {
        if (arg0 != -1) {
            field4275 = true;
        }
        while (true) {
            int var3 = arg1.method2219(16448);
            if (var3 == 0) {
                field4258++;
                return;
            }
            this.method1973(arg1, var3, (byte) 40);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(BI)Z", line = 344)
    public static final boolean method1977(byte arg0, int arg1) {
        class54.field735 = arg1 + 1 & 0xFFFF;
        class223.field3220 = true;
        field4257++;
        return arg0 >= 108;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 358)
    public final void method1978(boolean arg0) {
        field4279++;
        if (this.field4272 != null) {
            for (int var2 = 0; var2 < this.field4272.length; var2++) {
                this.field4272[var2] = class190.method1334(this.field4272[var2], 32768);
            }
        }
        if (!arg0) {
            this.method1970(-107, 21);
        }
    }
}
