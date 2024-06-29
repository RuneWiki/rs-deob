import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class162 extends class16 {

    @OriginalMember(owner = "client!in", name = "T", descriptor = "I")
    public static int field2649 = 0;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!in", name = "U", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!in", name = "W", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!in", name = "X", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "[I")
    public static int[] field2647;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLim;I)V", line = 5)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg0 != -7) {
            field2649 = -2;
        }
        field2648++;
        if (arg2 == 0) {
            this.field191 = arg1.method1399(-1172389784) == 1;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BB)V", line = 19)
    public static final void method1125(byte arg0, byte arg1) {
        if (class280.field4416 == null) {
            class280.field4416 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class280.field4416[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 > 34) {
            field2652++;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(Z)V", line = 62)
    public static void method1126(boolean arg0) {
        if (!arg0) {
            method1128(81, 55, 33, -54, (class232) null, (class232) null, 74, 46, 88L);
        }
        field2647 = null;
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(B)Ln;", line = 74)
    public static final class298 method1127(byte arg0) {
        field2650++;
        int var1 = class244.field3885[0] * class21.field316[0];
        byte[] var2 = class3.field20[0];
        if (arg0 >= -120) {
            return (class298) null;
        }
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class305.field4754[class200.method1465(var2[var4], 255)];
        }
        class298 var5 = new class298(class163.field2659, class113.field1698, class163.field2657[0], field2647[0], class244.field3885[0], class21.field316[0], var3);
        class17.method115((byte) -100);
        return var5;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)[[I", line = 104)
    public final int[][] method54(int arg0, byte arg1) {
        int var3 = 35 / ((arg1 - 40) / 41);
        field2646++;
        int[][] var4 = this.field197.method715(true, arg0);
        if (this.field197.field1548) {
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class276.field4376; var8++) {
                this.method1129((byte) -54, arg0, var8);
                int[][] var9 = this.method111(0, (byte) 122, class149.field2285);
                var5[var8] = var9[0][class209.field3413];
                var7[var8] = var9[1][class209.field3413];
                var6[var8] = var9[2][class209.field3413];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(ZI)[I", line = 143)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            field2649 = 8;
        }
        field2651++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            for (int var4 = 0; var4 < class276.field4376; var4++) {
                this.method1129((byte) -54, arg1, var4);
                int[] var5 = this.method103(0, 4389, class149.field2285);
                var3[var4] = var5[class209.field3413];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILh;Lh;IIJ)V", line = 176)
    public static final void method1128(int arg0, int arg1, int arg2, int arg3, class232 arg4, class232 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class19 var10 = new class19();
        var10.field263 = arg8;
        var10.field260 = arg1 * 128 + 64;
        var10.field275 = arg2 * 128 + 64;
        var10.field265 = arg3;
        var10.field259 = arg4;
        var10.field272 = arg5;
        var10.field258 = arg6;
        var10.field261 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class251.field3996[var11][arg1][arg2] == null) {
                class251.field3996[var11][arg1][arg2] = new class230(var11, arg1, arg2);
            }
        }
        class251.field3996[arg0][arg1][arg2].field3676 = var10;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 203)
    public class162() {
        super(1, false);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BII)V", line = 208)
    private final void method1129(byte arg0, int arg1, int arg2) {
        field2653++;
        int var4 = class27.field396[arg2];
        if (arg0 != -54) {
            method1128(94, 115, -76, -81, (class232) null, (class232) null, 43, 2, 64L);
        }
        int var5 = class130.field1921[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class149.field2285 = arg1;
            class209.field3413 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class149.field2285 = arg2;
            class209.field3413 = arg1;
        } else if (-0.7853981633974483D >= (double) var6 && -1.5707963267948966D <= (double) var6) {
            class149.field2285 = arg2;
            class209.field3413 = class276.field4376 - arg1;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class149.field2285 = class294.field4619 - arg1;
            class209.field3413 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class209.field3413 = class276.field4376 - arg2;
            class149.field2285 = class294.field4619 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class149.field2285 = class294.field4619 - arg2;
            class209.field3413 = class276.field4376 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class149.field2285 = class294.field4619 - arg2;
            class209.field3413 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class149.field2285 = arg1;
            class209.field3413 = class276.field4376 - arg2;
        }
        class149.field2285 &= class240.field3798;
        class209.field3413 &= class148.field2215;
    }
}
