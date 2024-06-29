import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class115 extends class14 {

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field1635 = 0;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
    public static final void method789(int arg0) {
        for (int var1 = arg0; ~var1 > ~class259.field3425.length; ++var1) {
            for (int var2 = 0; var2 < class259.field3425[var1].length; ++var2) {
                class259.field3425[var1][var2] = class200.field2779;
            }
        }
        ++field1631;
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
    public static final void method790(int arg0) {
        ++field1633;
        class99.method708();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class120.field1754[var1].method1155(true);
        }
        if (arg0 != -5) {
            field1635 = -70;
        }
        class54.method398((byte) 21);
        class129.method924(-10808);
        System.gc();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field1630;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            class254.method1530(var3, 0, field1637, this.field1634);
        }
        if (arg1 >= -2) {
            method791(45, 3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V")
    public static final void method791(int arg0, int arg1) {
        class391.field5306 = arg1;
        ++field1632;
        class457.field6297.method1458((byte) -101);
        if (arg0 != -16726) {
            field1635 = -53;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class115() {
        this(4096);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
    public class115(int arg0) {
        super(0, true);
        this.field1634 = 4096;
        this.field1634 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        ++field1636;
        if (~arg0 == -1) {
            this.field1634 = (arg2.method2238(255) << 12) / 255;
        }
        int var5 = 67 % ((-51 - arg1) / 37);
    }
}
