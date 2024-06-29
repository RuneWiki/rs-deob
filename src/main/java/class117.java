import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class117 extends class467 {

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public volatile int field1648 = -1;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Ljava/lang/String;")
    public volatile String field1645;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "[I")
    public static int[] field1647 = new int[8];

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lui;")
    public static class375 field1649 = new class375("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "[S")
    public static short[] field1651 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "[S")
    public static short[] field1652 = new short[256];

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZII)V")
    public static final void method758(boolean arg0, int arg1, int arg2) {
        field1650++;
        class410 var3 = class261.method1684(arg1, 25, arg0);
        if (arg2 != 35713) {
            field1653 = 32;
        }
        if (var3 != null) {
            var3.method2785((byte) -120);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method759(int arg0) {
        field1644++;
        if (arg0 != 0) {
            method758(true, 24, -115);
        }
        if (!class126.method807((byte) 84)) {
            return;
        }
        if (class341.field5382 == null) {
            class407.method2483((byte) 104);
        }
        class181.field2582 = true;
        class33.field523 = 0;
        try {
            class128.field1810 = class498.field7279.getToolkit().getSystemClipboard();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lbv;Ljava/lang/String;II)Lfk;")
    public static final class238 method760(class282 arg0, String arg1, int arg2, int arg3) {
        field1646++;
        if (arg3 != -12054) {
            field1647 = null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class308.field4573, 0);
        if (class308.field4573[0] == 0) {
            if (class308.field4573[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class308.field4573, 1);
            if (class308.field4573[1] > 1) {
                byte[] var6 = new byte[class308.field4573[1]];
                OpenGL.glGetInfoLogARB(var4, class308.field4573[1], class308.field4573, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class308.field4573[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class238(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public static final void method761(int arg0) {
        field1643++;
        if (arg0 != 0) {
            method761(-106);
        }
        if (class25.field406 != null && class253.field3510 != null) {
            return;
        }
        class253.field3510 = new int[256];
        class25.field406 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class25.field406[var1] = (int) (Math.sin(var2) * 4096.0D);
            class253.field3510[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method762(byte arg0) {
        field1647 = null;
        field1652 = null;
        field1651 = null;
        field1649 = null;
        if (arg0 >= -28) {
            field1649 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class117(String arg0) {
        this.field1645 = arg0;
    }
}
