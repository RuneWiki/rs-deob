import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class306 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public int field4534;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public int field4539;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "B")
    public byte field4538;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field4540 = new String[200];

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lqv;")
    public static class316 field4530 = new class316(111, 3);

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field4543 = -1;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lcv;")
    public class407 field4535;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Lql;")
    public class527 field4541;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lin;")
    public class61 field4533;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lcg;")
    public class93 field4536;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 9)
    public static void method1951(byte arg0) {
        field4540 = null;
        int var1 = 18 % ((arg0 - 84) / 36);
        field4530 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBILtf;)V", line = 19)
    public static final void method1952(int arg0, byte arg1, int arg2, class198 arg3) {
        field4531++;
        if (class290.field4312 != null || class248.field3714 || arg3 == null || class372.method2277(arg3, arg1 ^ 0xFFFFA643) == null) {
            return;
        }
        class290.field4312 = arg3;
        class77.field1271 = class372.method2277(arg3, 22988);
        class142.field2186 = false;
        class505.field7298 = arg0;
        class201.field3082 = arg2;
        if (arg1 != -113) {
            field4530 = null;
        }
        class413.field5848 = 0;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(BIIIII)V", line = 63)
    public class306(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4532 = arg1;
        this.field4529 = arg2;
        this.field4534 = arg5;
        this.field4539 = arg4;
        this.field4537 = arg3;
        this.field4538 = arg0;
    }
}
