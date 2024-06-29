import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class88 extends class107 {

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "Lrg;")
    public class222 field1332;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "Z")
    public static boolean field1339;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "[B")
    public byte[] field1333;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1331;
        if (arg3 == arg5) {
            class128.method885(arg6, arg2, arg7, arg1, arg5, arg0, 2019);
        } else {
            if (-arg5 + arg0 >= class196.field2961 && ~class84.field1287 <= ~(arg0 - -arg5) && ~class175.field2557 >= ~(-arg3 + arg6) && ~(arg3 + arg6) >= ~class91.field1381) {
                class266.method1800(arg1, arg5, arg7, arg6, arg2, 1, arg3, arg0);
            } else {
                class207.method1368(arg1, arg7, arg2, arg0, arg5, arg3, -22491, arg6);
            }
            if (arg4 != 0) {
                field1339 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)I")
    public final int method667(int arg0) {
        if (arg0 != 100) {
            method668(true, 0);
        }
        ++field1330;
        return super.field1572 ? 0 : 100;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
    public static final void method668(boolean arg0, int arg1) {
        ++field1340;
        if (~class42.field742 != ~arg1) {
            if (~class42.field742 == -1) {
                class226.method1545(true);
            }
            if (~arg1 == -41) {
                class131.method902(-1);
            }
            boolean var2 = arg1 == 5 || ~arg1 == -11 || arg1 == 28;
            if (arg0) {
                if (arg1 != 40 && class175.field2568 != null) {
                    class175.field2568.method1718(-17492);
                    class175.field2568 = null;
                }
                if (~arg1 == -26 || arg1 == 28) {
                    class108.field1584 = 1;
                    class17.field310 = 0;
                    class259.field3968 = 0;
                    class109.field1606 = 0;
                    class251.field3891 = 1;
                    class218.method1467(true, -16);
                }
                if (arg1 == 25 || arg1 == 10) {
                    class270.method1820((byte) 127);
                }
                if (~arg1 == -6) {
                    class59.method486(class36.field637, 2);
                } else {
                    class226.method1549(-124);
                }
                boolean var3 = class42.field742 == 5 || class42.field742 == 10 || ~class42.field742 == -29;
                if (!var3 != !var2) {
                    if (!var2) {
                        class16.method116(true, 2);
                        class18.field329.method1119((byte) -77, true);
                    } else {
                        class175.field2558 = class208.field3117;
                        if (~class188.field2789 == -1) {
                            class16.method116(arg0, 2);
                        } else {
                            class278.method1853(255, false, class208.field3117, 0, true, 2, class220.field3404);
                        }
                        class18.field329.method1119((byte) -106, false);
                    }
                }
                class42.field742 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)[B")
    public final byte[] method669(int arg0) {
        int var2 = -91 % ((65 - arg0) / 42);
        ++field1335;
        if (super.field1572) {
            throw new RuntimeException();
        } else {
            return this.field1333;
        }
    }
}
