import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class223 {

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "J")
    public static long field4001 = 0L;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lsg;")
    public static class30 field4005 = class167.method1221((byte) 33, "underlay");

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lsg;")
    public static class30 field4004 = class167.method1221((byte) 33, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lcc;")
    public static class206 field4000;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[[[S")
    public static short[][][] field3996;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILmc;Lmc;II)Lcc;")
    public static final class206 method1599(int arg0, class151 arg1, class151 arg2, int arg3, int arg4) {
        field3998++;
        if (arg0 != 31760) {
            field4005 = null;
        }
        return class224.method1608(arg4, arg3, arg2, 0) ? class185.method1329((byte) -120, arg1.method1115(arg4, (byte) -127, arg3)) : null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1600(int arg0) {
        field4004 = null;
        field3996 = null;
        field4005 = null;
        field4000 = null;
        if (arg0 != 0) {
            field4005 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lsg;IZ)V")
    public static final void method1601(class30 arg0, int arg1, boolean arg2) {
        field4006++;
        if (arg1 != 12651) {
            field4000 = null;
        }
        if (arg2) {
            try {
                class135.field2643.getAppletContext().showDocument(arg0.method273(class135.field2643.getCodeBase(), 17851), "_blank");
            } catch (Exception var3) {
            }
        } else {
            try {
                class135.field2643.getAppletContext().showDocument(arg0.method273(class135.field2643.getCodeBase(), 17851), "_top");
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
    public static final void method1602(int arg0, int arg1) {
        field3997++;
        class251.field4436.method1642(arg0, 73);
        class234.field4165.method1642(arg0, 76);
        if (arg1 != 6813) {
            method1602(-19, -128);
        }
        class75.field1665.method1642(arg0, 105);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lgb;Lmc;ILmc;)V")
    public static final void method1603(class140 arg0, class151 arg1, int arg2, class151 arg3) {
        field4003++;
        class113.field2249 = arg1;
        class173.field3226 = arg0;
        if (arg2 < -13) {
            class41.field1017 = arg3;
        }
    }
}
