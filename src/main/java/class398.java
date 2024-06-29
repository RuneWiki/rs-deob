import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class398 {

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "B")
    private byte field5962;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field5954;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field5951;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field5958;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field5963;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field5956;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field5955 = 0;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5952 = " from your friend list first.";

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 14)
    public static void method2593(byte arg0) {
        field5952 = null;
        int var1 = -42 / ((arg0 + 84) / 42);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)I", line = 28)
    public final int method2594(boolean arg0) {
        field5964++;
        return arg0 ? this.field5962 & 0x7 : -35;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I", line = 44)
    public final int method2595(byte arg0) {
        field5953++;
        if (arg0 > -108) {
            return 49;
        } else if ((this.field5962 & 0x8) == 8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZB)V", line = 59)
    public static final void method2596(boolean arg0, byte arg1) {
        if (arg0) {
            if (class404.field6020 != -1) {
                class139.method934(class404.field6020, 0);
            }
            for (class158 var2 = (class158) class269.field3933.method953(0); var2 != null; var2 = (class158) class269.field3933.method951(0)) {
                if (!var2.method2571(true)) {
                    var2 = (class158) class269.field3933.method953(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class318.method1975(true, 25697, var2, false);
            }
            class404.field6020 = -1;
            class269.field3933 = new class143(8);
            class236.method1442(0);
            class404.field6020 = class41.field650;
            class110.method768(-70, false);
            class176.method1075((byte) -125);
            class365.method2391(class404.field6020);
        }
        field5957++;
        class264.method1658(1);
        class19.field314 = -1;
        class285.method1808(class45.field674, 1);
        class100.field1350 = new class194();
        class100.field1350.field303[0] = 52;
        class100.field1350.field5284 = 6656;
        class100.field1350.field5298 = 6656;
        class7.field71 = 0;
        class237.field3326 = 0;
        class100.field1350.field306[0] = 52;
        if (class5.field48 == 2) {
            class237.field3326 = class95.field1306 << 7;
            class7.field71 = class148.field1956 << 7;
        } else {
            class171.method1055((byte) 102);
        }
        class144.method964(-125);
        if (class237.field3326 == 0 || class7.field71 == 0) {
            class199.method1251(10, (byte) -123);
        } else {
            class297.method1889(false);
            class199.method1251(28, (byte) -121);
        }
        int var3 = -46 % ((91 - arg1) / 32);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 129)
    public class398() {
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lil;)V", line = 131)
    public class398(class265 arg0) {
        this.field5962 = arg0.method1708((byte) 127);
        this.field5954 = arg0.method1685(8104);
        this.field5951 = arg0.method1666(-2);
        this.field5958 = arg0.method1666(-2);
        this.field5963 = arg0.method1666(-2);
        this.field5956 = arg0.method1666(-2);
    }
}
