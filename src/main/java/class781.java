import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class781 extends class165 {

    @OriginalMember(owner = "client!gfa", name = "q", descriptor = "I")
    public static int field10756;

    @OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
    public static int field10757;

    @OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
    public static int field10758;

    @OriginalMember(owner = "client!gfa", name = "t", descriptor = "I")
    public static int field10759;

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "I")
    public static int field10760;

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "Ljava/lang/String;")
    private String field10755;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "[[B")
    public static byte[][] field10761;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIZ)I")
    public static final int method4284(int arg0, int arg1, boolean arg2) {
        field10757++;
        if (arg1 == 1 || arg1 == 3) {
            return class132.field1733[arg0 & 0x3];
        } else {
            if (arg2) {
                method4284(65, 49, false);
            }
            return class484.field6867[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
    public static final void method4285(int arg0) {
        field10760++;
        if (arg0 != 3) {
            return;
        }
        class29 var1 = null;
        try {
            class370 var2 = class27.field395.method3422("", -71, true);
            while (var2.field5314 == 0) {
                class117.method820(false, 1L);
            }
            if (var2.field5314 == 1) {
                var1 = (class29) var2.field5317;
                class120 var3 = class145.field1852.method3640(arg0 - 8);
                var1.method209(false, var3.field1521, 0, var3.field1556);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method210(14471);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILmia;)V")
    public final void method612(int arg0, class69 arg1) {
        arg1.field930 = this.field10755;
        if (arg0 > -100) {
            this.field10755 = null;
        }
        field10759++;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
    public static void method4286(byte arg0) {
        if (arg0 < -4) {
            field10761 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lrv;I)V")
    public final void method614(class120 arg0, int arg1) {
        if (arg1 != 1070) {
            this.field10755 = null;
        }
        field10756++;
        this.field10755 = arg0.method861(true);
    }
}
