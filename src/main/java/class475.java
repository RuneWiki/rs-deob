import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class475 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "B")
    public byte field6567;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lob;")
    public class738 field6571;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "S")
    public short field6568;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "B")
    public byte field6569;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Llga;")
    public static class712 field6570 = new class712(18, 3);

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "[Lck;")
    public static class641[] field6572 = new class641[8];

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIIIIII)V", line = 10)
    public static final void method2670(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6565++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class232.field3001 - class111.field1473) * var8 / 100 + class111.field1473;
        class661.field9249 = class661.field9251 * var9 >> 8;
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg6 & 0x3FFF;
        int var12 = 16384 - arg1 & 0x3FFF;
        int var13 = 0;
        if (arg0) {
            field6566 = -79;
        }
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class15.field113[var11] * -var10 >> 14;
            var15 = class15.field115[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class15.field113[var12] * var15 >> 14;
            var15 = class15.field115[var12] * var15 >> 14;
        }
        class684.field9518 = arg3 - var15;
        class659.field9198 = 0;
        class74.field801 = arg6;
        class294.field3956 = arg5 - var13;
        class710.field9907 = arg1;
        class262.field3429 = arg7 - var14;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 63)
    public static void method2671(byte arg0) {
        if (arg0 != 23) {
            field6566 = -82;
        }
        field6572 = null;
        field6570 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lob;III)V", line = 75)
    public class475(class738 arg0, int arg1, int arg2, int arg3) {
        this.field6567 = (byte) arg3;
        this.field6571 = arg0;
        this.field6568 = (short) arg1;
        this.field6569 = (byte) arg2;
    }
}
