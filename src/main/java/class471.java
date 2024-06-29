import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class471 {

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public int field6937 = 0;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public int field6947 = 0;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lng;")
    private class226 field6942 = new class226(64);

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lhn;")
    private class505 field6949 = null;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lic;")
    private class491 field6939;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lic;")
    private class491 field6934;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lri;")
    public static class73 field6936 = new class73(100, -2);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "[I")
    public static int[] field6946;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lri;")
    public static class73 field6941;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "[I")
    public static int[] field6948;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIII)I")
    public static final int method2820(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            return -127;
        }
        field6945++;
        if ((class183.field2684[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class183.field2684[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)Lut;")
    public final class80 method2821(byte arg0, int arg1) {
        field6940++;
        class80 var3 = (class80) this.field6942.method1536((long) arg1, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field6934.method2945(1, arg1 & 0x7FFF, true);
        } else {
            var4 = this.field6939.method2945(1, arg1, true);
        }
        class80 var5 = new class80();
        if (arg0 < 36) {
            method2825(-128);
        }
        var5.field1204 = this;
        if (var4 != null) {
            var5.method473(-2286, new class209(var4));
        }
        if (arg1 >= 32768) {
            var5.method470(3);
        }
        this.field6942.method1542(var5, (byte) 112, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)Z")
    public static final boolean method2822(int arg0) {
        field6943++;
        if (arg0 != 0) {
            field6948 = null;
        }
        try {
            return class393.method2388(true);
        } catch (IOException var4) {
            class361.method2250((byte) -31);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class59.field883 == null ? -1 : class59.field883.method420(1)) + "," + (class80.field1218 == null ? -1 : class80.field1218.method420(arg0 ^ 0x1)) + "," + (field6941 == null ? -1 : field6941.method420(1)) + " - " + class352.field5395 + "," + (class500.field7365.field1997[0] + class68.field1038) + "," + (class500.field7365.field1996[0] + class24.field259) + " - ";
            for (int var3 = 0; class352.field5395 > var3 && var3 < 50; var3++) {
                var2 = var2 + class66.field1009.field3036[var3] + ",";
            }
            class235.method1598(var5, var2, (byte) 71);
            class246.method1653(-4548);
            return true;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([BBIIII)V")
    public static final void method2823(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field6935++;
        if (arg5 <= arg2) {
            return;
        }
        int var6 = arg5 - arg2 >> 2;
        int var7 = arg2 + arg4;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg5 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg1 >= -64) {
                            field6941 = null;
                            return;
                        } else {
                            return;
                        }
                    }
                    arg0[var7++] = 1;
                }
            }
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([ILgo;BJ)Ljava/lang/String;")
    public final String method2824(int[] arg0, class441 arg1, byte arg2, long arg3) {
        if (arg2 > -50) {
            method2822(-91);
        }
        field6944++;
        if (this.field6949 != null) {
            String var6 = this.field6949.method480(arg3, -128, arg1, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static void method2825(int arg0) {
        field6946 = null;
        if (arg0 != 1) {
            field6936 = null;
        }
        field6948 = null;
        field6941 = null;
        field6936 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;Lod;IB)Llv;")
    public static final class307 method2826(String arg0, class349 arg1, int arg2, byte arg3) {
        field6938++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        if (arg3 <= 27) {
            field6936 = null;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class413.field6201, 0);
        if (class413.field6201[0] == 0) {
            if (class413.field6201[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class413.field6201, 1);
            if (class413.field6201[1] > 1) {
                byte[] var6 = new byte[class413.field6201[1]];
                OpenGL.glGetInfoLogARB(var4, class413.field6201[1], class413.field6201, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class413.field6201[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class307(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(ILic;Lic;Lhn;)V")
    public class471(int arg0, class491 arg1, class491 arg2, class505 arg3) {
        this.field6939 = arg1;
        this.field6949 = arg3;
        this.field6934 = arg2;
        if (this.field6939 != null) {
            this.field6937 = this.field6939.method2942(false, 1);
        }
        if (this.field6934 != null) {
            this.field6947 = this.field6934.method2942(false, 1);
        }
    }

    static {
        new class475("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field6946 = new int[1000];
    }
}
