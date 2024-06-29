import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class238 {

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3466 = 0;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3462 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[[[B")
    public static byte[][][] field3469;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[BIIII)V", line = 5)
    public static final void method1575(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field3461++;
        if (arg0 > 0 && !class627.method3619(2, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg5 <= 0 || class627.method3619(2, arg5)) {
            int var7 = class157.method1158(false, arg4);
            int var8 = 0;
            int var9 = arg0 < arg5 ? arg0 : arg5;
            if (arg6 == -7) {
                int var10 = arg0 >> 1;
                int var11 = arg5 >> 1;
                byte[] var12 = arg2;
                byte[] var13 = new byte[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Dub(arg3, var8, arg1, arg0, arg5, 0, arg4, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg0 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; var16 < var7; var16++) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var13[var17] = (byte) (var27 >> 2);
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    arg0 = var10;
                    var12 = var15;
                    arg5 = var11;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                    var8++;
                    var9 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 102)
    public static void method1576(byte arg0) {
        field3469 = null;
        if (arg0 <= 55) {
            field3466 = 26;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[IIIB)V", line = 115)
    public static final void method1577(int arg0, int[] arg1, int arg2, int arg3, byte arg4) {
        int var5 = -39 / ((arg4 - 72) / 48);
        arg3--;
        field3460++;
        int var7 = arg2 - 1;
        int var6 = var7 - 7;
        while (arg3 < var6) {
            int var8 = arg3 + 1;
            arg1[var8] = arg0;
            int var9 = var8 + 1;
            arg1[var9] = arg0;
            int var10 = var9 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            int var14 = var13 + 1;
            arg1[var14] = arg0;
            arg3 = var14 + 1;
            arg1[arg3] = arg0;
        }
        while (var7 > arg3) {
            arg3++;
            arg1[arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z", line = 146)
    public static final boolean method1578(int arg0, int arg1, int arg2) {
        if (arg0 != 5121) {
            method1581((byte) -42, -75, -115, false, 31, -50, null, null);
        }
        field3465++;
        return (class514.method3037(-77, arg1, arg2) | class255.method1675(arg2, arg1, 0) | class280.method1790(arg1, arg2, true)) & class243.method1620(true, arg2, arg1);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 158)
    public static final boolean method1579(int arg0, String arg1) {
        field3463++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class690.field9544; var2++) {
            if (arg1.equalsIgnoreCase(class133.field1790[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class130.field1749.field9513)) {
            return true;
        } else if (arg0 == -4695) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)I", line = 194)
    public static final int method1580(byte arg0, int arg1) {
        if (arg0 != 117) {
            method1577(111, null, 27, -105, (byte) 37);
        }
        field3467++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIIZII[ILwh;)Liba;", line = 206)
    public static final class531 method1581(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int[] arg6, class148 arg7) {
        if (arg0 <= 40) {
            method1578(63, -21, 123);
        }
        field3464++;
        if (!arg7.field2258 && (!class627.method3619(2, arg2) || !class627.method3619(2, arg5))) {
            return arg7.field2264 ? new class531(arg7, 34037, arg2, arg5, arg3, arg6, arg4, arg1) : new class531(arg7, arg2, arg5, class432.method2684(arg2, -21774), class432.method2684(arg5, -21774), arg6);
        } else {
            return new class531(arg7, 3553, arg2, arg5, arg3, arg6, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;", line = 226)
    public final String toString() {
        field3468++;
        throw new IllegalStateException();
    }
}
