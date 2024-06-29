import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class51 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[[I")
    public static int[][] field741 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Z")
    public static boolean field750 = false;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "F")
    public static float field749;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lti;I)V", line = 8)
    public final void method365(class303 arg0, int arg1) {
        field751++;
        while (true) {
            int var3 = arg0.method1918((byte) -62);
            if (var3 == 0) {
                if (arg1 == -2742) {
                    return;
                } else {
                    method368(8, 55);
                    return;
                }
            }
            this.method367(var3, -113, arg0);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILjava/lang/String;)I", line = 29)
    public static final int method366(int arg0, int arg1, String arg2) {
        field748++;
        if (arg0 != 27538) {
            field747 = 110;
        }
        return class294.method1820(arg1, arg2, true, arg0 ^ 0xFFFF8E96);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILti;)V", line = 44)
    private final void method367(int arg0, int arg1, class303 arg2) {
        if (arg0 == 1) {
            this.field743 = arg2.method1868(0);
            this.field745 = arg2.method1918((byte) 124);
            this.field742 = arg2.method1918((byte) 68);
        }
        if (arg1 < -106) {
            field746++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V", line = 75)
    public static final void method368(int arg0, int arg1) {
        field744++;
        class434 var2 = class483.method2888(arg1, 40, arg0);
        var2.method2628(arg0 + 84);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BIIIII[II)V", line = 87)
    public static final void method369(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field740++;
        if (arg5 > 0 && !class390.method2453(-2628, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class390.method2453(-2628, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg1 == 32993) {
            if (arg0 <= 6) {
                method366(-43, 52, null);
            }
            int var8 = 0;
            int var9 = arg5 < arg2 ? arg5 : arg2;
            int var10 = arg5 >> 1;
            int var11 = arg2 >> 1;
            int[] var12 = arg6;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var8, arg7, arg5, arg2, 0, arg1, arg4, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg5;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = (var20 & 0xFFB5) >> 8;
                        int var24 = (var20 & 0xFFC051) >> 16;
                        int var25 = var12[var16++];
                        int var26 = var20 & 0xFF;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = (var22 >> 24 & 0xFF) + var27;
                        int var29 = ((var22 & 0xFF58) >> 8) + var23;
                        int var30 = ((var22 & 0xFF4456) >> 16) + var24;
                        int var31 = (var22 & 0xFF) + var26;
                        int var32 = (var21 & 0xFF) + var31;
                        int var33 = (var21 >> 16 & 0xFF) + var30;
                        int var34 = ((var21 & 0xFFCB) >> 8) + var29;
                        int var35 = (var21 >> 24 & 0xFF) + var28;
                        int var36 = (var25 & 0xFF) + var32;
                        int var37 = (var25 >> 24 & 0xFF) + var35;
                        int var38 = (var25 >> 8 & 0xFF) + var34;
                        int var39 = ((var25 & 0xFFC9DA) >> 16) + var33;
                        var13[var14++] = class29.method239(class388.method2441(1020, var36) >> 2, class29.method239(class29.method239(class388.method2441(-16777216, var37 << 22), class388.method2441(var39, 1020) << 14), class388.method2441(var38, 1020) << 6));
                    }
                    var16 += arg5;
                    var15 += arg5;
                }
                int[] var18 = var13;
                var13 = var12;
                arg5 = var10;
                arg2 = var11;
                var12 = var18;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)I", line = 194)
    public static final int method370(int arg0, int arg1, byte arg2) {
        field752++;
        int var3 = arg0 >>> 24;
        if (arg2 != 70) {
            method369((byte) 82, -4, 101, -1, 50, 125, null, -125);
        }
        int var4 = ((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 213)
    public static void method371(int arg0) {
        field741 = null;
        if (arg0 != 0) {
            field750 = true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIILjava/lang/Class;)Ltp;", line = 225)
    public static final class370 method372(int arg0, int arg1, int arg2, Class arg3) {
        class165 var4 = class36.field545[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class525 var5 = var4.field2490; var5 != null; var5 = var5.field7716) {
            class370 var6 = var5.field7711;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5532 == arg1 && var6.field5535 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
