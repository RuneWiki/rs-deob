import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class61 extends class719 {

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "[I")
    public static int[] field782 = new int[3];

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!gda", name = "q", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!gda", name = "r", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!gda", name = "s", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!gda", name = "t", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!gda", name = "v", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!gda", name = "w", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)V")
    public static void method373(byte arg0) {
        field782 = null;
        if (arg0 > -12) {
            method373((byte) 20);
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lee;)V")
    public class61(class703 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IZ)V")
    public final void method222(int arg0, boolean arg1) {
        super.field9776.method3872(true, -127);
        ++field781;
        if (arg0 > -126) {
            method373((byte) 53);
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)Z")
    public final boolean method218(byte arg0) {
        ++field784;
        if (arg0 <= 16) {
            this.method225(true, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "(I)V")
    public final void method220(int arg0) {
        ++field783;
        if (arg0 != 23363) {
            field782 = null;
        }
        super.field9776.method3872(false, -122);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZLb;I)V")
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        ++field786;
        super.field9776.method3882(0, arg1);
        if (!arg0) {
            this.method221(false, (class352) null, -110);
        }
        super.field9776.method3871(0, arg2);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZZ)V")
    public final void method225(boolean arg0, boolean arg1) {
        ++field788;
        if (!arg0) {
            this.method220(92);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljca;IIIII)V")
    public static final void method374(class711 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field787;
        if (arg3 != -16889) {
            field782 = null;
        }
        class608 var6 = null;
        for (class608 var7 = (class608) class518.field7196.method679((byte) -86); var7 != null; var7 = (class608) class518.field7196.method681(-101)) {
            if (var7.field8215 == arg5 && var7.field8230 == arg1 && ~var7.field8232 == ~arg4 && var7.field8221 == arg2) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class608();
            var6.field8215 = arg5;
            var6.field8230 = arg1;
            var6.field8221 = arg2;
            var6.field8232 = arg4;
            class518.field7196.method689(var6, arg3 ^ 16804);
        }
        var6.field8222 = arg0;
        var6.field8225 = false;
        var6.field8231 = true;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)V")
    public final void method219(int arg0, int arg1, int arg2) {
        ++field789;
        if (arg1 != 0) {
            this.method220(-8);
        }
    }
}
