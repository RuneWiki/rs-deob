import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class714 {

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "I")
    public int field10046;

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
    public int field10043;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    public int field10039;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "I")
    public int field10042;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "I")
    public static int field10045 = 0;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "I")
    public static int field10040;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "I")
    public static int field10041;

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
    public static int field10047;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V", line = 3)
    public static final void method3989(String arg0, boolean arg1, String arg2, int arg3) {
        field10041++;
        class411.field5619 = arg0;
        if (arg3 <= 29) {
            return;
        }
        class14.field124 = arg1;
        class80.field835 = arg2;
        if (!class14.field124 && class411.field5619.equals("") || class80.field835.equals("")) {
            class40.method240(3, true);
            return;
        }
        class236.field2809 = false;
        if (class352.field4528 != 1) {
            class434.field6339 = -1;
            class729.field10198 = 0;
        }
        class40.method240(-3, true);
        class308.field3829 = 0;
        class461.field6567 = 1;
        class453.field6517 = 0;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V", line = 41)
    public static final void method3990(boolean arg0) {
        if (arg0) {
            field10045 = 72;
        }
        field10038++;
        class306.field3815 = 0;
        class313.field3888 = new class590[50];
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IBILha;)V", line = 56)
    public static final void method3991(int arg0, byte arg1, int arg2, class58 arg3) {
        class97.field1020 = new class71[arg0][arg2];
        class82.field858 = arg3;
        if (arg1 != -86) {
            return;
        }
        field10044++;
        if (class591.field8332 != null) {
            class231.field2699 = class78.method550(class591.field8332[2], class591.field8332[4], class591.field8332[1], class591.field8332[5], 30154, class591.field8332[3], class591.field8332[0]);
        }
        class13.field104 = new class71();
        class279.method1679(67);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(II)Ljga;", line = 74)
    public final class714 method3992(int arg0, int arg1) {
        if (arg1 == 2) {
            field10048++;
            return new class714(this.field10043, arg0, this.field10039, this.field10042);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(FB)F", line = 88)
    public static final float method3993(float arg0, byte arg1) {
        field10040++;
        int var2 = -61 / ((arg1 + 28) / 43);
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(IIII)V", line = 98)
    public class714(int arg0, int arg1, int arg2, int arg3) {
        this.field10046 = arg1;
        this.field10043 = arg0;
        this.field10039 = arg2;
        this.field10042 = arg3;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIIZ)V", line = 113)
    public static final void method3994(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field10047++;
        if (class654.field9334.field9850.method1512(-121) == 0) {
            class40.method245(8, false);
        } else {
            class340.field4399 = class654.field9334.field9850.method1512(-121);
            class627.method3597(true, 0, -31618);
        }
        if (arg1 < 42) {
            field10045 = 48;
        }
        class506.field7219 = arg3;
        class136.field1550 = arg4;
        class635.field9136 = arg0;
        class656.method3736(arg2);
    }
}
