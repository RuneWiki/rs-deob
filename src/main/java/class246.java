import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class246 extends class604 {

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "Z")
    public static boolean field3581 = true;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field3577 = 1400;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field3580 = 0;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "Lrg;")
    public static class645 field3582;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Lge;")
    public static class711 field3583;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "[B")
    private byte[] field3585;

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class246() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I")
    public static final int method1638(int arg0) {
        if (arg0 == -22952) {
            field3579++;
            return class78.field1084;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public static void method1639(int arg0) {
        field3583 = null;
        field3582 = null;
        if (arg0 != 1329692673) {
            method1639(-101);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1640(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 100) {
            field3583 = null;
        }
        this.field3585 = new byte[arg0 * 2 * arg1 * arg3];
        field3584++;
        this.method3318(arg3, arg1, arg0, (byte) -22);
        return this.field3585;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(BII)V")
    public final void method1641(byte arg0, int arg1, int arg2) {
        field3576++;
        byte var4 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field3585[var10001] = var4;
        this.field3585[var6] = var4;
        if (arg2 != 9170) {
            this.method1640(40, 3, 88, 51);
        }
    }
}
