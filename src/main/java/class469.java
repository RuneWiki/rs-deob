import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class469 extends class79 implements Runnable {

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public int field6870 = -1;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "Z")
    private boolean field6879 = true;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "Lgj;")
    private class70 field6877;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field6876 = 0;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "Luv;")
    public static class2 field6878 = new class2(111, -1);

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public static int field6881 = 0;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field6882 = 0;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([BZ)Ljava/lang/String;")
    public static final String method2778(byte[] arg0, boolean arg1) {
        field6875++;
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        if (arg1) {
            field6878 = null;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg0[var5] & 0xFF;
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 >= 224) {
                    if (var6 < 240) {
                        if (var2 <= (var5 + 2)) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        var5++;
                        int var7 = arg0[var5] & 0xFF;
                        if (var7 >= 128 && var7 <= 191) {
                            var5++;
                            int var8 = arg0[var5] & 0xFF;
                            if (var8 >= 128 && var8 <= 191) {
                                var3[var4++] = (char) class390.method2340(class390.method2340(class140.method1023(-921600, var6 << 12), class140.method1023(-8256, var7 << 6)), class140.method1023(-129, var8));
                                continue;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                    if (var6 >= 244) {
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                    }
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                } else if (var2 > (var5 + 1)) {
                    var5++;
                    int var9 = arg0[var5] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class390.method2340(class140.method1023(var9, -129), class140.method1023(var6, -193) << 6);
                } else {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
            } else {
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V")
    public final void method2779(boolean arg0) {
        field6880++;
        this.field6879 = false;
        if (!arg0) {
            this.method2779(true);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIZ)Lvj;")
    public static final class313 method2780(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6874++;
        class313 var5 = new class313();
        var5.field4851 = arg1;
        var5.field4852 = arg3;
        class312.field4840.method3055(arg0 ^ arg0, (long) arg2, var5);
        class431.method2546(true, arg3);
        class310 var6 = class52.method386(0, arg2);
        if (var6 != null) {
            class292.method1812(-14307, var6);
        }
        if (class16.field263 != null) {
            class292.method1812(arg0 ^ 0x43F5, class16.field263);
            class16.field263 = null;
        }
        class414.method2478(64);
        if (var6 != null) {
            class211.method1363(false, var6, !arg4);
        }
        if (!arg4) {
            class64.method445(arg3);
        }
        if (!arg4 && class256.field3477 != -1) {
            class398.method2389(1, class256.field3477, 0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([BIIIIIB)V")
    public static final void method2781(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field6873++;
        int var7 = -94 / ((-arg6 - 7) / 45);
        if (arg4 > 0 && !class384.method2305(1, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg5 <= 0 || class384.method2305(1, arg5)) {
            int var8 = class96.method753(true, arg1);
            int var9 = 0;
            int var10 = arg5 > arg4 ? arg4 : arg5;
            int var11 = arg4 >> 1;
            int var12 = arg5 >> 1;
            byte[] var13 = arg0;
            byte[] var14 = new byte[var8 * var12 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var9, arg2, arg4, arg5, 0, arg1, 5121, var13, 0);
                if (var10 <= 1) {
                    return;
                }
                int var15 = arg4 * var8;
                for (int var16 = 0; var16 < var8; var16++) {
                    int var18 = var16;
                    int var19 = var16;
                    int var20 = var16 + var15;
                    for (int var21 = 0; var21 < var12; var21++) {
                        for (int var22 = 0; var22 < var11; var22++) {
                            byte var23 = var13[var19];
                            int var24 = var8 + var19;
                            int var25 = var13[var24] + var23;
                            int var26 = var13[var20] + var25;
                            var19 = var8 + var24;
                            int var27 = var8 + var20;
                            int var28 = var13[var27] + var26;
                            var20 = var8 + var27;
                            var14[var18] = (byte) (var28 >> 2);
                            var18 += var8;
                        }
                        var19 += var15;
                        var20 += var15;
                    }
                }
                byte[] var17 = var14;
                var14 = var13;
                arg4 = var11;
                arg5 = var12;
                var13 = var17;
                var10 >>= 0x1;
                var9++;
                var11 >>= 0x1;
                var12 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Z)V")
    public final void method2782(boolean arg0) {
        if (!arg0) {
            field6881 = -12;
        }
        (new Thread(this, "a")).start();
        field6872++;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public static void method2783(int arg0) {
        if (arg0 != -26033) {
            field6878 = null;
        }
        field6878 = null;
    }

    @OriginalMember(owner = "client!vs", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field6879) {
            this.field6877.method495(false, this);
        }
        field6871++;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lgj;)V")
    public class469(class70 arg0) {
        this.field6877 = arg0;
    }
}
