import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class505 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Z")
    public static boolean field6936 = true;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lnea;")
    public static class600 field6931 = new class600(2);

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "F")
    public static float field6937;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2953(int arg0) {
        class528.field7374 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([Lck;Llea;B)Lkba;", line = 7)
    public static final class25 method2954(class235[] arg0, class573 arg1, byte arg2) {
        field6932++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field3403 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg2 > -84) {
            field6936 = false;
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field3403);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class335.field4773, 0);
        if (class335.field4773[0] == 0) {
            if (class335.field4773[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class335.field4773, 1);
            if (class335.field4773[1] > 1) {
                byte[] var7 = new byte[class335.field4773[1]];
                OpenGL.glGetInfoLogARB(var4, class335.field4773[1], class335.field4773, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class335.field4773[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field3403);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class25(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lhk;", line = 79)
    public static final class153 method2955(int arg0, int arg1) {
        if (arg1 != 16) {
            field6936 = true;
        }
        field6933++;
        class153[] var2 = class108.method864((byte) -110);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field2440 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 106)
    public static void method2956(int arg0) {
        if (arg0 <= 25) {
            field6931 = null;
        }
        field6931 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBIZZ)V", line = 119)
    public static final void method2957(String arg0, String arg1, int arg2, byte arg3, int arg4, boolean arg5, boolean arg6) {
        field6935++;
        class469.field6386.field7051 = 1;
        String var7 = arg0.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg4 != -1) {
            class93 var11 = class498.field6854.method3434(arg4, 10549);
            if (var11 == null || var11.method789(78) != arg5) {
                return;
            }
            if (var11.method789(104)) {
                var10 = var11.field1332;
            } else {
                var9 = var11.field1331;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class422.field5873.field6908; var13++) {
            class42 var16 = class422.field5873.method2937((byte) -60, var13);
            if ((!arg6 || var16.field503) && var16.field528 == -1 && var16.field504 == -1 && var16.field505 == -1 && var16.field508 == 0 && var16.field554.toLowerCase().indexOf(var7) != -1) {
                if (arg4 != -1) {
                    if (arg5) {
                        if (!arg1.equals(var16.method315(arg4, var10, -93))) {
                            continue;
                        }
                    } else if (arg2 != var16.method308(arg4, (byte) 29, var9)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class781.field10703 = null;
                    class217.field3162 = -1;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class144.field2334 = 0;
        class217.field3162 = var12;
        class781.field10703 = var8;
        if (arg3 <= 114) {
            field6936 = false;
        }
        String[] var14 = new String[class217.field3162];
        for (int var15 = 0; var15 < class217.field3162; var15++) {
            var14[var15] = class422.field5873.method2937((byte) -120, var8[var15]).field554;
        }
        class636.method3623(-1, var14, class781.field10703);
        class469.field6386.method2992((byte) -100);
        class469.field6386.field7051 = 2;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)V", line = 233)
    public static final void method2958(int arg0, int arg1) {
        field6934++;
        class486.field6695 = new int[arg0];
        class509.field6988 = new int[arg0];
        class126.field2151 = new int[arg0];
        class728.field10158 = new int[arg0];
        int var2 = -53 / ((13 - arg1) / 51);
        class411.field5632 = new int[arg0];
    }
}
