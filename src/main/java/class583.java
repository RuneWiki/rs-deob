import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class583 extends IOException {

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field8433 = 0;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "Lqfa;")
    public static class85 field8435 = new class85(110, 8);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Ljava/lang/Thread;")
    public static Thread field8431;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
    public static void method3339(boolean arg0) {
        if (arg0) {
            field8431 = null;
            field8435 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class583(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public static final void method3340(byte arg0) {
        int var1 = 45 % ((54 - arg0) / 61);
        class286.field4264 = new class373[50];
        class132.field2373 = 0;
        field8430++;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Lbk;")
    public static final class346 method3341(int arg0) {
        field8434++;
        if (arg0 != -11822) {
            field8433 = 22;
        }
        try {
            return (class346) Class.forName("lm").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILom;)V")
    public static final void method3342(int arg0, class344 arg1) {
        field8432++;
        class542.field7566 = arg1.method2228("hitmarks", 5781);
        class302.field4504 = arg1.method2228("hitbar_default", 5781);
        class372.field5532 = arg1.method2228("timerbar_default", 5781);
        class208.field3178 = arg1.method2228("headicons_pk", 5781);
        class537.field7522 = arg1.method2228("headicons_prayer", 5781);
        class493.field7048 = arg1.method2228("hint_headicons", 5781);
        class75.field1526 = arg1.method2228("hint_mapmarkers", 5781);
        class454.field6488 = arg1.method2228("mapflag", 5781);
        if (arg0 > -112) {
            method3340((byte) 26);
        }
        class7.field514 = arg1.method2228("cross", 5781);
        class365.field5418 = arg1.method2228("mapdots", 5781);
        class210.field3204 = arg1.method2228("scrollbar", 5781);
        class681.field9650 = arg1.method2228("name_icons", 5781);
        class173.field2863 = arg1.method2228("floorshadows", 5781);
        class604.field8763 = arg1.method2228("compass", 5781);
        class365.field5414 = arg1.method2228("otherlevel", 5781);
        class405.field5855 = arg1.method2228("hint_mapedge", 5781);
    }
}
