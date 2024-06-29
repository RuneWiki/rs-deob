import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class472 {

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "[[I")
    public static int[][] field6423 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field6427 = 0;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Ldda;")
    public static class407 field6424;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lgga;")
    public static class513 field6425;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method2755(int arg0) {
        field6425 = null;
        field6424 = null;
        if (arg0 >= 84) {
            field6423 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;Llea;I)Lck;")
    public static final class235 method2756(int arg0, String arg1, class573 arg2, int arg3) {
        if (arg0 != -21541) {
            method2755(89);
        }
        field6426++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class39.field460, 0);
        if (class39.field460[0] == 0) {
            if (class39.field460[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class39.field460, 1);
            if (class39.field460[1] > 1) {
                byte[] var6 = new byte[class39.field460[1]];
                OpenGL.glGetInfoLogARB(var4, class39.field460[1], class39.field460, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class39.field460[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class235(arg2, var4, arg3);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lnfa;III)V")
    public static final void method2757(class745 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class42.field520) {
            class172 var4 = class514.field7096[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2595 != null && var4.field2595.method197(true)) {
                arg0.method194(-24659, class253.field3624, 0, class29.field307, var4.field2595, true, 0);
            }
        }
        if (arg3 < class42.field520) {
            class172 var5 = class514.field7096[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2595 != null && var5.field2595.method197(true)) {
                arg0.method194(-24659, 0, class253.field3624, class29.field307, var5.field2595, true, 0);
            }
        }
        if (arg2 < class42.field520 && arg3 < class681.field9665) {
            class172 var6 = class514.field7096[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2595 != null && var6.field2595.method197(true)) {
                arg0.method194(-24659, class253.field3624, class253.field3624, class29.field307, var6.field2595, true, 0);
            }
        }
        if (arg2 < class42.field520 && arg3 > 0) {
            class172 var7 = class514.field7096[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2595 != null && var7.field2595.method197(true)) {
                arg0.method194(-24659, class253.field3624, -class253.field3624, class29.field307, var7.field2595, true, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IBIIII)V")
    public static final void method2758(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field6421++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg5 * arg5;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        if (arg1 != 115) {
            return;
        }
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        if (arg0 >= class515.field7102 && class698.field9801 >= arg0) {
            int var21 = class645.method3656(class435.field6058, class742.field10301, arg2 + arg5, 26289);
            int var22 = class645.method3656(class435.field6058, class742.field10301, arg2 - arg5, 26289);
            class379.method2284(var22, var21, class74.field1144[arg0], arg3, 2);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (class515.field7102 <= var24 && class698.field9801 >= var23) {
                int var25 = class645.method3656(class435.field6058, class742.field10301, arg2 + var6, arg1 + 26174);
                int var26 = class645.method3656(class435.field6058, class742.field10301, arg2 - var6, 26289);
                if (class515.field7102 <= var23) {
                    class379.method2284(var26, var25, class74.field1144[var23], arg3, 2);
                }
                if (var24 <= class698.field9801) {
                    class379.method2284(var26, var25, class74.field1144[var24], arg3, arg1 ^ 0x71);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method2759(long arg0, boolean arg1) {
        field6422++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            if (!arg1) {
                method2757(null, -29, -106, 22);
            }
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class224.field3288[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}
