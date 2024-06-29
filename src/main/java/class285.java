import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class285 extends OutputStream {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field3725;

    static {
        new class180("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLet;)Let;", line = 3)
    public static final class509 method1606(boolean arg0, class509 arg1) {
        field3724++;
        if (arg1.field7054 != -1) {
            return class61.method348(arg1.field7054, true);
        }
        int var2 = arg1.field7045 >>> 16;
        if (!arg0) {
            return null;
        }
        class582 var3 = new class582(class309.field3937);
        for (class565 var4 = (class565) var3.method3387(0); var4 != null; var4 = (class565) var3.method3389(1)) {
            if (var4.field8297 == var2) {
                return class61.method348((int) var4.field7967, true);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cs", name = "write", descriptor = "(I)V", line = 33)
    public final void write(int arg0) throws IOException {
        field3725++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIZZ)V", line = 48)
    public static final void method1607(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class362.field4756 = arg0;
        class79.field929 = 0x1 << class362.field4756;
        class410.field5342 = class79.field929 >> 1;
        class289.field3761 = (int) Math.sqrt((double) (class410.field5342 * class410.field5342 + class410.field5342 * class410.field5342));
        class596.field8635 = class79.field929 >> 2;
        class219.field2706 = class79.field929;
        class238.field2985 = arg2;
        class548.field8061 = arg3;
        class244.field3140 = arg4;
        class593.field8615 = new class349[arg1][class238.field2985][class548.field8061];
        class90.field1114 = new class174[arg1];
        if (arg5) {
            class523.field7333 = new int[class238.field2985][class548.field8061];
            class640.field9217 = new byte[class238.field2985][class548.field8061];
            class597.field8645 = new short[class238.field2985][class548.field8061];
            class292.field3786 = new class349[1][class238.field2985][class548.field8061];
            class370.field4884 = new class174[1];
        } else {
            class523.field7333 = null;
            class640.field9217 = null;
            class597.field8645 = null;
            class292.field3786 = null;
            class370.field4884 = null;
        }
        if (arg6) {
            class209.field2558 = new long[arg1][arg2][arg3];
            class602.field8699 = new class328[65535];
            class175.field2125 = new boolean[65535];
            class460.field6344 = 0;
        } else {
            class209.field2558 = null;
            class602.field8699 = null;
            class175.field2125 = null;
            class460.field6344 = 0;
        }
        class546.method3200(false);
        class194.field2349 = new class249[1000];
        class107.field1339 = 0;
        class601.field8672 = new class249[1000];
        class237.field2962 = 0;
        class297.field3815 = new int[arg1][class238.field2985 + 1][class548.field8061 + 1];
        class539.field7889 = new class598[5000];
        class639.field9193 = 0;
        class201.field2419 = new boolean[class244.field3140 + class244.field3140 + 1][class244.field3140 + class244.field3140 + 1];
        class78.field918 = new boolean[class244.field3140 + class244.field3140 + 2][class244.field3140 + class244.field3140 + 2];
        class367.field4820 = null;
    }
}
