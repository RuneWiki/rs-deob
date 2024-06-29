import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class274 {

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lmea;")
    public static class451 field3954 = null;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Z")
    public static boolean field3955 = false;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lha;")
    public static class65 field3951;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "[[I")
    public int[][] field3974;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 4)
    public static final void method1761(int arg0, Canvas arg1) {
        if (arg0 != 1) {
            method1767(null, 25);
        }
        field3976++;
        Dimension var2 = arg1.getSize();
        class368.method2298(var2.width, var2.height, arg0 - 1);
        if (class763.field10520 == 1) {
            class571.field8060.method507(arg1, class194.field2992, class549.field7896);
        } else {
            class571.field8060.method507(arg1, class355.field4991, class82.field908);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIZIII)V", line = 27)
    public final void method1762(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field3968;
        int var9 = arg4 - this.field3978;
        field3966++;
        if (arg2 != -21772) {
            field3954 = null;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1765(128, false, var8, var9);
                this.method1765(8, false, var8 - 1, var9);
            }
            if (arg1 == 1) {
                this.method1765(2, false, var8, var9);
                this.method1765(32, false, var8, var9 + 1);
            }
            if (arg1 == 2) {
                this.method1765(8, false, var8, var9);
                this.method1765(128, false, var8 + 1, var9);
            }
            if (arg1 == 3) {
                this.method1765(32, false, var8, var9);
                this.method1765(2, false, var8, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1765(1, false, var8, var9);
                this.method1765(16, false, var8 - 1, var9 + 1);
            }
            if (arg1 == 1) {
                this.method1765(4, false, var8, var9);
                this.method1765(64, false, var8 + 1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method1765(16, false, var8, var9);
                this.method1765(1, false, var8 + 1, var9 + -1);
            }
            if (arg1 == 3) {
                this.method1765(64, false, var8, var9);
                this.method1765(4, false, var8 - 1, var9 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method1765(130, false, var8, var9);
                this.method1765(8, false, var8 - 1, var9);
                this.method1765(32, false, var8, var9 + 1);
            }
            if (arg1 == 1) {
                this.method1765(10, false, var8, var9);
                this.method1765(32, false, var8, var9 + 1);
                this.method1765(128, false, var8 + 1, var9);
            }
            if (arg1 == 2) {
                this.method1765(40, false, var8, var9);
                this.method1765(128, false, var8 + 1, var9);
                this.method1765(2, false, var8, var9 - 1);
            }
            if (arg1 == 3) {
                this.method1765(160, false, var8, var9);
                this.method1765(2, false, var8, var9 - 1);
                this.method1765(8, false, var8 - 1, var9);
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    this.method1765(65536, false, var8, var9);
                    this.method1765(4096, false, var8 - 1, var9);
                }
                if (arg1 == 1) {
                    this.method1765(1024, false, var8, var9);
                    this.method1765(16384, false, var8, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method1765(4096, false, var8, var9);
                    this.method1765(65536, false, var8 + 1, var9);
                }
                if (arg1 == 3) {
                    this.method1765(16384, false, var8, var9);
                    this.method1765(1024, false, var8, var9 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg1 == 0) {
                    this.method1765(512, false, var8, var9);
                    this.method1765(8192, false, var8 - 1, var9 - -1);
                }
                if (arg1 == 1) {
                    this.method1765(2048, false, var8, var9);
                    this.method1765(32768, false, var8 + 1, var9 - -1);
                }
                if (arg1 == 2) {
                    this.method1765(8192, false, var8, var9);
                    this.method1765(512, false, var8 + 1, var9 + -1);
                }
                if (arg1 == 3) {
                    this.method1765(32768, false, var8, var9);
                    this.method1765(2048, false, var8 - 1, var9 + -1);
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    this.method1765(66560, false, var8, var9);
                    this.method1765(4096, false, var8 - 1, var9);
                    this.method1765(16384, false, var8, var9 + 1);
                }
                if (arg1 == 1) {
                    this.method1765(5120, false, var8, var9);
                    this.method1765(16384, false, var8, var9 + 1);
                    this.method1765(65536, false, var8 + 1, var9);
                }
                if (arg1 == 2) {
                    this.method1765(20480, false, var8, var9);
                    this.method1765(65536, false, var8 + 1, var9);
                    this.method1765(1024, false, var8, var9 - 1);
                }
                if (arg1 == 3) {
                    this.method1765(81920, false, var8, var9);
                    this.method1765(1024, false, var8, var9 - 1);
                    this.method1765(4096, false, var8 - 1, var9);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1765(536870912, false, var8, var9);
                this.method1765(33554432, false, var8 - 1, var9);
            }
            if (arg1 == 1) {
                this.method1765(8388608, false, var8, var9);
                this.method1765(134217728, false, var8, var9 + 1);
            }
            if (arg1 == 2) {
                this.method1765(33554432, false, var8, var9);
                this.method1765(536870912, false, var8 + 1, var9);
            }
            if (arg1 == 3) {
                this.method1765(134217728, false, var8, var9);
                this.method1765(8388608, false, var8, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1765(4194304, false, var8, var9);
                this.method1765(67108864, false, var8 - 1, var9 - -1);
            }
            if (arg1 == 1) {
                this.method1765(16777216, false, var8, var9);
                this.method1765(268435456, false, var8 + 1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method1765(67108864, false, var8, var9);
                this.method1765(4194304, false, var8 + 1, var9 + -1);
            }
            if (arg1 == 3) {
                this.method1765(268435456, false, var8, var9);
                this.method1765(16777216, false, var8 - 1, var9 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1765(545259520, false, var8, var9);
            this.method1765(33554432, false, var8 - 1, var9);
            this.method1765(134217728, false, var8, var9 + 1);
        }
        if (arg1 == 1) {
            this.method1765(41943040, false, var8, var9);
            this.method1765(134217728, false, var8, var9 + 1);
            this.method1765(536870912, false, var8 + 1, var9);
        }
        if (arg1 == 2) {
            this.method1765(167772160, false, var8, var9);
            this.method1765(536870912, false, var8 + 1, var9);
            this.method1765(8388608, false, var8, var9 - 1);
        }
        if (arg1 == 3) {
            this.method1765(671088640, false, var8, var9);
            this.method1765(8388608, false, var8, var9 - 1);
            this.method1765(33554432, false, var8 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI)V", line = 330)
    public final void method1763(int arg0, boolean arg1, int arg2) {
        field3963++;
        int var4 = arg0 - this.field3968;
        int var5 = arg2 - this.field3978;
        this.field3974[var4][var5] = class746.method4158(this.field3974[var4][var5], 2097152);
        if (!arg1) {
            method1777(null, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 346)
    public static void method1764(int arg0) {
        if (arg0 != 0) {
            field3962 = 84;
        }
        field3954 = null;
        field3951 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZII)V", line = 361)
    private final void method1765(int arg0, boolean arg1, int arg2, int arg3) {
        this.field3974[arg2][arg3] = class746.method4158(this.field3974[arg2][arg3], arg0);
        if (arg1) {
            this.method1775((byte) -30, 80, 71);
        }
        field3956++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIZBIZ)V", line = 378)
    public final void method1766(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, boolean arg6) {
        field3964++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var9 = arg1 - this.field3978;
        int var10 = arg2 - this.field3968;
        for (int var11 = var10; var11 < arg0 + var10; var11++) {
            if (var11 >= 0 && var11 < this.field3959) {
                for (int var12 = var9; var12 < arg5 + var9; var12++) {
                    if (var12 >= 0 && this.field3953 > var12) {
                        this.method1765(var8, false, var11, var12);
                    }
                }
            }
        }
        if (arg4 != -110) {
            this.method1768(false, true, -74, 22, -124, -104, -75);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lwia;I)I", line = 426)
    public static final int method1767(class791 arg0, int arg1) {
        field3965++;
        int var2 = 0;
        if (arg0.method4349((byte) -102, class656.field9144)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class10.field204)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class632.field8876)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class445.field6055)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class622.field8742)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class471.field6613)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class219.field3383)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class89.field1007)) {
            var2++;
        }
        if (arg1 != 0) {
            field3951 = null;
        }
        if (arg0.method4349((byte) -102, class103.field1190)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class290.field4245)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class479.field6735)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class358.field5029)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class255.field3752)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class737.field10171)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class576.field8126)) {
            var2++;
        }
        if (arg0.method4349((byte) -102, class209.field3241)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZIIIII)V", line = 496)
    public final void method1768(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field3978;
        int var9 = arg3 - this.field3968;
        if (arg6 < 60) {
            return;
        }
        field3973++;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1773(var8, (byte) 14, var9, 128);
                this.method1773(var8, (byte) 14, var9 - 1, 8);
            }
            if (arg4 == 1) {
                this.method1773(var8, (byte) 14, var9, 2);
                this.method1773(var8 + 1, (byte) 14, var9, 32);
            }
            if (arg4 == 2) {
                this.method1773(var8, (byte) 14, var9, 8);
                this.method1773(var8, (byte) 14, var9 + 1, 128);
            }
            if (arg4 == 3) {
                this.method1773(var8, (byte) 14, var9, 32);
                this.method1773(var8 - 1, (byte) 14, var9, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1773(var8, (byte) 14, var9, 1);
                this.method1773(var8 + 1, (byte) 14, var9 - 1, 16);
            }
            if (arg4 == 1) {
                this.method1773(var8, (byte) 14, var9, 4);
                this.method1773(var8 + 1, (byte) 14, var9 + 1, 64);
            }
            if (arg4 == 2) {
                this.method1773(var8, (byte) 14, var9, 16);
                this.method1773(var8 - 1, (byte) 14, var9 + 1, 1);
            }
            if (arg4 == 3) {
                this.method1773(var8, (byte) 14, var9, 64);
                this.method1773(var8 - 1, (byte) 14, var9 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method1773(var8, (byte) 14, var9, 130);
                this.method1773(var8, (byte) 14, var9 - 1, 8);
                this.method1773(var8 + 1, (byte) 14, var9, 32);
            }
            if (arg4 == 1) {
                this.method1773(var8, (byte) 14, var9, 10);
                this.method1773(var8 + 1, (byte) 14, var9, 32);
                this.method1773(var8, (byte) 14, var9 + 1, 128);
            }
            if (arg4 == 2) {
                this.method1773(var8, (byte) 14, var9, 40);
                this.method1773(var8, (byte) 14, var9 + 1, 128);
                this.method1773(var8 - 1, (byte) 14, var9, 2);
            }
            if (arg4 == 3) {
                this.method1773(var8, (byte) 14, var9, 160);
                this.method1773(var8 - 1, (byte) 14, var9, 2);
                this.method1773(var8, (byte) 14, var9 - 1, 8);
            }
        }
        if (arg0) {
            if (arg2 == 0) {
                if (arg4 == 0) {
                    this.method1773(var8, (byte) 14, var9, 65536);
                    this.method1773(var8, (byte) 14, var9 - 1, 4096);
                }
                if (arg4 == 1) {
                    this.method1773(var8, (byte) 14, var9, 1024);
                    this.method1773(var8 + 1, (byte) 14, var9, 16384);
                }
                if (arg4 == 2) {
                    this.method1773(var8, (byte) 14, var9, 4096);
                    this.method1773(var8, (byte) 14, var9 + 1, 65536);
                }
                if (arg4 == 3) {
                    this.method1773(var8, (byte) 14, var9, 16384);
                    this.method1773(var8 - 1, (byte) 14, var9, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg4 == 0) {
                    this.method1773(var8, (byte) 14, var9, 512);
                    this.method1773(var8 + 1, (byte) 14, var9 - 1, 8192);
                }
                if (arg4 == 1) {
                    this.method1773(var8, (byte) 14, var9, 2048);
                    this.method1773(var8 + 1, (byte) 14, var9 + 1, 32768);
                }
                if (arg4 == 2) {
                    this.method1773(var8, (byte) 14, var9, 8192);
                    this.method1773(var8 - 1, (byte) 14, var9 + 1, 512);
                }
                if (arg4 == 3) {
                    this.method1773(var8, (byte) 14, var9, 32768);
                    this.method1773(var8 - 1, (byte) 14, var9 - 1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    this.method1773(var8, (byte) 14, var9, 66560);
                    this.method1773(var8, (byte) 14, var9 - 1, 4096);
                    this.method1773(var8 + 1, (byte) 14, var9, 16384);
                }
                if (arg4 == 1) {
                    this.method1773(var8, (byte) 14, var9, 5120);
                    this.method1773(var8 + 1, (byte) 14, var9, 16384);
                    this.method1773(var8, (byte) 14, var9 + 1, 65536);
                }
                if (arg4 == 2) {
                    this.method1773(var8, (byte) 14, var9, 20480);
                    this.method1773(var8, (byte) 14, var9 + 1, 65536);
                    this.method1773(var8 - 1, (byte) 14, var9, 1024);
                }
                if (arg4 == 3) {
                    this.method1773(var8, (byte) 14, var9, 81920);
                    this.method1773(var8 - 1, (byte) 14, var9, 1024);
                    this.method1773(var8, (byte) 14, var9 - 1, 4096);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1773(var8, (byte) 14, var9, 536870912);
                this.method1773(var8, (byte) 14, var9 - 1, 33554432);
            }
            if (arg4 == 1) {
                this.method1773(var8, (byte) 14, var9, 8388608);
                this.method1773(var8 + 1, (byte) 14, var9, 134217728);
            }
            if (arg4 == 2) {
                this.method1773(var8, (byte) 14, var9, 33554432);
                this.method1773(var8, (byte) 14, var9 + 1, 536870912);
            }
            if (arg4 == 3) {
                this.method1773(var8, (byte) 14, var9, 134217728);
                this.method1773(var8 - 1, (byte) 14, var9, 8388608);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1773(var8, (byte) 14, var9, 4194304);
                this.method1773(var8 + 1, (byte) 14, var9 - 1, 67108864);
            }
            if (arg4 == 1) {
                this.method1773(var8, (byte) 14, var9, 16777216);
                this.method1773(var8 + 1, (byte) 14, var9 + 1, 268435456);
            }
            if (arg4 == 2) {
                this.method1773(var8, (byte) 14, var9, 67108864);
                this.method1773(var8 - 1, (byte) 14, var9 + 1, 4194304);
            }
            if (arg4 == 3) {
                this.method1773(var8, (byte) 14, var9, 268435456);
                this.method1773(var8 - 1, (byte) 14, var9 - 1, 16777216);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1773(var8, (byte) 14, var9, 545259520);
            this.method1773(var8, (byte) 14, var9 - 1, 33554432);
            this.method1773(var8 + 1, (byte) 14, var9, 134217728);
        }
        if (arg4 == 1) {
            this.method1773(var8, (byte) 14, var9, 41943040);
            this.method1773(var8 + 1, (byte) 14, var9, 134217728);
            this.method1773(var8, (byte) 14, var9 + 1, 536870912);
        }
        if (arg4 == 2) {
            this.method1773(var8, (byte) 14, var9, 167772160);
            this.method1773(var8, (byte) 14, var9 + 1, 536870912);
            this.method1773(var8 - 1, (byte) 14, var9, 8388608);
        }
        if (arg4 == 3) {
            this.method1773(var8, (byte) 14, var9, 671088640);
            this.method1773(var8 - 1, (byte) 14, var9, 8388608);
            this.method1773(var8, (byte) 14, var9 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIII)Z", line = 804)
    public final boolean method1769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3970++;
        if (arg0 == 1) {
            if (arg4 == arg6 && arg1 == arg2) {
                return true;
            }
        } else if (arg4 <= arg6 && arg0 + arg4 - 1 >= arg6 && arg2 <= arg2 && arg2 + arg0 - 1 >= arg2) {
            return true;
        }
        int var9 = arg2 - this.field3978;
        int var10 = arg1 - this.field3978;
        if (arg3 != 29514) {
            return false;
        }
        int var11 = arg6 - this.field3968;
        int var12 = arg4 - this.field3968;
        if (arg0 == 1) {
            if (arg7 == 0) {
                if (arg5 == 0) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field3974[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field3974[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 - 1 == var12 && var9 == var10 && (this.field3974[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field3974[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field3974[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field3974[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field3974[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field3974[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg5 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field3974[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field3974[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field3974[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field3974[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field3974[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field3974[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field3974[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field3974[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field3974[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field3974[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var12 && var9 == var10 && (this.field3974[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 == var10 && (this.field3974[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var12 - 1;
            int var14 = var10 + arg0 - 1;
            if (arg7 == 0) {
                if (arg5 == 0) {
                    if ((var11 - arg0) == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field3974[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 - arg0 == var10 && (this.field3974[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 <= var11 && var11 <= var13 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 - arg0 == var12 && var9 >= var10 && var14 >= var9 && (this.field3974[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14 && (this.field3974[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 + 1 == var10 && (this.field3974[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg0) == var10 && (this.field3974[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg0) == var10) {
                        return true;
                    }
                    if ((var11 - arg0) == var12 && var10 <= var9 && var9 <= var14 && (this.field3974[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14 && (this.field3974[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg5 == 0) {
                    if ((var11 - arg0) == var12 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 <= var9 && var9 <= var14 && (this.field3974[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 - arg0 == var10 && (this.field3974[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - arg0 == var12 && var10 <= var9 && var14 >= var9 && (this.field3974[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 - arg0 == var10 && (this.field3974[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - arg0) == var12 && var9 >= var10 && var9 <= var14 && (this.field3974[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field3974[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 - arg0 == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 - arg0) == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field3974[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14 && (this.field3974[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 - arg0 == var10) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var11 >= var12 && var11 <= var13 && (var9 + 1) == var10 && (this.field3974[var11][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 <= var11 && var13 >= var11 && var9 - arg0 == var10 && (this.field3974[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg0) == var12 && var10 <= var9 && var9 <= var14 && (this.field3974[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9 && (this.field3974[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ)V", line = 1177)
    public final void method1770(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field3978;
        field3952++;
        int var5 = arg0 - this.field3968;
        this.field3974[var5][var4] = class702.method3977(this.field3974[var5][var4], -2097153);
        if (arg2) {
            this.method1772(22);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIBIII)Z", line = 1191)
    public final boolean method1771(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field3975++;
        if (arg2 > 1) {
            return class12.method133(arg4, (byte) 64, arg2, arg0, arg6, arg2, arg7, arg3, arg1) ? true : this.method1779(arg6, arg2, arg1, arg7, arg8, arg4, arg0, arg3, arg2, (byte) 73);
        }
        int var10 = arg7 + arg3 - 1;
        int var11 = arg1 + arg0 - 1;
        if (arg4 >= arg7 && arg4 <= var10 && arg6 >= arg0 && var11 >= arg6) {
            return true;
        } else if (arg7 - 1 == arg4 && arg6 >= arg0 && var11 >= arg6 && (this.field3974[arg4 - this.field3968][arg6 - this.field3978] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg0 <= arg6 && var11 >= arg6 && (this.field3974[arg4 - this.field3968][arg6 - this.field3978] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg6 && arg7 <= arg4 && arg4 <= var10 && (this.field3974[arg4 - this.field3968][arg6 - this.field3978] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else if (arg5 <= 26) {
            return true;
        } else {
            return var11 + 1 == arg6 && arg4 >= arg7 && var10 >= arg4 && (this.field3974[arg4 - this.field3968][arg6 - this.field3978] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 1234)
    public final void method1772(int arg0) {
        int var2 = 0;
        if (arg0 != 24754) {
            return;
        }
        while (this.field3959 > var2) {
            for (int var3 = 0; var3 < this.field3953; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field3959 - 5) || this.field3953 - 5 <= var3) {
                    this.field3974[var2][var3] = -1;
                } else {
                    this.field3974[var2][var3] = 2097152;
                }
            }
            var2++;
        }
        field3960++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBII)V", line = 1265)
    private final void method1773(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 14) {
            field3954 = null;
        }
        field3961++;
        this.field3974[arg2][arg0] = class702.method3977(this.field3974[arg2][arg0], ~arg3);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIZZIII)V", line = 1279)
    public final void method1774(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field3967++;
        int var9 = 256;
        if (arg3) {
            var9 |= 0x20000;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg2;
            arg2 = arg6;
            arg6 = var10;
        }
        if (arg0 != -17854) {
            field3962 = -20;
        }
        int var11 = arg7 - this.field3968;
        int var12 = arg1 - this.field3978;
        if (arg4) {
            var9 |= 0x40000000;
        }
        for (int var13 = var11; var13 < var11 + arg2; var13++) {
            if (var13 >= 0 && this.field3959 > var13) {
                for (int var14 = var12; var14 < (arg6 + var12); var14++) {
                    if (var14 >= 0 && this.field3953 > var14) {
                        this.method1773(var14, (byte) 14, var13, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)V", line = 1336)
    public final void method1775(byte arg0, int arg1, int arg2) {
        if (arg0 >= -124) {
            method1767(null, -60);
        }
        field3957++;
        int var4 = arg1 - this.field3978;
        int var5 = arg2 - this.field3968;
        this.field3974[var5][var4] = class702.method3977(this.field3974[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIIIIIII)Z", line = 1352)
    public final boolean method1776(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3971++;
        if (arg1 == 1) {
            if (arg5 == arg6 && arg2 == arg4) {
                return true;
            }
        } else if (arg5 <= arg6 && arg6 <= arg1 + arg5 - 1 && arg2 >= arg2 && arg1 + arg2 - 1 >= arg2) {
            return true;
        }
        int var9 = arg6 - this.field3968;
        int var10 = arg4 - this.field3978;
        int var11 = arg2 - this.field3978;
        int var12 = arg5 - this.field3968;
        if (arg1 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var9 + 1 == var12 && var10 == var11 && (this.field3974[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field3974[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field3974[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field3974[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field3974[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field3974[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field3974[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field3974[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field3974[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var10 && (this.field3974[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field3974[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field3974[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg1 - 1;
            int var14 = var10 + arg1 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var9 + 1) == var12 && var10 <= var11 && var11 <= var14 && (this.field3974[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 - arg1 == var10 && (this.field3974[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var9 - arg1) == var12 && var11 >= var10 && var14 >= var11 && (this.field3974[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var11 - arg1 == var10 && (this.field3974[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 - arg1 == var12 && var11 >= var10 && var14 >= var11 && (this.field3974[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var11 + 1) == var10 && (this.field3974[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var9 + 1) == var12 && var10 <= var11 && var14 >= var11 && (this.field3974[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var11 + 1 == var10 && (this.field3974[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 >= var12 && var13 >= var9 && var11 + 1 == var10 && (this.field3974[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var9 && var9 <= var13 && (var11 - arg1) == var10 && (this.field3974[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg1) == var12 && var11 >= var10 && var11 <= var14 && (this.field3974[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var11 >= var10 && var14 >= var11 && (this.field3974[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (arg0 != 45) {
            field3954 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 1544)
    public static final String method1777(String arg0, byte arg1) {
        field3977++;
        if (arg1 != 67) {
            field3954 = null;
        }
        String var2 = class486.method2897(class381.method2368(arg1 - 67, arg0), arg1 ^ 0x1D);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V", line = 1563)
    public final void method1778(int arg0, int arg1, byte arg2) {
        int var4 = -34 / ((arg2 + 67) / 43);
        field3969++;
        int var5 = arg0 - this.field3978;
        int var6 = arg1 - this.field3968;
        this.field3974[var6][var5] = class746.method4158(this.field3974[var6][var5], 262144);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIIB)Z", line = 1576)
    public final boolean method1779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field3958++;
        int var11 = arg1 + arg5;
        int var12 = arg0 + arg8;
        int var13 = arg3 + arg7;
        int var14 = -22 % ((-arg9 - 30) / 62);
        int var15 = arg2 + arg6;
        if (arg5 == var13 && (arg4 & 0x2) == 0) {
            int var16 = arg6 < arg0 ? arg0 : arg6;
            int var17 = var12 < var15 ? var12 : var15;
            while (var17 > var16) {
                if ((this.field3974[var13 - this.field3968 - 1][var16 - this.field3978] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg3 == var11 && (arg4 & 0x8) == 0) {
            int var18 = arg6 < arg0 ? arg0 : arg6;
            int var19 = var12 < var15 ? var12 : var15;
            while (var18 < var19) {
                if ((this.field3974[arg3 - this.field3968][var18 - this.field3978] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg0 == var15 && (arg4 & 0x1) == 0) {
            int var20 = arg3 >= arg5 ? arg3 : arg5;
            int var21 = var11 < var13 ? var11 : var13;
            while (var20 < var21) {
                if ((this.field3974[var20 - this.field3968][var15 - this.field3978 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg6 == var12 && (arg4 & 0x4) == 0) {
            int var22 = arg3 >= arg5 ? arg3 : arg5;
            int var23 = var11 >= var13 ? var13 : var11;
            while (var23 > var22) {
                if ((this.field3974[var22 - this.field3968][arg6 - this.field3978] & 0x20) == 0) {
                    return true;
                }
                var22++;
            }
        }
        return false;
    }
}
