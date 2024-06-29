import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class558 {

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "J")
    private long field7959;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    private int field7958;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "F")
    public static float field7954;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)I", line = 4)
    private final int method3233(byte arg0, int arg1) {
        field7953++;
        return arg0 > -29 ? 122 : (int) (this.field7959 >> class596.field8712 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljca;Z)V", line = 18)
    private final void method3234(class596 arg0, boolean arg1) {
        if (!arg1) {
            this.field7958 = -122;
        }
        field7952++;
        this.field7959 |= (arg0.field8703 << class596.field8712 * this.field7958++);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)Ljca;", line = 30)
    public final class596 method3235(int arg0, byte arg1) {
        if (arg1 == -26) {
            field7960++;
            return class596.method3474((byte) -124)[this.method3233((byte) -71, arg0)];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[B)[B", line = 43)
    public static final byte[] method3236(int arg0, byte[] arg1) {
        field7955++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class210.method1330(arg1, 0, var3, arg0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)I", line = 58)
    public final int method3237(int arg0) {
        if (arg0 == 0) {
            field7956++;
            return this.field7958;
        } else {
            return -33;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V", line = 71)
    public static final void method3238(int arg0, int arg1) {
        if (arg1 != 16880) {
            method3238(77, 30);
        }
        class332.field4779 = 0;
        class195.field2647 = null;
        field7957++;
        class509.field7411 = -1;
        class190.field2345 = arg0;
        class438.field6508 = false;
        class22.field221 = -1;
        class568.field8160 = 1;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljca;)V", line = 90)
    public class558(class596 arg0) {
        this.field7959 = arg0.field8703;
        this.field7958 = 1;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "([Ljca;)V", line = 98)
    public class558(class596[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method3234(arg0[var2], true);
        }
    }
}
