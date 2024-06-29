import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class437 extends class739 {

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    private int field6233 = 1;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    private int field6238 = 1;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    private int field6239 = 204;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "[[I")
    public static int[][] field6235 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "[Lvo;")
    public static class131[] field6234 = new class131[14];

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "[[Z")
    public static boolean[][] field6237;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 4)
    public static void method2673(int arg0) {
        if (arg0 != 4) {
            method2673(62);
        }
        field6237 = null;
        field6235 = null;
        field6234 = null;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 17)
    public class437() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)[I", line = 20)
    public final int[] method445(boolean arg0, int arg1) {
        ++field6236;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            for (int var4 = 0; ~var4 > ~class399.field5703; ++var4) {
                int var5 = class604.field8580[var4];
                int var6 = class19.field185[arg1];
                int var7 = this.field6233 * var5 >> 12;
                int var8 = this.field6238 * var6 >> 12;
                int var9 = var5 % (4096 / this.field6233) * this.field6233;
                int var10 = var6 % (4096 / this.field6238) * this.field6238;
                if (~var10 > ~this.field6239) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field6239 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field6239) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0) {
            this.method112((class479) null, -126, (byte) 22);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lsl;IB)V", line = 105)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            this.field6233 = 66;
        }
        ++field6231;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field6239 = arg0.method2882(-1);
                }
            } else {
                this.field6238 = arg0.method2886(true);
            }
        } else {
            this.field6233 = arg0.method2886(true);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIII)V", line = 153)
    public static final void method2674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class200.field2976 <= arg6 && class204.field3061 >= arg6 && ~class200.field2976 >= ~arg4 && class204.field3061 >= arg4 && arg2 >= class200.field2976 && class204.field3061 >= arg2 && ~arg9 <= ~class200.field2976 && ~arg9 >= ~class204.field3061 && arg8 >= class377.field5458 && class362.field5291 >= arg8 && class377.field5458 <= arg0 && ~class362.field5291 <= ~arg0 && ~arg1 <= ~class377.field5458 && arg1 <= class362.field5291 && ~arg7 <= ~class377.field5458 && ~arg7 >= ~class362.field5291) {
            class493.method3000(arg7, arg2, arg8, 3162, arg0, arg9, arg4, arg6, arg1, arg5);
        } else {
            class376.method2330(arg1, true, arg6, arg8, arg7, arg0, arg4, arg2, arg5, arg9);
        }
        ++field6230;
        if (arg3 <= 28) {
            method2673(63);
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)I", line = 171)
    public static final int method2675(int arg0, int arg1) {
        ++field6232;
        if (arg0 != 127) {
            method2674(-19, -109, 52, -78, -93, 55, 115, 71, -93, -25);
        }
        return arg1 & 127;
    }
}
