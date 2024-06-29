import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class16 {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Ljava/lang/String;")
    public static String field234 = " is already on your friend list.";

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)I")
    public static final int method94(boolean arg0) {
        field232++;
        return arg0 ? 118 : ((class321.field4641 == 0 ? 0 : 1) << 21) + ((class242.field3530 == 0 ? 0 : 1) << 20) + ((class59.field946 ? 1 : 0) << 19) + (class436.field6356 << 17) + (((class322.field4645 ? 1 : 0) << 16) + ((class354.field5039 & 0x7) - -((client.field3638 ? 1 : 0) << 3)) - -((class47.field758 ? 1 : 0) << 4)) - (-((class310.field4525 ? 1 : 0) << 5) + -((class110.field1793 ? 1 : 0) << 6) + (-((class428.field6199 ? 1 : 0) << 8) + (-((class280.field4196 ? 1 : 0) << 9) + -((class451.field6550 ? 1 : 0) << 10) - ((class238.field3438 & 0x3) << 11) - ((class169.field2515 ? 1 : 0) << 13)) - (((class303.field4424 ? 1 : 0) << 15) - -((class151.field2315 == 0 ? 0 : 1) << 22) - (-(class185.method1438(true) << 23) - (class339.field4830 << 25) + -((class33.field476 ? 1 : 0) << 27))) - (class230.field3364 << 28)));
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIBII)V")
    public static final void method95(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 0;
        int var6 = 114 / ((-arg2 - 57) / 32);
        while (class32.field449 > var5) {
            Rectangle var7 = class256.field3698[var5];
            if (arg3 < var7.x + var7.width && arg3 + arg4 > var7.x && (var7.y + var7.height) > arg1 && var7.y < arg1 + arg0) {
                class255.field3697[var5] = true;
            }
            var5++;
        }
        field233++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static void method96(int arg0) {
        field234 = null;
        if (arg0 >= -48) {
            method94(true);
        }
    }
}
