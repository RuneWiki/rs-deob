import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "[I")
    public static int[] field58 = new int[1000];

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Z")
    public static boolean field57 = false;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field61;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
    public static void method19(boolean arg0) {
        field58 = null;
        field61 = null;
        if (!arg0) {
            field61 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)V")
    public static final void method20(byte arg0, int arg1) {
        class97.field1278 = -1;
        class307.field4455 = arg1;
        class409.field5787 = -1;
        field60++;
        class516.method3066(121);
        int var2 = -24 % ((arg0 - 61) / 53);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)V")
    public static final void method21(boolean arg0) {
        if (arg0) {
            field54++;
            class420.method2487();
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIBII)V")
    public static final void method22(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 > -61) {
            field61 = null;
        }
        field55++;
        if (arg1 == arg2) {
            class429.method2540(arg0, arg4, 2048, arg5, arg2);
        } else if (class392.field5514 <= (arg4 - arg2) && (arg2 + arg4) <= class518.field7624 && (arg0 - arg1) >= class303.field4422 && (arg0 + arg1) <= class353.field5062) {
            class470.method2724(arg0, arg2, 1, arg5, arg4, arg1);
        } else {
            class383.method2222(arg5, arg1, (byte) 34, arg2, arg4, arg0);
        }
    }
}
