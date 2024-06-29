import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class140 extends class317 implements class659 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
    public static boolean field1599 = false;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1606 = 0;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)I")
    public final int method778(int arg0) {
        if (arg0 != -13931) {
            this.method779(33);
        }
        ++field1598;
        return this.field1601;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lap;I[BI)V")
    public class140(class435 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1601 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I")
    public final int method779(int arg0) {
        if (arg0 <= 21) {
            return -3;
        } else {
            ++field1605;
            return 0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lap;ILjaclib/memory/Buffer;)V")
    public class140(class435 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field1601 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method780(byte arg0, String arg1) {
        ++field1603;
        if (class37.field414 != null) {
            ++class201.field2450;
            class480.method2802(class382.field5126, 16751);
            class334.field4314.method2525(class265.method1504(arg1, (byte) 88), arg0 ^ 81915);
            if (arg0 != -68) {
                field1606 = 43;
            }
            class334.field4314.method2573(arg1, 16746);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)J")
    public final long method781(boolean arg0) {
        if (arg0) {
            this.method778(9);
        }
        ++field1602;
        return super.field4116.getAddress();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI[BI)V")
    public final void method782(byte arg0, int arg1, byte[] arg2, int arg3) {
        ++field1604;
        if (arg0 < 87) {
            this.method781(true);
        }
        this.method1791(arg2, arg1);
        this.field1601 = arg3;
    }
}
