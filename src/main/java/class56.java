import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class56 extends class548 {

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!pia", name = "o", descriptor = "Lfba;")
    public static class348 field960 = new class348(4);

    @OriginalMember(owner = "client!pia", name = "p", descriptor = "B")
    public static byte field961;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!pia", name = "q", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!pia", name = "r", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)Lhr;", line = 5)
    public final class57 method478(int arg0) {
        field963++;
        if (arg0 <= 30) {
            this.method478(-60);
        }
        return class28.field260;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V", line = 17)
    public static void method544(byte arg0) {
        if (arg0 >= -42) {
            field961 = 80;
        }
        field960 = null;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(III)V", line = 27)
    public static final void method545(int arg0, int arg1, int arg2) {
        field958++;
        if (class301.field4129 == null) {
            return;
        }
        int var3 = class565.field8192;
        int var4 = class595.field8451;
        class57.method549(arg0, (byte) 100, arg1);
        if (class270.field3833 == arg2) {
            class675.field9607 = null;
            class675.field9607 = class301.field4129.method1231(class301.field4129.method1253(class222.field3279, class492.field7090), class301.field4129.method1255(class222.field3279, class492.field7090));
        } else if (class270.field3833 == 1 && (class577.field8283 == null || class565.field8192 != var3 || class595.field8451 != var4)) {
            class577.field8283 = new class86[class595.field8451 * class565.field8192];
            for (int var5 = 0; var5 < class577.field8283.length; var5++) {
                class577.field8283[var5] = class301.field4129.method1231(class301.field4129.method1253(class381.field5523, class519.field7488), class301.field4129.method1255(class381.field5523, class519.field7488));
            }
            class721.field10151 = 1;
            class571.field8229 = new int[class595.field8451 * class565.field8192];
        }
        class235.field3518 = true;
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(ILeda;Lcga;III)V", line = 71)
    public class56(int arg0, class14 arg1, class141 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field959 = arg5;
    }
}
