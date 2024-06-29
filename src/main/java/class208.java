import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class208 {

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3204 = "flash2:";

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "Z")
    public static boolean field3205 = false;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Z")
    public static boolean field3208 = false;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "J")
    public static long field3210 = 0L;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "Z")
    public static volatile boolean field3207 = true;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 9)
    public static void method1544(int arg0) {
        if (arg0 != -1500664592) {
            field3210 = -125L;
        }
        field3204 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIIIIII)V", line = 25)
    public static final void method1545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 643358728) {
            field3208 = true;
        }
        field3206++;
        if (class43.field693 <= arg8 && class128.field2130 >= arg8 && class43.field693 <= arg2 && class128.field2130 >= arg2 && class43.field693 <= arg5 && arg5 <= class128.field2130 && arg9 >= class43.field693 && arg9 <= class128.field2130 && arg0 >= class328.field5042 && arg0 <= class284.field4385 && arg1 >= class328.field5042 && class284.field4385 >= arg1 && class328.field5042 <= arg3 && class284.field4385 >= arg3 && class328.field5042 <= arg4 && class284.field4385 >= arg4) {
            class260.method1910(arg6, arg9, arg7 ^ 0x2658F245, arg8, arg0, arg1, arg4, arg2, arg3, arg5);
        } else {
            class83.method748(arg8, arg9, arg1, false, arg5, arg4, arg0, arg3, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 44)
    public static final void method1546(byte arg0) {
        client.method1045();
        int var1 = -89 / ((arg0 - 22) / 58);
        client.method1034();
        client.method1031();
        client.method1028();
        client.method1029();
        field3211++;
        client.method1033();
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)Ltb;", line = 70)
    public static final class229 method1547(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1758307504) {
            field3205 = false;
        }
        field3203++;
        long var5 = (long) arg4 & 0xFFFFL << 32 | ((long) arg1 & 0xFFFFL) << 48 | (long) arg2 & 0xFFFFL << 16 | (long) arg0 & 0xFFFFL;
        class229 var7 = (class229) class343.field5453.method654(-78, var5);
        if (var7 != null) {
            return var7;
        }
        class111 var8 = class41.method424((byte) -106, arg0);
        class219[] var9 = null;
        if (var8.field1700 != null) {
            var9 = new class219[var8.field1700.length];
            for (int var10 = 0; var10 < var9.length; var10++) {
                class46 var11 = class286.method2072(arg3 + 1758307494, var8.field1700[var10]);
                var9[var10] = new class219(var11.field731, var11.field734, var11.field726, var11.field736, var11.field732, var11.field724, var11.field725, var11.field727);
            }
        }
        class229 var12 = new class229(var8.field1699, var9, var8.field1703, arg1, arg4, arg2);
        class343.field5453.method652(48, var12, var5);
        return var12;
    }
}
