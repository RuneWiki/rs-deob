import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class452 extends class333 {

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field6509;

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "[I")
    public static int[] field6504 = new int[1];

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "Z")
    public static boolean field6508 = true;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "[I")
    public static int[] field6506 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "F")
    public static float field6512;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lpha;Ljava/lang/Object;I)V")
    public class452(class172 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6509 = arg1;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lcb;IZIII)V")
    public static final void method2719(class544 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class48.method318(arg2, arg5, arg0, arg4, (byte) -114, arg1, (long) arg3);
        field6505++;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)V")
    public static final void method2720(boolean arg0) {
        if (!arg0) {
            return;
        }
        field6510++;
        if (class203.field2976 != null) {
            class203.field2976.method618(-32420);
        }
        if (class421.field5944 == null) {
            return;
        }
        while (true) {
            try {
                class421.field5944.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(Z)V")
    public static void method2721(boolean arg0) {
        field6506 = null;
        if (!arg0) {
            method2720(true);
        }
        field6504 = null;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)Z")
    public final boolean method2156(int arg0) {
        field6513++;
        if (arg0 != 21635) {
            method2721(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(Z)V")
    public static final void method2722(boolean arg0) {
        if (arg0) {
            return;
        }
        field6507++;
        if (class712.field10026 == null) {
            class424 var1 = new class424();
            byte[] var2 = var1.method2529(128, 128, 16, (byte) -62);
            class712.field10026 = class687.method3876(var2, false, -137);
        }
        if (class394.field5586 == null) {
            class169 var3 = new class169();
            byte[] var4 = var3.method1295(-1, 16, 128, 128);
            class394.field5586 = class687.method3876(var4, false, -137);
        }
    }

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2157(int arg0) {
        field6511++;
        if (arg0 != 32768) {
            this.method2156(117);
        }
        return this.field6509;
    }
}
