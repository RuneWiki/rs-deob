import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public abstract class class134 {

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "Lkda;")
    public class391 field1712;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)I", line = 14)
    public static final int method837(int arg0) {
        field1709++;
        if ((double) class642.field8940 == 3.0D) {
            return 37;
        } else if ((double) class642.field8940 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 1024) {
                method839(58, -19, -15);
            }
            if ((double) class642.field8940 == 6.0D) {
                return 75;
            } else if ((double) class642.field8940 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(II)V", line = 39)
    public final void method838(int arg0, int arg1) {
        if (this.method57(arg0, 29053) != 3) {
            this.method55(arg1 ^ 0xFFFFD9F7, arg0);
        }
        field1711++;
        if (arg1 != 9848) {
            this.field1708 = 1;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)Z", line = 54)
    public static final boolean method839(int arg0, int arg1, int arg2) {
        field1710++;
        if (arg2 >= -33) {
            return false;
        } else {
            return (arg1 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lkda;)V", line = 68)
    public class134(class391 arg0) {
        this.field1712 = arg0;
        this.field1708 = this.method58(0);
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(ILkda;)V", line = 76)
    public class134(int arg0, class391 arg1) {
        this.field1712 = arg1;
        this.field1708 = arg0;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)V")
    public abstract void method55(int arg0, int arg1);

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)V")
    public abstract void method60(byte arg0);

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)I")
    public abstract int method58(int arg0);

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(II)I")
    public abstract int method57(int arg0, int arg1);
}
