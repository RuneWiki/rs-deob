import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class65 extends class135 {

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    private int field894 = 12288;

    @OriginalMember(owner = "client!t", name = "eb", descriptor = "I")
    private int field903 = 8192;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
    private int field901 = 0;

    @OriginalMember(owner = "client!t", name = "mb", descriptor = "I")
    private int field911 = 2048;

    @OriginalMember(owner = "client!t", name = "pb", descriptor = "I")
    private int field914 = 0;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    private int field897 = 4096;

    @OriginalMember(owner = "client!t", name = "hb", descriptor = "I")
    private int field906 = 2048;

    @OriginalMember(owner = "client!t", name = "db", descriptor = "Lqj;")
    private static class196 field902 = class80.method502("FULL", -48);

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "Lqj;")
    public static class196 field899 = field902;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "Lea;")
    public static class243 field900 = new class243();

    @OriginalMember(owner = "client!t", name = "rb", descriptor = "[Lqj;")
    public static class196[] field916 = new class196[500];

    @OriginalMember(owner = "client!t", name = "tb", descriptor = "Lqj;")
    public static class196 field918 = class80.method502("Schrifts-=tze geladen)3", -48);

    @OriginalMember(owner = "client!t", name = "qb", descriptor = "J")
    public static volatile long field915 = 0L;

    @OriginalMember(owner = "client!t", name = "sb", descriptor = "I")
    public static int field917 = -1;

    @OriginalMember(owner = "client!t", name = "ub", descriptor = "Lec;")
    public static class178 field919 = null;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!t", name = "fb", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!t", name = "gb", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!t", name = "ib", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!t", name = "jb", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!t", name = "kb", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!t", name = "lb", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!t", name = "nb", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!t", name = "ob", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "Lub;")
    public static class43 field898;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[B)I")
    public static final int method406(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field907;
        int var4 = -1;
        int var5 = arg0;
        if (arg1 != -2) {
            field902 = null;
        }
        while (~var5 > ~arg2) {
            var4 = var4 >>> 8 ^ class92.field1339[255 & (arg3[var5] ^ var4)];
            ++var5;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(B)V")
    public static final void method407(byte arg0) {
        ++field896;
        class234 var1 = (class234) class144.field2222.method1651((byte) -93);
        if (arg0 != -102) {
            field918 = null;
        }
        while (var1 != null) {
            if (var1.field4161 > 0) {
                --var1.field4161;
            }
            if (~var1.field4161 == -1) {
                if (var1.field4165 < 0 || class9.method41(var1.field4165, (byte) -110, var1.field4156)) {
                    class148.method926(var1.field4152, var1.field4163, var1.field4155, 102, var1.field4153, var1.field4165, var1.field4157, var1.field4156);
                    var1.method797((byte) 109);
                }
            } else {
                if (~var1.field4164 < -1) {
                    --var1.field4164;
                }
                if (~var1.field4164 == -1 && ~var1.field4153 <= -2 && ~var1.field4152 <= -2 && ~var1.field4153 >= -103 && var1.field4152 <= 102 && (~var1.field4159 > -1 || class9.method41(var1.field4159, (byte) -34, var1.field4160))) {
                    class148.method926(var1.field4152, var1.field4162, var1.field4155, 89, var1.field4153, var1.field4159, var1.field4157, var1.field4160);
                    var1.field4164 = -1;
                    if (var1.field4165 == var1.field4159 && ~var1.field4165 == 0) {
                        var1.method797((byte) 123);
                    } else if (~var1.field4165 == ~var1.field4159 && var1.field4163 == var1.field4162 && var1.field4160 == var1.field4156) {
                        var1.method797((byte) 104);
                    }
                }
            }
            var1 = (class234) class144.field2222.method1656(-50);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZII)Z")
    private final boolean method408(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return false;
        } else {
            ++field909;
            int var4 = (arg2 - -arg1) * this.field894 >> 12;
            int var5 = class20.field231[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field894;
            int var7 = (var6 << 12) / this.field903;
            int var8 = this.field897 * var7 >> 12;
            return var8 > -arg1 + arg2 && -arg1 + arg2 > -var8;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II)I")
    public static int method409(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field913;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field903 = arg0.method318(true);
                                }
                            } else {
                                this.field897 = arg0.method318(true);
                            }
                        } else {
                            this.field894 = arg0.method318(true);
                        }
                    } else {
                        this.field906 = arg0.method318(true);
                    }
                } else {
                    this.field914 = arg0.method318(true);
                }
            } else {
                this.field901 = arg0.method318(true);
            }
        } else {
            this.field911 = arg0.method318(true);
        }
        if (arg2 != -16231) {
            field916 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public static void method410(int arg0) {
        int var1 = 12 % ((-4 - arg0) / 59);
        field916 = null;
        field902 = null;
        field898 = null;
        field919 = null;
        field918 = null;
        field900 = null;
        field899 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        int[] var3 = super.field1954.method110(arg0, 101);
        if (super.field1954.field244) {
            int var4 = class123.field1756[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class131.field1862; ++var5) {
                int var6 = class82.field1189[var5] - 2048;
                int var7 = this.field911 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field901 + var4;
                int var11 = var6 - -this.field914;
                int var12 = var10 >= -2048 ? var10 : var10 + 4096;
                int var13 = var12 > 2048 ? var12 - 4096 : var12;
                int var14 = var11 < -2048 ? var11 + 4096 : var11;
                int var15 = this.field906 + var4;
                int var16 = ~var15 <= 2047 ? var15 : var15 + 4096;
                int var17 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var18 = ~var16 >= -2049 ? var16 : var16 + -4096;
                var3[var5] = !this.method411(2048, var9, var13) && !this.method408(arg1, var17, var18) ? 0 : 4096;
            }
        }
        if (arg1) {
            this.field911 = 67;
        }
        ++field908;
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        if (arg0 != -85) {
            field918 = null;
        }
        class87.method546((byte) 103);
        ++field912;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(III)Z")
    private final boolean method411(int arg0, int arg1, int arg2) {
        ++field910;
        int var4 = (-arg1 + arg2) * this.field894 >> 12;
        int var5 = class20.field231[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field894;
        int var7 = (var6 << 12) / this.field903;
        if (arg0 != 2048) {
            field917 = 23;
        }
        int var8 = this.field897 * var7 >> 12;
        return var8 > arg1 + arg2 && ~(-var8) > ~(arg1 + arg2);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)V")
    public static final void method412(boolean arg0) {
        if (arg0) {
            class42.field480 = class145.field2265;
            class249.field4410 = class186.field3270;
        } else {
            class42.field480 = class203.field3667;
            class249.field4410 = class103.field1489;
        }
        class39.field442 = class249.field4410.length;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class65() {
        super(0, true);
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public static final void method413(int arg0) {
        ++field895;
        class201.field3561.method1529(arg0 + 382);
        if (arg0 != 0) {
            method407((byte) -9);
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(Z)Z")
    public static final boolean method414(boolean arg0) {
        ++field905;
        if (arg0) {
            field918 = null;
        }
        return ~class86.field1275 != -1 ? true : class143.field2185.method1047((byte) -118);
    }
}
