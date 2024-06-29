import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class270 extends class165 {

    @OriginalMember(owner = "client!re", name = "x", descriptor = "[I")
    public static int[] field4357 = new int[5];

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public int field4349;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public int field4351;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public int field4353;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public int field4355;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public int field4362;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Lak;")
    public static class172 field4354;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "[I")
    public static int[] field4364;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "[Log;")
    public static class157[] field4360;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V", line = 9)
    public static void method1920(byte arg0) {
        if (arg0 > 108) {
            field4360 = null;
            field4357 = null;
            field4354 = null;
            field4364 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BILjava/lang/String;)I", line = 22)
    public static final int method1921(byte arg0, int arg1, String arg2) {
        field4352++;
        if (arg0 != -63) {
            method1921((byte) -63, -58, (String) null);
        }
        return class99.method677(arg1, arg2, 50, true);
    }
}
