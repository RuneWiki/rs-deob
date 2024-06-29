import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class280 extends class263 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "[I")
    public static int[] field4247 = new int[2048];

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lsk;")
    public static class423 field4252 = new class423("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Luu;")
    public static class180 field4257;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4256;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "[[I")
    public static int[][] field4251;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method675(int arg0) {
        if (arg0 >= -112) {
            method1711(71);
        }
        ++field4259;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZB)V", line = 16)
    public final void method669(boolean arg0, byte arg1) {
        super.field3984.method2655(-1001, true);
        int var3 = 35 % ((arg1 - 24) / 34);
        ++field4253;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 26)
    public static void method1711(int arg0) {
        field4252 = null;
        if (arg0 == -6459) {
            field4251 = null;
            field4256 = null;
            field4257 = null;
            field4247 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)V", line = 42)
    public final void method666(int arg0, boolean arg1) {
        if (arg0 != -2560) {
            this.method673(-50, -70, -67);
        }
        ++field4248;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V", line = 53)
    public final void method673(int arg0, int arg1, int arg2) {
        if (arg2 == 6908) {
            ++field4249;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 64)
    public final void method670(byte arg0) {
        super.field3984.method2655(-1001, false);
        ++field4254;
        if (arg0 != -94) {
            field4251 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lbl;)V", line = 76)
    public class280(class442 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lce;IZ)V", line = 94)
    public final void method671(class194 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field4251 = null;
        }
        super.field3984.method2586(arg0, !arg2);
        ++field4255;
        super.field3984.method2610(0, arg1);
    }
}
