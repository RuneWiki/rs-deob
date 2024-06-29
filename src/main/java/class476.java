import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class476 extends class307 {

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "[I")
    private int[] field6625 = new int[this.field4459];

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
    public static int field6633 = 0;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "Z")
    public static boolean field6632 = true;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "Leh;")
    public static class246 field6631 = new class246(103, 14);

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    private int field6629;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
    private int field6630;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "[B")
    private byte[] field6623;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBI)V", line = 3)
    public void method2219(int arg0, byte arg1, int arg2) {
        this.field6623[this.field6629++] = (byte) (127 + (class239.method1507(arg1, 255) >> 1));
        ++field6626;
        if (arg2 != 3395) {
            method2743(47, (byte) -62, 95);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(IBI)Z", line = 23)
    public static final boolean method2743(int arg0, byte arg1, int arg2) {
        if (arg1 != 90) {
            return false;
        } else {
            ++field6628;
            return (33 & arg2) != 0;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V", line = 34)
    public final void method625(byte arg0) {
        this.field6629 = 0;
        if (arg0 > 56) {
            ++field6627;
            this.field6630 = 0;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V", line = 54)
    public final void method629(int arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            this.field6630 = -123;
        }
        ++field6624;
        this.field6630 += this.field6625[arg2] * arg0 >> 12;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(IIIIIF)V", line = 65)
    public class476(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field4459 > var7; ++var7) {
            this.field6625[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(Z)V", line = 82)
    public static void method2744(boolean arg0) {
        field6631 = null;
        if (!arg0) {
            field6632 = false;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 93)
    public final void method626(byte arg0) {
        if (arg0 != 90) {
            field6632 = false;
        }
        this.field6630 = Math.abs(this.field6630);
        ++field6622;
        if (~this.field6630 <= -4097) {
            this.field6630 = 4095;
        }
        this.method2219(this.field6629++, (byte) (this.field6630 >> 4), 3395);
        this.field6630 = 0;
    }
}
