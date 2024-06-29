import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class469 {

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field6682 = -50;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lsk;")
    public static class121 field6680;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2833(boolean arg0) {
        field6679++;
        int var1 = class468.field6665;
        int[] var2 = class38.field500;
        for (int var3 = 0; var3 < var1; var3++) {
            class639 var9 = class536.field7796[var2[var3]];
            if (var9 != null && var9.field4579 > 0) {
                var9.field4579--;
                if (var9.field4579 == 0) {
                    var9.field4632 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class619.field8816; var4++) {
            long var5 = (long) class545.field7927[var4];
            class63 var7 = (class63) class389.field5608.method4020(var5, (byte) -61);
            if (var7 != null) {
                class571 var8 = var7.field1004;
                if (var8.field4579 > 0) {
                    var8.field4579--;
                    if (var8.field4579 == 0) {
                        var8.field4632 = null;
                    }
                }
            }
        }
        if (!arg0) {
            method2833(true);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 71)
    public static void method2834(byte arg0) {
        if (arg0 != 68) {
            method2833(false);
        }
        field6680 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljw;III)V", line = 84)
    public static final void method2835(class280 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class439.field6264) {
            class375 var4 = class565.field8185[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5422 != null && var4.field5422.method715(-12888)) {
                arg0.method711(class150.field2190, var4.field5422, class391.field5644, (byte) 84, 0, true, 0);
            }
        }
        if (arg3 < class439.field6264) {
            class375 var5 = class565.field8185[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5422 != null && var5.field5422.method715(-12888)) {
                arg0.method711(0, var5.field5422, class391.field5644, (byte) 55, 0, true, class150.field2190);
            }
        }
        if (arg2 < class439.field6264 && arg3 < class408.field5806) {
            class375 var6 = class565.field8185[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5422 != null && var6.field5422.method715(-12888)) {
                arg0.method711(class150.field2190, var6.field5422, class391.field5644, (byte) 88, 0, true, class150.field2190);
            }
        }
        if (arg2 < class439.field6264 && arg3 > 0) {
            class375 var7 = class565.field8185[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5422 != null && var7.field5422.method715(-12888)) {
                arg0.method711(class150.field2190, var7.field5422, class391.field5644, (byte) 92, 0, true, -class150.field2190);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lmba;II[B)Lms;", line = 130)
    public static final class402 method2836(class643 arg0, int arg1, int arg2, byte[] arg3) {
        field6683++;
        if (arg3 == null || arg3.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceRawARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class343.field4720, 0);
        if (class343.field4720[0] == 0) {
            if (class343.field4720[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class343.field4720, 1);
            if (class343.field4720[1] > 1) {
                byte[] var6 = new byte[class343.field4720[1]];
                OpenGL.glGetInfoLogARB(var4, class343.field4720[1], class343.field4720, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class343.field4720[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        if (arg1 != -2) {
            method2834((byte) -32);
        }
        return new class402(arg0, var4, arg2);
    }
}
