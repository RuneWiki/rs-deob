import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class628 {

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Lrda;")
    private class467 field7983 = new class467(256);

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Lrda;")
    private class467 field7985 = new class467(256);

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Lwm;")
    private class30 field7976;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lwm;")
    private class30 field7972;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field7979 = 7000;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field7974 = field7979;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Ltq;")
    public static class536 field7980 = new class536(32);

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field7982 = 0;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "F")
    public static float field7981;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "J")
    public static long field7984;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static void method3357(byte arg0) {
        field7980 = null;
        if (arg0 >= -118) {
            method3359(null, 25, null, null, 70);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B[III)Lnga;")
    private final class701 method3358(byte arg0, int[] arg1, int arg2, int arg3) {
        field7971++;
        int var5 = arg3 ^ ((arg2 & 0x60000FFF) << 4 | arg2 >>> 12);
        int var6 = -5 % ((-arg0 - 75) / 49);
        int var7 = var5 | arg2 << 16;
        long var8 = (long) var7;
        class701 var10 = (class701) this.field7985.method2616(var8, (byte) -116);
        if (var10 != null) {
            return var10;
        } else if (arg1 == null || arg1[0] > 0) {
            class543 var11 = class543.method2949(this.field7976, arg2, arg3);
            if (var11 == null) {
                return null;
            }
            class701 var12 = var11.method2952();
            this.field7985.method2619(var12, var8, -1);
            if (arg1 != null) {
                arg1[0] -= var12.field9284.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/awt/Canvas;ILd;Lwm;I)Lha;")
    public static final class570 method3359(Canvas arg0, int arg1, class284 arg2, class30 arg3, int arg4) {
        field7973++;
        if (arg4 < 91) {
            method3359(null, -12, null, null, -110);
        }
        if (!class524.method2882(16106)) {
            throw new RuntimeException("");
        } else if (class382.method2194("jaggl", 31749)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg0, 8, 8, 8, 24, 0, arg1);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class179 var8 = new class179(var5, arg0, var6, arg2, arg3, arg1);
            var8.method3714((byte) 50);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[IB)Lnga;")
    private final class701 method3360(int arg0, int arg1, int[] arg2, byte arg3) {
        field7975++;
        int var5 = ((arg0 & 0x30000FFF) << 4 | arg0 >>> 12) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class701 var9 = (class701) this.field7985.method2616(var7, (byte) 89);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            if (arg3 <= 58) {
                method3359(null, 97, null, null, 88);
            }
            class74 var10 = (class74) this.field7983.method2616(var7, (byte) 115);
            if (var10 == null) {
                var10 = class74.method440(this.field7972, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field7983.method2619(var10, var7, -1);
            }
            class701 var11 = var10.method444(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1946(-10364);
                this.field7985.method2619(var11, var7, -1);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[I)Lnga;")
    public final class701 method3361(int arg0, int arg1, int[] arg2) {
        field7978++;
        if (this.field7976.method143((byte) 106) == 1) {
            return this.method3358((byte) 48, arg2, 0, arg1);
        } else if (this.field7976.method138(arg0 ^ arg0, arg1) == 1) {
            return this.method3358((byte) -127, arg2, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILha;)Lne;")
    public static final class166 method3362(int arg0, int arg1, class570 arg2) {
        field7977++;
        if (arg1 > -30) {
            field7980 = null;
        }
        class25 var3 = class711.method3839(0, arg2, arg0, true);
        return var3 == null ? null : var3.field214;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([III)Lnga;")
    public final class701 method3363(int[] arg0, int arg1, int arg2) {
        field7970++;
        if (arg1 != 8) {
            return null;
        } else if (this.field7972.method143((byte) 106) == 1) {
            return this.method3360(0, arg2, arg0, (byte) 119);
        } else if (this.field7972.method138(0, arg2) == 1) {
            return this.method3360(arg2, 0, arg0, (byte) 85);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lwm;Lwm;)V")
    public class628(class30 arg0, class30 arg1) {
        this.field7976 = arg0;
        this.field7972 = arg1;
    }
}
