import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class39 {

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    private int field529 = -1;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    private int field532 = 0;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field530 = 128;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Lfa;")
    public static class250 field526 = new class250();

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "[I")
    public static int[] field538 = new int[100];

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "[[[I")
    public static int[][][] field537;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field534++;
        int var8 = arg4 + arg7;
        if (arg6 < 75) {
            return;
        }
        int var9 = arg2 - arg4;
        int var10 = arg1 + arg4;
        for (int var11 = arg7; var11 < var8; var11++) {
            class8.method52(arg1, class106.field1637[var11], arg3, arg5, true);
        }
        int var12 = arg3 - arg4;
        for (int var13 = arg2; var13 > var9; var13--) {
            class8.method52(arg1, class106.field1637[var13], arg3, arg5, true);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class106.field1637[var14];
            class8.method52(arg1, var15, var10, arg5, true);
            class8.method52(var10, var15, var12, arg0, true);
            class8.method52(var12, var15, arg3, arg5, true);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILlj;I)V")
    private final void method309(int arg0, int arg1, class25 arg2, int arg3) {
        if (arg3 != 100) {
            field538 = null;
        }
        field533++;
        if (arg0 == 1) {
            this.field532 = arg2.method215((byte) 97);
            this.method311((byte) -44, this.field532);
        } else if (arg0 == 2) {
            this.field529 = arg2.method190(-3);
            if (this.field529 == 65535) {
                this.field529 = -1;
                return;
            }
        } else if (arg0 == 3) {
            arg2.method190(-3);
            return;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method310(int arg0) {
        if (arg0 == 256) {
            field538 = null;
            field526 = null;
            field537 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
    private final void method311(byte arg0, int arg1) {
        field528++;
        if (arg0 > -13) {
            this.method311((byte) -81, -119);
        }
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        double var11 = var5;
        double var13 = var5;
        if (var5 < var3) {
            var13 = var3;
        }
        if (var3 < var5) {
            var11 = var3;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var15 = 0.0D;
        if (var7 > var13) {
            var13 = var7;
        }
        double var17 = (var11 + var13) / 2.0D;
        if (var11 != var13) {
            if (var17 < 0.5D) {
                var9 = (var13 - var11) / (var11 + var13);
            }
            if (var17 >= 0.5D) {
                var9 = (var13 - var11) / (2.0D - var13 - var11);
            }
            if (var5 == var13) {
                var15 = (var3 - var7) / (var13 - var11);
            } else if (var3 == var13) {
                var15 = (var7 - var5) / (var13 - var11) + 2.0D;
            } else if (var7 == var13) {
                var15 = (var5 - var3) / (var13 - var11) + 4.0D;
            }
        }
        double var19 = var15 / 6.0D;
        this.field531 = (int) (var9 * 256.0D);
        if (this.field531 < 0) {
            this.field531 = 0;
        } else if (this.field531 > 255) {
            this.field531 = 255;
        }
        if (var17 > 0.5D) {
            this.field525 = (int) ((1.0D - var17) * var9 * 512.0D);
        } else {
            this.field525 = (int) (var9 * var17 * 512.0D);
        }
        if (this.field525 < 1) {
            this.field525 = 1;
        }
        this.field535 = (int) ((double) this.field525 * var19);
        this.field536 = (int) (var17 * 256.0D);
        if (this.field536 < 0) {
            this.field536 = 0;
        } else if (this.field536 > 255) {
            this.field536 = 255;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILlj;)V")
    public final void method312(int arg0, int arg1, class25 arg2) {
        field527++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var4 = arg2.method201(arg0 ^ 0xFF);
            if (var4 == 0) {
                return;
            }
            this.method309(var4, arg1, arg2, 100);
        }
    }
}
