import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class461 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[S")
    public static short[] field6568 = new short[256];

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field6571 = -1;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBLog;IILan;Lbd;I)V")
    public static final void method2759(int arg0, byte arg1, class602 arg2, int arg3, int arg4, class22 arg5, class56 arg6, int arg7) {
        field6570++;
        class509 var8 = new class509();
        var8.field7222 = arg7 << 9;
        var8.field7228 = arg3 << 9;
        if (arg1 != -44) {
            method2760(-77, null);
        }
        var8.field7197 = arg0;
        if (arg6 != null) {
            var8.field7203 = arg6;
            int var9 = arg6.field1238;
            int var10 = arg6.field1244;
            if (arg4 == 1 || arg4 == 3) {
                var10 = arg6.field1238;
                var9 = arg6.field1244;
            }
            var8.field7207 = arg6.field1274;
            var8.field7219 = arg6.field1222;
            var8.field7206 = arg6.field1310;
            var8.field7204 = arg6.field1302;
            var8.field7227 = arg6.field1299;
            var8.field7202 = arg3 + var9 << 9;
            var8.field7201 = arg7 + var10 << 9;
            var8.field7211 = arg6.field1304 << 9;
            var8.field7223 = arg6.field1241;
            var8.field7214 = arg6.field1243;
            if (arg6.field1248 != null) {
                var8.field7199 = true;
                var8.method3015(arg1 + 107);
            }
            if (var8.field7214 != null) {
                var8.field7217 = (int) ((double) (var8.field7204 - var8.field7219) * Math.random()) + var8.field7219;
            }
            class203.field3124.method1229(var8, (byte) 120);
        } else if (arg5 != null) {
            var8.field7195 = arg5;
            class334 var11 = arg5.field880;
            if (var11.field4984 != null) {
                var8.field7199 = true;
                var11 = var11.method2150(class113.field2038, -32224);
            }
            if (var11 != null) {
                var8.field7202 = var11.field4978 + arg3 << 9;
                var8.field7201 = var11.field4978 + arg7 << 9;
                var8.field7223 = class379.method2371(arg1 ^ 0x8B, arg5);
                var8.field7227 = var11.field4998;
                var8.field7207 = var11.field5002;
                var8.field7211 = var11.field5005 << 9;
            }
            class614.field8925.method1229(var8, (byte) 120);
        } else if (arg2 != null) {
            var8.field7209 = arg2;
            var8.field7202 = arg3 + arg2.method3446(0) << 9;
            var8.field7201 = arg7 + arg2.method3446(0) << 9;
            var8.field7223 = class535.method3095(arg2, (byte) 54);
            var8.field7207 = arg2.field8642;
            var8.field7227 = arg2.field8666;
            var8.field7211 = arg2.field8625 << 9;
            class518.field7304.method2598(var8, (long) arg2.field8728, (byte) 8);
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILr;)V")
    public static final void method2760(int arg0, class167 arg1) {
        field6569++;
        if (class308.field4551) {
            class539.method3113(-91, arg1);
        } else {
            class78.method822(true, arg1);
        }
        if (arg0 != 1) {
            method2761(50);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method2761(int arg0) {
        if (arg0 <= 43) {
            method2759(110, (byte) -4, null, 109, 44, null, null, -7);
        }
        field6568 = null;
    }
}
