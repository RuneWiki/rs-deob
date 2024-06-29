import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class204 {

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field3324 = 64;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public static int field3333 = 0;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field3329 = -1;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "F")
    public static float field3326;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "Ljq;")
    public static class473 field3327;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "[B")
    public byte[] field3332;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "[I")
    public static int[] field3328;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "[S")
    public short[] field3325;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "[S")
    public short[] field3331;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "[S")
    public short[] field3335;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 11)
    public static void method1576(byte arg0) {
        int var1 = 67 / ((arg0 - 64) / 34);
        field3328 = null;
        field3327 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILqg;I)V", line = 36)
    public static final void method1577(int arg0, class428 arg1, int arg2) {
        field3330++;
        if (class275.field4413 >= 50 || arg1 == null || arg1.field6517 == null || arg1.field6517.length <= arg0 || arg1.field6517[arg0] == null) {
            return;
        }
        int var3 = arg1.field6517[arg0][0];
        int var4 = var3 >> 8;
        if (arg2 > -77) {
            return;
        }
        int var5 = (var3 & 0xEB) >> 5;
        if (arg1.field6517[arg0].length > 1) {
            int var6 = (int) ((double) arg1.field6517[arg0].length * Math.random());
            if (var6 > 0) {
                var4 = arg1.field6517[arg0][var6];
            }
        }
        int var7 = 256;
        if (arg1.field6515 != null && arg1.field6508 != null) {
            var7 = class605.method3520(-28443, arg1.field6515[arg0], arg1.field6508[arg0]);
        }
        if (arg1.field6526) {
            class299.method2072(255, var7, 0, var4, 84, var5, false);
        } else {
            class556.method3322(var4, 82, var7, 0, var5, 255);
        }
    }
}
