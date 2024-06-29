import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public abstract class class411 {

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6061 = new BigInteger("9b60e152f650f105f68010a0a070834aa293c663fd240bebc114a10e711bf1361f67058210e24d7eba7a9fe59771d58e4877780f2409b16e69c4ae70bec50c7f", 16);

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "Lcb;")
    public static class631 field6063 = new class631(41, -1);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "Lla;")
    public static class422 field6065;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILom;[Lkea;)Loo;", line = 4)
    public static final class647 method2531(int arg0, class642 arg1, class74[] arg2) {
        field6062++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field1106 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field1106);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class44.field739, 0);
        if (class44.field739[0] == arg0) {
            if (class44.field739[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class44.field739, 1);
            if (class44.field739[1] > 1) {
                byte[] var7 = new byte[class44.field739[1]];
                OpenGL.glGetInfoLogARB(var4, class44.field739[1], class44.field739, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class44.field739[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field1106);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class647(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V", line = 68)
    public static void method2532(byte arg0) {
        if (arg0 >= 83) {
            field6063 = null;
            field6061 = null;
            field6065 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILul;)Lul;", line = 81)
    public static final class363 method2533(int arg0, class363 arg1) {
        if (arg0 <= 50) {
            field6061 = null;
        }
        field6060++;
        class363 var2 = arg1 == null ? new class363() : new class363(arg1);
        var2.method2315(128, true, 9);
        return var2;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZI)Z", line = 96)
    public static final boolean method2534(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field6065 = null;
        }
        field6059++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(FFII[FIFIIFI)V")
    public abstract void method2530(float arg0, float arg1, int arg2, int arg3, float[] arg4, int arg5, float arg6, int arg7, int arg8, float arg9, int arg10);
}
