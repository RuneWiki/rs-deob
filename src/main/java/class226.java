import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class226 {

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public int field3176 = 128;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public int field3179 = 128;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "Ldg;")
    public static class376 field3174 = new class376(21, 7);

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field3181 = -1;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "[[I")
    public static int[][] field3183 = new int[128][128];

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Lth;")
    public static class552 field3182;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)I")
    public static final int method1485(int arg0, int arg1) {
        int var2 = 100 / ((arg0 + 44) / 34);
        field3178++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIII)V")
    public static final void method1486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class174.field2481 = arg5;
        class270.field4055 = arg1;
        class503.field7116 = arg4;
        class429.field6294 = arg0;
        class129.field1910 = arg3;
        field3180++;
        if (arg2 != -14208) {
            return;
        }
        if (class429.field6294 >= 100) {
            int var6 = class503.field7116 * 512 + 256;
            int var7 = class174.field2481 * 512 + 256;
            int var8 = class674.method3748(var6, class58.field1112, 96, var7) - class129.field1910;
            int var9 = var6 - class131.field1928;
            int var10 = var8 - class568.field7998;
            int var11 = var7 - class413.field6011;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class544.field7662 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class637.field9001 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class300.field4472 = 0;
            if (class544.field7662 < 1024) {
                class544.field7662 = 1024;
            }
            if (class544.field7662 > 3072) {
                class544.field7662 = 3072;
            }
        }
        class43.field700 = 2;
        class666.field9399 = -1;
        class563.field7927 = -1;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Lsr;")
    public final class226 method1487(byte arg0) {
        if (arg0 != 4) {
            this.method1487((byte) -56);
        }
        field3177++;
        return new class226(this.field3170, this.field3179, this.field3176, this.field3171, this.field3173, this.field3172);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILvh;B)Z")
    public static final boolean method1488(int arg0, class327 arg1, byte arg2) {
        field3175++;
        class564.field7945.method239(arg1.field4846[arg0], arg1.field4839[arg0], arg1.field4840[arg0], class243.field3781);
        int var3 = class243.field3781[2];
        if (var3 < 50) {
            return false;
        }
        arg1.field4845[arg0] = (short) (class243.field3781[0] * class411.field5997 / var3 + class585.field8201);
        arg1.field4838[arg0] = (short) (class243.field3781[1] * class387.field5544 / var3 + class486.field6918);
        if (arg2 <= 51) {
            method1486(-99, 104, -126, 123, -101, -35);
        }
        arg1.field4847[arg0] = (short) var3;
        return true;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public static void method1489(int arg0) {
        field3182 = null;
        field3174 = null;
        if (arg0 != 0) {
            method1488(27, null, (byte) 26);
        }
        field3183 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILsr;)V")
    public final void method1490(int arg0, class226 arg1) {
        this.field3171 = arg1.field3171;
        if (arg0 != -6016) {
            return;
        }
        this.field3172 = arg1.field3172;
        this.field3176 = arg1.field3176;
        this.field3179 = arg1.field3179;
        this.field3170 = arg1.field3170;
        field3169++;
        this.field3173 = arg1.field3173;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(I)V")
    public class226(int arg0) {
        this.field3170 = arg0;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIII)V")
    private class226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3172 = arg5;
        this.field3171 = arg3;
        this.field3176 = arg2;
        this.field3179 = arg1;
        this.field3170 = arg0;
        this.field3173 = arg4;
    }
}
