import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class206 extends class93 {

    @OriginalMember(owner = "client!w", name = "V", descriptor = "[I")
    public static int[] field3963 = new int[100];

    @OriginalMember(owner = "client!w", name = "T", descriptor = "Ljd;")
    public static class92 field3961 = class202.method1325((byte) 90, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "Ljd;")
    private static class92 field3968 = class202.method1325((byte) 90, "Attack");

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "Ljd;")
    public static class92 field3970 = field3968;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "Loe;")
    public static class139 field3965 = new class139(50);

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!w", name = "db", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)Ljd;")
    public static final class92 method1340(boolean arg0, int arg1) {
        ++field3960;
        if (arg0) {
            return null;
        } else {
            return ~class189.field3604[arg1].method640(true) >= -1 ? class92.field1815[arg1] : class77.method529(-3, new class92[] { class92.field1815[arg1], class136.field2729, class189.field3604[arg1] });
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field3964;
        int[] var3 = super.field1887.method916(arg0, -125);
        int var4 = 72 % ((67 - arg1) / 42);
        if (super.field1887.field2757) {
            for (int var5 = 0; var5 < class150.field2985; ++var5) {
                this.method1343(var5, arg0, false);
                int[] var6 = this.method648((byte) 57, class45.field1004, 0);
                var3[var5] = var6[class29.field634];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class206() {
        super(1, false);
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(B)V")
    public static void method1341(byte arg0) {
        field3961 = null;
        field3963 = null;
        field3965 = null;
        if (arg0 != 103) {
            method1340(false, -52);
        }
        field3968 = null;
        field3970 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(III)V")
    public static final void method1342(int arg0, int arg1, int arg2) {
        ++field3962;
        ++class81.field1655;
        class99.field2000.method405(arg0, 7);
        class99.field2000.method446(arg2, -26751);
        class99.field2000.method450(arg1, (byte) -70);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZ)V")
    private final void method1343(int arg0, int arg1, boolean arg2) {
        int var4 = class75.field1574[arg0];
        int var5 = class166.field3271[arg1];
        ++field3969;
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class29.field634 = arg0;
            class45.field1004 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class45.field1004 = arg0;
            class29.field634 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class29.field634 = -arg1 + class150.field2985;
            class45.field1004 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class29.field634 = arg0;
            class45.field1004 = -arg1 + class68.field1385;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class29.field634 = class150.field2985 - arg0;
            class45.field1004 = -arg1 + class68.field1385;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class29.field634 = class150.field2985 - arg1;
            class45.field1004 = -arg0 + class68.field1385;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class29.field634 = arg1;
            class45.field1004 = -arg0 + class68.field1385;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class45.field1004 = arg1;
            class29.field634 = -arg0 + class150.field2985;
        }
        class45.field1004 &= class5.field279;
        if (arg2) {
            field3963 = null;
        }
        class29.field634 &= class2.field163;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(III)Z")
    public static final boolean method1344(int arg0, int arg1, int arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        ++field3972;
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        if (arg2 != 10) {
            field3963 = null;
        }
        class214 var3 = class126.method846(0, arg0);
        return var3.method1394((byte) 97, arg1);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field3966;
        int[][] var3 = super.field1873.method553(arg0, 0);
        int[] var4 = var3[0];
        int[] var5 = var3[1];
        int[] var6 = var3[2];
        if (super.field1873.field1656) {
            for (int var7 = 0; var7 < class150.field2985; ++var7) {
                this.method1343(var7, arg0, false);
                int[][] var8 = this.method649(0, true, class45.field1004);
                var4[var7] = var8[0][class29.field634];
                var5[var7] = var8[1][class29.field634];
                var6[var7] = var8[2][class29.field634];
            }
        }
        if (arg1 != 4096) {
            method1345(-107, -48, (Component) null, (byte) -90);
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field3971;
        if (~arg0 == -1) {
            super.field1885 = ~arg1.method443(255) == -2;
        }
        if (arg2 != 0) {
            this.method62(105, -15);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILjava/awt/Component;B)Lid;")
    public static final class84 method1345(int arg0, int arg1, Component arg2, byte arg3) {
        ++field3967;
        try {
            Class var4 = Class.forName("vb");
            class84 var5 = (class84) var4.newInstance();
            if (arg3 != -121) {
                method1344(-64, 46, 41);
            }
            var5.method565(-90, arg1, arg0, arg2);
            return var5;
        } catch (Throwable var7) {
            class157 var6 = new class157();
            var6.method565(arg3 + 24, arg1, arg0, arg2);
            return var6;
        }
    }
}
