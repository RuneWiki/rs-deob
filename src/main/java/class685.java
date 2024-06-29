import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class685 {

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "Lan;")
    public static class182 field9701 = new class182(4, 4);

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "Ljava/lang/String;")
    public static String field9704 = null;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field9679;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public int field9681;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field9682;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field9684;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public int field9685;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public int field9694;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "[[I")
    public int[][] field9700;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BZIIIZI)V", line = 12)
    public final void method3790(byte arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field9685;
        int var9 = arg3 - this.field9679;
        field9695++;
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method3792(var8, 128, var9, 2883872);
                this.method3792(var8 - 1, 8, var9, 2883872);
            }
            if (arg6 == 1) {
                this.method3792(var8, 2, var9, 2883872);
                this.method3792(var8, 32, var9 + 1, 2883872);
            }
            if (arg6 == 2) {
                this.method3792(var8, 8, var9, 2883872);
                this.method3792(var8 + 1, 128, var9, 2883872);
            }
            if (arg6 == 3) {
                this.method3792(var8, 32, var9, 2883872);
                this.method3792(var8, 2, var9 - 1, 2883872);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method3792(var8, 1, var9, 2883872);
                this.method3792(var8 - 1, 16, var9 + 1, 2883872);
            }
            if (arg6 == 1) {
                this.method3792(var8, 4, var9, 2883872);
                this.method3792(var8 + 1, 64, var9 + 1, 2883872);
            }
            if (arg6 == 2) {
                this.method3792(var8, 16, var9, 2883872);
                this.method3792(var8 + 1, 1, var9 - 1, 2883872);
            }
            if (arg6 == 3) {
                this.method3792(var8, 64, var9, 2883872);
                this.method3792(var8 - 1, 4, var9 - 1, 2883872);
            }
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                this.method3792(var8, 130, var9, 2883872);
                this.method3792(var8 - 1, 8, var9, 2883872);
                this.method3792(var8, 32, var9 + 1, 2883872);
            }
            if (arg6 == 1) {
                this.method3792(var8, 10, var9, 2883872);
                this.method3792(var8, 32, var9 + 1, 2883872);
                this.method3792(var8 + 1, 128, var9, 2883872);
            }
            if (arg6 == 2) {
                this.method3792(var8, 40, var9, 2883872);
                this.method3792(var8 + 1, 128, var9, 2883872);
                this.method3792(var8, 2, var9 - 1, 2883872);
            }
            if (arg6 == 3) {
                this.method3792(var8, 160, var9, 2883872);
                this.method3792(var8, 2, var9 - 1, 2883872);
                this.method3792(var8 - 1, 8, var9, 2883872);
            }
        }
        if (arg0 >= -27) {
            this.method3793((byte) 14, -21, false, -40, 67, 50, false);
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    this.method3792(var8, 65536, var9, 2883872);
                    this.method3792(var8 - 1, 4096, var9, 2883872);
                }
                if (arg6 == 1) {
                    this.method3792(var8, 1024, var9, 2883872);
                    this.method3792(var8, 16384, var9 + 1, 2883872);
                }
                if (arg6 == 2) {
                    this.method3792(var8, 4096, var9, 2883872);
                    this.method3792(var8 + 1, 65536, var9, 2883872);
                }
                if (arg6 == 3) {
                    this.method3792(var8, 16384, var9, 2883872);
                    this.method3792(var8, 1024, var9 - 1, 2883872);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg6 == 0) {
                    this.method3792(var8, 512, var9, 2883872);
                    this.method3792(var8 - 1, 8192, var9 + 1, 2883872);
                }
                if (arg6 == 1) {
                    this.method3792(var8, 2048, var9, 2883872);
                    this.method3792(var8 + 1, 32768, var9 + 1, 2883872);
                }
                if (arg6 == 2) {
                    this.method3792(var8, 8192, var9, 2883872);
                    this.method3792(var8 + 1, 512, var9 - 1, 2883872);
                }
                if (arg6 == 3) {
                    this.method3792(var8, 32768, var9, 2883872);
                    this.method3792(var8 - 1, 2048, var9 - 1, 2883872);
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    this.method3792(var8, 66560, var9, 2883872);
                    this.method3792(var8 - 1, 4096, var9, 2883872);
                    this.method3792(var8, 16384, var9 + 1, 2883872);
                }
                if (arg6 == 1) {
                    this.method3792(var8, 5120, var9, 2883872);
                    this.method3792(var8, 16384, var9 + 1, 2883872);
                    this.method3792(var8 + 1, 65536, var9, 2883872);
                }
                if (arg6 == 2) {
                    this.method3792(var8, 20480, var9, 2883872);
                    this.method3792(var8 + 1, 65536, var9, 2883872);
                    this.method3792(var8, 1024, var9 - 1, 2883872);
                }
                if (arg6 == 3) {
                    this.method3792(var8, 81920, var9, 2883872);
                    this.method3792(var8, 1024, var9 - 1, 2883872);
                    this.method3792(var8 - 1, 4096, var9, 2883872);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method3792(var8, 536870912, var9, 2883872);
                this.method3792(var8 - 1, 33554432, var9, 2883872);
            }
            if (arg6 == 1) {
                this.method3792(var8, 8388608, var9, 2883872);
                this.method3792(var8, 134217728, var9 + 1, 2883872);
            }
            if (arg6 == 2) {
                this.method3792(var8, 33554432, var9, 2883872);
                this.method3792(var8 + 1, 536870912, var9, 2883872);
            }
            if (arg6 == 3) {
                this.method3792(var8, 134217728, var9, 2883872);
                this.method3792(var8, 8388608, var9 - 1, 2883872);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method3792(var8, 4194304, var9, 2883872);
                this.method3792(var8 - 1, 67108864, var9 + 1, 2883872);
            }
            if (arg6 == 1) {
                this.method3792(var8, 16777216, var9, 2883872);
                this.method3792(var8 + 1, 268435456, var9 + 1, 2883872);
            }
            if (arg6 == 2) {
                this.method3792(var8, 67108864, var9, 2883872);
                this.method3792(var8 + 1, 4194304, var9 - 1, 2883872);
            }
            if (arg6 == 3) {
                this.method3792(var8, 268435456, var9, 2883872);
                this.method3792(var8 - 1, 16777216, var9 - 1, 2883872);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method3792(var8, 545259520, var9, 2883872);
            this.method3792(var8 - 1, 33554432, var9, 2883872);
            this.method3792(var8, 134217728, var9 + 1, 2883872);
        }
        if (arg6 == 1) {
            this.method3792(var8, 41943040, var9, 2883872);
            this.method3792(var8, 134217728, var9 + 1, 2883872);
            this.method3792(var8 + 1, 536870912, var9, 2883872);
        }
        if (arg6 == 2) {
            this.method3792(var8, 167772160, var9, 2883872);
            this.method3792(var8 + 1, 536870912, var9, 2883872);
            this.method3792(var8, 8388608, var9 - 1, 2883872);
        }
        if (arg6 == 3) {
            this.method3792(var8, 671088640, var9, 2883872);
            this.method3792(var8, 8388608, var9 - 1, 2883872);
            this.method3792(var8 - 1, 33554432, var9, 2883872);
            return;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZIIZII)V", line = 323)
    public final void method3791(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field9683++;
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var10 = arg1;
            arg1 = arg3;
            arg3 = var10;
        }
        int var11 = arg0 - this.field9685;
        if (arg2) {
            var9 |= 0x40000000;
        }
        int var12 = arg7 - this.field9679;
        for (int var13 = var11; var13 < (var11 + arg1); var13++) {
            if (var13 >= 0 && var13 < this.field9681) {
                for (int var14 = var12; var14 < (var12 + arg3); var14++) {
                    if (var14 >= 0 && var14 < this.field9694) {
                        this.method3800(-126, var9, var14, var13);
                    }
                }
            }
        }
        if (arg4 != -5096) {
            method3807(null, -13, -51, (byte) 28, 10, null, 69, -20, null);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)V", line = 380)
    private final void method3792(int arg0, int arg1, int arg2, int arg3) {
        field9696++;
        this.field9700[arg0][arg2] = class216.method1308(this.field9700[arg0][arg2], arg1);
        if (arg3 != 2883872) {
            this.method3796(58, 91, 30);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIZIIIZ)V", line = 396)
    public final void method3793(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field9693++;
        int var8 = 256;
        if (arg2) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field9679;
        int var10 = arg3 - this.field9685;
        if (arg6) {
            var8 |= 0x40000000;
        }
        if (arg0 != -36) {
            return;
        }
        for (int var11 = var10; var11 < (var10 + arg5); var11++) {
            if (var11 >= 0 && var11 < this.field9681) {
                for (int var12 = var9; var12 < arg1 + var9; var12++) {
                    if (var12 >= 0 && this.field9694 > var12) {
                        this.method3792(var11, var8, var12, 2883872);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 444)
    public final void method3794(int arg0) {
        field9689++;
        if (arg0 >= -15) {
            return;
        }
        for (int var2 = 0; var2 < this.field9681; var2++) {
            for (int var3 = 0; var3 < this.field9694; var3++) {
                if (var2 == 0 || var3 == 0 || this.field9681 - 5 <= var2 || var3 >= (this.field9694 - 5)) {
                    this.field9700[var2][var3] = -1;
                } else {
                    this.field9700[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIZIBZ)V", line = 478)
    public final void method3795(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, boolean arg6) {
        int var8 = arg0 - this.field9685;
        int var9 = arg4 - this.field9679;
        field9687++;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method3800(-117, 128, var9, var8);
                this.method3800(-110, 8, var9, var8 - 1);
            }
            if (arg1 == 1) {
                this.method3800(93, 2, var9, var8);
                this.method3800(-122, 32, var9 + 1, var8);
            }
            if (arg1 == 2) {
                this.method3800(-28, 8, var9, var8);
                this.method3800(103, 128, var9, var8 + 1);
            }
            if (arg1 == 3) {
                this.method3800(-110, 32, var9, var8);
                this.method3800(-120, 2, var9 - 1, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method3800(-98, 1, var9, var8);
                this.method3800(13, 16, var9 + 1, var8 + -1);
            }
            if (arg1 == 1) {
                this.method3800(-126, 4, var9, var8);
                this.method3800(-102, 64, var9 + 1, var8 + 1);
            }
            if (arg1 == 2) {
                this.method3800(-106, 16, var9, var8);
                this.method3800(-27, 1, var9 - 1, var8 + 1);
            }
            if (arg1 == 3) {
                this.method3800(15, 64, var9, var8);
                this.method3800(-113, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method3800(-122, 130, var9, var8);
                this.method3800(-123, 8, var9, var8 - 1);
                this.method3800(-107, 32, var9 + 1, var8);
            }
            if (arg1 == 1) {
                this.method3800(-105, 10, var9, var8);
                this.method3800(-3, 32, var9 + 1, var8);
                this.method3800(116, 128, var9, var8 + 1);
            }
            if (arg1 == 2) {
                this.method3800(-122, 40, var9, var8);
                this.method3800(113, 128, var9, var8 + 1);
                this.method3800(-101, 2, var9 - 1, var8);
            }
            if (arg1 == 3) {
                this.method3800(3, 160, var9, var8);
                this.method3800(-120, 2, var9 - 1, var8);
                this.method3800(-20, 8, var9, var8 - 1);
            }
        }
        if (arg5 >= -127) {
            this.method3792(-86, 113, -49, -107);
        }
        if (arg6) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    this.method3800(127, 65536, var9, var8);
                    this.method3800(-117, 4096, var9, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method3800(32, 1024, var9, var8);
                    this.method3800(-28, 16384, var9 + 1, var8);
                }
                if (arg1 == 2) {
                    this.method3800(127, 4096, var9, var8);
                    this.method3800(-5, 65536, var9, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method3800(30, 16384, var9, var8);
                    this.method3800(58, 1024, var9 - 1, var8);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg1 == 0) {
                    this.method3800(89, 512, var9, var8);
                    this.method3800(-119, 8192, var9 + 1, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method3800(-112, 2048, var9, var8);
                    this.method3800(-120, 32768, var9 + 1, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method3800(15, 8192, var9, var8);
                    this.method3800(-125, 512, var9 - 1, var8 - -1);
                }
                if (arg1 == 3) {
                    this.method3800(-23, 32768, var9, var8);
                    this.method3800(41, 2048, var9 - 1, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    this.method3800(58, 66560, var9, var8);
                    this.method3800(-100, 4096, var9, var8 - 1);
                    this.method3800(-101, 16384, var9 + 1, var8);
                }
                if (arg1 == 1) {
                    this.method3800(-126, 5120, var9, var8);
                    this.method3800(14, 16384, var9 + 1, var8);
                    this.method3800(26, 65536, var9, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method3800(-9, 20480, var9, var8);
                    this.method3800(29, 65536, var9, var8 + 1);
                    this.method3800(-117, 1024, var9 - 1, var8);
                }
                if (arg1 == 3) {
                    this.method3800(-112, 81920, var9, var8);
                    this.method3800(6, 1024, var9 - 1, var8);
                    this.method3800(126, 4096, var9, var8 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method3800(-126, 536870912, var9, var8);
                this.method3800(22, 33554432, var9, var8 - 1);
            }
            if (arg1 == 1) {
                this.method3800(84, 8388608, var9, var8);
                this.method3800(-127, 134217728, var9 + 1, var8);
            }
            if (arg1 == 2) {
                this.method3800(41, 33554432, var9, var8);
                this.method3800(-128, 536870912, var9, var8 + 1);
            }
            if (arg1 == 3) {
                this.method3800(97, 134217728, var9, var8);
                this.method3800(-105, 8388608, var9 - 1, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method3800(-124, 4194304, var9, var8);
                this.method3800(-20, 67108864, var9 + 1, var8 + -1);
            }
            if (arg1 == 1) {
                this.method3800(-98, 16777216, var9, var8);
                this.method3800(-99, 268435456, var9 + 1, var8 + 1);
            }
            if (arg1 == 2) {
                this.method3800(124, 67108864, var9, var8);
                this.method3800(-108, 4194304, var9 - 1, var8 + 1);
            }
            if (arg1 == 3) {
                this.method3800(2, 268435456, var9, var8);
                this.method3800(-9, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method3800(62, 545259520, var9, var8);
            this.method3800(-116, 33554432, var9, var8 - 1);
            this.method3800(85, 134217728, var9 + 1, var8);
        }
        if (arg1 == 1) {
            this.method3800(-122, 41943040, var9, var8);
            this.method3800(111, 134217728, var9 + 1, var8);
            this.method3800(88, 536870912, var9, var8 + 1);
        }
        if (arg1 == 2) {
            this.method3800(52, 167772160, var9, var8);
            this.method3800(60, 536870912, var9, var8 + 1);
            this.method3800(-120, 8388608, var9 - 1, var8);
        }
        if (arg1 == 3) {
            this.method3800(-9, 671088640, var9, var8);
            this.method3800(-1, 8388608, var9 - 1, var8);
            this.method3800(113, 33554432, var9, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V", line = 791)
    public final void method3796(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field9685;
        if (arg2 > -11) {
            this.method3801(108, 114, -124, 33, 124, 71, 47, (byte) -56);
        }
        field9690++;
        int var5 = arg1 - this.field9679;
        this.field9700[var4][var5] = class272.method1629(this.field9700[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIIBI)Z", line = 811)
    public final boolean method3797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field9682++;
        int var11 = arg0 + arg9;
        int var12 = arg3 + arg5;
        int var13 = arg4 + arg7;
        int var14 = arg2 + arg1;
        if (arg9 == var13 && (arg6 & 0x2) == 0) {
            int var15 = arg2 >= arg3 ? arg2 : arg3;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field9700[var13 - this.field9685 - 1][var15 - this.field9679] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg7 == var11 && (arg6 & 0x8) == 0) {
            int var17 = arg2 < arg3 ? arg3 : arg2;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field9700[arg7 - this.field9685][var17 - this.field9679] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var14 && (arg6 & 0x1) == 0) {
            int var19 = arg7 >= arg9 ? arg7 : arg9;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field9700[var19 - this.field9685][var14 - this.field9679 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg6 & 0x4) == 0) {
            int var21 = arg9 > arg7 ? arg9 : arg7;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field9700[var21 - this.field9685][arg2 - this.field9679] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        if (arg8 < 114) {
            this.field9681 = -85;
        }
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V", line = 905)
    public static final void method3798(boolean arg0, int arg1) {
        if (arg0) {
            if (class638.field8834 != -1) {
                class156.method976(10, class638.field8834);
            }
            for (class157 var2 = (class157) class148.field1802.method3245(false); var2 != null; var2 = (class157) class148.field1802.method3252(12938)) {
                if (!var2.method3425(arg1 ^ 0x424B)) {
                    var2 = (class157) class148.field1802.method3245(false);
                    if (var2 == null) {
                        break;
                    }
                }
                class22.method239(true, false, var2, 7799);
            }
            class638.field8834 = -1;
            class148.field1802 = new class583(8);
            class238.method1490(arg1 + 8);
            class638.field8834 = class635.field8801;
            class504.method2911(false, false);
            class728.method4033(arg1 - 35);
            class445.method2628(class638.field8834);
        }
        field9688++;
        class667.field9134 = true;
        if (arg1 != -1) {
            method3807(null, 58, 123, (byte) 55, -21, null, -117, 60, null);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 948)
    public static final void method3799(byte arg0) {
        if (class471.field6763 > 1) {
            class471.field6763--;
            class22.field287 = class215.field2727;
        }
        field9699++;
        if (class541.field7612) {
            class541.field7612 = false;
            class238.method1491((byte) 91);
            return;
        }
        if (!class322.field4113) {
            class240.method1499(111);
        }
        for (int var1 = 0; var1 < 100 && class100.method674(113); var1++) {
        }
        if (class668.field9150 != 10) {
            return;
        }
        while (class157.method981(0)) {
            class650 var2 = class314.method1837(class396.field5512, true, class625.field8727);
            var2.field8928.method1141(0, -76);
            int var3 = var2.field8928.field2354;
            class717.method3983(var2.field8928, false);
            var2.field8928.method1126(-1, var2.field8928.field2354 - var3);
            class108.method745(var2, -127);
        }
        if (class130.field1565 == null) {
            if (class97.method654((byte) 44) >= class761.field10597) {
                class130.field1565 = class643.field8881.method1775(1000, class575.field8035.field2460);
            }
        } else if (class130.field1565.field2272 != -1) {
            class650 var4 = class314.method1837(class514.field7239, true, class625.field8727);
            var4.field8928.method1157(class130.field1565.field2272, (byte) 115);
            class108.method745(var4, -50);
            class130.field1565 = null;
            class761.field10597 = class97.method654((byte) 72) + 30000L;
        }
        class283 var5 = (class283) class679.field9210.method3111(83);
        if (var5 != null || class491.field6962 < class97.method654((byte) 74) - 2000L) {
            class650 var6 = null;
            int var7 = 0;
            for (class283 var8 = (class283) class386.field5379.method3111(108); var8 != null && (var6 == null || var6.field8928.field2354 - var7 < 240); var8 = (class283) class386.field5379.method3116(-63)) {
                var8.method3426((byte) -82);
                int var9 = var8.method1706(true);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1702((byte) -76);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class11.field129 != var10 || class109.field1346 != var9) {
                    if (var6 == null) {
                        class395.field5495++;
                        var6 = class314.method1837(class22.field293, true, class625.field8727);
                        var6.field8928.method1141(0, -101);
                        var7 = var6.field8928.field2354;
                    }
                    int var11 = var10 - class11.field129;
                    class11.field129 = var10;
                    int var12 = var9 - class109.field1346;
                    class109.field1346 = var9;
                    int var13 = (int) ((var8.method1704(117) - class491.field6962) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field8928.method1157((var11 << 6) + (var13 << 12) + var12, (byte) 111);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var6.field8928.method1141(var13 + 128, -106);
                        var11 += 128;
                        var12 += 128;
                        var6.field8928.method1157((var11 << 8) + var12, (byte) 118);
                    } else if (var13 < 32) {
                        var6.field8928.method1141(var13 + 192, 47);
                        if (var10 == 1 || var9 == -1) {
                            var6.field8928.method1112(Integer.MIN_VALUE, -128);
                        } else {
                            var6.field8928.method1112(var10 | var9 << 16, -128);
                        }
                    } else {
                        var6.field8928.method1157(var13 + 57344, (byte) 123);
                        if (var10 == 1 || var9 == -1) {
                            var6.field8928.method1112(Integer.MIN_VALUE, -119);
                        } else {
                            var6.field8928.method1112(var9 << 16 | var10, -119);
                        }
                    }
                    class491.field6962 = var8.method1704(-59);
                }
            }
            if (var6 != null) {
                var6.field8928.method1126(-1, var6.field8928.field2354 - var7);
                class108.method745(var6, -105);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1704(111) - class417.field5927) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class417.field5927 = var5.method1704(110);
            int var16 = var5.method1706(true);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1702((byte) -87);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1701(18) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class262.field3323++;
            class650 var20 = class314.method1837(class575.field8020, true, class625.field8727);
            var20.field8928.method1101(var19 | var18 << 15, 255);
            var20.field8928.method1102(var17 | var16 << 16, -113);
            class108.method745(var20, -79);
        }
        if (class237.field3068 > 0) {
            class536.field7531++;
            class650 var21 = class314.method1837(class404.field5701, true, class625.field8727);
            var21.field8928.method1141(class237.field3068 * 3, -123);
            for (int var22 = 0; var22 < class237.field3068; var22++) {
                class122 var23 = class208.field2663[var22];
                long var24 = (var23.method801((byte) 46) - class595.field8266) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class595.field8266 = var23.method801((byte) -99);
                var21.field8928.method1141(var23.method802(-20069), -105);
                var21.field8928.method1157((int) var24, (byte) 120);
            }
            class108.method745(var21, -79);
        }
        if (class728.field10188 > 0) {
            class728.field10188--;
        }
        if (class70.field945 && class728.field10188 <= 0) {
            class70.field945 = false;
            class728.field10188 = 20;
            class396.field5510++;
            class650 var26 = class314.method1837(class326.field4165, true, class625.field8727);
            var26.field8928.method1101((int) class748.field10471 >> 3, 255);
            var26.field8928.method1124((byte) 106, (int) class602.field8360 >> 3);
            class108.method745(var26, -96);
        }
        if (class758.field10550 != class36.field534) {
            class36.field534 = class758.field10550;
            class401.field5556++;
            class650 var27 = class314.method1837(class74.field1007, true, class625.field8727);
            var27.field8928.method1141(class758.field10550 ? 1 : 0, 48);
            class108.method745(var27, -18);
        }
        if (!class78.field1035) {
            class243.field3123++;
            class650 var28 = class314.method1837(class541.field7626, true, class625.field8727);
            var28.field8928.method1141(0, 43);
            int var29 = var28.field8928.field2354;
            class179 var30 = class223.field2944.method341((byte) -57);
            var28.field8928.method1123(var30.field2354, (byte) 49, 0, var30.field2325);
            var28.field8928.method1126(-1, var28.field8928.field2354 - var29);
            class108.method745(var28, -112);
            class78.field1035 = true;
        }
        if (class495.field7002 != null) {
            if (class276.field3497 == 2) {
                class326.method1925((byte) 100);
            } else if (class276.field3497 == 3) {
                class603.method3318(true);
            }
        }
        if (class86.field1104) {
            class86.field1104 = false;
        } else {
            class661.field9067 /= 2.0F;
        }
        if (class446.field6280) {
            class446.field6280 = false;
        } else {
            class591.field8230 /= 2.0F;
        }
        class10.method48(78);
        if (class668.field9150 != 10) {
            return;
        }
        class160.method990(-1087940572);
        class181.method1162((byte) 83);
        class662.method3586(-2062);
        class199.field2550++;
        if (class199.field2550 > 750) {
            class238.method1491((byte) 89);
            return;
        }
        if (arg0 <= 91) {
            method3807(null, -84, 76, (byte) 97, -86, null, -43, -71, null);
        }
        class29.method297(255);
        class337.method1981(6758);
        class251.method1529((byte) -107);
        for (int var31 = class461.field6637.method1682(0, true); var31 != -1; var31 = class461.field6637.method1682(0, false)) {
            class677.method3640(var31, 63);
            class13.field187[class272.method1629(class111.field1369++, 31)] = var31;
        }
        for (class548 var32 = class161.method994((byte) -25); var32 != null; var32 = class161.method994((byte) -122)) {
            int var33 = var32.method3129(2053437664);
            int var34 = var32.method3124(-9816);
            if (var33 == 1) {
                class173.field2267[var34] = var32.field7725;
                class125.field1497 |= class665.field9111[var34];
                class260.field3303[class272.method1629(class757.field10538++, 31)] = var34;
            } else if (var33 == 2) {
                class702.field9903[var34] = var32.field7727;
                class688.field9759[class272.method1629(31, class610.field8448++)] = var34;
            } else if (var33 == 3) {
                class460 var58 = class102.method684(5025, var34);
                if (!var32.field7727.equals(var58.field6609)) {
                    var58.field6609 = var32.field7727;
                    class663.method3591(16886, var58);
                }
            } else if (var33 == 4) {
                class460 var35 = class102.method684(5025, var34);
                int var36 = var32.field7725;
                int var37 = var32.field7726;
                int var38 = var32.field7728;
                if (var35.field6525 != var36 || var35.field6625 != var37 || var35.field6479 != var38) {
                    var35.field6479 = var38;
                    var35.field6625 = var37;
                    var35.field6525 = var36;
                    class663.method3591(16886, var35);
                }
            } else if (var33 == 5) {
                class460 var39 = class102.method684(5025, var34);
                if (var32.field7725 != var39.field6477 || var32.field7725 == -1) {
                    var39.field6477 = var32.field7725;
                    var39.field6622 = 1;
                    var39.field6498 = 0;
                    var39.field6564 = 0;
                    class747 var40 = var39.field6477 == -1 ? null : class646.field8903.method643(var39.field6477, -84);
                    if (var40 != null) {
                        class713.method3942((byte) -57, var39.field6498, var40);
                    }
                    class663.method3591(16886, var39);
                }
            } else if (var33 == 6) {
                int var52 = var32.field7725;
                int var53 = var52 >> 10 & 0x1F;
                int var54 = var52 >> 5 & 0x1F;
                int var55 = var52 & 0x1F;
                int var56 = (var53 << 19) + (var54 << 11) + (var55 << 3);
                class460 var57 = class102.method684(5025, var34);
                if (var57.field6569 != var56) {
                    var57.field6569 = var56;
                    class663.method3591(16886, var57);
                }
            } else if (var33 == 7) {
                class460 var41 = class102.method684(5025, var34);
                boolean var42 = var32.field7725 == 1;
                if (var41.field6611 != var42) {
                    var41.field6611 = var42;
                    class663.method3591(16886, var41);
                }
            } else if (var33 == 8) {
                class460 var43 = class102.method684(5025, var34);
                if (var32.field7725 != var43.field6561 || var32.field7726 != var43.field6606 || var32.field7728 != var43.field6573) {
                    var43.field6606 = var32.field7726;
                    var43.field6561 = var32.field7725;
                    var43.field6573 = var32.field7728;
                    if (var43.field6556 != -1) {
                        if (var43.field6613 > 0) {
                            var43.field6573 = var43.field6573 * 32 / var43.field6613;
                        } else if (var43.field6610 > 0) {
                            var43.field6573 = var43.field6573 * 32 / var43.field6610;
                        }
                    }
                    class663.method3591(16886, var43);
                }
            } else if (var33 == 9) {
                class460 var51 = class102.method684(5025, var34);
                if (var32.field7725 != var51.field6556 || var32.field7726 != var51.field6470) {
                    var51.field6556 = var32.field7725;
                    var51.field6470 = var32.field7726;
                    class663.method3591(16886, var51);
                }
            } else if (var33 == 10) {
                class460 var50 = class102.method684(5025, var34);
                if (var32.field7725 != var50.field6508 || var32.field7726 != var50.field6469 || var32.field7728 != var50.field6563) {
                    var50.field6469 = var32.field7726;
                    var50.field6508 = var32.field7725;
                    var50.field6563 = var32.field7728;
                    class663.method3591(16886, var50);
                }
            } else if (var33 == 11) {
                class460 var44 = class102.method684(5025, var34);
                var44.field6577 = 0;
                var44.field6572 = var44.field6624 = var32.field7725;
                var44.field6591 = 0;
                var44.field6543 = var44.field6502 = var32.field7726;
                class663.method3591(16886, var44);
            } else if (var33 == 12) {
                class460 var45 = class102.method684(5025, var34);
                int var46 = var32.field7725;
                if (var45 != null && var45.field6483 == 0) {
                    if (var45.field6512 - var45.field6514 < var46) {
                        var46 = var45.field6512 - var45.field6514;
                    }
                    if (var46 < 0) {
                        var46 = 0;
                    }
                    if (var45.field6466 != var46) {
                        var45.field6466 = var46;
                        class663.method3591(16886, var45);
                    }
                }
            } else if (var33 == 14) {
                class460 var49 = class102.method684(5025, var34);
                var49.field6491 = var32.field7725;
            } else if (var33 == 15) {
                class333.field4292 = var32.field7725;
                class571.field7966 = true;
                class721.field10159 = var32.field7726;
            } else if (var33 == 16) {
                class460 var48 = class102.method684(5025, var34);
                var48.field6633 = var32.field7725;
            } else if (var33 == 17) {
                class460 var47 = class102.method684(5025, var34);
                var47.field6519 = var32.field7725;
            }
        }
        class591.field8232++;
        if (class426.field6054 != 0) {
            class747.field10445 += 20;
            if (class747.field10445 >= 400) {
                class426.field6054 = 0;
            }
        }
        if (class542.field7639 != null) {
            class623.field8702++;
            if (class623.field8702 >= 15) {
                class663.method3591(16886, class542.field7639);
                class542.field7639 = null;
            }
        }
        class513.field7225 = false;
        class33.field519 = null;
        class412.field5821 = null;
        class424.field6048 = false;
        class560.method3165(null, 0, -1, -1);
        class460.method2700(null, -1, -1, -5);
        if (!class138.field1656) {
            class105.field1289 = -1;
        }
        class125.method811(0);
        class215.field2727++;
        if (class130.field1563) {
            class123.field1467++;
            class650 var59 = class314.method1837(class14.field197, true, class625.field8727);
            var59.field8928.method1102(class197.field2535 | class480.field6856 << 28 | class607.field8421 << 14, -120);
            class108.method745(var59, -82);
            class130.field1563 = false;
        }
        while (true) {
            class575 var60;
            class460 var61;
            class460 var62;
            do {
                var60 = (class575) class633.field8776.method3115(1210318848);
                if (var60 == null) {
                    while (true) {
                        class575 var63;
                        class460 var64;
                        class460 var65;
                        do {
                            var63 = (class575) class393.field5486.method3115(1210318848);
                            if (var63 == null) {
                                while (true) {
                                    class575 var66;
                                    class460 var67;
                                    class460 var68;
                                    do {
                                        var66 = (class575) class278.field3517.method3115(1210318848);
                                        if (var66 == null) {
                                            if (class412.field5821 == null) {
                                                class598.field8294 = 0;
                                            }
                                            if (class85.field1090 != null) {
                                                class83.method591(118);
                                            }
                                            if (class408.field5753 > 0 && class333.field4297.method2924(-30303, 82) && class333.field4297.method2924(-30303, 81) && class8.field90 != 0) {
                                                int var69 = class339.field4374.field5779 - class8.field90;
                                                if (var69 < 0) {
                                                    var69 = 0;
                                                } else if (var69 > 3) {
                                                    var69 = 3;
                                                }
                                                class311.method1815(class63.field851 + class339.field4374.field435[0], 63, var69, class753.field10509 + class339.field4374.field426[0]);
                                            }
                                            class160.method989((byte) -36);
                                            for (int var70 = 0; var70 < 5; var70++) {
                                                int var10002 = class332.field4209[var70]++;
                                            }
                                            if (class125.field1497 && class97.method654((byte) 86) - 60000L > class619.field8676) {
                                                class61.method477(false);
                                            }
                                            for (class248 var71 = (class248) class159.field2044.method1839(-118); var71 != null; var71 = (class248) class159.field2044.method1836((byte) -26)) {
                                                if (class97.method654((byte) 81) / 1000L - 5L > (long) var71.field3159) {
                                                    if (var71.field3160 > 0) {
                                                        class673.method3627((byte) -127, "", "", 5, "", 0, var71.field3165 + class586.field8144.method3261(class416.field5920, (byte) 82));
                                                    }
                                                    if (var71.field3160 == 0) {
                                                        class673.method3627((byte) -127, "", "", 5, "", 0, var71.field3165 + class586.field8145.method3261(class416.field5920, (byte) 82));
                                                    }
                                                    var71.method3869(true);
                                                }
                                            }
                                            class756.field10534++;
                                            if (class756.field10534 > 500) {
                                                class756.field10534 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x1) == 1) {
                                                    class703.field9922 += class296.field3850;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class409.field5778 += class219.field2791;
                                                }
                                                if ((var72 & 0x4) == 4) {
                                                    class401.field5560 += class756.field10531;
                                                }
                                            }
                                            if (class703.field9922 < -50) {
                                                class296.field3850 = 2;
                                            }
                                            if (class703.field9922 > 50) {
                                                class296.field3850 = -2;
                                            }
                                            if (class409.field5778 < -55) {
                                                class219.field2791 = 2;
                                            }
                                            if (class401.field5560 < -40) {
                                                class756.field10531 = 1;
                                            }
                                            if (class409.field5778 > 55) {
                                                class219.field2791 = -2;
                                            }
                                            if (class401.field5560 > 40) {
                                                class756.field10531 = -1;
                                            }
                                            class261.field3319++;
                                            if (class261.field3319 > 500) {
                                                class261.field3319 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x2) == 2) {
                                                    class3.field16 += class303.field3904;
                                                }
                                                if ((var73 & 0x1) == 1) {
                                                    class10.field112 += class267.field3378;
                                                }
                                            }
                                            if (class10.field112 < -60) {
                                                class267.field3378 = 2;
                                            }
                                            if (class10.field112 > 60) {
                                                class267.field3378 = -2;
                                            }
                                            if (class3.field16 < -20) {
                                                class303.field3904 = 1;
                                            }
                                            class462.field6704++;
                                            if (class3.field16 > 10) {
                                                class303.field3904 = -1;
                                            }
                                            if (class462.field6704 > 50) {
                                                class696.field9863++;
                                                class650 var74 = class314.method1837(class572.field7973, true, class625.field8727);
                                                class108.method745(var74, -22);
                                            }
                                            if (class224.field2950) {
                                                class441.method2600((byte) -91);
                                                class224.field2950 = false;
                                            }
                                            try {
                                                class704.method3905((byte) 113);
                                                return;
                                            } catch (IOException var75) {
                                                class238.method1491((byte) 108);
                                                return;
                                            }
                                        }
                                        var67 = var66.field8028;
                                        if (var67.field6601 < 0) {
                                            break;
                                        }
                                        var68 = class102.method684(5025, var67.field6528);
                                    } while (var68 == null || var68.field6567 == null || var68.field6567.length <= var67.field6601 || var68.field6567[var67.field6601] != var67);
                                    class445.method2625(var66);
                                }
                            }
                            var64 = var63.field8028;
                            if (var64.field6601 < 0) {
                                break;
                            }
                            var65 = class102.method684(5025, var64.field6528);
                        } while (var65 == null || var65.field6567 == null || var64.field6601 >= var65.field6567.length || var65.field6567[var64.field6601] != var64);
                        class445.method2625(var63);
                    }
                }
                var61 = var60.field8028;
                if (var61.field6601 < 0) {
                    break;
                }
                var62 = class102.method684(5025, var61.field6528);
            } while (var62 == null || var62.field6567 == null || var62.field6567.length <= var61.field6601 || var62.field6567[var61.field6601] != var61);
            class445.method2625(var60);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIII)V", line = 1821)
    private final void method3800(int arg0, int arg1, int arg2, int arg3) {
        field9698++;
        this.field9700[arg3][arg2] = class272.method1629(this.field9700[arg3][arg2], ~arg1);
        int var5 = 103 / ((-arg0 - 63) / 35);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIB)Z", line = 1831)
    public final boolean method3801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field9691++;
        if (arg3 == 1) {
            if (arg1 == arg6 && arg0 == arg5) {
                return true;
            }
        } else if (arg1 >= arg6 && arg3 + arg6 - 1 >= arg1 && arg5 <= arg5 && arg5 <= (arg3 + arg5 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field9685;
        if (arg7 <= 117) {
            this.field9700 = null;
        }
        int var10 = arg5 - this.field9679;
        int var11 = arg6 - this.field9685;
        int var12 = arg0 - this.field9679;
        if (arg3 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field9700[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field9700[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field9700[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field9700[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field9700[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field9700[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field9700[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field9700[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field9700[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field9700[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field9700[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field9700[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg3 + var11 - 1;
            int var14 = arg3 + var12 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var9 + 1) == var11 && var12 <= var10 && var14 >= var10 && (this.field9700[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 - arg3) == var12 && (this.field9700[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - arg3 == var11 && var10 >= var12 && var14 >= var10 && (this.field9700[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 - arg3) == var12 && (this.field9700[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - arg3 == var11 && var12 <= var10 && var14 >= var10 && (this.field9700[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var10 + 1) == var12 && (this.field9700[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var14 && (this.field9700[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12 && (this.field9700[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field9700[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var9 && var9 <= var13 && var10 - arg3 == var12 && (this.field9700[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg3) == var11 && var10 >= var12 && var10 <= var14 && (this.field9700[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field9700[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZIIIIII)Z", line = 2019)
    public final boolean method3802(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9703++;
        if (arg6 > 1) {
            return class406.method2409((byte) -116, arg3, arg1, arg7, arg6, arg0, arg5, arg6, arg8) ? true : this.method3797(arg6, arg7, arg5, arg8, arg3, arg6, arg4, arg0, (byte) 118, arg1);
        }
        int var10 = arg0 + arg3 - 1;
        int var11 = arg5 + arg7 - 1;
        if (arg1 >= arg0 && var10 >= arg1 && arg8 >= arg5 && var11 >= arg8) {
            return true;
        } else if ((arg0 - 1) == arg1 && arg8 >= arg5 && arg8 <= var11 && (this.field9700[arg1 - this.field9685][arg8 - this.field9679] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg1 && arg5 <= arg8 && var11 >= arg8 && (this.field9700[arg1 - this.field9685][arg8 - this.field9679] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if ((arg5 - 1) == arg8 && arg1 >= arg0 && arg1 <= var10 && (this.field9700[arg1 - this.field9685][arg8 - this.field9679] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else if (var11 + 1 == arg8 && arg1 >= arg0 && arg1 <= var10 && (this.field9700[arg1 - this.field9685][arg8 - this.field9679] & 0x20) == 0 && (arg4 & 0x1) == 0) {
            return true;
        } else {
            return !arg2;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)V", line = 2062)
    public final void method3803(int arg0, int arg1, boolean arg2) {
        field9692++;
        int var4 = arg0 - this.field9685;
        int var5 = arg1 - this.field9679;
        this.field9700[var4][var5] = class272.method1629(this.field9700[var4][var5], -2097153);
        if (!arg2) {
            this.method3794(51);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V", line = 2075)
    public final void method3804(int arg0, int arg1, int arg2) {
        field9680++;
        int var4 = -107 / ((40 - arg1) / 48);
        int var5 = arg2 - this.field9685;
        int var6 = arg0 - this.field9679;
        this.field9700[var5][var6] = class216.method1308(this.field9700[var5][var6], 2097152);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 2088)
    public static void method3805(boolean arg0) {
        if (!arg0) {
            field9704 = null;
            field9701 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)V", line = 2099)
    public final void method3806(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field9679;
        field9697++;
        int var5 = arg0 - this.field9685;
        this.field9700[var5][var4] = class216.method1308(this.field9700[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Laa;IIBILha;IILgaa;)V", line = 2113)
    public static final void method3807(class81 arg0, int arg1, int arg2, byte arg3, int arg4, class454 arg5, int arg6, int arg7, class460 arg8) {
        field9684++;
        class351 var9 = class37.field551.method2765(36, arg7);
        if (arg3 != -40) {
            field9701 = null;
        }
        if (var9 == null || !var9.field4613 || !var9.method2065(true, class461.field6637)) {
            return;
        }
        if (var9.field4614 != null) {
            int[] var10 = new int[var9.field4614.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var28;
                if (class276.field3497 == 4) {
                    var28 = (int) class748.field10471 & 0x3FFF;
                } else {
                    var28 = (int) class748.field10471 + class10.field112 & 0x3FFF;
                }
                int var29 = class138.field1644[var28];
                int var30 = class138.field1645[var28];
                if (class276.field3497 != 4) {
                    var30 = var30 * 256 / (class3.field16 + 256);
                    var29 = var29 * 256 / (class3.field16 + 256);
                }
                var10[var11 * 2] = ((var9.field4614[var11 * 2] * 4 + arg1) * var30 + (var9.field4614[var11 * 2 + 1] * 4 + arg2) * var29 >> 14) + arg8.field6566 / 2 + arg4;
                var10[var11 * 2 + 1] = arg8.field6514 / 2 + arg6 - ((var9.field4614[var11 * 2 - -1] * 4 + arg2) * var30 + -((var9.field4614[var11 * 2] * 4 + arg1) * var29) >> 14);
            }
            class212.method1293(arg5, var10, var9.field4598, arg8.field6511, arg8.field6585);
            if (var9.field4592 > 0) {
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    int var20 = var10[var12 * 2];
                    int var21 = var10[var12 * 2 + 1];
                    int var22 = var10[(var12 + 1) * 2];
                    int var23 = var10[var12 * 2 + 2 + 1];
                    if (var20 > var22) {
                        int var25 = var20;
                        int var26 = var21;
                        var20 = var22;
                        var21 = var23;
                        var22 = var25;
                        var23 = var26;
                    } else if (var20 == var22 && var21 > var23) {
                        int var24 = var21;
                        var21 = var23;
                        var23 = var24;
                    }
                    arg5.method181(var20, var21, var22, var23, var9.field4628[var9.field4605[var12] & 0xFF], 1, arg0, arg4, arg6, var9.field4592, var9.field4594, var9.field4591);
                }
                int var13 = var10[var10.length - 2];
                int var14 = var10[var10.length - 1];
                int var15 = var10[0];
                int var16 = var10[1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var16 < var14) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg5.method181(var13, var14, var15, var16, var9.field4628[var9.field4605[var9.field4605.length - 1] & 0xFF], 1, arg0, arg4, arg6, var9.field4592, var9.field4594, var9.field4591);
            } else {
                for (int var27 = 0; var27 < (var10.length / 2 - 1); var27++) {
                    arg5.method121(var10[var27 * 2], var10[var27 * 2 + 1], var10[var27 * 2 + 2], var10[(var27 + 1) * 2 + 1], var9.field4628[var9.field4605[var27] & 0xFF], 1, arg0, arg4, arg6);
                }
                arg5.method121(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field4628[var9.field4605[var9.field4605.length - 1] & 0xFF], 1, arg0, arg4, arg6);
            }
        }
        class712 var31 = null;
        if (var9.field4593 != -1) {
            var31 = var9.method2067(false, arg5, -11446);
            if (var31 != null) {
                class469.method2763(arg4, arg1, arg6, arg8, arg2, (byte) 47, arg0, var31);
            }
        }
        if (var9.field4599 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method1893();
        }
        class423 var33 = class524.field7408;
        class56 var34 = class324.field4132;
        if (var9.field4590 == 1) {
            var33 = class543.field7644;
            var34 = class619.field8670;
        }
        if (var9.field4590 == 2) {
            var34 = class111.field1373;
            var33 = class100.field1234;
        }
        class47.method386(var9.field4616, var33, arg1, var32, var9.field4599, arg6, var34, arg0, 7417, arg8, arg4, arg2);
        return;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIII)Z", line = 2290)
    public final boolean method3808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9686++;
        if (arg1 == 1) {
            if (arg3 == arg6 && arg0 == arg7) {
                return true;
            }
        } else if (arg6 <= arg3 && arg3 <= (arg1 + arg6 - 1) && arg7 <= arg7 && (arg1 + arg7 - 1) >= arg7) {
            return true;
        }
        int var9 = arg0 - this.field9679;
        if (arg2 >= -16) {
            this.field9681 = -2;
        }
        int var10 = arg3 - this.field9685;
        int var11 = arg6 - this.field9685;
        int var12 = arg7 - this.field9679;
        if (arg1 == 1) {
            if (arg4 == 0) {
                if (arg5 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9700[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9700[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field9700[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field9700[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9700[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9700[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field9700[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field9700[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field9700[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field9700[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field9700[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9700[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field9700[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9700[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field9700[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field9700[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var10 == var11 && (var12 + 1) == var9 && (this.field9700[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field9700[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field9700[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field9700[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 - (1 - arg1);
            int var14 = arg1 + var9 - 1;
            if (arg4 == 0) {
                if (arg5 == 0) {
                    if (var10 - arg1 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 + 1) == var9 && (this.field9700[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 - arg1 == var9 && (this.field9700[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 - arg1) == var11 && var12 >= var9 && var14 >= var12 && (this.field9700[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12 && (this.field9700[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9 && (this.field9700[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 - arg1 == var9 && (this.field9700[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg1) == var9) {
                        return true;
                    }
                    if ((var10 - arg1) == var11 && var12 >= var9 && var14 >= var12 && (this.field9700[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12 && (this.field9700[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    if ((var10 - arg1) == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12 && (this.field9700[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg1) == var9 && (this.field9700[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - arg1) == var11 && var12 >= var9 && var12 <= var14 && (this.field9700[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 - arg1) == var9 && (this.field9700[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg1 == var11 && var9 <= var12 && var14 >= var12 && (this.field9700[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field9700[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 - arg1) == var9) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 - arg1 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9 && (this.field9700[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14 && (this.field9700[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg1) == var9) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9 && (this.field9700[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var13 >= var10 && var12 - arg1 == var9 && (this.field9700[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg1 == var11 && var9 <= var12 && var14 >= var12 && (this.field9700[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14 && (this.field9700[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([FII)[F", line = 2664)
    public static final float[] method3809(float[] arg0, int arg1, int arg2) {
        field9702++;
        float[] var3 = new float[arg1];
        class617.method3387(arg0, 0, var3, 0, arg1);
        return arg2 == 1 ? var3 : null;
    }
}
