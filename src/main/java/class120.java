import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class120 {

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public int field1769 = 2048;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public int field1772 = 0;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public int field1770 = 2048;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public int field1771 = 0;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "Lri;")
    public static class74 field1774 = new class74(7, 5);

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "Z")
    public static boolean field1775 = false;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1776 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lsi;I)V", line = 14)
    public final void method836(class391 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2348(-2);
            if (var3 == 0) {
                if (arg1 != 0) {
                    return;
                }
                field1773++;
                return;
            }
            this.method838(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 40)
    public static void method837(int arg0) {
        if (arg0 != -22123) {
            method837(-77);
        }
        field1776 = null;
        field1774 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IILsi;)V", line = 56)
    private final void method838(int arg0, int arg1, class391 arg2) {
        if (arg0 == 1) {
            this.field1772 = arg2.method2348(-2);
        } else if (arg0 == 2) {
            this.field1770 = arg2.method2353((byte) 114);
        } else if (arg0 == 3) {
            this.field1769 = arg2.method2353((byte) 121);
        } else if (arg0 == 4) {
            this.field1771 = arg2.method2311((byte) 123);
        }
        if (arg1 != 0) {
            this.field1772 = -97;
        }
        field1768++;
    }
}
