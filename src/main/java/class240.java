import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class240 {

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "Lmba;")
    public static class203 field3508 = new class203();

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "Luf;")
    public static class353 field3509;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Lcc;")
    public static class427 field3505;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "[I")
    public static int[] field3504;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZ)Lwca;")
    public static final class311 method1540(int arg0, int arg1, boolean arg2) {
        field3506++;
        class311 var3 = class436.method2659(arg2, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field4652 == null || arg1 >= var3.field4652.length) {
            return null;
        } else {
            return var3.field4652[arg1];
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lwca;II)I")
    public static final int method1541(class311 arg0, int arg1, int arg2) {
        field3507++;
        if (!client.method3619(arg0).method3522((byte) 35, arg1) && arg0.field4651 == null) {
            return -1;
        } else {
            int var3 = 34 / ((37 - arg2) / 46);
            return arg0.field4621 == null || arg0.field4621.length <= arg1 ? -1 : arg0.field4621[arg1];
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)Lsk;")
    public static final class415 method1542(int arg0, int arg1, int arg2) {
        if (class526.field7777[arg0][arg1][arg2] == null) {
            boolean var3 = class526.field7777[0][arg1][arg2] != null && class526.field7777[0][arg1][arg2].field5979 != null;
            if (var3 && arg0 >= class487.field7383 - 1) {
                return null;
            }
            class39.method206(arg0, arg1, arg2);
        }
        return class526.field7777[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I[BIIBIII[B)V")
    public static final void method1543(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field3510++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        int var11 = -arg3;
        if (arg4 != -20) {
            field3509 = null;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg8[var10001] = (byte) (arg8[var10001] - arg1[arg5++]);
                int var14 = arg6++;
                arg8[var14] = (byte) (arg8[var14] - arg1[arg5++]);
                int var15 = arg6++;
                arg8[var15] = (byte) (arg8[var15] - arg1[arg5++]);
                int var16 = arg6++;
                arg8[var16] = (byte) (arg8[var16] - arg1[arg5++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg8[var10001] = (byte) (arg8[var10001] - arg1[arg5++]);
            }
            arg6 += arg0;
            arg5 += arg7;
            var11++;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public static void method1544(int arg0) {
        field3505 = null;
        field3504 = null;
        field3508 = null;
        field3509 = null;
        if (arg0 < 52) {
            method1541(null, -53, -79);
        }
    }
}
