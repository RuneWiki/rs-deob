import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public abstract class class389 extends class455 {

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "S")
    public short field5827;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "B")
    public byte field5828;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public int field5831;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public int field5833;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "S")
    public short field5830;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "B")
    public byte field5826;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "S")
    public short field5836;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "Z")
    public boolean field5835;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "S")
    public short field5829;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "Lhn;")
    public static class509 field5838 = new class509(2, -2);

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "Loe;")
    public static class137 field5839 = new class137();

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "Lhn;")
    public static class509 field5840 = new class509(26, 8);

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public int field5825;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
    public static final void method2429(byte arg0) {
        if (arg0 != 113) {
            method2429((byte) 98);
        }
        field5834++;
        class295.field4504 = new class137();
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)V")
    public void method958(byte arg0) {
        int var2 = 97 / ((arg0 + 15) / 44);
        field5832++;
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)I")
    public abstract int method24(int arg0);

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)V")
    public static void method2430(byte arg0) {
        int var1 = 33 / ((-arg0 - 17) / 55);
        field5838 = null;
        field5839 = null;
        field5840 = null;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field5827 = (short) arg5;
        this.field5828 = arg9;
        this.field5831 = arg2;
        this.field5833 = arg3;
        this.field5830 = (short) arg6;
        this.field5826 = (byte) arg0;
        this.field5836 = (short) arg4;
        this.field5835 = arg8;
        this.field5837 = arg1;
        this.field5829 = (short) arg7;
    }
}
