import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class47 extends class270 {

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    private int field757 = 4096;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "[I")
    public static int[] field760 = new int[500];

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    public static int field762 = 0;

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
    public static int field765 = 0;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "Z")
    public static boolean field758 = true;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BI)[I", line = 10)
    public final int[] method81(byte arg0, int arg1) {
        ++field763;
        int[] var3 = super.field4053.method396(arg1, -127);
        if (arg0 < 26) {
            method381();
        }
        if (super.field4053.field815) {
            int[] var4 = this.method1927(0, 0, class30.field442 & arg1 - 1);
            int[] var5 = this.method1927(0, 0, arg1);
            int[] var6 = this.method1927(0, 0, class30.field442 & arg1 + 1);
            for (int var7 = 0; ~class161.field2445 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field757;
                int var9 = (var5[class267.field3997 & var7 + 1] - var5[class267.field3997 & var7 - 1]) * this.field757;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -4096 + var13) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBI[II)V", line = 63)
    public static final void method379(int arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        --arg4;
        if (arg1 > 58) {
            ++field759;
            int var6 = arg0 - 1;
            int var5 = var6 + -7;
            while (arg4 < var5) {
                int var7 = arg4 + 1;
                arg3[var7] = arg2;
                int var8 = var7 + 1;
                arg3[var8] = arg2;
                int var9 = var8 + 1;
                arg3[var9] = arg2;
                int var10 = var9 + 1;
                arg3[var10] = arg2;
                int var11 = var10 + 1;
                arg3[var11] = arg2;
                int var12 = var11 + 1;
                arg3[var12] = arg2;
                int var13 = var12 + 1;
                arg3[var13] = arg2;
                arg4 = var13 + 1;
                arg3[arg4] = arg2;
            }
            while (arg4 < var6) {
                ++arg4;
                arg3[arg4] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLec;I)V", line = 93)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg2 == 0) {
            this.field757 = arg1.method320((byte) -87);
        }
        if (arg0 == 108) {
            ++field764;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V", line = 111)
    public static final void method380(int arg0, int arg1) {
        ++field756;
        if (arg0 == -22693) {
            class393.field5744.method104(arg1, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V", line = 130)
    public class47() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "()V", line = 136)
    public static final void method381() {
        for (int var0 = 0; var0 < class30.field433; ++var0) {
            class447 var1 = class219.field3261[var0];
            class372.method2365(var1);
            class219.field3261[var0] = null;
        }
        class30.field433 = 0;
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V", line = 153)
    public static void method382(int arg0) {
        field760 = null;
        if (arg0 >= -40) {
            method382(62);
        }
    }
}
