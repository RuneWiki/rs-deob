import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class636 {

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "J")
    private long field8790;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    private int field8794;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "[I")
    public static int[] field8791 = new int[1000];

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)V")
    public static final void method3519(byte arg0, int arg1) {
        class431.field5791 = arg1;
        field8789++;
        class315.field4217.method2168((byte) -77);
        int var2 = 56 % ((27 - arg0) / 55);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILko;)V")
    private final void method3520(int arg0, class255 arg1) {
        field8793++;
        this.field8790 |= (arg1.field3342 << this.field8794++ * class255.field3349);
        if (arg0 != -9393) {
            this.field8794 = 77;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Lko;")
    public final class255 method3521(int arg0, int arg1) {
        if (arg1 < 32) {
            method3519((byte) -57, 121);
        }
        field8788++;
        return class255.method1542(true, this.method3524(arg0, false));
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lko;)V")
    public class636(class255 arg0) {
        this.field8790 = arg0.field3342;
        this.field8794 = 1;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)I")
    public final int method3522(int arg0) {
        field8795++;
        if (arg0 <= 85) {
            field8791 = null;
        }
        return this.field8794;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public static void method3523(int arg0) {
        field8791 = null;
        if (arg0 != 1) {
            field8791 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "([Lko;)V")
    public class636(class255[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method3520(-9393, arg0[var2]);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)I")
    private final int method3524(int arg0, boolean arg1) {
        field8792++;
        if (arg1) {
            this.method3521(-43, 38);
        }
        return (int) (this.field8790 >> class255.field3349 * arg0) & 0xF;
    }
}
