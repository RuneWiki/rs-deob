import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class283 {

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "F")
    public static float field3745 = 0.0F;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3744 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lsc;")
    public static class232 field3746 = class308.method1836(255);

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Lho;")
    public static class103 field3749 = new class103(11, 15);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIBII)I", line = 3)
    public static final int method1708(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != 16) {
            method1710(86);
        }
        if ((arg1 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg6;
            arg6 = var7;
        }
        field3747++;
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg5;
        } else if (var8 == 2) {
            return 7 + 1 - arg0 - arg3;
        } else {
            return 7 + 1 - arg5 - arg6;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([[BLsv;B)V", line = 36)
    public static final void method1709(byte[][] arg0, class472 arg1, byte arg2) {
        field3743++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        if (arg2 != 41) {
            field3745 = 0.18654458F;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class396 var11 = new class396(var10);
                int var12 = class467.field6937[var5] >> 8;
                int var13 = class467.field6937[var5] & 0xFF;
                int var14 = var12 * 64 - class357.field4867;
                int var15 = var13 * 64 - class418.field6074;
                class466.method2847(false);
                arg1.method307(var14, var11, var15, class96.field1223, class357.field4867, class418.field6074, (byte) 120);
                arg1.method2885(class343.field4596, var11, var14, var15, 120, var3);
                if (!arg1.field598 && class126.field1634 / 8 == var12 && (class293.field3882 / 8) == var13 && var3[0] != -1) {
                    class155.field2027 = client.field2571.method2822(arg2 + 85, class333.field4407, var3[0], var3[2], var3[3], var3[1]);
                    class139.field1851 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class467.field6937[var6] >> 8) * 64 - class357.field4867;
            int var8 = (class467.field6937[var6] & 0xFF) * 64 - class418.field6074;
            byte[] var9 = arg0[var6];
            if (var9 == null && class293.field3882 < 800) {
                class466.method2847(false);
                arg1.method314(90, 64, 64, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 111)
    public static void method1710(int arg0) {
        field3749 = null;
        if (arg0 != 4) {
            method1709(null, null, (byte) -25);
        }
        field3746 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 123)
    public static final void method1711(String arg0, byte arg1) {
        field3748++;
        if (class54.field623 == null) {
            return;
        }
        class62.field708++;
        class492.method2979(class136.field1815, 101);
        int var2 = 35 % ((arg1 + 56) / 44);
        class106.field1443.method2449((byte) 127, class424.method2613(1, arg0));
        class106.field1443.method2415(arg0, 21742);
    }
}
