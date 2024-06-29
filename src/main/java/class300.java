import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class300 implements class562 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lju;")
    private class115 field3805 = class396.field5036;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    private int field3818;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Lnh;")
    public class699 field3827;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Z")
    private boolean field3824;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Ljr;")
    public class100 field3815;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "Lel;")
    public class513 field3828;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    private int field3813;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Ljd;")
    public static class216 field3807 = new class216(6, 1);

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Z")
    public static boolean field3811 = false;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field3817 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    private final void method1784(int arg0) {
        this.field3828.method1349(this, false);
        if (arg0 != 10241) {
            return;
        }
        field3822++;
        if (class396.field5036 == this.field3805) {
            OpenGL.glTexParameteri(this.field3816, 10241, this.field3824 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3816, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3816, 10241, this.field3824 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3816, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
    public static void method1785(int arg0) {
        field3807 = null;
        if (arg0 > -6) {
            field3811 = true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V")
    private final void method1786(byte arg0, int arg1) {
        this.field3828.field2774 -= arg1;
        field3825++;
        this.field3828.field2774 += this.method1790(true);
        if (arg0 <= 54) {
            this.field3818 = 69;
        }
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)I")
    public final int method1787(int arg0) {
        if (arg0 < 64) {
            method1791(null, -92);
        }
        field3821++;
        if (class100.field1288 == this.field3815) {
            if (class664.field9019 == this.field3827) {
                return 6407;
            }
            if (class556.field6946 == this.field3827) {
                return 6408;
            }
            if (class190.field2256 == this.field3827) {
                return 6406;
            }
            if (class503.field6258 == this.field3827) {
                return 6409;
            }
            if (class493.field6140 == this.field3827) {
                return 6410;
            }
            if (class210.field2479 == this.field3827) {
                return 6145;
            }
        } else if (class100.field1291 == this.field3815) {
            if (class664.field9019 == this.field3827) {
                return 34843;
            }
            if (class556.field6946 == this.field3827) {
                return 34842;
            }
            if (class190.field2256 == this.field3827) {
                return 34844;
            }
            if (class503.field6258 == this.field3827) {
                return 34846;
            }
            if (class493.field6140 == this.field3827) {
                return 34847;
            }
            if (class210.field2479 == this.field3827) {
                return 6145;
            }
        } else if (class100.field1292 == this.field3815) {
            if (class664.field9019 == this.field3827) {
                return 34837;
            }
            if (class556.field6946 == this.field3827) {
                return 34836;
            }
            if (class190.field2256 == this.field3827) {
                return 34838;
            }
            if (class503.field6258 == this.field3827) {
                return 34840;
            }
            if (class493.field6140 == this.field3827) {
                return 34841;
            }
            if (class210.field2479 == this.field3827) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z")
    public static final boolean method1788(int arg0, int arg1, int arg2) {
        field3808++;
        if ((class73.method587(arg1, arg0, (byte) 29) | ~(arg1 & 0x10000) != arg2) || class394.method2236(arg1, arg0, true)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && class273.method1626((byte) -36, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)V")
    private final void method1789(int arg0) {
        if (this.field3813 > 0) {
            this.field3828.method2793(this.method1790(true), this.field3813, 44);
            this.field3813 = 0;
        }
        field3809++;
        if (arg0 != 10819) {
            field3811 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)I")
    private final int method1790(boolean arg0) {
        field3810++;
        if (!arg0) {
            this.method1794(15, -15, -112, null, 58);
        }
        int var2 = this.field3815.field1284 * this.field3818 * this.field3827.field9683;
        return this.field3824 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lji;I)Loq;")
    public static final class334 method1791(class572 arg0, int arg1) {
        field3806++;
        class410 var2 = class416.method2318(arg0, -124);
        int var3 = arg0.method3086(65280);
        if (arg1 != -22650) {
            method1791(null, -82);
        }
        return new class334(var2.field9578, var2.field9576, var2.field9571, var2.field9577, var2.field9574, var2.field9572, var2.field9568, var2.field9570, var2.field9569, var2.field5263, var2.field5266, var2.field5268, var2.field5264, var2.field5273, var2.field5275, var3);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[II)V")
    public final void method1792(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg0 != 1) {
            return;
        }
        field3812++;
        if (arg1 > 0 && !class182.method1084((byte) 94, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class182.method1084((byte) -126, arg4)) {
            throw new IllegalArgumentException("");
        } else if (class556.field6946 == this.field3827) {
            int var6 = 0;
            int var7 = arg4 <= arg1 ? arg4 : arg1;
            int var8 = arg1 >> 1;
            int var9 = arg4 >> 1;
            int[] var10 = arg3;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var6, this.method1787(arg0 + 90), arg1, arg4, 0, 32993, this.field3828.field6530, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg1 + var13;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 >> 24 & 0xFF;
                        int var22 = var18 >> 8 & 0xFF;
                        int var23 = var10[var14++];
                        int var24 = var18 & 0xFF;
                        int var25 = (var18 & 0xFFEF40) >> 16;
                        int var26 = ((var20 & 0xFFD259) >> 16) + var25;
                        int var27 = ((var20 & 0xFFCD) >> 8) + var22;
                        int var28 = (var20 >> 24 & 0xFF) + var21;
                        int var29 = (var20 & 0xFF) + var24;
                        int var30 = ((var19 & 0xFFAD9A) >> 16) + var26;
                        int var31 = (var19 >> 24 & 0xFF) + var28;
                        int var32 = (var19 & 0xFF) + var29;
                        int var33 = ((var19 & 0xFFB2) >> 8) + var27;
                        int var34 = (var23 & 0xFF) + var32;
                        int var35 = (var23 >> 24 & 0xFF) + var31;
                        int var36 = ((var23 & 0xFF96) >> 8) + var33;
                        int var37 = (var23 >> 16 & 0xFF) + var30;
                        var11[var12++] = class364.method2113(class109.method762(1020, var34) >> 2, class364.method2113(class109.method762(1020, var36) << 6, class364.method2113(class109.method762(16711680, var37 << 14), class109.method762(-16777216, var35 << 22))));
                    }
                    var13 += arg1;
                    var14 += arg1;
                }
                var11 = var10;
                arg4 = var9;
                arg1 = var8;
                var10 = var15;
                var8 >>= 0x1;
                var7 >>= 0x1;
                var6++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([FIIBI)V")
    public final void method1793(float[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3819++;
        int var6 = -72 / ((arg3 - 51) / 32);
        if (arg2 > 0 && !class182.method1084((byte) 98, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class182.method1084((byte) -48, arg4)) {
            int var7 = this.field3827.field9683;
            int var8 = 0;
            int var9 = arg4 <= arg2 ? arg4 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg4 >> 1;
            float[] var12 = arg0;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var8, this.method1787(110), arg2, arg4, 0, class237.method1429(this.field3827, 1002608112), 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg2 = var10;
                arg4 = var11;
                var12 = var15;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1789(10819);
        field3820++;
        super.finalize();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[BI)V")
    public final void method1794(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field3823++;
        if (arg4 > 0 && !class182.method1084((byte) -88, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class182.method1084((byte) -103, arg0)) {
            int var6 = this.field3827.field9683;
            int var7 = 0;
            int var8 = arg4 >= arg0 ? arg0 : arg4;
            int var9 = arg4 >> 1;
            int var10 = arg0 >> 1;
            byte[] var11 = arg3;
            if (arg2 == 5121) {
                byte[] var12 = new byte[var6 * var10 * var9];
                while (true) {
                    OpenGL.glTexImage2Dub(arg1, var7, this.method1787(arg2 - 5003), arg4, arg0, 0, class237.method1429(this.field3827, 1002608112), 5121, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg4 * var6;
                    for (int var14 = 0; var14 < var6; var14++) {
                        int var16 = var14;
                        int var17 = var14;
                        int var18 = var13 + var14;
                        for (int var19 = 0; var19 < var10; var19++) {
                            for (int var20 = 0; var20 < var9; var20++) {
                                byte var21 = var11[var17];
                                int var22 = var6 + var17;
                                int var23 = var11[var22] + var21;
                                var17 = var6 + var22;
                                int var24 = var11[var18] + var23;
                                int var25 = var6 + var18;
                                int var26 = var11[var25] + var24;
                                var18 = var6 + var25;
                                var12[var16] = (byte) (var26 >> 2);
                                var16 += var6;
                            }
                            var17 += var13;
                            var18 += var13;
                        }
                    }
                    byte[] var15 = var12;
                    var12 = var11;
                    arg4 = var9;
                    arg0 = var10;
                    var11 = var15;
                    var9 >>= 0x1;
                    var7++;
                    var8 >>= 0x1;
                    var10 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public final void method41(int arg0) {
        if (arg0 != -9341) {
            this.method1794(87, -27, 8, null, -122);
        }
        field3814++;
        int var2 = this.field3828.method1307(8);
        int var3 = this.field3828.field6528[var2];
        if (this.field3816 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field3816);
            this.field3828.field6528[var2] = this.field3816;
        }
        OpenGL.glBindTexture(this.field3816, this.field3813);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILju;)V")
    public final void method43(int arg0, class115 arg1) {
        if (this.field3805 != arg1) {
            this.field3805 = arg1;
            this.method1784(arg0 + 39439);
        }
        field3826++;
        if (arg0 != -29198) {
            this.field3805 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lel;ILnh;Ljr;IZ)V")
    public class300(class513 arg0, int arg1, class699 arg2, class100 arg3, int arg4, boolean arg5) {
        this.field3818 = arg4;
        this.field3816 = arg1;
        this.field3827 = arg2;
        this.field3824 = arg5;
        this.field3815 = arg3;
        this.field3828 = arg0;
        OpenGL.glGenTextures(1, class289.field3650, 0);
        this.field3813 = class289.field3650[0];
        this.method1784(10241);
        this.method1786((byte) 93, 0);
    }
}
