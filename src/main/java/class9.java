import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[S")
    public static short[] field84;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method34(int arg0) {
        if (arg0 == 1) {
            field84 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)I")
    public static final int method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        field94++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 7 + 1 - arg1 - arg6;
        } else {
            if (arg4 != -20691) {
                field84 = null;
            }
            return var7 == 2 ? 7 + 1 - arg5 - arg2 : arg1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(DI)V")
    public static final void method36(double arg0, int arg1) {
        if (class3.field31 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class87.field1060[var3] = var4 <= 255 ? var4 : 255;
            }
            class3.field31 = arg0;
        }
        field100++;
        if (arg1 != 0) {
            method35(-15, 9, 38, -103, 16, 14, -110);
        }
    }
}
