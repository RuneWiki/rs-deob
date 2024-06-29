import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class521 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lqj;")
    private class535 field7246 = new class535(64);

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Luq;")
    private class172 field7249;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BILjava/lang/String;)V", line = 3)
    public static final void method3029(byte arg0, int arg1, String arg2) {
        field7252++;
        int var3 = -42 / ((74 - arg0) / 41);
        class778 var4 = class389.method2406(119, (long) arg1, 3);
        var4.method4274(100);
        var4.field10694 = arg2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method3030(int arg0, int arg1, int arg2) {
        field7251++;
        return arg1 > -15 ? true : (class171.method1150(arg0, (byte) 115, arg2) | class328.method2119(arg0, arg2, -65) | class158.method1098(71, arg0, arg2)) & class468.method2742(arg0, (byte) 97, arg2);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lvj;", line = 34)
    public final class465 method3031(int arg0, int arg1) {
        field7250++;
        if (arg1 != 0) {
            return null;
        }
        class535 var3 = this.field7246;
        class465 var4;
        synchronized (this.field7246) {
            var4 = (class465) this.field7246.method3109((byte) 127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field7249;
        byte[] var6;
        synchronized (this.field7249) {
            var6 = this.field7249.method1188(5, -18047, arg0);
        }
        class465 var7 = new class465();
        if (var6 != null) {
            var7.method2736(new class254(var6), arg1 ^ 0xFFFFFFBC);
        }
        class535 var8 = this.field7246;
        synchronized (this.field7246) {
            this.field7246.method3108((long) arg0, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 66)
    public static final void method3032(int arg0) {
        class747.field10066.method3103(-11294);
        field7248++;
        if (arg0 <= -101) {
            ;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B[BLsha;I)Lkfa;", line = 79)
    public static final class627 method3033(byte arg0, byte[] arg1, class757 arg2, int arg3) {
        if (arg0 != 23) {
            return null;
        }
        field7247++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramRawARB(arg3, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class679.field9089, 0);
        if (class679.field9089[0] == -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class627(arg2, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lkw;ILuq;)V", line = 117)
    public class521(class263 arg0, int arg1, class172 arg2) {
        this.field7249 = arg2;
        this.field7249.method1175(5, (byte) 92);
    }
}
