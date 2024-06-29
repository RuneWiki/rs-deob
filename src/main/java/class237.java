import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class237 {

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public int field4291;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public int field4281;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lkh;")
    private static class117 field4285 = class224.method1450((byte) 114, "You have only just left another world)3");

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4288 = 7759444;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lkh;")
    public static class117 field4289 = class224.method1450((byte) -7, "<col=ff7000>");

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lkh;")
    public static class117 field4282 = field4285;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lkh;")
    public static class117 field4287 = class224.method1450((byte) -100, "<col=ff9040>");

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lkh;")
    public static class117 field4292 = class224.method1450((byte) -104, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lvf;")
    public static class235 field4283;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)V")
    public abstract void method596(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(BII)V")
    public abstract void method595(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;ZLai;Lai;)V")
    public static final void method1516(class10 arg0, boolean arg1, class10 arg2, class10 arg3) {
        class79.field1492 = arg0;
        if (arg1) {
            field4287 = null;
        }
        class143.field2581 = arg3;
        field4286++;
        class1.field16 = arg2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1517(int arg0) {
        if (arg0 != 7759444) {
            field4284 = -62;
        }
        field4283 = null;
        field4289 = null;
        field4285 = null;
        field4287 = null;
        field4282 = null;
        field4292 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public abstract void method598(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(III)V")
    public class237(int arg0, int arg1, int arg2) {
        this.field4290 = arg2;
        this.field4291 = arg1;
        this.field4281 = arg0;
    }
}
