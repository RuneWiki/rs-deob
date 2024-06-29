import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class312 {

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "Laea;")
    public static class50 field4469 = new class50();

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V", line = 5)
    public static void method1912(int arg0) {
        if (arg0 == -30352) {
            field4469 = null;
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "([IILrv;I[II)Lifa;", line = 17)
    public static final class431 method1913(int[] arg0, int arg1, class111 arg2, int arg3, int[] arg4, int arg5) {
        if (arg1 != 0) {
            field4469 = null;
        }
        field4470++;
        if (!arg2.method827(arg1 ^ 0xFFFFF3D1, class408.field5668, class155.field2358)) {
            int[] var10 = new int[arg3 * arg5];
            for (int var11 = 0; var11 < arg5; var11++) {
                int var12 = arg3 * var11 + arg0[var11];
                for (int var13 = 0; var13 < arg4[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class431(arg2, arg3, arg5, var10);
        }
        byte[] var6 = new byte[arg3 * arg5];
        for (int var7 = 0; var7 < arg5; var7++) {
            int var8 = arg3 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class431(arg2, arg3, arg5, var6);
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(ZBLvfa;)V", line = 75)
    public static final void method1914(boolean arg0, byte arg1, class672 arg2) {
        field4467++;
        int var3 = arg2.field9329 == 0 ? arg2.field9287 : arg2.field9329;
        int var4 = arg2.field9300 == 0 ? arg2.field9178 : arg2.field9300;
        if (arg1 != 100) {
            field4469 = null;
        }
        class209.method1394(arg2.field9200, class747.field10393[arg2.field9200 >> 16], arg0, var3, (byte) 90, var4);
        if (arg2.field9240 != null) {
            class209.method1394(arg2.field9200, arg2.field9240, arg0, var3, (byte) 90, var4);
        }
        class8 var5 = (class8) class350.field4925.method2135((long) arg2.field9200, (byte) 31);
        if (var5 != null) {
            class675.method3762(32280, var5.field161, var3, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "(I)V", line = 103)
    public static final void method1915(int arg0) {
        field4468++;
        for (int var1 = 0; var1 < 100; var1++) {
            class12.field192[var1] = true;
        }
        if (arg0 != -101) {
            method1915(-28);
        }
    }
}
