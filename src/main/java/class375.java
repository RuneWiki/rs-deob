import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class375 {

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public static int field5855 = 0;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILer;ILjava/lang/String;)Led;")
    public static final class655 method2466(int arg0, class92 arg1, int arg2, String arg3) {
        field5856++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class492.field7204, 0);
        if (~class492.field7204[0] == arg2) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class655(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
    public static final void method2467(byte arg0) {
        int var1 = 19 % ((arg0 - 22) / 62);
        for (int var2 = 0; var2 < 5; var2++) {
            class631.field8880[var2] = false;
        }
        field5858++;
        class556.field8042 = 0;
        class183.field3068 = class562.field8084;
        class81.field1005 = -1;
        class664.field9243 = -1;
        class192.field3182 = class523.field7598;
        class140.field2365 = class13.field197;
        class126.field2062 = 5;
        class668.field9441 = class412.field6318;
        class503.field7364 = 0;
        class24.field402 = -1;
        class273.field4408 = class607.field8638;
        class207.field3456 = -1;
        class2.field15 = class675.field9521;
    }
}
