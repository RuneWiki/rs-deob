import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class358 {

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field5080 = 0;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "Lsv;")
    public static class570 field5077 = new class570(21, 8);

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
    public static void method2164(byte arg0) {
        field5077 = null;
        if (arg0 > -32) {
            method2167(-101, null);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILol;B)V")
    public static final void method2165(int arg0, class431 arg1, byte arg2) {
        if (class523.field7324 != null) {
            try {
                class523.field7324.method1400(0L, (byte) 2);
                class523.field7324.method1401(24, arg0, -1, arg1.field6002);
            } catch (Exception var3) {
            }
        }
        if (arg2 != 93) {
            field5080 = 50;
        }
        field5081++;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BI)V")
    public static final void method2166(byte arg0, int arg1) {
        field5075++;
        class371 var2 = class490.method2867((byte) -99, 3, (long) arg1);
        if (arg0 == -9) {
            var2.method2215(4);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILgga;)V")
    public static final void method2167(int arg0, class513 arg1) {
        class273.field3839 = 0;
        field5079++;
        class244.field3498 = 0;
        class546.field7568 = new class271();
        class174.field2630 = new class537[1024];
        class506.field6966 = new class187[class145.field2349[class693.field9762] + 1];
        class27.field291 = 0;
        field5080 = 0;
        class210.method1455(arg1, (byte) 122);
        if (arg0 != -12866) {
            field5080 = 117;
        }
        class280.method1781(arg1, (byte) 34);
    }
}
