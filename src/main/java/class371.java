import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class371 {

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "Lhs;")
    public static class325 field4742 = new class325(2, 2);

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "[S")
    private static short[] field4747 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "[S")
    private static short[] field4746 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "[S")
    private static short[] field4751 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "[[S")
    public static short[][] field4745 = new short[][] { field4746, field4751, field4747 };

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public int field4748;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "Ltk;")
    public class343 field4750;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "[I")
    public int[] field4749;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 4)
    public static void method2160(int arg0) {
        if (arg0 != 7) {
            return;
        }
        field4745 = null;
        field4747 = null;
        field4742 = null;
        field4746 = null;
        field4751 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[BIIII[BIB)V", line = 18)
    public static final void method2161(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, byte arg8) {
        field4744++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        if (arg8 >= -13) {
            field4747 = null;
        }
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg6[var10001] = (byte) (arg6[var10001] - arg1[arg0++]);
                int var14 = arg5++;
                arg6[var14] = (byte) (arg6[var14] - arg1[arg0++]);
                int var15 = arg5++;
                arg6[var15] = (byte) (arg6[var15] - arg1[arg0++]);
                int var16 = arg5++;
                arg6[var16] = (byte) (arg6[var16] - arg1[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg6[var10001] = (byte) (arg6[var10001] - arg1[arg0++]);
            }
            arg0 += arg7;
            arg5 += arg2;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;IBZLjava/lang/String;)V", line = 64)
    public static final void method2162(String arg0, int arg1, byte arg2, boolean arg3, String arg4) {
        field4743++;
        class249 var5 = class187.method1149((byte) -126);
        if (arg2 != 45) {
            return;
        }
        var5.field3016.method1460(class360.field4615.field3126, 24710);
        var5.field3016.method1446(0, true);
        int var6 = var5.field3016.field2903;
        var5.field3016.method1446(632, true);
        int[] var7 = class224.method1305((byte) -125, var5);
        int var8 = var5.field3016.field2903;
        var5.field3016.method1480(arg4, false);
        var5.field3016.method1446(class519.field7378, true);
        var5.field3016.method1480(arg0, false);
        var5.field3016.method1462(24557, class553.field7927);
        var5.field3016.method1460(class489.field6978, arg2 ^ 0x60AB);
        var5.field3016.method1460(class99.field1034.field3752, 24710);
        class435.method2719(var5.field3016, arg2 ^ 0x35);
        String var9 = class359.field4598;
        var5.field3016.method1460(var9 == null ? 0 : 1, 24710);
        if (var9 != null) {
            var5.field3016.method1480(var9, false);
        }
        var5.field3016.method1460(arg1, 24710);
        var5.field3016.method1460(arg3 ? 1 : 0, 24710);
        var5.field3016.field2903 += 7;
        var5.field3016.method1457(var8, var7, (byte) -89, var5.field3016.field2903);
        var5.field3016.method1431(var5.field3016.field2903 - var6, -114);
        class510.method3017(var5, arg2 + 68);
        class77.field812 = -3;
        class183.field2158 = 0;
        class71.field746 = 1;
        class438.field6368 = 0;
        if (arg1 < 13) {
            class217.field2519 = true;
            class193.method1174(false);
        }
    }
}
