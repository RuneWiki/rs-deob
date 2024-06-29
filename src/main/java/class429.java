import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class429 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lhga;")
    public static class158 field6541 = new class158(111, -2);

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field6544 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lws;")
    public static class328 field6542 = new class328(4, 8);

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field6545 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Z")
    public static final boolean method2717(int arg0, int arg1) {
        field6540++;
        if (arg0 != 255) {
            method2720(8, 22);
        }
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([[BBLrfa;)V")
    public static final void method2718(byte[][] arg0, byte arg1, class184 arg2) {
        field6539++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class6 var11 = new class6(var10);
                int var12 = class476.field7058[var5] >> 8;
                int var13 = class476.field7058[var5] & 0xFF;
                int var14 = var12 * 64 - class612.field8702;
                int var15 = var13 * 64 - class626.field8855;
                class636.method3698(true);
                arg2.method978(class10.field172, var15, class626.field8855, var11, class612.field8702, var14, arg1 + 62);
                arg2.method1496(var11, var14, class627.field8857, var3, (byte) 73, var15);
                if (!arg2.field1661 && (class456.field6843 / 8) == var12 && (class48.field641 / 8) == var13 && var3[0] != -1) {
                    class581.field8273 = class275.field4412.method1401((byte) 125, var3[2], var3[3], class254.field4046, var3[0], var3[1]);
                    class579.field8255 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class476.field7058[var6] >> 8) * 64 - class612.field8702;
            int var8 = (class476.field7058[var6] & 0xFF) * 64 - class626.field8855;
            byte[] var9 = arg0[var6];
            if (var9 == null && class48.field641 < 800) {
                class636.method3698(true);
                arg2.method971(64, 3, 64, var8, var7);
            }
        }
        if (arg1 != -62) {
            field6544 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method2719(int arg0) {
        if (arg0 == 0) {
            field6541 = null;
            field6542 = null;
            field6544 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Lod;")
    public static final class468 method2720(int arg0, int arg1) {
        if (arg1 != 0) {
            field6544 = null;
        }
        field6543++;
        class433[] var2 = class504.field7378;
        synchronized (class504.field7378) {
            class468 var3;
            if (arg0 >= class504.field7378.length || class504.field7378[arg0].method2751(true)) {
                var3 = new class468();
                var3.field6948 = new class306[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field6948[var4] = new class306();
                }
            } else {
                var3 = (class468) class504.field7378[arg0].method2752((byte) -125);
                var3.method2648((byte) -25);
                int var10002 = class674.field9495[arg0]--;
            }
            return var3;
        }
    }
}
