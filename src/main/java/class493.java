import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class493 {

    @OriginalMember(owner = "client!eka", name = "k", descriptor = "I")
    public int field6835 = 0;

    @OriginalMember(owner = "client!eka", name = "i", descriptor = "[C")
    public static char[] field6833 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!eka", name = "f", descriptor = "I")
    public static int field6830 = 500;

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!eka", name = "d", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!eka", name = "h", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!eka", name = "j", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!eka", name = "g", descriptor = "Lqk;")
    public static class18 field6831;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "Lhd;")
    public static class773 field6825;

    @OriginalMember(owner = "client!eka", name = "e", descriptor = "[Lvr;")
    public static class147[] field6829;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)V")
    public static void method2858(int arg0) {
        field6825 = null;
        field6829 = null;
        field6831 = null;
        if (arg0 != 0) {
            field6831 = null;
        }
        field6833 = null;
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(BLjp;)V")
    public final void method2859(byte arg0, class376 arg1) {
        if (arg0 > -1) {
            field6829 = null;
        }
        field6834++;
        while (true) {
            int var3 = arg1.method2398(-1372747256);
            if (var3 == 0) {
                return;
            }
            this.method2860(var3, -13991, arg1);
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(IILjp;)V")
    private final void method2860(int arg0, int arg1, class376 arg2) {
        field6826++;
        if (arg1 != -13991) {
            this.method2859((byte) 61, null);
        }
        if (arg0 == 5) {
            this.field6835 = arg2.method2359(-1);
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(I[BILpa;)Lqea;")
    public static final class138 method2861(int arg0, byte[] arg1, int arg2, class391 arg3) {
        field6827++;
        if (arg2 != 3431) {
            field6825 = null;
        }
        if (arg1 == null || arg1.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceRawARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class723.field10070, 0);
        if (class723.field10070[0] == 0) {
            if (class723.field10070[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class723.field10070, 1);
            if (class723.field10070[1] > 1) {
                byte[] var6 = new byte[class723.field10070[1]];
                OpenGL.glGetInfoLogARB(var4, class723.field10070[1], class723.field10070, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class723.field10070[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class138(arg3, var4, arg0);
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)V")
    public static final void method2862(byte arg0) {
        field6828++;
        class150.field2090 = 0;
        int var1 = (class551.field7456.field2257 >> 9) + class121.field1765;
        int var2 = (class551.field7456.field2259 >> 9) + class230.field3147;
        if (arg0 > -27) {
            method2863((byte) -100, null);
        }
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class150.field2090 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class150.field2090 = 1;
        }
        if (class150.field2090 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class150.field2090 = 0;
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(BLgaa;)V")
    public static final void method2863(byte arg0, class315 arg1) {
        for (int var2 = 0; var2 < class697.field9766; var2++) {
            int var3 = class477.field6626[var2];
            class73 var4 = class599.field8149[var3];
            int var5 = arg1.method2398(-1372747256);
            if ((var5 & 0x10) != 0) {
                var5 += arg1.method2398(-1372747256) << 8;
            }
            if ((var5 & 0x800) != 0) {
                var5 += arg1.method2398(-1372747256) << 16;
            }
            class589.method3296(arg1, var3, var4, var5, (byte) -90);
        }
        if (arg0 >= -60) {
            field6831 = null;
        }
        field6832++;
    }
}
