import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class188 extends class313 {

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3150 = "red:";

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    public static int field3156 = 0;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public static int field3157 = -1;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "[F")
    public static float[] field3158 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "Lco;")
    public static class107 field3160;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "Lcg;")
    public static class49 field3149;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "Lcg;")
    public static class49 field3154;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "(I)V", line = 8)
    public static void method1433(int arg0) {
        int var1 = -124 % ((-arg0 - 47) / 62);
        field3150 = null;
        field3158 = null;
        field3154 = null;
        field3160 = null;
        field3149 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V", line = 22)
    public static final void method1434(long[] arg0, int arg1, int arg2, int arg3, Object[] arg4) {
        if (arg2 != 31385) {
            return;
        }
        field3153++;
        if (arg3 >= arg1) {
            return;
        }
        int var5 = (arg3 + arg1) / 2;
        int var6 = arg3;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        Object var9 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var9;
        for (int var10 = arg3; var10 < arg1; var10++) {
            if (arg0[var10] < ((long) (var10 & 0x1) + var7)) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                Object var13 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var13;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg4[arg1] = arg4[var6];
        arg4[var6] = var9;
        method1434(arg0, var6 - 1, 31385, arg3, arg4);
        method1434(arg0, arg1, 31385, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BII)I", line = 78)
    private final int method1435(byte arg0, int arg1, int arg2) {
        int var4 = 47 % ((arg0 + 10) / 62);
        field3151++;
        int var5 = arg2 * 57 + arg1;
        int var6 = var5 ^ var5 << 1;
        return 4096 - ((Integer.MAX_VALUE & (var6 * 15731 * var6 + 789221) * var6 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 95)
    public class188() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)[I", line = 104)
    public final int[] method111(int arg0, int arg1) {
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (arg0 != 4) {
            this.method111(-126, 116);
        }
        if (this.field4961.field3451) {
            int var4 = class1.field6[arg1];
            for (int var5 = 0; var5 < class133.field2269; var5++) {
                var3[var5] = this.method1435((byte) -74, class8.field104[var5], var4) % 4096;
            }
        }
        field3159++;
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(III)I", line = 145)
    public static final int method1436(int arg0, int arg1, int arg2) {
        field3155++;
        class66 var3 = (class66) class70.field1146.method732((long) arg1, true);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= ~arg2 && var3.field1067.length > arg2) {
            return var3.field1067[arg2];
        } else {
            return -1;
        }
    }
}
