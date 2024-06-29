import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class464 {

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "Lrga;")
    public static class280 field5908 = new class280(49, 2);

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Lrga;")
    public static class280 field5912 = new class280(6, 4);

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public int field5909;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public int field5911;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public int field5914;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lr;IIB)V", line = 3)
    public static final void method2464(class566 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -10) {
            return;
        }
        class337.field4338 = arg0;
        class683.field9599 = new class424[arg2][arg1];
        field5913++;
        if (class572.field7992 != null) {
            class474.field6009 = class542.method2929(class572.field7992[0], class572.field7992[3], class572.field7992[4], class572.field7992[5], class572.field7992[2], class572.field7992[1], false);
        }
        class286.field3552 = new class424();
        class583.method3213(84);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 24)
    public static void method2465(byte arg0) {
        field5912 = null;
        if (arg0 != 9) {
            method2464(null, -56, -120, (byte) -59);
        }
        field5908 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method2466(boolean arg0) {
        if (arg0) {
            field5910++;
            class592 var1 = class61.method371(15, 0, (byte) 113);
            var1.method3253(0);
        }
    }
}
