import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class55 {

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field761 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "F")
    public static float field763;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "Lfg;")
    public static class129 field768;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "Lsca;")
    public static class46 field769;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "Lgda;")
    public class55 field762;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "Lgda;")
    public class55 field766;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "Lhia;")
    public static class66 field764;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)V")
    public final void method385(byte arg0) {
        field765++;
        if (this.field766 == null) {
            return;
        }
        this.field766.field762 = this.field762;
        if (arg0 <= -6) {
            this.field762.field766 = this.field766;
            this.field762 = null;
            this.field766 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIILfe;)V")
    public static final void method386(int arg0, int arg1, int arg2, int arg3, int arg4, class572 arg5) {
        field767++;
        class19 var6 = null;
        if (arg0 != -8897) {
            field768 = null;
        }
        for (class19 var7 = (class19) class606.field8555.method1195(0); var7 != null; var7 = (class19) class606.field8555.method1201(2)) {
            if (var7.field209 == arg3 && var7.field208 == arg2 && var7.field211 == arg1 && var7.field212 == arg4) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class19();
            var6.field208 = arg2;
            var6.field212 = arg4;
            var6.field209 = arg3;
            var6.field211 = arg1;
            class606.field8555.method1203(var6, (byte) 74);
        }
        var6.field213 = true;
        var6.field205 = false;
        var6.field216 = arg5;
    }

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)V")
    public static void method387(int arg0) {
        field769 = null;
        int var1 = 41 % ((25 - arg0) / 45);
        field761 = null;
        field764 = null;
        field768 = null;
    }
}
