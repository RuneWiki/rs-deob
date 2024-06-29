import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class310 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "[S")
    public static short[] field4986 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field4987 = 0;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field4990 = 0;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method2084(byte arg0, long arg1) {
        field4985++;
        class13.field273.setTime(new Date(arg1));
        int var3 = class13.field273.get(7);
        int var4 = class13.field273.get(5);
        int var5 = class13.field273.get(2);
        int var6 = class13.field273.get(1);
        int var7 = class13.field273.get(11);
        int var8 = -40 % ((-arg0 - 92) / 34);
        int var9 = class13.field273.get(12);
        int var10 = class13.field273.get(13);
        return class169.field2734[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class77.field1305[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B[B)Lme;")
    public static final class165 method2085(byte arg0, byte[] arg1) {
        field4993++;
        if (arg1 == null) {
            return null;
        } else if (arg0 <= 122) {
            return null;
        } else {
            class164 var2 = new class164(arg1, class49.field842, class73.field1283, class297.field4859, class43.field656, class289.field4758);
            class155.method1175(-52);
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method2086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field4989++;
        if (class301.method2056(-1, arg6)) {
            class239.method1710(arg3, arg4, -1, -1, arg1, arg0, arg2, arg5, class208.field3515[arg6], arg8);
            if (arg7 != 71) {
                field4987 = -43;
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class143.field2351[var9] = true;
            }
        } else {
            class143.field2351[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIBZLaj;)V")
    public static final void method2087(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, class151 arg6) {
        class101.field1608 = 1;
        class254.field4315 = arg0;
        class3.field106 = arg2;
        if (arg4 > -77) {
            return;
        }
        class16.field320 = arg1;
        class134.field2201 = arg5;
        class23.field418 = arg6;
        field4991++;
        class220.field3704 = arg3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method2088(int arg0) {
        if (arg0 == 10) {
            field4986 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)I")
    public static final int method2089(int arg0, boolean arg1) {
        field4984++;
        long var2 = class188.method1355(-112);
        for (class232 var4 = arg1 ? (class232) class137.field2256.method982(-9570) : (class232) class137.field2256.method981(arg0); var4 != null; var4 = (class232) class137.field2256.method981(arg0)) {
            if ((var4.field3925 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3925 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2213;
                    class12.field230[var5] = class152.field2541[var5];
                    var4.method993(32);
                    return var5;
                }
                var4.method993(arg0 + 33);
            }
        }
        if (arg0 == -1) {
            return -1;
        } else {
            return -91;
        }
    }
}
