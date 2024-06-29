import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class61 extends class601 {

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "I")
    public static int field627 = -1;

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!mia", name = "j", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!mia", name = "k", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(ILgn;)V", line = 5)
    public class61(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IZ)V", line = 8)
    public final void method40(int arg0, boolean arg1) {
        if (!arg1) {
            super.field8565 = arg0;
            ++field628;
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(B)I", line = 19)
    public final int method39(byte arg0) {
        ++field625;
        return arg0 != -17 ? 76 : 1;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)Z", line = 30)
    public final boolean method465(int arg0) {
        if (arg0 != -9242) {
            method467(-75);
        }
        ++field629;
        if (super.field8563.method3926(47) == class101.field1048) {
            return !super.field8563.method3930(arg0 ^ -9227);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(II)I", line = 50)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            this.method35((byte) 107);
        }
        ++field623;
        if (super.field8563.method3926(98) == class101.field1048) {
            if (super.field8563.method3930(arg1 ^ 15689)) {
                return 3;
            } else {
                return ~arg0 != -1 && ~super.field8563.field9845.method3265(-127) != -2 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)I", line = 73)
    public final int method466(int arg0) {
        ++field630;
        int var2 = -96 % ((-59 - arg0) / 61);
        return super.field8565;
    }

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "(I)I", line = 85)
    public static final int method467(int arg0) {
        ++field626;
        class58 var1 = class275.field3370;
        boolean var2 = false;
        if (~class654.field9334.field9850.method1512(69) != -1) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class93.method632((class150) null, 0, (class404) null, 0, 0, var3);
        }
        long var4 = class652.method3700(-1);
        if (arg0 != -65536) {
            return -90;
        } else {
            for (int var6 = 0; var6 < 10000; ++var6) {
                var1.method329(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
            }
            int var7 = (int) (-var4 + class652.method3700(-1));
            var1.method410(-16777216, 0, 100, -77, 0, 100);
            if (var2) {
                var1.method336(-80);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lgn;)V", line = 136)
    public class61(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)V", line = 139)
    public final void method35(byte arg0) {
        if (arg0 >= -37) {
            this.method34(98, -59);
        }
        ++field624;
        if (super.field8563.method3926(74) != class101.field1048) {
            super.field8565 = 1;
        } else if (super.field8563.method3930(19)) {
            super.field8565 = 0;
        }
        if (~super.field8565 != -1 && super.field8565 != 1) {
            super.field8565 = this.method39((byte) -17);
        }
    }
}
