import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "Lde;")
    private class534 field31 = new class534(64);

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "Lde;")
    public class534 field33 = new class534(2);

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Lnd;")
    public class547 field24;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "Lnd;")
    private class547 field29;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field26 = 0;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field27 = -1;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "Z")
    public static boolean field32;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)Ljda;")
    public final class229 method10(int arg0, int arg1) {
        field30++;
        class534 var3 = this.field31;
        class229 var4;
        synchronized (this.field31) {
            var4 = (class229) this.field31.method3079((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field29;
        byte[] var6;
        synchronized (this.field29) {
            var6 = this.field29.method3153(arg1, 0, 33);
        }
        class229 var7 = new class229();
        var7.field3024 = this;
        if (arg0 != 1) {
            field26 = 44;
        }
        if (var6 != null) {
            var7.method1458(new class461(var6), 113);
        }
        class534 var8 = this.field31;
        synchronized (this.field31) {
            this.field31.method3077((byte) -18, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static final void method11(int arg0) {
        if (arg0 <= 60) {
            field27 = 75;
        }
        field20++;
        class372.field4784.method3064(false);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ltk;[BII)Ldc;")
    public static final class5 method12(class347 arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 >= -55) {
            field26 = -20;
        }
        field21++;
        if (arg1 == null || arg1.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceRawARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class657.field9156, 0);
        if (class657.field9156[0] == 0) {
            if (class657.field9156[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class657.field9156, 1);
            if (class657.field9156[1] > 1) {
                byte[] var6 = new byte[class657.field9156[1]];
                OpenGL.glGetInfoLogARB(var4, class657.field9156[1], class657.field9156, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class657.field9156[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class5(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)V")
    public final void method13(byte arg0, int arg1) {
        field22++;
        if (arg0 != -32) {
            return;
        }
        class534 var3 = this.field31;
        synchronized (this.field31) {
            this.field31.method3070(arg1, arg0 ^ 0xFFFFFF9E);
        }
        class534 var4 = this.field33;
        synchronized (this.field33) {
            this.field33.method3070(arg1, 127);
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(BI)V")
    public static final void method14(byte arg0, int arg1) {
        class372.field4784.method3070(arg1, 119);
        if (arg0 != 29) {
            method14((byte) -102, 93);
        }
        field25++;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public final void method15(int arg0) {
        class534 var2 = this.field31;
        synchronized (this.field31) {
            this.field31.method3065(true);
            if (arg0 > -46) {
                this.field33 = null;
            }
        }
        field28++;
        class534 var3 = this.field33;
        synchronized (this.field33) {
            this.field33.method3065(true);
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        if (arg0 >= -72) {
            return;
        }
        field23++;
        class534 var2 = this.field31;
        synchronized (this.field31) {
            this.field31.method3064(false);
        }
        class534 var3 = this.field33;
        synchronized (this.field33) {
            this.field33.method3064(false);
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lal;ILnd;Lnd;)V")
    public class3(class102 arg0, int arg1, class547 arg2, class547 arg3) {
        this.field24 = arg3;
        this.field29 = arg2;
        this.field29.method3178((byte) 125, 33);
    }
}
