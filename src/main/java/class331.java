import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class331 extends class362 {

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)Z", line = 3)
    public final boolean method2099(int arg0, boolean arg1) {
        field4621++;
        if (arg1) {
            field4622 = 29;
        }
        return (this.field4628 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z", line = 19)
    public final boolean method2100(int arg0) {
        if (arg0 != 17356) {
            this.method2103(8);
        }
        field4625++;
        return (this.field4628 & 0x3DF376) >> 21 != 0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)Z", line = 31)
    public final boolean method2101(int arg0) {
        field4624++;
        if (arg0 != 1) {
            field4622 = -24;
        }
        return ((this.field4628 & 0x433BFD) >> 22) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I", line = 42)
    public final int method2102(byte arg0) {
        field4629++;
        if (arg0 < 43) {
            this.method2099(-16, false);
        }
        return (this.field4628 & 0x1F77EB) >> 18;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Z", line = 61)
    public final boolean method2103(int arg0) {
        field4626++;
        if (arg0 == 0) {
            return (this.field4628 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I", line = 72)
    public static final int method2104(byte arg0) {
        if (arg0 >= -90) {
            field4631 = -7;
        }
        field4627++;
        return class215.field3119 == 1 ? class218.field3157 : class368.field5247;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I", line = 87)
    public final int method2105(int arg0) {
        field4630++;
        if (arg0 < 10) {
            this.field4623 = -51;
        }
        return class719.method4000(this.field4628, true);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(II)V", line = 97)
    public class331(int arg0, int arg1) {
        this.field4623 = arg1;
        this.field4628 = arg0;
    }
}
