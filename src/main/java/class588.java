import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class588 extends class130 {

    @OriginalMember(owner = "client!jca", name = "s", descriptor = "I")
    private int field8723;

    @OriginalMember(owner = "client!jca", name = "r", descriptor = "I")
    private int field8722;

    @OriginalMember(owner = "client!jca", name = "t", descriptor = "I")
    private int field8724;

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "I")
    private int field8718;

    @OriginalMember(owner = "client!jca", name = "A", descriptor = "Lte;")
    private class527 field8731;

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "I")
    private int field8716;

    @OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
    private int field8729;

    @OriginalMember(owner = "client!jca", name = "q", descriptor = "[B")
    public static byte[] field8721 = new byte[520];

    @OriginalMember(owner = "client!jca", name = "u", descriptor = "[F")
    public static float[] field8725 = new float[4];

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "Llu;")
    public static class610 field8717 = new class610(6, 7);

    @OriginalMember(owner = "client!jca", name = "w", descriptor = "I")
    public static int field8727 = 0;

    @OriginalMember(owner = "client!jca", name = "x", descriptor = "Lada;")
    public static class144 field8728 = new class144(74, -1);

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
    public static int field8730 = 0;

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!jca", name = "v", descriptor = "Lci;")
    private class384 field8726;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIB)I", line = 3)
    public static final int method3495(int arg0, int arg1, byte arg2) {
        field8720++;
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        int var4 = -125 % ((-arg2 - 34) / 32);
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Lci;", line = 33)
    public final class384 method909(int arg0) {
        if (arg0 != 18511) {
            this.field8722 = -107;
        }
        field8719++;
        if (this.field8726 == null) {
            class310.field4280[0] = this.field8718;
            class310.field4280[2] = this.field8722;
            class17 var2 = this.field8731.field3092;
            class310.field4280[4] = this.field8723;
            class310.field4280[5] = this.field8729;
            class310.field4280[3] = this.field8724;
            class310.field4280[1] = this.field8716;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method109(class310.field4280[var5], arg0 - 16831)) {
                    return null;
                }
                class471 var7 = var2.method110(class310.field4280[var5], (byte) 113);
                int var8 = var7.field6651 ? 64 : 128;
                if (var7.field6647 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class197.field2902[var6] = var2.method113(var4, false, -4074, var4, 1.0F, class310.field4280[var6]);
            }
            this.field8726 = new class384(this.field8731, 6407, var4, var3 != 0, class197.field2902);
        }
        return this.field8726;
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V", line = 115)
    public static void method3496(byte arg0) {
        field8717 = null;
        int var1 = -6 / ((arg0 + 5) / 41);
        field8728 = null;
        field8725 = null;
        field8721 = null;
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lte;IIIIII)V", line = 127)
    public class588(class527 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8723 = arg5;
        this.field8722 = arg3;
        this.field8724 = arg4;
        this.field8718 = arg1;
        this.field8731 = arg0;
        this.field8716 = arg2;
        this.field8729 = arg6;
    }
}
