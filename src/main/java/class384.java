import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class384 {

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "Leda;")
    private class14 field5757 = new class14(64);

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "Lla;")
    private class422 field5760;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "Z")
    public static volatile boolean field5755 = false;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "Ltg;")
    public static class605 field5758 = new class605();

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "Z")
    public static boolean field5763 = false;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "[I")
    public static int[] field5756;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BI)Lffa;", line = 10)
    public final class678 method2408(byte arg0, int arg1) {
        field5752++;
        class14 var3 = this.field5757;
        class678 var4;
        synchronized (this.field5757) {
            var4 = (class678) this.field5757.method80((byte) -65, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == 79) {
            class422 var5 = this.field5760;
            byte[] var6;
            synchronized (this.field5760) {
                var6 = this.field5760.method2624(0, 5, arg1);
            }
            class678 var7 = new class678();
            if (var6 != null) {
                var7.method3782(-1, new class301(var6));
            }
            class14 var8 = this.field5757;
            synchronized (this.field5757) {
                this.field5757.method67((long) arg1, var7, arg0 ^ 0xFFFFE5C3);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V", line = 43)
    public static final void method2409(boolean arg0) {
        class127.method981(255, -1, (byte) 127);
        if (!arg0) {
            field5759++;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZIII[B)V", line = 59)
    public static final void method2410(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field5753++;
        if (arg5 > 0 && !class668.method3743((byte) -122, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class668.method3743((byte) -119, arg1)) {
            int var7 = class254.method1721((byte) -9, arg4);
            if (arg2) {
                method2411((byte) -16, -26);
            }
            int var8 = 0;
            int var9 = arg1 <= arg5 ? arg1 : arg5;
            int var10 = arg5 >> 1;
            int var11 = arg1 >> 1;
            byte[] var12 = arg6;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg0, var8, arg3, arg5, arg1, 0, arg4, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var15 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg5 = var10;
                arg1 = var11;
                var12 = var16;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BI)Z", line = 157)
    public static final boolean method2411(byte arg0, int arg1) {
        field5754++;
        if (arg0 <= 103) {
            return true;
        } else {
            return arg1 == 3 || arg1 == 7 || arg1 == 10;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IILjava/lang/String;)Lwfa;", line = 168)
    public static final class388 method2412(int arg0, int arg1, String arg2) {
        if (arg1 != 64) {
            field5762 = -60;
        }
        field5761++;
        class388 var3;
        try {
            var3 = (class388) Class.forName("nn").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class489();
        }
        var3.field5820 = arg2;
        var3.field5819 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V", line = 189)
    public static void method2413(int arg0) {
        field5758 = null;
        if (arg0 >= -1) {
            field5758 = null;
        }
        field5756 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lcr;ILla;)V", line = 216)
    public class384(class292 arg0, int arg1, class422 arg2) {
        this.field5760 = arg2;
        this.field5760.method2615(0, 5);
    }
}
