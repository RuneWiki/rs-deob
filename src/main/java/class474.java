import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class474 extends class508 {

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public int field6933;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public int field6926;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public int field6931;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public int field6932;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "Z")
    public boolean field6927;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public int field6925;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "Ldn;")
    public static class201 field6924;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZLeo;I)V", line = 13)
    public static final void method2838(boolean arg0, class423 arg1, int arg2) {
        field6930++;
        int var3 = arg1.field5797 == 0 ? arg1.field5735 : arg1.field5797;
        int var4 = arg1.field5768 == 0 ? arg1.field5726 : arg1.field5768;
        class177.method1148(arg0, 3, class296.field3842[arg1.field5734 >> 16], var4, var3, arg1.field5734);
        if (arg1.field5679 != null) {
            class177.method1148(arg0, 3, arg1.field5679, var4, var3, arg1.field5734);
        }
        if (arg2 == 23311) {
            class367 var5 = (class367) class381.field4963.method2085((long) arg1.field5734, arg2 - 28734);
            if (var5 != null) {
                class376.method2197(var5.field4719, var3, arg0, (byte) -45, var4);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V", line = 36)
    public static void method2839(byte arg0) {
        field6924 = null;
        if (arg0 != 44) {
            method2838(true, null, 81);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIIZ)V", line = 45)
    public class474(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field6933 = arg1;
        this.field6926 = arg2;
        this.field6931 = arg0;
        this.field6932 = arg4;
        this.field6927 = arg5;
        this.field6925 = arg3;
    }
}
