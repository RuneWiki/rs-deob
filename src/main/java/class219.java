import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class219 extends class583 {

    @OriginalMember(owner = "client!rha", name = "r", descriptor = "Lg;")
    public static class153 field2852 = new class153(8, 1);

    @OriginalMember(owner = "client!rha", name = "x", descriptor = "[I")
    public static int[] field2858 = new int[32];

    @OriginalMember(owner = "client!rha", name = "B", descriptor = "Lgda;")
    public static class53 field2862 = new class53(74, 8);

    @OriginalMember(owner = "client!rha", name = "C", descriptor = "I")
    public static int field2863 = 0;

    @OriginalMember(owner = "client!rha", name = "s", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!rha", name = "t", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!rha", name = "u", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!rha", name = "v", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!rha", name = "w", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!rha", name = "z", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!rha", name = "A", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!rha", name = "y", descriptor = "Lqm;")
    public static class143 field2859;

    @OriginalMember(owner = "client!rha", name = "q", descriptor = "Lkk;")
    private class188 field2851;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(BIFI[FIII[FIIF)V", line = 4)
    public static final void method1341(byte arg0, int arg1, float arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9, int arg10, float arg11) {
        if (arg0 != -25) {
            return;
        }
        int var12 = arg5 - arg9;
        field2857++;
        int var13 = arg6 - arg1;
        int var14 = arg10 - arg3;
        float var15 = arg4[2] * (float) var12 + arg4[1] * (float) var14 + arg4[0] * (float) var13;
        float var16 = arg4[5] * (float) var12 + arg4[4] * (float) var14 + arg4[3] * (float) var13;
        float var17 = arg4[8] * (float) var12 + arg4[7] * (float) var14 + arg4[6] * (float) var13;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg11 != 1.0F) {
            var18 = arg11 * var18;
        }
        float var19 = var16 + arg2 + 0.5F;
        if (arg7 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg7 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg7 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg8[0] = var18;
        arg8[1] = var19;
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(III)V", line = 57)
    public static final void method1342(int arg0, int arg1, int arg2) {
        field2855++;
        class592 var3 = class682.method3825(-652872096, 13, arg2);
        if (arg1 == 11931) {
            var3.method3351(0);
            var3.field8337 = arg0;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V", line = 71)
    public static void method1343(int arg0) {
        field2862 = null;
        field2859 = null;
        field2852 = null;
        field2858 = null;
        if (arg0 <= 101) {
            field2852 = null;
        }
    }

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "(III)I", line = 84)
    public final int method1344(int arg0, int arg1, int arg2) {
        field2856++;
        if (this.field2851 == null) {
            return arg0;
        } else if (arg2 == 6) {
            class756 var4 = (class756) this.field2851.method1180((byte) 26, (long) arg1);
            return var4 == null ? arg0 : var4.field10518;
        } else {
            return 76;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;", line = 105)
    public final String method1345(String arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            this.method1346((byte) -95, null, -55);
        }
        field2854++;
        if (this.field2851 == null) {
            return arg0;
        } else {
            class427 var4 = (class427) this.field2851.method1180((byte) 26, (long) arg2);
            return var4 == null ? arg0 : var4.field5991;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(BLee;I)V", line = 127)
    private final void method1346(byte arg0, class675 arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg1.method3750((byte) 35);
            if (this.field2851 == null) {
                int var5 = class123.method837(111, var4);
                this.field2851 = new class188(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method3750((byte) 35) == 1;
                int var8 = arg1.method3756(false);
                class189 var9;
                if (var7) {
                    var9 = new class427(arg1.method3697(-1));
                } else {
                    var9 = new class756(arg1.method3703(104));
                }
                this.field2851.method1179((long) var8, var9, (byte) -26);
            }
        }
        field2853++;
        int var10 = 8 % ((arg0 - 48) / 44);
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILee;)V", line = 187)
    public final void method1347(int arg0, class675 arg1) {
        while (true) {
            int var3 = arg1.method3750((byte) 35);
            if (var3 == 0) {
                if (arg0 != 19898) {
                    return;
                }
                field2861++;
                return;
            }
            this.method1346((byte) 100, arg1, var3);
        }
    }
}
