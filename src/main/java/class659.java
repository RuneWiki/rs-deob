import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class659 {

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Z")
    public boolean field9188 = false;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field9189 = 64;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public int field9190 = 64;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public int field9193 = -1;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public int field9192 = 2;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Z")
    public boolean field9196 = false;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public int field9197 = 1;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lbu;")
    public static class21 field9191 = new class21(53, 7);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 11)
    public static void method3760(int arg0) {
        if (arg0 < -37) {
            field9191 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILso;I)V", line = 22)
    private final void method3761(int arg0, int arg1, class494 arg2, int arg3) {
        field9187++;
        if (arg1 != -6) {
            field9191 = null;
        }
        if (arg3 == 1) {
            this.field9193 = arg2.method2998(true);
            if (this.field9193 == 65535) {
                this.field9193 = -1;
                return;
            }
        } else if (arg3 == 2) {
            this.field9190 = arg2.method2998(true) + 1;
            this.field9189 = arg2.method2998(true) + 1;
        } else if (arg3 == 3) {
            arg2.method2943((byte) 16);
            return;
        } else if (arg3 == 4) {
            this.field9192 = arg2.method2964((byte) 89);
            return;
        } else if (arg3 == 5) {
            this.field9197 = arg2.method2964((byte) 63);
            return;
        } else {
            if (arg3 == 6) {
                this.field9196 = true;
            } else if (arg3 == 7) {
                this.field9188 = true;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([[S[[FZ)[[S", line = 71)
    public static final short[][] method3762(short[][] arg0, float[][] arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            for (int var4 = 0; var4 < arg0[var3].length; var4++) {
                arg0[var3][var4] = (short) ((int) (arg1[var3][var4] * 16383.0F));
            }
        }
        if (!arg2) {
            field9191 = null;
        }
        field9194++;
        return arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)I", line = 106)
    public static final int method3763(int arg0, int arg1, int arg2) {
        field9195++;
        int var3 = arg0;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLso;I)V", line = 129)
    public final void method3764(byte arg0, class494 arg1, int arg2) {
        if (arg0 != -52) {
            return;
        }
        while (true) {
            int var4 = arg1.method2964((byte) 116);
            if (var4 == 0) {
                field9198++;
                return;
            }
            this.method3761(arg2, -6, arg1, var4);
        }
    }
}
