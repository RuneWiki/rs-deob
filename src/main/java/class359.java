import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class359 {

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field5427 = 328;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "S")
    public static short field5433 = 32767;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "Z")
    public static boolean field5432 = false;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "Ldq;")
    public static class489 field5430 = new class489(0, 3);

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "Luj;")
    public static class259 field5434;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(FIFFBLee;FFIII)[B", line = 7)
    public static final byte[] method2313(float arg0, int arg1, float arg2, float arg3, byte arg4, class475 arg5, float arg6, float arg7, int arg8, int arg9, int arg10) {
        field5431++;
        if (arg4 != 65) {
            field5427 = 11;
        }
        byte[] var11 = new byte[arg1 * arg10 * arg9];
        class515.method3055(arg4 - 65, 0, arg8, arg9, arg2, arg5, arg6, arg3, arg1, arg0, arg7, arg10, var11);
        return var11;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)V", line = 21)
    public static final void method2314(int arg0, byte arg1) {
        class386.method2428(103);
        int var2 = -87 / ((arg1 - 33) / 60);
        field5435++;
        int var3 = class85.field1409.method728(arg0, 58).field4164;
        if (var3 == 0) {
            return;
        }
        int var4 = class526.field7733.field6971[arg0];
        if (var3 == 5) {
            class369.field5525 = var4;
        }
        if (var3 == 6) {
            class66.field1153 = var4;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLoo;Loo;)V", line = 50)
    public static final void method2315(byte arg0, class439 arg1, class439 arg2) {
        if (arg0 > -60) {
            method2314(-111, (byte) -25);
        }
        field5428++;
        if (arg1.field6396 != null) {
            arg1.method2663(-128);
        }
        arg1.field6403 = arg2;
        arg1.field6396 = arg2.field6396;
        arg1.field6396.field6403 = arg1;
        arg1.field6403.field6396 = arg1;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 80)
    public static void method2316(int arg0) {
        if (arg0 != -30525) {
            method2314(-119, (byte) -79);
        }
        field5434 = null;
        field5430 = null;
    }
}
