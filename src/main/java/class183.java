import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class183 {

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Lpj;")
    public static class237 field3217 = class33.method353(" <col=ffffff>", 94);

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[I")
    public static int[] field3215 = new int[100];

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lpj;")
    public static class237 field3218 = class33.method353("Abbrechen", 71);

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lbl;")
    public static class33 field3214;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lmc;")
    public static final class191 method1254(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field759; var4++) {
            class191 var5 = var3.field755[var4];
            if ((var5.field3314 >> 29 & 0x3L) == 2L && var5.field3316 == arg1 && var5.field3315 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZII)I")
    public static final int method1255(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        field3216++;
        if (arg1) {
            field3217 = null;
        }
        return (arg3 >> 1) + (arg0 >> 5 << 7) + (arg2 >> 2 << 10);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static void method1256(int arg0) {
        field3218 = null;
        if (arg0 <= 47) {
            method1255(66, false, -46, 57);
        }
        field3215 = null;
        field3217 = null;
        field3214 = null;
    }
}
