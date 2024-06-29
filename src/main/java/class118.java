import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class118 extends class163 {

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "Ljava/lang/Object;")
    private Object field1591;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "Ljn;")
    public static class409 field1588 = new class409("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "[[[I")
    public static int[][][] field1592 = new int[2][][];

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field1594 = 0;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 3)
    public class118(Object arg0, int arg1) {
        super(arg1);
        this.field1591 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(Z)Z", line = 14)
    public static final boolean method807(boolean arg0) {
        field1590++;
        if (!arg0) {
            field1594 = -24;
        }
        return class373.field5452 != 0 || class42.field564 >= 2;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 25)
    public final Object method808(byte arg0) {
        field1589++;
        if (arg0 <= 97) {
            field1592 = null;
        }
        return this.field1591;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)Z", line = 40)
    public final boolean method809(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field1593++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V", line = 53)
    public static void method810(int arg0) {
        field1588 = null;
        int var1 = -92 % ((-arg0 - 35) / 53);
        field1592 = null;
    }
}
