import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class405 {

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lrl;")
    private class487 field5945;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public int field5944;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Ltf;")
    public static class184 field5947;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[J")
    public static long[] field5949;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II[IIIIII)V", line = 3)
    public static final void method2422(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5943++;
        if (arg3 > 0 && !class403.method2418(arg3, (byte) 74)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class403.method2418(arg4, (byte) 86)) {
            throw new IllegalArgumentException("");
        } else if (arg6 == 32993) {
            int var8 = 0;
            int var9 = arg4 > arg3 ? arg3 : arg4;
            if (arg5 > 27) {
                int var10 = arg3 >> 1;
                int var11 = arg4 >> 1;
                int[] var12 = arg2;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg7, var8, arg1, arg3, arg4, 0, arg6, arg0, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg3 + var15;
                    int[] var17 = var13;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var10; var19++) {
                            int var20 = var12[var15++];
                            int var21 = var12[var15++];
                            int var22 = var12[var16++];
                            int var23 = var20 & 0xFF;
                            int var24 = var20 >> 8 & 0xFF;
                            int var25 = var20 >> 24 & 0xFF;
                            int var26 = var12[var16++];
                            int var27 = var20 >> 16 & 0xFF;
                            int var28 = (var21 & 0xFF) + var23;
                            int var29 = ((var21 & 0xFFC10C) >> 16) + var27;
                            int var30 = (var21 >> 8 & 0xFF) + var24;
                            int var31 = (var21 >> 24 & 0xFF) + var25;
                            int var32 = (var22 >> 24 & 0xFF) + var31;
                            int var33 = (var22 >> 8 & 0xFF) + var30;
                            int var34 = (var22 & 0xFF) + var28;
                            int var35 = (var22 >> 16 & 0xFF) + var29;
                            int var36 = (var26 & 0xFF) + var34;
                            int var37 = ((var26 & 0xFF8A) >> 8) + var33;
                            int var38 = (var26 >> 16 & 0xFF) + var35;
                            int var39 = (var26 >> 24 & 0xFF) + var32;
                            var13[var14++] = class51.method379(class51.method379(class500.method3013(var37, 1020) << 6, class51.method379(class500.method3013(16711680, var38 << 14), class500.method3013(-16777216, var39 << 22))), class500.method3013(var36 >> 2, 255));
                        }
                        var16 += arg3;
                        var15 += arg3;
                    }
                    var13 = var12;
                    var12 = var17;
                    arg3 = var10;
                    arg4 = var11;
                    var8++;
                    var9 >>= 0x1;
                    var11 >>= 0x1;
                    var10 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lmd;II)Z", line = 108)
    public static final boolean method2423(class364 arg0, int arg1, int arg2) {
        field5946++;
        int var3 = arg0.method2229(2, -1);
        if (var3 == 0) {
            if (arg0.method2229(1, -1) != 0) {
                method2423(arg0, arg1, arg2);
            }
            int var4 = arg0.method2229(6, -1);
            int var5 = arg0.method2229(6, -1);
            boolean var6 = arg0.method2229(1, arg1 ^ 0xFFFF00A0) == 1;
            if (var6) {
                class337.field4880[class84.field1160++] = arg2;
            }
            if (class262.field3742[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class223 var7 = class135.field1726[arg2];
            class313 var8 = class262.field3742[arg2] = new class313();
            var8.field4262 = arg2;
            if (class290.field4144[arg2] != null) {
                var8.method1880(class290.field4144[arg2], (byte) 118);
            }
            var8.method1771(arg1 ^ 0xFFFF35C5, var7.field3153);
            var8.field4222 = var7.field3148;
            int var9 = var7.field3154;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            var8.field4557 = var7.field3147;
            int var12 = var9 & 0xFF;
            var8.field4278[0] = class69.field1019[arg2];
            var8.field2956 = (byte) var10;
            var8.method1886((var11 << 6) + var4 - class455.field6637, (var12 << 6) + -class223.field3158 + var5, (byte) 127);
            var8.field4590 = false;
            class135.field1726[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method2229(2, -1);
            int var14 = class135.field1726[arg2].field3154;
            class135.field1726[arg2].field3154 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method2229(5, -1);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class135.field1726[arg2].field3154;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FC53C) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class135.field1726[arg2].field3154 = (var20 << 14) + ((var19 << 28) + var21);
            return false;
        } else {
            int var22 = arg0.method2229(18, arg1 - 65376);
            int var23 = var22 >> 16;
            int var24 = (arg1 & var22) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class135.field1726[arg2].field3154;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class135.field1726[arg2].field3154 = (var27 << 28) + ((var28 << 14) + var29);
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)[Lph;", line = 267)
    public static final class438[] method2424(byte arg0) {
        field5948++;
        return arg0 == 106 ? new class438[] { class339.field4941, class31.field525, class384.field5699, class153.field1964, class355.field5129, class12.field199 } : null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 284)
    public static void method2425(int arg0) {
        field5947 = null;
        if (arg0 < -61) {
            field5949 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lrl;II)V", line = 296)
    public class405(class487 arg0, int arg1, int arg2) {
        this.field5945 = arg0;
        this.field5944 = arg2;
    }

    @OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V", line = 308)
    protected final void finalize() throws Throwable {
        field5942++;
        this.field5945.method2874(-85, this.field5944);
        super.finalize();
    }
}
