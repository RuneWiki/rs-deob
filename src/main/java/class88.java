import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class88 {

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
    public static boolean field1092 = false;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIILya;I)Lt;")
    public static final class474 method698(int arg0, int arg1, int arg2, int arg3, int arg4, class38 arg5, int arg6) {
        field1091++;
        long var7 = (long) arg3;
        class474 var9 = (class474) class290.field3702.method2647(-115, var7);
        if (arg2 != -14) {
            method698(3, 20, 15, 73, 43, null, -96);
        }
        short var10 = 2055;
        if (var9 == null) {
            class173 var11 = class457.method2711(false, arg3, 0, class483.field7068);
            if (var11 == null) {
                return null;
            }
            if (var11.field2200 < 13) {
                var11.method1111(0, -16);
            }
            var9 = arg5.method361(var11, var10, class344.field4411, 64, 768);
            class290.field3702.method2635(var7, arg2 - 26577, var9);
        }
        class474 var12 = var9.method416((byte) 2, var10, true);
        if (arg1 != 0) {
            var12.method421(arg1);
        }
        if (arg6 != 0) {
            var12.method436(arg6);
        }
        if (arg0 != 0) {
            var12.method405(arg0);
        }
        if (arg4 != 0) {
            var12.method443(0, arg4, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static final void method699(byte arg0) {
        field1090++;
        if (arg0 > -101) {
            method699((byte) 29);
        }
        for (class495 var1 = (class495) class223.field2817.method153(0); var1 != null; var1 = (class495) class223.field2817.method161(-127)) {
            if (var1.field7187 > 0) {
                var1.field7187--;
            }
            if (var1.field7187 != 0) {
                if (var1.field7189 > 0) {
                    var1.field7189--;
                }
                if (var1.field7189 == 0 && var1.field7193 >= 1 && var1.field7186 >= 1 && (class452.field6526 - 2) >= var1.field7193 && class440.field6307 - 2 >= var1.field7186 && (var1.field7199 < 0 || class407.method2404(false, var1.field7191, var1.field7199))) {
                    class194.method1200(var1.field7194, var1.field7193, var1.field7192, 3827, -1, var1.field7182, var1.field7186, var1.field7199, var1.field7191);
                    var1.field7189 = -1;
                    if (var1.field7199 == var1.field7188 && var1.field7188 == -1) {
                        var1.method2165(16225);
                    } else if (var1.field7199 == var1.field7188 && var1.field7194 == var1.field7184 && var1.field7197 == var1.field7191) {
                        var1.method2165(16225);
                    }
                }
            } else if (var1.field7188 < 0 || class407.method2404(false, var1.field7197, var1.field7188)) {
                class194.method1200(var1.field7184, var1.field7193, var1.field7192, 3827, -1, var1.field7182, var1.field7186, var1.field7188, var1.field7197);
                var1.method2165(16225);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method700(int arg0, int arg1, byte arg2) {
        field1089++;
        if (arg2 == 7) {
            return (arg0 & 0x70000) != 0 | class139.method944(arg0, arg1, 120) || class454.method2705(arg0, 102, arg1);
        } else {
            return false;
        }
    }
}
