import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class247 {

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "[S")
    public static short[] field3448 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lqj;")
    public static class238 field3445;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Lqj;")
    public static class238 field3446;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "[Ldk;")
    public static class432[] field3442;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method1520(byte arg0) {
        field3445 = null;
        field3448 = null;
        field3446 = null;
        if (arg0 < -96) {
            field3442 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)Z")
    public final boolean method1521(byte arg0) {
        field3450++;
        if (arg0 > -46) {
            method1520((byte) -63);
        }
        return (this.field3449 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Z")
    public final boolean method1522(int arg0) {
        field3447++;
        if (arg0 <= 4) {
            field3445 = null;
        }
        return (this.field3449 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static final void method1523(boolean arg0) {
        if (arg0) {
            class343.field5032 = class39.field633;
            class88.field1226 = class425.field6324;
        } else {
            class343.field5032 = class108.field1475;
            class88.field1226 = class198.field2829;
        }
        class137.field1817 = class343.field5032.length;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILud;II)Ljava/awt/Frame;")
    public static final Frame method1524(int arg0, int arg1, int arg2, class2 arg3, int arg4, int arg5) {
        if (arg0 != 7439) {
            return null;
        }
        field3441++;
        if (!arg3.method15(1774773648)) {
            return null;
        }
        if (arg5 == 0) {
            class432[] var6 = class442.method2794(arg3, -31353);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field6371 == arg1 && var6[var8].field6374 == arg2 && (arg4 == 0 || var6[var8].field6372 == arg4) && (!var7 || var6[var8].field6376 > arg5)) {
                    arg5 = var6[var8].field6376;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class296 var9 = arg3.method22(arg1, arg4, (byte) -37, arg5, arg2);
        while (var9.field4259 == 0) {
            class404.method2628(arg0 ^ 0xFFFFE2B5, 10L);
        }
        Frame var10 = (Frame) var9.field4262;
        if (var10 == null) {
            return null;
        } else if (var9.field4259 == 2) {
            class314.method1961(arg3, var10, true);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static final void method1525(int arg0) {
        class232.field3279.method756(arg0 + 11983, 5);
        field3438++;
        class339.field4989++;
        class232.field3279.method1693(class420.field6243, (byte) 84);
        if (arg0 != -11983) {
            method1520((byte) -121);
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)Z")
    public final boolean method1526(int arg0) {
        if (arg0 < 10) {
            method1520((byte) -97);
        }
        field3439++;
        return (this.field3449 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)Z")
    public final boolean method1527(int arg0) {
        field3452++;
        int var2 = -125 % ((-arg0 - 37) / 34);
        return (this.field3449 & 0x4) != 0;
    }
}
