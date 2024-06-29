import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class689 extends class165 {

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "[[I")
    public static int[][] field9657 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "[F")
    public static float[] field9663 = new float[4];

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method672(byte arg0) {
        ++field9658;
        if (arg0 <= 11) {
            field9657 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;Lep;BI)Lee;", line = 14)
    public static final class510 method3927(String arg0, class371 arg1, byte arg2, int arg3) {
        ++field9659;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class374.field5161, 0);
        if (~class374.field5161[0] == -1) {
            if (class374.field5161[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class374.field5161, 1);
            if (~class374.field5161[1] < -2) {
                byte[] var6 = new byte[class374.field5161[1]];
                OpenGL.glGetInfoLogARB(var4, class374.field5161[1], class374.field5161, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class374.field5161[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        if (arg2 != -80) {
            method3927((String) null, (class371) null, (byte) 123, -18);
        }
        return new class510(arg1, var4, arg3);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V", line = 56)
    public static final void method3928(byte arg0) {
        class410.field5731.method2068(class430.field5926);
        if (arg0 > -91) {
            method3928((byte) -106);
        }
        ++field9662;
        class410.field5731.method2081(class172.field2317, class364.field4659, class319.field4118, class380.field5353);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V", line = 72)
    public final void method678(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method673(-73, true);
        }
        ++field9661;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBI)V", line = 83)
    public final void method675(int arg0, byte arg1, int arg2) {
        if (arg1 <= 3) {
            field9663 = null;
        }
        ++field9666;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lep;)V", line = 96)
    public class689(class371 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 100)
    public final void method679(byte arg0) {
        if (arg0 <= -97) {
            ++field9665;
            super.field2260.method2164(false, 3553);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V", line = 111)
    public final void method673(int arg0, boolean arg1) {
        if (arg0 >= -115) {
            field9663 = null;
        }
        super.field2260.method2164(true, 3553);
        ++field9664;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZLhl;)V", line = 128)
    public final void method671(int arg0, boolean arg1, class396 arg2) {
        super.field2260.method2154(arg2, -2);
        ++field9660;
        if (arg1) {
            super.field2260.method2208(arg0, 6406);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V", line = 141)
    public static void method3929(int arg0) {
        field9663 = null;
        field9657 = null;
        int var1 = 93 / ((arg0 - 37) / 55);
    }
}
