import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class393 extends class401 {

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Lqh;")
    public class61 field5552;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "Lgca;")
    public static class227 field5553 = new class227();

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Lem;")
    public static class206 field5555 = new class206(105, 5);

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Lsea;")
    public static class648 field5550;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILlj;Ljava/lang/String;I)Lnj;")
    public static final class222 method2296(int arg0, class565 arg1, String arg2, int arg3) {
        int var4 = -73 / ((34 - arg0) / 43);
        field5554++;
        int var5 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var5);
        OpenGL.glProgramStringARB(arg3, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class129.field1844, 0);
        if (class129.field1844[0] == -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class222(arg1, arg3, var5);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)V")
    public static void method2297(boolean arg0) {
        field5550 = null;
        field5555 = null;
        field5553 = null;
        if (arg0) {
            field5550 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILin;ZI)V")
    public static final void method2298(int arg0, int arg1, class78 arg2, boolean arg3, int arg4) {
        field5551++;
        int var5 = arg2.field1104;
        int var6 = arg2.field1050;
        if (arg2.field1138 == 0) {
            arg2.field1104 = arg2.field1085;
        } else if (arg2.field1138 == 1) {
            arg2.field1104 = arg4 - arg2.field1085;
        } else if (arg2.field1138 == 2) {
            arg2.field1104 = arg2.field1085 * arg4 >> 14;
        }
        if (arg2.field1019 == 0) {
            arg2.field1050 = arg2.field1093;
        } else if (arg2.field1019 == 1) {
            arg2.field1050 = arg0 - arg2.field1093;
        } else if (arg2.field1019 == 2) {
            arg2.field1050 = arg2.field1093 * arg0 >> 14;
        }
        if (arg2.field1138 == 4) {
            arg2.field1104 = arg2.field1050 * arg2.field1024 / arg2.field1174;
        }
        if (arg2.field1019 == 4) {
            arg2.field1050 = arg2.field1174 * arg2.field1104 / arg2.field1024;
        }
        if (class314.field4339 && (client.method1679(arg2).field4217 != 0 || arg2.field1075 == 0)) {
            if (arg2.field1050 < 5 && arg2.field1104 < 5) {
                arg2.field1104 = 5;
                arg2.field1050 = 5;
            } else {
                if (arg2.field1104 <= 0) {
                    arg2.field1104 = 5;
                }
                if (arg2.field1050 <= 0) {
                    arg2.field1050 = 5;
                }
            }
        }
        if (class42.field489 == arg2.field1109) {
            class685.field9775 = arg2;
        }
        if (arg3 && arg2.field1082 != null && (arg2.field1104 != var5 || arg2.field1050 != var6)) {
            class368 var7 = new class368();
            var7.field4962 = arg2.field1082;
            var7.field4957 = arg2;
            class69.field940.method1441(var7, 0);
        }
        if (arg1 > -98) {
            method2297(false);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lqh;)V")
    public class393(class61 arg0) {
        this.field5552 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIZII)I")
    public static final int method2299(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            field5556++;
            int var5 = 65536 - class597.field8344[arg4 * 8192 / arg0] >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg3 * var5 >> 16);
        } else {
            return 105;
        }
    }
}
