import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class718 {

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Z")
    public boolean field10046 = false;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public int field10047 = -1;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Z")
    public boolean field10040 = false;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "Z")
    public boolean field10059 = false;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    public int field10061 = 2;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public int field10043 = -1;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    public int field10062 = -1;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public int field10064 = 5;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public int field10041 = -1;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public int field10044 = 99;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public int field10051 = -1;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "Z")
    public boolean field10069 = false;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Z")
    public static boolean field10050 = false;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "Ljava/lang/String;")
    public static String field10065 = "";

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field10045;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public static int field10066;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public int field10068;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "Lsd;")
    public class93 field10058;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
    private int[] field10042;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "[I")
    public int[] field10048;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "[I")
    public int[] field10052;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "[I")
    public int[] field10053;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "[I")
    public int[] field10063;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "[I")
    public int[] field10067;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "[Z")
    public boolean[] field10071;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "[[I")
    public int[][] field10070;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static void method4004(int arg0) {
        if (arg0 < 122) {
            method4010(true, null);
        }
        field10065 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIILka;II)Lka;")
    public final class469 method4005(int arg0, int arg1, int arg2, class469 arg3, int arg4, int arg5) {
        field10045++;
        int var7 = this.field10048[arg5];
        int var8 = this.field10053[arg5];
        class755 var9 = this.field10058.method856(var8 >> 16, 2);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method325((byte) 1, arg2, true);
        }
        if (arg1 >= -90) {
            this.field10067 = null;
        }
        class755 var11 = null;
        if ((this.field10069 || class712.field9957) && arg0 != -1 && arg0 < this.field10053.length) {
            int var12 = this.field10053[arg0];
            var11 = this.field10058.method856(var12 >> 16, 2);
            arg0 = var12 & 0xFFFF;
        }
        class755 var13 = null;
        class755 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field10042 != null) {
            if (arg5 < this.field10042.length) {
                var15 = this.field10042[arg5];
                if (var15 != 65535) {
                    var13 = this.field10058.method856(var15 >> 16, 2);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field10069 || class712.field9957) && arg0 != -1 && this.field10042.length > arg0) {
                var16 = this.field10042[arg0];
                if (var16 != 65535) {
                    var14 = this.field10058.method856(var16 >> 16, 2);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field10040) {
            arg2 |= 0x200;
        }
        if (var9.method4192(100, var10)) {
            arg2 |= 0x80;
        }
        if (var9.method4195(-27751, var10)) {
            arg2 |= 0x100;
        }
        if (var9.method4194(8243, var10)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method4192(100, var15)) {
                arg2 |= 0x80;
            }
            if (var13.method4195(-27751, var15)) {
                arg2 |= 0x100;
            }
            if (var13.method4194(8243, var15)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method4192(100, arg0)) {
                arg2 |= 0x80;
            }
            if (var11.method4195(-27751, arg0)) {
                arg2 |= 0x100;
            }
            if (var11.method4194(8243, arg0)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method4192(100, var16)) {
                arg2 |= 0x80;
            }
            if (var14.method4195(-27751, var16)) {
                arg2 |= 0x100;
            }
            if (var14.method4194(8243, var16)) {
                arg2 |= 0x400;
            }
        }
        int var17 = arg2 | 0x20;
        class469 var18 = arg3.method325((byte) 1, var17, true);
        var18.method2844(this.field10040, var9, var10, 0, arg0, 8985, arg4 - 1, var11, var7);
        if (var13 != null) {
            var18.method2844(this.field10040, var13, var15, 0, var16, 8985, arg4 - 1, var14, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
    public final void method4006(int arg0) {
        if (this.field10062 == -1) {
            if (this.field10071 == null) {
                this.field10062 = 0;
            } else {
                this.field10062 = 2;
            }
        }
        if (this.field10051 == -1) {
            if (this.field10071 == null) {
                this.field10051 = 0;
            } else {
                this.field10051 = 2;
            }
        }
        if (arg0 == 0) {
            field10049++;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lka;BIIIIIB)Lka;")
    public final class469 method4007(class469 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field10056++;
        int var9 = this.field10048[arg2];
        int var10 = this.field10053[arg2];
        class755 var11 = this.field10058.method856(var10 >> 16, 2);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg0.method325(arg7, arg6, true);
        }
        class755 var13 = null;
        if ((this.field10069 || class712.field9957) && arg5 != -1 && arg5 < this.field10053.length) {
            int var14 = this.field10053[arg5];
            var13 = this.field10058.method856(var14 >> 16, 2);
            arg5 = var14 & 0xFFFF;
        }
        if (arg1 >= -29) {
            return null;
        }
        if (this.field10040) {
            arg6 |= 0x200;
        }
        if (var11.method4192(100, var12)) {
            arg6 |= 0x80;
        }
        if (var11.method4195(-27751, var12)) {
            arg6 |= 0x100;
        }
        if (var11.method4194(8243, var12)) {
            arg6 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method4192(100, arg5)) {
                arg6 |= 0x80;
            }
            if (var13.method4195(-27751, arg5)) {
                arg6 |= 0x100;
            }
            if (var13.method4194(8243, arg5)) {
                arg6 |= 0x400;
            }
        }
        int var15 = arg6 | 0x20;
        class469 var16 = arg0.method325(arg7, var15, true);
        var16.method2844(this.field10040, var11, var12, arg3, arg5, 8985, arg4 - 1, var13, var9);
        return var16;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lud;I)V")
    public final void method4008(class35 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method273(255);
            if (var3 == 0) {
                if (arg1 != 24914) {
                    return;
                }
                field10054++;
                return;
            }
            this.method4009(19, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILud;)V")
    private final void method4009(int arg0, int arg1, class35 arg2) {
        field10057++;
        if (arg0 != 19) {
            this.method4008(null, -71);
        }
        if (arg1 == 1) {
            int var16 = arg2.method253(-13900);
            this.field10048 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field10048[var17] = arg2.method253(-13900);
            }
            this.field10053 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field10053[var18] = arg2.method253(-13900);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field10053[var19] += arg2.method253(-13900) << 16;
            }
        } else if (arg1 == 2) {
            this.field10043 = arg2.method253(arg0 - 13919);
        } else if (arg1 == 3) {
            this.field10071 = new boolean[256];
            int var4 = arg2.method273(arg0 ^ 0xEC);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field10071[arg2.method273(255)] = true;
            }
        } else if (arg1 == 5) {
            this.field10064 = arg2.method273(255);
        } else if (arg1 == 6) {
            this.field10047 = arg2.method253(arg0 ^ 0xFFFFC9A7);
        } else if (arg1 == 7) {
            this.field10041 = arg2.method253(-13900);
        } else if (arg1 == 8) {
            this.field10044 = arg2.method273(arg0 + 236);
        } else if (arg1 == 9) {
            this.field10051 = arg2.method273(255);
        } else if (arg1 == 10) {
            this.field10062 = arg2.method273(255);
        } else if (arg1 == 11) {
            this.field10061 = arg2.method273(255);
        } else if (arg1 == 12) {
            int var6 = arg2.method273(255);
            this.field10042 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field10042[var7] = arg2.method253(-13900);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field10042[var8] = (arg2.method253(-13900) << 16) + this.field10042[var8];
            }
        } else if (arg1 == 13) {
            int var12 = arg2.method253(-13900);
            this.field10070 = new int[var12][];
            for (int var13 = 0; var13 < var12; var13++) {
                int var14 = arg2.method273(255);
                if (var14 > 0) {
                    this.field10070[var13] = new int[var14];
                    this.field10070[var13][0] = arg2.method239(-58);
                    for (int var15 = 1; var15 < var14; var15++) {
                        this.field10070[var13][var15] = arg2.method253(arg0 - 13919);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field10040 = true;
        } else if (arg1 == 15) {
            this.field10069 = true;
        } else if (arg1 == 16) {
            this.field10046 = true;
        } else if (arg1 == 18) {
            this.field10059 = true;
        } else if (arg1 == 19) {
            if (this.field10063 == null) {
                this.field10063 = new int[this.field10070.length];
                for (int var9 = 0; var9 < this.field10070.length; var9++) {
                    this.field10063[var9] = 255;
                }
            }
            this.field10063[arg2.method273(255)] = arg2.method273(255);
            return;
        } else if (arg1 == 20) {
            if (this.field10052 == null || this.field10067 == null) {
                this.field10052 = new int[this.field10070.length];
                this.field10067 = new int[this.field10070.length];
                for (int var10 = 0; var10 < this.field10070.length; var10++) {
                    this.field10052[var10] = 256;
                    this.field10067[var10] = 256;
                }
            }
            int var11 = arg2.method273(255);
            this.field10052[var11] = arg2.method253(arg0 - 13919);
            this.field10067[var11] = arg2.method253(-13900);
            return;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z[[[Lmf;)V")
    public static final void method4010(boolean arg0, class416[][][] arg1) {
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class416[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class416 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5846 instanceof class141) {
                            ((class141) var6.field5846).method1114(65);
                        }
                        if (var6.field5845 instanceof class141) {
                            ((class141) var6.field5845).method1114(66);
                        }
                        if (var6.field5847 instanceof class141) {
                            ((class141) var6.field5847).method1114(116);
                        }
                        if (var6.field5838 instanceof class141) {
                            ((class141) var6.field5838).method1114(117);
                        }
                        if (var6.field5840 instanceof class141) {
                            ((class141) var6.field5840).method1114(66);
                        }
                        for (class217 var7 = var6.field5844; var7 != null; var7 = var7.field3091) {
                            class113 var8 = var7.field3090;
                            if (var8 instanceof class141) {
                                ((class141) var8).method1114(125);
                            }
                        }
                    }
                }
            }
        }
        field10055++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIZ)I")
    public final int method4011(int arg0, int arg1, int arg2, boolean arg3) {
        field10060++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field10053[arg2];
        class755 var8 = null;
        class755 var9 = this.field10058.method856(var7 >> 16, 2);
        int var10 = var7 & arg0;
        if (var9 == null) {
            return var5;
        }
        if ((this.field10069 || class712.field9957) && arg1 != -1 && this.field10053.length > arg1) {
            int var11 = this.field10053[arg1];
            var8 = this.field10058.method856(var11 >> 16, arg0 - 65533);
            var6 = var11 & 0xFFFF;
        }
        if (this.field10040) {
            var5 |= 0x200;
        }
        if (var9.method4192(100, var10)) {
            var5 |= 0x80;
        }
        if (var9.method4195(arg0 - 93286, var10)) {
            var5 |= 0x100;
        }
        if (var9.method4194(8243, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method4192(100, var6)) {
                var5 |= 0x80;
            }
            if (var8.method4195(-27751, var6)) {
                var5 |= 0x100;
            }
            if (var8.method4194(8243, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field10042 != null && arg3) {
            if (this.field10042.length > arg2) {
                int var12 = this.field10042[arg2];
                if (var12 != 65535) {
                    class755 var13 = this.field10058.method856(var12 >> 16, 2);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method4192(arg0 ^ 0xFF9B, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method4195(arg0 ^ 0xFFFF6C66, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method4194(8243, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field10069 || class712.field9957) && arg1 != -1 && arg1 < this.field10042.length) {
                int var15 = this.field10042[arg1];
                if (var15 != 65535) {
                    class755 var16 = this.field10058.method856(var15 >> 16, 2);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method4192(arg0 ^ 0xFF9B, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method4195(-27751, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method4194(8243, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }
}
