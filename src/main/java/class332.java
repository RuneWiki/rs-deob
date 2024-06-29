import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class332 {

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public int field4057 = 128;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public int field4055 = 128;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public int field4065;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public int field4059;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field4052 = 0;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field4066 = 0;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Lfca;")
    public static class661 field4061 = new class661();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public int field4058;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public int field4062;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lfk;", line = 5)
    public final class332 method1916(int arg0) {
        field4056++;
        return arg0 == 28335 ? new class332(this.field4060, this.field4057, this.field4055, this.field4059, this.field4065, this.field4054) : null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 16)
    public static void method1917(int arg0) {
        field4061 = null;
        if (arg0 != 23240) {
            method1920(null, -127, -62, null);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBIIIIIII)Z", line = 32)
    public static final boolean method1918(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4049++;
        if (arg2 + arg3 > arg8 && (arg8 + arg6) > arg2) {
            if (arg1 >= -117) {
                method1917(107);
            }
            return arg0 < arg4 + arg5 && arg4 < arg0 + arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILd;Ljava/awt/Canvas;)Lha;", line = 56)
    public static final class570 method1919(int arg0, int arg1, int arg2, class284 arg3, Canvas arg4) {
        if (arg2 != 192) {
            field4052 = -5;
        }
        field4050++;
        return new class426(arg4, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I)V", line = 147)
    public class332(int arg0) {
        this.field4060 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIII)V", line = 154)
    private class332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4055 = arg2;
        this.field4060 = arg0;
        this.field4065 = arg4;
        this.field4059 = arg3;
        this.field4057 = arg1;
        this.field4054 = arg5;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;II[B)I", line = 72)
    public static final int method1920(String arg0, int arg1, int arg2, byte[] arg3) {
        field4051++;
        if (arg1 != -1) {
            method1917(2);
        }
        int var4 = arg2;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class91.method552(arg0.charAt(var6), (byte) -109);
            int var8 = var5 <= var6 + 1 ? -1 : class91.method552(arg0.charAt(var6 + 1), (byte) -82);
            int var9 = (var6 + 2) < var5 ? class91.method552(arg0.charAt(var6 + 2), (byte) -97) : -1;
            int var10 = var5 > var6 + 3 ? class91.method552(arg0.charAt(var6 + 3), (byte) -123) : -1;
            arg3[arg2++] = (byte) class77.method473(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg3[arg2++] = (byte) class77.method473(var9 >>> 2, class249.method1625(var8 << 4, 240));
            if (var10 == -1) {
                break;
            }
            arg3[arg2++] = (byte) class77.method473(var10, class249.method1625(var9 << 6, 192));
        }
        return arg2 - var4;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lfk;B)V", line = 122)
    public final void method1921(class332 arg0, byte arg1) {
        if (arg1 != -3) {
            this.field4059 = 56;
        }
        this.field4054 = arg0.field4054;
        this.field4055 = arg0.field4055;
        this.field4057 = arg0.field4057;
        this.field4060 = arg0.field4060;
        this.field4065 = arg0.field4065;
        this.field4059 = arg0.field4059;
        field4063++;
    }
}
