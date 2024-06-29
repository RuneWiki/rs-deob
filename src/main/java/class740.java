import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class740 {

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public int field10243;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public int field10249;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "Ljo;")
    public static class374 field10248 = class400.method2377(false);

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "S")
    public static short field10254 = 320;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
    public int field10244;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    public int field10245;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    public static int field10246;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    public int field10251;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    public static int field10253;

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "Lgfa;")
    public class740 field10252;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "Ldm;")
    public class765 field10247;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)Lgfa;")
    public final class740 method4073(int arg0, int arg1) {
        field10253++;
        if (arg1 != 0) {
            this.method4076(36);
        }
        return new class740(this.field10243, arg0);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
    public static final void method4074(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class81.field1203[var1] = false;
        }
        field10250++;
        class34.field422 = class99.field1437;
        class235.field3407 = 0;
        class479.field6589 = class733.field10199;
        class401.field5522 = class286.field4204;
        class313.field4422 = arg0;
        class586.field8417 = class594.field8494;
        class177.field2659 = class243.field3482;
        class401.field5533 = -1;
        class743.field10323 = -1;
        class783.field10725 = 5;
        class44.field581 = -1;
        class420.field5831 = -1;
        class688.field9720 = class642.field9037;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
    public static void method4075(byte arg0) {
        if (arg0 >= -68) {
            field10248 = null;
        }
        field10248 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)Lis;")
    public final class119 method4076(int arg0) {
        field10246++;
        if (arg0 != -1) {
            method4075((byte) 71);
        }
        return class306.method1889(this.field10243, false);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(II)V")
    public class740(int arg0, int arg1) {
        this.field10243 = arg0;
        this.field10249 = arg1;
    }
}
