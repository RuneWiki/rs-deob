import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class751 extends class134 {

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public int field10498;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public int field10507;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field10499;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    public static int field10500;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public static int field10501;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public static int field10502;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field10503;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    public static int field10505;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public static int field10506;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "Lvn;")
    public static class311 field10504;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Loh;B)V", line = 3)
    public static final void method4181(class404 arg0, byte arg1) {
        if (arg1 <= 22) {
            field10504 = null;
        }
        class217.field2526 = arg0;
        field10508++;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Z", line = 20)
    public final boolean method4182(byte arg0) {
        if (arg0 != -42) {
            this.field10507 = 109;
        }
        field10500++;
        return (this.field10498 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I", line = 33)
    public final int method4183(int arg0) {
        if (arg0 != 482687474) {
            this.field10498 = 75;
        }
        field10505++;
        return this.field10498 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)Z", line = 44)
    public final boolean method4184(int arg0) {
        if (arg0 != 3617364) {
            this.method4184(123);
        }
        field10503++;
        return (this.field10498 & 0x373254) >> 21 != 0;
    }

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)I", line = 56)
    public static final int method4185(int arg0) {
        if (arg0 == 3617364) {
            field10502++;
            return class726.field10151;
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)I", line = 68)
    public final int method4186(boolean arg0) {
        field10506++;
        return arg0 ? 109 : class210.method1248(this.field10498, -127);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)Z", line = 79)
    public final boolean method4187(int arg0, int arg1) {
        int var3 = 72 % ((arg1 + 47) / 36);
        field10501++;
        return (this.field10498 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(II)V", line = 90)
    public class751(int arg0, int arg1) {
        this.field10498 = arg0;
        this.field10507 = arg1;
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V", line = 100)
    public static void method4188(int arg0) {
        int var1 = -67 / ((arg0 - 8) / 60);
        field10504 = null;
    }

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "(I)Z", line = 110)
    public final boolean method4189(int arg0) {
        field10499++;
        if (arg0 != 23370) {
            this.field10498 = 30;
        }
        return (this.field10498 >> 22 & 0x1) != 0;
    }
}
