import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class100 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
    public static int[] field1695 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1698 = Calendar.getInstance();

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1699 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lrg;")
    public static class88 field1700;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Z")
    public static boolean field1696;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(JIBI)Z", line = 16)
    public static final boolean method779(long arg0, int arg1, byte arg2, int arg3) {
        int var5 = (int) arg0 >> 14 & 0x1F;
        field1694++;
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class145 var8 = class289.method2046(-12453, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field2442;
                var10 = var8.field2444;
            } else {
                var9 = var8.field2444;
                var10 = var8.field2442;
            }
            int var11 = var8.field2414;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class115.method876(arg3, var9, var10, 0, var11, 2, class276.field4742.field5154[0], true, 0, (byte) -124, arg1, class276.field4742.field5125[0]);
        } else {
            class115.method876(arg3, 0, 0, var5 + 1, 0, 2, class276.field4742.field5154[0], true, var6, (byte) -41, arg1, class276.field4742.field5125[0]);
        }
        class242.field4051 = 2;
        class113.field1916 = class184.field2973;
        if (arg2 > -124) {
            method781((byte) -54);
        }
        class144.field2408 = class115.field1953;
        class16.field237 = 0;
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILve;Lve;IILve;)V", line = 67)
    public static final void method780(int arg0, class255 arg1, class255 arg2, int arg3, int arg4, class255 arg5) {
        if (arg3 != -32411) {
            field1695 = (int[]) null;
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class97.field1682[var6] = class97.field1682[var6 - 1];
            class216.field3666[var6] = class216.field3666[var6 - 1];
            class67.field1005[var6] = class67.field1005[var6 - 1];
            class119.field1997[var6] = class119.field1997[var6 - 1];
            class42.field660[var6] = class42.field660[var6 - 1];
        }
        class201.field3482 = class251.field4240;
        field1697++;
        class97.field1682[0] = arg4;
        class199.field3427++;
        class216.field3666[0] = arg2;
        class42.field660[0] = arg0;
        class67.field1005[0] = arg5;
        class119.field1997[0] = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 119)
    public static void method781(byte arg0) {
        field1698 = null;
        if (arg0 <= 23) {
            field1698 = (Calendar) null;
        }
        field1700 = null;
        field1695 = null;
    }
}
