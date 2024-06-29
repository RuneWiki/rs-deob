import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class614 {

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Z")
    public boolean field8518;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "S")
    public short field8510;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "B")
    public byte field8519;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "S")
    public short field8513;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public int field8512;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "B")
    public byte field8517;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "S")
    public short field8509;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
    public static int[] field8511 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "F")
    public static float field8508;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
    public static int[] field8514;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)Z", line = 10)
    public static final boolean method3397(int arg0, byte arg1, int arg2) {
        field8516++;
        if (arg1 != 107) {
            field8514 = null;
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 24)
    public static void method3398(int arg0) {
        field8514 = null;
        field8511 = null;
        if (arg0 != -19870) {
            method3397(94, (byte) 44, -43);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)Lab;", line = 43)
    public final class614 method3399(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 6835) {
            field8508 = -0.57117885F;
        }
        field8515++;
        return new class614(arg1, arg4, arg0, arg3, this.field8513, this.field8510, this.field8509, this.field8519, this.field8517, this.field8518);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 60)
    public static final void method3400(byte arg0) {
        class98.field1332++;
        field8506++;
        class1.method5(1, class244.field3471);
        if (arg0 <= 33) {
            method3398(109);
        }
        class288.field4014.method746((byte) -106, class402.method2292(true));
        class288.field4014.method731(-2045573048, class547.field7412);
        class288.field4014.method731(-2045573048, class124.field1711);
        class288.field4014.method746((byte) -105, class274.field3872.field899);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 75)
    public class614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field8518 = arg9;
        this.field8510 = (short) arg5;
        this.field8519 = (byte) arg7;
        this.field8513 = (short) arg4;
        this.field8512 = arg0;
        this.field8517 = (byte) arg8;
        this.field8509 = (short) arg6;
    }
}
