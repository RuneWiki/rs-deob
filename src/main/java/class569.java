import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class569 {

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
    public int field8066 = -1;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public int field8070 = -1;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "[I")
    public static int[] field8067;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "[I")
    public int[] field8068;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "[[[Lch;")
    public static class38[][][] field8071;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILvj;)V", line = 5)
    private final void method3401(int arg0, int arg1, class26 arg2) {
        field8074++;
        if (arg0 == 1) {
            this.field8066 = arg2.method193(2);
        } else if (arg0 == 2) {
            this.field8068 = new int[arg2.method194((byte) 119)];
            for (int var4 = 0; var4 < this.field8068.length; var4++) {
                this.field8068[var4] = arg2.method193(2);
            }
        } else if (arg0 == 3) {
            this.field8070 = arg2.method194((byte) 119);
        }
        if (arg1 != 6786) {
            this.method3404((byte) -50, null);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILkp;IB)V", line = 42)
    public static final void method3402(int arg0, class480 arg1, int arg2, byte arg3) {
        field8072++;
        if (!class484.field6549) {
            return;
        }
        int var4 = 0;
        if (arg3 != -4) {
            field8067 = null;
        }
        for (class6 var5 = (class6) arg1.field6519.method667(true); var5 != null; var5 = (class6) arg1.field6519.method662((byte) 27)) {
            int var10 = class90.method544(-58437792, var5);
            if (var4 < var10) {
                var4 = var10;
            }
        }
        var4 += 8;
        class695.field9701 = (class33.field496 ? 26 : 22) + arg1.field6524 * 16;
        int var6 = arg1.field6524 * 16 + 21;
        int var7 = class463.field6345 + class248.field3438;
        if (var4 + var7 > class58.field807) {
            var7 = class463.field6345 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class33.field496 ? 33 : 31;
        int var9 = arg2 + 13 - var8;
        if ((var9 + var6) > class582.field8281) {
            var9 = class582.field8281 - var6;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class729.field10220 = var7;
        class660.field9314 = var4;
        class105.field1536 = arg1;
        class495.field6946 = var9;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILvj;)V", line = 104)
    public static final void method3403(int arg0, class26 arg1) {
        field8069++;
        if (arg0 <= 107) {
            return;
        }
        byte[] var2 = new byte[24];
        if (class658.field9296 != null) {
            try {
                class658.field9296.method3008(0L, (byte) -66);
                class658.field9296.method3016(var2, (byte) -31);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method155(0, 24, var2, 98);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BLvj;)V", line = 154)
    public final void method3404(byte arg0, class26 arg1) {
        field8073++;
        while (true) {
            int var3 = arg1.method194((byte) 119);
            if (var3 == 0) {
                if (arg0 > -60) {
                    this.method3404((byte) 90, null);
                    return;
                } else {
                    return;
                }
            }
            this.method3401(var3, 6786, arg1);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V", line = 178)
    public static void method3405(boolean arg0) {
        field8071 = null;
        field8067 = null;
        if (arg0) {
            method3402(-11, null, -128, (byte) 48);
        }
    }
}
