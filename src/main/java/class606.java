import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class606 extends class400 {

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    private int field8162;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field8163 = 4;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "[I")
    public static int[] field8166 = new int[13];

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Lmga;")
    public static class738 field8160 = new class738();

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 6)
    public static void method3444(int arg0) {
        if (arg0 != 0) {
            field8160 = null;
        }
        field8166 = null;
        field8160 = null;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lpc;II[BI)V", line = 23)
    public class606(class700 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field8162 = arg2;
        super.field5229.method3936(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field5235, 0, super.field5236, this.field8162, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2347(true, 120);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(ZI)V", line = 38)
    public final void method3445(boolean arg0, int arg1) {
        super.field5229.method3936(false, this);
        if (arg1 != 10497) {
            method3447(true, (byte[]) null, -105);
        }
        ++field8161;
        OpenGL.glTexParameteri(super.field5235, 10242, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 50)
    public final void method1219(int arg0) {
        ++field8159;
        if (arg0 >= -96) {
            field8160 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)I", line = 60)
    public static final int method3446(int arg0) {
        ++field8164;
        if (arg0 != 1) {
            field8163 = -123;
        }
        if (class672.field9218) {
            return 6;
        } else if (class748.field10391 == null) {
            return 0;
        } else {
            int var1 = class748.field10391.field1029;
            if (class336.method1990(var1, arg0 ^ -104)) {
                return 1;
            } else if (class174.method1177(20, var1)) {
                return 2;
            } else if (class501.method2975(var1, (byte) 124)) {
                return 3;
            } else {
                return class247.method1488((byte) 127, var1) ? 4 : 5;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 94)
    public static final Object method3447(boolean arg0, byte[] arg1, int arg2) {
        if (arg2 != 0) {
            field8163 = -120;
        }
        ++field8165;
        if (arg1 == null) {
            return null;
        } else {
            if (~arg1.length < -137 && !class303.field3620) {
                try {
                    class608 var3 = (class608) Class.forName("mda").newInstance();
                    var3.method1619(0, arg1);
                    return var3;
                } catch (Throwable var4) {
                    class303.field3620 = true;
                }
            }
            return !arg0 ? arg1 : class458.method2773((byte) 127, arg1);
        }
    }
}
