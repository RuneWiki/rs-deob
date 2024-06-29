import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class739 extends class510 {

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "Lkt;")
    public class166 field10304;

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "Z")
    public static boolean field10309 = false;

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    public static int field10305;

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "I")
    public static int field10307;

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
    public static int field10308;

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
    public static int field10310;

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "Lcb;")
    public static class544 field10311;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)Z")
    public static final boolean method4137(int arg0, int arg1) {
        if (arg0 <= 68) {
            field10309 = true;
        }
        field10310++;
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IBIIII)V")
    public static final void method4138(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field10306++;
        if (arg0 == arg4) {
            class450.method2712(110, arg5, arg3, arg0, arg2);
            return;
        }
        if (arg1 != -90) {
            field10311 = null;
        }
        if (class450.field6463 <= (arg3 - arg0) && class285.field4372 >= (arg0 + arg3) && class738.field10297 <= arg5 - arg4 && arg5 + arg4 <= class414.field5846) {
            class484.method2832(arg4, (byte) -123, arg3, arg2, arg5, arg0);
        } else {
            class31.method223(arg5, -127, arg2, arg0, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V")
    public static final void method4139(int arg0) {
        class731.field10209.method506(((float) class145.field1852.field9019.method2930((byte) -67) * 0.1F + 0.7F) * 1.1523438F);
        field10308++;
        class731.field10209.method499(class573.field8112, 0.69921875F, 1.2F, (float) arg0, -240.0F, -200.0F);
        class731.field10209.method435(class771.field10626, -1, 0);
        class731.field10209.method484(class514.field7344);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
    public static void method4140(byte arg0) {
        field10311 = null;
        if (arg0 >= -18) {
            field10309 = true;
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lwk;II[B)V")
    public class739(class151 arg0, int arg1, int arg2, byte[] arg3) {
        this.field10304 = arg0.method1105(true, arg3, arg1, arg2, class539.field7574, false);
        this.field10304.method42(false, (byte) -128, false);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILha;)V")
    public static final void method4141(int arg0, class66 arg1) {
        field10305++;
        if (arg0 > -118) {
            method4141(-14, null);
        }
        if (class299.field4498.method2504(0) == 0) {
            return;
        }
        if (class145.field1852.field9002.method2258((byte) -70) == 0) {
            for (class208 var2 = (class208) class299.field4498.method2508((byte) 113); var2 != null; var2 = (class208) class299.field4498.method2505((byte) -55)) {
                class526.field7490.method3565(var2.field3036, var2.field3030, var2.field3035 ? class251.field3549.field7933 : null, var2.field3039, false, arg1, 115, false, class79.field1047, arg1, var2.field3032, var2.field3038);
                var2.method3117((byte) 98);
            }
            class149.method1028(-19376);
            return;
        }
        if (class312.field4645 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class312.field4645 = class685.method3869(0, class689.field9756, var3, class413.field5837, 0, 105);
            class483.field6862 = class312.field4645.method403(class7.method45(0, 18925, class7.field79, class455.field6536), class625.method3579(class491.field6972, class455.field6536, 0), true);
        }
        for (class208 var4 = (class208) class299.field4498.method2508((byte) -76); var4 != null; var4 = (class208) class299.field4498.method2505((byte) -55)) {
            class526.field7490.method3565(var4.field3036, var4.field3030, var4.field3035 ? class251.field3549.field7933 : null, var4.field3039, false, class312.field4645, 123, false, class483.field6862, arg1, var4.field3032, var4.field3038);
            var4.method3117((byte) -122);
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lwk;II[I)V")
    public class739(class151 arg0, int arg1, int arg2, int[] arg3) {
        this.field10304 = arg0.method1058(false, arg3, arg2, (byte) -24, arg1);
        this.field10304.method42(false, (byte) -123, false);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
    public static final void method4142(Object[] arg0, long[] arg1, int arg2) {
        field10307++;
        class403.method2436(-18477, arg1.length + arg2, 0, arg1, arg0);
    }
}
