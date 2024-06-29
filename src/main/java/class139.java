import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class139 extends class200 {

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field2467 = -2;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field2470 = 0;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field2471 = 0;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lsb;")
    public static class98 field2468 = class47.method368("Ausw-=hlen", 0);

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lac;")
    public static class188 field2466;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public static void method1048(byte arg0) {
        int var1 = 101 % ((-arg0 - 75) / 39);
        field2468 = null;
        field2466 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BIIII)V")
    public static final void method1049(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2472++;
        class56 var5 = (class56) class211.field3609.method1511((byte) -124, (long) arg4);
        if (var5 == null) {
            var5 = new class56();
            class211.field3609.method1513((long) arg4, var5, -1);
        }
        if (var5.field893.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field893.length; var8++) {
                var6[var8] = var5.field893[var8];
                var7[var8] = var5.field889[var8];
            }
            for (int var9 = var5.field893.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field889 = var7;
            var5.field893 = var6;
        }
        var5.field893[arg2] = arg1;
        if (arg0 < 101) {
            field2470 = -116;
        }
        var5.field889[arg2] = arg3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static final void method1050(int arg0) {
        field2469++;
        if (class214.field3642 > 0) {
            class12.method109(true);
            return;
        }
        class109.field1951 = class46.field774;
        class46.field774 = null;
        class220.method1521(40, 0);
        if (arg0 >= -33) {
            method1049((byte) -8, -88, -6, -54, 92);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)V")
    public static final void method1051(int arg0, int arg1, int arg2, int arg3) {
        class71 var4 = class31.field553[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class207 var5 = var4.field1157;
        if (var5 != null) {
            var5.field3541 = var5.field3541 * arg3 / 16;
            var5.field3532 = var5.field3532 * arg3 / 16;
        }
    }
}
