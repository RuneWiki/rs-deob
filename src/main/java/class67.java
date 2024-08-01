import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gg")
public class class67 {

    @OriginalMember(owner = "gg", name = "f", descriptor = "Llf;")
    private static class109 field1301 = class35.method275("cyan:", 2);

    @OriginalMember(owner = "gg", name = "h", descriptor = "I")
    public static volatile int field1303 = 0;

    @OriginalMember(owner = "gg", name = "d", descriptor = "Llf;")
    public static class109 field1299 = field1301;

    @OriginalMember(owner = "gg", name = "c", descriptor = "Llf;")
    public static class109 field1298 = field1301;

    @OriginalMember(owner = "gg", name = "l", descriptor = "Llf;")
    public static class109 field1307 = class35.method275("Freie Welt", 2);

    @OriginalMember(owner = "gg", name = "o", descriptor = "I")
    public static int field1310 = 0;

    @OriginalMember(owner = "gg", name = "m", descriptor = "Llf;")
    public static class109 field1308 = class35.method275("headicons_prayer", 2);

    @OriginalMember(owner = "gg", name = "i", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "gg", name = "a", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "gg", name = "b", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "gg", name = "e", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "gg", name = "g", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "gg", name = "k", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "gg", name = "n", descriptor = "Lsh;")
    public static class174 field1309;

    @OriginalMember(owner = "gg", name = "j", descriptor = "Lbg;")
    public static class18 field1305;

    @OriginalMember(owner = "gg", name = "a", descriptor = "(ILlf;Llf;Llf;)V")
    public static final void method437(int arg0, class109 arg1, class109 arg2, class109 arg3) {
        if (arg0 >= 83) {
            field1297++;
            class145.field2794 = arg1;
            class145.field2806 = arg3;
            class145.field2805 = arg2;
        }
    }

    @OriginalMember(owner = "gg", name = "a", descriptor = "(B)V")
    public static final void method438(byte arg0) {
        class102.field2016.method1088(-51);
        field1300++;
        if (arg0 < 35) {
            field1309 = null;
        }
    }

    @OriginalMember(owner = "gg", name = "a", descriptor = "(I)V")
    public static void method439(int arg0) {
        field1298 = null;
        field1301 = null;
        field1309 = null;
        field1299 = null;
        field1308 = null;
        field1307 = null;
        if (arg0 != 20617) {
            field1310 = -53;
        }
        field1305 = null;
    }

    @OriginalMember(owner = "gg", name = "b", descriptor = "(B)V")
    public static final void method440(byte arg0) {
        Object var1 = class203.field3987;
        synchronized (class203.field3987) {
            if (class21.field475 == 0) {
                class49.field1009.method694(new class202(), 5, (byte) 46);
            }
            class21.field475 = 600;
        }
        field1306++;
        if (arg0 != -86) {
            field1305 = null;
        }
    }
}
