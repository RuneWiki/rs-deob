import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class425 implements class338 {

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Lkq;")
    private class541 field5650;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "F")
    public static float field5652 = 0.25F;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lnq;")
    public static class420 field5645;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
    public static int[] field5646;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "[[S")
    public static short[][] field5651;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)Z")
    public static final boolean method2294(int arg0, int arg1, int arg2) {
        field5647++;
        if (arg0 != -1) {
            field5652 = -0.43490547F;
        }
        return (arg1 & 0x40000) != 0 | class577.method3262(false, arg2, arg1) || class407.method2209(arg2, 45056, arg1);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        if (arg0 != -18257) {
            field5651 = null;
        }
        field5649++;
        return true;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public static void method2295(int arg0) {
        if (arg0 >= -15) {
            method2295(69);
        }
        field5651 = null;
        field5646 = null;
        field5645 = null;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)I")
    public static final int method2296(int arg0, int arg1, int arg2) {
        field5644++;
        int var3 = arg2 >>> 24;
        int var4 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        if (arg0 == -10227) {
            int var5 = 255 - var3;
            return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        } else {
            return 98;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lkq;)V")
    public class425(class541 arg0) {
        this.field5650 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)V")
    public final void method725(boolean arg0, int arg1) {
        if (arg0) {
            class195 var3 = class211.field2561;
            int var4 = this.field5650.field7769.method1586(class137.field1567, 12, (byte) -30) + this.field5650.field7767;
            int var5 = this.field5650.field7764.method1281((byte) -109, class466.field6460, 0) + this.field5650.field7766;
            if (class427.field5671 == this.field5650.field7764) {
                var3.method1124(arg1 ^ 0xFFFFF618, this.field5650.field7761, this.field5650.field7762, this.field5650.field7763, var5, var4);
            } else if (class224.field2836 == this.field5650.field7764) {
                var3.method1128(215, var5, var4, this.field5650.field7761, this.field5650.field7762, this.field5650.field7763);
            } else if (class260.field3304 == this.field5650.field7764) {
                var3.method1129(var5, this.field5650.field7763, this.field5650.field7761, (byte) 127, this.field5650.field7762, var4);
            }
        }
        field5654++;
        if (arg1 != -2536) {
            field5652 = 0.4927161F;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public final void method149(int arg0) {
        field5653++;
        if (arg0 != -29265) {
            field5645 = null;
        }
    }
}
