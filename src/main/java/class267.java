import java.awt.Frame;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class267 extends class188 {

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public int field4197;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lqj;")
    public static class280 field4201 = new class280(128);

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lti;")
    public static class248 field4205;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lrj;IIIIB)Ljava/awt/Frame;", line = 9)
    public static final Frame method1875(class22 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4200++;
        if (!arg0.method170(arg5 - 9)) {
            return null;
        }
        if (arg1 == 0) {
            class84[] var6 = class116.method753(arg0, arg5 + 1344872505);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1100 == arg3 && var6[var8].field1095 == arg2 && (arg4 == 0 || var6[var8].field1097 == arg4) && (!var7 || var6[var8].field1091 > arg1)) {
                    var7 = true;
                    arg1 = var6[var8].field1091;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class153 var9 = arg0.method158(arg5 ^ 0xF, arg1, arg3, arg2, arg4);
        while (var9.field2419 == 0) {
            class19.method140(10L, 16711680);
        }
        Frame var10 = (Frame) var9.field2421;
        if (var10 == null) {
            return null;
        } else if (var9.field2419 == 2) {
            class250.method1774(arg0, var10, arg5 ^ 0x9);
            return null;
        } else if (arg5 == 9) {
            return var10;
        } else {
            return (Frame) null;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 78)
    public static final void method1876(byte arg0) {
        class71.field883.method383((byte) -48);
        field4198++;
        if (arg0 <= 40) {
            field4201 = (class280) null;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 90)
    public static void method1877(byte arg0) {
        if (arg0 < 21) {
            field4205 = (class248) null;
        }
        field4201 = null;
        field4205 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 104)
    public static final void method1878(int arg0, int arg1) {
        if (!class178.field2680) {
            arg0 = -1;
        }
        field4204++;
        if (class313.field4903 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class42 var2 = class6.method39(arg1 ^ 0x3F62, arg0);
            class158 var3 = var2.method255(108);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class156.field2451.method154(var3.method1130(), new Point(var2.field472, var2.field462), class328.field5287, var3.field17, 15, var3.field16);
                class313.field4903 = arg0;
            }
        }
        if (arg0 == -1 && class313.field4903 != -1) {
            class156.field2451.method154((int[]) null, new Point(), class328.field5287, -1, 15, -1);
            class313.field4903 = -1;
        }
        if (arg1 != -16140) {
            field4199 = -90;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V", line = 151)
    public class267(int arg0, int arg1) {
        this.field4197 = arg0;
        this.field4203 = arg1;
    }
}
