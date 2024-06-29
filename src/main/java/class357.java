import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class357 extends class45 {

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "F")
    public static float field5652 = 0.0F;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public int field5650;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public int field5651;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public int field5653;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public int field5654;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public int field5656;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public int field5657;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public int field5660;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public int field5661;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public int field5662;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public int field5663;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public int field5664;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public int field5667;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public int field5669;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public int field5670;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public int field5671;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public int field5672;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public int field5673;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Lh;")
    public class110 field5655;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Luk;")
    public class139 field5649;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Lbj;")
    public class211 field5659;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Lek;")
    public class239 field5658;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 13)
    public final void method2518(int arg0) {
        this.field5655 = null;
        if (arg0 != 0) {
            this.field5658 = (class239) null;
        }
        this.field5659 = null;
        this.field5658 = null;
        field5668++;
        this.field5649 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B", line = 41)
    public static final byte[] method2519(Object arg0, int arg1, boolean arg2) {
        field5666++;
        if (arg1 != 11361) {
            return (byte[]) null;
        } else if (arg0 == null) {
            return null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg2 ? class177.method1396(false, var4) : var4;
        } else if (arg0 instanceof class237) {
            class237 var3 = (class237) arg0;
            return var3.method1136(-12678);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
