import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class227 implements class418 {

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Ljava/lang/String;")
    private String field3041;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "Lcj;")
    public static class445 field3038 = new class445();

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "Z")
    private boolean field3039;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V", line = 3)
    public static void method1336(int arg0) {
        field3038 = null;
        if (arg0 < 91) {
            method1339((byte) 4);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Lcca;", line = 17)
    public final class464 method1337(int arg0) {
        if (arg0 == 4790) {
            field3044++;
            return class464.field6460;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)I", line = 29)
    public final int method1338(byte arg0) {
        if (arg0 > -107) {
            this.method1341(-118);
        }
        field3037++;
        int var2 = class368.method2318(this.field3041, 7210);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field3039 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 47)
    public class227(String arg0) {
        this.field3041 = arg0;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V", line = 59)
    public static final void method1339(byte arg0) {
        field3042++;
        if (class712.field9957 == null) {
            return;
        }
        class155.field2184 = new class453();
        class155.field2184.method2778(1, class444.field6169, class712.field9957.field6863.method978(class120.field1576, (byte) -114), class712.field9957.field6860, class712.field9957);
        if (arg0 == 47) {
            class368.field5215 = new Thread(class155.field2184, "");
            class368.field5215.start();
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z", line = 76)
    public static final boolean method1340(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field3038 = null;
        }
        field3043++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)Z", line = 90)
    public final boolean method1341(int arg0) {
        field3040++;
        if (arg0 != 100) {
            field3038 = null;
        }
        return this.field3039;
    }
}
