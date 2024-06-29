import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class595 implements class695 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public int field8272;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8273 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)V")
    public static final void method3298(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8274++;
        float var5 = (float) class148.field2213 / (float) class148.field2209;
        int var6 = arg0;
        int var7 = arg4;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg3 - (arg0 - var6) / arg2;
        int var9 = arg1 - (arg4 - var7) / 2;
        class675.field9543 = -1;
        class306.field4504 = class148.field2209 * var8 / var6;
        class480.field6695 = class148.field2213 - (class148.field2213 * var9 / var7);
        class623.field8692 = -1;
        class299.method1863((byte) -102);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([BIBI)I")
    public static final int method3299(byte[] arg0, int arg1, byte arg2, int arg3) {
        field8271++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class575.field7730[(var4 ^ arg0[var5]) & 0xFF];
        }
        if (arg2 != 109) {
            field8273 = -104;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lhs;")
    public final class295 method52(int arg0) {
        field8270++;
        if (arg0 != -14151) {
            this.field8272 = -26;
        }
        return class466.field6556;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V")
    public class595(int arg0) {
        this.field8272 = arg0;
    }
}
