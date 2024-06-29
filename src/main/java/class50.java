import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class50 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public int field653 = 1;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "J")
    public static long field652 = -1L;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "C")
    public char field658;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BILmc;)V")
    private final void method320(byte arg0, int arg1, class234 arg2) {
        field660++;
        if (arg1 == 1) {
            this.field658 = class752.method4080(arg2.method1554(27806), (byte) 99);
        } else if (arg1 == 2) {
            this.field653 = 0;
        }
        if (arg0 <= 45) {
            this.method320((byte) 82, 65, null);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BIILwm;)Lsu;")
    public static final class615 method321(byte arg0, int arg1, int arg2, class30 arg3) {
        if (arg0 != -89) {
            method326((byte) 125, null);
        }
        field654++;
        byte[] var4 = arg3.method139(arg2, (byte) -94, arg1);
        return var4 == null ? null : new class615(var4);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILha;)V")
    public static final void method322(int arg0, class570 arg1) {
        field656++;
        int var2 = 0;
        int var3 = 0;
        if (class602.field7657) {
            var2 = class498.method2765((byte) -83);
            var3 = class507.method2806((byte) -99);
        }
        int var4 = -10660793;
        class44.method265(class167.field2225, class283.field3665 + var2, true, class71.field968, arg1, class721.field9471 + var3, -16777216, var4);
        class595.field7562.method2419(class721.field9471 + var3 + 14, var4, class659.field8568.method3589(class496.field6338, -22395), -103, class283.field3665 + var2 + 3, arg0);
        int var5 = var2 + class737.field9980.method210(0);
        int var6 = class737.field9980.method208(arg0 ^ 0x32) + var3;
        if (class269.field3555) {
            int var10 = 0;
            for (class403 var11 = (class403) class253.field3440.method3855(0); var11 != null; var11 = (class403) class253.field3440.method3861(true)) {
                int var15 = class721.field9471 + var3 - (-31 - var10 * 16);
                var10++;
                if (var11.field5360 == 1) {
                    class585.method3132(class283.field3665 + var2, class167.field2225, (class765) var11.field5365.field9453.field2279, 86, var5, class71.field968, -256, var15, class721.field9471 + var3, -1, var6, arg1);
                } else {
                    class766.method4164((byte) 63, arg1, class71.field968, -1, -256, var15, class721.field9471 + var3, var11, class167.field2225, var6, var5, class283.field3665 + var2);
                }
            }
            if (class223.field3036 != null) {
                class44.method265(class400.field5303, class29.field256, true, class650.field8290, arg1, class256.field3472, -16777216, var4);
                class595.field7562.method2419(class256.field3472 + 14, var4, class223.field3036.field5366, -104, class29.field256 + 3, -1);
                int var12 = 0;
                for (class765 var13 = (class765) class223.field3036.field5365.method3855(0); var13 != null; var13 = (class765) class223.field3036.field5365.method3861(true)) {
                    int var14 = var12 * 16 + (class256.field3472 + 31);
                    var12++;
                    class585.method3132(class29.field256, class400.field5303, var13, -114, var5, class650.field8290, -256, var14, class256.field3472, -1, var6, arg1);
                }
                class493.method2748(class256.field3472, class650.field8290, class400.field5303, 92, class29.field256);
            }
        } else {
            int var7 = 0;
            for (class765 var8 = (class765) class595.field7563.method3591(arg0 + 1); var8 != null; var8 = (class765) class595.field7563.method3600((byte) 120)) {
                int var9 = (class628.field7982 - var7 - 1) * 16 + var3 + class721.field9471 + 31;
                class585.method3132(class283.field3665 + var2, class167.field2225, var8, 113, var5, class71.field968, -256, var9, class721.field9471 + var3, -1, var6, arg1);
                var7++;
            }
        }
        class493.method2748(class721.field9471 + var3, class71.field968, class167.field2225, arg0 + 91, class283.field3665 + var2);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lwm;Lwm;Lwm;Lwm;B)V")
    public static final void method323(class30 arg0, class30 arg1, class30 arg2, class30 arg3, byte arg4) {
        class722.field9481 = arg2;
        class13.field138 = arg0;
        field657++;
        class192.field2689 = arg3;
        class647.field8259 = new class391[class192.field2689.method143((byte) 106)][];
        if (arg4 <= -37) {
            class202.field2800 = new boolean[class192.field2689.method143((byte) 106)];
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLwm;IIJII)V")
    public static final void method324(boolean arg0, class30 arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        if (arg5 == -31) {
            field655++;
            class668.method3622(arg6, (byte) 17, arg4, arg2, 0, arg1, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lmc;B)V")
    public final void method325(class234 arg0, byte arg1) {
        if (arg1 <= 109) {
            method326((byte) -102, null);
        }
        field651++;
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                return;
            }
            this.method320((byte) 100, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLjf;)I")
    public static final int method326(byte arg0, class667 arg1) {
        if (arg0 < 53) {
            field652 = -49L;
        }
        field659++;
        if (class174.field2285 == arg1) {
            return 7681;
        } else if (class137.field1820 == arg1) {
            return 8448;
        } else if (class361.field4395 == arg1) {
            return 34165;
        } else if (class177.field2325 == arg1) {
            return 260;
        } else if (class224.field3039 == arg1) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
