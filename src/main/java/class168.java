import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class168 extends class191 {

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    private int field3384 = -1;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    private int field3380 = 0;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Ldd;")
    private static class35 field3377 = class180.method1196((byte) 127, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Ldd;")
    public static class35 field3376 = field3377;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "Ldd;")
    public static class35 field3383 = field3377;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "Lhf;")
    public static class76 field3388;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "[[[[Z")
    public static boolean[][][][] field3387;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[Ldd;[SII)V")
    public static final void method1103(int arg0, class35[] arg1, short[] arg2, int arg3, int arg4) {
        field3385++;
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            class35 var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].method339(var7, (byte) 30) < (var9 & 0x1)) {
                    class35 var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method1103(18053, arg1, arg2, var6 - 1, arg4);
            method1103(18053, arg1, arg2, arg3, var6 + 1);
        }
        if (arg0 != 18053) {
            method1105(false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    private final void method1104(int arg0, int arg1) {
        field3386++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        if (var5 < var3) {
            var7 = var5;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var9 < var7) {
            var7 = var9;
        }
        if (var9 > var11) {
            var11 = var9;
        }
        double var13 = (double) arg0;
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        this.field3382 = (int) (var17 * 256.0D);
        if (this.field3382 < 0) {
            this.field3382 = 0;
        } else if (this.field3382 > 255) {
            this.field3382 = 255;
        }
        if (var7 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (-var7 + var11) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        this.field3378 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field3381 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3381 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3381 < 1) {
            this.field3381 = 1;
        }
        this.field3390 = (int) ((double) this.field3381 * var19);
        if (this.field3378 < 0) {
            this.field3378 = 0;
        } else if (this.field3378 > 255) {
            this.field3378 = 255;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method1105(boolean arg0) {
        field3388 = null;
        field3376 = null;
        field3377 = null;
        field3383 = null;
        field3387 = null;
        if (!arg0) {
            field3387 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILce;B)V")
    private final void method1106(int arg0, int arg1, class26 arg2, byte arg3) {
        field3379++;
        if (arg3 < 86) {
            field3376 = null;
        }
        if (arg0 == 1) {
            this.field3380 = arg2.method232(103);
            this.method1104(0, this.field3380);
        } else if (arg0 == 2) {
            this.field3384 = arg2.method256((byte) -78);
            if (this.field3384 != 65535) {
                return;
            }
            this.field3384 = -1;
        } else if (arg0 == 3) {
            arg2.method256((byte) -78);
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lce;II)V")
    public final void method1107(class26 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method221(-78);
            if (var4 == 0) {
                if (arg1 >= -31) {
                    method1103(-127, null, null, -112, -95);
                }
                field3389++;
                return;
            }
            this.method1106(var4, arg2, arg0, (byte) 116);
        }
    }
}
