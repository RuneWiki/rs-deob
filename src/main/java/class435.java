import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class435 extends class540 {

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "I")
    public int field6176;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
    public int field6177;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
    public int field6178;

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
    public int field6181;

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "I")
    public int field6182;

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
    public int field6185;

    @OriginalMember(owner = "client!uw", name = "s", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "I")
    public int field6188;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "I")
    public int field6192;

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "I")
    public int field6193;

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
    public int field6195;

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "I")
    public int field6197;

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
    public int field6198;

    @OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
    public int field6199;

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
    public int field6201;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "I")
    public int field6202;

    @OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!uw", name = "K", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "Lsja;")
    public class11 field6179;

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "Lct;")
    public class154 field6196;

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "Lig;")
    public class254 field6184;

    @OriginalMember(owner = "client!uw", name = "t", descriptor = "Lwb;")
    public static class346 field6187;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "Lbc;")
    public class383 field6189;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I", line = 6)
    public static final int method2602(int arg0) {
        if (arg0 != 11544) {
            method2602(110);
        }
        field6204++;
        return class9.field207;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IILpw;IIII)Z", line = 18)
    public static final boolean method2603(int arg0, int arg1, class733 arg2, int arg3, int arg4, int arg5, int arg6) {
        field6203++;
        if (!class74.field991 || !class790.field10837) {
            return false;
        } else if (class683.field9698 < 100) {
            return false;
        } else if (arg1 != arg5 || arg4 != arg6) {
            for (int var7 = arg1; var7 <= arg5; var7++) {
                for (int var8 = arg6; var8 <= arg4; var8++) {
                    if (class728.field10187[arg0][var7][var8] == -class279.field3940) {
                        return false;
                    }
                }
            }
            if (class686.method3870(arg2, arg3)) {
                class422.field5967++;
                return true;
            } else {
                return false;
            }
        } else if (!class136.method966(0, arg0, arg6, arg1)) {
            return false;
        } else if (class686.method3870(arg2, 0)) {
            class422.field5967++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)V", line = 72)
    public static void method2604(int arg0) {
        if (arg0 >= -115) {
            field6187 = null;
        }
        field6187 = null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 88)
    public static final void method2605(String arg0, byte arg1) {
        class491.field6979 = arg0;
        field6191++;
        if (class535.field7544 == null) {
            return;
        }
        try {
            if (arg1 != -72) {
                field6187 = null;
            }
            String var2 = class535.field7544.getParameter("cookieprefix");
            String var3 = class535.field7544.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class680.method3843((byte) -108, class109.method731(52) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class150.method1036("document.cookie=\"" + var5 + "\"", (byte) -120, class535.field7544);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "([Llv;Lkv;Z)Lgb;", line = 124)
    public static final class223 method2606(class466[] arg0, class280 arg1, boolean arg2) {
        field6190++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field6631 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        int var6 = 0;
        if (arg2) {
            field6187 = null;
        }
        while (arg0.length > var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field6631);
            var6++;
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class568.field8030, 0);
        if (class568.field8030[0] == 0) {
            if (class568.field8030[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class568.field8030, 1);
            if (class568.field8030[1] > 1) {
                byte[] var7 = new byte[class568.field8030[1]];
                OpenGL.glGetInfoLogARB(var4, class568.field8030[1], class568.field8030, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class568.field8030[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field6631);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class223(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V", line = 196)
    public final void method2607(int arg0) {
        if (arg0 != -2) {
            return;
        }
        this.field6196 = null;
        this.field6184 = null;
        field6180++;
        this.field6179 = null;
        this.field6189 = null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/io/File;BLjava/lang/String;)V", line = 228)
    public static final void method2608(File arg0, byte arg1, String arg2) {
        class45.field658.put(arg2, arg0);
        field6200++;
        if (arg1 >= -61) {
            field6183 = -3;
        }
    }
}
