import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class87 extends class12 {

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lra;")
    public static class57 field976;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lg;")
    public class87 field974;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lg;")
    public class87 field975;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static void method474(int arg0) {
        if (arg0 == 0) {
            field976 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public final void method475(int arg0) {
        field979++;
        if (this.field974 == null) {
            return;
        }
        this.field974.field975 = this.field975;
        this.field975.field974 = this.field974;
        this.field975 = null;
        this.field974 = null;
        if (arg0 < 47) {
            method476((byte) 56, (class249) null, 118);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLaf;I)V")
    public static final void method476(byte arg0, class249 arg1, int arg2) {
        field977++;
        if (class114.field1320) {
            class114.field1320 = false;
            arg2 = 0;
        }
        if (class433.field6327 == null || !class433.field6327.method1565(-6409, arg1)) {
            class433.field6327 = arg1;
            class58.field691 = class203.method1299((byte) 5);
            class27.field260 = arg2;
            class281.field3961 = arg2;
            if (class281.field3961 == 0) {
                class139.method829((byte) 47);
            } else {
                class217.field2974 = class330.field4712;
                class101.field1140 = class37.field363;
                class149.field2089 = class319.field4532;
                class372.field5439 = class244.field3291;
                class323.field4553 = class351.field5130;
                class315.field4482 = class419.field6016;
                class444.field6491 = class21.field226;
                class227.field3096 = class443.field6476;
                class174.field2419 = class392.field5736;
                class33.field316 = class191.field2604;
            }
        }
        if (arg0 >= -27) {
            method476((byte) -41, (class249) null, 55);
        }
    }
}
