import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class349 {

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "[Llp;")
    public static class198[] field5195 = new class198[8];

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Lgp;")
    public class349 field5193;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Lgp;")
    public class349 field5194;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "[[Z")
    public static boolean[][] field5191;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIIIBII)V")
    public static final void method2307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg7 >= -38) {
            field5191 = null;
        }
        field5192++;
        class316 var10 = null;
        for (class316 var11 = (class316) class41.field625.method1575(0); var11 != null; var11 = (class316) class41.field625.method1573((byte) -128)) {
            if (var11.field4621 == arg8 && var11.field4628 == arg4 && var11.field4630 == arg5 && var11.field4622 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class316();
            var10.field4622 = arg6;
            var10.field4630 = arg5;
            var10.field4628 = arg4;
            var10.field4621 = arg8;
            class295.method1999(-65, var10);
            class41.field625.method1560(-105, var10);
        }
        var10.field4619 = arg3;
        var10.field4633 = arg1;
        var10.field4629 = arg2;
        var10.field4627 = arg0;
        var10.field4625 = arg9;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public final void method2308(int arg0) {
        field5196++;
        if (this.field5194 == null) {
            return;
        }
        this.field5194.field5193 = this.field5193;
        if (arg0 >= -9) {
            field5195 = null;
        }
        this.field5193.field5194 = this.field5194;
        this.field5194 = null;
        this.field5193 = null;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
    public static void method2309(int arg0) {
        field5191 = null;
        field5195 = null;
        if (arg0 != -31072) {
            field5195 = null;
        }
    }
}
