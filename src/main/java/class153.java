import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class153 extends class260 {

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    private int field2354;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "F")
    public float field2339;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    private int field2344;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Ldi;")
    public static class83 field2351 = new class83(73, 16);

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "Z")
    public static boolean field2353 = false;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)I")
    public final int method1021(int arg0) {
        if (arg0 == 14919) {
            field2349++;
            return this.field2344;
        } else {
            return -40;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
    public static final boolean method1022(int arg0, int arg1, int arg2) {
        int var3 = -13 / ((arg2 + 3) / 44);
        field2343++;
        return class472.method2778(arg1, arg0, (byte) -113) || class266.method1598(-96, arg1, arg0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)F")
    public final float method1023(byte arg0) {
        if (arg0 >= -16) {
            this.method1026(true);
        }
        field2345++;
        return this.field2339;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IF)V")
    public abstract void method1024(int arg0, float arg1);

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)I")
    public final int method1025(byte arg0) {
        field2346++;
        int var2 = 121 / ((14 - arg0) / 45);
        return this.field2350;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)I")
    public final int method1026(boolean arg0) {
        field2352++;
        return arg0 ? this.field2340 : 30;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I")
    public final int method1027(int arg0) {
        field2348++;
        return arg0 == -601 ? this.field2347 : -113;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIB)V")
    public abstract void method1028(int arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)I")
    public final int method1029(byte arg0) {
        if (arg0 > -119) {
            this.method1021(81);
        }
        field2342++;
        return this.field2354;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public static void method1030(int arg0) {
        if (arg0 == -14215) {
            field2351 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIF)V")
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field2340 = arg0;
        this.field2354 = arg3;
        this.field2347 = arg2;
        this.field2339 = arg5;
        this.field2344 = arg4;
        this.field2350 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lef;IILjava/lang/String;)Lji;")
    public static final class432 method1031(class338 arg0, int arg1, int arg2, String arg3) {
        field2338++;
        if (arg2 != 1) {
            method1030(-6);
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class122.field1828, 0);
        if (class122.field1828[0] == 0) {
            if (class122.field1828[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class122.field1828, 1);
            if (class122.field1828[1] > 1) {
                byte[] var6 = new byte[class122.field1828[1]];
                OpenGL.glGetInfoLogARB(var4, class122.field1828[1], class122.field1828, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class122.field1828[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class432(arg0, var4, arg1);
    }
}
