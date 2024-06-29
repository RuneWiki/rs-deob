import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class129 extends class499 {

    @OriginalMember(owner = "client!qea", name = "F", descriptor = "Liia;")
    public static class89 field1674 = new class89();

    @OriginalMember(owner = "client!qea", name = "D", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!qea", name = "G", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!qea", name = "H", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lni;B)V", line = 5)
    public static final void method816(class522 arg0, byte arg1) {
        ++field1676;
        class306.field4164 = 0;
        class363.field4806 = 0;
        class146.field1891 = new class29();
        class150.field1910 = new class254[1024];
        class147.field1892 = new class550[class182.field2229[class658.field9179] + 1];
        class447.field6242 = 0;
        class743.field10335 = 0;
        class583.method3258((byte) 40, arg0);
        if (arg1 > -58) {
            field1674 = null;
        }
        class734.method4108(-13258, arg0);
    }

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "(I)V", line = 24)
    public static void method817(int arg0) {
        if (arg0 != 0) {
            field1674 = null;
        }
        field1674 = null;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)V", line = 35)
    public static final void method818(int arg0, int arg1, int arg2) {
        class624 var3 = class77.field947[arg0][arg1][arg2];
        if (var3 != null) {
            class440.method2487(var3.field8728);
            class440.method2487(var3.field8737);
            if (var3.field8728 != null) {
                var3.field8728 = null;
            }
            if (var3.field8737 != null) {
                var3.field8737 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(III)Z", line = 51)
    public static final boolean method819(int arg0, int arg1, int arg2) {
        ++field1675;
        int var3 = -114 / ((arg2 - -11) / 53);
        return ~(arg0 & 393216) != -1 | class489.method2751(arg0, 16, arg1) || class90.method644(55, arg0, arg1) || class224.method1272(arg1, (byte) -112, arg0);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIIB)V", line = 66)
    public final void method820(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field1673;
        if (arg4 >= 21) {
            int var6 = super.field6799.method666();
            int var7 = ((class207) super.field5796).field2488 * class194.method1080(true) / 10 % var6;
            super.field6799.method3860(arg3 + var7 + -var6, arg2, arg1 + var6 + -var7, arg0);
        }
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lni;Lni;Lhi;)V", line = 81)
    public class129(class522 arg0, class522 arg1, class207 arg2) {
        super(arg0, arg1, arg2);
    }
}
