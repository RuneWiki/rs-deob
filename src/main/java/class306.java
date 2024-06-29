import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class306 extends class112 {

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    private int field5252 = 0;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    private int field5251 = 0;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    private int field5259 = 0;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "Lne;")
    public static class235 field5254 = new class235(64);

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "Z")
    public static boolean field5255 = false;

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "Lwm;")
    private static class152 field5266 = class157.method1048(" is already on your friend list)3", 94);

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "Lwm;")
    public static class152 field5264 = field5266;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "F")
    public static float field5260;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    private int field5250;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    private int field5253;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    private int field5258;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    private int field5262;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    private int field5263;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V", line = 9)
    public static final void method2131(byte arg0) {
        field5249++;
        boolean var1 = false;
        if (arg0 < 85) {
            field5266 = (class152) null;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class160.field2556 - 1); var2++) {
                if (class273.field4688[var2] < 1000 && class273.field4688[var2 + 1] > 1000) {
                    var1 = false;
                    class152 var3 = class55.field864[var2];
                    class55.field864[var2] = class55.field864[var2 + 1];
                    class55.field864[var2 + 1] = var3;
                    class152 var4 = class123.field1734[var2];
                    class123.field1734[var2] = class123.field1734[var2 + 1];
                    class123.field1734[var2 + 1] = var4;
                    int var5 = class26.field445[var2];
                    class26.field445[var2] = class26.field445[var2 + 1];
                    class26.field445[var2 + 1] = var5;
                    int var6 = class64.field955[var2];
                    class64.field955[var2] = class64.field955[var2 + 1];
                    class64.field955[var2 + 1] = var6;
                    int var7 = class83.field1156[var2];
                    class83.field1156[var2] = class83.field1156[var2 + 1];
                    class83.field1156[var2 + 1] = var7;
                    short var8 = class273.field4688[var2];
                    class273.field4688[var2] = class273.field4688[var2 + 1];
                    class273.field4688[var2 + 1] = var8;
                    long var9 = class208.field3391[var2];
                    class208.field3391[var2] = class208.field3391[var2 + 1];
                    class208.field3391[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 74)
    public class306() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZII)I", line = 79)
    public static final int method2132(boolean arg0, int arg1, int arg2) {
        field5261++;
        if (arg0) {
            int var3 = arg1 - 1 & arg2 >> 31;
            return (arg2 + (arg2 >>> 31)) % arg1 + var3;
        } else {
            return -18;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)V", line = 95)
    private final void method2133(int arg0, int arg1, int arg2, int arg3) {
        field5248++;
        int var5 = arg0 > arg2 ? arg0 : arg2;
        int var6 = arg0 >= arg2 ? arg2 : arg0;
        int var7 = arg1 <= var5 ? var5 : arg1;
        int var8 = arg1 < var6 ? arg1 : var6;
        this.field5258 = (var8 + var7) / 2;
        int var9 = var7 - var8;
        if (this.field5258 > 0 && this.field5258 < 4096) {
            this.field5250 = (var9 << 12) / (this.field5258 > 2048 ? 8192 - this.field5258 * 2 : this.field5258 * 2);
        } else {
            this.field5250 = 0;
        }
        if (arg3 < 107) {
            this.field5259 = 89;
        }
        if (var9 <= 0) {
            this.field5263 = 0;
            return;
        }
        int var10 = (var7 - arg2 << 12) / var9;
        int var11 = (var7 - arg0 << 12) / var9;
        int var12 = (var7 - arg1 << 12) / var9;
        if (arg0 == var7) {
            this.field5263 = arg2 == var8 ? var12 + 20480 : 4096 - var10;
        } else if (arg2 == var7) {
            this.field5263 = arg1 == var8 ? var11 + 4096 : -var12 + 12288;
        } else {
            this.field5263 = arg0 == var8 ? var10 + 12288 : -var11 + 20480;
        }
        this.field5263 /= 6;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)[[I", line = 155)
    public final int[][] method55(int arg0, boolean arg1) {
        if (arg1) {
            this.method52(16, 43, (class291) null);
        }
        field5265++;
        int[][] var3 = this.field1594.method656((byte) 121, arg0);
        if (this.field1594.field1402) {
            int[][] var4 = this.method750(0, (byte) -17, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class58.field889; var11++) {
                this.method2133(var5[var11], var6[var11], var7[var11], 117);
                this.field5258 += this.field5259;
                for (this.field5263 += this.field5252; this.field5263 < 0; this.field5263 += 4096) {
                }
                if (this.field5258 < 0) {
                    this.field5258 = 0;
                }
                this.field5250 += this.field5251;
                if (this.field5250 < 0) {
                    this.field5250 = 0;
                }
                while (this.field5263 > 4096) {
                    this.field5263 -= 4096;
                }
                if (this.field5258 > 4096) {
                    this.field5258 = 4096;
                }
                if (this.field5250 > 4096) {
                    this.field5250 = 4096;
                }
                this.method2134((byte) 76, this.field5263, this.field5250, this.field5258);
                var9[var11] = this.field5256;
                var10[var11] = this.field5253;
                var8[var11] = this.field5262;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIII)V", line = 235)
    private final void method2134(byte arg0, int arg1, int arg2, int arg3) {
        field5257++;
        int var5 = arg3 > 2048 ? arg2 + arg3 - (arg2 * arg3 >> 12) : (arg2 + 4096) * arg3 >> 12;
        if (var5 > 0) {
            int var6 = arg1 * 6;
            int var7 = arg3 + arg3 - var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var7 + var13;
            if (var9 == 0) {
                this.field5253 = var15;
                this.field5262 = var7;
                this.field5256 = var5;
            } else if (var9 == 1) {
                this.field5262 = var7;
                this.field5256 = var14;
                this.field5253 = var5;
            } else if (var9 == 2) {
                this.field5262 = var15;
                this.field5253 = var5;
                this.field5256 = var7;
            } else if (var9 == 3) {
                this.field5256 = var7;
                this.field5253 = var14;
                this.field5262 = var5;
            } else if (var9 == 4) {
                this.field5256 = var15;
                this.field5262 = var5;
                this.field5253 = var7;
            } else if (var9 == 5) {
                this.field5256 = var5;
                this.field5262 = var14;
                this.field5253 = var7;
            }
        } else {
            this.field5256 = this.field5253 = this.field5262 = arg3;
        }
        if (arg0 != 76) {
            field5266 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)V", line = 343)
    public static void method2135(int arg0) {
        field5264 = null;
        field5266 = null;
        if (arg0 != 890804268) {
            field5255 = false;
        }
        field5254 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILhi;)V", line = 367)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.field5252 = arg2.method1986(true);
        } else if (arg1 == 1) {
            this.field5251 = (arg2.method1962(false) << 12) / 100;
        } else if (arg1 == 2) {
            this.field5259 = (arg2.method1962(false) << 12) / 100;
        }
        if (arg0 != 31164) {
            this.field5259 = -109;
        }
        field5247++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 417)
    public static final void method2136(boolean arg0) {
        class37.field607.method1619(11300);
        field5267++;
        if (!arg0) {
            class211.field3425.method1619(11300);
        }
    }
}
