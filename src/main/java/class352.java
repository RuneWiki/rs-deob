import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class352 {

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public int field5121;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field5123;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public int field5122;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public int field5120;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5116 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field5117 = 0;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lhba;")
    public static class404 field5118 = new class404();

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field5114++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 16)
    public static void method2150(int arg0) {
        field5118 = null;
        if (arg0 != -24635) {
            method2153(-9, (byte) -96, -118, null, 73, 44, 31);
        }
        field5116 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 38)
    public static final void method2151(int arg0) {
        field5124++;
        for (class25 var1 = (class25) class142.field1855.method774(3); var1 != null; var1 = (class25) class142.field1855.method774(3)) {
            class579.method3381((byte) -128, var1);
        }
        int var2;
        int var3;
        if (class94.field1158.method2675(arg0 ^ arg0, class239.field3499)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class97.field1205;
            var2 = class97.field1205;
        }
        client.method3599();
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method3609();
            client.method3608(var4);
            client.method3602(var4);
        }
        client.method3616();
        client.method3615();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILno;)I", line = 80)
    public static final int method2152(int arg0, class483 arg1) {
        field5115++;
        int var2 = arg1.method2937(-19811, 2);
        if (arg0 != 11) {
            return -75;
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method2937(arg0 - 19822, 5);
        } else if (var2 == 2) {
            var3 = arg1.method2937(-19811, 8);
        } else {
            var3 = arg1.method2937(-19811, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBILqa;III)Lr;", line = 112)
    public static final class520 method2153(int arg0, byte arg1, int arg2, class167 arg3, int arg4, int arg5, int arg6) {
        field5119++;
        long var7 = (long) arg6;
        class520 var9 = (class520) class49.field573.method2025(var7, 2);
        short var10 = 2055;
        if (var9 == null) {
            class114 var11 = class559.method3271(80, 0, arg6, class57.field700);
            if (var11 == null) {
                return null;
            }
            if (var11.field1459 < 13) {
                var11.method699((byte) -81, 0);
            }
            var9 = arg3.method954(var11, var10, class393.field5716, 64, 768);
            class49.field573.method2029(false, var9, var7);
        }
        class520 var12 = var9.method369((byte) 2, var10, true);
        if (arg2 != 0) {
            var12.method1979(arg2);
        }
        if (arg4 != 0) {
            var12.method1966(arg4);
        }
        if (arg5 != 0) {
            var12.method1972(arg5);
        }
        if (arg1 > -15) {
            return null;
        } else {
            if (arg0 != 0) {
                var12.method1984(0, arg0, 0);
            }
            return var12;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIII)V", line = 159)
    public class352(int arg0, int arg1, int arg2, int arg3) {
        this.field5121 = arg3;
        this.field5123 = arg2;
        this.field5122 = arg0;
        this.field5120 = arg1;
    }
}
