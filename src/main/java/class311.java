import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class311 {

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "[J")
    public static long[] field4197 = new long[32];

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lga;")
    public static class332 field4196;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
    public static int[] field4201;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Lah;", line = 4)
    public static final class256 method1828(int arg0) {
        field4199++;
        if (arg0 != -21472) {
            field4200 = 89;
        }
        class256 var1 = (class256) class53.field693.method878(false);
        if (var1 != null) {
            var1.method242(true);
            var1.method1982((byte) -24);
            return var1;
        }
        class256 var2;
        do {
            var2 = (class256) class516.field7172.method878(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method1548((byte) -102) > class529.method2982((byte) -69)) {
                return null;
            }
            var2.method242(true);
            var2.method1982((byte) -24);
        } while ((Long.MIN_VALUE & var2.field4564) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBI)V", line = 46)
    public static final void method1829(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 36) {
            return;
        }
        if (arg1 == 1004) {
            class656.method3750(class240.field3174, arg3, arg0);
        } else if (arg1 == 1012) {
            class656.method3750(class647.field8941, arg3, arg0);
        } else if (arg1 == 1002) {
            class656.method3750(class257.field3362, arg3, arg0);
        } else if (arg1 == 1009) {
            class656.method3750(class541.field7417, arg3, arg0);
        } else if (arg1 == 1008) {
            class656.method3750(class586.field8087, arg3, arg0);
        }
        field4198++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 81)
    public static final void method1830(byte arg0) {
        field4202++;
        int var1 = 0;
        for (int var2 = 0; var2 < class703.field9886; var2++) {
            for (int var3 = 0; var3 < class431.field5789; var3++) {
                if (class154.method902(false, var1, class153.field2168, var3, true, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 > -25) {
            method1830((byte) -37);
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 119)
    public static void method1831(byte arg0) {
        field4201 = null;
        if (arg0 <= 59) {
            method1828(77);
        }
        field4196 = null;
        field4197 = null;
    }
}
