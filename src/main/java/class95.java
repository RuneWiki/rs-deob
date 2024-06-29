import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class95 extends class96 {

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Leg;")
    private static class37 field1485 = class174.method1167(" is already on your ignore list)3", 73);

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "Z")
    public static boolean field1494 = false;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "Leg;")
    public static class37 field1493 = field1485;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static volatile int field1489 = -1;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Leg;")
    public static class37 field1492 = class174.method1167("Verbindung abgebrochen)3", -76);

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "Lbj;")
    public class87 field1491;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "[B")
    public byte[] field1487;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)[B")
    public final byte[] method618(int arg0) {
        ++field1490;
        if (super.field1500) {
            throw new RuntimeException();
        } else {
            if (arg0 != -31029) {
                field1494 = false;
            }
            return this.field1487;
        }
    }

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)V")
    public static final void method619(int arg0) {
        ++field1486;
        if (arg0 == 1) {
            for (int var1 = 0; var1 < class255.field4524; ++var1) {
                int var2 = class203.field3463[var1];
                class188 var3 = class98.field1526[var2];
                int var4 = class213.field3680.method1268(255);
                if (~(var4 & 32) != -1) {
                    var4 += class213.field3680.method1268(arg0 ^ 254) << 8;
                }
                class55.method357(var2, var3, var4, false);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1492 = null;
        field1485 = null;
        if (arg0 == 1) {
            field1493 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)I")
    public final int method621(boolean arg0) {
        if (arg0) {
            field1493 = null;
        }
        ++field1496;
        return super.field1500 ? 0 : 100;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class51.method330(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class113.method808(var6 + 1, class218.field3754[arg0][arg1][arg3] + arg5, var7 + 1) && class113.method808(var6 + 128 - 1, class218.field3754[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class113.method808(var6 + 128 - 1, class218.field3754[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class113.method808(var6 + 1, class218.field3754[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class44.field684[arg0][var8][var14] == -class214.field3693) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class218.field3754[arg0][arg1][arg3] + arg5;
            if (!class113.method808(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class113.method808(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class113.method808(var9, var11, var13)) {
                        return false;
                    } else if (!class113.method808(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }
}
