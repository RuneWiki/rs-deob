import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class303 extends class437 {

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    private int field4545;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    private int field4546;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    private int field4556;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    private int field4550;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field4547 = 0;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lhb;")
    public static class72 field4554;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(III)V")
    public final void method290(int arg0, int arg1, int arg2) {
        ++field4555;
        int var4 = this.field4550 * arg2 >> 12;
        int var5 = this.field4556 * arg2 >> 12;
        if (arg1 == 8224) {
            int var6 = this.field4545 * arg0 >> 12;
            int var7 = this.field4546 * arg0 >> 12;
            class51.method376(-2, var4, var5, var6, var7, super.field6343, super.field6349);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)V")
    public final void method295(int arg0, int arg1, int arg2) {
        ++field4548;
        int var4 = this.field4550 * arg0 >> 12;
        int var5 = this.field4556 * arg0 >> 12;
        int var6 = this.field4545 * arg1 >> 12;
        if (arg2 != -11654) {
            this.field4545 = -49;
        }
        int var7 = this.field4546 * arg1 >> 12;
        class239.method1550(super.field6349, var4, var6, super.field6343, var5, var7, (byte) 88, super.field6353);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIIIII)V")
    public class303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4545 = arg1;
        this.field4546 = arg3;
        this.field4556 = arg2;
        this.field4550 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILos;ZILtj;)V")
    public static final void method2033(int arg0, int arg1, int arg2, class129 arg3, boolean arg4, int arg5, class298 arg6) {
        if (arg4) {
            class295.field4450.method2070((class357.field5298 - class295.field4450.method199()) / 2, (class435.field6313 + -class295.field4450.method207()) / 2);
            class321.field4780.method2070((class357.field5298 - class321.field4780.method199()) / 2, 18);
        }
        ++field4551;
        arg3.method925(-1, class396.field5783 == 1 ? class398.field5835 : class271.field3993, class357.field5298 / 2, arg0, -22978, class435.field6313 / 2 + -26);
        int var7 = class435.field6313 / 2 + -18;
        arg6.method511(class357.field5298 / 2 + -152, var7, 304, 34, arg1, 0);
        arg6.method511(class357.field5298 / 2 + -151, var7 - -1, 302, arg5, 0, 0);
        arg6.method435(class357.field5298 / 2 + -150, var7 + 2, class428.field6221 * 3, 30, arg2, 0);
        arg6.method435(class428.field6221 * 3 + class357.field5298 / 2 + -150, var7 - -2, -(class428.field6221 * 3) + 300, 30, 0, 0);
        arg3.method925(-1, class428.field6226, class357.field5298 / 2, arg0, -22978, class435.field6313 / 2 + 4);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method2034(int arg0) {
        if (arg0 == -12279) {
            field4554 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V")
    public static final void method2035(int arg0, int arg1) {
        class398.field5839.method379(arg0, false);
        if (arg1 != -1557319988) {
            field4547 = 21;
        }
        ++field4552;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
    public static final void method2036(byte arg0) {
        ++field4549;
        if (arg0 == -22) {
            if (class263.field3862) {
                class248 var1 = class416.method2626(arg0 + 211655886, class274.field4024, class112.field1450);
                if (var1 != null && var1.field3639 != null) {
                    class452 var2 = new class452();
                    var2.field6570 = var1.field3639;
                    var2.field6571 = var1;
                    class293.method1989(var2);
                }
                class263.field3862 = false;
                class295.field4448 = -1;
                class92.method744(20491, var1);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    public final void method294(int arg0, int arg1, int arg2) {
        ++field4553;
        int var4 = this.field4550 * arg2 >> 12;
        int var5 = this.field4556 * arg2 >> 12;
        if (arg0 != 352) {
            method2036((byte) -25);
        }
        int var6 = this.field4545 * arg1 >> 12;
        int var7 = this.field4546 * arg1 >> 12;
        class184.method1198(var6, var5, var4, super.field6353, var7, 2000);
    }
}
