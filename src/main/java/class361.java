import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class361 {

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "Z")
    public static boolean field5296 = false;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5294 = new String[100];

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Lmea;")
    public static class355 field5295 = new class355("", 12);

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "Lwo;")
    public class293 field5301;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "Ljp;")
    public class361 field5299;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "Ltca;")
    public static class545 field5298;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILkd;[B)Ltb;", line = 8)
    public static final class451 method2218(int arg0, int arg1, class700 arg2, byte[] arg3) {
        field5300++;
        if (arg3 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramRawARB(arg0, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class653.field9346, 0);
        if (class653.field9346[0] == -1) {
            OpenGL.glBindProgramARB(arg0, arg1);
            return new class451(arg2, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 34)
    public final void method2219(byte arg0) {
        field5297++;
        if (class420.field6186 >= 500) {
            return;
        }
        this.field5299 = class117.field1748;
        this.field5301 = null;
        if (arg0 >= -47) {
            this.field5301 = null;
        }
        class117.field1748 = this;
        class420.field6186++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 54)
    public static void method2220(int arg0) {
        if (arg0 == 12) {
            field5298 = null;
            field5294 = null;
            field5295 = null;
        }
    }
}
