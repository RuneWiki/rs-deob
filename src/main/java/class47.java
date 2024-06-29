import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class47 extends class224 {

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lal;")
    public static class52 field584 = new class52(64);

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field589 = 0;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "Lmo;")
    public static class447 field590;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Ljava/awt/Frame;")
    public static Frame field587;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
    public static int[] field585;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIZ)V", line = 4)
    public final void method298(int arg0, int arg1, boolean arg2) {
        ++field582;
        int var4 = this.field579 * arg0 >> 12;
        if (!arg2) {
            this.field586 = -114;
        }
        int var5 = this.field581 * arg0 >> 12;
        int var6 = this.field586 * arg1 >> 12;
        int var7 = this.field578 * arg1 >> 12;
        class139.method1015(var4, (byte) -125, super.field3731, var5, var6, var7);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V", line = 25)
    public final void method299(int arg0, int arg1, int arg2) {
        if (arg2 == -1011) {
            ++field583;
            int var4 = this.field579 * arg0 >> 12;
            int var5 = this.field581 * arg0 >> 12;
            int var6 = this.field586 * arg1 >> 12;
            int var7 = this.field578 * arg1 >> 12;
            class322.method2138(2, var6, super.field3734, var7, super.field3731, var5, var4, super.field3730);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 49)
    public static void method300(int arg0) {
        field584 = null;
        field585 = null;
        if (arg0 != -531180500) {
            method300(35);
        }
        field590 = null;
        field587 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ltm;I)V", line = 62)
    public static final void method301(class219 arg0, int arg1) {
        ++field580;
        if (arg1 != 1115716268) {
            method300(41);
        }
        class58 var2 = (class58) class126.field1939.method1770(-880, (long) arg0.field1868);
        if (var2 == null) {
            class224.method1609(arg0.field1906[0], arg0, class266.field4286, 0, (class50) null, (class127) null, arg1 + -1115707768, arg0.field1916[0]);
        } else {
            var2.method385(6);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(III)V", line = 82)
    public final void method302(int arg0, int arg1, int arg2) {
        ++field588;
        if (arg0 != -1011) {
            method300(-94);
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIII)V", line = 98)
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field581 = arg2;
        this.field586 = arg1;
        this.field578 = arg3;
        this.field579 = arg0;
    }
}
