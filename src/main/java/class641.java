import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class641 {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Z")
    public static boolean field9076 = false;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLjo;)V", line = 4)
    public static final void method3603(byte arg0, class303 arg1) {
        class325.field4237 = arg1;
        field9074++;
        if (arg0 > -74) {
            method3604(true);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)J", line = 15)
    public static final synchronized long method3604(boolean arg0) {
        field9077++;
        long var1 = System.currentTimeMillis();
        if (arg0) {
            method3605(-29);
        }
        if (var1 < class95.field1057) {
            class412.field5479 += class95.field1057 - var1;
        }
        class95.field1057 = var1;
        return var1 + class412.field5479;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 38)
    public static final void method3605(int arg0) {
        if (arg0 == -18215) {
            field9073++;
            class271.field3435 = class231.method1343(8, true, 2048, 0.4F, 8, true, 35, 4);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([IIII[I)V", line = 50)
    public static final void method3606(int[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        int var5 = 32 % ((arg2 + 67) / 53);
        if (arg1 < arg3) {
            int var6 = (arg1 + arg3) / 2;
            int var7 = arg1;
            int var8 = arg4[var6];
            arg4[var6] = arg4[arg3];
            arg4[arg3] = var8;
            int var9 = arg0[var6];
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var9;
            int var10 = ~var8 == Integer.MIN_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg3; var11++) {
                if (arg4[var11] < (var8 + (var10 & var11))) {
                    int var12 = arg4[var11];
                    arg4[var11] = arg4[var7];
                    arg4[var7] = var12;
                    int var13 = arg0[var11];
                    arg0[var11] = arg0[var7];
                    arg0[var7++] = var13;
                }
            }
            arg4[arg3] = arg4[var7];
            arg4[var7] = var8;
            arg0[arg3] = arg0[var7];
            arg0[var7] = var9;
            method3606(arg0, arg1, -128, var7 - 1, arg4);
            method3606(arg0, var7 + 1, 95, arg3, arg4);
        }
        field9078++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Z", line = 106)
    public static final boolean method3607(int arg0, int arg1, int arg2) {
        field9075++;
        if (arg1 != 0) {
            field9076 = false;
        }
        return (arg2 & 0x800) != 0;
    }
}
