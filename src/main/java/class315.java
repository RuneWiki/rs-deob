import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class315 implements class391 {

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "Lgv;")
    private class39 field4078 = class705.field9815;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Lia;")
    public class27 field4091;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    private int field4101;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "Llj;")
    public class6 field4083;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "Lpw;")
    public class89 field4100;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Z")
    private boolean field4096;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    private int field4086;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "[[I")
    public static int[][] field4081 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "Loo;")
    public static class10 field4099;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lq;")
    public static class151 field4080;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "[[B")
    public static byte[][] field4084;

    @OriginalMember(owner = "client!cl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1842(34847);
        field4087++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public static void method1835(int arg0) {
        field4080 = null;
        field4099 = null;
        field4081 = null;
        if (arg0 == 3) {
            field4084 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[IZI)V")
    public final void method1836(int arg0, int arg1, int[] arg2, boolean arg3, int arg4) {
        field4076++;
        if (arg1 > 0 && !class386.method2202(-100, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class386.method2202(-54, arg4)) {
            throw new IllegalArgumentException("");
        } else if (class135.field1774 == this.field4100) {
            int var6 = 0;
            if (!arg3) {
                this.field4086 = 112;
            }
            int var7 = arg4 > arg1 ? arg1 : arg4;
            int var8 = arg1 >> 1;
            int var9 = arg4 >> 1;
            int[] var10 = arg2;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var6, this.method1838((byte) 83), arg1, arg4, 0, 32993, this.field4091.field423, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg1 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = (var18 & 0xFF5D9D) >> 16;
                        int var22 = var18 >> 8 & 0xFF;
                        int var23 = var18 >> 24 & 0xFF;
                        int var24 = var18 & 0xFF;
                        int var25 = var10[var14++];
                        int var26 = (var19 >> 24 & 0xFF) + var23;
                        int var27 = (var19 >> 16 & 0xFF) + var21;
                        int var28 = (var19 >> 8 & 0xFF) + var22;
                        int var29 = (var19 & 0xFF) + var24;
                        int var30 = (var20 & 0xFF) + var29;
                        int var31 = (var20 >> 16 & 0xFF) + var27;
                        int var32 = (var20 >> 8 & 0xFF) + var28;
                        int var33 = (var20 >> 24 & 0xFF) + var26;
                        int var34 = (var25 >> 24 & 0xFF) + var33;
                        int var35 = (var25 & 0xFF) + var30;
                        int var36 = ((var25 & 0xFF0E99) >> 16) + var31;
                        int var37 = (var25 >> 8 & 0xFF) + var32;
                        var11[var12++] = class131.method954(class131.method954(class131.method954(class597.method3238(var36, 1020) << 14, class597.method3238(-16777216, var34 << 22)), class597.method3238(var37 << 6, 65280)), class597.method3238(var35 >> 2, 255));
                    }
                    var13 += arg1;
                    var14 += arg1;
                }
                int[] var16 = var11;
                var11 = var10;
                var10 = var16;
                arg1 = var8;
                arg4 = var9;
                var6++;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var7 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZZ)V")
    public static final void method1837(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != -1753516255) {
            return;
        }
        if (arg2) {
            class317.field4109++;
            class372.method2139((byte) -73);
        }
        field4088++;
        if (arg1) {
            class138.field1812++;
            class388.method2224((byte) 62);
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)I")
    public final int method1838(byte arg0) {
        if (arg0 != 83) {
            return 40;
        }
        field4097++;
        if (class6.field48 == this.field4083) {
            if (class82.field1117 == this.field4100) {
                return 6407;
            }
            if (class135.field1774 == this.field4100) {
                return 6408;
            }
            if (class228.field3042 == this.field4100) {
                return 6406;
            }
            if (class368.field4744 == this.field4100) {
                return 6409;
            }
            if (class395.field5023 == this.field4100) {
                return 6410;
            }
            if (class282.field3675 == this.field4100) {
                return 6145;
            }
        } else if (class6.field51 == this.field4083) {
            if (class82.field1117 == this.field4100) {
                return 34843;
            }
            if (class135.field1774 == this.field4100) {
                return 34842;
            }
            if (class228.field3042 == this.field4100) {
                return 34844;
            }
            if (class368.field4744 == this.field4100) {
                return 34846;
            }
            if (class395.field5023 == this.field4100) {
                return 34847;
            }
            if (class282.field3675 == this.field4100) {
                return 6145;
            }
        } else if (class6.field52 == this.field4083) {
            if (class82.field1117 == this.field4100) {
                return 34837;
            }
            if (class135.field1774 == this.field4100) {
                return 34836;
            }
            if (class228.field3042 == this.field4100) {
                return 34838;
            }
            if (class368.field4744 == this.field4100) {
                return 34840;
            }
            if (class395.field5023 == this.field4100) {
                return 34841;
            }
            if (class282.field3675 == this.field4100) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
    private final void method1839(int arg0) {
        if (arg0 != -14748) {
            this.field4083 = null;
        }
        this.field4091.method3091(true, this);
        field4079++;
        if (class705.field9815 == this.field4078) {
            OpenGL.glTexParameteri(this.field4082, 10241, this.field4096 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field4082, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field4082, 10241, this.field4096 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field4082, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII[B)V")
    public final void method1840(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field4085++;
        if (arg0 > 0 && !class386.method2202(-103, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class386.method2202(-89, arg1)) {
            int var6 = this.field4100.field1177;
            int var7 = 0;
            int var8 = -116 % ((arg2 - 2) / 62);
            int var9 = arg1 > arg0 ? arg0 : arg1;
            int var10 = arg0 >> 1;
            int var11 = arg1 >> 1;
            byte[] var12 = arg4;
            byte[] var13 = new byte[var10 * var11 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var7, this.method1838((byte) 83), arg0, arg1, 0, class386.method2201((byte) 120, this.field4100), 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var6;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var6 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var6 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var6 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var6 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var6;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg0 = var10;
                var12 = var16;
                arg1 = var11;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var7++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public final void method1141(int arg0) {
        field4095++;
        if (arg0 != 1896) {
            return;
        }
        int var2 = this.field4091.method3068(Integer.MAX_VALUE);
        int var3 = this.field4091.field432[var2];
        if (this.field4082 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field4082);
            this.field4091.field432[var2] = this.field4082;
        }
        OpenGL.glBindTexture(this.field4082, this.field4086);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1841(byte arg0, String arg1) {
        field4098++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        if (arg0 <= 68) {
            method1835(-86);
        }
        int var3 = arg1.length();
        while (var2 < var3 && class418.method2392(65, arg1.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class418.method2392(111, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class665.method3637(8690, var7)) {
                char var8 = class512.method2760(var7, false);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lgv;I)V")
    public final void method1071(class39 arg0, int arg1) {
        field4089++;
        if (arg1 != -30763) {
            this.method1842(35);
        }
        if (this.field4078 != arg0) {
            this.field4078 = arg0;
            this.method1839(-14748);
        }
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
    private final void method1842(int arg0) {
        field4093++;
        if (arg0 != 34847) {
            this.field4091 = null;
        }
        if (this.field4086 > 0) {
            this.field4091.method182(this.field4086, arg0 ^ 0xF753, this.method1845((byte) -66));
            this.field4086 = 0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
    private final void method1843(int arg0, int arg1) {
        field4094++;
        this.field4091.field7671 -= arg1;
        this.field4091.field7671 += this.method1845((byte) -66);
        int var3 = 123 / (-arg0 / 38);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[FIB)V")
    public final void method1844(int arg0, int arg1, float[] arg2, int arg3, byte arg4) {
        field4090++;
        if (arg3 > 0 && !class386.method2202(-70, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class386.method2202(-51, arg1)) {
            int var6 = 103 % (-arg4 / 45);
            int var7 = this.field4100.field1177;
            int var8 = 0;
            int var9 = arg3 >= arg1 ? arg1 : arg3;
            int var10 = arg3 >> 1;
            int var11 = arg1 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var8, this.method1838((byte) 83), arg3, arg1, 0, class386.method2201((byte) 122, this.field4100), 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg1 = var11;
                arg3 = var10;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)I")
    private final int method1845(byte arg0) {
        if (arg0 != -66) {
            this.field4082 = -61;
        }
        field4092++;
        int var2 = this.field4083.field43 * this.field4101 * this.field4100.field1177;
        return this.field4096 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lia;ILpw;Llj;IZ)V")
    public class315(class27 arg0, int arg1, class89 arg2, class6 arg3, int arg4, boolean arg5) {
        this.field4091 = arg0;
        this.field4101 = arg4;
        this.field4082 = arg1;
        this.field4083 = arg3;
        this.field4100 = arg2;
        this.field4096 = arg5;
        OpenGL.glGenTextures(1, class543.field7049, 0);
        this.field4086 = class543.field7049[0];
        this.method1839(-14748);
        this.method1843(95, 0);
    }
}
