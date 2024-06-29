import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class22 {

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    public static int[] field331 = new int[2];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field334;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field335;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[Llt;")
    public class702[] field333;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method169(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 5)
    public static void method164(byte arg0) {
        if (arg0 != -110) {
            field331 = null;
        }
        field331 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/io/File;Z)V", line = 19)
    public static final void method165(int arg0, File arg1, boolean arg2) {
        if (class415.field5870 == null) {
            class500.method2909((byte) -105);
        }
        field332++;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field335 == null ? (field335 = method169("java.lang.String")) : field335, Boolean.TYPE);
            var4.invoke(class415.field5870, arg1.getAbsolutePath(), Boolean.valueOf(arg2));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
        if (arg0 != 34) {
            field331 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)Z", line = 46)
    public static final boolean method166(int arg0, byte arg1, int arg2) {
        field330++;
        if (arg1 > -97) {
            return true;
        } else {
            return (arg0 & 0x22) != 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lrv;B)V", line = 57)
    public final void method167(class120 arg0, byte arg1) {
        field329++;
        this.field326 = arg0.method833(-3);
        this.field328 = arg0.method898((byte) -86);
        this.field333 = new class702[arg0.method842(2384)];
        class527[] var3 = class546.method3176((byte) -56);
        int var4 = -69 % ((55 - arg1) / 43);
        for (int var5 = 0; var5 < this.field333.length; var5++) {
            this.field333[var5] = this.method168(arg0, var3[arg0.method842(2384)], -125);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lrv;Lve;I)Llt;", line = 84)
    private final class702 method168(class120 arg0, class527 arg1, int arg2) {
        field327++;
        if (class365.field5277 == arg1) {
            return class323.method2105(true, arg0);
        } else if (class681.field9674 == arg1) {
            return class476.method2808(arg0, 1406524400);
        } else if (class468.field6683 == arg1) {
            return class628.method3596(2, arg0);
        } else if (class585.field8276 == arg1) {
            return class688.method3880(arg0, (byte) 51);
        } else if (class297.field4470 == arg1) {
            return class579.method3364(arg0, -1);
        } else {
            int var4 = -72 / ((-arg2 - 69) / 49);
            if (class640.field8997 == arg1) {
                return class375.method2325(1, arg0);
            } else if (class16.field269 == arg1) {
                return class571.method3315((byte) -110, arg0);
            } else if (class272.field3798 == arg1) {
                return class220.method1517(arg0, 92);
            } else if (class572.field8106 == arg1) {
                return class521.method3036(2, arg0);
            } else if (class752.field10422 == arg1) {
                return class207.method1482(arg0, false);
            } else {
                return null;
            }
        }
    }
}
