import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class265 {

    @OriginalMember(owner = "client!en", name = "b", descriptor = "[Lvaa;")
    public static class397[] field3448 = new class397[75];

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field3447 = 0;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method1480(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 54 % ((arg3 + 49) / 51);
        field3451++;
        if (class640.method3678(false, arg1)) {
            if (class543.field7960[arg1] == null) {
                class562.method3282(arg5, arg8, arg2, arg0, class459.field6326[arg1], -1, -122, arg4, arg7, arg6);
            } else {
                class562.method3282(arg5, arg8, arg2, arg0, class543.field7960[arg1], -1, -77, arg4, arg7, arg6);
            }
        } else if (arg0 == -1) {
            for (int var10 = 0; var10 < 100; var10++) {
                class371.field4888[var10] = true;
            }
        } else {
            class371.field4888[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)Z")
    public static final boolean method1481(int arg0, int arg1, int arg2) {
        field3452++;
        if (arg0 != 0) {
            method1481(121, 109, -15);
        }
        return class448.method2623(arg1, arg2, 27) || class337.method1896(arg1, (byte) 66, arg2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static void method1482(int arg0) {
        if (arg0 != 0) {
            field3448 = null;
        }
        field3448 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BII)Z")
    public static final boolean method1483(byte arg0, int arg1, int arg2) {
        field3449++;
        if (arg0 == 94) {
            return (arg2 & 0x800) != 0 | class557.method3261(arg2, 32768, arg1) || class337.method1896(arg1, (byte) -91, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)Lpg;")
    public static final class623 method1484(byte arg0, int arg1) {
        field3450++;
        class623 var2 = (class623) class69.field665.method3682(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class362.field4763.method2558(100, arg1, 1);
        class623 var4 = new class623();
        var4.field8985 = arg1;
        if (arg0 >= -112) {
            method1482(-38);
        }
        if (var3 != null) {
            var4.method3568(new class374(var3), -1);
        }
        var4.method3572((byte) -116);
        if (var4.field8976 == 2 && class10.field79.method2645((long) arg1, (byte) -109) == null) {
            class10.field79.method2640(1, (long) arg1, new class171(class167.field2047));
            class368.field4860[class167.field2047++] = var4;
        }
        class69.field665.method3684(var4, 0, (long) arg1);
        return var4;
    }
}
