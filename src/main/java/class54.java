import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class54 {

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lrn;")
    public static class633 field705 = new class633(78, 8);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[IIII)V", line = 4)
    public static final void method333(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        arg3--;
        field700++;
        int var6 = arg0 - 1;
        int var5 = var6 - arg2;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            int var13 = var12 + 1;
            arg1[var13] = arg4;
            arg3 = var13 + 1;
            arg1[arg3] = arg4;
        }
        while (arg3 < var6) {
            arg3++;
            arg1[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!gh", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field706++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 46)
    public static void method334(int arg0) {
        field705 = null;
        if (arg0 != 78) {
            field705 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILck;BII)Lrc;", line = 58)
    public static final class59 method335(int arg0, class733 arg1, byte arg2, int arg3, int arg4) {
        field703++;
        if (arg2 < 78) {
            field705 = null;
        }
        if (!arg1.field9891 && (!class735.method3997(arg0, (byte) -123) || !class735.method3997(arg3, (byte) -97))) {
            return arg1.field9876 ? new class59(arg1, 34037, arg4, arg0, arg3) : new class59(arg1, arg4, arg0, arg3, class483.method2714(arg0, (byte) -122), class483.method2714(arg3, (byte) -114));
        } else {
            return new class59(arg1, 3553, arg4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIII)V", line = 79)
    public class54(int arg0, int arg1, int arg2, int arg3) {
        this.field704 = arg2;
        this.field702 = arg1;
        this.field701 = arg0;
        this.field707 = arg3;
    }
}
