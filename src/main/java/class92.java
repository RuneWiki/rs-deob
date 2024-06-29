import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class92 {

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "[I")
    public static int[] field1453;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 4)
    public static void method779(int arg0) {
        if (arg0 == 13720) {
            field1453 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)Lhn;", line = 14)
    public static final class255 method780(byte arg0, int arg1) {
        field1452++;
        class18 var2 = class310.field4521;
        class255 var3;
        synchronized (class310.field4521) {
            var3 = (class255) class310.field4521.method103(0, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class106.field1753.method1355(arg1, -12607, 16);
        class255 var5 = new class255();
        if (var4 != null) {
            var5.method1847(new class37(var4), -66);
        }
        if (arg0 >= -106) {
            field1453 = null;
        }
        class18 var6 = class310.field4521;
        synchronized (class310.field4521) {
            class310.field4521.method113(var5, 0, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BIIIIII)Lqi;", line = 45)
    public static final class207 method781(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1451++;
        long var7 = (long) arg5 * 76724863L ^ (long) arg3 * 475427L ^ (long) arg4 * 97549L ^ (long) arg1 * 67481L ^ (long) arg2 * 986053L ^ (long) arg6 * 32147369L;
        class207 var9 = (class207) class41.field628.method103(0, var7);
        if (arg0 >= -63) {
            return null;
        } else if (var9 == null) {
            class207 var10 = class122.field1928.method687(arg1, arg4, arg3, arg2, arg6, arg5);
            class41.field628.method113(var10, 0, var7);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V", line = 72)
    public static final void method782(byte arg0) {
        field1454++;
        if (arg0 > -118) {
            method780((byte) -24, 13);
        }
        class18 var1 = class234.field3395;
        synchronized (class234.field3395) {
            class234.field3395.method112(0);
        }
    }
}
