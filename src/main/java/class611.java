import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class611 {

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "B")
    private byte field8564;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public int field8565;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public int field8569;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
    public int field8570;

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
    public int field8571;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public int field8566;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "Lrga;")
    public static class280 field8573 = new class280(21, 3);

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "S")
    public static short field8574 = 32767;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
    public static int field8567;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)I", line = 3)
    public final int method3335(int arg0) {
        field8567++;
        if (arg0 != 2183) {
            field8573 = null;
        }
        return this.field8564 & 0x7;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IZ)V", line = 22)
    public static final void method3336(int arg0, boolean arg1) {
        if (arg1) {
            if (class316.field4063 != -1) {
                class510.method2756(class316.field4063, 0);
            }
            for (class340 var2 = (class340) class138.field1797.method407((byte) 124); var2 != null; var2 = (class340) class138.field1797.method403(12561)) {
                if (!var2.method1873(-76)) {
                    var2 = (class340) class138.field1797.method407((byte) 124);
                    if (var2 == null) {
                        break;
                    }
                }
                class426.method2260(false, true, false, var2);
            }
            class316.field4063 = -1;
            class138.field1797 = new class68(8);
            class128.method682(1);
            class316.field4063 = class680.field9563;
            class635.method3557(false, (byte) -69);
            class544.method2941(0);
            class197.method1189(class316.field4063);
        }
        field8572++;
        class407.field5096 = false;
        class507.field6866 = "";
        class402.field5035 = "";
        class687.method3871(false);
        class474.field6013 = -1;
        class258.method1508(true, class224.field2810);
        class376.field4748 = new class514();
        class376.field4748.field6461 = class431.field5395 * 512 / 2;
        class376.field4748.field9758[0] = class431.field5395 / 2;
        class376.field4748.field6464 = class452.field5802 * 512 / 2;
        class276.field3464 = 0;
        class20.field292 = 0;
        class376.field4748.field9754[0] = class452.field5802 / 2;
        if (arg0 <= 27) {
            method3337(-119);
        }
        if (class296.field3661 == 2) {
            class276.field3464 = class277.field3471 << 9;
            class20.field292 = class400.field5020 << 9;
        } else {
            class55.method354(-1202242076);
        }
        class19.method122(124);
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V", line = 87)
    public static void method3337(int arg0) {
        field8573 = null;
        if (arg0 != 7) {
            method3336(-105, false);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)I", line = 101)
    public final int method3338(boolean arg0) {
        if (arg0) {
            this.field8566 = 116;
        }
        field8568++;
        return (this.field8564 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V", line = 117)
    public class611() {
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Les;)V", line = 119)
    public class611(class630 arg0) {
        this.field8564 = arg0.method3480(-20933);
        this.field8565 = arg0.method3470(13111);
        this.field8569 = arg0.method3483(74);
        this.field8570 = arg0.method3483(67);
        this.field8571 = arg0.method3483(98);
        this.field8566 = arg0.method3483(71);
    }
}
