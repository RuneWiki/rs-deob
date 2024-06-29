import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class458 {

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Z")
    private boolean field6446 = true;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    private int field6448 = -1;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    private int field6442;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    private int field6447;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "[Lki;")
    private class707[] field6451;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    private int field6443;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    private int field6455;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "[Lki;")
    private class707[] field6454;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "Lki;")
    private class707 field6460;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "Z")
    public static boolean field6459 = false;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    private int field6441;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    private int field6452;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "Lmi;")
    private class496 field6456;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6458;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILha;I)Z")
    public final boolean method2716(int arg0, class59 arg1, int arg2) {
        if (this.field6448 != arg2) {
            this.field6448 = arg2;
            int var4 = class230.method1605(arg2, 4096);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field6452 != var4) {
                this.field6456 = null;
                this.field6452 = var4;
            }
            if (this.field6451 != null) {
                this.field6441 = 0;
                int[] var5 = new int[this.field6451.length];
                for (int var6 = 0; var6 < this.field6451.length; var6++) {
                    class707 var7 = this.field6451[var6];
                    if (var7.method3937(this.field6455, this.field6443, this.field6442, this.field6448)) {
                        var5[this.field6441] = var7.field9588;
                        this.field6454[this.field6441++] = var7;
                    }
                }
                class550.method3172(this.field6441 - 1, 0, var5, -120, this.field6454);
            }
            this.field6446 = true;
        }
        field6445++;
        if (arg0 <= 27) {
            this.field6442 = -98;
        }
        boolean var8 = false;
        if (this.field6446) {
            this.field6446 = false;
            for (int var9 = this.field6441 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field6454[var9].method3940(arg1, this.field6460);
                var8 |= var10;
                this.field6446 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILha;BIIIIIII)V")
    public final void method2717(int arg0, class59 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg0 + arg6 & 0x3FFF;
        field6449++;
        if (this.field6447 == -1 || this.field6452 == 0) {
            arg1.method217(arg3, arg5, arg4, arg9, arg8, 0);
        } else {
            class739 var12 = class515.field7178.method1180(this.field6447, -6662);
            if (this.field6456 == null && class515.field7178.method1181(-7953, this.field6447)) {
                int[] var13 = var12.field9942 == 2 ? class515.field7178.method1183(-21540, this.field6452, 0.7F, this.field6447, false, this.field6452) : class515.field7178.method1182(false, this.field6447, 0.7F, this.field6452, this.field6452, -119);
                this.field6456 = arg1.method621(this.field6452, var13, (byte) 94, 0, this.field6452, this.field6452);
            }
            if (var12.field9942 == 2) {
                arg1.method217(arg3, arg5, arg4, arg9, arg8, 0);
            }
            if (this.field6456 != null) {
                int var14 = var12.field9942 == 2 ? 1 : 0;
                int var15 = arg7 * arg9 / -4096;
                int var16;
                for (var16 = arg9 * var11 / 4096 + (arg4 - arg9) / 2; var16 > arg9; var16 -= arg9) {
                }
                while (var16 < 0) {
                    var16 += arg9;
                }
                while (arg9 < var15) {
                    var15 -= arg9;
                }
                while (var15 < 0) {
                    var15 += arg9;
                }
                for (int var17 = var16 - arg9; var17 < arg4; var17 += arg9) {
                    for (int var18 = var15 - arg9; var18 < arg9; var18 += arg9) {
                        this.field6456.method2922(arg3 + var17, arg5 + var18, arg9, arg9, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field6441 - 1; var19 >= 0; var19--) {
            this.field6454[var19].method3941(arg1, arg3, arg5, arg4, arg9, arg7, var11);
        }
        int var20 = 103 % ((arg2 - 14) / 32);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method2718(int arg0) {
        field6458 = null;
        if (arg0 <= 94) {
            method2720(-107);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
    public final void method2719(byte arg0) {
        field6453++;
        if (this.field6451 != null) {
            for (int var2 = 0; var2 < this.field6451.length; var2++) {
                this.field6451[var2].method3938();
            }
        }
        this.field6456 = null;
        if (arg0 != 96) {
            this.method2716(-84, null, 73);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public static final void method2720(int arg0) {
        field6457++;
        if (arg0 < -46) {
            for (int var1 = 0; var1 < 100; var1++) {
                class42.field977[var1] = null;
            }
            class599.field8217 = 0;
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(I[Lki;IIII)V")
    public class458(int arg0, class707[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6442 = arg5;
        this.field6447 = arg0;
        this.field6451 = arg1;
        this.field6443 = arg4;
        this.field6455 = arg3;
        if (arg1 == null) {
            this.field6454 = null;
            this.field6460 = null;
        } else {
            this.field6454 = new class707[arg1.length];
            this.field6460 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
