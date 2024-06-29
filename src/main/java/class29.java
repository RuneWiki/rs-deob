import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class29 extends class216 {

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    private int field500 = -1;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    private int field489 = 0;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field491 = 0;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "[I")
    public static int[] field495 = new int[50];

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field499 = 0;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lbd;")
    private static class162 field501 = class17.method142(0, "Starting 3d Library");

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "Lbd;")
    public static class162 field493 = field501;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(Z)V", line = 8)
    public static final void method242(boolean arg0) {
        if (arg0) {
            field491 = 114;
        }
        if (class237.field3946 != null) {
            class247 var1 = class237.field3946;
            synchronized (class237.field3946) {
                class237.field3946 = null;
            }
        }
        field494++;
    }

    @OriginalMember(owner = "client!ah", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() throws Throwable {
        if (this.field500 != -1) {
            class41.method301(this.field500, this.field489, this.field490);
            this.field500 = -1;
            this.field489 = 0;
        }
        field498++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 60)
    public static void method243(int arg0) {
        field501 = null;
        field495 = null;
        field493 = null;
        if (arg0 != -1) {
            method246(119, -15, -63, 51, -12, 3, -38, 17, -46, -48, 66, -3, -60, 38, -114, -103, 41, -82, 119, 79);
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)V", line = 72)
    public final void method244(byte arg0) {
        field492++;
        int var2 = class180.method1371(128);
        if ((var2 & 0x1) == 0) {
            class117.method939(this.field500);
        }
        if ((var2 & 0x2) == 0) {
            class117.method961(0);
        }
        if ((var2 & 0x4) == 0) {
            class117.method935(0);
        }
        if (arg0 < 126) {
            method243(-83);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V", line = 98)
    public static final void method245(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            return;
        }
        class101 var5 = (class101) class40.field651.method1672((long) arg4, arg1 ^ 0x4D30);
        if (var5 == null) {
            var5 = new class101();
            class40.field651.method1674(var5, false, (long) arg4);
        }
        field497++;
        if (arg2 >= var5.field1847.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field1847.length; var8++) {
                var7[var8] = var5.field1847[var8];
                var6[var8] = var5.field1849[var8];
            }
            for (int var9 = var5.field1847.length; var9 < arg2; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field1847 = var7;
            var5.field1849 = var6;
        }
        var5.field1847[arg2] = arg3;
        var5.field1849[arg2] = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 161)
    public static final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class80 var20 = new class80(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class288.field4856[var21][arg1][arg2] == null) {
                    class288.field4856[var21][arg1][arg2] = new class225(var21, arg1, arg2);
                }
            }
            class288.field4856[arg0][arg1][arg2].field3766 = var20;
        } else if (arg3 == 1) {
            class80 var22 = new class80(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class288.field4856[var23][arg1][arg2] == null) {
                    class288.field4856[var23][arg1][arg2] = new class225(var23, arg1, arg2);
                }
            }
            class288.field4856[arg0][arg1][arg2].field3766 = var22;
        } else {
            class164 var24 = new class164(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class288.field4856[var25][arg1][arg2] == null) {
                    class288.field4856[var25][arg1][arg2] = new class225(var25, arg1, arg2);
                }
            }
            class288.field4856[arg0][arg1][arg2].field3771 = var24;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V", line = 223)
    public class29(int arg0) {
        GL var2 = class117.field2143;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field500 = var3[0];
        this.field490 = class41.field659;
        class117.method939(this.field500);
        int var4 = class312.field5264[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class41.field658 += var6.limit() - this.field489;
        this.field489 = var6.limit();
    }
}
