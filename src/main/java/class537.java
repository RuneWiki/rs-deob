import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class537 {

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Lpfa;")
    private class295 field7758 = new class295(256);

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Lpfa;")
    private class295 field7764 = new class295(256);

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Loh;")
    private class404 field7754;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Loh;")
    private class404 field7753;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Lpia;")
    public static class94 field7752 = new class94(25, -1);

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field7759 = 0;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lpia;")
    public static class94 field7760 = new class94(50, 4);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Ld;")
    public static class150 field7763;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Ljava/awt/Frame;")
    public static Frame field7761;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III[I)Lcba;")
    private final class548 method3153(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg1 != -2072156240) {
            method3158(-41, null, 53, 125, -74L, -25, true);
        }
        field7755++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF6) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class548 var9 = (class548) this.field7764.method1754(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class273 var10 = class273.method1619(this.field7753, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class548 var11 = var10.method1618();
            this.field7764.method1751(var11, 3970, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field7873.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[I)Lcba;")
    public final class548 method3154(int arg0, int arg1, int[] arg2) {
        field7757++;
        int var4 = 87 % ((arg1 - 28) / 50);
        if (this.field7753.method2478((byte) -114) == 1) {
            return this.method3153(0, -2072156240, arg0, arg2);
        } else if (this.field7753.method2482(0, arg0) == 1) {
            return this.method3153(arg0, -2072156240, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([IIII)Lcba;")
    private final class548 method3155(int[] arg0, int arg1, int arg2, int arg3) {
        field7762++;
        int var5 = arg3 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFFA);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class548 var9 = (class548) this.field7764.method1754(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class571 var10 = (class571) this.field7758.method1754(false, var7);
            if (arg1 != -8764) {
                this.field7764 = null;
            }
            if (var10 == null) {
                var10 = class571.method3317(this.field7754, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field7758.method1751(var10, 3970, var7);
            }
            class548 var11 = var10.method3321(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method864(arg1 + 21747);
                this.field7764.method1751(var11, 3970, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B[II)Lcba;")
    public final class548 method3156(byte arg0, int[] arg1, int arg2) {
        if (arg0 >= -81) {
            return null;
        }
        field7751++;
        if (this.field7754.method2478((byte) -58) == 1) {
            return this.method3155(arg1, -8764, 0, arg2);
        } else if (this.field7754.method2482(0, arg2) == 1) {
            return this.method3155(arg1, -8764, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method3157(int arg0) {
        field7760 = null;
        field7763 = null;
        field7761 = null;
        if (arg0 >= -121) {
            method3157(75);
        }
        field7752 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILoh;IIJIZ)V")
    public static final void method3158(int arg0, class404 arg1, int arg2, int arg3, long arg4, int arg5, boolean arg6) {
        if (arg3 == 256) {
            field7756++;
            class115.method761(arg1, arg4, (byte) 113, arg2, 0, arg0, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Loh;Loh;)V")
    public class537(class404 arg0, class404 arg1) {
        this.field7754 = arg1;
        this.field7753 = arg0;
    }
}
