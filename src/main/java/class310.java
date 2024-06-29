import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class310 extends class83 {

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "Lak;")
    public static class222 field4517 = new class222(1, 2, 2, 0);

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "Lhe;")
    public static class239 field4515;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "Lek;")
    public class334 field4518;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "[B")
    public byte[] field4514;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "[[[J")
    public static long[][][] field4512;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(B)V")
    public static void method1859(byte arg0) {
        field4515 = null;
        int var1 = -66 / ((-45 - arg0) / 50);
        field4512 = null;
        field4517 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)[B")
    public final byte[] method524(int arg0) {
        if (arg0 != -6554) {
            return null;
        } else {
            ++field4520;
            if (super.field1128) {
                throw new RuntimeException();
            } else {
                return this.field4514;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)I")
    public final int method526(byte arg0) {
        ++field4513;
        if (super.field1128) {
            return 0;
        } else {
            return arg0 != -92 ? 108 : 100;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIB)I")
    public static final int method1860(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = -65 / ((-39 - arg3) / 56);
        ++field4516;
        if (~arg1 < -244) {
            arg0 >>= 4;
        } else if (arg1 <= 217) {
            if (arg1 > 192) {
                arg0 >>= 2;
            } else if (arg1 > 179) {
                arg0 >>= 1;
            }
        } else {
            arg0 >>= 3;
        }
        return ((arg2 & 255) >> 2 << 10) + (arg0 >> 5 << 7) - -(arg1 >> 1);
    }
}
