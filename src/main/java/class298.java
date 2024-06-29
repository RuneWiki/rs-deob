import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class298 extends class204 {

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        ++field4329;
        if (arg0 != -4591) {
            method1948(88);
        }
        if (super.field2852 < 0 || ~super.field2852 < -5) {
            super.field2852 = this.method490((byte) 110);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lfs;)V")
    public class298(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
    public final int method487(int arg0, int arg1) {
        int var3 = -124 % ((arg1 - -57) / 60);
        ++field4334;
        return 1;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(ILfs;)V")
    public class298(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V")
    public static final void method1946(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4333;
        for (int var5 = 0; ~var5 > ~class187.field2331; ++var5) {
            Rectangle var6 = class185.field2308[var5];
            if (var6.x + var6.width > arg4 && ~(arg0 + arg4) < ~var6.x && var6.y - -var6.height > arg3 && ~var6.y > ~(arg3 - -arg2)) {
                class585.field8271[var5] = true;
            }
        }
        if (arg1 == 12589) {
            class338.method2144((byte) -74, arg0 + arg4, arg3, arg2 + arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)I")
    public final int method1947(byte arg0) {
        ++field4331;
        return arg0 != -98 ? 57 : super.field2852;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)Lhv;")
    public static final class226 method1948(int arg0) {
        ++field4332;
        if (class46.field490 != null && class290.field4278 != null) {
            class226 var1 = (class226) class290.field4278.method2439(arg0 + 15772);
            if (arg0 != -10618) {
                method1949((class171) null, -23);
            }
            while (var1 != null) {
                class547 var2 = class46.field485.method514(var1.field3433, (byte) 63);
                if (var2 != null && var2.field7617 && var2.method3238(-2, class46.field481)) {
                    return var1;
                }
                var1 = (class226) class290.field4278.method2439(arg0 + 15772);
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lpja;I)Ljava/lang/String;")
    public static final String method1949(class171 arg0, int arg1) {
        ++field4336;
        if (arg1 > -78) {
            method1949((class171) null, -87);
        }
        if (arg0.field2176 != null && arg0.field2176.length() != 0) {
            return arg0.field2169 != null && ~arg0.field2169.length() < -1 ? arg0.field2180 + class712.field9885.method3999(class553.field7667, (byte) -91) + arg0.field2169 + class712.field9885.method3999(class553.field7667, (byte) -118) + arg0.field2176 : arg0.field2180 + class712.field9885.method3999(class553.field7667, (byte) -98) + arg0.field2176;
        } else {
            return arg0.field2169 != null && arg0.field2169.length() > 0 ? arg0.field2180 + class712.field9885.method3999(class553.field7667, (byte) -21) + arg0.field2169 : arg0.field2180;
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        if (arg1 >= -105) {
            this.method486(-51);
        }
        super.field2852 = arg0;
        ++field4330;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)I")
    public final int method490(byte arg0) {
        if (arg0 < 83) {
            this.method486(-94);
        }
        ++field4335;
        return 3;
    }
}
