import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class486 extends class176 {

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "S")
    public short field6828;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Lej;")
    public static class104 field6826 = new class104("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method2826(int arg0) {
        field6826 = null;
        int var1 = -51 % ((arg0 - 76) / 46);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)I")
    public static final int method2827(int arg0) {
        field6825++;
        if (arg0 < 35) {
            method2828();
        }
        if (class87.field1383 == null) {
            return class571.field7879 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
    public static final void method2828() {
        class610.method3572(1, class395.field5610);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class486() {
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(S)V")
    public class486(short arg0) {
        this.field6828 = arg0;
    }
}
