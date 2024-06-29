import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class550 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "B")
    public byte field7648;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "B")
    public byte field7645;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Len;")
    public class339 field7650;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "S")
    public short field7647;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIILbt;III)V")
    public static final void method3225(boolean arg0, int arg1, int arg2, class48 arg3, int arg4, int arg5, int arg6) {
        field7649++;
        if (arg4 <= arg2) {
            class227.method1391(arg3, arg1, (byte) -117, arg6, arg0, arg5);
            return;
        }
        class300.field3598 = null;
        class558.field7751 = 1;
        class678.field9298 = arg0;
        class8.field138 = arg3;
        class486.field6774 = arg6;
        class174.field2167 = arg5;
        class677.field9292 = arg1;
        class753.field10443 = class665.field9130.method2995((byte) 80) / arg4;
        if (class753.field10443 < 1) {
            class753.field10443 = 1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIII)V")
    public static final void method3226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 <= class461.field6480 && arg5 >= class187.field2268) {
            boolean var6;
            if (arg0 < class471.field6572) {
                var6 = false;
                arg0 = class471.field6572;
            } else if (class223.field2604 >= arg0) {
                var6 = true;
            } else {
                arg0 = class223.field2604;
                var6 = false;
            }
            boolean var7;
            if (class471.field6572 > arg2) {
                var7 = false;
                arg2 = class471.field6572;
            } else if (class223.field2604 >= arg2) {
                var7 = true;
            } else {
                var7 = false;
                arg2 = class223.field2604;
            }
            if (arg1 >= class187.field2268) {
                class455.method2755(arg3, class4.field49[arg1++], (byte) 98, arg2, arg0);
            } else {
                arg1 = class187.field2268;
            }
            if (arg5 <= class461.field6480) {
                class455.method2755(arg3, class4.field49[arg5--], (byte) 93, arg2, arg0);
            } else {
                arg5 = class461.field6480;
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg5; var8++) {
                    int[] var9 = class4.field49[var8];
                    var9[arg0] = var9[arg2] = arg3;
                }
            } else if (var6) {
                for (int var11 = arg1; var11 <= arg5; var11++) {
                    class4.field49[var11][arg0] = arg3;
                }
            } else if (var7) {
                for (int var10 = arg1; var10 <= arg5; var10++) {
                    class4.field49[var10][arg2] = arg3;
                }
            }
        }
        if (arg4 != 0) {
            field7651 = -6;
        }
        field7646++;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Len;III)V")
    public class550(class339 arg0, int arg1, int arg2, int arg3) {
        this.field7648 = (byte) arg3;
        this.field7645 = (byte) arg2;
        this.field7650 = arg0;
        this.field7647 = (short) arg1;
    }
}
