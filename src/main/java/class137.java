import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class137 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lpg;")
    private class525 field2115 = new class525();

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lub;")
    private class18 field2123 = new class18();

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    private int field2124;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    private int field2122;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lhl;")
    private class375 field2125;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2120 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public final void method994(int arg0) {
        field2121++;
        this.field2123.method101((byte) -128);
        this.field2125.method2286((byte) 19);
        this.field2115 = new class525();
        this.field2122 = this.field2124;
        if (arg0 != 50) {
            this.method997((byte) -31, -108L);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lbt;BILjava/lang/String;)Lj;")
    public static final class386 method995(class33 arg0, byte arg1, int arg2, String arg3) {
        field2116++;
        int var4 = OpenGL.glGenProgramARB();
        if (arg1 >= -76) {
            field2118 = 100;
        }
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class238.field3575, 0);
        if (class238.field3575[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class386(arg0, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBLjava/lang/Object;I)[B")
    public static final byte[] method996(int arg0, byte arg1, Object arg2, int arg3) {
        field2119++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class347.method2189(var4, arg0, arg3, -127);
        } else if (arg2 instanceof class274) {
            class274 var5 = (class274) arg2;
            return var5.method1766(arg0, (byte) -40, arg3);
        } else {
            int var6 = 70 % ((13 - arg1) / 48);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJ)Lpg;")
    public final class525 method997(byte arg0, long arg1) {
        int var4 = -73 / ((-arg0 - 90) / 36);
        field2114++;
        class525 var5 = (class525) this.field2125.method2284(true, arg1);
        if (var5 != null) {
            this.field2123.method99(var5, 5604);
        }
        return var5;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJLpg;)V")
    public final void method998(byte arg0, long arg1, class525 arg2) {
        field2117++;
        int var5 = 117 % ((arg0 - 13) / 54);
        if (this.field2122 == 0) {
            class525 var6 = this.field2123.method103(1048575);
            var6.method421(22071);
            var6.method3115((byte) 103);
            if (this.field2115 == var6) {
                class525 var7 = this.field2123.method103(1048575);
                var7.method421(22071);
                var7.method3115((byte) 103);
            }
        } else {
            this.field2122--;
        }
        this.field2125.method2292(arg1, arg2, (byte) -128);
        this.field2123.method99(arg2, 5604);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
    public class137(int arg0) {
        this.field2124 = arg0;
        this.field2122 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2125 = new class375(var2);
    }
}
