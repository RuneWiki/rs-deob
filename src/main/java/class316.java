import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class316 extends class335 {

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    private int field4925 = 8;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    private int field4929 = 4;

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "I")
    private int field4937 = 81;

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "I")
    private int field4938 = 0;

    @OriginalMember(owner = "client!jl", name = "bb", descriptor = "I")
    private int field4941 = 409;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    private int field4928 = 1024;

    @OriginalMember(owner = "client!jl", name = "hb", descriptor = "I")
    private int field4947 = 204;

    @OriginalMember(owner = "client!jl", name = "gb", descriptor = "I")
    private int field4946 = 1024;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "[I")
    public static int[] field4931 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
    private int field4939;

    @OriginalMember(owner = "client!jl", name = "cb", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!jl", name = "db", descriptor = "I")
    private int field4943;

    @OriginalMember(owner = "client!jl", name = "eb", descriptor = "I")
    private int field4944;

    @OriginalMember(owner = "client!jl", name = "jb", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!jl", name = "fb", descriptor = "[I")
    private int[] field4945;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "[[I")
    private int[][] field4927;

    @OriginalMember(owner = "client!jl", name = "ib", descriptor = "[[I")
    private int[][] field4948;

    @OriginalMember(owner = "client!jl", name = "ab", descriptor = "[[[Lff;")
    public static class142[][][] field4940;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIII)Z", line = 4)
    public static final boolean method2148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 446)
    public class316() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V", line = 39)
    public static final void method2149(int arg0) {
        class219.field3337.method2174(-10385);
        field4926++;
        if (arg0 != 18266) {
            method2152(-128);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILkh;I)V", line = 75)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field4929 = arg1.method1178(0);
        } else if (arg0 == 1) {
            this.field4925 = arg1.method1178(0);
        } else if (arg0 == 2) {
            this.field4941 = arg1.method1151(-55);
        } else if (arg0 == 3) {
            this.field4947 = arg1.method1151(-105);
        } else if (arg0 == 4) {
            this.field4946 = arg1.method1151(-97);
        } else if (arg0 == 5) {
            this.field4938 = arg1.method1151(-99);
        } else if (arg0 == 6) {
            this.field4937 = arg1.method1151(-60);
        } else if (arg0 == 7) {
            this.field4928 = arg1.method1151(-91);
        }
        if (arg2 >= 51) {
            field4949++;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)V", line = 148)
    public static void method2150(byte arg0) {
        field4940 = (class142[][][]) null;
        field4931 = null;
        if (arg0 <= 124) {
            field4931 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)[I", line = 162)
    public final int[] method149(int arg0, int arg1) {
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int var4 = 0;
            int var5;
            for (var5 = class280.field4316[arg0] + this.field4938; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field4925 && this.field4945[var4] <= var5) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field4945[var4];
            int var9 = this.field4945[var4 - 1];
            if ((this.field4944 + var9) < var5 && var5 < var8 - this.field4944) {
                for (int var10 = 0; var10 < class105.field1630; var10++) {
                    int var11 = 0;
                    int var12 = var7 ? this.field4946 : -this.field4946;
                    int var13;
                    for (var13 = class90.field1437[var10] + (this.field4939 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field4929 && this.field4927[var6][var11] <= var13) {
                        var11++;
                    }
                    int var14 = this.field4927[var6][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field4927[var6][var15];
                    if (this.field4944 + var16 < var13 && var14 - this.field4944 > var13) {
                        var3[var10] = this.field4948[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class343.method2376(var3, 0, class105.field1630, 0);
            }
        }
        field4936++;
        if (arg1 != 621) {
            this.field4946 = 19;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)V", line = 262)
    private final void method2151(int arg0) {
        if (arg0 > -7) {
            field4931 = (int[]) null;
        }
        field4934++;
        Random var2 = new Random((long) this.field4925);
        this.field4939 = 4096 / this.field4929;
        this.field4944 = this.field4937 / 2;
        this.field4945 = new int[this.field4925 + 1];
        this.field4948 = new int[this.field4925][this.field4929];
        this.field4943 = 4096 / this.field4925;
        this.field4927 = new int[this.field4925][this.field4929 + 1];
        this.field4945[0] = 0;
        int var3 = this.field4939 / 2;
        int var4 = this.field4943 / 2;
        for (int var5 = 0; var5 < this.field4925; var5++) {
            if (var5 > 0) {
                int var6 = this.field4943;
                int var7 = (class85.method615(var2, 4096, true) - 2048) * this.field4947 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4945[var5] = this.field4945[var5 - 1] + var8;
            }
            this.field4927[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4929; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4939;
                    int var11 = (class85.method615(var2, 4096, true) - 2048) * this.field4941 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4927[var5][var9] = this.field4927[var5][var9 - 1] + var12;
                }
                this.field4948[var5][var9] = this.field4928 > 0 ? 4096 - class85.method615(var2, this.field4928, true) : 4096;
            }
            this.field4927[var5][this.field4929] = 4096;
        }
        this.field4945[this.field4925] = 4096;
    }

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "(I)V", line = 341)
    public static final void method2152(int arg0) {
        field4932++;
        if (class180.field2706.toLowerCase().indexOf("microsoft") == -1) {
            class137.field2164[61] = 27;
            class137.field2164[59] = 57;
            class137.field2164[46] = 72;
            class137.field2164[44] = 71;
            class137.field2164[45] = 26;
            class137.field2164[93] = 43;
            class137.field2164[47] = 73;
            if (class180.field2723 == null) {
                class137.field2164[222] = 59;
                class137.field2164[192] = 58;
            } else {
                class137.field2164[192] = 28;
                class137.field2164[222] = 58;
                class137.field2164[520] = 59;
            }
            class137.field2164[92] = 74;
            class137.field2164[91] = 42;
        } else {
            class137.field2164[186] = 57;
            class137.field2164[192] = 58;
            class137.field2164[188] = 71;
            class137.field2164[189] = 26;
            class137.field2164[219] = 42;
            class137.field2164[223] = 28;
            class137.field2164[222] = 59;
            class137.field2164[220] = 74;
            class137.field2164[187] = 27;
            class137.field2164[190] = 72;
            class137.field2164[191] = 73;
            class137.field2164[221] = 43;
        }
        if (arg0 != 189) {
            field4940 = (class142[][][]) ((class142[][][]) null);
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)V", line = 397)
    public static final void method2153(byte arg0) {
        if (arg0 != -60) {
            method2150((byte) -98);
        }
        int[] var1 = new int[class186.field2786];
        field4933++;
        int var2 = 0;
        for (int var3 = 0; var3 < class186.field2786; var3++) {
            class299 var4 = class237.method1657(2, var3);
            if (var4.field4627 >= 0 || var4.field4625 >= 0) {
                var1[var2++] = var3;
            }
        }
        class149.field2263 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class149.field2263[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V", line = 435)
    public final void method381(int arg0) {
        this.method2151(-120);
        int var2 = 95 / ((44 - arg0) / 35);
        field4942++;
    }
}
